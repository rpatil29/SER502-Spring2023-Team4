// Orange.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OrangeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OrangeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OrangeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(OrangeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(OrangeParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(OrangeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(OrangeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(OrangeParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(OrangeParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(OrangeParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#traditional_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraditional_for_loop(OrangeParser.Traditional_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#traditional_while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTraditional_while_loop(OrangeParser.Traditional_while_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#range_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_for_loop(OrangeParser.Range_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(OrangeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(OrangeParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#boolean_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_term(OrangeParser.Boolean_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#boolean_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_factor(OrangeParser.Boolean_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expression(OrangeParser.Comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#boolean_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(OrangeParser.Boolean_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expression(OrangeParser.Numeric_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#numeric_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_term(OrangeParser.Numeric_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#numeric_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_factor(OrangeParser.Numeric_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(OrangeParser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#string_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_term(OrangeParser.String_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#ternary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_expression(OrangeParser.Ternary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(OrangeParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#identifier_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_tail(OrangeParser.Identifier_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#integer_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_literal(OrangeParser.Integer_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#string_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_literal(OrangeParser.String_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#string_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_character(OrangeParser.String_characterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#letter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetter(OrangeParser.LetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#digit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigit(OrangeParser.DigitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#special_character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial_character(OrangeParser.Special_characterContext ctx);
}
