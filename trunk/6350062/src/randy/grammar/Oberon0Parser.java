// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Data\\software_construction\\grammar\\Oberon0.g 2011-01-10 16:25:11

package randy.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "SMALLERTHEN", "GREATERTHEN", "SMALLEREQUALS", "GREATEREQUALS", "REFVAR", "PROCEDURECALL", "PARAMETERS", "EXPRESSION", "BODY", "LH", "RH", "DOTSELECTOR", "ARRAYSELECTOR", "IDENT", "WHITESPACE", "INTEGER", "']'", "'('", "')'", "'~'", "'#'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
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
    public static final int SMALLERTHEN=29;
    public static final int GREATERTHEN=30;
    public static final int SMALLEREQUALS=31;
    public static final int GREATEREQUALS=32;
    public static final int REFVAR=33;
    public static final int PROCEDURECALL=34;
    public static final int PARAMETERS=35;
    public static final int EXPRESSION=36;
    public static final int BODY=37;
    public static final int LH=38;
    public static final int RH=39;
    public static final int DOTSELECTOR=40;
    public static final int ARRAYSELECTOR=41;
    public static final int IDENT=42;
    public static final int WHITESPACE=43;
    public static final int INTEGER=44;

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:66:1: ws : ( WHITESPACE )* ;
    public final Oberon0Parser.ws_return ws() throws RecognitionException {
        Oberon0Parser.ws_return retval = new Oberon0Parser.ws_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHITESPACE1=null;

        CommonTree WHITESPACE1_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:66:3: ( ( WHITESPACE )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:66:7: ( WHITESPACE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:66:7: ( WHITESPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WHITESPACE) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_Oberon0()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:66:8: WHITESPACE
            	    {
            	    WHITESPACE1=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_ws339); if (state.failed) return retval;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:1: ident : IDENT ;
    public final Oberon0Parser.ident_return ident() throws RecognitionException {
        Oberon0Parser.ident_return retval = new Oberon0Parser.ident_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT2=null;

        CommonTree IDENT2_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:6: ( IDENT )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:10: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident349); if (state.failed) return retval;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:1: selector : ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR ws expression ws ']' ) )+ | ident );
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOTSELECTOR4=null;
        Token ARRAYSELECTOR6=null;
        Token char_literal10=null;
        Oberon0Parser.ident_return ident3 = null;

        Oberon0Parser.ident_return ident5 = null;

        Oberon0Parser.ws_return ws7 = null;

        Oberon0Parser.expression_return expression8 = null;

        Oberon0Parser.ws_return ws9 = null;

        Oberon0Parser.ident_return ident11 = null;


        CommonTree DOTSELECTOR4_tree=null;
        CommonTree ARRAYSELECTOR6_tree=null;
        CommonTree char_literal10_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:9: ( ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR ws expression ws ']' ) )+ | ident )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=DOTSELECTOR && LA3_1<=ARRAYSELECTOR)) ) {
                    alt3=1;
                }
                else if ( (LA3_1==EOF||(LA3_1>=MINUS && LA3_1<=DIVIDE)||(LA3_1>=THEN && LA3_1<=END)||LA3_1==DO||LA3_1==OF||(LA3_1>=MOD && LA3_1<=GREATEREQUALS)||LA3_1==WHITESPACE||(LA3_1>=45 && LA3_1<=47)||(LA3_1>=49 && LA3_1<=51)) ) {
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:12: ident ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR ws expression ws ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector368);
                    ident3=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident3.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:18: ( ( DOTSELECTOR ident ) | ( ARRAYSELECTOR ws expression ws ']' ) )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:19: ( DOTSELECTOR ident )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:19: ( DOTSELECTOR ident )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:20: DOTSELECTOR ident
                    	    {
                    	    DOTSELECTOR4=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector372); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR4_tree = (CommonTree)adaptor.create(DOTSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_ident_in_selector375);
                    	    ident5=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident5.getTree());

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:40: ( ARRAYSELECTOR ws expression ws ']' )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:40: ( ARRAYSELECTOR ws expression ws ']' )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:41: ARRAYSELECTOR ws expression ws ']'
                    	    {
                    	    ARRAYSELECTOR6=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector379); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR6_tree = (CommonTree)adaptor.create(ARRAYSELECTOR6);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR6_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_ws_in_selector382);
                    	    ws7=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws7.getTree());
                    	    pushFollow(FOLLOW_expression_in_selector384);
                    	    expression8=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression8.getTree());
                    	    pushFollow(FOLLOW_ws_in_selector386);
                    	    ws9=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws9.getTree());
                    	    char_literal10=(Token)match(input,45,FOLLOW_45_in_selector388); if (state.failed) return retval;

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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:83: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_selector396);
                    ident11=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident11.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:1: number : INTEGER ;
    public final Oberon0Parser.number_return number() throws RecognitionException {
        Oberon0Parser.number_return retval = new Oberon0Parser.number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER12=null;

        CommonTree INTEGER12_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:7: ( INTEGER )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:11: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER12=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number404); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER12_tree = (CommonTree)adaptor.create(INTEGER12);
            adaptor.addChild(root_0, INTEGER12_tree);
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:1: factor : ( selector | number | '(' ws expression ')' | '~' ws factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        Token char_literal18=null;
        Token char_literal19=null;
        Oberon0Parser.selector_return selector13 = null;

        Oberon0Parser.number_return number14 = null;

        Oberon0Parser.ws_return ws16 = null;

        Oberon0Parser.expression_return expression17 = null;

        Oberon0Parser.ws_return ws20 = null;

        Oberon0Parser.factor_return factor21 = null;


        CommonTree char_literal15_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree char_literal19_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:7: ( selector | number | '(' ws expression ')' | '~' ws factor )
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
            case 46:
                {
                alt4=3;
                }
                break;
            case 48:
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor412);
                    selector13=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector13.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:22: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor416);
                    number14=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number14.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:31: '(' ws expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal15=(Token)match(input,46,FOLLOW_46_in_factor420); if (state.failed) return retval;
                    pushFollow(FOLLOW_ws_in_factor423);
                    ws16=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws16.getTree());
                    pushFollow(FOLLOW_expression_in_factor425);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression17.getTree());
                    char_literal18=(Token)match(input,47,FOLLOW_47_in_factor427); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:57: '~' ws factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal19=(Token)match(input,48,FOLLOW_48_in_factor432); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal19_tree = (CommonTree)adaptor.create(char_literal19);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal19_tree, root_0);
                    }
                    pushFollow(FOLLOW_ws_in_factor435);
                    ws20=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws20.getTree());
                    pushFollow(FOLLOW_factor_in_factor437);
                    factor21=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor21.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) ws factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set23=null;
        Oberon0Parser.factor_return factor22 = null;

        Oberon0Parser.ws_return ws24 = null;

        Oberon0Parser.factor_return factor25 = null;


        CommonTree set23_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) ws factor )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:9: factor ( ( TIMES | DIVIDE | MOD | AND ) ws factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term446);
            factor22=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor22.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:16: ( ( TIMES | DIVIDE | MOD | AND ) ws factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=TIMES && LA5_0<=DIVIDE)||(LA5_0>=MOD && LA5_0<=AND)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:17: ( TIMES | DIVIDE | MOD | AND ) ws factor
            	    {
            	    set23=(Token)input.LT(1);
            	    set23=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIVIDE)||(input.LA(1)>=MOD && input.LA(1)<=AND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set23), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ws_in_term460);
            	    ws24=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws24.getTree());
            	    pushFollow(FOLLOW_factor_in_term462);
            	    factor25=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor25.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:1: simpleExpression : ( PLUS | MINUS ws )? term ( ( PLUS | MINUS | OR ) ws term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS26=null;
        Token MINUS27=null;
        Token set30=null;
        Oberon0Parser.ws_return ws28 = null;

        Oberon0Parser.term_return term29 = null;

        Oberon0Parser.ws_return ws31 = null;

        Oberon0Parser.term_return term32 = null;


        CommonTree PLUS26_tree=null;
        CommonTree MINUS27_tree=null;
        CommonTree set30_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:3: ( ( PLUS | MINUS ws )? term ( ( PLUS | MINUS | OR ) ws term )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:6: ( PLUS | MINUS ws )? term ( ( PLUS | MINUS | OR ) ws term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:6: ( PLUS | MINUS ws )?
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:7: PLUS
                    {
                    PLUS26=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS26_tree = (CommonTree)adaptor.create(PLUS26);
                    adaptor.addChild(root_0, PLUS26_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:12: MINUS ws
                    {
                    MINUS27=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression478); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS27_tree = (CommonTree)adaptor.create(MINUS27);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS27_tree, root_0);
                    }
                    pushFollow(FOLLOW_ws_in_simpleExpression481);
                    ws28=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws28.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression485);
            term29=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term29.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:29: ( ( PLUS | MINUS | OR ) ws term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=MINUS && LA7_0<=PLUS)||LA7_0==OR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:30: ( PLUS | MINUS | OR ) ws term
            	    {
            	    set30=(Token)input.LT(1);
            	    set30=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS)||input.LA(1)==OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set30), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ws_in_simpleExpression498);
            	    ws31=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws31.getTree());
            	    pushFollow(FOLLOW_term_in_simpleExpression500);
            	    term32=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term32.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:1: infixOperand : ( EQUALS | '#' | SMALLERTHEN | SMALLEREQUALS | GREATERTHEN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set33=null;

        CommonTree set33_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:13: ( EQUALS | '#' | SMALLERTHEN | SMALLEREQUALS | GREATERTHEN | GREATEREQUALS )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set33=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUALS)||input.LA(1)==49 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set33));
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:1: expression : ( simpleExpression infixOperand ws simpleExpression ws -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression34 = null;

        Oberon0Parser.infixOperand_return infixOperand35 = null;

        Oberon0Parser.ws_return ws36 = null;

        Oberon0Parser.simpleExpression_return simpleExpression37 = null;

        Oberon0Parser.ws_return ws38 = null;

        Oberon0Parser.simpleExpression_return simpleExpression39 = null;


        RewriteRuleSubtreeStream stream_infixOperand=new RewriteRuleSubtreeStream(adaptor,"rule infixOperand");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:11: ( simpleExpression infixOperand ws simpleExpression ws -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
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
            case 46:
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
            case 48:
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:14: simpleExpression infixOperand ws simpleExpression ws
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression537);
                    simpleExpression34=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression34.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression539);
                    infixOperand35=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand35.getTree());
                    pushFollow(FOLLOW_ws_in_expression541);
                    ws36=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws36.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression543);
                    simpleExpression37=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression37.getTree());
                    pushFollow(FOLLOW_ws_in_expression545);
                    ws38=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws38.getTree());


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
                    // 79:5: -> ^( infixOperand simpleExpression simpleExpression )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:8: ^( infixOperand simpleExpression simpleExpression )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression566);
                    simpleExpression39=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression39.getTree());


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
                    // 81:5: -> simpleExpression
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:1: actualParameters : '(' ws ( expression ( ',' ws expression )* )? ')' ws -> ^( PARAMETERS ( expression )+ ) ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal40=null;
        Token char_literal43=null;
        Token char_literal46=null;
        Oberon0Parser.ws_return ws41 = null;

        Oberon0Parser.expression_return expression42 = null;

        Oberon0Parser.ws_return ws44 = null;

        Oberon0Parser.expression_return expression45 = null;

        Oberon0Parser.ws_return ws47 = null;


        CommonTree char_literal40_tree=null;
        CommonTree char_literal43_tree=null;
        CommonTree char_literal46_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:17: ( '(' ws ( expression ( ',' ws expression )* )? ')' ws -> ^( PARAMETERS ( expression )+ ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:19: '(' ws ( expression ( ',' ws expression )* )? ')' ws
            {
            char_literal40=(Token)match(input,46,FOLLOW_46_in_actualParameters580); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal40);

            pushFollow(FOLLOW_ws_in_actualParameters582);
            ws41=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws41.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:26: ( expression ( ',' ws expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=MINUS && LA10_0<=PLUS)||LA10_0==IDENT||LA10_0==INTEGER||LA10_0==46||LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:27: expression ( ',' ws expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters585);
                    expression42=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression42.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:38: ( ',' ws expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==50) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:39: ',' ws expression
                    	    {
                    	    char_literal43=(Token)match(input,50,FOLLOW_50_in_actualParameters588); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_50.add(char_literal43);

                    	    pushFollow(FOLLOW_ws_in_actualParameters590);
                    	    ws44=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws44.getTree());
                    	    pushFollow(FOLLOW_expression_in_actualParameters592);
                    	    expression45=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal46=(Token)match(input,47,FOLLOW_47_in_actualParameters598); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal46);

            pushFollow(FOLLOW_ws_in_actualParameters600);
            ws47=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws47.getTree());


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
            // 83:5: -> ^( PARAMETERS ( expression )+ )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:8: ^( PARAMETERS ( expression )+ )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:1: ifStatement : ( IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ ( ELSE ws statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF ws expression THEN ws statementSequence ( ELSE ws statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF ws expression THEN ws statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF48=null;
        Token THEN51=null;
        Token ELSIF54=null;
        Token THEN57=null;
        Token ELSE60=null;
        Token END63=null;
        Token IF64=null;
        Token THEN67=null;
        Token ELSIF70=null;
        Token THEN73=null;
        Token END76=null;
        Token IF77=null;
        Token THEN80=null;
        Token ELSE83=null;
        Token END86=null;
        Token IF87=null;
        Token THEN90=null;
        Token END93=null;
        Oberon0Parser.ws_return ws49 = null;

        Oberon0Parser.expression_return expression50 = null;

        Oberon0Parser.ws_return ws52 = null;

        Oberon0Parser.statementSequence_return statementSequence53 = null;

        Oberon0Parser.ws_return ws55 = null;

        Oberon0Parser.expression_return expression56 = null;

        Oberon0Parser.ws_return ws58 = null;

        Oberon0Parser.statementSequence_return statementSequence59 = null;

        Oberon0Parser.ws_return ws61 = null;

        Oberon0Parser.statementSequence_return statementSequence62 = null;

        Oberon0Parser.ws_return ws65 = null;

        Oberon0Parser.expression_return expression66 = null;

        Oberon0Parser.ws_return ws68 = null;

        Oberon0Parser.statementSequence_return statementSequence69 = null;

        Oberon0Parser.ws_return ws71 = null;

        Oberon0Parser.expression_return expression72 = null;

        Oberon0Parser.ws_return ws74 = null;

        Oberon0Parser.statementSequence_return statementSequence75 = null;

        Oberon0Parser.ws_return ws78 = null;

        Oberon0Parser.expression_return expression79 = null;

        Oberon0Parser.ws_return ws81 = null;

        Oberon0Parser.statementSequence_return statementSequence82 = null;

        Oberon0Parser.ws_return ws84 = null;

        Oberon0Parser.statementSequence_return statementSequence85 = null;

        Oberon0Parser.ws_return ws88 = null;

        Oberon0Parser.expression_return expression89 = null;

        Oberon0Parser.ws_return ws91 = null;

        Oberon0Parser.statementSequence_return statementSequence92 = null;


        CommonTree IF48_tree=null;
        CommonTree THEN51_tree=null;
        CommonTree ELSIF54_tree=null;
        CommonTree THEN57_tree=null;
        CommonTree ELSE60_tree=null;
        CommonTree END63_tree=null;
        CommonTree IF64_tree=null;
        CommonTree THEN67_tree=null;
        CommonTree ELSIF70_tree=null;
        CommonTree THEN73_tree=null;
        CommonTree END76_tree=null;
        CommonTree IF77_tree=null;
        CommonTree THEN80_tree=null;
        CommonTree ELSE83_tree=null;
        CommonTree END86_tree=null;
        CommonTree IF87_tree=null;
        CommonTree THEN90_tree=null;
        CommonTree END93_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:12: ( IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ ( ELSE ws statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | IF ws expression THEN ws statementSequence ( ELSE ws statementSequence ) END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF ws expression THEN ws statementSequence END -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:15: IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ ( ELSE ws statementSequence ) END
                    {
                    IF48=(Token)match(input,IF,FOLLOW_IF_in_ifStatement620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF48);

                    pushFollow(FOLLOW_ws_in_ifStatement622);
                    ws49=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws49.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement624);
                    expression50=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression50.getTree());
                    THEN51=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement626); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN51);

                    pushFollow(FOLLOW_ws_in_ifStatement628);
                    ws52=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws52.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement630);
                    statementSequence53=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence53.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:58: ( ELSIF ws expression THEN ws statementSequence )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:59: ELSIF ws expression THEN ws statementSequence
                    	    {
                    	    ELSIF54=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement633); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF54);

                    	    pushFollow(FOLLOW_ws_in_ifStatement635);
                    	    ws55=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws55.getTree());
                    	    pushFollow(FOLLOW_expression_in_ifStatement637);
                    	    expression56=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression56.getTree());
                    	    THEN57=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement639); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN57);

                    	    pushFollow(FOLLOW_ws_in_ifStatement641);
                    	    ws58=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws58.getTree());
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement643);
                    	    statementSequence59=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence59.getTree());

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

                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:107: ( ELSE ws statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:108: ELSE ws statementSequence
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE60);

                    pushFollow(FOLLOW_ws_in_ifStatement650);
                    ws61=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws61.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement652);
                    statementSequence62=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence62.getTree());

                    }

                    END63=(Token)match(input,END,FOLLOW_END_in_ifStatement655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END63);



                    // AST REWRITE
                    // elements: ELSIF, statementSequence, expression, statementSequence, ELSE, expression, statementSequence, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:13: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:38: ^( BODY statementSequence )
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
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:64: ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:72: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:97: ^( BODY statementSequence )
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:125: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:132: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:4: IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ END
                    {
                    IF64=(Token)match(input,IF,FOLLOW_IF_in_ifStatement711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF64);

                    pushFollow(FOLLOW_ws_in_ifStatement713);
                    ws65=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws65.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement715);
                    expression66=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression66.getTree());
                    THEN67=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN67);

                    pushFollow(FOLLOW_ws_in_ifStatement719);
                    ws68=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws68.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement721);
                    statementSequence69=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence69.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:47: ( ELSIF ws expression THEN ws statementSequence )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:48: ELSIF ws expression THEN ws statementSequence
                    	    {
                    	    ELSIF70=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement724); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF70);

                    	    pushFollow(FOLLOW_ws_in_ifStatement726);
                    	    ws71=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws71.getTree());
                    	    pushFollow(FOLLOW_expression_in_ifStatement728);
                    	    expression72=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression72.getTree());
                    	    THEN73=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement730); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN73);

                    	    pushFollow(FOLLOW_ws_in_ifStatement732);
                    	    ws74=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws74.getTree());
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement734);
                    	    statementSequence75=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence75.getTree());

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

                    END76=(Token)match(input,END,FOLLOW_END_in_ifStatement738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END76);



                    // AST REWRITE
                    // elements: statementSequence, statementSequence, expression, ELSIF, IF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( ELSIF ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
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
                        if ( !(stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_statementSequence.hasNext()||stream_expression.hasNext()||stream_ELSIF.hasNext() ) {
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:4: IF ws expression THEN ws statementSequence ( ELSE ws statementSequence ) END
                    {
                    IF77=(Token)match(input,IF,FOLLOW_IF_in_ifStatement784); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF77);

                    pushFollow(FOLLOW_ws_in_ifStatement786);
                    ws78=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws78.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement788);
                    expression79=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression79.getTree());
                    THEN80=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN80);

                    pushFollow(FOLLOW_ws_in_ifStatement792);
                    ws81=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws81.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement794);
                    statementSequence82=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence82.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:47: ( ELSE ws statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:48: ELSE ws statementSequence
                    {
                    ELSE83=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement797); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE83);

                    pushFollow(FOLLOW_ws_in_ifStatement799);
                    ws84=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws84.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement801);
                    statementSequence85=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence85.getTree());

                    }

                    END86=(Token)match(input,END,FOLLOW_END_in_ifStatement804); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END86);



                    // AST REWRITE
                    // elements: statementSequence, statementSequence, expression, ELSE, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 89:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:37: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:64: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:71: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:4: IF ws expression THEN ws statementSequence END
                    {
                    IF87=(Token)match(input,IF,FOLLOW_IF_in_ifStatement843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF87);

                    pushFollow(FOLLOW_ws_in_ifStatement845);
                    ws88=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws88.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement847);
                    expression89=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression89.getTree());
                    THEN90=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN90);

                    pushFollow(FOLLOW_ws_in_ifStatement851);
                    ws91=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws91.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement853);
                    statementSequence92=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence92.getTree());
                    END93=(Token)match(input,END,FOLLOW_END_in_ifStatement855); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END93);



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
                    // 91:5: -> ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:8: ^( IF ^( EXPRESSION expression ) ^( BODY statementSequence ) )
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:38: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:1: whileStatement : WHILE ws expression DO ws statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE94=null;
        Token DO97=null;
        Token END100=null;
        Oberon0Parser.ws_return ws95 = null;

        Oberon0Parser.expression_return expression96 = null;

        Oberon0Parser.ws_return ws98 = null;

        Oberon0Parser.statementSequence_return statementSequence99 = null;


        CommonTree WHILE94_tree=null;
        CommonTree DO97_tree=null;
        CommonTree END100_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:15: ( WHILE ws expression DO ws statementSequence END -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:18: WHILE ws expression DO ws statementSequence END
            {
            WHILE94=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE94);

            pushFollow(FOLLOW_ws_in_whileStatement886);
            ws95=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws95.getTree());
            pushFollow(FOLLOW_expression_in_whileStatement888);
            expression96=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression96.getTree());
            DO97=(Token)match(input,DO,FOLLOW_DO_in_whileStatement890); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO97);

            pushFollow(FOLLOW_ws_in_whileStatement892);
            ws98=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws98.getTree());
            pushFollow(FOLLOW_statementSequence_in_whileStatement894);
            statementSequence99=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence99.getTree());
            END100=(Token)match(input,END,FOLLOW_END_in_whileStatement896); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END100);



            // AST REWRITE
            // elements: WHILE, expression, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 93:5: -> ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:8: ^( WHILE ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:16: ^( EXPRESSION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:41: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGNMENT102=null;
        Oberon0Parser.selector_return selector101 = null;

        Oberon0Parser.expression_return expression103 = null;


        CommonTree ASSIGNMENT102_tree=null;
        RewriteRuleTokenStream stream_ASSIGNMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGNMENT");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment925);
            selector101=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector101.getTree());
            ASSIGNMENT102=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT102);

            pushFollow(FOLLOW_expression_in_assignment929);
            expression103=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());


            // AST REWRITE
            // elements: selector, ASSIGNMENT, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 95:5: -> ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:8: ^( ASSIGNMENT ^( LH selector ) ^( RH expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGNMENT.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:21: ^( LH selector )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LH, "LH"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:36: ^( RH expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:1: procedureCall : selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector104 = null;

        Oberon0Parser.actualParameters_return actualParameters105 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:14: ( selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall958);
            selector104=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector104.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:26: ( actualParameters )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall961);
                    actualParameters105=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters105.getTree());

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
            // 97:5: -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:8: ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:21: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:46: ( actualParameters )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment106 = null;

        Oberon0Parser.procedureCall_return procedureCall107 = null;

        Oberon0Parser.ifStatement_return ifStatement108 = null;

        Oberon0Parser.whileStatement_return whileStatement109 = null;



        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:10: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement990);
                    assignment106=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment106.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement994);
                    procedureCall107=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall107.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement997);
                    ifStatement108=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement108.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1001);
                    whileStatement109=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement109.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:1: statementSequence : statement ( ';' ws statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal111=null;
        Oberon0Parser.statement_return statement110 = null;

        Oberon0Parser.ws_return ws112 = null;

        Oberon0Parser.statement_return statement113 = null;


        CommonTree char_literal111_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:18: ( statement ( ';' ws statement )* -> statement ( statement )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:20: statement ( ';' ws statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence1009);
            statement110=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement110.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:30: ( ';' ws statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==51) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:31: ';' ws statement
            	    {
            	    char_literal111=(Token)match(input,51,FOLLOW_51_in_statementSequence1012); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal111);

            	    pushFollow(FOLLOW_ws_in_statementSequence1014);
            	    ws112=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws112.getTree());
            	    pushFollow(FOLLOW_statement_in_statementSequence1016);
            	    statement113=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());

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
            // 100:5: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:18: ( statement )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:1: identList : ident ( ws ',' ws ident )* -> ident ( ident )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal116=null;
        Oberon0Parser.ident_return ident114 = null;

        Oberon0Parser.ws_return ws115 = null;

        Oberon0Parser.ws_return ws117 = null;

        Oberon0Parser.ident_return ident118 = null;


        CommonTree char_literal116_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:10: ( ident ( ws ',' ws ident )* -> ident ( ident )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:13: ident ( ws ',' ws ident )*
            {
            pushFollow(FOLLOW_ident_in_identList1038);
            ident114=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident114.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:19: ( ws ',' ws ident )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==EOF||(LA17_0>=MINUS && LA17_0<=PLUS)||(LA17_0>=CONST && LA17_0<=END)||(LA17_0>=DO && LA17_0<=RECORD)||LA17_0==EQUALS||LA17_0==DOTSELECTOR||(LA17_0>=IDENT && LA17_0<=48)||(LA17_0>=50 && LA17_0<=51)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:20: ws ',' ws ident
            	    {
            	    pushFollow(FOLLOW_ws_in_identList1041);
            	    ws115=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws115.getTree());
            	    char_literal116=(Token)match(input,50,FOLLOW_50_in_identList1043); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal116);

            	    pushFollow(FOLLOW_ws_in_identList1045);
            	    ws117=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws117.getTree());
            	    pushFollow(FOLLOW_ident_in_identList1047);
            	    ident118=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident118.getTree());

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
            // 102:5: -> ident ( ident )*
            {
                adaptor.addChild(root_0, stream_ident.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:102:14: ( ident )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:1: arrayType : ARRAY ws expression OF ws type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY119=null;
        Token OF122=null;
        Oberon0Parser.ws_return ws120 = null;

        Oberon0Parser.expression_return expression121 = null;

        Oberon0Parser.ws_return ws123 = null;

        Oberon0Parser.type_return type124 = null;


        CommonTree ARRAY119_tree=null;
        CommonTree OF122_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:10: ( ARRAY ws expression OF ws type -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:13: ARRAY ws expression OF ws type
            {
            ARRAY119=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1069); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY119);

            pushFollow(FOLLOW_ws_in_arrayType1071);
            ws120=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws120.getTree());
            pushFollow(FOLLOW_expression_in_arrayType1073);
            expression121=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression121.getTree());
            OF122=(Token)match(input,OF,FOLLOW_OF_in_arrayType1075); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF122);

            pushFollow(FOLLOW_ws_in_arrayType1077);
            ws123=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws123.getTree());
            pushFollow(FOLLOW_type_in_arrayType1079);
            type124=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type124.getTree());


            // AST REWRITE
            // elements: type, expression, ARRAY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:5: -> ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:104:8: ^( ARRAY ^( TYPE type ) ^( EXPRESSION expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:104:16: ^( TYPE type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:104:29: ^( EXPRESSION expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:1: fieldList : ( identList ':' ws type ws )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal126=null;
        Oberon0Parser.identList_return identList125 = null;

        Oberon0Parser.ws_return ws127 = null;

        Oberon0Parser.type_return type128 = null;

        Oberon0Parser.ws_return ws129 = null;


        CommonTree char_literal126_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:2: ( ( identList ':' ws type ws )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:5: ( identList ':' ws type ws )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:5: ( identList ':' ws type ws )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:6: identList ':' ws type ws
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1113);
                    identList125=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identList125.getTree());
                    char_literal126=(Token)match(input,52,FOLLOW_52_in_fieldList1115); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal126_tree = (CommonTree)adaptor.create(char_literal126);
                    adaptor.addChild(root_0, char_literal126_tree);
                    }
                    pushFollow(FOLLOW_ws_in_fieldList1117);
                    ws127=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws127.getTree());
                    pushFollow(FOLLOW_type_in_fieldList1119);
                    type128=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type128.getTree());
                    pushFollow(FOLLOW_ws_in_fieldList1121);
                    ws129=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws129.getTree());

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
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:108:1: recordType : RECORD ws fieldList ( ';' ws fieldList )* END ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD130=null;
        Token char_literal133=null;
        Token END136=null;
        Oberon0Parser.ws_return ws131 = null;

        Oberon0Parser.fieldList_return fieldList132 = null;

        Oberon0Parser.ws_return ws134 = null;

        Oberon0Parser.fieldList_return fieldList135 = null;


        CommonTree RECORD130_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree END136_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:2: ( RECORD ws fieldList ( ';' ws fieldList )* END )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:5: RECORD ws fieldList ( ';' ws fieldList )* END
            {
            root_0 = (CommonTree)adaptor.nil();

            RECORD130=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1132); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RECORD130_tree = (CommonTree)adaptor.create(RECORD130);
            adaptor.addChild(root_0, RECORD130_tree);
            }
            pushFollow(FOLLOW_ws_in_recordType1134);
            ws131=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ws131.getTree());
            pushFollow(FOLLOW_fieldList_in_recordType1136);
            fieldList132=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList132.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:25: ( ';' ws fieldList )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==51) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:26: ';' ws fieldList
            	    {
            	    char_literal133=(Token)match(input,51,FOLLOW_51_in_recordType1139); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal133_tree = (CommonTree)adaptor.create(char_literal133);
            	    adaptor.addChild(root_0, char_literal133_tree);
            	    }
            	    pushFollow(FOLLOW_ws_in_recordType1141);
            	    ws134=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws134.getTree());
            	    pushFollow(FOLLOW_fieldList_in_recordType1143);
            	    fieldList135=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList135.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            END136=(Token)match(input,END,FOLLOW_END_in_recordType1147); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END136_tree = (CommonTree)adaptor.create(END136);
            adaptor.addChild(root_0, END136_tree);
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
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:1: type : ( ident | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.ident_return ident137 = null;

        Oberon0Parser.arrayType_return arrayType138 = null;

        Oberon0Parser.recordType_return recordType139 = null;



        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:2: ( ident | arrayType | recordType )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:5: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_type1158);
                    ident137=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident137.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:13: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1162);
                    arrayType138=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType138.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:25: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1166);
                    recordType139=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType139.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:113:1: fPSection : ( VAR ws identList ':' ws type -> ^( REFVAR type identList ) | identList ':' ws type -> ^( VAR type identList ) );
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR140=null;
        Token char_literal143=null;
        Token char_literal147=null;
        Oberon0Parser.ws_return ws141 = null;

        Oberon0Parser.identList_return identList142 = null;

        Oberon0Parser.ws_return ws144 = null;

        Oberon0Parser.type_return type145 = null;

        Oberon0Parser.identList_return identList146 = null;

        Oberon0Parser.ws_return ws148 = null;

        Oberon0Parser.type_return type149 = null;


        CommonTree VAR140_tree=null;
        CommonTree char_literal143_tree=null;
        CommonTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:113:10: ( VAR ws identList ':' ws type -> ^( REFVAR type identList ) | identList ':' ws type -> ^( VAR type identList ) )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:113:13: VAR ws identList ':' ws type
                    {
                    VAR140=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR140);

                    pushFollow(FOLLOW_ws_in_fPSection1176);
                    ws141=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws141.getTree());
                    pushFollow(FOLLOW_identList_in_fPSection1178);
                    identList142=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList142.getTree());
                    char_literal143=(Token)match(input,52,FOLLOW_52_in_fPSection1180); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal143);

                    pushFollow(FOLLOW_ws_in_fPSection1182);
                    ws144=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws144.getTree());
                    pushFollow(FOLLOW_type_in_fPSection1184);
                    type145=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type145.getTree());


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
                    // 114:5: -> ^( REFVAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:8: ^( REFVAR type identList )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:4: identList ':' ws type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1205);
                    identList146=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList146.getTree());
                    char_literal147=(Token)match(input,52,FOLLOW_52_in_fPSection1207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal147);

                    pushFollow(FOLLOW_ws_in_fPSection1209);
                    ws148=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws148.getTree());
                    pushFollow(FOLLOW_type_in_fPSection1211);
                    type149=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type149.getTree());


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
                    // 116:5: -> ^( VAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:8: ^( VAR type identList )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:1: formalParameters : '(' ws ( fPSection ws ( ';' ws fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal150=null;
        Token char_literal154=null;
        Token char_literal157=null;
        Oberon0Parser.ws_return ws151 = null;

        Oberon0Parser.fPSection_return fPSection152 = null;

        Oberon0Parser.ws_return ws153 = null;

        Oberon0Parser.ws_return ws155 = null;

        Oberon0Parser.fPSection_return fPSection156 = null;


        CommonTree char_literal150_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal157_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:17: ( '(' ws ( fPSection ws ( ';' ws fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:19: '(' ws ( fPSection ws ( ';' ws fPSection )* )? ')'
            {
            char_literal150=(Token)match(input,46,FOLLOW_46_in_formalParameters1231); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal150);

            pushFollow(FOLLOW_ws_in_formalParameters1233);
            ws151=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws151.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:26: ( fPSection ws ( ';' ws fPSection )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VAR||LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:27: fPSection ws ( ';' ws fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1236);
                    fPSection152=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection152.getTree());
                    pushFollow(FOLLOW_ws_in_formalParameters1238);
                    ws153=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws153.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:40: ( ';' ws fPSection )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==51) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:41: ';' ws fPSection
                    	    {
                    	    char_literal154=(Token)match(input,51,FOLLOW_51_in_formalParameters1241); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_51.add(char_literal154);

                    	    pushFollow(FOLLOW_ws_in_formalParameters1243);
                    	    ws155=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws155.getTree());
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1245);
                    	    fPSection156=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection156.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal157=(Token)match(input,47,FOLLOW_47_in_formalParameters1251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal157);



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
            // 118:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:32: ( fPSection )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:1: procedureBody : BEGIN ws statementSequence -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN158=null;
        Oberon0Parser.ws_return ws159 = null;

        Oberon0Parser.statementSequence_return statementSequence160 = null;


        CommonTree BEGIN158_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:14: ( BEGIN ws statementSequence -> ^( BODY statementSequence ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:17: BEGIN ws statementSequence
            {
            BEGIN158=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1278); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN158);

            pushFollow(FOLLOW_ws_in_procedureBody1280);
            ws159=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws159.getTree());
            pushFollow(FOLLOW_statementSequence_in_procedureBody1282);
            statementSequence160=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence160.getTree());


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
            // 120:5: -> ^( BODY statementSequence )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:8: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:1: procedureDeclaration : PROCEDURE ws ident ( ws formalParameters )? ws ';' ws declarations ( procedureBody )? END ws ident -> ^( PROCEDURE ident ( formalParameters )? declarations ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE161=null;
        Token char_literal167=null;
        Token END171=null;
        Oberon0Parser.ws_return ws162 = null;

        Oberon0Parser.ident_return ident163 = null;

        Oberon0Parser.ws_return ws164 = null;

        Oberon0Parser.formalParameters_return formalParameters165 = null;

        Oberon0Parser.ws_return ws166 = null;

        Oberon0Parser.ws_return ws168 = null;

        Oberon0Parser.declarations_return declarations169 = null;

        Oberon0Parser.procedureBody_return procedureBody170 = null;

        Oberon0Parser.ws_return ws172 = null;

        Oberon0Parser.ident_return ident173 = null;


        CommonTree PROCEDURE161_tree=null;
        CommonTree char_literal167_tree=null;
        CommonTree END171_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:21: ( PROCEDURE ws ident ( ws formalParameters )? ws ';' ws declarations ( procedureBody )? END ws ident -> ^( PROCEDURE ident ( formalParameters )? declarations ( procedureBody )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:23: PROCEDURE ws ident ( ws formalParameters )? ws ';' ws declarations ( procedureBody )? END ws ident
            {
            PROCEDURE161=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1300); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE161);

            pushFollow(FOLLOW_ws_in_procedureDeclaration1302);
            ws162=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws162.getTree());
            pushFollow(FOLLOW_ident_in_procedureDeclaration1304);
            ident163=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident163.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:42: ( ws formalParameters )?
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:43: ws formalParameters
                    {
                    pushFollow(FOLLOW_ws_in_procedureDeclaration1307);
                    ws164=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws164.getTree());
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1309);
                    formalParameters165=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters165.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_ws_in_procedureDeclaration1313);
            ws166=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws166.getTree());
            char_literal167=(Token)match(input,51,FOLLOW_51_in_procedureDeclaration1315); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal167);

            pushFollow(FOLLOW_ws_in_procedureDeclaration1317);
            ws168=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws168.getTree());
            pushFollow(FOLLOW_declarations_in_procedureDeclaration1319);
            declarations169=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations169.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:88: ( procedureBody )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==BEGIN) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:89: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1322);
                    procedureBody170=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody170.getTree());

                    }
                    break;

            }

            END171=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END171);

            pushFollow(FOLLOW_ws_in_procedureDeclaration1328);
            ws172=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws172.getTree());
            pushFollow(FOLLOW_ident_in_procedureDeclaration1330);
            ident173=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident173.getTree());


            // AST REWRITE
            // elements: formalParameters, declarations, ident, procedureBody, PROCEDURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:5: -> ^( PROCEDURE ident ( formalParameters )? declarations ( procedureBody )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:8: ^( PROCEDURE ident ( formalParameters )? declarations ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                adaptor.addChild(root_1, stream_declarations.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:59: ( procedureBody )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:1: constDeclaration : ( CONST ws ( ident ws '=' ws expression ';' )* ) -> ( ^( CONST ident expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST174=null;
        Token char_literal178=null;
        Token char_literal181=null;
        Oberon0Parser.ws_return ws175 = null;

        Oberon0Parser.ident_return ident176 = null;

        Oberon0Parser.ws_return ws177 = null;

        Oberon0Parser.ws_return ws179 = null;

        Oberon0Parser.expression_return expression180 = null;


        CommonTree CONST174_tree=null;
        CommonTree char_literal178_tree=null;
        CommonTree char_literal181_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:17: ( ( CONST ws ( ident ws '=' ws expression ';' )* ) -> ( ^( CONST ident expression ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:19: ( CONST ws ( ident ws '=' ws expression ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:19: ( CONST ws ( ident ws '=' ws expression ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:20: CONST ws ( ident ws '=' ws expression ';' )*
            {
            CONST174=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1362); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST174);

            pushFollow(FOLLOW_ws_in_constDeclaration1364);
            ws175=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws175.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:29: ( ident ws '=' ws expression ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:30: ident ws '=' ws expression ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_constDeclaration1367);
            	    ident176=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident176.getTree());
            	    pushFollow(FOLLOW_ws_in_constDeclaration1369);
            	    ws177=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws177.getTree());
            	    char_literal178=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1371); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal178);

            	    pushFollow(FOLLOW_ws_in_constDeclaration1373);
            	    ws179=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws179.getTree());
            	    pushFollow(FOLLOW_expression_in_constDeclaration1375);
            	    expression180=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression180.getTree());
            	    char_literal181=(Token)match(input,51,FOLLOW_51_in_constDeclaration1377); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal181);


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
            // 124:5: -> ( ^( CONST ident expression ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:8: ( ^( CONST ident expression ) )*
                while ( stream_expression.hasNext()||stream_ident.hasNext()||stream_CONST.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:8: ^( CONST ident expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:1: typeDeclaration : ( TYPE ws ( ident ws '=' ws type ws ';' )* ) -> ( ^( TYPE ident type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE182=null;
        Token char_literal186=null;
        Token char_literal190=null;
        Oberon0Parser.ws_return ws183 = null;

        Oberon0Parser.ident_return ident184 = null;

        Oberon0Parser.ws_return ws185 = null;

        Oberon0Parser.ws_return ws187 = null;

        Oberon0Parser.type_return type188 = null;

        Oberon0Parser.ws_return ws189 = null;


        CommonTree TYPE182_tree=null;
        CommonTree char_literal186_tree=null;
        CommonTree char_literal190_tree=null;
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:16: ( ( TYPE ws ( ident ws '=' ws type ws ';' )* ) -> ( ^( TYPE ident type ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:18: ( TYPE ws ( ident ws '=' ws type ws ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:18: ( TYPE ws ( ident ws '=' ws type ws ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:19: TYPE ws ( ident ws '=' ws type ws ';' )*
            {
            TYPE182=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1402); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE182);

            pushFollow(FOLLOW_ws_in_typeDeclaration1404);
            ws183=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws183.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:27: ( ident ws '=' ws type ws ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:28: ident ws '=' ws type ws ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_typeDeclaration1407);
            	    ident184=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident184.getTree());
            	    pushFollow(FOLLOW_ws_in_typeDeclaration1409);
            	    ws185=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws185.getTree());
            	    char_literal186=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1411); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal186);

            	    pushFollow(FOLLOW_ws_in_typeDeclaration1413);
            	    ws187=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws187.getTree());
            	    pushFollow(FOLLOW_type_in_typeDeclaration1415);
            	    type188=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type188.getTree());
            	    pushFollow(FOLLOW_ws_in_typeDeclaration1417);
            	    ws189=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws189.getTree());
            	    char_literal190=(Token)match(input,51,FOLLOW_51_in_typeDeclaration1419); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal190);


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
            // 126:5: -> ( ^( TYPE ident type ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:8: ( ^( TYPE ident type ) )*
                while ( stream_TYPE.hasNext()||stream_type.hasNext()||stream_ident.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:8: ^( TYPE ident type )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:1: varDeclarations : ( VAR ws ( identList ':' ws type ws ';' )* ) -> ( ^( VAR type identList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR191=null;
        Token char_literal194=null;
        Token char_literal198=null;
        Oberon0Parser.ws_return ws192 = null;

        Oberon0Parser.identList_return identList193 = null;

        Oberon0Parser.ws_return ws195 = null;

        Oberon0Parser.type_return type196 = null;

        Oberon0Parser.ws_return ws197 = null;


        CommonTree VAR191_tree=null;
        CommonTree char_literal194_tree=null;
        CommonTree char_literal198_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:16: ( ( VAR ws ( identList ':' ws type ws ';' )* ) -> ( ^( VAR type identList ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:18: ( VAR ws ( identList ':' ws type ws ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:18: ( VAR ws ( identList ':' ws type ws ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:19: VAR ws ( identList ':' ws type ws ';' )*
            {
            VAR191=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1444); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR191);

            pushFollow(FOLLOW_ws_in_varDeclarations1446);
            ws192=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws192.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:26: ( identList ':' ws type ws ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:27: identList ':' ws type ws ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1449);
            	    identList193=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList193.getTree());
            	    char_literal194=(Token)match(input,52,FOLLOW_52_in_varDeclarations1451); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_52.add(char_literal194);

            	    pushFollow(FOLLOW_ws_in_varDeclarations1453);
            	    ws195=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws195.getTree());
            	    pushFollow(FOLLOW_type_in_varDeclarations1455);
            	    type196=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type196.getTree());
            	    pushFollow(FOLLOW_ws_in_varDeclarations1457);
            	    ws197=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws197.getTree());
            	    char_literal198=(Token)match(input,51,FOLLOW_51_in_varDeclarations1459); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal198);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: identList, VAR, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 128:5: -> ( ^( VAR type identList ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:8: ( ^( VAR type identList ) )*
                while ( stream_identList.hasNext()||stream_VAR.hasNext()||stream_type.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:8: ^( VAR type identList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_identList.reset();
                stream_VAR.reset();
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ws ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal204=null;
        Oberon0Parser.constDeclaration_return constDeclaration199 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration200 = null;

        Oberon0Parser.varDeclarations_return varDeclarations201 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration202 = null;

        Oberon0Parser.ws_return ws203 = null;


        CommonTree char_literal204_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ws ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ws ';' )*
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:16: ( constDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CONST) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1484);
                    constDeclaration199=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration199.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:34: ( typeDeclaration )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==TYPE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1487);
                    typeDeclaration200=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration200.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:51: ( varDeclarations )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==VAR) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1490);
                    varDeclarations201=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations201.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:68: ( procedureDeclaration ws ';' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==PROCEDURE) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:69: procedureDeclaration ws ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1494);
            	    procedureDeclaration202=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration202.getTree());
            	    pushFollow(FOLLOW_ws_in_declarations1496);
            	    ws203=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws203.getTree());
            	    char_literal204=(Token)match(input,51,FOLLOW_51_in_declarations1498); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal204);


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);



            // AST REWRITE
            // elements: typeDeclaration, procedureDeclaration, constDeclaration, varDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 130:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:60: ( procedureDeclaration )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:1: moduleBody : ws declarations ( BEGIN ws statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN207=null;
        Token END210=null;
        Oberon0Parser.ws_return ws205 = null;

        Oberon0Parser.declarations_return declarations206 = null;

        Oberon0Parser.ws_return ws208 = null;

        Oberon0Parser.statementSequence_return statementSequence209 = null;


        CommonTree BEGIN207_tree=null;
        CommonTree END210_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:11: ( ws declarations ( BEGIN ws statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:14: ws declarations ( BEGIN ws statementSequence )? END
            {
            pushFollow(FOLLOW_ws_in_moduleBody1527);
            ws205=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws205.getTree());
            pushFollow(FOLLOW_declarations_in_moduleBody1529);
            declarations206=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations206.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:30: ( BEGIN ws statementSequence )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==BEGIN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:31: BEGIN ws statementSequence
                    {
                    BEGIN207=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1532); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN207);

                    pushFollow(FOLLOW_ws_in_moduleBody1534);
                    ws208=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws208.getTree());
                    pushFollow(FOLLOW_statementSequence_in_moduleBody1536);
                    statementSequence209=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence209.getTree());

                    }
                    break;

            }

            END210=(Token)match(input,END,FOLLOW_END_in_moduleBody1540); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END210);



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
            // 132:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:132:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:132:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:132:22: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:1: module : MODULE ws ident ws ';' moduleBody ws ident ws '.' ws EOF -> ^( MODULE ident moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE211=null;
        Token char_literal215=null;
        Token char_literal220=null;
        Token EOF222=null;
        Oberon0Parser.ws_return ws212 = null;

        Oberon0Parser.ident_return ident213 = null;

        Oberon0Parser.ws_return ws214 = null;

        Oberon0Parser.moduleBody_return moduleBody216 = null;

        Oberon0Parser.ws_return ws217 = null;

        Oberon0Parser.ident_return ident218 = null;

        Oberon0Parser.ws_return ws219 = null;

        Oberon0Parser.ws_return ws221 = null;


        CommonTree MODULE211_tree=null;
        CommonTree char_literal215_tree=null;
        CommonTree char_literal220_tree=null;
        CommonTree EOF222_tree=null;
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:7: ( MODULE ws ident ws ';' moduleBody ws ident ws '.' ws EOF -> ^( MODULE ident moduleBody ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:133:11: MODULE ws ident ws ';' moduleBody ws ident ws '.' ws EOF
            {
            MODULE211=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1564); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE211);

            pushFollow(FOLLOW_ws_in_module1566);
            ws212=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws212.getTree());
            pushFollow(FOLLOW_ident_in_module1568);
            ident213=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident213.getTree());
            pushFollow(FOLLOW_ws_in_module1570);
            ws214=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws214.getTree());
            char_literal215=(Token)match(input,51,FOLLOW_51_in_module1572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal215);

            pushFollow(FOLLOW_moduleBody_in_module1574);
            moduleBody216=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody216.getTree());
            pushFollow(FOLLOW_ws_in_module1576);
            ws217=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws217.getTree());
            pushFollow(FOLLOW_ident_in_module1578);
            ident218=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident218.getTree());
            pushFollow(FOLLOW_ws_in_module1580);
            ws219=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws219.getTree());
            char_literal220=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1582); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal220);

            pushFollow(FOLLOW_ws_in_module1584);
            ws221=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws221.getTree());
            EOF222=(Token)match(input,EOF,FOLLOW_EOF_in_module1586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF222);



            // AST REWRITE
            // elements: ident, moduleBody, MODULE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 134:5: -> ^( MODULE ident moduleBody )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:134:8: ^( MODULE ident moduleBody )
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

    // $ANTLR start synpred1_Oberon0
    public final void synpred1_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:66:8: ( WHITESPACE )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:66:8: WHITESPACE
        {
        match(input,WHITESPACE,FOLLOW_WHITESPACE_in_synpred1_Oberon0339); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Oberon0

    // $ANTLR start synpred22_Oberon0
    public final void synpred22_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:14: ( simpleExpression infixOperand ws simpleExpression ws )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:14: simpleExpression infixOperand ws simpleExpression ws
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred22_Oberon0537);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred22_Oberon0539);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred22_Oberon0541);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred22_Oberon0543);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred22_Oberon0545);
        ws();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Oberon0

    // $ANTLR start synpred26_Oberon0
    public final void synpred26_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:15: ( IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ ( ELSE ws statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:15: IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ ( ELSE ws statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred26_Oberon0620); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred26_Oberon0622);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred26_Oberon0624);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred26_Oberon0626); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred26_Oberon0628);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0630);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:58: ( ELSIF ws expression THEN ws statementSequence )+
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
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:59: ELSIF ws expression THEN ws statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred26_Oberon0633); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred26_Oberon0635);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred26_Oberon0637);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred26_Oberon0639); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred26_Oberon0641);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0643);
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

        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:107: ( ELSE ws statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:108: ELSE ws statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred26_Oberon0648); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred26_Oberon0650);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0652);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred26_Oberon0655); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Oberon0

    // $ANTLR start synpred28_Oberon0
    public final void synpred28_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:4: ( IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:4: IF ws expression THEN ws statementSequence ( ELSIF ws expression THEN ws statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred28_Oberon0711); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred28_Oberon0713);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred28_Oberon0715);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0717); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred28_Oberon0719);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0721);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:47: ( ELSIF ws expression THEN ws statementSequence )+
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
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:48: ELSIF ws expression THEN ws statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred28_Oberon0724); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred28_Oberon0726);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred28_Oberon0728);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0730); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred28_Oberon0732);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0734);
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

        match(input,END,FOLLOW_END_in_synpred28_Oberon0738); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Oberon0

    // $ANTLR start synpred29_Oberon0
    public final void synpred29_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:4: ( IF ws expression THEN ws statementSequence ( ELSE ws statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:4: IF ws expression THEN ws statementSequence ( ELSE ws statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred29_Oberon0784); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred29_Oberon0786);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred29_Oberon0788);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0790); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred29_Oberon0792);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0794);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:47: ( ELSE ws statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:48: ELSE ws statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred29_Oberon0797); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred29_Oberon0799);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0801);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred29_Oberon0804); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Oberon0

    // $ANTLR start synpred31_Oberon0
    public final void synpred31_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: ( assignment )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred31_Oberon0990);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Oberon0

    // $ANTLR start synpred32_Oberon0
    public final void synpred32_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:27: ( procedureCall )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred32_Oberon0994);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Oberon0

    // Delegated rules

    public final boolean synpred1_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Oberon0_fragment(); // can never throw exception
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
    protected DFA24 dfa24 = new DFA24(this);
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
            "\1\2\1\uffff\3\4\2\uffff\1\3\27\uffff\1\1\10\uffff\1\4",
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
            return "98:13: ( assignment | procedureCall | ifStatement | whileStatement )?";
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
    static final String DFA24_eotS =
        "\4\uffff";
    static final String DFA24_eofS =
        "\4\uffff";
    static final String DFA24_minS =
        "\2\53\2\uffff";
    static final String DFA24_maxS =
        "\2\63\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\4\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\2\uffff\1\2\4\uffff\1\3",
            "\1\1\2\uffff\1\2\4\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "121:42: ( ws formalParameters )?";
        }
    }
 

    public static final BitSet FOLLOW_WHITESPACE_in_ws339 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_IDENT_in_ident349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_selector368 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector372 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ident_in_selector375 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector379 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_selector382 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_selector384 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_ws_in_selector386 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_selector388 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ident_in_selector396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_factor420 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_factor423 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_factor425 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_factor427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_factor432 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_factor435 = new BitSet(new long[]{0x0001540000000030L});
    public static final BitSet FOLLOW_factor_in_factor437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term446 = new BitSet(new long[]{0x00000000030000C2L});
    public static final BitSet FOLLOW_set_in_term449 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_term460 = new BitSet(new long[]{0x0001540000000030L});
    public static final BitSet FOLLOW_factor_in_term462 = new BitSet(new long[]{0x00000000030000C2L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression476 = new BitSet(new long[]{0x0001540000000030L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression478 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_simpleExpression481 = new BitSet(new long[]{0x0001540000000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression485 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_set_in_simpleExpression488 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_simpleExpression498 = new BitSet(new long[]{0x0001540000000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression500 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression537 = new BitSet(new long[]{0x00020001F0000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression539 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_expression541 = new BitSet(new long[]{0x0001540000000030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression543 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ws_in_expression545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_actualParameters580 = new BitSet(new long[]{0x0001DC0000000030L});
    public static final BitSet FOLLOW_ws_in_actualParameters582 = new BitSet(new long[]{0x0001DC0000000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters585 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_50_in_actualParameters588 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_actualParameters590 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters592 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_47_in_actualParameters598 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ws_in_actualParameters600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement620 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_ifStatement622 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement624 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement626 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement628 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement630 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement633 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_ifStatement635 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement637 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement639 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement641 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement643 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement648 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement650 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement652 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement711 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_ifStatement713 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement715 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement717 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement719 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement721 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement724 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_ifStatement726 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement728 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement730 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement732 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement734 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_ifStatement738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement784 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_ifStatement786 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement788 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement790 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement792 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement794 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement797 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement799 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement843 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_ifStatement845 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement847 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement849 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_ifStatement851 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement853 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement884 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_whileStatement886 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_whileStatement888 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_whileStatement890 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_whileStatement892 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement894 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_whileStatement896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment925 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment927 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_assignment929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall958 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1009 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_statementSequence1012 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_statementSequence1014 = new BitSet(new long[]{0x0008040000040800L});
    public static final BitSet FOLLOW_statement_in_statementSequence1016 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ident_in_identList1038 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_ws_in_identList1041 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_identList1043 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_identList1045 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ident_in_identList1047 = new BitSet(new long[]{0x0004080000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1069 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_arrayType1071 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_arrayType1073 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OF_in_arrayType1075 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_ws_in_arrayType1077 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_type_in_arrayType1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1113 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fieldList1115 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_ws_in_fieldList1117 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_type_in_fieldList1119 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ws_in_fieldList1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1132 = new BitSet(new long[]{0x00080C0000008000L});
    public static final BitSet FOLLOW_ws_in_recordType1134 = new BitSet(new long[]{0x0008040000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1136 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_51_in_recordType1139 = new BitSet(new long[]{0x00080C0000008000L});
    public static final BitSet FOLLOW_ws_in_recordType1141 = new BitSet(new long[]{0x0008040000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1143 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_END_in_recordType1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1174 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_fPSection1176 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1178 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fPSection1180 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_ws_in_fPSection1182 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_type_in_fPSection1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1205 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fPSection1207 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_ws_in_fPSection1209 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_type_in_fPSection1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_formalParameters1231 = new BitSet(new long[]{0x00008C0000000200L});
    public static final BitSet FOLLOW_ws_in_formalParameters1233 = new BitSet(new long[]{0x0000840000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1236 = new BitSet(new long[]{0x0008880000000000L});
    public static final BitSet FOLLOW_ws_in_formalParameters1238 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_51_in_formalParameters1241 = new BitSet(new long[]{0x00000C0000000200L});
    public static final BitSet FOLLOW_ws_in_formalParameters1243 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1245 = new BitSet(new long[]{0x0008800000000000L});
    public static final BitSet FOLLOW_47_in_formalParameters1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1278 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_procedureBody1280 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1300 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1302 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1304 = new BitSet(new long[]{0x0008480000000000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1307 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1309 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1313 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_procedureDeclaration1315 = new BitSet(new long[]{0x0000080000188700L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1317 = new BitSet(new long[]{0x0000000000188700L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1319 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1322 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1326 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1328 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1362 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_constDeclaration1364 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ident_in_constDeclaration1367 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_ws_in_constDeclaration1369 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1371 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_constDeclaration1373 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1375 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constDeclaration1377 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1402 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1404 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration1407 = new BitSet(new long[]{0x0000080010000000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1409 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1411 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1413 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1415 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1417 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_typeDeclaration1419 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1444 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_varDeclarations1446 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1449 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_varDeclarations1451 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_ws_in_varDeclarations1453 = new BitSet(new long[]{0x00000C0000A00000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1455 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_ws_in_varDeclarations1457 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_varDeclarations1459 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1484 = new BitSet(new long[]{0x0000000000100602L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1487 = new BitSet(new long[]{0x0000000000100202L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1490 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1494 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_ws_in_declarations1496 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_declarations1498 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ws_in_moduleBody1527 = new BitSet(new long[]{0x0000000000188700L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1529 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1532 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_moduleBody1534 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1536 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_moduleBody1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1564 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_module1566 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ident_in_module1568 = new BitSet(new long[]{0x0008080000000000L});
    public static final BitSet FOLLOW_ws_in_module1570 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_module1572 = new BitSet(new long[]{0x0000080000188700L});
    public static final BitSet FOLLOW_moduleBody_in_module1574 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_ws_in_module1576 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ident_in_module1578 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_ws_in_module1580 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1582 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ws_in_module1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITESPACE_in_synpred1_Oberon0339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred22_Oberon0537 = new BitSet(new long[]{0x00020001F0000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred22_Oberon0539 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_synpred22_Oberon0541 = new BitSet(new long[]{0x0001540000000030L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred22_Oberon0543 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ws_in_synpred22_Oberon0545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred26_Oberon0620 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0622 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_synpred26_Oberon0624 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred26_Oberon0626 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0628 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0630 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred26_Oberon0633 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0635 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_synpred26_Oberon0637 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred26_Oberon0639 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0641 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0643 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_synpred26_Oberon0648 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0650 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0652 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred26_Oberon0655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred28_Oberon0711 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0713 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0715 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0717 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0719 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0721 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred28_Oberon0724 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0726 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0728 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0730 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0732 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0734 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_synpred28_Oberon0738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred29_Oberon0784 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_ws_in_synpred29_Oberon0786 = new BitSet(new long[]{0x00015C0000000030L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0788 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0790 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_synpred29_Oberon0792 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0794 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_synpred29_Oberon0797 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_ws_in_synpred29_Oberon0799 = new BitSet(new long[]{0x00080C0000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0801 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred29_Oberon0804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred31_Oberon0990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred32_Oberon0994 = new BitSet(new long[]{0x0000000000000002L});

}