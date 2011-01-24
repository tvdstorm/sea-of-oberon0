// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Data\\software_construction\\grammar\\Oberon0.g 2011-01-24 15:52:24

package randy.generated.antlr;


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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "NOTEQUALS", "SMALLERTHEN", "GREATERTHEN", "SMALLEREQUALS", "GREATEREQUALS", "NOT", "REFVAR", "PROCEDURECALL", "PARAMETERS", "EXPRESSION", "BODY", "LH", "RH", "DOTSELECTOR", "ARRAYSELECTOR", "IDENT", "WHITESPACE", "INTEGER", "']'", "'('", "')'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int MINUS=4;
    public static final int PLUS=5;
    public static final int TIMES=6;
    public static final int DIVIDE=7;
    public static final int CONST=8;
    public static final int VAR=9;
    public static final int TYPE=10;
    public static final int IF=11;
    public static final int THEN=12;
    public static final int ELSE=13;
    public static final int ELSIF=14;
    public static final int END=15;
    public static final int MODULE=16;
    public static final int DO=17;
    public static final int WHILE=18;
    public static final int BEGIN=19;
    public static final int PROCEDURE=20;
    public static final int ARRAY=21;
    public static final int OF=22;
    public static final int RECORD=23;
    public static final int MOD=24;
    public static final int AND=25;
    public static final int OR=26;
    public static final int ASSIGNMENT=27;
    public static final int EQUALS=28;
    public static final int NOTEQUALS=29;
    public static final int SMALLERTHEN=30;
    public static final int GREATERTHEN=31;
    public static final int SMALLEREQUALS=32;
    public static final int GREATEREQUALS=33;
    public static final int NOT=34;
    public static final int REFVAR=35;
    public static final int PROCEDURECALL=36;
    public static final int PARAMETERS=37;
    public static final int EXPRESSION=38;
    public static final int BODY=39;
    public static final int LH=40;
    public static final int RH=41;
    public static final int DOTSELECTOR=42;
    public static final int ARRAYSELECTOR=43;
    public static final int IDENT=44;
    public static final int WHITESPACE=45;
    public static final int INTEGER=46;

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
    public String getGrammarFileName() { return "C:\\Data\\software_construction\\grammar\\Oberon0.g"; }


    public static class ws_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ws"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:1: ws : ( WHITESPACE )* ;
    public final Oberon0Parser.ws_return ws() throws RecognitionException {
        Oberon0Parser.ws_return retval = new Oberon0Parser.ws_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHITESPACE1=null;

        CommonTree WHITESPACE1_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:3: ( ( WHITESPACE )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:7: ( WHITESPACE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:7: ( WHITESPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WHITESPACE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:8: WHITESPACE
            	    {
            	    WHITESPACE1=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_ws350); if (state.failed) return retval;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:1: ident : IDENT ;
    public final Oberon0Parser.ident_return ident() throws RecognitionException {
        Oberon0Parser.ident_return retval = new Oberon0Parser.ident_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT2=null;

        CommonTree IDENT2_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:6: ( IDENT )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:9: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident359); if (state.failed) return retval;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:1: selector : ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+ | ident );
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:9: ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+ | ident )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=DOTSELECTOR && LA3_1<=ARRAYSELECTOR)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||(LA3_1>=MINUS && LA3_1<=DIVIDE)||(LA3_1>=THEN && LA3_1<=END)||LA3_1==DO||LA3_1==OF||(LA3_1>=MOD && LA3_1<=GREATEREQUALS)||(LA3_1>=47 && LA3_1<=51)) ) {
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:12: ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector378);
                    ident3=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident3.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:18: ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR expression ']' ) )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:19: ( DOTSELECTOR ident )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:19: ( DOTSELECTOR ident )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:20: DOTSELECTOR ident
                    	    {
                    	    DOTSELECTOR4=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector382); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR4_tree = (CommonTree)adaptor.create(DOTSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_ident_in_selector385);
                    	    ident5=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident5.getTree());

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:40: ( ARRAYSELECTOR expression ']' )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:40: ( ARRAYSELECTOR expression ']' )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:41: ARRAYSELECTOR expression ']'
                    	    {
                    	    ARRAYSELECTOR6=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector389); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR6_tree = (CommonTree)adaptor.create(ARRAYSELECTOR6);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR6_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_selector392);
                    	    expression7=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression7.getTree());
                    	    char_literal8=(Token)match(input,47,FOLLOW_47_in_selector394); if (state.failed) return retval;

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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:77: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector402);
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

    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:1: number : INTEGER ;
    public final Oberon0Parser.number_return number() throws RecognitionException {
        Oberon0Parser.number_return retval = new Oberon0Parser.number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER10=null;

        CommonTree INTEGER10_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:7: ( INTEGER )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:10: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER10=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number409); if (state.failed) return retval;
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
    // $ANTLR end "number"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:1: factor : ( selector | number | '(' expression ')' | NOT factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        Token NOT16=null;
        Oberon0Parser.selector_return selector11 = null;

        Oberon0Parser.number_return number12 = null;

        Oberon0Parser.expression_return expression14 = null;

        Oberon0Parser.factor_return factor17 = null;


        CommonTree char_literal13_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree NOT16_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:7: ( selector | number | '(' expression ')' | NOT factor )
            int alt4=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt4=1;
                }
                break;
            case INTEGER:
                {
                alt4=2;
                }
                break;
            case 48:
                {
                alt4=3;
                }
                break;
            case NOT:
                {
                alt4=4;
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:10: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor416);
                    selector11=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector11.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:21: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor420);
                    number12=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number12.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:30: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal13=(Token)match(input,48,FOLLOW_48_in_factor424); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor427);
                    expression14=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression14.getTree());
                    char_literal15=(Token)match(input,49,FOLLOW_49_in_factor429); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:53: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT16=(Token)match(input,NOT,FOLLOW_NOT_in_factor434); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT16_tree = (CommonTree)adaptor.create(NOT16);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT16_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor437);
                    factor17=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor17.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set19=null;
        Oberon0Parser.factor_return factor18 = null;

        Oberon0Parser.factor_return factor20 = null;


        CommonTree set19_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:9: factor ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term445);
            factor18=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor18.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:16: ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=TIMES && LA5_0<=DIVIDE)||(LA5_0>=MOD && LA5_0<=AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:17: ( TIMES | DIVIDE | MOD | AND ) factor
            	    {
            	    set19=(Token)input.LT(1);
            	    set19=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIVIDE)||(input.LA(1)>=MOD && input.LA(1)<=AND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set19), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term459);
            	    factor20=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor20.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS21=null;
        Token MINUS22=null;
        Token set24=null;
        Oberon0Parser.term_return term23 = null;

        Oberon0Parser.term_return term25 = null;


        CommonTree PLUS21_tree=null;
        CommonTree MINUS22_tree=null;
        CommonTree set24_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:3: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:6: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:6: ( PLUS | MINUS )?
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:7: PLUS
                    {
                    PLUS21=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS21_tree = (CommonTree)adaptor.create(PLUS21);
                    adaptor.addChild(root_0, PLUS21_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:12: MINUS
                    {
                    MINUS22=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression475); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS22_tree = (CommonTree)adaptor.create(MINUS22);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS22_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression481);
            term23=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term23.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:27: ( ( PLUS | MINUS | OR ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MINUS && LA7_0<=PLUS)||LA7_0==OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:28: ( PLUS | MINUS | OR ) term
            	    {
            	    set24=(Token)input.LT(1);
            	    set24=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS)||input.LA(1)==OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set24), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression494);
            	    term25=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term25.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:1: infixOperand : ( EQUALS | NOTEQUALS | SMALLERTHEN | SMALLEREQUALS | GREATERTHEN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set26=null;

        CommonTree set26_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:13: ( EQUALS | NOTEQUALS | SMALLERTHEN | SMALLEREQUALS | GREATERTHEN | GREATEREQUALS )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set26=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUALS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set26));
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression27 = null;

        Oberon0Parser.infixOperand_return infixOperand28 = null;

        Oberon0Parser.simpleExpression_return simpleExpression29 = null;

        Oberon0Parser.simpleExpression_return simpleExpression30 = null;


        RewriteRuleSubtreeStream stream_infixOperand=new RewriteRuleSubtreeStream(adaptor,"rule infixOperand");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:11: ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt8=2;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                int LA8_1 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
                {
                int LA8_2 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case IDENT:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                int LA8_4 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 4, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                int LA8_5 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            case NOT:
                {
                int LA8_6 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt8=1;
                }
                else if ( (true) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:14: simpleExpression infixOperand simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression531);
                    simpleExpression27=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression27.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression533);
                    infixOperand28=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand28.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression535);
                    simpleExpression29=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression29.getTree());


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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:81:8: ^( infixOperand simpleExpression simpleExpression )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression557);
                    simpleExpression30=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression30.getTree());


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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ^( PARAMETERS ( expression )+ ) ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal31=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Oberon0Parser.expression_return expression32 = null;

        Oberon0Parser.expression_return expression34 = null;


        CommonTree char_literal31_tree=null;
        CommonTree char_literal33_tree=null;
        CommonTree char_literal35_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:17: ( '(' ( expression ( ',' expression )* )? ')' -> ^( PARAMETERS ( expression )+ ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:19: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal31=(Token)match(input,48,FOLLOW_48_in_actualParameters571); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal31);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:23: ( expression ( ',' expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=MINUS && LA10_0<=PLUS)||LA10_0==NOT||LA10_0==IDENT||LA10_0==INTEGER||LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:24: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters574);
                    expression32=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression32.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:35: ( ',' expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==50) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:36: ',' expression
                    	    {
                    	    char_literal33=(Token)match(input,50,FOLLOW_50_in_actualParameters577); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_50.add(char_literal33);

                    	    pushFollow(FOLLOW_expression_in_actualParameters579);
                    	    expression34=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal35=(Token)match(input,49,FOLLOW_49_in_actualParameters585); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal35);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 85:5: -> ^( PARAMETERS ( expression )+ )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:8: ^( PARAMETERS ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "actualParameters"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF36=null;
        Token THEN38=null;
        Token ELSIF40=null;
        Token THEN42=null;
        Token ELSE44=null;
        Token END46=null;
        Token IF47=null;
        Token THEN49=null;
        Token ELSIF51=null;
        Token THEN53=null;
        Token END55=null;
        Token IF56=null;
        Token THEN58=null;
        Token ELSE60=null;
        Token END62=null;
        Token IF63=null;
        Token THEN65=null;
        Token END67=null;
        Oberon0Parser.expression_return expression37 = null;

        Oberon0Parser.statementSequence_return statementSequence39 = null;

        Oberon0Parser.expression_return expression41 = null;

        Oberon0Parser.statementSequence_return statementSequence43 = null;

        Oberon0Parser.statementSequence_return statementSequence45 = null;

        Oberon0Parser.expression_return expression48 = null;

        Oberon0Parser.statementSequence_return statementSequence50 = null;

        Oberon0Parser.expression_return expression52 = null;

        Oberon0Parser.statementSequence_return statementSequence54 = null;

        Oberon0Parser.expression_return expression57 = null;

        Oberon0Parser.statementSequence_return statementSequence59 = null;

        Oberon0Parser.statementSequence_return statementSequence61 = null;

        Oberon0Parser.expression_return expression64 = null;

        Oberon0Parser.statementSequence_return statementSequence66 = null;


        CommonTree IF36_tree=null;
        CommonTree THEN38_tree=null;
        CommonTree ELSIF40_tree=null;
        CommonTree THEN42_tree=null;
        CommonTree ELSE44_tree=null;
        CommonTree END46_tree=null;
        CommonTree IF47_tree=null;
        CommonTree THEN49_tree=null;
        CommonTree ELSIF51_tree=null;
        CommonTree THEN53_tree=null;
        CommonTree END55_tree=null;
        CommonTree IF56_tree=null;
        CommonTree THEN58_tree=null;
        CommonTree ELSE60_tree=null;
        CommonTree END62_tree=null;
        CommonTree IF63_tree=null;
        CommonTree THEN65_tree=null;
        CommonTree END67_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IF) ) {
                int LA13_1 = input.LA(2);

                if ( (synpred26_Oberon0()) ) {
                    alt13=1;
                }
                else if ( (synpred28_Oberon0()) ) {
                    alt13=2;
                }
                else if ( (synpred29_Oberon0()) ) {
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF36=(Token)match(input,IF,FOLLOW_IF_in_ifStatement606); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF36);

                    pushFollow(FOLLOW_expression_in_ifStatement608);
                    expression37=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression37.getTree());
                    THEN38=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN38);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement612);
                    statementSequence39=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence39.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:52: ( ELSIF expression THEN statementSequence )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:53: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF40=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement615); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF40);

                    	    pushFollow(FOLLOW_expression_in_ifStatement617);
                    	    expression41=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());
                    	    THEN42=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement619); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN42);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement621);
                    	    statementSequence43=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence43.getTree());

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

                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:95: ( ELSE statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:96: ELSE statementSequence
                    {
                    ELSE44=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE44);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement628);
                    statementSequence45=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence45.getTree());

                    }

                    END46=(Token)match(input,END,FOLLOW_END_in_ifStatement631); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END46);



                    // AST REWRITE
                    // elements: ELSIF, statementSequence, statementSequence, expression, IF, ELSE, expression, statementSequence
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:38: ^( BODY statementSequence )
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
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:64: ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:72: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:97: ^( BODY statementSequence )
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:125: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:132: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF47=(Token)match(input,IF,FOLLOW_IF_in_ifStatement687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF47);

                    pushFollow(FOLLOW_expression_in_ifStatement689);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());
                    THEN49=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN49);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement693);
                    statementSequence50=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence50.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:41: ( ELSIF expression THEN statementSequence )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:42: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF51=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement696); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF51);

                    	    pushFollow(FOLLOW_expression_in_ifStatement698);
                    	    expression52=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression52.getTree());
                    	    THEN53=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement700); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN53);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement702);
                    	    statementSequence54=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence54.getTree());

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

                    END55=(Token)match(input,END,FOLLOW_END_in_ifStatement706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END55);



                    // AST REWRITE
                    // elements: statementSequence, ELSIF, statementSequence, expression, IF, expression
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:38: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_statementSequence.hasNext()||stream_ELSIF.hasNext()||stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statementSequence.hasNext()||stream_ELSIF.hasNext()||stream_expression.hasNext() ) {
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:64: ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:72: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:97: ^( BODY statementSequence )
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
                        stream_ELSIF.reset();
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF56=(Token)match(input,IF,FOLLOW_IF_in_ifStatement752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF56);

                    pushFollow(FOLLOW_expression_in_ifStatement754);
                    expression57=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
                    THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN58);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement758);
                    statementSequence59=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence59.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:41: ( ELSE statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:42: ELSE statementSequence
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE60);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement763);
                    statementSequence61=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence61.getTree());

                    }

                    END62=(Token)match(input,END,FOLLOW_END_in_ifStatement766); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END62);



                    // AST REWRITE
                    // elements: statementSequence, IF, ELSE, expression, statementSequence
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:37: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:63: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:70: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:4: IF expression THEN statementSequence END
                    {
                    IF63=(Token)match(input,IF,FOLLOW_IF_in_ifStatement804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF63);

                    pushFollow(FOLLOW_expression_in_ifStatement806);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());
                    THEN65=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN65);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement810);
                    statementSequence66=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence66.getTree());
                    END67=(Token)match(input,END,FOLLOW_END_in_ifStatement812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END67);



                    // AST REWRITE
                    // elements: IF, expression, statementSequence
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:38: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE68=null;
        Token DO70=null;
        Token END72=null;
        Oberon0Parser.expression_return expression69 = null;

        Oberon0Parser.statementSequence_return statementSequence71 = null;


        CommonTree WHILE68_tree=null;
        CommonTree DO70_tree=null;
        CommonTree END72_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:15: ( WHILE expression DO statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:18: WHILE expression DO statementSequence END
            {
            WHILE68=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement841); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE68);

            pushFollow(FOLLOW_expression_in_whileStatement843);
            expression69=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression69.getTree());
            DO70=(Token)match(input,DO,FOLLOW_DO_in_whileStatement845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO70);

            pushFollow(FOLLOW_statementSequence_in_whileStatement847);
            statementSequence71=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence71.getTree());
            END72=(Token)match(input,END,FOLLOW_END_in_whileStatement849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END72);



            // AST REWRITE
            // elements: WHILE, statementSequence, expression
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
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:8: ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:16: ^( EXPRESSION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:41: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGNMENT74=null;
        Oberon0Parser.selector_return selector73 = null;

        Oberon0Parser.expression_return expression75 = null;


        CommonTree ASSIGNMENT74_tree=null;
        RewriteRuleTokenStream stream_ASSIGNMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGNMENT");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment878);
            selector73=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector73.getTree());
            ASSIGNMENT74=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment880); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT74);

            pushFollow(FOLLOW_expression_in_assignment882);
            expression75=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression75.getTree());


            // AST REWRITE
            // elements: expression, ASSIGNMENT, selector
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
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:8: ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGNMENT.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:21: ^( LH selector )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LH, "LH"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:36: ^( RH expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:1: procedureCall : selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector76 = null;

        Oberon0Parser.actualParameters_return actualParameters77 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: ( selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall911);
            selector76=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector76.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:26: ( actualParameters )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall914);
                    actualParameters77=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters77.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: selector, actualParameters
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
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:8: ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:21: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:46: ( actualParameters )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment78 = null;

        Oberon0Parser.procedureCall_return procedureCall79 = null;

        Oberon0Parser.ifStatement_return ifStatement80 = null;

        Oberon0Parser.whileStatement_return whileStatement81 = null;



        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:10: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement943);
                    assignment78=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment78.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement947);
                    procedureCall79=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall79.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement950);
                    ifStatement80=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement80.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement954);
                    whileStatement81=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement81.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal83=null;
        Oberon0Parser.statement_return statement82 = null;

        Oberon0Parser.statement_return statement84 = null;


        CommonTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:18: ( statement ( ';' statement )* -> statement ( statement )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:20: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence962);
            statement82=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement82.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:30: ( ';' statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==51) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:31: ';' statement
            	    {
            	    char_literal83=(Token)match(input,51,FOLLOW_51_in_statementSequence965); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal83);

            	    pushFollow(FOLLOW_statement_in_statementSequence967);
            	    statement84=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement84.getTree());

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
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:102:18: ( statement )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:1: identList : ident ( ',' ident )* -> ident ( ident )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal86=null;
        Oberon0Parser.ident_return ident85 = null;

        Oberon0Parser.ident_return ident87 = null;


        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:10: ( ident ( ',' ident )* -> ident ( ident )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:13: ident ( ',' ident )*
            {
            pushFollow(FOLLOW_ident_in_identList989);
            ident85=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident85.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:19: ( ',' ident )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==50) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:21: ',' ident
            	    {
            	    char_literal86=(Token)match(input,50,FOLLOW_50_in_identList993); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal86);

            	    pushFollow(FOLLOW_ident_in_identList995);
            	    ident87=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident87.getTree());

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
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:104:14: ( ident )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:1: arrayType : ARRAY expression OF type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY88=null;
        Token OF90=null;
        Oberon0Parser.expression_return expression89 = null;

        Oberon0Parser.type_return type91 = null;


        CommonTree ARRAY88_tree=null;
        CommonTree OF90_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:10: ( ARRAY expression OF type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:13: ARRAY expression OF type
            {
            ARRAY88=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY88);

            pushFollow(FOLLOW_expression_in_arrayType1019);
            expression89=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression89.getTree());
            OF90=(Token)match(input,OF,FOLLOW_OF_in_arrayType1021); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF90);

            pushFollow(FOLLOW_type_in_arrayType1023);
            type91=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type91.getTree());


            // AST REWRITE
            // elements: ARRAY, type, expression
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
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:8: ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:16: ^( TYPE type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:29: ^( EXPRESSION expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:108:1: fieldList : ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal93=null;
        Oberon0Parser.identList_return identList92 = null;

        Oberon0Parser.type_return type94 = null;


        CommonTree char_literal93_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:2: ( ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:5: ( identList ':' type )?
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:5: ( identList ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:6: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1057);
                    identList92=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList92.getTree());
                    char_literal93=(Token)match(input,52,FOLLOW_52_in_fieldList1059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal93);

                    pushFollow(FOLLOW_type_in_fieldList1061);
                    type94=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type94.getTree());

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
            // 110:4: -> ^( VAR ( type )? ( identList )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:7: ^( VAR ( type )? ( identList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:13: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:19: ( identList )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:1: recordType : RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD95=null;
        Token char_literal97=null;
        Token END99=null;
        Oberon0Parser.fieldList_return fieldList96 = null;

        Oberon0Parser.fieldList_return fieldList98 = null;


        CommonTree RECORD95_tree=null;
        CommonTree char_literal97_tree=null;
        CommonTree END99_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:2: ( RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:5: RECORD fieldList ( ';' fieldList )* END
            {
            RECORD95=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1088); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD95);

            pushFollow(FOLLOW_fieldList_in_recordType1090);
            fieldList96=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList96.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:22: ( ';' fieldList )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:23: ';' fieldList
            	    {
            	    char_literal97=(Token)match(input,51,FOLLOW_51_in_recordType1093); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal97);

            	    pushFollow(FOLLOW_fieldList_in_recordType1095);
            	    fieldList98=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList98.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            END99=(Token)match(input,END,FOLLOW_END_in_recordType1099); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END99);



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
            // 113:4: -> ^( RECORD ( fieldList )* )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:113:7: ^( RECORD ( fieldList )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:113:16: ( fieldList )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:1: type : ( ident | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.ident_return ident100 = null;

        Oberon0Parser.arrayType_return arrayType101 = null;

        Oberon0Parser.recordType_return recordType102 = null;



        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:2: ( ident | arrayType | recordType )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:5: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_type1122);
                    ident100=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident100.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:13: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1126);
                    arrayType101=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType101.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:25: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1130);
                    recordType102=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType102.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:1: fPSection : ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) );
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR103=null;
        Token char_literal105=null;
        Token char_literal108=null;
        Oberon0Parser.identList_return identList104 = null;

        Oberon0Parser.type_return type106 = null;

        Oberon0Parser.identList_return identList107 = null;

        Oberon0Parser.type_return type109 = null;


        CommonTree VAR103_tree=null;
        CommonTree char_literal105_tree=null;
        CommonTree char_literal108_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:10: ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:13: VAR identList ':' type
                    {
                    VAR103=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR103);

                    pushFollow(FOLLOW_identList_in_fPSection1140);
                    identList104=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList104.getTree());
                    char_literal105=(Token)match(input,52,FOLLOW_52_in_fPSection1142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal105);

                    pushFollow(FOLLOW_type_in_fPSection1144);
                    type106=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type106.getTree());


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
                    // 118:5: -> ^( REFVAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:8: ^( REFVAR type identList )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:4: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1165);
                    identList107=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList107.getTree());
                    char_literal108=(Token)match(input,52,FOLLOW_52_in_fPSection1167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal108);

                    pushFollow(FOLLOW_type_in_fPSection1169);
                    type109=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type109.getTree());


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
                    // 120:5: -> ^( VAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:8: ^( VAR type identList )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal110=null;
        Token char_literal112=null;
        Token char_literal114=null;
        Oberon0Parser.fPSection_return fPSection111 = null;

        Oberon0Parser.fPSection_return fPSection113 = null;


        CommonTree char_literal110_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:17: ( '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:19: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            char_literal110=(Token)match(input,48,FOLLOW_48_in_formalParameters1189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal110);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:23: ( fPSection ( ';' fPSection )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR||LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:24: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1192);
                    fPSection111=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection111.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:34: ( ';' fPSection )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==51) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:35: ';' fPSection
                    	    {
                    	    char_literal112=(Token)match(input,51,FOLLOW_51_in_formalParameters1195); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_51.add(char_literal112);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1197);
                    	    fPSection113=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection113.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal114=(Token)match(input,49,FOLLOW_49_in_formalParameters1203); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal114);



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
            // 122:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:32: ( fPSection )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:1: procedureBody : BEGIN statementSequence -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN115=null;
        Oberon0Parser.statementSequence_return statementSequence116 = null;


        CommonTree BEGIN115_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:14: ( BEGIN statementSequence -> ^( BODY statementSequence ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:17: BEGIN statementSequence
            {
            BEGIN115=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN115);

            pushFollow(FOLLOW_statementSequence_in_procedureBody1232);
            statementSequence116=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence116.getTree());


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
            // 124:5: -> ^( BODY statementSequence )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:8: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:1: procedureDeclaration : PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE117=null;
        Token char_literal120=null;
        Token END123=null;
        Oberon0Parser.ident_return ident118 = null;

        Oberon0Parser.formalParameters_return formalParameters119 = null;

        Oberon0Parser.declarations_return declarations121 = null;

        Oberon0Parser.procedureBody_return procedureBody122 = null;

        Oberon0Parser.ident_return ident124 = null;


        CommonTree PROCEDURE117_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree END123_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:21: ( PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:23: PROCEDURE ident ( formalParameters )? ';' declarations ( procedureBody )? END ident
            {
            PROCEDURE117=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE117);

            pushFollow(FOLLOW_ident_in_procedureDeclaration1252);
            ident118=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident118.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:39: ( formalParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==48) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:41: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1256);
                    formalParameters119=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters119.getTree());

                    }
                    break;

            }

            char_literal120=(Token)match(input,51,FOLLOW_51_in_procedureDeclaration1260); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal120);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration1262);
            declarations121=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations121.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:77: ( procedureBody )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BEGIN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:78: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1265);
                    procedureBody122=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody122.getTree());

                    }
                    break;

            }

            END123=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1269); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END123);

            pushFollow(FOLLOW_ident_in_procedureDeclaration1271);
            ident124=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident124.getTree());


            // AST REWRITE
            // elements: PROCEDURE, formalParameters, ident, procedureBody, declarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 126:5: -> ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:8: ^( PROCEDURE ident ( formalParameters )? ( declarations )? ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:46: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:60: ( procedureBody )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:1: constDeclaration : ( CONST ( ident '=' expression ';' )* ) -> ( ^( CONST ident expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST125=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Oberon0Parser.ident_return ident126 = null;

        Oberon0Parser.expression_return expression128 = null;


        CommonTree CONST125_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree char_literal129_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:17: ( ( CONST ( ident '=' expression ';' )* ) -> ( ^( CONST ident expression ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:19: ( CONST ( ident '=' expression ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:19: ( CONST ( ident '=' expression ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:20: CONST ( ident '=' expression ';' )*
            {
            CONST125=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1304); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST125);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:26: ( ident '=' expression ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:27: ident '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_constDeclaration1307);
            	    ident126=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident126.getTree());
            	    char_literal127=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1309); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal127);

            	    pushFollow(FOLLOW_expression_in_constDeclaration1311);
            	    expression128=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression128.getTree());
            	    char_literal129=(Token)match(input,51,FOLLOW_51_in_constDeclaration1313); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal129);


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
            // 128:5: -> ( ^( CONST ident expression ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:8: ( ^( CONST ident expression ) )*
                while ( stream_ident.hasNext()||stream_CONST.hasNext()||stream_expression.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:8: ^( CONST ident expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:1: typeDeclaration : ( TYPE ( ident '=' type ';' )* ) -> ( ^( TYPE ident type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE130=null;
        Token char_literal132=null;
        Token char_literal134=null;
        Oberon0Parser.ident_return ident131 = null;

        Oberon0Parser.type_return type133 = null;


        CommonTree TYPE130_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:16: ( ( TYPE ( ident '=' type ';' )* ) -> ( ^( TYPE ident type ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:18: ( TYPE ( ident '=' type ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:18: ( TYPE ( ident '=' type ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:19: TYPE ( ident '=' type ';' )*
            {
            TYPE130=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE130);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:24: ( ident '=' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:25: ident '=' type ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_typeDeclaration1341);
            	    ident131=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident131.getTree());
            	    char_literal132=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1343); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal132);

            	    pushFollow(FOLLOW_type_in_typeDeclaration1345);
            	    type133=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type133.getTree());
            	    char_literal134=(Token)match(input,51,FOLLOW_51_in_typeDeclaration1347); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal134);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: ident, type, TYPE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:5: -> ( ^( TYPE ident type ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:8: ( ^( TYPE ident type ) )*
                while ( stream_ident.hasNext()||stream_type.hasNext()||stream_TYPE.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:8: ^( TYPE ident type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_ident.nextTree());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ident.reset();
                stream_type.reset();
                stream_TYPE.reset();

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:1: varDeclarations : ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR135=null;
        Token char_literal137=null;
        Token char_literal139=null;
        Oberon0Parser.identList_return identList136 = null;

        Oberon0Parser.type_return type138 = null;


        CommonTree VAR135_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree char_literal139_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:16: ( ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:18: ( VAR ( identList ':' type ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:18: ( VAR ( identList ':' type ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:19: VAR ( identList ':' type ';' )*
            {
            VAR135=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1372); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR135);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:23: ( identList ':' type ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:24: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1375);
            	    identList136=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList136.getTree());
            	    char_literal137=(Token)match(input,52,FOLLOW_52_in_varDeclarations1377); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_52.add(char_literal137);

            	    pushFollow(FOLLOW_type_in_varDeclarations1379);
            	    type138=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type138.getTree());
            	    char_literal139=(Token)match(input,51,FOLLOW_51_in_varDeclarations1381); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal139);


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
            // 132:5: -> ( ^( VAR type identList ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:132:8: ( ^( VAR type identList ) )*
                while ( stream_type.hasNext()||stream_identList.hasNext()||stream_VAR.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:132:8: ^( VAR type identList )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal144=null;
        Oberon0Parser.constDeclaration_return constDeclaration140 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration141 = null;

        Oberon0Parser.varDeclarations_return varDeclarations142 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration143 = null;


        CommonTree char_literal144_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )*
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:16: ( constDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CONST) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1406);
                    constDeclaration140=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration140.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:34: ( typeDeclaration )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TYPE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1409);
                    typeDeclaration141=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration141.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:51: ( varDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1412);
                    varDeclarations142=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations142.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:68: ( procedureDeclaration ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PROCEDURE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:69: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1416);
            	    procedureDeclaration143=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration143.getTree());
            	    char_literal144=(Token)match(input,51,FOLLOW_51_in_declarations1418); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal144);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: typeDeclaration, procedureDeclaration, varDeclarations, constDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:134:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:134:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:134:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:134:60: ( procedureDeclaration )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:135:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN146=null;
        Token END148=null;
        Oberon0Parser.declarations_return declarations145 = null;

        Oberon0Parser.statementSequence_return statementSequence147 = null;


        CommonTree BEGIN146_tree=null;
        CommonTree END148_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:135:11: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:135:15: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody1448);
            declarations145=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations145.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:135:28: ( BEGIN statementSequence )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BEGIN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:135:29: BEGIN statementSequence
                    {
                    BEGIN146=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1451); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN146);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody1453);
                    statementSequence147=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence147.getTree());

                    }
                    break;

            }

            END148=(Token)match(input,END,FOLLOW_END_in_moduleBody1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END148);



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
            // 136:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:136:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:136:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:136:22: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:137:1: module : MODULE ident ';' moduleBody ident '.' EOF -> ^( MODULE ident moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE149=null;
        Token char_literal151=null;
        Token char_literal154=null;
        Token EOF155=null;
        Oberon0Parser.ident_return ident150 = null;

        Oberon0Parser.moduleBody_return moduleBody152 = null;

        Oberon0Parser.ident_return ident153 = null;


        CommonTree MODULE149_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree EOF155_tree=null;
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:137:7: ( MODULE ident ';' moduleBody ident '.' EOF -> ^( MODULE ident moduleBody ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:137:11: MODULE ident ';' moduleBody ident '.' EOF
            {
            MODULE149=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE149);

            pushFollow(FOLLOW_ident_in_module1483);
            ident150=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident150.getTree());
            char_literal151=(Token)match(input,51,FOLLOW_51_in_module1485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal151);

            pushFollow(FOLLOW_moduleBody_in_module1487);
            moduleBody152=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody152.getTree());
            pushFollow(FOLLOW_ident_in_module1489);
            ident153=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident153.getTree());
            char_literal154=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1491); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal154);

            EOF155=(Token)match(input,EOF,FOLLOW_EOF_in_module1493); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF155);



            // AST REWRITE
            // elements: moduleBody, MODULE, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 138:5: -> ^( MODULE ident moduleBody )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:138:8: ^( MODULE ident moduleBody )
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

    // $ANTLR start synpred22_Oberon0
    public final void synpred22_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:14: ( simpleExpression infixOperand simpleExpression )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:14: simpleExpression infixOperand simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred22_Oberon0531);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred22_Oberon0533);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred22_Oberon0535);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Oberon0

    // $ANTLR start synpred26_Oberon0
    public final void synpred26_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred26_Oberon0606); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred26_Oberon0608);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred26_Oberon0610); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0612);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:52: ( ELSIF expression THEN statementSequence )+
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
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:53: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred26_Oberon0615); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred26_Oberon0617);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred26_Oberon0619); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0621);
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

        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:95: ( ELSE statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:96: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred26_Oberon0626); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0628);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred26_Oberon0631); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Oberon0

    // $ANTLR start synpred28_Oberon0
    public final void synpred28_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred28_Oberon0687); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred28_Oberon0689);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0691); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0693);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:41: ( ELSIF expression THEN statementSequence )+
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
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:42: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred28_Oberon0696); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred28_Oberon0698);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0700); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0702);
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

        match(input,END,FOLLOW_END_in_synpred28_Oberon0706); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Oberon0

    // $ANTLR start synpred29_Oberon0
    public final void synpred29_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred29_Oberon0752); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred29_Oberon0754);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0756); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0758);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:41: ( ELSE statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:42: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred29_Oberon0761); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0763);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred29_Oberon0766); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Oberon0

    // $ANTLR start synpred31_Oberon0
    public final void synpred31_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:14: ( assignment )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred31_Oberon0943);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Oberon0

    // $ANTLR start synpred32_Oberon0
    public final void synpred32_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:27: ( procedureCall )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred32_Oberon0947);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Oberon0

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
    public final boolean synpred26_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Oberon0_fragment(); // can never throw exception
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
    public final boolean synpred22_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\13\uffff";
    static final String DFA15_eofS =
        "\1\4\12\uffff";
    static final String DFA15_minS =
        "\1\13\1\0\11\uffff";
    static final String DFA15_maxS =
        "\1\63\1\0\11\uffff";
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
                        if ( (synpred31_Oberon0()) ) {s = 9;}

                        else if ( (synpred32_Oberon0()) ) {s = 10;}

                         
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
 

    public static final BitSet FOLLOW_WHITESPACE_in_ws350 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_selector378 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector382 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ident_in_selector385 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector389 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_selector392 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_selector394 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ident_in_selector402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_factor424 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_factor427 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_factor429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor434 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_factor_in_factor437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term445 = new BitSet(new long[]{0x00000000030000C2L});
    public static final BitSet FOLLOW_set_in_term448 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_factor_in_term459 = new BitSet(new long[]{0x00000000030000C2L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression473 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression475 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression481 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_set_in_simpleExpression484 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression494 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression531 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression533 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_actualParameters571 = new BitSet(new long[]{0x0003500400000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters574 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50_in_actualParameters577 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters579 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_actualParameters585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement606 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement608 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement610 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement612 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement615 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement617 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement619 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement621 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement626 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement687 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement691 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement693 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement696 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement698 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement700 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement702 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_ifStatement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement752 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement754 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement756 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement758 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement761 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement804 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement806 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement808 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement810 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement841 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_whileStatement843 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_whileStatement845 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement847 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_whileStatement849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment878 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment880 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_assignment882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall911 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence962 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_statementSequence965 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statement_in_statementSequence967 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ident_in_identList989 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_identList993 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ident_in_identList995 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1017 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_arrayType1019 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OF_in_arrayType1021 = new BitSet(new long[]{0x0000100000A00000L});
    public static final BitSet FOLLOW_type_in_arrayType1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1057 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fieldList1059 = new BitSet(new long[]{0x0000100000A00000L});
    public static final BitSet FOLLOW_type_in_fieldList1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1088 = new BitSet(new long[]{0x0008100000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1090 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_51_in_recordType1093 = new BitSet(new long[]{0x0008100000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1095 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_END_in_recordType1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1138 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1140 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fPSection1142 = new BitSet(new long[]{0x0000100000A00000L});
    public static final BitSet FOLLOW_type_in_fPSection1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1165 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fPSection1167 = new BitSet(new long[]{0x0000100000A00000L});
    public static final BitSet FOLLOW_type_in_fPSection1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_formalParameters1189 = new BitSet(new long[]{0x0002100000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1192 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_51_in_formalParameters1195 = new BitSet(new long[]{0x0000100000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1197 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_49_in_formalParameters1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1230 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1250 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1252 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1256 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_procedureDeclaration1260 = new BitSet(new long[]{0x0000000000188700L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1262 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1265 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1269 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1304 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ident_in_constDeclaration1307 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1309 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1311 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constDeclaration1313 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1338 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration1341 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1343 = new BitSet(new long[]{0x0000100000A00000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1345 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_typeDeclaration1347 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1372 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1375 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_varDeclarations1377 = new BitSet(new long[]{0x0000100000A00000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1379 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_varDeclarations1381 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1406 = new BitSet(new long[]{0x0000000000100602L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1409 = new BitSet(new long[]{0x0000000000100202L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1412 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1416 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_declarations1418 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1448 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1451 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1453 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_moduleBody1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1481 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ident_in_module1483 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_module1485 = new BitSet(new long[]{0x0000000000188700L});
    public static final BitSet FOLLOW_moduleBody_in_module1487 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ident_in_module1489 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred22_Oberon0531 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred22_Oberon0533 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred22_Oberon0535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred26_Oberon0606 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_synpred26_Oberon0608 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred26_Oberon0610 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0612 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred26_Oberon0615 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_synpred26_Oberon0617 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred26_Oberon0619 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0621 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_synpred26_Oberon0626 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred26_Oberon0631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred28_Oberon0687 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0689 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0691 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0693 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred28_Oberon0696 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0698 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0700 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0702 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_synpred28_Oberon0706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred29_Oberon0752 = new BitSet(new long[]{0x0001500400000030L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0754 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0756 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0758 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_synpred29_Oberon0761 = new BitSet(new long[]{0x0008100000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0763 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred29_Oberon0766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred31_Oberon0943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred32_Oberon0947 = new BitSet(new long[]{0x0000000000000002L});

}