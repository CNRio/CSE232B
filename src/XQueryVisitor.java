// Generated from /Users/YueWang/Documents/Slide_and_Homework/CSE232B/antlrTest1.0/src/XQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XQueryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XQueryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqConstructor}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqConstructor(XQueryParser.XqConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFLWR(XQueryParser.FLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoXq(XQueryParser.TwoXqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(XQueryParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqRpall}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqRpall(XQueryParser.XqRpallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqwithP}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqwithP(XQueryParser.XqwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringC}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringC(XQueryParser.StringCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqLet(XQueryParser.XqLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqRp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqRp(XQueryParser.XqRpContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(XQueryParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqEqual(XQueryParser.XqEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqEmpty(XQueryParser.XqEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqCondOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqCondOr(XQueryParser.XqCondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqSome}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqSome(XQueryParser.XqSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqIs(XQueryParser.XqIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqCondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqCondNot(XQueryParser.XqCondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqCondwithP}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqCondwithP(XQueryParser.XqCondwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XqCondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXqCondAnd(XQueryParser.XqCondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApChildren(XQueryParser.ApChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApAll(XQueryParser.ApAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(XQueryParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link XQueryParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(XQueryParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllChildren(XQueryParser.AllChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpwithP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpwithP(XQueryParser.RpwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpAll(XQueryParser.RpAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParent(XQueryParser.ParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpChildren(XQueryParser.RpChildrenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(XQueryParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoRp(XQueryParser.TwoRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilAnd}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilAnd(XQueryParser.FilAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilEqual}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilEqual(XQueryParser.FilEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilNot}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilNot(XQueryParser.FilNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilOr}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilOr(XQueryParser.FilOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilIs}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilIs(XQueryParser.FilIsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilwithP}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilwithP(XQueryParser.FilwithPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilRp}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilRp(XQueryParser.FilRpContext ctx);
}