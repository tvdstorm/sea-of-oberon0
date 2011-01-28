// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g 2011-01-28 14:36:50

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.treeadaptor.OberonRootNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class OberonParser extends DebugParser {
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

    public static final String[] ruleNames = new String[] {
        "invalidRule", "assignment", "integer", "recordType", "varDeclarations", 
        "module", "subCall", "typeDeclarations", "whileStatement", "term", 
        "factor", "procedureDeclarations", "simpleExpression", "number", 
        "procedureCall", "type", "arrayType", "formalParameters", "declarations", 
        "actualParameters", "ident", "constantDeclarations", "fPSection", 
        "procedureDeclaration", "selector", "statement", "statementSequence", 
        "fieldList", "identList", "ifStatement", "procedureHeading", "expression", 
        "procedureBody"
    };
    public static final boolean[] decisionCanBacktrack = new boolean[] {
        false, // invalid decision
        false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false, false, false, 
            false, false, false, false, false, false, false
    };

     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public OberonParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public OberonParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public OberonParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return OberonParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g"; }


    public static class ident_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ident"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:1: ident : LETTER ( LETTER | DIGIT )* ;
    public final OberonParser.ident_return ident() throws RecognitionException {
        OberonParser.ident_return retval = new OberonParser.ident_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LETTER1=null;
        Token set2=null;

        Object LETTER1_tree=null;
        Object set2_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ident");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:7: ( LETTER ( LETTER | DIGIT )* )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:9: LETTER ( LETTER | DIGIT )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(31,9);
            LETTER1=(Token)match(input,LETTER,FOLLOW_LETTER_in_ident134); 
            LETTER1_tree = (Object)adaptor.create(LETTER1);
            adaptor.addChild(root_0, LETTER1_tree);

            dbg.location(31,16);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:16: ( LETTER | DIGIT )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=LETTER && LA1_0<=DIGIT)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:
            	    {
            	    dbg.location(31,16);
            	    set2=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LETTER && input.LA(1)<=DIGIT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set2));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
        dbg.location(31, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ident");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ident"

    public static class integer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:33:1: integer : DIGIT ( DIGIT )* ;
    public final OberonParser.integer_return integer() throws RecognitionException {
        OberonParser.integer_return retval = new OberonParser.integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DIGIT3=null;
        Token DIGIT4=null;

        Object DIGIT3_tree=null;
        Object DIGIT4_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "integer");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:33:9: ( DIGIT ( DIGIT )* )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:33:11: DIGIT ( DIGIT )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(33,11);
            DIGIT3=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer152); 
            DIGIT3_tree = (Object)adaptor.create(DIGIT3);
            adaptor.addChild(root_0, DIGIT3_tree);

            dbg.location(33,17);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:33:17: ( DIGIT )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==DIGIT) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:33:18: DIGIT
            	    {
            	    dbg.location(33,18);
            	    DIGIT4=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_integer155); 
            	    DIGIT4_tree = (Object)adaptor.create(DIGIT4);
            	    adaptor.addChild(root_0, DIGIT4_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);
            } finally {dbg.exitSubRule(2);}


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
        dbg.location(33, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "integer");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "integer"

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:35:1: number : integer ;
    public final OberonParser.number_return number() throws RecognitionException {
        OberonParser.number_return retval = new OberonParser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.integer_return integer5 = null;



        try { dbg.enterRule(getGrammarFileName(), "number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:35:8: ( integer )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:35:10: integer
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(35,10);
            pushFollow(FOLLOW_integer_in_number165);
            integer5=integer();

            state._fsp--;

            adaptor.addChild(root_0, integer5.getTree());

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
        dbg.location(35, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "number"

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:1: selector : ( '.' ident | '[' expression ']' )* ;
    public final OberonParser.selector_return selector() throws RecognitionException {
        OberonParser.selector_return retval = new OberonParser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal6=null;
        Token char_literal8=null;
        Token char_literal10=null;
        OberonParser.ident_return ident7 = null;

        OberonParser.expression_return expression9 = null;


        Object char_literal6_tree=null;
        Object char_literal8_tree=null;
        Object char_literal10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "selector");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:9: ( ( '.' ident | '[' expression ']' )* )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:11: ( '.' ident | '[' expression ']' )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(37,11);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:11: ( '.' ident | '[' expression ']' )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=3;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }
                else if ( (LA3_0==14) ) {
                    alt3=2;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:12: '.' ident
            	    {
            	    dbg.location(37,12);
            	    char_literal6=(Token)match(input,13,FOLLOW_13_in_selector173); 
            	    char_literal6_tree = (Object)adaptor.create(char_literal6);
            	    adaptor.addChild(root_0, char_literal6_tree);

            	    dbg.location(37,16);
            	    pushFollow(FOLLOW_ident_in_selector175);
            	    ident7=ident();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ident7.getTree());

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:24: '[' expression ']'
            	    {
            	    dbg.location(37,24);
            	    char_literal8=(Token)match(input,14,FOLLOW_14_in_selector179); 
            	    char_literal8_tree = (Object)adaptor.create(char_literal8);
            	    adaptor.addChild(root_0, char_literal8_tree);

            	    dbg.location(37,28);
            	    pushFollow(FOLLOW_expression_in_selector181);
            	    expression9=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression9.getTree());
            	    dbg.location(37,39);
            	    char_literal10=(Token)match(input,15,FOLLOW_15_in_selector183); 
            	    char_literal10_tree = (Object)adaptor.create(char_literal10);
            	    adaptor.addChild(root_0, char_literal10_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


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
        dbg.location(37, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "selector");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "selector"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:1: factor : ( ident selector | number | '(' expression ')' | '~' factor );
    public final OberonParser.factor_return factor() throws RecognitionException {
        OberonParser.factor_return retval = new OberonParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal17=null;
        OberonParser.ident_return ident11 = null;

        OberonParser.selector_return selector12 = null;

        OberonParser.number_return number13 = null;

        OberonParser.expression_return expression15 = null;

        OberonParser.factor_return factor18 = null;


        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(39, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:8: ( ident selector | number | '(' expression ')' | '~' factor )
            int alt4=4;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:10: ident selector
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,10);
                    pushFollow(FOLLOW_ident_in_factor196);
                    ident11=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident11.getTree());
                    dbg.location(39,16);
                    pushFollow(FOLLOW_selector_in_factor198);
                    selector12=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector12.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:27: number
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,27);
                    pushFollow(FOLLOW_number_in_factor202);
                    number13=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number13.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:36: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,36);
                    char_literal14=(Token)match(input,16,FOLLOW_16_in_factor206); 
                    char_literal14_tree = (Object)adaptor.create(char_literal14);
                    adaptor.addChild(root_0, char_literal14_tree);

                    dbg.location(39,40);
                    pushFollow(FOLLOW_expression_in_factor208);
                    expression15=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression15.getTree());
                    dbg.location(39,51);
                    char_literal16=(Token)match(input,17,FOLLOW_17_in_factor210); 
                    char_literal16_tree = (Object)adaptor.create(char_literal16);
                    adaptor.addChild(root_0, char_literal16_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:57: '~' factor
                    {
                    root_0 = (Object)adaptor.nil();

                    dbg.location(39,57);
                    char_literal17=(Token)match(input,18,FOLLOW_18_in_factor214); 
                    char_literal17_tree = (Object)adaptor.create(char_literal17);
                    adaptor.addChild(root_0, char_literal17_tree);

                    dbg.location(39,61);
                    pushFollow(FOLLOW_factor_in_factor216);
                    factor18=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor18.getTree());

                    }
                    break;

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
        dbg.location(39, 67);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:41:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final OberonParser.term_return term() throws RecognitionException {
        OberonParser.term_return retval = new OberonParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set20=null;
        OberonParser.factor_return factor19 = null;

        OberonParser.factor_return factor21 = null;


        Object set20_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:41:6: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:41:8: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(41,8);
            pushFollow(FOLLOW_factor_in_term225);
            factor19=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor19.getTree());
            dbg.location(41,15);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:41:15: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=22)) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:41:16: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    dbg.location(41,16);
            	    set20=(Token)input.LT(1);
            	    if ( (input.LA(1)>=19 && input.LA(1)<=22) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set20));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(41,44);
            	    pushFollow(FOLLOW_factor_in_term244);
            	    factor21=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


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
        dbg.location(41, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:43:1: simpleExpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* ;
    public final OberonParser.simpleExpression_return simpleExpression() throws RecognitionException {
        OberonParser.simpleExpression_return retval = new OberonParser.simpleExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set22=null;
        Token set24=null;
        OberonParser.term_return term23 = null;

        OberonParser.term_return term25 = null;


        Object set22_tree=null;
        Object set24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "simpleExpression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:44:2: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:44:4: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(44,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:44:4: ( '+' | '-' )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=23 && LA6_0<=24)) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:
                    {
                    dbg.location(44,4);
                    set22=(Token)input.LT(1);
                    if ( (input.LA(1)>=23 && input.LA(1)<=24) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set22));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(44,17);
            pushFollow(FOLLOW_term_in_simpleExpression266);
            term23=term();

            state._fsp--;

            adaptor.addChild(root_0, term23.getTree());
            dbg.location(44,22);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:44:22: ( ( '+' | '-' | 'OR' ) term )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=23 && LA7_0<=25)) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:44:23: ( '+' | '-' | 'OR' ) term
            	    {
            	    dbg.location(44,23);
            	    set24=(Token)input.LT(1);
            	    if ( (input.LA(1)>=23 && input.LA(1)<=25) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set24));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(44,40);
            	    pushFollow(FOLLOW_term_in_simpleExpression279);
            	    term25=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term25.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


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
        dbg.location(44, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "simpleExpression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:46:1: expression : simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )? ;
    public final OberonParser.expression_return expression() throws RecognitionException {
        OberonParser.expression_return retval = new OberonParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set27=null;
        OberonParser.simpleExpression_return simpleExpression26 = null;

        OberonParser.simpleExpression_return simpleExpression28 = null;


        Object set27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:47:2: ( simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:47:4: simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(47,4);
            pushFollow(FOLLOW_simpleExpression_in_expression291);
            simpleExpression26=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, simpleExpression26.getTree());
            dbg.location(47,21);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:47:21: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )?
            int alt8=2;
            try { dbg.enterSubRule(8);
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=26 && LA8_0<=31)) ) {
                alt8=1;
            }
            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:47:22: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression
                    {
                    dbg.location(47,22);
                    set27=(Token)input.LT(1);
                    if ( (input.LA(1)>=26 && input.LA(1)<=31) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set27));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        dbg.recognitionException(mse);
                        throw mse;
                    }

                    dbg.location(47,60);
                    pushFollow(FOLLOW_simpleExpression_in_expression318);
                    simpleExpression28=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleExpression28.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(8);}


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
        dbg.location(47, 78);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expression"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:49:1: assignment : ident selector ':=' expression ;
    public final OberonParser.assignment_return assignment() throws RecognitionException {
        OberonParser.assignment_return retval = new OberonParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal31=null;
        OberonParser.ident_return ident29 = null;

        OberonParser.selector_return selector30 = null;

        OberonParser.expression_return expression32 = null;


        Object string_literal31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assignment");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:50:2: ( ident selector ':=' expression )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:50:4: ident selector ':=' expression
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(50,4);
            pushFollow(FOLLOW_ident_in_assignment331);
            ident29=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident29.getTree());
            dbg.location(50,10);
            pushFollow(FOLLOW_selector_in_assignment333);
            selector30=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector30.getTree());
            dbg.location(50,19);
            string_literal31=(Token)match(input,32,FOLLOW_32_in_assignment335); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            dbg.location(50,24);
            pushFollow(FOLLOW_expression_in_assignment337);
            expression32=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression32.getTree());

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
        dbg.location(50, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignment");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignment"

    public static class actualParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:52:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final OberonParser.actualParameters_return actualParameters() throws RecognitionException {
        OberonParser.actualParameters_return retval = new OberonParser.actualParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal33=null;
        Token char_literal35=null;
        Token char_literal37=null;
        OberonParser.expression_return expression34 = null;

        OberonParser.expression_return expression36 = null;


        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object char_literal37_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "actualParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(52, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:53:2: ( '(' ( expression ( ',' expression )* )? ')' )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:53:4: '(' ( expression ( ',' expression )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(53,4);
            char_literal33=(Token)match(input,16,FOLLOW_16_in_actualParameters347); 
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);

            dbg.location(53,8);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:53:8: ( expression ( ',' expression )* )?
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=LETTER && LA10_0<=DIGIT)||LA10_0==16||LA10_0==18||(LA10_0>=23 && LA10_0<=24)) ) {
                alt10=1;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:53:9: expression ( ',' expression )*
                    {
                    dbg.location(53,9);
                    pushFollow(FOLLOW_expression_in_actualParameters350);
                    expression34=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression34.getTree());
                    dbg.location(53,20);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:53:20: ( ',' expression )*
                    try { dbg.enterSubRule(9);

                    loop9:
                    do {
                        int alt9=2;
                        try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==33) ) {
                            alt9=1;
                        }


                        } finally {dbg.exitDecision(9);}

                        switch (alt9) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:53:21: ',' expression
                    	    {
                    	    dbg.location(53,21);
                    	    char_literal35=(Token)match(input,33,FOLLOW_33_in_actualParameters353); 
                    	    char_literal35_tree = (Object)adaptor.create(char_literal35);
                    	    adaptor.addChild(root_0, char_literal35_tree);

                    	    dbg.location(53,25);
                    	    pushFollow(FOLLOW_expression_in_actualParameters355);
                    	    expression36=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(9);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(53,40);
            char_literal37=(Token)match(input,17,FOLLOW_17_in_actualParameters361); 
            char_literal37_tree = (Object)adaptor.create(char_literal37);
            adaptor.addChild(root_0, char_literal37_tree);


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
        dbg.location(53, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "actualParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "actualParameters"

    public static class procedureCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:55:1: procedureCall : ident selector ( actualParameters )? ;
    public final OberonParser.procedureCall_return procedureCall() throws RecognitionException {
        OberonParser.procedureCall_return retval = new OberonParser.procedureCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.ident_return ident38 = null;

        OberonParser.selector_return selector39 = null;

        OberonParser.actualParameters_return actualParameters40 = null;



        try { dbg.enterRule(getGrammarFileName(), "procedureCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:56:2: ( ident selector ( actualParameters )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:56:4: ident selector ( actualParameters )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(56,4);
            pushFollow(FOLLOW_ident_in_procedureCall372);
            ident38=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident38.getTree());
            dbg.location(56,10);
            pushFollow(FOLLOW_selector_in_procedureCall374);
            selector39=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector39.getTree());
            dbg.location(56,19);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:56:19: ( actualParameters )?
            int alt11=2;
            try { dbg.enterSubRule(11);
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:56:20: actualParameters
                    {
                    dbg.location(56,20);
                    pushFollow(FOLLOW_actualParameters_in_procedureCall377);
                    actualParameters40=actualParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualParameters40.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(11);}


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
        dbg.location(56, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class subCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subCall"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:1: subCall : ident selector ( ':=' expression | ( actualParameters )? ) ;
    public final OberonParser.subCall_return subCall() throws RecognitionException {
        OberonParser.subCall_return retval = new OberonParser.subCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        OberonParser.ident_return ident41 = null;

        OberonParser.selector_return selector42 = null;

        OberonParser.expression_return expression44 = null;

        OberonParser.actualParameters_return actualParameters45 = null;


        Object string_literal43_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "subCall");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(58, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:9: ( ident selector ( ':=' expression | ( actualParameters )? ) )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:11: ident selector ( ':=' expression | ( actualParameters )? )
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(58,11);
            pushFollow(FOLLOW_ident_in_subCall387);
            ident41=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident41.getTree());
            dbg.location(58,17);
            pushFollow(FOLLOW_selector_in_subCall389);
            selector42=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector42.getTree());
            dbg.location(58,26);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:26: ( ':=' expression | ( actualParameters )? )
            int alt13=2;
            try { dbg.enterSubRule(13);
            try { dbg.enterDecision(13, decisionCanBacktrack[13]);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(13);}

            switch (alt13) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:27: ':=' expression
                    {
                    dbg.location(58,27);
                    string_literal43=(Token)match(input,32,FOLLOW_32_in_subCall392); 
                    string_literal43_tree = (Object)adaptor.create(string_literal43);
                    adaptor.addChild(root_0, string_literal43_tree);

                    dbg.location(58,32);
                    pushFollow(FOLLOW_expression_in_subCall394);
                    expression44=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression44.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:45: ( actualParameters )?
                    {
                    dbg.location(58,45);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:45: ( actualParameters )?
                    int alt12=2;
                    try { dbg.enterSubRule(12);
                    try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==16) ) {
                        alt12=1;
                    }
                    } finally {dbg.exitDecision(12);}

                    switch (alt12) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:58:46: actualParameters
                            {
                            dbg.location(58,46);
                            pushFollow(FOLLOW_actualParameters_in_subCall399);
                            actualParameters45=actualParameters();

                            state._fsp--;

                            adaptor.addChild(root_0, actualParameters45.getTree());

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(12);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(13);}


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
        dbg.location(58, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "subCall");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "subCall"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:60:1: ifStatement : 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
    public final OberonParser.ifStatement_return ifStatement() throws RecognitionException {
        OberonParser.ifStatement_return retval = new OberonParser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

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


        Object string_literal46_tree=null;
        Object string_literal48_tree=null;
        Object string_literal50_tree=null;
        Object string_literal52_tree=null;
        Object string_literal54_tree=null;
        Object string_literal56_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "ifStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:61:2: ( 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:61:4: 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(61,4);
            string_literal46=(Token)match(input,34,FOLLOW_34_in_ifStatement411); 
            string_literal46_tree = (Object)adaptor.create(string_literal46);
            adaptor.addChild(root_0, string_literal46_tree);

            dbg.location(61,9);
            pushFollow(FOLLOW_expression_in_ifStatement413);
            expression47=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression47.getTree());
            dbg.location(61,20);
            string_literal48=(Token)match(input,35,FOLLOW_35_in_ifStatement415); 
            string_literal48_tree = (Object)adaptor.create(string_literal48);
            adaptor.addChild(root_0, string_literal48_tree);

            dbg.location(61,27);
            pushFollow(FOLLOW_statementSequence_in_ifStatement417);
            statementSequence49=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence49.getTree());
            dbg.location(61,45);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:61:45: ( 'ELSIF' expression 'THEN' statementSequence )*
            try { dbg.enterSubRule(14);

            loop14:
            do {
                int alt14=2;
                try { dbg.enterDecision(14, decisionCanBacktrack[14]);

                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) ) {
                    alt14=1;
                }


                } finally {dbg.exitDecision(14);}

                switch (alt14) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:61:46: 'ELSIF' expression 'THEN' statementSequence
            	    {
            	    dbg.location(61,46);
            	    string_literal50=(Token)match(input,36,FOLLOW_36_in_ifStatement420); 
            	    string_literal50_tree = (Object)adaptor.create(string_literal50);
            	    adaptor.addChild(root_0, string_literal50_tree);

            	    dbg.location(61,54);
            	    pushFollow(FOLLOW_expression_in_ifStatement422);
            	    expression51=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression51.getTree());
            	    dbg.location(61,65);
            	    string_literal52=(Token)match(input,35,FOLLOW_35_in_ifStatement424); 
            	    string_literal52_tree = (Object)adaptor.create(string_literal52);
            	    adaptor.addChild(root_0, string_literal52_tree);

            	    dbg.location(61,72);
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement426);
            	    statementSequence53=statementSequence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementSequence53.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);
            } finally {dbg.exitSubRule(14);}

            dbg.location(61,92);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:61:92: ( 'ELSE' statementSequence )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:61:93: 'ELSE' statementSequence
                    {
                    dbg.location(61,93);
                    string_literal54=(Token)match(input,37,FOLLOW_37_in_ifStatement431); 
                    string_literal54_tree = (Object)adaptor.create(string_literal54);
                    adaptor.addChild(root_0, string_literal54_tree);

                    dbg.location(61,100);
                    pushFollow(FOLLOW_statementSequence_in_ifStatement433);
                    statementSequence55=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence55.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(61,120);
            string_literal56=(Token)match(input,38,FOLLOW_38_in_ifStatement437); 
            string_literal56_tree = (Object)adaptor.create(string_literal56);
            adaptor.addChild(root_0, string_literal56_tree);


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
        dbg.location(61, 125);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:63:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final OberonParser.whileStatement_return whileStatement() throws RecognitionException {
        OberonParser.whileStatement_return retval = new OberonParser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;
        Token string_literal59=null;
        Token string_literal61=null;
        OberonParser.expression_return expression58 = null;

        OberonParser.statementSequence_return statementSequence60 = null;


        Object string_literal57_tree=null;
        Object string_literal59_tree=null;
        Object string_literal61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "whileStatement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:64:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:64:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(64,4);
            string_literal57=(Token)match(input,39,FOLLOW_39_in_whileStatement446); 
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);

            dbg.location(64,12);
            pushFollow(FOLLOW_expression_in_whileStatement448);
            expression58=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression58.getTree());
            dbg.location(64,23);
            string_literal59=(Token)match(input,40,FOLLOW_40_in_whileStatement450); 
            string_literal59_tree = (Object)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);

            dbg.location(64,28);
            pushFollow(FOLLOW_statementSequence_in_whileStatement452);
            statementSequence60=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence60.getTree());
            dbg.location(64,46);
            string_literal61=(Token)match(input,38,FOLLOW_38_in_whileStatement454); 
            string_literal61_tree = (Object)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);


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
        dbg.location(64, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "whileStatement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:67:1: statement : ( subCall | ifStatement | whileStatement )? ;
    public final OberonParser.statement_return statement() throws RecognitionException {
        OberonParser.statement_return retval = new OberonParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.subCall_return subCall62 = null;

        OberonParser.ifStatement_return ifStatement63 = null;

        OberonParser.whileStatement_return whileStatement64 = null;



        try { dbg.enterRule(getGrammarFileName(), "statement");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:68:2: ( ( subCall | ifStatement | whileStatement )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:68:4: ( subCall | ifStatement | whileStatement )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(68,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:68:4: ( subCall | ifStatement | whileStatement )?
            int alt16=4;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

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

            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:68:5: subCall
                    {
                    dbg.location(68,5);
                    pushFollow(FOLLOW_subCall_in_statement466);
                    subCall62=subCall();

                    state._fsp--;

                    adaptor.addChild(root_0, subCall62.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:68:15: ifStatement
                    {
                    dbg.location(68,15);
                    pushFollow(FOLLOW_ifStatement_in_statement470);
                    ifStatement63=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement63.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:68:29: whileStatement
                    {
                    dbg.location(68,29);
                    pushFollow(FOLLOW_whileStatement_in_statement474);
                    whileStatement64=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement64.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}


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
        dbg.location(68, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statement");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statement"

    public static class statementSequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:70:1: statementSequence : statement ( ';' statement )* ;
    public final OberonParser.statementSequence_return statementSequence() throws RecognitionException {
        OberonParser.statementSequence_return retval = new OberonParser.statementSequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal66=null;
        OberonParser.statement_return statement65 = null;

        OberonParser.statement_return statement67 = null;


        Object char_literal66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "statementSequence");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:71:2: ( statement ( ';' statement )* )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:71:4: statement ( ';' statement )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(71,4);
            pushFollow(FOLLOW_statement_in_statementSequence486);
            statement65=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement65.getTree());
            dbg.location(71,14);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:71:14: ( ';' statement )*
            try { dbg.enterSubRule(17);

            loop17:
            do {
                int alt17=2;
                try { dbg.enterDecision(17, decisionCanBacktrack[17]);

                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                } finally {dbg.exitDecision(17);}

                switch (alt17) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:71:15: ';' statement
            	    {
            	    dbg.location(71,15);
            	    char_literal66=(Token)match(input,41,FOLLOW_41_in_statementSequence489); 
            	    char_literal66_tree = (Object)adaptor.create(char_literal66);
            	    adaptor.addChild(root_0, char_literal66_tree);

            	    dbg.location(71,19);
            	    pushFollow(FOLLOW_statement_in_statementSequence491);
            	    statement67=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement67.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);
            } finally {dbg.exitSubRule(17);}


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
        dbg.location(71, 30);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "statementSequence");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "statementSequence"

    public static class identList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:73:1: identList : ident ( ',' ident )* ;
    public final OberonParser.identList_return identList() throws RecognitionException {
        OberonParser.identList_return retval = new OberonParser.identList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        OberonParser.ident_return ident68 = null;

        OberonParser.ident_return ident70 = null;


        Object char_literal69_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "identList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:74:2: ( ident ( ',' ident )* )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:74:4: ident ( ',' ident )*
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(74,4);
            pushFollow(FOLLOW_ident_in_identList502);
            ident68=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident68.getTree());
            dbg.location(74,10);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:74:10: ( ',' ident )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:74:11: ',' ident
            	    {
            	    dbg.location(74,11);
            	    char_literal69=(Token)match(input,33,FOLLOW_33_in_identList505); 
            	    char_literal69_tree = (Object)adaptor.create(char_literal69);
            	    adaptor.addChild(root_0, char_literal69_tree);

            	    dbg.location(74,15);
            	    pushFollow(FOLLOW_ident_in_identList507);
            	    ident70=ident();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ident70.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}


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
        dbg.location(74, 22);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "identList"

    public static class arrayType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:76:1: arrayType : 'ARRAY' expression 'OF' type ;
    public final OberonParser.arrayType_return arrayType() throws RecognitionException {
        OberonParser.arrayType_return retval = new OberonParser.arrayType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal71=null;
        Token string_literal73=null;
        OberonParser.expression_return expression72 = null;

        OberonParser.type_return type74 = null;


        Object string_literal71_tree=null;
        Object string_literal73_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arrayType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:77:2: ( 'ARRAY' expression 'OF' type )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:77:4: 'ARRAY' expression 'OF' type
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(77,4);
            string_literal71=(Token)match(input,42,FOLLOW_42_in_arrayType519); 
            string_literal71_tree = (Object)adaptor.create(string_literal71);
            adaptor.addChild(root_0, string_literal71_tree);

            dbg.location(77,12);
            pushFollow(FOLLOW_expression_in_arrayType521);
            expression72=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression72.getTree());
            dbg.location(77,23);
            string_literal73=(Token)match(input,43,FOLLOW_43_in_arrayType523); 
            string_literal73_tree = (Object)adaptor.create(string_literal73);
            adaptor.addChild(root_0, string_literal73_tree);

            dbg.location(77,28);
            pushFollow(FOLLOW_type_in_arrayType525);
            type74=type();

            state._fsp--;

            adaptor.addChild(root_0, type74.getTree());

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
        dbg.location(77, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arrayType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:79:1: fieldList : ( identList ':' type )? ;
    public final OberonParser.fieldList_return fieldList() throws RecognitionException {
        OberonParser.fieldList_return retval = new OberonParser.fieldList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal76=null;
        OberonParser.identList_return identList75 = null;

        OberonParser.type_return type77 = null;


        Object char_literal76_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fieldList");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:80:2: ( ( identList ':' type )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:80:4: ( identList ':' type )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(80,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:80:4: ( identList ':' type )?
            int alt19=2;
            try { dbg.enterSubRule(19);
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==LETTER) ) {
                alt19=1;
            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:80:5: identList ':' type
                    {
                    dbg.location(80,5);
                    pushFollow(FOLLOW_identList_in_fieldList535);
                    identList75=identList();

                    state._fsp--;

                    adaptor.addChild(root_0, identList75.getTree());
                    dbg.location(80,15);
                    char_literal76=(Token)match(input,44,FOLLOW_44_in_fieldList537); 
                    char_literal76_tree = (Object)adaptor.create(char_literal76);
                    adaptor.addChild(root_0, char_literal76_tree);

                    dbg.location(80,19);
                    pushFollow(FOLLOW_type_in_fieldList539);
                    type77=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type77.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(19);}


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
        dbg.location(80, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fieldList");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:81:1: recordType : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final OberonParser.recordType_return recordType() throws RecognitionException {
        OberonParser.recordType_return retval = new OberonParser.recordType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal78=null;
        Token char_literal80=null;
        Token string_literal82=null;
        OberonParser.fieldList_return fieldList79 = null;

        OberonParser.fieldList_return fieldList81 = null;


        Object string_literal78_tree=null;
        Object char_literal80_tree=null;
        Object string_literal82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "recordType");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(81, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:82:2: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:82:4: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(82,4);
            string_literal78=(Token)match(input,45,FOLLOW_45_in_recordType550); 
            string_literal78_tree = (Object)adaptor.create(string_literal78);
            adaptor.addChild(root_0, string_literal78_tree);

            dbg.location(82,13);
            pushFollow(FOLLOW_fieldList_in_recordType552);
            fieldList79=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList79.getTree());
            dbg.location(82,23);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:82:23: ( ';' fieldList )*
            try { dbg.enterSubRule(20);

            loop20:
            do {
                int alt20=2;
                try { dbg.enterDecision(20, decisionCanBacktrack[20]);

                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                } finally {dbg.exitDecision(20);}

                switch (alt20) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:82:24: ';' fieldList
            	    {
            	    dbg.location(82,24);
            	    char_literal80=(Token)match(input,41,FOLLOW_41_in_recordType555); 
            	    char_literal80_tree = (Object)adaptor.create(char_literal80);
            	    adaptor.addChild(root_0, char_literal80_tree);

            	    dbg.location(82,29);
            	    pushFollow(FOLLOW_fieldList_in_recordType558);
            	    fieldList81=fieldList();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldList81.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);
            } finally {dbg.exitSubRule(20);}

            dbg.location(82,41);
            string_literal82=(Token)match(input,38,FOLLOW_38_in_recordType562); 
            string_literal82_tree = (Object)adaptor.create(string_literal82);
            adaptor.addChild(root_0, string_literal82_tree);


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
        dbg.location(82, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "recordType");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:84:1: type : ( ident -> ident | arrayType -> arrayType | recordType -> recordType );
    public final OberonParser.type_return type() throws RecognitionException {
        OberonParser.type_return retval = new OberonParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.ident_return ident83 = null;

        OberonParser.arrayType_return arrayType84 = null;

        OberonParser.recordType_return recordType85 = null;


        RewriteRuleSubtreeStream stream_arrayType=new RewriteRuleSubtreeStream(adaptor,"rule arrayType");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_recordType=new RewriteRuleSubtreeStream(adaptor,"rule recordType");
        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(84, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:84:6: ( ident -> ident | arrayType -> arrayType | recordType -> recordType )
            int alt21=3;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

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

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:84:8: ident
                    {
                    dbg.location(84,8);
                    pushFollow(FOLLOW_ident_in_type572);
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

                    root_0 = (Object)adaptor.nil();
                    // 84:14: -> ident
                    {
                        dbg.location(84,17);
                        adaptor.addChild(root_0, stream_ident.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:85:5: arrayType
                    {
                    dbg.location(85,5);
                    pushFollow(FOLLOW_arrayType_in_type583);
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

                    root_0 = (Object)adaptor.nil();
                    // 85:15: -> arrayType
                    {
                        dbg.location(85,18);
                        adaptor.addChild(root_0, stream_arrayType.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:86:5: recordType
                    {
                    dbg.location(86,5);
                    pushFollow(FOLLOW_recordType_in_type593);
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

                    root_0 = (Object)adaptor.nil();
                    // 86:16: -> recordType
                    {
                        dbg.location(86,19);
                        adaptor.addChild(root_0, stream_recordType.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

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
        dbg.location(86, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class fPSection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fPSection"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:88:1: fPSection : ( 'VAR' )? identList ':' type ;
    public final OberonParser.fPSection_return fPSection() throws RecognitionException {
        OberonParser.fPSection_return retval = new OberonParser.fPSection_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;
        Token char_literal88=null;
        OberonParser.identList_return identList87 = null;

        OberonParser.type_return type89 = null;


        Object string_literal86_tree=null;
        Object char_literal88_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fPSection");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(88, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:89:2: ( ( 'VAR' )? identList ':' type )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:89:4: ( 'VAR' )? identList ':' type
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(89,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:89:4: ( 'VAR' )?
            int alt22=2;
            try { dbg.enterSubRule(22);
            try { dbg.enterDecision(22, decisionCanBacktrack[22]);

            int LA22_0 = input.LA(1);

            if ( (LA22_0==VARDEF) ) {
                alt22=1;
            }
            } finally {dbg.exitDecision(22);}

            switch (alt22) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:89:5: 'VAR'
                    {
                    dbg.location(89,5);
                    string_literal86=(Token)match(input,VARDEF,FOLLOW_VARDEF_in_fPSection607); 
                    string_literal86_tree = (Object)adaptor.create(string_literal86);
                    adaptor.addChild(root_0, string_literal86_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(22);}

            dbg.location(89,13);
            pushFollow(FOLLOW_identList_in_fPSection611);
            identList87=identList();

            state._fsp--;

            adaptor.addChild(root_0, identList87.getTree());
            dbg.location(89,23);
            char_literal88=(Token)match(input,44,FOLLOW_44_in_fPSection613); 
            char_literal88_tree = (Object)adaptor.create(char_literal88);
            adaptor.addChild(root_0, char_literal88_tree);

            dbg.location(89,27);
            pushFollow(FOLLOW_type_in_fPSection615);
            type89=type();

            state._fsp--;

            adaptor.addChild(root_0, type89.getTree());

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
        dbg.location(89, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fPSection");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fPSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:91:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' ;
    public final OberonParser.formalParameters_return formalParameters() throws RecognitionException {
        OberonParser.formalParameters_return retval = new OberonParser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal90=null;
        Token char_literal92=null;
        Token char_literal94=null;
        OberonParser.fPSection_return fPSection91 = null;

        OberonParser.fPSection_return fPSection93 = null;


        Object char_literal90_tree=null;
        Object char_literal92_tree=null;
        Object char_literal94_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "formalParameters");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(91, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:92:2: ( '(' ( fPSection ( ';' fPSection )* )? ')' )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:92:4: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(92,4);
            char_literal90=(Token)match(input,16,FOLLOW_16_in_formalParameters624); 
            char_literal90_tree = (Object)adaptor.create(char_literal90);
            adaptor.addChild(root_0, char_literal90_tree);

            dbg.location(92,8);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:92:8: ( fPSection ( ';' fPSection )* )?
            int alt24=2;
            try { dbg.enterSubRule(24);
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==VARDEF||LA24_0==LETTER) ) {
                alt24=1;
            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:92:9: fPSection ( ';' fPSection )*
                    {
                    dbg.location(92,9);
                    pushFollow(FOLLOW_fPSection_in_formalParameters627);
                    fPSection91=fPSection();

                    state._fsp--;

                    adaptor.addChild(root_0, fPSection91.getTree());
                    dbg.location(92,19);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:92:19: ( ';' fPSection )*
                    try { dbg.enterSubRule(23);

                    loop23:
                    do {
                        int alt23=2;
                        try { dbg.enterDecision(23, decisionCanBacktrack[23]);

                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==41) ) {
                            alt23=1;
                        }


                        } finally {dbg.exitDecision(23);}

                        switch (alt23) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:92:20: ';' fPSection
                    	    {
                    	    dbg.location(92,20);
                    	    char_literal92=(Token)match(input,41,FOLLOW_41_in_formalParameters630); 
                    	    char_literal92_tree = (Object)adaptor.create(char_literal92);
                    	    adaptor.addChild(root_0, char_literal92_tree);

                    	    dbg.location(92,24);
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters632);
                    	    fPSection93=fPSection();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fPSection93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(23);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(24);}

            dbg.location(92,38);
            char_literal94=(Token)match(input,17,FOLLOW_17_in_formalParameters638); 
            char_literal94_tree = (Object)adaptor.create(char_literal94);
            adaptor.addChild(root_0, char_literal94_tree);


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
        dbg.location(92, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameters");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameters"

    public static class procedureBody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:94:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' ident ;
    public final OberonParser.procedureBody_return procedureBody() throws RecognitionException {
        OberonParser.procedureBody_return retval = new OberonParser.procedureBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal96=null;
        Token string_literal98=null;
        OberonParser.declarations_return declarations95 = null;

        OberonParser.statementSequence_return statementSequence97 = null;

        OberonParser.ident_return ident99 = null;


        Object string_literal96_tree=null;
        Object string_literal98_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "procedureBody");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(94, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:95:2: ( declarations ( 'BEGIN' statementSequence )? 'END' ident )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:95:4: declarations ( 'BEGIN' statementSequence )? 'END' ident
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(95,4);
            pushFollow(FOLLOW_declarations_in_procedureBody647);
            declarations95=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations95.getTree());
            dbg.location(95,17);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:95:17: ( 'BEGIN' statementSequence )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:95:18: 'BEGIN' statementSequence
                    {
                    dbg.location(95,18);
                    string_literal96=(Token)match(input,46,FOLLOW_46_in_procedureBody650); 
                    string_literal96_tree = (Object)adaptor.create(string_literal96);
                    adaptor.addChild(root_0, string_literal96_tree);

                    dbg.location(95,26);
                    pushFollow(FOLLOW_statementSequence_in_procedureBody652);
                    statementSequence97=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence97.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}

            dbg.location(95,46);
            string_literal98=(Token)match(input,38,FOLLOW_38_in_procedureBody656); 
            string_literal98_tree = (Object)adaptor.create(string_literal98);
            adaptor.addChild(root_0, string_literal98_tree);

            dbg.location(95,52);
            pushFollow(FOLLOW_ident_in_procedureBody658);
            ident99=ident();

            state._fsp--;

            adaptor.addChild(root_0, ident99.getTree());

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
        dbg.location(95, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureBody");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureBody"

    public static class procedureHeading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureHeading"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:97:1: procedureHeading : 'PROCEDURE' ident ( formalParameters )? -> ^( ident ( ^( formalParameters ) )? ) ;
    public final OberonParser.procedureHeading_return procedureHeading() throws RecognitionException {
        OberonParser.procedureHeading_return retval = new OberonParser.procedureHeading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal100=null;
        OberonParser.ident_return ident101 = null;

        OberonParser.formalParameters_return formalParameters102 = null;


        Object string_literal100_tree=null;
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        try { dbg.enterRule(getGrammarFileName(), "procedureHeading");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(97, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:98:2: ( 'PROCEDURE' ident ( formalParameters )? -> ^( ident ( ^( formalParameters ) )? ) )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:98:4: 'PROCEDURE' ident ( formalParameters )?
            {
            dbg.location(98,4);
            string_literal100=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading668);  
            stream_PROCEDURE.add(string_literal100);

            dbg.location(98,16);
            pushFollow(FOLLOW_ident_in_procedureHeading670);
            ident101=ident();

            state._fsp--;

            stream_ident.add(ident101.getTree());
            dbg.location(98,22);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:98:22: ( formalParameters )?
            int alt26=2;
            try { dbg.enterSubRule(26);
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:98:23: formalParameters
                    {
                    dbg.location(98,23);
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading673);
                    formalParameters102=formalParameters();

                    state._fsp--;

                    stream_formalParameters.add(formalParameters102.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(26);}



            // AST REWRITE
            // elements: formalParameters, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:2: -> ^( ident ( ^( formalParameters ) )? )
            {
                dbg.location(99,5);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:99:5: ^( ident ( ^( formalParameters ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(99,7);
                root_1 = (Object)adaptor.becomeRoot(stream_ident.nextNode(), root_1);

                dbg.location(99,13);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:99:13: ( ^( formalParameters ) )?
                if ( stream_formalParameters.hasNext() ) {
                    dbg.location(99,13);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:99:13: ^( formalParameters )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(99,15);
                    root_2 = (Object)adaptor.becomeRoot(stream_formalParameters.nextNode(), root_2);

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
        dbg.location(99, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureHeading");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureHeading"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:101:1: procedureDeclaration : procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) ;
    public final OberonParser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        OberonParser.procedureDeclaration_return retval = new OberonParser.procedureDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal104=null;
        OberonParser.procedureHeading_return procedureHeading103 = null;

        OberonParser.procedureBody_return procedureBody105 = null;


        Object char_literal104_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");
        try { dbg.enterRule(getGrammarFileName(), "procedureDeclaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:102:2: ( procedureHeading ';' procedureBody -> ^( PROCEDURE procedureHeading procedureBody ) )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:102:4: procedureHeading ';' procedureBody
            {
            dbg.location(102,4);
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration696);
            procedureHeading103=procedureHeading();

            state._fsp--;

            stream_procedureHeading.add(procedureHeading103.getTree());
            dbg.location(102,21);
            char_literal104=(Token)match(input,41,FOLLOW_41_in_procedureDeclaration698);  
            stream_41.add(char_literal104);

            dbg.location(102,25);
            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration700);
            procedureBody105=procedureBody();

            state._fsp--;

            stream_procedureBody.add(procedureBody105.getTree());


            // AST REWRITE
            // elements: procedureHeading, procedureBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:2: -> ^( PROCEDURE procedureHeading procedureBody )
            {
                dbg.location(103,5);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:103:5: ^( PROCEDURE procedureHeading procedureBody )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(103,7);
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROCEDURE, "PROCEDURE"), root_1);

                dbg.location(103,17);
                adaptor.addChild(root_1, stream_procedureHeading.nextTree());
                dbg.location(103,34);
                adaptor.addChild(root_1, stream_procedureBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(103, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureDeclaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureDeclaration"

    public static class procedureDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:105:1: procedureDeclarations : ( procedureDeclaration ';' )? ;
    public final OberonParser.procedureDeclarations_return procedureDeclarations() throws RecognitionException {
        OberonParser.procedureDeclarations_return retval = new OberonParser.procedureDeclarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal107=null;
        OberonParser.procedureDeclaration_return procedureDeclaration106 = null;


        Object char_literal107_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "procedureDeclarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:106:2: ( ( procedureDeclaration ';' )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:106:4: ( procedureDeclaration ';' )?
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(106,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:106:4: ( procedureDeclaration ';' )?
            int alt27=2;
            try { dbg.enterSubRule(27);
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            int LA27_0 = input.LA(1);

            if ( (LA27_0==PROCEDURE) ) {
                alt27=1;
            }
            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:106:5: procedureDeclaration ';'
                    {
                    dbg.location(106,5);
                    pushFollow(FOLLOW_procedureDeclaration_in_procedureDeclarations721);
                    procedureDeclaration106=procedureDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, procedureDeclaration106.getTree());
                    dbg.location(106,26);
                    char_literal107=(Token)match(input,41,FOLLOW_41_in_procedureDeclarations723); 
                    char_literal107_tree = (Object)adaptor.create(char_literal107);
                    adaptor.addChild(root_0, char_literal107_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(27);}


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
        dbg.location(106, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "procedureDeclarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "procedureDeclarations"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:108:1: varDeclarations : ( VARDEF ( identList ':' type ';' )* )? -> ( ( ^( VARDEF ( identList )? type ) )* )? ;
    public final OberonParser.varDeclarations_return varDeclarations() throws RecognitionException {
        OberonParser.varDeclarations_return retval = new OberonParser.varDeclarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token VARDEF108=null;
        Token char_literal110=null;
        Token char_literal112=null;
        OberonParser.identList_return identList109 = null;

        OberonParser.type_return type111 = null;


        Object VARDEF108_tree=null;
        Object char_literal110_tree=null;
        Object char_literal112_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_VARDEF=new RewriteRuleTokenStream(adaptor,"token VARDEF");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "varDeclarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:109:2: ( ( VARDEF ( identList ':' type ';' )* )? -> ( ( ^( VARDEF ( identList )? type ) )* )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:109:4: ( VARDEF ( identList ':' type ';' )* )?
            {
            dbg.location(109,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:109:4: ( VARDEF ( identList ':' type ';' )* )?
            int alt29=2;
            try { dbg.enterSubRule(29);
            try { dbg.enterDecision(29, decisionCanBacktrack[29]);

            int LA29_0 = input.LA(1);

            if ( (LA29_0==VARDEF) ) {
                alt29=1;
            }
            } finally {dbg.exitDecision(29);}

            switch (alt29) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:109:5: VARDEF ( identList ':' type ';' )*
                    {
                    dbg.location(109,5);
                    VARDEF108=(Token)match(input,VARDEF,FOLLOW_VARDEF_in_varDeclarations735);  
                    stream_VARDEF.add(VARDEF108);

                    dbg.location(109,12);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:109:12: ( identList ':' type ';' )*
                    try { dbg.enterSubRule(28);

                    loop28:
                    do {
                        int alt28=2;
                        try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==LETTER) ) {
                            alt28=1;
                        }


                        } finally {dbg.exitDecision(28);}

                        switch (alt28) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:109:13: identList ':' type ';'
                    	    {
                    	    dbg.location(109,13);
                    	    pushFollow(FOLLOW_identList_in_varDeclarations738);
                    	    identList109=identList();

                    	    state._fsp--;

                    	    stream_identList.add(identList109.getTree());
                    	    dbg.location(109,23);
                    	    char_literal110=(Token)match(input,44,FOLLOW_44_in_varDeclarations740);  
                    	    stream_44.add(char_literal110);

                    	    dbg.location(109,27);
                    	    pushFollow(FOLLOW_type_in_varDeclarations742);
                    	    type111=type();

                    	    state._fsp--;

                    	    stream_type.add(type111.getTree());
                    	    dbg.location(109,32);
                    	    char_literal112=(Token)match(input,41,FOLLOW_41_in_varDeclarations744);  
                    	    stream_41.add(char_literal112);


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(28);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(29);}



            // AST REWRITE
            // elements: VARDEF, identList, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 110:2: -> ( ( ^( VARDEF ( identList )? type ) )* )?
            {
                dbg.location(110,6);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:6: ( ( ^( VARDEF ( identList )? type ) )* )?
                if ( stream_VARDEF.hasNext()||stream_type.hasNext() ) {
                    dbg.location(110,8);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:8: ( ^( VARDEF ( identList )? type ) )*
                    while ( stream_VARDEF.hasNext()||stream_type.hasNext() ) {
                        dbg.location(110,8);
                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:8: ^( VARDEF ( identList )? type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(110,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_VARDEF.nextNode(), root_1);

                        dbg.location(110,17);
                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:110:17: ( identList )?
                        if ( stream_identList.hasNext() ) {
                            dbg.location(110,17);
                            adaptor.addChild(root_1, stream_identList.nextTree());

                        }
                        stream_identList.reset();
                        dbg.location(110,28);
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
        dbg.location(110, 36);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "varDeclarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "varDeclarations"

    public static class typeDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:112:1: typeDeclarations : ( TYPEDEF ( ident '=' type ';' )* )? -> ( ( ^( TYPEDEF ident type ) )* )? ;
    public final OberonParser.typeDeclarations_return typeDeclarations() throws RecognitionException {
        OberonParser.typeDeclarations_return retval = new OberonParser.typeDeclarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TYPEDEF113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        OberonParser.ident_return ident114 = null;

        OberonParser.type_return type116 = null;


        Object TYPEDEF113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal117_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_TYPEDEF=new RewriteRuleTokenStream(adaptor,"token TYPEDEF");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try { dbg.enterRule(getGrammarFileName(), "typeDeclarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:113:2: ( ( TYPEDEF ( ident '=' type ';' )* )? -> ( ( ^( TYPEDEF ident type ) )* )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:113:4: ( TYPEDEF ( ident '=' type ';' )* )?
            {
            dbg.location(113,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:113:4: ( TYPEDEF ( ident '=' type ';' )* )?
            int alt31=2;
            try { dbg.enterSubRule(31);
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==TYPEDEF) ) {
                alt31=1;
            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:113:5: TYPEDEF ( ident '=' type ';' )*
                    {
                    dbg.location(113,5);
                    TYPEDEF113=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typeDeclarations778);  
                    stream_TYPEDEF.add(TYPEDEF113);

                    dbg.location(113,13);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:113:13: ( ident '=' type ';' )*
                    try { dbg.enterSubRule(30);

                    loop30:
                    do {
                        int alt30=2;
                        try { dbg.enterDecision(30, decisionCanBacktrack[30]);

                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==LETTER) ) {
                            alt30=1;
                        }


                        } finally {dbg.exitDecision(30);}

                        switch (alt30) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:113:14: ident '=' type ';'
                    	    {
                    	    dbg.location(113,14);
                    	    pushFollow(FOLLOW_ident_in_typeDeclarations781);
                    	    ident114=ident();

                    	    state._fsp--;

                    	    stream_ident.add(ident114.getTree());
                    	    dbg.location(113,20);
                    	    char_literal115=(Token)match(input,26,FOLLOW_26_in_typeDeclarations783);  
                    	    stream_26.add(char_literal115);

                    	    dbg.location(113,24);
                    	    pushFollow(FOLLOW_type_in_typeDeclarations785);
                    	    type116=type();

                    	    state._fsp--;

                    	    stream_type.add(type116.getTree());
                    	    dbg.location(113,29);
                    	    char_literal117=(Token)match(input,41,FOLLOW_41_in_typeDeclarations787);  
                    	    stream_41.add(char_literal117);


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(30);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(31);}



            // AST REWRITE
            // elements: ident, TYPEDEF, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 114:2: -> ( ( ^( TYPEDEF ident type ) )* )?
            {
                dbg.location(114,6);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:6: ( ( ^( TYPEDEF ident type ) )* )?
                if ( stream_ident.hasNext()||stream_TYPEDEF.hasNext()||stream_type.hasNext() ) {
                    dbg.location(114,8);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:8: ( ^( TYPEDEF ident type ) )*
                    while ( stream_ident.hasNext()||stream_TYPEDEF.hasNext()||stream_type.hasNext() ) {
                        dbg.location(114,8);
                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:114:8: ^( TYPEDEF ident type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(114,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_TYPEDEF.nextNode(), root_1);

                        dbg.location(114,18);
                        adaptor.addChild(root_1, stream_ident.nextTree());
                        dbg.location(114,24);
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    stream_ident.reset();
                    stream_TYPEDEF.reset();
                    stream_type.reset();

                }
                stream_ident.reset();
                stream_TYPEDEF.reset();
                stream_type.reset();

            }

            retval.tree = root_0;
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
        dbg.location(114, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "typeDeclarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "typeDeclarations"

    public static class constantDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:116:1: constantDeclarations : ( CONSTDEF ( ident '=' expression ';' )* )? -> ( ( ^( CONSTDEF ident expression ) )* )? ;
    public final OberonParser.constantDeclarations_return constantDeclarations() throws RecognitionException {
        OberonParser.constantDeclarations_return retval = new OberonParser.constantDeclarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTDEF118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        OberonParser.ident_return ident119 = null;

        OberonParser.expression_return expression121 = null;


        Object CONSTDEF118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_CONSTDEF=new RewriteRuleTokenStream(adaptor,"token CONSTDEF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try { dbg.enterRule(getGrammarFileName(), "constantDeclarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(116, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:117:2: ( ( CONSTDEF ( ident '=' expression ';' )* )? -> ( ( ^( CONSTDEF ident expression ) )* )? )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:117:4: ( CONSTDEF ( ident '=' expression ';' )* )?
            {
            dbg.location(117,4);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:117:4: ( CONSTDEF ( ident '=' expression ';' )* )?
            int alt33=2;
            try { dbg.enterSubRule(33);
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==CONSTDEF) ) {
                alt33=1;
            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:117:5: CONSTDEF ( ident '=' expression ';' )*
                    {
                    dbg.location(117,5);
                    CONSTDEF118=(Token)match(input,CONSTDEF,FOLLOW_CONSTDEF_in_constantDeclarations818);  
                    stream_CONSTDEF.add(CONSTDEF118);

                    dbg.location(117,14);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:117:14: ( ident '=' expression ';' )*
                    try { dbg.enterSubRule(32);

                    loop32:
                    do {
                        int alt32=2;
                        try { dbg.enterDecision(32, decisionCanBacktrack[32]);

                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==LETTER) ) {
                            alt32=1;
                        }


                        } finally {dbg.exitDecision(32);}

                        switch (alt32) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:117:15: ident '=' expression ';'
                    	    {
                    	    dbg.location(117,15);
                    	    pushFollow(FOLLOW_ident_in_constantDeclarations821);
                    	    ident119=ident();

                    	    state._fsp--;

                    	    stream_ident.add(ident119.getTree());
                    	    dbg.location(117,21);
                    	    char_literal120=(Token)match(input,26,FOLLOW_26_in_constantDeclarations823);  
                    	    stream_26.add(char_literal120);

                    	    dbg.location(117,25);
                    	    pushFollow(FOLLOW_expression_in_constantDeclarations825);
                    	    expression121=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression121.getTree());
                    	    dbg.location(117,36);
                    	    char_literal122=(Token)match(input,41,FOLLOW_41_in_constantDeclarations827);  
                    	    stream_41.add(char_literal122);


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(32);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(33);}



            // AST REWRITE
            // elements: CONSTDEF, expression, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:2: -> ( ( ^( CONSTDEF ident expression ) )* )?
            {
                dbg.location(118,6);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:6: ( ( ^( CONSTDEF ident expression ) )* )?
                if ( stream_CONSTDEF.hasNext()||stream_expression.hasNext()||stream_ident.hasNext() ) {
                    dbg.location(118,8);
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:8: ( ^( CONSTDEF ident expression ) )*
                    while ( stream_CONSTDEF.hasNext()||stream_expression.hasNext()||stream_ident.hasNext() ) {
                        dbg.location(118,8);
                        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:118:8: ^( CONSTDEF ident expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        dbg.location(118,10);
                        root_1 = (Object)adaptor.becomeRoot(stream_CONSTDEF.nextNode(), root_1);

                        dbg.location(118,19);
                        adaptor.addChild(root_1, stream_ident.nextTree());
                        dbg.location(118,25);
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    stream_CONSTDEF.reset();
                    stream_expression.reset();
                    stream_ident.reset();

                }
                stream_CONSTDEF.reset();
                stream_expression.reset();
                stream_ident.reset();

            }

            retval.tree = root_0;
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
        dbg.location(118, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "constantDeclarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "constantDeclarations"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:120:1: declarations : constantDeclarations typeDeclarations varDeclarations procedureDeclarations ;
    public final OberonParser.declarations_return declarations() throws RecognitionException {
        OberonParser.declarations_return retval = new OberonParser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        OberonParser.constantDeclarations_return constantDeclarations123 = null;

        OberonParser.typeDeclarations_return typeDeclarations124 = null;

        OberonParser.varDeclarations_return varDeclarations125 = null;

        OberonParser.procedureDeclarations_return procedureDeclarations126 = null;



        try { dbg.enterRule(getGrammarFileName(), "declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:121:2: ( constantDeclarations typeDeclarations varDeclarations procedureDeclarations )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:121:4: constantDeclarations typeDeclarations varDeclarations procedureDeclarations
            {
            root_0 = (Object)adaptor.nil();

            dbg.location(121,4);
            pushFollow(FOLLOW_constantDeclarations_in_declarations857);
            constantDeclarations123=constantDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, constantDeclarations123.getTree());
            dbg.location(121,25);
            pushFollow(FOLLOW_typeDeclarations_in_declarations859);
            typeDeclarations124=typeDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, typeDeclarations124.getTree());
            dbg.location(121,42);
            pushFollow(FOLLOW_varDeclarations_in_declarations861);
            varDeclarations125=varDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, varDeclarations125.getTree());
            dbg.location(121,58);
            pushFollow(FOLLOW_procedureDeclarations_in_declarations863);
            procedureDeclarations126=procedureDeclarations();

            state._fsp--;

            adaptor.addChild(root_0, procedureDeclarations126.getTree());

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
        dbg.location(121, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarations"

    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:123:1: module : 'MODULE' ident ';' declarations ( 'BEGIN' statementSequence )? 'END' ident '.' -> ^( 'MODULE' ^( DECL declarations ) statementSequence ) ;
    public final OberonParser.module_return module() throws RecognitionException {
        OberonParser.module_return retval = new OberonParser.module_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal127=null;
        Token char_literal129=null;
        Token string_literal131=null;
        Token string_literal133=null;
        Token char_literal135=null;
        OberonParser.ident_return ident128 = null;

        OberonParser.declarations_return declarations130 = null;

        OberonParser.statementSequence_return statementSequence132 = null;

        OberonParser.ident_return ident134 = null;


        Object string_literal127_tree=null;
        Object char_literal129_tree=null;
        Object string_literal131_tree=null;
        Object string_literal133_tree=null;
        Object char_literal135_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try { dbg.enterRule(getGrammarFileName(), "module");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 1);

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:123:8: ( 'MODULE' ident ';' declarations ( 'BEGIN' statementSequence )? 'END' ident '.' -> ^( 'MODULE' ^( DECL declarations ) statementSequence ) )
            dbg.enterAlt(1);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:123:10: 'MODULE' ident ';' declarations ( 'BEGIN' statementSequence )? 'END' ident '.'
            {
            dbg.location(123,10);
            string_literal127=(Token)match(input,47,FOLLOW_47_in_module871);  
            stream_47.add(string_literal127);

            dbg.location(123,19);
            pushFollow(FOLLOW_ident_in_module873);
            ident128=ident();

            state._fsp--;

            stream_ident.add(ident128.getTree());
            dbg.location(123,25);
            char_literal129=(Token)match(input,41,FOLLOW_41_in_module875);  
            stream_41.add(char_literal129);

            dbg.location(123,29);
            pushFollow(FOLLOW_declarations_in_module877);
            declarations130=declarations();

            state._fsp--;

            stream_declarations.add(declarations130.getTree());
            dbg.location(123,42);
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:123:42: ( 'BEGIN' statementSequence )?
            int alt34=2;
            try { dbg.enterSubRule(34);
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:123:43: 'BEGIN' statementSequence
                    {
                    dbg.location(123,43);
                    string_literal131=(Token)match(input,46,FOLLOW_46_in_module880);  
                    stream_46.add(string_literal131);

                    dbg.location(123,51);
                    pushFollow(FOLLOW_statementSequence_in_module882);
                    statementSequence132=statementSequence();

                    state._fsp--;

                    stream_statementSequence.add(statementSequence132.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(34);}

            dbg.location(123,71);
            string_literal133=(Token)match(input,38,FOLLOW_38_in_module886);  
            stream_38.add(string_literal133);

            dbg.location(123,77);
            pushFollow(FOLLOW_ident_in_module888);
            ident134=ident();

            state._fsp--;

            stream_ident.add(ident134.getTree());
            dbg.location(123,83);
            char_literal135=(Token)match(input,13,FOLLOW_13_in_module890);  
            stream_13.add(char_literal135);



            // AST REWRITE
            // elements: declarations, statementSequence, 47
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 124:2: -> ^( 'MODULE' ^( DECL declarations ) statementSequence )
            {
                dbg.location(124,6);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:124:6: ^( 'MODULE' ^( DECL declarations ) statementSequence )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(124,8);
                root_1 = (Object)adaptor.becomeRoot(stream_47.nextNode(), root_1);

                dbg.location(124,17);
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:124:17: ^( DECL declarations )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(124,19);
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(DECL, "DECL"), root_2);

                dbg.location(124,24);
                adaptor.addChild(root_2, stream_declarations.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(124,38);
                adaptor.addChild(root_1, stream_statementSequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
        dbg.location(124, 56);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "module");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "module"

    // Delegated rules


 

    public static final BitSet FOLLOW_LETTER_in_ident134 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_ident136 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_DIGIT_in_integer152 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_DIGIT_in_integer155 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_integer_in_number165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_selector173 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_selector175 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_14_in_selector179 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_selector181 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_selector183 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_ident_in_factor196 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_selector_in_factor198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_factor206 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_factor208 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_factor210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_factor214 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_factor_in_factor216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term225 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_set_in_term228 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_factor_in_term244 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_set_in_simpleExpression257 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_term_in_simpleExpression266 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_set_in_simpleExpression269 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_term_in_simpleExpression279 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression291 = new BitSet(new long[]{0x00000000FC000002L});
    public static final BitSet FOLLOW_set_in_expression294 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_simpleExpression_in_expression318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment331 = new BitSet(new long[]{0x0000000100006000L});
    public static final BitSet FOLLOW_selector_in_assignment333 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_assignment335 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_assignment337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_actualParameters347 = new BitSet(new long[]{0x0000000001871800L});
    public static final BitSet FOLLOW_expression_in_actualParameters350 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_33_in_actualParameters353 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_actualParameters355 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_17_in_actualParameters361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_procedureCall372 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_selector_in_procedureCall374 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_subCall387 = new BitSet(new long[]{0x0000000100016000L});
    public static final BitSet FOLLOW_selector_in_subCall389 = new BitSet(new long[]{0x0000000100010002L});
    public static final BitSet FOLLOW_32_in_subCall392 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_subCall394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_subCall399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ifStatement411 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_ifStatement413 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifStatement415 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement417 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_36_in_ifStatement420 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_ifStatement422 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ifStatement424 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement426 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_37_in_ifStatement431 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement433 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ifStatement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_whileStatement446 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_whileStatement448 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_whileStatement450 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement452 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_whileStatement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subCall_in_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence486 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_statementSequence489 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statement_in_statementSequence491 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ident_in_identList502 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_identList505 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_identList507 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_42_in_arrayType519 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_arrayType521 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_arrayType523 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_arrayType525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList535 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_fieldList537 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_fieldList539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_recordType550 = new BitSet(new long[]{0x0000024000000800L});
    public static final BitSet FOLLOW_fieldList_in_recordType552 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_recordType555 = new BitSet(new long[]{0x0000024000000800L});
    public static final BitSet FOLLOW_fieldList_in_recordType558 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_recordType562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDEF_in_fPSection607 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_identList_in_fPSection611 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_fPSection613 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_fPSection615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_formalParameters624 = new BitSet(new long[]{0x0000000000020900L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters627 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_41_in_formalParameters630 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters632 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_formalParameters638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody647 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_46_in_procedureBody650 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody652 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procedureBody656 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_procedureBody658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading668 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_procedureHeading670 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration696 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_procedureDeclaration698 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_procedureDeclarations721 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_procedureDeclarations723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARDEF_in_varDeclarations735 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_identList_in_varDeclarations738 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_varDeclarations740 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_varDeclarations742 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_varDeclarations744 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_TYPEDEF_in_typeDeclarations778 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ident_in_typeDeclarations781 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_typeDeclarations783 = new BitSet(new long[]{0x0000240000000800L});
    public static final BitSet FOLLOW_type_in_typeDeclarations785 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_typeDeclarations787 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_CONSTDEF_in_constantDeclarations818 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ident_in_constantDeclarations821 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_constantDeclarations823 = new BitSet(new long[]{0x0000000001851800L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations825 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_constantDeclarations827 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations857 = new BitSet(new long[]{0x0000000000000160L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations859 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations861 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_module871 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_module873 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_module875 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_declarations_in_module877 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_46_in_module880 = new BitSet(new long[]{0x0000028400000800L});
    public static final BitSet FOLLOW_statementSequence_in_module882 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_module886 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ident_in_module888 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_module890 = new BitSet(new long[]{0x0000000000000002L});

}