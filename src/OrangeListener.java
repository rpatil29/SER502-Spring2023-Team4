// Generated from Orange.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OrangeParser}.
 */
public interface OrangeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OrangeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(OrangeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(OrangeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(OrangeParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(OrangeParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(OrangeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(OrangeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(OrangeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(OrangeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(OrangeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(OrangeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#print_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPrint_argument_list(OrangeParser.Print_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#print_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPrint_argument_list(OrangeParser.Print_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(OrangeParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(OrangeParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(OrangeParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(OrangeParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#traditional_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterTraditional_for_loop(OrangeParser.Traditional_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#traditional_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitTraditional_for_loop(OrangeParser.Traditional_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#traditional_while_loop}.
	 * @param ctx the parse tree
	 */
	void enterTraditional_while_loop(OrangeParser.Traditional_while_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#traditional_while_loop}.
	 * @param ctx the parse tree
	 */
	void exitTraditional_while_loop(OrangeParser.Traditional_while_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#range_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterRange_for_loop(OrangeParser.Range_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#range_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitRange_for_loop(OrangeParser.Range_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(OrangeParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(OrangeParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(OrangeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(OrangeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(OrangeParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(OrangeParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(OrangeParser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(OrangeParser.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(OrangeParser.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(OrangeParser.Numeric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(OrangeParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(OrangeParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#string_term}.
	 * @param ctx the parse tree
	 */
	void enterString_term(OrangeParser.String_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#string_term}.
	 * @param ctx the parse tree
	 */
	void exitString_term(OrangeParser.String_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void enterTernary_expression(OrangeParser.Ternary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#ternary_expression}.
	 * @param ctx the parse tree
	 */
	void exitTernary_expression(OrangeParser.Ternary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#expression_term}.
	 * @param ctx the parse tree
	 */
	void enterExpression_term(OrangeParser.Expression_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#expression_term}.
	 * @param ctx the parse tree
	 */
	void exitExpression_term(OrangeParser.Expression_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(OrangeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(OrangeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(OrangeParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(OrangeParser.Data_typeContext ctx);
}