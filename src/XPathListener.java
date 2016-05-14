// Generated from XPath.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XPathParser}.
 */
public interface XPathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(XPathParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(XPathParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XPathParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XPathParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(XPathParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(XPathParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(XPathParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(XPathParser.RpContext ctx);
	/**
	 * Enter a parse tree produced by {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(XPathParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(XPathParser.FilterContext ctx);
}