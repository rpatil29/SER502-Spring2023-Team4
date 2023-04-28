import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyOrangeVisitor extends OrangeBaseVisitor<Object> {

    private final PrintStream outputStream;
    private final List<Error> semanticErrorList;
    private final Map<String, Variable> variableMap;

    public MyOrangeVisitor(PrintStream outputStream) {
        this.outputStream = outputStream;
        this.semanticErrorList = new ArrayList<>();
        this.variableMap = new HashMap<>();
    }

    @Override public Object visitProgram(OrangeParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitStatement_list(OrangeParser.Statement_listContext ctx) {
        //while(ctx.statement()!=null) {
            return visitChildren(ctx);
        //}
        //return null;
    }

    @Override public Object visitStatement(OrangeParser.StatementContext ctx) { return visitChildren(ctx); }
    private String variableDeclared = null;
    private String declarationDataType = null;
    @Override public Object visitAssignment(OrangeParser.AssignmentContext ctx) {//(data_type)? IDENTIFIER OP_ASSIGN (literal | expression);
        if (ctx.data_type().getText() != null) {
            declarationDataType = ctx.data_type().getText();
        }
        Token idToken = ctx.IDENTIFIER().getSymbol();
        variableDeclared = ctx.IDENTIFIER().getText();
        if (!variableMap.containsKey(variableDeclared)) {

            if (ctx.literal() != null) {
                try {
                    Variable variable = new Variable(declarationDataType);
                    if (ctx.OP_ASSIGN() != null)
                        variable.setValue(visit(ctx.literal()));
                    variableMap.put(variableDeclared, variable);
                } catch (Exception ex) {
                    semanticErrorList.add(new Error(String.format("variable '%s' initialization failed: %s",
                            variableDeclared, ex.getMessage()), idToken.getLine(), idToken.getCharPositionInLine() + 1));
                }
            } else if (ctx.expression() != null) {
                try {
                    Object value = visit(ctx.expression());
                    Variable variable = new Variable(declarationDataType);
                    variable.setValue(value);
                    variableMap.put(variableDeclared, variable);
                } catch (Exception ex) {
                    semanticErrorList.add(new Error(String.format("variable '%s' cannot be assigned to RHS: %s",
                            variableDeclared, ex.getMessage()), idToken.getLine(), idToken.getCharPositionInLine() + 1));
                }

            }
        } else if(variableMap.containsKey(variableDeclared)) {
            if (ctx.expression() != null) {
                try {
                    Object value = visit(ctx.expression());
                    variableMap.get(variableDeclared).setValue(value);
                } catch (Exception ex) {
                    semanticErrorList.add(new Error(String.format("variable '%s' cannot be assigned to RHS: %s",
                            variableDeclared, ex.getMessage()), idToken.getLine(), idToken.getCharPositionInLine() + 1));
                }
                semanticErrorList.add(new Error(String.format("variable '%s' is not declared", variableDeclared), idToken.getLine(), idToken.getCharPositionInLine() + 1));
            } else if (ctx.literal() != null) {
                try {
                    Object value = visit(ctx.literal());
                    variableMap.get(variableDeclared).setValue(value);
                } catch (Exception ex) {
                    semanticErrorList.add(new Error(String.format("variable '%s' cannot be assigned to RHS: %s",
                            variableDeclared, ex.getMessage()), idToken.getLine(), idToken.getCharPositionInLine() + 1));
                }
            } else {
                semanticErrorList.add(new Error(String.format("Empty assignment to '%s' is not allowed"), idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
        }
            return null;
    }

    private final StringBuilder printBuffer = new StringBuilder();
    @Override public Object visitPrint(OrangeParser.PrintContext ctx) {
        visit(ctx.print_argument_list());
        return null;
    }
    @Override public Object visitPrint_argument_list(OrangeParser.Print_argument_listContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            Token idToken = ctx.IDENTIFIER().getSymbol();
            String identifier = ctx.IDENTIFIER().getText();
            if (variableMap.containsKey(identifier)) {
                printBuffer.append(variableMap.get(identifier).getValue());
            } else {
                semanticErrorList.add(new Error(String.format("variable '%s' is not declared", identifier),
                        idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
        } else if (ctx.literal() != null) {
            printBuffer.append(visit(ctx.literal()));
        }
        return visitChildren(ctx);
    }
    @Override public Object visitConditional(OrangeParser.ConditionalContext ctx) {
        Object conditionValue = visit(ctx.expression());
        if ((Boolean) conditionValue) visit(ctx.statement_list(0));
        else if (ctx.statement_list(1) != null)
            visit(ctx.statement_list(1));
        return null;
    }

    @Override public Object visitTraditional_for_loop(OrangeParser.Traditional_for_loopContext ctx) {
        Token idToken = ctx.IDENTIFIER().getSymbol();

        if(ctx.data_type()==null){
            semanticErrorList.add(new Error(String.format("Data Type missing"),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
        }
        variableDeclared = ctx.IDENTIFIER().getText();
        if (variableMap.containsKey(variableDeclared)) {
            semanticErrorList.add(new Error(String.format("variable '%s' is previously declared", variableDeclared),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
            return null;
        }
        try {
            int start = Integer.parseInt(ctx.expression_term().literal().INTEGER_L().getText());
            Variable variable = new Variable("int");
            variable.setValue(start);
            variableMap.put(variableDeclared, variable);
            for (int i = start; (Boolean)visit(ctx.comparison_expression()); visit(ctx.expression())) {
                variableMap.get(variableDeclared).setValue(i);
                visit(ctx.statement_list());
            }
        } catch (Exception ignored) {
        } finally {
            variableMap.remove(variableDeclared);
        }
        return null;
    }
    @Override public Object visitTraditional_while_loop(OrangeParser.Traditional_while_loopContext ctx) {
        Object conditionValue = visit(ctx.expression());
        while((boolean)conditionValue){
            visit(ctx.statement_list());
            conditionValue = visit(ctx.expression());
        }
        return null;
    }
    @Override
    public Object visitRange_for_loop(OrangeParser.Range_for_loopContext ctx) {
        Token idToken = ctx.IDENTIFIER().getSymbol();
        String identifier = ctx.IDENTIFIER().getText();
        if (variableMap.containsKey(identifier)) {
            semanticErrorList.add(new Error(String.format("variable '%s' is previously declared", identifier),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
            return null;
        }
        try {
            int start = Integer.parseInt(ctx.range().INTEGER_L(0).getText());
            int end = Integer.parseInt(ctx.range().INTEGER_L(1).getText());
            Variable variable = new Variable("int");
            variable.setValue(start);
            variableMap.put(identifier, variable);
            for (int i = start; i <= end; i++) {
                variableMap.get(identifier).setValue(i);
                visit(ctx.statement_list());
            }
        } catch (Exception ignored) {
        } finally {
            variableMap.remove(identifier);
        }
        return null;
    }


    @Override public Object visitExpression(OrangeParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitBoolean_expression(OrangeParser.Boolean_expressionContext ctx) {
        if (ctx.OP_LOGICAL_NOT() != null)
            return ! ((Boolean) visit(ctx.expression_term(0)));

        if (ctx.expression_term().size() == 1)
            return visit(ctx.expression_term(0));

        Object leftOperand = visit(ctx.expression_term(0));
        Object rightOperand = visit(ctx.expression_term(1));

        TerminalNode operatorNode = ctx.OP_LOGICAL_AND() != null ? ctx.OP_LOGICAL_AND() : ctx.OP_LOGICAL_OR();
        Token operatorToken = operatorNode.getSymbol();
        String operator = operatorNode.getText();

        if (leftOperand instanceof Boolean && rightOperand instanceof Boolean) {
            if (operator.equals("&&")) return (Boolean)leftOperand && (Boolean)rightOperand;
            else if (operator.equals("||")) return (Boolean)leftOperand || (Boolean)rightOperand;
        } else {
            semanticErrorList.add(new Error("unsupported operands in logical expression",
                    operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
        }
        return null;
    }

    @Override
    public Object visitComparison_expression(OrangeParser.Comparison_expressionContext ctx) {
        if(ctx.expression_term().size()<2)
            return visitChildren(ctx);

        Object leftOperand = visit(ctx.expression_term(0));
        Object rightOperand = visit(ctx.expression_term(1));

        TerminalNode operatorNode = ctx.OP_EQUALS() != null ? ctx.OP_EQUALS()
                : ctx.OP_GREATER() != null ? ctx.OP_GREATER()
                : ctx.OP_SMALLER() != null ? ctx.OP_SMALLER()
                : ctx.OP_GREATER_EQUALS() != null ? ctx.OP_GREATER_EQUALS()
                : ctx.OP_SMALLER_EQUALS();
        Token operatorToken = operatorNode.getSymbol();
        String operator = operatorNode.getText();

        if(leftOperand instanceof Integer && rightOperand instanceof Integer){
            int leftOperandint = (Integer)leftOperand;
            int rightOperandint = (Integer)rightOperand;

            if (operator.equals("<")) return leftOperandint < rightOperandint;
            else if (operator.equals(">"))return leftOperandint > rightOperandint;
            else if (operator.equals("<=")) return leftOperandint <= rightOperandint;
            else if (operator.equals(">=")) return leftOperandint >= rightOperandint;
            else if (operator.equals("==")) return leftOperandint == rightOperandint;
        }
        else {
            semanticErrorList.add(new Error("unsupported operands in relational expression",
                    operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
        }
        return null;
    }
    @Override public Object visitNumeric_expression(OrangeParser.Numeric_expressionContext ctx) {
        if (ctx.numeric_expression().size() == 0)
            return visitChildren(ctx);
        else if (ctx.numeric_expression().size() == 1)
            return visit(ctx.numeric_expression(0));

        Object leftOperand = visit(ctx.numeric_expression(0));
        if(visit(ctx.numeric_expression(1)) != null) {
            Object rightOperand = visit(ctx.numeric_expression(1));

            TerminalNode operatorNode = ctx.OP_ADD() != null ? ctx.OP_ADD()
                    : ctx.OP_SUB() != null ? ctx.OP_SUB()
                    : ctx.OP_MUL() != null ? ctx.OP_MUL()
                    : ctx.OP_DIV();
            Token operatorToken = operatorNode.getSymbol();
            String operator = operatorNode.getText();

            if (leftOperand instanceof Integer && rightOperand instanceof Integer) {
                int leftOperandInt = (Integer) leftOperand;
                int rightOperandInt = (Integer) rightOperand;

                if (operator.equals("+")) return leftOperandInt + rightOperandInt;
                else if (operator.equals("-")) return leftOperandInt - rightOperandInt;
                else if (operator.equals("*")) return leftOperandInt * rightOperandInt;
                else if (operator.equals("/")) {
                    if (rightOperandInt != 0) return leftOperandInt / rightOperandInt;
                    else semanticErrorList.add(new Error("divide by zero", operatorToken.getLine(),
                            operatorToken.getCharPositionInLine() + 1));
                } else {
                    semanticErrorList.add(new Error("unsupported operands in arithmetic expression",
                            operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
                }
            }
        }
        else{
            TerminalNode operatorNode = ctx.OP_SUCCESSOR() != null ? ctx.OP_SUCCESSOR()
                    : ctx.OP_PREDECESSOR();
            Token operatorToken = operatorNode.getSymbol();
            String operator = operatorNode.getText();
            if (leftOperand instanceof Integer) {
                int leftOperandInt = (Integer) leftOperand;

                if (operator.equals("++")) return leftOperandInt +1;
                else if (operator.equals("--")) return leftOperandInt -1;
            }
            else {
                semanticErrorList.add(new Error("unsupported operands in arithmetic expression",
                        operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
            }
        }

        return null;
    }

    @Override public Object visitString_expression(OrangeParser.String_expressionContext ctx) {
    StringBuilder sb = new StringBuilder();
    for ( OrangeParser.String_termContext termContext : ctx.string_term())
    {
        sb.append(visitString_term(termContext));
    }
    return sb.toString();
    }

    @Override public Object visitString_term(OrangeParser.String_termContext ctx) {

       if(ctx.IDENTIFIER()!=null)
       {
           String identifier = ctx.IDENTIFIER().getText();
           Token idToken = ctx.IDENTIFIER().getSymbol();
           if (variableMap.containsKey(identifier)) {
               return variableMap.get(identifier).getValue();
           } else {
               semanticErrorList.add(new Error(String.format("variable '%s' is not declared", identifier),
                       idToken.getLine(), idToken.getCharPositionInLine() + 1));
           }
       }
       else {
           try {
               return ctx.STRING_L().toString();
           }
           catch (Exception e){
               System.out.println(e);
           }
       }
       return null;
    }

    @Override public Object visitTernary_expression(OrangeParser.Ternary_expressionContext ctx) {
        Object conditionValue = visit(ctx.boolean_expression());
        Object value1 = visit(ctx.expression(0));
        Object value2 = visit(ctx.expression(1));
        return (Boolean) conditionValue ? value1 : value2;
    }

    @Override public Object visitExpression_term(OrangeParser.Expression_termContext ctx){
        if (ctx.BOOLEAN_FALSE() != null) return false;
        else if (ctx.BOOLEAN_TRUE() != null) return true;
        else if (ctx.IDENTIFIER() != null) {
            Token idToken = ctx.IDENTIFIER().getSymbol();
            String identifier = ctx.IDENTIFIER().getText();
            if (!variableMap.containsKey(ctx.IDENTIFIER().getText())) {
                semanticErrorList.add(new Error(String.format("variable '%s' is not declared", identifier),
                        idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
            return variableMap.get(identifier).getValue();
        } else return visit(ctx.literal());
    }
    @Override public Object visitLiteral(OrangeParser.LiteralContext ctx) {
        String literal = ctx.getChild(0).getText();
        if (ctx.INTEGER_L() != null) return Integer.parseInt(literal);
        else if (ctx.BOOLEAN_L() != null) return Boolean.parseBoolean(literal);
        else return literal.substring(1, literal.length() - 1);
    }
    public Map<String, Variable> getVariableMap() {
        return variableMap;
    }

    public void evaluationResult() {
        if (semanticErrorList.size() == 0) {
            outputStream.println("Successful Program Evaluation.");
            outputStream.println(printBuffer);
        } else {
            outputStream.println("Failed Program Evaluation. See the following Errors:");
            for (Error semanticError : semanticErrorList)
                outputStream.println(semanticError);
        }
    }
}
