// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Data\\software_construction\\grammar\\Oberon0.g 2011-02-07 14:10:32

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TRUE", "FALSE", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "WITH", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "NOTEQUALS", "SMALLERTHAN", "GREATERTHAN", "SMALLEREQUALS", "GREATEREQUALS", "NOT", "REFVAR", "PROCEDURECALL", "PARAMETERS", "BODY", "DOTSELECTOR", "ARRAYSELECTOR", "WHITESPACE", "IDENT", "INTEGER", "']'", "'('", "')'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int WITH=21;
    public static final int BEGIN=22;
    public static final int PROCEDURE=23;
    public static final int ARRAY=24;
    public static final int OF=25;
    public static final int RECORD=26;
    public static final int MOD=27;
    public static final int AND=28;
    public static final int OR=29;
    public static final int ASSIGNMENT=30;
    public static final int EQUALS=31;
    public static final int NOTEQUALS=32;
    public static final int SMALLERTHAN=33;
    public static final int GREATERTHAN=34;
    public static final int SMALLEREQUALS=35;
    public static final int GREATEREQUALS=36;
    public static final int NOT=37;
    public static final int REFVAR=38;
    public static final int PROCEDURECALL=39;
    public static final int PARAMETERS=40;
    public static final int BODY=41;
    public static final int DOTSELECTOR=42;
    public static final int ARRAYSELECTOR=43;
    public static final int WHITESPACE=44;
    public static final int IDENT=45;
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


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:1: selector : ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT );
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT1=null;
        Token DOTSELECTOR2=null;
        Token IDENT3=null;
        Token ARRAYSELECTOR4=null;
        Token char_literal6=null;
        Token IDENT7=null;
        Oberon0Parser.expression_return expression5 = null;


        CommonTree IDENT1_tree=null;
        CommonTree DOTSELECTOR2_tree=null;
        CommonTree IDENT3_tree=null;
        CommonTree ARRAYSELECTOR4_tree=null;
        CommonTree char_literal6_tree=null;
        CommonTree IDENT7_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:9: ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=DOTSELECTOR && LA2_1<=ARRAYSELECTOR)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=MINUS && LA2_1<=DIVIDE)||(LA2_1>=THEN && LA2_1<=END)||LA2_1==DO||LA2_1==OF||(LA2_1>=MOD && LA2_1<=GREATEREQUALS)||(LA2_1>=47 && LA2_1<=51)) ) {
                    alt2=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:12: IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector366); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT1_tree = (CommonTree)adaptor.create(IDENT1);
                    adaptor.addChild(root_0, IDENT1_tree);
                    }
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:18: ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==DOTSELECTOR) ) {
                            alt1=1;
                        }
                        else if ( (LA1_0==ARRAYSELECTOR) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:19: ( DOTSELECTOR IDENT )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:19: ( DOTSELECTOR IDENT )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:20: DOTSELECTOR IDENT
                    	    {
                    	    DOTSELECTOR2=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector370); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR2_tree = (CommonTree)adaptor.create(DOTSELECTOR2);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR2_tree, root_0);
                    	    }
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector373); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    IDENT3_tree = (CommonTree)adaptor.create(IDENT3);
                    	    adaptor.addChild(root_0, IDENT3_tree);
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:40: ( ARRAYSELECTOR expression ']' )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:40: ( ARRAYSELECTOR expression ']' )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:41: ARRAYSELECTOR expression ']'
                    	    {
                    	    ARRAYSELECTOR4=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector377); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR4_tree = (CommonTree)adaptor.create(ARRAYSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_selector380);
                    	    expression5=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression5.getTree());
                    	    char_literal6=(Token)match(input,47,FOLLOW_47_in_selector382); if (state.failed) return retval;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:77: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT7_tree = (CommonTree)adaptor.create(IDENT7);
                    adaptor.addChild(root_0, IDENT7_tree);
                    }

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:1: numberLiteral : INTEGER ;
    public final Oberon0Parser.numberLiteral_return numberLiteral() throws RecognitionException {
        Oberon0Parser.numberLiteral_return retval = new Oberon0Parser.numberLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER8=null;

        CommonTree INTEGER8_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:14: ( INTEGER )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:17: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numberLiteral397); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER8_tree = (CommonTree)adaptor.create(INTEGER8);
            adaptor.addChild(root_0, INTEGER8_tree);
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:1: booleanLiteral : ( TRUE | FALSE );
    public final Oberon0Parser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        Oberon0Parser.booleanLiteral_return retval = new Oberon0Parser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:15: ( TRUE | FALSE )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set9=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set9));
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:1: factor : ( selector | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal13=null;
        Token char_literal15=null;
        Token NOT16=null;
        Oberon0Parser.selector_return selector10 = null;

        Oberon0Parser.booleanLiteral_return booleanLiteral11 = null;

        Oberon0Parser.numberLiteral_return numberLiteral12 = null;

        Oberon0Parser.expression_return expression14 = null;

        Oberon0Parser.factor_return factor17 = null;


        CommonTree char_literal13_tree=null;
        CommonTree char_literal15_tree=null;
        CommonTree NOT16_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:7: ( selector | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor )
            int alt3=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt3=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt3=2;
                }
                break;
            case INTEGER:
                {
                alt3=3;
                }
                break;
            case 48:
                {
                alt3=4;
                }
                break;
            case NOT:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor414);
                    selector10=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector10.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:22: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_factor418);
                    booleanLiteral11=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral11.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:39: numberLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numberLiteral_in_factor422);
                    numberLiteral12=numberLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numberLiteral12.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:55: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal13=(Token)match(input,48,FOLLOW_48_in_factor426); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor429);
                    expression14=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression14.getTree());
                    char_literal15=(Token)match(input,49,FOLLOW_49_in_factor431); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:78: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT16=(Token)match(input,NOT,FOLLOW_NOT_in_factor436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT16_tree = (CommonTree)adaptor.create(NOT16);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT16_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor439);
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set19=null;
        Oberon0Parser.factor_return factor18 = null;

        Oberon0Parser.factor_return factor20 = null;


        CommonTree set19_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:9: factor ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term447);
            factor18=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor18.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:16: ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TIMES && LA4_0<=DIVIDE)||(LA4_0>=MOD && LA4_0<=AND)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:17: ( TIMES | DIVIDE | MOD | AND ) factor
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

            	    pushFollow(FOLLOW_factor_in_term461);
            	    factor20=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor20.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:17: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:19: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:19: ( PLUS | MINUS )?
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==PLUS) ) {
                alt5=1;
            }
            else if ( (LA5_0==MINUS) ) {
                alt5=2;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:20: PLUS
                    {
                    PLUS21=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression470); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:26: MINUS
                    {
                    MINUS22=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS22_tree = (CommonTree)adaptor.create(MINUS22);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS22_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression478);
            term23=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term23.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:40: ( ( PLUS | MINUS | OR ) term )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=MINUS && LA6_0<=PLUS)||LA6_0==OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:41: ( PLUS | MINUS | OR ) term
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

            	    pushFollow(FOLLOW_term_in_simpleExpression491);
            	    term25=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term25.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:1: infixOperand : ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set26=null;

        CommonTree set26_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:75:13: ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:11: ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:14: simpleExpression infixOperand simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression527);
                    simpleExpression27=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression27.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression529);
                    infixOperand28=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand28.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression531);
                    simpleExpression29=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression29.getTree());


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
                    // 77:5: -> ^( infixOperand simpleExpression simpleExpression )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:8: ^( infixOperand simpleExpression simpleExpression )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression553);
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
                    // 79:5: -> simpleExpression
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:17: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:19: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal31=(Token)match(input,48,FOLLOW_48_in_actualParameters567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal31);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:23: ( expression ( ',' expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=TRUE && LA9_0<=PLUS)||LA9_0==NOT||(LA9_0>=IDENT && LA9_0<=INTEGER)||LA9_0==48) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:24: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters570);
                    expression32=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression32.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:35: ( ',' expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==50) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:36: ',' expression
                    	    {
                    	    char_literal33=(Token)match(input,50,FOLLOW_50_in_actualParameters573); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_50.add(char_literal33);

                    	    pushFollow(FOLLOW_expression_in_actualParameters575);
                    	    expression34=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal35=(Token)match(input,49,FOLLOW_49_in_actualParameters581); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal35);



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
            // 81:5: -> ( expression ( expression )* )?
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:81:8: ( expression ( expression )* )?
                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:81:20: ( expression )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) );
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IF) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred27_Oberon0()) ) {
                    alt12=1;
                }
                else if ( (synpred29_Oberon0()) ) {
                    alt12=2;
                }
                else if ( (synpred30_Oberon0()) ) {
                    alt12=3;
                }
                else if ( (true) ) {
                    alt12=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF36=(Token)match(input,IF,FOLLOW_IF_in_ifStatement604); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF36);

                    pushFollow(FOLLOW_expression_in_ifStatement606);
                    expression37=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression37.getTree());
                    THEN38=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN38);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement610);
                    statementSequence39=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence39.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:52: ( ELSIF expression THEN statementSequence )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==ELSIF) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:53: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF40=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement613); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF40);

                    	    pushFollow(FOLLOW_expression_in_ifStatement615);
                    	    expression41=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());
                    	    THEN42=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement617); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN42);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement619);
                    	    statementSequence43=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence43.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:95: ( ELSE statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:96: ELSE statementSequence
                    {
                    ELSE44=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement624); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE44);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement626);
                    statementSequence45=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence45.getTree());

                    }

                    END46=(Token)match(input,END,FOLLOW_END_in_ifStatement629); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END46);



                    // AST REWRITE
                    // elements: statementSequence, statementSequence, ELSIF, expression, expression, ELSE, statementSequence, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:24: ^( BODY statementSequence )
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
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:69: ^( BODY statementSequence )
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:97: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:104: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF47=(Token)match(input,IF,FOLLOW_IF_in_ifStatement677); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF47);

                    pushFollow(FOLLOW_expression_in_ifStatement679);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());
                    THEN49=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement681); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN49);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement683);
                    statementSequence50=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence50.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:41: ( ELSIF expression THEN statementSequence )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:42: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF51=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement686); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF51);

                    	    pushFollow(FOLLOW_expression_in_ifStatement688);
                    	    expression52=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression52.getTree());
                    	    THEN53=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement690); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN53);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement692);
                    	    statementSequence54=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence54.getTree());

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

                    END55=(Token)match(input,END,FOLLOW_END_in_ifStatement696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END55);



                    // AST REWRITE
                    // elements: expression, IF, expression, ELSIF, statementSequence, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 85:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:24: ^( BODY statementSequence )
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
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:69: ^( BODY statementSequence )
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

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF56=(Token)match(input,IF,FOLLOW_IF_in_ifStatement734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF56);

                    pushFollow(FOLLOW_expression_in_ifStatement736);
                    expression57=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
                    THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement738); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN58);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement740);
                    statementSequence59=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence59.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:41: ( ELSE statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:42: ELSE statementSequence
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE60);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement745);
                    statementSequence61=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence61.getTree());

                    }

                    END62=(Token)match(input,END,FOLLOW_END_in_ifStatement748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END62);



                    // AST REWRITE
                    // elements: statementSequence, expression, IF, statementSequence, ELSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 87:5: -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:8: ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:24: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:50: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:57: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:4: IF expression THEN statementSequence END
                    {
                    IF63=(Token)match(input,IF,FOLLOW_IF_in_ifStatement783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF63);

                    pushFollow(FOLLOW_expression_in_ifStatement785);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());
                    THEN65=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN65);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement789);
                    statementSequence66=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence66.getTree());
                    END67=(Token)match(input,END,FOLLOW_END_in_ifStatement791); if (state.failed) return retval; 
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
                    // 89:5: -> ^( IF expression ^( BODY statementSequence ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:8: ^( IF expression ^( BODY statementSequence ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:24: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:15: ( WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:18: WHILE expression DO statementSequence END
            {
            WHILE68=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement816); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE68);

            pushFollow(FOLLOW_expression_in_whileStatement818);
            expression69=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression69.getTree());
            DO70=(Token)match(input,DO,FOLLOW_DO_in_whileStatement820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO70);

            pushFollow(FOLLOW_statementSequence_in_whileStatement822);
            statementSequence71=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence71.getTree());
            END72=(Token)match(input,END,FOLLOW_END_in_whileStatement824); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END72);



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
            // 91:5: -> ^( WHILE expression ^( BODY statementSequence ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:8: ^( WHILE expression ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:27: ^( BODY statementSequence )
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

    public static class withStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:1: withStatement : WITH selector DO statementSequence END -> ^( WITH selector ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.withStatement_return withStatement() throws RecognitionException {
        Oberon0Parser.withStatement_return retval = new Oberon0Parser.withStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WITH73=null;
        Token DO75=null;
        Token END77=null;
        Oberon0Parser.selector_return selector74 = null;

        Oberon0Parser.statementSequence_return statementSequence76 = null;


        CommonTree WITH73_tree=null;
        CommonTree DO75_tree=null;
        CommonTree END77_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:14: ( WITH selector DO statementSequence END -> ^( WITH selector ^( BODY statementSequence ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:17: WITH selector DO statementSequence END
            {
            WITH73=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement849); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WITH.add(WITH73);

            pushFollow(FOLLOW_selector_in_withStatement851);
            selector74=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector74.getTree());
            DO75=(Token)match(input,DO,FOLLOW_DO_in_withStatement853); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO75);

            pushFollow(FOLLOW_statementSequence_in_withStatement855);
            statementSequence76=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence76.getTree());
            END77=(Token)match(input,END,FOLLOW_END_in_withStatement857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END77);



            // AST REWRITE
            // elements: statementSequence, WITH, selector
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 93:5: -> ^( WITH selector ^( BODY statementSequence ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:8: ^( WITH selector ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WITH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:24: ^( BODY statementSequence )
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
    // $ANTLR end "withStatement"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGNMENT79=null;
        Oberon0Parser.selector_return selector78 = null;

        Oberon0Parser.expression_return expression80 = null;


        CommonTree ASSIGNMENT79_tree=null;
        RewriteRuleTokenStream stream_ASSIGNMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGNMENT");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment882);
            selector78=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector78.getTree());
            ASSIGNMENT79=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT79);

            pushFollow(FOLLOW_expression_in_assignment886);
            expression80=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression80.getTree());


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
            // 95:5: -> ^( ASSIGNMENT selector expression )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:8: ^( ASSIGNMENT selector expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ASSIGNMENT.nextNode(), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:1: procedureCall : selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector81 = null;

        Oberon0Parser.actualParameters_return actualParameters82 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:14: ( selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall907);
            selector81=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector81.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:26: ( actualParameters )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall910);
                    actualParameters82=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters82.getTree());

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
            // 97:5: -> ^( PROCEDURECALL selector ( actualParameters )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:8: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:33: ( actualParameters )?
                if ( stream_actualParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_actualParameters.nextTree());

                }
                stream_actualParameters.reset();

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:1: statement : ( assignment | procedureCall | ifStatement | whileStatement | withStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment83 = null;

        Oberon0Parser.procedureCall_return procedureCall84 = null;

        Oberon0Parser.ifStatement_return ifStatement85 = null;

        Oberon0Parser.whileStatement_return whileStatement86 = null;

        Oberon0Parser.withStatement_return withStatement87 = null;



        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:10: ( ( assignment | procedureCall | ifStatement | whileStatement | withStatement )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:13: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:13: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement935);
                    assignment83=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment83.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement939);
                    procedureCall84=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall84.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement942);
                    ifStatement85=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement85.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement946);
                    whileStatement86=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement86.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:73: withStatement
                    {
                    pushFollow(FOLLOW_withStatement_in_statement950);
                    withStatement87=withStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement87.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal89=null;
        Oberon0Parser.statement_return statement88 = null;

        Oberon0Parser.statement_return statement90 = null;


        CommonTree char_literal89_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:18: ( statement ( ';' statement )* -> statement ( statement )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:20: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence958);
            statement88=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement88.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:30: ( ';' statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==51) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:31: ';' statement
            	    {
            	    char_literal89=(Token)match(input,51,FOLLOW_51_in_statementSequence961); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal89);

            	    pushFollow(FOLLOW_statement_in_statementSequence963);
            	    statement90=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement90.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:1: identList : IDENT ( ',' IDENT )* -> IDENT ( IDENT )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT91=null;
        Token char_literal92=null;
        Token IDENT93=null;

        CommonTree IDENT91_tree=null;
        CommonTree char_literal92_tree=null;
        CommonTree IDENT93_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:10: ( IDENT ( ',' IDENT )* -> IDENT ( IDENT )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:13: IDENT ( ',' IDENT )*
            {
            IDENT91=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT91);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:19: ( ',' IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==50) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:21: ',' IDENT
            	    {
            	    char_literal92=(Token)match(input,50,FOLLOW_50_in_identList989); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal92);

            	    IDENT93=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList991); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT93);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: IDENT, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 102:5: -> IDENT ( IDENT )*
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:102:14: ( IDENT )*
                while ( stream_IDENT.hasNext() ) {
                    adaptor.addChild(root_0, stream_IDENT.nextNode());

                }
                stream_IDENT.reset();

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:1: arrayType : ARRAY expression OF type -> ^( ARRAY type expression ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY94=null;
        Token OF96=null;
        Oberon0Parser.expression_return expression95 = null;

        Oberon0Parser.type_return type97 = null;


        CommonTree ARRAY94_tree=null;
        CommonTree OF96_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:10: ( ARRAY expression OF type -> ^( ARRAY type expression ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:13: ARRAY expression OF type
            {
            ARRAY94=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType1013); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY94);

            pushFollow(FOLLOW_expression_in_arrayType1015);
            expression95=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression95.getTree());
            OF96=(Token)match(input,OF,FOLLOW_OF_in_arrayType1017); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF96);

            pushFollow(FOLLOW_type_in_arrayType1019);
            type97=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type97.getTree());


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
            // 104:5: -> ^( ARRAY type expression )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:104:8: ^( ARRAY type expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_1);

                adaptor.addChild(root_1, stream_type.nextTree());
                adaptor.addChild(root_1, stream_expression.nextTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:1: fieldList : ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal99=null;
        Oberon0Parser.identList_return identList98 = null;

        Oberon0Parser.type_return type100 = null;


        CommonTree char_literal99_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:10: ( ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:13: ( identList ':' type )?
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:13: ( identList ':' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:14: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1041);
                    identList98=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList98.getTree());
                    char_literal99=(Token)match(input,52,FOLLOW_52_in_fieldList1043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal99);

                    pushFollow(FOLLOW_type_in_fieldList1045);
                    type100=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type100.getTree());

                    }
                    break;

            }



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
            // 106:5: -> ^( VAR ( type )? ( identList )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:8: ^( VAR ( type )? ( identList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:14: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:20: ( identList )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:1: recordType : RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD101=null;
        Token char_literal103=null;
        Token END105=null;
        Oberon0Parser.fieldList_return fieldList102 = null;

        Oberon0Parser.fieldList_return fieldList104 = null;


        CommonTree RECORD101_tree=null;
        CommonTree char_literal103_tree=null;
        CommonTree END105_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:11: ( RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:14: RECORD fieldList ( ';' fieldList )* END
            {
            RECORD101=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1071); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD101);

            pushFollow(FOLLOW_fieldList_in_recordType1073);
            fieldList102=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList102.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:31: ( ';' fieldList )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==51) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:32: ';' fieldList
            	    {
            	    char_literal103=(Token)match(input,51,FOLLOW_51_in_recordType1076); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal103);

            	    pushFollow(FOLLOW_fieldList_in_recordType1078);
            	    fieldList104=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList104.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            END105=(Token)match(input,END,FOLLOW_END_in_recordType1082); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END105);



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
            // 108:5: -> ^( RECORD ( fieldList )* )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:108:8: ^( RECORD ( fieldList )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:108:17: ( fieldList )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:1: type : ( IDENT | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT106=null;
        Oberon0Parser.arrayType_return arrayType107 = null;

        Oberon0Parser.recordType_return recordType108 = null;


        CommonTree IDENT106_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:5: ( IDENT | arrayType | recordType )
            int alt19=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt19=1;
                }
                break;
            case ARRAY:
                {
                alt19=2;
                }
                break;
            case RECORD:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:9: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1103); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT106_tree = (CommonTree)adaptor.create(IDENT106);
                    adaptor.addChild(root_0, IDENT106_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:17: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1107);
                    arrayType107=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType107.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:29: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1111);
                    recordType108=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType108.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:1: fPSection : ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) );
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
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:10: ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==VAR) ) {
                alt20=1;
            }
            else if ( (LA20_0==IDENT) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:13: VAR identList ':' type
                    {
                    VAR109=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR109);

                    pushFollow(FOLLOW_identList_in_fPSection1120);
                    identList110=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList110.getTree());
                    char_literal111=(Token)match(input,52,FOLLOW_52_in_fPSection1122); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal111);

                    pushFollow(FOLLOW_type_in_fPSection1124);
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
                    // 111:5: -> ^( REFVAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:8: ^( REFVAR type identList )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:4: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1145);
                    identList113=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList113.getTree());
                    char_literal114=(Token)match(input,52,FOLLOW_52_in_fPSection1147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal114);

                    pushFollow(FOLLOW_type_in_fPSection1149);
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
                    // 113:5: -> ^( VAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:113:8: ^( VAR type identList )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:17: ( '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:19: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            char_literal116=(Token)match(input,48,FOLLOW_48_in_formalParameters1169); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal116);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:23: ( fPSection ( ';' fPSection )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VAR||LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:24: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1172);
                    fPSection117=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection117.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:34: ( ';' fPSection )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==51) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:35: ';' fPSection
                    	    {
                    	    char_literal118=(Token)match(input,51,FOLLOW_51_in_formalParameters1175); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_51.add(char_literal118);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1177);
                    	    fPSection119=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection119.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal120=(Token)match(input,49,FOLLOW_49_in_formalParameters1183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal120);



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
            // 115:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:32: ( fPSection )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:1: procedureBody : BEGIN statementSequence -> ^( BODY statementSequence ) ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:14: ( BEGIN statementSequence -> ^( BODY statementSequence ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:17: BEGIN statementSequence
            {
            BEGIN121=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1210); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN121);

            pushFollow(FOLLOW_statementSequence_in_procedureBody1212);
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
            // 117:5: -> ^( BODY statementSequence )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:8: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:1: procedureDeclaration : PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE123=null;
        Token IDENT124=null;
        Token char_literal126=null;
        Token END129=null;
        Token IDENT130=null;
        Oberon0Parser.formalParameters_return formalParameters125 = null;

        Oberon0Parser.declarations_return declarations127 = null;

        Oberon0Parser.procedureBody_return procedureBody128 = null;


        CommonTree PROCEDURE123_tree=null;
        CommonTree IDENT124_tree=null;
        CommonTree char_literal126_tree=null;
        CommonTree END129_tree=null;
        CommonTree IDENT130_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:21: ( PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:23: PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT
            {
            PROCEDURE123=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1230); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE123);

            IDENT124=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1232); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT124);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:39: ( formalParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:41: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1236);
                    formalParameters125=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters125.getTree());

                    }
                    break;

            }

            char_literal126=(Token)match(input,51,FOLLOW_51_in_procedureDeclaration1240); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal126);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration1242);
            declarations127=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations127.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:77: ( procedureBody )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BEGIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:78: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1245);
                    procedureBody128=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody128.getTree());

                    }
                    break;

            }

            END129=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1249); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END129);

            IDENT130=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT130);



            // AST REWRITE
            // elements: formalParameters, procedureBody, declarations, PROCEDURE, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 119:5: -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:8: ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:46: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:60: ( procedureBody )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:1: constDeclaration : ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST131=null;
        Token IDENT132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        Oberon0Parser.expression_return expression134 = null;


        CommonTree CONST131_tree=null;
        CommonTree IDENT132_tree=null;
        CommonTree char_literal133_tree=null;
        CommonTree char_literal135_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:17: ( ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:19: ( CONST ( IDENT '=' expression ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:19: ( CONST ( IDENT '=' expression ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:20: CONST ( IDENT '=' expression ';' )*
            {
            CONST131=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST131);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:26: ( IDENT '=' expression ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:27: IDENT '=' expression ';'
            	    {
            	    IDENT132=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclaration1287); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT132);

            	    char_literal133=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1289); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal133);

            	    pushFollow(FOLLOW_expression_in_constDeclaration1291);
            	    expression134=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression134.getTree());
            	    char_literal135=(Token)match(input,51,FOLLOW_51_in_constDeclaration1293); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal135);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: IDENT, CONST, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 121:5: -> ( ^( CONST IDENT expression ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:8: ( ^( CONST IDENT expression ) )*
                while ( stream_IDENT.hasNext()||stream_CONST.hasNext()||stream_expression.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:8: ^( CONST IDENT expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_IDENT.reset();
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:1: typeDeclaration : ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE136=null;
        Token IDENT137=null;
        Token char_literal138=null;
        Token char_literal140=null;
        Oberon0Parser.type_return type139 = null;


        CommonTree TYPE136_tree=null;
        CommonTree IDENT137_tree=null;
        CommonTree char_literal138_tree=null;
        CommonTree char_literal140_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:16: ( ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:18: ( TYPE ( IDENT '=' type ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:18: ( TYPE ( IDENT '=' type ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:19: TYPE ( IDENT '=' type ';' )*
            {
            TYPE136=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1318); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE136);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:24: ( IDENT '=' type ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:25: IDENT '=' type ';'
            	    {
            	    IDENT137=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration1321); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT137);

            	    char_literal138=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1323); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal138);

            	    pushFollow(FOLLOW_type_in_typeDeclaration1325);
            	    type139=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type139.getTree());
            	    char_literal140=(Token)match(input,51,FOLLOW_51_in_typeDeclaration1327); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal140);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: type, TYPE, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 123:5: -> ( ^( TYPE IDENT type ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:8: ( ^( TYPE IDENT type ) )*
                while ( stream_type.hasNext()||stream_TYPE.hasNext()||stream_IDENT.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:8: ^( TYPE IDENT type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_TYPE.reset();
                stream_IDENT.reset();

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:1: varDeclarations : ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* ;
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
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:16: ( ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:18: ( VAR ( identList ':' type ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:18: ( VAR ( identList ':' type ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:19: VAR ( identList ':' type ';' )*
            {
            VAR141=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1352); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR141);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:23: ( identList ':' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:24: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1355);
            	    identList142=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList142.getTree());
            	    char_literal143=(Token)match(input,52,FOLLOW_52_in_varDeclarations1357); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_52.add(char_literal143);

            	    pushFollow(FOLLOW_type_in_varDeclarations1359);
            	    type144=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type144.getTree());
            	    char_literal145=(Token)match(input,51,FOLLOW_51_in_varDeclarations1361); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal145);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: identList, type, VAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 125:5: -> ( ^( VAR type identList ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:8: ( ^( VAR type identList ) )*
                while ( stream_identList.hasNext()||stream_type.hasNext()||stream_VAR.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:8: ^( VAR type identList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_identList.reset();
                stream_type.reset();
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
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
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )*
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:16: ( constDeclaration )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CONST) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1386);
                    constDeclaration146=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration146.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:34: ( typeDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==TYPE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1389);
                    typeDeclaration147=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration147.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:51: ( varDeclarations )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VAR) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1392);
                    varDeclarations148=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations148.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:68: ( procedureDeclaration ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==PROCEDURE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:69: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1396);
            	    procedureDeclaration149=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration149.getTree());
            	    char_literal150=(Token)match(input,51,FOLLOW_51_in_declarations1398); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal150);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



            // AST REWRITE
            // elements: procedureDeclaration, constDeclaration, varDeclarations, typeDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:60: ( procedureDeclaration )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:11: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:14: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody1427);
            declarations151=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations151.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:27: ( BEGIN statementSequence )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BEGIN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:128:28: BEGIN statementSequence
                    {
                    BEGIN152=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN152);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody1432);
                    statementSequence153=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence153.getTree());

                    }
                    break;

            }

            END154=(Token)match(input,END,FOLLOW_END_in_moduleBody1436); if (state.failed) return retval; 
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
            // 129:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:129:22: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:1: module : MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE155=null;
        Token IDENT156=null;
        Token char_literal157=null;
        Token IDENT159=null;
        Token char_literal160=null;
        Token EOF161=null;
        Oberon0Parser.moduleBody_return moduleBody158 = null;


        CommonTree MODULE155_tree=null;
        CommonTree IDENT156_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree IDENT159_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree EOF161_tree=null;
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:7: ( MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:130:11: MODULE IDENT ';' moduleBody IDENT '.' EOF
            {
            MODULE155=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1460); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE155);

            IDENT156=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1462); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT156);

            char_literal157=(Token)match(input,51,FOLLOW_51_in_module1464); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal157);

            pushFollow(FOLLOW_moduleBody_in_module1466);
            moduleBody158=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody158.getTree());
            IDENT159=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT159);

            char_literal160=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal160);

            EOF161=(Token)match(input,EOF,FOLLOW_EOF_in_module1472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF161);



            // AST REWRITE
            // elements: moduleBody, IDENT, MODULE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 131:5: -> ^( MODULE IDENT moduleBody )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:131:8: ^( MODULE IDENT moduleBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
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

    // $ANTLR start synpred23_Oberon0
    public final void synpred23_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:14: ( simpleExpression infixOperand simpleExpression )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:14: simpleExpression infixOperand simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred23_Oberon0527);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred23_Oberon0529);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred23_Oberon0531);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Oberon0

    // $ANTLR start synpred27_Oberon0
    public final void synpred27_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred27_Oberon0604); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred27_Oberon0606);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0608); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0610);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:52: ( ELSIF expression THEN statementSequence )+
        int cnt35=0;
        loop35:
        do {
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==ELSIF) ) {
                alt35=1;
            }


            switch (alt35) {
        	case 1 :
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:53: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred27_Oberon0613); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred27_Oberon0615);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0617); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0619);
        	    statementSequence();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt35 >= 1 ) break loop35;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(35, input);
                    throw eee;
            }
            cnt35++;
        } while (true);

        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:95: ( ELSE statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:96: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred27_Oberon0624); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0626);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred27_Oberon0629); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Oberon0

    // $ANTLR start synpred29_Oberon0
    public final void synpred29_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred29_Oberon0677); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred29_Oberon0679);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0681); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0683);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:41: ( ELSIF expression THEN statementSequence )+
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
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:42: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred29_Oberon0686); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred29_Oberon0688);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0690); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0692);
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

        match(input,END,FOLLOW_END_in_synpred29_Oberon0696); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Oberon0

    // $ANTLR start synpred30_Oberon0
    public final void synpred30_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred30_Oberon0734); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred30_Oberon0736);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred30_Oberon0738); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred30_Oberon0740);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:41: ( ELSE statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:42: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred30_Oberon0743); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred30_Oberon0745);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred30_Oberon0748); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Oberon0

    // $ANTLR start synpred32_Oberon0
    public final void synpred32_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: ( assignment )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred32_Oberon0935);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Oberon0

    // $ANTLR start synpred33_Oberon0
    public final void synpred33_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:27: ( procedureCall )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred33_Oberon0939);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Oberon0

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
    public final boolean synpred23_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Oberon0_fragment(); // can never throw exception
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
    public final boolean synpred27_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA7_eotS =
        "\12\uffff";
    static final String DFA7_eofS =
        "\12\uffff";
    static final String DFA7_minS =
        "\1\4\7\0\2\uffff";
    static final String DFA7_maxS =
        "\1\60\7\0\2\uffff";
    static final String DFA7_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\4\1\2\1\1\35\uffff\1\7\7\uffff\1\3\1\5\1\uffff\1\6",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "76:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred23_Oberon0()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\1\5\13\uffff";
    static final String DFA14_minS =
        "\1\15\1\0\12\uffff";
    static final String DFA14_maxS =
        "\1\63\1\0\12\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\4\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\1\uffff\1\0\12\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\3\5\2\uffff\1\3\1\4\27\uffff\1\1\5\uffff\1\5",
            "\1\uffff",
            "",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "98:13: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_Oberon0()) ) {s = 10;}

                        else if ( (synpred33_Oberon0()) ) {s = 11;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_IDENT_in_selector366 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector370 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector373 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector377 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_selector380 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_selector382 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_IDENT_in_selector390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numberLiteral397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_factor418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_factor422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_factor426 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_factor429 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_factor431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor436 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_factor_in_factor439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term447 = new BitSet(new long[]{0x0000000018000302L});
    public static final BitSet FOLLOW_set_in_term450 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_factor_in_term461 = new BitSet(new long[]{0x0000000018000302L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression470 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression473 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression478 = new BitSet(new long[]{0x00000000200000C2L});
    public static final BitSet FOLLOW_set_in_simpleExpression481 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression491 = new BitSet(new long[]{0x00000000200000C2L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression527 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression529 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_actualParameters567 = new BitSet(new long[]{0x00036020000000F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters570 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50_in_actualParameters573 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters575 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_actualParameters581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement604 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement606 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement608 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement610 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement613 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement615 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement617 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement619 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement624 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement626 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement677 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement681 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement683 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement686 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement690 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement692 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_END_in_ifStatement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement734 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement738 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement743 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement745 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement783 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement785 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement787 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement789 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement816 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_whileStatement818 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DO_in_whileStatement820 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement822 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_whileStatement824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement849 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_selector_in_withStatement851 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DO_in_withStatement853 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_withStatement855 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_withStatement857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment882 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment884 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_assignment886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall907 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence958 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_statementSequence961 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statement_in_statementSequence963 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList985 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_identList989 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList991 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType1013 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_arrayType1015 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_OF_in_arrayType1017 = new BitSet(new long[]{0x0000200005000000L});
    public static final BitSet FOLLOW_type_in_arrayType1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1041 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fieldList1043 = new BitSet(new long[]{0x0000200005000000L});
    public static final BitSet FOLLOW_type_in_fieldList1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1071 = new BitSet(new long[]{0x0008200000020000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1073 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_51_in_recordType1076 = new BitSet(new long[]{0x0008200000020000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1078 = new BitSet(new long[]{0x0008000000020000L});
    public static final BitSet FOLLOW_END_in_recordType1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1118 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1120 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fPSection1122 = new BitSet(new long[]{0x0000200005000000L});
    public static final BitSet FOLLOW_type_in_fPSection1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1145 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_fPSection1147 = new BitSet(new long[]{0x0000200005000000L});
    public static final BitSet FOLLOW_type_in_fPSection1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_formalParameters1169 = new BitSet(new long[]{0x0002200000000800L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1172 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_51_in_formalParameters1175 = new BitSet(new long[]{0x0000200000000800L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1177 = new BitSet(new long[]{0x000A000000000000L});
    public static final BitSet FOLLOW_49_in_formalParameters1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1210 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1230 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1232 = new BitSet(new long[]{0x0009000000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1236 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_procedureDeclaration1240 = new BitSet(new long[]{0x0000000000C21C00L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1242 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1245 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1249 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1284 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclaration1287 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1289 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1291 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_constDeclaration1293 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1318 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration1321 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1323 = new BitSet(new long[]{0x0000200005000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1325 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_typeDeclaration1327 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1352 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1355 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_varDeclarations1357 = new BitSet(new long[]{0x0000200005000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1359 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_varDeclarations1361 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1386 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1389 = new BitSet(new long[]{0x0000000000800802L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1392 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1396 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_declarations1398 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1427 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1430 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_moduleBody1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1460 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1462 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_module1464 = new BitSet(new long[]{0x0000000000C21C00L});
    public static final BitSet FOLLOW_moduleBody_in_module1466 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1468 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1470 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred23_Oberon0527 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred23_Oberon0529 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred23_Oberon0531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred27_Oberon0604 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0606 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0608 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0610 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred27_Oberon0613 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0615 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0617 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0619 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ELSE_in_synpred27_Oberon0624 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0626 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_synpred27_Oberon0629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred29_Oberon0677 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0679 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0681 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0683 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred29_Oberon0686 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0690 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0692 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_END_in_synpred29_Oberon0696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred30_Oberon0734 = new BitSet(new long[]{0x00016020000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred30_Oberon0736 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred30_Oberon0738 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred30_Oberon0740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_synpred30_Oberon0743 = new BitSet(new long[]{0x0008200000302000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred30_Oberon0745 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_synpred30_Oberon0748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred32_Oberon0935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred33_Oberon0939 = new BitSet(new long[]{0x0000000000000002L});

}