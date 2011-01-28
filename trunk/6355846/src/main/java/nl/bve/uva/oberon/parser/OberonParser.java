// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g 2011-01-28 11:56:03

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.treeadaptor.OberonNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class OberonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DECL", "PROCEDURE", "TYPEDEF", "CONSTDEF", "VARDEF", "NEWLINE", "WS", "LETTER", "DIGIT", "'.'", "'['", "']'", "'('", "')'", "'~'", "'*'", "'DIV'", "'MOD'", "'&'", "'+'", "'-'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "':='", "','", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'END'", "'WHILE'", "'DO'", "';'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'BEGIN'", "'MODULE'"
    };
    public static final int EOF=-1;
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
    public static final int DECL=4;
    public static final int PROCEDURE=5;
    public static final int TYPEDEF=6;
    public static final int CONSTDEF=7;
    public static final int VARDEF=8;
    public static final int NEWLINE=9;
    public static final int WS=10;
    public static final int LETTER=11;
    public static final int DIGIT=12;

    // delegates
    // delegators


        public OberonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OberonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return OberonParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g"; }


    public static class ident_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ident"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:32:1: ident : LETTER ( LETTER | DIGIT )* ;
    public final OberonParser.ident_return ident() throws RecognitionException {
        OberonParser.ident_return retval = new OberonParser.ident_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token LETTER1=null;
        Token set2=null;

        OberonNode LETTER1_tree=null;
        OberonNode set2_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:32:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:32:9: LETTER ( LETTER | DIGIT )*
            {
            root_0 = (OberonNode)adaptor.nil();

            LETTER1=(Token)match(input,LETTER,FOLLOW_LETTER_in_ident142); 
            LETTER1_tree = (OberonNode)adaptor.create(LETTER1);
            adaptor.addChild(root_0, LETTER1_tree);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:32:16: ( LETTER | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=LETTER && LA1_0<=DIGIT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:
            	    {
            	    set2=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LETTER && input.LA(1)<=DIGIT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (OberonNode)adaptor.create(set2));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ident"

    public static class integer_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:34:1: integer : DIGIT ( DIGIT )* ;
    public final OberonParser.integer_return integer() throws RecognitionException {
        OberonParser.integer_return retval = new OberonParser.integer_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token DIGIT3=null;
        Token DIGIT4=null;

        OberonNode DIGIT3_tree=null;
        OberonNode DIGIT4_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:34:9: ( DIGIT ( DIGIT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:34:11: DIGIT ( DIGIT )*
            {
            root_0 = (OberonNode)adaptor.nil();

            DIGIT3=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer160); 
            DIGIT3_tree = (OberonNode)adaptor.create(DIGIT3);
            adaptor.addChild(root_0, DIGIT3_tree);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:34:17: ( DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIGIT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:34:18: DIGIT
            	    {
            	    DIGIT4=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer163); 
            	    DIGIT4_tree = (OberonNode)adaptor.create(DIGIT4);
            	    adaptor.addChild(root_0, DIGIT4_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer"

    public static class number_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:36:1: number : integer ;
    public final OberonParser.number_return number() throws RecognitionException {
        OberonParser.number_return retval = new OberonParser.number_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        OberonParser.integer_return integer5 = null;



        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:36:8: ( integer )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:36:10: integer
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_integer_in_number173);
            integer5=integer();

            state._fsp--;

            adaptor.addChild(root_0, integer5.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class selector_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:1: selector : ( '.' ident | '[' expression ']' )* ;
    public final OberonParser.selector_return selector() throws RecognitionException {
        OberonParser.selector_return retval = new OberonParser.selector_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal6=null;
        Token char_literal8=null;
        Token char_literal10=null;
        OberonParser.ident_return ident7 = null;

        OberonParser.expression_return expression9 = null;


        OberonNode char_literal6_tree=null;
        OberonNode char_literal8_tree=null;
        OberonNode char_literal10_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:9: ( ( '.' ident | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:11: ( '.' ident | '[' expression ']' )*
            {
            root_0 = (OberonNode)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:11: ( '.' ident | '[' expression ']' )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }
                else if ( (LA3_0==14) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:12: '.' ident
            	    {
            	    char_literal6=(Token)match(input,13,FOLLOW_13_in_selector181); 
            	    char_literal6_tree = (OberonNode)adaptor.create(char_literal6);
            	    adaptor.addChild(root_0, char_literal6_tree);

            	    pushFollow(FOLLOW_ident_in_selector183);
            	    ident7=ident();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ident7.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:24: '[' expression ']'
            	    {
            	    char_literal8=(Token)match(input,14,FOLLOW_14_in_selector187); 
            	    char_literal8_tree = (OberonNode)adaptor.create(char_literal8);
            	    adaptor.addChild(root_0, char_literal8_tree);

            	    pushFollow(FOLLOW_expression_in_selector189);
            	    expression9=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression9.getTree());
            	    char_literal10=(Token)match(input,15,FOLLOW_15_in_selector191); 
            	    char_literal10_tree = (OberonNode)adaptor.create(char_literal10);
            	    adaptor.addChild(root_0, char_literal10_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class factor_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:1: factor : ( ident selector | number | '(' expression ')' | '~' factor );
    public final OberonParser.factor_return factor() throws RecognitionException {
        OberonParser.factor_return retval = new OberonParser.factor_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        OberonParser.ident_return ident11 = null;

        OberonParser.selector_return selector12 = null;

        OberonParser.number_return number13 = null;

        OberonParser.expression_return expression15 = null;

        OberonParser.factor_return factor18 = null;


        OberonNode char_literal14_tree=null;
        OberonNode char_literal16_tree=null;
        OberonNode char_literal17_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:8: ( ident selector | number | '(' expression ')' | '~' factor )
            int alt4=4;
            switch ( input.LA(1) ) {
            case LETTER:
                {
                alt4=1;
                }
                break;
            case DIGIT:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 18:
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:10: ident selector
                    {
                    root_0 = (OberonNode)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_factor204);
                    ident11=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident11.getTree());
                    pushFollow(FOLLOW_selector_in_factor206);
                    selector12=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector12.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:27: number
                    {
                    root_0 = (OberonNode)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor210);
                    number13=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number13.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:36: '(' expression ')'
                    {
                    root_0 = (OberonNode)adaptor.nil();

                    char_literal14=(Token)match(input,16,FOLLOW_16_in_factor214); 
                    char_literal14_tree = (OberonNode)adaptor.create(char_literal14);
                    adaptor.addChild(root_0, char_literal14_tree);

                    pushFollow(FOLLOW_expression_in_factor216);
                    expression15=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression15.getTree());
                    char_literal16=(Token)match(input,17,FOLLOW_17_in_factor218); 
                    char_literal16_tree = (OberonNode)adaptor.create(char_literal16);
                    adaptor.addChild(root_0, char_literal16_tree);


                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:57: '~' factor
                    {
                    root_0 = (OberonNode)adaptor.nil();

                    char_literal17=(Token)match(input,18,FOLLOW_18_in_factor222); 
                    char_literal17_tree = (OberonNode)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);

                    pushFollow(FOLLOW_factor_in_factor224);
                    factor18=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor18.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:42:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final OberonParser.term_return term() throws RecognitionException {
        OberonParser.term_return retval = new OberonParser.term_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token set20=null;
        OberonParser.factor_return factor19 = null;

        OberonParser.factor_return factor21 = null;


        OberonNode set20_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:42:6: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:42:8: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term233);
            factor19=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor19.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:42:15: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:42:16: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    set20=(Token)input.LT(1);
            	    if ( (input.LA(1)>=19 && input.LA(1)<=22) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (OberonNode)adaptor.create(set20));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term252);
            	    factor21=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:44:1: simpleExpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* ;
    public final OberonParser.simpleExpression_return simpleExpression() throws RecognitionException {
        OberonParser.simpleExpression_return retval = new OberonParser.simpleExpression_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token set22=null;
        Token set24=null;
        OberonParser.term_return term23 = null;

        OberonParser.term_return term25 = null;


        OberonNode set22_tree=null;
        OberonNode set24_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:45:2: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:45:4: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )*
            {
            root_0 = (OberonNode)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:45:4: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=23 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:
                    {
                    set22=(Token)input.LT(1);
                    if ( (input.LA(1)>=23 && input.LA(1)<=24) ) {
                        input.consume();
                        adaptor.addChild(root_0, (OberonNode)adaptor.create(set22));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression274);
            term23=term();

            state._fsp--;

            adaptor.addChild(root_0, term23.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:45:22: ( ( '+' | '-' | 'OR' ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=23 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:45:23: ( '+' | '-' | 'OR' ) term
            	    {
            	    set24=(Token)input.LT(1);
            	    if ( (input.LA(1)>=23 && input.LA(1)<=25) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (OberonNode)adaptor.create(set24));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression287);
            	    term25=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term25.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class expression_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:47:1: expression : simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )? ;
    public final OberonParser.expression_return expression() throws RecognitionException {
        OberonParser.expression_return retval = new OberonParser.expression_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token set27=null;
        OberonParser.simpleExpression_return simpleExpression26 = null;

        OberonParser.simpleExpression_return simpleExpression28 = null;


        OberonNode set27_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:48:2: ( simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:48:4: simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )?
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression299);
            simpleExpression26=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, simpleExpression26.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:48:21: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=26 && LA8_0<=31)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:48:22: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression
                    {
                    set27=(Token)input.LT(1);
                    if ( (input.LA(1)>=26 && input.LA(1)<=31) ) {
                        input.consume();
                        adaptor.addChild(root_0, (OberonNode)adaptor.create(set27));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression326);
                    simpleExpression28=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleExpression28.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class assignment_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:50:1: assignment : ident selector ':=' expression ;
    public final OberonParser.assignment_return assignment() throws RecognitionException {
        OberonParser.assignment_return retval = new OberonParser.assignment_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal31=null;
        OberonParser.ident_return ident29 = null;

        OberonParser.selector_return selector30 = null;

        OberonParser.expression_return expression32 = null;


        OberonNode string_literal31_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:51:2: ( ident selector ':=' expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:51:4: ident selector ':=' expression
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_ident_in_assignment339);
            ident29=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident29.getTree());
            pushFollow(FOLLOW_selector_in_assignment341);
            selector30=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector30.getTree());
            string_literal31=(Token)match(input,32,FOLLOW_32_in_assignment343); 
            string_literal31_tree = (OberonNode)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_expression_in_assignment345);
            expression32=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression32.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class actualParameters_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:53:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final OberonParser.actualParameters_return actualParameters() throws RecognitionException {
        OberonParser.actualParameters_return retval = new OberonParser.actualParameters_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal37=null;
        OberonParser.expression_return expression34 = null;

        OberonParser.expression_return expression36 = null;


        OberonNode char_literal33_tree=null;
        OberonNode char_literal35_tree=null;
        OberonNode char_literal37_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:54:2: ( '(' ( expression ( ',' expression )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:54:4: '(' ( expression ( ',' expression )* )? ')'
            {
            root_0 = (OberonNode)adaptor.nil();

            char_literal33=(Token)match(input,16,FOLLOW_16_in_actualParameters355); 
            char_literal33_tree = (OberonNode)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:54:8: ( expression ( ',' expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=LETTER && LA10_0<=DIGIT)||LA10_0==16||LA10_0==18||(LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:54:9: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters358);
                    expression34=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression34.getTree());
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:54:20: ( ',' expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==33) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:54:21: ',' expression
                    	    {
                    	    char_literal35=(Token)match(input,33,FOLLOW_33_in_actualParameters361); 
                    	    char_literal35_tree = (OberonNode)adaptor.create(char_literal35);
                    	    adaptor.addChild(root_0, char_literal35_tree);

                    	    pushFollow(FOLLOW_expression_in_actualParameters363);
                    	    expression36=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal37=(Token)match(input,17,FOLLOW_17_in_actualParameters369); 
            char_literal37_tree = (OberonNode)adaptor.create(char_literal37);
            adaptor.addChild(root_0, char_literal37_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class procedureCall_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:56:1: procedureCall : ident selector ( actualParameters )? ;
    public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
        OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        OberonParser.ident_return ident38 = null;

        OberonParser.selector_return selector39 = null;

        OberonParser.actualParameters_return actualParameters40 = null;



        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:57:2: ( ident selector ( actualParameters )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:57:4: ident selector ( actualParameters )?
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_ident_in_procedureCall380);
            ident38=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident38.getTree());
            pushFollow(FOLLOW_selector_in_procedureCall382);
            selector39=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector39.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:57:19: ( actualParameters )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:57:20: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall385);
                    actualParameters40=actualParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualParameters40.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class subCall_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subCall"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:1: subCall : ident selector ( ':=' expression | ( actualParameters )? ) ;
    public final OberonParser.subCall_return subCall() throws RecognitionException {
        OberonParser.subCall_return retval = new OberonParser.subCall_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal43=null;
        OberonParser.ident_return ident41 = null;

        OberonParser.selector_return selector42 = null;

        OberonParser.expression_return expression44 = null;

        OberonParser.actualParameters_return actualParameters45 = null;


        OberonNode string_literal43_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:9: ( ident selector ( ':=' expression | ( actualParameters )? ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:11: ident selector ( ':=' expression | ( actualParameters )? )
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_ident_in_subCall395);
            ident41=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident41.getTree());
            pushFollow(FOLLOW_selector_in_subCall397);
            selector42=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector42.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:26: ( ':=' expression | ( actualParameters )? )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==16||(LA13_0>=36 && LA13_0<=38)||LA13_0==41) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:27: ':=' expression
                    {
                    string_literal43=(Token)match(input,32,FOLLOW_32_in_subCall400); 
                    string_literal43_tree = (OberonNode)adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);

                    pushFollow(FOLLOW_expression_in_subCall402);
                    expression44=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression44.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:45: ( actualParameters )?
                    {
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:45: ( actualParameters )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==16) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:59:46: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_subCall407);
                            actualParameters45=actualParameters();

                            state._fsp--;

                            adaptor.addChild(root_0, actualParameters45.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subCall"

    public static class ifStatement_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:61:1: ifStatement : 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
    public final OberonParser.ifStatement_return ifStatement() throws RecognitionException {
        OberonParser.ifStatement_return retval = new OberonParser.ifStatement_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal46=null;
        Token string_literal48=null;
        Token string_literal50=null;
        Token string_literal52=null;
        Token string_literal54=null;
        Token string_literal56=null;
        OberonParser.expression_return expression47 = null;

        OberonParser.statementSequence_return statementSequence49 = null;

        OberonParser.expression_return expression51 = null;

        OberonParser.statementSequence_return statementSequence53 = null;

        OberonParser.statementSequence_return statementSequence55 = null;


        OberonNode string_literal46_tree=null;
        OberonNode string_literal48_tree=null;
        OberonNode string_literal50_tree=null;
        OberonNode string_literal52_tree=null;
        OberonNode string_literal54_tree=null;
        OberonNode string_literal56_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:62:2: ( 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:62:4: 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
            {
            root_0 = (OberonNode)adaptor.nil();

            string_literal46=(Token)match(input,34,FOLLOW_34_in_ifStatement419); 
            string_literal46_tree = (OberonNode)adaptor.create(string_literal46);
            adaptor.addChild(root_0, string_literal46_tree);

            pushFollow(FOLLOW_expression_in_ifStatement421);
            expression47=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression47.getTree());
            string_literal48=(Token)match(input,35,FOLLOW_35_in_ifStatement423); 
            string_literal48_tree = (OberonNode)adaptor.create(string_literal48);
            adaptor.addChild(root_0, string_literal48_tree);

            pushFollow(FOLLOW_statementSequence_in_ifStatement425);
            statementSequence49=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence49.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:62:45: ( 'ELSIF' expression 'THEN' statementSequence )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:62:46: 'ELSIF' expression 'THEN' statementSequence
            	    {
            	    string_literal50=(Token)match(input,36,FOLLOW_36_in_ifStatement428); 
            	    string_literal50_tree = (OberonNode)adaptor.create(string_literal50);
            	    adaptor.addChild(root_0, string_literal50_tree);

            	    pushFollow(FOLLOW_expression_in_ifStatement430);
            	    expression51=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression51.getTree());
            	    string_literal52=(Token)match(input,35,FOLLOW_35_in_ifStatement432); 
            	    string_literal52_tree = (OberonNode)adaptor.create(string_literal52);
            	    adaptor.addChild(root_0, string_literal52_tree);

            	    pushFollow(FOLLOW_statementSequence_in_ifStatement434);
            	    statementSequence53=statementSequence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementSequence53.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:62:92: ( 'ELSE' statementSequence )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:62:93: 'ELSE' statementSequence
                    {
                    string_literal54=(Token)match(input,37,FOLLOW_37_in_ifStatement439); 
                    string_literal54_tree = (OberonNode)adaptor.create(string_literal54);
                    adaptor.addChild(root_0, string_literal54_tree);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement441);
                    statementSequence55=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence55.getTree());

                    }
                    break;

            }

            string_literal56=(Token)match(input,38,FOLLOW_38_in_ifStatement445); 
            string_literal56_tree = (OberonNode)adaptor.create(string_literal56);
            adaptor.addChild(root_0, string_literal56_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:64:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final OberonParser.whileStatement_return whileStatement() throws RecognitionException {
        OberonParser.whileStatement_return retval = new OberonParser.whileStatement_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal57=null;
        Token string_literal59=null;
        Token string_literal61=null;
        OberonParser.expression_return expression58 = null;

        OberonParser.statementSequence_return statementSequence60 = null;


        OberonNode string_literal57_tree=null;
        OberonNode string_literal59_tree=null;
        OberonNode string_literal61_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:65:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:65:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            root_0 = (OberonNode)adaptor.nil();

            string_literal57=(Token)match(input,39,FOLLOW_39_in_whileStatement454); 
            string_literal57_tree = (OberonNode)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);

            pushFollow(FOLLOW_expression_in_whileStatement456);
            expression58=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression58.getTree());
            string_literal59=(Token)match(input,40,FOLLOW_40_in_whileStatement458); 
            string_literal59_tree = (OberonNode)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);

            pushFollow(FOLLOW_statementSequence_in_whileStatement460);
            statementSequence60=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence60.getTree());
            string_literal61=(Token)match(input,38,FOLLOW_38_in_whileStatement462); 
            string_literal61_tree = (OberonNode)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class statement_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:68:1: statement : ( subCall | ifStatement | whileStatement )? ;
    public final OberonParser.statement_return statement() throws RecognitionException {
        OberonParser.statement_return retval = new OberonParser.statement_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        OberonParser.subCall_return subCall62 = null;

        OberonParser.ifStatement_return ifStatement63 = null;

        OberonParser.whileStatement_return whileStatement64 = null;



        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:69:2: ( ( subCall | ifStatement | whileStatement )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:69:4: ( subCall | ifStatement | whileStatement )?
            {
            root_0 = (OberonNode)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:69:4: ( subCall | ifStatement | whileStatement )?
            int alt16=4;
            switch ( input.LA(1) ) {
                case LETTER:
                    {
                    alt16=1;
                    }
                    break;
                case 34:
                    {
                    alt16=2;
                    }
                    break;
                case 39:
                    {
                    alt16=3;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:69:5: subCall
                    {
                    pushFollow(FOLLOW_subCall_in_statement474);
                    subCall62=subCall();

                    state._fsp--;

                    adaptor.addChild(root_0, subCall62.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:69:15: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement478);
                    ifStatement63=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement63.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:69:29: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement482);
                    whileStatement64=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement64.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:71:1: statementSequence : statement ( ';' statement )* ;
    public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
        OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal66=null;
        OberonParser.statement_return statement65 = null;

        OberonParser.statement_return statement67 = null;


        OberonNode char_literal66_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:72:2: ( statement ( ';' statement )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:72:4: statement ( ';' statement )*
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence494);
            statement65=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement65.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:72:14: ( ';' statement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:72:15: ';' statement
            	    {
            	    char_literal66=(Token)match(input,41,FOLLOW_41_in_statementSequence497); 
            	    char_literal66_tree = (OberonNode)adaptor.create(char_literal66);
            	    adaptor.addChild(root_0, char_literal66_tree);

            	    pushFollow(FOLLOW_statement_in_statementSequence499);
            	    statement67=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement67.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:74:1: identList : ident ( ',' ident )* ;
    public final OberonParser.identList_return identList() throws RecognitionException {
        OberonParser.identList_return retval = new OberonParser.identList_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal69=null;
        OberonParser.ident_return ident68 = null;

        OberonParser.ident_return ident70 = null;


        OberonNode char_literal69_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:75:2: ( ident ( ',' ident )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:75:4: ident ( ',' ident )*
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_ident_in_identList510);
            ident68=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident68.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:75:10: ( ',' ident )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:75:11: ',' ident
            	    {
            	    char_literal69=(Token)match(input,33,FOLLOW_33_in_identList513); 
            	    char_literal69_tree = (OberonNode)adaptor.create(char_literal69);
            	    adaptor.addChild(root_0, char_literal69_tree);

            	    pushFollow(FOLLOW_ident_in_identList515);
            	    ident70=ident();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ident70.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:77:1: arrayType : 'ARRAY' expression 'OF' type ;
    public final OberonParser.arrayType_return arrayType() throws RecognitionException {
        OberonParser.arrayType_return retval = new OberonParser.arrayType_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal71=null;
        Token string_literal73=null;
        OberonParser.expression_return expression72 = null;

        OberonParser.type_return type74 = null;


        OberonNode string_literal71_tree=null;
        OberonNode string_literal73_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:78:2: ( 'ARRAY' expression 'OF' type )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:78:4: 'ARRAY' expression 'OF' type
            {
            root_0 = (OberonNode)adaptor.nil();

            string_literal71=(Token)match(input,42,FOLLOW_42_in_arrayType527); 
            string_literal71_tree = (OberonNode)adaptor.create(string_literal71);
            adaptor.addChild(root_0, string_literal71_tree);

            pushFollow(FOLLOW_expression_in_arrayType529);
            expression72=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression72.getTree());
            string_literal73=(Token)match(input,43,FOLLOW_43_in_arrayType531); 
            string_literal73_tree = (OberonNode)adaptor.create(string_literal73);
            adaptor.addChild(root_0, string_literal73_tree);

            pushFollow(FOLLOW_type_in_arrayType533);
            type74=type();

            state._fsp--;

            adaptor.addChild(root_0, type74.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:80:1: fieldList : ( identList ':' type )? ;
    public final OberonParser.fieldList_return fieldList() throws RecognitionException {
        OberonParser.fieldList_return retval = new OberonParser.fieldList_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal76=null;
        OberonParser.identList_return identList75 = null;

        OberonParser.type_return type77 = null;


        OberonNode char_literal76_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:81:2: ( ( identList ':' type )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:81:4: ( identList ':' type )?
            {
            root_0 = (OberonNode)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:81:4: ( identList ':' type )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LETTER) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:81:5: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList543);
                    identList75=identList();

                    state._fsp--;

                    adaptor.addChild(root_0, identList75.getTree());
                    char_literal76=(Token)match(input,44,FOLLOW_44_in_fieldList545); 
                    char_literal76_tree = (OberonNode)adaptor.create(char_literal76);
                    adaptor.addChild(root_0, char_literal76_tree);

                    pushFollow(FOLLOW_type_in_fieldList547);
                    type77=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type77.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:82:1: recordType : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final OberonParser.recordType_return recordType() throws RecognitionException {
        OberonParser.recordType_return retval = new OberonParser.recordType_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal78=null;
        Token char_literal80=null;
        Token string_literal82=null;
        OberonParser.fieldList_return fieldList79 = null;

        OberonParser.fieldList_return fieldList81 = null;


        OberonNode string_literal78_tree=null;
        OberonNode char_literal80_tree=null;
        OberonNode string_literal82_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:83:2: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:83:4: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            root_0 = (OberonNode)adaptor.nil();

            string_literal78=(Token)match(input,45,FOLLOW_45_in_recordType558); 
            string_literal78_tree = (OberonNode)adaptor.create(string_literal78);
            adaptor.addChild(root_0, string_literal78_tree);

            pushFollow(FOLLOW_fieldList_in_recordType560);
            fieldList79=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList79.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:83:23: ( ';' fieldList )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:83:24: ';' fieldList
            	    {
            	    char_literal80=(Token)match(input,41,FOLLOW_41_in_recordType563); 
            	    char_literal80_tree = (OberonNode)adaptor.create(char_literal80);
            	    adaptor.addChild(root_0, char_literal80_tree);

            	    pushFollow(FOLLOW_fieldList_in_recordType566);
            	    fieldList81=fieldList();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldList81.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            string_literal82=(Token)match(input,38,FOLLOW_38_in_recordType570); 
            string_literal82_tree = (OberonNode)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:85:1: type : ( ident -> ident | arrayType -> arrayType | recordType -> recordType );
    public final OberonParser.type_return type() throws RecognitionException {
        OberonParser.type_return retval = new OberonParser.type_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        OberonParser.ident_return ident83 = null;

        OberonParser.arrayType_return arrayType84 = null;

        OberonParser.recordType_return recordType85 = null;


        RewriteRuleSubtreeStream stream_arrayType=new RewriteRuleSubtreeStream(adaptor,"rule arrayType");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_recordType=new RewriteRuleSubtreeStream(adaptor,"rule recordType");
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:85:6: ( ident -> ident | arrayType -> arrayType | recordType -> recordType )
            int alt21=3;
            switch ( input.LA(1) ) {
            case LETTER:
                {
                alt21=1;
                }
                break;
            case 42:
                {
                alt21=2;
                }
                break;
            case 45:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:85:8: ident
                    {
                    pushFollow(FOLLOW_ident_in_type580);
                    ident83=ident();

                    state._fsp--;

                    stream_ident.add(ident83.getTree());


                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (OberonNode)adaptor.nil();
                    // 85:14: -> ident
                    {
                        adaptor.addChild(root_0, stream_ident.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:86:5: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type591);
                    arrayType84=arrayType();

                    state._fsp--;

                    stream_arrayType.add(arrayType84.getTree());


                    // AST REWRITE
                    // elements: arrayType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (OberonNode)adaptor.nil();
                    // 86:15: -> arrayType
                    {
                        adaptor.addChild(root_0, stream_arrayType.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:87:5: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type601);
                    recordType85=recordType();

                    state._fsp--;

                    stream_recordType.add(recordType85.getTree());


                    // AST REWRITE
                    // elements: recordType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (OberonNode)adaptor.nil();
                    // 87:16: -> recordType
                    {
                        adaptor.addChild(root_0, stream_recordType.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class fPSection_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fPSection"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:89:1: fPSection : ( 'VAR' )? identList ':' type ;
    public final OberonParser.fPSection_return fPSection() throws RecognitionException {
        OberonParser.fPSection_return retval = new OberonParser.fPSection_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal86=null;
        Token char_literal88=null;
        OberonParser.identList_return identList87 = null;

        OberonParser.type_return type89 = null;


        OberonNode string_literal86_tree=null;
        OberonNode char_literal88_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:90:2: ( ( 'VAR' )? identList ':' type )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:90:4: ( 'VAR' )? identList ':' type
            {
            root_0 = (OberonNode)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:90:4: ( 'VAR' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==VARDEF) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:90:5: 'VAR'
                    {
                    string_literal86=(Token)match(input,VARDEF,FOLLOW_VARDEF_in_fPSection615); 
                    string_literal86_tree = (OberonNode)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection619);
            identList87=identList();

            state._fsp--;

            adaptor.addChild(root_0, identList87.getTree());
            char_literal88=(Token)match(input,44,FOLLOW_44_in_fPSection621); 
            char_literal88_tree = (OberonNode)adaptor.create(char_literal88);
            adaptor.addChild(root_0, char_literal88_tree);

            pushFollow(FOLLOW_type_in_fPSection623);
            type89=type();

            state._fsp--;

            adaptor.addChild(root_0, type89.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fPSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:92:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' ;
    public final OberonParser.formalParameters_return formalParameters() throws RecognitionException {
        OberonParser.formalParameters_return retval = new OberonParser.formalParameters_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal90=null;
        Token char_literal92=null;
        Token char_literal94=null;
        OberonParser.fPSection_return fPSection91 = null;

        OberonParser.fPSection_return fPSection93 = null;


        OberonNode char_literal90_tree=null;
        OberonNode char_literal92_tree=null;
        OberonNode char_literal94_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:93:2: ( '(' ( fPSection ( ';' fPSection )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:93:4: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            root_0 = (OberonNode)adaptor.nil();

            char_literal90=(Token)match(input,16,FOLLOW_16_in_formalParameters632); 
            char_literal90_tree = (OberonNode)adaptor.create(char_literal90);
            adaptor.addChild(root_0, char_literal90_tree);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:93:8: ( fPSection ( ';' fPSection )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==VARDEF||LA24_0==LETTER) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:93:9: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters635);
                    fPSection91=fPSection();

                    state._fsp--;

                    adaptor.addChild(root_0, fPSection91.getTree());
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:93:19: ( ';' fPSection )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==41) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:93:20: ';' fPSection
                    	    {
                    	    char_literal92=(Token)match(input,41,FOLLOW_41_in_formalParameters638); 
                    	    char_literal92_tree = (OberonNode)adaptor.create(char_literal92);
                    	    adaptor.addChild(root_0, char_literal92_tree);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters640);
                    	    fPSection93=fPSection();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fPSection93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal94=(Token)match(input,17,FOLLOW_17_in_formalParameters646); 
            char_literal94_tree = (OberonNode)adaptor.create(char_literal94);
            adaptor.addChild(root_0, char_literal94_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class procedureBody_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:95:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' ident ;
    public final OberonParser.procedureBody_return procedureBody() throws RecognitionException {
        OberonParser.procedureBody_return retval = new OberonParser.procedureBody_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal96=null;
        Token string_literal98=null;
        OberonParser.declarations_return declarations95 = null;

        OberonParser.statementSequence_return statementSequence97 = null;

        OberonParser.ident_return ident99 = null;


        OberonNode string_literal96_tree=null;
        OberonNode string_literal98_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:96:2: ( declarations ( 'BEGIN' statementSequence )? 'END' ident )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:96:4: declarations ( 'BEGIN' statementSequence )? 'END' ident
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedureBody655);
            declarations95=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations95.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:96:17: ( 'BEGIN' statementSequence )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:96:18: 'BEGIN' statementSequence
                    {
                    string_literal96=(Token)match(input,46,FOLLOW_46_in_procedureBody658); 
                    string_literal96_tree = (OberonNode)adaptor.create(string_literal96);
                    adaptor.addChild(root_0, string_literal96_tree);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody660);
                    statementSequence97=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence97.getTree());

                    }
                    break;

            }

            string_literal98=(Token)match(input,38,FOLLOW_38_in_procedureBody664); 
            string_literal98_tree = (OberonNode)adaptor.create(string_literal98);
            adaptor.addChild(root_0, string_literal98_tree);

            pushFollow(FOLLOW_ident_in_procedureBody666);
            ident99=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident99.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class procedureHeading_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureHeading"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:98:1: procedureHeading : 'PROCEDURE' ident ( formalParameters )? -> ^( ident ( ^( formalParameters ) )? ) ;
    public final OberonParser.procedureHeading_return procedureHeading() throws RecognitionException {
        OberonParser.procedureHeading_return retval = new OberonParser.procedureHeading_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal100=null;
        OberonParser.ident_return ident101 = null;

        OberonParser.formalParameters_return formalParameters102 = null;


        OberonNode string_literal100_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:99:2: ( 'PROCEDURE' ident ( formalParameters )? -> ^( ident ( ^( formalParameters ) )? ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:99:4: 'PROCEDURE' ident ( formalParameters )?
            {
            string_literal100=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading676);  
            stream_PROCEDURE.add(string_literal100);

            pushFollow(FOLLOW_ident_in_procedureHeading678);
            ident101=ident();

            state._fsp--;

            stream_ident.add(ident101.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:99:22: ( formalParameters )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:99:23: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading681);
                    formalParameters102=formalParameters();

                    state._fsp--;

                    stream_formalParameters.add(formalParameters102.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ident, formalParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (OberonNode)adaptor.nil();
            // 100:2: -> ^( ident ( ^( formalParameters ) )? )
            {
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:100:5: ^( ident ( ^( formalParameters ) )? )
                {
                OberonNode root_1 = (OberonNode)adaptor.nil();
                root_1 = (OberonNode)adaptor.becomeRoot(stream_ident.nextNode(), root_1);

                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:100:13: ( ^( formalParameters ) )?
                if ( stream_formalParameters.hasNext() ) {
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:100:13: ^( formalParameters )
                    {
                    OberonNode root_2 = (OberonNode)adaptor.nil();
                    root_2 = (OberonNode)adaptor.becomeRoot(stream_formalParameters.nextNode(), root_2);

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_formalParameters.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureHeading"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:102:1: procedureDeclaration : procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) ;
    public final OberonParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        OberonParser.procedureDeclaration_return retval = new OberonParser.procedureDeclaration_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal104=null;
        OberonParser.procedureHeading_return procedureHeading103 = null;

        OberonParser.procedureBody_return procedureBody105 = null;


        OberonNode char_literal104_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:103:2: ( procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:103:4: procedureHeading ';' procedureBody
            {
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration704);
            procedureHeading103=procedureHeading();

            state._fsp--;

            stream_procedureHeading.add(procedureHeading103.getTree());
            char_literal104=(Token)match(input,41,FOLLOW_41_in_procedureDeclaration706);  
            stream_41.add(char_literal104);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration708);
            procedureBody105=procedureBody();

            state._fsp--;

            stream_procedureBody.add(procedureBody105.getTree());


            // AST REWRITE
            // elements: procedureBody, procedureHeading
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (OberonNode)adaptor.nil();
            // 104:2: -> ^( PROCEDURE procedureHeading procedureBody )
            {
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:104:5: ^( PROCEDURE procedureHeading procedureBody )
                {
                OberonNode root_1 = (OberonNode)adaptor.nil();
                root_1 = (OberonNode)adaptor.becomeRoot((OberonNode)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                adaptor.addChild(root_1, stream_procedureHeading.nextTree());
                adaptor.addChild(root_1, stream_procedureBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class procedureDeclarations_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:106:1: procedureDeclarations : ( procedureDeclaration ';' )? ;
    public final OberonParser.procedureDeclarations_return procedureDeclarations() throws RecognitionException {
        OberonParser.procedureDeclarations_return retval = new OberonParser.procedureDeclarations_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token char_literal107=null;
        OberonParser.procedureDeclaration_return procedureDeclaration106 = null;


        OberonNode char_literal107_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:107:2: ( ( procedureDeclaration ';' )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:107:4: ( procedureDeclaration ';' )?
            {
            root_0 = (OberonNode)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:107:4: ( procedureDeclaration ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==PROCEDURE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:107:5: procedureDeclaration ';'
                    {
                    pushFollow(FOLLOW_procedureDeclaration_in_procedureDeclarations729);
                    procedureDeclaration106=procedureDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, procedureDeclaration106.getTree());
                    char_literal107=(Token)match(input,41,FOLLOW_41_in_procedureDeclarations731); 
                    char_literal107_tree = (OberonNode)adaptor.create(char_literal107);
                    adaptor.addChild(root_0, char_literal107_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureDeclarations"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:109:1: varDeclarations : ( VARDEF ( identList ':' type ';' )* )? -> ( ( ^( VARDEF ( identList )? type ) )* )? ;
    public final OberonParser.varDeclarations_return varDeclarations() throws RecognitionException {
        OberonParser.varDeclarations_return retval = new OberonParser.varDeclarations_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token VARDEF108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        OberonParser.identList_return identList109 = null;

        OberonParser.type_return type111 = null;


        OberonNode VARDEF108_tree=null;
        OberonNode char_literal110_tree=null;
        OberonNode char_literal112_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_VARDEF=new RewriteRuleTokenStream(adaptor,"token VARDEF");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:2: ( ( VARDEF ( identList ':' type ';' )* )? -> ( ( ^( VARDEF ( identList )? type ) )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:4: ( VARDEF ( identList ':' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:4: ( VARDEF ( identList ':' type ';' )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==VARDEF) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:5: VARDEF ( identList ':' type ';' )*
                    {
                    VARDEF108=(Token)match(input,VARDEF,FOLLOW_VARDEF_in_varDeclarations743);  
                    stream_VARDEF.add(VARDEF108);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:12: ( identList ':' type ';' )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==LETTER) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:13: identList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_varDeclarations746);
                    	    identList109=identList();

                    	    state._fsp--;

                    	    stream_identList.add(identList109.getTree());
                    	    char_literal110=(Token)match(input,44,FOLLOW_44_in_varDeclarations748);  
                    	    stream_44.add(char_literal110);

                    	    pushFollow(FOLLOW_type_in_varDeclarations750);
                    	    type111=type();

                    	    state._fsp--;

                    	    stream_type.add(type111.getTree());
                    	    char_literal112=(Token)match(input,41,FOLLOW_41_in_varDeclarations752);  
                    	    stream_41.add(char_literal112);


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: identList, VARDEF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (OberonNode)adaptor.nil();
            // 111:2: -> ( ( ^( VARDEF ( identList )? type ) )* )?
            {
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:111:6: ( ( ^( VARDEF ( identList )? type ) )* )?
                if ( stream_VARDEF.hasNext()||stream_type.hasNext() ) {
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:111:8: ( ^( VARDEF ( identList )? type ) )*
                    while ( stream_VARDEF.hasNext()||stream_type.hasNext() ) {
                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:111:8: ^( VARDEF ( identList )? type )
                        {
                        OberonNode root_1 = (OberonNode)adaptor.nil();
                        root_1 = (OberonNode)adaptor.becomeRoot(stream_VARDEF.nextNode(), root_1);

                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:111:17: ( identList )?
                        if ( stream_identList.hasNext() ) {
                            adaptor.addChild(root_1, stream_identList.nextTree());

                        }
                        stream_identList.reset();
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    stream_VARDEF.reset();
                    stream_type.reset();

                }
                stream_VARDEF.reset();
                stream_type.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class typeDeclarations_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:113:1: typeDeclarations : ( TYPEDEF ( ident '=' type ';' )* )? -> ( ( ^( TYPEDEF ident type ) )* )? ;
    public final OberonParser.typeDeclarations_return typeDeclarations() throws RecognitionException {
        OberonParser.typeDeclarations_return retval = new OberonParser.typeDeclarations_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token TYPEDEF113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        OberonParser.ident_return ident114 = null;

        OberonParser.type_return type116 = null;


        OberonNode TYPEDEF113_tree=null;
        OberonNode char_literal115_tree=null;
        OberonNode char_literal117_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:2: ( ( TYPEDEF ( ident '=' type ';' )* )? -> ( ( ^( TYPEDEF ident type ) )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:4: ( TYPEDEF ( ident '=' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:4: ( TYPEDEF ( ident '=' type ';' )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==TYPEDEF) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:5: TYPEDEF ( ident '=' type ';' )*
                    {
                    TYPEDEF113=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typeDeclarations786);  
                    stream_TYPEDEF.add(TYPEDEF113);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:13: ( ident '=' type ';' )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==LETTER) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:14: ident '=' type ';'
                    	    {
                    	    pushFollow(FOLLOW_ident_in_typeDeclarations789);
                    	    ident114=ident();

                    	    state._fsp--;

                    	    stream_ident.add(ident114.getTree());
                    	    char_literal115=(Token)match(input,26,FOLLOW_26_in_typeDeclarations791);  
                    	    stream_26.add(char_literal115);

                    	    pushFollow(FOLLOW_type_in_typeDeclarations793);
                    	    type116=type();

                    	    state._fsp--;

                    	    stream_type.add(type116.getTree());
                    	    char_literal117=(Token)match(input,41,FOLLOW_41_in_typeDeclarations795);  
                    	    stream_41.add(char_literal117);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: type, TYPEDEF, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (OberonNode)adaptor.nil();
            // 115:2: -> ( ( ^( TYPEDEF ident type ) )* )?
            {
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:115:6: ( ( ^( TYPEDEF ident type ) )* )?
                if ( stream_TYPEDEF.hasNext()||stream_type.hasNext()||stream_ident.hasNext() ) {
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:115:8: ( ^( TYPEDEF ident type ) )*
                    while ( stream_type.hasNext()||stream_TYPEDEF.hasNext()||stream_ident.hasNext() ) {
                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:115:8: ^( TYPEDEF ident type )
                        {
                        OberonNode root_1 = (OberonNode)adaptor.nil();
                        root_1 = (OberonNode)adaptor.becomeRoot(stream_TYPEDEF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    stream_type.reset();
                    stream_TYPEDEF.reset();
                    stream_ident.reset();

                }
                stream_TYPEDEF.reset();
                stream_type.reset();
                stream_ident.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typeDeclarations"

    public static class constantDeclarations_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:117:1: constantDeclarations : ( CONSTDEF ( ident '=' expression ';' )* )? -> ( ( ^( CONSTDEF ident expression ) )* )? ;
    public final OberonParser.constantDeclarations_return constantDeclarations() throws RecognitionException {
        OberonParser.constantDeclarations_return retval = new OberonParser.constantDeclarations_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token CONSTDEF118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        OberonParser.ident_return ident119 = null;

        OberonParser.expression_return expression121 = null;


        OberonNode CONSTDEF118_tree=null;
        OberonNode char_literal120_tree=null;
        OberonNode char_literal122_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_CONSTDEF=new RewriteRuleTokenStream(adaptor,"token CONSTDEF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:2: ( ( CONSTDEF ( ident '=' expression ';' )* )? -> ( ( ^( CONSTDEF ident expression ) )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:4: ( CONSTDEF ( ident '=' expression ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:4: ( CONSTDEF ( ident '=' expression ';' )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==CONSTDEF) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:5: CONSTDEF ( ident '=' expression ';' )*
                    {
                    CONSTDEF118=(Token)match(input,CONSTDEF,FOLLOW_CONSTDEF_in_constantDeclarations826);  
                    stream_CONSTDEF.add(CONSTDEF118);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:14: ( ident '=' expression ';' )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==LETTER) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:15: ident '=' expression ';'
                    	    {
                    	    pushFollow(FOLLOW_ident_in_constantDeclarations829);
                    	    ident119=ident();

                    	    state._fsp--;

                    	    stream_ident.add(ident119.getTree());
                    	    char_literal120=(Token)match(input,26,FOLLOW_26_in_constantDeclarations831);  
                    	    stream_26.add(char_literal120);

                    	    pushFollow(FOLLOW_expression_in_constantDeclarations833);
                    	    expression121=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression121.getTree());
                    	    char_literal122=(Token)match(input,41,FOLLOW_41_in_constantDeclarations835);  
                    	    stream_41.add(char_literal122);


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ident, expression, CONSTDEF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (OberonNode)adaptor.nil();
            // 119:2: -> ( ( ^( CONSTDEF ident expression ) )* )?
            {
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:119:6: ( ( ^( CONSTDEF ident expression ) )* )?
                if ( stream_ident.hasNext()||stream_expression.hasNext()||stream_CONSTDEF.hasNext() ) {
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:119:8: ( ^( CONSTDEF ident expression ) )*
                    while ( stream_ident.hasNext()||stream_expression.hasNext()||stream_CONSTDEF.hasNext() ) {
                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:119:8: ^( CONSTDEF ident expression )
                        {
                        OberonNode root_1 = (OberonNode)adaptor.nil();
                        root_1 = (OberonNode)adaptor.becomeRoot(stream_CONSTDEF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    stream_ident.reset();
                    stream_expression.reset();
                    stream_CONSTDEF.reset();

                }
                stream_ident.reset();
                stream_expression.reset();
                stream_CONSTDEF.reset();

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constantDeclarations"

    public static class declarations_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:121:1: declarations : constantDeclarations typeDeclarations varDeclarations procedureDeclarations ;
    public final OberonParser.declarations_return declarations() throws RecognitionException {
        OberonParser.declarations_return retval = new OberonParser.declarations_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        OberonParser.constantDeclarations_return constantDeclarations123 = null;

        OberonParser.typeDeclarations_return typeDeclarations124 = null;

        OberonParser.varDeclarations_return varDeclarations125 = null;

        OberonParser.procedureDeclarations_return procedureDeclarations126 = null;



        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:122:2: ( constantDeclarations typeDeclarations varDeclarations procedureDeclarations )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:122:4: constantDeclarations typeDeclarations varDeclarations procedureDeclarations
            {
            root_0 = (OberonNode)adaptor.nil();

            pushFollow(FOLLOW_constantDeclarations_in_declarations865);
            constantDeclarations123=constantDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, constantDeclarations123.getTree());
            pushFollow(FOLLOW_typeDeclarations_in_declarations867);
            typeDeclarations124=typeDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, typeDeclarations124.getTree());
            pushFollow(FOLLOW_varDeclarations_in_declarations869);
            varDeclarations125=varDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, varDeclarations125.getTree());
            pushFollow(FOLLOW_procedureDeclarations_in_declarations871);
            procedureDeclarations126=procedureDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, procedureDeclarations126.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarations"

    public static class module_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:124:1: module : 'MODULE' ident ';' declarations ( 'BEGIN' statementSequence )? 'END' ident '.' -> ^( ident ^( DECL declarations ) statementSequence ) ;
    public final OberonParser.module_return module() throws RecognitionException {
        OberonParser.module_return retval = new OberonParser.module_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        Token string_literal127=null;
        Token char_literal129=null;
        Token string_literal131=null;
        Token string_literal133=null;
        Token char_literal135=null;
        OberonParser.ident_return ident128 = null;

        OberonParser.declarations_return declarations130 = null;

        OberonParser.statementSequence_return statementSequence132 = null;

        OberonParser.ident_return ident134 = null;


        OberonNode string_literal127_tree=null;
        OberonNode char_literal129_tree=null;
        OberonNode string_literal131_tree=null;
        OberonNode string_literal133_tree=null;
        OberonNode char_literal135_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:124:8: ( 'MODULE' ident ';' declarations ( 'BEGIN' statementSequence )? 'END' ident '.' -> ^( ident ^( DECL declarations ) statementSequence ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:124:10: 'MODULE' ident ';' declarations ( 'BEGIN' statementSequence )? 'END' ident '.'
            {
            string_literal127=(Token)match(input,47,FOLLOW_47_in_module879);  
            stream_47.add(string_literal127);

            pushFollow(FOLLOW_ident_in_module881);
            ident128=ident();

            state._fsp--;

            stream_ident.add(ident128.getTree());
            char_literal129=(Token)match(input,41,FOLLOW_41_in_module883);  
            stream_41.add(char_literal129);

            pushFollow(FOLLOW_declarations_in_module885);
            declarations130=declarations();

            state._fsp--;

            stream_declarations.add(declarations130.getTree());
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:124:42: ( 'BEGIN' statementSequence )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:124:43: 'BEGIN' statementSequence
                    {
                    string_literal131=(Token)match(input,46,FOLLOW_46_in_module888);  
                    stream_46.add(string_literal131);

                    pushFollow(FOLLOW_statementSequence_in_module890);
                    statementSequence132=statementSequence();

                    state._fsp--;

                    stream_statementSequence.add(statementSequence132.getTree());

                    }
                    break;

            }

            string_literal133=(Token)match(input,38,FOLLOW_38_in_module894);  
            stream_38.add(string_literal133);

            pushFollow(FOLLOW_ident_in_module896);
            ident134=ident();

            state._fsp--;

            stream_ident.add(ident134.getTree());
            char_literal135=(Token)match(input,13,FOLLOW_13_in_module898);  
            stream_13.add(char_literal135);



            // AST REWRITE
            // elements: statementSequence, declarations, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (OberonNode)adaptor.nil();
            // 125:2: -> ^( ident ^( DECL declarations ) statementSequence )
            {
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:125:6: ^( ident ^( DECL declarations ) statementSequence )
                {
                OberonNode root_1 = (OberonNode)adaptor.nil();
                root_1 = (OberonNode)adaptor.becomeRoot(stream_ident.nextNode(), root_1);

                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:125:14: ^( DECL declarations )
                {
                OberonNode root_2 = (OberonNode)adaptor.nil();
                root_2 = (OberonNode)adaptor.becomeRoot((OberonNode)adaptor.create(DECL, "DECL"), root_2);

                adaptor.addChild(root_2, stream_declarations.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_statementSequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "module"

    public static class program_return extends ParserRuleReturnScope {
        OberonNode tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:127:1: program : ( module )* ;
    public final OberonParser.program_return program() throws RecognitionException {
        OberonParser.program_return retval = new OberonParser.program_return();
        retval.start = input.LT(1);

        OberonNode root_0 = null;

        OberonParser.module_return module136 = null;



        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:127:9: ( ( module )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:127:11: ( module )*
            {
            root_0 = (OberonNode)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:127:11: ( module )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==47) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:127:11: module
            	    {
            	    pushFollow(FOLLOW_module_in_program923);
            	    module136=module();

            	    state._fsp--;

            	    adaptor.addChild(root_0, module136.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (OberonNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (OberonNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    // Delegated rules


 

    public static final BitSet FOLLOW_LETTER_in_ident142 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_ident144 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_DIGIT_in_integer160 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DIGIT_in_integer163 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_integer_in_number173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_selector181 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_selector183 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_14_in_selector187 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_selector189 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_selector191 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ident_in_factor204 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_selector_in_factor206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_factor214 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_factor216 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_factor218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_factor222 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_factor_in_factor224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term233 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_set_in_term236 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_factor_in_term252 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_set_in_simpleExpression265 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_term_in_simpleExpression274 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_set_in_simpleExpression277 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_term_in_simpleExpression287 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression299 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_set_in_expression302 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_simpleExpression_in_expression326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment339 = new BitSet(new long[]{0x0000000100006000L});
    public static final BitSet FOLLOW_selector_in_assignment341 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignment343 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_assignment345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_actualParameters355 = new BitSet(new long[]{0x0000000001871800L});
    public static final BitSet FOLLOW_expression_in_actualParameters358 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_actualParameters361 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_actualParameters363 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_17_in_actualParameters369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_procedureCall380 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_selector_in_procedureCall382 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_subCall395 = new BitSet(new long[]{0x0000000100016000L});
    public static final BitSet FOLLOW_selector_in_subCall397 = new BitSet(new long[]{0x0000000100010002L});
    public static final BitSet FOLLOW_32_in_subCall400 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_subCall402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_subCall407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ifStatement419 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_ifStatement421 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifStatement423 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement425 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_36_in_ifStatement428 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_ifStatement430 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifStatement432 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement434 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_37_in_ifStatement439 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement441 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ifStatement445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_whileStatement454 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_whileStatement456 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_whileStatement458 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement460 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_whileStatement462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subCall_in_statement474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence494 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_statementSequence497 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statement_in_statementSequence499 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ident_in_identList510 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_identList513 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_identList515 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_42_in_arrayType527 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_arrayType529 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_arrayType531 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_arrayType533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList543 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_fieldList545 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_fieldList547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_recordType558 = new BitSet(new long[]{0x0000024000000800L});
    public static final BitSet FOLLOW_fieldList_in_recordType560 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_recordType563 = new BitSet(new long[]{0x0000024000000800L});
    public static final BitSet FOLLOW_fieldList_in_recordType566 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_recordType570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDEF_in_fPSection615 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_identList_in_fPSection619 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_fPSection621 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_fPSection623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_formalParameters632 = new BitSet(new long[]{0x0000000000020900L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters635 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_formalParameters638 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters640 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_formalParameters646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody655 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_46_in_procedureBody658 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody660 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procedureBody664 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_procedureBody666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading676 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_procedureHeading678 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration704 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_procedureDeclaration706 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_procedureDeclarations729 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_procedureDeclarations731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDEF_in_varDeclarations743 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_identList_in_varDeclarations746 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_varDeclarations748 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_varDeclarations750 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_varDeclarations752 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_TYPEDEF_in_typeDeclarations786 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ident_in_typeDeclarations789 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_typeDeclarations791 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_typeDeclarations793 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_typeDeclarations795 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_CONSTDEF_in_constantDeclarations826 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ident_in_constantDeclarations829 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_constantDeclarations831 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations833 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_constantDeclarations835 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations865 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations867 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations869 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_module879 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_module881 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_module883 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_declarations_in_module885 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_46_in_module888 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_module890 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_module894 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_module896 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_module898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_module_in_program923 = new BitSet(new long[]{0x0000800000000002L});

}