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

    @Override public Object visitStatement_list(OrangeParser.StatementContext ctx) {
        return visitChildren(ctx);
    }
    private String variableDeclarationDataType = null;
    @Override public Object visitIdentifier(OrangeParser.IdentifierContext ctx) {
        variableDeclarationDataType = ctx.data_type().getText();
        return visitChildren(ctx);
    }
    @Override public Object visitAssignment(OrangeParser.AssignmentContext ctx) {
        Token idToken = ctx.IDENTIFIER().getSymbol();
        String identifier = ctx.IDENTIFIER().getText();
        if (!variableMap.containsKey(identifier)) {
            semanticErrorList.add(new Error(String.format("variable '%s' is not declared", identifier),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
        } else {
            try {
                Object value = visit(ctx.expression());
                variableMap.get(identifier).setValue(value);
            } catch (Exception ex) {
                semanticErrorList.add(new Error(String.format("variable '%s' cannot be assigned to RHS: %s",
                        identifier, ex.getMessage()), idToken.getLine(), idToken.getCharPositionInLine() + 1));
            }
        }
        return null;
    }

    @Override public Object visitExpression(OrangeParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitNumeric_expression(OrangeParser.Numeric_expressionContext ctx) {
        if (ctx.arithmetic_expression().size() == 0)
            return visitChildren(ctx);
        else if (ctx.arithmetic_expression().size() == 1)
            return visit(ctx.arithmetic_expression(0));

        Object leftOperand = visit(ctx.arithmetic_expression(0));
        Object rightOperand = visit(ctx.arithmetic_expression(1));

        TerminalNode operatorNode = ctx.OP_ADD() != null ? ctx.OP_ADD()
                : ctx.OP_SUB() != null ? ctx.OP_SUB()
                : ctx.OP_MUL() != null ? ctx.OP_MUL()
                : ctx.OP_DIV();
        Token operatorToken = operatorNode.getSymbol();
        String operator = operatorNode.getText();

        if ((leftOperand instanceof Integer || leftOperand instanceof Double) &&
                (rightOperand instanceof Integer || rightOperand instanceof Double)) {

            if (leftOperand instanceof Integer && rightOperand instanceof Integer) { // INTEGER ARITHMETIC
                int leftOperandInt = (Integer) leftOperand;
                double rightOperandInt = (Integer) rightOperand;

                if (operator.equals("+")) return leftOperandInt + rightOperandInt;
                else if (operator.equals("-")) return leftOperandInt - rightOperandInt;
                else if (operator.equals("*")) return leftOperandInt * rightOperandInt;
                else if (operator.equals("/")) {
                    if (rightOperandInt != 0) return leftOperandInt / rightOperandInt;
                    else semanticErrorList.add(new Error("divide by zero", operatorToken.getLine(),
                            operatorToken.getCharPositionInLine() + 1));
                }
            } else { // FLOATING POINT ARITHMETIC
                double leftOperandDouble = leftOperand instanceof Double ? (Double)leftOperand : ((Integer)leftOperand).doubleValue();
                double rightOperandDouble = rightOperand instanceof Double ? (Double)rightOperand : ((Integer)rightOperand).doubleValue();

                if (operator.equals("+")) return leftOperandDouble + rightOperandDouble;
                else if (operator.equals("-")) return leftOperandDouble - rightOperandDouble;
                else if (operator.equals("*")) return leftOperandDouble * rightOperandDouble;
                else if (operator.equals("/")) {
                    if (rightOperandDouble != 0.0) return leftOperandDouble / rightOperandDouble;
                    else semanticErrorList.add(new Error("divide by zero",  operatorToken.getLine(),
                            operatorToken.getCharPositionInLine() + 1));
                }
            }
        } else {
            semanticErrorList.add(new Error("unsupported operands in arithmetic expression",
                    operatorToken.getLine(), operatorToken.getCharPositionInLine() + 1));
        }
        return null;
    }
    @Override public Object visitTernary_expression(OrangeParser.Ternary_expressionContext ctx) {
        Object conditionValue = visit(ctx.relational_expression());
        Object value1 = visit(ctx.expression(0));
        Object value2 = visit(ctx.expression(1));
        return (Boolean) conditionValue ? value1 : value2;
    }
    @Override public Object visitConditional(OrangeParser.ConditionalContext ctx) {
        Object conditionValue = visit(ctx.if_condition());
        if ((Boolean) conditionValue) visit(ctx.body(0));
        else if (ctx.body(1) != null)
            visit(ctx.body(1));
        return null;
    }
    @Override public Object visitTraditional_for_loop(OrangeParser.Traditional_for_loopContext ctx) {
        Token idToken = ctx.for_expression().IDENTIFIER().getSymbol();
        String identifier = ctx.for_expression().IDENTIFIER().getText();
        if (variableMap.containsKey(identifier)) {
            semanticErrorList.add(new Error(String.format("variable '%s' is previously declared", identifier),
                    idToken.getLine(), idToken.getCharPositionInLine() + 1));
            return null;
        }

        try {
            int start = Integer.parseInt(ctx.for_expression().INTEGER_LITERAL(0).getText());
            int end = Integer.parseInt(ctx.for_expression().INTEGER_LITERAL(1).getText());

            Variable variable = new Variable("int");
            variable.setValue(start);
            variableMap.put(identifier, variable);

            for (int i = start; i <= end; i++) {
                variableMap.get(identifier).setValue(i);
                visit(ctx.body());
            }
        } catch (Exception ignored) {
        } finally {
            variableMap.remove(identifier);
        }
        return null;
    }
    @Override public Object visitTraditional_while_loop(OrangeParser.Traditional_while_loopContext ctx) {
        Object conditionValue = visit(ctx.while_condition());
        while ((Boolean) conditionValue) {
            visit(ctx.body());
            conditionValue = visit(ctx.while_condition());
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
            int start = Integer.parseInt(ctx.range().INTEGER_LITERAL(0).getText());
            int end = Integer.parseInt(ctx.range().INTEGER_LITERAL(1).getText());

            Variable variable = new Variable("int");
            variable.setValue(start);
            variableMap.put(identifier, variable);

            for (int i = start; i <= end; i++) {
                variableMap.get(identifier).setValue(i);
                visit(ctx.body());
            }
        } catch (Exception ignored) {
        } finally {
            variableMap.remove(identifier);
        }
        return null;
    }
    private final StringBuilder printBuffer = new StringBuilder();
    @Override public Object visitPrint_statement(OrangeParser.Print_statementContext ctx) {
        visit(ctx.print_argument_list());
        return null;
    }
    public Map<String, Variable> getVariableMap() {
        return variableMap;
    }
}