// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g 2011-01-10 11:15:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "IDENT", "SEMICOLON", "BEGIN", "END", "DOT", "SQROPEN", "SQRCLOSE", "INTEGER", "RNDOPEN", "RNDCLOSE", "TILDE", "STAR", "DIV", "MOD", "AMPERSAND", "PLUS", "MINUS", "OR", "EQUALS", "HASH", "SMALLERTHEN", "SMALLEREQUAL", "GREATERTHEN", "GREATEREQUAL", "ASSIGN", "COMMA", "IF", "THEN", "ELSIF", "ELSE", "WHILE", "DO", "ARRAY", "OF", "COLON", "RECORD", "VAR", "PROCEDURE", "CONST", "TYPE", "WS", "OPTWS"
    };
    public static final int EOF=-1;
    public static final int MODULE=4;
    public static final int IDENT=5;
    public static final int SEMICOLON=6;
    public static final int BEGIN=7;
    public static final int END=8;
    public static final int DOT=9;
    public static final int SQROPEN=10;
    public static final int SQRCLOSE=11;
    public static final int INTEGER=12;
    public static final int RNDOPEN=13;
    public static final int RNDCLOSE=14;
    public static final int TILDE=15;
    public static final int STAR=16;
    public static final int DIV=17;
    public static final int MOD=18;
    public static final int AMPERSAND=19;
    public static final int PLUS=20;
    public static final int MINUS=21;
    public static final int OR=22;
    public static final int EQUALS=23;
    public static final int HASH=24;
    public static final int SMALLERTHEN=25;
    public static final int SMALLEREQUAL=26;
    public static final int GREATERTHEN=27;
    public static final int GREATEREQUAL=28;
    public static final int ASSIGN=29;
    public static final int COMMA=30;
    public static final int IF=31;
    public static final int THEN=32;
    public static final int ELSIF=33;
    public static final int ELSE=34;
    public static final int WHILE=35;
    public static final int DO=36;
    public static final int ARRAY=37;
    public static final int OF=38;
    public static final int COLON=39;
    public static final int RECORD=40;
    public static final int VAR=41;
    public static final int PROCEDURE=42;
    public static final int CONST=43;
    public static final int TYPE=44;
    public static final int WS=45;
    public static final int OPTWS=46;

    // delegates
    // delegators


        public oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:4:1: module : MODULE IDENT SEMICOLON declarations ( BEGIN statementSequence )? END IDENT DOT ;
    public final oberon0Parser.module_return module() throws RecognitionException {
        oberon0Parser.module_return retval = new oberon0Parser.module_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MODULE1=null;
        Token IDENT2=null;
        Token SEMICOLON3=null;
        Token BEGIN5=null;
        Token END7=null;
        Token IDENT8=null;
        Token DOT9=null;
        oberon0Parser.declarations_return declarations4 = null;

        oberon0Parser.statementSequence_return statementSequence6 = null;


        Object MODULE1_tree=null;
        Object IDENT2_tree=null;
        Object SEMICOLON3_tree=null;
        Object BEGIN5_tree=null;
        Object END7_tree=null;
        Object IDENT8_tree=null;
        Object DOT9_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:4:8: ( MODULE IDENT SEMICOLON declarations ( BEGIN statementSequence )? END IDENT DOT )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:4:10: MODULE IDENT SEMICOLON declarations ( BEGIN statementSequence )? END IDENT DOT
            {
            root_0 = (Object)adaptor.nil();

            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module19); 
            MODULE1_tree = (Object)adaptor.create(MODULE1);
            adaptor.addChild(root_0, MODULE1_tree);

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module21); 
            IDENT2_tree = (Object)adaptor.create(IDENT2);
            adaptor.addChild(root_0, IDENT2_tree);

            SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_module23); 
            pushFollow(FOLLOW_declarations_in_module26);
            declarations4=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations4.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:5:3: ( BEGIN statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==BEGIN) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:5:4: BEGIN statementSequence
                    {
                    BEGIN5=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_module32); 
                    BEGIN5_tree = (Object)adaptor.create(BEGIN5);
                    adaptor.addChild(root_0, BEGIN5_tree);

                    pushFollow(FOLLOW_statementSequence_in_module34);
                    statementSequence6=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence6.getTree());

                    }
                    break;

            }

            END7=(Token)match(input,END,FOLLOW_END_in_module38); 
            END7_tree = (Object)adaptor.create(END7);
            adaptor.addChild(root_0, END7_tree);

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_module40); 
            IDENT8_tree = (Object)adaptor.create(IDENT8);
            adaptor.addChild(root_0, IDENT8_tree);

            DOT9=(Token)match(input,DOT,FOLLOW_DOT_in_module42); 
            DOT9_tree = (Object)adaptor.create(DOT9);
            adaptor.addChild(root_0, DOT9_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "module"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:1: selector : ( DOT IDENT | SQROPEN expression SQRCLOSE )* ;
    public final oberon0Parser.selector_return selector() throws RecognitionException {
        oberon0Parser.selector_return retval = new oberon0Parser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT10=null;
        Token IDENT11=null;
        Token SQROPEN12=null;
        Token SQRCLOSE14=null;
        oberon0Parser.expression_return expression13 = null;


        Object DOT10_tree=null;
        Object IDENT11_tree=null;
        Object SQROPEN12_tree=null;
        Object SQRCLOSE14_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:9: ( ( DOT IDENT | SQROPEN expression SQRCLOSE )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:12: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:12: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DOT) ) {
                    alt2=1;
                }
                else if ( (LA2_0==SQROPEN) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:13: DOT IDENT
            	    {
            	    DOT10=(Token)match(input,DOT,FOLLOW_DOT_in_selector51); 
            	    DOT10_tree = (Object)adaptor.create(DOT10);
            	    adaptor.addChild(root_0, DOT10_tree);

            	    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector53); 
            	    IDENT11_tree = (Object)adaptor.create(IDENT11);
            	    adaptor.addChild(root_0, IDENT11_tree);


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:25: SQROPEN expression SQRCLOSE
            	    {
            	    SQROPEN12=(Token)match(input,SQROPEN,FOLLOW_SQROPEN_in_selector57); 
            	    SQROPEN12_tree = (Object)adaptor.create(SQROPEN12);
            	    root_0 = (Object)adaptor.becomeRoot(SQROPEN12_tree, root_0);

            	    pushFollow(FOLLOW_expression_in_selector60);
            	    expression13=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression13.getTree());
            	    SQRCLOSE14=(Token)match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_selector62); 
            	    SQRCLOSE14_tree = (Object)adaptor.create(SQRCLOSE14);
            	    adaptor.addChild(root_0, SQRCLOSE14_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:9:1: number : INTEGER ;
    public final oberon0Parser.number_return number() throws RecognitionException {
        oberon0Parser.number_return retval = new oberon0Parser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER15=null;

        Object INTEGER15_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:9:8: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:9:10: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            INTEGER15=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number72); 
            INTEGER15_tree = (Object)adaptor.create(INTEGER15);
            adaptor.addChild(root_0, INTEGER15_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:1: factor : ( IDENT selector | number | RNDOPEN expression RNDCLOSE | TILDE factor ) ;
    public final oberon0Parser.factor_return factor() throws RecognitionException {
        oberon0Parser.factor_return retval = new oberon0Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT16=null;
        Token RNDOPEN19=null;
        Token RNDCLOSE21=null;
        Token TILDE22=null;
        oberon0Parser.selector_return selector17 = null;

        oberon0Parser.number_return number18 = null;

        oberon0Parser.expression_return expression20 = null;

        oberon0Parser.factor_return factor23 = null;


        Object IDENT16_tree=null;
        Object RNDOPEN19_tree=null;
        Object RNDCLOSE21_tree=null;
        Object TILDE22_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:9: ( ( IDENT selector | number | RNDOPEN expression RNDCLOSE | TILDE factor ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:11: ( IDENT selector | number | RNDOPEN expression RNDCLOSE | TILDE factor )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:11: ( IDENT selector | number | RNDOPEN expression RNDCLOSE | TILDE factor )
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
            case RNDOPEN:
                {
                alt3=3;
                }
                break;
            case TILDE:
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
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:12: IDENT selector
                    {
                    IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor82); 
                    IDENT16_tree = (Object)adaptor.create(IDENT16);
                    adaptor.addChild(root_0, IDENT16_tree);

                    pushFollow(FOLLOW_selector_in_factor84);
                    selector17=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector17.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:29: number
                    {
                    pushFollow(FOLLOW_number_in_factor88);
                    number18=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number18.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:38: RNDOPEN expression RNDCLOSE
                    {
                    RNDOPEN19=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_factor92); 
                    RNDOPEN19_tree = (Object)adaptor.create(RNDOPEN19);
                    root_0 = (Object)adaptor.becomeRoot(RNDOPEN19_tree, root_0);

                    pushFollow(FOLLOW_expression_in_factor95);
                    expression20=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression20.getTree());
                    RNDCLOSE21=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_factor97); 
                    RNDCLOSE21_tree = (Object)adaptor.create(RNDCLOSE21);
                    adaptor.addChild(root_0, RNDCLOSE21_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:69: TILDE factor
                    {
                    TILDE22=(Token)match(input,TILDE,FOLLOW_TILDE_in_factor101); 
                    TILDE22_tree = (Object)adaptor.create(TILDE22);
                    adaptor.addChild(root_0, TILDE22_tree);

                    pushFollow(FOLLOW_factor_in_factor103);
                    factor23=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor23.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:13:1: term : factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )* ;
    public final oberon0Parser.term_return term() throws RecognitionException {
        oberon0Parser.term_return retval = new oberon0Parser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set25=null;
        oberon0Parser.factor_return factor24 = null;

        oberon0Parser.factor_return factor26 = null;


        Object set25_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:13:7: ( factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:13:9: factor ( ( STAR | DIV | MOD | AMPERSAND ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term113);
            factor24=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor24.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:13:16: ( ( STAR | DIV | MOD | AMPERSAND ) factor )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=STAR && LA4_0<=AMPERSAND)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:13:17: ( STAR | DIV | MOD | AMPERSAND ) factor
            	    {
            	    set25=(Token)input.LT(1);
            	    set25=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=AMPERSAND) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set25), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term133);
            	    factor26=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor26.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:15:1: simpleExpression : ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* ;
    public final oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        oberon0Parser.simpleExpression_return retval = new oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set27=null;
        Token set29=null;
        oberon0Parser.term_return term28 = null;

        oberon0Parser.term_return term30 = null;


        Object set27_tree=null;
        Object set29_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:16:2: ( ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:16:4: ( PLUS | MINUS )? term ( ( PLUS | MINUS | OR ) term )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:16:4: ( PLUS | MINUS )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=PLUS && LA5_0<=MINUS)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:
                    {
                    set27=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set27));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression154);
            term28=term();

            state._fsp--;

            adaptor.addChild(root_0, term28.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:16:25: ( ( PLUS | MINUS | OR ) term )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=PLUS && LA6_0<=OR)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:16:26: ( PLUS | MINUS | OR ) term
            	    {
            	    set29=(Token)input.LT(1);
            	    set29=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=OR) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set29), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression166);
            	    term30=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term30.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:18:1: expression : simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? ;
    public final oberon0Parser.expression_return expression() throws RecognitionException {
        oberon0Parser.expression_return retval = new oberon0Parser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set32=null;
        oberon0Parser.simpleExpression_return simpleExpression31 = null;

        oberon0Parser.simpleExpression_return simpleExpression33 = null;


        Object set32_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:19:2: ( simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:19:4: simpleExpression ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression178);
            simpleExpression31=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, simpleExpression31.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:19:21: ( ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=EQUALS && LA7_0<=GREATEREQUAL)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:19:22: ( EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL ) simpleExpression
                    {
                    set32=(Token)input.LT(1);
                    set32=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=GREATEREQUAL) ) {
                        input.consume();
                        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set32), root_0);
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression196);
                    simpleExpression33=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleExpression33.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:21:1: assignment : ASSIGN expression ;
    public final oberon0Parser.assignment_return assignment() throws RecognitionException {
        oberon0Parser.assignment_return retval = new oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ASSIGN34=null;
        oberon0Parser.expression_return expression35 = null;


        Object ASSIGN34_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:22:2: ( ASSIGN expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:22:4: ASSIGN expression
            {
            root_0 = (Object)adaptor.nil();

            ASSIGN34=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment207); 
            ASSIGN34_tree = (Object)adaptor.create(ASSIGN34);
            adaptor.addChild(root_0, ASSIGN34_tree);

            pushFollow(FOLLOW_expression_in_assignment209);
            expression35=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression35.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class actualParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:24:1: actualParameters : RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE ;
    public final oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        oberon0Parser.actualParameters_return retval = new oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RNDOPEN36=null;
        Token COMMA38=null;
        Token RNDCLOSE40=null;
        oberon0Parser.expression_return expression37 = null;

        oberon0Parser.expression_return expression39 = null;


        Object RNDOPEN36_tree=null;
        Object COMMA38_tree=null;
        Object RNDCLOSE40_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:2: ( RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:4: RNDOPEN ( expression ( COMMA expression )* )? RNDCLOSE
            {
            root_0 = (Object)adaptor.nil();

            RNDOPEN36=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_actualParameters219); 
            RNDOPEN36_tree = (Object)adaptor.create(RNDOPEN36);
            root_0 = (Object)adaptor.becomeRoot(RNDOPEN36_tree, root_0);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:13: ( expression ( COMMA expression )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IDENT||(LA9_0>=INTEGER && LA9_0<=RNDOPEN)||LA9_0==TILDE||(LA9_0>=PLUS && LA9_0<=MINUS)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:14: expression ( COMMA expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters223);
                    expression37=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression37.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:25: ( COMMA expression )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:26: COMMA expression
                    	    {
                    	    COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_actualParameters226); 
                    	    COMMA38_tree = (Object)adaptor.create(COMMA38);
                    	    adaptor.addChild(root_0, COMMA38_tree);

                    	    pushFollow(FOLLOW_expression_in_actualParameters228);
                    	    expression39=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression39.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            RNDCLOSE40=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_actualParameters234); 
            RNDCLOSE40_tree = (Object)adaptor.create(RNDCLOSE40);
            adaptor.addChild(root_0, RNDCLOSE40_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class procedureCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:27:1: procedureCall : ( actualParameters )? ;
    public final oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        oberon0Parser.procedureCall_return retval = new oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        oberon0Parser.actualParameters_return actualParameters41 = null;



        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:28:2: ( ( actualParameters )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:28:4: ( actualParameters )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:28:4: ( actualParameters )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RNDOPEN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:28:5: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall244);
                    actualParameters41=actualParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualParameters41.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:30:1: ifStatement : IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )* ( ELSE statementSequence )? END ;
    public final oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        oberon0Parser.ifStatement_return retval = new oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF42=null;
        Token THEN44=null;
        Token ELSIF46=null;
        Token THEN48=null;
        Token ELSE50=null;
        Token END52=null;
        oberon0Parser.expression_return expression43 = null;

        oberon0Parser.statementSequence_return statementSequence45 = null;

        oberon0Parser.expression_return expression47 = null;

        oberon0Parser.statementSequence_return statementSequence49 = null;

        oberon0Parser.statementSequence_return statementSequence51 = null;


        Object IF42_tree=null;
        Object THEN44_tree=null;
        Object ELSIF46_tree=null;
        Object THEN48_tree=null;
        Object ELSE50_tree=null;
        Object END52_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:31:2: ( IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )* ( ELSE statementSequence )? END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:31:4: IF expression THEN statementSequence ( ELSIF expression THEN statementSequence )* ( ELSE statementSequence )? END
            {
            root_0 = (Object)adaptor.nil();

            IF42=(Token)match(input,IF,FOLLOW_IF_in_ifStatement255); 
            IF42_tree = (Object)adaptor.create(IF42);
            root_0 = (Object)adaptor.becomeRoot(IF42_tree, root_0);

            pushFollow(FOLLOW_expression_in_ifStatement258);
            expression43=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression43.getTree());
            THEN44=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement260); 
            THEN44_tree = (Object)adaptor.create(THEN44);
            adaptor.addChild(root_0, THEN44_tree);

            pushFollow(FOLLOW_statementSequence_in_ifStatement262);
            statementSequence45=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence45.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:32:3: ( ELSIF expression THEN statementSequence )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ELSIF) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:32:4: ELSIF expression THEN statementSequence
            	    {
            	    ELSIF46=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement267); 
            	    ELSIF46_tree = (Object)adaptor.create(ELSIF46);
            	    adaptor.addChild(root_0, ELSIF46_tree);

            	    pushFollow(FOLLOW_expression_in_ifStatement269);
            	    expression47=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression47.getTree());
            	    THEN48=(Token)match(input,THEN,FOLLOW_THEN_in_ifStatement271); 
            	    THEN48_tree = (Object)adaptor.create(THEN48);
            	    adaptor.addChild(root_0, THEN48_tree);

            	    pushFollow(FOLLOW_statementSequence_in_ifStatement273);
            	    statementSequence49=statementSequence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementSequence49.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:33:3: ( ELSE statementSequence )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ELSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:33:4: ELSE statementSequence
                    {
                    ELSE50=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement280); 
                    ELSE50_tree = (Object)adaptor.create(ELSE50);
                    adaptor.addChild(root_0, ELSE50_tree);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement282);
                    statementSequence51=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence51.getTree());

                    }
                    break;

            }

            END52=(Token)match(input,END,FOLLOW_END_in_ifStatement289); 
            END52_tree = (Object)adaptor.create(END52);
            adaptor.addChild(root_0, END52_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:36:1: whileStatement : WHILE expression DO statementSequence END ;
    public final oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        oberon0Parser.whileStatement_return retval = new oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token WHILE53=null;
        Token DO55=null;
        Token END57=null;
        oberon0Parser.expression_return expression54 = null;

        oberon0Parser.statementSequence_return statementSequence56 = null;


        Object WHILE53_tree=null;
        Object DO55_tree=null;
        Object END57_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:37:2: ( WHILE expression DO statementSequence END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:37:4: WHILE expression DO statementSequence END
            {
            root_0 = (Object)adaptor.nil();

            WHILE53=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement299); 
            WHILE53_tree = (Object)adaptor.create(WHILE53);
            adaptor.addChild(root_0, WHILE53_tree);

            pushFollow(FOLLOW_expression_in_whileStatement301);
            expression54=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression54.getTree());
            DO55=(Token)match(input,DO,FOLLOW_DO_in_whileStatement303); 
            DO55_tree = (Object)adaptor.create(DO55);
            adaptor.addChild(root_0, DO55_tree);

            pushFollow(FOLLOW_statementSequence_in_whileStatement305);
            statementSequence56=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence56.getTree());
            END57=(Token)match(input,END,FOLLOW_END_in_whileStatement307); 
            END57_tree = (Object)adaptor.create(END57);
            adaptor.addChild(root_0, END57_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:39:1: statement : ( ( IDENT selector ( assignment | procedureCall ) ) | ifStatement | whileStatement )? ;
    public final oberon0Parser.statement_return statement() throws RecognitionException {
        oberon0Parser.statement_return retval = new oberon0Parser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT58=null;
        oberon0Parser.selector_return selector59 = null;

        oberon0Parser.assignment_return assignment60 = null;

        oberon0Parser.procedureCall_return procedureCall61 = null;

        oberon0Parser.ifStatement_return ifStatement62 = null;

        oberon0Parser.whileStatement_return whileStatement63 = null;


        Object IDENT58_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:2: ( ( ( IDENT selector ( assignment | procedureCall ) ) | ifStatement | whileStatement )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:4: ( ( IDENT selector ( assignment | procedureCall ) ) | ifStatement | whileStatement )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:4: ( ( IDENT selector ( assignment | procedureCall ) ) | ifStatement | whileStatement )?
            int alt14=4;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    alt14=1;
                    }
                    break;
                case IF:
                    {
                    alt14=2;
                    }
                    break;
                case WHILE:
                    {
                    alt14=3;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:6: ( IDENT selector ( assignment | procedureCall ) )
                    {
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:6: ( IDENT selector ( assignment | procedureCall ) )
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:7: IDENT selector ( assignment | procedureCall )
                    {
                    IDENT58=(Token)match(input,IDENT,FOLLOW_IDENT_in_statement319); 
                    IDENT58_tree = (Object)adaptor.create(IDENT58);
                    adaptor.addChild(root_0, IDENT58_tree);

                    pushFollow(FOLLOW_selector_in_statement321);
                    selector59=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector59.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:22: ( assignment | procedureCall )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ASSIGN) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==SEMICOLON||LA13_0==END||LA13_0==RNDOPEN||(LA13_0>=ELSIF && LA13_0<=ELSE)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:23: assignment
                            {
                            pushFollow(FOLLOW_assignment_in_statement324);
                            assignment60=assignment();

                            state._fsp--;

                            adaptor.addChild(root_0, assignment60.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:36: procedureCall
                            {
                            pushFollow(FOLLOW_procedureCall_in_statement328);
                            procedureCall61=procedureCall();

                            state._fsp--;

                            adaptor.addChild(root_0, procedureCall61.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:54: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement334);
                    ifStatement62=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement62.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:68: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement338);
                    whileStatement63=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement63.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:42:1: statementSequence : statement ( SEMICOLON statement )* ;
    public final oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        oberon0Parser.statementSequence_return retval = new oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON65=null;
        oberon0Parser.statement_return statement64 = null;

        oberon0Parser.statement_return statement66 = null;


        Object SEMICOLON65_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:43:2: ( statement ( SEMICOLON statement )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:43:4: statement ( SEMICOLON statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence350);
            statement64=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement64.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:43:14: ( SEMICOLON statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==SEMICOLON) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:43:15: SEMICOLON statement
            	    {
            	    SEMICOLON65=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statementSequence353); 
            	    SEMICOLON65_tree = (Object)adaptor.create(SEMICOLON65);
            	    adaptor.addChild(root_0, SEMICOLON65_tree);

            	    pushFollow(FOLLOW_statement_in_statementSequence355);
            	    statement66=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement66.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:45:1: identList : IDENT ( COMMA IDENT )* ;
    public final oberon0Parser.identList_return identList() throws RecognitionException {
        oberon0Parser.identList_return retval = new oberon0Parser.identList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT67=null;
        Token COMMA68=null;
        Token IDENT69=null;

        Object IDENT67_tree=null;
        Object COMMA68_tree=null;
        Object IDENT69_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:46:2: ( IDENT ( COMMA IDENT )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:46:4: IDENT ( COMMA IDENT )*
            {
            root_0 = (Object)adaptor.nil();

            IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList366); 
            IDENT67_tree = (Object)adaptor.create(IDENT67);
            adaptor.addChild(root_0, IDENT67_tree);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:46:10: ( COMMA IDENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:46:11: COMMA IDENT
            	    {
            	    COMMA68=(Token)match(input,COMMA,FOLLOW_COMMA_in_identList369); 
            	    COMMA68_tree = (Object)adaptor.create(COMMA68);
            	    adaptor.addChild(root_0, COMMA68_tree);

            	    IDENT69=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList371); 
            	    IDENT69_tree = (Object)adaptor.create(IDENT69);
            	    adaptor.addChild(root_0, IDENT69_tree);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:48:1: arrayType : ARRAY expression OF type ;
    public final oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        oberon0Parser.arrayType_return retval = new oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ARRAY70=null;
        Token OF72=null;
        oberon0Parser.expression_return expression71 = null;

        oberon0Parser.type_return type73 = null;


        Object ARRAY70_tree=null;
        Object OF72_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:49:2: ( ARRAY expression OF type )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:49:4: ARRAY expression OF type
            {
            root_0 = (Object)adaptor.nil();

            ARRAY70=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType384); 
            ARRAY70_tree = (Object)adaptor.create(ARRAY70);
            adaptor.addChild(root_0, ARRAY70_tree);

            pushFollow(FOLLOW_expression_in_arrayType386);
            expression71=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression71.getTree());
            OF72=(Token)match(input,OF,FOLLOW_OF_in_arrayType388); 
            OF72_tree = (Object)adaptor.create(OF72);
            adaptor.addChild(root_0, OF72_tree);

            pushFollow(FOLLOW_type_in_arrayType390);
            type73=type();

            state._fsp--;

            adaptor.addChild(root_0, type73.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:51:1: fieldList : ( identList COLON type )? ;
    public final oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        oberon0Parser.fieldList_return retval = new oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COLON75=null;
        oberon0Parser.identList_return identList74 = null;

        oberon0Parser.type_return type76 = null;


        Object COLON75_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:52:2: ( ( identList COLON type )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:52:4: ( identList COLON type )?
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:52:4: ( identList COLON type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:52:5: identList COLON type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList401);
                    identList74=identList();

                    state._fsp--;

                    adaptor.addChild(root_0, identList74.getTree());
                    COLON75=(Token)match(input,COLON,FOLLOW_COLON_in_fieldList403); 
                    COLON75_tree = (Object)adaptor.create(COLON75);
                    adaptor.addChild(root_0, COLON75_tree);

                    pushFollow(FOLLOW_type_in_fieldList405);
                    type76=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type76.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:54:1: recordType : RECORD fieldList ( SEMICOLON fieldList )* END ;
    public final oberon0Parser.recordType_return recordType() throws RecognitionException {
        oberon0Parser.recordType_return retval = new oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RECORD77=null;
        Token SEMICOLON79=null;
        Token END81=null;
        oberon0Parser.fieldList_return fieldList78 = null;

        oberon0Parser.fieldList_return fieldList80 = null;


        Object RECORD77_tree=null;
        Object SEMICOLON79_tree=null;
        Object END81_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:55:2: ( RECORD fieldList ( SEMICOLON fieldList )* END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:55:4: RECORD fieldList ( SEMICOLON fieldList )* END
            {
            root_0 = (Object)adaptor.nil();

            RECORD77=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType417); 
            RECORD77_tree = (Object)adaptor.create(RECORD77);
            adaptor.addChild(root_0, RECORD77_tree);

            pushFollow(FOLLOW_fieldList_in_recordType419);
            fieldList78=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList78.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:55:21: ( SEMICOLON fieldList )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==SEMICOLON) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:55:22: SEMICOLON fieldList
            	    {
            	    SEMICOLON79=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordType422); 
            	    SEMICOLON79_tree = (Object)adaptor.create(SEMICOLON79);
            	    adaptor.addChild(root_0, SEMICOLON79_tree);

            	    pushFollow(FOLLOW_fieldList_in_recordType424);
            	    fieldList80=fieldList();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldList80.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            END81=(Token)match(input,END,FOLLOW_END_in_recordType428); 
            END81_tree = (Object)adaptor.create(END81);
            adaptor.addChild(root_0, END81_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:57:1: type : ( IDENT | arrayType | recordType ) ;
    public final oberon0Parser.type_return type() throws RecognitionException {
        oberon0Parser.type_return retval = new oberon0Parser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT82=null;
        oberon0Parser.arrayType_return arrayType83 = null;

        oberon0Parser.recordType_return recordType84 = null;


        Object IDENT82_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:57:6: ( ( IDENT | arrayType | recordType ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:57:8: ( IDENT | arrayType | recordType )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:57:8: ( IDENT | arrayType | recordType )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:57:9: IDENT
                    {
                    IDENT82=(Token)match(input,IDENT,FOLLOW_IDENT_in_type437); 
                    IDENT82_tree = (Object)adaptor.create(IDENT82);
                    adaptor.addChild(root_0, IDENT82_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:57:17: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type441);
                    arrayType83=arrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayType83.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:57:29: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type445);
                    recordType84=recordType();

                    state._fsp--;

                    adaptor.addChild(root_0, recordType84.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class fpSection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:59:1: fpSection : ( VAR )? identList COLON type ;
    public final oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        oberon0Parser.fpSection_return retval = new oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VAR85=null;
        Token COLON87=null;
        oberon0Parser.identList_return identList86 = null;

        oberon0Parser.type_return type88 = null;


        Object VAR85_tree=null;
        Object COLON87_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:60:2: ( ( VAR )? identList COLON type )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:60:4: ( VAR )? identList COLON type
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:60:4: ( VAR )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==VAR) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:60:5: VAR
                    {
                    VAR85=(Token)match(input,VAR,FOLLOW_VAR_in_fpSection457); 
                    VAR85_tree = (Object)adaptor.create(VAR85);
                    adaptor.addChild(root_0, VAR85_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fpSection461);
            identList86=identList();

            state._fsp--;

            adaptor.addChild(root_0, identList86.getTree());
            COLON87=(Token)match(input,COLON,FOLLOW_COLON_in_fpSection463); 
            COLON87_tree = (Object)adaptor.create(COLON87);
            adaptor.addChild(root_0, COLON87_tree);

            pushFollow(FOLLOW_type_in_fpSection465);
            type88=type();

            state._fsp--;

            adaptor.addChild(root_0, type88.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fpSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:62:1: formalParameters : RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE ;
    public final oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        oberon0Parser.formalParameters_return retval = new oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RNDOPEN89=null;
        Token SEMICOLON91=null;
        Token RNDCLOSE93=null;
        oberon0Parser.fpSection_return fpSection90 = null;

        oberon0Parser.fpSection_return fpSection92 = null;


        Object RNDOPEN89_tree=null;
        Object SEMICOLON91_tree=null;
        Object RNDCLOSE93_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:63:2: ( RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:63:4: RNDOPEN ( fpSection ( SEMICOLON fpSection )* )? RNDCLOSE
            {
            root_0 = (Object)adaptor.nil();

            RNDOPEN89=(Token)match(input,RNDOPEN,FOLLOW_RNDOPEN_in_formalParameters475); 
            RNDOPEN89_tree = (Object)adaptor.create(RNDOPEN89);
            adaptor.addChild(root_0, RNDOPEN89_tree);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:63:12: ( fpSection ( SEMICOLON fpSection )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENT||LA22_0==VAR) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:63:13: fpSection ( SEMICOLON fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters478);
                    fpSection90=fpSection();

                    state._fsp--;

                    adaptor.addChild(root_0, fpSection90.getTree());
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:63:23: ( SEMICOLON fpSection )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==SEMICOLON) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:63:24: SEMICOLON fpSection
                    	    {
                    	    SEMICOLON91=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_formalParameters481); 
                    	    pushFollow(FOLLOW_fpSection_in_formalParameters484);
                    	    fpSection92=fpSection();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fpSection92.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            RNDCLOSE93=(Token)match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_formalParameters490); 
            RNDCLOSE93_tree = (Object)adaptor.create(RNDCLOSE93);
            adaptor.addChild(root_0, RNDCLOSE93_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class procedureHeading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureHeading"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:65:1: procedureHeading : PROCEDURE IDENT ( formalParameters )? ;
    public final oberon0Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        oberon0Parser.procedureHeading_return retval = new oberon0Parser.procedureHeading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PROCEDURE94=null;
        Token IDENT95=null;
        oberon0Parser.formalParameters_return formalParameters96 = null;


        Object PROCEDURE94_tree=null;
        Object IDENT95_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:66:2: ( PROCEDURE IDENT ( formalParameters )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:66:4: PROCEDURE IDENT ( formalParameters )?
            {
            root_0 = (Object)adaptor.nil();

            PROCEDURE94=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading499); 
            PROCEDURE94_tree = (Object)adaptor.create(PROCEDURE94);
            root_0 = (Object)adaptor.becomeRoot(PROCEDURE94_tree, root_0);

            IDENT95=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureHeading502); 
            IDENT95_tree = (Object)adaptor.create(IDENT95);
            adaptor.addChild(root_0, IDENT95_tree);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:66:21: ( formalParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RNDOPEN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:66:22: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading505);
                    formalParameters96=formalParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, formalParameters96.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureHeading"

    public static class procedureBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:68:1: procedureBody : declarations ( BEGIN statementSequence )? END IDENT ;
    public final oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        oberon0Parser.procedureBody_return retval = new oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BEGIN98=null;
        Token END100=null;
        Token IDENT101=null;
        oberon0Parser.declarations_return declarations97 = null;

        oberon0Parser.statementSequence_return statementSequence99 = null;


        Object BEGIN98_tree=null;
        Object END100_tree=null;
        Object IDENT101_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:69:2: ( declarations ( BEGIN statementSequence )? END IDENT )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:69:4: declarations ( BEGIN statementSequence )? END IDENT
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedureBody516);
            declarations97=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations97.getTree());
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:69:17: ( BEGIN statementSequence )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BEGIN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:69:18: BEGIN statementSequence
                    {
                    BEGIN98=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procedureBody519); 
                    BEGIN98_tree = (Object)adaptor.create(BEGIN98);
                    adaptor.addChild(root_0, BEGIN98_tree);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody521);
                    statementSequence99=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence99.getTree());

                    }
                    break;

            }

            END100=(Token)match(input,END,FOLLOW_END_in_procedureBody525); 
            END100_tree = (Object)adaptor.create(END100);
            adaptor.addChild(root_0, END100_tree);

            IDENT101=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureBody527); 
            IDENT101_tree = (Object)adaptor.create(IDENT101);
            adaptor.addChild(root_0, IDENT101_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:71:1: procedureDeclaration : procedureHeading SEMICOLON procedureBody ;
    public final oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        oberon0Parser.procedureDeclaration_return retval = new oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON103=null;
        oberon0Parser.procedureHeading_return procedureHeading102 = null;

        oberon0Parser.procedureBody_return procedureBody104 = null;


        Object SEMICOLON103_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:2: ( procedureHeading SEMICOLON procedureBody )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:72:4: procedureHeading SEMICOLON procedureBody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration537);
            procedureHeading102=procedureHeading();

            state._fsp--;

            adaptor.addChild(root_0, procedureHeading102.getTree());
            SEMICOLON103=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureDeclaration539); 
            SEMICOLON103_tree = (Object)adaptor.create(SEMICOLON103);
            root_0 = (Object)adaptor.becomeRoot(SEMICOLON103_tree, root_0);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration542);
            procedureBody104=procedureBody();

            state._fsp--;

            adaptor.addChild(root_0, procedureBody104.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:74:1: declarations : ( CONST ( IDENT EQUALS expression SEMICOLON )* )? ( TYPE ( IDENT EQUALS type SEMICOLON )* )? ( VAR ( identList COLON type SEMICOLON )* )? ( procedureDeclaration SEMICOLON )* ;
    public final oberon0Parser.declarations_return declarations() throws RecognitionException {
        oberon0Parser.declarations_return retval = new oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONST105=null;
        Token IDENT106=null;
        Token EQUALS107=null;
        Token SEMICOLON109=null;
        Token TYPE110=null;
        Token IDENT111=null;
        Token EQUALS112=null;
        Token SEMICOLON114=null;
        Token VAR115=null;
        Token COLON117=null;
        Token SEMICOLON119=null;
        Token SEMICOLON121=null;
        oberon0Parser.expression_return expression108 = null;

        oberon0Parser.type_return type113 = null;

        oberon0Parser.identList_return identList116 = null;

        oberon0Parser.type_return type118 = null;

        oberon0Parser.procedureDeclaration_return procedureDeclaration120 = null;


        Object CONST105_tree=null;
        Object IDENT106_tree=null;
        Object EQUALS107_tree=null;
        Object SEMICOLON109_tree=null;
        Object TYPE110_tree=null;
        Object IDENT111_tree=null;
        Object EQUALS112_tree=null;
        Object SEMICOLON114_tree=null;
        Object VAR115_tree=null;
        Object COLON117_tree=null;
        Object SEMICOLON119_tree=null;
        Object SEMICOLON121_tree=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:2: ( ( CONST ( IDENT EQUALS expression SEMICOLON )* )? ( TYPE ( IDENT EQUALS type SEMICOLON )* )? ( VAR ( identList COLON type SEMICOLON )* )? ( procedureDeclaration SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:4: ( CONST ( IDENT EQUALS expression SEMICOLON )* )? ( TYPE ( IDENT EQUALS type SEMICOLON )* )? ( VAR ( identList COLON type SEMICOLON )* )? ( procedureDeclaration SEMICOLON )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:4: ( CONST ( IDENT EQUALS expression SEMICOLON )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CONST) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:5: CONST ( IDENT EQUALS expression SEMICOLON )*
                    {
                    CONST105=(Token)match(input,CONST,FOLLOW_CONST_in_declarations552); 
                    CONST105_tree = (Object)adaptor.create(CONST105);
                    root_0 = (Object)adaptor.becomeRoot(CONST105_tree, root_0);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:12: ( IDENT EQUALS expression SEMICOLON )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENT) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:75:13: IDENT EQUALS expression SEMICOLON
                    	    {
                    	    IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations556); 
                    	    IDENT106_tree = (Object)adaptor.create(IDENT106);
                    	    adaptor.addChild(root_0, IDENT106_tree);

                    	    EQUALS107=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_declarations558); 
                    	    EQUALS107_tree = (Object)adaptor.create(EQUALS107);
                    	    root_0 = (Object)adaptor.becomeRoot(EQUALS107_tree, root_0);

                    	    pushFollow(FOLLOW_expression_in_declarations561);
                    	    expression108=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression108.getTree());
                    	    SEMICOLON109=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations563); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:76:3: ( TYPE ( IDENT EQUALS type SEMICOLON )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==TYPE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:76:4: TYPE ( IDENT EQUALS type SEMICOLON )*
                    {
                    TYPE110=(Token)match(input,TYPE,FOLLOW_TYPE_in_declarations573); 
                    TYPE110_tree = (Object)adaptor.create(TYPE110);
                    root_0 = (Object)adaptor.becomeRoot(TYPE110_tree, root_0);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:76:10: ( IDENT EQUALS type SEMICOLON )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==IDENT) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:76:11: IDENT EQUALS type SEMICOLON
                    	    {
                    	    IDENT111=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations577); 
                    	    IDENT111_tree = (Object)adaptor.create(IDENT111);
                    	    adaptor.addChild(root_0, IDENT111_tree);

                    	    EQUALS112=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_declarations579); 
                    	    EQUALS112_tree = (Object)adaptor.create(EQUALS112);
                    	    root_0 = (Object)adaptor.becomeRoot(EQUALS112_tree, root_0);

                    	    pushFollow(FOLLOW_type_in_declarations582);
                    	    type113=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type113.getTree());
                    	    SEMICOLON114=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations584); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:3: ( VAR ( identList COLON type SEMICOLON )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==VAR) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:4: VAR ( identList COLON type SEMICOLON )*
                    {
                    VAR115=(Token)match(input,VAR,FOLLOW_VAR_in_declarations594); 
                    VAR115_tree = (Object)adaptor.create(VAR115);
                    root_0 = (Object)adaptor.becomeRoot(VAR115_tree, root_0);

                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:9: ( identList COLON type SEMICOLON )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==IDENT) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:77:10: identList COLON type SEMICOLON
                    	    {
                    	    pushFollow(FOLLOW_identList_in_declarations598);
                    	    identList116=identList();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, identList116.getTree());
                    	    COLON117=(Token)match(input,COLON,FOLLOW_COLON_in_declarations600); 
                    	    COLON117_tree = (Object)adaptor.create(COLON117);
                    	    root_0 = (Object)adaptor.becomeRoot(COLON117_tree, root_0);

                    	    pushFollow(FOLLOW_type_in_declarations603);
                    	    type118=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type118.getTree());
                    	    SEMICOLON119=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations605); 

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:3: ( procedureDeclaration SEMICOLON )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==PROCEDURE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:78:4: procedureDeclaration SEMICOLON
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations615);
            	    procedureDeclaration120=procedureDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedureDeclaration120.getTree());
            	    SEMICOLON121=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations617); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarations"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOLON_in_module23 = new BitSet(new long[]{0x00001E0000000180L});
    public static final BitSet FOLLOW_declarations_in_module26 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_BEGIN_in_module32 = new BitSet(new long[]{0x0000000880000060L});
    public static final BitSet FOLLOW_statementSequence_in_module34 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_module38 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module40 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_DOT_in_module42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector51 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selector53 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_SQROPEN_in_selector57 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_selector60 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_SQRCLOSE_in_selector62 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_INTEGER_in_number72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_factor82 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_selector_in_factor84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_factor92 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_factor95 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_factor97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor101 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_factor_in_factor103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term113 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_set_in_term116 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_factor_in_term133 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_set_in_simpleExpression145 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_term_in_simpleExpression154 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_set_in_simpleExpression157 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_term_in_simpleExpression166 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression178 = new BitSet(new long[]{0x000000001F800002L});
    public static final BitSet FOLLOW_set_in_expression181 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_simpleExpression_in_expression196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment207 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_assignment209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_actualParameters219 = new BitSet(new long[]{0x000000000030F020L});
    public static final BitSet FOLLOW_expression_in_actualParameters223 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_COMMA_in_actualParameters226 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_actualParameters228 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_actualParameters234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement255 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_ifStatement258 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement260 = new BitSet(new long[]{0x0000000880000060L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement262 = new BitSet(new long[]{0x0000000600000100L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement267 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_ifStatement269 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement271 = new BitSet(new long[]{0x0000000880000060L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement273 = new BitSet(new long[]{0x0000000600000100L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement280 = new BitSet(new long[]{0x0000000880000060L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement282 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_ifStatement289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement299 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_whileStatement301 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement303 = new BitSet(new long[]{0x0000000880000060L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement305 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_whileStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_statement319 = new BitSet(new long[]{0x0000000020002600L});
    public static final BitSet FOLLOW_selector_in_statement321 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_assignment_in_statement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence350 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_SEMICOLON_in_statementSequence353 = new BitSet(new long[]{0x0000000880000060L});
    public static final BitSet FOLLOW_statement_in_statementSequence355 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_IDENT_in_identList366 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_COMMA_in_identList369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identList371 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType384 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_arrayType386 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_OF_in_arrayType388 = new BitSet(new long[]{0x0000012000000020L});
    public static final BitSet FOLLOW_type_in_arrayType390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList401 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_fieldList403 = new BitSet(new long[]{0x0000012000000020L});
    public static final BitSet FOLLOW_type_in_fieldList405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType417 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_fieldList_in_recordType419 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_SEMICOLON_in_recordType422 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_fieldList_in_recordType424 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_END_in_recordType428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_fpSection461 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_fpSection463 = new BitSet(new long[]{0x0000012000000020L});
    public static final BitSet FOLLOW_type_in_fpSection465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_formalParameters475 = new BitSet(new long[]{0x0000020000004020L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters478 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_SEMICOLON_in_formalParameters481 = new BitSet(new long[]{0x0000020000000020L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters484 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_RNDCLOSE_in_formalParameters490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading499 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureHeading502 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody516 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_BEGIN_in_procedureBody519 = new BitSet(new long[]{0x0000000880000060L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody521 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_in_procedureBody525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureBody527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration537 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureDeclaration539 = new BitSet(new long[]{0x00001E0000000180L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_declarations552 = new BitSet(new long[]{0x0000160000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations556 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQUALS_in_declarations558 = new BitSet(new long[]{0x000000000030B020L});
    public static final BitSet FOLLOW_expression_in_declarations561 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOLON_in_declarations563 = new BitSet(new long[]{0x0000160000000022L});
    public static final BitSet FOLLOW_TYPE_in_declarations573 = new BitSet(new long[]{0x0000060000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations577 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQUALS_in_declarations579 = new BitSet(new long[]{0x0000012000000020L});
    public static final BitSet FOLLOW_type_in_declarations582 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOLON_in_declarations584 = new BitSet(new long[]{0x0000060000000022L});
    public static final BitSet FOLLOW_VAR_in_declarations594 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_identList_in_declarations598 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_COLON_in_declarations600 = new BitSet(new long[]{0x0000012000000020L});
    public static final BitSet FOLLOW_type_in_declarations603 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOLON_in_declarations605 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations615 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMICOLON_in_declarations617 = new BitSet(new long[]{0x0000040000000002L});

}