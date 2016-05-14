// Generated from XQuery.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XQueryParser}.
 */
public interface XQueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqAp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqAp(XQueryParser.XqApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqConstructor}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqConstructor(XQueryParser.XqConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqConstructor}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqConstructor(XQueryParser.XqConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterFLWR(XQueryParser.FLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLWR}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitFLWR(XQueryParser.FLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterTwoXq(XQueryParser.TwoXqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoXq}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitTwoXq(XQueryParser.TwoXqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterVariable(XQueryParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitVariable(XQueryParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqRpall}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqRpall(XQueryParser.XqRpallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqRpall}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqRpall(XQueryParser.XqRpallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqwithP}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqwithP(XQueryParser.XqwithPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqwithP}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqwithP(XQueryParser.XqwithPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringC}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterStringC(XQueryParser.StringCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringC}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitStringC(XQueryParser.StringCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqLet(XQueryParser.XqLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqLet}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqLet(XQueryParser.XqLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqRp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXqRp(XQueryParser.XqRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqRp}
	 * labeled alternative in {@link XQueryParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXqRp(XQueryParser.XqRpContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(XQueryParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(XQueryParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XQueryParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XQueryParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XQueryParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XQueryParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqEqual(XQueryParser.XqEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqEqual}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqEqual(XQueryParser.XqEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqEmpty(XQueryParser.XqEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqEmpty}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqEmpty(XQueryParser.XqEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqCondOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqCondOr(XQueryParser.XqCondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqCondOr}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqCondOr(XQueryParser.XqCondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqSome}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqSome(XQueryParser.XqSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqSome}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqSome(XQueryParser.XqSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqIs(XQueryParser.XqIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqIs}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqIs(XQueryParser.XqIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqCondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqCondNot(XQueryParser.XqCondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqCondNot}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqCondNot(XQueryParser.XqCondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqCondwithP}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqCondwithP(XQueryParser.XqCondwithPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqCondwithP}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqCondwithP(XQueryParser.XqCondwithPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XqCondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterXqCondAnd(XQueryParser.XqCondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XqCondAnd}
	 * labeled alternative in {@link XQueryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitXqCondAnd(XQueryParser.XqCondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApChildren(XQueryParser.ApChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApChildren}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApChildren(XQueryParser.ApChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterApAll(XQueryParser.ApAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApAll}
	 * labeled alternative in {@link XQueryParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitApAll(XQueryParser.ApAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(XQueryParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(XQueryParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link XQueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(XQueryParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XQueryParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(XQueryParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAllChildren(XQueryParser.AllChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AllChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAllChildren(XQueryParser.AllChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpwithP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpwithP(XQueryParser.RpwithPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpwithP}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpwithP(XQueryParser.RpwithPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagName}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagName(XQueryParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpAll(XQueryParser.RpAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpAll}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpAll(XQueryParser.RpAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParent(XQueryParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parent}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParent(XQueryParser.ParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Attribute}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(XQueryParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpChildren(XQueryParser.RpChildrenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpChildren}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpChildren(XQueryParser.RpChildrenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterText(XQueryParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitText(XQueryParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Current}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCurrent(XQueryParser.CurrentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTwoRp(XQueryParser.TwoRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoRp}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTwoRp(XQueryParser.TwoRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link XQueryParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(XQueryParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilAnd}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilAnd(XQueryParser.FilAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilAnd}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilAnd(XQueryParser.FilAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilEqual}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilEqual(XQueryParser.FilEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilEqual}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilEqual(XQueryParser.FilEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilNot}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilNot(XQueryParser.FilNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilNot}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilNot(XQueryParser.FilNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilOr}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilOr(XQueryParser.FilOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilOr}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilOr(XQueryParser.FilOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilIs}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilIs(XQueryParser.FilIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilIs}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilIs(XQueryParser.FilIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilwithP}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilwithP(XQueryParser.FilwithPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilwithP}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilwithP(XQueryParser.FilwithPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilRp}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilRp(XQueryParser.FilRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilRp}
	 * labeled alternative in {@link XQueryParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilRp(XQueryParser.FilRpContext ctx);
}