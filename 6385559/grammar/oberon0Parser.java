// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-11 13:02:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "IDENT", "INTEGER", "WS", "';'", "'.'", "'BEGIN'", "'END'", "'CONST'", "'='", "'TYPE'", "'VAR'", "':'", "'ARRAY'", "'OF'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "'RECORD'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
    };
    public static final int EOF=-1;
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
    public static final int MODULE=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int WS=7;

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
    public String getGrammarFileName() { return "oberon0.g"; }


    public static class module_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "module"
    // oberon0.g:13:1: module : MODULE IDENT ';' modulebody IDENT '.' -> ^( MODULE IDENT modulebody ) ;
    public final oberon0Parser.module_return module() throws RecognitionException {
        oberon0Parser.module_return retval = new oberon0Parser.module_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token MODULE1=null;
        Token IDENT2=null;
        Token char_literal3=null;
        Token IDENT5=null;
        Token char_literal6=null;
        oberon0Parser.modulebody_return modulebody4 = null;


        Object MODULE1_tree=null;
        Object IDENT2_tree=null;
        Object char_literal3_tree=null;
        Object IDENT5_tree=null;
        Object char_literal6_tree=null;
        RewriteRuleTokenStream stream_IDENT=new RewriteRuleTokenStream(adaptor,"token IDENT");
        RewriteRuleTokenStream stream_9=new RewriteRuleTokenStream(adaptor,"token 9");
        RewriteRuleTokenStream stream_8=new RewriteRuleTokenStream(adaptor,"token 8");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleSubtreeStream stream_modulebody=new RewriteRuleSubtreeStream(adaptor,"rule modulebody");
        try {
            // oberon0.g:14:2: ( MODULE IDENT ';' modulebody IDENT '.' -> ^( MODULE IDENT modulebody ) )
            // oberon0.g:14:4: MODULE IDENT ';' modulebody IDENT '.'
            {
            MODULE1=(Token)match(input,MODULE,FOLLOW_MODULE_in_module37);  
            stream_MODULE.add(MODULE1);

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module39);  
            stream_IDENT.add(IDENT2);

            char_literal3=(Token)match(input,8,FOLLOW_8_in_module41);  
            stream_8.add(char_literal3);

            pushFollow(FOLLOW_modulebody_in_module43);
            modulebody4=modulebody();

            state._fsp--;

            stream_modulebody.add(modulebody4.getTree());
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_module45);  
            stream_IDENT.add(IDENT5);

            char_literal6=(Token)match(input,9,FOLLOW_9_in_module47);  
            stream_9.add(char_literal6);



            // AST REWRITE
            // elements: IDENT, modulebody, MODULE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 14:42: -> ^( MODULE IDENT modulebody )
            {
                // oberon0.g:14:45: ^( MODULE IDENT modulebody )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_MODULE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENT.nextNode());
                adaptor.addChild(root_1, stream_modulebody.nextTree());

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
        return retval;
    }
    // $ANTLR end "module"

    public static class modulebody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modulebody"
    // oberon0.g:17:1: modulebody : declarations ( 'BEGIN' statementsequence )? 'END' ;
    public final oberon0Parser.modulebody_return modulebody() throws RecognitionException {
        oberon0Parser.modulebody_return retval = new oberon0Parser.modulebody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal8=null;
        Token string_literal10=null;
        oberon0Parser.declarations_return declarations7 = null;

        oberon0Parser.statementsequence_return statementsequence9 = null;


        Object string_literal8_tree=null;
        Object string_literal10_tree=null;

        try {
            // oberon0.g:18:3: ( declarations ( 'BEGIN' statementsequence )? 'END' )
            // oberon0.g:18:5: declarations ( 'BEGIN' statementsequence )? 'END'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_modulebody70);
            declarations7=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations7.getTree());
            // oberon0.g:18:18: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // oberon0.g:18:19: 'BEGIN' statementsequence
                    {
                    string_literal8=(Token)match(input,10,FOLLOW_10_in_modulebody73); 
                    string_literal8_tree = (Object)adaptor.create(string_literal8);
                    adaptor.addChild(root_0, string_literal8_tree);

                    pushFollow(FOLLOW_statementsequence_in_modulebody75);
                    statementsequence9=statementsequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementsequence9.getTree());

                    }
                    break;

            }

            string_literal10=(Token)match(input,11,FOLLOW_11_in_modulebody79); 
            string_literal10_tree = (Object)adaptor.create(string_literal10);
            adaptor.addChild(root_0, string_literal10_tree);


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
    // $ANTLR end "modulebody"

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // oberon0.g:21:1: declarations : ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* ;
    public final oberon0Parser.declarations_return declarations() throws RecognitionException {
        oberon0Parser.declarations_return retval = new oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal11=null;
        Token IDENT12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        Token string_literal16=null;
        Token IDENT17=null;
        Token char_literal18=null;
        Token string_literal20=null;
        Token char_literal22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        oberon0Parser.expression_return expression14 = null;

        oberon0Parser.type_return type19 = null;

        oberon0Parser.identlist_return identlist21 = null;

        oberon0Parser.type_return type23 = null;

        oberon0Parser.proceduredeclaration_return proceduredeclaration25 = null;


        Object string_literal11_tree=null;
        Object IDENT12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal15_tree=null;
        Object string_literal16_tree=null;
        Object IDENT17_tree=null;
        Object char_literal18_tree=null;
        Object string_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;

        try {
            // oberon0.g:22:2: ( ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* )
            // oberon0.g:22:4: ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )*
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:22:4: ( 'CONST' ( IDENT '=' expression ';' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // oberon0.g:22:5: 'CONST' ( IDENT '=' expression ';' )+
                    {
                    string_literal11=(Token)match(input,12,FOLLOW_12_in_declarations92); 
                    string_literal11_tree = (Object)adaptor.create(string_literal11);
                    adaptor.addChild(root_0, string_literal11_tree);

                    // oberon0.g:22:13: ( IDENT '=' expression ';' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // oberon0.g:22:14: IDENT '=' expression ';'
                    	    {
                    	    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations95); 
                    	    IDENT12_tree = (Object)adaptor.create(IDENT12);
                    	    adaptor.addChild(root_0, IDENT12_tree);

                    	    char_literal13=(Token)match(input,13,FOLLOW_13_in_declarations97); 
                    	    char_literal13_tree = (Object)adaptor.create(char_literal13);
                    	    adaptor.addChild(root_0, char_literal13_tree);

                    	    pushFollow(FOLLOW_expression_in_declarations99);
                    	    expression14=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression14.getTree());
                    	    char_literal15=(Token)match(input,8,FOLLOW_8_in_declarations101); 
                    	    char_literal15_tree = (Object)adaptor.create(char_literal15);
                    	    adaptor.addChild(root_0, char_literal15_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:22:43: ( 'TYPE' ( IDENT '=' type )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // oberon0.g:22:44: 'TYPE' ( IDENT '=' type )+
                    {
                    string_literal16=(Token)match(input,14,FOLLOW_14_in_declarations108); 
                    string_literal16_tree = (Object)adaptor.create(string_literal16);
                    adaptor.addChild(root_0, string_literal16_tree);

                    // oberon0.g:22:51: ( IDENT '=' type )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // oberon0.g:22:52: IDENT '=' type
                    	    {
                    	    IDENT17=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations111); 
                    	    IDENT17_tree = (Object)adaptor.create(IDENT17);
                    	    adaptor.addChild(root_0, IDENT17_tree);

                    	    char_literal18=(Token)match(input,13,FOLLOW_13_in_declarations113); 
                    	    char_literal18_tree = (Object)adaptor.create(char_literal18);
                    	    adaptor.addChild(root_0, char_literal18_tree);

                    	    pushFollow(FOLLOW_type_in_declarations115);
                    	    type19=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:22:71: ( 'VAR' ( identlist ':' type ';' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // oberon0.g:22:72: 'VAR' ( identlist ':' type ';' )+
                    {
                    string_literal20=(Token)match(input,15,FOLLOW_15_in_declarations122); 
                    string_literal20_tree = (Object)adaptor.create(string_literal20);
                    adaptor.addChild(root_0, string_literal20_tree);

                    // oberon0.g:22:78: ( identlist ':' type ';' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // oberon0.g:22:79: identlist ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identlist_in_declarations125);
                    	    identlist21=identlist();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, identlist21.getTree());
                    	    char_literal22=(Token)match(input,16,FOLLOW_16_in_declarations127); 
                    	    char_literal22_tree = (Object)adaptor.create(char_literal22);
                    	    adaptor.addChild(root_0, char_literal22_tree);

                    	    pushFollow(FOLLOW_type_in_declarations129);
                    	    type23=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type23.getTree());
                    	    char_literal24=(Token)match(input,8,FOLLOW_8_in_declarations131); 
                    	    char_literal24_tree = (Object)adaptor.create(char_literal24);
                    	    adaptor.addChild(root_0, char_literal24_tree);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:22:107: ( proceduredeclaration ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // oberon0.g:22:108: proceduredeclaration ';'
            	    {
            	    pushFollow(FOLLOW_proceduredeclaration_in_declarations139);
            	    proceduredeclaration25=proceduredeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, proceduredeclaration25.getTree());
            	    char_literal26=(Token)match(input,8,FOLLOW_8_in_declarations141); 
            	    char_literal26_tree = (Object)adaptor.create(char_literal26);
            	    adaptor.addChild(root_0, char_literal26_tree);


            	    }
            	    break;

            	default :
            	    break loop8;
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

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // oberon0.g:25:1: type : ( IDENT | arraytype | recordtype );
    public final oberon0Parser.type_return type() throws RecognitionException {
        oberon0Parser.type_return retval = new oberon0Parser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT27=null;
        oberon0Parser.arraytype_return arraytype28 = null;

        oberon0Parser.recordtype_return recordtype29 = null;


        Object IDENT27_tree=null;

        try {
            // oberon0.g:26:2: ( IDENT | arraytype | recordtype )
            int alt9=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // oberon0.g:26:4: IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT27=(Token)match(input,IDENT,FOLLOW_IDENT_in_type154); 
                    IDENT27_tree = (Object)adaptor.create(IDENT27);
                    adaptor.addChild(root_0, IDENT27_tree);


                    }
                    break;
                case 2 :
                    // oberon0.g:27:4: arraytype
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arraytype_in_type159);
                    arraytype28=arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, arraytype28.getTree());

                    }
                    break;
                case 3 :
                    // oberon0.g:28:4: recordtype
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_recordtype_in_type164);
                    recordtype29=recordtype();

                    state._fsp--;

                    adaptor.addChild(root_0, recordtype29.getTree());

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

    public static class arraytype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arraytype"
    // oberon0.g:31:1: arraytype : 'ARRAY' expression 'OF' type ;
    public final oberon0Parser.arraytype_return arraytype() throws RecognitionException {
        oberon0Parser.arraytype_return retval = new oberon0Parser.arraytype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal30=null;
        Token string_literal32=null;
        oberon0Parser.expression_return expression31 = null;

        oberon0Parser.type_return type33 = null;


        Object string_literal30_tree=null;
        Object string_literal32_tree=null;

        try {
            // oberon0.g:32:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:32:4: 'ARRAY' expression 'OF' type
            {
            root_0 = (Object)adaptor.nil();

            string_literal30=(Token)match(input,17,FOLLOW_17_in_arraytype175); 
            string_literal30_tree = (Object)adaptor.create(string_literal30);
            adaptor.addChild(root_0, string_literal30_tree);

            pushFollow(FOLLOW_expression_in_arraytype177);
            expression31=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression31.getTree());
            string_literal32=(Token)match(input,18,FOLLOW_18_in_arraytype179); 
            string_literal32_tree = (Object)adaptor.create(string_literal32);
            adaptor.addChild(root_0, string_literal32_tree);

            pushFollow(FOLLOW_type_in_arraytype181);
            type33=type();

            state._fsp--;

            adaptor.addChild(root_0, type33.getTree());

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
    // $ANTLR end "arraytype"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // oberon0.g:35:1: expression : simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? ;
    public final oberon0Parser.expression_return expression() throws RecognitionException {
        oberon0Parser.expression_return retval = new oberon0Parser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set35=null;
        oberon0Parser.simpleexpression_return simpleexpression34 = null;

        oberon0Parser.simpleexpression_return simpleexpression36 = null;


        Object set35_tree=null;

        try {
            // oberon0.g:36:2: ( simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? )
            // oberon0.g:36:4: simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleexpression_in_expression193);
            simpleexpression34=simpleexpression();

            state._fsp--;

            adaptor.addChild(root_0, simpleexpression34.getTree());
            // oberon0.g:36:21: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||(LA10_0>=19 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:36:22: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression
                    {
                    set35=(Token)input.LT(1);
                    if ( input.LA(1)==13||(input.LA(1)>=19 && input.LA(1)<=23) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set35));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression210);
                    simpleexpression36=simpleexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleexpression36.getTree());

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

    public static class simpleexpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleexpression"
    // oberon0.g:39:1: simpleexpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* ;
    public final oberon0Parser.simpleexpression_return simpleexpression() throws RecognitionException {
        oberon0Parser.simpleexpression_return retval = new oberon0Parser.simpleexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set37=null;
        Token set39=null;
        oberon0Parser.term_return term38 = null;

        oberon0Parser.term_return term40 = null;


        Object set37_tree=null;
        Object set39_tree=null;

        try {
            // oberon0.g:40:2: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* )
            // oberon0.g:40:4: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )*
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:40:4: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=25)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // oberon0.g:
                    {
                    set37=(Token)input.LT(1);
                    if ( (input.LA(1)>=24 && input.LA(1)<=25) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set37));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleexpression231);
            term38=term();

            state._fsp--;

            adaptor.addChild(root_0, term38.getTree());
            // oberon0.g:40:20: ( ( '+' | '-' | 'OR' )? term )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=IDENT && LA13_0<=INTEGER)||(LA13_0>=24 && LA13_0<=26)||LA13_0==31||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // oberon0.g:40:21: ( '+' | '-' | 'OR' )? term
            	    {
            	    // oberon0.g:40:21: ( '+' | '-' | 'OR' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=24 && LA12_0<=26)) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // oberon0.g:
            	            {
            	            set39=(Token)input.LT(1);
            	            if ( (input.LA(1)>=24 && input.LA(1)<=26) ) {
            	                input.consume();
            	                adaptor.addChild(root_0, (Object)adaptor.create(set39));
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_simpleexpression243);
            	    term40=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term40.getTree());

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
    // $ANTLR end "simpleexpression"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // oberon0.g:43:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final oberon0Parser.term_return term() throws RecognitionException {
        oberon0Parser.term_return retval = new oberon0Parser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set42=null;
        oberon0Parser.factor_return factor41 = null;

        oberon0Parser.factor_return factor43 = null;


        Object set42_tree=null;

        try {
            // oberon0.g:44:2: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            // oberon0.g:44:4: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term257);
            factor41=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor41.getTree());
            // oberon0.g:44:11: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=27 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // oberon0.g:44:12: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    set42=(Token)input.LT(1);
            	    if ( (input.LA(1)>=27 && input.LA(1)<=30) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set42));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term270);
            	    factor43=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor43.getTree());

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
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // oberon0.g:47:1: factor : ( IDENT selector | number | '(' expression ')' | '~' factor );
    public final oberon0Parser.factor_return factor() throws RecognitionException {
        oberon0Parser.factor_return retval = new oberon0Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT44=null;
        Token char_literal47=null;
        Token char_literal49=null;
        Token char_literal50=null;
        oberon0Parser.selector_return selector45 = null;

        oberon0Parser.number_return number46 = null;

        oberon0Parser.expression_return expression48 = null;

        oberon0Parser.factor_return factor51 = null;


        Object IDENT44_tree=null;
        Object char_literal47_tree=null;
        Object char_literal49_tree=null;
        Object char_literal50_tree=null;

        try {
            // oberon0.g:48:2: ( IDENT selector | number | '(' expression ')' | '~' factor )
            int alt15=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt15=1;
                }
                break;
            case INTEGER:
                {
                alt15=2;
                }
                break;
            case 31:
                {
                alt15=3;
                }
                break;
            case 33:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // oberon0.g:48:4: IDENT selector
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor283); 
                    IDENT44_tree = (Object)adaptor.create(IDENT44);
                    adaptor.addChild(root_0, IDENT44_tree);

                    pushFollow(FOLLOW_selector_in_factor285);
                    selector45=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector45.getTree());

                    }
                    break;
                case 2 :
                    // oberon0.g:49:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor290);
                    number46=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number46.getTree());

                    }
                    break;
                case 3 :
                    // oberon0.g:50:4: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal47=(Token)match(input,31,FOLLOW_31_in_factor295); 
                    char_literal47_tree = (Object)adaptor.create(char_literal47);
                    adaptor.addChild(root_0, char_literal47_tree);

                    pushFollow(FOLLOW_expression_in_factor297);
                    expression48=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression48.getTree());
                    char_literal49=(Token)match(input,32,FOLLOW_32_in_factor299); 
                    char_literal49_tree = (Object)adaptor.create(char_literal49);
                    adaptor.addChild(root_0, char_literal49_tree);


                    }
                    break;
                case 4 :
                    // oberon0.g:51:4: '~' factor
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal50=(Token)match(input,33,FOLLOW_33_in_factor304); 
                    char_literal50_tree = (Object)adaptor.create(char_literal50);
                    adaptor.addChild(root_0, char_literal50_tree);

                    pushFollow(FOLLOW_factor_in_factor306);
                    factor51=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor51.getTree());

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

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // oberon0.g:54:1: number : INTEGER ;
    public final oberon0Parser.number_return number() throws RecognitionException {
        oberon0Parser.number_return retval = new oberon0Parser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER52=null;

        Object INTEGER52_tree=null;

        try {
            // oberon0.g:55:2: ( INTEGER )
            // oberon0.g:55:4: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            INTEGER52=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number317); 
            INTEGER52_tree = (Object)adaptor.create(INTEGER52);
            adaptor.addChild(root_0, INTEGER52_tree);


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

    public static class selector_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // oberon0.g:58:1: selector : ( '.' IDENT | '[' expression ']' )* ;
    public final oberon0Parser.selector_return selector() throws RecognitionException {
        oberon0Parser.selector_return retval = new oberon0Parser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal53=null;
        Token IDENT54=null;
        Token char_literal55=null;
        Token char_literal57=null;
        oberon0Parser.expression_return expression56 = null;


        Object char_literal53_tree=null;
        Object IDENT54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;

        try {
            // oberon0.g:59:2: ( ( '.' IDENT | '[' expression ']' )* )
            // oberon0.g:59:4: ( '.' IDENT | '[' expression ']' )*
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:59:4: ( '.' IDENT | '[' expression ']' )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==9) ) {
                    alt16=1;
                }
                else if ( (LA16_0==34) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // oberon0.g:59:6: '.' IDENT
            	    {
            	    char_literal53=(Token)match(input,9,FOLLOW_9_in_selector331); 
            	    char_literal53_tree = (Object)adaptor.create(char_literal53);
            	    adaptor.addChild(root_0, char_literal53_tree);

            	    IDENT54=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector333); 
            	    IDENT54_tree = (Object)adaptor.create(IDENT54);
            	    adaptor.addChild(root_0, IDENT54_tree);


            	    }
            	    break;
            	case 2 :
            	    // oberon0.g:59:18: '[' expression ']'
            	    {
            	    char_literal55=(Token)match(input,34,FOLLOW_34_in_selector337); 
            	    char_literal55_tree = (Object)adaptor.create(char_literal55);
            	    adaptor.addChild(root_0, char_literal55_tree);

            	    pushFollow(FOLLOW_expression_in_selector339);
            	    expression56=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression56.getTree());
            	    char_literal57=(Token)match(input,35,FOLLOW_35_in_selector341); 
            	    char_literal57_tree = (Object)adaptor.create(char_literal57);
            	    adaptor.addChild(root_0, char_literal57_tree);


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
    // $ANTLR end "selector"

    public static class recordtype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordtype"
    // oberon0.g:62:1: recordtype : 'RECORD' fieldlist ( ';' fieldlist )* 'END' ;
    public final oberon0Parser.recordtype_return recordtype() throws RecognitionException {
        oberon0Parser.recordtype_return retval = new oberon0Parser.recordtype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;
        Token char_literal60=null;
        Token string_literal62=null;
        oberon0Parser.fieldlist_return fieldlist59 = null;

        oberon0Parser.fieldlist_return fieldlist61 = null;


        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        Object string_literal62_tree=null;

        try {
            // oberon0.g:63:2: ( 'RECORD' fieldlist ( ';' fieldlist )* 'END' )
            // oberon0.g:63:4: 'RECORD' fieldlist ( ';' fieldlist )* 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal58=(Token)match(input,36,FOLLOW_36_in_recordtype355); 
            string_literal58_tree = (Object)adaptor.create(string_literal58);
            adaptor.addChild(root_0, string_literal58_tree);

            pushFollow(FOLLOW_fieldlist_in_recordtype357);
            fieldlist59=fieldlist();

            state._fsp--;

            adaptor.addChild(root_0, fieldlist59.getTree());
            // oberon0.g:63:23: ( ';' fieldlist )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==8) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // oberon0.g:63:24: ';' fieldlist
            	    {
            	    char_literal60=(Token)match(input,8,FOLLOW_8_in_recordtype360); 
            	    char_literal60_tree = (Object)adaptor.create(char_literal60);
            	    adaptor.addChild(root_0, char_literal60_tree);

            	    pushFollow(FOLLOW_fieldlist_in_recordtype362);
            	    fieldlist61=fieldlist();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldlist61.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            string_literal62=(Token)match(input,11,FOLLOW_11_in_recordtype366); 
            string_literal62_tree = (Object)adaptor.create(string_literal62);
            adaptor.addChild(root_0, string_literal62_tree);


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
    // $ANTLR end "recordtype"

    public static class fieldlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldlist"
    // oberon0.g:66:1: fieldlist : ( identlist ':' type )? ;
    public final oberon0Parser.fieldlist_return fieldlist() throws RecognitionException {
        oberon0Parser.fieldlist_return retval = new oberon0Parser.fieldlist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal64=null;
        oberon0Parser.identlist_return identlist63 = null;

        oberon0Parser.type_return type65 = null;


        Object char_literal64_tree=null;

        try {
            // oberon0.g:67:2: ( ( identlist ':' type )? )
            // oberon0.g:67:4: ( identlist ':' type )?
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:67:4: ( identlist ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // oberon0.g:67:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist379);
                    identlist63=identlist();

                    state._fsp--;

                    adaptor.addChild(root_0, identlist63.getTree());
                    char_literal64=(Token)match(input,16,FOLLOW_16_in_fieldlist381); 
                    char_literal64_tree = (Object)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);

                    pushFollow(FOLLOW_type_in_fieldlist383);
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
    // $ANTLR end "fieldlist"

    public static class identlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identlist"
    // oberon0.g:70:1: identlist : IDENT ( ',' IDENT )* ;
    public final oberon0Parser.identlist_return identlist() throws RecognitionException {
        oberon0Parser.identlist_return retval = new oberon0Parser.identlist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT66=null;
        Token char_literal67=null;
        Token IDENT68=null;

        Object IDENT66_tree=null;
        Object char_literal67_tree=null;
        Object IDENT68_tree=null;

        try {
            // oberon0.g:71:2: ( IDENT ( ',' IDENT )* )
            // oberon0.g:71:4: IDENT ( ',' IDENT )*
            {
            root_0 = (Object)adaptor.nil();

            IDENT66=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist397); 
            IDENT66_tree = (Object)adaptor.create(IDENT66);
            adaptor.addChild(root_0, IDENT66_tree);

            // oberon0.g:71:10: ( ',' IDENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // oberon0.g:71:11: ',' IDENT
            	    {
            	    char_literal67=(Token)match(input,37,FOLLOW_37_in_identlist400); 
            	    char_literal67_tree = (Object)adaptor.create(char_literal67);
            	    adaptor.addChild(root_0, char_literal67_tree);

            	    IDENT68=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist402); 
            	    IDENT68_tree = (Object)adaptor.create(IDENT68);
            	    adaptor.addChild(root_0, IDENT68_tree);


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "identlist"

    public static class statementsequence_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementsequence"
    // oberon0.g:74:1: statementsequence : statement ( ';' statement )* ;
    public final oberon0Parser.statementsequence_return statementsequence() throws RecognitionException {
        oberon0Parser.statementsequence_return retval = new oberon0Parser.statementsequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal70=null;
        oberon0Parser.statement_return statement69 = null;

        oberon0Parser.statement_return statement71 = null;


        Object char_literal70_tree=null;

        try {
            // oberon0.g:75:2: ( statement ( ';' statement )* )
            // oberon0.g:75:4: statement ( ';' statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementsequence415);
            statement69=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement69.getTree());
            // oberon0.g:75:14: ( ';' statement )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==8) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // oberon0.g:75:16: ';' statement
            	    {
            	    char_literal70=(Token)match(input,8,FOLLOW_8_in_statementsequence419); 
            	    char_literal70_tree = (Object)adaptor.create(char_literal70);
            	    adaptor.addChild(root_0, char_literal70_tree);

            	    pushFollow(FOLLOW_statement_in_statementsequence421);
            	    statement71=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement71.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "statementsequence"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // oberon0.g:78:1: statement : ( assProc | ifstatement | whilestatement )? ;
    public final oberon0Parser.statement_return statement() throws RecognitionException {
        oberon0Parser.statement_return retval = new oberon0Parser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        oberon0Parser.assProc_return assProc72 = null;

        oberon0Parser.ifstatement_return ifstatement73 = null;

        oberon0Parser.whilestatement_return whilestatement74 = null;



        try {
            // oberon0.g:79:2: ( ( assProc | ifstatement | whilestatement )? )
            // oberon0.g:79:4: ( assProc | ifstatement | whilestatement )?
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:79:4: ( assProc | ifstatement | whilestatement )?
            int alt21=4;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    alt21=1;
                    }
                    break;
                case 39:
                    {
                    alt21=2;
                    }
                    break;
                case 43:
                    {
                    alt21=3;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // oberon0.g:79:6: assProc
                    {
                    pushFollow(FOLLOW_assProc_in_statement436);
                    assProc72=assProc();

                    state._fsp--;

                    adaptor.addChild(root_0, assProc72.getTree());

                    }
                    break;
                case 2 :
                    // oberon0.g:79:16: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement440);
                    ifstatement73=ifstatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifstatement73.getTree());

                    }
                    break;
                case 3 :
                    // oberon0.g:79:30: whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement444);
                    whilestatement74=whilestatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whilestatement74.getTree());

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

    public static class assProc_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assProc"
    // oberon0.g:82:1: assProc : IDENT selector ( assignment | procedurecall ) ;
    public final oberon0Parser.assProc_return assProc() throws RecognitionException {
        oberon0Parser.assProc_return retval = new oberon0Parser.assProc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT75=null;
        oberon0Parser.selector_return selector76 = null;

        oberon0Parser.assignment_return assignment77 = null;

        oberon0Parser.procedurecall_return procedurecall78 = null;


        Object IDENT75_tree=null;

        try {
            // oberon0.g:83:2: ( IDENT selector ( assignment | procedurecall ) )
            // oberon0.g:83:4: IDENT selector ( assignment | procedurecall )
            {
            root_0 = (Object)adaptor.nil();

            IDENT75=(Token)match(input,IDENT,FOLLOW_IDENT_in_assProc459); 
            IDENT75_tree = (Object)adaptor.create(IDENT75);
            adaptor.addChild(root_0, IDENT75_tree);

            pushFollow(FOLLOW_selector_in_assProc461);
            selector76=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector76.getTree());
            // oberon0.g:83:19: ( assignment | procedurecall )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            else if ( (LA22_0==8||LA22_0==11||LA22_0==31||(LA22_0>=41 && LA22_0<=42)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // oberon0.g:83:21: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_assProc465);
                    assignment77=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment77.getTree());

                    }
                    break;
                case 2 :
                    // oberon0.g:83:34: procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_assProc469);
                    procedurecall78=procedurecall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedurecall78.getTree());

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
    // $ANTLR end "assProc"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // oberon0.g:86:1: assignment : ':=' expression ;
    public final oberon0Parser.assignment_return assignment() throws RecognitionException {
        oberon0Parser.assignment_return retval = new oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        oberon0Parser.expression_return expression80 = null;


        Object string_literal79_tree=null;

        try {
            // oberon0.g:87:2: ( ':=' expression )
            // oberon0.g:87:4: ':=' expression
            {
            root_0 = (Object)adaptor.nil();

            string_literal79=(Token)match(input,38,FOLLOW_38_in_assignment483); 
            string_literal79_tree = (Object)adaptor.create(string_literal79);
            adaptor.addChild(root_0, string_literal79_tree);

            pushFollow(FOLLOW_expression_in_assignment485);
            expression80=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression80.getTree());

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

    public static class procedurecall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedurecall"
    // oberon0.g:90:1: procedurecall : ( actualparameters )? ;
    public final oberon0Parser.procedurecall_return procedurecall() throws RecognitionException {
        oberon0Parser.procedurecall_return retval = new oberon0Parser.procedurecall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        oberon0Parser.actualparameters_return actualparameters81 = null;



        try {
            // oberon0.g:91:2: ( ( actualparameters )? )
            // oberon0.g:91:4: ( actualparameters )?
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:91:4: ( actualparameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // oberon0.g:91:5: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall498);
                    actualparameters81=actualparameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualparameters81.getTree());

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
    // $ANTLR end "procedurecall"

    public static class actualparameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualparameters"
    // oberon0.g:94:1: actualparameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final oberon0Parser.actualparameters_return actualparameters() throws RecognitionException {
        oberon0Parser.actualparameters_return retval = new oberon0Parser.actualparameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal82=null;
        Token char_literal84=null;
        Token char_literal86=null;
        oberon0Parser.expression_return expression83 = null;

        oberon0Parser.expression_return expression85 = null;


        Object char_literal82_tree=null;
        Object char_literal84_tree=null;
        Object char_literal86_tree=null;

        try {
            // oberon0.g:95:2: ( '(' ( expression ( ',' expression )* )? ')' )
            // oberon0.g:95:4: '(' ( expression ( ',' expression )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal82=(Token)match(input,31,FOLLOW_31_in_actualparameters512); 
            char_literal82_tree = (Object)adaptor.create(char_literal82);
            adaptor.addChild(root_0, char_literal82_tree);

            // oberon0.g:95:8: ( expression ( ',' expression )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=IDENT && LA25_0<=INTEGER)||(LA25_0>=24 && LA25_0<=25)||LA25_0==31||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // oberon0.g:95:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters516);
                    expression83=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression83.getTree());
                    // oberon0.g:95:21: ( ',' expression )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==37) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // oberon0.g:95:23: ',' expression
                    	    {
                    	    char_literal84=(Token)match(input,37,FOLLOW_37_in_actualparameters520); 
                    	    char_literal84_tree = (Object)adaptor.create(char_literal84);
                    	    adaptor.addChild(root_0, char_literal84_tree);

                    	    pushFollow(FOLLOW_expression_in_actualparameters522);
                    	    expression85=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression85.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal86=(Token)match(input,32,FOLLOW_32_in_actualparameters528); 
            char_literal86_tree = (Object)adaptor.create(char_literal86);
            adaptor.addChild(root_0, char_literal86_tree);


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
    // $ANTLR end "actualparameters"

    public static class ifstatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifstatement"
    // oberon0.g:98:1: ifstatement : 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' ;
    public final oberon0Parser.ifstatement_return ifstatement() throws RecognitionException {
        oberon0Parser.ifstatement_return retval = new oberon0Parser.ifstatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token string_literal89=null;
        Token string_literal91=null;
        Token string_literal93=null;
        Token string_literal95=null;
        Token string_literal97=null;
        oberon0Parser.expression_return expression88 = null;

        oberon0Parser.statementsequence_return statementsequence90 = null;

        oberon0Parser.expression_return expression92 = null;

        oberon0Parser.statementsequence_return statementsequence94 = null;

        oberon0Parser.statementsequence_return statementsequence96 = null;


        Object string_literal87_tree=null;
        Object string_literal89_tree=null;
        Object string_literal91_tree=null;
        Object string_literal93_tree=null;
        Object string_literal95_tree=null;
        Object string_literal97_tree=null;

        try {
            // oberon0.g:99:2: ( 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' )
            // oberon0.g:99:4: 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal87=(Token)match(input,39,FOLLOW_39_in_ifstatement540); 
            string_literal87_tree = (Object)adaptor.create(string_literal87);
            adaptor.addChild(root_0, string_literal87_tree);

            pushFollow(FOLLOW_expression_in_ifstatement542);
            expression88=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression88.getTree());
            string_literal89=(Token)match(input,40,FOLLOW_40_in_ifstatement544); 
            string_literal89_tree = (Object)adaptor.create(string_literal89);
            adaptor.addChild(root_0, string_literal89_tree);

            pushFollow(FOLLOW_statementsequence_in_ifstatement546);
            statementsequence90=statementsequence();

            state._fsp--;

            adaptor.addChild(root_0, statementsequence90.getTree());
            // oberon0.g:99:45: ( 'ELSIF' expression 'THEN' statementsequence )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // oberon0.g:99:47: 'ELSIF' expression 'THEN' statementsequence
            	    {
            	    string_literal91=(Token)match(input,41,FOLLOW_41_in_ifstatement550); 
            	    string_literal91_tree = (Object)adaptor.create(string_literal91);
            	    adaptor.addChild(root_0, string_literal91_tree);

            	    pushFollow(FOLLOW_expression_in_ifstatement552);
            	    expression92=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression92.getTree());
            	    string_literal93=(Token)match(input,40,FOLLOW_40_in_ifstatement554); 
            	    string_literal93_tree = (Object)adaptor.create(string_literal93);
            	    adaptor.addChild(root_0, string_literal93_tree);

            	    pushFollow(FOLLOW_statementsequence_in_ifstatement556);
            	    statementsequence94=statementsequence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementsequence94.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // oberon0.g:99:94: ( 'ELSE' statementsequence )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // oberon0.g:99:96: 'ELSE' statementsequence
                    {
                    string_literal95=(Token)match(input,42,FOLLOW_42_in_ifstatement563); 
                    string_literal95_tree = (Object)adaptor.create(string_literal95);
                    adaptor.addChild(root_0, string_literal95_tree);

                    pushFollow(FOLLOW_statementsequence_in_ifstatement565);
                    statementsequence96=statementsequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementsequence96.getTree());

                    }
                    break;

            }

            string_literal97=(Token)match(input,11,FOLLOW_11_in_ifstatement570); 
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);


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
    // $ANTLR end "ifstatement"

    public static class whilestatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whilestatement"
    // oberon0.g:102:1: whilestatement : 'WHILE' expression 'DO' statementsequence 'END' ;
    public final oberon0Parser.whilestatement_return whilestatement() throws RecognitionException {
        oberon0Parser.whilestatement_return retval = new oberon0Parser.whilestatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal98=null;
        Token string_literal100=null;
        Token string_literal102=null;
        oberon0Parser.expression_return expression99 = null;

        oberon0Parser.statementsequence_return statementsequence101 = null;


        Object string_literal98_tree=null;
        Object string_literal100_tree=null;
        Object string_literal102_tree=null;

        try {
            // oberon0.g:103:2: ( 'WHILE' expression 'DO' statementsequence 'END' )
            // oberon0.g:103:4: 'WHILE' expression 'DO' statementsequence 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal98=(Token)match(input,43,FOLLOW_43_in_whilestatement582); 
            string_literal98_tree = (Object)adaptor.create(string_literal98);
            adaptor.addChild(root_0, string_literal98_tree);

            pushFollow(FOLLOW_expression_in_whilestatement584);
            expression99=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression99.getTree());
            string_literal100=(Token)match(input,44,FOLLOW_44_in_whilestatement586); 
            string_literal100_tree = (Object)adaptor.create(string_literal100);
            adaptor.addChild(root_0, string_literal100_tree);

            pushFollow(FOLLOW_statementsequence_in_whilestatement588);
            statementsequence101=statementsequence();

            state._fsp--;

            adaptor.addChild(root_0, statementsequence101.getTree());
            string_literal102=(Token)match(input,11,FOLLOW_11_in_whilestatement590); 
            string_literal102_tree = (Object)adaptor.create(string_literal102);
            adaptor.addChild(root_0, string_literal102_tree);


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
    // $ANTLR end "whilestatement"

    public static class proceduredeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "proceduredeclaration"
    // oberon0.g:106:1: proceduredeclaration : procedureheading ';' procedurebody ;
    public final oberon0Parser.proceduredeclaration_return proceduredeclaration() throws RecognitionException {
        oberon0Parser.proceduredeclaration_return retval = new oberon0Parser.proceduredeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal104=null;
        oberon0Parser.procedureheading_return procedureheading103 = null;

        oberon0Parser.procedurebody_return procedurebody105 = null;


        Object char_literal104_tree=null;

        try {
            // oberon0.g:107:2: ( procedureheading ';' procedurebody )
            // oberon0.g:107:4: procedureheading ';' procedurebody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration602);
            procedureheading103=procedureheading();

            state._fsp--;

            adaptor.addChild(root_0, procedureheading103.getTree());
            char_literal104=(Token)match(input,8,FOLLOW_8_in_proceduredeclaration604); 
            char_literal104_tree = (Object)adaptor.create(char_literal104);
            adaptor.addChild(root_0, char_literal104_tree);

            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration606);
            procedurebody105=procedurebody();

            state._fsp--;

            adaptor.addChild(root_0, procedurebody105.getTree());

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
    // $ANTLR end "proceduredeclaration"

    public static class procedureheading_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureheading"
    // oberon0.g:110:1: procedureheading : 'PROCEDURE' IDENT ( formalparameters )? ;
    public final oberon0Parser.procedureheading_return procedureheading() throws RecognitionException {
        oberon0Parser.procedureheading_return retval = new oberon0Parser.procedureheading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal106=null;
        Token IDENT107=null;
        oberon0Parser.formalparameters_return formalparameters108 = null;


        Object string_literal106_tree=null;
        Object IDENT107_tree=null;

        try {
            // oberon0.g:111:2: ( 'PROCEDURE' IDENT ( formalparameters )? )
            // oberon0.g:111:4: 'PROCEDURE' IDENT ( formalparameters )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal106=(Token)match(input,45,FOLLOW_45_in_procedureheading618); 
            string_literal106_tree = (Object)adaptor.create(string_literal106);
            adaptor.addChild(root_0, string_literal106_tree);

            IDENT107=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading620); 
            IDENT107_tree = (Object)adaptor.create(IDENT107);
            adaptor.addChild(root_0, IDENT107_tree);

            // oberon0.g:111:22: ( formalparameters )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // oberon0.g:111:23: formalparameters
                    {
                    pushFollow(FOLLOW_formalparameters_in_procedureheading623);
                    formalparameters108=formalparameters();

                    state._fsp--;

                    adaptor.addChild(root_0, formalparameters108.getTree());

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
    // $ANTLR end "procedureheading"

    public static class procedurebody_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedurebody"
    // oberon0.g:114:1: procedurebody : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final oberon0Parser.procedurebody_return procedurebody() throws RecognitionException {
        oberon0Parser.procedurebody_return retval = new oberon0Parser.procedurebody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal110=null;
        Token string_literal112=null;
        Token IDENT113=null;
        oberon0Parser.declarations_return declarations109 = null;

        oberon0Parser.statementsequence_return statementsequence111 = null;


        Object string_literal110_tree=null;
        Object string_literal112_tree=null;
        Object IDENT113_tree=null;

        try {
            // oberon0.g:115:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:115:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedurebody637);
            declarations109=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations109.getTree());
            // oberon0.g:115:17: ( 'BEGIN' statementsequence )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==10) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // oberon0.g:115:18: 'BEGIN' statementsequence
                    {
                    string_literal110=(Token)match(input,10,FOLLOW_10_in_procedurebody640); 
                    string_literal110_tree = (Object)adaptor.create(string_literal110);
                    adaptor.addChild(root_0, string_literal110_tree);

                    pushFollow(FOLLOW_statementsequence_in_procedurebody642);
                    statementsequence111=statementsequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementsequence111.getTree());

                    }
                    break;

            }

            string_literal112=(Token)match(input,11,FOLLOW_11_in_procedurebody646); 
            string_literal112_tree = (Object)adaptor.create(string_literal112);
            adaptor.addChild(root_0, string_literal112_tree);

            IDENT113=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody648); 
            IDENT113_tree = (Object)adaptor.create(IDENT113);
            adaptor.addChild(root_0, IDENT113_tree);


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
    // $ANTLR end "procedurebody"

    public static class formalparameters_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalparameters"
    // oberon0.g:118:1: formalparameters : '(' ( fpsection ( ';' fpsection )* )? ')' ;
    public final oberon0Parser.formalparameters_return formalparameters() throws RecognitionException {
        oberon0Parser.formalparameters_return retval = new oberon0Parser.formalparameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal114=null;
        Token char_literal116=null;
        Token char_literal118=null;
        oberon0Parser.fpsection_return fpsection115 = null;

        oberon0Parser.fpsection_return fpsection117 = null;


        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        Object char_literal118_tree=null;

        try {
            // oberon0.g:119:2: ( '(' ( fpsection ( ';' fpsection )* )? ')' )
            // oberon0.g:119:4: '(' ( fpsection ( ';' fpsection )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal114=(Token)match(input,31,FOLLOW_31_in_formalparameters660); 
            char_literal114_tree = (Object)adaptor.create(char_literal114);
            adaptor.addChild(root_0, char_literal114_tree);

            // oberon0.g:119:8: ( fpsection ( ';' fpsection )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT||LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // oberon0.g:119:9: fpsection ( ';' fpsection )*
                    {
                    pushFollow(FOLLOW_fpsection_in_formalparameters663);
                    fpsection115=fpsection();

                    state._fsp--;

                    adaptor.addChild(root_0, fpsection115.getTree());
                    // oberon0.g:119:19: ( ';' fpsection )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==8) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // oberon0.g:119:20: ';' fpsection
                    	    {
                    	    char_literal116=(Token)match(input,8,FOLLOW_8_in_formalparameters666); 
                    	    char_literal116_tree = (Object)adaptor.create(char_literal116);
                    	    adaptor.addChild(root_0, char_literal116_tree);

                    	    pushFollow(FOLLOW_fpsection_in_formalparameters668);
                    	    fpsection117=fpsection();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fpsection117.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal118=(Token)match(input,32,FOLLOW_32_in_formalparameters674); 
            char_literal118_tree = (Object)adaptor.create(char_literal118);
            adaptor.addChild(root_0, char_literal118_tree);


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
    // $ANTLR end "formalparameters"

    public static class fpsection_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fpsection"
    // oberon0.g:122:1: fpsection : ( 'VAR' )? identlist ':' type ;
    public final oberon0Parser.fpsection_return fpsection() throws RecognitionException {
        oberon0Parser.fpsection_return retval = new oberon0Parser.fpsection_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal119=null;
        Token char_literal121=null;
        oberon0Parser.identlist_return identlist120 = null;

        oberon0Parser.type_return type122 = null;


        Object string_literal119_tree=null;
        Object char_literal121_tree=null;

        try {
            // oberon0.g:123:2: ( ( 'VAR' )? identlist ':' type )
            // oberon0.g:123:4: ( 'VAR' )? identlist ':' type
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:123:4: ( 'VAR' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // oberon0.g:123:5: 'VAR'
                    {
                    string_literal119=(Token)match(input,15,FOLLOW_15_in_fpsection686); 
                    string_literal119_tree = (Object)adaptor.create(string_literal119);
                    adaptor.addChild(root_0, string_literal119_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection690);
            identlist120=identlist();

            state._fsp--;

            adaptor.addChild(root_0, identlist120.getTree());
            char_literal121=(Token)match(input,16,FOLLOW_16_in_fpsection692); 
            char_literal121_tree = (Object)adaptor.create(char_literal121);
            adaptor.addChild(root_0, char_literal121_tree);

            pushFollow(FOLLOW_type_in_fpsection694);
            type122=type();

            state._fsp--;

            adaptor.addChild(root_0, type122.getTree());

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
    // $ANTLR end "fpsection"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module37 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module39 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module41 = new BitSet(new long[]{0x000020000000DC00L});
    public static final BitSet FOLLOW_modulebody_in_module43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module45 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_module47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_modulebody70 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_modulebody73 = new BitSet(new long[]{0x0000088000000120L});
    public static final BitSet FOLLOW_statementsequence_in_modulebody75 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_modulebody79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations92 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_declarations95 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations97 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_declarations99 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations101 = new BitSet(new long[]{0x000020000000C022L});
    public static final BitSet FOLLOW_14_in_declarations108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_declarations111 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations113 = new BitSet(new long[]{0x0000001000020020L});
    public static final BitSet FOLLOW_type_in_declarations115 = new BitSet(new long[]{0x0000200000008022L});
    public static final BitSet FOLLOW_15_in_declarations122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identlist_in_declarations125 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_declarations127 = new BitSet(new long[]{0x0000001000020020L});
    public static final BitSet FOLLOW_type_in_declarations129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations131 = new BitSet(new long[]{0x0000200000000022L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declarations139 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations141 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_type154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arraytype175 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_arraytype177 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arraytype179 = new BitSet(new long[]{0x0000001000020020L});
    public static final BitSet FOLLOW_type_in_arraytype181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression193 = new BitSet(new long[]{0x0000000000F82002L});
    public static final BitSet FOLLOW_set_in_expression196 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_simpleexpression_in_expression210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression224 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_term_in_simpleexpression231 = new BitSet(new long[]{0x0000000287000062L});
    public static final BitSet FOLLOW_set_in_simpleexpression234 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_term_in_simpleexpression243 = new BitSet(new long[]{0x0000000287000062L});
    public static final BitSet FOLLOW_factor_in_term257 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term260 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_factor_in_term270 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_IDENT_in_factor283 = new BitSet(new long[]{0x0000000400000200L});
    public static final BitSet FOLLOW_selector_in_factor285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor295 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_factor297 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor304 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_factor_in_factor306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_selector331 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selector333 = new BitSet(new long[]{0x0000000400000202L});
    public static final BitSet FOLLOW_34_in_selector337 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_selector339 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector341 = new BitSet(new long[]{0x0000000400000202L});
    public static final BitSet FOLLOW_36_in_recordtype355 = new BitSet(new long[]{0x0000000000000920L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype357 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_8_in_recordtype360 = new BitSet(new long[]{0x0000000000000920L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype362 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_11_in_recordtype366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist379 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldlist381 = new BitSet(new long[]{0x0000001000020020L});
    public static final BitSet FOLLOW_type_in_fieldlist383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist397 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identlist400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identlist402 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence415 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_statementsequence419 = new BitSet(new long[]{0x0000088000000120L});
    public static final BitSet FOLLOW_statement_in_statementsequence421 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_assProc_in_statement436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assProc459 = new BitSet(new long[]{0x0000004480000200L});
    public static final BitSet FOLLOW_selector_in_assProc461 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_assignment_in_assProc465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_assProc469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_assignment483 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_assignment485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters512 = new BitSet(new long[]{0x0000000383000060L});
    public static final BitSet FOLLOW_expression_in_actualparameters516 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_37_in_actualparameters520 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_actualparameters522 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement540 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_ifstatement542 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement544 = new BitSet(new long[]{0x0000088000000120L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement546 = new BitSet(new long[]{0x0000060000000800L});
    public static final BitSet FOLLOW_41_in_ifstatement550 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_ifstatement552 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement554 = new BitSet(new long[]{0x0000088000000120L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement556 = new BitSet(new long[]{0x0000060000000800L});
    public static final BitSet FOLLOW_42_in_ifstatement563 = new BitSet(new long[]{0x0000088000000120L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement565 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ifstatement570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement582 = new BitSet(new long[]{0x0000000283000060L});
    public static final BitSet FOLLOW_expression_in_whilestatement584 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement586 = new BitSet(new long[]{0x0000088000000120L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement588 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_whilestatement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration602 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration604 = new BitSet(new long[]{0x000020000000DC00L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading620 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody637 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_procedurebody640 = new BitSet(new long[]{0x0000088000000120L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody642 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_procedurebody646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_formalparameters660 = new BitSet(new long[]{0x0000000100008020L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters663 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_8_in_formalparameters666 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters668 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_32_in_formalparameters674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fpsection686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identlist_in_fpsection690 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fpsection692 = new BitSet(new long[]{0x0000001000020020L});
    public static final BitSet FOLLOW_type_in_fpsection694 = new BitSet(new long[]{0x0000000000000002L});

}