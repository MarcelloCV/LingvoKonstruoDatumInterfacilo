package conLang.personal.resources;// Generated from C:/Users/pc/Desktop/syntax.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link iParser}.
 */
public interface iListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link iParser#words}.
	 * @param ctx the parse tree
	 */

	void enterWords(iParser.WordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link iParser#words}.
	 * @param ctx the parse tree
	 */
	void exitWords(iParser.WordsContext ctx);
}