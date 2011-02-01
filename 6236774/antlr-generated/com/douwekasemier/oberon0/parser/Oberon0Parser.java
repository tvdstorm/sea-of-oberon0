// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g 2011-02-01 13:34:50

  package com.douwekasemier.oberon0.parser; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "INTEGER", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'['", "']'", "'('", "')'", "'~'", "'*'", "'DIV'", "'MOD'", "'&'", "'+'", "'-'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>='", "'>'", "':='", "','", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'VAR'", "'PROCEDURE'", "'CONST'", "'TYPE'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
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
    public static final int IDENTIFIER=4;
    public static final int INTEGER=5;
    public static final int WHITESPACE=6;

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
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g"; }


    public static class module_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:15:1: module : 'MODULE' identifier ';' declarations ( 'BEGIN' statementSequence )? 'END' identifier '.' ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal1=null;
        Token char_literal3=null;
        Token string_literal5=null;
        Token string_literal7=null;
        Token char_literal9=null;
        Oberon0Parser.identifier_return identifier2 = null;

        Oberon0Parser.declarations_return declarations4 = null;

        Oberon0Parser.statementSequence_return statementSequence6 = null;

        Oberon0Parser.identifier_return identifier8 = null;


        CommonTree string_literal1_tree=null;
        CommonTree char_literal3_tree=null;
        CommonTree string_literal5_tree=null;
        CommonTree string_literal7_tree=null;
        CommonTree char_literal9_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:16:3: ( 'MODULE' identifier ';' declarations ( 'BEGIN' statementSequence )? 'END' identifier '.' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:16:5: 'MODULE' identifier ';' declarations ( 'BEGIN' statementSequence )? 'END' identifier '.'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal1=(Token)match(input,7,FOLLOW_7_in_module53); 
            string_literal1_tree = (CommonTree)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);

            pushFollow(FOLLOW_identifier_in_module55);
            identifier2=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier2.getTree());
            char_literal3=(Token)match(input,8,FOLLOW_8_in_module57); 
            char_literal3_tree = (CommonTree)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            pushFollow(FOLLOW_declarations_in_module59);
            declarations4=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations4.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:17:5: ( 'BEGIN' statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:17:6: 'BEGIN' statementSequence
                    {
                    string_literal5=(Token)match(input,9,FOLLOW_9_in_module66); 
                    string_literal5_tree = (CommonTree)adaptor.create(string_literal5);
                    adaptor.addChild(root_0, string_literal5_tree);

                    pushFollow(FOLLOW_statementSequence_in_module68);
                    statementSequence6=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence6.getTree());

                    }
                    break;

            }

            string_literal7=(Token)match(input,10,FOLLOW_10_in_module72); 
            string_literal7_tree = (CommonTree)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);

            pushFollow(FOLLOW_identifier_in_module74);
            identifier8=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier8.getTree());
            char_literal9=(Token)match(input,11,FOLLOW_11_in_module76); 
            char_literal9_tree = (CommonTree)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:20:1: identifier : IDENTIFIER ;
    public final Oberon0Parser.identifier_return identifier() throws RecognitionException {
        Oberon0Parser.identifier_return retval = new Oberon0Parser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER10=null;

        CommonTree IDENTIFIER10_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:21:3: ( IDENTIFIER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:21:5: IDENTIFIER
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENTIFIER10=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier93); 
            IDENTIFIER10_tree = (CommonTree)adaptor.create(IDENTIFIER10);
            adaptor.addChild(root_0, IDENTIFIER10_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "identifier"

    public static class integer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:24:1: integer : INTEGER ;
    public final Oberon0Parser.integer_return integer() throws RecognitionException {
        Oberon0Parser.integer_return retval = new Oberon0Parser.integer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER11=null;

        CommonTree INTEGER11_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:25:3: ( INTEGER )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:25:5: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER11=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer108); 
            INTEGER11_tree = (CommonTree)adaptor.create(INTEGER11);
            adaptor.addChild(root_0, INTEGER11_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "integer"

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:28:1: selector : ( ( '.' identifier | '[' expression ']' )? | identifier );
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal12=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Oberon0Parser.identifier_return identifier13 = null;

        Oberon0Parser.expression_return expression15 = null;

        Oberon0Parser.identifier_return identifier17 = null;


        CommonTree char_literal12_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal16_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:29:3: ( ( '.' identifier | '[' expression ']' )? | identifier )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==8||(LA3_0>=10 && LA3_0<=13)||LA3_0==15||(LA3_0>=17 && LA3_0<=31)||(LA3_0>=33 && LA3_0<=35)||LA3_0==37||LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==IDENTIFIER) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:29:5: ( '.' identifier | '[' expression ']' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:29:5: ( '.' identifier | '[' expression ']' )?
                    int alt2=3;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==11) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==12) ) {
                        alt2=2;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:29:6: '.' identifier
                            {
                            char_literal12=(Token)match(input,11,FOLLOW_11_in_selector124); 
                            char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
                            adaptor.addChild(root_0, char_literal12_tree);

                            pushFollow(FOLLOW_identifier_in_selector126);
                            identifier13=identifier();

                            state._fsp--;

                            adaptor.addChild(root_0, identifier13.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:29:23: '[' expression ']'
                            {
                            char_literal14=(Token)match(input,12,FOLLOW_12_in_selector130); 
                            char_literal14_tree = (CommonTree)adaptor.create(char_literal14);
                            adaptor.addChild(root_0, char_literal14_tree);

                            pushFollow(FOLLOW_expression_in_selector132);
                            expression15=expression();

                            state._fsp--;

                            adaptor.addChild(root_0, expression15.getTree());
                            char_literal16=(Token)match(input,13,FOLLOW_13_in_selector134); 
                            char_literal16_tree = (CommonTree)adaptor.create(char_literal16);
                            adaptor.addChild(root_0, char_literal16_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:30:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_selector142);
                    identifier17=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier17.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:33:1: factor : ( identifier selector | integer | '(' expression ')' | '~' factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        Token char_literal24=null;
        Oberon0Parser.identifier_return identifier18 = null;

        Oberon0Parser.selector_return selector19 = null;

        Oberon0Parser.integer_return integer20 = null;

        Oberon0Parser.expression_return expression22 = null;

        Oberon0Parser.factor_return factor25 = null;


        CommonTree char_literal21_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree char_literal24_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:34:3: ( identifier selector | integer | '(' expression ')' | '~' factor )
            int alt4=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt4=1;
                }
                break;
            case INTEGER:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 16:
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:34:5: identifier selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_factor157);
                    identifier18=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier18.getTree());
                    pushFollow(FOLLOW_selector_in_factor159);
                    selector19=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector19.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:35:5: integer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_integer_in_factor165);
                    integer20=integer();

                    state._fsp--;

                    adaptor.addChild(root_0, integer20.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:36:5: '(' expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal21=(Token)match(input,14,FOLLOW_14_in_factor171); 
                    char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);

                    pushFollow(FOLLOW_expression_in_factor173);
                    expression22=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression22.getTree());
                    char_literal23=(Token)match(input,15,FOLLOW_15_in_factor175); 
                    char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);


                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:37:5: '~' factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal24=(Token)match(input,16,FOLLOW_16_in_factor181); 
                    char_literal24_tree = (CommonTree)adaptor.create(char_literal24);
                    adaptor.addChild(root_0, char_literal24_tree);

                    pushFollow(FOLLOW_factor_in_factor183);
                    factor25=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:40:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set27=null;
        Oberon0Parser.factor_return factor26 = null;

        Oberon0Parser.factor_return factor28 = null;


        CommonTree set27_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:41:3: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:41:5: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term198);
            factor26=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor26.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:41:12: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=20)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:41:13: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    set27=(Token)input.LT(1);
            	    if ( (input.LA(1)>=17 && input.LA(1)<=20) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set27));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term218);
            	    factor28=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor28.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:44:1: simpleExpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;
        Token set31=null;
        Oberon0Parser.term_return term30 = null;

        Oberon0Parser.term_return term32 = null;


        CommonTree set29_tree=null;
        CommonTree set31_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:45:3: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:45:5: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:45:5: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=21 && LA6_0<=22)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:
                    {
                    set29=(Token)input.LT(1);
                    if ( (input.LA(1)>=21 && input.LA(1)<=22) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set29));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression242);
            term30=term();

            state._fsp--;

            adaptor.addChild(root_0, term30.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:45:21: ( ( '+' | '-' | 'OR' ) term )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=21 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:45:22: ( '+' | '-' | 'OR' ) term
            	    {
            	    set31=(Token)input.LT(1);
            	    if ( (input.LA(1)>=21 && input.LA(1)<=23) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (CommonTree)adaptor.create(set31));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression258);
            	    term32=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term32.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:48:1: expression : simpleExpression ( ( '=' | '#' | '<' | '<=' | '>=' | '>' ) simpleExpression )? ;
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set34=null;
        Oberon0Parser.simpleExpression_return simpleExpression33 = null;

        Oberon0Parser.simpleExpression_return simpleExpression35 = null;


        CommonTree set34_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:49:3: ( simpleExpression ( ( '=' | '#' | '<' | '<=' | '>=' | '>' ) simpleExpression )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:49:5: simpleExpression ( ( '=' | '#' | '<' | '<=' | '>=' | '>' ) simpleExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression275);
            simpleExpression33=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, simpleExpression33.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:49:22: ( ( '=' | '#' | '<' | '<=' | '>=' | '>' ) simpleExpression )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=24 && LA8_0<=29)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:49:23: ( '=' | '#' | '<' | '<=' | '>=' | '>' ) simpleExpression
                    {
                    set34=(Token)input.LT(1);
                    if ( (input.LA(1)>=24 && input.LA(1)<=29) ) {
                        input.consume();
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(set34));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression302);
                    simpleExpression35=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleExpression35.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:52:1: assignment : identifier selector ':=' expression ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal38=null;
        Oberon0Parser.identifier_return identifier36 = null;

        Oberon0Parser.selector_return selector37 = null;

        Oberon0Parser.expression_return expression39 = null;


        CommonTree string_literal38_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:53:3: ( identifier selector ':=' expression )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:53:5: identifier selector ':=' expression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_assignment319);
            identifier36=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier36.getTree());
            pushFollow(FOLLOW_selector_in_assignment321);
            selector37=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector37.getTree());
            string_literal38=(Token)match(input,30,FOLLOW_30_in_assignment323); 
            string_literal38_tree = (CommonTree)adaptor.create(string_literal38);
            adaptor.addChild(root_0, string_literal38_tree);

            pushFollow(FOLLOW_expression_in_assignment325);
            expression39=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression39.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class actualParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:56:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Oberon0Parser.expression_return expression41 = null;

        Oberon0Parser.expression_return expression43 = null;


        CommonTree char_literal40_tree=null;
        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:57:3: ( '(' ( expression ( ',' expression )* )? ')' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:57:5: '(' ( expression ( ',' expression )* )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal40=(Token)match(input,14,FOLLOW_14_in_actualParameters338); 
            char_literal40_tree = (CommonTree)adaptor.create(char_literal40);
            adaptor.addChild(root_0, char_literal40_tree);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:57:9: ( expression ( ',' expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=IDENTIFIER && LA10_0<=INTEGER)||LA10_0==14||LA10_0==16||(LA10_0>=21 && LA10_0<=22)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:57:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters341);
                    expression41=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression41.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:57:21: ( ',' expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==31) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:57:22: ',' expression
                    	    {
                    	    char_literal42=(Token)match(input,31,FOLLOW_31_in_actualParameters344); 
                    	    char_literal42_tree = (CommonTree)adaptor.create(char_literal42);
                    	    adaptor.addChild(root_0, char_literal42_tree);

                    	    pushFollow(FOLLOW_expression_in_actualParameters346);
                    	    expression43=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression43.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal44=(Token)match(input,15,FOLLOW_15_in_actualParameters352); 
            char_literal44_tree = (CommonTree)adaptor.create(char_literal44);
            adaptor.addChild(root_0, char_literal44_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class procedureCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:60:1: procedureCall : identifier ( actualParameters )? ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier45 = null;

        Oberon0Parser.actualParameters_return actualParameters46 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:61:3: ( identifier ( actualParameters )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:61:5: identifier ( actualParameters )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_procedureCall367);
            identifier45=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier45.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:61:16: ( actualParameters )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:61:16: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall369);
                    actualParameters46=actualParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualParameters46.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:64:1: ifStatement : 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal47=null;
        Token string_literal49=null;
        Token string_literal51=null;
        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal57=null;
        Oberon0Parser.expression_return expression48 = null;

        Oberon0Parser.statementSequence_return statementSequence50 = null;

        Oberon0Parser.expression_return expression52 = null;

        Oberon0Parser.statementSequence_return statementSequence54 = null;

        Oberon0Parser.statementSequence_return statementSequence56 = null;


        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;
        CommonTree string_literal51_tree=null;
        CommonTree string_literal53_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree string_literal57_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:65:3: ( 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:65:5: 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal47=(Token)match(input,32,FOLLOW_32_in_ifStatement385); 
            string_literal47_tree = (CommonTree)adaptor.create(string_literal47);
            adaptor.addChild(root_0, string_literal47_tree);

            pushFollow(FOLLOW_expression_in_ifStatement387);
            expression48=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression48.getTree());
            string_literal49=(Token)match(input,33,FOLLOW_33_in_ifStatement389); 
            string_literal49_tree = (CommonTree)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);

            pushFollow(FOLLOW_statementSequence_in_ifStatement391);
            statementSequence50=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence50.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:66:5: ( 'ELSIF' expression 'THEN' statementSequence )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:66:7: 'ELSIF' expression 'THEN' statementSequence
            	    {
            	    string_literal51=(Token)match(input,34,FOLLOW_34_in_ifStatement399); 
            	    string_literal51_tree = (CommonTree)adaptor.create(string_literal51);
            	    adaptor.addChild(root_0, string_literal51_tree);

            	    pushFollow(FOLLOW_expression_in_ifStatement401);
            	    expression52=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression52.getTree());
            	    string_literal53=(Token)match(input,33,FOLLOW_33_in_ifStatement403); 
            	    string_literal53_tree = (CommonTree)adaptor.create(string_literal53);
            	    adaptor.addChild(root_0, string_literal53_tree);

            	    pushFollow(FOLLOW_statementSequence_in_ifStatement405);
            	    statementSequence54=statementSequence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementSequence54.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:67:5: ( 'ELSE' statementSequence )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:67:7: 'ELSE' statementSequence
                    {
                    string_literal55=(Token)match(input,35,FOLLOW_35_in_ifStatement415); 
                    string_literal55_tree = (CommonTree)adaptor.create(string_literal55);
                    adaptor.addChild(root_0, string_literal55_tree);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement417);
                    statementSequence56=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence56.getTree());

                    }
                    break;

            }

            string_literal57=(Token)match(input,10,FOLLOW_10_in_ifStatement426); 
            string_literal57_tree = (CommonTree)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:71:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        Token string_literal60=null;
        Token string_literal62=null;
        Oberon0Parser.expression_return expression59 = null;

        Oberon0Parser.statementSequence_return statementSequence61 = null;


        CommonTree string_literal58_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal62_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:72:3: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:72:5: 'WHILE' expression 'DO' statementSequence 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal58=(Token)match(input,36,FOLLOW_36_in_whileStatement440); 
            string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
            adaptor.addChild(root_0, string_literal58_tree);

            pushFollow(FOLLOW_expression_in_whileStatement442);
            expression59=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression59.getTree());
            string_literal60=(Token)match(input,37,FOLLOW_37_in_whileStatement444); 
            string_literal60_tree = (CommonTree)adaptor.create(string_literal60);
            adaptor.addChild(root_0, string_literal60_tree);

            pushFollow(FOLLOW_statementSequence_in_whileStatement446);
            statementSequence61=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence61.getTree());
            string_literal62=(Token)match(input,10,FOLLOW_10_in_whileStatement448); 
            string_literal62_tree = (CommonTree)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:75:1: statement : ( assignment | procedureCall | ifStatement | whileStatement );
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment63 = null;

        Oberon0Parser.procedureCall_return procedureCall64 = null;

        Oberon0Parser.ifStatement_return ifStatement65 = null;

        Oberon0Parser.whileStatement_return whileStatement66 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:76:3: ( assignment | procedureCall | ifStatement | whileStatement )
            int alt14=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==IDENTIFIER||(LA14_1>=11 && LA14_1<=12)||LA14_1==30) ) {
                    alt14=1;
                }
                else if ( (LA14_1==8||LA14_1==10||LA14_1==14||(LA14_1>=34 && LA14_1<=35)) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:76:5: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement463);
                    assignment63=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment63.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:77:5: procedureCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureCall_in_statement469);
                    procedureCall64=procedureCall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedureCall64.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:78:5: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement475);
                    ifStatement65=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement65.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:79:5: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement481);
                    whileStatement66=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:82:1: statementSequence : statement ( ';' statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal68=null;
        Oberon0Parser.statement_return statement67 = null;

        Oberon0Parser.statement_return statement69 = null;


        CommonTree char_literal68_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:83:3: ( statement ( ';' statement )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:83:5: statement ( ';' statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence496);
            statement67=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement67.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:83:15: ( ';' statement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==8) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:83:16: ';' statement
            	    {
            	    char_literal68=(Token)match(input,8,FOLLOW_8_in_statementSequence499); 
            	    char_literal68_tree = (CommonTree)adaptor.create(char_literal68);
            	    adaptor.addChild(root_0, char_literal68_tree);

            	    pushFollow(FOLLOW_statement_in_statementSequence501);
            	    statement69=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement69.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class identifierList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierList"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:86:1: identifierList : identifier ( ',' identifier )* ;
    public final Oberon0Parser.identifierList_return identifierList() throws RecognitionException {
        Oberon0Parser.identifierList_return retval = new Oberon0Parser.identifierList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal71=null;
        Oberon0Parser.identifier_return identifier70 = null;

        Oberon0Parser.identifier_return identifier72 = null;


        CommonTree char_literal71_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:87:3: ( identifier ( ',' identifier )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:87:5: identifier ( ',' identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_identifierList518);
            identifier70=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier70.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:87:16: ( ',' identifier )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==31) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:87:17: ',' identifier
            	    {
            	    char_literal71=(Token)match(input,31,FOLLOW_31_in_identifierList521); 
            	    char_literal71_tree = (CommonTree)adaptor.create(char_literal71);
            	    adaptor.addChild(root_0, char_literal71_tree);

            	    pushFollow(FOLLOW_identifier_in_identifierList523);
            	    identifier72=identifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, identifier72.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "identifierList"

    public static class arrayType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:90:1: arrayType : 'ARRAY' expression 'OF' type ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal73=null;
        Token string_literal75=null;
        Oberon0Parser.expression_return expression74 = null;

        Oberon0Parser.type_return type76 = null;


        CommonTree string_literal73_tree=null;
        CommonTree string_literal75_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:91:3: ( 'ARRAY' expression 'OF' type )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:91:5: 'ARRAY' expression 'OF' type
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal73=(Token)match(input,38,FOLLOW_38_in_arrayType540); 
            string_literal73_tree = (CommonTree)adaptor.create(string_literal73);
            adaptor.addChild(root_0, string_literal73_tree);

            pushFollow(FOLLOW_expression_in_arrayType542);
            expression74=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression74.getTree());
            string_literal75=(Token)match(input,39,FOLLOW_39_in_arrayType544); 
            string_literal75_tree = (CommonTree)adaptor.create(string_literal75);
            adaptor.addChild(root_0, string_literal75_tree);

            pushFollow(FOLLOW_type_in_arrayType546);
            type76=type();

            state._fsp--;

            adaptor.addChild(root_0, type76.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:94:1: fieldList : ( identifierList ':' type )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal78=null;
        Oberon0Parser.identifierList_return identifierList77 = null;

        Oberon0Parser.type_return type79 = null;


        CommonTree char_literal78_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:95:3: ( ( identifierList ':' type )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:95:5: ( identifierList ':' type )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:95:5: ( identifierList ':' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENTIFIER) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:95:6: identifierList ':' type
                    {
                    pushFollow(FOLLOW_identifierList_in_fieldList560);
                    identifierList77=identifierList();

                    state._fsp--;

                    adaptor.addChild(root_0, identifierList77.getTree());
                    char_literal78=(Token)match(input,40,FOLLOW_40_in_fieldList562); 
                    char_literal78_tree = (CommonTree)adaptor.create(char_literal78);
                    adaptor.addChild(root_0, char_literal78_tree);

                    pushFollow(FOLLOW_type_in_fieldList564);
                    type79=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type79.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:98:1: recordType : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal80=null;
        Token char_literal82=null;
        Token string_literal84=null;
        Oberon0Parser.fieldList_return fieldList81 = null;

        Oberon0Parser.fieldList_return fieldList83 = null;


        CommonTree string_literal80_tree=null;
        CommonTree char_literal82_tree=null;
        CommonTree string_literal84_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:99:3: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:99:5: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal80=(Token)match(input,41,FOLLOW_41_in_recordType581); 
            string_literal80_tree = (CommonTree)adaptor.create(string_literal80);
            adaptor.addChild(root_0, string_literal80_tree);

            pushFollow(FOLLOW_fieldList_in_recordType583);
            fieldList81=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList81.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:99:24: ( ';' fieldList )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==8) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:99:25: ';' fieldList
            	    {
            	    char_literal82=(Token)match(input,8,FOLLOW_8_in_recordType586); 
            	    char_literal82_tree = (CommonTree)adaptor.create(char_literal82);
            	    adaptor.addChild(root_0, char_literal82_tree);

            	    pushFollow(FOLLOW_fieldList_in_recordType588);
            	    fieldList83=fieldList();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldList83.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            string_literal84=(Token)match(input,10,FOLLOW_10_in_recordType592); 
            string_literal84_tree = (CommonTree)adaptor.create(string_literal84);
            adaptor.addChild(root_0, string_literal84_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:102:1: type : ( identifier | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.identifier_return identifier85 = null;

        Oberon0Parser.arrayType_return arrayType86 = null;

        Oberon0Parser.recordType_return recordType87 = null;



        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:103:3: ( identifier | arrayType | recordType )
            int alt19=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case 41:
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
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:103:5: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_type605);
                    identifier85=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier85.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:104:5: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type611);
                    arrayType86=arrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayType86.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:105:5: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type617);
                    recordType87=recordType();

                    state._fsp--;

                    adaptor.addChild(root_0, recordType87.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class fpSection_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpSection"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:108:1: fpSection : ( 'VAR' )? identifierList ':' type ;
    public final Oberon0Parser.fpSection_return fpSection() throws RecognitionException {
        Oberon0Parser.fpSection_return retval = new Oberon0Parser.fpSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal88=null;
        Token char_literal90=null;
        Oberon0Parser.identifierList_return identifierList89 = null;

        Oberon0Parser.type_return type91 = null;


        CommonTree string_literal88_tree=null;
        CommonTree char_literal90_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:109:3: ( ( 'VAR' )? identifierList ':' type )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:109:5: ( 'VAR' )? identifierList ':' type
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:109:5: ( 'VAR' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:109:5: 'VAR'
                    {
                    string_literal88=(Token)match(input,42,FOLLOW_42_in_fpSection634); 
                    string_literal88_tree = (CommonTree)adaptor.create(string_literal88);
                    adaptor.addChild(root_0, string_literal88_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_identifierList_in_fpSection637);
            identifierList89=identifierList();

            state._fsp--;

            adaptor.addChild(root_0, identifierList89.getTree());
            char_literal90=(Token)match(input,40,FOLLOW_40_in_fpSection639); 
            char_literal90_tree = (CommonTree)adaptor.create(char_literal90);
            adaptor.addChild(root_0, char_literal90_tree);

            pushFollow(FOLLOW_type_in_fpSection641);
            type91=type();

            state._fsp--;

            adaptor.addChild(root_0, type91.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "fpSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:112:1: formalParameters : '(' ( fpSection ( ';' fpSection )* )? ')' ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Oberon0Parser.fpSection_return fpSection93 = null;

        Oberon0Parser.fpSection_return fpSection95 = null;


        CommonTree char_literal92_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree char_literal96_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:113:3: ( '(' ( fpSection ( ';' fpSection )* )? ')' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:113:5: '(' ( fpSection ( ';' fpSection )* )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal92=(Token)match(input,14,FOLLOW_14_in_formalParameters656); 
            char_literal92_tree = (CommonTree)adaptor.create(char_literal92);
            adaptor.addChild(root_0, char_literal92_tree);

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:113:9: ( fpSection ( ';' fpSection )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENTIFIER||LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:113:10: fpSection ( ';' fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters659);
                    fpSection93=fpSection();

                    state._fsp--;

                    adaptor.addChild(root_0, fpSection93.getTree());
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:113:20: ( ';' fpSection )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==8) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:113:21: ';' fpSection
                    	    {
                    	    char_literal94=(Token)match(input,8,FOLLOW_8_in_formalParameters662); 
                    	    char_literal94_tree = (CommonTree)adaptor.create(char_literal94);
                    	    adaptor.addChild(root_0, char_literal94_tree);

                    	    pushFollow(FOLLOW_fpSection_in_formalParameters664);
                    	    fpSection95=fpSection();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fpSection95.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal96=(Token)match(input,15,FOLLOW_15_in_formalParameters670); 
            char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
            adaptor.addChild(root_0, char_literal96_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class procedureHeading_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureHeading"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:116:1: procedureHeading : 'PROCEDURE' identifier ( formalParameters )? ;
    public final Oberon0Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        Oberon0Parser.procedureHeading_return retval = new Oberon0Parser.procedureHeading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal97=null;
        Oberon0Parser.identifier_return identifier98 = null;

        Oberon0Parser.formalParameters_return formalParameters99 = null;


        CommonTree string_literal97_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:117:3: ( 'PROCEDURE' identifier ( formalParameters )? )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:117:6: 'PROCEDURE' identifier ( formalParameters )?
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal97=(Token)match(input,43,FOLLOW_43_in_procedureHeading684); 
            string_literal97_tree = (CommonTree)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);

            pushFollow(FOLLOW_identifier_in_procedureHeading686);
            identifier98=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier98.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:117:29: ( formalParameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:117:29: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading688);
                    formalParameters99=formalParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, formalParameters99.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "procedureHeading"

    public static class procedureBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:120:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' identifier ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal101=null;
        Token string_literal103=null;
        Oberon0Parser.declarations_return declarations100 = null;

        Oberon0Parser.statementSequence_return statementSequence102 = null;

        Oberon0Parser.identifier_return identifier104 = null;


        CommonTree string_literal101_tree=null;
        CommonTree string_literal103_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:121:3: ( declarations ( 'BEGIN' statementSequence )? 'END' identifier )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:121:7: declarations ( 'BEGIN' statementSequence )? 'END' identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedureBody709);
            declarations100=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations100.getTree());
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:121:20: ( 'BEGIN' statementSequence )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==9) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:121:21: 'BEGIN' statementSequence
                    {
                    string_literal101=(Token)match(input,9,FOLLOW_9_in_procedureBody712); 
                    string_literal101_tree = (CommonTree)adaptor.create(string_literal101);
                    adaptor.addChild(root_0, string_literal101_tree);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody714);
                    statementSequence102=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence102.getTree());

                    }
                    break;

            }

            string_literal103=(Token)match(input,10,FOLLOW_10_in_procedureBody718); 
            string_literal103_tree = (CommonTree)adaptor.create(string_literal103);
            adaptor.addChild(root_0, string_literal103_tree);

            pushFollow(FOLLOW_identifier_in_procedureBody720);
            identifier104=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier104.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class procedureDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:124:1: procedureDeclarations : procedureHeading ';' procedureBody ;
    public final Oberon0Parser.procedureDeclarations_return procedureDeclarations() throws RecognitionException {
        Oberon0Parser.procedureDeclarations_return retval = new Oberon0Parser.procedureDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal106=null;
        Oberon0Parser.procedureHeading_return procedureHeading105 = null;

        Oberon0Parser.procedureBody_return procedureBody107 = null;


        CommonTree char_literal106_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:125:3: ( procedureHeading ';' procedureBody )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:125:5: procedureHeading ';' procedureBody
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_procedureHeading_in_procedureDeclarations738);
            procedureHeading105=procedureHeading();

            state._fsp--;

            adaptor.addChild(root_0, procedureHeading105.getTree());
            char_literal106=(Token)match(input,8,FOLLOW_8_in_procedureDeclarations740); 
            char_literal106_tree = (CommonTree)adaptor.create(char_literal106);
            adaptor.addChild(root_0, char_literal106_tree);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclarations742);
            procedureBody107=procedureBody();

            state._fsp--;

            adaptor.addChild(root_0, procedureBody107.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "procedureDeclarations"

    public static class declarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:128:1: declarations : ( 'CONST' ( identifier '=' expression ';' )* )? ( 'TYPE' ( identifier '=' type ';' )* )? ( 'VAR' ( identifierList ':' type ';' )* )? ( procedureDeclarations ';' )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        Token string_literal113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        Token string_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Oberon0Parser.identifier_return identifier109 = null;

        Oberon0Parser.expression_return expression111 = null;

        Oberon0Parser.identifier_return identifier114 = null;

        Oberon0Parser.type_return type116 = null;

        Oberon0Parser.identifierList_return identifierList119 = null;

        Oberon0Parser.type_return type121 = null;

        Oberon0Parser.procedureDeclarations_return procedureDeclarations123 = null;


        CommonTree string_literal108_tree=null;
        CommonTree char_literal110_tree=null;
        CommonTree char_literal112_tree=null;
        CommonTree string_literal113_tree=null;
        CommonTree char_literal115_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree string_literal118_tree=null;
        CommonTree char_literal120_tree=null;
        CommonTree char_literal122_tree=null;
        CommonTree char_literal124_tree=null;

        try {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:129:3: ( ( 'CONST' ( identifier '=' expression ';' )* )? ( 'TYPE' ( identifier '=' type ';' )* )? ( 'VAR' ( identifierList ':' type ';' )* )? ( procedureDeclarations ';' )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:129:5: ( 'CONST' ( identifier '=' expression ';' )* )? ( 'TYPE' ( identifier '=' type ';' )* )? ( 'VAR' ( identifierList ':' type ';' )* )? ( procedureDeclarations ';' )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:129:5: ( 'CONST' ( identifier '=' expression ';' )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:129:6: 'CONST' ( identifier '=' expression ';' )*
                    {
                    string_literal108=(Token)match(input,44,FOLLOW_44_in_declarations758); 
                    string_literal108_tree = (CommonTree)adaptor.create(string_literal108);
                    adaptor.addChild(root_0, string_literal108_tree);

                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:129:14: ( identifier '=' expression ';' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENTIFIER) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:129:15: identifier '=' expression ';'
                    	    {
                    	    pushFollow(FOLLOW_identifier_in_declarations761);
                    	    identifier109=identifier();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, identifier109.getTree());
                    	    char_literal110=(Token)match(input,24,FOLLOW_24_in_declarations763); 
                    	    char_literal110_tree = (CommonTree)adaptor.create(char_literal110);
                    	    adaptor.addChild(root_0, char_literal110_tree);

                    	    pushFollow(FOLLOW_expression_in_declarations765);
                    	    expression111=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression111.getTree());
                    	    char_literal112=(Token)match(input,8,FOLLOW_8_in_declarations767); 
                    	    char_literal112_tree = (CommonTree)adaptor.create(char_literal112);
                    	    adaptor.addChild(root_0, char_literal112_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:130:5: ( 'TYPE' ( identifier '=' type ';' )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:130:6: 'TYPE' ( identifier '=' type ';' )*
                    {
                    string_literal113=(Token)match(input,45,FOLLOW_45_in_declarations778); 
                    string_literal113_tree = (CommonTree)adaptor.create(string_literal113);
                    adaptor.addChild(root_0, string_literal113_tree);

                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:130:13: ( identifier '=' type ';' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==IDENTIFIER) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:130:14: identifier '=' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identifier_in_declarations781);
                    	    identifier114=identifier();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, identifier114.getTree());
                    	    char_literal115=(Token)match(input,24,FOLLOW_24_in_declarations783); 
                    	    char_literal115_tree = (CommonTree)adaptor.create(char_literal115);
                    	    adaptor.addChild(root_0, char_literal115_tree);

                    	    pushFollow(FOLLOW_type_in_declarations785);
                    	    type116=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type116.getTree());
                    	    char_literal117=(Token)match(input,8,FOLLOW_8_in_declarations787); 
                    	    char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
                    	    adaptor.addChild(root_0, char_literal117_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:131:5: ( 'VAR' ( identifierList ':' type ';' )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:131:6: 'VAR' ( identifierList ':' type ';' )*
                    {
                    string_literal118=(Token)match(input,42,FOLLOW_42_in_declarations798); 
                    string_literal118_tree = (CommonTree)adaptor.create(string_literal118);
                    adaptor.addChild(root_0, string_literal118_tree);

                    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:131:12: ( identifierList ':' type ';' )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==IDENTIFIER) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:131:13: identifierList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identifierList_in_declarations801);
                    	    identifierList119=identifierList();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, identifierList119.getTree());
                    	    char_literal120=(Token)match(input,40,FOLLOW_40_in_declarations803); 
                    	    char_literal120_tree = (CommonTree)adaptor.create(char_literal120);
                    	    adaptor.addChild(root_0, char_literal120_tree);

                    	    pushFollow(FOLLOW_type_in_declarations805);
                    	    type121=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type121.getTree());
                    	    char_literal122=(Token)match(input,8,FOLLOW_8_in_declarations807); 
                    	    char_literal122_tree = (CommonTree)adaptor.create(char_literal122);
                    	    adaptor.addChild(root_0, char_literal122_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:132:5: ( procedureDeclarations ';' )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==43) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\parser\\Oberon0.g:132:6: procedureDeclarations ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclarations_in_declarations818);
            	    procedureDeclarations123=procedureDeclarations();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedureDeclarations123.getTree());
            	    char_literal124=(Token)match(input,8,FOLLOW_8_in_declarations820); 
            	    char_literal124_tree = (CommonTree)adaptor.create(char_literal124);
            	    adaptor.addChild(root_0, char_literal124_tree);


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    // Delegated rules


 

    public static final BitSet FOLLOW_7_in_module53 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_module55 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module57 = new BitSet(new long[]{0x00003C0000000600L});
    public static final BitSet FOLLOW_declarations_in_module59 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module66 = new BitSet(new long[]{0x0000001100000010L});
    public static final BitSet FOLLOW_statementSequence_in_module68 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module72 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_module74 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector124 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_selector126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_selector130 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_selector132 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_selector134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_selector142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_factor157 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_selector_in_factor159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_factor165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_factor171 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_factor173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_factor175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_factor181 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_factor_in_factor183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term198 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_set_in_term201 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_factor_in_term218 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_set_in_simpleExpression235 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_term_in_simpleExpression242 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_set_in_simpleExpression245 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_term_in_simpleExpression258 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression275 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_set_in_expression278 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_assignment319 = new BitSet(new long[]{0x0000000040001810L});
    public static final BitSet FOLLOW_selector_in_assignment321 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_assignment323 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_assignment325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_actualParameters338 = new BitSet(new long[]{0x000000000061C030L});
    public static final BitSet FOLLOW_expression_in_actualParameters341 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_31_in_actualParameters344 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_actualParameters346 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_15_in_actualParameters352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_procedureCall367 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ifStatement385 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_ifStatement387 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifStatement389 = new BitSet(new long[]{0x0000001100000010L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement391 = new BitSet(new long[]{0x0000000C00000400L});
    public static final BitSet FOLLOW_34_in_ifStatement399 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_ifStatement401 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifStatement403 = new BitSet(new long[]{0x0000001100000010L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement405 = new BitSet(new long[]{0x0000000C00000400L});
    public static final BitSet FOLLOW_35_in_ifStatement415 = new BitSet(new long[]{0x0000001100000010L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement417 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifStatement426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_whileStatement440 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_whileStatement442 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_whileStatement444 = new BitSet(new long[]{0x0000001100000010L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement446 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whileStatement448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence496 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_statementSequence499 = new BitSet(new long[]{0x0000001100000010L});
    public static final BitSet FOLLOW_statement_in_statementSequence501 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_identifier_in_identifierList518 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_identifierList521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_identifierList523 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_38_in_arrayType540 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_arrayType542 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_arrayType544 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_arrayType546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierList_in_fieldList560 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fieldList562 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_fieldList564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_recordType581 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldList_in_recordType583 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_recordType586 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldList_in_recordType588 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_recordType592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_type605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_fpSection634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifierList_in_fpSection637 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fpSection639 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_fpSection641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_formalParameters656 = new BitSet(new long[]{0x0000040000008010L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters659 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_8_in_formalParameters662 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters664 = new BitSet(new long[]{0x0000000000008100L});
    public static final BitSet FOLLOW_15_in_formalParameters670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_procedureHeading684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_procedureHeading686 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody709 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedureBody712 = new BitSet(new long[]{0x0000001100000010L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody714 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedureBody718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_procedureBody720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclarations738 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureDeclarations740 = new BitSet(new long[]{0x00003C0000000600L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_declarations758 = new BitSet(new long[]{0x00002C0000000012L});
    public static final BitSet FOLLOW_identifier_in_declarations761 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_declarations763 = new BitSet(new long[]{0x0000000000614030L});
    public static final BitSet FOLLOW_expression_in_declarations765 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations767 = new BitSet(new long[]{0x00002C0000000012L});
    public static final BitSet FOLLOW_45_in_declarations778 = new BitSet(new long[]{0x00000C0000000012L});
    public static final BitSet FOLLOW_identifier_in_declarations781 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_declarations783 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_declarations785 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations787 = new BitSet(new long[]{0x00000C0000000012L});
    public static final BitSet FOLLOW_42_in_declarations798 = new BitSet(new long[]{0x0000080000000012L});
    public static final BitSet FOLLOW_identifierList_in_declarations801 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_declarations803 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_declarations805 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations807 = new BitSet(new long[]{0x0000080000000012L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations818 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations820 = new BitSet(new long[]{0x0000080000000002L});

}