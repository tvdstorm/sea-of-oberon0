// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g 2011-02-02 14:19:53

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TRUE", "FALSE", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "NOTEQUALS", "SMALLERTHAN", "GREATERTHAN", "SMALLEREQUALS", "GREATEREQUALS", "NOT", "REFVAR", "PROCEDURECALL", "PARAMETERS", "EXPRESSION", "BODY", "LH", "RH", "DOTSELECTOR", "ARRAYSELECTOR", "IDENT", "WHITESPACE", "INTEGER", "']'", "'('", "')'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int TRUE=4;
    public static final int FALSE=5;
    public static final int MINUS=6;
    public static final int PLUS=7;
    public static final int TIMES=8;
    public static final int DIVIDE=9;
    public static final int CONST=10;
    public static final int VAR=11;
    public static final int TYPE=12;
    public static final int IF=13;
    public static final int THEN=14;
    public static final int ELSE=15;
    public static final int ELSIF=16;
    public static final int END=17;
    public static final int MODULE=18;
    public static final int DO=19;
    public static final int WHILE=20;
    public static final int BEGIN=21;
    public static final int PROCEDURE=22;
    public static final int ARRAY=23;
    public static final int OF=24;
    public static final int RECORD=25;
    public static final int MOD=26;
    public static final int AND=27;
    public static final int OR=28;
    public static final int ASSIGNMENT=29;
    public static final int EQUALS=30;
    public static final int NOTEQUALS=31;
    public static final int SMALLERTHAN=32;
    public static final int GREATERTHAN=33;
    public static final int SMALLEREQUALS=34;
    public static final int GREATEREQUALS=35;
    public static final int NOT=36;
    public static final int REFVAR=37;
    public static final int PROCEDURECALL=38;
    public static final int PARAMETERS=39;
    public static final int EXPRESSION=40;
    public static final int BODY=41;
    public static final int LH=42;
    public static final int RH=43;
    public static final int DOTSELECTOR=44;
    public static final int ARRAYSELECTOR=45;
    public static final int IDENT=46;
    public static final int WHITESPACE=47;
    public static final int INTEGER=48;

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:1: ws : ( WHITESPACE )* ;
    public final Oberon0Parser.ws_return ws() throws RecognitionException {
        Oberon0Parser.ws_return retval = new Oberon0Parser.ws_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHITESPACE1=null;

        CommonTree WHITESPACE1_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:3: ( ( WHITESPACE )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:7: ( WHITESPACE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:7: ( WHITESPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WHITESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:8: WHITESPACE
            	    {
            	    WHITESPACE1=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_ws363); if (state.failed) return retval;
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:1: ident : IDENT ;
    public final Oberon0Parser.ident_return ident() throws RecognitionException {
        Oberon0Parser.ident_return retval = new Oberon0Parser.ident_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT2=null;

        CommonTree IDENT2_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:6: ( IDENT )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:10: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident373); if (state.failed) return retval;
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:1: selector : ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+ | ident );
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:9: ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+ | ident )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=DOTSELECTOR && LA3_1<=ARRAYSELECTOR)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||(LA3_1>=MINUS && LA3_1<=DIVIDE)||(LA3_1>=THEN && LA3_1<=END)||LA3_1==DO||LA3_1==OF||(LA3_1>=MOD && LA3_1<=GREATEREQUALS)||(LA3_1>=49 && LA3_1<=53)) ) {
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:12: ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector392);
                    ident3=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident3.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:18: ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:19: ( DOTSELECTOR ident )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:19: ( DOTSELECTOR ident )
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:20: DOTSELECTOR ident
                    	    {
                    	    DOTSELECTOR4=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector396); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR4_tree = (CommonTree)adaptor.create(DOTSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_ident_in_selector399);
                    	    ident5=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident5.getTree());

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:40: ( ARRAYSELECTOR expression ']' )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:40: ( ARRAYSELECTOR expression ']' )
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:41: ARRAYSELECTOR expression ']'
                    	    {
                    	    ARRAYSELECTOR6=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector403); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR6_tree = (CommonTree)adaptor.create(ARRAYSELECTOR6);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR6_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_selector406);
                    	    expression7=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression7.getTree());
                    	    char_literal8=(Token)match(input,49,FOLLOW_49_in_selector408); if (state.failed) return retval;

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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:77: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector416);
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:74:1: numberLiteral : INTEGER ;
    public final Oberon0Parser.numberLiteral_return numberLiteral() throws RecognitionException {
        Oberon0Parser.numberLiteral_return retval = new Oberon0Parser.numberLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER10=null;

        CommonTree INTEGER10_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:74:14: ( INTEGER )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:74:17: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER10=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numberLiteral423); if (state.failed) return retval;
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:1: booleanLiteral : ( TRUE | FALSE );
    public final Oberon0Parser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        Oberon0Parser.booleanLiteral_return retval = new Oberon0Parser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:15: ( TRUE | FALSE )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:1: factor : ( selector | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        Token char_literal17=null;
        Token NOT18=null;
        Oberon0Parser.selector_return selector12 = null;

        Oberon0Parser.booleanLiteral_return booleanLiteral13 = null;

        Oberon0Parser.numberLiteral_return numberLiteral14 = null;

        Oberon0Parser.expression_return expression16 = null;

        Oberon0Parser.factor_return factor19 = null;


        CommonTree char_literal15_tree=null;
        CommonTree char_literal17_tree=null;
        CommonTree NOT18_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:7: ( selector | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor )
            int alt4=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt4=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt4=2;
                }
                break;
            case INTEGER:
                {
                alt4=3;
                }
                break;
            case 50:
                {
                alt4=4;
                }
                break;
            case NOT:
                {
                alt4=5;
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor440);
                    selector12=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector12.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:22: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_factor444);
                    booleanLiteral13=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral13.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:39: numberLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numberLiteral_in_factor448);
                    numberLiteral14=numberLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numberLiteral14.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:55: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal15=(Token)match(input,50,FOLLOW_50_in_factor452); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor455);
                    expression16=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression16.getTree());
                    char_literal17=(Token)match(input,51,FOLLOW_51_in_factor457); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:78: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT18=(Token)match(input,NOT,FOLLOW_NOT_in_factor462); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT18_tree = (CommonTree)adaptor.create(NOT18);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT18_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor465);
                    factor19=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor19.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set21=null;
        Oberon0Parser.factor_return factor20 = null;

        Oberon0Parser.factor_return factor22 = null;


        CommonTree set21_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:9: factor ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term473);
            factor20=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor20.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:16: ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=TIMES && LA5_0<=DIVIDE)||(LA5_0>=MOD && LA5_0<=AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:17: ( TIMES | DIVIDE | MOD | AND ) factor
            	    {
            	    set21=(Token)input.LT(1);
            	    set21=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIVIDE)||(input.LA(1)>=MOD && input.LA(1)<=AND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set21), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term487);
            	    factor22=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor22.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS23=null;
        Token MINUS24=null;
        Token set26=null;
        Oberon0Parser.term_return term25 = null;

        Oberon0Parser.term_return term27 = null;


        CommonTree PLUS23_tree=null;
        CommonTree MINUS24_tree=null;
        CommonTree set26_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:17: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:19: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:19: ( PLUS | MINUS )?
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:20: PLUS
                    {
                    PLUS23=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression496); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS23_tree = (CommonTree)adaptor.create(PLUS23);
                    adaptor.addChild(root_0, PLUS23_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:25: MINUS
                    {
                    MINUS24=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression498); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS24_tree = (CommonTree)adaptor.create(MINUS24);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS24_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression504);
            term25=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term25.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:40: ( ( PLUS | MINUS | OR ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MINUS && LA7_0<=PLUS)||LA7_0==OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:41: ( PLUS | MINUS | OR ) term
            	    {
            	    set26=(Token)input.LT(1);
            	    set26=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS)||input.LA(1)==OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set26), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression517);
            	    term27=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term27.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:1: infixOperand : ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set28=null;

        CommonTree set28_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:13: ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set28=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUALS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set28));
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression29 = null;

        Oberon0Parser.infixOperand_return infixOperand30 = null;

        Oberon0Parser.simpleExpression_return simpleExpression31 = null;

        Oberon0Parser.simpleExpression_return simpleExpression32 = null;


        RewriteRuleSubtreeStream stream_infixOperand=new RewriteRuleSubtreeStream(adaptor,"rule infixOperand");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:11: ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:14: simpleExpression infixOperand simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression553);
                    simpleExpression29=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression29.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression555);
                    infixOperand30=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand30.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression557);
                    simpleExpression31=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression31.getTree());


                    // AST REWRITE
                    // elements: infixOperand, simpleExpression, simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 81:5: -> ^( infixOperand simpleExpression simpleExpression )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:8: ^( infixOperand simpleExpression simpleExpression )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression579);
                    simpleExpression32=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression32.getTree());


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
                    // 83:5: -> simpleExpression
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal37=null;
        Oberon0Parser.expression_return expression34 = null;

        Oberon0Parser.expression_return expression36 = null;


        CommonTree char_literal33_tree=null;
        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:17: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:19: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal33=(Token)match(input,50,FOLLOW_50_in_actualParameters593); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal33);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:23: ( expression ( ',' expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=TRUE && LA10_0<=PLUS)||LA10_0==NOT||LA10_0==IDENT||LA10_0==INTEGER||LA10_0==50) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:24: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters596);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:35: ( ',' expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==52) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:36: ',' expression
                    	    {
                    	    char_literal35=(Token)match(input,52,FOLLOW_52_in_actualParameters599); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_52.add(char_literal35);

                    	    pushFollow(FOLLOW_expression_in_actualParameters601);
                    	    expression36=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal37=(Token)match(input,51,FOLLOW_51_in_actualParameters607); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal37);



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
            // 85:5: -> ( expression ( expression )* )?
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:85:8: ( expression ( expression )* )?
                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:85:20: ( expression )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF38=null;
        Token THEN40=null;
        Token ELSIF42=null;
        Token THEN44=null;
        Token ELSE46=null;
        Token END48=null;
        Token IF49=null;
        Token THEN51=null;
        Token ELSIF53=null;
        Token THEN55=null;
        Token END57=null;
        Token IF58=null;
        Token THEN60=null;
        Token ELSE62=null;
        Token END64=null;
        Token IF65=null;
        Token THEN67=null;
        Token END69=null;
        Oberon0Parser.expression_return expression39 = null;

        Oberon0Parser.statementSequence_return statementSequence41 = null;

        Oberon0Parser.expression_return expression43 = null;

        Oberon0Parser.statementSequence_return statementSequence45 = null;

        Oberon0Parser.statementSequence_return statementSequence47 = null;

        Oberon0Parser.expression_return expression50 = null;

        Oberon0Parser.statementSequence_return statementSequence52 = null;

        Oberon0Parser.expression_return expression54 = null;

        Oberon0Parser.statementSequence_return statementSequence56 = null;

        Oberon0Parser.expression_return expression59 = null;

        Oberon0Parser.statementSequence_return statementSequence61 = null;

        Oberon0Parser.statementSequence_return statementSequence63 = null;

        Oberon0Parser.expression_return expression66 = null;

        Oberon0Parser.statementSequence_return statementSequence68 = null;


        CommonTree IF38_tree=null;
        CommonTree THEN40_tree=null;
        CommonTree ELSIF42_tree=null;
        CommonTree THEN44_tree=null;
        CommonTree ELSE46_tree=null;
        CommonTree END48_tree=null;
        CommonTree IF49_tree=null;
        CommonTree THEN51_tree=null;
        CommonTree ELSIF53_tree=null;
        CommonTree THEN55_tree=null;
        CommonTree END57_tree=null;
        CommonTree IF58_tree=null;
        CommonTree THEN60_tree=null;
        CommonTree ELSE62_tree=null;
        CommonTree END64_tree=null;
        CommonTree IF65_tree=null;
        CommonTree THEN67_tree=null;
        CommonTree END69_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IF) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred28_Oberon0()) ) {
                    alt13=1;
                }
                else if ( (synpred30_Oberon0()) ) {
                    alt13=2;
                }
                else if ( (synpred31_Oberon0()) ) {
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF38=(Token)match(input,IF,FOLLOW_IF_in_ifStatement630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF38);

                    pushFollow(FOLLOW_expression_in_ifStatement632);
                    expression39=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression39.getTree());
                    THEN40=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN40);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement636);
                    statementSequence41=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence41.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:52: ( ELSIF expression THEN statementSequence )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:53: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF42=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement639); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF42);

                    	    pushFollow(FOLLOW_expression_in_ifStatement641);
                    	    expression43=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression43.getTree());
                    	    THEN44=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement643); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN44);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement645);
                    	    statementSequence45=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence45.getTree());

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

                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:95: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:96: ELSE statementSequence
                    {
                    ELSE46=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE46);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement652);
                    statementSequence47=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence47.getTree());

                    }

                    END48=(Token)match(input,END,FOLLOW_END_in_ifStatement655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END48);



                    // AST REWRITE
                    // elements: statementSequence, ELSIF, expression, statementSequence, ELSE, IF, statementSequence, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:38: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_ELSIF.hasNext()||stream_statementSequence.hasNext()||stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ELSIF.hasNext()||stream_statementSequence.hasNext()||stream_expression.hasNext() ) {
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:64: ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:72: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:97: ^( BODY statementSequence )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_3);

                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_ELSIF.reset();
                        stream_statementSequence.reset();
                        stream_expression.reset();
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:125: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:132: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF49=(Token)match(input,IF,FOLLOW_IF_in_ifStatement711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF49);

                    pushFollow(FOLLOW_expression_in_ifStatement713);
                    expression50=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression50.getTree());
                    THEN51=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN51);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement717);
                    statementSequence52=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence52.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:41: ( ELSIF expression THEN statementSequence )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:42: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF53=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement720); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF53);

                    	    pushFollow(FOLLOW_expression_in_ifStatement722);
                    	    expression54=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression54.getTree());
                    	    THEN55=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement724); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN55);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement726);
                    	    statementSequence56=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence56.getTree());

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

                    END57=(Token)match(input,END,FOLLOW_END_in_ifStatement730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END57);



                    // AST REWRITE
                    // elements: ELSIF, statementSequence, IF, expression, statementSequence, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
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
                        if ( !(stream_ELSIF.hasNext()||stream_statementSequence.hasNext()||stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ELSIF.hasNext()||stream_statementSequence.hasNext()||stream_expression.hasNext() ) {
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
                        stream_ELSIF.reset();
                        stream_statementSequence.reset();
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF58=(Token)match(input,IF,FOLLOW_IF_in_ifStatement776); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF58);

                    pushFollow(FOLLOW_expression_in_ifStatement778);
                    expression59=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
                    THEN60=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN60);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement782);
                    statementSequence61=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence61.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:41: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:42: ELSE statementSequence
                    {
                    ELSE62=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE62);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement787);
                    statementSequence63=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence63.getTree());

                    }

                    END64=(Token)match(input,END,FOLLOW_END_in_ifStatement790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END64);



                    // AST REWRITE
                    // elements: expression, statementSequence, ELSE, statementSequence, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 91:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
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
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:37: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:63: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:70: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:4: IF expression THEN statementSequence END
                    {
                    IF65=(Token)match(input,IF,FOLLOW_IF_in_ifStatement828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF65);

                    pushFollow(FOLLOW_expression_in_ifStatement830);
                    expression66=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression66.getTree());
                    THEN67=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN67);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement834);
                    statementSequence68=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence68.getTree());
                    END69=(Token)match(input,END,FOLLOW_END_in_ifStatement836); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END69);



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
                    // 93:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
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
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:38: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE70=null;
        Token DO72=null;
        Token END74=null;
        Oberon0Parser.expression_return expression71 = null;

        Oberon0Parser.statementSequence_return statementSequence73 = null;


        CommonTree WHILE70_tree=null;
        CommonTree DO72_tree=null;
        CommonTree END74_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:15: ( WHILE expression DO statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:18: WHILE expression DO statementSequence END
            {
            WHILE70=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement865); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE70);

            pushFollow(FOLLOW_expression_in_whileStatement867);
            expression71=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression71.getTree());
            DO72=(Token)match(input,DO,FOLLOW_DO_in_whileStatement869); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO72);

            pushFollow(FOLLOW_statementSequence_in_whileStatement871);
            statementSequence73=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence73.getTree());
            END74=(Token)match(input,END,FOLLOW_END_in_whileStatement873); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END74);



            // AST REWRITE
            // elements: statementSequence, WHILE, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:5: -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:95:8: ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:95:16: ^( EXPRESSION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:95:41: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGNMENT76=null;
        Oberon0Parser.selector_return selector75 = null;

        Oberon0Parser.expression_return expression77 = null;


        CommonTree ASSIGNMENT76_tree=null;
        RewriteRuleTokenStream stream_ASSIGNMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGNMENT");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment902);
            selector75=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector75.getTree());
            ASSIGNMENT76=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT76);

            pushFollow(FOLLOW_expression_in_assignment906);
            expression77=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression77.getTree());


            // AST REWRITE
            // elements: ASSIGNMENT, selector, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:5: -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:97:8: ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGNMENT.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:97:21: ^( LH selector )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LH, "LH"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:97:36: ^( RH expression )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:1: procedureCall : selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector78 = null;

        Oberon0Parser.actualParameters_return actualParameters79 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:14: ( selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall935);
            selector78=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector78.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:26: ( actualParameters )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall938);
                    actualParameters79=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters79.getTree());

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
            // 99:5: -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:8: ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:21: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:46: ( actualParameters )?
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment80 = null;

        Oberon0Parser.procedureCall_return procedureCall81 = null;

        Oberon0Parser.ifStatement_return ifStatement82 = null;

        Oberon0Parser.whileStatement_return whileStatement83 = null;



        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:10: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement967);
                    assignment80=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment80.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement971);
                    procedureCall81=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall81.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement974);
                    ifStatement82=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement82.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement978);
                    whileStatement83=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement83.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal85=null;
        Oberon0Parser.statement_return statement84 = null;

        Oberon0Parser.statement_return statement86 = null;


        CommonTree char_literal85_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:18: ( statement ( ';' statement )* -> statement ( statement )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:20: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence986);
            statement84=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement84.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:30: ( ';' statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==53) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:31: ';' statement
            	    {
            	    char_literal85=(Token)match(input,53,FOLLOW_53_in_statementSequence989); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal85);

            	    pushFollow(FOLLOW_statement_in_statementSequence991);
            	    statement86=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement86.getTree());

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
            // 102:5: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:18: ( statement )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:1: identList : ident ( ',' ident )* -> ident ( ident )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal88=null;
        Oberon0Parser.ident_return ident87 = null;

        Oberon0Parser.ident_return ident89 = null;


        CommonTree char_literal88_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:10: ( ident ( ',' ident )* -> ident ( ident )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:13: ident ( ',' ident )*
            {
            pushFollow(FOLLOW_ident_in_identList1013);
            ident87=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident87.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:19: ( ',' ident )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==52) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:21: ',' ident
            	    {
            	    char_literal88=(Token)match(input,52,FOLLOW_52_in_identList1017); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_52.add(char_literal88);

            	    pushFollow(FOLLOW_ident_in_identList1019);
            	    ident89=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident89.getTree());

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
            // 104:5: -> ident ( ident )*
            {
                adaptor.addChild(root_0, stream_ident.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:104:14: ( ident )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:1: arrayType : ARRAY expression OF type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY90=null;
        Token OF92=null;
        Oberon0Parser.expression_return expression91 = null;

        Oberon0Parser.type_return type93 = null;


        CommonTree ARRAY90_tree=null;
        CommonTree OF92_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:10: ( ARRAY expression OF type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:13: ARRAY expression OF type
            {
            ARRAY90=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1041); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY90);

            pushFollow(FOLLOW_expression_in_arrayType1043);
            expression91=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression91.getTree());
            OF92=(Token)match(input,OF,FOLLOW_OF_in_arrayType1045); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF92);

            pushFollow(FOLLOW_type_in_arrayType1047);
            type93=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type93.getTree());


            // AST REWRITE
            // elements: expression, ARRAY, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:5: -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:106:8: ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:106:16: ^( TYPE type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:106:29: ^( EXPRESSION expression )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:1: fieldList : ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal95=null;
        Oberon0Parser.identList_return identList94 = null;

        Oberon0Parser.type_return type96 = null;


        CommonTree char_literal95_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:10: ( ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:13: ( identList ':' type )?
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:13: ( identList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:14: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1077);
                    identList94=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList94.getTree());
                    char_literal95=(Token)match(input,54,FOLLOW_54_in_fieldList1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal95);

                    pushFollow(FOLLOW_type_in_fieldList1081);
                    type96=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type96.getTree());

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
            // 108:5: -> ^( VAR ( type )? ( identList )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:8: ^( VAR ( type )? ( identList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:14: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:20: ( identList )?
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:1: recordType : RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD97=null;
        Token char_literal99=null;
        Token END101=null;
        Oberon0Parser.fieldList_return fieldList98 = null;

        Oberon0Parser.fieldList_return fieldList100 = null;


        CommonTree RECORD97_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree END101_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:11: ( RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:14: RECORD fieldList ( ';' fieldList )* END
            {
            RECORD97=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1107); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD97);

            pushFollow(FOLLOW_fieldList_in_recordType1109);
            fieldList98=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList98.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:31: ( ';' fieldList )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==53) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:32: ';' fieldList
            	    {
            	    char_literal99=(Token)match(input,53,FOLLOW_53_in_recordType1112); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal99);

            	    pushFollow(FOLLOW_fieldList_in_recordType1114);
            	    fieldList100=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList100.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            END101=(Token)match(input,END,FOLLOW_END_in_recordType1118); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END101);



            // AST REWRITE
            // elements: fieldList, RECORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:5: -> ^( RECORD ( fieldList )* )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:110:8: ^( RECORD ( fieldList )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:110:17: ( fieldList )*
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

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:1: type : ( ident | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.ident_return ident102 = null;

        Oberon0Parser.arrayType_return arrayType103 = null;

        Oberon0Parser.recordType_return recordType104 = null;



        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:5: ( ident | arrayType | recordType )
            int alt20=3;
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
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:9: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_type1139);
                    ident102=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident102.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:17: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1143);
                    arrayType103=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType103.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:29: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1147);
                    recordType104=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType104.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:1: fPSection : ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) );
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR105=null;
        Token char_literal107=null;
        Token char_literal110=null;
        Oberon0Parser.identList_return identList106 = null;

        Oberon0Parser.type_return type108 = null;

        Oberon0Parser.identList_return identList109 = null;

        Oberon0Parser.type_return type111 = null;


        CommonTree VAR105_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:10: ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:13: VAR identList ':' type
                    {
                    VAR105=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR105);

                    pushFollow(FOLLOW_identList_in_fPSection1156);
                    identList106=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList106.getTree());
                    char_literal107=(Token)match(input,54,FOLLOW_54_in_fPSection1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal107);

                    pushFollow(FOLLOW_type_in_fPSection1160);
                    type108=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type108.getTree());


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
                    // 113:5: -> ^( REFVAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:8: ^( REFVAR type identList )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:114:4: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1181);
                    identList109=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList109.getTree());
                    char_literal110=(Token)match(input,54,FOLLOW_54_in_fPSection1183); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal110);

                    pushFollow(FOLLOW_type_in_fPSection1185);
                    type111=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type111.getTree());


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
                    // 115:5: -> ^( VAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:8: ^( VAR type identList )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal112=null;
        Token char_literal114=null;
        Token char_literal116=null;
        Oberon0Parser.fPSection_return fPSection113 = null;

        Oberon0Parser.fPSection_return fPSection115 = null;


        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree char_literal116_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:17: ( '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:19: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            char_literal112=(Token)match(input,50,FOLLOW_50_in_formalParameters1205); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal112);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:23: ( fPSection ( ';' fPSection )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR||LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:24: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1208);
                    fPSection113=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection113.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:34: ( ';' fPSection )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==53) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:35: ';' fPSection
                    	    {
                    	    char_literal114=(Token)match(input,53,FOLLOW_53_in_formalParameters1211); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_53.add(char_literal114);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1213);
                    	    fPSection115=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection115.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal116=(Token)match(input,51,FOLLOW_51_in_formalParameters1219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal116);



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
            // 117:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:32: ( fPSection )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:118:1: procedureBody : BEGIN statementSequence -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN117=null;
        Oberon0Parser.statementSequence_return statementSequence118 = null;


        CommonTree BEGIN117_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:118:14: ( BEGIN statementSequence -> ^( BODY statementSequence ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:118:17: BEGIN statementSequence
            {
            BEGIN117=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN117);

            pushFollow(FOLLOW_statementSequence_in_procedureBody1248);
            statementSequence118=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence118.getTree());


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
            // 119:5: -> ^( BODY statementSequence )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:8: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:1: procedureDeclaration : PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE119=null;
        Token char_literal122=null;
        Token END125=null;
        Oberon0Parser.ident_return ident120 = null;

        Oberon0Parser.formalParameters_return formalParameters121 = null;

        Oberon0Parser.declarations_return declarations123 = null;

        Oberon0Parser.procedureBody_return procedureBody124 = null;

        Oberon0Parser.ident_return ident126 = null;


        CommonTree PROCEDURE119_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree END125_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:21: ( PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:23: PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident
            {
            PROCEDURE119=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE119);

            pushFollow(FOLLOW_ident_in_procedureDeclaration1268);
            ident120=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident120.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:39: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:41: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1272);
                    formalParameters121=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters121.getTree());

                    }
                    break;

            }

            char_literal122=(Token)match(input,53,FOLLOW_53_in_procedureDeclaration1276); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal122);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration1278);
            declarations123=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations123.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:77: ( procedureBody )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BEGIN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:78: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1281);
                    procedureBody124=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody124.getTree());

                    }
                    break;

            }

            END125=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1285); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END125);

            pushFollow(FOLLOW_ident_in_procedureDeclaration1287);
            ident126=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident126.getTree());


            // AST REWRITE
            // elements: PROCEDURE, procedureBody, formalParameters, ident, declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:5: -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:8: ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:46: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:60: ( procedureBody )?
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:1: constDeclaration : ( CONST ( ident '=' expression ';' )* ) -> ( ^( CONST ident expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST127=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Oberon0Parser.ident_return ident128 = null;

        Oberon0Parser.expression_return expression130 = null;


        CommonTree CONST127_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:17: ( ( CONST ( ident '=' expression ';' )* ) -> ( ^( CONST ident expression ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:19: ( CONST ( ident '=' expression ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:19: ( CONST ( ident '=' expression ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:20: CONST ( ident '=' expression ';' )*
            {
            CONST127=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST127);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:26: ( ident '=' expression ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:27: ident '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_constDeclaration1323);
            	    ident128=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident128.getTree());
            	    char_literal129=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1325); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal129);

            	    pushFollow(FOLLOW_expression_in_constDeclaration1327);
            	    expression130=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression130.getTree());
            	    char_literal131=(Token)match(input,53,FOLLOW_53_in_constDeclaration1329); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal131);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: expression, ident, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 123:5: -> ( ^( CONST ident expression ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:123:8: ( ^( CONST ident expression ) )*
                while ( stream_expression.hasNext()||stream_ident.hasNext()||stream_CONST.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:123:8: ^( CONST ident expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_ident.nextTree());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_expression.reset();
                stream_ident.reset();
                stream_CONST.reset();

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:1: typeDeclaration : ( TYPE ( ident '=' type ';' )* ) -> ( ^( TYPE ident type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE132=null;
        Token char_literal134=null;
        Token char_literal136=null;
        Oberon0Parser.ident_return ident133 = null;

        Oberon0Parser.type_return type135 = null;


        CommonTree TYPE132_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:16: ( ( TYPE ( ident '=' type ';' )* ) -> ( ^( TYPE ident type ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:18: ( TYPE ( ident '=' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:18: ( TYPE ( ident '=' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:19: TYPE ( ident '=' type ';' )*
            {
            TYPE132=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1354); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE132);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:24: ( ident '=' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:25: ident '=' type ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_typeDeclaration1357);
            	    ident133=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident133.getTree());
            	    char_literal134=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1359); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal134);

            	    pushFollow(FOLLOW_type_in_typeDeclaration1361);
            	    type135=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type135.getTree());
            	    char_literal136=(Token)match(input,53,FOLLOW_53_in_typeDeclaration1363); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal136);


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
            // 125:5: -> ( ^( TYPE ident type ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:125:8: ( ^( TYPE ident type ) )*
                while ( stream_TYPE.hasNext()||stream_type.hasNext()||stream_ident.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:125:8: ^( TYPE ident type )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:1: varDeclarations : ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR137=null;
        Token char_literal139=null;
        Token char_literal141=null;
        Oberon0Parser.identList_return identList138 = null;

        Oberon0Parser.type_return type140 = null;


        CommonTree VAR137_tree=null;
        CommonTree char_literal139_tree=null;
        CommonTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:16: ( ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:18: ( VAR ( identList ':' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:18: ( VAR ( identList ':' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:19: VAR ( identList ':' type ';' )*
            {
            VAR137=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1388); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR137);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:23: ( identList ':' type ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:126:24: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1391);
            	    identList138=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList138.getTree());
            	    char_literal139=(Token)match(input,54,FOLLOW_54_in_varDeclarations1393); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_54.add(char_literal139);

            	    pushFollow(FOLLOW_type_in_varDeclarations1395);
            	    type140=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type140.getTree());
            	    char_literal141=(Token)match(input,53,FOLLOW_53_in_varDeclarations1397); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal141);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: VAR, identList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:5: -> ( ^( VAR type identList ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:127:8: ( ^( VAR type identList ) )*
                while ( stream_VAR.hasNext()||stream_identList.hasNext()||stream_type.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:127:8: ^( VAR type identList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_VAR.reset();
                stream_identList.reset();
                stream_type.reset();

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal146=null;
        Oberon0Parser.constDeclaration_return constDeclaration142 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration143 = null;

        Oberon0Parser.varDeclarations_return varDeclarations144 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration145 = null;


        CommonTree char_literal146_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )*
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:16: ( constDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CONST) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1422);
                    constDeclaration142=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration142.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:34: ( typeDeclaration )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TYPE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1425);
                    typeDeclaration143=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration143.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:51: ( varDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1428);
                    varDeclarations144=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations144.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:68: ( procedureDeclaration ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PROCEDURE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:128:69: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1432);
            	    procedureDeclaration145=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration145.getTree());
            	    char_literal146=(Token)match(input,53,FOLLOW_53_in_declarations1434); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_53.add(char_literal146);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: procedureDeclaration, varDeclarations, typeDeclaration, constDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 129:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:129:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:129:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:129:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:129:60: ( procedureDeclaration )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN148=null;
        Token END150=null;
        Oberon0Parser.declarations_return declarations147 = null;

        Oberon0Parser.statementSequence_return statementSequence149 = null;


        CommonTree BEGIN148_tree=null;
        CommonTree END150_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:11: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:14: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody1463);
            declarations147=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations147.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:27: ( BEGIN statementSequence )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BEGIN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:130:28: BEGIN statementSequence
                    {
                    BEGIN148=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1466); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN148);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody1468);
                    statementSequence149=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence149.getTree());

                    }
                    break;

            }

            END150=(Token)match(input,END,FOLLOW_END_in_moduleBody1472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END150);



            // AST REWRITE
            // elements: statementSequence, declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 131:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:131:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:131:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:131:22: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:1: module : MODULE ident ';' moduleBody ident '.' EOF -> ^( MODULE ident moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE151=null;
        Token char_literal153=null;
        Token char_literal156=null;
        Token EOF157=null;
        Oberon0Parser.ident_return ident152 = null;

        Oberon0Parser.moduleBody_return moduleBody154 = null;

        Oberon0Parser.ident_return ident155 = null;


        CommonTree MODULE151_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree EOF157_tree=null;
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:7: ( MODULE ident ';' moduleBody ident '.' EOF -> ^( MODULE ident moduleBody ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:132:11: MODULE ident ';' moduleBody ident '.' EOF
            {
            MODULE151=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE151);

            pushFollow(FOLLOW_ident_in_module1498);
            ident152=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident152.getTree());
            char_literal153=(Token)match(input,53,FOLLOW_53_in_module1500); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(char_literal153);

            pushFollow(FOLLOW_moduleBody_in_module1502);
            moduleBody154=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody154.getTree());
            pushFollow(FOLLOW_ident_in_module1504);
            ident155=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident155.getTree());
            char_literal156=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1506); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal156);

            EOF157=(Token)match(input,EOF,FOLLOW_EOF_in_module1508); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF157);



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
            // 133:5: -> ^( MODULE ident moduleBody )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:133:8: ^( MODULE ident moduleBody )
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

    // $ANTLR start synpred24_Oberon0
    public final void synpred24_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:14: ( simpleExpression infixOperand simpleExpression )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:14: simpleExpression infixOperand simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred24_Oberon0553);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred24_Oberon0555);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred24_Oberon0557);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_Oberon0

    // $ANTLR start synpred28_Oberon0
    public final void synpred28_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred28_Oberon0630); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred28_Oberon0632);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0634); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0636);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:52: ( ELSIF expression THEN statementSequence )+
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
        	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:53: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred28_Oberon0639); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred28_Oberon0641);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0643); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0645);
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

        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:95: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:96: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred28_Oberon0650); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0652);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred28_Oberon0655); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Oberon0

    // $ANTLR start synpred30_Oberon0
    public final void synpred30_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred30_Oberon0711); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred30_Oberon0713);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred30_Oberon0715); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred30_Oberon0717);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:41: ( ELSIF expression THEN statementSequence )+
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
        	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:42: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred30_Oberon0720); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred30_Oberon0722);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred30_Oberon0724); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred30_Oberon0726);
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

        match(input,END,FOLLOW_END_in_synpred30_Oberon0730); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Oberon0

    // $ANTLR start synpred31_Oberon0
    public final void synpred31_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred31_Oberon0776); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred31_Oberon0778);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred31_Oberon0780); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred31_Oberon0782);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:41: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:42: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred31_Oberon0785); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred31_Oberon0787);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred31_Oberon0790); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Oberon0

    // $ANTLR start synpred33_Oberon0
    public final void synpred33_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:14: ( assignment )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred33_Oberon0967);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Oberon0

    // $ANTLR start synpred34_Oberon0
    public final void synpred34_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:27: ( procedureCall )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred34_Oberon0971);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Oberon0

    // Delegated rules

    public final boolean synpred33_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred30_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Oberon0_fragment(); // can never throw exception
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
    public final boolean synpred28_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Oberon0_fragment(); // can never throw exception
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
        "\12\uffff";
    static final String DFA8_eofS =
        "\12\uffff";
    static final String DFA8_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA8_maxS =
        "\1\62\7\0\2\uffff";
    static final String DFA8_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\4\1\2\1\1\34\uffff\1\7\11\uffff\1\3\1\uffff\1\5\1\uffff"+
            "\1\6",
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
            return "80:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );";
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
                        if ( (synpred24_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index8_7);
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
        "\1\15\1\0\11\uffff";
    static final String DFA15_maxS =
        "\1\65\1\0\11\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA15_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\3\4\2\uffff\1\3\31\uffff\1\1\6\uffff\1\4",
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
            return "100:13: ( assignment | procedureCall | ifStatement | whileStatement )?";
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
                        if ( (synpred33_Oberon0()) ) {s = 9;}

                        else if ( (synpred34_Oberon0()) ) {s = 10;}

                         
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
 

    public static final BitSet FOLLOW_WHITESPACE_in_ws363 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_selector392 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector396 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ident_in_selector399 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector403 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_selector406 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_selector408 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ident_in_selector416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numberLiteral423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_factor444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_factor448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_factor452 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_factor455 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_factor457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor462 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_factor_in_factor465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term473 = new BitSet(new long[]{0x000000000C000302L});
    public static final BitSet FOLLOW_set_in_term476 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_factor_in_term487 = new BitSet(new long[]{0x000000000C000302L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression496 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression498 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression504 = new BitSet(new long[]{0x00000000100000C2L});
    public static final BitSet FOLLOW_set_in_simpleExpression507 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression517 = new BitSet(new long[]{0x00000000100000C2L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression553 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression555 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_actualParameters593 = new BitSet(new long[]{0x000D4010000000F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters596 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_52_in_actualParameters599 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters601 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_51_in_actualParameters607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement630 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement634 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement636 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement639 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement641 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement643 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement645 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement650 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement652 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement711 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement713 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement715 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement717 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement720 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement722 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement724 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement726 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_END_in_ifStatement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement776 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement778 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement780 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement782 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement785 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement787 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement828 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement830 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement832 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement834 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement865 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_whileStatement867 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DO_in_whileStatement869 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement871 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_whileStatement873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment902 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment904 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_assignment906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall935 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence986 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_statementSequence989 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statement_in_statementSequence991 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ident_in_identList1013 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_identList1017 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ident_in_identList1019 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1041 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_arrayType1043 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_arrayType1045 = new BitSet(new long[]{0x0000400002800000L});
    public static final BitSet FOLLOW_type_in_arrayType1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1077 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_fieldList1079 = new BitSet(new long[]{0x0000400002800000L});
    public static final BitSet FOLLOW_type_in_fieldList1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1107 = new BitSet(new long[]{0x0020400000020000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1109 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_53_in_recordType1112 = new BitSet(new long[]{0x0020400000020000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1114 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_END_in_recordType1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1154 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1156 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_fPSection1158 = new BitSet(new long[]{0x0000400002800000L});
    public static final BitSet FOLLOW_type_in_fPSection1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1181 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_fPSection1183 = new BitSet(new long[]{0x0000400002800000L});
    public static final BitSet FOLLOW_type_in_fPSection1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_formalParameters1205 = new BitSet(new long[]{0x0008400000000800L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1208 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_53_in_formalParameters1211 = new BitSet(new long[]{0x0000400000000800L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1213 = new BitSet(new long[]{0x0028000000000000L});
    public static final BitSet FOLLOW_51_in_formalParameters1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1246 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1266 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1268 = new BitSet(new long[]{0x0024000000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1272 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_procedureDeclaration1276 = new BitSet(new long[]{0x0000000000621C00L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1278 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1281 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1285 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1320 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ident_in_constDeclaration1323 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1325 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1327 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_constDeclaration1329 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1354 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration1357 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1359 = new BitSet(new long[]{0x0000400002800000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1361 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_typeDeclaration1363 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1388 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1391 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_varDeclarations1393 = new BitSet(new long[]{0x0000400002800000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1395 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_varDeclarations1397 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1422 = new BitSet(new long[]{0x0000000000401802L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1425 = new BitSet(new long[]{0x0000000000400802L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1428 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1432 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_declarations1434 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1463 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1466 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1468 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_moduleBody1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1496 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ident_in_module1498 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_module1500 = new BitSet(new long[]{0x0000000000621C00L});
    public static final BitSet FOLLOW_moduleBody_in_module1502 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ident_in_module1504 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred24_Oberon0553 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred24_Oberon0555 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred24_Oberon0557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred28_Oberon0630 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0634 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0636 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred28_Oberon0639 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0641 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0643 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0645 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ELSE_in_synpred28_Oberon0650 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0652 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_synpred28_Oberon0655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred30_Oberon0711 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred30_Oberon0713 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred30_Oberon0715 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred30_Oberon0717 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred30_Oberon0720 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred30_Oberon0722 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred30_Oberon0724 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred30_Oberon0726 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_END_in_synpred30_Oberon0730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred31_Oberon0776 = new BitSet(new long[]{0x00054010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred31_Oberon0778 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred31_Oberon0780 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred31_Oberon0782 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_synpred31_Oberon0785 = new BitSet(new long[]{0x0020400000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred31_Oberon0787 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_synpred31_Oberon0790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred33_Oberon0967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred34_Oberon0971 = new BitSet(new long[]{0x0000000000000002L});

}