// $ANTLR 3.3 Nov 30, 2010 12:45:30 X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g 2011-01-08 13:33:32

package randy.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MINUS", "PLUS", "TIMES", "DIVIDE", "PROCEDURECALL", "PARAMETERS", "EXPRESSION", "BODY", "LH", "RH", "TYPE", "SELECTOR", "DOTSELECTOR", "ARRAYSELECTOR", "MODULE", "IDENT", "WHITESPACE", "INTEGER", "'.'", "'['", "']'", "'('", "')'", "'~'", "'MOD'", "'&'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "','", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'END'", "'WHILE'", "'DO'", "':='", "';'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'VAR'", "'BEGIN'", "'PROCEDURE'", "'CONST'", "'TYPE'", "'MODULE'"
    };
    public static final int EOF=-1;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int MINUS=4;
    public static final int PLUS=5;
    public static final int TIMES=6;
    public static final int DIVIDE=7;
    public static final int PROCEDURECALL=8;
    public static final int PARAMETERS=9;
    public static final int EXPRESSION=10;
    public static final int BODY=11;
    public static final int LH=12;
    public static final int RH=13;
    public static final int TYPE=14;
    public static final int SELECTOR=15;
    public static final int DOTSELECTOR=16;
    public static final int ARRAYSELECTOR=17;
    public static final int MODULE=18;
    public static final int IDENT=19;
    public static final int WHITESPACE=20;
    public static final int INTEGER=21;

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
    public String getGrammarFileName() { return "X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g"; }


    public static class ws_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ws"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:1: ws : ( WHITESPACE )* ;
    public final Oberon0Parser.ws_return ws() throws RecognitionException {
        Oberon0Parser.ws_return retval = new Oberon0Parser.ws_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHITESPACE1=null;

        CommonTree WHITESPACE1_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:3: ( ( WHITESPACE )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:7: ( WHITESPACE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:7: ( WHITESPACE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==WHITESPACE) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_Oberon0()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:8: WHITESPACE
            	    {
            	    WHITESPACE1=(Token)match(input,WHITESPACE,FOLLOW_WHITESPACE_in_ws192); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    WHITESPACE1_tree = (CommonTree)adaptor.create(WHITESPACE1);
            	    adaptor.addChild(root_0, WHITESPACE1_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ws"

    public static class ident_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ident"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:43:1: ident : IDENT ;
    public final Oberon0Parser.ident_return ident() throws RecognitionException {
        Oberon0Parser.ident_return retval = new Oberon0Parser.ident_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT2=null;

        CommonTree IDENT2_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:43:6: ( IDENT )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:43:10: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident202); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT2_tree = (CommonTree)adaptor.create(IDENT2);
            adaptor.addChild(root_0, IDENT2_tree);
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
    // $ANTLR end "ident"

    public static class dotSelector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dotSelector"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:45:1: dotSelector : '.' ident -> ^( DOTSELECTOR ident ) ;
    public final Oberon0Parser.dotSelector_return dotSelector() throws RecognitionException {
        Oberon0Parser.dotSelector_return retval = new Oberon0Parser.dotSelector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal3=null;
        Oberon0Parser.ident_return ident4 = null;


        CommonTree char_literal3_tree=null;
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:45:12: ( '.' ident -> ^( DOTSELECTOR ident ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:45:15: '.' ident
            {
            char_literal3=(Token)match(input,22,FOLLOW_22_in_dotSelector221); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal3);

            pushFollow(FOLLOW_ident_in_dotSelector223);
            ident4=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident4.getTree());


            // AST REWRITE
            // elements: ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 46:5: -> ^( DOTSELECTOR ident )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:46:8: ^( DOTSELECTOR ident )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(DOTSELECTOR, "DOTSELECTOR"), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());

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
    // $ANTLR end "dotSelector"

    public static class arraySelector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arraySelector"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:47:1: arraySelector : '[' ws expression ws ']' -> ^( ARRAYSELECTOR expression ) ;
    public final Oberon0Parser.arraySelector_return arraySelector() throws RecognitionException {
        Oberon0Parser.arraySelector_return retval = new Oberon0Parser.arraySelector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal5=null;
        Token char_literal9=null;
        Oberon0Parser.ws_return ws6 = null;

        Oberon0Parser.expression_return expression7 = null;

        Oberon0Parser.ws_return ws8 = null;


        CommonTree char_literal5_tree=null;
        CommonTree char_literal9_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:47:14: ( '[' ws expression ws ']' -> ^( ARRAYSELECTOR expression ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:47:17: '[' ws expression ws ']'
            {
            char_literal5=(Token)match(input,23,FOLLOW_23_in_arraySelector242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal5);

            pushFollow(FOLLOW_ws_in_arraySelector244);
            ws6=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws6.getTree());
            pushFollow(FOLLOW_expression_in_arraySelector246);
            expression7=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression7.getTree());
            pushFollow(FOLLOW_ws_in_arraySelector248);
            ws8=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws8.getTree());
            char_literal9=(Token)match(input,24,FOLLOW_24_in_arraySelector250); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal9);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 48:5: -> ^( ARRAYSELECTOR expression )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:48:8: ^( ARRAYSELECTOR expression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAYSELECTOR, "ARRAYSELECTOR"), root_1);

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
    // $ANTLR end "arraySelector"

    public static class selectorPart_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selectorPart"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:49:1: selectorPart : ( dotSelector | arraySelector );
    public final Oberon0Parser.selectorPart_return selectorPart() throws RecognitionException {
        Oberon0Parser.selectorPart_return retval = new Oberon0Parser.selectorPart_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.dotSelector_return dotSelector10 = null;

        Oberon0Parser.arraySelector_return arraySelector11 = null;



        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:49:13: ( dotSelector | arraySelector )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:49:16: dotSelector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_dotSelector_in_selectorPart269);
                    dotSelector10=dotSelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotSelector10.getTree());

                    }
                    break;
                case 2 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:49:30: arraySelector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arraySelector_in_selectorPart273);
                    arraySelector11=arraySelector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arraySelector11.getTree());

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
    // $ANTLR end "selectorPart"

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:50:1: selector : ( ident ( selectorPart )+ -> ^( SELECTOR ident ( selectorPart )+ ) | ident -> ident );
    public final Oberon0Parser.selector_return selector() throws RecognitionException {
        Oberon0Parser.selector_return retval = new Oberon0Parser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.ident_return ident12 = null;

        Oberon0Parser.selectorPart_return selectorPart13 = null;

        Oberon0Parser.ident_return ident14 = null;


        RewriteRuleSubtreeStream stream_selectorPart=new RewriteRuleSubtreeStream(adaptor,"rule selectorPart");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:50:9: ( ident ( selectorPart )+ -> ^( SELECTOR ident ( selectorPart )+ ) | ident -> ident )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=22 && LA4_1<=23)) ) {
                    alt4=1;
                }
                else if ( (LA4_1==EOF||(LA4_1>=MINUS && LA4_1<=DIVIDE)||LA4_1==WHITESPACE||(LA4_1>=24 && LA4_1<=26)||(LA4_1>=28 && LA4_1<=37)||(LA4_1>=39 && LA4_1<=42)||(LA4_1>=44 && LA4_1<=46)||LA4_1==48) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:50:12: ident ( selectorPart )+
                    {
                    pushFollow(FOLLOW_ident_in_selector280);
                    ident12=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident12.getTree());
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:50:18: ( selectorPart )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=22 && LA3_0<=23)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:50:19: selectorPart
                    	    {
                    	    pushFollow(FOLLOW_selectorPart_in_selector283);
                    	    selectorPart13=selectorPart();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_selectorPart.add(selectorPart13.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);



                    // AST REWRITE
                    // elements: ident, selectorPart
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 51:5: -> ^( SELECTOR ident ( selectorPart )+ )
                    {
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:51:8: ^( SELECTOR ident ( selectorPart )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SELECTOR, "SELECTOR"), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        if ( !(stream_selectorPart.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_selectorPart.hasNext() ) {
                            adaptor.addChild(root_1, stream_selectorPart.nextTree());

                        }
                        stream_selectorPart.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:52:4: ident
                    {
                    pushFollow(FOLLOW_ident_in_selector309);
                    ident14=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident14.getTree());


                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 53:5: -> ident
                    {
                        adaptor.addChild(root_0, stream_ident.nextTree());

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
    // $ANTLR end "selector"

    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:54:1: number : INTEGER ;
    public final Oberon0Parser.number_return number() throws RecognitionException {
        Oberon0Parser.number_return retval = new Oberon0Parser.number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER15=null;

        CommonTree INTEGER15_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:54:7: ( INTEGER )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:54:11: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER15=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number325); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER15_tree = (CommonTree)adaptor.create(INTEGER15);
            adaptor.addChild(root_0, INTEGER15_tree);
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
    // $ANTLR end "number"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:55:1: factor : ( selector | number | '(' ws expression ')' | '~' ws factor );
    public final Oberon0Parser.factor_return factor() throws RecognitionException {
        Oberon0Parser.factor_return retval = new Oberon0Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal18=null;
        Token char_literal21=null;
        Token char_literal22=null;
        Oberon0Parser.selector_return selector16 = null;

        Oberon0Parser.number_return number17 = null;

        Oberon0Parser.ws_return ws19 = null;

        Oberon0Parser.expression_return expression20 = null;

        Oberon0Parser.ws_return ws23 = null;

        Oberon0Parser.factor_return factor24 = null;


        CommonTree char_literal18_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree char_literal22_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:55:7: ( selector | number | '(' ws expression ')' | '~' ws factor )
            int alt5=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt5=1;
                }
                break;
            case INTEGER:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:55:11: selector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selector_in_factor333);
                    selector16=selector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector16.getTree());

                    }
                    break;
                case 2 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:55:22: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor337);
                    number17=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number17.getTree());

                    }
                    break;
                case 3 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:55:31: '(' ws expression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal18=(Token)match(input,25,FOLLOW_25_in_factor341); if (state.failed) return retval;
                    pushFollow(FOLLOW_ws_in_factor344);
                    ws19=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws19.getTree());
                    pushFollow(FOLLOW_expression_in_factor346);
                    expression20=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression20.getTree());
                    char_literal21=(Token)match(input,26,FOLLOW_26_in_factor348); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:55:57: '~' ws factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal22=(Token)match(input,27,FOLLOW_27_in_factor353); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal22_tree = (CommonTree)adaptor.create(char_literal22);
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal22_tree, root_0);
                    }
                    pushFollow(FOLLOW_ws_in_factor356);
                    ws23=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws23.getTree());
                    pushFollow(FOLLOW_factor_in_factor358);
                    factor24=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor24.getTree());

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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:56:1: term : factor ( ( TIMES | DIVIDE | 'MOD' | '&' ) ws factor )* ;
    public final Oberon0Parser.term_return term() throws RecognitionException {
        Oberon0Parser.term_return retval = new Oberon0Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set26=null;
        Oberon0Parser.factor_return factor25 = null;

        Oberon0Parser.ws_return ws27 = null;

        Oberon0Parser.factor_return factor28 = null;


        CommonTree set26_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:56:5: ( factor ( ( TIMES | DIVIDE | 'MOD' | '&' ) ws factor )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:56:9: factor ( ( TIMES | DIVIDE | 'MOD' | '&' ) ws factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term367);
            factor25=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor25.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:56:16: ( ( TIMES | DIVIDE | 'MOD' | '&' ) ws factor )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=TIMES && LA6_0<=DIVIDE)||(LA6_0>=28 && LA6_0<=29)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:56:17: ( TIMES | DIVIDE | 'MOD' | '&' ) ws factor
            	    {
            	    set26=(Token)input.LT(1);
            	    set26=(Token)input.LT(1);
            	    if ( (input.LA(1)>=TIMES && input.LA(1)<=DIVIDE)||(input.LA(1)>=28 && input.LA(1)<=29) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set26), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ws_in_term381);
            	    ws27=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws27.getTree());
            	    pushFollow(FOLLOW_factor_in_term383);
            	    factor28=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor28.getTree());

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
    // $ANTLR end "term"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:58:1: simpleExpression : ( PLUS | MINUS ws )? term ( ( PLUS | MINUS | 'OR' ) ws term )* ;
    public final Oberon0Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        Oberon0Parser.simpleExpression_return retval = new Oberon0Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS29=null;
        Token MINUS30=null;
        Token set33=null;
        Oberon0Parser.ws_return ws31 = null;

        Oberon0Parser.term_return term32 = null;

        Oberon0Parser.ws_return ws34 = null;

        Oberon0Parser.term_return term35 = null;


        CommonTree PLUS29_tree=null;
        CommonTree MINUS30_tree=null;
        CommonTree set33_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:59:3: ( ( PLUS | MINUS ws )? term ( ( PLUS | MINUS | 'OR' ) ws term )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:59:6: ( PLUS | MINUS ws )? term ( ( PLUS | MINUS | 'OR' ) ws term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:59:6: ( PLUS | MINUS ws )?
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==PLUS) ) {
                alt7=1;
            }
            else if ( (LA7_0==MINUS) ) {
                alt7=2;
            }
            switch (alt7) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:59:7: PLUS
                    {
                    PLUS29=(Token)match(input,PLUS,FOLLOW_PLUS_in_simpleExpression397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS29_tree = (CommonTree)adaptor.create(PLUS29);
                    adaptor.addChild(root_0, PLUS29_tree);
                    }

                    }
                    break;
                case 2 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:59:12: MINUS ws
                    {
                    MINUS30=(Token)match(input,MINUS,FOLLOW_MINUS_in_simpleExpression399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS30_tree = (CommonTree)adaptor.create(MINUS30);
                    root_0 = (CommonTree)adaptor.becomeRoot(MINUS30_tree, root_0);
                    }
                    pushFollow(FOLLOW_ws_in_simpleExpression402);
                    ws31=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws31.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression406);
            term32=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term32.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:59:29: ( ( PLUS | MINUS | 'OR' ) ws term )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=MINUS && LA8_0<=PLUS)||LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:59:30: ( PLUS | MINUS | 'OR' ) ws term
            	    {
            	    set33=(Token)input.LT(1);
            	    set33=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MINUS && input.LA(1)<=PLUS)||input.LA(1)==30 ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set33), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ws_in_simpleExpression420);
            	    ws34=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws34.getTree());
            	    pushFollow(FOLLOW_term_in_simpleExpression422);
            	    term35=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term35.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:61:1: infixOperand : ( '=' | '#' | '<' | '<=' | '>' | '>=' );
    public final Oberon0Parser.infixOperand_return infixOperand() throws RecognitionException {
        Oberon0Parser.infixOperand_return retval = new Oberon0Parser.infixOperand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set36=null;

        CommonTree set36_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:61:13: ( '=' | '#' | '<' | '<=' | '>' | '>=' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set36=(Token)input.LT(1);
            if ( (input.LA(1)>=31 && input.LA(1)<=36) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set36));
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:62:1: expression : ( simpleExpression infixOperand ws simpleExpression ws -> ^( infixOperand ^( LH simpleExpression ) ^( RH simpleExpression ) ) | simpleExpression -> simpleExpression );
    public final Oberon0Parser.expression_return expression() throws RecognitionException {
        Oberon0Parser.expression_return retval = new Oberon0Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.simpleExpression_return simpleExpression37 = null;

        Oberon0Parser.infixOperand_return infixOperand38 = null;

        Oberon0Parser.ws_return ws39 = null;

        Oberon0Parser.simpleExpression_return simpleExpression40 = null;

        Oberon0Parser.ws_return ws41 = null;

        Oberon0Parser.simpleExpression_return simpleExpression42 = null;


        RewriteRuleSubtreeStream stream_infixOperand=new RewriteRuleSubtreeStream(adaptor,"rule infixOperand");
        RewriteRuleSubtreeStream stream_simpleExpression=new RewriteRuleSubtreeStream(adaptor,"rule simpleExpression");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:62:11: ( simpleExpression infixOperand ws simpleExpression ws -> ^( infixOperand ^( LH simpleExpression ) ^( RH simpleExpression ) ) | simpleExpression -> simpleExpression )
            int alt9=2;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                int LA9_1 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case MINUS:
                {
                int LA9_2 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case IDENT:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case INTEGER:
                {
                int LA9_4 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                int LA9_5 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 5, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA9_6 = input.LA(2);

                if ( (synpred22_Oberon0()) ) {
                    alt9=1;
                }
                else if ( (true) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:62:14: simpleExpression infixOperand ws simpleExpression ws
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression459);
                    simpleExpression37=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression37.getTree());
                    pushFollow(FOLLOW_infixOperand_in_expression461);
                    infixOperand38=infixOperand();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_infixOperand.add(infixOperand38.getTree());
                    pushFollow(FOLLOW_ws_in_expression463);
                    ws39=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws39.getTree());
                    pushFollow(FOLLOW_simpleExpression_in_expression465);
                    simpleExpression40=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression40.getTree());
                    pushFollow(FOLLOW_ws_in_expression467);
                    ws41=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws41.getTree());


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
                    // 63:5: -> ^( infixOperand ^( LH simpleExpression ) ^( RH simpleExpression ) )
                    {
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:63:8: ^( infixOperand ^( LH simpleExpression ) ^( RH simpleExpression ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_infixOperand.nextNode(), root_1);

                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:63:23: ^( LH simpleExpression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LH, "LH"), root_2);

                        adaptor.addChild(root_2, stream_simpleExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:63:46: ^( RH simpleExpression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RH, "RH"), root_2);

                        adaptor.addChild(root_2, stream_simpleExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:64:4: simpleExpression
                    {
                    pushFollow(FOLLOW_simpleExpression_in_expression496);
                    simpleExpression42=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_simpleExpression.add(simpleExpression42.getTree());


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
                    // 65:5: -> simpleExpression
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:66:1: actualParameters : '(' ws ( expression ( ',' ws expression )* )? ')' ws -> ^( PARAMETERS ( expression )+ ) ;
    public final Oberon0Parser.actualParameters_return actualParameters() throws RecognitionException {
        Oberon0Parser.actualParameters_return retval = new Oberon0Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal43=null;
        Token char_literal46=null;
        Token char_literal49=null;
        Oberon0Parser.ws_return ws44 = null;

        Oberon0Parser.expression_return expression45 = null;

        Oberon0Parser.ws_return ws47 = null;

        Oberon0Parser.expression_return expression48 = null;

        Oberon0Parser.ws_return ws50 = null;


        CommonTree char_literal43_tree=null;
        CommonTree char_literal46_tree=null;
        CommonTree char_literal49_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:66:17: ( '(' ws ( expression ( ',' ws expression )* )? ')' ws -> ^( PARAMETERS ( expression )+ ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:66:19: '(' ws ( expression ( ',' ws expression )* )? ')' ws
            {
            char_literal43=(Token)match(input,25,FOLLOW_25_in_actualParameters510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal43);

            pushFollow(FOLLOW_ws_in_actualParameters512);
            ws44=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws44.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:66:26: ( expression ( ',' ws expression )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=MINUS && LA11_0<=PLUS)||LA11_0==IDENT||LA11_0==INTEGER||LA11_0==25||LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:66:27: expression ( ',' ws expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters515);
                    expression45=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression45.getTree());
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:66:38: ( ',' ws expression )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==37) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:66:39: ',' ws expression
                    	    {
                    	    char_literal46=(Token)match(input,37,FOLLOW_37_in_actualParameters518); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_37.add(char_literal46);

                    	    pushFollow(FOLLOW_ws_in_actualParameters520);
                    	    ws47=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws47.getTree());
                    	    pushFollow(FOLLOW_expression_in_actualParameters522);
                    	    expression48=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression48.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal49=(Token)match(input,26,FOLLOW_26_in_actualParameters528); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal49);

            pushFollow(FOLLOW_ws_in_actualParameters530);
            ws50=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws50.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:5: -> ^( PARAMETERS ( expression )+ )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:67:8: ^( PARAMETERS ( expression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "actualParameters"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:1: ifStatement : ( 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ ( 'ELSE' ws statementSequence ) 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( 'ELSE' ^( BODY statementSequence ) ) ) | 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | 'IF' ws expression 'THEN' ws statementSequence ( 'ELSE' ws statementSequence ) 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( 'ELSE' ^( BODY statementSequence ) ) ) | 'IF' ws expression 'THEN' ws statementSequence 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) );
    public final Oberon0Parser.ifStatement_return ifStatement() throws RecognitionException {
        Oberon0Parser.ifStatement_return retval = new Oberon0Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal51=null;
        Token string_literal54=null;
        Token string_literal57=null;
        Token string_literal60=null;
        Token string_literal63=null;
        Token string_literal66=null;
        Token string_literal67=null;
        Token string_literal70=null;
        Token string_literal73=null;
        Token string_literal76=null;
        Token string_literal79=null;
        Token string_literal80=null;
        Token string_literal83=null;
        Token string_literal86=null;
        Token string_literal89=null;
        Token string_literal90=null;
        Token string_literal93=null;
        Token string_literal96=null;
        Oberon0Parser.ws_return ws52 = null;

        Oberon0Parser.expression_return expression53 = null;

        Oberon0Parser.ws_return ws55 = null;

        Oberon0Parser.statementSequence_return statementSequence56 = null;

        Oberon0Parser.ws_return ws58 = null;

        Oberon0Parser.expression_return expression59 = null;

        Oberon0Parser.ws_return ws61 = null;

        Oberon0Parser.statementSequence_return statementSequence62 = null;

        Oberon0Parser.ws_return ws64 = null;

        Oberon0Parser.statementSequence_return statementSequence65 = null;

        Oberon0Parser.ws_return ws68 = null;

        Oberon0Parser.expression_return expression69 = null;

        Oberon0Parser.ws_return ws71 = null;

        Oberon0Parser.statementSequence_return statementSequence72 = null;

        Oberon0Parser.ws_return ws74 = null;

        Oberon0Parser.expression_return expression75 = null;

        Oberon0Parser.ws_return ws77 = null;

        Oberon0Parser.statementSequence_return statementSequence78 = null;

        Oberon0Parser.ws_return ws81 = null;

        Oberon0Parser.expression_return expression82 = null;

        Oberon0Parser.ws_return ws84 = null;

        Oberon0Parser.statementSequence_return statementSequence85 = null;

        Oberon0Parser.ws_return ws87 = null;

        Oberon0Parser.statementSequence_return statementSequence88 = null;

        Oberon0Parser.ws_return ws91 = null;

        Oberon0Parser.expression_return expression92 = null;

        Oberon0Parser.ws_return ws94 = null;

        Oberon0Parser.statementSequence_return statementSequence95 = null;


        CommonTree string_literal51_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal57_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal63_tree=null;
        CommonTree string_literal66_tree=null;
        CommonTree string_literal67_tree=null;
        CommonTree string_literal70_tree=null;
        CommonTree string_literal73_tree=null;
        CommonTree string_literal76_tree=null;
        CommonTree string_literal79_tree=null;
        CommonTree string_literal80_tree=null;
        CommonTree string_literal83_tree=null;
        CommonTree string_literal86_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal90_tree=null;
        CommonTree string_literal93_tree=null;
        CommonTree string_literal96_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:12: ( 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ ( 'ELSE' ws statementSequence ) 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( 'ELSE' ^( BODY statementSequence ) ) ) | 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ) | 'IF' ws expression 'THEN' ws statementSequence ( 'ELSE' ws statementSequence ) 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( 'ELSE' ^( BODY statementSequence ) ) ) | 'IF' ws expression 'THEN' ws statementSequence 'END' -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred26_Oberon0()) ) {
                    alt14=1;
                }
                else if ( (synpred28_Oberon0()) ) {
                    alt14=2;
                }
                else if ( (synpred29_Oberon0()) ) {
                    alt14=3;
                }
                else if ( (true) ) {
                    alt14=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:15: 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ ( 'ELSE' ws statementSequence ) 'END'
                    {
                    string_literal51=(Token)match(input,38,FOLLOW_38_in_ifStatement550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal51);

                    pushFollow(FOLLOW_ws_in_ifStatement552);
                    ws52=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws52.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement554);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression53.getTree());
                    string_literal54=(Token)match(input,39,FOLLOW_39_in_ifStatement556); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal54);

                    pushFollow(FOLLOW_ws_in_ifStatement558);
                    ws55=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws55.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement560);
                    statementSequence56=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence56.getTree());
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:62: ( 'ELSIF' ws expression 'THEN' ws statementSequence )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==40) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:63: 'ELSIF' ws expression 'THEN' ws statementSequence
                    	    {
                    	    string_literal57=(Token)match(input,40,FOLLOW_40_in_ifStatement563); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_40.add(string_literal57);

                    	    pushFollow(FOLLOW_ws_in_ifStatement565);
                    	    ws58=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws58.getTree());
                    	    pushFollow(FOLLOW_expression_in_ifStatement567);
                    	    expression59=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression59.getTree());
                    	    string_literal60=(Token)match(input,39,FOLLOW_39_in_ifStatement569); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_39.add(string_literal60);

                    	    pushFollow(FOLLOW_ws_in_ifStatement571);
                    	    ws61=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws61.getTree());
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement573);
                    	    statementSequence62=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence62.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:115: ( 'ELSE' ws statementSequence )
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:116: 'ELSE' ws statementSequence
                    {
                    string_literal63=(Token)match(input,41,FOLLOW_41_in_ifStatement578); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal63);

                    pushFollow(FOLLOW_ws_in_ifStatement580);
                    ws64=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws64.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement582);
                    statementSequence65=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence65.getTree());

                    }

                    string_literal66=(Token)match(input,42,FOLLOW_42_in_ifStatement585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal66);



                    // AST REWRITE
                    // elements: 40, statementSequence, statementSequence, statementSequence, expression, 41, expression, 38
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 69:5: -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( 'ELSE' ^( BODY statementSequence ) ) )
                    {
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:8: ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ ^( 'ELSE' ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:15: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:40: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_40.hasNext()||stream_statementSequence.hasNext()||stream_expression.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_40.hasNext()||stream_statementSequence.hasNext()||stream_expression.hasNext() ) {
                            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:66: ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_2);

                            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:76: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:101: ^( BODY statementSequence )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_3);

                            adaptor.addChild(root_3, stream_statementSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_40.reset();
                        stream_statementSequence.reset();
                        stream_expression.reset();
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:129: ^( 'ELSE' ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_2);

                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:69:138: ^( BODY statementSequence )
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
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:70:4: 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ 'END'
                    {
                    string_literal67=(Token)match(input,38,FOLLOW_38_in_ifStatement641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal67);

                    pushFollow(FOLLOW_ws_in_ifStatement643);
                    ws68=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws68.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement645);
                    expression69=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression69.getTree());
                    string_literal70=(Token)match(input,39,FOLLOW_39_in_ifStatement647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal70);

                    pushFollow(FOLLOW_ws_in_ifStatement649);
                    ws71=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws71.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement651);
                    statementSequence72=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence72.getTree());
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:70:51: ( 'ELSIF' ws expression 'THEN' ws statementSequence )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==40) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:70:52: 'ELSIF' ws expression 'THEN' ws statementSequence
                    	    {
                    	    string_literal73=(Token)match(input,40,FOLLOW_40_in_ifStatement654); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_40.add(string_literal73);

                    	    pushFollow(FOLLOW_ws_in_ifStatement656);
                    	    ws74=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws74.getTree());
                    	    pushFollow(FOLLOW_expression_in_ifStatement658);
                    	    expression75=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression75.getTree());
                    	    string_literal76=(Token)match(input,39,FOLLOW_39_in_ifStatement660); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_39.add(string_literal76);

                    	    pushFollow(FOLLOW_ws_in_ifStatement662);
                    	    ws77=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ws.add(ws77.getTree());
                    	    pushFollow(FOLLOW_statementSequence_in_ifStatement664);
                    	    statementSequence78=statementSequence();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    string_literal79=(Token)match(input,42,FOLLOW_42_in_ifStatement668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal79);



                    // AST REWRITE
                    // elements: 38, statementSequence, expression, expression, statementSequence, 40
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 71:5: -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
                    {
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:71:8: ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ( ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:71:15: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:71:40: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_expression.hasNext()||stream_statementSequence.hasNext()||stream_40.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expression.hasNext()||stream_statementSequence.hasNext()||stream_40.hasNext() ) {
                            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:71:66: ^( 'ELSIF' ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot(stream_40.nextNode(), root_2);

                            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:71:76: ^( EXPRESSION expression )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_3);

                            adaptor.addChild(root_3, stream_expression.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:71:101: ^( BODY statementSequence )
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
                        stream_40.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:72:4: 'IF' ws expression 'THEN' ws statementSequence ( 'ELSE' ws statementSequence ) 'END'
                    {
                    string_literal80=(Token)match(input,38,FOLLOW_38_in_ifStatement714); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal80);

                    pushFollow(FOLLOW_ws_in_ifStatement716);
                    ws81=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws81.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement718);
                    expression82=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression82.getTree());
                    string_literal83=(Token)match(input,39,FOLLOW_39_in_ifStatement720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal83);

                    pushFollow(FOLLOW_ws_in_ifStatement722);
                    ws84=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws84.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement724);
                    statementSequence85=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence85.getTree());
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:72:51: ( 'ELSE' ws statementSequence )
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:72:52: 'ELSE' ws statementSequence
                    {
                    string_literal86=(Token)match(input,41,FOLLOW_41_in_ifStatement727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_41.add(string_literal86);

                    pushFollow(FOLLOW_ws_in_ifStatement729);
                    ws87=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws87.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement731);
                    statementSequence88=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence88.getTree());

                    }

                    string_literal89=(Token)match(input,42,FOLLOW_42_in_ifStatement734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal89);



                    // AST REWRITE
                    // elements: expression, statementSequence, 41, 38, statementSequence
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 73:5: -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( 'ELSE' ^( BODY statementSequence ) ) )
                    {
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:73:8: ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) ^( 'ELSE' ^( BODY statementSequence ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:73:15: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:73:39: ^( BODY statementSequence )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BODY, "BODY"), root_2);

                        adaptor.addChild(root_2, stream_statementSequence.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:73:66: ^( 'ELSE' ^( BODY statementSequence ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_41.nextNode(), root_2);

                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:73:75: ^( BODY statementSequence )
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
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:74:4: 'IF' ws expression 'THEN' ws statementSequence 'END'
                    {
                    string_literal90=(Token)match(input,38,FOLLOW_38_in_ifStatement773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal90);

                    pushFollow(FOLLOW_ws_in_ifStatement775);
                    ws91=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws91.getTree());
                    pushFollow(FOLLOW_expression_in_ifStatement777);
                    expression92=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression92.getTree());
                    string_literal93=(Token)match(input,39,FOLLOW_39_in_ifStatement779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal93);

                    pushFollow(FOLLOW_ws_in_ifStatement781);
                    ws94=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws94.getTree());
                    pushFollow(FOLLOW_statementSequence_in_ifStatement783);
                    statementSequence95=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence95.getTree());
                    string_literal96=(Token)match(input,42,FOLLOW_42_in_ifStatement785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_42.add(string_literal96);



                    // AST REWRITE
                    // elements: statementSequence, 38, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 75:5: -> ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                    {
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:75:8: ^( 'IF' ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_38.nextNode(), root_1);

                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:75:15: ^( EXPRESSION expression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:75:40: ^( BODY statementSequence )
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:76:1: whileStatement : 'WHILE' ws expression 'DO' ws statementSequence 'END' -> ^( 'WHILE' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) ;
    public final Oberon0Parser.whileStatement_return whileStatement() throws RecognitionException {
        Oberon0Parser.whileStatement_return retval = new Oberon0Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal97=null;
        Token string_literal100=null;
        Token string_literal103=null;
        Oberon0Parser.ws_return ws98 = null;

        Oberon0Parser.expression_return expression99 = null;

        Oberon0Parser.ws_return ws101 = null;

        Oberon0Parser.statementSequence_return statementSequence102 = null;


        CommonTree string_literal97_tree=null;
        CommonTree string_literal100_tree=null;
        CommonTree string_literal103_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:76:15: ( 'WHILE' ws expression 'DO' ws statementSequence 'END' -> ^( 'WHILE' ^( EXPRESSION expression ) ^( BODY statementSequence ) ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:76:18: 'WHILE' ws expression 'DO' ws statementSequence 'END'
            {
            string_literal97=(Token)match(input,43,FOLLOW_43_in_whileStatement814); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_43.add(string_literal97);

            pushFollow(FOLLOW_ws_in_whileStatement816);
            ws98=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws98.getTree());
            pushFollow(FOLLOW_expression_in_whileStatement818);
            expression99=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression99.getTree());
            string_literal100=(Token)match(input,44,FOLLOW_44_in_whileStatement820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_44.add(string_literal100);

            pushFollow(FOLLOW_ws_in_whileStatement822);
            ws101=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws101.getTree());
            pushFollow(FOLLOW_statementSequence_in_whileStatement824);
            statementSequence102=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence102.getTree());
            string_literal103=(Token)match(input,42,FOLLOW_42_in_whileStatement826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal103);



            // AST REWRITE
            // elements: expression, statementSequence, 43
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 77:5: -> ^( 'WHILE' ^( EXPRESSION expression ) ^( BODY statementSequence ) )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:77:8: ^( 'WHILE' ^( EXPRESSION expression ) ^( BODY statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_43.nextNode(), root_1);

                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:77:18: ^( EXPRESSION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:77:43: ^( BODY statementSequence )
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:78:1: assignment : selector ':=' expression -> ^( ':=' ^( LH selector ) ^( RH ( expression )? ) ) ;
    public final Oberon0Parser.assignment_return assignment() throws RecognitionException {
        Oberon0Parser.assignment_return retval = new Oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal105=null;
        Oberon0Parser.selector_return selector104 = null;

        Oberon0Parser.expression_return expression106 = null;


        CommonTree string_literal105_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:78:11: ( selector ':=' expression -> ^( ':=' ^( LH selector ) ^( RH ( expression )? ) ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:78:14: selector ':=' expression
            {
            pushFollow(FOLLOW_selector_in_assignment855);
            selector104=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector104.getTree());
            string_literal105=(Token)match(input,45,FOLLOW_45_in_assignment857); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_45.add(string_literal105);

            pushFollow(FOLLOW_expression_in_assignment859);
            expression106=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());


            // AST REWRITE
            // elements: selector, 45, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 79:5: -> ^( ':=' ^( LH selector ) ^( RH ( expression )? ) )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:79:8: ^( ':=' ^( LH selector ) ^( RH ( expression )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_45.nextNode(), root_1);

                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:79:15: ^( LH selector )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LH, "LH"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:79:30: ^( RH ( expression )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(RH, "RH"), root_2);

                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:79:35: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_2, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "assignment"

    public static class procedureCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:80:1: procedureCall : selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) ;
    public final Oberon0Parser.procedureCall_return procedureCall() throws RecognitionException {
        Oberon0Parser.procedureCall_return retval = new Oberon0Parser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.selector_return selector107 = null;

        Oberon0Parser.actualParameters_return actualParameters108 = null;


        RewriteRuleSubtreeStream stream_selector=new RewriteRuleSubtreeStream(adaptor,"rule selector");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:80:14: ( selector ( actualParameters )? -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:80:17: selector ( actualParameters )?
            {
            pushFollow(FOLLOW_selector_in_procedureCall889);
            selector107=selector();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selector.add(selector107.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:80:26: ( actualParameters )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:80:27: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall892);
                    actualParameters108=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters108.getTree());

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
            // 81:5: -> ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:81:8: ^( EXPRESSION ^( PROCEDURECALL selector ( actualParameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_1);

                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:81:21: ^( PROCEDURECALL selector ( actualParameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURECALL, "PROCEDURECALL"), root_2);

                adaptor.addChild(root_2, stream_selector.nextTree());
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:81:46: ( actualParameters )?
                if ( stream_actualParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_actualParameters.nextTree());

                }
                stream_actualParameters.reset();

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
    // $ANTLR end "procedureCall"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:1: statement : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Oberon0Parser.statement_return statement() throws RecognitionException {
        Oberon0Parser.statement_return retval = new Oberon0Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.assignment_return assignment109 = null;

        Oberon0Parser.procedureCall_return procedureCall110 = null;

        Oberon0Parser.ifStatement_return ifStatement111 = null;

        Oberon0Parser.whileStatement_return whileStatement112 = null;



        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:10: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:13: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:14: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement921);
                    assignment109=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment109.getTree());

                    }
                    break;
                case 2 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:27: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement925);
                    procedureCall110=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall110.getTree());

                    }
                    break;
                case 3 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:42: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement928);
                    ifStatement111=ifStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement111.getTree());

                    }
                    break;
                case 4 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:56: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement932);
                    whileStatement112=whileStatement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement112.getTree());

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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:83:1: statementSequence : statement ( ';' ws statement )* -> statement ( statement )* ;
    public final Oberon0Parser.statementSequence_return statementSequence() throws RecognitionException {
        Oberon0Parser.statementSequence_return retval = new Oberon0Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal114=null;
        Oberon0Parser.statement_return statement113 = null;

        Oberon0Parser.ws_return ws115 = null;

        Oberon0Parser.statement_return statement116 = null;


        CommonTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:83:18: ( statement ( ';' ws statement )* -> statement ( statement )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:83:20: statement ( ';' ws statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence940);
            statement113=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement113.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:83:30: ( ';' ws statement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:83:31: ';' ws statement
            	    {
            	    char_literal114=(Token)match(input,46,FOLLOW_46_in_statementSequence943); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal114);

            	    pushFollow(FOLLOW_ws_in_statementSequence945);
            	    ws115=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws115.getTree());
            	    pushFollow(FOLLOW_statement_in_statementSequence947);
            	    statement116=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement116.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
            // 84:5: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:84:18: ( statement )*
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:85:1: identList : ident ( ws ',' ws ident )* -> ident ( ident )* ;
    public final Oberon0Parser.identList_return identList() throws RecognitionException {
        Oberon0Parser.identList_return retval = new Oberon0Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal119=null;
        Oberon0Parser.ident_return ident117 = null;

        Oberon0Parser.ws_return ws118 = null;

        Oberon0Parser.ws_return ws120 = null;

        Oberon0Parser.ident_return ident121 = null;


        CommonTree char_literal119_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:85:10: ( ident ( ws ',' ws ident )* -> ident ( ident )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:85:13: ident ( ws ',' ws ident )*
            {
            pushFollow(FOLLOW_ident_in_identList969);
            ident117=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident117.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:85:19: ( ws ',' ws ident )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==EOF||(LA18_0>=MINUS && LA18_0<=PLUS)||(LA18_0>=IDENT && LA18_0<=22)||(LA18_0>=24 && LA18_0<=27)||LA18_0==31||(LA18_0>=37 && LA18_0<=44)||(LA18_0>=46 && LA18_0<=48)||(LA18_0>=50 && LA18_0<=55)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:85:20: ws ',' ws ident
            	    {
            	    pushFollow(FOLLOW_ws_in_identList972);
            	    ws118=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws118.getTree());
            	    char_literal119=(Token)match(input,37,FOLLOW_37_in_identList974); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_37.add(char_literal119);

            	    pushFollow(FOLLOW_ws_in_identList976);
            	    ws120=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws120.getTree());
            	    pushFollow(FOLLOW_ident_in_identList978);
            	    ident121=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident121.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: ident, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 86:5: -> ident ( ident )*
            {
                adaptor.addChild(root_0, stream_ident.nextTree());
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:86:14: ( ident )*
                while ( stream_ident.hasNext() ) {
                    adaptor.addChild(root_0, stream_ident.nextTree());

                }
                stream_ident.reset();

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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:87:1: arrayType : 'ARRAY' ws expression 'OF' ws type -> ^( 'ARRAY' ^( TYPE type ) ^( EXPRESSION expression ) ) ;
    public final Oberon0Parser.arrayType_return arrayType() throws RecognitionException {
        Oberon0Parser.arrayType_return retval = new Oberon0Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal122=null;
        Token string_literal125=null;
        Oberon0Parser.ws_return ws123 = null;

        Oberon0Parser.expression_return expression124 = null;

        Oberon0Parser.ws_return ws126 = null;

        Oberon0Parser.type_return type127 = null;


        CommonTree string_literal122_tree=null;
        CommonTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:87:10: ( 'ARRAY' ws expression 'OF' ws type -> ^( 'ARRAY' ^( TYPE type ) ^( EXPRESSION expression ) ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:87:13: 'ARRAY' ws expression 'OF' ws type
            {
            string_literal122=(Token)match(input,47,FOLLOW_47_in_arrayType1000); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal122);

            pushFollow(FOLLOW_ws_in_arrayType1002);
            ws123=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws123.getTree());
            pushFollow(FOLLOW_expression_in_arrayType1004);
            expression124=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression124.getTree());
            string_literal125=(Token)match(input,48,FOLLOW_48_in_arrayType1006); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal125);

            pushFollow(FOLLOW_ws_in_arrayType1008);
            ws126=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws126.getTree());
            pushFollow(FOLLOW_type_in_arrayType1010);
            type127=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type127.getTree());


            // AST REWRITE
            // elements: type, expression, 47
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 88:5: -> ^( 'ARRAY' ^( TYPE type ) ^( EXPRESSION expression ) )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:88:8: ^( 'ARRAY' ^( TYPE type ) ^( EXPRESSION expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_47.nextNode(), root_1);

                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:88:18: ^( TYPE type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:88:31: ^( EXPRESSION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

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
    // $ANTLR end "arrayType"

    public static class fieldList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:90:1: fieldList : ( identList ':' ws type ws )? ;
    public final Oberon0Parser.fieldList_return fieldList() throws RecognitionException {
        Oberon0Parser.fieldList_return retval = new Oberon0Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal129=null;
        Oberon0Parser.identList_return identList128 = null;

        Oberon0Parser.ws_return ws130 = null;

        Oberon0Parser.type_return type131 = null;

        Oberon0Parser.ws_return ws132 = null;


        CommonTree char_literal129_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:91:2: ( ( identList ':' ws type ws )? )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:91:5: ( identList ':' ws type ws )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:91:5: ( identList ':' ws type ws )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:91:6: identList ':' ws type ws
                    {
                    pushFollow(FOLLOW_identList_in_fieldList1044);
                    identList128=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identList128.getTree());
                    char_literal129=(Token)match(input,49,FOLLOW_49_in_fieldList1046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal129_tree = (CommonTree)adaptor.create(char_literal129);
                    adaptor.addChild(root_0, char_literal129_tree);
                    }
                    pushFollow(FOLLOW_ws_in_fieldList1048);
                    ws130=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws130.getTree());
                    pushFollow(FOLLOW_type_in_fieldList1050);
                    type131=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type131.getTree());
                    pushFollow(FOLLOW_ws_in_fieldList1052);
                    ws132=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws132.getTree());

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
    // $ANTLR end "fieldList"

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:92:1: recordType : 'RECORD' ws fieldList ( ';' ws fieldList )* 'END' ;
    public final Oberon0Parser.recordType_return recordType() throws RecognitionException {
        Oberon0Parser.recordType_return retval = new Oberon0Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal133=null;
        Token char_literal136=null;
        Token string_literal139=null;
        Oberon0Parser.ws_return ws134 = null;

        Oberon0Parser.fieldList_return fieldList135 = null;

        Oberon0Parser.ws_return ws137 = null;

        Oberon0Parser.fieldList_return fieldList138 = null;


        CommonTree string_literal133_tree=null;
        CommonTree char_literal136_tree=null;
        CommonTree string_literal139_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:93:2: ( 'RECORD' ws fieldList ( ';' ws fieldList )* 'END' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:93:5: 'RECORD' ws fieldList ( ';' ws fieldList )* 'END'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal133=(Token)match(input,50,FOLLOW_50_in_recordType1063); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal133_tree = (CommonTree)adaptor.create(string_literal133);
            adaptor.addChild(root_0, string_literal133_tree);
            }
            pushFollow(FOLLOW_ws_in_recordType1065);
            ws134=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ws134.getTree());
            pushFollow(FOLLOW_fieldList_in_recordType1067);
            fieldList135=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList135.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:93:27: ( ';' ws fieldList )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:93:28: ';' ws fieldList
            	    {
            	    char_literal136=(Token)match(input,46,FOLLOW_46_in_recordType1070); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal136_tree = (CommonTree)adaptor.create(char_literal136);
            	    adaptor.addChild(root_0, char_literal136_tree);
            	    }
            	    pushFollow(FOLLOW_ws_in_recordType1072);
            	    ws137=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws137.getTree());
            	    pushFollow(FOLLOW_fieldList_in_recordType1074);
            	    fieldList138=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldList138.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            string_literal139=(Token)match(input,42,FOLLOW_42_in_recordType1078); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal139_tree = (CommonTree)adaptor.create(string_literal139);
            adaptor.addChild(root_0, string_literal139_tree);
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
    // $ANTLR end "recordType"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:94:1: type : ( ident | arrayType | recordType );
    public final Oberon0Parser.type_return type() throws RecognitionException {
        Oberon0Parser.type_return retval = new Oberon0Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Oberon0Parser.ident_return ident140 = null;

        Oberon0Parser.arrayType_return arrayType141 = null;

        Oberon0Parser.recordType_return recordType142 = null;



        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:95:2: ( ident | arrayType | recordType )
            int alt21=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt21=1;
                }
                break;
            case 47:
                {
                alt21=2;
                }
                break;
            case 50:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:95:5: ident
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ident_in_type1089);
                    ident140=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident140.getTree());

                    }
                    break;
                case 2 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:95:13: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type1093);
                    arrayType141=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType141.getTree());

                    }
                    break;
                case 3 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:95:25: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type1097);
                    recordType142=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType142.getTree());

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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:96:1: fPSection : ( 'VAR' ws )? identList ':' ws type ;
    public final Oberon0Parser.fPSection_return fPSection() throws RecognitionException {
        Oberon0Parser.fPSection_return retval = new Oberon0Parser.fPSection_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal143=null;
        Token char_literal146=null;
        Oberon0Parser.ws_return ws144 = null;

        Oberon0Parser.identList_return identList145 = null;

        Oberon0Parser.ws_return ws147 = null;

        Oberon0Parser.type_return type148 = null;


        CommonTree string_literal143_tree=null;
        CommonTree char_literal146_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:97:2: ( ( 'VAR' ws )? identList ':' ws type )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:97:5: ( 'VAR' ws )? identList ':' ws type
            {
            root_0 = (CommonTree)adaptor.nil();

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:97:5: ( 'VAR' ws )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==51) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:97:6: 'VAR' ws
                    {
                    string_literal143=(Token)match(input,51,FOLLOW_51_in_fPSection1108); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal143_tree = (CommonTree)adaptor.create(string_literal143);
                    adaptor.addChild(root_0, string_literal143_tree);
                    }
                    pushFollow(FOLLOW_ws_in_fPSection1110);
                    ws144=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws144.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection1114);
            identList145=identList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identList145.getTree());
            char_literal146=(Token)match(input,49,FOLLOW_49_in_fPSection1116); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal146_tree = (CommonTree)adaptor.create(char_literal146);
            adaptor.addChild(root_0, char_literal146_tree);
            }
            pushFollow(FOLLOW_ws_in_fPSection1118);
            ws147=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ws147.getTree());
            pushFollow(FOLLOW_type_in_fPSection1120);
            type148=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type148.getTree());

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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:98:1: formalParameters : '(' ws ( fPSection ws ( ';' ws fPSection )* )? ')' ;
    public final Oberon0Parser.formalParameters_return formalParameters() throws RecognitionException {
        Oberon0Parser.formalParameters_return retval = new Oberon0Parser.formalParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal149=null;
        Token char_literal153=null;
        Token char_literal156=null;
        Oberon0Parser.ws_return ws150 = null;

        Oberon0Parser.fPSection_return fPSection151 = null;

        Oberon0Parser.ws_return ws152 = null;

        Oberon0Parser.ws_return ws154 = null;

        Oberon0Parser.fPSection_return fPSection155 = null;


        CommonTree char_literal149_tree=null;
        CommonTree char_literal153_tree=null;
        CommonTree char_literal156_tree=null;

        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:99:2: ( '(' ws ( fPSection ws ( ';' ws fPSection )* )? ')' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:99:5: '(' ws ( fPSection ws ( ';' ws fPSection )* )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal149=(Token)match(input,25,FOLLOW_25_in_formalParameters1130); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal149_tree = (CommonTree)adaptor.create(char_literal149);
            adaptor.addChild(root_0, char_literal149_tree);
            }
            pushFollow(FOLLOW_ws_in_formalParameters1132);
            ws150=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ws150.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:99:12: ( fPSection ws ( ';' ws fPSection )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENT||LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:99:13: fPSection ws ( ';' ws fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1135);
                    fPSection151=fPSection();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fPSection151.getTree());
                    pushFollow(FOLLOW_ws_in_formalParameters1137);
                    ws152=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws152.getTree());
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:99:26: ( ';' ws fPSection )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==46) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:99:27: ';' ws fPSection
                    	    {
                    	    char_literal153=(Token)match(input,46,FOLLOW_46_in_formalParameters1140); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal153_tree = (CommonTree)adaptor.create(char_literal153);
                    	    adaptor.addChild(root_0, char_literal153_tree);
                    	    }
                    	    pushFollow(FOLLOW_ws_in_formalParameters1142);
                    	    ws154=ws();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ws154.getTree());
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1144);
                    	    fPSection155=fPSection();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, fPSection155.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal156=(Token)match(input,26,FOLLOW_26_in_formalParameters1150); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal156_tree = (CommonTree)adaptor.create(char_literal156);
            adaptor.addChild(root_0, char_literal156_tree);
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
    // $ANTLR end "formalParameters"

    public static class procedureBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureBody"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:101:1: procedureBody : 'BEGIN' ws statementSequence -> ^( BODY statementSequence ) ;
    public final Oberon0Parser.procedureBody_return procedureBody() throws RecognitionException {
        Oberon0Parser.procedureBody_return retval = new Oberon0Parser.procedureBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal157=null;
        Oberon0Parser.ws_return ws158 = null;

        Oberon0Parser.statementSequence_return statementSequence159 = null;


        CommonTree string_literal157_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:101:14: ( 'BEGIN' ws statementSequence -> ^( BODY statementSequence ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:101:17: 'BEGIN' ws statementSequence
            {
            string_literal157=(Token)match(input,52,FOLLOW_52_in_procedureBody1159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(string_literal157);

            pushFollow(FOLLOW_ws_in_procedureBody1161);
            ws158=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws158.getTree());
            pushFollow(FOLLOW_statementSequence_in_procedureBody1163);
            statementSequence159=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence159.getTree());


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
            // 102:5: -> ^( BODY statementSequence )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:102:8: ^( BODY statementSequence )
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:103:1: procedureDeclaration : 'PROCEDURE' ws ident ( ws formalParameters )? ws ';' ws declarations ( procedureBody )? 'END' ws ident -> ^( 'PROCEDURE' ident ( formalParameters )? declarations ( procedureBody )? ) ;
    public final Oberon0Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        Oberon0Parser.procedureDeclaration_return retval = new Oberon0Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal160=null;
        Token char_literal166=null;
        Token string_literal170=null;
        Oberon0Parser.ws_return ws161 = null;

        Oberon0Parser.ident_return ident162 = null;

        Oberon0Parser.ws_return ws163 = null;

        Oberon0Parser.formalParameters_return formalParameters164 = null;

        Oberon0Parser.ws_return ws165 = null;

        Oberon0Parser.ws_return ws167 = null;

        Oberon0Parser.declarations_return declarations168 = null;

        Oberon0Parser.procedureBody_return procedureBody169 = null;

        Oberon0Parser.ws_return ws171 = null;

        Oberon0Parser.ident_return ident172 = null;


        CommonTree string_literal160_tree=null;
        CommonTree char_literal166_tree=null;
        CommonTree string_literal170_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_procedureBody=new RewriteRuleSubtreeStream(adaptor,"rule procedureBody");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalParameters=new RewriteRuleSubtreeStream(adaptor,"rule formalParameters");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:103:21: ( 'PROCEDURE' ws ident ( ws formalParameters )? ws ';' ws declarations ( procedureBody )? 'END' ws ident -> ^( 'PROCEDURE' ident ( formalParameters )? declarations ( procedureBody )? ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:103:23: 'PROCEDURE' ws ident ( ws formalParameters )? ws ';' ws declarations ( procedureBody )? 'END' ws ident
            {
            string_literal160=(Token)match(input,53,FOLLOW_53_in_procedureDeclaration1181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_53.add(string_literal160);

            pushFollow(FOLLOW_ws_in_procedureDeclaration1183);
            ws161=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws161.getTree());
            pushFollow(FOLLOW_ident_in_procedureDeclaration1185);
            ident162=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident162.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:103:44: ( ws formalParameters )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:103:45: ws formalParameters
                    {
                    pushFollow(FOLLOW_ws_in_procedureDeclaration1188);
                    ws163=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws163.getTree());
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration1190);
                    formalParameters164=formalParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalParameters.add(formalParameters164.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_ws_in_procedureDeclaration1194);
            ws165=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws165.getTree());
            char_literal166=(Token)match(input,46,FOLLOW_46_in_procedureDeclaration1196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal166);

            pushFollow(FOLLOW_ws_in_procedureDeclaration1198);
            ws167=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws167.getTree());
            pushFollow(FOLLOW_declarations_in_procedureDeclaration1200);
            declarations168=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations168.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:103:90: ( procedureBody )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:103:91: procedureBody
                    {
                    pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1203);
                    procedureBody169=procedureBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureBody.add(procedureBody169.getTree());

                    }
                    break;

            }

            string_literal170=(Token)match(input,42,FOLLOW_42_in_procedureDeclaration1207); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal170);

            pushFollow(FOLLOW_ws_in_procedureDeclaration1209);
            ws171=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws171.getTree());
            pushFollow(FOLLOW_ident_in_procedureDeclaration1211);
            ident172=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident172.getTree());


            // AST REWRITE
            // elements: formalParameters, declarations, ident, procedureBody, 53
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 104:5: -> ^( 'PROCEDURE' ident ( formalParameters )? declarations ( procedureBody )? )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:104:8: ^( 'PROCEDURE' ident ( formalParameters )? declarations ( procedureBody )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_53.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:104:28: ( formalParameters )?
                if ( stream_formalParameters.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalParameters.nextTree());

                }
                stream_formalParameters.reset();
                adaptor.addChild(root_1, stream_declarations.nextTree());
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:104:61: ( procedureBody )?
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:105:1: constDeclaration : ( 'CONST' ws ( ident ws '=' ws expression ';' )* ) -> ^( 'CONST' ( ident '=' expression )* ) ;
    public final Oberon0Parser.constDeclaration_return constDeclaration() throws RecognitionException {
        Oberon0Parser.constDeclaration_return retval = new Oberon0Parser.constDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal173=null;
        Token char_literal177=null;
        Token char_literal180=null;
        Oberon0Parser.ws_return ws174 = null;

        Oberon0Parser.ident_return ident175 = null;

        Oberon0Parser.ws_return ws176 = null;

        Oberon0Parser.ws_return ws178 = null;

        Oberon0Parser.expression_return expression179 = null;


        CommonTree string_literal173_tree=null;
        CommonTree char_literal177_tree=null;
        CommonTree char_literal180_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:105:17: ( ( 'CONST' ws ( ident ws '=' ws expression ';' )* ) -> ^( 'CONST' ( ident '=' expression )* ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:105:19: ( 'CONST' ws ( ident ws '=' ws expression ';' )* )
            {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:105:19: ( 'CONST' ws ( ident ws '=' ws expression ';' )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:105:20: 'CONST' ws ( ident ws '=' ws expression ';' )*
            {
            string_literal173=(Token)match(input,54,FOLLOW_54_in_constDeclaration1243); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_54.add(string_literal173);

            pushFollow(FOLLOW_ws_in_constDeclaration1245);
            ws174=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws174.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:105:31: ( ident ws '=' ws expression ';' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==IDENT) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:105:32: ident ws '=' ws expression ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_constDeclaration1248);
            	    ident175=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident175.getTree());
            	    pushFollow(FOLLOW_ws_in_constDeclaration1250);
            	    ws176=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws176.getTree());
            	    char_literal177=(Token)match(input,31,FOLLOW_31_in_constDeclaration1252); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_31.add(char_literal177);

            	    pushFollow(FOLLOW_ws_in_constDeclaration1254);
            	    ws178=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws178.getTree());
            	    pushFollow(FOLLOW_expression_in_constDeclaration1256);
            	    expression179=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression179.getTree());
            	    char_literal180=(Token)match(input,46,FOLLOW_46_in_constDeclaration1258); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal180);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: 31, ident, 54, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 106:5: -> ^( 'CONST' ( ident '=' expression )* )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:106:8: ^( 'CONST' ( ident '=' expression )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_54.nextNode(), root_1);

                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:106:18: ( ident '=' expression )*
                while ( stream_31.hasNext()||stream_ident.hasNext()||stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_ident.nextTree());
                    adaptor.addChild(root_1, stream_31.nextNode());
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_31.reset();
                stream_ident.reset();
                stream_expression.reset();

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
    // $ANTLR end "constDeclaration"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:107:1: typeDeclaration : ( 'TYPE' ws ( ident ws '=' ws type ws ';' )* ) -> ^( 'TYPE' ( ident '=' type )* ) ;
    public final Oberon0Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Oberon0Parser.typeDeclaration_return retval = new Oberon0Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal181=null;
        Token char_literal185=null;
        Token char_literal189=null;
        Oberon0Parser.ws_return ws182 = null;

        Oberon0Parser.ident_return ident183 = null;

        Oberon0Parser.ws_return ws184 = null;

        Oberon0Parser.ws_return ws186 = null;

        Oberon0Parser.type_return type187 = null;

        Oberon0Parser.ws_return ws188 = null;


        CommonTree string_literal181_tree=null;
        CommonTree char_literal185_tree=null;
        CommonTree char_literal189_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:107:16: ( ( 'TYPE' ws ( ident ws '=' ws type ws ';' )* ) -> ^( 'TYPE' ( ident '=' type )* ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:107:18: ( 'TYPE' ws ( ident ws '=' ws type ws ';' )* )
            {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:107:18: ( 'TYPE' ws ( ident ws '=' ws type ws ';' )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:107:19: 'TYPE' ws ( ident ws '=' ws type ws ';' )*
            {
            string_literal181=(Token)match(input,55,FOLLOW_55_in_typeDeclaration1287); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_55.add(string_literal181);

            pushFollow(FOLLOW_ws_in_typeDeclaration1289);
            ws182=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws182.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:107:29: ( ident ws '=' ws type ws ';' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==IDENT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:107:30: ident ws '=' ws type ws ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_typeDeclaration1292);
            	    ident183=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident183.getTree());
            	    pushFollow(FOLLOW_ws_in_typeDeclaration1294);
            	    ws184=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws184.getTree());
            	    char_literal185=(Token)match(input,31,FOLLOW_31_in_typeDeclaration1296); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_31.add(char_literal185);

            	    pushFollow(FOLLOW_ws_in_typeDeclaration1298);
            	    ws186=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws186.getTree());
            	    pushFollow(FOLLOW_type_in_typeDeclaration1300);
            	    type187=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type187.getTree());
            	    pushFollow(FOLLOW_ws_in_typeDeclaration1302);
            	    ws188=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws188.getTree());
            	    char_literal189=(Token)match(input,46,FOLLOW_46_in_typeDeclaration1304); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal189);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: type, 31, 55, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 108:5: -> ^( 'TYPE' ( ident '=' type )* )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:108:8: ^( 'TYPE' ( ident '=' type )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_55.nextNode(), root_1);

                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:108:17: ( ident '=' type )*
                while ( stream_type.hasNext()||stream_31.hasNext()||stream_ident.hasNext() ) {
                    adaptor.addChild(root_1, stream_ident.nextTree());
                    adaptor.addChild(root_1, stream_31.nextNode());
                    adaptor.addChild(root_1, stream_type.nextTree());

                }
                stream_type.reset();
                stream_31.reset();
                stream_ident.reset();

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
    // $ANTLR end "typeDeclaration"

    public static class varDeclarations_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDeclarations"
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:109:1: varDeclarations : ( 'VAR' ws ( identList ':' ws type ws ';' )* ) -> ( ^( 'VAR' type identList ) )* ;
    public final Oberon0Parser.varDeclarations_return varDeclarations() throws RecognitionException {
        Oberon0Parser.varDeclarations_return retval = new Oberon0Parser.varDeclarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal190=null;
        Token char_literal193=null;
        Token char_literal197=null;
        Oberon0Parser.ws_return ws191 = null;

        Oberon0Parser.identList_return identList192 = null;

        Oberon0Parser.ws_return ws194 = null;

        Oberon0Parser.type_return type195 = null;

        Oberon0Parser.ws_return ws196 = null;


        CommonTree string_literal190_tree=null;
        CommonTree char_literal193_tree=null;
        CommonTree char_literal197_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:109:16: ( ( 'VAR' ws ( identList ':' ws type ws ';' )* ) -> ( ^( 'VAR' type identList ) )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:109:18: ( 'VAR' ws ( identList ':' ws type ws ';' )* )
            {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:109:18: ( 'VAR' ws ( identList ':' ws type ws ';' )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:109:19: 'VAR' ws ( identList ':' ws type ws ';' )*
            {
            string_literal190=(Token)match(input,51,FOLLOW_51_in_varDeclarations1333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(string_literal190);

            pushFollow(FOLLOW_ws_in_varDeclarations1335);
            ws191=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws191.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:109:28: ( identList ':' ws type ws ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==IDENT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:109:29: identList ':' ws type ws ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations1338);
            	    identList192=identList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identList.add(identList192.getTree());
            	    char_literal193=(Token)match(input,49,FOLLOW_49_in_varDeclarations1340); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_49.add(char_literal193);

            	    pushFollow(FOLLOW_ws_in_varDeclarations1342);
            	    ws194=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws194.getTree());
            	    pushFollow(FOLLOW_type_in_varDeclarations1344);
            	    type195=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_type.add(type195.getTree());
            	    pushFollow(FOLLOW_ws_in_varDeclarations1346);
            	    ws196=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws196.getTree());
            	    char_literal197=(Token)match(input,46,FOLLOW_46_in_varDeclarations1348); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal197);


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }



            // AST REWRITE
            // elements: type, 51, identList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 110:5: -> ( ^( 'VAR' type identList ) )*
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:110:8: ( ^( 'VAR' type identList ) )*
                while ( stream_type.hasNext()||stream_51.hasNext()||stream_identList.hasNext() ) {
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:110:8: ^( 'VAR' type identList )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_51.nextNode(), root_1);

                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_identList.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_51.reset();
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:1: declarations : ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ws ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* ;
    public final Oberon0Parser.declarations_return declarations() throws RecognitionException {
        Oberon0Parser.declarations_return retval = new Oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal203=null;
        Oberon0Parser.constDeclaration_return constDeclaration198 = null;

        Oberon0Parser.typeDeclaration_return typeDeclaration199 = null;

        Oberon0Parser.varDeclarations_return varDeclarations200 = null;

        Oberon0Parser.procedureDeclaration_return procedureDeclaration201 = null;

        Oberon0Parser.ws_return ws202 = null;


        CommonTree char_literal203_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_varDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule varDeclarations");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_constDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constDeclaration");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:13: ( ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ws ';' )* -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:16: ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration ws ';' )*
            {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:16: ( constDeclaration )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:0:0: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declarations1373);
                    constDeclaration198=constDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constDeclaration.add(constDeclaration198.getTree());

                    }
                    break;

            }

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:34: ( typeDeclaration )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==55) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:0:0: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_declarations1376);
                    typeDeclaration199=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration199.getTree());

                    }
                    break;

            }

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:51: ( varDeclarations )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:0:0: varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations1379);
                    varDeclarations200=varDeclarations();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_varDeclarations.add(varDeclarations200.getTree());

                    }
                    break;

            }

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:68: ( procedureDeclaration ws ';' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==53) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:111:69: procedureDeclaration ws ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1383);
            	    procedureDeclaration201=procedureDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration201.getTree());
            	    pushFollow(FOLLOW_ws_in_declarations1385);
            	    ws202=ws();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ws.add(ws202.getTree());
            	    char_literal203=(Token)match(input,46,FOLLOW_46_in_declarations1387); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_46.add(char_literal203);


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);



            // AST REWRITE
            // elements: varDeclarations, typeDeclaration, constDeclaration, procedureDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 112:5: -> ( constDeclaration )? ( typeDeclaration )? ( varDeclarations )? ( procedureDeclaration )*
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:112:8: ( constDeclaration )?
                if ( stream_constDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDeclaration.nextTree());

                }
                stream_constDeclaration.reset();
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:112:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                }
                stream_typeDeclaration.reset();
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:112:43: ( varDeclarations )?
                if ( stream_varDeclarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_varDeclarations.nextTree());

                }
                stream_varDeclarations.reset();
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:112:60: ( procedureDeclaration )*
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:113:1: moduleBody : ws declarations ( 'BEGIN' ws statementSequence )? 'END' -> ( declarations )? ( ^( BODY statementSequence ) )? ;
    public final Oberon0Parser.moduleBody_return moduleBody() throws RecognitionException {
        Oberon0Parser.moduleBody_return retval = new Oberon0Parser.moduleBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal206=null;
        Token string_literal209=null;
        Oberon0Parser.ws_return ws204 = null;

        Oberon0Parser.declarations_return declarations205 = null;

        Oberon0Parser.ws_return ws207 = null;

        Oberon0Parser.statementSequence_return statementSequence208 = null;


        CommonTree string_literal206_tree=null;
        CommonTree string_literal209_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:113:11: ( ws declarations ( 'BEGIN' ws statementSequence )? 'END' -> ( declarations )? ( ^( BODY statementSequence ) )? )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:113:14: ws declarations ( 'BEGIN' ws statementSequence )? 'END'
            {
            pushFollow(FOLLOW_ws_in_moduleBody1416);
            ws204=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws204.getTree());
            pushFollow(FOLLOW_declarations_in_moduleBody1418);
            declarations205=declarations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarations.add(declarations205.getTree());
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:113:30: ( 'BEGIN' ws statementSequence )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:113:31: 'BEGIN' ws statementSequence
                    {
                    string_literal206=(Token)match(input,52,FOLLOW_52_in_moduleBody1421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(string_literal206);

                    pushFollow(FOLLOW_ws_in_moduleBody1423);
                    ws207=ws();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ws.add(ws207.getTree());
                    pushFollow(FOLLOW_statementSequence_in_moduleBody1425);
                    statementSequence208=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence208.getTree());

                    }
                    break;

            }

            string_literal209=(Token)match(input,42,FOLLOW_42_in_moduleBody1429); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_42.add(string_literal209);



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
            // 114:5: -> ( declarations )? ( ^( BODY statementSequence ) )?
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:114:8: ( declarations )?
                if ( stream_declarations.hasNext() ) {
                    adaptor.addChild(root_0, stream_declarations.nextTree());

                }
                stream_declarations.reset();
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:114:22: ( ^( BODY statementSequence ) )?
                if ( stream_statementSequence.hasNext() ) {
                    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:114:22: ^( BODY statementSequence )
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
    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:115:1: module : 'MODULE' ws ident ws ';' moduleBody ws ident ws '.' ws EOF -> ^( MODULE ident moduleBody ) ;
    public final Oberon0Parser.module_return module() throws RecognitionException {
        Oberon0Parser.module_return retval = new Oberon0Parser.module_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal210=null;
        Token char_literal214=null;
        Token char_literal219=null;
        Token EOF221=null;
        Oberon0Parser.ws_return ws211 = null;

        Oberon0Parser.ident_return ident212 = null;

        Oberon0Parser.ws_return ws213 = null;

        Oberon0Parser.moduleBody_return moduleBody215 = null;

        Oberon0Parser.ws_return ws216 = null;

        Oberon0Parser.ident_return ident217 = null;

        Oberon0Parser.ws_return ws218 = null;

        Oberon0Parser.ws_return ws220 = null;


        CommonTree string_literal210_tree=null;
        CommonTree char_literal214_tree=null;
        CommonTree char_literal219_tree=null;
        CommonTree EOF221_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_ws=new RewriteRuleSubtreeStream(adaptor,"rule ws");
        RewriteRuleSubtreeStream stream_moduleBody=new RewriteRuleSubtreeStream(adaptor,"rule moduleBody");
        try {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:115:7: ( 'MODULE' ws ident ws ';' moduleBody ws ident ws '.' ws EOF -> ^( MODULE ident moduleBody ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:115:11: 'MODULE' ws ident ws ';' moduleBody ws ident ws '.' ws EOF
            {
            string_literal210=(Token)match(input,56,FOLLOW_56_in_module1453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(string_literal210);

            pushFollow(FOLLOW_ws_in_module1455);
            ws211=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws211.getTree());
            pushFollow(FOLLOW_ident_in_module1457);
            ident212=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident212.getTree());
            pushFollow(FOLLOW_ws_in_module1459);
            ws213=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws213.getTree());
            char_literal214=(Token)match(input,46,FOLLOW_46_in_module1461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(char_literal214);

            pushFollow(FOLLOW_moduleBody_in_module1463);
            moduleBody215=moduleBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_moduleBody.add(moduleBody215.getTree());
            pushFollow(FOLLOW_ws_in_module1465);
            ws216=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws216.getTree());
            pushFollow(FOLLOW_ident_in_module1467);
            ident217=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident217.getTree());
            pushFollow(FOLLOW_ws_in_module1469);
            ws218=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws218.getTree());
            char_literal219=(Token)match(input,22,FOLLOW_22_in_module1471); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_22.add(char_literal219);

            pushFollow(FOLLOW_ws_in_module1473);
            ws220=ws();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ws.add(ws220.getTree());
            EOF221=(Token)match(input,EOF,FOLLOW_EOF_in_module1475); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOF.add(EOF221);



            // AST REWRITE
            // elements: moduleBody, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:5: -> ^( MODULE ident moduleBody )
            {
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:116:8: ^( MODULE ident moduleBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(MODULE, "MODULE"), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());
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

    // $ANTLR start synpred1_Oberon0
    public final void synpred1_Oberon0_fragment() throws RecognitionException {   
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:8: ( WHITESPACE )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:8: WHITESPACE
        {
        match(input,WHITESPACE,FOLLOW_WHITESPACE_in_synpred1_Oberon0192); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Oberon0

    // $ANTLR start synpred22_Oberon0
    public final void synpred22_Oberon0_fragment() throws RecognitionException {   
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:62:14: ( simpleExpression infixOperand ws simpleExpression ws )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:62:14: simpleExpression infixOperand ws simpleExpression ws
        {
        pushFollow(FOLLOW_simpleExpression_in_synpred22_Oberon0459);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_infixOperand_in_synpred22_Oberon0461);
        infixOperand();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred22_Oberon0463);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_simpleExpression_in_synpred22_Oberon0465);
        simpleExpression();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred22_Oberon0467);
        ws();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Oberon0

    // $ANTLR start synpred26_Oberon0
    public final void synpred26_Oberon0_fragment() throws RecognitionException {   
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:15: ( 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ ( 'ELSE' ws statementSequence ) 'END' )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:15: 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ ( 'ELSE' ws statementSequence ) 'END'
        {
        match(input,38,FOLLOW_38_in_synpred26_Oberon0550); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred26_Oberon0552);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred26_Oberon0554);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,39,FOLLOW_39_in_synpred26_Oberon0556); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred26_Oberon0558);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0560);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:62: ( 'ELSIF' ws expression 'THEN' ws statementSequence )+
        int cnt37=0;
        loop37:
        do {
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==40) ) {
                alt37=1;
            }


            switch (alt37) {
        	case 1 :
        	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:63: 'ELSIF' ws expression 'THEN' ws statementSequence
        	    {
        	    match(input,40,FOLLOW_40_in_synpred26_Oberon0563); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred26_Oberon0565);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred26_Oberon0567);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,39,FOLLOW_39_in_synpred26_Oberon0569); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred26_Oberon0571);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0573);
        	    statementSequence();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt37 >= 1 ) break loop37;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(37, input);
                    throw eee;
            }
            cnt37++;
        } while (true);

        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:115: ( 'ELSE' ws statementSequence )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:68:116: 'ELSE' ws statementSequence
        {
        match(input,41,FOLLOW_41_in_synpred26_Oberon0578); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred26_Oberon0580);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred26_Oberon0582);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,42,FOLLOW_42_in_synpred26_Oberon0585); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Oberon0

    // $ANTLR start synpred28_Oberon0
    public final void synpred28_Oberon0_fragment() throws RecognitionException {   
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:70:4: ( 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ 'END' )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:70:4: 'IF' ws expression 'THEN' ws statementSequence ( 'ELSIF' ws expression 'THEN' ws statementSequence )+ 'END'
        {
        match(input,38,FOLLOW_38_in_synpred28_Oberon0641); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred28_Oberon0643);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred28_Oberon0645);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,39,FOLLOW_39_in_synpred28_Oberon0647); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred28_Oberon0649);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0651);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:70:51: ( 'ELSIF' ws expression 'THEN' ws statementSequence )+
        int cnt38=0;
        loop38:
        do {
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }


            switch (alt38) {
        	case 1 :
        	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:70:52: 'ELSIF' ws expression 'THEN' ws statementSequence
        	    {
        	    match(input,40,FOLLOW_40_in_synpred28_Oberon0654); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred28_Oberon0656);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_expression_in_synpred28_Oberon0658);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,39,FOLLOW_39_in_synpred28_Oberon0660); if (state.failed) return ;
        	    pushFollow(FOLLOW_ws_in_synpred28_Oberon0662);
        	    ws();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    pushFollow(FOLLOW_statementSequence_in_synpred28_Oberon0664);
        	    statementSequence();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt38 >= 1 ) break loop38;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(38, input);
                    throw eee;
            }
            cnt38++;
        } while (true);

        match(input,42,FOLLOW_42_in_synpred28_Oberon0668); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Oberon0

    // $ANTLR start synpred29_Oberon0
    public final void synpred29_Oberon0_fragment() throws RecognitionException {   
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:72:4: ( 'IF' ws expression 'THEN' ws statementSequence ( 'ELSE' ws statementSequence ) 'END' )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:72:4: 'IF' ws expression 'THEN' ws statementSequence ( 'ELSE' ws statementSequence ) 'END'
        {
        match(input,38,FOLLOW_38_in_synpred29_Oberon0714); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred29_Oberon0716);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred29_Oberon0718);
        expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,39,FOLLOW_39_in_synpred29_Oberon0720); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred29_Oberon0722);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0724);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:72:51: ( 'ELSE' ws statementSequence )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:72:52: 'ELSE' ws statementSequence
        {
        match(input,41,FOLLOW_41_in_synpred29_Oberon0727); if (state.failed) return ;
        pushFollow(FOLLOW_ws_in_synpred29_Oberon0729);
        ws();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_statementSequence_in_synpred29_Oberon0731);
        statementSequence();

        state._fsp--;
        if (state.failed) return ;

        }

        match(input,42,FOLLOW_42_in_synpred29_Oberon0734); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Oberon0

    // $ANTLR start synpred31_Oberon0
    public final void synpred31_Oberon0_fragment() throws RecognitionException {   
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:14: ( assignment )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:14: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred31_Oberon0921);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Oberon0

    // $ANTLR start synpred32_Oberon0
    public final void synpred32_Oberon0_fragment() throws RecognitionException {   
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:27: ( procedureCall )
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:82:27: procedureCall
        {
        pushFollow(FOLLOW_procedureCall_in_synpred32_Oberon0925);
        procedureCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Oberon0

    // Delegated rules

    public final boolean synpred1_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred26_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Oberon0_fragment(); // can never throw exception
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
    public final boolean synpred22_Oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\1\4\12\uffff";
    static final String DFA16_minS =
        "\1\23\1\0\11\uffff";
    static final String DFA16_maxS =
        "\1\56\1\0\11\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA16_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\22\uffff\1\2\1\uffff\3\4\1\3\2\uffff\1\4",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "82:13: ( assignment | procedureCall | ifStatement | whileStatement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_Oberon0()) ) {s = 9;}

                        else if ( (synpred32_Oberon0()) ) {s = 10;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA25_eotS =
        "\4\uffff";
    static final String DFA25_eofS =
        "\4\uffff";
    static final String DFA25_minS =
        "\2\24\2\uffff";
    static final String DFA25_maxS =
        "\2\56\2\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA25_specialS =
        "\4\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\4\uffff\1\2\24\uffff\1\3",
            "\1\1\4\uffff\1\2\24\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "103:44: ( ws formalParameters )?";
        }
    }
 

    public static final BitSet FOLLOW_WHITESPACE_in_ws192 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IDENT_in_ident202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_dotSelector221 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ident_in_dotSelector223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_arraySelector242 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_arraySelector244 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_arraySelector246 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_ws_in_arraySelector248 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_arraySelector250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotSelector_in_selectorPart269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraySelector_in_selectorPart273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_selector280 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_selectorPart_in_selector283 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ident_in_selector309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_factor333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_factor341 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_factor344 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_factor346 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_factor348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_factor353 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_factor356 = new BitSet(new long[]{0x000000000A280030L});
    public static final BitSet FOLLOW_factor_in_factor358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term367 = new BitSet(new long[]{0x00000000300000C2L});
    public static final BitSet FOLLOW_set_in_term370 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_term381 = new BitSet(new long[]{0x000000000A280030L});
    public static final BitSet FOLLOW_factor_in_term383 = new BitSet(new long[]{0x00000000300000C2L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression397 = new BitSet(new long[]{0x000000000A280030L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression399 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_simpleExpression402 = new BitSet(new long[]{0x000000000A280030L});
    public static final BitSet FOLLOW_term_in_simpleExpression406 = new BitSet(new long[]{0x0000000040000032L});
    public static final BitSet FOLLOW_set_in_simpleExpression409 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_simpleExpression420 = new BitSet(new long[]{0x000000000A280030L});
    public static final BitSet FOLLOW_term_in_simpleExpression422 = new BitSet(new long[]{0x0000000040000032L});
    public static final BitSet FOLLOW_set_in_infixOperand0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression459 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_infixOperand_in_expression461 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_expression463 = new BitSet(new long[]{0x000000000A280030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression465 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ws_in_expression467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_actualParameters510 = new BitSet(new long[]{0x000000000E380030L});
    public static final BitSet FOLLOW_ws_in_actualParameters512 = new BitSet(new long[]{0x000000000E380030L});
    public static final BitSet FOLLOW_expression_in_actualParameters515 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_37_in_actualParameters518 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_actualParameters520 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_actualParameters522 = new BitSet(new long[]{0x0000002004000000L});
    public static final BitSet FOLLOW_26_in_actualParameters528 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ws_in_actualParameters530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ifStatement550 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_ifStatement552 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_ifStatement554 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ifStatement556 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement558 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement560 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement563 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_ifStatement565 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_ifStatement567 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ifStatement569 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement571 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement573 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_41_in_ifStatement578 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement580 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement582 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifStatement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ifStatement641 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_ifStatement643 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_ifStatement645 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ifStatement647 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement649 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement651 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement654 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_ifStatement656 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_ifStatement658 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ifStatement660 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement662 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement664 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_ifStatement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ifStatement714 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_ifStatement716 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_ifStatement718 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ifStatement720 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement722 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement724 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifStatement727 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement729 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement731 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifStatement734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ifStatement773 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_ifStatement775 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_ifStatement777 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ifStatement779 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_ifStatement781 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement783 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifStatement785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whileStatement814 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_whileStatement816 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_whileStatement818 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whileStatement820 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_whileStatement822 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement824 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_whileStatement826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_assignment855 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_assignment857 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_assignment859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_procedureCall889 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence940 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_statementSequence943 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_statementSequence945 = new BitSet(new long[]{0x0000484000080000L});
    public static final BitSet FOLLOW_statement_in_statementSequence947 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ident_in_identList969 = new BitSet(new long[]{0x0000002000100002L});
    public static final BitSet FOLLOW_ws_in_identList972 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_identList974 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_identList976 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ident_in_identList978 = new BitSet(new long[]{0x0000002000100002L});
    public static final BitSet FOLLOW_47_in_arrayType1000 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_arrayType1002 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_arrayType1004 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_arrayType1006 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_ws_in_arrayType1008 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_type_in_arrayType1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList1044 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_fieldList1046 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_ws_in_fieldList1048 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_type_in_fieldList1050 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ws_in_fieldList1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_recordType1063 = new BitSet(new long[]{0x0000440000180000L});
    public static final BitSet FOLLOW_ws_in_recordType1065 = new BitSet(new long[]{0x0000440000080000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1067 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_46_in_recordType1070 = new BitSet(new long[]{0x0000440000180000L});
    public static final BitSet FOLLOW_ws_in_recordType1072 = new BitSet(new long[]{0x0000440000080000L});
    public static final BitSet FOLLOW_fieldList_in_recordType1074 = new BitSet(new long[]{0x0000440000000000L});
    public static final BitSet FOLLOW_42_in_recordType1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_fPSection1108 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_fPSection1110 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_identList_in_fPSection1114 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_fPSection1116 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_ws_in_fPSection1118 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_type_in_fPSection1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_formalParameters1130 = new BitSet(new long[]{0x0008000004180000L});
    public static final BitSet FOLLOW_ws_in_formalParameters1132 = new BitSet(new long[]{0x0008000004080000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1135 = new BitSet(new long[]{0x0000400004100000L});
    public static final BitSet FOLLOW_ws_in_formalParameters1137 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_46_in_formalParameters1140 = new BitSet(new long[]{0x0008000000180000L});
    public static final BitSet FOLLOW_ws_in_formalParameters1142 = new BitSet(new long[]{0x0008000000080000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1144 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_26_in_formalParameters1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_procedureBody1159 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_procedureBody1161 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_procedureDeclaration1181 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1183 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1185 = new BitSet(new long[]{0x0000400002100000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1188 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration1190 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1194 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedureDeclaration1196 = new BitSet(new long[]{0x00F8040000100000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1198 = new BitSet(new long[]{0x00F8040000000000L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration1200 = new BitSet(new long[]{0x0010040000000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1203 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_procedureDeclaration1207 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_procedureDeclaration1209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_constDeclaration1243 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_constDeclaration1245 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ident_in_constDeclaration1248 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_ws_in_constDeclaration1250 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_constDeclaration1252 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_constDeclaration1254 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_constDeclaration1256 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_constDeclaration1258 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_55_in_typeDeclaration1287 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1289 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration1292 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1294 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_typeDeclaration1296 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1298 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration1300 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_ws_in_typeDeclaration1302 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_typeDeclaration1304 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_51_in_varDeclarations1333 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_varDeclarations1335 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations1338 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclarations1340 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_ws_in_varDeclarations1342 = new BitSet(new long[]{0x0004800000180000L});
    public static final BitSet FOLLOW_type_in_varDeclarations1344 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_ws_in_varDeclarations1346 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_varDeclarations1348 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations1373 = new BitSet(new long[]{0x00A8000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations1376 = new BitSet(new long[]{0x0028000000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations1379 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1383 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_ws_in_declarations1385 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_declarations1387 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ws_in_moduleBody1416 = new BitSet(new long[]{0x00F8040000000000L});
    public static final BitSet FOLLOW_declarations_in_moduleBody1418 = new BitSet(new long[]{0x0010040000000000L});
    public static final BitSet FOLLOW_52_in_moduleBody1421 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_moduleBody1423 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_moduleBody1425 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_moduleBody1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_module1453 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_module1455 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ident_in_module1457 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_ws_in_module1459 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_module1461 = new BitSet(new long[]{0x00F8040000100000L});
    public static final BitSet FOLLOW_moduleBody_in_module1463 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_ws_in_module1465 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ident_in_module1467 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_ws_in_module1469 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_module1471 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ws_in_module1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHITESPACE_in_synpred1_Oberon0192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred22_Oberon0459 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_infixOperand_in_synpred22_Oberon0461 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_synpred22_Oberon0463 = new BitSet(new long[]{0x000000000A280030L});
    public static final BitSet FOLLOW_simpleExpression_in_synpred22_Oberon0465 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ws_in_synpred22_Oberon0467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred26_Oberon0550 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0552 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_synpred26_Oberon0554 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred26_Oberon0556 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0558 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0560 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred26_Oberon0563 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0565 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_synpred26_Oberon0567 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred26_Oberon0569 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0571 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0573 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_41_in_synpred26_Oberon0578 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_synpred26_Oberon0580 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred26_Oberon0582 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred26_Oberon0585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred28_Oberon0641 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0643 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0645 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred28_Oberon0647 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0649 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0651 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_synpred28_Oberon0654 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0656 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_synpred28_Oberon0658 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred28_Oberon0660 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_synpred28_Oberon0662 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred28_Oberon0664 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_42_in_synpred28_Oberon0668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred29_Oberon0714 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_ws_in_synpred29_Oberon0716 = new BitSet(new long[]{0x000000000A380030L});
    public static final BitSet FOLLOW_expression_in_synpred29_Oberon0718 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_synpred29_Oberon0720 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_synpred29_Oberon0722 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0724 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_synpred29_Oberon0727 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_ws_in_synpred29_Oberon0729 = new BitSet(new long[]{0x0000484000180000L});
    public static final BitSet FOLLOW_statementSequence_in_synpred29_Oberon0731 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_synpred29_Oberon0734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred31_Oberon0921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_synpred32_Oberon0925 = new BitSet(new long[]{0x0000000000000002L});

}