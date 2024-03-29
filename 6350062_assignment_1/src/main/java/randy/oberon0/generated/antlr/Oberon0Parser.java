// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g 2011-02-17 16:17:23

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TRUE", "FALSE", "MINUS", "PLUS", "TIMES", "DIVIDE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "END", "MODULE", "DO", "WHILE", "BEGIN", "PROCEDURE", "ARRAY", "OF", "RECORD", "MOD", "AND", "OR", "ASSIGNMENT", "EQUALS", "NOTEQUALS", "SMALLERTHAN", "GREATERTHAN", "SMALLEREQUALS", "GREATEREQUALS", "NOT", "REFVAR", "PROCEDURECALL", "PARAMETERS", "BODY", "DOTSELECTOR", "ARRAYSELECTOR", "WHITESPACE", "IDENT", "INTEGER", "']'", "'('", "')'", "','", "';'", "':'"
    };
    public static final int EOF=-1;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
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
    public static final int BODY=40;
    public static final int DOTSELECTOR=41;
    public static final int ARRAYSELECTOR=42;
    public static final int WHITESPACE=43;
    public static final int IDENT=44;
    public static final int INTEGER=45;

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
    public String getGrammarFileName() { return "D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g"; }


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:1: selector : ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT );
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:9: ( IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+ | IDENT )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IDENT) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=DOTSELECTOR && LA2_1<=ARRAYSELECTOR)) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=MINUS && LA2_1<=DIVIDE)||(LA2_1>=THEN && LA2_1<=END)||LA2_1==DO||LA2_1==OF||(LA2_1>=MOD && LA2_1<=GREATEREQUALS)||(LA2_1>=46 && LA2_1<=50)) ) {
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:12: IDENT ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT1_tree = (CommonTree)adaptor.create(IDENT1);
                    adaptor.addChild(root_0, IDENT1_tree);
                    }
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:18: ( ( DOTSELECTOR IDENT ) | ( ARRAYSELECTOR expression ']' ) )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:19: ( DOTSELECTOR IDENT )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:19: ( DOTSELECTOR IDENT )
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:20: DOTSELECTOR IDENT
                    	    {
                    	    DOTSELECTOR2=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_selector364); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOTSELECTOR2_tree = (CommonTree)adaptor.create(DOTSELECTOR2);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(DOTSELECTOR2_tree, root_0);
                    	    }
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector367); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    IDENT3_tree = (CommonTree)adaptor.create(IDENT3);
                    	    adaptor.addChild(root_0, IDENT3_tree);
                    	    }

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:40: ( ARRAYSELECTOR expression ']' )
                    	    {
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:40: ( ARRAYSELECTOR expression ']' )
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:41: ARRAYSELECTOR expression ']'
                    	    {
                    	    ARRAYSELECTOR4=(Token)match(input,ARRAYSELECTOR,FOLLOW_ARRAYSELECTOR_in_selector371); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ARRAYSELECTOR4_tree = (CommonTree)adaptor.create(ARRAYSELECTOR4);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(ARRAYSELECTOR4_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expression_in_selector374);
                    	    expression5=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression5.getTree());
                    	    char_literal6=(Token)match(input,46,FOLLOW_46_in_selector376); if (state.failed) return retval;

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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:68:77: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector384); if (state.failed) return retval;
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:69:1: numberLiteral : INTEGER ;
    public final Oberon0Parser.numberLiteral_return numberLiteral() throws RecognitionException {
        Oberon0Parser.numberLiteral_return retval = new Oberon0Parser.numberLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER8=null;

        CommonTree INTEGER8_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:69:14: ( INTEGER )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:69:17: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_numberLiteral391); if (state.failed) return retval;
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:70:1: booleanLiteral : ( TRUE | FALSE );
    public final Oberon0Parser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        Oberon0Parser.booleanLiteral_return retval = new Oberon0Parser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set9=null;

        CommonTree set9_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:70:15: ( TRUE | FALSE )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:71:1: factor : ( selector | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor );
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:71:7: ( selector | booleanLiteral | numberLiteral | '(' expression ')' | NOT factor )
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
            case 47:
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:71:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor408);
                    selector10=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector10.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:71:22: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_factor412);
                    booleanLiteral11=booleanLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral11.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:71:39: numberLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numberLiteral_in_factor416);
                    numberLiteral12=numberLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, numberLiteral12.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:71:55: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal13=(Token)match(input,47,FOLLOW_47_in_factor420); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_factor423);
                    expression14=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression14.getTree());
                    char_literal15=(Token)match(input,48,FOLLOW_48_in_factor425); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:71:78: NOT factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NOT16=(Token)match(input,NOT,FOLLOW_NOT_in_factor430); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT16_tree = (CommonTree)adaptor.create(NOT16);
                    root_0 = (CommonTree)adaptor.becomeRoot(NOT16_tree, root_0);
                    }
                    pushFollow(FOLLOW_factor_in_factor433);
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:72:1: term : factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set19=null;
        Oberon0Parser.factor_return factor18 = null;

        Oberon0Parser.factor_return factor20 = null;


        CommonTree set19_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:72:5: ( factor ( ( TIMES | DIVIDE | MOD | AND ) factor )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:72:9: factor ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term441);
            factor18=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor18.getTree());
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:72:16: ( ( TIMES | DIVIDE | MOD | AND ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=TIMES && LA4_0<=DIVIDE)||(LA4_0>=MOD && LA4_0<=AND)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:72:17: ( TIMES | DIVIDE | MOD | AND ) factor
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

            	    pushFollow(FOLLOW_factor_in_term455);
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:17: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:19: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:19: ( PLUS | MINUS )?
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:20: PLUS
                    {
                    PLUS21=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression464); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:26: MINUS
                    {
                    MINUS22=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression467); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS22_tree = (CommonTree)adaptor.create(MINUS22);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS22_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression472);
            term23=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term23.getTree());
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:40: ( ( PLUS | MINUS | OR ) term )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=MINUS && LA6_0<=PLUS)||LA6_0==OR) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:73:41: ( PLUS | MINUS | OR ) term
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

            	    pushFollow(FOLLOW_term_in_simpleExpression485);
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:74:1: infixOperand : ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set26=null;

        CommonTree set26_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:74:13: ( EQUALS | NOTEQUALS | SMALLERTHAN | SMALLEREQUALS | GREATERTHAN | GREATEREQUALS )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:75:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:75:11: ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:75:14: simpleExpression infixOperand simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression521);
                    simpleExpression27=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression27.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression523);
                    infixOperand28=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand28.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression525);
                    simpleExpression29=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression29.getTree());


                    // AST REWRITE
                    // elements: simpleExpression, infixOperand, simpleExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 76:5: -> ^( infixOperand simpleExpression simpleExpression )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:76:8: ^( infixOperand simpleExpression simpleExpression )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:77:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression547);
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
                    // 78:5: -> simpleExpression
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:79:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? ;
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
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:79:17: ( '(' ( expression ( ',' expression )* )? ')' -> ( expression ( expression )* )? )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:79:19: '(' ( expression ( ',' expression )* )? ')'
            {
            char_literal31=(Token)match(input,47,FOLLOW_47_in_actualParameters561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal31);

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:79:23: ( expression ( ',' expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=TRUE && LA9_0<=PLUS)||LA9_0==NOT||(LA9_0>=IDENT && LA9_0<=INTEGER)||LA9_0==47) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:79:24: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters564);
                    expression32=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression32.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:79:35: ( ',' expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==49) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:79:36: ',' expression
                    	    {
                    	    char_literal33=(Token)match(input,49,FOLLOW_49_in_actualParameters567); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_49.add(char_literal33);

                    	    pushFollow(FOLLOW_expression_in_actualParameters569);
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

            char_literal35=(Token)match(input,48,FOLLOW_48_in_actualParameters575); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal35);



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
            // 80:5: -> ( expression ( expression )* )?
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:80:8: ( expression ( expression )* )?
                if ( stream_expression.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:80:20: ( expression )*
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:1: ifStatement : ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) );
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:12: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ) | IF expression THEN statementSequence ( ELSE statementSequence ) END -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) ) | IF expression THEN statementSequence END -> ^( IF expression ^( BODY statementSequence ) ) )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
                    {
                    IF36=(Token)match(input,IF,FOLLOW_IF_in_ifStatement598); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF36);

                    pushFollow(FOLLOW_expression_in_ifStatement600);
                    expression37=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression37.getTree());
                    THEN38=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN38);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement604);
                    statementSequence39=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence39.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:52: ( ELSIF expression THEN statementSequence )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:53: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF40=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement607); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF40);

                    	    pushFollow(FOLLOW_expression_in_ifStatement609);
                    	    expression41=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression41.getTree());
                    	    THEN42=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement611); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN42);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement613);
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

                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:95: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:96: ELSE statementSequence
                    {
                    ELSE44=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement618); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE44);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement620);
                    statementSequence45=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence45.getTree());

                    }

                    END46=(Token)match(input,END,FOLLOW_END_in_ifStatement623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END46);



                    // AST REWRITE
                    // elements: ELSIF, IF, ELSE, statementSequence, expression, statementSequence, expression, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 82:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:82:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:82:24: ^( BODY statementSequence )
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
                            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:82:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:82:69: ^( BODY statementSequence )
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
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:82:97: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:82:104: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:83:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
                    {
                    IF47=(Token)match(input,IF,FOLLOW_IF_in_ifStatement671); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF47);

                    pushFollow(FOLLOW_expression_in_ifStatement673);
                    expression48=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());
                    THEN49=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement675); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN49);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement677);
                    statementSequence50=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence50.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:83:41: ( ELSIF expression THEN statementSequence )+
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
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:83:42: ELSIF expression THEN statementSequence
                    	    {
                    	    ELSIF51=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement680); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSIF.add(ELSIF51);

                    	    pushFollow(FOLLOW_expression_in_ifStatement682);
                    	    expression52=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression52.getTree());
                    	    THEN53=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement684); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_THEN.add(THEN53);

                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement686);
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

                    END55=(Token)match(input,END,FOLLOW_END_in_ifStatement690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END55);



                    // AST REWRITE
                    // elements: statementSequence, IF, expression, ELSIF, expression, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 84:5: -> ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:84:8: ^( IF expression ^( BODY statementSequence ) ( ^( ELSIF expression ^( BODY statementSequence ) ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:84:24: ^( BODY statementSequence )
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
                            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:84:50: ^( ELSIF expression ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSIF.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_expression.nextTree());
                            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:84:69: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:85:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
                    {
                    IF56=(Token)match(input,IF,FOLLOW_IF_in_ifStatement728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF56);

                    pushFollow(FOLLOW_expression_in_ifStatement730);
                    expression57=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression57.getTree());
                    THEN58=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN58);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement734);
                    statementSequence59=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence59.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:85:41: ( ELSE statementSequence )
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:85:42: ELSE statementSequence
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(ELSE60);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement739);
                    statementSequence61=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence61.getTree());

                    }

                    END62=(Token)match(input,END,FOLLOW_END_in_ifStatement742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(END62);



                    // AST REWRITE
                    // elements: statementSequence, ELSE, IF, statementSequence, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 86:5: -> ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:86:8: ^( IF expression ^( BODY statementSequence ) ^( ELSE ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:86:24: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:86:50: ^( ELSE ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_ELSE.nextNode(), root_2);

                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:86:57: ^( BODY statementSequence )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:87:4: IF expression THEN statementSequence END
                    {
                    IF63=(Token)match(input,IF,FOLLOW_IF_in_ifStatement777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IF.add(IF63);

                    pushFollow(FOLLOW_expression_in_ifStatement779);
                    expression64=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression64.getTree());
                    THEN65=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THEN.add(THEN65);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement783);
                    statementSequence66=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence66.getTree());
                    END67=(Token)match(input,END,FOLLOW_END_in_ifStatement785); if (state.failed) return retval; 
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
                    // 88:5: -> ^( IF expression ^( BODY statementSequence ) )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:88:8: ^( IF expression ^( BODY statementSequence ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:88:24: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:89:1: whileStatement : WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) ;
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:89:15: ( WHILE expression DO statementSequence END -> ^( WHILE expression ^( BODY statementSequence ) ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:89:18: WHILE expression DO statementSequence END
            {
            WHILE68=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement810); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(WHILE68);

            pushFollow(FOLLOW_expression_in_whileStatement812);
            expression69=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression69.getTree());
            DO70=(Token)match(input,DO,FOLLOW_DO_in_whileStatement814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO70);

            pushFollow(FOLLOW_statementSequence_in_whileStatement816);
            statementSequence71=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence71.getTree());
            END72=(Token)match(input,END,FOLLOW_END_in_whileStatement818); if (state.failed) return retval; 
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
            // 90:5: -> ^( WHILE expression ^( BODY statementSequence ) )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:90:8: ^( WHILE expression ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_WHILE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:90:27: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:91:1: assignment : selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) ;
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:91:11: ( selector ASSIGNMENT expression -> ^( ASSIGNMENT selector expression ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:91:14: selector ASSIGNMENT expression
            {
            pushFollow(FOLLOW_selector_in_assignment843);
            selector73=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector73.getTree());
            ASSIGNMENT74=(Token)match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment845); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGNMENT.add(ASSIGNMENT74);

            pushFollow(FOLLOW_expression_in_assignment847);
            expression75=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression75.getTree());


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
            // 92:5: -> ^( ASSIGNMENT selector expression )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:92:8: ^( ASSIGNMENT selector expression )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:93:1: procedureCall : selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector76 = null;

        Oberon0Parser.actualParameters_return actualParameters77 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:93:14: ( selector ( actualParameters )? -> ^( PROCEDURECALL selector ( actualParameters )? ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:93:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall868);
            selector76=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector76.getTree());
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:93:26: ( actualParameters )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==47) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:93:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall871);
                    actualParameters77=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters77.getTree());

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
            // 94:5: -> ^( PROCEDURECALL selector ( actualParameters )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:94:8: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_1);

                adaptor.addChild(root_1, stream_selector.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:94:33: ( actualParameters )?
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment78 = null;

        Oberon0Parser.procedureCall_return procedureCall79 = null;

        Oberon0Parser.ifStatement_return ifStatement80 = null;

        Oberon0Parser.whileStatement_return whileStatement81 = null;



        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:10: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt14=5;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement896);
                    assignment78=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment78.getTree());

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement900);
                    procedureCall79=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall79.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement903);
                    ifStatement80=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement80.getTree());

                    }
                    break;
                case 4 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement907);
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:96:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal83=null;
        Oberon0Parser.statement_return statement82 = null;

        Oberon0Parser.statement_return statement84 = null;


        CommonTree char_literal83_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:96:18: ( statement ( ';' statement )* -> statement ( statement )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:96:20: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence915);
            statement82=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement82.getTree());
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:96:30: ( ';' statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==50) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:96:31: ';' statement
            	    {
            	    char_literal83=(Token)match(input,50,FOLLOW_50_in_statementSequence918); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal83);

            	    pushFollow(FOLLOW_statement_in_statementSequence920);
            	    statement84=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement84.getTree());

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
            // 97:5: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:97:18: ( statement )*
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:98:1: identList : IDENT ( ',' IDENT )* -> IDENT ( IDENT )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT85=null;
        Token char_literal86=null;
        Token IDENT87=null;

        CommonTree IDENT85_tree=null;
        CommonTree char_literal86_tree=null;
        CommonTree IDENT87_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");

        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:98:10: ( IDENT ( ',' IDENT )* -> IDENT ( IDENT )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:98:13: IDENT ( ',' IDENT )*
            {
            IDENT85=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT85);

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:98:19: ( ',' IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:98:21: ',' IDENT
            	    {
            	    char_literal86=(Token)match(input,49,FOLLOW_49_in_identList946); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal86);

            	    IDENT87=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList948); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT87);


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
            // 99:5: -> IDENT ( IDENT )*
            {
                adaptor.addChild(root_0, stream_IDENT.nextNode());
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:99:14: ( IDENT )*
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:100:1: arrayType : ARRAY expression OF type -> ^( ARRAY type expression ) ;
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:100:10: ( ARRAY expression OF type -> ^( ARRAY type expression ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:100:13: ARRAY expression OF type
            {
            ARRAY88=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType970); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(ARRAY88);

            pushFollow(FOLLOW_expression_in_arrayType972);
            expression89=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression89.getTree());
            OF90=(Token)match(input,OF,FOLLOW_OF_in_arrayType974); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(OF90);

            pushFollow(FOLLOW_type_in_arrayType976);
            type91=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type91.getTree());


            // AST REWRITE
            // elements: ARRAY, expression, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 101:5: -> ^( ARRAY type expression )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:101:8: ^( ARRAY type expression )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:102:1: fieldList : ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal93=null;
        Oberon0Parser.identList_return identList92 = null;

        Oberon0Parser.type_return type94 = null;


        CommonTree char_literal93_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:102:10: ( ( identList ':' type )? -> ^( VAR ( type )? ( identList )? ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:102:13: ( identList ':' type )?
            {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:102:13: ( identList ':' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:102:14: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList998);
                    identList92=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList92.getTree());
                    char_literal93=(Token)match(input,51,FOLLOW_51_in_fieldList1000); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal93);

                    pushFollow(FOLLOW_type_in_fieldList1002);
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
            // 103:5: -> ^( VAR ( type )? ( identList )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:103:8: ^( VAR ( type )? ( identList )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR, "VAR"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:103:14: ( type )?
                if ( stream_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:103:20: ( identList )?
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:104:1: recordType : RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) ;
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
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:104:11: ( RECORD fieldList ( ';' fieldList )* END -> ^( RECORD ( fieldList )* ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:104:14: RECORD fieldList ( ';' fieldList )* END
            {
            RECORD95=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType1028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(RECORD95);

            pushFollow(FOLLOW_fieldList_in_recordType1030);
            fieldList96=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList96.getTree());
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:104:31: ( ';' fieldList )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:104:32: ';' fieldList
            	    {
            	    char_literal97=(Token)match(input,50,FOLLOW_50_in_recordType1033); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal97);

            	    pushFollow(FOLLOW_fieldList_in_recordType1035);
            	    fieldList98=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList98.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            END99=(Token)match(input,END,FOLLOW_END_in_recordType1039); if (state.failed) return retval; 
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
            // 105:5: -> ^( RECORD ( fieldList )* )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:105:8: ^( RECORD ( fieldList )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_RECORD.nextNode(), root_1);

                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:105:17: ( fieldList )*
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:106:1: type : ( IDENT | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT100=null;
        Oberon0Parser.arrayType_return arrayType101 = null;

        Oberon0Parser.recordType_return recordType102 = null;


        CommonTree IDENT100_tree=null;

        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:106:5: ( IDENT | arrayType | recordType )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:106:9: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENT100=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1060); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT100_tree = (CommonTree)adaptor.create(IDENT100);
                    adaptor.addChild(root_0, IDENT100_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:106:17: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1064);
                    arrayType101=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType101.getTree());

                    }
                    break;
                case 3 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:106:29: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1068);
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:107:1: fPSection : ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) );
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
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:107:10: ( VAR identList ':' type -> ^( REFVAR type identList ) | identList ':' type -> ^( VAR type identList ) )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:107:13: VAR identList ':' type
                    {
                    VAR103=(Token)match(input,VAR,FOLLOW_VAR_in_fPSection1075); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(VAR103);

                    pushFollow(FOLLOW_identList_in_fPSection1077);
                    identList104=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList104.getTree());
                    char_literal105=(Token)match(input,51,FOLLOW_51_in_fPSection1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal105);

                    pushFollow(FOLLOW_type_in_fPSection1081);
                    type106=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type106.getTree());


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
                    // 108:5: -> ^( REFVAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:108:8: ^( REFVAR type identList )
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
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:109:4: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection1102);
                    identList107=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList107.getTree());
                    char_literal108=(Token)match(input,51,FOLLOW_51_in_fPSection1104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_51.add(char_literal108);

                    pushFollow(FOLLOW_type_in_fPSection1106);
                    type109=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type109.getTree());


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
                    // 110:5: -> ^( VAR type identList )
                    {
                        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:110:8: ^( VAR type identList )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:111:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) ;
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
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_fPSection=new RewriteRuleSubtreeStream(adaptor,"rule fPSection");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:111:17: ( '(' ( fPSection ( ';' fPSection )* )? ')' -> ^( PARAMETERS ( fPSection ( fPSection )* )? ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:111:19: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            char_literal110=(Token)match(input,47,FOLLOW_47_in_formalParameters1126); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(char_literal110);

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:111:23: ( fPSection ( ';' fPSection )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VAR||LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:111:24: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1129);
                    fPSection111=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fPSection.add(fPSection111.getTree());
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:111:34: ( ';' fPSection )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==50) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:111:35: ';' fPSection
                    	    {
                    	    char_literal112=(Token)match(input,50,FOLLOW_50_in_formalParameters1132); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_50.add(char_literal112);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1134);
                    	    fPSection113=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fPSection.add(fPSection113.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal114=(Token)match(input,48,FOLLOW_48_in_formalParameters1140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(char_literal114);



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
            // 112:5: -> ^( PARAMETERS ( fPSection ( fPSection )* )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:112:8: ^( PARAMETERS ( fPSection ( fPSection )* )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:112:21: ( fPSection ( fPSection )* )?
                if ( stream_fPSection.hasNext()||stream_fPSection.hasNext() ) {
                    adaptor.addChild(root_1, stream_fPSection.nextTree());
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:112:32: ( fPSection )*
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:113:1: procedureBody : BEGIN statementSequence -> ^( BODY statementSequence ) ;
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:113:14: ( BEGIN statementSequence -> ^( BODY statementSequence ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:113:17: BEGIN statementSequence
            {
            BEGIN115=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody1167); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN115);

            pushFollow(FOLLOW_statementSequence_in_procedureBody1169);
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
            // 114:5: -> ^( BODY statementSequence )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:114:8: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:115:1: procedureDeclaration : PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PROCEDURE117=null;
        Token IDENT118=null;
        Token char_literal120=null;
        Token END123=null;
        Token IDENT124=null;
        Oberon0Parser.formalParameters_return formalParameters119 = null;

        Oberon0Parser.declarations_return declarations121 = null;

        Oberon0Parser.procedureBody_return procedureBody122 = null;


        CommonTree PROCEDURE117_tree=null;
        CommonTree IDENT118_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree END123_tree=null;
        CommonTree IDENT124_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:115:21: ( PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:115:23: PROCEDURE IDENT ( formalParameters )? ';' declarations ( procedureBody )? END IDENT
            {
            PROCEDURE117=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration1187); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(PROCEDURE117);

            IDENT118=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT118);

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:115:39: ( formalParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:115:41: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1193);
                    formalParameters119=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters119.getTree());

                    }
                    break;

            }

            char_literal120=(Token)match(input,50,FOLLOW_50_in_procedureDeclaration1197); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal120);

            pushFollow(FOLLOW_declarations_in_procedureDeclaration1199);
            declarations121=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations121.getTree());
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:115:77: ( procedureBody )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BEGIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:115:78: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1202);
                    procedureBody122=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody122.getTree());

                    }
                    break;

            }

            END123=(Token)match(input,END,FOLLOW_END_in_procedureDeclaration1206); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(END123);

            IDENT124=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1208); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT124);



            // AST REWRITE
            // elements: IDENT, procedureBody, PROCEDURE, declarations, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:5: -> ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:116:8: ^( PROCEDURE IDENT ( formalParameters )? ( declarations )? ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:116:26: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:116:46: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_1, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:116:60: ( procedureBody )?
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:117:1: constDeclaration : ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST125=null;
        Token IDENT126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        Oberon0Parser.expression_return expression128 = null;


        CommonTree CONST125_tree=null;
        CommonTree IDENT126_tree=null;
        CommonTree char_literal127_tree=null;
        CommonTree char_literal129_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_CONST=new RewriteRuleTokenStream(adaptor,"token CONST");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:117:17: ( ( CONST ( IDENT '=' expression ';' )* ) -> ( ^( CONST IDENT expression ) )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:117:19: ( CONST ( IDENT '=' expression ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:117:19: ( CONST ( IDENT '=' expression ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:117:20: CONST ( IDENT '=' expression ';' )*
            {
            CONST125=(Token)match(input,CONST,FOLLOW_CONST_in_constDeclaration1241); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CONST.add(CONST125);

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:117:26: ( IDENT '=' expression ';' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==IDENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:117:27: IDENT '=' expression ';'
            	    {
            	    IDENT126=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclaration1244); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT126);

            	    char_literal127=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_constDeclaration1246); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal127);

            	    pushFollow(FOLLOW_expression_in_constDeclaration1248);
            	    expression128=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression128.getTree());
            	    char_literal129=(Token)match(input,50,FOLLOW_50_in_constDeclaration1250); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal129);


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: expression, IDENT, CONST
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 118:5: -> ( ^( CONST IDENT expression ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:118:8: ( ^( CONST IDENT expression ) )*
                while ( stream_expression.hasNext()||stream_IDENT.hasNext()||stream_CONST.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:118:8: ^( CONST IDENT expression )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_CONST.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_expression.reset();
                stream_IDENT.reset();
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:119:1: typeDeclaration : ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TYPE130=null;
        Token IDENT131=null;
        Token char_literal132=null;
        Token char_literal134=null;
        Oberon0Parser.type_return type133 = null;


        CommonTree TYPE130_tree=null;
        CommonTree IDENT131_tree=null;
        CommonTree char_literal132_tree=null;
        CommonTree char_literal134_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:119:16: ( ( TYPE ( IDENT '=' type ';' )* ) -> ( ^( TYPE IDENT type ) )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:119:18: ( TYPE ( IDENT '=' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:119:18: ( TYPE ( IDENT '=' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:119:19: TYPE ( IDENT '=' type ';' )*
            {
            TYPE130=(Token)match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration1275); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TYPE.add(TYPE130);

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:119:24: ( IDENT '=' type ';' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==IDENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:119:25: IDENT '=' type ';'
            	    {
            	    IDENT131=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration1278); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_IDENT.add(IDENT131);

            	    char_literal132=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclaration1280); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_EQUALS.add(char_literal132);

            	    pushFollow(FOLLOW_type_in_typeDeclaration1282);
            	    type133=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type133.getTree());
            	    char_literal134=(Token)match(input,50,FOLLOW_50_in_typeDeclaration1284); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal134);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: TYPE, IDENT, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 120:5: -> ( ^( TYPE IDENT type ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:120:8: ( ^( TYPE IDENT type ) )*
                while ( stream_TYPE.hasNext()||stream_IDENT.hasNext()||stream_type.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:120:8: ^( TYPE IDENT type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_TYPE.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_IDENT.nextNode());
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_TYPE.reset();
                stream_IDENT.reset();
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
    // $ANTLR end "typeDeclaration"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:121:1: varDeclarations : ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* ;
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
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:121:16: ( ( VAR ( identList ':' type ';' )* ) -> ( ^( VAR type identList ) )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:121:18: ( VAR ( identList ':' type ';' )* )
            {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:121:18: ( VAR ( identList ':' type ';' )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:121:19: VAR ( identList ':' type ';' )*
            {
            VAR135=(Token)match(input,VAR,FOLLOW_VAR_in_varDeclarations1309); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VAR.add(VAR135);

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:121:23: ( identList ':' type ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:121:24: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1312);
            	    identList136=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList136.getTree());
            	    char_literal137=(Token)match(input,51,FOLLOW_51_in_varDeclarations1314); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_51.add(char_literal137);

            	    pushFollow(FOLLOW_type_in_varDeclarations1316);
            	    type138=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type138.getTree());
            	    char_literal139=(Token)match(input,50,FOLLOW_50_in_varDeclarations1318); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal139);


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
            // 122:5: -> ( ^( VAR type identList ) )*
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:122:8: ( ^( VAR type identList ) )*
                while ( stream_type.hasNext()||stream_VAR.hasNext()||stream_identList.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:122:8: ^( VAR type identList )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
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
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ';' )*
            {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:16: ( constDeclaration )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CONST) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1343);
                    constDeclaration140=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration140.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:34: ( typeDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==TYPE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1346);
                    typeDeclaration141=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration141.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:51: ( varDeclarations )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VAR) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1349);
                    varDeclarations142=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations142.getTree());

                    }
                    break;

            }

            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:68: ( procedureDeclaration ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==PROCEDURE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:123:69: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1353);
            	    procedureDeclaration143=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration143.getTree());
            	    char_literal144=(Token)match(input,50,FOLLOW_50_in_declarations1355); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_50.add(char_literal144);


            	    }
            	    break;

            	default :
            	    break loop31;
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
            // 124:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:124:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:124:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:124:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:124:60: ( procedureDeclaration )*
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:125:1: moduleBody : declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? ;
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
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:125:11: ( declarations ( BEGIN statementSequence )? END -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:125:14: declarations ( BEGIN statementSequence )? END
            {
            pushFollow(FOLLOW_declarations_in_moduleBody1384);
            declarations145=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations145.getTree());
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:125:27: ( BEGIN statementSequence )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==BEGIN) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:125:28: BEGIN statementSequence
                    {
                    BEGIN146=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_moduleBody1387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN146);

                    pushFollow(FOLLOW_statementSequence_in_moduleBody1389);
                    statementSequence147=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence147.getTree());

                    }
                    break;

            }

            END148=(Token)match(input,END,FOLLOW_END_in_moduleBody1393); if (state.failed) return retval; 
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
            // 126:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:126:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:126:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:126:22: ^( BODY statementSequence )
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
    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:127:1: module : MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MODULE149=null;
        Token IDENT150=null;
        Token char_literal151=null;
        Token IDENT153=null;
        Token char_literal154=null;
        Token EOF155=null;
        Oberon0Parser.moduleBody_return moduleBody152 = null;


        CommonTree MODULE149_tree=null;
        CommonTree IDENT150_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree IDENT153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree EOF155_tree=null;
        RewriteRuleTokenStream stream_DOTSELECTOR=new RewriteRuleTokenStream(adaptor,"token DOTSELECTOR");
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:127:7: ( MODULE IDENT ';' moduleBody IDENT '.' EOF -> ^( MODULE IDENT moduleBody ) )
            // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:127:11: MODULE IDENT ';' moduleBody IDENT '.' EOF
            {
            MODULE149=(Token)match(input,MODULE,FOLLOW_MODULE_in_module1417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(MODULE149);

            IDENT150=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT150);

            char_literal151=(Token)match(input,50,FOLLOW_50_in_module1421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal151);

            pushFollow(FOLLOW_moduleBody_in_module1423);
            moduleBody152=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody152.getTree());
            IDENT153=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENT.add(IDENT153);

            char_literal154=(Token)match(input,DOTSELECTOR,FOLLOW_DOTSELECTOR_in_module1427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOTSELECTOR.add(char_literal154);

            EOF155=(Token)match(input,EOF,FOLLOW_EOF_in_module1429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF155);



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
            // 128:5: -> ^( MODULE IDENT moduleBody )
            {
                // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:128:8: ^( MODULE IDENT moduleBody )
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
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:75:14: ( simpleExpression infixOperand simpleExpression )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:75:14: simpleExpression infixOperand simpleExpression
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred23_Oberon0521);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred23_Oberon0523);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred23_Oberon0525);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Oberon0

    // $ANTLR start synpred27_Oberon0
    public final void synpred27_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:15: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:15: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred27_Oberon0598); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred27_Oberon0600);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0602); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0604);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:52: ( ELSIF expression THEN statementSequence )+
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
        	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:53: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred27_Oberon0607); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred27_Oberon0609);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred27_Oberon0611); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0613);
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

        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:95: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:81:96: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred27_Oberon0618); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred27_Oberon0620);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred27_Oberon0623); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Oberon0

    // $ANTLR start synpred29_Oberon0
    public final void synpred29_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:83:4: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:83:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )+ END
        {
        match(input,IF,FOLLOW_IF_in_synpred29_Oberon0671); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred29_Oberon0673);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0675); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0677);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:83:41: ( ELSIF expression THEN statementSequence )+
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
        	    // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:83:42: ELSIF expression THEN statementSequence
        	    {
        	    match(input,ELSIF,FOLLOW_ELSIF_in_synpred29_Oberon0680); if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred29_Oberon0682);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,THEN,FOLLOW_THEN_in_synpred29_Oberon0684); if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0686);
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

        match(input,END,FOLLOW_END_in_synpred29_Oberon0690); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Oberon0

    // $ANTLR start synpred30_Oberon0
    public final void synpred30_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:85:4: ( IF expression THEN statementSequence ( ELSE statementSequence ) END )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:85:4: IF expression THEN statementSequence ( ELSE statementSequence ) END
        {
        match(input,IF,FOLLOW_IF_in_synpred30_Oberon0728); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred30_Oberon0730);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,THEN,FOLLOW_THEN_in_synpred30_Oberon0732); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred30_Oberon0734);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:85:41: ( ELSE statementSequence )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:85:42: ELSE statementSequence
        {
        match(input,ELSE,FOLLOW_ELSE_in_synpred30_Oberon0737); if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred30_Oberon0739);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,END,FOLLOW_END_in_synpred30_Oberon0742); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Oberon0

    // $ANTLR start synpred32_Oberon0
    public final void synpred32_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:14: ( assignment )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred32_Oberon0896);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Oberon0

    // $ANTLR start synpred33_Oberon0
    public final void synpred33_Oberon0_fragment() throws RecognitionException {   
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:27: ( procedureCall )
        // D:\\SSD\\rascal_workspace\\6350062_assignment_1\\grammar\\Oberon0.g:95:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred33_Oberon0900);
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
        "\1\57\7\0\2\uffff";
    static final String DFA7_acceptS =
        "\10\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\4\1\2\1\1\34\uffff\1\7\7\uffff\1\3\1\5\1\uffff\1\6",
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
            return "75:1: expression : ( simpleExpression infixOperand simpleExpression -> ^( infixOperand simpleExpression simpleExpression ) | simpleExpression -> simpleExpression );";
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
        "\13\uffff";
    static final String DFA14_eofS =
        "\1\4\12\uffff";
    static final String DFA14_minS =
        "\1\15\1\0\11\uffff";
    static final String DFA14_maxS =
        "\1\62\1\0\11\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA14_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\uffff\3\4\2\uffff\1\3\27\uffff\1\1\5\uffff\1\4",
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
            return "95:13: ( assignment | procedureCall | ifStatement | whileStatement )?";
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
                        if ( (synpred32_Oberon0()) ) {s = 9;}

                        else if ( (synpred33_Oberon0()) ) {s = 10;}

                         
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
 

    public static final BitSet FOLLOW_IDENT_in_selector360 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_selector364 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector367 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ARRAYSELECTOR_in_selector371 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_selector374 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_selector376 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_IDENT_in_selector384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_numberLiteral391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_factor412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numberLiteral_in_factor416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_factor420 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_factor423 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_factor425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor430 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_factor_in_factor433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term441 = new BitSet(new long[]{0x000000000C000302L});
    public static final BitSet FOLLOW_set_in_term444 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_factor_in_term455 = new BitSet(new long[]{0x000000000C000302L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression464 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression467 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression472 = new BitSet(new long[]{0x00000000100000C2L});
    public static final BitSet FOLLOW_set_in_simpleExpression475 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_term_in_simpleExpression485 = new BitSet(new long[]{0x00000000100000C2L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression521 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression523 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_actualParameters561 = new BitSet(new long[]{0x0001B010000000F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters564 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_actualParameters567 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_actualParameters569 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_actualParameters575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement598 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement600 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement602 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement604 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement607 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement611 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement613 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement618 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement620 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement671 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement673 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement675 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement677 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement680 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement682 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement684 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement686 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_END_in_ifStatement690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement728 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement732 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement734 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement737 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement777 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_ifStatement779 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement781 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_ifStatement785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement810 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_whileStatement812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_DO_in_whileStatement814 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement816 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_whileStatement818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment843 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment845 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_assignment847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall868 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence915 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_statementSequence918 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statement_in_statementSequence920 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList942 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_identList946 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList948 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType970 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_arrayType972 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_arrayType974 = new BitSet(new long[]{0x0000100002800000L});
    public static final BitSet FOLLOW_type_in_arrayType976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList998 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_fieldList1000 = new BitSet(new long[]{0x0000100002800000L});
    public static final BitSet FOLLOW_type_in_fieldList1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1028 = new BitSet(new long[]{0x0004100000020000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1030 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_50_in_recordType1033 = new BitSet(new long[]{0x0004100000020000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1035 = new BitSet(new long[]{0x0004000000020000L});
    public static final BitSet FOLLOW_END_in_recordType1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fPSection1075 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_identList_in_fPSection1077 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_fPSection1079 = new BitSet(new long[]{0x0000100002800000L});
    public static final BitSet FOLLOW_type_in_fPSection1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection1102 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_fPSection1104 = new BitSet(new long[]{0x0000100002800000L});
    public static final BitSet FOLLOW_type_in_fPSection1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_formalParameters1126 = new BitSet(new long[]{0x0001100000000800L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1129 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_formalParameters1132 = new BitSet(new long[]{0x0000100000000800L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1134 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_48_in_formalParameters1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody1167 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration1187 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1189 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1193 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_procedureDeclaration1197 = new BitSet(new long[]{0x0000000000621C00L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1199 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1202 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration1206 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration1241 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclaration1244 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclaration1246 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1248 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_constDeclaration1250 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration1275 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration1278 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclaration1280 = new BitSet(new long[]{0x0000100002800000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1282 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_typeDeclaration1284 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations1309 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1312 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_varDeclarations1314 = new BitSet(new long[]{0x0000100002800000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1316 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_varDeclarations1318 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1343 = new BitSet(new long[]{0x0000000000401802L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1346 = new BitSet(new long[]{0x0000000000400802L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1349 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1353 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_declarations1355 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1384 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_BEGIN_in_moduleBody1387 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1389 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_moduleBody1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_module1417 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1419 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_module1421 = new BitSet(new long[]{0x0000000000621C00L});
    public static final BitSet FOLLOW_moduleBody_in_module1423 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_module1425 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_DOTSELECTOR_in_module1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred23_Oberon0521 = new BitSet(new long[]{0x0000000FC0000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred23_Oberon0523 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred23_Oberon0525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred27_Oberon0598 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0600 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0602 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0604 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred27_Oberon0607 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred27_Oberon0609 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred27_Oberon0611 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0613 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ELSE_in_synpred27_Oberon0618 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred27_Oberon0620 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_synpred27_Oberon0623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred29_Oberon0671 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0673 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0675 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0677 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ELSIF_in_synpred29_Oberon0680 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0682 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred29_Oberon0684 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0686 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_END_in_synpred29_Oberon0690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred30_Oberon0728 = new BitSet(new long[]{0x0000B010000000F0L});
    public static final BitSet FOLLOW_expression_in_synpred30_Oberon0730 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred30_Oberon0732 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred30_Oberon0734 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ELSE_in_synpred30_Oberon0737 = new BitSet(new long[]{0x0004100000102000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred30_Oberon0739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_END_in_synpred30_Oberon0742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred32_Oberon0896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred33_Oberon0900 = new BitSet(new long[]{0x0000000000000002L});

}