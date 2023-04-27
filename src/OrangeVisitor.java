// Generated from Orange.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link OrangeParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(OrangeParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#print_argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_argument_list(OrangeParser.Print_argument_listContext ctx);
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
	 * Visit a parse tree produced by {@link OrangeParser#comparison_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expression(OrangeParser.Comparison_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#numeric_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_expression(OrangeParser.Numeric_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link OrangeParser#expression_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_term(OrangeParser.Expression_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(OrangeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link OrangeParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(OrangeParser.Data_typeContext ctx);
}