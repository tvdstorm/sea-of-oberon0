// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-03 00:07:41

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.OberonRootNode;
import nl.bve.uva.oberon.ast.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "'('", "')'", "'.'", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int DIV=7;
    public static final int MOD=8;
    public static final int EQUALS=9;
    public static final int OR=10;
    public static final int AND=11;
    public static final int LT=12;
    public static final int LT_EQ=13;
    public static final int GT=14;
    public static final int GT_EQ=15;
    public static final int IDENT=16;
    public static final int INTEGER=17;
    public static final int LETTER=18;
    public static final int DIGIT=19;
    public static final int WHITESPACE=20;

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
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        public IInterpretableNode prog;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:1: prog returns [IInterpretableNode prog] : expression ;
    public final Oberon0Parser.prog_return prog() throws RecognitionException {
        Oberon0Parser.prog_return retval = new Oberon0Parser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Oberon0Parser.expression_return expression1 = null;



        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:40:2: ( expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:40:4: expression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expression_in_prog189);
            expression1=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression1.getTree());
            retval.prog = (expression1!=null?expression1.expr:null); 

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
    // $ANTLR end "prog"

    public static class expression_return extends ParserRuleReturnScope {
        public IInterpretableNode expr;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:1: expression returns [IInterpretableNode expr] : s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALS2=null;
        Token LT3=null;
        Token LT_EQ4=null;
        Token GT5=null;
        Token GT_EQ6=null;
        Oberon0Parser.simpleExpression_return s1 = null;

        Oberon0Parser.simpleExpression_return s2 = null;


        Object EQUALS2_tree=null;
        Object LT3_tree=null;
        Object LT_EQ4_tree=null;
        Object GT5_tree=null;
        Object GT_EQ6_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:4: s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression211);
            s1=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, s1.getTree());
            retval.expr = (s1!=null?s1.sexpr:null); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:3: ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            int alt1=6;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt1=1;
                    }
                    break;
                case LT:
                    {
                    alt1=2;
                    }
                    break;
                case LT_EQ:
                    {
                    alt1=3;
                    }
                    break;
                case GT:
                    {
                    alt1=4;
                    }
                    break;
                case GT_EQ:
                    {
                    alt1=5;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:5: EQUALS s2= simpleExpression
                    {
                    EQUALS2=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_expression222); 
                    EQUALS2_tree = (Object)adaptor.create(EQUALS2);
                    adaptor.addChild(root_0, EQUALS2_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression226);
                    s2=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, s2.getTree());
                    retval.expr = new EqualsExprNode((s1!=null?s1.sexpr:null), (s2!=null?s2.sexpr:null)); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:46:5: LT s2= simpleExpression
                    {
                    LT3=(Token)match(input,LT,FOLLOW_LT_in_expression238); 
                    LT3_tree = (Object)adaptor.create(LT3);
                    adaptor.addChild(root_0, LT3_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression242);
                    s2=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, s2.getTree());
                    retval.expr = new LTExprNode((s1!=null?s1.sexpr:null), (s2!=null?s2.sexpr:null)); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:47:5: LT_EQ s2= simpleExpression
                    {
                    LT_EQ4=(Token)match(input,LT_EQ,FOLLOW_LT_EQ_in_expression251); 
                    LT_EQ4_tree = (Object)adaptor.create(LT_EQ4);
                    adaptor.addChild(root_0, LT_EQ4_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression255);
                    s2=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, s2.getTree());
                    retval.expr = new LTEqualsExprNode((s1!=null?s1.sexpr:null), (s2!=null?s2.sexpr:null)); 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:5: GT s2= simpleExpression
                    {
                    GT5=(Token)match(input,GT,FOLLOW_GT_in_expression264); 
                    GT5_tree = (Object)adaptor.create(GT5);
                    adaptor.addChild(root_0, GT5_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression268);
                    s2=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, s2.getTree());
                    retval.expr = new GTExprNode((s1!=null?s1.sexpr:null), (s2!=null?s2.sexpr:null)); 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:5: GT_EQ s2= simpleExpression
                    {
                    GT_EQ6=(Token)match(input,GT_EQ,FOLLOW_GT_EQ_in_expression277); 
                    GT_EQ6_tree = (Object)adaptor.create(GT_EQ6);
                    adaptor.addChild(root_0, GT_EQ6_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression281);
                    s2=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, s2.getTree());
                    retval.expr = new GTEqualsExprNode((s1!=null?s1.sexpr:null), (s2!=null?s2.sexpr:null)); 

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

    public static class simpleExpression_return extends ParserRuleReturnScope {
        public IInterpretableNode sexpr;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:52:1: simpleExpression returns [IInterpretableNode sexpr] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS7=null;
        Token MINUS8=null;
        Token PLUS9=null;
        Token MINUS10=null;
        Token OR11=null;
        Oberon0Parser.term_return t1 = null;

        Oberon0Parser.term_return t2 = null;


        Object PLUS7_tree=null;
        Object MINUS8_tree=null;
        Object PLUS9_tree=null;
        Object MINUS10_tree=null;
        Object OR11_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:53:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            int alt3=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt3=1;
                }
                break;
            case MINUS:
                {
                alt3=2;
                }
                break;
            case IDENT:
            case INTEGER:
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:53:6: PLUS t1= term
                    {
                    root_0 = (Object)adaptor.nil();

                    PLUS7=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression304); 
                    PLUS7_tree = (Object)adaptor.create(PLUS7);
                    adaptor.addChild(root_0, PLUS7_tree);

                    pushFollow(FOLLOW_term_in_simpleExpression308);
                    t1=term();

                    state._fsp--;

                    adaptor.addChild(root_0, t1.getTree());
                    retval.sexpr = (t1!=null?t1.term:null); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:54:5: MINUS t1= term
                    {
                    root_0 = (Object)adaptor.nil();

                    MINUS8=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression321); 
                    MINUS8_tree = (Object)adaptor.create(MINUS8);
                    adaptor.addChild(root_0, MINUS8_tree);

                    pushFollow(FOLLOW_term_in_simpleExpression325);
                    t1=term();

                    state._fsp--;

                    adaptor.addChild(root_0, t1.getTree());
                    retval.sexpr = new NegativeNode((t1!=null?t1.term:null)); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_term_in_simpleExpression339);
                    t1=term();

                    state._fsp--;

                    adaptor.addChild(root_0, t1.getTree());
                    retval.sexpr = (t1!=null?t1.term:null); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    loop2:
                    do {
                        int alt2=4;
                        switch ( input.LA(1) ) {
                        case PLUS:
                            {
                            alt2=1;
                            }
                            break;
                        case MINUS:
                            {
                            alt2=2;
                            }
                            break;
                        case OR:
                            {
                            alt2=3;
                            }
                            break;

                        }

                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:5: PLUS t2= term
                    	    {
                    	    PLUS9=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression353); 
                    	    PLUS9_tree = (Object)adaptor.create(PLUS9);
                    	    adaptor.addChild(root_0, PLUS9_tree);

                    	    pushFollow(FOLLOW_term_in_simpleExpression357);
                    	    t2=term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, t2.getTree());
                    	    retval.sexpr = new PlusExprNode(retval.sexpr, (t2!=null?t2.term:null)); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:5: MINUS t2= term
                    	    {
                    	    MINUS10=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression369); 
                    	    MINUS10_tree = (Object)adaptor.create(MINUS10);
                    	    adaptor.addChild(root_0, MINUS10_tree);

                    	    pushFollow(FOLLOW_term_in_simpleExpression373);
                    	    t2=term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, t2.getTree());
                    	    retval.sexpr = new MinusExprNode(retval.sexpr, (t2!=null?t2.term:null)); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:5: OR t2= term
                    	    {
                    	    OR11=(Token)match(input,OR,FOLLOW_OR_in_simpleExpression385); 
                    	    OR11_tree = (Object)adaptor.create(OR11);
                    	    adaptor.addChild(root_0, OR11_tree);

                    	    pushFollow(FOLLOW_term_in_simpleExpression389);
                    	    t2=term();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, t2.getTree());
                    	    retval.sexpr = new OrExprNode(retval.sexpr, (t2!=null?t2.term:null)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
        return retval;
    }
    // $ANTLR end "simpleExpression"

    public static class term_return extends ParserRuleReturnScope {
        public IInterpretableNode term;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:61:1: term returns [IInterpretableNode term] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MULT12=null;
        Token DIV13=null;
        Token MOD14=null;
        Token AND15=null;
        Oberon0Parser.factor_return f1 = null;

        Oberon0Parser.factor_return f2 = null;


        Object MULT12_tree=null;
        Object DIV13_tree=null;
        Object MOD14_tree=null;
        Object AND15_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term415);
            f1=factor();

            state._fsp--;

            adaptor.addChild(root_0, f1.getTree());
            retval.term = (f1!=null?f1.fact:null); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:2: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=MULT && LA5_0<=MOD)||LA5_0==AND) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    int alt4=4;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt4=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt4=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt4=3;
            	        }
            	        break;
            	    case AND:
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
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:6: MULT f2= factor
            	            {
            	            MULT12=(Token)match(input,MULT,FOLLOW_MULT_in_term430); 
            	            MULT12_tree = (Object)adaptor.create(MULT12);
            	            adaptor.addChild(root_0, MULT12_tree);

            	            pushFollow(FOLLOW_factor_in_term434);
            	            f2=factor();

            	            state._fsp--;

            	            adaptor.addChild(root_0, f2.getTree());
            	            retval.term = new MultExprNode((f1!=null?f1.fact:null), (f2!=null?f2.fact:null)); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:5: DIV f2= factor
            	            {
            	            DIV13=(Token)match(input,DIV,FOLLOW_DIV_in_term445); 
            	            DIV13_tree = (Object)adaptor.create(DIV13);
            	            adaptor.addChild(root_0, DIV13_tree);

            	            pushFollow(FOLLOW_factor_in_term449);
            	            f2=factor();

            	            state._fsp--;

            	            adaptor.addChild(root_0, f2.getTree());
            	            retval.term = new DivExprNode((f1!=null?f1.fact:null), (f2!=null?f2.fact:null)); 

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:5: MOD f2= factor
            	            {
            	            MOD14=(Token)match(input,MOD,FOLLOW_MOD_in_term461); 
            	            MOD14_tree = (Object)adaptor.create(MOD14);
            	            adaptor.addChild(root_0, MOD14_tree);

            	            pushFollow(FOLLOW_factor_in_term465);
            	            f2=factor();

            	            state._fsp--;

            	            adaptor.addChild(root_0, f2.getTree());
            	            retval.term = new ModExprNode((f1!=null?f1.fact:null), (f2!=null?f2.fact:null)); 

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:66:5: AND f2= factor
            	            {
            	            AND15=(Token)match(input,AND,FOLLOW_AND_in_term477); 
            	            AND15_tree = (Object)adaptor.create(AND15);
            	            adaptor.addChild(root_0, AND15_tree);

            	            pushFollow(FOLLOW_factor_in_term481);
            	            f2=factor();

            	            state._fsp--;

            	            adaptor.addChild(root_0, f2.getTree());
            	            retval.term = new AndExprNode((f1!=null?f1.fact:null), (f2!=null?f2.fact:null)); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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

    public static class factor_return extends ParserRuleReturnScope {
        public IInterpretableNode fact;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:1: factor returns [IInterpretableNode fact] : ( IDENT selector | number | '(' expression ')' );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT16=null;
        Token char_literal19=null;
        Token char_literal21=null;
        Oberon0Parser.selector_return selector17 = null;

        Oberon0Parser.number_return number18 = null;

        Oberon0Parser.expression_return expression20 = null;


        Object IDENT16_tree=null;
        Object char_literal19_tree=null;
        Object char_literal21_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:2: ( IDENT selector | number | '(' expression ')' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt6=1;
                }
                break;
            case INTEGER:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:4: IDENT selector
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor508); 
                    IDENT16_tree = (Object)adaptor.create(IDENT16);
                    adaptor.addChild(root_0, IDENT16_tree);

                    pushFollow(FOLLOW_selector_in_factor510);
                    selector17=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector17.getTree());
                    retval.fact = new IdentNode((IDENT16!=null?IDENT16.getText():null), (selector17!=null?selector17.select:null)); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:72:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor522);
                    number18=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number18.getTree());
                    retval.fact = (number18!=null?number18.nr:null); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:73:4: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal19=(Token)match(input,21,FOLLOW_21_in_factor536); 
                    char_literal19_tree = (Object)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);

                    pushFollow(FOLLOW_expression_in_factor538);
                    expression20=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression20.getTree());
                    char_literal21=(Token)match(input,22,FOLLOW_22_in_factor540); 
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);

                    retval.fact = (expression20!=null?expression20.expr:null); 

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
        return retval;
    }
    // $ANTLR end "factor"

    public static class selector_return extends ParserRuleReturnScope {
        public IInterpretableNode select;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:1: selector returns [IInterpretableNode select] : ( '.' IDENT | '[' expression ']' )* ;
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        Token IDENT23=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Oberon0Parser.expression_return expression25 = null;


        Object char_literal22_tree=null;
        Object IDENT23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:2: ( ( '.' IDENT | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:4: ( '.' IDENT | '[' expression ']' )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:4: ( '.' IDENT | '[' expression ']' )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }
                else if ( (LA7_0==24) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:5: '.' IDENT
            	    {
            	    char_literal22=(Token)match(input,23,FOLLOW_23_in_selector568); 
            	    char_literal22_tree = (Object)adaptor.create(char_literal22);
            	    adaptor.addChild(root_0, char_literal22_tree);

            	    IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector570); 
            	    IDENT23_tree = (Object)adaptor.create(IDENT23);
            	    adaptor.addChild(root_0, IDENT23_tree);

            	    retval.select = new DotSelectorNode((IDENT23!=null?IDENT23.getText():null)); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:6: '[' expression ']'
            	    {
            	    char_literal24=(Token)match(input,24,FOLLOW_24_in_selector585); 
            	    char_literal24_tree = (Object)adaptor.create(char_literal24);
            	    adaptor.addChild(root_0, char_literal24_tree);

            	    pushFollow(FOLLOW_expression_in_selector587);
            	    expression25=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression25.getTree());
            	    char_literal26=(Token)match(input,25,FOLLOW_25_in_selector589); 
            	    char_literal26_tree = (Object)adaptor.create(char_literal26);
            	    adaptor.addChild(root_0, char_literal26_tree);

            	    retval.select = new ElementSelectorNode((expression25!=null?expression25.expr:null)); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
        public IInterpretableNode nr;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:1: number returns [IInterpretableNode nr] : INTEGER ;
    public final Oberon0Parser.number_return number() throws RecognitionException {
        Oberon0Parser.number_return retval = new Oberon0Parser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER27=null;

        Object INTEGER27_tree=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:2: ( INTEGER )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:4: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            INTEGER27=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number613); 
            INTEGER27_tree = (Object)adaptor.create(INTEGER27);
            adaptor.addChild(root_0, INTEGER27_tree);

            retval.nr = new NumberNode(Integer.parseInt((INTEGER27!=null?INTEGER27.getText():null))); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_expression_in_prog189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression211 = new BitSet(new long[]{0x000000000000F202L});
    public static final BitSet FOLLOW_EQUALS_in_expression222 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression238 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression251 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression264 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression277 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression304 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_term_in_simpleExpression308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression321 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_term_in_simpleExpression325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression339 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression353 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_term_in_simpleExpression357 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression369 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_term_in_simpleExpression373 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_OR_in_simpleExpression385 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_term_in_simpleExpression389 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_factor_in_term415 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MULT_in_term430 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_factor_in_term434 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_DIV_in_term445 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_factor_in_term449 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MOD_in_term461 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_factor_in_term465 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_AND_in_term477 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_factor_in_term481 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_IDENT_in_factor508 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_selector_in_factor510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_factor536 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_expression_in_factor538 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_factor540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_selector568 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_selector570 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_24_in_selector585 = new BitSet(new long[]{0x0000000000230030L});
    public static final BitSet FOLLOW_expression_in_selector587 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_selector589 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_INTEGER_in_number613 = new BitSet(new long[]{0x0000000000000002L});

}