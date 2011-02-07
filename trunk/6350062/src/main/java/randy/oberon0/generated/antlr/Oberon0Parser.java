// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Data\\software_construction\\grammar\\Oberon0.g 2011-02-07 10:45:39

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "WITH", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "NOTEQUALS", "SMALLERTHAN", "GREATERTHAN", "SMALLEREQUALS", "GREATEREQUALS", "NOT", "REFVAR", "PROCEDURECALL", "PARAMETERS", "BODY", "DOTSELECTOR", "ARRAYSELECTOR", "WHITESPACE", "IDENT", "INTEGER", "']'", "'('", "')'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
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
    public static final int WITH=19;
    public static final int BEGIN=20;
    public static final int PROCEDURE=21;
    public static final int ARRAY=22;
    public static final int OF=23;
    public static final int RECORD=24;
    public static final int MOD=25;
    public static final int AND=26;
    public static final int OR=27;
    public static final int ASSIGNMENT=28;
    public static final int EQUALS=29;
    public static final int NOTEQUALS=30;
    public static final int SMALLERTHAN=31;
    public static final int GREATERTHAN=32;
    public static final int SMALLEREQUALS=33;
    public static final int GREATEREQUALS=34;
    public static final int NOT=35;
    public static final int REFVAR=36;
    public static final int PROCEDURECALL=37;
    public static final int PARAMETERS=38;
    public static final int BODY=39;
    public static final int DOTSELECTOR=40;
    public static final int ARRAYSELECTOR=41;
    public static final int WHITESPACE=42;
    public static final int IDENT=43;
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


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:1: selector : ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT );
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:9: ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=DOTSELECTOR && LA2_1<=ARRAYSELECTOR)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=MINUS && LA2_1<=DIVIDE)||(LA2_1>=THEN && LA2_1<=END)||LA2_1==DO||LA2_1==OF||(LA2_1>=MOD && LA2_1<=GREATEREQUALS)||(LA2_1>=45 && LA2_1<=49)) ) {
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:12: IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector354); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT1_tree = (CommonTree)adaptor.create(IDENT1);
                    adaptor.addChild(root_0, IDENT1_tree);
                    }
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:18: ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:19: ( DOTSELECTOR IDENT )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:19: ( DOTSELECTOR IDENT )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:20: DOTSELECTOR IDENT
                    	    {
                    	    DOTSELECTOR2=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector358); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR2_tree = (CommonTree)adaptor.create(DOTSELECTOR2);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR2_tree, root_0);
                    	    }
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector361); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    IDENT3_tree = (CommonTree)adaptor.create(IDENT3);
                    	    adaptor.addChild(root_0, IDENT3_tree);
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:40: ( ARRAYSELECTOR expression ']' )
                    	    {
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:40: ( ARRAYSELECTOR expression ']' )
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:41: ARRAYSELECTOR expression ']'
                    	    {
                    	    ARRAYSELECTOR4=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector365); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR4_tree = (CommonTree)adaptor.create(ARRAYSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_selector368);
                    	    expression5=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression5.getTree());
                    	    char_literal6=(Token)match(input,45,FOLLOW_45_in_selector370); if (state.failed) return retval;

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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:67:77: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector378); if (state.failed) return retval;
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:1: factor : ( selector | INTEGER | '(' expression ')' | NOT factor );
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:7: ( selector | INTEGER | '(' expression ')' | NOT factor )
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
            case 46:
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor386);
                    selector8=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector8.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:22: INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    INTEGER9=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor390); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER9_tree = (CommonTree)adaptor.create(INTEGER9);
                    adaptor.addChild(root_0, INTEGER9_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:32: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal10=(Token)match(input,46,FOLLOW_46_in_factor394); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor397);
                    expression11=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression11.getTree());
                    char_literal12=(Token)match(input,47,FOLLOW_47_in_factor399); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:55: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT13=(Token)match(input,NOT,FOLLOW_NOT_in_factor404); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT13_tree = (CommonTree)adaptor.create(NOT13);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT13_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor407);
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set16=null;
        Oberon0Parser.factor_return factor15 = null;

        Oberon0Parser.factor_return factor17 = null;


        CommonTree set16_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:9: factor ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term415);
            factor15=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor15.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:16: ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TIMES && LA4_0<=DIVIDE)||(LA4_0>=MOD && LA4_0<=AND)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:69:17: ( TIMES | DIVIDE | MOD | AND ) factor
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

            	    pushFollow(FOLLOW_factor_in_term429);
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:17: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:19: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:19: ( PLUS | MINUS )?
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:20: PLUS
                    {
                    PLUS18=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression438); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:26: MINUS
                    {
                    MINUS19=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS19_tree = (CommonTree)adaptor.create(MINUS19);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS19_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression446);
            term20=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term20.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:40: ( ( PLUS | MINUS | OR ) term )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=MINUS && LA6_0<=PLUS)||LA6_0==OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:70:41: ( PLUS | MINUS | OR ) term
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

            	    pushFollow(FOLLOW_term_in_simpleExpression459);
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:1: infixOperand : ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set23=null;

        CommonTree set23_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:71:13: ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:11: ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
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
            case 46:
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:14: simpleExpression infixOperand simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression495);
                    simpleExpression24=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression24.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression497);
                    infixOperand25=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand25.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression499);
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
                    // 73:5: -> ^( infixOperand simpleExpression simpleExpression )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:73:8: ^( infixOperand simpleExpression simpleExpression )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:74:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression521);
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
                    // 75:5: -> simpleExpression
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? ;
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
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:17: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:19: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal28=(Token)match(input,46,FOLLOW_46_in_actualParameters535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal28);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:23: ( expression ( ',' expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=MINUS && LA9_0<=PLUS)||LA9_0==NOT||(LA9_0>=IDENT && LA9_0<=INTEGER)||LA9_0==46) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:24: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters538);
                    expression29=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression29.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:35: ( ',' expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==48) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:76:36: ',' expression
                    	    {
                    	    char_literal30=(Token)match(input,48,FOLLOW_48_in_actualParameters541); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_48.add(char_literal30);

                    	    pushFollow(FOLLOW_expression_in_actualParameters543);
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

            char_literal32=(Token)match(input,47,FOLLOW_47_in_actualParameters549); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal32);



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
            // 77:5: -> ( expression ( expression )* )?
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:8: ( expression ( expression )* )?
                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:77:20: ( expression )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) );
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF33=(Token)match(input,IF,FOLLOW_IF_in_ifStatement572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF33);

                    pushFollow(FOLLOW_expression_in_ifStatement574);
                    expression34=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression34.getTree());
                    THEN35=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement576); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN35);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement578);
                    statementSequence36=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence36.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:52: ( ELSIF expression THEN statementSequence )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:53: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF37=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement581); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF37);

                    	    pushFollow(FOLLOW_expression_in_ifStatement583);
                    	    expression38=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression38.getTree());
                    	    THEN39=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement585); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN39);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement587);
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

                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:95: ( ELSE statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:96: ELSE statementSequence
                    {
                    ELSE41=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE41);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement594);
                    statementSequence42=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence42.getTree());

                    }

                    END43=(Token)match(input,END,FOLLOW_END_in_ifStatement597); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END43);



                    // AST REWRITE
                    // elements: statementSequence, IF, ELSIF, ELSE, expression, statementSequence, statementSequence, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 79:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:24: ^( BODY statementSequence )
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
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:69: ^( BODY statementSequence )
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:97: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:79:104: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF44=(Token)match(input,IF,FOLLOW_IF_in_ifStatement645); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF44);

                    pushFollow(FOLLOW_expression_in_ifStatement647);
                    expression45=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression45.getTree());
                    THEN46=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN46);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement651);
                    statementSequence47=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence47.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:41: ( ELSIF expression THEN statementSequence )+
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
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:42: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF48=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement654); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF48);

                    	    pushFollow(FOLLOW_expression_in_ifStatement656);
                    	    expression49=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());
                    	    THEN50=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement658); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN50);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement660);
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

                    END52=(Token)match(input,END,FOLLOW_END_in_ifStatement664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END52);



                    // AST REWRITE
                    // elements: expression, statementSequence, statementSequence, ELSIF, IF, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 81:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:81:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:81:24: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_expression.hasNext()||stream_statementSequence.hasNext()||stream_ELSIF.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext()||stream_statementSequence.hasNext()||stream_ELSIF.hasNext() ) {
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:81:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // C:\\Data\\software_construction\\grammar\\Oberon0.g:81:69: ^( BODY statementSequence )
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
                        stream_statementSequence.reset();
                        stream_ELSIF.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF53=(Token)match(input,IF,FOLLOW_IF_in_ifStatement702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF53);

                    pushFollow(FOLLOW_expression_in_ifStatement704);
                    expression54=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression54.getTree());
                    THEN55=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN55);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement708);
                    statementSequence56=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence56.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:41: ( ELSE statementSequence )
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:42: ELSE statementSequence
                    {
                    ELSE57=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE57);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement713);
                    statementSequence58=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence58.getTree());

                    }

                    END59=(Token)match(input,END,FOLLOW_END_in_ifStatement716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END59);



                    // AST REWRITE
                    // elements: statementSequence, ELSE, statementSequence, expression, IF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 83:5: -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:8: ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
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
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:50: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:83:57: ^( BODY statementSequence )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:84:4: IF expression THEN statementSequence END
                    {
                    IF60=(Token)match(input,IF,FOLLOW_IF_in_ifStatement751); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF60);

                    pushFollow(FOLLOW_expression_in_ifStatement753);
                    expression61=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression61.getTree());
                    THEN62=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN62);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement757);
                    statementSequence63=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence63.getTree());
                    END64=(Token)match(input,END,FOLLOW_END_in_ifStatement759); if (state.failed) return retval; 
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
                    // 85:5: -> ^( IF expression ^( BODY statementSequence ) )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:85:8: ^( IF expression ^( BODY statementSequence ) )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:15: ( WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:86:18: WHILE expression DO statementSequence END
            {
            WHILE65=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement784); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE65);

            pushFollow(FOLLOW_expression_in_whileStatement786);
            expression66=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression66.getTree());
            DO67=(Token)match(input,DO,FOLLOW_DO_in_whileStatement788); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO67);

            pushFollow(FOLLOW_statementSequence_in_whileStatement790);
            statementSequence68=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence68.getTree());
            END69=(Token)match(input,END,FOLLOW_END_in_whileStatement792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END69);



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
            // 87:5: -> ^( WHILE expression ^( BODY statementSequence ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:8: ^( WHILE expression ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:87:27: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:1: withStatement : WITH selector DO statementSequence END -> ^( WITH selector ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.withStatement_return withStatement() throws RecognitionException {
        Oberon0Parser.withStatement_return retval = new Oberon0Parser.withStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WITH70=null;
        Token DO72=null;
        Token END74=null;
        Oberon0Parser.selector_return selector71 = null;

        Oberon0Parser.statementSequence_return statementSequence73 = null;


        CommonTree WITH70_tree=null;
        CommonTree DO72_tree=null;
        CommonTree END74_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:14: ( WITH selector DO statementSequence END -> ^( WITH selector ^( BODY statementSequence ) ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:88:17: WITH selector DO statementSequence END
            {
            WITH70=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement817); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WITH.add(WITH70);

            pushFollow(FOLLOW_selector_in_withStatement819);
            selector71=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector71.getTree());
            DO72=(Token)match(input,DO,FOLLOW_DO_in_withStatement821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO72);

            pushFollow(FOLLOW_statementSequence_in_withStatement823);
            statementSequence73=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence73.getTree());
            END74=(Token)match(input,END,FOLLOW_END_in_withStatement825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END74);



            // AST REWRITE
            // elements: selector, statementSequence, WITH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 89:5: -> ^( WITH selector ^( BODY statementSequence ) )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:89:8: ^( WITH selector ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WITH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:90:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment850);
            selector75=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector75.getTree());
            ASSIGNMENT76=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment852); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT76);

            pushFollow(FOLLOW_expression_in_assignment854);
            expression77=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression77.getTree());


            // AST REWRITE
            // elements: expression, selector, ASSIGNMENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 91:5: -> ^( ASSIGNMENT selector expression )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:91:8: ^( ASSIGNMENT selector expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:1: procedureCall : selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector78 = null;

        Oberon0Parser.actualParameters_return actualParameters79 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:14: ( selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall875);
            selector78=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector78.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:26: ( actualParameters )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:92:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall878);
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
            // 93:5: -> ^( PROCEDURECALL selector ( actualParameters )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:8: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:93:33: ( actualParameters )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:1: statement : ( assignment | procedureCall | ifStatement | whileStatement | withStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment80 = null;

        Oberon0Parser.procedureCall_return procedureCall81 = null;

        Oberon0Parser.ifStatement_return ifStatement82 = null;

        Oberon0Parser.whileStatement_return whileStatement83 = null;

        Oberon0Parser.withStatement_return withStatement84 = null;



        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:10: ( ( assignment | procedureCall | ifStatement | whileStatement | withStatement )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:13: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:13: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?
            int alt14=6;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement903);
                    assignment80=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment80.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement907);
                    procedureCall81=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall81.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement910);
                    ifStatement82=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement82.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement914);
                    whileStatement83=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement83.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:73: withStatement
                    {
                    pushFollow(FOLLOW_withStatement_in_statement918);
                    withStatement84=withStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement84.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal86=null;
        Oberon0Parser.statement_return statement85 = null;

        Oberon0Parser.statement_return statement87 = null;


        CommonTree char_literal86_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:18: ( statement ( ';' statement )* -> statement ( statement )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:20: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence926);
            statement85=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement85.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:30: ( ';' statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:95:31: ';' statement
            	    {
            	    char_literal86=(Token)match(input,49,FOLLOW_49_in_statementSequence929); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal86);

            	    pushFollow(FOLLOW_statement_in_statementSequence931);
            	    statement87=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement87.getTree());

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
            // 96:5: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:96:18: ( statement )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:1: identList : IDENT ( ',' IDENT )* -> IDENT ( IDENT )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT88=null;
        Token char_literal89=null;
        Token IDENT90=null;

        CommonTree IDENT88_tree=null;
        CommonTree char_literal89_tree=null;
        CommonTree IDENT90_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:10: ( IDENT ( ',' IDENT )* -> IDENT ( IDENT )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:13: IDENT ( ',' IDENT )*
            {
            IDENT88=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList953); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT88);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:19: ( ',' IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==48) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:97:21: ',' IDENT
            	    {
            	    char_literal89=(Token)match(input,48,FOLLOW_48_in_identList957); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_48.add(char_literal89);

            	    IDENT90=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList959); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT90);


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
            // 98:5: -> IDENT ( IDENT )*
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:98:14: ( IDENT )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:1: arrayType : ARRAY expression OF type -> ^( ARRAY type expression ) ;
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
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:10: ( ARRAY expression OF type -> ^( ARRAY type expression ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:99:13: ARRAY expression OF type
            {
            ARRAY91=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType981); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY91);

            pushFollow(FOLLOW_expression_in_arrayType983);
            expression92=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression92.getTree());
            OF93=(Token)match(input,OF,FOLLOW_OF_in_arrayType985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF93);

            pushFollow(FOLLOW_type_in_arrayType987);
            type94=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type94.getTree());


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
            // 100:5: -> ^( ARRAY type expression )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:100:8: ^( ARRAY type expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:1: fieldList : ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal96=null;
        Oberon0Parser.identList_return identList95 = null;

        Oberon0Parser.type_return type97 = null;


        CommonTree char_literal96_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:10: ( ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:13: ( identList ':' type )?
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:13: ( identList ':' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:101:14: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1009);
                    identList95=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList95.getTree());
                    char_literal96=(Token)match(input,50,FOLLOW_50_in_fieldList1011); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal96);

                    pushFollow(FOLLOW_type_in_fieldList1013);
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
            // 102:5: -> ^( VAR ( type )? ( identList )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:102:8: ^( VAR ( type )? ( identList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:102:14: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:102:20: ( identList )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:1: recordType : RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) ;
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:11: ( RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:14: RECORD fieldList ( ';' fieldList )* END
            {
            RECORD98=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1039); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD98);

            pushFollow(FOLLOW_fieldList_in_recordType1041);
            fieldList99=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList99.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:31: ( ';' fieldList )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==49) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:103:32: ';' fieldList
            	    {
            	    char_literal100=(Token)match(input,49,FOLLOW_49_in_recordType1044); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal100);

            	    pushFollow(FOLLOW_fieldList_in_recordType1046);
            	    fieldList101=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList101.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            END102=(Token)match(input,END,FOLLOW_END_in_recordType1050); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END102);



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
            // 104:5: -> ^( RECORD ( fieldList )* )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:104:8: ^( RECORD ( fieldList )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:104:17: ( fieldList )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:1: type : ( IDENT | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT103=null;
        Oberon0Parser.arrayType_return arrayType104 = null;

        Oberon0Parser.recordType_return recordType105 = null;


        CommonTree IDENT103_tree=null;

        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:5: ( IDENT | arrayType | recordType )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:9: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT103=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1071); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT103_tree = (CommonTree)adaptor.create(IDENT103);
                    adaptor.addChild(root_0, IDENT103_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:17: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1075);
                    arrayType104=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType104.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:105:29: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1079);
                    recordType105=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType105.getTree());

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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:1: fPSection : ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) );
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR106=null;
        Token char_literal108=null;
        Token char_literal111=null;
        Oberon0Parser.identList_return identList107 = null;

        Oberon0Parser.type_return type109 = null;

        Oberon0Parser.identList_return identList110 = null;

        Oberon0Parser.type_return type112 = null;


        CommonTree VAR106_tree=null;
        CommonTree char_literal108_tree=null;
        CommonTree char_literal111_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:10: ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:106:13: VAR identList ':' type
                    {
                    VAR106=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR106);

                    pushFollow(FOLLOW_identList_in_fPSection1088);
                    identList107=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList107.getTree());
                    char_literal108=(Token)match(input,50,FOLLOW_50_in_fPSection1090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal108);

                    pushFollow(FOLLOW_type_in_fPSection1092);
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
                    // 107:5: -> ^( REFVAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:107:8: ^( REFVAR type identList )
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
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:108:4: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1113);
                    identList110=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList110.getTree());
                    char_literal111=(Token)match(input,50,FOLLOW_50_in_fPSection1115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_50.add(char_literal111);

                    pushFollow(FOLLOW_type_in_fPSection1117);
                    type112=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type112.getTree());


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
                    // 109:5: -> ^( VAR type identList )
                    {
                        // C:\\Data\\software_construction\\grammar\\Oberon0.g:109:8: ^( VAR type identList )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Oberon0Parser.fPSection_return fPSection114 = null;

        Oberon0Parser.fPSection_return fPSection116 = null;


        CommonTree char_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree char_literal117_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:17: ( '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:19: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            char_literal113=(Token)match(input,46,FOLLOW_46_in_formalParameters1137); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal113);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:23: ( fPSection ( ';' fPSection )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VAR||LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:24: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1140);
                    fPSection114=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection114.getTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:34: ( ';' fPSection )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==49) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:110:35: ';' fPSection
                    	    {
                    	    char_literal115=(Token)match(input,49,FOLLOW_49_in_formalParameters1143); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_49.add(char_literal115);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1145);
                    	    fPSection116=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection116.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal117=(Token)match(input,47,FOLLOW_47_in_formalParameters1151); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal117);



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
            // 111:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:111:32: ( fPSection )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:1: procedureBody : BEGIN statementSequence -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN118=null;
        Oberon0Parser.statementSequence_return statementSequence119 = null;


        CommonTree BEGIN118_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:14: ( BEGIN statementSequence -> ^( BODY statementSequence ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:112:17: BEGIN statementSequence
            {
            BEGIN118=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1178); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN118);

            pushFollow(FOLLOW_statementSequence_in_procedureBody1180);
            statementSequence119=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence119.getTree());


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
            // 113:5: -> ^( BODY statementSequence )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:113:8: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:1: procedureDeclaration : PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE120=null;
        Token IDENT121=null;
        Token char_literal123=null;
        Token END126=null;
        Token IDENT127=null;
        Oberon0Parser.formalParameters_return formalParameters122 = null;

        Oberon0Parser.declarations_return declarations124 = null;

        Oberon0Parser.procedureBody_return procedureBody125 = null;


        CommonTree PROCEDURE120_tree=null;
        CommonTree IDENT121_tree=null;
        CommonTree char_literal123_tree=null;
        CommonTree END126_tree=null;
        CommonTree IDENT127_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:21: ( PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:23: PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT
            {
            PROCEDURE120=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1198); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE120);

            IDENT121=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1200); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT121);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:39: ( formalParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:41: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1204);
                    formalParameters122=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters122.getTree());

                    }
                    break;

            }

            char_literal123=(Token)match(input,49,FOLLOW_49_in_procedureDeclaration1208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal123);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration1210);
            declarations124=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations124.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:77: ( procedureBody )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BEGIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:114:78: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1213);
                    procedureBody125=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody125.getTree());

                    }
                    break;

            }

            END126=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1217); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END126);

            IDENT127=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1219); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT127);



            // AST REWRITE
            // elements: procedureBody, IDENT, declarations, PROCEDURE, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:5: -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:8: ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:46: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:115:60: ( procedureBody )?
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:1: constDeclaration : ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST128=null;
        Token IDENT129=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Oberon0Parser.expression_return expression131 = null;


        CommonTree CONST128_tree=null;
        CommonTree IDENT129_tree=null;
        CommonTree char_literal130_tree=null;
        CommonTree char_literal132_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:17: ( ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:19: ( CONST ( IDENT '=' expression ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:19: ( CONST ( IDENT '=' expression ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:20: CONST ( IDENT '=' expression ';' )*
            {
            CONST128=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST128);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:26: ( IDENT '=' expression ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:116:27: IDENT '=' expression ';'
            	    {
            	    IDENT129=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclaration1255); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT129);

            	    char_literal130=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1257); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal130);

            	    pushFollow(FOLLOW_expression_in_constDeclaration1259);
            	    expression131=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression131.getTree());
            	    char_literal132=(Token)match(input,49,FOLLOW_49_in_constDeclaration1261); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal132);


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
            // 117:5: -> ( ^( CONST IDENT expression ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:8: ( ^( CONST IDENT expression ) )*
                while ( stream_IDENT.hasNext()||stream_CONST.hasNext()||stream_expression.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:117:8: ^( CONST IDENT expression )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:1: typeDeclaration : ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE133=null;
        Token IDENT134=null;
        Token char_literal135=null;
        Token char_literal137=null;
        Oberon0Parser.type_return type136 = null;


        CommonTree TYPE133_tree=null;
        CommonTree IDENT134_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree char_literal137_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:16: ( ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:18: ( TYPE ( IDENT '=' type ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:18: ( TYPE ( IDENT '=' type ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:19: TYPE ( IDENT '=' type ';' )*
            {
            TYPE133=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE133);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:24: ( IDENT '=' type ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:118:25: IDENT '=' type ';'
            	    {
            	    IDENT134=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration1289); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT134);

            	    char_literal135=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1291); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal135);

            	    pushFollow(FOLLOW_type_in_typeDeclaration1293);
            	    type136=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type136.getTree());
            	    char_literal137=(Token)match(input,49,FOLLOW_49_in_typeDeclaration1295); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal137);


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
            // 119:5: -> ( ^( TYPE IDENT type ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:8: ( ^( TYPE IDENT type ) )*
                while ( stream_TYPE.hasNext()||stream_type.hasNext()||stream_IDENT.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:119:8: ^( TYPE IDENT type )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:1: varDeclarations : ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR138=null;
        Token char_literal140=null;
        Token char_literal142=null;
        Oberon0Parser.identList_return identList139 = null;

        Oberon0Parser.type_return type141 = null;


        CommonTree VAR138_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree char_literal142_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:16: ( ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:18: ( VAR ( identList ':' type ';' )* )
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:18: ( VAR ( identList ':' type ';' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:19: VAR ( identList ':' type ';' )*
            {
            VAR138=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR138);

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:23: ( identList ':' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:120:24: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1323);
            	    identList139=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList139.getTree());
            	    char_literal140=(Token)match(input,50,FOLLOW_50_in_varDeclarations1325); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal140);

            	    pushFollow(FOLLOW_type_in_varDeclarations1327);
            	    type141=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type141.getTree());
            	    char_literal142=(Token)match(input,49,FOLLOW_49_in_varDeclarations1329); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal142);


            	    }
            	    break;

            	default :
            	    break loop27;
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
            // 121:5: -> ( ^( VAR type identList ) )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:8: ( ^( VAR type identList ) )*
                while ( stream_identList.hasNext()||stream_VAR.hasNext()||stream_type.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:121:8: ^( VAR type identList )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal147=null;
        Oberon0Parser.constDeclaration_return constDeclaration143 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration144 = null;

        Oberon0Parser.varDeclarations_return varDeclarations145 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration146 = null;


        CommonTree char_literal147_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )*
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:16: ( constDeclaration )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CONST) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1354);
                    constDeclaration143=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration143.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:34: ( typeDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==TYPE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1357);
                    typeDeclaration144=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration144.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:51: ( varDeclarations )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VAR) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1360);
                    varDeclarations145=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations145.getTree());

                    }
                    break;

            }

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:68: ( procedureDeclaration ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==PROCEDURE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:122:69: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1364);
            	    procedureDeclaration146=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration146.getTree());
            	    char_literal147=(Token)match(input,49,FOLLOW_49_in_declarations1366); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal147);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);



            // AST REWRITE
            // elements: typeDeclaration, varDeclarations, procedureDeclaration, constDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 123:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:123:60: ( procedureDeclaration )*
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN149=null;
        Token END151=null;
        Oberon0Parser.declarations_return declarations148 = null;

        Oberon0Parser.statementSequence_return statementSequence150 = null;


        CommonTree BEGIN149_tree=null;
        CommonTree END151_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:11: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:14: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody1395);
            declarations148=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations148.getTree());
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:27: ( BEGIN statementSequence )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BEGIN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:124:28: BEGIN statementSequence
                    {
                    BEGIN149=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN149);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody1400);
                    statementSequence150=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence150.getTree());

                    }
                    break;

            }

            END151=(Token)match(input,END,FOLLOW_END_in_moduleBody1404); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END151);



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
            // 125:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // C:\\Data\\software_construction\\grammar\\Oberon0.g:125:22: ^( BODY statementSequence )
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
    // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:1: module : MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE152=null;
        Token IDENT153=null;
        Token char_literal154=null;
        Token IDENT156=null;
        Token char_literal157=null;
        Token EOF158=null;
        Oberon0Parser.moduleBody_return moduleBody155 = null;


        CommonTree MODULE152_tree=null;
        CommonTree IDENT153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree IDENT156_tree=null;
        CommonTree char_literal157_tree=null;
        CommonTree EOF158_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:7: ( MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:126:11: MODULE IDENT ';' moduleBody IDENT '.' EOF
            {
            MODULE152=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1428); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE152);

            IDENT153=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1430); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT153);

            char_literal154=(Token)match(input,49,FOLLOW_49_in_module1432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(char_literal154);

            pushFollow(FOLLOW_moduleBody_in_module1434);
            moduleBody155=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody155.getTree());
            IDENT156=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1436); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT156);

            char_literal157=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1438); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal157);

            EOF158=(Token)match(input,EOF,FOLLOW_EOF_in_module1440); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF158);



            // AST REWRITE
            // elements: IDENT, MODULE, moduleBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:5: -> ^( MODULE IDENT moduleBody )
            {
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:127:8: ^( MODULE IDENT moduleBody )
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
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:14: ( simpleExpression infixOperand simpleExpression )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:72:14: simpleExpression infixOperand simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0495);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred21_Oberon0497);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred21_Oberon0499);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Oberon0

    // $ANTLR start synpred25_Oberon0
    public final void synpred25_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred25_Oberon0572); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred25_Oberon0574);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred25_Oberon0576); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred25_Oberon0578);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:52: ( ELSIF expression THEN statementSequence )+
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
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:53: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred25_Oberon0581); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred25_Oberon0583);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred25_Oberon0585); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred25_Oberon0587);
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

        // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:95: ( ELSE statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:78:96: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred25_Oberon0592); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred25_Oberon0594);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred25_Oberon0597); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Oberon0

    // $ANTLR start synpred27_Oberon0
    public final void synpred27_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred27_Oberon0645); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred27_Oberon0647);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0649); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0651);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:41: ( ELSIF expression THEN statementSequence )+
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
        	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:80:42: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred27_Oberon0654); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred27_Oberon0656);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0658); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0660);
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

        match(input,END,FOLLOW_END_in_synpred27_Oberon0664); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Oberon0

    // $ANTLR start synpred28_Oberon0
    public final void synpred28_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred28_Oberon0702); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred28_Oberon0704);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred28_Oberon0706); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0708);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:41: ( ELSE statementSequence )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:82:42: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred28_Oberon0711); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0713);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred28_Oberon0716); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Oberon0

    // $ANTLR start synpred30_Oberon0
    public final void synpred30_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:14: ( assignment )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred30_Oberon0903);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Oberon0

    // $ANTLR start synpred31_Oberon0
    public final void synpred31_Oberon0_fragment() throws RecognitionException {   
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:27: ( procedureCall )
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:94:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred31_Oberon0907);
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
        "\14\uffff";
    static final String DFA14_eofS =
        "\1\5\13\uffff";
    static final String DFA14_minS =
        "\1\13\1\0\12\uffff";
    static final String DFA14_maxS =
        "\1\61\1\0\12\uffff";
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
            return "94:13: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?";
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
                        if ( (synpred30_Oberon0()) ) {s = 10;}

                        else if ( (synpred31_Oberon0()) ) {s = 11;}

                         
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
 

    public static final BitSet FOLLOW_IDENT_in_selector354 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector358 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector361 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector365 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_selector368 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_selector370 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_IDENT_in_selector378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_factor394 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_factor397 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_factor399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor404 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_factor_in_factor407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term415 = new BitSet(new long[]{0x00000000060000C2L});
    public static final BitSet FOLLOW_set_in_term418 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_factor_in_term429 = new BitSet(new long[]{0x00000000060000C2L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression438 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression441 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression446 = new BitSet(new long[]{0x0000000008000032L});
    public static final BitSet FOLLOW_set_in_simpleExpression449 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_term_in_simpleExpression459 = new BitSet(new long[]{0x0000000008000032L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression495 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression497 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_actualParameters535 = new BitSet(new long[]{0x0000D80800000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters538 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_48_in_actualParameters541 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_actualParameters543 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_47_in_actualParameters549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement572 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement574 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement576 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement581 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement583 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement585 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement587 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement592 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement594 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement645 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement647 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement649 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement651 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement654 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement656 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement658 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement660 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_ifStatement664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement702 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement704 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement706 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement708 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement711 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement713 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement751 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_ifStatement753 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement755 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement757 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement784 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_whileStatement786 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_whileStatement788 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement790 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_whileStatement792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement817 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_selector_in_withStatement819 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_withStatement821 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_withStatement823 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_withStatement825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment850 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment852 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_assignment854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall875 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence926 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_statementSequence929 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statement_in_statementSequence931 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList953 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_identList957 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList959 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType981 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_arrayType983 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_OF_in_arrayType985 = new BitSet(new long[]{0x0000080001400000L});
    public static final BitSet FOLLOW_type_in_arrayType987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1009 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_fieldList1011 = new BitSet(new long[]{0x0000080001400000L});
    public static final BitSet FOLLOW_type_in_fieldList1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1039 = new BitSet(new long[]{0x0002080000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1041 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_49_in_recordType1044 = new BitSet(new long[]{0x0002080000008000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1046 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_END_in_recordType1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1086 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1088 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_fPSection1090 = new BitSet(new long[]{0x0000080001400000L});
    public static final BitSet FOLLOW_type_in_fPSection1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1113 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_fPSection1115 = new BitSet(new long[]{0x0000080001400000L});
    public static final BitSet FOLLOW_type_in_fPSection1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_formalParameters1137 = new BitSet(new long[]{0x0000880000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1140 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_49_in_formalParameters1143 = new BitSet(new long[]{0x0000080000000200L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1145 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_47_in_formalParameters1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1178 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1198 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1200 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1204 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureDeclaration1208 = new BitSet(new long[]{0x0000000000308700L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1210 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1217 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1252 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclaration1255 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1257 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1259 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_constDeclaration1261 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1286 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration1289 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1291 = new BitSet(new long[]{0x0000080001400000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1293 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_typeDeclaration1295 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1320 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1323 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_varDeclarations1325 = new BitSet(new long[]{0x0000080001400000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1327 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclarations1329 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1354 = new BitSet(new long[]{0x0000000000200602L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1357 = new BitSet(new long[]{0x0000000000200202L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1360 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1364 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarations1366 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1395 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1398 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1400 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_moduleBody1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1428 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1430 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_module1432 = new BitSet(new long[]{0x0000000000308700L});
    public static final BitSet FOLLOW_moduleBody_in_module1434 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1436 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0495 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred21_Oberon0497 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred21_Oberon0499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred25_Oberon0572 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_synpred25_Oberon0574 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred25_Oberon0576 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred25_Oberon0578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred25_Oberon0581 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_synpred25_Oberon0583 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred25_Oberon0585 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred25_Oberon0587 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ELSE_in_synpred25_Oberon0592 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred25_Oberon0594 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred25_Oberon0597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred27_Oberon0645 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0647 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0649 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0651 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred27_Oberon0654 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0656 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0658 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0660 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_END_in_synpred27_Oberon0664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred28_Oberon0702 = new BitSet(new long[]{0x0000580800000030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0704 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_THEN_in_synpred28_Oberon0706 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0708 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ELSE_in_synpred28_Oberon0711 = new BitSet(new long[]{0x00020800000C0800L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0713 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_synpred28_Oberon0716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred30_Oberon0903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred31_Oberon0907 = new BitSet(new long[]{0x0000000000000002L});

}