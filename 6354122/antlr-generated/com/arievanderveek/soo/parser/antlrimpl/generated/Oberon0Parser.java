// $ANTLR 3.3 Nov 30, 2010 12:45:30 E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g 2011-02-14 23:22:02

  package com.arievanderveek.soo.parser.antlrimpl.generated;
  import com.arievanderveek.soo.ast.*;
  import com.arievanderveek.soo.ast.statements.*;
  import com.arievanderveek.soo.ast.variables.*;
  import com.arievanderveek.soo.ast.expr.*;
  import com.arievanderveek.soo.ast.expr.unaryoperators.*;
  import com.arievanderveek.soo.ast.expr.binaryoperators.*;
  import com.arievanderveek.soo.ast.codeblocks.*;
  import java.util.Collections;
  import java.util.Map;
  import java.util.Queue;
  import java.util.Hashtable;
  import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "IDENT", "INTEGER", "DIGIT", "LETTER", "WS", "'.'", "'['", "']'", "'('", "')'", "'~'", "'*'", "'DIV'", "'MOD'", "'&'", "'+'", "'-'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "':='", "','", "'ELSIF'", "'THEN'", "'ELSE'", "'IF'", "'END'", "'WITH'", "'DO'", "'WHILE'", "';'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'VAR'", "'BEGIN'", "'PROCEDURE'", "'CONST'", "'TYPE'", "'MODULE'"
    };
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NEGATION=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int DIGIT=7;
    public static final int LETTER=8;
    public static final int WS=9;

    // delegates
    // delegators


        public Oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g"; }


    public static class selectorPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectorPart"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:42:1: selectorPart : ( '.' IDENT | '[' e= expression ']' );
    public final Oberon0Parser.selectorPart_return selectorPart() throws RecognitionException {
        Oberon0Parser.selectorPart_return retval = new Oberon0Parser.selectorPart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal1=null;
        Token IDENT2=null;
        Token char_literal3=null;
        Token char_literal4=null;
        Oberon0Parser.expression_return e = null;


        CommonTree char_literal1_tree=null;
        CommonTree IDENT2_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree char_literal4_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:43:2: ( '.' IDENT | '[' e= expression ']' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:43:4: '.' IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal1=(Token)match(input,10,FOLLOW_10_in_selectorPart71); 
                    char_literal1_tree = (CommonTree)adaptor.create(char_literal1);
                    adaptor.addChild(root_0, char_literal1_tree);

                    IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_selectorPart73); 
                    IDENT2_tree = (CommonTree)adaptor.create(IDENT2);
                    adaptor.addChild(root_0, IDENT2_tree);

                     ((selector_scope)selector_stack.peek()).selectors.add(new Member((IDENT2!=null?IDENT2.getText():null))); 

                    }
                    break;
                case 2 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:44:4: '[' e= expression ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal3=(Token)match(input,11,FOLLOW_11_in_selectorPart80); 
                    char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
                    adaptor.addChild(root_0, char_literal3_tree);

                    pushFollow(FOLLOW_expression_in_selectorPart84);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, e.getTree());
                    char_literal4=(Token)match(input,12,FOLLOW_12_in_selectorPart86); 
                    char_literal4_tree = (CommonTree)adaptor.create(char_literal4);
                    adaptor.addChild(root_0, char_literal4_tree);

                     ((selector_scope)selector_stack.peek()).selectors.add(new Subscript((e!=null?e.node:null))); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "selectorPart"

    protected static class selector_scope {
        List<Selector> selectors;
    }
    protected Stack selector_stack = new Stack();

    public static class selector_return extends ParserRuleReturnScope {
        public List<Selector> return_selectors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:47:1: selector returns [List<Selector> return_selectors] : ( selectorPart )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        selector_stack.push(new selector_scope());
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selectorPart_return selectorPart5 = null;




        	((selector_scope)selector_stack.peek()).selectors = new LinkedList<Selector>();

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:54:2: ( ( selectorPart )* )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:54:4: ( selectorPart )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:54:4: ( selectorPart )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=10 && LA2_0<=11)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:54:4: selectorPart
            	    {
            	    pushFollow(FOLLOW_selectorPart_in_selector109);
            	    selectorPart5=selectorPart();

            	    state._fsp--;

            	    adaptor.addChild(root_0, selectorPart5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             retval.return_selectors = ((selector_scope)selector_stack.peek()).selectors; 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            selector_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class identSelector_return extends ParserRuleReturnScope {
        public IdentifierNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identSelector"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:58:1: identSelector returns [IdentifierNode node] : IDENT selector ;
    public final Oberon0Parser.identSelector_return identSelector() throws RecognitionException {
        Oberon0Parser.identSelector_return retval = new Oberon0Parser.identSelector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT6=null;
        Oberon0Parser.selector_return selector7 = null;


        CommonTree IDENT6_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:59:2: ( IDENT selector )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:59:4: IDENT selector
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_identSelector127); 
            IDENT6_tree = (CommonTree)adaptor.create(IDENT6);
            adaptor.addChild(root_0, IDENT6_tree);

            pushFollow(FOLLOW_selector_in_identSelector129);
            selector7=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector7.getTree());
            retval.node = new IdentifierNode((IDENT6!=null?IDENT6.getText():null) , new Selectors((selector7!=null?selector7.return_selectors:null) ));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "identSelector"

    public static class factor_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:62:1: factor returns [ExpressionNode node] : ( identSelector | INTEGER | '(' expression ')' | '~' f= factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        Token char_literal13=null;
        Oberon0Parser.factor_return f = null;

        Oberon0Parser.identSelector_return identSelector8 = null;

        Oberon0Parser.expression_return expression11 = null;


        CommonTree INTEGER9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree char_literal13_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:63:2: ( identSelector | INTEGER | '(' expression ')' | '~' f= factor )
            int alt3=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt3=1;
                }
                break;
            case INTEGER:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:63:4: identSelector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identSelector_in_factor145);
                    identSelector8=identSelector();

                    state._fsp--;

                    adaptor.addChild(root_0, identSelector8.getTree());
                     retval.node = (identSelector8!=null?identSelector8.node:null);

                    }
                    break;
                case 2 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:64:4: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER9=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor152); 
                    INTEGER9_tree = (CommonTree)adaptor.create(INTEGER9);
                    adaptor.addChild(root_0, INTEGER9_tree);

                    retval.node = new IntegerExpressionNode(new Integer((INTEGER9!=null?INTEGER9.getText():null))) ;

                    }
                    break;
                case 3 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:65:4: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal10=(Token)match(input,13,FOLLOW_13_in_factor159); 
                    char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
                    adaptor.addChild(root_0, char_literal10_tree);

                    pushFollow(FOLLOW_expression_in_factor161);
                    expression11=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression11.getTree());
                    char_literal12=(Token)match(input,14,FOLLOW_14_in_factor163); 
                    char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);

                    retval.node = (expression11!=null?expression11.node:null); 

                    }
                    break;
                case 4 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:66:4: '~' f= factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal13=(Token)match(input,15,FOLLOW_15_in_factor170); 
                    char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);

                    pushFollow(FOLLOW_factor_in_factor175);
                    f=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, f.getTree());
                    retval.node = new NotOperatorNode((f!=null?f.node:null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:69:1: term returns [ExpressionNode node] : lhs= factor ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )? ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token times=null;
        Token div=null;
        Token mod=null;
        Token and=null;
        Oberon0Parser.factor_return lhs = null;

        Oberon0Parser.factor_return rhs = null;


        CommonTree times_tree=null;
        CommonTree div_tree=null;
        CommonTree mod_tree=null;
        CommonTree and_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:70:2: (lhs= factor ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )? )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:70:4: lhs= factor ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term194);
            lhs=factor();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:71:2: ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:71:3: (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor
                    {
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:71:3: (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' )
                    int alt4=4;
                    switch ( input.LA(1) ) {
                    case 16:
                        {
                        alt4=1;
                        }
                        break;
                    case 17:
                        {
                        alt4=2;
                        }
                        break;
                    case 18:
                        {
                        alt4=3;
                        }
                        break;
                    case 19:
                        {
                        alt4=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }

                    switch (alt4) {
                        case 1 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:71:4: times= '*'
                            {
                            times=(Token)match(input,16,FOLLOW_16_in_term202); 
                            times_tree = (CommonTree)adaptor.create(times);
                            adaptor.addChild(root_0, times_tree);


                            }
                            break;
                        case 2 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:72:4: div= 'DIV'
                            {
                            div=(Token)match(input,17,FOLLOW_17_in_term209); 
                            div_tree = (CommonTree)adaptor.create(div);
                            adaptor.addChild(root_0, div_tree);


                            }
                            break;
                        case 3 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:73:4: mod= 'MOD'
                            {
                            mod=(Token)match(input,18,FOLLOW_18_in_term216); 
                            mod_tree = (CommonTree)adaptor.create(mod);
                            adaptor.addChild(root_0, mod_tree);


                            }
                            break;
                        case 4 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:74:4: and= '&'
                            {
                            and=(Token)match(input,19,FOLLOW_19_in_term223); 
                            and_tree = (CommonTree)adaptor.create(and);
                            adaptor.addChild(root_0, and_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_factor_in_term230);
                    rhs=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, rhs.getTree());

                    }
                    break;

            }

             
            		// if there is a right hand factor, its a binary operator thus create one	
            		if ((rhs!=null?rhs.node:null)!=null){
            			if (times!=null){
            				retval.node = new MultiplicationOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (div!=null){
            				retval.node = new DivisionOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (mod!=null){
            				retval.node = new ModulusOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (and!=null){
            				retval.node = new AndOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            		}else{
            			// there is no right hand factor, so return the factor.
            			retval.node = (lhs!=null?lhs.node:null);
            		}
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class termList_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termList"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:98:1: termList returns [ExpressionNode node] : lhs= term ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )? ;
    public final Oberon0Parser.termList_return termList() throws RecognitionException {
        Oberon0Parser.termList_return retval = new Oberon0Parser.termList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token plus=null;
        Token min=null;
        Token or=null;
        Oberon0Parser.term_return lhs = null;

        Oberon0Parser.term_return rhs = null;


        CommonTree plus_tree=null;
        CommonTree min_tree=null;
        CommonTree or_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:99:2: (lhs= term ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )? )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:99:4: lhs= term ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_term_in_termList251);
            lhs=term();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:100:2: ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=22)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:100:3: (plus= '+' | min= '-' | or= 'OR' ) rhs= term
                    {
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:100:3: (plus= '+' | min= '-' | or= 'OR' )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case 20:
                        {
                        alt6=1;
                        }
                        break;
                    case 21:
                        {
                        alt6=2;
                        }
                        break;
                    case 22:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:100:4: plus= '+'
                            {
                            plus=(Token)match(input,20,FOLLOW_20_in_termList259); 
                            plus_tree = (CommonTree)adaptor.create(plus);
                            adaptor.addChild(root_0, plus_tree);


                            }
                            break;
                        case 2 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:101:3: min= '-'
                            {
                            min=(Token)match(input,21,FOLLOW_21_in_termList265); 
                            min_tree = (CommonTree)adaptor.create(min);
                            adaptor.addChild(root_0, min_tree);


                            }
                            break;
                        case 3 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:102:3: or= 'OR'
                            {
                            or=(Token)match(input,22,FOLLOW_22_in_termList271); 
                            or_tree = (CommonTree)adaptor.create(or);
                            adaptor.addChild(root_0, or_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_term_in_termList278);
                    rhs=term();

                    state._fsp--;

                    adaptor.addChild(root_0, rhs.getTree());

                    }
                    break;

            }

             
            		// if there is a right hand term, its a binary operator thus create one	
            		if ((rhs!=null?rhs.node:null)!=null){
            			if (plus!=null){
            				retval.node = new AdditionOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (min!=null){
            				retval.node = new SubtractionOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (or!=null){
            				retval.node = new OrOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            		}else{
            			// there is no right hand factor, so return the term.
            			retval.node = (lhs!=null?lhs.node:null);
            		}
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "termList"

    public static class negation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negation"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:123:1: negation : '-' -> NEGATION ;
    public final Oberon0Parser.negation_return negation() throws RecognitionException {
        Oberon0Parser.negation_return retval = new Oberon0Parser.negation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal14=null;

        CommonTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:124:2: ( '-' -> NEGATION )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:124:4: '-'
            {
            char_literal14=(Token)match(input,21,FOLLOW_21_in_negation294);  
            stream_21.add(char_literal14);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:8: -> NEGATION
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(NEGATION, "NEGATION"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "negation"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:127:1: simpleExpression returns [ExpressionNode node] : ( '+' | negation )? termList ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        Oberon0Parser.negation_return negation16 = null;

        Oberon0Parser.termList_return termList17 = null;


        CommonTree char_literal15_tree=null;


        	boolean isNegation = false;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:131:2: ( ( '+' | negation )? termList )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:131:4: ( '+' | negation )? termList
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:131:4: ( '+' | negation )?
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            switch (alt8) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:131:5: '+'
                    {
                    char_literal15=(Token)match(input,20,FOLLOW_20_in_simpleExpression317); 
                    char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;
                case 2 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:132:2: negation
                    {
                    pushFollow(FOLLOW_negation_in_simpleExpression321);
                    negation16=negation();

                    state._fsp--;

                    adaptor.addChild(root_0, negation16.getTree());
                    isNegation = true;

                    }
                    break;

            }

            pushFollow(FOLLOW_termList_in_simpleExpression329);
            termList17=termList();

            state._fsp--;

            adaptor.addChild(root_0, termList17.getTree());
             
            		// if there is a right hand term, its a binary operator thus create one	
            		if (isNegation){
            			retval.node = new NegationOperatorNode((termList17!=null?termList17.node:null));
            		}else{
            			// there is no right hand factor, so return the term.
            			retval.node = (termList17!=null?termList17.node:null);
            		}
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class expression_return extends ParserRuleReturnScope {
        public ExpressionNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:145:1: expression returns [ExpressionNode node] : lhs= simpleExpression ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )? ;
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token equal=null;
        Token notequal=null;
        Token smaller=null;
        Token smallereq=null;
        Token greater=null;
        Token greatereq=null;
        Oberon0Parser.simpleExpression_return lhs = null;

        Oberon0Parser.simpleExpression_return rhs = null;


        CommonTree equal_tree=null;
        CommonTree notequal_tree=null;
        CommonTree smaller_tree=null;
        CommonTree smallereq_tree=null;
        CommonTree greater_tree=null;
        CommonTree greatereq_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:146:3: (lhs= simpleExpression ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )? )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:146:5: lhs= simpleExpression ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression351);
            lhs=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:146:26: ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=28)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:146:27: (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression
                    {
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:146:27: (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' )
                    int alt9=6;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt9=1;
                        }
                        break;
                    case 24:
                        {
                        alt9=2;
                        }
                        break;
                    case 25:
                        {
                        alt9=3;
                        }
                        break;
                    case 26:
                        {
                        alt9=4;
                        }
                        break;
                    case 27:
                        {
                        alt9=5;
                        }
                        break;
                    case 28:
                        {
                        alt9=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:147:2: equal= '='
                            {
                            equal=(Token)match(input,23,FOLLOW_23_in_expression359); 
                            equal_tree = (CommonTree)adaptor.create(equal);
                            adaptor.addChild(root_0, equal_tree);


                            }
                            break;
                        case 2 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:148:3: notequal= '#'
                            {
                            notequal=(Token)match(input,24,FOLLOW_24_in_expression365); 
                            notequal_tree = (CommonTree)adaptor.create(notequal);
                            adaptor.addChild(root_0, notequal_tree);


                            }
                            break;
                        case 3 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:149:3: smaller= '<'
                            {
                            smaller=(Token)match(input,25,FOLLOW_25_in_expression371); 
                            smaller_tree = (CommonTree)adaptor.create(smaller);
                            adaptor.addChild(root_0, smaller_tree);


                            }
                            break;
                        case 4 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:150:3: smallereq= '<='
                            {
                            smallereq=(Token)match(input,26,FOLLOW_26_in_expression377); 
                            smallereq_tree = (CommonTree)adaptor.create(smallereq);
                            adaptor.addChild(root_0, smallereq_tree);


                            }
                            break;
                        case 5 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:151:3: greater= '>'
                            {
                            greater=(Token)match(input,27,FOLLOW_27_in_expression383); 
                            greater_tree = (CommonTree)adaptor.create(greater);
                            adaptor.addChild(root_0, greater_tree);


                            }
                            break;
                        case 6 :
                            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:152:3: greatereq= '>='
                            {
                            greatereq=(Token)match(input,28,FOLLOW_28_in_expression389); 
                            greatereq_tree = (CommonTree)adaptor.create(greatereq);
                            adaptor.addChild(root_0, greatereq_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression396);
                    rhs=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, rhs.getTree());

                    }
                    break;

            }

             
            		// if there is a right hand term, its a binary operator thus create one	
            		if ((rhs!=null?rhs.node:null)!=null){
            			if (equal!=null){
            				retval.node = new EqualOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (notequal!=null){
            				retval.node = new NotEqualOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (smaller!=null){
            				retval.node = new SmallerThenOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (smallereq!=null){
            				retval.node = new SmallerEqualThenOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (greater!=null){
            				retval.node = new GreaterThenOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            			if (greatereq!=null){
            				retval.node = new GreaterEqualThenOperatorNode((lhs!=null?lhs.node:null),(rhs!=null?rhs.node:null));
            			}
            		}else{
            			// there is no right hand factor, so return the term.
            			retval.node = (lhs!=null?lhs.node:null);
            		}
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignment_return extends ParserRuleReturnScope {
        public AssignmentNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:182:1: assignment returns [AssignmentNode node] : identSelector ':=' expression ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal19=null;
        Oberon0Parser.identSelector_return identSelector18 = null;

        Oberon0Parser.expression_return expression20 = null;


        CommonTree string_literal19_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:183:2: ( identSelector ':=' expression )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:183:4: identSelector ':=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identSelector_in_assignment417);
            identSelector18=identSelector();

            state._fsp--;

            adaptor.addChild(root_0, identSelector18.getTree());
            string_literal19=(Token)match(input,29,FOLLOW_29_in_assignment419); 
            string_literal19_tree = (CommonTree)adaptor.create(string_literal19);
            adaptor.addChild(root_0, string_literal19_tree);

            pushFollow(FOLLOW_expression_in_assignment421);
            expression20=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression20.getTree());
             retval.node = new AssignmentNode((identSelector18!=null?identSelector18.node:null), (expression20!=null?expression20.node:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class actualParametersFollowUp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParametersFollowUp"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:187:1: actualParametersFollowUp : ',' expression ;
    public final Oberon0Parser.actualParametersFollowUp_return actualParametersFollowUp() throws RecognitionException {
        Oberon0Parser.actualParametersFollowUp_return retval = new Oberon0Parser.actualParametersFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        Oberon0Parser.expression_return expression22 = null;


        CommonTree char_literal21_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:188:2: ( ',' expression )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:188:4: ',' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal21=(Token)match(input,30,FOLLOW_30_in_actualParametersFollowUp437); 
            char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            pushFollow(FOLLOW_expression_in_actualParametersFollowUp439);
            expression22=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression22.getTree());
            ((actualParameters_scope)actualParameters_stack.peek()).parameters.add((expression22!=null?expression22.node:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "actualParametersFollowUp"

    protected static class actualParameters_scope {
        List<ExpressionNode> parameters;
    }
    protected Stack actualParameters_stack = new Stack();

    public static class actualParameters_return extends ParserRuleReturnScope {
        public List<ExpressionNode> return_expression;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:192:1: actualParameters returns [List<ExpressionNode> return_expression] : '(' expression ( actualParametersFollowUp )* ')' ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        actualParameters_stack.push(new actualParameters_scope());
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal23=null;
        Token char_literal26=null;
        Oberon0Parser.expression_return expression24 = null;

        Oberon0Parser.actualParametersFollowUp_return actualParametersFollowUp25 = null;


        CommonTree char_literal23_tree=null;
        CommonTree char_literal26_tree=null;


        	((actualParameters_scope)actualParameters_stack.peek()).parameters = new LinkedList<ExpressionNode>();

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:199:3: ( '(' expression ( actualParametersFollowUp )* ')' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:199:5: '(' expression ( actualParametersFollowUp )* ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal23=(Token)match(input,13,FOLLOW_13_in_actualParameters465); 
            char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);

            pushFollow(FOLLOW_expression_in_actualParameters469);
            expression24=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression24.getTree());
            ((actualParameters_scope)actualParameters_stack.peek()).parameters.add((expression24!=null?expression24.node:null));
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:201:3: ( actualParametersFollowUp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:201:3: actualParametersFollowUp
            	    {
            	    pushFollow(FOLLOW_actualParametersFollowUp_in_actualParameters476);
            	    actualParametersFollowUp25=actualParametersFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actualParametersFollowUp25.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal26=(Token)match(input,14,FOLLOW_14_in_actualParameters481); 
            char_literal26_tree = (CommonTree)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

             retval.return_expression = ((actualParameters_scope)actualParameters_stack.peek()).parameters;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            actualParameters_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class procedureCall_return extends ParserRuleReturnScope {
        public ProcedureCallNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:206:1: procedureCall returns [ProcedureCallNode node] : IDENT ( actualParameters )? ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT27=null;
        Oberon0Parser.actualParameters_return actualParameters28 = null;


        CommonTree IDENT27_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:207:2: ( IDENT ( actualParameters )? )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:207:5: IDENT ( actualParameters )?
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT27=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall504); 
            IDENT27_tree = (CommonTree)adaptor.create(IDENT27);
            adaptor.addChild(root_0, IDENT27_tree);

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:207:11: ( actualParameters )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:207:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall506);
                    actualParameters28=actualParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualParameters28.getTree());

                    }
                    break;

            }


            		// actualParameters returns an
            		if (actualParameters_stack!=null){
            			if ((actualParameters28!=null?actualParameters28.return_expression:null)!=null){
            				retval.node = new ProcedureCallNode(new IdentifierNode((IDENT27!=null?IDENT27.getText():null)) , (actualParameters28!=null?actualParameters28.return_expression:null) );
            			} else{
            				retval.node = new ProcedureCallNode(new IdentifierNode((IDENT27!=null?IDENT27.getText():null)));
            			}
            		} else 
            		{
            			retval.node = new ProcedureCallNode(new IdentifierNode((IDENT27!=null?IDENT27.getText():null)));
            		}
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class elsIfPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsIfPart"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:223:1: elsIfPart : 'ELSIF' expression 'THEN' statementSequence ;
    public final Oberon0Parser.elsIfPart_return elsIfPart() throws RecognitionException {
        Oberon0Parser.elsIfPart_return retval = new Oberon0Parser.elsIfPart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal29=null;
        Token string_literal31=null;
        Oberon0Parser.expression_return expression30 = null;

        Oberon0Parser.statementSequence_return statementSequence32 = null;


        CommonTree string_literal29_tree=null;
        CommonTree string_literal31_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:224:2: ( 'ELSIF' expression 'THEN' statementSequence )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:224:4: 'ELSIF' expression 'THEN' statementSequence
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal29=(Token)match(input,31,FOLLOW_31_in_elsIfPart521); 
            string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
            adaptor.addChild(root_0, string_literal29_tree);

            pushFollow(FOLLOW_expression_in_elsIfPart523);
            expression30=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression30.getTree());
            string_literal31=(Token)match(input,32,FOLLOW_32_in_elsIfPart525); 
            string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_statementSequence_in_elsIfPart527);
            statementSequence32=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence32.getTree());

            		((ifStatement_scope)ifStatement_stack.peek()).root.insertNode((expression30!=null?expression30.node:null), (statementSequence32!=null?statementSequence32.return_statements:null)); 
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "elsIfPart"

    public static class elsePart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsePart"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:230:1: elsePart : 'ELSE' statementSequence ;
    public final Oberon0Parser.elsePart_return elsePart() throws RecognitionException {
        Oberon0Parser.elsePart_return retval = new Oberon0Parser.elsePart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal33=null;
        Oberon0Parser.statementSequence_return statementSequence34 = null;


        CommonTree string_literal33_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:231:2: ( 'ELSE' statementSequence )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:231:4: 'ELSE' statementSequence
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal33=(Token)match(input,33,FOLLOW_33_in_elsePart541); 
            string_literal33_tree = (CommonTree)adaptor.create(string_literal33);
            adaptor.addChild(root_0, string_literal33_tree);

            pushFollow(FOLLOW_statementSequence_in_elsePart543);
            statementSequence34=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence34.getTree());

            		((ifStatement_scope)ifStatement_stack.peek()).root.addFinalElseStatementNode((statementSequence34!=null?statementSequence34.return_statements:null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "elsePart"

    protected static class ifStatement_scope {
        IfStatementNode root;
    }
    protected Stack ifStatement_stack = new Stack();

    public static class ifStatement_return extends ParserRuleReturnScope {
        public IfStatementNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:237:1: ifStatement returns [IfStatementNode node] : 'IF' expression 'THEN' statementSequence ( elsIfPart )* ( elsePart )? 'END' ;
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_stack.push(new ifStatement_scope());
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal35=null;
        Token string_literal37=null;
        Token string_literal41=null;
        Oberon0Parser.expression_return expression36 = null;

        Oberon0Parser.statementSequence_return statementSequence38 = null;

        Oberon0Parser.elsIfPart_return elsIfPart39 = null;

        Oberon0Parser.elsePart_return elsePart40 = null;


        CommonTree string_literal35_tree=null;
        CommonTree string_literal37_tree=null;
        CommonTree string_literal41_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:241:2: ( 'IF' expression 'THEN' statementSequence ( elsIfPart )* ( elsePart )? 'END' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:241:4: 'IF' expression 'THEN' statementSequence ( elsIfPart )* ( elsePart )? 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal35=(Token)match(input,34,FOLLOW_34_in_ifStatement563); 
            string_literal35_tree = (CommonTree)adaptor.create(string_literal35);
            adaptor.addChild(root_0, string_literal35_tree);

            pushFollow(FOLLOW_expression_in_ifStatement565);
            expression36=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression36.getTree());
            string_literal37=(Token)match(input,32,FOLLOW_32_in_ifStatement567); 
            string_literal37_tree = (CommonTree)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            pushFollow(FOLLOW_statementSequence_in_ifStatement569);
            statementSequence38=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence38.getTree());

            	((ifStatement_scope)ifStatement_stack.peek()).root = new IfStatementNode((expression36!=null?expression36.node:null), (statementSequence38!=null?statementSequence38.return_statements:null) );
            	
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:245:2: ( elsIfPart )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:245:2: elsIfPart
            	    {
            	    pushFollow(FOLLOW_elsIfPart_in_ifStatement575);
            	    elsIfPart39=elsIfPart();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elsIfPart39.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:246:2: ( elsePart )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:246:2: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifStatement579);
                    elsePart40=elsePart();

                    state._fsp--;

                    adaptor.addChild(root_0, elsePart40.getTree());

                    }
                    break;

            }

            string_literal41=(Token)match(input,35,FOLLOW_35_in_ifStatement583); 
            string_literal41_tree = (CommonTree)adaptor.create(string_literal41);
            adaptor.addChild(root_0, string_literal41_tree);

            retval.node = ((ifStatement_scope)ifStatement_stack.peek()).root;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            ifStatement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class withDoStatement_return extends ParserRuleReturnScope {
        public WithDoNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withDoStatement"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:251:1: withDoStatement returns [WithDoNode node] : 'WITH' identSelector 'DO' statementSequence 'END' ;
    public final Oberon0Parser.withDoStatement_return withDoStatement() throws RecognitionException {
        Oberon0Parser.withDoStatement_return retval = new Oberon0Parser.withDoStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Oberon0Parser.identSelector_return identSelector43 = null;

        Oberon0Parser.statementSequence_return statementSequence45 = null;


        CommonTree string_literal42_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:252:3: ( 'WITH' identSelector 'DO' statementSequence 'END' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:252:5: 'WITH' identSelector 'DO' statementSequence 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal42=(Token)match(input,36,FOLLOW_36_in_withDoStatement601); 
            string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
            adaptor.addChild(root_0, string_literal42_tree);

            pushFollow(FOLLOW_identSelector_in_withDoStatement603);
            identSelector43=identSelector();

            state._fsp--;

            adaptor.addChild(root_0, identSelector43.getTree());
            string_literal44=(Token)match(input,37,FOLLOW_37_in_withDoStatement605); 
            string_literal44_tree = (CommonTree)adaptor.create(string_literal44);
            adaptor.addChild(root_0, string_literal44_tree);

            pushFollow(FOLLOW_statementSequence_in_withDoStatement607);
            statementSequence45=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence45.getTree());
            string_literal46=(Token)match(input,35,FOLLOW_35_in_withDoStatement609); 
            string_literal46_tree = (CommonTree)adaptor.create(string_literal46);
            adaptor.addChild(root_0, string_literal46_tree);

             retval.node = new WithDoNode((identSelector43!=null?identSelector43.node:null), (statementSequence45!=null?statementSequence45.return_statements:null)); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "withDoStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        public WhileLoopNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:256:1: whileStatement returns [WhileLoopNode node] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Oberon0Parser.expression_return expression48 = null;

        Oberon0Parser.statementSequence_return statementSequence50 = null;


        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:257:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:257:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal47=(Token)match(input,38,FOLLOW_38_in_whileStatement629); 
            string_literal47_tree = (CommonTree)adaptor.create(string_literal47);
            adaptor.addChild(root_0, string_literal47_tree);

            pushFollow(FOLLOW_expression_in_whileStatement631);
            expression48=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression48.getTree());
            string_literal49=(Token)match(input,37,FOLLOW_37_in_whileStatement633); 
            string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);

            pushFollow(FOLLOW_statementSequence_in_whileStatement635);
            statementSequence50=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence50.getTree());
            string_literal51=(Token)match(input,35,FOLLOW_35_in_whileStatement637); 
            string_literal51_tree = (CommonTree)adaptor.create(string_literal51);
            adaptor.addChild(root_0, string_literal51_tree);

             retval.node = new WhileLoopNode((expression48!=null?expression48.node:null), (statementSequence50!=null?statementSequence50.return_statements:null)); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class statement_return extends ParserRuleReturnScope {
        public StatementNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:261:1: statement returns [StatementNode node] : ( assignment | procedureCall | ifStatement | whileStatement | withDoStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment52 = null;

        Oberon0Parser.procedureCall_return procedureCall53 = null;

        Oberon0Parser.ifStatement_return ifStatement54 = null;

        Oberon0Parser.whileStatement_return whileStatement55 = null;

        Oberon0Parser.withDoStatement_return withDoStatement56 = null;



        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:262:2: ( ( assignment | procedureCall | ifStatement | whileStatement | withDoStatement )? )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:262:4: ( assignment | procedureCall | ifStatement | whileStatement | withDoStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:262:4: ( assignment | procedureCall | ifStatement | whileStatement | withDoStatement )?
            int alt15=6;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=10 && LA15_1<=11)||LA15_1==29) ) {
                        alt15=1;
                    }
                    else if ( (LA15_1==13||LA15_1==31||LA15_1==33||LA15_1==35||LA15_1==39) ) {
                        alt15=2;
                    }
                    }
                    break;
                case 34:
                    {
                    alt15=3;
                    }
                    break;
                case 38:
                    {
                    alt15=4;
                    }
                    break;
                case 36:
                    {
                    alt15=5;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:263:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement660);
                    assignment52=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment52.getTree());
                    retval.node =(assignment52!=null?assignment52.node:null);

                    }
                    break;
                case 2 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:264:4: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement667);
                    procedureCall53=procedureCall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedureCall53.getTree());
                    retval.node =(procedureCall53!=null?procedureCall53.node:null);

                    }
                    break;
                case 3 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:265:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement674);
                    ifStatement54=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement54.getTree());
                    retval.node =(ifStatement54!=null?ifStatement54.node:null);

                    }
                    break;
                case 4 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:266:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement681);
                    whileStatement55=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement55.getTree());
                    retval.node =(whileStatement55!=null?whileStatement55.node:null);

                    }
                    break;
                case 5 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:267:4: withDoStatement
                    {
                    pushFollow(FOLLOW_withDoStatement_in_statement688);
                    withDoStatement56=withDoStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, withDoStatement56.getTree());
                    retval.node =(withDoStatement56!=null?withDoStatement56.node:null);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequenceFollowUp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequenceFollowUp"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:271:1: statementSequenceFollowUp : ';' statement ;
    public final Oberon0Parser.statementSequenceFollowUp_return statementSequenceFollowUp() throws RecognitionException {
        Oberon0Parser.statementSequenceFollowUp_return retval = new Oberon0Parser.statementSequenceFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal57=null;
        Oberon0Parser.statement_return statement58 = null;


        CommonTree char_literal57_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:272:2: ( ';' statement )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:272:4: ';' statement
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal57=(Token)match(input,39,FOLLOW_39_in_statementSequenceFollowUp706); 
            char_literal57_tree = (CommonTree)adaptor.create(char_literal57);
            adaptor.addChild(root_0, char_literal57_tree);

            pushFollow(FOLLOW_statement_in_statementSequenceFollowUp708);
            statement58=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement58.getTree());

            		((statementSequence_scope)statementSequence_stack.peek()).statements.add((statement58!=null?statement58.node:null));
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementSequenceFollowUp"

    protected static class statementSequence_scope {
        List<StatementNode> statements;
    }
    protected Stack statementSequence_stack = new Stack();

    public static class statementSequence_return extends ParserRuleReturnScope {
        public List<StatementNode> return_statements;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:278:1: statementSequence returns [List<StatementNode> return_statements] : statement ( statementSequenceFollowUp )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        statementSequence_stack.push(new statementSequence_scope());
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.statement_return statement59 = null;

        Oberon0Parser.statementSequenceFollowUp_return statementSequenceFollowUp60 = null;




        	((statementSequence_scope)statementSequence_stack.peek()).statements = new LinkedList<StatementNode>();

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:285:2: ( statement ( statementSequenceFollowUp )* )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:286:2: statement ( statementSequenceFollowUp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence736);
            statement59=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement59.getTree());
            ((statementSequence_scope)statementSequence_stack.peek()).statements.add((statement59!=null?statement59.node:null)); 
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:287:2: ( statementSequenceFollowUp )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:287:2: statementSequenceFollowUp
            	    {
            	    pushFollow(FOLLOW_statementSequenceFollowUp_in_statementSequence741);
            	    statementSequenceFollowUp60=statementSequenceFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementSequenceFollowUp60.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            retval.return_statements = ((statementSequence_scope)statementSequence_stack.peek()).statements;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            statementSequence_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        public List<String> idents;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:291:1: identList returns [List<String> idents] : ids+= IDENT ( ',' ids+= IDENT )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal61=null;
        Token ids=null;
        List list_ids=null;

        CommonTree char_literal61_tree=null;
        CommonTree ids_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:292:2: (ids+= IDENT ( ',' ids+= IDENT )* )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:292:4: ids+= IDENT ( ',' ids+= IDENT )*
            {
            root_0 = (CommonTree)adaptor.nil();

            ids=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList763); 
            ids_tree = (CommonTree)adaptor.create(ids);
            adaptor.addChild(root_0, ids_tree);

            if (list_ids==null) list_ids=new ArrayList();
            list_ids.add(ids);

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:292:15: ( ',' ids+= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:292:16: ',' ids+= IDENT
            	    {
            	    char_literal61=(Token)match(input,30,FOLLOW_30_in_identList766); 
            	    char_literal61_tree = (CommonTree)adaptor.create(char_literal61);
            	    adaptor.addChild(root_0, char_literal61_tree);

            	    ids=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList770); 
            	    ids_tree = (CommonTree)adaptor.create(ids);
            	    adaptor.addChild(root_0, ids_tree);

            	    if (list_ids==null) list_ids=new ArrayList();
            	    list_ids.add(ids);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            retval.idents =list_ids;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        public ArrayTypeNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:296:1: arrayType returns [ArrayTypeNode node] : 'ARRAY' expression 'OF' type ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal62=null;
        Token string_literal64=null;
        Oberon0Parser.expression_return expression63 = null;

        Oberon0Parser.type_return type65 = null;


        CommonTree string_literal62_tree=null;
        CommonTree string_literal64_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:297:2: ( 'ARRAY' expression 'OF' type )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:297:4: 'ARRAY' expression 'OF' type
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal62=(Token)match(input,40,FOLLOW_40_in_arrayType792); 
            string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);

            pushFollow(FOLLOW_expression_in_arrayType794);
            expression63=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression63.getTree());
            string_literal64=(Token)match(input,41,FOLLOW_41_in_arrayType796); 
            string_literal64_tree = (CommonTree)adaptor.create(string_literal64);
            adaptor.addChild(root_0, string_literal64_tree);

            pushFollow(FOLLOW_type_in_arrayType798);
            type65=type();

            state._fsp--;

            adaptor.addChild(root_0, type65.getTree());
             retval.node = new ArrayTypeNode((expression63!=null?expression63.node:null),(type65!=null?type65.node:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    protected static class fieldList_scope {
        List<FieldNode> fields;
    }
    protected Stack fieldList_stack = new Stack();

    public static class fieldList_return extends ParserRuleReturnScope {
        public List<FieldNode> return_fieldlist;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:301:1: fieldList returns [List<FieldNode> return_fieldlist] : ( identList ':' type )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        fieldList_stack.push(new fieldList_scope());
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal67=null;
        Oberon0Parser.identList_return identList66 = null;

        Oberon0Parser.type_return type68 = null;


        CommonTree char_literal67_tree=null;


        	((fieldList_scope)fieldList_stack.peek()).fields = new LinkedList<FieldNode>();

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:308:2: ( ( identList ':' type )? )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:308:4: ( identList ':' type )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:308:4: ( identList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:308:5: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList824);
                    identList66=identList();

                    state._fsp--;

                    adaptor.addChild(root_0, identList66.getTree());
                    char_literal67=(Token)match(input,42,FOLLOW_42_in_fieldList826); 
                    char_literal67_tree = (CommonTree)adaptor.create(char_literal67);
                    adaptor.addChild(root_0, char_literal67_tree);

                    pushFollow(FOLLOW_type_in_fieldList828);
                    type68=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type68.getTree());

                    }
                    break;

            }


            			for (Object token : (identList66!=null?identList66.idents:null))
            			{
            				((fieldList_scope)fieldList_stack.peek()).fields.add(new FieldNode( ((CommonToken) token).getText(), (type68!=null?type68.node:null)));
            			}
            			retval.return_fieldlist = ((fieldList_scope)fieldList_stack.peek()).fields; 
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            fieldList_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordTypeFollowUp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordTypeFollowUp"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:318:1: recordTypeFollowUp : ';' fieldList ;
    public final Oberon0Parser.recordTypeFollowUp_return recordTypeFollowUp() throws RecognitionException {
        Oberon0Parser.recordTypeFollowUp_return retval = new Oberon0Parser.recordTypeFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal69=null;
        Oberon0Parser.fieldList_return fieldList70 = null;


        CommonTree char_literal69_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:319:2: ( ';' fieldList )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:319:4: ';' fieldList
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal69=(Token)match(input,39,FOLLOW_39_in_recordTypeFollowUp844); 
            char_literal69_tree = (CommonTree)adaptor.create(char_literal69);
            adaptor.addChild(root_0, char_literal69_tree);

            pushFollow(FOLLOW_fieldList_in_recordTypeFollowUp846);
            fieldList70=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList70.getTree());
             ((recordType_scope)recordType_stack.peek()).fields.addAll((fieldList70!=null?fieldList70.return_fieldlist:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordTypeFollowUp"

    protected static class recordType_scope {
        List<FieldNode> fields;
    }
    protected Stack recordType_stack = new Stack();

    public static class recordType_return extends ParserRuleReturnScope {
        public RecordTypeNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:323:1: recordType returns [RecordTypeNode node] : 'RECORD' fieldList ( recordTypeFollowUp )* 'END' ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        recordType_stack.push(new recordType_scope());
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal71=null;
        Token string_literal74=null;
        Oberon0Parser.fieldList_return fieldList72 = null;

        Oberon0Parser.recordTypeFollowUp_return recordTypeFollowUp73 = null;


        CommonTree string_literal71_tree=null;
        CommonTree string_literal74_tree=null;


        	((recordType_scope)recordType_stack.peek()).fields = new LinkedList<FieldNode>();	

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:330:2: ( 'RECORD' fieldList ( recordTypeFollowUp )* 'END' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:331:2: 'RECORD' fieldList ( recordTypeFollowUp )* 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal71=(Token)match(input,43,FOLLOW_43_in_recordType872); 
            string_literal71_tree = (CommonTree)adaptor.create(string_literal71);
            adaptor.addChild(root_0, string_literal71_tree);

            pushFollow(FOLLOW_fieldList_in_recordType875);
            fieldList72=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList72.getTree());

            	   ((recordType_scope)recordType_stack.peek()).fields.addAll((fieldList72!=null?fieldList72.return_fieldlist:null));
            	
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:336:2: ( recordTypeFollowUp )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==39) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:336:2: recordTypeFollowUp
            	    {
            	    pushFollow(FOLLOW_recordTypeFollowUp_in_recordType882);
            	    recordTypeFollowUp73=recordTypeFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, recordTypeFollowUp73.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            string_literal74=(Token)match(input,35,FOLLOW_35_in_recordType886); 
            string_literal74_tree = (CommonTree)adaptor.create(string_literal74);
            adaptor.addChild(root_0, string_literal74_tree);

            retval.node = new RecordTypeNode(((recordType_scope)recordType_stack.peek()).fields);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            recordType_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        public TypeNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:341:1: type returns [TypeNode node] : ( IDENT | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT75=null;
        Oberon0Parser.arrayType_return arrayType76 = null;

        Oberon0Parser.recordType_return recordType77 = null;


        CommonTree IDENT75_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:342:2: ( IDENT | arrayType | recordType )
            int alt20=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt20=1;
                }
                break;
            case 40:
                {
                alt20=2;
                }
                break;
            case 43:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:342:4: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT75=(Token)match(input,IDENT,FOLLOW_IDENT_in_type903); 
                    IDENT75_tree = (CommonTree)adaptor.create(IDENT75);
                    adaptor.addChild(root_0, IDENT75_tree);

                     retval.node = new IdentifierTypeNode((IDENT75!=null?IDENT75.getText():null));

                    }
                    break;
                case 2 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:343:4: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type911);
                    arrayType76=arrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayType76.getTree());
                     retval.node = (arrayType76!=null?arrayType76.node:null);

                    }
                    break;
                case 3 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:344:4: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type919);
                    recordType77=recordType();

                    state._fsp--;

                    adaptor.addChild(root_0, recordType77.getTree());
                     retval.node = (recordType77!=null?recordType77.node:null);

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class fpSection_return extends ParserRuleReturnScope {
        public AbstractParameterNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:347:1: fpSection returns [AbstractParameterNode node] : (var= 'VAR' )? fieldList ;
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token var=null;
        Oberon0Parser.fieldList_return fieldList78 = null;


        CommonTree var_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:348:2: ( (var= 'VAR' )? fieldList )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:348:4: (var= 'VAR' )? fieldList
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:348:4: (var= 'VAR' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:348:5: var= 'VAR'
                    {
                    var=(Token)match(input,44,FOLLOW_44_in_fpSection939); 
                    var_tree = (CommonTree)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_fieldList_in_fpSection943);
            fieldList78=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList78.getTree());
             
            			if (var!=null){
            				retval.node = new CallByRefParameterNode((fieldList78!=null?fieldList78.return_fieldlist:null));
            			} else{
            				retval.node = new CallByValParameterNode((fieldList78!=null?fieldList78.return_fieldlist:null));
            			}
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "fpSection"

    public static class formalParametersFollowUp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParametersFollowUp"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:358:1: formalParametersFollowUp : ';' fpSection ;
    public final Oberon0Parser.formalParametersFollowUp_return formalParametersFollowUp() throws RecognitionException {
        Oberon0Parser.formalParametersFollowUp_return retval = new Oberon0Parser.formalParametersFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal79=null;
        Oberon0Parser.fpSection_return fpSection80 = null;


        CommonTree char_literal79_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:359:2: ( ';' fpSection )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:359:4: ';' fpSection
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal79=(Token)match(input,39,FOLLOW_39_in_formalParametersFollowUp958); 
            char_literal79_tree = (CommonTree)adaptor.create(char_literal79);
            adaptor.addChild(root_0, char_literal79_tree);

            pushFollow(FOLLOW_fpSection_in_formalParametersFollowUp960);
            fpSection80=fpSection();

            state._fsp--;

            adaptor.addChild(root_0, fpSection80.getTree());
             ((formalParameters_scope)formalParameters_stack.peek()).fields.add((fpSection80!=null?fpSection80.node:null));

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParametersFollowUp"

    protected static class formalParameters_scope {
        List<AbstractParameterNode> fields;
    }
    protected Stack formalParameters_stack = new Stack();

    public static class formalParameters_return extends ParserRuleReturnScope {
        public List<AbstractParameterNode> formalParams;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:363:1: formalParameters returns [List<AbstractParameterNode> formalParams] : '(' fpSection ( formalParametersFollowUp )* ')' ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        formalParameters_stack.push(new formalParameters_scope());
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal81=null;
        Token char_literal84=null;
        Oberon0Parser.fpSection_return fpSection82 = null;

        Oberon0Parser.formalParametersFollowUp_return formalParametersFollowUp83 = null;


        CommonTree char_literal81_tree=null;
        CommonTree char_literal84_tree=null;


        	((formalParameters_scope)formalParameters_stack.peek()).fields = new LinkedList<AbstractParameterNode>();	

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:370:2: ( '(' fpSection ( formalParametersFollowUp )* ')' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:371:2: '(' fpSection ( formalParametersFollowUp )* ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal81=(Token)match(input,13,FOLLOW_13_in_formalParameters985); 
            char_literal81_tree = (CommonTree)adaptor.create(char_literal81);
            adaptor.addChild(root_0, char_literal81_tree);

            pushFollow(FOLLOW_fpSection_in_formalParameters989);
            fpSection82=fpSection();

            state._fsp--;

            adaptor.addChild(root_0, fpSection82.getTree());
             ((formalParameters_scope)formalParameters_stack.peek()).fields.add((fpSection82!=null?fpSection82.node:null));
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:373:2: ( formalParametersFollowUp )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:373:2: formalParametersFollowUp
            	    {
            	    pushFollow(FOLLOW_formalParametersFollowUp_in_formalParameters994);
            	    formalParametersFollowUp83=formalParametersFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, formalParametersFollowUp83.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            char_literal84=(Token)match(input,14,FOLLOW_14_in_formalParameters999); 
            char_literal84_tree = (CommonTree)adaptor.create(char_literal84);
            adaptor.addChild(root_0, char_literal84_tree);

             retval.formalParams = ((formalParameters_scope)formalParameters_stack.peek()).fields;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            formalParameters_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class procedureBody_return extends ParserRuleReturnScope {
        public List<ConstantNode> return_constants;
        public List<FieldNode> return_types;
        public List<FieldNode> return_variables;
        public List<ProcedureNode> return_procs;
        public List<StatementNode> return_stats;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:378:1: procedureBody returns [List<ConstantNode> return_constants, List<FieldNode> return_types, \n List<FieldNode> return_variables, List<ProcedureNode> return_procs,\n\t\t\t\t\t\t\t\t\t\t List<StatementNode> return_stats] : declarations ( 'BEGIN' statementSequence )? 'END' ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal86=null;
        Token string_literal88=null;
        Oberon0Parser.declarations_return declarations85 = null;

        Oberon0Parser.statementSequence_return statementSequence87 = null;


        CommonTree string_literal86_tree=null;
        CommonTree string_literal88_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:381:2: ( declarations ( 'BEGIN' statementSequence )? 'END' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:381:4: declarations ( 'BEGIN' statementSequence )? 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedureBody1017);
            declarations85=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations85.getTree());
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:381:17: ( 'BEGIN' statementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:381:18: 'BEGIN' statementSequence
                    {
                    string_literal86=(Token)match(input,45,FOLLOW_45_in_procedureBody1020); 
                    string_literal86_tree = (CommonTree)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody1022);
                    statementSequence87=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence87.getTree());

                    }
                    break;

            }

            string_literal88=(Token)match(input,35,FOLLOW_35_in_procedureBody1026); 
            string_literal88_tree = (CommonTree)adaptor.create(string_literal88);
            adaptor.addChild(root_0, string_literal88_tree);


            		retval.return_constants = (declarations85!=null?declarations85.return_constants:null);
            		retval.return_types = (declarations85!=null?declarations85.return_types:null);
            		retval.return_variables = (declarations85!=null?declarations85.return_variables:null);
            		retval.return_procs = (declarations85!=null?declarations85.return_procs:null);
            		if (statementSequence_stack!=null) {
            			if ((statementSequence87!=null?statementSequence87.return_statements:null)!=null) {
            				retval.return_stats = (statementSequence87!=null?statementSequence87.return_statements:null);
            			} else {
            				retval.return_stats = new LinkedList<StatementNode>();
            			}
            		} else { 
            			retval.return_stats = new LinkedList<StatementNode>();
            		}
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:399:1: procedureDeclaration : 'PROCEDURE' start= IDENT ( formalParameters )? ';' procedureBody end= IDENT ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token end=null;
        Token string_literal89=null;
        Token char_literal91=null;
        Oberon0Parser.formalParameters_return formalParameters90 = null;

        Oberon0Parser.procedureBody_return procedureBody92 = null;


        CommonTree start_tree=null;
        CommonTree end_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree char_literal91_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:400:2: ( 'PROCEDURE' start= IDENT ( formalParameters )? ';' procedureBody end= IDENT )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:400:4: 'PROCEDURE' start= IDENT ( formalParameters )? ';' procedureBody end= IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal89=(Token)match(input,46,FOLLOW_46_in_procedureDeclaration1041); 
            string_literal89_tree = (CommonTree)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);

            start=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1045); 
            start_tree = (CommonTree)adaptor.create(start);
            adaptor.addChild(root_0, start_tree);

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:400:28: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:400:28: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1047);
                    formalParameters90=formalParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, formalParameters90.getTree());

                    }
                    break;

            }

            char_literal91=(Token)match(input,39,FOLLOW_39_in_procedureDeclaration1050); 
            char_literal91_tree = (CommonTree)adaptor.create(char_literal91);
            adaptor.addChild(root_0, char_literal91_tree);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1052);
            procedureBody92=procedureBody();

            state._fsp--;

            adaptor.addChild(root_0, procedureBody92.getTree());
            end=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1056); 
            end_tree = (CommonTree)adaptor.create(end);
            adaptor.addChild(root_0, end_tree);


            	if ((formalParameters90!=null?formalParameters90.formalParams:null)!=null){
            	((declarations_scope)declarations_stack.peek()).procedures.add(new ProcedureNode((start!=null?start.getText():null), (end!=null?end.getText():null),
            				(formalParameters90!=null?formalParameters90.formalParams:null), (procedureBody92!=null?procedureBody92.return_constants:null), 
            				(procedureBody92!=null?procedureBody92.return_types:null), (procedureBody92!=null?procedureBody92.return_variables:null), 
            				(procedureBody92!=null?procedureBody92.return_procs:null), (procedureBody92!=null?procedureBody92.return_stats:null)));
            	} else {
            	((declarations_scope)declarations_stack.peek()).procedures.add(new ProcedureNode((start!=null?start.getText():null), (end!=null?end.getText():null),
            				(procedureBody92!=null?procedureBody92.return_constants:null), (procedureBody92!=null?procedureBody92.return_types:null),
            				(procedureBody92!=null?procedureBody92.return_variables:null), (procedureBody92!=null?procedureBody92.return_procs:null), 
            				(procedureBody92!=null?procedureBody92.return_stats:null)));
            	}
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class constDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constDecl"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:416:1: constDecl : ( IDENT '=' expression ';' ) ;
    public final Oberon0Parser.constDecl_return constDecl() throws RecognitionException {
        Oberon0Parser.constDecl_return retval = new Oberon0Parser.constDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT93=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Oberon0Parser.expression_return expression95 = null;


        CommonTree IDENT93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal96_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:417:2: ( ( IDENT '=' expression ';' ) )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:417:4: ( IDENT '=' expression ';' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:417:4: ( IDENT '=' expression ';' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:417:5: IDENT '=' expression ';'
            {
            IDENT93=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDecl1071); 
            IDENT93_tree = (CommonTree)adaptor.create(IDENT93);
            adaptor.addChild(root_0, IDENT93_tree);

            char_literal94=(Token)match(input,23,FOLLOW_23_in_constDecl1073); 
            char_literal94_tree = (CommonTree)adaptor.create(char_literal94);
            adaptor.addChild(root_0, char_literal94_tree);

            pushFollow(FOLLOW_expression_in_constDecl1075);
            expression95=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression95.getTree());
            char_literal96=(Token)match(input,39,FOLLOW_39_in_constDecl1077); 
            char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
            adaptor.addChild(root_0, char_literal96_tree);


            }


            			((declarations_scope)declarations_stack.peek()).constants.add(new ConstantNode((IDENT93!=null?IDENT93.getText():null) , (expression95!=null?expression95.node:null)));
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "constDecl"

    public static class typeDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDecl"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:423:1: typeDecl : ( IDENT '=' type ';' ) ;
    public final Oberon0Parser.typeDecl_return typeDecl() throws RecognitionException {
        Oberon0Parser.typeDecl_return retval = new Oberon0Parser.typeDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT97=null;
        Token char_literal98=null;
        Token char_literal100=null;
        Oberon0Parser.type_return type99 = null;


        CommonTree IDENT97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal100_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:424:2: ( ( IDENT '=' type ';' ) )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:424:4: ( IDENT '=' type ';' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:424:4: ( IDENT '=' type ';' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:424:6: IDENT '=' type ';'
            {
            IDENT97=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDecl1096); 
            IDENT97_tree = (CommonTree)adaptor.create(IDENT97);
            adaptor.addChild(root_0, IDENT97_tree);

            char_literal98=(Token)match(input,23,FOLLOW_23_in_typeDecl1098); 
            char_literal98_tree = (CommonTree)adaptor.create(char_literal98);
            adaptor.addChild(root_0, char_literal98_tree);

            pushFollow(FOLLOW_type_in_typeDecl1100);
            type99=type();

            state._fsp--;

            adaptor.addChild(root_0, type99.getTree());
            char_literal100=(Token)match(input,39,FOLLOW_39_in_typeDecl1102); 
            char_literal100_tree = (CommonTree)adaptor.create(char_literal100);
            adaptor.addChild(root_0, char_literal100_tree);


            }


            			((declarations_scope)declarations_stack.peek()).types.add(new FieldNode((IDENT97!=null?IDENT97.getText():null) , (type99!=null?type99.node:null)));
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeDecl"

    public static class varDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:430:1: varDecl : ( identList ':' type ';' ) ;
    public final Oberon0Parser.varDecl_return varDecl() throws RecognitionException {
        Oberon0Parser.varDecl_return retval = new Oberon0Parser.varDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal102=null;
        Token char_literal104=null;
        Oberon0Parser.identList_return identList101 = null;

        Oberon0Parser.type_return type103 = null;


        CommonTree char_literal102_tree=null;
        CommonTree char_literal104_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:431:2: ( ( identList ':' type ';' ) )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:431:4: ( identList ':' type ';' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:431:4: ( identList ':' type ';' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:431:5: identList ':' type ';'
            {
            pushFollow(FOLLOW_identList_in_varDecl1120);
            identList101=identList();

            state._fsp--;

            adaptor.addChild(root_0, identList101.getTree());
            char_literal102=(Token)match(input,42,FOLLOW_42_in_varDecl1122); 
            char_literal102_tree = (CommonTree)adaptor.create(char_literal102);
            adaptor.addChild(root_0, char_literal102_tree);

            pushFollow(FOLLOW_type_in_varDecl1124);
            type103=type();

            state._fsp--;

            adaptor.addChild(root_0, type103.getTree());
            char_literal104=(Token)match(input,39,FOLLOW_39_in_varDecl1126); 
            char_literal104_tree = (CommonTree)adaptor.create(char_literal104);
            adaptor.addChild(root_0, char_literal104_tree);


            }


            			for (Object token : (identList101!=null?identList101.idents:null)){
            				((declarations_scope)declarations_stack.peek()).variables.add( new FieldNode(((CommonToken) token).getText(), (type103!=null?type103.node:null)));
            			}
            		

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class constsDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constsDecl"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:439:1: constsDecl : 'CONST' ( constDecl )* ;
    public final Oberon0Parser.constsDecl_return constsDecl() throws RecognitionException {
        Oberon0Parser.constsDecl_return retval = new Oberon0Parser.constsDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal105=null;
        Oberon0Parser.constDecl_return constDecl106 = null;


        CommonTree string_literal105_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:440:2: ( 'CONST' ( constDecl )* )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:440:4: 'CONST' ( constDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal105=(Token)match(input,47,FOLLOW_47_in_constsDecl1143); 
            string_literal105_tree = (CommonTree)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:440:12: ( constDecl )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:440:12: constDecl
            	    {
            	    pushFollow(FOLLOW_constDecl_in_constsDecl1145);
            	    constDecl106=constDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, constDecl106.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "constsDecl"

    public static class typesDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typesDecl"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:443:1: typesDecl : 'TYPE' ( typeDecl )* ;
    public final Oberon0Parser.typesDecl_return typesDecl() throws RecognitionException {
        Oberon0Parser.typesDecl_return retval = new Oberon0Parser.typesDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal107=null;
        Oberon0Parser.typeDecl_return typeDecl108 = null;


        CommonTree string_literal107_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:444:2: ( 'TYPE' ( typeDecl )* )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:444:4: 'TYPE' ( typeDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal107=(Token)match(input,48,FOLLOW_48_in_typesDecl1159); 
            string_literal107_tree = (CommonTree)adaptor.create(string_literal107);
            adaptor.addChild(root_0, string_literal107_tree);

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:444:11: ( typeDecl )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:444:11: typeDecl
            	    {
            	    pushFollow(FOLLOW_typeDecl_in_typesDecl1161);
            	    typeDecl108=typeDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeDecl108.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "typesDecl"

    public static class varsDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varsDecl"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:446:1: varsDecl : 'VAR' ( varDecl )* ;
    public final Oberon0Parser.varsDecl_return varsDecl() throws RecognitionException {
        Oberon0Parser.varsDecl_return retval = new Oberon0Parser.varsDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal109=null;
        Oberon0Parser.varDecl_return varDecl110 = null;


        CommonTree string_literal109_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:447:2: ( 'VAR' ( varDecl )* )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:447:4: 'VAR' ( varDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal109=(Token)match(input,44,FOLLOW_44_in_varsDecl1172); 
            string_literal109_tree = (CommonTree)adaptor.create(string_literal109);
            adaptor.addChild(root_0, string_literal109_tree);

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:447:10: ( varDecl )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:447:10: varDecl
            	    {
            	    pushFollow(FOLLOW_varDecl_in_varsDecl1174);
            	    varDecl110=varDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, varDecl110.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
        }
        return retval;
    }
    // $ANTLR end "varsDecl"

    protected static class declarations_scope {
        List<ConstantNode> constants;
        List<FieldNode> types;
        List<FieldNode> variables;
        List<ProcedureNode> procedures;
    }
    protected Stack declarations_stack = new Stack();

    public static class declarations_return extends ParserRuleReturnScope {
        public List<ConstantNode> return_constants;
        public List<FieldNode> return_types;
        public List<FieldNode> return_variables;
        public List<ProcedureNode> return_procs;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:450:1: declarations returns [List<ConstantNode> return_constants, List<FieldNode> return_types, \n\t\t\t\t\t\t\t\t\t\t List<FieldNode> return_variables, List<ProcedureNode> return_procs] : ( constsDecl )? ( typesDecl )? ( varsDecl )? ( procedureDeclaration ';' )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        declarations_stack.push(new declarations_scope());
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal115=null;
        Oberon0Parser.constsDecl_return constsDecl111 = null;

        Oberon0Parser.typesDecl_return typesDecl112 = null;

        Oberon0Parser.varsDecl_return varsDecl113 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration114 = null;


        CommonTree char_literal115_tree=null;


        					((declarations_scope)declarations_stack.peek()).constants = new LinkedList<ConstantNode>() ;
        					((declarations_scope)declarations_stack.peek()).types = new LinkedList<FieldNode>();
        					((declarations_scope)declarations_stack.peek()).variables = new LinkedList<FieldNode>();
        					((declarations_scope)declarations_stack.peek()).procedures = new LinkedList<ProcedureNode>();

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:2: ( ( constsDecl )? ( typesDecl )? ( varsDecl )? ( procedureDeclaration ';' )* )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:4: ( constsDecl )? ( typesDecl )? ( varsDecl )? ( procedureDeclaration ';' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:4: ( constsDecl )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:4: constsDecl
                    {
                    pushFollow(FOLLOW_constsDecl_in_declarations1198);
                    constsDecl111=constsDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, constsDecl111.getTree());

                    }
                    break;

            }

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:16: ( typesDecl )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:16: typesDecl
                    {
                    pushFollow(FOLLOW_typesDecl_in_declarations1201);
                    typesDecl112=typesDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, typesDecl112.getTree());

                    }
                    break;

            }

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:27: ( varsDecl )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:27: varsDecl
                    {
                    pushFollow(FOLLOW_varsDecl_in_declarations1204);
                    varsDecl113=varsDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, varsDecl113.getTree());

                    }
                    break;

            }

            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:37: ( procedureDeclaration ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:465:38: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1208);
            	    procedureDeclaration114=procedureDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedureDeclaration114.getTree());
            	    char_literal115=(Token)match(input,39,FOLLOW_39_in_declarations1210); 
            	    char_literal115_tree = (CommonTree)adaptor.create(char_literal115);
            	    adaptor.addChild(root_0, char_literal115_tree);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            		// Assign values to the output
            		retval.return_constants = ((declarations_scope)declarations_stack.peek()).constants;
            		retval.return_types = ((declarations_scope)declarations_stack.peek()).types;
            		retval.return_variables = ((declarations_scope)declarations_stack.peek()).variables;
            		retval.return_procs = ((declarations_scope)declarations_stack.peek()).procedures;
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            declarations_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "declarations"

    protected static class module_scope {
        ModuleNode moduleNode;
        List<StatementNode> statementsSeq;
    }
    protected Stack module_stack = new Stack();

    public static class module_return extends ParserRuleReturnScope {
        public ModuleNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:475:1: module returns [ModuleNode node] : 'MODULE' start= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' end= IDENT '.' ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        module_stack.push(new module_scope());
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token end=null;
        Token string_literal116=null;
        Token char_literal117=null;
        Token string_literal119=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Oberon0Parser.declarations_return declarations118 = null;

        Oberon0Parser.statementSequence_return statementSequence120 = null;


        CommonTree start_tree=null;
        CommonTree end_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree string_literal121_tree=null;
        CommonTree char_literal122_tree=null;

        try {
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:480:2: ( 'MODULE' start= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' end= IDENT '.' )
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:480:4: 'MODULE' start= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' end= IDENT '.'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal116=(Token)match(input,49,FOLLOW_49_in_module1234); 
            string_literal116_tree = (CommonTree)adaptor.create(string_literal116);
            adaptor.addChild(root_0, string_literal116_tree);

            start=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1238); 
            start_tree = (CommonTree)adaptor.create(start);
            adaptor.addChild(root_0, start_tree);

            char_literal117=(Token)match(input,39,FOLLOW_39_in_module1240); 
            char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
            adaptor.addChild(root_0, char_literal117_tree);

            pushFollow(FOLLOW_declarations_in_module1242);
            declarations118=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations118.getTree());
            // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:480:42: ( 'BEGIN' statementSequence )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // E:\\school\\construction\\labassignment2\\6354122\\antlr-grammer\\Oberon0.g:480:43: 'BEGIN' statementSequence
                    {
                    string_literal119=(Token)match(input,45,FOLLOW_45_in_module1245); 
                    string_literal119_tree = (CommonTree)adaptor.create(string_literal119);
                    adaptor.addChild(root_0, string_literal119_tree);

                    pushFollow(FOLLOW_statementSequence_in_module1247);
                    statementSequence120=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence120.getTree());

                    }
                    break;

            }

            string_literal121=(Token)match(input,35,FOLLOW_35_in_module1251); 
            string_literal121_tree = (CommonTree)adaptor.create(string_literal121);
            adaptor.addChild(root_0, string_literal121_tree);

            end=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1255); 
            end_tree = (CommonTree)adaptor.create(end);
            adaptor.addChild(root_0, end_tree);

            char_literal122=(Token)match(input,10,FOLLOW_10_in_module1257); 
            char_literal122_tree = (CommonTree)adaptor.create(char_literal122);
            adaptor.addChild(root_0, char_literal122_tree);


            		// Create an empty statement sequence list if there is no statement sequence list
            		if (statementSequence_stack!=null){
            				if ((statementSequence120!=null?statementSequence120.return_statements:null) != null){
            					((module_scope)module_stack.peek()).statementsSeq = (statementSequence120!=null?statementSequence120.return_statements:null);
            				} else{
            					((module_scope)module_stack.peek()).statementsSeq = Collections.<StatementNode>emptyList();
            				}
            		} else {
            			((module_scope)module_stack.peek()).statementsSeq = Collections.<StatementNode>emptyList();
            		}
            		// Create the modulenode with all required fields
            		((module_scope)module_stack.peek()).moduleNode = new ModuleNode(	(start!=null?start.getText():null), (end!=null?end.getText():null),	(declarations118!=null?declarations118.return_constants:null),
            						(declarations118!=null?declarations118.return_types:null),	(declarations118!=null?declarations118.return_variables:null),
            						(declarations118!=null?declarations118.return_procs:null),	((module_scope)module_stack.peek()).statementsSeq );
            		// return the created node
            		retval.node =((module_scope)module_stack.peek()).moduleNode;
            	

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException re) {
        			reportError(re);
          	  throw re;
        	}
        finally {
            module_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "module"

    // Delegated rules


 

    public static final BitSet FOLLOW_10_in_selectorPart71 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selectorPart73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selectorPart80 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_selectorPart84 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_selectorPart86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectorPart_in_selector109 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_IDENT_in_identSelector127 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_selector_in_identSelector129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identSelector_in_factor145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_factor159 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_factor161 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_factor163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_factor170 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_factor_in_factor175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term194 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_16_in_term202 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_17_in_term209 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_18_in_term216 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_19_in_term223 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_factor_in_term230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termList251 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_20_in_termList259 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_21_in_termList265 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_22_in_termList271 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_term_in_termList278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_negation294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_simpleExpression317 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_negation_in_simpleExpression321 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_termList_in_simpleExpression329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression351 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_23_in_expression359 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_24_in_expression365 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_25_in_expression371 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_26_in_expression377 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_27_in_expression383 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_28_in_expression389 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_simpleExpression_in_expression396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identSelector_in_assignment417 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assignment419 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_assignment421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_actualParametersFollowUp437 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_actualParametersFollowUp439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_actualParameters465 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_actualParameters469 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_actualParametersFollowUp_in_actualParameters476 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_actualParameters481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall504 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_elsIfPart521 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_elsIfPart523 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_elsIfPart525 = new BitSet(new long[]{0x000000D400000020L});
    public static final BitSet FOLLOW_statementSequence_in_elsIfPart527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_elsePart541 = new BitSet(new long[]{0x000000D400000020L});
    public static final BitSet FOLLOW_statementSequence_in_elsePart543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ifStatement563 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_ifStatement565 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ifStatement567 = new BitSet(new long[]{0x000000D400000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement569 = new BitSet(new long[]{0x0000000A80000000L});
    public static final BitSet FOLLOW_elsIfPart_in_ifStatement575 = new BitSet(new long[]{0x0000000A80000000L});
    public static final BitSet FOLLOW_elsePart_in_ifStatement579 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifStatement583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_withDoStatement601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identSelector_in_withDoStatement603 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_withDoStatement605 = new BitSet(new long[]{0x000000D400000020L});
    public static final BitSet FOLLOW_statementSequence_in_withDoStatement607 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_withDoStatement609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_whileStatement629 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_whileStatement631 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_whileStatement633 = new BitSet(new long[]{0x000000D400000020L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement635 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_whileStatement637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withDoStatement_in_statement688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_statementSequenceFollowUp706 = new BitSet(new long[]{0x0000005400000020L});
    public static final BitSet FOLLOW_statement_in_statementSequenceFollowUp708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence736 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_statementSequenceFollowUp_in_statementSequence741 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList763 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_identList766 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identList770 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_40_in_arrayType792 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_arrayType794 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_arrayType796 = new BitSet(new long[]{0x0000090000000020L});
    public static final BitSet FOLLOW_type_in_arrayType798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList824 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_fieldList826 = new BitSet(new long[]{0x0000090000000020L});
    public static final BitSet FOLLOW_type_in_fieldList828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_recordTypeFollowUp844 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_fieldList_in_recordTypeFollowUp846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_recordType872 = new BitSet(new long[]{0x0000008800000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType875 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_recordTypeFollowUp_in_recordType882 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_35_in_recordType886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_fpSection939 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_fieldList_in_fpSection943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_formalParametersFollowUp958 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_fpSection_in_formalParametersFollowUp960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_formalParameters985 = new BitSet(new long[]{0x0000100000000020L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters989 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_formalParametersFollowUp_in_formalParameters994 = new BitSet(new long[]{0x0000008000004000L});
    public static final BitSet FOLLOW_14_in_formalParameters999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody1017 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_45_in_procedureBody1020 = new BitSet(new long[]{0x000000D400000020L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1022 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_procedureBody1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_procedureDeclaration1041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1045 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1047 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_procedureDeclaration1050 = new BitSet(new long[]{0x0001F00800000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1052 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDecl1071 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_constDecl1073 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_constDecl1075 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_constDecl1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDecl1096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_typeDecl1098 = new BitSet(new long[]{0x0000090000000020L});
    public static final BitSet FOLLOW_type_in_typeDecl1100 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_typeDecl1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_varDecl1120 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_varDecl1122 = new BitSet(new long[]{0x0000090000000020L});
    public static final BitSet FOLLOW_type_in_varDecl1124 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_varDecl1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_constsDecl1143 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_constDecl_in_constsDecl1145 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_48_in_typesDecl1159 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_typeDecl_in_typesDecl1161 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_44_in_varsDecl1172 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_varDecl_in_varsDecl1174 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_constsDecl_in_declarations1198 = new BitSet(new long[]{0x0001500000000002L});
    public static final BitSet FOLLOW_typesDecl_in_declarations1201 = new BitSet(new long[]{0x0000500000000002L});
    public static final BitSet FOLLOW_varsDecl_in_declarations1204 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1208 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_declarations1210 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_49_in_module1234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1238 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_module1240 = new BitSet(new long[]{0x0001F00800000000L});
    public static final BitSet FOLLOW_declarations_in_module1242 = new BitSet(new long[]{0x0000200800000000L});
    public static final BitSet FOLLOW_45_in_module1245 = new BitSet(new long[]{0x000000D400000020L});
    public static final BitSet FOLLOW_statementSequence_in_module1247 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_module1251 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1255 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module1257 = new BitSet(new long[]{0x0000000000000002L});

}