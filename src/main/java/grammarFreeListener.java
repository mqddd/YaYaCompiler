// Generated from grammarFree.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarFreeParser}.
 */
public interface grammarFreeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarFreeParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(grammarFreeParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFreeParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(grammarFreeParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFreeParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(grammarFreeParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFreeParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(grammarFreeParser.Var_defContext ctx);
}