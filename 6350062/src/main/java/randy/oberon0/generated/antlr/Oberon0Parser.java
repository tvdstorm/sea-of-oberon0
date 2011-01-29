// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g 2011-01-29 14:10:23

package randy.oberon0.generated.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

@SuppressWarnings("all")
public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TRUE", "FALSE", "NIL", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "POINTERTO", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "NOTEQUALS", "SMALLERTHEN", "GREATERTHEN", "SMALLEREQUALS", "GREATEREQUALS", "NOT", "REFVAR", "PROCEDURECALL", "PARAMETERS", "EXPRESSION", "BODY", "LH", "RH", "DOTSELECTOR", "ARRAYSELECTOR", "IDENT", "WHITESPACE", "INTEGER", "']'", "'('", "')'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int TRUE=4;
    public static final int FALSE=5;
    public static final int NIL=6;
    public static final int MINUS=7;
    public static final int PLUS=8;
    public static final int TIMES=9;
    public static final int DIVIDE=10;
    public static final int CONST=11;
    public static final int VAR=12;
    public static final int TYPE=13;
    public static final int IF=14;
    public static final int THEN=15;
    public static final int ELSE=16;
    public static final int ELSIF=17;
    public static final int END=18;
    public static final int MODULE=19;
    public static final int DO=20;
    public static final int WHILE=21;
    public static final int BEGIN=22;
    public static final int PROCEDURE=23;
    public static final int ARRAY=24;
    public static final int OF=25;
    public static final int RECORD=26;
    public static final int POINTERTO=27;
    public static final int MOD=28;
    public static final int AND=29;
    public static final int OR=30;
    public static final int ASSIGNMENT=31;
    public static final int EQUALS=32;
    public static final int NOTEQUALS=33;
    public static final int SMALLERTHEN=34;
    public static final int GREATERTHEN=35;
    public static final int SMALLEREQUALS=36;
    public static final int GREATEREQUALS=37;
    public static final int NOT=38;
    public static final int REFVAR=39;
    public static final int PROCEDURECALL=40;
    public static final int PARAMETERS=41;
    public static final int EXPRESSION=42;
    public static final int BODY=43;
    public static final int LH=44;
    public static final int RH=45;
    public static final int DOTSELECTOR=46;
    public static final int ARRAYSELECTOR=47;
    public static final int IDENT=48;
    public static final int WHITESPACE=49;
    public static final int INTEGER=50;

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
    public String getGrammarFileName() { return "D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g"; }


    public static class ws_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ws"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:72:1: ws : ( WHITESPACE )* ;
    public final Oberon0Parser.ws_return ws() throws RecognitionException {
        Oberon0Parser.ws_return retval = new Oberon0Parser.ws_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHITESPACE1=null;

        CommonTree WHITESPACE1_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:72:3: ( ( WHITESPACE )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:72:7: ( WHITESPACE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:72:7: ( WHITESPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WHITESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:72:8: WHITESPACE
            	    {
            	    WHITESPACE1=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_ws375); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    WHITESPACE1_tree = (CommonTree)adaptor.create(WHITESPACE1);
            	    adaptor.addChild(root_0, WHITESPACE1_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ws"

    public static class ident_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ident"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:1: ident : IDENT ;
    public final Oberon0Parser.ident_return ident() throws RecognitionException {
        Oberon0Parser.ident_return retval = new Oberon0Parser.ident_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT2=null;

        CommonTree IDENT2_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:6: ( IDENT )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:10: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident385); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT2_tree = (CommonTree)adaptor.create(IDENT2);
            adaptor.addChild(root_0, IDENT2_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ident"

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:1: selector : ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+ | ident );
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOTSELECTOR4=null;
        Token ARRAYSELECTOR6=null;
        Token char_literal8=null;
        Oberon0Parser.ident_return ident3 = null;

        Oberon0Parser.ident_return ident5 = null;

        Oberon0Parser.expression_return expression7 = null;

        Oberon0Parser.ident_return ident9 = null;


        CommonTree DOTSELECTOR4_tree=null;
        CommonTree ARRAYSELECTOR6_tree=null;
        CommonTree char_literal8_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:9: ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+ | ident )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=DOTSELECTOR && LA3_1<=ARRAYSELECTOR)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||(LA3_1>=MINUS && LA3_1<=DIVIDE)||(LA3_1>=THEN && LA3_1<=END)||LA3_1==DO||LA3_1==OF||(LA3_1>=MOD && LA3_1<=GREATEREQUALS)||(LA3_1>=51 && LA3_1<=55)) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:12: ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector404);
                    ident3=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident3.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:18: ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==DOTSELECTOR) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==ARRAYSELECTOR) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:19: ( DOTSELECTOR ident )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:19: ( DOTSELECTOR ident )
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:20: DOTSELECTOR ident
                    	    {
                    	    DOTSELECTOR4=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector408); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR4_tree = (CommonTree)adaptor.create(DOTSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_ident_in_selector411);
                    	    ident5=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident5.getTree());

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:40: ( ARRAYSELECTOR expression ']' )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:40: ( ARRAYSELECTOR expression ']' )
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:41: ARRAYSELECTOR expression ']'
                    	    {
                    	    ARRAYSELECTOR6=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector415); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR6_tree = (CommonTree)adaptor.create(ARRAYSELECTOR6);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR6_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_selector418);
                    	    expression7=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression7.getTree());
                    	    char_literal8=(Token)match(input,51,FOLLOW_51_in_selector420); if (state.failed) return retval;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:77: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector428);
                    ident9=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class numberLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numberLiteral"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:1: numberLiteral : INTEGER ;
    public final Oberon0Parser.numberLiteral_return numberLiteral() throws RecognitionException {
        Oberon0Parser.numberLiteral_return retval = new Oberon0Parser.numberLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER10=null;

        CommonTree INTEGER10_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:14: ( INTEGER )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:17: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER10=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numberLiteral435); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER10_tree = (CommonTree)adaptor.create(INTEGER10);
            adaptor.addChild(root_0, INTEGER10_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numberLiteral"

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:1: booleanLiteral : ( TRUE | FALSE );
    public final Oberon0Parser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        Oberon0Parser.booleanLiteral_return retval = new Oberon0Parser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:15: ( TRUE | FALSE )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set11));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "booleanLiteral"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:1: factor : ( selector | NIL | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NIL13=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token NOT19=null;
        Oberon0Parser.selector_return selector12 = null;

        Oberon0Parser.booleanLiteral_return booleanLiteral14 = null;

        Oberon0Parser.numberLiteral_return numberLiteral15 = null;

        Oberon0Parser.expression_return expression17 = null;

        Oberon0Parser.factor_return factor20 = null;


        CommonTree NIL13_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree NOT19_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:7: ( selector | NIL | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor )
            int alt4=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt4=1;
                }
                break;
            case NIL:
                {
                alt4=2;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt4=3;
                }
                break;
            case INTEGER:
                {
                alt4=4;
                }
                break;
            case 52:
                {
                alt4=5;
                }
                break;
            case NOT:
                {
                alt4=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor452);
                    selector12=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector12.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:22: NIL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NIL13=(Token)match(input,NIL,FOLLOW_NIL_in_factor456); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NIL13_tree = (CommonTree)adaptor.create(NIL13);
                    adaptor.addChild(root_0, NIL13_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:28: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_factor460);
                    booleanLiteral14=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral14.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:45: numberLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numberLiteral_in_factor464);
                    numberLiteral15=numberLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numberLiteral15.getTree());

                    }
                    break;
                case 5 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:61: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal16=(Token)match(input,52,FOLLOW_52_in_factor468); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor471);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression17.getTree());
                    char_literal18=(Token)match(input,53,FOLLOW_53_in_factor473); if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:84: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT19=(Token)match(input,NOT,FOLLOW_NOT_in_factor478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT19_tree = (CommonTree)adaptor.create(NOT19);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT19_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor481);
                    factor20=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor20.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set22=null;
        Oberon0Parser.factor_return factor21 = null;

        Oberon0Parser.factor_return factor23 = null;


        CommonTree set22_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:9: factor ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term489);
            factor21=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor21.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:16: ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=TIMES && LA5_0<=DIVIDE)||(LA5_0>=MOD && LA5_0<=AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:17: ( TIMES | DIVIDE | MOD | AND ) factor
            	    {
            	    set22=(Token)input.LT(1);
            	    set22=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIVIDE)||(input.LA(1)>=MOD && input.LA(1)<=AND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set22), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term503);
            	    factor23=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor23.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS24=null;
        Token MINUS25=null;
        Token set27=null;
        Oberon0Parser.term_return term26 = null;

        Oberon0Parser.term_return term28 = null;


        CommonTree PLUS24_tree=null;
        CommonTree MINUS25_tree=null;
        CommonTree set27_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:17: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:19: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:19: ( PLUS | MINUS )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==PLUS) ) {
                alt6=1;
            }
            else if ( (LA6_0==MINUS) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:20: PLUS
                    {
                    PLUS24=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS24_tree = (CommonTree)adaptor.create(PLUS24);
                    adaptor.addChild(root_0, PLUS24_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:25: MINUS
                    {
                    MINUS25=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression514); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS25_tree = (CommonTree)adaptor.create(MINUS25);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS25_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression520);
            term26=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term26.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:40: ( ( PLUS | MINUS | OR ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MINUS && LA7_0<=PLUS)||LA7_0==OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:41: ( PLUS | MINUS | OR ) term
            	    {
            	    set27=(Token)input.LT(1);
            	    set27=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS)||input.LA(1)==OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set27), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression533);
            	    term28=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class infixOperand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "infixOperand"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:1: infixOperand : ( EQUALS | NOTEQUALS | SMALLERTHEN | SMALLEREQUALS | GREATERTHEN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:13: ( EQUALS | NOTEQUALS | SMALLERTHEN | SMALLEREQUALS | GREATERTHEN | GREATEREQUALS )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set29=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUALS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set29));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "infixOperand"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression30 = null;

        Oberon0Parser.infixOperand_return infixOperand31 = null;

        Oberon0Parser.simpleExpression_return simpleExpression32 = null;

        Oberon0Parser.simpleExpression_return simpleExpression33 = null;


        RewriteRuleSubtreeStream stream_infixOperand=new RewriteRuleSubtreeStream(adaptor,"rule infixOperand");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:11: ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:14: simpleExpression infixOperand simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression569);
                    simpleExpression30=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression30.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression571);
                    infixOperand31=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand31.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression573);
                    simpleExpression32=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression32.getTree());


                    // AST REWRITE
                    // elements: simpleExpression, simpleExpression, infixOperand
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:5: -> ^( infixOperand simpleExpression simpleExpression )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:83:8: ^( infixOperand simpleExpression simpleExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_infixOperand.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());
                        adaptor.addChild(root_1, stream_simpleExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression595);
                    simpleExpression33=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression33.getTree());


                    // AST REWRITE
                    // elements: simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:5: -> simpleExpression
                    {
                        adaptor.addChild(root_0, stream_simpleExpression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class actualParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Oberon0Parser.expression_return expression35 = null;

        Oberon0Parser.expression_return expression37 = null;


        CommonTree char_literal34_tree=null;
        CommonTree char_literal36_tree=null;
        CommonTree char_literal38_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:17: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:19: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal34=(Token)match(input,52,FOLLOW_52_in_actualParameters609); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal34);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:23: ( expression ( ',' expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=TRUE && LA10_0<=PLUS)||LA10_0==NOT||LA10_0==IDENT||LA10_0==INTEGER||LA10_0==52) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:24: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters612);
                    expression35=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression35.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:35: ( ',' expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==54) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:36: ',' expression
                    	    {
                    	    char_literal36=(Token)match(input,54,FOLLOW_54_in_actualParameters615); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_54.add(char_literal36);

                    	    pushFollow(FOLLOW_expression_in_actualParameters617);
                    	    expression37=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal38=(Token)match(input,53,FOLLOW_53_in_actualParameters623); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal38);



            // AST REWRITE
            // elements: expression, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 87:5: -> ( expression ( expression )* )?
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:8: ( expression ( expression )* )?
                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:20: ( expression )*
                    while ( stream_expression.hasNext() ) {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }
                    stream_expression.reset();

                }
                stream_expression.reset();
                stream_expression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF39=null;
        Token THEN41=null;
        Token ELSIF43=null;
        Token THEN45=null;
        Token ELSE47=null;
        Token END49=null;
        Token IF50=null;
        Token THEN52=null;
        Token ELSIF54=null;
        Token THEN56=null;
        Token END58=null;
        Token IF59=null;
        Token THEN61=null;
        Token ELSE63=null;
        Token END65=null;
        Token IF66=null;
        Token THEN68=null;
        Token END70=null;
        Oberon0Parser.expression_return expression40 = null;

        Oberon0Parser.statementSequence_return statementSequence42 = null;

        Oberon0Parser.expression_return expression44 = null;

        Oberon0Parser.statementSequence_return statementSequence46 = null;

        Oberon0Parser.statementSequence_return statementSequence48 = null;

        Oberon0Parser.expression_return expression51 = null;

        Oberon0Parser.statementSequence_return statementSequence53 = null;

        Oberon0Parser.expression_return expression55 = null;

        Oberon0Parser.statementSequence_return statementSequence57 = null;

        Oberon0Parser.expression_return expression60 = null;

        Oberon0Parser.statementSequence_return statementSequence62 = null;

        Oberon0Parser.statementSequence_return statementSequence64 = null;

        Oberon0Parser.expression_return expression67 = null;

        Oberon0Parser.statementSequence_return statementSequence69 = null;


        CommonTree IF39_tree=null;
        CommonTree THEN41_tree=null;
        CommonTree ELSIF43_tree=null;
        CommonTree THEN45_tree=null;
        CommonTree ELSE47_tree=null;
        CommonTree END49_tree=null;
        CommonTree IF50_tree=null;
        CommonTree THEN52_tree=null;
        CommonTree ELSIF54_tree=null;
        CommonTree THEN56_tree=null;
        CommonTree END58_tree=null;
        CommonTree IF59_tree=null;
        CommonTree THEN61_tree=null;
        CommonTree ELSE63_tree=null;
        CommonTree END65_tree=null;
        CommonTree IF66_tree=null;
        CommonTree THEN68_tree=null;
        CommonTree END70_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IF) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred29_Oberon0()) ) {
                    alt13=1;
                }
                else if ( (synpred31_Oberon0()) ) {
                    alt13=2;
                }
                else if ( (synpred32_Oberon0()) ) {
                    alt13=3;
                }
                else if ( (true) ) {
                    alt13=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF39=(Token)match(input,IF,FOLLOW_IF_in_ifStatement646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF39);

                    pushFollow(FOLLOW_expression_in_ifStatement648);
                    expression40=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression40.getTree());
                    THEN41=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN41);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement652);
                    statementSequence42=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence42.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:52: ( ELSIF expression THEN statementSequence )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ELSIF) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:53: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF43=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement655); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF43);

                    	    pushFollow(FOLLOW_expression_in_ifStatement657);
                    	    expression44=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression44.getTree());
                    	    THEN45=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement659); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN45);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement661);
                    	    statementSequence46=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:95: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:96: ELSE statementSequence
                    {
                    ELSE47=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement666); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE47);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement668);
                    statementSequence48=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence48.getTree());

                    }

                    END49=(Token)match(input,END,FOLLOW_END_in_ifStatement671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END49);



                    // AST REWRITE
                    // elements: statementSequence, expression, statementSequence, ELSIF, ELSE, statementSequence, IF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:38: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_expression.hasNext()||stream_ELSIF.hasNext()||stream_statementSequence.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext()||stream_ELSIF.hasNext()||stream_statementSequence.hasNext() ) {
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:64: ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:72: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:97: ^( BODY statementSequence )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_3);

                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_expression.reset();
                        stream_ELSIF.reset();
                        stream_statementSequence.reset();
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:125: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:132: ^( BODY statementSequence )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_3);

                        adaptor.addChild(root_3, stream_statementSequence.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF50=(Token)match(input,IF,FOLLOW_IF_in_ifStatement727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF50);

                    pushFollow(FOLLOW_expression_in_ifStatement729);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression51.getTree());
                    THEN52=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement731); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN52);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement733);
                    statementSequence53=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence53.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:41: ( ELSIF expression THEN statementSequence )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==ELSIF) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:42: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF54=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement736); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF54);

                    	    pushFollow(FOLLOW_expression_in_ifStatement738);
                    	    expression55=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression55.getTree());
                    	    THEN56=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement740); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN56);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement742);
                    	    statementSequence57=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence57.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    END58=(Token)match(input,END,FOLLOW_END_in_ifStatement746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END58);



                    // AST REWRITE
                    // elements: statementSequence, statementSequence, expression, expression, ELSIF, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:38: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext() ) {
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:64: ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:72: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:97: ^( BODY statementSequence )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_3);

                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_statementSequence.reset();
                        stream_expression.reset();
                        stream_ELSIF.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF59=(Token)match(input,IF,FOLLOW_IF_in_ifStatement792); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF59);

                    pushFollow(FOLLOW_expression_in_ifStatement794);
                    expression60=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression60.getTree());
                    THEN61=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN61);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement798);
                    statementSequence62=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence62.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:41: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:42: ELSE statementSequence
                    {
                    ELSE63=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement801); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE63);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement803);
                    statementSequence64=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence64.getTree());

                    }

                    END65=(Token)match(input,END,FOLLOW_END_in_ifStatement806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END65);



                    // AST REWRITE
                    // elements: statementSequence, expression, IF, ELSE, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 93:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:37: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:63: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:70: ^( BODY statementSequence )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_3);

                        adaptor.addChild(root_3, stream_statementSequence.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:4: IF expression THEN statementSequence END
                    {
                    IF66=(Token)match(input,IF,FOLLOW_IF_in_ifStatement844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF66);

                    pushFollow(FOLLOW_expression_in_ifStatement846);
                    expression67=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression67.getTree());
                    THEN68=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN68);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement850);
                    statementSequence69=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence69.getTree());
                    END70=(Token)match(input,END,FOLLOW_END_in_ifStatement852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END70);



                    // AST REWRITE
                    // elements: expression, IF, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 95:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:95:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:95:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:95:38: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE71=null;
        Token DO73=null;
        Token END75=null;
        Oberon0Parser.expression_return expression72 = null;

        Oberon0Parser.statementSequence_return statementSequence74 = null;


        CommonTree WHILE71_tree=null;
        CommonTree DO73_tree=null;
        CommonTree END75_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:15: ( WHILE expression DO statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:18: WHILE expression DO statementSequence END
            {
            WHILE71=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement881); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE71);

            pushFollow(FOLLOW_expression_in_whileStatement883);
            expression72=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression72.getTree());
            DO73=(Token)match(input,DO,FOLLOW_DO_in_whileStatement885); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO73);

            pushFollow(FOLLOW_statementSequence_in_whileStatement887);
            statementSequence74=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence74.getTree());
            END75=(Token)match(input,END,FOLLOW_END_in_whileStatement889); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END75);



            // AST REWRITE
            // elements: expression, statementSequence, WHILE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:5: -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:97:8: ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:97:16: ^( EXPRESSION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:97:41: ^( BODY statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                adaptor.addChild(root_2, stream_statementSequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGNMENT77=null;
        Oberon0Parser.selector_return selector76 = null;

        Oberon0Parser.expression_return expression78 = null;


        CommonTree ASSIGNMENT77_tree=null;
        RewriteRuleTokenStream stream_ASSIGNMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGNMENT");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment918);
            selector76=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector76.getTree());
            ASSIGNMENT77=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment920); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT77);

            pushFollow(FOLLOW_expression_in_assignment922);
            expression78=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression78.getTree());


            // AST REWRITE
            // elements: selector, expression, ASSIGNMENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 99:5: -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:8: ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGNMENT.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:21: ^( LH selector )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LH, "LH"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:36: ^( RH expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RH, "RH"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class procedureCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:1: procedureCall : selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector79 = null;

        Oberon0Parser.actualParameters_return actualParameters80 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:14: ( selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall951);
            selector79=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector79.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:26: ( actualParameters )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall954);
                    actualParameters80=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters80.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: actualParameters, selector
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:5: -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:8: ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:21: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:46: ( actualParameters )?
                if ( stream_actualParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_actualParameters.nextTree());

                }
                stream_actualParameters.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment81 = null;

        Oberon0Parser.procedureCall_return procedureCall82 = null;

        Oberon0Parser.ifStatement_return ifStatement83 = null;

        Oberon0Parser.whileStatement_return whileStatement84 = null;



        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:10: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement983);
                    assignment81=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment81.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement987);
                    procedureCall82=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall82.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement990);
                    ifStatement83=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement83.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement994);
                    whileStatement84=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement84.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal86=null;
        Oberon0Parser.statement_return statement85 = null;

        Oberon0Parser.statement_return statement87 = null;


        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:18: ( statement ( ';' statement )* -> statement ( statement )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:20: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence1002);
            statement85=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement85.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:30: ( ';' statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==55) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:31: ';' statement
            	    {
            	    char_literal86=(Token)match(input,55,FOLLOW_55_in_statementSequence1005); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal86);

            	    pushFollow(FOLLOW_statement_in_statementSequence1007);
            	    statement87=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement87.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: statement, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:5: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:104:18: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_0, stream_statement.nextTree());

                }
                stream_statement.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:1: identList : ident ( ',' ident )* -> ident ( ident )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal89=null;
        Oberon0Parser.ident_return ident88 = null;

        Oberon0Parser.ident_return ident90 = null;


        CommonTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:10: ( ident ( ',' ident )* -> ident ( ident )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:13: ident ( ',' ident )*
            {
            pushFollow(FOLLOW_ident_in_identList1029);
            ident88=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident88.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:19: ( ',' ident )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==54) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:21: ',' ident
            	    {
            	    char_literal89=(Token)match(input,54,FOLLOW_54_in_identList1033); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_54.add(char_literal89);

            	    pushFollow(FOLLOW_ident_in_identList1035);
            	    ident90=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident90.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: ident, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:5: -> ident ( ident )*
            {
                adaptor.addChild(root_0, stream_ident.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:106:14: ( ident )*
                while ( stream_ident.hasNext() ) {
                    adaptor.addChild(root_0, stream_ident.nextTree());

                }
                stream_ident.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:1: arrayType : ARRAY expression OF type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY91=null;
        Token OF93=null;
        Oberon0Parser.expression_return expression92 = null;

        Oberon0Parser.type_return type94 = null;


        CommonTree ARRAY91_tree=null;
        CommonTree OF93_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:10: ( ARRAY expression OF type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:13: ARRAY expression OF type
            {
            ARRAY91=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1057); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY91);

            pushFollow(FOLLOW_expression_in_arrayType1059);
            expression92=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression92.getTree());
            OF93=(Token)match(input,OF,FOLLOW_OF_in_arrayType1061); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF93);

            pushFollow(FOLLOW_type_in_arrayType1063);
            type94=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type94.getTree());


            // AST REWRITE
            // elements: type, ARRAY, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 108:5: -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:8: ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:16: ^( TYPE type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:29: ^( EXPRESSION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:1: fieldList : ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal96=null;
        Oberon0Parser.identList_return identList95 = null;

        Oberon0Parser.type_return type97 = null;


        CommonTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:10: ( ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:13: ( identList ':' type )?
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:13: ( identList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:14: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1093);
                    identList95=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList95.getTree());
                    char_literal96=(Token)match(input,56,FOLLOW_56_in_fieldList1095); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal96);

                    pushFollow(FOLLOW_type_in_fieldList1097);
                    type97=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type97.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: type, identList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:5: -> ^( VAR ( type )? ( identList )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:110:8: ^( VAR ( type )? ( identList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:110:14: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:110:20: ( identList )?
                if ( stream_identList.hasNext() ) {
                    adaptor.addChild(root_1, stream_identList.nextTree());

                }
                stream_identList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:1: recordType : RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD98=null;
        Token char_literal100=null;
        Token END102=null;
        Oberon0Parser.fieldList_return fieldList99 = null;

        Oberon0Parser.fieldList_return fieldList101 = null;


        CommonTree RECORD98_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree END102_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:11: ( RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:14: RECORD fieldList ( ';' fieldList )* END
            {
            RECORD98=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1123); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD98);

            pushFollow(FOLLOW_fieldList_in_recordType1125);
            fieldList99=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList99.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:31: ( ';' fieldList )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:32: ';' fieldList
            	    {
            	    char_literal100=(Token)match(input,55,FOLLOW_55_in_recordType1128); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal100);

            	    pushFollow(FOLLOW_fieldList_in_recordType1130);
            	    fieldList101=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList101.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            END102=(Token)match(input,END,FOLLOW_END_in_recordType1134); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END102);



            // AST REWRITE
            // elements: RECORD, fieldList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:5: -> ^( RECORD ( fieldList )* )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:8: ^( RECORD ( fieldList )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:17: ( fieldList )*
                while ( stream_fieldList.hasNext() ) {
                    adaptor.addChild(root_1, stream_fieldList.nextTree());

                }
                stream_fieldList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class pointerType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pointerType"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:1: pointerType : POINTERTO ident -> ^( POINTERTO ident ) ;
    public final Oberon0Parser.pointerType_return pointerType() throws RecognitionException {
        Oberon0Parser.pointerType_return retval = new Oberon0Parser.pointerType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POINTERTO103=null;
        Oberon0Parser.ident_return ident104 = null;


        CommonTree POINTERTO103_tree=null;
        RewriteRuleTokenStream stream_POINTERTO=new RewriteRuleTokenStream(adaptor,"token POINTERTO");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:12: ( POINTERTO ident -> ^( POINTERTO ident ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:15: POINTERTO ident
            {
            POINTERTO103=(Token)match(input,POINTERTO,FOLLOW_POINTERTO_in_pointerType1154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POINTERTO.add(POINTERTO103);

            pushFollow(FOLLOW_ident_in_pointerType1156);
            ident104=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident104.getTree());


            // AST REWRITE
            // elements: ident, POINTERTO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:5: -> ^( POINTERTO ident )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:114:8: ^( POINTERTO ident )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_POINTERTO.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pointerType"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:1: type : ( ident | arrayType | recordType | pointerType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.ident_return ident105 = null;

        Oberon0Parser.arrayType_return arrayType106 = null;

        Oberon0Parser.recordType_return recordType107 = null;

        Oberon0Parser.pointerType_return pointerType108 = null;



        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:5: ( ident | arrayType | recordType | pointerType )
            int alt20=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt20=1;
                }
                break;
            case ARRAY:
                {
                alt20=2;
                }
                break;
            case RECORD:
                {
                alt20=3;
                }
                break;
            case POINTERTO:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:9: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_type1176);
                    ident105=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident105.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:17: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1180);
                    arrayType106=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType106.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:29: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1184);
                    recordType107=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType107.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:42: pointerType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pointerType_in_type1188);
                    pointerType108=pointerType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointerType108.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class fPSection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fPSection"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:1: fPSection : ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) );
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR109=null;
        Token char_literal111=null;
        Token char_literal114=null;
        Oberon0Parser.identList_return identList110 = null;

        Oberon0Parser.type_return type112 = null;

        Oberon0Parser.identList_return identList113 = null;

        Oberon0Parser.type_return type115 = null;


        CommonTree VAR109_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:10: ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==VAR) ) {
                alt21=1;
            }
            else if ( (LA21_0==IDENT) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:13: VAR identList ':' type
                    {
                    VAR109=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1195); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR109);

                    pushFollow(FOLLOW_identList_in_fPSection1197);
                    identList110=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList110.getTree());
                    char_literal111=(Token)match(input,56,FOLLOW_56_in_fPSection1199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal111);

                    pushFollow(FOLLOW_type_in_fPSection1201);
                    type112=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type112.getTree());


                    // AST REWRITE
                    // elements: identList, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 117:5: -> ^( REFVAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:8: ^( REFVAR type identList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(REFVAR, "REFVAR"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_identList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:118:4: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1222);
                    identList113=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList113.getTree());
                    char_literal114=(Token)match(input,56,FOLLOW_56_in_fPSection1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_56.add(char_literal114);

                    pushFollow(FOLLOW_type_in_fPSection1226);
                    type115=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type115.getTree());


                    // AST REWRITE
                    // elements: identList, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 119:5: -> ^( VAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:8: ^( VAR type identList )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());
                        adaptor.addChild(root_1, stream_identList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fPSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal116=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Oberon0Parser.fPSection_return fPSection117 = null;

        Oberon0Parser.fPSection_return fPSection119 = null;


        CommonTree char_literal116_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal120_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:17: ( '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:19: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            char_literal116=(Token)match(input,52,FOLLOW_52_in_formalParameters1246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal116);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:23: ( fPSection ( ';' fPSection )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR||LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:24: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1249);
                    fPSection117=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection117.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:34: ( ';' fPSection )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==55) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:35: ';' fPSection
                    	    {
                    	    char_literal118=(Token)match(input,55,FOLLOW_55_in_formalParameters1252); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_55.add(char_literal118);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1254);
                    	    fPSection119=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection119.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal120=(Token)match(input,53,FOLLOW_53_in_formalParameters1260); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal120);



            // AST REWRITE
            // elements: fPSection, fPSection
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:32: ( fPSection )*
                    while ( stream_fPSection.hasNext() ) {
                        adaptor.addChild(root_1, stream_fPSection.nextTree());

                    }
                    stream_fPSection.reset();

                }
                stream_fPSection.reset();
                stream_fPSection.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class procedureBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:1: procedureBody : BEGIN statementSequence -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN121=null;
        Oberon0Parser.statementSequence_return statementSequence122 = null;


        CommonTree BEGIN121_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:14: ( BEGIN statementSequence -> ^( BODY statementSequence ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:17: BEGIN statementSequence
            {
            BEGIN121=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN121);

            pushFollow(FOLLOW_statementSequence_in_procedureBody1289);
            statementSequence122=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence122.getTree());


            // AST REWRITE
            // elements: statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 123:5: -> ^( BODY statementSequence )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:123:8: ^( BODY statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_1);

                adaptor.addChild(root_1, stream_statementSequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:1: procedureDeclaration : PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE123=null;
        Token char_literal126=null;
        Token END129=null;
        Oberon0Parser.ident_return ident124 = null;

        Oberon0Parser.formalParameters_return formalParameters125 = null;

        Oberon0Parser.declarations_return declarations127 = null;

        Oberon0Parser.procedureBody_return procedureBody128 = null;

        Oberon0Parser.ident_return ident130 = null;


        CommonTree PROCEDURE123_tree=null;
        CommonTree char_literal126_tree=null;
        CommonTree END129_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:21: ( PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:23: PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident
            {
            PROCEDURE123=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE123);

            pushFollow(FOLLOW_ident_in_procedureDeclaration1309);
            ident124=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident124.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:39: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:41: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1313);
                    formalParameters125=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters125.getTree());

                    }
                    break;

            }

            char_literal126=(Token)match(input,55,FOLLOW_55_in_procedureDeclaration1317); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal126);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration1319);
            declarations127=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations127.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:77: ( procedureBody )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BEGIN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:78: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1322);
                    procedureBody128=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody128.getTree());

                    }
                    break;

            }

            END129=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END129);

            pushFollow(FOLLOW_ident_in_procedureDeclaration1328);
            ident130=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident130.getTree());


            // AST REWRITE
            // elements: procedureBody, declarations, formalParameters, PROCEDURE, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:5: -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:125:8: ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:125:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:125:46: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:125:60: ( procedureBody )?
                if ( stream_procedureBody.hasNext() ) {
                    adaptor.addChild(root_1, stream_procedureBody.nextTree());

                }
                stream_procedureBody.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class constDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constDeclaration"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:1: constDeclaration : ( CONST ( ident '=' expression ';' )* ) -> ( ^( CONST ident expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST131=null;
        Token char_literal133=null;
        Token char_literal135=null;
        Oberon0Parser.ident_return ident132 = null;

        Oberon0Parser.expression_return expression134 = null;


        CommonTree CONST131_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:17: ( ( CONST ( ident '=' expression ';' )* ) -> ( ^( CONST ident expression ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:19: ( CONST ( ident '=' expression ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:19: ( CONST ( ident '=' expression ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:20: CONST ( ident '=' expression ';' )*
            {
            CONST131=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST131);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:26: ( ident '=' expression ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:27: ident '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_constDeclaration1364);
            	    ident132=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident132.getTree());
            	    char_literal133=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1366); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal133);

            	    pushFollow(FOLLOW_expression_in_constDeclaration1368);
            	    expression134=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression134.getTree());
            	    char_literal135=(Token)match(input,55,FOLLOW_55_in_constDeclaration1370); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal135);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: ident, CONST, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:5: -> ( ^( CONST ident expression ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:127:8: ( ^( CONST ident expression ) )*
                while ( stream_ident.hasNext()||stream_CONST.hasNext()||stream_expression.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:127:8: ^( CONST ident expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_ident.nextTree());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ident.reset();
                stream_CONST.reset();
                stream_expression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constDeclaration"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:1: typeDeclaration : ( TYPE ( ident '=' type ';' )* ) -> ( ^( TYPE ident type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE136=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Oberon0Parser.ident_return ident137 = null;

        Oberon0Parser.type_return type139 = null;


        CommonTree TYPE136_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:16: ( ( TYPE ( ident '=' type ';' )* ) -> ( ^( TYPE ident type ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:18: ( TYPE ( ident '=' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:18: ( TYPE ( ident '=' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:19: TYPE ( ident '=' type ';' )*
            {
            TYPE136=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1395); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE136);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:24: ( ident '=' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:25: ident '=' type ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_typeDeclaration1398);
            	    ident137=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident137.getTree());
            	    char_literal138=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1400); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal138);

            	    pushFollow(FOLLOW_type_in_typeDeclaration1402);
            	    type139=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type139.getTree());
            	    char_literal140=(Token)match(input,55,FOLLOW_55_in_typeDeclaration1404); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal140);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: TYPE, type, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:5: -> ( ^( TYPE ident type ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:129:8: ( ^( TYPE ident type ) )*
                while ( stream_TYPE.hasNext()||stream_type.hasNext()||stream_ident.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:129:8: ^( TYPE ident type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_ident.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_TYPE.reset();
                stream_type.reset();
                stream_ident.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:1: varDeclarations : ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR141=null;
        Token char_literal143=null;
        Token char_literal145=null;
        Oberon0Parser.identList_return identList142 = null;

        Oberon0Parser.type_return type144 = null;


        CommonTree VAR141_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree char_literal145_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:16: ( ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:18: ( VAR ( identList ':' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:18: ( VAR ( identList ':' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:19: VAR ( identList ':' type ';' )*
            {
            VAR141=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR141);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:23: ( identList ':' type ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:24: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1432);
            	    identList142=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList142.getTree());
            	    char_literal143=(Token)match(input,56,FOLLOW_56_in_varDeclarations1434); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_56.add(char_literal143);

            	    pushFollow(FOLLOW_type_in_varDeclarations1436);
            	    type144=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type144.getTree());
            	    char_literal145=(Token)match(input,55,FOLLOW_55_in_varDeclarations1438); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal145);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: type, identList, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 131:5: -> ( ^( VAR type identList ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:131:8: ( ^( VAR type identList ) )*
                while ( stream_type.hasNext()||stream_identList.hasNext()||stream_VAR.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:131:8: ^( VAR type identList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_identList.reset();
                stream_VAR.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal150=null;
        Oberon0Parser.constDeclaration_return constDeclaration146 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration147 = null;

        Oberon0Parser.varDeclarations_return varDeclarations148 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration149 = null;


        CommonTree char_literal150_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )*
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:16: ( constDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CONST) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1463);
                    constDeclaration146=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration146.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:34: ( typeDeclaration )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TYPE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1466);
                    typeDeclaration147=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration147.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:51: ( varDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1469);
                    varDeclarations148=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations148.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:68: ( procedureDeclaration ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PROCEDURE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:69: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1473);
            	    procedureDeclaration149=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration149.getTree());
            	    char_literal150=(Token)match(input,55,FOLLOW_55_in_declarations1475); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_55.add(char_literal150);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: varDeclarations, procedureDeclaration, typeDeclaration, constDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 133:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:133:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:133:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:133:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:133:60: ( procedureDeclaration )*
                while ( stream_procedureDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_procedureDeclaration.nextTree());

                }
                stream_procedureDeclaration.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class moduleBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleBody"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:134:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN152=null;
        Token END154=null;
        Oberon0Parser.declarations_return declarations151 = null;

        Oberon0Parser.statementSequence_return statementSequence153 = null;


        CommonTree BEGIN152_tree=null;
        CommonTree END154_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:134:11: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:134:14: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody1504);
            declarations151=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations151.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:134:27: ( BEGIN statementSequence )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BEGIN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:134:28: BEGIN statementSequence
                    {
                    BEGIN152=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN152);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody1509);
                    statementSequence153=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence153.getTree());

                    }
                    break;

            }

            END154=(Token)match(input,END,FOLLOW_END_in_moduleBody1513); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END154);



            // AST REWRITE
            // elements: declarations, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 135:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:135:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:135:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:135:22: ^( BODY statementSequence )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_1);

                    adaptor.addChild(root_1, stream_statementSequence.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_statementSequence.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "moduleBody"

    public static class module_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:136:1: module : MODULE ident ';' moduleBody ident '.' EOF -> ^( MODULE ident moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE155=null;
        Token char_literal157=null;
        Token char_literal160=null;
        Token EOF161=null;
        Oberon0Parser.ident_return ident156 = null;

        Oberon0Parser.moduleBody_return moduleBody158 = null;

        Oberon0Parser.ident_return ident159 = null;


        CommonTree MODULE155_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree EOF161_tree=null;
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:136:7: ( MODULE ident ';' moduleBody ident '.' EOF -> ^( MODULE ident moduleBody ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:136:11: MODULE ident ';' moduleBody ident '.' EOF
            {
            MODULE155=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1537); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE155);

            pushFollow(FOLLOW_ident_in_module1539);
            ident156=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident156.getTree());
            char_literal157=(Token)match(input,55,FOLLOW_55_in_module1541); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(char_literal157);

            pushFollow(FOLLOW_moduleBody_in_module1543);
            moduleBody158=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody158.getTree());
            pushFollow(FOLLOW_ident_in_module1545);
            ident159=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident159.getTree());
            char_literal160=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1547); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal160);

            EOF161=(Token)match(input,EOF,FOLLOW_EOF_in_module1549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF161);



            // AST REWRITE
            // elements: MODULE, moduleBody, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 137:5: -> ^( MODULE ident moduleBody )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:137:8: ^( MODULE ident moduleBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                adaptor.addChild(root_1, stream_moduleBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "module"

    // $ANTLR start synpred25_Oberon0
    public final void synpred25_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:14: ( simpleExpression infixOperand simpleExpression )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:14: simpleExpression infixOperand simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred25_Oberon0569);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred25_Oberon0571);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred25_Oberon0573);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Oberon0

    // $ANTLR start synpred29_Oberon0
    public final void synpred29_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred29_Oberon0646); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred29_Oberon0648);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0650); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0652);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:52: ( ELSIF expression THEN statementSequence )+
        int cnt36=0;
        loop36:
        do {
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ELSIF) ) {
                alt36=1;
            }


            switch (alt36) {
        	case 1 :
        	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:53: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred29_Oberon0655); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred29_Oberon0657);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0659); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0661);
        	    statementSequence();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt36 >= 1 ) break loop36;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(36, input);
                    throw eee;
            }
            cnt36++;
        } while (true);

        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:95: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:96: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred29_Oberon0666); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0668);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred29_Oberon0671); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Oberon0

    // $ANTLR start synpred31_Oberon0
    public final void synpred31_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred31_Oberon0727); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred31_Oberon0729);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred31_Oberon0731); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred31_Oberon0733);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:41: ( ELSIF expression THEN statementSequence )+
        int cnt37=0;
        loop37:
        do {
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ELSIF) ) {
                alt37=1;
            }


            switch (alt37) {
        	case 1 :
        	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:42: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred31_Oberon0736); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred31_Oberon0738);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred31_Oberon0740); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred31_Oberon0742);
        	    statementSequence();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt37 >= 1 ) break loop37;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(37, input);
                    throw eee;
            }
            cnt37++;
        } while (true);

        match(input,END,FOLLOW_END_in_synpred31_Oberon0746); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Oberon0

    // $ANTLR start synpred32_Oberon0
    public final void synpred32_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred32_Oberon0792); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred32_Oberon0794);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred32_Oberon0796); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred32_Oberon0798);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:41: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:42: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred32_Oberon0801); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred32_Oberon0803);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred32_Oberon0806); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Oberon0

    // $ANTLR start synpred34_Oberon0
    public final void synpred34_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:14: ( assignment )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred34_Oberon0983);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Oberon0

    // $ANTLR start synpred35_Oberon0
    public final void synpred35_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:27: ( procedureCall )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred35_Oberon0987);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_Oberon0

    // Delegated rules

    public final boolean synpred31_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA8_eotS =
        "\13\uffff";
    static final String DFA8_eofS =
        "\13\uffff";
    static final String DFA8_minS =
        "\1\4\10\0\2\uffff";
    static final String DFA8_maxS =
        "\1\64\10\0\2\uffff";
    static final String DFA8_acceptS =
        "\11\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\5\1\4\1\2\1\1\35\uffff\1\10\11\uffff\1\3\1\uffff\1\6\1\uffff"+
            "\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "82:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_Oberon0()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\1\4\12\uffff";
    static final String DFA15_minS =
        "\1\16\1\0\11\uffff";
    static final String DFA15_maxS =
        "\1\67\1\0\11\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\3\4\2\uffff\1\3\32\uffff\1\1\6\uffff\1\4",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "102:13: ( assignment | procedureCall | ifStatement | whileStatement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_1 = input.LA(1);

                         
                        int index15_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_Oberon0()) ) {s = 9;}

                        else if ( (synpred35_Oberon0()) ) {s = 10;}

                         
                        input.seek(index15_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_WHITESPACE_in_ws375 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_selector404 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector408 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ident_in_selector411 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector415 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_selector418 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_selector420 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_ident_in_selector428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numberLiteral435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_factor456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_factor460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_factor464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_factor468 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_factor471 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_factor473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor478 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_factor_in_factor481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term489 = new BitSet(new long[]{0x0000000030000602L});
    public static final BitSet FOLLOW_set_in_term492 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_factor_in_term503 = new BitSet(new long[]{0x0000000030000602L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression512 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression514 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression520 = new BitSet(new long[]{0x0000000040000182L});
    public static final BitSet FOLLOW_set_in_simpleExpression523 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression533 = new BitSet(new long[]{0x0000000040000182L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression569 = new BitSet(new long[]{0x0000003F00000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression571 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_actualParameters609 = new BitSet(new long[]{0x00350040000001F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters612 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_54_in_actualParameters615 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters617 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_actualParameters623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement646 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement648 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement650 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement652 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement655 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement657 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement659 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement661 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement666 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement668 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_ifStatement671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement727 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement731 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement733 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement736 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement740 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement742 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_END_in_ifStatement746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement792 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement796 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement798 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement801 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_ifStatement806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement844 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement846 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement848 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement850 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_ifStatement852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement881 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_whileStatement883 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DO_in_whileStatement885 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement887 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_whileStatement889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment918 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment920 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_assignment922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall951 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1002 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_statementSequence1005 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1007 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_ident_in_identList1029 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_identList1033 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ident_in_identList1035 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1057 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_arrayType1059 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_OF_in_arrayType1061 = new BitSet(new long[]{0x000100000D000000L});
    public static final BitSet FOLLOW_type_in_arrayType1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1093 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_fieldList1095 = new BitSet(new long[]{0x000100000D000000L});
    public static final BitSet FOLLOW_type_in_fieldList1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1123 = new BitSet(new long[]{0x0081000000040000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1125 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_55_in_recordType1128 = new BitSet(new long[]{0x0081000000040000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1130 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_END_in_recordType1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTERTO_in_pointerType1154 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ident_in_pointerType1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointerType_in_type1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1195 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1197 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_fPSection1199 = new BitSet(new long[]{0x000100000D000000L});
    public static final BitSet FOLLOW_type_in_fPSection1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1222 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_fPSection1224 = new BitSet(new long[]{0x000100000D000000L});
    public static final BitSet FOLLOW_type_in_fPSection1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_formalParameters1246 = new BitSet(new long[]{0x0021000000001000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1249 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_55_in_formalParameters1252 = new BitSet(new long[]{0x0001000000001000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1254 = new BitSet(new long[]{0x00A0000000000000L});
    public static final BitSet FOLLOW_53_in_formalParameters1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1287 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1307 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1309 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1313 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_procedureDeclaration1317 = new BitSet(new long[]{0x0000000000C43800L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1319 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1322 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1326 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1361 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ident_in_constDeclaration1364 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1366 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1368 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_constDeclaration1370 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1395 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration1398 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1400 = new BitSet(new long[]{0x000100000D000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1402 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_typeDeclaration1404 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1429 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1432 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_varDeclarations1434 = new BitSet(new long[]{0x000100000D000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1436 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_varDeclarations1438 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1463 = new BitSet(new long[]{0x0000000000803002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1466 = new BitSet(new long[]{0x0000000000801002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1469 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1473 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_declarations1475 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1504 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1507 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1509 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_moduleBody1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1537 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ident_in_module1539 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_module1541 = new BitSet(new long[]{0x0000000000C43800L});
    public static final BitSet FOLLOW_moduleBody_in_module1543 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ident_in_module1545 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred25_Oberon0569 = new BitSet(new long[]{0x0000003F00000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred25_Oberon0571 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred25_Oberon0573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred29_Oberon0646 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0648 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0650 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0652 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred29_Oberon0655 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0657 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0659 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0661 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ELSE_in_synpred29_Oberon0666 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0668 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_synpred29_Oberon0671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred31_Oberon0727 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_synpred31_Oberon0729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_synpred31_Oberon0731 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred31_Oberon0733 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred31_Oberon0736 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_synpred31_Oberon0738 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_synpred31_Oberon0740 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred31_Oberon0742 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_END_in_synpred31_Oberon0746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred32_Oberon0792 = new BitSet(new long[]{0x00150040000001F0L});
    public static final BitSet FOLLOW_expression_in_synpred32_Oberon0794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_THEN_in_synpred32_Oberon0796 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred32_Oberon0798 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSE_in_synpred32_Oberon0801 = new BitSet(new long[]{0x0081000000204000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred32_Oberon0803 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_END_in_synpred32_Oberon0806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred34_Oberon0983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred35_Oberon0987 = new BitSet(new long[]{0x0000000000000002L});

}