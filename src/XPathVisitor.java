// Generated from /Users/YueWang/Documents/Slide_and_Homework/CSE232B/antlrTest1.0/src/XPath.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XPathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XPathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApChildren(XPathParser.ApChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApAll}
	 * labeled alternative in {@link XPathParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApAll(XPathParser.ApAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XPathParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link XPathParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(XPathParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(XPathParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpwithP}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpwithP(XPathParser.RpwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XPathParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpAll}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAll(XPathParser.RpAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XPathParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XPathParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpChildren(XPathParser.RpChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XPathParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XPathParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRp(XPathParser.TwoRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XPathParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(XPathParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilAnd}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilAnd(XPathParser.FilAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilEqual}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilEqual(XPathParser.FilEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilNot}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilNot(XPathParser.FilNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilOr}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilOr(XPathParser.FilOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilIs}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilIs(XPathParser.FilIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilwithP}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilwithP(XPathParser.FilwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilRp}
	 * labeled alternative in {@link XPathParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilRp(XPathParser.FilRpContext ctx);
}