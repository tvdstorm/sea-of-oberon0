// $ANTLR 3.3 Nov 30, 2010 12:45:30 /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g 2011-02-06 12:40:04

  package com.arievanderveek.soo.parser.antlrimpl.generated;
  import com.arievanderveek.soo.SeaOfOberonException;
  import com.arievanderveek.soo.ast.*;
  import com.arievanderveek.soo.ast.statements.*;
  import com.arievanderveek.soo.ast.variables.*;
  import com.arievanderveek.soo.ast.unaryoperators.*;
  import com.arievanderveek.soo.ast.binaryoperators.*;
  import com.arievanderveek.soo.ast.codeblocks.*;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEGATION", "IDENT", "INTEGER", "DIGIT", "LETTER", "WS", "'.'", "'['", "']'", "'('", "')'", "'~'", "'*'", "'DIV'", "'MOD'", "'&'", "'+'", "'-'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "':='", "','", "'ELSIF'", "'THEN'", "'ELSE'", "'IF'", "'END'", "'WHILE'", "'DO'", "';'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'VAR'", "'BEGIN'", "'PROCEDURE'", "'CONST'", "'TYPE'", "'MODULE'"
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
    public String getGrammarFileName() { return "/school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g"; }


    public static class selectorPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectorPart"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:41:1: selectorPart : ( '.' IDENT | '[' e= expression ']' );
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:42:2: ( '.' IDENT | '[' e= expression ']' )
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
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:42:4: '.' IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal1=(Token)match(input,10,FOLLOW_10_in_selectorPart71); 
                    char_literal1_tree = (CommonTree)adaptor.create(char_literal1);
                    adaptor.addChild(root_0, char_literal1_tree);

                    IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_selectorPart73); 
                    IDENT2_tree = (CommonTree)adaptor.create(IDENT2);
                    adaptor.addChild(root_0, IDENT2_tree);

                     ((selector_scope)selector_stack.peek()).selectors.add(new IdentifierNode((IDENT2!=null?IDENT2.getText():null))); 

                    }
                    break;
                case 2 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:43:4: '[' e= expression ']'
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

                     ((selector_scope)selector_stack.peek()).selectors.add((e!=null?e.node:null)); 

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
        Queue<ASTNode> selectors;
    }
    protected Stack selector_stack = new Stack();

    public static class selector_return extends ParserRuleReturnScope {
        public SelectorNode return_selectors;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:46:1: selector returns [SelectorNode return_selectors] : ( selectorPart )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        selector_stack.push(new selector_scope());
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selectorPart_return selectorPart5 = null;




        	((selector_scope)selector_stack.peek()).selectors = new LinkedList();

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:53:2: ( ( selectorPart )* )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:53:4: ( selectorPart )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:53:4: ( selectorPart )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=10 && LA2_0<=11)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:53:4: selectorPart
            	    {
            	    pushFollow(FOLLOW_selectorPart_in_selector110);
            	    selectorPart5=selectorPart();

            	    state._fsp--;

            	    adaptor.addChild(root_0, selectorPart5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             retval.return_selectors = new SelectorNode(((selector_scope)selector_stack.peek()).selectors); 

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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identSelector"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:57:1: identSelector returns [ASTNode node] : IDENT selector ;
    public final Oberon0Parser.identSelector_return identSelector() throws RecognitionException {
        Oberon0Parser.identSelector_return retval = new Oberon0Parser.identSelector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT6=null;
        Oberon0Parser.selector_return selector7 = null;


        CommonTree IDENT6_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:58:2: ( IDENT selector )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:58:4: IDENT selector
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_identSelector129); 
            IDENT6_tree = (CommonTree)adaptor.create(IDENT6);
            adaptor.addChild(root_0, IDENT6_tree);

            pushFollow(FOLLOW_selector_in_identSelector131);
            selector7=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector7.getTree());
            retval.node = new IdentifierNode((IDENT6!=null?IDENT6.getText():null) , (selector7!=null?selector7.return_selectors:null) );

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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:61:1: factor returns [ASTNode node] : ( identSelector | INTEGER | '(' expression ')' | '~' f= factor );
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:62:2: ( identSelector | INTEGER | '(' expression ')' | '~' f= factor )
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
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:62:4: identSelector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identSelector_in_factor148);
                    identSelector8=identSelector();

                    state._fsp--;

                    adaptor.addChild(root_0, identSelector8.getTree());
                     retval.node = (identSelector8!=null?identSelector8.node:null);

                    }
                    break;
                case 2 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:63:4: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER9=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor155); 
                    INTEGER9_tree = (CommonTree)adaptor.create(INTEGER9);
                    adaptor.addChild(root_0, INTEGER9_tree);

                    retval.node = new IntegerNode(new Integer((INTEGER9!=null?INTEGER9.getText():null))) ;

                    }
                    break;
                case 3 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:64:4: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal10=(Token)match(input,13,FOLLOW_13_in_factor162); 
                    char_literal10_tree = (CommonTree)adaptor.create(char_literal10);
                    adaptor.addChild(root_0, char_literal10_tree);

                    pushFollow(FOLLOW_expression_in_factor164);
                    expression11=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression11.getTree());
                    char_literal12=(Token)match(input,14,FOLLOW_14_in_factor166); 
                    char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);

                    retval.node = (expression11!=null?expression11.node:null); 

                    }
                    break;
                case 4 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:65:4: '~' f= factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal13=(Token)match(input,15,FOLLOW_15_in_factor173); 
                    char_literal13_tree = (CommonTree)adaptor.create(char_literal13);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal13_tree, root_0);

                    pushFollow(FOLLOW_factor_in_factor178);
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:68:1: term returns [ASTNode node] : lhs= factor ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )? ;
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:69:2: (lhs= factor ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )? )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:69:4: lhs= factor ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term198);
            lhs=factor();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:70:2: ( (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:70:3: (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' ) rhs= factor
                    {
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:70:3: (times= '*' | div= 'DIV' | mod= 'MOD' | and= '&' )
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
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:70:4: times= '*'
                            {
                            times=(Token)match(input,16,FOLLOW_16_in_term206); 
                            times_tree = (CommonTree)adaptor.create(times);
                            adaptor.addChild(root_0, times_tree);


                            }
                            break;
                        case 2 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:71:4: div= 'DIV'
                            {
                            div=(Token)match(input,17,FOLLOW_17_in_term213); 
                            div_tree = (CommonTree)adaptor.create(div);
                            adaptor.addChild(root_0, div_tree);


                            }
                            break;
                        case 3 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:72:4: mod= 'MOD'
                            {
                            mod=(Token)match(input,18,FOLLOW_18_in_term220); 
                            mod_tree = (CommonTree)adaptor.create(mod);
                            adaptor.addChild(root_0, mod_tree);


                            }
                            break;
                        case 4 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:73:4: and= '&'
                            {
                            and=(Token)match(input,19,FOLLOW_19_in_term227); 
                            and_tree = (CommonTree)adaptor.create(and);
                            adaptor.addChild(root_0, and_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_factor_in_term234);
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termList"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:97:1: termList returns [ASTNode node] : lhs= term ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )? ;
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:98:2: (lhs= term ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )? )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:98:4: lhs= term ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_term_in_termList256);
            lhs=term();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:99:2: ( (plus= '+' | min= '-' | or= 'OR' ) rhs= term )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=22)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:99:3: (plus= '+' | min= '-' | or= 'OR' ) rhs= term
                    {
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:99:3: (plus= '+' | min= '-' | or= 'OR' )
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
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:99:4: plus= '+'
                            {
                            plus=(Token)match(input,20,FOLLOW_20_in_termList264); 
                            plus_tree = (CommonTree)adaptor.create(plus);
                            adaptor.addChild(root_0, plus_tree);


                            }
                            break;
                        case 2 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:100:3: min= '-'
                            {
                            min=(Token)match(input,21,FOLLOW_21_in_termList270); 
                            min_tree = (CommonTree)adaptor.create(min);
                            adaptor.addChild(root_0, min_tree);


                            }
                            break;
                        case 3 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:101:3: or= 'OR'
                            {
                            or=(Token)match(input,22,FOLLOW_22_in_termList276); 
                            or_tree = (CommonTree)adaptor.create(or);
                            adaptor.addChild(root_0, or_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_term_in_termList283);
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "negation"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:122:1: negation returns [ASTNode node] : '-' -> NEGATION ;
    public final Oberon0Parser.negation_return negation() throws RecognitionException {
        Oberon0Parser.negation_return retval = new Oberon0Parser.negation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal14=null;

        CommonTree char_literal14_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:123:2: ( '-' -> NEGATION )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:123:4: '-'
            {
            char_literal14=(Token)match(input,21,FOLLOW_21_in_negation303);  
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
            // 123:8: -> NEGATION
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:126:1: simpleExpression returns [ASTNode node] : ( '+' | negation )? termList ;
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:130:2: ( ( '+' | negation )? termList )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:130:4: ( '+' | negation )? termList
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:130:4: ( '+' | negation )?
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
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:130:5: '+'
                    {
                    char_literal15=(Token)match(input,20,FOLLOW_20_in_simpleExpression327); 
                    char_literal15_tree = (CommonTree)adaptor.create(char_literal15);
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;
                case 2 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:131:2: negation
                    {
                    pushFollow(FOLLOW_negation_in_simpleExpression331);
                    negation16=negation();

                    state._fsp--;

                    adaptor.addChild(root_0, negation16.getTree());
                    isNegation = true;

                    }
                    break;

            }

            pushFollow(FOLLOW_termList_in_simpleExpression339);
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:144:1: expression returns [ASTNode node] : lhs= simpleExpression ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )? ;
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:145:3: (lhs= simpleExpression ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )? )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:145:5: lhs= simpleExpression ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression362);
            lhs=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:145:26: ( (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=23 && LA10_0<=28)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:145:27: (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' ) rhs= simpleExpression
                    {
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:145:27: (equal= '=' | notequal= '#' | smaller= '<' | smallereq= '<=' | greater= '>' | greatereq= '>=' )
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
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:146:2: equal= '='
                            {
                            equal=(Token)match(input,23,FOLLOW_23_in_expression370); 
                            equal_tree = (CommonTree)adaptor.create(equal);
                            adaptor.addChild(root_0, equal_tree);


                            }
                            break;
                        case 2 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:147:3: notequal= '#'
                            {
                            notequal=(Token)match(input,24,FOLLOW_24_in_expression376); 
                            notequal_tree = (CommonTree)adaptor.create(notequal);
                            adaptor.addChild(root_0, notequal_tree);


                            }
                            break;
                        case 3 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:148:3: smaller= '<'
                            {
                            smaller=(Token)match(input,25,FOLLOW_25_in_expression382); 
                            smaller_tree = (CommonTree)adaptor.create(smaller);
                            adaptor.addChild(root_0, smaller_tree);


                            }
                            break;
                        case 4 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:149:3: smallereq= '<='
                            {
                            smallereq=(Token)match(input,26,FOLLOW_26_in_expression388); 
                            smallereq_tree = (CommonTree)adaptor.create(smallereq);
                            adaptor.addChild(root_0, smallereq_tree);


                            }
                            break;
                        case 5 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:150:3: greater= '>'
                            {
                            greater=(Token)match(input,27,FOLLOW_27_in_expression394); 
                            greater_tree = (CommonTree)adaptor.create(greater);
                            adaptor.addChild(root_0, greater_tree);


                            }
                            break;
                        case 6 :
                            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:151:3: greatereq= '>='
                            {
                            greatereq=(Token)match(input,28,FOLLOW_28_in_expression400); 
                            greatereq_tree = (CommonTree)adaptor.create(greatereq);
                            adaptor.addChild(root_0, greatereq_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression407);
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:181:1: assignment returns [ASTNode node] : identSelector ':=' expression ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal19=null;
        Oberon0Parser.identSelector_return identSelector18 = null;

        Oberon0Parser.expression_return expression20 = null;


        CommonTree string_literal19_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:182:2: ( identSelector ':=' expression )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:182:4: identSelector ':=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identSelector_in_assignment428);
            identSelector18=identSelector();

            state._fsp--;

            adaptor.addChild(root_0, identSelector18.getTree());
            string_literal19=(Token)match(input,29,FOLLOW_29_in_assignment430); 
            string_literal19_tree = (CommonTree)adaptor.create(string_literal19);
            adaptor.addChild(root_0, string_literal19_tree);

            pushFollow(FOLLOW_expression_in_assignment432);
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:186:1: actualParametersFollowUp : ',' expression ;
    public final Oberon0Parser.actualParametersFollowUp_return actualParametersFollowUp() throws RecognitionException {
        Oberon0Parser.actualParametersFollowUp_return retval = new Oberon0Parser.actualParametersFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        Oberon0Parser.expression_return expression22 = null;


        CommonTree char_literal21_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:187:2: ( ',' expression )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:187:4: ',' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal21=(Token)match(input,30,FOLLOW_30_in_actualParametersFollowUp448); 
            char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            pushFollow(FOLLOW_expression_in_actualParametersFollowUp450);
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
        List<ASTNode> parameters;
    }
    protected Stack actualParameters_stack = new Stack();

    public static class actualParameters_return extends ParserRuleReturnScope {
        public List<ASTNode> return_expression;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:191:1: actualParameters returns [List<ASTNode> return_expression] : '(' expression ( actualParametersFollowUp )* ')' ;
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


        	((actualParameters_scope)actualParameters_stack.peek()).parameters = new LinkedList();

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:198:3: ( '(' expression ( actualParametersFollowUp )* ')' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:198:5: '(' expression ( actualParametersFollowUp )* ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal23=(Token)match(input,13,FOLLOW_13_in_actualParameters476); 
            char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);

            pushFollow(FOLLOW_expression_in_actualParameters480);
            expression24=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression24.getTree());
            ((actualParameters_scope)actualParameters_stack.peek()).parameters.add((expression24!=null?expression24.node:null));
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:200:3: ( actualParametersFollowUp )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:200:3: actualParametersFollowUp
            	    {
            	    pushFollow(FOLLOW_actualParametersFollowUp_in_actualParameters487);
            	    actualParametersFollowUp25=actualParametersFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, actualParametersFollowUp25.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal26=(Token)match(input,14,FOLLOW_14_in_actualParameters492); 
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:205:1: procedureCall returns [ASTNode node] : IDENT ( actualParameters )? ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT27=null;
        Oberon0Parser.actualParameters_return actualParameters28 = null;


        CommonTree IDENT27_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:206:2: ( IDENT ( actualParameters )? )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:206:5: IDENT ( actualParameters )?
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT27=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall515); 
            IDENT27_tree = (CommonTree)adaptor.create(IDENT27);
            adaptor.addChild(root_0, IDENT27_tree);

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:206:11: ( actualParameters )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:206:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall517);
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:222:1: elsIfPart : 'ELSIF' expression 'THEN' statementSequence ;
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:223:2: ( 'ELSIF' expression 'THEN' statementSequence )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:223:4: 'ELSIF' expression 'THEN' statementSequence
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal29=(Token)match(input,31,FOLLOW_31_in_elsIfPart532); 
            string_literal29_tree = (CommonTree)adaptor.create(string_literal29);
            adaptor.addChild(root_0, string_literal29_tree);

            pushFollow(FOLLOW_expression_in_elsIfPart534);
            expression30=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression30.getTree());
            string_literal31=(Token)match(input,32,FOLLOW_32_in_elsIfPart536); 
            string_literal31_tree = (CommonTree)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_statementSequence_in_elsIfPart538);
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:229:1: elsePart : 'ELSE' statementSequence ;
    public final Oberon0Parser.elsePart_return elsePart() throws RecognitionException {
        Oberon0Parser.elsePart_return retval = new Oberon0Parser.elsePart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal33=null;
        Oberon0Parser.statementSequence_return statementSequence34 = null;


        CommonTree string_literal33_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:230:2: ( 'ELSE' statementSequence )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:230:4: 'ELSE' statementSequence
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal33=(Token)match(input,33,FOLLOW_33_in_elsePart552); 
            string_literal33_tree = (CommonTree)adaptor.create(string_literal33);
            adaptor.addChild(root_0, string_literal33_tree);

            pushFollow(FOLLOW_statementSequence_in_elsePart554);
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:236:1: ifStatement returns [ASTNode node] : 'IF' expression 'THEN' statementSequence ( elsIfPart )* ( elsePart )? 'END' ;
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
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:240:2: ( 'IF' expression 'THEN' statementSequence ( elsIfPart )* ( elsePart )? 'END' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:240:4: 'IF' expression 'THEN' statementSequence ( elsIfPart )* ( elsePart )? 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal35=(Token)match(input,34,FOLLOW_34_in_ifStatement574); 
            string_literal35_tree = (CommonTree)adaptor.create(string_literal35);
            adaptor.addChild(root_0, string_literal35_tree);

            pushFollow(FOLLOW_expression_in_ifStatement576);
            expression36=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression36.getTree());
            string_literal37=(Token)match(input,32,FOLLOW_32_in_ifStatement578); 
            string_literal37_tree = (CommonTree)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            pushFollow(FOLLOW_statementSequence_in_ifStatement580);
            statementSequence38=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence38.getTree());

            	((ifStatement_scope)ifStatement_stack.peek()).root = new IfStatementNode((expression36!=null?expression36.node:null), (statementSequence38!=null?statementSequence38.return_statements:null) );
            	
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:244:2: ( elsIfPart )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:244:2: elsIfPart
            	    {
            	    pushFollow(FOLLOW_elsIfPart_in_ifStatement586);
            	    elsIfPart39=elsIfPart();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elsIfPart39.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:245:2: ( elsePart )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:245:2: elsePart
                    {
                    pushFollow(FOLLOW_elsePart_in_ifStatement590);
                    elsePart40=elsePart();

                    state._fsp--;

                    adaptor.addChild(root_0, elsePart40.getTree());

                    }
                    break;

            }

            string_literal41=(Token)match(input,35,FOLLOW_35_in_ifStatement594); 
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

    public static class whileStatement_return extends ParserRuleReturnScope {
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:250:1: whileStatement returns [ASTNode node] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Oberon0Parser.expression_return expression43 = null;

        Oberon0Parser.statementSequence_return statementSequence45 = null;


        CommonTree string_literal42_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:251:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:251:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal42=(Token)match(input,36,FOLLOW_36_in_whileStatement614); 
            string_literal42_tree = (CommonTree)adaptor.create(string_literal42);
            adaptor.addChild(root_0, string_literal42_tree);

            pushFollow(FOLLOW_expression_in_whileStatement616);
            expression43=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression43.getTree());
            string_literal44=(Token)match(input,37,FOLLOW_37_in_whileStatement618); 
            string_literal44_tree = (CommonTree)adaptor.create(string_literal44);
            adaptor.addChild(root_0, string_literal44_tree);

            pushFollow(FOLLOW_statementSequence_in_whileStatement620);
            statementSequence45=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence45.getTree());
            string_literal46=(Token)match(input,35,FOLLOW_35_in_whileStatement622); 
            string_literal46_tree = (CommonTree)adaptor.create(string_literal46);
            adaptor.addChild(root_0, string_literal46_tree);

             retval.node = new WhileLoopNode((expression43!=null?expression43.node:null), (statementSequence45!=null?statementSequence45.return_statements:null)); 

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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:255:1: statement returns [ASTNode node] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment47 = null;

        Oberon0Parser.procedureCall_return procedureCall48 = null;

        Oberon0Parser.ifStatement_return ifStatement49 = null;

        Oberon0Parser.whileStatement_return whileStatement50 = null;



        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:256:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:256:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:256:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt15=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=10 && LA15_1<=11)||LA15_1==29) ) {
                        alt15=1;
                    }
                    else if ( (LA15_1==13||LA15_1==31||LA15_1==33||LA15_1==35||LA15_1==38) ) {
                        alt15=2;
                    }
                    }
                    break;
                case 34:
                    {
                    alt15=3;
                    }
                    break;
                case 36:
                    {
                    alt15=4;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:257:4: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement645);
                    assignment47=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment47.getTree());
                    retval.node =(assignment47!=null?assignment47.node:null);

                    }
                    break;
                case 2 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:258:4: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement652);
                    procedureCall48=procedureCall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedureCall48.getTree());
                    retval.node =(procedureCall48!=null?procedureCall48.node:null);

                    }
                    break;
                case 3 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:259:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement659);
                    ifStatement49=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement49.getTree());
                    retval.node =(ifStatement49!=null?ifStatement49.node:null);

                    }
                    break;
                case 4 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:260:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement666);
                    whileStatement50=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement50.getTree());
                    retval.node =(whileStatement50!=null?whileStatement50.node:null);

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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:264:1: statementSequenceFollowUp : ';' statement ;
    public final Oberon0Parser.statementSequenceFollowUp_return statementSequenceFollowUp() throws RecognitionException {
        Oberon0Parser.statementSequenceFollowUp_return retval = new Oberon0Parser.statementSequenceFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal51=null;
        Oberon0Parser.statement_return statement52 = null;


        CommonTree char_literal51_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:265:2: ( ';' statement )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:265:4: ';' statement
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal51=(Token)match(input,38,FOLLOW_38_in_statementSequenceFollowUp684); 
            char_literal51_tree = (CommonTree)adaptor.create(char_literal51);
            adaptor.addChild(root_0, char_literal51_tree);

            pushFollow(FOLLOW_statement_in_statementSequenceFollowUp686);
            statement52=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement52.getTree());

            		((statementSequence_scope)statementSequence_stack.peek()).statements.add((statement52!=null?statement52.node:null));
            	

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
        List<ASTNode> statements;
    }
    protected Stack statementSequence_stack = new Stack();

    public static class statementSequence_return extends ParserRuleReturnScope {
        public List<ASTNode> return_statements;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:271:1: statementSequence returns [List<ASTNode> return_statements] : statement ( statementSequenceFollowUp )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        statementSequence_stack.push(new statementSequence_scope());
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.statement_return statement53 = null;

        Oberon0Parser.statementSequenceFollowUp_return statementSequenceFollowUp54 = null;




        	((statementSequence_scope)statementSequence_stack.peek()).statements = new LinkedList();

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:278:2: ( statement ( statementSequenceFollowUp )* )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:279:2: statement ( statementSequenceFollowUp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence714);
            statement53=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement53.getTree());
            ((statementSequence_scope)statementSequence_stack.peek()).statements.add((statement53!=null?statement53.node:null)); 
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:280:2: ( statementSequenceFollowUp )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:280:2: statementSequenceFollowUp
            	    {
            	    pushFollow(FOLLOW_statementSequenceFollowUp_in_statementSequence719);
            	    statementSequenceFollowUp54=statementSequenceFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementSequenceFollowUp54.getTree());

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
        public List idents;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:284:1: identList returns [List idents] : ids+= IDENT ( ',' ids+= IDENT )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        Token ids=null;
        List list_ids=null;

        CommonTree char_literal55_tree=null;
        CommonTree ids_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:285:2: (ids+= IDENT ( ',' ids+= IDENT )* )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:285:4: ids+= IDENT ( ',' ids+= IDENT )*
            {
            root_0 = (CommonTree)adaptor.nil();

            ids=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList741); 
            ids_tree = (CommonTree)adaptor.create(ids);
            adaptor.addChild(root_0, ids_tree);

            if (list_ids==null) list_ids=new ArrayList();
            list_ids.add(ids);

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:285:15: ( ',' ids+= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:285:16: ',' ids+= IDENT
            	    {
            	    char_literal55=(Token)match(input,30,FOLLOW_30_in_identList744); 
            	    char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
            	    adaptor.addChild(root_0, char_literal55_tree);

            	    ids=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList748); 
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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:289:1: arrayType returns [ASTNode node] : 'ARRAY' expression 'OF' type ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal56=null;
        Token string_literal58=null;
        Oberon0Parser.expression_return expression57 = null;

        Oberon0Parser.type_return type59 = null;


        CommonTree string_literal56_tree=null;
        CommonTree string_literal58_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:290:2: ( 'ARRAY' expression 'OF' type )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:290:4: 'ARRAY' expression 'OF' type
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal56=(Token)match(input,39,FOLLOW_39_in_arrayType770); 
            string_literal56_tree = (CommonTree)adaptor.create(string_literal56);
            adaptor.addChild(root_0, string_literal56_tree);

            pushFollow(FOLLOW_expression_in_arrayType772);
            expression57=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression57.getTree());
            string_literal58=(Token)match(input,40,FOLLOW_40_in_arrayType774); 
            string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
            adaptor.addChild(root_0, string_literal58_tree);

            pushFollow(FOLLOW_type_in_arrayType776);
            type59=type();

            state._fsp--;

            adaptor.addChild(root_0, type59.getTree());
             retval.node = new ArrayTypeNode((expression57!=null?expression57.node:null),(type59!=null?type59.node:null));

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
        List<ASTNode> fields;
    }
    protected Stack fieldList_stack = new Stack();

    public static class fieldList_return extends ParserRuleReturnScope {
        public List<ASTNode> return_fieldlist;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:294:1: fieldList returns [List<ASTNode> return_fieldlist] : ( identList ':' type )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        fieldList_stack.push(new fieldList_scope());
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal61=null;
        Oberon0Parser.identList_return identList60 = null;

        Oberon0Parser.type_return type62 = null;


        CommonTree char_literal61_tree=null;


        	((fieldList_scope)fieldList_stack.peek()).fields = new LinkedList();

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:301:2: ( ( identList ':' type )? )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:301:4: ( identList ':' type )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:301:4: ( identList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:301:5: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList802);
                    identList60=identList();

                    state._fsp--;

                    adaptor.addChild(root_0, identList60.getTree());
                    char_literal61=(Token)match(input,41,FOLLOW_41_in_fieldList804); 
                    char_literal61_tree = (CommonTree)adaptor.create(char_literal61);
                    adaptor.addChild(root_0, char_literal61_tree);

                    pushFollow(FOLLOW_type_in_fieldList806);
                    type62=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type62.getTree());

                    }
                    break;

            }


            			for (Object token : (identList60!=null?identList60.idents:null))
            			{
            				((fieldList_scope)fieldList_stack.peek()).fields.add(new MethodCallParamNode( ((CommonToken) token).getText(), (type62!=null?type62.node:null)));
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:311:1: recordTypeFollowUp : ';' fieldList ;
    public final Oberon0Parser.recordTypeFollowUp_return recordTypeFollowUp() throws RecognitionException {
        Oberon0Parser.recordTypeFollowUp_return retval = new Oberon0Parser.recordTypeFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal63=null;
        Oberon0Parser.fieldList_return fieldList64 = null;


        CommonTree char_literal63_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:312:2: ( ';' fieldList )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:312:4: ';' fieldList
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal63=(Token)match(input,38,FOLLOW_38_in_recordTypeFollowUp822); 
            char_literal63_tree = (CommonTree)adaptor.create(char_literal63);
            adaptor.addChild(root_0, char_literal63_tree);

            pushFollow(FOLLOW_fieldList_in_recordTypeFollowUp824);
            fieldList64=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList64.getTree());
             ((recordType_scope)recordType_stack.peek()).fields.addAll((fieldList64!=null?fieldList64.return_fieldlist:null));

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
        List<ASTNode> fields;
    }
    protected Stack recordType_stack = new Stack();

    public static class recordType_return extends ParserRuleReturnScope {
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:316:1: recordType returns [ASTNode node] : 'RECORD' fieldList ( recordTypeFollowUp )* 'END' ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        recordType_stack.push(new recordType_scope());
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal65=null;
        Token string_literal68=null;
        Oberon0Parser.fieldList_return fieldList66 = null;

        Oberon0Parser.recordTypeFollowUp_return recordTypeFollowUp67 = null;


        CommonTree string_literal65_tree=null;
        CommonTree string_literal68_tree=null;


        	((recordType_scope)recordType_stack.peek()).fields = new LinkedList();	

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:323:2: ( 'RECORD' fieldList ( recordTypeFollowUp )* 'END' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:324:2: 'RECORD' fieldList ( recordTypeFollowUp )* 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal65=(Token)match(input,42,FOLLOW_42_in_recordType850); 
            string_literal65_tree = (CommonTree)adaptor.create(string_literal65);
            adaptor.addChild(root_0, string_literal65_tree);

            pushFollow(FOLLOW_fieldList_in_recordType853);
            fieldList66=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList66.getTree());

            	// ((recordType_scope)recordType_stack.peek()).fields.putAll((fieldList66!=null?fieldList66.return_fieldlist:null));
            	
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:329:2: ( recordTypeFollowUp )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:329:2: recordTypeFollowUp
            	    {
            	    pushFollow(FOLLOW_recordTypeFollowUp_in_recordType860);
            	    recordTypeFollowUp67=recordTypeFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, recordTypeFollowUp67.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            string_literal68=(Token)match(input,35,FOLLOW_35_in_recordType864); 
            string_literal68_tree = (CommonTree)adaptor.create(string_literal68);
            adaptor.addChild(root_0, string_literal68_tree);

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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:334:1: type returns [ASTNode node] : ( IDENT | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT69=null;
        Oberon0Parser.arrayType_return arrayType70 = null;

        Oberon0Parser.recordType_return recordType71 = null;


        CommonTree IDENT69_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:335:2: ( IDENT | arrayType | recordType )
            int alt20=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 42:
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
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:335:4: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT69=(Token)match(input,IDENT,FOLLOW_IDENT_in_type881); 
                    IDENT69_tree = (CommonTree)adaptor.create(IDENT69);
                    adaptor.addChild(root_0, IDENT69_tree);

                     retval.node = new IdentifierNode((IDENT69!=null?IDENT69.getText():null));

                    }
                    break;
                case 2 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:336:4: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type889);
                    arrayType70=arrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayType70.getTree());
                     retval.node = (arrayType70!=null?arrayType70.node:null);

                    }
                    break;
                case 3 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:337:4: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type897);
                    recordType71=recordType();

                    state._fsp--;

                    adaptor.addChild(root_0, recordType71.getTree());
                     retval.node = (recordType71!=null?recordType71.node:null);

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
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:340:1: fpSection returns [ASTNode node] : (var= 'VAR' )? fieldList ;
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token var=null;
        Oberon0Parser.fieldList_return fieldList72 = null;


        CommonTree var_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:341:2: ( (var= 'VAR' )? fieldList )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:341:4: (var= 'VAR' )? fieldList
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:341:4: (var= 'VAR' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:341:5: var= 'VAR'
                    {
                    var=(Token)match(input,43,FOLLOW_43_in_fpSection917); 
                    var_tree = (CommonTree)adaptor.create(var);
                    adaptor.addChild(root_0, var_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_fieldList_in_fpSection921);
            fieldList72=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList72.getTree());
             
            			if (var!=null){
            				retval.node = new CallByRefParameterNode((fieldList72!=null?fieldList72.return_fieldlist:null));
            			} else{
            				retval.node = new CallByValParameterNode((fieldList72!=null?fieldList72.return_fieldlist:null));
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:351:1: formalParametersFollowUp : ';' fpSection ;
    public final Oberon0Parser.formalParametersFollowUp_return formalParametersFollowUp() throws RecognitionException {
        Oberon0Parser.formalParametersFollowUp_return retval = new Oberon0Parser.formalParametersFollowUp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal73=null;
        Oberon0Parser.fpSection_return fpSection74 = null;


        CommonTree char_literal73_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:352:2: ( ';' fpSection )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:352:4: ';' fpSection
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal73=(Token)match(input,38,FOLLOW_38_in_formalParametersFollowUp936); 
            char_literal73_tree = (CommonTree)adaptor.create(char_literal73);
            adaptor.addChild(root_0, char_literal73_tree);

            pushFollow(FOLLOW_fpSection_in_formalParametersFollowUp938);
            fpSection74=fpSection();

            state._fsp--;

            adaptor.addChild(root_0, fpSection74.getTree());
             ((formalParameters_scope)formalParameters_stack.peek()).fields.add((fpSection74!=null?fpSection74.node:null));

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
        List<ASTNode> fields;
    }
    protected Stack formalParameters_stack = new Stack();

    public static class formalParameters_return extends ParserRuleReturnScope {
        public List<ASTNode> formalParams;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:356:1: formalParameters returns [List<ASTNode> formalParams] : '(' fpSection ( formalParametersFollowUp )* ')' ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        formalParameters_stack.push(new formalParameters_scope());
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal75=null;
        Token char_literal78=null;
        Oberon0Parser.fpSection_return fpSection76 = null;

        Oberon0Parser.formalParametersFollowUp_return formalParametersFollowUp77 = null;


        CommonTree char_literal75_tree=null;
        CommonTree char_literal78_tree=null;


        	((formalParameters_scope)formalParameters_stack.peek()).fields = new LinkedList();	

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:363:2: ( '(' fpSection ( formalParametersFollowUp )* ')' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:364:2: '(' fpSection ( formalParametersFollowUp )* ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal75=(Token)match(input,13,FOLLOW_13_in_formalParameters963); 
            char_literal75_tree = (CommonTree)adaptor.create(char_literal75);
            adaptor.addChild(root_0, char_literal75_tree);

            pushFollow(FOLLOW_fpSection_in_formalParameters967);
            fpSection76=fpSection();

            state._fsp--;

            adaptor.addChild(root_0, fpSection76.getTree());
             ((formalParameters_scope)formalParameters_stack.peek()).fields.add((fpSection76!=null?fpSection76.node:null));
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:366:2: ( formalParametersFollowUp )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:366:2: formalParametersFollowUp
            	    {
            	    pushFollow(FOLLOW_formalParametersFollowUp_in_formalParameters972);
            	    formalParametersFollowUp77=formalParametersFollowUp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, formalParametersFollowUp77.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            char_literal78=(Token)match(input,14,FOLLOW_14_in_formalParameters977); 
            char_literal78_tree = (CommonTree)adaptor.create(char_literal78);
            adaptor.addChild(root_0, char_literal78_tree);

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
        public Map<String, ASTNode> return_constants;
        public Map<String, ASTNode> return_types;
        public Map<String, ASTNode> return_variables;
        public Map<String, ASTNode> return_procs;
        public List<ASTNode> return_stats;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:371:1: procedureBody returns [Map<String, ASTNode> return_constants, Map<String, ASTNode> return_types,\n\t\t\t\t\t\t\t\t\t\t\tMap<String, ASTNode> return_variables, Map<String, ASTNode> return_procs,\n\t\t\t\t\t\t\t\t\t\t\tList<ASTNode> return_stats] : declarations ( 'BEGIN' statementSequence )? 'END' ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal80=null;
        Token string_literal82=null;
        Oberon0Parser.declarations_return declarations79 = null;

        Oberon0Parser.statementSequence_return statementSequence81 = null;


        CommonTree string_literal80_tree=null;
        CommonTree string_literal82_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:374:2: ( declarations ( 'BEGIN' statementSequence )? 'END' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:374:4: declarations ( 'BEGIN' statementSequence )? 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedureBody995);
            declarations79=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations79.getTree());
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:374:17: ( 'BEGIN' statementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:374:18: 'BEGIN' statementSequence
                    {
                    string_literal80=(Token)match(input,44,FOLLOW_44_in_procedureBody998); 
                    string_literal80_tree = (CommonTree)adaptor.create(string_literal80);
                    adaptor.addChild(root_0, string_literal80_tree);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody1000);
                    statementSequence81=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence81.getTree());

                    }
                    break;

            }

            string_literal82=(Token)match(input,35,FOLLOW_35_in_procedureBody1004); 
            string_literal82_tree = (CommonTree)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);


            		retval.return_constants = (declarations79!=null?declarations79.return_constants:null);
            		retval.return_types = (declarations79!=null?declarations79.return_types:null);
            		retval.return_variables = (declarations79!=null?declarations79.return_variables:null);
            		retval.return_procs = (declarations79!=null?declarations79.return_procs:null);
            		if (statementSequence_stack!=null) {
            			if ((statementSequence81!=null?statementSequence81.return_statements:null)!=null) {
            				retval.return_stats = (statementSequence81!=null?statementSequence81.return_statements:null);
            			} else {
            				retval.return_stats = new LinkedList();
            			}
            		} else { 
            			retval.return_stats = new LinkedList();
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:392:1: procedureDeclaration : 'PROCEDURE' start= IDENT ( formalParameters )? ';' procedureBody end= IDENT ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token end=null;
        Token string_literal83=null;
        Token char_literal85=null;
        Oberon0Parser.formalParameters_return formalParameters84 = null;

        Oberon0Parser.procedureBody_return procedureBody86 = null;


        CommonTree start_tree=null;
        CommonTree end_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree char_literal85_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:393:2: ( 'PROCEDURE' start= IDENT ( formalParameters )? ';' procedureBody end= IDENT )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:393:4: 'PROCEDURE' start= IDENT ( formalParameters )? ';' procedureBody end= IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal83=(Token)match(input,45,FOLLOW_45_in_procedureDeclaration1019); 
            string_literal83_tree = (CommonTree)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);

            start=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1023); 
            start_tree = (CommonTree)adaptor.create(start);
            adaptor.addChild(root_0, start_tree);

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:393:28: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:393:28: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1025);
                    formalParameters84=formalParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, formalParameters84.getTree());

                    }
                    break;

            }

            char_literal85=(Token)match(input,38,FOLLOW_38_in_procedureDeclaration1028); 
            char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
            adaptor.addChild(root_0, char_literal85_tree);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1030);
            procedureBody86=procedureBody();

            state._fsp--;

            adaptor.addChild(root_0, procedureBody86.getTree());
            end=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1034); 
            end_tree = (CommonTree)adaptor.create(end);
            adaptor.addChild(root_0, end_tree);


            	if ((formalParameters84!=null?formalParameters84.formalParams:null)!=null){
            	((declarations_scope)declarations_stack.peek()).procedures.put((start!=null?start.getText():null), new ProcedureNode((start!=null?start.getText():null), (end!=null?end.getText():null),
            				(formalParameters84!=null?formalParameters84.formalParams:null), (procedureBody86!=null?procedureBody86.return_constants:null), 
            				(procedureBody86!=null?procedureBody86.return_types:null), (procedureBody86!=null?procedureBody86.return_variables:null), 
            				(procedureBody86!=null?procedureBody86.return_procs:null), (procedureBody86!=null?procedureBody86.return_stats:null)));
            	} else {
            	((declarations_scope)declarations_stack.peek()).procedures.put((start!=null?start.getText():null), new ProcedureNode((start!=null?start.getText():null), (end!=null?end.getText():null),
            				(procedureBody86!=null?procedureBody86.return_constants:null), (procedureBody86!=null?procedureBody86.return_types:null),
            				(procedureBody86!=null?procedureBody86.return_variables:null), (procedureBody86!=null?procedureBody86.return_procs:null), 
            				(procedureBody86!=null?procedureBody86.return_stats:null)));
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:409:1: constDecl : ( IDENT '=' expression ';' ) ;
    public final Oberon0Parser.constDecl_return constDecl() throws RecognitionException {
        Oberon0Parser.constDecl_return retval = new Oberon0Parser.constDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT87=null;
        Token char_literal88=null;
        Token char_literal90=null;
        Oberon0Parser.expression_return expression89 = null;


        CommonTree IDENT87_tree=null;
        CommonTree char_literal88_tree=null;
        CommonTree char_literal90_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:410:2: ( ( IDENT '=' expression ';' ) )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:410:4: ( IDENT '=' expression ';' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:410:4: ( IDENT '=' expression ';' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:410:5: IDENT '=' expression ';'
            {
            IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDecl1049); 
            IDENT87_tree = (CommonTree)adaptor.create(IDENT87);
            adaptor.addChild(root_0, IDENT87_tree);

            char_literal88=(Token)match(input,23,FOLLOW_23_in_constDecl1051); 
            char_literal88_tree = (CommonTree)adaptor.create(char_literal88);
            adaptor.addChild(root_0, char_literal88_tree);

            pushFollow(FOLLOW_expression_in_constDecl1053);
            expression89=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression89.getTree());
            char_literal90=(Token)match(input,38,FOLLOW_38_in_constDecl1055); 
            char_literal90_tree = (CommonTree)adaptor.create(char_literal90);
            adaptor.addChild(root_0, char_literal90_tree);


            }


            			((declarations_scope)declarations_stack.peek()).constants.put((IDENT87!=null?IDENT87.getText():null) , new ConstantDeclarationNode((expression89!=null?expression89.node:null)));
            		

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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:416:1: typeDecl : ( IDENT '=' type ';' ) ;
    public final Oberon0Parser.typeDecl_return typeDecl() throws RecognitionException {
        Oberon0Parser.typeDecl_return retval = new Oberon0Parser.typeDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Oberon0Parser.type_return type93 = null;


        CommonTree IDENT91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:417:2: ( ( IDENT '=' type ';' ) )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:417:4: ( IDENT '=' type ';' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:417:4: ( IDENT '=' type ';' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:417:6: IDENT '=' type ';'
            {
            IDENT91=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDecl1074); 
            IDENT91_tree = (CommonTree)adaptor.create(IDENT91);
            adaptor.addChild(root_0, IDENT91_tree);

            char_literal92=(Token)match(input,23,FOLLOW_23_in_typeDecl1076); 
            char_literal92_tree = (CommonTree)adaptor.create(char_literal92);
            adaptor.addChild(root_0, char_literal92_tree);

            pushFollow(FOLLOW_type_in_typeDecl1078);
            type93=type();

            state._fsp--;

            adaptor.addChild(root_0, type93.getTree());
            char_literal94=(Token)match(input,38,FOLLOW_38_in_typeDecl1080); 
            char_literal94_tree = (CommonTree)adaptor.create(char_literal94);
            adaptor.addChild(root_0, char_literal94_tree);


            }


            			((declarations_scope)declarations_stack.peek()).types.put((IDENT91!=null?IDENT91.getText():null) , new TypeDeclarationNode((type93!=null?type93.node:null)));
            		

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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:423:1: varDecl : ( identList ':' type ';' ) ;
    public final Oberon0Parser.varDecl_return varDecl() throws RecognitionException {
        Oberon0Parser.varDecl_return retval = new Oberon0Parser.varDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal96=null;
        Token char_literal98=null;
        Oberon0Parser.identList_return identList95 = null;

        Oberon0Parser.type_return type97 = null;


        CommonTree char_literal96_tree=null;
        CommonTree char_literal98_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:424:2: ( ( identList ':' type ';' ) )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:424:4: ( identList ':' type ';' )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:424:4: ( identList ':' type ';' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:424:5: identList ':' type ';'
            {
            pushFollow(FOLLOW_identList_in_varDecl1098);
            identList95=identList();

            state._fsp--;

            adaptor.addChild(root_0, identList95.getTree());
            char_literal96=(Token)match(input,41,FOLLOW_41_in_varDecl1100); 
            char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
            adaptor.addChild(root_0, char_literal96_tree);

            pushFollow(FOLLOW_type_in_varDecl1102);
            type97=type();

            state._fsp--;

            adaptor.addChild(root_0, type97.getTree());
            char_literal98=(Token)match(input,38,FOLLOW_38_in_varDecl1104); 
            char_literal98_tree = (CommonTree)adaptor.create(char_literal98);
            adaptor.addChild(root_0, char_literal98_tree);


            }


            			for (Object token : (identList95!=null?identList95.idents:null)){
            				((declarations_scope)declarations_stack.peek()).variables.put( ((CommonToken) token).getText(), new VariableDeclarationNode((type97!=null?type97.node:null)));
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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:432:1: constsDecl : 'CONST' ( constDecl )* ;
    public final Oberon0Parser.constsDecl_return constsDecl() throws RecognitionException {
        Oberon0Parser.constsDecl_return retval = new Oberon0Parser.constsDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal99=null;
        Oberon0Parser.constDecl_return constDecl100 = null;


        CommonTree string_literal99_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:433:2: ( 'CONST' ( constDecl )* )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:433:4: 'CONST' ( constDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal99=(Token)match(input,46,FOLLOW_46_in_constsDecl1121); 
            string_literal99_tree = (CommonTree)adaptor.create(string_literal99);
            adaptor.addChild(root_0, string_literal99_tree);

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:433:12: ( constDecl )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:433:12: constDecl
            	    {
            	    pushFollow(FOLLOW_constDecl_in_constsDecl1123);
            	    constDecl100=constDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, constDecl100.getTree());

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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:436:1: typesDecl : 'TYPE' ( typeDecl )* ;
    public final Oberon0Parser.typesDecl_return typesDecl() throws RecognitionException {
        Oberon0Parser.typesDecl_return retval = new Oberon0Parser.typesDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal101=null;
        Oberon0Parser.typeDecl_return typeDecl102 = null;


        CommonTree string_literal101_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:437:2: ( 'TYPE' ( typeDecl )* )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:437:4: 'TYPE' ( typeDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal101=(Token)match(input,47,FOLLOW_47_in_typesDecl1137); 
            string_literal101_tree = (CommonTree)adaptor.create(string_literal101);
            adaptor.addChild(root_0, string_literal101_tree);

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:437:11: ( typeDecl )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:437:11: typeDecl
            	    {
            	    pushFollow(FOLLOW_typeDecl_in_typesDecl1139);
            	    typeDecl102=typeDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, typeDecl102.getTree());

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
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:439:1: varsDecl : 'VAR' ( varDecl )* ;
    public final Oberon0Parser.varsDecl_return varsDecl() throws RecognitionException {
        Oberon0Parser.varsDecl_return retval = new Oberon0Parser.varsDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal103=null;
        Oberon0Parser.varDecl_return varDecl104 = null;


        CommonTree string_literal103_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:440:2: ( 'VAR' ( varDecl )* )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:440:4: 'VAR' ( varDecl )*
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal103=(Token)match(input,43,FOLLOW_43_in_varsDecl1150); 
            string_literal103_tree = (CommonTree)adaptor.create(string_literal103);
            adaptor.addChild(root_0, string_literal103_tree);

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:440:10: ( varDecl )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:440:10: varDecl
            	    {
            	    pushFollow(FOLLOW_varDecl_in_varsDecl1152);
            	    varDecl104=varDecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, varDecl104.getTree());

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
        Map<String, ASTNode> constants;
        Map<String, ASTNode> types;
        Map<String, ASTNode> variables;
        Map<String, ASTNode> procedures;
    }
    protected Stack declarations_stack = new Stack();

    public static class declarations_return extends ParserRuleReturnScope {
        public Map<String, ASTNode> return_constants;
        public Map<String, ASTNode> return_types;
        public Map<String, ASTNode> return_variables;
        public Map<String, ASTNode> return_procs;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:443:1: declarations returns [Map<String, ASTNode> return_constants, Map<String, ASTNode> return_types, \n\t\t\t\t\t\t\t\t\t\t Map<String, ASTNode> return_variables, Map<String, ASTNode> return_procs] : ( constsDecl )? ( typesDecl )? ( varsDecl )? ( procedureDeclaration ';' )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        declarations_stack.push(new declarations_scope());
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal109=null;
        Oberon0Parser.constsDecl_return constsDecl105 = null;

        Oberon0Parser.typesDecl_return typesDecl106 = null;

        Oberon0Parser.varsDecl_return varsDecl107 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration108 = null;


        CommonTree char_literal109_tree=null;


        					((declarations_scope)declarations_stack.peek()).constants = new Hashtable() ;
        					((declarations_scope)declarations_stack.peek()).types = new Hashtable();
        					((declarations_scope)declarations_stack.peek()).variables = new Hashtable();
        					((declarations_scope)declarations_stack.peek()).procedures = new Hashtable();

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:2: ( ( constsDecl )? ( typesDecl )? ( varsDecl )? ( procedureDeclaration ';' )* )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:4: ( constsDecl )? ( typesDecl )? ( varsDecl )? ( procedureDeclaration ';' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:4: ( constsDecl )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:4: constsDecl
                    {
                    pushFollow(FOLLOW_constsDecl_in_declarations1176);
                    constsDecl105=constsDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, constsDecl105.getTree());

                    }
                    break;

            }

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:16: ( typesDecl )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:16: typesDecl
                    {
                    pushFollow(FOLLOW_typesDecl_in_declarations1179);
                    typesDecl106=typesDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, typesDecl106.getTree());

                    }
                    break;

            }

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:27: ( varsDecl )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:27: varsDecl
                    {
                    pushFollow(FOLLOW_varsDecl_in_declarations1182);
                    varsDecl107=varsDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, varsDecl107.getTree());

                    }
                    break;

            }

            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:37: ( procedureDeclaration ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:458:38: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1186);
            	    procedureDeclaration108=procedureDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedureDeclaration108.getTree());
            	    char_literal109=(Token)match(input,38,FOLLOW_38_in_declarations1188); 
            	    char_literal109_tree = (CommonTree)adaptor.create(char_literal109);
            	    adaptor.addChild(root_0, char_literal109_tree);


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
        List<ASTNode> statementsSeq;
    }
    protected Stack module_stack = new Stack();

    public static class module_return extends ParserRuleReturnScope {
        public ASTNode node;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:468:1: module returns [ASTNode node] : 'MODULE' start= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' end= IDENT '.' ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        module_stack.push(new module_scope());
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token start=null;
        Token end=null;
        Token string_literal110=null;
        Token char_literal111=null;
        Token string_literal113=null;
        Token string_literal115=null;
        Token char_literal116=null;
        Oberon0Parser.declarations_return declarations112 = null;

        Oberon0Parser.statementSequence_return statementSequence114 = null;


        CommonTree start_tree=null;
        CommonTree end_tree=null;
        CommonTree string_literal110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree string_literal113_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree char_literal116_tree=null;

        try {
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:473:2: ( 'MODULE' start= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' end= IDENT '.' )
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:473:4: 'MODULE' start= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' end= IDENT '.'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal110=(Token)match(input,48,FOLLOW_48_in_module1212); 
            string_literal110_tree = (CommonTree)adaptor.create(string_literal110);
            adaptor.addChild(root_0, string_literal110_tree);

            start=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1216); 
            start_tree = (CommonTree)adaptor.create(start);
            adaptor.addChild(root_0, start_tree);

            char_literal111=(Token)match(input,38,FOLLOW_38_in_module1218); 
            char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
            adaptor.addChild(root_0, char_literal111_tree);

            pushFollow(FOLLOW_declarations_in_module1220);
            declarations112=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations112.getTree());
            // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:473:42: ( 'BEGIN' statementSequence )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /school/construction/labassignment1/6354122/antlr-grammer/Oberon0.g:473:43: 'BEGIN' statementSequence
                    {
                    string_literal113=(Token)match(input,44,FOLLOW_44_in_module1223); 
                    string_literal113_tree = (CommonTree)adaptor.create(string_literal113);
                    adaptor.addChild(root_0, string_literal113_tree);

                    pushFollow(FOLLOW_statementSequence_in_module1225);
                    statementSequence114=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence114.getTree());

                    }
                    break;

            }

            string_literal115=(Token)match(input,35,FOLLOW_35_in_module1229); 
            string_literal115_tree = (CommonTree)adaptor.create(string_literal115);
            adaptor.addChild(root_0, string_literal115_tree);

            end=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1233); 
            end_tree = (CommonTree)adaptor.create(end);
            adaptor.addChild(root_0, end_tree);

            char_literal116=(Token)match(input,10,FOLLOW_10_in_module1235); 
            char_literal116_tree = (CommonTree)adaptor.create(char_literal116);
            adaptor.addChild(root_0, char_literal116_tree);


            		// Create an empty statement sequence list if there is no statement sequence list
            		if (statementSequence_stack!=null){
            				if ((statementSequence114!=null?statementSequence114.return_statements:null) != null){
            					((module_scope)module_stack.peek()).statementsSeq = (statementSequence114!=null?statementSequence114.return_statements:null);
            				} else{
            					((module_scope)module_stack.peek()).statementsSeq = new LinkedList();
            				}
            		} else {
            			((module_scope)module_stack.peek()).statementsSeq = new LinkedList();
            		}
            		// Create the modulenode with all required fields
            		((module_scope)module_stack.peek()).moduleNode = new ModuleNode(	(start!=null?start.getText():null), (end!=null?end.getText():null),	(declarations112!=null?declarations112.return_constants:null),
            						(declarations112!=null?declarations112.return_types:null),	(declarations112!=null?declarations112.return_variables:null),
            						(declarations112!=null?declarations112.return_procs:null),	((module_scope)module_stack.peek()).statementsSeq );
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
    public static final BitSet FOLLOW_selectorPart_in_selector110 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_IDENT_in_identSelector129 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_selector_in_identSelector131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identSelector_in_factor148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_factor162 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_factor164 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_factor166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_factor173 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_factor_in_factor178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term198 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_16_in_term206 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_17_in_term213 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_18_in_term220 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_19_in_term227 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_factor_in_term234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termList256 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_20_in_termList264 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_21_in_termList270 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_22_in_termList276 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_term_in_termList283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_negation303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_simpleExpression327 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_negation_in_simpleExpression331 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_termList_in_simpleExpression339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression362 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_23_in_expression370 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_24_in_expression376 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_25_in_expression382 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_26_in_expression388 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_27_in_expression394 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_28_in_expression400 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_simpleExpression_in_expression407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identSelector_in_assignment428 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assignment430 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_assignment432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_actualParametersFollowUp448 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_actualParametersFollowUp450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_actualParameters476 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_actualParameters480 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_actualParametersFollowUp_in_actualParameters487 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_actualParameters492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall515 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_elsIfPart532 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_elsIfPart534 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_elsIfPart536 = new BitSet(new long[]{0x0000005400000020L});
    public static final BitSet FOLLOW_statementSequence_in_elsIfPart538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_elsePart552 = new BitSet(new long[]{0x0000005400000020L});
    public static final BitSet FOLLOW_statementSequence_in_elsePart554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ifStatement574 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_ifStatement576 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ifStatement578 = new BitSet(new long[]{0x0000005400000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement580 = new BitSet(new long[]{0x0000000A80000000L});
    public static final BitSet FOLLOW_elsIfPart_in_ifStatement586 = new BitSet(new long[]{0x0000000A80000000L});
    public static final BitSet FOLLOW_elsePart_in_ifStatement590 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifStatement594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_whileStatement614 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_whileStatement616 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_whileStatement618 = new BitSet(new long[]{0x0000005400000020L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement620 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_whileStatement622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_statementSequenceFollowUp684 = new BitSet(new long[]{0x0000001400000020L});
    public static final BitSet FOLLOW_statement_in_statementSequenceFollowUp686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence714 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_statementSequenceFollowUp_in_statementSequence719 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList741 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_identList744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identList748 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_39_in_arrayType770 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_arrayType772 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_arrayType774 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_type_in_arrayType776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList802 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_fieldList804 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_type_in_fieldList806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_recordTypeFollowUp822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_fieldList_in_recordTypeFollowUp824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_recordType850 = new BitSet(new long[]{0x0000004800000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType853 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_recordTypeFollowUp_in_recordType860 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_35_in_recordType864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_fpSection917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_fieldList_in_fpSection921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_formalParametersFollowUp936 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_fpSection_in_formalParametersFollowUp938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_formalParameters963 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters967 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_formalParametersFollowUp_in_formalParameters972 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_14_in_formalParameters977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody995 = new BitSet(new long[]{0x0000100800000000L});
    public static final BitSet FOLLOW_44_in_procedureBody998 = new BitSet(new long[]{0x0000005400000020L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1000 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_procedureBody1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureDeclaration1019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1023 = new BitSet(new long[]{0x0000004000002000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1025 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procedureDeclaration1028 = new BitSet(new long[]{0x0000F80800000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1030 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDecl1049 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_constDecl1051 = new BitSet(new long[]{0x000000000030A060L});
    public static final BitSet FOLLOW_expression_in_constDecl1053 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_constDecl1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDecl1074 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_typeDecl1076 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_type_in_typeDecl1078 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_typeDecl1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_varDecl1098 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_varDecl1100 = new BitSet(new long[]{0x0000048000000020L});
    public static final BitSet FOLLOW_type_in_varDecl1102 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_varDecl1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_constsDecl1121 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_constDecl_in_constsDecl1123 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_47_in_typesDecl1137 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_typeDecl_in_typesDecl1139 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_43_in_varsDecl1150 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_varDecl_in_varsDecl1152 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_constsDecl_in_declarations1176 = new BitSet(new long[]{0x0000A80000000002L});
    public static final BitSet FOLLOW_typesDecl_in_declarations1179 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_varsDecl_in_declarations1182 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1186 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_declarations1188 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_48_in_module1212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1216 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_module1218 = new BitSet(new long[]{0x0000F80800000000L});
    public static final BitSet FOLLOW_declarations_in_module1220 = new BitSet(new long[]{0x0000100800000000L});
    public static final BitSet FOLLOW_44_in_module1223 = new BitSet(new long[]{0x0000005400000020L});
    public static final BitSet FOLLOW_statementSequence_in_module1225 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_module1229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1233 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module1235 = new BitSet(new long[]{0x0000000000000002L});

}