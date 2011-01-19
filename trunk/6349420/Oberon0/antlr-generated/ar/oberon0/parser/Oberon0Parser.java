// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g 2011-01-19 21:25:30

  package ar.oberon0.parser;
  import ar.oberon0.interpreter.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "LETTER", "DIGIT", "WS", "'.'", "'['", "']'", "'('", "')'", "'~'", "'*'", "'DIV'", "'MOD'", "'&'", "'+'", "'-'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "':='", "','", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'END'", "'WHILE'", "'DO'", "';'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'VAR'", "'PROCEDURE'", "'BEGIN'", "'CONST'", "'TYPE'", "'MODULE'"
    };
    public static final int EOF=-1;
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
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int LETTER=6;
    public static final int DIGIT=7;
    public static final int WS=8;

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
    public String getGrammarFileName() { return "D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g"; }


    public static class selector_return extends ParserRuleReturnScope {
        public Selector result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:17:1: selector[Selector selector] returns [Selector result] : ( '.' IDENT | '[' expression ']' )* ;
    public final Oberon0Parser.selector_return selector(Selector selector) throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal1=null;
        Token IDENT2=null;
        Token char_literal3=null;
        Token char_literal5=null;
        Oberon0Parser.expression_return expression4 = null;


        Object char_literal1_tree=null;
        Object IDENT2_tree=null;
        Object char_literal3_tree=null;
        Object char_literal5_tree=null;

        Selector tempSelector = selector;
        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:19:2: ( ( '.' IDENT | '[' expression ']' )* )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:20:3: ( '.' IDENT | '[' expression ']' )*
            {
            root_0 = (Object)adaptor.nil();

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:20:3: ( '.' IDENT | '[' expression ']' )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }
                else if ( (LA1_0==10) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:20:5: '.' IDENT
            	    {
            	    char_literal1=(Token)match(input,9,FOLLOW_9_in_selector67); 
            	    char_literal1_tree = (Object)adaptor.create(char_literal1);
            	    adaptor.addChild(root_0, char_literal1_tree);

            	    IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector69); 
            	    IDENT2_tree = (Object)adaptor.create(IDENT2);
            	    adaptor.addChild(root_0, IDENT2_tree);

            	    tempSelector.setNextNode(new IdentSelector(IDENT2.getText())); tempSelector = tempSelector.getNextNode();

            	    }
            	    break;
            	case 2 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:21:6: '[' expression ']'
            	    {
            	    char_literal3=(Token)match(input,10,FOLLOW_10_in_selector86); 
            	    char_literal3_tree = (Object)adaptor.create(char_literal3);
            	    adaptor.addChild(root_0, char_literal3_tree);

            	    pushFollow(FOLLOW_expression_in_selector88);
            	    expression4=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression4.getTree());
            	    char_literal5=(Token)match(input,11,FOLLOW_11_in_selector90); 
            	    char_literal5_tree = (Object)adaptor.create(char_literal5);
            	    adaptor.addChild(root_0, char_literal5_tree);

            	    tempSelector.setNextNode(new ArrayItemSelector((expression4!=null?expression4.result:null))); tempSelector = tempSelector.getNextNode();

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            retval.result = selector;

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

    public static class factor_return extends ParserRuleReturnScope {
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:26:1: factor returns [Interpretable result] : ( IDENT selector[sel] | INTEGER | '(' expression ')' | '~' factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT6=null;
        Token INTEGER8=null;
        Token char_literal9=null;
        Token char_literal11=null;
        Token char_literal12=null;
        Oberon0Parser.selector_return selector7 = null;

        Oberon0Parser.expression_return expression10 = null;

        Oberon0Parser.factor_return factor13 = null;


        Object IDENT6_tree=null;
        Object INTEGER8_tree=null;
        Object char_literal9_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:27:2: ( IDENT selector[sel] | INTEGER | '(' expression ')' | '~' factor )
            int alt2=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt2=1;
                }
                break;
            case INTEGER:
                {
                alt2=2;
                }
                break;
            case 12:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:27:4: IDENT selector[sel]
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor134); 
                    IDENT6_tree = (Object)adaptor.create(IDENT6);
                    adaptor.addChild(root_0, IDENT6_tree);

                    Selector sel = new IdentSelector(IDENT6.getText());
                    pushFollow(FOLLOW_selector_in_factor150);
                    selector7=selector(sel);

                    state._fsp--;

                    adaptor.addChild(root_0, selector7.getTree());
                    retval.result = sel;

                    }
                    break;
                case 2 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:29:5: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    INTEGER8=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor166); 
                    INTEGER8_tree = (Object)adaptor.create(INTEGER8);
                    adaptor.addChild(root_0, INTEGER8_tree);

                    retval.result = new IntegerNode(INTEGER8.getText());

                    }
                    break;
                case 3 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:30:5: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal9=(Token)match(input,12,FOLLOW_12_in_factor183); 
                    char_literal9_tree = (Object)adaptor.create(char_literal9);
                    adaptor.addChild(root_0, char_literal9_tree);

                    pushFollow(FOLLOW_expression_in_factor185);
                    expression10=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression10.getTree());
                    char_literal11=(Token)match(input,13,FOLLOW_13_in_factor187); 
                    char_literal11_tree = (Object)adaptor.create(char_literal11);
                    adaptor.addChild(root_0, char_literal11_tree);

                    retval.result = (expression10!=null?expression10.result:null);

                    }
                    break;
                case 4 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:31:5: '~' factor
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal12=(Token)match(input,14,FOLLOW_14_in_factor203); 
                    char_literal12_tree = (Object)adaptor.create(char_literal12);
                    adaptor.addChild(root_0, char_literal12_tree);

                    pushFollow(FOLLOW_factor_in_factor205);
                    factor13=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor13.getTree());
                    retval.result = null;

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

    public static class term_return extends ParserRuleReturnScope {
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:36:1: term returns [Interpretable result] : left= factor ( ( '*' right= factor | 'DIV' right= factor | 'MOD' right= factor | '&' right= factor )* ) ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        Token string_literal15=null;
        Token string_literal16=null;
        Token char_literal17=null;
        Oberon0Parser.factor_return left = null;

        Oberon0Parser.factor_return right = null;


        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object string_literal16_tree=null;
        Object char_literal17_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:37:2: (left= factor ( ( '*' right= factor | 'DIV' right= factor | 'MOD' right= factor | '&' right= factor )* ) )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:37:4: left= factor ( ( '*' right= factor | 'DIV' right= factor | 'MOD' right= factor | '&' right= factor )* )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term236);
            left=factor();

            state._fsp--;

            adaptor.addChild(root_0, left.getTree());
            retval.result = (left!=null?left.result:null);
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:38:3: ( ( '*' right= factor | 'DIV' right= factor | 'MOD' right= factor | '&' right= factor )* )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:39:4: ( '*' right= factor | 'DIV' right= factor | 'MOD' right= factor | '&' right= factor )*
            {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:39:4: ( '*' right= factor | 'DIV' right= factor | 'MOD' right= factor | '&' right= factor )*
            loop3:
            do {
                int alt3=5;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt3=1;
                    }
                    break;
                case 16:
                    {
                    alt3=2;
                    }
                    break;
                case 17:
                    {
                    alt3=3;
                    }
                    break;
                case 18:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:39:6: '*' right= factor
            	    {
            	    char_literal14=(Token)match(input,15,FOLLOW_15_in_term258); 
            	    char_literal14_tree = (Object)adaptor.create(char_literal14);
            	    adaptor.addChild(root_0, char_literal14_tree);

            	    pushFollow(FOLLOW_factor_in_term263);
            	    right=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, right.getTree());
            	    retval.result = new MultNode(retval.result, (right!=null?right.result:null));

            	    }
            	    break;
            	case 2 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:40:7: 'DIV' right= factor
            	    {
            	    string_literal15=(Token)match(input,16,FOLLOW_16_in_term276); 
            	    string_literal15_tree = (Object)adaptor.create(string_literal15);
            	    adaptor.addChild(root_0, string_literal15_tree);

            	    pushFollow(FOLLOW_factor_in_term280);
            	    right=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, right.getTree());
            	    retval.result = new DivNode(retval.result, (right!=null?right.result:null));

            	    }
            	    break;
            	case 3 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:41:7: 'MOD' right= factor
            	    {
            	    string_literal16=(Token)match(input,17,FOLLOW_17_in_term294); 
            	    string_literal16_tree = (Object)adaptor.create(string_literal16);
            	    adaptor.addChild(root_0, string_literal16_tree);

            	    pushFollow(FOLLOW_factor_in_term298);
            	    right=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, right.getTree());
            	    retval.result = new ModNode(retval.result, (right!=null?right.result:null));

            	    }
            	    break;
            	case 4 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:42:7: '&' right= factor
            	    {
            	    char_literal17=(Token)match(input,18,FOLLOW_18_in_term313); 
            	    char_literal17_tree = (Object)adaptor.create(char_literal17);
            	    adaptor.addChild(root_0, char_literal17_tree);

            	    pushFollow(FOLLOW_factor_in_term318);
            	    right=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, right.getTree());
            	    retval.result = new AndNode(retval.result, (right!=null?right.result:null));

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:47:1: simpleExpression returns [Interpretable result] : ( '+' | '-' )? left= term ( '+' right= term | '-' right= term | 'OR' right= term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal18=null;
        Token char_literal19=null;
        Token char_literal20=null;
        Token char_literal21=null;
        Token string_literal22=null;
        Oberon0Parser.term_return left = null;

        Oberon0Parser.term_return right = null;


        Object char_literal18_tree=null;
        Object char_literal19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal21_tree=null;
        Object string_literal22_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:48:2: ( ( '+' | '-' )? left= term ( '+' right= term | '-' right= term | 'OR' right= term )* )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:48:15: ( '+' | '-' )? left= term ( '+' right= term | '-' right= term | 'OR' right= term )*
            {
            root_0 = (Object)adaptor.nil();

             boolean positive = true; 
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:49:3: ( '+' | '-' )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:49:5: '+'
                    {
                    char_literal18=(Token)match(input,19,FOLLOW_19_in_simpleExpression371); 
                    char_literal18_tree = (Object)adaptor.create(char_literal18);
                    adaptor.addChild(root_0, char_literal18_tree);


                    }
                    break;
                case 2 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:50:5: '-'
                    {
                    char_literal19=(Token)match(input,20,FOLLOW_20_in_simpleExpression377); 
                    char_literal19_tree = (Object)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);

                    positive = !positive;

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression400);
            left=term();

            state._fsp--;

            adaptor.addChild(root_0, left.getTree());
            retval.result = (left!=null?left.result:null);
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:53:3: ( '+' right= term | '-' right= term | 'OR' right= term )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt5=1;
                    }
                    break;
                case 20:
                    {
                    alt5=2;
                    }
                    break;
                case 21:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:53:5: '+' right= term
            	    {
            	    char_literal20=(Token)match(input,19,FOLLOW_19_in_simpleExpression417); 
            	    char_literal20_tree = (Object)adaptor.create(char_literal20);
            	    adaptor.addChild(root_0, char_literal20_tree);

            	    pushFollow(FOLLOW_term_in_simpleExpression421);
            	    right=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, right.getTree());
            	    retval.result = new AddNode(retval.result, (right!=null?right.result:null));

            	    }
            	    break;
            	case 2 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:54:5: '-' right= term
            	    {
            	    char_literal21=(Token)match(input,20,FOLLOW_20_in_simpleExpression435); 
            	    char_literal21_tree = (Object)adaptor.create(char_literal21);
            	    adaptor.addChild(root_0, char_literal21_tree);

            	    pushFollow(FOLLOW_term_in_simpleExpression439);
            	    right=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, right.getTree());
            	    retval.result = new MinNode(retval.result, (right!=null?right.result:null));

            	    }
            	    break;
            	case 3 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:55:6: 'OR' right= term
            	    {
            	    string_literal22=(Token)match(input,21,FOLLOW_21_in_simpleExpression454); 
            	    string_literal22_tree = (Object)adaptor.create(string_literal22);
            	    adaptor.addChild(root_0, string_literal22_tree);

            	    pushFollow(FOLLOW_term_in_simpleExpression458);
            	    right=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, right.getTree());
            	    retval.result = new OrNode(retval.result, (right!=null?right.result:null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if(!positive) { retval.result = new NegationNode(retval.result);}

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
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:60:1: expression returns [Interpretable result] : leftExpression= simpleExpression ( '=' rightExpression= simpleExpression | '#' rightExpression= simpleExpression | '<' rightExpression= simpleExpression | '<=' rightExpression= simpleExpression | '>' rightExpression= simpleExpression | '>=' rightExpression= simpleExpression )? ;
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal23=null;
        Token char_literal24=null;
        Token char_literal25=null;
        Token string_literal26=null;
        Token char_literal27=null;
        Token string_literal28=null;
        Oberon0Parser.simpleExpression_return leftExpression = null;

        Oberon0Parser.simpleExpression_return rightExpression = null;


        Object char_literal23_tree=null;
        Object char_literal24_tree=null;
        Object char_literal25_tree=null;
        Object string_literal26_tree=null;
        Object char_literal27_tree=null;
        Object string_literal28_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:61:2: (leftExpression= simpleExpression ( '=' rightExpression= simpleExpression | '#' rightExpression= simpleExpression | '<' rightExpression= simpleExpression | '<=' rightExpression= simpleExpression | '>' rightExpression= simpleExpression | '>=' rightExpression= simpleExpression )? )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:61:4: leftExpression= simpleExpression ( '=' rightExpression= simpleExpression | '#' rightExpression= simpleExpression | '<' rightExpression= simpleExpression | '<=' rightExpression= simpleExpression | '>' rightExpression= simpleExpression | '>=' rightExpression= simpleExpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression505);
            leftExpression=simpleExpression();

            state._fsp--;

            adaptor.addChild(root_0, leftExpression.getTree());
             retval.result = (leftExpression!=null?leftExpression.result:null); 
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:62:3: ( '=' rightExpression= simpleExpression | '#' rightExpression= simpleExpression | '<' rightExpression= simpleExpression | '<=' rightExpression= simpleExpression | '>' rightExpression= simpleExpression | '>=' rightExpression= simpleExpression )?
            int alt6=7;
            switch ( input.LA(1) ) {
                case 22:
                    {
                    alt6=1;
                    }
                    break;
                case 23:
                    {
                    alt6=2;
                    }
                    break;
                case 24:
                    {
                    alt6=3;
                    }
                    break;
                case 25:
                    {
                    alt6=4;
                    }
                    break;
                case 26:
                    {
                    alt6=5;
                    }
                    break;
                case 27:
                    {
                    alt6=6;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:62:5: '=' rightExpression= simpleExpression
                    {
                    char_literal23=(Token)match(input,22,FOLLOW_22_in_expression517); 
                    char_literal23_tree = (Object)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression521);
                    rightExpression=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, rightExpression.getTree());
                     retval.result = new CompareNode(retval.result, (rightExpression!=null?rightExpression.result:null), CompareOperator.EQUAL); 

                    }
                    break;
                case 2 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:63:6: '#' rightExpression= simpleExpression
                    {
                    char_literal24=(Token)match(input,23,FOLLOW_23_in_expression531); 
                    char_literal24_tree = (Object)adaptor.create(char_literal24);
                    adaptor.addChild(root_0, char_literal24_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression535);
                    rightExpression=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, rightExpression.getTree());
                     retval.result = new CompareNode(retval.result, (rightExpression!=null?rightExpression.result:null), CompareOperator.NOT_EQUAL); 

                    }
                    break;
                case 3 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:64:6: '<' rightExpression= simpleExpression
                    {
                    char_literal25=(Token)match(input,24,FOLLOW_24_in_expression545); 
                    char_literal25_tree = (Object)adaptor.create(char_literal25);
                    adaptor.addChild(root_0, char_literal25_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression549);
                    rightExpression=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, rightExpression.getTree());
                     retval.result = new CompareNode(retval.result, (rightExpression!=null?rightExpression.result:null), CompareOperator.SMALLER); 

                    }
                    break;
                case 4 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:65:6: '<=' rightExpression= simpleExpression
                    {
                    string_literal26=(Token)match(input,25,FOLLOW_25_in_expression559); 
                    string_literal26_tree = (Object)adaptor.create(string_literal26);
                    adaptor.addChild(root_0, string_literal26_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression563);
                    rightExpression=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, rightExpression.getTree());
                     retval.result = new CompareNode(retval.result, (rightExpression!=null?rightExpression.result:null), CompareOperator.SMALLER_OR_EQUAL); 

                    }
                    break;
                case 5 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:66:6: '>' rightExpression= simpleExpression
                    {
                    char_literal27=(Token)match(input,26,FOLLOW_26_in_expression573); 
                    char_literal27_tree = (Object)adaptor.create(char_literal27);
                    adaptor.addChild(root_0, char_literal27_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression577);
                    rightExpression=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, rightExpression.getTree());
                     retval.result = new CompareNode(retval.result, (rightExpression!=null?rightExpression.result:null), CompareOperator.GREATER); 

                    }
                    break;
                case 6 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:67:6: '>=' rightExpression= simpleExpression
                    {
                    string_literal28=(Token)match(input,27,FOLLOW_27_in_expression587); 
                    string_literal28_tree = (Object)adaptor.create(string_literal28);
                    adaptor.addChild(root_0, string_literal28_tree);

                    pushFollow(FOLLOW_simpleExpression_in_expression591);
                    rightExpression=simpleExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, rightExpression.getTree());
                     retval.result = new CompareNode(retval.result, (rightExpression!=null?rightExpression.result:null), CompareOperator.GREATER_OR_EQUAL); 

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
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:71:1: assignment returns [Interpretable result] : IDENT selector[sel] ':=' expression ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT29=null;
        Token string_literal31=null;
        Oberon0Parser.selector_return selector30 = null;

        Oberon0Parser.expression_return expression32 = null;


        Object IDENT29_tree=null;
        Object string_literal31_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:72:2: ( IDENT selector[sel] ':=' expression )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:72:4: IDENT selector[sel] ':=' expression
            {
            root_0 = (Object)adaptor.nil();

            IDENT29=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment616); 
            IDENT29_tree = (Object)adaptor.create(IDENT29);
            adaptor.addChild(root_0, IDENT29_tree);

            Selector sel = new IdentSelector(IDENT29.getText());
            pushFollow(FOLLOW_selector_in_assignment637);
            selector30=selector(sel);

            state._fsp--;

            adaptor.addChild(root_0, selector30.getTree());
            string_literal31=(Token)match(input,28,FOLLOW_28_in_assignment640); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_expression_in_assignment642);
            expression32=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression32.getTree());
            retval.result = new AssignmentNode(sel,(expression32!=null?expression32.result:null));

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
        public ActualParametersNode result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:77:1: actualParameters returns [ActualParametersNode result] : '(' (firstParameter= expression ( ',' otherParameter= expression )* )? ')' ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal33=null;
        Token char_literal34=null;
        Token char_literal35=null;
        Oberon0Parser.expression_return firstParameter = null;

        Oberon0Parser.expression_return otherParameter = null;


        Object char_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal35_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:78:2: ( '(' (firstParameter= expression ( ',' otherParameter= expression )* )? ')' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:78:15: '(' (firstParameter= expression ( ',' otherParameter= expression )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            retval.result = new ActualParametersNode();
            char_literal33=(Token)match(input,12,FOLLOW_12_in_actualParameters680); 
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:80:3: (firstParameter= expression ( ',' otherParameter= expression )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=IDENT && LA8_0<=INTEGER)||LA8_0==12||LA8_0==14||(LA8_0>=19 && LA8_0<=20)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:80:5: firstParameter= expression ( ',' otherParameter= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters689);
                    firstParameter=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, firstParameter.getTree());
                    retval.result.AddParameter((firstParameter!=null?firstParameter.result:null));
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:81:4: ( ',' otherParameter= expression )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==29) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:81:6: ',' otherParameter= expression
                    	    {
                    	    char_literal34=(Token)match(input,29,FOLLOW_29_in_actualParameters702); 
                    	    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    	    adaptor.addChild(root_0, char_literal34_tree);

                    	    pushFollow(FOLLOW_expression_in_actualParameters711);
                    	    otherParameter=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, otherParameter.getTree());
                    	    retval.result.AddParameter((otherParameter!=null?otherParameter.result:null));

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal35=(Token)match(input,13,FOLLOW_13_in_actualParameters731); 
            char_literal35_tree = (Object)adaptor.create(char_literal35);
            adaptor.addChild(root_0, char_literal35_tree);


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
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:88:1: procedureCall returns [Interpretable result] : IDENT ( actualParameters )? ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT36=null;
        Oberon0Parser.actualParameters_return actualParameters37 = null;


        Object IDENT36_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:89:2: ( IDENT ( actualParameters )? )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:89:4: IDENT ( actualParameters )?
            {
            root_0 = (Object)adaptor.nil();

            IDENT36=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall748); 
            IDENT36_tree = (Object)adaptor.create(IDENT36);
            adaptor.addChild(root_0, IDENT36_tree);

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:89:10: ( actualParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:89:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall751);
                    actualParameters37=actualParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualParameters37.getTree());

                    }
                    break;

            }

            retval.result = new ProcedureCallNode(IDENT36.getText(),(actualParameters37!=null?actualParameters37.result:null)); 

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
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:92:1: ifStatement returns [Interpretable result] : 'IF' ifExpression= expression 'THEN' ifStatementSequence= statementSequence ( 'ELSIF' elseIfExpression= expression 'THEN' elseIfStatementSequence= statementSequence )* ( 'ELSE' elseStatementSequence= statementSequence )? 'END' ;
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal39=null;
        Token string_literal40=null;
        Token string_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Oberon0Parser.expression_return ifExpression = null;

        Oberon0Parser.statementSequence_return ifStatementSequence = null;

        Oberon0Parser.expression_return elseIfExpression = null;

        Oberon0Parser.statementSequence_return elseIfStatementSequence = null;

        Oberon0Parser.statementSequence_return elseStatementSequence = null;


        Object string_literal38_tree=null;
        Object string_literal39_tree=null;
        Object string_literal40_tree=null;
        Object string_literal41_tree=null;
        Object string_literal42_tree=null;
        Object string_literal43_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:93:2: ( 'IF' ifExpression= expression 'THEN' ifStatementSequence= statementSequence ( 'ELSIF' elseIfExpression= expression 'THEN' elseIfStatementSequence= statementSequence )* ( 'ELSE' elseStatementSequence= statementSequence )? 'END' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:93:4: 'IF' ifExpression= expression 'THEN' ifStatementSequence= statementSequence ( 'ELSIF' elseIfExpression= expression 'THEN' elseIfStatementSequence= statementSequence )* ( 'ELSE' elseStatementSequence= statementSequence )? 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal38=(Token)match(input,30,FOLLOW_30_in_ifStatement776); 
            string_literal38_tree = (Object)adaptor.create(string_literal38);
            adaptor.addChild(root_0, string_literal38_tree);

            pushFollow(FOLLOW_expression_in_ifStatement780);
            ifExpression=expression();

            state._fsp--;

            adaptor.addChild(root_0, ifExpression.getTree());
            string_literal39=(Token)match(input,31,FOLLOW_31_in_ifStatement785); 
            string_literal39_tree = (Object)adaptor.create(string_literal39);
            adaptor.addChild(root_0, string_literal39_tree);

            pushFollow(FOLLOW_statementSequence_in_ifStatement789);
            ifStatementSequence=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, ifStatementSequence.getTree());
            retval.result = new IfNode((ifExpression!=null?ifExpression.result:null),(ifStatementSequence!=null?ifStatementSequence.result:null));
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:95:3: ( 'ELSIF' elseIfExpression= expression 'THEN' elseIfStatementSequence= statementSequence )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==32) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:95:5: 'ELSIF' elseIfExpression= expression 'THEN' elseIfStatementSequence= statementSequence
            	    {
            	    string_literal40=(Token)match(input,32,FOLLOW_32_in_ifStatement800); 
            	    string_literal40_tree = (Object)adaptor.create(string_literal40);
            	    adaptor.addChild(root_0, string_literal40_tree);

            	    pushFollow(FOLLOW_expression_in_ifStatement804);
            	    elseIfExpression=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseIfExpression.getTree());
            	    string_literal41=(Token)match(input,31,FOLLOW_31_in_ifStatement810); 
            	    string_literal41_tree = (Object)adaptor.create(string_literal41);
            	    adaptor.addChild(root_0, string_literal41_tree);

            	    pushFollow(FOLLOW_statementSequence_in_ifStatement814);
            	    elseIfStatementSequence=statementSequence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, elseIfStatementSequence.getTree());
            	    retval.result.addElseIf((elseIfExpression!=null?elseIfExpression.result:null),(elseIfStatementSequence!=null?elseIfStatementSequence.result:null));

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:98:3: ( 'ELSE' elseStatementSequence= statementSequence )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:98:5: 'ELSE' elseStatementSequence= statementSequence
                    {
                    string_literal42=(Token)match(input,33,FOLLOW_33_in_ifStatement828); 
                    string_literal42_tree = (Object)adaptor.create(string_literal42);
                    adaptor.addChild(root_0, string_literal42_tree);

                    pushFollow(FOLLOW_statementSequence_in_ifStatement832);
                    elseStatementSequence=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, elseStatementSequence.getTree());
                    retval.result.setElse((elseStatementSequence!=null?elseStatementSequence.result:null));

                    }
                    break;

            }

            string_literal43=(Token)match(input,34,FOLLOW_34_in_ifStatement845); 
            string_literal43_tree = (Object)adaptor.create(string_literal43);
            adaptor.addChild(root_0, string_literal43_tree);


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
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:103:1: whileStatement returns [Interpretable result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal48=null;
        Oberon0Parser.expression_return expression45 = null;

        Oberon0Parser.statementSequence_return statementSequence47 = null;


        Object string_literal44_tree=null;
        Object string_literal46_tree=null;
        Object string_literal48_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:104:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:104:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal44=(Token)match(input,35,FOLLOW_35_in_whileStatement860); 
            string_literal44_tree = (Object)adaptor.create(string_literal44);
            adaptor.addChild(root_0, string_literal44_tree);

            pushFollow(FOLLOW_expression_in_whileStatement862);
            expression45=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression45.getTree());
            string_literal46=(Token)match(input,36,FOLLOW_36_in_whileStatement867); 
            string_literal46_tree = (Object)adaptor.create(string_literal46);
            adaptor.addChild(root_0, string_literal46_tree);

            pushFollow(FOLLOW_statementSequence_in_whileStatement869);
            statementSequence47=statementSequence();

            state._fsp--;

            adaptor.addChild(root_0, statementSequence47.getTree());
            string_literal48=(Token)match(input,34,FOLLOW_34_in_whileStatement874); 
            string_literal48_tree = (Object)adaptor.create(string_literal48);
            adaptor.addChild(root_0, string_literal48_tree);


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
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:109:1: statement returns [Interpretable result] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Oberon0Parser.assignment_return assignment49 = null;

        Oberon0Parser.procedureCall_return procedureCall50 = null;

        Oberon0Parser.ifStatement_return ifStatement51 = null;

        Oberon0Parser.whileStatement_return whileStatement52 = null;



        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:110:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:110:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (Object)adaptor.nil();

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:110:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt12=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=9 && LA12_1<=10)||LA12_1==28) ) {
                        alt12=1;
                    }
                    else if ( (LA12_1==12||(LA12_1>=32 && LA12_1<=34)||LA12_1==37) ) {
                        alt12=2;
                    }
                    }
                    break;
                case 30:
                    {
                    alt12=3;
                    }
                    break;
                case 35:
                    {
                    alt12=4;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:110:5: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement890);
                    assignment49=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment49.getTree());
                    retval.result = (assignment49!=null?assignment49.result:null);

                    }
                    break;
                case 2 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:111:5: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement910);
                    procedureCall50=procedureCall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedureCall50.getTree());
                    retval.result = (procedureCall50!=null?procedureCall50.result:null);

                    }
                    break;
                case 3 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:112:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement928);
                    ifStatement51=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement51.getTree());
                    retval.result = (ifStatement51!=null?ifStatement51.result:null);

                    }
                    break;
                case 4 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:113:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement947);
                    whileStatement52=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement52.getTree());
                    retval.result = (whileStatement52!=null?whileStatement52.result:null);

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
        public Interpretable result;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:117:1: statementSequence returns [Interpretable result] : statement ( ';' statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        Oberon0Parser.statement_return statement53 = null;

        Oberon0Parser.statement_return statement55 = null;


        Object char_literal54_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:118:2: ( statement ( ';' statement )* )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:118:4: statement ( ';' statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementSequence979);
            statement53=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement53.getTree());
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:118:14: ( ';' statement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:118:15: ';' statement
            	    {
            	    char_literal54=(Token)match(input,37,FOLLOW_37_in_statementSequence982); 
            	    char_literal54_tree = (Object)adaptor.create(char_literal54);
            	    adaptor.addChild(root_0, char_literal54_tree);

            	    pushFollow(FOLLOW_statement_in_statementSequence984);
            	    statement55=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement55.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:121:1: identList : IDENT ( ',' IDENT )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT56=null;
        Token char_literal57=null;
        Token IDENT58=null;

        Object IDENT56_tree=null;
        Object char_literal57_tree=null;
        Object IDENT58_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:122:2: ( IDENT ( ',' IDENT )* )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:122:4: IDENT ( ',' IDENT )*
            {
            root_0 = (Object)adaptor.nil();

            IDENT56=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList998); 
            IDENT56_tree = (Object)adaptor.create(IDENT56);
            adaptor.addChild(root_0, IDENT56_tree);

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:122:10: ( ',' IDENT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:122:11: ',' IDENT
            	    {
            	    char_literal57=(Token)match(input,29,FOLLOW_29_in_identList1001); 
            	    char_literal57_tree = (Object)adaptor.create(char_literal57);
            	    adaptor.addChild(root_0, char_literal57_tree);

            	    IDENT58=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList1003); 
            	    IDENT58_tree = (Object)adaptor.create(IDENT58);
            	    adaptor.addChild(root_0, IDENT58_tree);


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:125:1: arrayType : 'ARRAY' expression 'OF' type ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal59=null;
        Token string_literal61=null;
        Oberon0Parser.expression_return expression60 = null;

        Oberon0Parser.type_return type62 = null;


        Object string_literal59_tree=null;
        Object string_literal61_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:126:2: ( 'ARRAY' expression 'OF' type )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:126:4: 'ARRAY' expression 'OF' type
            {
            root_0 = (Object)adaptor.nil();

            string_literal59=(Token)match(input,38,FOLLOW_38_in_arrayType1017); 
            string_literal59_tree = (Object)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);

            pushFollow(FOLLOW_expression_in_arrayType1019);
            expression60=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression60.getTree());
            string_literal61=(Token)match(input,39,FOLLOW_39_in_arrayType1021); 
            string_literal61_tree = (Object)adaptor.create(string_literal61);
            adaptor.addChild(root_0, string_literal61_tree);

            pushFollow(FOLLOW_type_in_arrayType1023);
            type62=type();

            state._fsp--;

            adaptor.addChild(root_0, type62.getTree());

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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:129:1: fieldList : ( identList ':' type )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        Oberon0Parser.identList_return identList63 = null;

        Oberon0Parser.type_return type65 = null;


        Object char_literal64_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:130:2: ( ( identList ':' type )? )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:130:4: ( identList ':' type )?
            {
            root_0 = (Object)adaptor.nil();

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:130:4: ( identList ':' type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:130:5: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1036);
                    identList63=identList();

                    state._fsp--;

                    adaptor.addChild(root_0, identList63.getTree());
                    char_literal64=(Token)match(input,40,FOLLOW_40_in_fieldList1038); 
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);

                    pushFollow(FOLLOW_type_in_fieldList1040);
                    type65=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type65.getTree());

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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:133:1: recordType : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal66=null;
        Token char_literal68=null;
        Token string_literal70=null;
        Oberon0Parser.fieldList_return fieldList67 = null;

        Oberon0Parser.fieldList_return fieldList69 = null;


        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        Object string_literal70_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:134:2: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:134:5: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal66=(Token)match(input,41,FOLLOW_41_in_recordType1055); 
            string_literal66_tree = (Object)adaptor.create(string_literal66);
            adaptor.addChild(root_0, string_literal66_tree);

            pushFollow(FOLLOW_fieldList_in_recordType1057);
            fieldList67=fieldList();

            state._fsp--;

            adaptor.addChild(root_0, fieldList67.getTree());
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:134:24: ( ';' fieldList )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:134:25: ';' fieldList
            	    {
            	    char_literal68=(Token)match(input,37,FOLLOW_37_in_recordType1060); 
            	    char_literal68_tree = (Object)adaptor.create(char_literal68);
            	    adaptor.addChild(root_0, char_literal68_tree);

            	    pushFollow(FOLLOW_fieldList_in_recordType1062);
            	    fieldList69=fieldList();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldList69.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            string_literal70=(Token)match(input,34,FOLLOW_34_in_recordType1066); 
            string_literal70_tree = (Object)adaptor.create(string_literal70);
            adaptor.addChild(root_0, string_literal70_tree);


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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:137:1: type : ( IDENT | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT71=null;
        Oberon0Parser.arrayType_return arrayType72 = null;

        Oberon0Parser.recordType_return recordType73 = null;


        Object IDENT71_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:138:2: ( IDENT | arrayType | recordType )
            int alt17=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 41:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:138:4: IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT71=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1078); 
                    IDENT71_tree = (Object)adaptor.create(IDENT71);
                    adaptor.addChild(root_0, IDENT71_tree);


                    }
                    break;
                case 2 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:138:12: arrayType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1082);
                    arrayType72=arrayType();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayType72.getTree());

                    }
                    break;
                case 3 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:138:24: recordType
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1086);
                    recordType73=recordType();

                    state._fsp--;

                    adaptor.addChild(root_0, recordType73.getTree());

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
    // $ANTLR end "type"

    public static class fPSection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fPSection"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:141:1: fPSection : ( 'VAR' )? identList ':' type ;
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal76=null;
        Oberon0Parser.identList_return identList75 = null;

        Oberon0Parser.type_return type77 = null;


        Object string_literal74_tree=null;
        Object char_literal76_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:142:2: ( ( 'VAR' )? identList ':' type )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:142:4: ( 'VAR' )? identList ':' type
            {
            root_0 = (Object)adaptor.nil();

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:142:4: ( 'VAR' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:142:5: 'VAR'
                    {
                    string_literal74=(Token)match(input,42,FOLLOW_42_in_fPSection1099); 
                    string_literal74_tree = (Object)adaptor.create(string_literal74);
                    adaptor.addChild(root_0, string_literal74_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection1103);
            identList75=identList();

            state._fsp--;

            adaptor.addChild(root_0, identList75.getTree());
            char_literal76=(Token)match(input,40,FOLLOW_40_in_fPSection1105); 
            char_literal76_tree = (Object)adaptor.create(char_literal76);
            adaptor.addChild(root_0, char_literal76_tree);

            pushFollow(FOLLOW_type_in_fPSection1107);
            type77=type();

            state._fsp--;

            adaptor.addChild(root_0, type77.getTree());

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
    // $ANTLR end "fPSection"

    public static class formalParameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameters"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:145:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal78=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Oberon0Parser.fPSection_return fPSection79 = null;

        Oberon0Parser.fPSection_return fPSection81 = null;


        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:146:2: ( '(' ( fPSection ( ';' fPSection )* )? ')' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:146:4: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal78=(Token)match(input,12,FOLLOW_12_in_formalParameters1120); 
            char_literal78_tree = (Object)adaptor.create(char_literal78);
            adaptor.addChild(root_0, char_literal78_tree);

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:146:8: ( fPSection ( ';' fPSection )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT||LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:146:9: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1123);
                    fPSection79=fPSection();

                    state._fsp--;

                    adaptor.addChild(root_0, fPSection79.getTree());
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:146:19: ( ';' fPSection )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==37) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:146:20: ';' fPSection
                    	    {
                    	    char_literal80=(Token)match(input,37,FOLLOW_37_in_formalParameters1126); 
                    	    char_literal80_tree = (Object)adaptor.create(char_literal80);
                    	    adaptor.addChild(root_0, char_literal80_tree);

                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1128);
                    	    fPSection81=fPSection();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fPSection81.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal82=(Token)match(input,13,FOLLOW_13_in_formalParameters1134); 
            char_literal82_tree = (Object)adaptor.create(char_literal82);
            adaptor.addChild(root_0, char_literal82_tree);


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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:149:1: procedureHeading : 'PROCEDURE' IDENT ( formalParameters )? ;
    public final Oberon0Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        Oberon0Parser.procedureHeading_return retval = new Oberon0Parser.procedureHeading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token IDENT84=null;
        Oberon0Parser.formalParameters_return formalParameters85 = null;


        Object string_literal83_tree=null;
        Object IDENT84_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:150:2: ( 'PROCEDURE' IDENT ( formalParameters )? )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:150:4: 'PROCEDURE' IDENT ( formalParameters )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal83=(Token)match(input,43,FOLLOW_43_in_procedureHeading1146); 
            string_literal83_tree = (Object)adaptor.create(string_literal83);
            adaptor.addChild(root_0, string_literal83_tree);

            IDENT84=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureHeading1148); 
            IDENT84_tree = (Object)adaptor.create(IDENT84);
            adaptor.addChild(root_0, IDENT84_tree);

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:150:22: ( formalParameters )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:150:23: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading1151);
                    formalParameters85=formalParameters();

                    state._fsp--;

                    adaptor.addChild(root_0, formalParameters85.getTree());

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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:153:1: procedureBody : declarations ( 'BEGIN' statementSequence )? 'END' ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token string_literal89=null;
        Oberon0Parser.declarations_return declarations86 = null;

        Oberon0Parser.statementSequence_return statementSequence88 = null;


        Object string_literal87_tree=null;
        Object string_literal89_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:154:2: ( declarations ( 'BEGIN' statementSequence )? 'END' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:154:4: declarations ( 'BEGIN' statementSequence )? 'END'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedureBody1167);
            declarations86=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations86.getTree());
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:154:17: ( 'BEGIN' statementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:154:18: 'BEGIN' statementSequence
                    {
                    string_literal87=(Token)match(input,44,FOLLOW_44_in_procedureBody1170); 
                    string_literal87_tree = (Object)adaptor.create(string_literal87);
                    adaptor.addChild(root_0, string_literal87_tree);

                    pushFollow(FOLLOW_statementSequence_in_procedureBody1172);
                    statementSequence88=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence88.getTree());

                    }
                    break;

            }

            string_literal89=(Token)match(input,34,FOLLOW_34_in_procedureBody1176); 
            string_literal89_tree = (Object)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);


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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:158:1: procedureDeclaration : procedureHeading ';' procedureBody IDENT ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal91=null;
        Token IDENT93=null;
        Oberon0Parser.procedureHeading_return procedureHeading90 = null;

        Oberon0Parser.procedureBody_return procedureBody92 = null;


        Object char_literal91_tree=null;
        Object IDENT93_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:159:2: ( procedureHeading ';' procedureBody IDENT )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:159:4: procedureHeading ';' procedureBody IDENT
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration1189);
            procedureHeading90=procedureHeading();

            state._fsp--;

            adaptor.addChild(root_0, procedureHeading90.getTree());
            char_literal91=(Token)match(input,37,FOLLOW_37_in_procedureDeclaration1191); 
            char_literal91_tree = (Object)adaptor.create(char_literal91);
            adaptor.addChild(root_0, char_literal91_tree);

            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1193);
            procedureBody92=procedureBody();

            state._fsp--;

            adaptor.addChild(root_0, procedureBody92.getTree());
            IDENT93=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1195); 
            IDENT93_tree = (Object)adaptor.create(IDENT93);
            adaptor.addChild(root_0, IDENT93_tree);


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
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:162:1: declarations : ( 'CONST' ( IDENT '=' expression ';' )* )? ( 'TYPE' ( IDENT '=' expression ';' )* )? ( 'VAR' ( identList ':' type ';' )* )? ( procedureDeclaration ';' )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        Token IDENT95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token string_literal99=null;
        Token IDENT100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token string_literal104=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token char_literal110=null;
        Oberon0Parser.expression_return expression97 = null;

        Oberon0Parser.expression_return expression102 = null;

        Oberon0Parser.identList_return identList105 = null;

        Oberon0Parser.type_return type107 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration109 = null;


        Object string_literal94_tree=null;
        Object IDENT95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        Object string_literal99_tree=null;
        Object IDENT100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object string_literal104_tree=null;
        Object char_literal106_tree=null;
        Object char_literal108_tree=null;
        Object char_literal110_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:163:2: ( ( 'CONST' ( IDENT '=' expression ';' )* )? ( 'TYPE' ( IDENT '=' expression ';' )* )? ( 'VAR' ( identList ':' type ';' )* )? ( procedureDeclaration ';' )* )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:163:4: ( 'CONST' ( IDENT '=' expression ';' )* )? ( 'TYPE' ( IDENT '=' expression ';' )* )? ( 'VAR' ( identList ':' type ';' )* )? ( procedureDeclaration ';' )*
            {
            root_0 = (Object)adaptor.nil();

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:163:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:163:5: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    string_literal94=(Token)match(input,45,FOLLOW_45_in_declarations1209); 
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);

                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:163:13: ( IDENT '=' expression ';' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==IDENT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:163:14: IDENT '=' expression ';'
                    	    {
                    	    IDENT95=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations1212); 
                    	    IDENT95_tree = (Object)adaptor.create(IDENT95);
                    	    adaptor.addChild(root_0, IDENT95_tree);

                    	    char_literal96=(Token)match(input,22,FOLLOW_22_in_declarations1214); 
                    	    char_literal96_tree = (Object)adaptor.create(char_literal96);
                    	    adaptor.addChild(root_0, char_literal96_tree);

                    	    pushFollow(FOLLOW_expression_in_declarations1216);
                    	    expression97=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression97.getTree());
                    	    char_literal98=(Token)match(input,37,FOLLOW_37_in_declarations1218); 
                    	    char_literal98_tree = (Object)adaptor.create(char_literal98);
                    	    adaptor.addChild(root_0, char_literal98_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:164:3: ( 'TYPE' ( IDENT '=' expression ';' )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:164:4: 'TYPE' ( IDENT '=' expression ';' )*
                    {
                    string_literal99=(Token)match(input,46,FOLLOW_46_in_declarations1227); 
                    string_literal99_tree = (Object)adaptor.create(string_literal99);
                    adaptor.addChild(root_0, string_literal99_tree);

                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:164:11: ( IDENT '=' expression ';' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENT) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:164:12: IDENT '=' expression ';'
                    	    {
                    	    IDENT100=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations1230); 
                    	    IDENT100_tree = (Object)adaptor.create(IDENT100);
                    	    adaptor.addChild(root_0, IDENT100_tree);

                    	    char_literal101=(Token)match(input,22,FOLLOW_22_in_declarations1232); 
                    	    char_literal101_tree = (Object)adaptor.create(char_literal101);
                    	    adaptor.addChild(root_0, char_literal101_tree);

                    	    pushFollow(FOLLOW_expression_in_declarations1234);
                    	    expression102=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression102.getTree());
                    	    char_literal103=(Token)match(input,37,FOLLOW_37_in_declarations1236); 
                    	    char_literal103_tree = (Object)adaptor.create(char_literal103);
                    	    adaptor.addChild(root_0, char_literal103_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:165:3: ( 'VAR' ( identList ':' type ';' )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:165:4: 'VAR' ( identList ':' type ';' )*
                    {
                    string_literal104=(Token)match(input,42,FOLLOW_42_in_declarations1245); 
                    string_literal104_tree = (Object)adaptor.create(string_literal104);
                    adaptor.addChild(root_0, string_literal104_tree);

                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:165:10: ( identList ':' type ';' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==IDENT) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:165:11: identList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_declarations1248);
                    	    identList105=identList();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, identList105.getTree());
                    	    char_literal106=(Token)match(input,40,FOLLOW_40_in_declarations1250); 
                    	    char_literal106_tree = (Object)adaptor.create(char_literal106);
                    	    adaptor.addChild(root_0, char_literal106_tree);

                    	    pushFollow(FOLLOW_type_in_declarations1252);
                    	    type107=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type107.getTree());
                    	    char_literal108=(Token)match(input,37,FOLLOW_37_in_declarations1254); 
                    	    char_literal108_tree = (Object)adaptor.create(char_literal108);
                    	    adaptor.addChild(root_0, char_literal108_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:166:3: ( procedureDeclaration ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:166:4: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1263);
            	    procedureDeclaration109=procedureDeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, procedureDeclaration109.getTree());
            	    char_literal110=(Token)match(input,37,FOLLOW_37_in_declarations1265); 
            	    char_literal110_tree = (Object)adaptor.create(char_literal110);
            	    adaptor.addChild(root_0, char_literal110_tree);


            	    }
            	    break;

            	default :
            	    break loop29;
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

    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:169:1: module : 'MODULE' IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' IDENT ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal111=null;
        Token IDENT112=null;
        Token char_literal113=null;
        Token string_literal115=null;
        Token string_literal117=null;
        Token IDENT118=null;
        Oberon0Parser.declarations_return declarations114 = null;

        Oberon0Parser.statementSequence_return statementSequence116 = null;


        Object string_literal111_tree=null;
        Object IDENT112_tree=null;
        Object char_literal113_tree=null;
        Object string_literal115_tree=null;
        Object string_literal117_tree=null;
        Object IDENT118_tree=null;

        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:170:2: ( 'MODULE' IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' IDENT )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:170:4: 'MODULE' IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' IDENT
            {
            root_0 = (Object)adaptor.nil();

            string_literal111=(Token)match(input,47,FOLLOW_47_in_module1280); 
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);

            IDENT112=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1282); 
            IDENT112_tree = (Object)adaptor.create(IDENT112);
            adaptor.addChild(root_0, IDENT112_tree);

            char_literal113=(Token)match(input,37,FOLLOW_37_in_module1284); 
            char_literal113_tree = (Object)adaptor.create(char_literal113);
            adaptor.addChild(root_0, char_literal113_tree);

            pushFollow(FOLLOW_declarations_in_module1286);
            declarations114=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations114.getTree());
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:171:3: ( 'BEGIN' statementSequence )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:171:4: 'BEGIN' statementSequence
                    {
                    string_literal115=(Token)match(input,44,FOLLOW_44_in_module1292); 
                    string_literal115_tree = (Object)adaptor.create(string_literal115);
                    adaptor.addChild(root_0, string_literal115_tree);

                    pushFollow(FOLLOW_statementSequence_in_module1294);
                    statementSequence116=statementSequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementSequence116.getTree());

                    }
                    break;

            }

            string_literal117=(Token)match(input,34,FOLLOW_34_in_module1301); 
            IDENT118=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1304); 
            IDENT118_tree = (Object)adaptor.create(IDENT118);
            adaptor.addChild(root_0, IDENT118_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_9_in_selector67 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector69 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_10_in_selector86 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_selector88 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_selector90 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_IDENT_in_factor134 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_selector_in_factor150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_factor183 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_factor185 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_factor187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_factor203 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_factor_in_factor205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term236 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_15_in_term258 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_factor_in_term263 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_16_in_term276 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_factor_in_term280 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_17_in_term294 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_factor_in_term298 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_18_in_term313 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_factor_in_term318 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_19_in_simpleExpression371 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_20_in_simpleExpression377 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_term_in_simpleExpression400 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_19_in_simpleExpression417 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_term_in_simpleExpression421 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_20_in_simpleExpression435 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_term_in_simpleExpression439 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_21_in_simpleExpression454 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_term_in_simpleExpression458 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression505 = new BitSet(new long[]{0x000000000FC00002L});
    public static final BitSet FOLLOW_22_in_expression517 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_expression531 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_expression545 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_expression559 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_expression573 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_expression587 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment616 = new BitSet(new long[]{0x0000000010000600L});
    public static final BitSet FOLLOW_selector_in_assignment637 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assignment640 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_assignment642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_actualParameters680 = new BitSet(new long[]{0x0000000000187030L});
    public static final BitSet FOLLOW_expression_in_actualParameters689 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_29_in_actualParameters702 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_actualParameters711 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_13_in_actualParameters731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall748 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ifStatement776 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_ifStatement780 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ifStatement785 = new BitSet(new long[]{0x0000002840000010L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement789 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_32_in_ifStatement800 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_ifStatement804 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ifStatement810 = new BitSet(new long[]{0x0000002840000010L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement814 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_33_in_ifStatement828 = new BitSet(new long[]{0x0000002840000010L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement832 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ifStatement845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_whileStatement860 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_whileStatement862 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_whileStatement867 = new BitSet(new long[]{0x0000002840000010L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement869 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_whileStatement874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence979 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_statementSequence982 = new BitSet(new long[]{0x0000002840000010L});
    public static final BitSet FOLLOW_statement_in_statementSequence984 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList998 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_identList1001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identList1003 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_38_in_arrayType1017 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_arrayType1019 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_arrayType1021 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_arrayType1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1036 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fieldList1038 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_fieldList1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_recordType1055 = new BitSet(new long[]{0x0000002400000010L});
    public static final BitSet FOLLOW_fieldList_in_recordType1057 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_37_in_recordType1060 = new BitSet(new long[]{0x0000002400000010L});
    public static final BitSet FOLLOW_fieldList_in_recordType1062 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_34_in_recordType1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_fPSection1099 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identList_in_fPSection1103 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fPSection1105 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_fPSection1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_formalParameters1120 = new BitSet(new long[]{0x0000040000002010L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1123 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_37_in_formalParameters1126 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1128 = new BitSet(new long[]{0x0000002000002000L});
    public static final BitSet FOLLOW_13_in_formalParameters1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_procedureHeading1146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureHeading1148 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody1167 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_44_in_procedureBody1170 = new BitSet(new long[]{0x0000002840000010L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1172 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_procedureBody1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration1189 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_procedureDeclaration1191 = new BitSet(new long[]{0x00007C0400000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_declarations1209 = new BitSet(new long[]{0x00004C0000000012L});
    public static final BitSet FOLLOW_IDENT_in_declarations1212 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_declarations1214 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_declarations1216 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_declarations1218 = new BitSet(new long[]{0x00004C0000000012L});
    public static final BitSet FOLLOW_46_in_declarations1227 = new BitSet(new long[]{0x00000C0000000012L});
    public static final BitSet FOLLOW_IDENT_in_declarations1230 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_declarations1232 = new BitSet(new long[]{0x0000000000185030L});
    public static final BitSet FOLLOW_expression_in_declarations1234 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_declarations1236 = new BitSet(new long[]{0x00000C0000000012L});
    public static final BitSet FOLLOW_42_in_declarations1245 = new BitSet(new long[]{0x0000080000000012L});
    public static final BitSet FOLLOW_identList_in_declarations1248 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_declarations1250 = new BitSet(new long[]{0x0000024000000010L});
    public static final BitSet FOLLOW_type_in_declarations1252 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_declarations1254 = new BitSet(new long[]{0x0000080000000012L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1263 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_declarations1265 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_47_in_module1280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module1282 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_module1284 = new BitSet(new long[]{0x00007C0400000000L});
    public static final BitSet FOLLOW_declarations_in_module1286 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_44_in_module1292 = new BitSet(new long[]{0x0000002840000010L});
    public static final BitSet FOLLOW_statementSequence_in_module1294 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_module1301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module1304 = new BitSet(new long[]{0x0000000000000002L});

}