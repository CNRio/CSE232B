// Generated from /Users/YueWang/Documents/Slide_and_Homework/CSE232B/antlrTest1.0/src/XQuery.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQueryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, StringConstant=34, DOC=35, NAME=36, TXT=37, WS=38;
	public static final int
		RULE_xq = 0, RULE_var = 1, RULE_forClause = 2, RULE_letClause = 3, RULE_whereClause = 4, 
		RULE_returnClause = 5, RULE_cond = 6, RULE_ap = 7, RULE_doc = 8, RULE_fname = 9, 
		RULE_rp = 10, RULE_filter = 11;
	public static final String[] ruleNames = {
		"xq", "var", "forClause", "letClause", "whereClause", "returnClause", 
		"cond", "ap", "doc", "fname", "rp", "filter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'/'", "'//'", "'<'", "'>'", "'{'", "'}'", 
		"'$'", "'for'", "'in'", "'let'", "':='", "'where'", "'return'", "'='", 
		"'eq'", "'=='", "'is'", "'empty'", "'some'", "'satisfies'", "'and'", "'or'", 
		"'not'", "'\"'", "'.'", "'*'", "'..'", "'@'", "'['", "']'", null, "'document'", 
		null, "'text()'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "StringConstant", 
		"DOC", "NAME", "TXT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XQuery.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XQueryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class XqContext extends ParserRuleContext {
		public XqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xq; }
	 
		public XqContext() { }
		public void copyFrom(XqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqApContext extends XqContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public XqApContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqAp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqConstructorContext extends XqContext {
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqConstructorContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FLWRContext extends XqContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public FLWRContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFLWR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoXqContext extends XqContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public TwoXqContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTwoXq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends XqContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VariableContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqRpallContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqRpallContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqRpall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqwithPContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqwithPContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqwithP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringCContext extends XqContext {
		public TerminalNode StringConstant() { return getToken(XQueryParser.StringConstant, 0); }
		public StringCContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitStringC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqLetContext extends XqContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqLetContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqRpContext extends XqContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public XqRpContext(XqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqRp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XqContext xq() throws RecognitionException {
		return xq(0);
	}

	private XqContext xq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XqContext _localctx = new XqContext(_ctx, _parentState);
		XqContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_xq, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			switch (_input.LA(1)) {
			case T__12:
				{
				_localctx = new XqLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(25);
				letClause();
				setState(26);
				xq(1);
				}
				break;
			case T__9:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(28);
				var();
				}
				break;
			case StringConstant:
				{
				_localctx = new StringCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29);
				match(StringConstant);
				}
				break;
			case DOC:
				{
				_localctx = new XqApContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30);
				ap();
				}
				break;
			case T__0:
				{
				_localctx = new XqwithPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(T__0);
				setState(32);
				xq(0);
				setState(33);
				match(T__1);
				}
				break;
			case T__5:
				{
				_localctx = new XqConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(T__5);
				setState(36);
				match(NAME);
				setState(37);
				match(T__6);
				setState(38);
				match(T__7);
				setState(39);
				xq(0);
				setState(40);
				match(T__8);
				setState(41);
				match(T__5);
				setState(42);
				match(T__3);
				setState(43);
				match(NAME);
				setState(44);
				match(T__6);
				}
				break;
			case T__10:
				{
				_localctx = new FLWRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				forClause();
				setState(48);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(47);
					letClause();
					}
				}

				setState(51);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(50);
					whereClause();
					}
				}

				setState(53);
				returnClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(66);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new TwoXqContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(57);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(58);
						match(T__2);
						setState(59);
						xq(7);
						}
						break;
					case 2:
						{
						_localctx = new XqRpContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(60);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(61);
						match(T__3);
						setState(62);
						rp(0);
						}
						break;
					case 3:
						{
						_localctx = new XqRpallContext(new XqContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_xq);
						setState(63);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(64);
						match(T__4);
						setState(65);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__9);
			setState(72);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__10);
			setState(75);
			var();
			setState(76);
			match(T__11);
			setState(77);
			xq(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				match(T__2);
				setState(79);
				var();
				setState(80);
				match(T__11);
				setState(81);
				xq(0);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__12);
			setState(89);
			var();
			setState(90);
			match(T__13);
			setState(91);
			xq(0);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(92);
				match(T__2);
				setState(93);
				var();
				setState(94);
				match(T__13);
				setState(95);
				xq(0);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__14);
			setState(103);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__15);
			setState(106);
			xq(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class XqEqualContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XqEqualContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqEmptyContext extends CondContext {
		public XqContext xq() {
			return getRuleContext(XqContext.class,0);
		}
		public XqEmptyContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqCondOrContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public XqCondOrContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqCondOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqSomeContext extends CondContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XqSomeContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqIsContext extends CondContext {
		public List<XqContext> xq() {
			return getRuleContexts(XqContext.class);
		}
		public XqContext xq(int i) {
			return getRuleContext(XqContext.class,i);
		}
		public XqIsContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqCondNotContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XqCondNotContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqCondNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqCondwithPContext extends CondContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public XqCondwithPContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqCondwithP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XqCondAndContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public XqCondAndContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitXqCondAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new XqSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(109);
				match(T__21);
				setState(110);
				var();
				setState(111);
				match(T__11);
				setState(112);
				xq(0);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(113);
					match(T__2);
					setState(114);
					var();
					setState(115);
					match(T__11);
					setState(116);
					xq(0);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__22);
				setState(124);
				cond(5);
				}
				break;
			case 2:
				{
				_localctx = new XqCondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__25);
				setState(127);
				cond(1);
				}
				break;
			case 3:
				{
				_localctx = new XqEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				xq(0);
				setState(129);
				match(T__16);
				setState(130);
				xq(0);
				}
				break;
			case 4:
				{
				_localctx = new XqEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				xq(0);
				setState(133);
				match(T__17);
				setState(134);
				xq(0);
				}
				break;
			case 5:
				{
				_localctx = new XqIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				xq(0);
				setState(137);
				match(T__18);
				setState(138);
				xq(0);
				}
				break;
			case 6:
				{
				_localctx = new XqIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				xq(0);
				setState(141);
				match(T__19);
				setState(142);
				xq(0);
				}
				break;
			case 7:
				{
				_localctx = new XqEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(T__20);
				setState(145);
				match(T__0);
				setState(146);
				xq(0);
				setState(147);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new XqCondwithPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(T__0);
				setState(150);
				cond(0);
				setState(151);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new XqCondAndContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(155);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(156);
						match(T__23);
						setState(157);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new XqCondOrContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(158);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(159);
						match(T__24);
						setState(160);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApChildrenContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApChildrenContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApAllContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ApAllContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitApAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ap);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ApChildrenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				doc();
				setState(167);
				match(T__3);
				setState(168);
				rp(0);
				}
				break;
			case 2:
				_localctx = new ApAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				doc();
				setState(171);
				match(T__4);
				setState(172);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(XQueryParser.DOC, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(DOC);
			setState(177);
			match(T__0);
			setState(178);
			match(T__26);
			setState(179);
			fname();
			setState(180);
			match(T__26);
			setState(181);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FnameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(XQueryParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(XQueryParser.NAME, i);
		}
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(NAME);
			setState(186);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(184);
				match(T__27);
				setState(185);
				match(NAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllChildrenContext extends RpContext {
		public AllChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAllChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpwithPContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpwithPContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpwithP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameContext extends RpContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public TagNameContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpAllContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpAllContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentContext extends RpContext {
		public ParentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends RpContext {
		public TerminalNode NAME() { return getToken(XQueryParser.NAME, 0); }
		public AttributeContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpChildrenContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public RpChildrenContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpChildren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextContext extends RpContext {
		public TerminalNode TXT() { return getToken(XQueryParser.TXT, 0); }
		public TextContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentContext extends RpContext {
		public CurrentContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitCurrent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TwoRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitTwoRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public RpFilterContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new TagNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189);
				match(NAME);
				}
				break;
			case T__28:
				{
				_localctx = new AllChildrenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(T__28);
				}
				break;
			case T__27:
				{
				_localctx = new CurrentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(T__27);
				}
				break;
			case T__29:
				{
				_localctx = new ParentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(T__29);
				}
				break;
			case TXT:
				{
				_localctx = new TextContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(TXT);
				}
				break;
			case T__30:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(T__30);
				setState(195);
				match(NAME);
				}
				break;
			case T__0:
				{
				_localctx = new RpwithPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(T__0);
				setState(197);
				rp(0);
				setState(198);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new RpChildrenContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(202);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(203);
						match(T__3);
						setState(204);
						rp(5);
						}
						break;
					case 2:
						{
						_localctx = new RpAllContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						match(T__4);
						setState(207);
						rp(4);
						}
						break;
					case 3:
						{
						_localctx = new TwoRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(208);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(209);
						match(T__2);
						setState(210);
						rp(2);
						}
						break;
					case 4:
						{
						_localctx = new RpFilterContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(T__31);
						setState(213);
						filter(0);
						setState(214);
						match(T__32);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
	 
		public FilterContext() { }
		public void copyFrom(FilterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilAndContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilAndContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilEqualContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilEqualContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilNotContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilNotContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilOrContext extends FilterContext {
		public List<FilterContext> filter() {
			return getRuleContexts(FilterContext.class);
		}
		public FilterContext filter(int i) {
			return getRuleContext(FilterContext.class,i);
		}
		public FilOrContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilIsContext extends FilterContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public FilIsContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilIs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilwithPContext extends FilterContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public FilwithPContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilwithP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilRpContext extends FilterContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public FilRpContext(FilterContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof XQueryVisitor ) return ((XQueryVisitor<? extends T>)visitor).visitFilRp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		return filter(0);
	}

	private FilterContext filter(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FilterContext _localctx = new FilterContext(_ctx, _parentState);
		FilterContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_filter, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new FilNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222);
				match(T__25);
				setState(223);
				filter(1);
				}
				break;
			case 2:
				{
				_localctx = new FilRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				rp(0);
				}
				break;
			case 3:
				{
				_localctx = new FilEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				rp(0);
				setState(226);
				match(T__16);
				setState(227);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new FilEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				rp(0);
				setState(230);
				match(T__17);
				setState(231);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new FilIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				rp(0);
				setState(234);
				match(T__18);
				setState(235);
				rp(0);
				}
				break;
			case 6:
				{
				_localctx = new FilIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				rp(0);
				setState(238);
				match(T__19);
				setState(239);
				rp(0);
				}
				break;
			case 7:
				{
				_localctx = new FilwithPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(T__0);
				setState(242);
				filter(0);
				setState(243);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(253);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new FilAndContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						match(T__23);
						setState(249);
						filter(4);
						}
						break;
					case 2:
						{
						_localctx = new FilOrContext(new FilterContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_filter);
						setState(250);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(251);
						match(T__24);
						setState(252);
						filter(3);
						}
						break;
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return xq_sempred((XqContext)_localctx, predIndex);
		case 6:
			return cond_sempred((CondContext)_localctx, predIndex);
		case 10:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 11:
			return filter_sempred((FilterContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean xq_sempred(XqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean filter_sempred(FilterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\63\n\2\3\2\5\2\66\n"+
		"\2\3\2\3\2\5\2:\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2E\n\2\f\2\16"+
		"\2H\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4V\n\4\f\4"+
		"\16\4Y\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5d\n\5\f\5\16\5g\13"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b"+
		"y\n\b\f\b\16\b|\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u009c\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00a4\n\b\f\b\16\b\u00a7\13"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b1\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\5\13\u00bd\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00f8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0100\n\r\f\r\16\r\u0103"+
		"\13\r\3\r\2\6\2\16\26\30\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u0123\2"+
		"9\3\2\2\2\4I\3\2\2\2\6L\3\2\2\2\bZ\3\2\2\2\nh\3\2\2\2\fk\3\2\2\2\16\u009b"+
		"\3\2\2\2\20\u00b0\3\2\2\2\22\u00b2\3\2\2\2\24\u00b9\3\2\2\2\26\u00ca\3"+
		"\2\2\2\30\u00f7\3\2\2\2\32\33\b\2\1\2\33\34\5\b\5\2\34\35\5\2\2\3\35:"+
		"\3\2\2\2\36:\5\4\3\2\37:\7$\2\2 :\5\20\t\2!\"\7\3\2\2\"#\5\2\2\2#$\7\4"+
		"\2\2$:\3\2\2\2%&\7\b\2\2&\'\7&\2\2\'(\7\t\2\2()\7\n\2\2)*\5\2\2\2*+\7"+
		"\13\2\2+,\7\b\2\2,-\7\6\2\2-.\7&\2\2./\7\t\2\2/:\3\2\2\2\60\62\5\6\4\2"+
		"\61\63\5\b\5\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\n\6\2"+
		"\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\5\f\7\28:\3\2\2\29\32\3"+
		"\2\2\29\36\3\2\2\29\37\3\2\2\29 \3\2\2\29!\3\2\2\29%\3\2\2\29\60\3\2\2"+
		"\2:F\3\2\2\2;<\f\b\2\2<=\7\5\2\2=E\5\2\2\t>?\f\7\2\2?@\7\6\2\2@E\5\26"+
		"\f\2AB\f\6\2\2BC\7\7\2\2CE\5\26\f\2D;\3\2\2\2D>\3\2\2\2DA\3\2\2\2EH\3"+
		"\2\2\2FD\3\2\2\2FG\3\2\2\2G\3\3\2\2\2HF\3\2\2\2IJ\7\f\2\2JK\7&\2\2K\5"+
		"\3\2\2\2LM\7\r\2\2MN\5\4\3\2NO\7\16\2\2OW\5\2\2\2PQ\7\5\2\2QR\5\4\3\2"+
		"RS\7\16\2\2ST\5\2\2\2TV\3\2\2\2UP\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2"+
		"\2X\7\3\2\2\2YW\3\2\2\2Z[\7\17\2\2[\\\5\4\3\2\\]\7\20\2\2]e\5\2\2\2^_"+
		"\7\5\2\2_`\5\4\3\2`a\7\20\2\2ab\5\2\2\2bd\3\2\2\2c^\3\2\2\2dg\3\2\2\2"+
		"ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3\2\2\2hi\7\21\2\2ij\5\16\b\2j\13\3"+
		"\2\2\2kl\7\22\2\2lm\5\2\2\2m\r\3\2\2\2no\b\b\1\2op\7\30\2\2pq\5\4\3\2"+
		"qr\7\16\2\2rz\5\2\2\2st\7\5\2\2tu\5\4\3\2uv\7\16\2\2vw\5\2\2\2wy\3\2\2"+
		"\2xs\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\31"+
		"\2\2~\177\5\16\b\7\177\u009c\3\2\2\2\u0080\u0081\7\34\2\2\u0081\u009c"+
		"\5\16\b\3\u0082\u0083\5\2\2\2\u0083\u0084\7\23\2\2\u0084\u0085\5\2\2\2"+
		"\u0085\u009c\3\2\2\2\u0086\u0087\5\2\2\2\u0087\u0088\7\24\2\2\u0088\u0089"+
		"\5\2\2\2\u0089\u009c\3\2\2\2\u008a\u008b\5\2\2\2\u008b\u008c\7\25\2\2"+
		"\u008c\u008d\5\2\2\2\u008d\u009c\3\2\2\2\u008e\u008f\5\2\2\2\u008f\u0090"+
		"\7\26\2\2\u0090\u0091\5\2\2\2\u0091\u009c\3\2\2\2\u0092\u0093\7\27\2\2"+
		"\u0093\u0094\7\3\2\2\u0094\u0095\5\2\2\2\u0095\u0096\7\4\2\2\u0096\u009c"+
		"\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u0099\5\16\b\2\u0099\u009a\7\4\2\2"+
		"\u009a\u009c\3\2\2\2\u009bn\3\2\2\2\u009b\u0080\3\2\2\2\u009b\u0082\3"+
		"\2\2\2\u009b\u0086\3\2\2\2\u009b\u008a\3\2\2\2\u009b\u008e\3\2\2\2\u009b"+
		"\u0092\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u00a5\3\2\2\2\u009d\u009e\f\5"+
		"\2\2\u009e\u009f\7\32\2\2\u009f\u00a4\5\16\b\6\u00a0\u00a1\f\4\2\2\u00a1"+
		"\u00a2\7\33\2\2\u00a2\u00a4\5\16\b\5\u00a3\u009d\3\2\2\2\u00a3\u00a0\3"+
		"\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\17\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\7\6\2"+
		"\2\u00aa\u00ab\5\26\f\2\u00ab\u00b1\3\2\2\2\u00ac\u00ad\5\22\n\2\u00ad"+
		"\u00ae\7\7\2\2\u00ae\u00af\5\26\f\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3"+
		"\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b3\7%\2\2\u00b3\u00b4"+
		"\7\3\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\35\2"+
		"\2\u00b7\u00b8\7\4\2\2\u00b8\23\3\2\2\2\u00b9\u00bc\7&\2\2\u00ba\u00bb"+
		"\7\36\2\2\u00bb\u00bd\7&\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\25\3\2\2\2\u00be\u00bf\b\f\1\2\u00bf\u00cb\7&\2\2\u00c0\u00cb\7\37\2"+
		"\2\u00c1\u00cb\7\36\2\2\u00c2\u00cb\7 \2\2\u00c3\u00cb\7\'\2\2\u00c4\u00c5"+
		"\7!\2\2\u00c5\u00cb\7&\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8\5\26\f\2\u00c8"+
		"\u00c9\7\4\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c0\3\2"+
		"\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c3\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00dc\3\2\2\2\u00cc\u00cd\f\6"+
		"\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00db\5\26\f\7\u00cf\u00d0\f\5\2\2\u00d0"+
		"\u00d1\7\7\2\2\u00d1\u00db\5\26\f\6\u00d2\u00d3\f\3\2\2\u00d3\u00d4\7"+
		"\5\2\2\u00d4\u00db\5\26\f\4\u00d5\u00d6\f\4\2\2\u00d6\u00d7\7\"\2\2\u00d7"+
		"\u00d8\5\30\r\2\u00d8\u00d9\7#\2\2\u00d9\u00db\3\2\2\2\u00da\u00cc\3\2"+
		"\2\2\u00da\u00cf\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d5\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\27\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df\u00e0\b\r\1\2\u00e0\u00e1\7\34\2\2\u00e1"+
		"\u00f8\5\30\r\3\u00e2\u00f8\5\26\f\2\u00e3\u00e4\5\26\f\2\u00e4\u00e5"+
		"\7\23\2\2\u00e5\u00e6\5\26\f\2\u00e6\u00f8\3\2\2\2\u00e7\u00e8\5\26\f"+
		"\2\u00e8\u00e9\7\24\2\2\u00e9\u00ea\5\26\f\2\u00ea\u00f8\3\2\2\2\u00eb"+
		"\u00ec\5\26\f\2\u00ec\u00ed\7\25\2\2\u00ed\u00ee\5\26\f\2\u00ee\u00f8"+
		"\3\2\2\2\u00ef\u00f0\5\26\f\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\5\26\f"+
		"\2\u00f2\u00f8\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5\30\r\2\u00f5"+
		"\u00f6\7\4\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00df\3\2\2\2\u00f7\u00e2\3\2"+
		"\2\2\u00f7\u00e3\3\2\2\2\u00f7\u00e7\3\2\2\2\u00f7\u00eb\3\2\2\2\u00f7"+
		"\u00ef\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8\u0101\3\2\2\2\u00f9\u00fa\f\5"+
		"\2\2\u00fa\u00fb\7\32\2\2\u00fb\u0100\5\30\r\6\u00fc\u00fd\f\4\2\2\u00fd"+
		"\u00fe\7\33\2\2\u00fe\u0100\5\30\r\5\u00ff\u00f9\3\2\2\2\u00ff\u00fc\3"+
		"\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\31\3\2\2\2\u0103\u0101\3\2\2\2\25\62\659DFWez\u009b\u00a3\u00a5\u00b0"+
		"\u00bc\u00ca\u00da\u00dc\u00f7\u00ff\u0101";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}