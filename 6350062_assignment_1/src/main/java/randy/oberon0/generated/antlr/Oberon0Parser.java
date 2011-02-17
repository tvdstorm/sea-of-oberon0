// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g 2011-02-06 14:13:00

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "NOTEQUALS", "SMALLERTHAN", "GREATERTHAN", "SMALLEREQUALS", "GREATEREQUALS", "NOT", "REFVAR", "PROCEDURECALL", "PARAMETERS", "BODY", "DOTSELECTOR", "ARRAYSELECTOR", "IDENT", "WHITESPACE", "INTEGER", "']'", "'('", "')'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
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
    public static final int SMALLERTHAN=30;
    public static final int GREATERTHAN=31;
    public static final int SMALLEREQUALS=32;
    public static final int GREATEREQUALS=33;
    public static final int NOT=34;
    public static final int REFVAR=35;
    public static final int PROCEDURECALL=36;
    public static final int PARAMETERS=37;
    public static final int BODY=38;
    public static final int DOTSELECTOR=39;
    public static final int ARRAYSELECTOR=40;
    public static final int IDENT=41;
    public static final int WHITESPACE=42;
    public static final int INTEGER=43;

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


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:1: selector : ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT );
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:9: ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=DOTSELECTOR && LA2_1<=ARRAYSELECTOR)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=MINUS && LA2_1<=DIVIDE)||(LA2_1>=THEN && LA2_1<=END)||LA2_1==DO||LA2_1==OF||(LA2_1>=MOD && LA2_1<=GREATEREQUALS)||(LA2_1>=44 && LA2_1<=48)) ) {
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:12: IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector348); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT1_tree = (CommonTree)adaptor.create(IDENT1);
                    adaptor.addChild(root_0, IDENT1_tree);
                    }
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:18: ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:19: ( DOTSELECTOR IDENT )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:19: ( DOTSELECTOR IDENT )
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:20: DOTSELECTOR IDENT
                    	    {
                    	    DOTSELECTOR2=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector352); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR2_tree = (CommonTree)adaptor.create(DOTSELECTOR2);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR2_tree, root_0);
                    	    }
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector355); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    IDENT3_tree = (CommonTree)adaptor.create(IDENT3);
                    	    adaptor.addChild(root_0, IDENT3_tree);
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:40: ( ARRAYSELECTOR expression ']' )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:40: ( ARRAYSELECTOR expression ']' )
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:41: ARRAYSELECTOR expression ']'
                    	    {
                    	    ARRAYSELECTOR4=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector359); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR4_tree = (CommonTree)adaptor.create(ARRAYSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_selector362);
                    	    expression5=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression5.getTree());
                    	    char_literal6=(Token)match(input,44,FOLLOW_44_in_selector364); if (state.failed) return retval;

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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:66:77: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector372); if (state.failed) return retval;
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

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:67:1: factor : ( selector | INTEGER | '(' expression ')' | NOT factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER9=null;
        Token char_literal10=null;
        Token char_literal12=null;
        Token NOT13=null;
        Oberon0Parser.selector_return selector8 = null;

        Oberon0Parser.expression_return expression11 = null;

        Oberon0Parser.factor_return factor14 = null;


        CommonTree INTEGER9_tree=null;
        CommonTree char_literal10_tree=null;
        CommonTree char_literal12_tree=null;
        CommonTree NOT13_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:67:7: ( selector | INTEGER | '(' expression ')' | NOT factor )
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
            case 45:
                {
                alt3=3;
                }
                break;
            case NOT:
                {
                alt3=4;
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:67:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor380);
                    selector8=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector8.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:67:22: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER9=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor384); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER9_tree = (CommonTree)adaptor.create(INTEGER9);
                    adaptor.addChild(root_0, INTEGER9_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:67:32: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal10=(Token)match(input,45,FOLLOW_45_in_factor388); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor391);
                    expression11=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression11.getTree());
                    char_literal12=(Token)match(input,46,FOLLOW_46_in_factor393); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:67:55: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT13=(Token)match(input,NOT,FOLLOW_NOT_in_factor398); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT13_tree = (CommonTree)adaptor.create(NOT13);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT13_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor401);
                    factor14=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor14.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:68:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set16=null;
        Oberon0Parser.factor_return factor15 = null;

        Oberon0Parser.factor_return factor17 = null;


        CommonTree set16_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:68:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:68:9: factor ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term409);
            factor15=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor15.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:68:16: ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TIMES && LA4_0<=DIVIDE)||(LA4_0>=MOD && LA4_0<=AND)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:68:17: ( TIMES | DIVIDE | MOD | AND ) factor
            	    {
            	    set16=(Token)input.LT(1);
            	    set16=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIVIDE)||(input.LA(1)>=MOD && input.LA(1)<=AND) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set16), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term423);
            	    factor17=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor17.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS18=null;
        Token MINUS19=null;
        Token set21=null;
        Oberon0Parser.term_return term20 = null;

        Oberon0Parser.term_return term22 = null;


        CommonTree PLUS18_tree=null;
        CommonTree MINUS19_tree=null;
        CommonTree set21_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:17: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:19: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:19: ( PLUS | MINUS )?
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:20: PLUS
                    {
                    PLUS18=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression432); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:26: MINUS
                    {
                    MINUS19=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS19_tree = (CommonTree)adaptor.create(MINUS19);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS19_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression440);
            term20=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term20.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:40: ( ( PLUS | MINUS | OR ) term )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=MINUS && LA6_0<=PLUS)||LA6_0==OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:41: ( PLUS | MINUS | OR ) term
            	    {
            	    set21=(Token)input.LT(1);
            	    set21=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS)||input.LA(1)==OR ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set21), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression453);
            	    term22=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term22.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:1: infixOperand : ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set23=null;

        CommonTree set23_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:13: ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set23=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUALS) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set23));
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression24 = null;

        Oberon0Parser.infixOperand_return infixOperand25 = null;

        Oberon0Parser.simpleExpression_return simpleExpression26 = null;

        Oberon0Parser.simpleExpression_return simpleExpression27 = null;


        RewriteRuleSubtreeStream stream_infixOperand=new RewriteRuleSubtreeStream(adaptor,"rule infixOperand");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:11: ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt7=2;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                int LA7_1 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
                {
                int LA7_2 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case IDENT:
                {
                int LA7_3 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                int LA7_4 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA7_5 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 5, input);

                    throw nvae;
                }
                }
                break;
            case NOT:
                {
                int LA7_6 = input.LA(2);

                if ( (synpred21_Oberon0()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:14: simpleExpression infixOperand simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression489);
                    simpleExpression24=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression24.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression491);
                    infixOperand25=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand25.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression493);
                    simpleExpression26=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression26.getTree());


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
                    // 72:5: -> ^( infixOperand simpleExpression simpleExpression )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:72:8: ^( infixOperand simpleExpression simpleExpression )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression515);
                    simpleExpression27=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression27.getTree());


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
                    // 74:5: -> simpleExpression
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal28=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Oberon0Parser.expression_return expression29 = null;

        Oberon0Parser.expression_return expression31 = null;


        CommonTree char_literal28_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal32_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:17: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:19: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal28=(Token)match(input,45,FOLLOW_45_in_actualParameters529); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(char_literal28);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:23: ( expression ( ',' expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=MINUS && LA9_0<=PLUS)||LA9_0==NOT||LA9_0==IDENT||LA9_0==INTEGER||LA9_0==45) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:24: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters532);
                    expression29=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression29.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:35: ( ',' expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==47) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:75:36: ',' expression
                    	    {
                    	    char_literal30=(Token)match(input,47,FOLLOW_47_in_actualParameters535); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_47.add(char_literal30);

                    	    pushFollow(FOLLOW_expression_in_actualParameters537);
                    	    expression31=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression31.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal32=(Token)match(input,46,FOLLOW_46_in_actualParameters543); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal32);



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
            // 76:5: -> ( expression ( expression )* )?
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:8: ( expression ( expression )* )?
                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:76:20: ( expression )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF33=null;
        Token THEN35=null;
        Token ELSIF37=null;
        Token THEN39=null;
        Token ELSE41=null;
        Token END43=null;
        Token IF44=null;
        Token THEN46=null;
        Token ELSIF48=null;
        Token THEN50=null;
        Token END52=null;
        Token IF53=null;
        Token THEN55=null;
        Token ELSE57=null;
        Token END59=null;
        Token IF60=null;
        Token THEN62=null;
        Token END64=null;
        Oberon0Parser.expression_return expression34 = null;

        Oberon0Parser.statementSequence_return statementSequence36 = null;

        Oberon0Parser.expression_return expression38 = null;

        Oberon0Parser.statementSequence_return statementSequence40 = null;

        Oberon0Parser.statementSequence_return statementSequence42 = null;

        Oberon0Parser.expression_return expression45 = null;

        Oberon0Parser.statementSequence_return statementSequence47 = null;

        Oberon0Parser.expression_return expression49 = null;

        Oberon0Parser.statementSequence_return statementSequence51 = null;

        Oberon0Parser.expression_return expression54 = null;

        Oberon0Parser.statementSequence_return statementSequence56 = null;

        Oberon0Parser.statementSequence_return statementSequence58 = null;

        Oberon0Parser.expression_return expression61 = null;

        Oberon0Parser.statementSequence_return statementSequence63 = null;


        CommonTree IF33_tree=null;
        CommonTree THEN35_tree=null;
        CommonTree ELSIF37_tree=null;
        CommonTree THEN39_tree=null;
        CommonTree ELSE41_tree=null;
        CommonTree END43_tree=null;
        CommonTree IF44_tree=null;
        CommonTree THEN46_tree=null;
        CommonTree ELSIF48_tree=null;
        CommonTree THEN50_tree=null;
        CommonTree END52_tree=null;
        CommonTree IF53_tree=null;
        CommonTree THEN55_tree=null;
        CommonTree ELSE57_tree=null;
        CommonTree END59_tree=null;
        CommonTree IF60_tree=null;
        CommonTree THEN62_tree=null;
        CommonTree END64_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IF) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred25_Oberon0()) ) {
                    alt12=1;
                }
                else if ( (synpred27_Oberon0()) ) {
                    alt12=2;
                }
                else if ( (synpred28_Oberon0()) ) {
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF33=(Token)match(input,IF,FOLLOW_IF_in_ifStatement566); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF33);

                    pushFollow(FOLLOW_expression_in_ifStatement568);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());
                    THEN35=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN35);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement572);
                    statementSequence36=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence36.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:52: ( ELSIF expression THEN statementSequence )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:53: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF37=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement575); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF37);

                    	    pushFollow(FOLLOW_expression_in_ifStatement577);
                    	    expression38=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression38.getTree());
                    	    THEN39=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement579); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN39);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement581);
                    	    statementSequence40=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence40.getTree());

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

                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:95: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:96: ELSE statementSequence
                    {
                    ELSE41=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE41);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement588);
                    statementSequence42=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence42.getTree());

                    }

                    END43=(Token)match(input,END,FOLLOW_END_in_ifStatement591); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END43);



                    // AST REWRITE
                    // elements: statementSequence, expression, ELSIF, statementSequence, expression, ELSE, statementSequence, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 78:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:24: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_ELSIF.hasNext()||stream_expression.hasNext()||stream_statementSequence.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ELSIF.hasNext()||stream_expression.hasNext()||stream_statementSequence.hasNext() ) {
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:69: ^( BODY statementSequence )
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
                        stream_expression.reset();
                        stream_statementSequence.reset();
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:97: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:78:104: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF44=(Token)match(input,IF,FOLLOW_IF_in_ifStatement639); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF44);

                    pushFollow(FOLLOW_expression_in_ifStatement641);
                    expression45=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression45.getTree());
                    THEN46=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement643); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN46);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement645);
                    statementSequence47=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence47.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:41: ( ELSIF expression THEN statementSequence )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:42: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF48=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement648); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF48);

                    	    pushFollow(FOLLOW_expression_in_ifStatement650);
                    	    expression49=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());
                    	    THEN50=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement652); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN50);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement654);
                    	    statementSequence51=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence51.getTree());

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

                    END52=(Token)match(input,END,FOLLOW_END_in_ifStatement658); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END52);



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
                    // 80:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:24: ^( BODY statementSequence )
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
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:80:69: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF53=(Token)match(input,IF,FOLLOW_IF_in_ifStatement696); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF53);

                    pushFollow(FOLLOW_expression_in_ifStatement698);
                    expression54=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression54.getTree());
                    THEN55=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement700); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN55);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement702);
                    statementSequence56=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence56.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:41: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:42: ELSE statementSequence
                    {
                    ELSE57=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement705); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE57);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement707);
                    statementSequence58=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence58.getTree());

                    }

                    END59=(Token)match(input,END,FOLLOW_END_in_ifStatement710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END59);



                    // AST REWRITE
                    // elements: statementSequence, IF, statementSequence, ELSE, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:5: -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:8: ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:24: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:50: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:82:57: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:83:4: IF expression THEN statementSequence END
                    {
                    IF60=(Token)match(input,IF,FOLLOW_IF_in_ifStatement745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF60);

                    pushFollow(FOLLOW_expression_in_ifStatement747);
                    expression61=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());
                    THEN62=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement749); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN62);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement751);
                    statementSequence63=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence63.getTree());
                    END64=(Token)match(input,END,FOLLOW_END_in_ifStatement753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END64);



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
                    // 84:5: -> ^( IF expression ^( BODY statementSequence ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:8: ^( IF expression ^( BODY statementSequence ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:84:24: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:85:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE65=null;
        Token DO67=null;
        Token END69=null;
        Oberon0Parser.expression_return expression66 = null;

        Oberon0Parser.statementSequence_return statementSequence68 = null;


        CommonTree WHILE65_tree=null;
        CommonTree DO67_tree=null;
        CommonTree END69_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:85:15: ( WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:85:18: WHILE expression DO statementSequence END
            {
            WHILE65=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement778); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE65);

            pushFollow(FOLLOW_expression_in_whileStatement780);
            expression66=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression66.getTree());
            DO67=(Token)match(input,DO,FOLLOW_DO_in_whileStatement782); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO67);

            pushFollow(FOLLOW_statementSequence_in_whileStatement784);
            statementSequence68=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence68.getTree());
            END69=(Token)match(input,END,FOLLOW_END_in_whileStatement786); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END69);



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
            // 86:5: -> ^( WHILE expression ^( BODY statementSequence ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:8: ^( WHILE expression ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:86:27: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ASSIGNMENT71=null;
        Oberon0Parser.selector_return selector70 = null;

        Oberon0Parser.expression_return expression72 = null;


        CommonTree ASSIGNMENT71_tree=null;
        RewriteRuleTokenStream stream_ASSIGNMENT=new RewriteRuleTokenStream(adaptor,"token ASSIGNMENT");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:87:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment811);
            selector70=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector70.getTree());
            ASSIGNMENT71=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment813); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT71);

            pushFollow(FOLLOW_expression_in_assignment815);
            expression72=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression72.getTree());


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
            // 88:5: -> ^( ASSIGNMENT selector expression )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:88:8: ^( ASSIGNMENT selector expression )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:1: procedureCall : selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector73 = null;

        Oberon0Parser.actualParameters_return actualParameters74 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:14: ( selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall836);
            selector73=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector73.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:26: ( actualParameters )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:89:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall839);
                    actualParameters74=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters74.getTree());

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
            // 90:5: -> ^( PROCEDURECALL selector ( actualParameters )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:8: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:90:33: ( actualParameters )?
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment75 = null;

        Oberon0Parser.procedureCall_return procedureCall76 = null;

        Oberon0Parser.ifStatement_return ifStatement77 = null;

        Oberon0Parser.whileStatement_return whileStatement78 = null;



        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:10: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement864);
                    assignment75=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment75.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement868);
                    procedureCall76=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall76.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement871);
                    ifStatement77=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement77.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement875);
                    whileStatement78=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement78.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal80=null;
        Oberon0Parser.statement_return statement79 = null;

        Oberon0Parser.statement_return statement81 = null;


        CommonTree char_literal80_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:18: ( statement ( ';' statement )* -> statement ( statement )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:20: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence883);
            statement79=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement79.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:30: ( ';' statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:92:31: ';' statement
            	    {
            	    char_literal80=(Token)match(input,48,FOLLOW_48_in_statementSequence886); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal80);

            	    pushFollow(FOLLOW_statement_in_statementSequence888);
            	    statement81=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement81.getTree());

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
            // 93:5: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:93:18: ( statement )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:1: identList : IDENT ( ',' IDENT )* -> IDENT ( IDENT )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT82=null;
        Token char_literal83=null;
        Token IDENT84=null;

        CommonTree IDENT82_tree=null;
        CommonTree char_literal83_tree=null;
        CommonTree IDENT84_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:10: ( IDENT ( ',' IDENT )* -> IDENT ( IDENT )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:13: IDENT ( ',' IDENT )*
            {
            IDENT82=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList910); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT82);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:19: ( ',' IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==47) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:94:21: ',' IDENT
            	    {
            	    char_literal83=(Token)match(input,47,FOLLOW_47_in_identList914); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_47.add(char_literal83);

            	    IDENT84=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList916); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT84);


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
            // 95:5: -> IDENT ( IDENT )*
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:95:14: ( IDENT )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:1: arrayType : ARRAY expression OF type -> ^( ARRAY type expression ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARRAY85=null;
        Token OF87=null;
        Oberon0Parser.expression_return expression86 = null;

        Oberon0Parser.type_return type88 = null;


        CommonTree ARRAY85_tree=null;
        CommonTree OF87_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:10: ( ARRAY expression OF type -> ^( ARRAY type expression ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:96:13: ARRAY expression OF type
            {
            ARRAY85=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType938); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY85);

            pushFollow(FOLLOW_expression_in_arrayType940);
            expression86=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression86.getTree());
            OF87=(Token)match(input,OF,FOLLOW_OF_in_arrayType942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF87);

            pushFollow(FOLLOW_type_in_arrayType944);
            type88=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type88.getTree());


            // AST REWRITE
            // elements: expression, type, ARRAY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 97:5: -> ^( ARRAY type expression )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:97:8: ^( ARRAY type expression )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:1: fieldList : ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal90=null;
        Oberon0Parser.identList_return identList89 = null;

        Oberon0Parser.type_return type91 = null;


        CommonTree char_literal90_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:10: ( ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:13: ( identList ':' type )?
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:13: ( identList ':' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:98:14: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList966);
                    identList89=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList89.getTree());
                    char_literal90=(Token)match(input,49,FOLLOW_49_in_fieldList968); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal90);

                    pushFollow(FOLLOW_type_in_fieldList970);
                    type91=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type91.getTree());

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
            // 99:5: -> ^( VAR ( type )? ( identList )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:8: ^( VAR ( type )? ( identList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:14: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:99:20: ( identList )?
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:1: recordType : RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RECORD92=null;
        Token char_literal94=null;
        Token END96=null;
        Oberon0Parser.fieldList_return fieldList93 = null;

        Oberon0Parser.fieldList_return fieldList95 = null;


        CommonTree RECORD92_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree END96_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:11: ( RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:14: RECORD fieldList ( ';' fieldList )* END
            {
            RECORD92=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType996); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD92);

            pushFollow(FOLLOW_fieldList_in_recordType998);
            fieldList93=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList93.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:31: ( ';' fieldList )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:100:32: ';' fieldList
            	    {
            	    char_literal94=(Token)match(input,48,FOLLOW_48_in_recordType1001); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal94);

            	    pushFollow(FOLLOW_fieldList_in_recordType1003);
            	    fieldList95=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList95.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            END96=(Token)match(input,END,FOLLOW_END_in_recordType1007); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END96);



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
            // 101:5: -> ^( RECORD ( fieldList )* )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:8: ^( RECORD ( fieldList )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:101:17: ( fieldList )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:1: type : ( IDENT | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT97=null;
        Oberon0Parser.arrayType_return arrayType98 = null;

        Oberon0Parser.recordType_return recordType99 = null;


        CommonTree IDENT97_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:5: ( IDENT | arrayType | recordType )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:9: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT97=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1028); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT97_tree = (CommonTree)adaptor.create(IDENT97);
                    adaptor.addChild(root_0, IDENT97_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:17: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1032);
                    arrayType98=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType98.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:102:29: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1036);
                    recordType99=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType99.getTree());

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:1: fPSection : ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) );
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR100=null;
        Token char_literal102=null;
        Token char_literal105=null;
        Oberon0Parser.identList_return identList101 = null;

        Oberon0Parser.type_return type103 = null;

        Oberon0Parser.identList_return identList104 = null;

        Oberon0Parser.type_return type106 = null;


        CommonTree VAR100_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree char_literal105_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:10: ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:103:13: VAR identList ':' type
                    {
                    VAR100=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR100);

                    pushFollow(FOLLOW_identList_in_fPSection1045);
                    identList101=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList101.getTree());
                    char_literal102=(Token)match(input,49,FOLLOW_49_in_fPSection1047); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal102);

                    pushFollow(FOLLOW_type_in_fPSection1049);
                    type103=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type103.getTree());


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
                    // 104:5: -> ^( REFVAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:104:8: ^( REFVAR type identList )
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
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:105:4: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1070);
                    identList104=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList104.getTree());
                    char_literal105=(Token)match(input,49,FOLLOW_49_in_fPSection1072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_49.add(char_literal105);

                    pushFollow(FOLLOW_type_in_fPSection1074);
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
                    // 106:5: -> ^( VAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:106:8: ^( VAR type identList )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal107=null;
        Token char_literal109=null;
        Token char_literal111=null;
        Oberon0Parser.fPSection_return fPSection108 = null;

        Oberon0Parser.fPSection_return fPSection110 = null;


        CommonTree char_literal107_tree=null;
        CommonTree char_literal109_tree=null;
        CommonTree char_literal111_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:17: ( '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:19: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            char_literal107=(Token)match(input,45,FOLLOW_45_in_formalParameters1094); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(char_literal107);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:23: ( fPSection ( ';' fPSection )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VAR||LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:24: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1097);
                    fPSection108=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection108.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:34: ( ';' fPSection )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==48) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:107:35: ';' fPSection
                    	    {
                    	    char_literal109=(Token)match(input,48,FOLLOW_48_in_formalParameters1100); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal109);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1102);
                    	    fPSection110=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection110.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal111=(Token)match(input,46,FOLLOW_46_in_formalParameters1108); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal111);



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
            // 108:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:108:32: ( fPSection )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:1: procedureBody : BEGIN statementSequence -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN112=null;
        Oberon0Parser.statementSequence_return statementSequence113 = null;


        CommonTree BEGIN112_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:14: ( BEGIN statementSequence -> ^( BODY statementSequence ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:109:17: BEGIN statementSequence
            {
            BEGIN112=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN112);

            pushFollow(FOLLOW_statementSequence_in_procedureBody1137);
            statementSequence113=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence113.getTree());


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
            // 110:5: -> ^( BODY statementSequence )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:110:8: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:1: procedureDeclaration : PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE114=null;
        Token IDENT115=null;
        Token char_literal117=null;
        Token END120=null;
        Token IDENT121=null;
        Oberon0Parser.formalParameters_return formalParameters116 = null;

        Oberon0Parser.declarations_return declarations118 = null;

        Oberon0Parser.procedureBody_return procedureBody119 = null;


        CommonTree PROCEDURE114_tree=null;
        CommonTree IDENT115_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree END120_tree=null;
        CommonTree IDENT121_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:21: ( PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:23: PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT
            {
            PROCEDURE114=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1155); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE114);

            IDENT115=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1157); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT115);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:39: ( formalParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:41: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1161);
                    formalParameters116=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters116.getTree());

                    }
                    break;

            }

            char_literal117=(Token)match(input,48,FOLLOW_48_in_procedureDeclaration1165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal117);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration1167);
            declarations118=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations118.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:77: ( procedureBody )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BEGIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:111:78: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1170);
                    procedureBody119=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody119.getTree());

                    }
                    break;

            }

            END120=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END120);

            IDENT121=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1176); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT121);



            // AST REWRITE
            // elements: PROCEDURE, formalParameters, declarations, IDENT, procedureBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:5: -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:8: ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:46: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:112:60: ( procedureBody )?
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:1: constDeclaration : ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST122=null;
        Token IDENT123=null;
        Token char_literal124=null;
        Token char_literal126=null;
        Oberon0Parser.expression_return expression125 = null;


        CommonTree CONST122_tree=null;
        CommonTree IDENT123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree char_literal126_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:17: ( ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:19: ( CONST ( IDENT '=' expression ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:19: ( CONST ( IDENT '=' expression ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:20: CONST ( IDENT '=' expression ';' )*
            {
            CONST122=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1209); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST122);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:26: ( IDENT '=' expression ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:113:27: IDENT '=' expression ';'
            	    {
            	    IDENT123=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclaration1212); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT123);

            	    char_literal124=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1214); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal124);

            	    pushFollow(FOLLOW_expression_in_constDeclaration1216);
            	    expression125=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression125.getTree());
            	    char_literal126=(Token)match(input,48,FOLLOW_48_in_constDeclaration1218); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal126);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: IDENT, expression, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 114:5: -> ( ^( CONST IDENT expression ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:114:8: ( ^( CONST IDENT expression ) )*
                while ( stream_IDENT.hasNext()||stream_expression.hasNext()||stream_CONST.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:114:8: ^( CONST IDENT expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_IDENT.reset();
                stream_expression.reset();
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:1: typeDeclaration : ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE127=null;
        Token IDENT128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        Oberon0Parser.type_return type130 = null;


        CommonTree TYPE127_tree=null;
        CommonTree IDENT128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree char_literal131_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:16: ( ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:18: ( TYPE ( IDENT '=' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:18: ( TYPE ( IDENT '=' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:19: TYPE ( IDENT '=' type ';' )*
            {
            TYPE127=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE127);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:24: ( IDENT '=' type ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:115:25: IDENT '=' type ';'
            	    {
            	    IDENT128=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration1246); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT128);

            	    char_literal129=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1248); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal129);

            	    pushFollow(FOLLOW_type_in_typeDeclaration1250);
            	    type130=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type130.getTree());
            	    char_literal131=(Token)match(input,48,FOLLOW_48_in_typeDeclaration1252); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal131);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: TYPE, type, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:5: -> ( ^( TYPE IDENT type ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:8: ( ^( TYPE IDENT type ) )*
                while ( stream_TYPE.hasNext()||stream_type.hasNext()||stream_IDENT.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:116:8: ^( TYPE IDENT type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_TYPE.reset();
                stream_type.reset();
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:1: varDeclarations : ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR132=null;
        Token char_literal134=null;
        Token char_literal136=null;
        Oberon0Parser.identList_return identList133 = null;

        Oberon0Parser.type_return type135 = null;


        CommonTree VAR132_tree=null;
        CommonTree char_literal134_tree=null;
        CommonTree char_literal136_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:16: ( ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:18: ( VAR ( identList ':' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:18: ( VAR ( identList ':' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:19: VAR ( identList ':' type ';' )*
            {
            VAR132=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1277); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR132);

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:23: ( identList ':' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:117:24: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1280);
            	    identList133=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList133.getTree());
            	    char_literal134=(Token)match(input,49,FOLLOW_49_in_varDeclarations1282); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal134);

            	    pushFollow(FOLLOW_type_in_varDeclarations1284);
            	    type135=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type135.getTree());
            	    char_literal136=(Token)match(input,48,FOLLOW_48_in_varDeclarations1286); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal136);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: type, VAR, identList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 118:5: -> ( ^( VAR type identList ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:118:8: ( ^( VAR type identList ) )*
                while ( stream_type.hasNext()||stream_VAR.hasNext()||stream_identList.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:118:8: ^( VAR type identList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_VAR.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_VAR.reset();
                stream_identList.reset();

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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal141=null;
        Oberon0Parser.constDeclaration_return constDeclaration137 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration138 = null;

        Oberon0Parser.varDeclarations_return varDeclarations139 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration140 = null;


        CommonTree char_literal141_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )*
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:16: ( constDeclaration )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CONST) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1311);
                    constDeclaration137=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration137.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:34: ( typeDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==TYPE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1314);
                    typeDeclaration138=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration138.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:51: ( varDeclarations )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VAR) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1317);
                    varDeclarations139=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations139.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:68: ( procedureDeclaration ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==PROCEDURE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:119:69: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1321);
            	    procedureDeclaration140=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration140.getTree());
            	    char_literal141=(Token)match(input,48,FOLLOW_48_in_declarations1323); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal141);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



            // AST REWRITE
            // elements: procedureDeclaration, typeDeclaration, constDeclaration, varDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 120:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:120:60: ( procedureDeclaration )*
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN143=null;
        Token END145=null;
        Oberon0Parser.declarations_return declarations142 = null;

        Oberon0Parser.statementSequence_return statementSequence144 = null;


        CommonTree BEGIN143_tree=null;
        CommonTree END145_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:11: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:14: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody1352);
            declarations142=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations142.getTree());
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:27: ( BEGIN statementSequence )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BEGIN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:121:28: BEGIN statementSequence
                    {
                    BEGIN143=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1355); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN143);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody1357);
                    statementSequence144=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence144.getTree());

                    }
                    break;

            }

            END145=(Token)match(input,END,FOLLOW_END_in_moduleBody1361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END145);



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
            // 122:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:122:22: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:123:1: module : MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE146=null;
        Token IDENT147=null;
        Token char_literal148=null;
        Token IDENT150=null;
        Token char_literal151=null;
        Token EOF152=null;
        Oberon0Parser.moduleBody_return moduleBody149 = null;


        CommonTree MODULE146_tree=null;
        CommonTree IDENT147_tree=null;
        CommonTree char_literal148_tree=null;
        CommonTree IDENT150_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree EOF152_tree=null;
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:123:7: ( MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:123:11: MODULE IDENT ';' moduleBody IDENT '.' EOF
            {
            MODULE146=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE146);

            IDENT147=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1387); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT147);

            char_literal148=(Token)match(input,48,FOLLOW_48_in_module1389); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal148);

            pushFollow(FOLLOW_moduleBody_in_module1391);
            moduleBody149=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody149.getTree());
            IDENT150=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1393); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT150);

            char_literal151=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1395); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal151);

            EOF152=(Token)match(input,EOF,FOLLOW_EOF_in_module1397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF152);



            // AST REWRITE
            // elements: MODULE, moduleBody, IDENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 124:5: -> ^( MODULE IDENT moduleBody )
            {
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:124:8: ^( MODULE IDENT moduleBody )
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

    // $ANTLR start synpred21_Oberon0
    public final void synpred21_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:14: ( simpleExpression infixOperand simpleExpression )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:14: simpleExpression infixOperand simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0489);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred21_Oberon0491);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0493);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Oberon0

    // $ANTLR start synpred25_Oberon0
    public final void synpred25_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred25_Oberon0566); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred25_Oberon0568);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred25_Oberon0570); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred25_Oberon0572);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:52: ( ELSIF expression THEN statementSequence )+
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
        	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:53: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred25_Oberon0575); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred25_Oberon0577);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred25_Oberon0579); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred25_Oberon0581);
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

        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:95: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:77:96: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred25_Oberon0586); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred25_Oberon0588);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred25_Oberon0591); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Oberon0

    // $ANTLR start synpred27_Oberon0
    public final void synpred27_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred27_Oberon0639); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred27_Oberon0641);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0643); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0645);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:41: ( ELSIF expression THEN statementSequence )+
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
        	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:79:42: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred27_Oberon0648); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred27_Oberon0650);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0652); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0654);
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

        match(input,END,FOLLOW_END_in_synpred27_Oberon0658); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Oberon0

    // $ANTLR start synpred28_Oberon0
    public final void synpred28_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred28_Oberon0696); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred28_Oberon0698);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0700); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0702);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:41: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:81:42: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred28_Oberon0705); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0707);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred28_Oberon0710); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Oberon0

    // $ANTLR start synpred30_Oberon0
    public final void synpred30_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:14: ( assignment )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred30_Oberon0864);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Oberon0

    // $ANTLR start synpred31_Oberon0
    public final void synpred31_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:27: ( procedureCall )
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:91:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred31_Oberon0868);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Oberon0

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
    public final boolean synpred21_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Oberon0_fragment(); // can never throw exception
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


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\1\4\12\uffff";
    static final String DFA14_minS =
        "\1\13\1\0\11\uffff";
    static final String DFA14_maxS =
        "\1\60\1\0\11\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\3\4\2\uffff\1\3\26\uffff\1\1\6\uffff\1\4",
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
            return "91:13: ( assignment | procedureCall | ifStatement | whileStatement )?";
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
                        if ( (synpred30_Oberon0()) ) {s = 9;}

                        else if ( (synpred31_Oberon0()) ) {s = 10;}

                         
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
 

    public static final BitSet FOLLOW_IDENT_in_selector348 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector352 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector355 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector359 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_selector362 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_selector364 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_IDENT_in_selector372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_factor388 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_factor391 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_factor393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor398 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_factor_in_factor401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term409 = new BitSet(new long[]{0x00000000030000C2L});
    public static final BitSet FOLLOW_set_in_term412 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_factor_in_term423 = new BitSet(new long[]{0x00000000030000C2L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression432 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression435 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression440 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_set_in_simpleExpression443 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression453 = new BitSet(new long[]{0x0000000004000032L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression489 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression491 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_actualParameters529 = new BitSet(new long[]{0x00006A0400000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters532 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_47_in_actualParameters535 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters537 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_46_in_actualParameters543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement566 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement570 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement575 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement577 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement579 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement581 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement586 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement588 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement639 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement641 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement643 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement645 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement648 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement650 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement652 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement654 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_ifStatement658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement696 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement698 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement700 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement702 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement705 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement707 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement745 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement747 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement749 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement751 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement778 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_whileStatement780 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_whileStatement782 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement784 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_whileStatement786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment811 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment813 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_assignment815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall836 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence883 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_statementSequence886 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statement_in_statementSequence888 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList910 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_identList914 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList916 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType938 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_arrayType940 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OF_in_arrayType942 = new BitSet(new long[]{0x0000020000A00000L});
    public static final BitSet FOLLOW_type_in_arrayType944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList966 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_fieldList968 = new BitSet(new long[]{0x0000020000A00000L});
    public static final BitSet FOLLOW_type_in_fieldList970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType996 = new BitSet(new long[]{0x0001020000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType998 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_48_in_recordType1001 = new BitSet(new long[]{0x0001020000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1003 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_END_in_recordType1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1043 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1045 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_fPSection1047 = new BitSet(new long[]{0x0000020000A00000L});
    public static final BitSet FOLLOW_type_in_fPSection1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1070 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_fPSection1072 = new BitSet(new long[]{0x0000020000A00000L});
    public static final BitSet FOLLOW_type_in_fPSection1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_formalParameters1094 = new BitSet(new long[]{0x0000420000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1097 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_formalParameters1100 = new BitSet(new long[]{0x0000020000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1102 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_formalParameters1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1135 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1155 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1157 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1161 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_procedureDeclaration1165 = new BitSet(new long[]{0x0000000000188700L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1167 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1170 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1174 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1209 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclaration1212 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1214 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1216 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_constDeclaration1218 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1243 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration1246 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1248 = new BitSet(new long[]{0x0000020000A00000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1250 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_typeDeclaration1252 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1277 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1280 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclarations1282 = new BitSet(new long[]{0x0000020000A00000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1284 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_varDeclarations1286 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1311 = new BitSet(new long[]{0x0000000000100602L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1314 = new BitSet(new long[]{0x0000000000100202L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1317 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1321 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_declarations1323 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1352 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1355 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1357 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_moduleBody1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1385 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1387 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_module1389 = new BitSet(new long[]{0x0000000000188700L});
    public static final BitSet FOLLOW_moduleBody_in_module1391 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1393 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0489 = new BitSet(new long[]{0x00000003F0000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred21_Oberon0491 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred25_Oberon0566 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_synpred25_Oberon0568 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred25_Oberon0570 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred25_Oberon0572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred25_Oberon0575 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_synpred25_Oberon0577 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred25_Oberon0579 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred25_Oberon0581 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_synpred25_Oberon0586 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred25_Oberon0588 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred25_Oberon0591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred27_Oberon0639 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0641 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0643 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0645 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred27_Oberon0648 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0650 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0652 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0654 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_synpred27_Oberon0658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred28_Oberon0696 = new BitSet(new long[]{0x00002A0400000030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0698 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0700 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0702 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_synpred28_Oberon0705 = new BitSet(new long[]{0x0001020000040800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0707 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred28_Oberon0710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred30_Oberon0864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred31_Oberon0868 = new BitSet(new long[]{0x0000000000000002L});

}