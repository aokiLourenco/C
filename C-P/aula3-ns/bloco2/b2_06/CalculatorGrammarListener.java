// Generated from CalculatorGrammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorGrammarParser}.
 */
public interface CalculatorGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalculatorGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalculatorGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignID}
	 * labeled alternative in {@link CalculatorGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignID(CalculatorGrammarParser.AssignIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignID}
	 * labeled alternative in {@link CalculatorGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignID(CalculatorGrammarParser.AssignIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(CalculatorGrammarParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(CalculatorGrammarParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(CalculatorGrammarParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(CalculatorGrammarParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(CalculatorGrammarParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(CalculatorGrammarParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(CalculatorGrammarParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(CalculatorGrammarParser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(CalculatorGrammarParser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link CalculatorGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(CalculatorGrammarParser.ExprMultDivModContext ctx);
}