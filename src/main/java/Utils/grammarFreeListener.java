package Utils;// Generated from grammarFree.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarFreeParser}.
 */
public interface grammarFreeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarFreeParser#firs_rule}.
	 * @param ctx the parse tree
	 */
	void enterFirs_rule(grammarFreeParser.Firs_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFreeParser#firs_rule}.
	 * @param ctx the parse tree
	 */
	void exitFirs_rule(grammarFreeParser.Firs_ruleContext ctx);
}