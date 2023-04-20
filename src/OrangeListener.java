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
	 * Enter a parse tree produced by {@link OrangeParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(OrangeParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(OrangeParser.Print_statementContext ctx);
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
	 * Enter a parse tree produced by {@link OrangeParser#boolean_term}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_term(OrangeParser.Boolean_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#boolean_term}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_term(OrangeParser.Boolean_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#boolean_factor}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_factor(OrangeParser.Boolean_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#boolean_factor}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_factor(OrangeParser.Boolean_factorContext ctx);
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
	 * Enter a parse tree produced by {@link OrangeParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(OrangeParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(OrangeParser.Boolean_literalContext ctx);
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
	 * Enter a parse tree produced by {@link OrangeParser#numeric_term}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_term(OrangeParser.Numeric_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#numeric_term}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_term(OrangeParser.Numeric_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#numeric_factor}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_factor(OrangeParser.Numeric_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#numeric_factor}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_factor(OrangeParser.Numeric_factorContext ctx);
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
	 * Enter a parse tree produced by {@link OrangeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(OrangeParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(OrangeParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#identifier_tail}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_tail(OrangeParser.Identifier_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#identifier_tail}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_tail(OrangeParser.Identifier_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void enterInteger_literal(OrangeParser.Integer_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#integer_literal}.
	 * @param ctx the parse tree
	 */
	void exitInteger_literal(OrangeParser.Integer_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(OrangeParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(OrangeParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#string_character}.
	 * @param ctx the parse tree
	 */
	void enterString_character(OrangeParser.String_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#string_character}.
	 * @param ctx the parse tree
	 */
	void exitString_character(OrangeParser.String_characterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#letter}.
	 * @param ctx the parse tree
	 */
	void enterLetter(OrangeParser.LetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#letter}.
	 * @param ctx the parse tree
	 */
	void exitLetter(OrangeParser.LetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(OrangeParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(OrangeParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OrangeParser#special_character}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_character(OrangeParser.Special_characterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OrangeParser#special_character}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_character(OrangeParser.Special_characterContext ctx);
}