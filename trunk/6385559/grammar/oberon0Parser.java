// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-11 11:20:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE '", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'='", "'TYPE'", "'VAR'", "':'", "'ARRAY'", "'OF'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "'RECORD'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
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
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int WS=6;

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
    // oberon0.g:8:1: module : 'MODULE ' IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' IDENT '.' ;
    public final oberon0Parser.module_return module() throws RecognitionException {
        oberon0Parser.module_return retval = new oberon0Parser.module_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token IDENT2=null;
        Token char_literal3=null;
        Token string_literal5=null;
        Token string_literal7=null;
        Token IDENT8=null;
        Token char_literal9=null;
        oberon0Parser.declarations_return declarations4 = null;

        oberon0Parser.statementsequence_return statementsequence6 = null;


        Object string_literal1_tree=null;
        Object IDENT2_tree=null;
        Object char_literal3_tree=null;
        Object string_literal5_tree=null;
        Object string_literal7_tree=null;
        Object IDENT8_tree=null;
        Object char_literal9_tree=null;

        try {
            // oberon0.g:9:2: ( 'MODULE ' IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' IDENT '.' )
            // oberon0.g:9:4: 'MODULE ' IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' IDENT '.'
            {
            root_0 = (Object)adaptor.nil();

            string_literal1=(Token)match(input,7,FOLLOW_7_in_module23); 
            string_literal1_tree = (Object)adaptor.create(string_literal1);
            adaptor.addChild(root_0, string_literal1_tree);

            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module25); 
            IDENT2_tree = (Object)adaptor.create(IDENT2);
            adaptor.addChild(root_0, IDENT2_tree);

            char_literal3=(Token)match(input,8,FOLLOW_8_in_module27); 
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);

            pushFollow(FOLLOW_declarations_in_module29);
            declarations4=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations4.getTree());
            // oberon0.g:9:37: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // oberon0.g:9:38: 'BEGIN' statementsequence
                    {
                    string_literal5=(Token)match(input,9,FOLLOW_9_in_module32); 
                    string_literal5_tree = (Object)adaptor.create(string_literal5);
                    adaptor.addChild(root_0, string_literal5_tree);

                    pushFollow(FOLLOW_statementsequence_in_module34);
                    statementsequence6=statementsequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementsequence6.getTree());

                    }
                    break;

            }

            string_literal7=(Token)match(input,10,FOLLOW_10_in_module38); 
            string_literal7_tree = (Object)adaptor.create(string_literal7);
            adaptor.addChild(root_0, string_literal7_tree);

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_module40); 
            IDENT8_tree = (Object)adaptor.create(IDENT8);
            adaptor.addChild(root_0, IDENT8_tree);

            char_literal9=(Token)match(input,11,FOLLOW_11_in_module42); 
            char_literal9_tree = (Object)adaptor.create(char_literal9);
            adaptor.addChild(root_0, char_literal9_tree);


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

    public static class declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarations"
    // oberon0.g:12:1: declarations : ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* ;
    public final oberon0Parser.declarations_return declarations() throws RecognitionException {
        oberon0Parser.declarations_return retval = new oberon0Parser.declarations_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal10=null;
        Token IDENT11=null;
        Token char_literal12=null;
        Token char_literal14=null;
        Token string_literal15=null;
        Token IDENT16=null;
        Token char_literal17=null;
        Token string_literal19=null;
        Token char_literal21=null;
        Token char_literal23=null;
        Token char_literal25=null;
        oberon0Parser.expression_return expression13 = null;

        oberon0Parser.type_return type18 = null;

        oberon0Parser.identlist_return identlist20 = null;

        oberon0Parser.type_return type22 = null;

        oberon0Parser.proceduredeclaration_return proceduredeclaration24 = null;


        Object string_literal10_tree=null;
        Object IDENT11_tree=null;
        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        Object string_literal15_tree=null;
        Object IDENT16_tree=null;
        Object char_literal17_tree=null;
        Object string_literal19_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;

        try {
            // oberon0.g:13:2: ( ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* )
            // oberon0.g:13:4: ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )*
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:13:4: ( 'CONST' ( IDENT '=' expression ';' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // oberon0.g:13:5: 'CONST' ( IDENT '=' expression ';' )+
                    {
                    string_literal10=(Token)match(input,12,FOLLOW_12_in_declarations54); 
                    string_literal10_tree = (Object)adaptor.create(string_literal10);
                    adaptor.addChild(root_0, string_literal10_tree);

                    // oberon0.g:13:13: ( IDENT '=' expression ';' )+
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
                    	    // oberon0.g:13:14: IDENT '=' expression ';'
                    	    {
                    	    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations57); 
                    	    IDENT11_tree = (Object)adaptor.create(IDENT11);
                    	    adaptor.addChild(root_0, IDENT11_tree);

                    	    char_literal12=(Token)match(input,13,FOLLOW_13_in_declarations59); 
                    	    char_literal12_tree = (Object)adaptor.create(char_literal12);
                    	    adaptor.addChild(root_0, char_literal12_tree);

                    	    pushFollow(FOLLOW_expression_in_declarations61);
                    	    expression13=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression13.getTree());
                    	    char_literal14=(Token)match(input,8,FOLLOW_8_in_declarations63); 
                    	    char_literal14_tree = (Object)adaptor.create(char_literal14);
                    	    adaptor.addChild(root_0, char_literal14_tree);


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

            // oberon0.g:13:43: ( 'TYPE' ( IDENT '=' type )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // oberon0.g:13:44: 'TYPE' ( IDENT '=' type )+
                    {
                    string_literal15=(Token)match(input,14,FOLLOW_14_in_declarations70); 
                    string_literal15_tree = (Object)adaptor.create(string_literal15);
                    adaptor.addChild(root_0, string_literal15_tree);

                    // oberon0.g:13:51: ( IDENT '=' type )+
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
                    	    // oberon0.g:13:52: IDENT '=' type
                    	    {
                    	    IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations73); 
                    	    IDENT16_tree = (Object)adaptor.create(IDENT16);
                    	    adaptor.addChild(root_0, IDENT16_tree);

                    	    char_literal17=(Token)match(input,13,FOLLOW_13_in_declarations75); 
                    	    char_literal17_tree = (Object)adaptor.create(char_literal17);
                    	    adaptor.addChild(root_0, char_literal17_tree);

                    	    pushFollow(FOLLOW_type_in_declarations77);
                    	    type18=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type18.getTree());

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

            // oberon0.g:13:71: ( 'VAR' ( identlist ':' type ';' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // oberon0.g:13:72: 'VAR' ( identlist ':' type ';' )+
                    {
                    string_literal19=(Token)match(input,15,FOLLOW_15_in_declarations84); 
                    string_literal19_tree = (Object)adaptor.create(string_literal19);
                    adaptor.addChild(root_0, string_literal19_tree);

                    // oberon0.g:13:78: ( identlist ':' type ';' )+
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
                    	    // oberon0.g:13:79: identlist ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identlist_in_declarations87);
                    	    identlist20=identlist();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, identlist20.getTree());
                    	    char_literal21=(Token)match(input,16,FOLLOW_16_in_declarations89); 
                    	    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    	    adaptor.addChild(root_0, char_literal21_tree);

                    	    pushFollow(FOLLOW_type_in_declarations91);
                    	    type22=type();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, type22.getTree());
                    	    char_literal23=(Token)match(input,8,FOLLOW_8_in_declarations93); 
                    	    char_literal23_tree = (Object)adaptor.create(char_literal23);
                    	    adaptor.addChild(root_0, char_literal23_tree);


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

            // oberon0.g:13:107: ( proceduredeclaration ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // oberon0.g:13:108: proceduredeclaration ';'
            	    {
            	    pushFollow(FOLLOW_proceduredeclaration_in_declarations101);
            	    proceduredeclaration24=proceduredeclaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, proceduredeclaration24.getTree());
            	    char_literal25=(Token)match(input,8,FOLLOW_8_in_declarations103); 
            	    char_literal25_tree = (Object)adaptor.create(char_literal25);
            	    adaptor.addChild(root_0, char_literal25_tree);


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
    // oberon0.g:16:1: type : ( IDENT | arraytype | recordtype );
    public final oberon0Parser.type_return type() throws RecognitionException {
        oberon0Parser.type_return retval = new oberon0Parser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT26=null;
        oberon0Parser.arraytype_return arraytype27 = null;

        oberon0Parser.recordtype_return recordtype28 = null;


        Object IDENT26_tree=null;

        try {
            // oberon0.g:17:2: ( IDENT | arraytype | recordtype )
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
                    // oberon0.g:17:4: IDENT
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT26=(Token)match(input,IDENT,FOLLOW_IDENT_in_type116); 
                    IDENT26_tree = (Object)adaptor.create(IDENT26);
                    adaptor.addChild(root_0, IDENT26_tree);


                    }
                    break;
                case 2 :
                    // oberon0.g:18:4: arraytype
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_arraytype_in_type121);
                    arraytype27=arraytype();

                    state._fsp--;

                    adaptor.addChild(root_0, arraytype27.getTree());

                    }
                    break;
                case 3 :
                    // oberon0.g:19:4: recordtype
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_recordtype_in_type126);
                    recordtype28=recordtype();

                    state._fsp--;

                    adaptor.addChild(root_0, recordtype28.getTree());

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
    // oberon0.g:22:1: arraytype : 'ARRAY' expression 'OF' type ;
    public final oberon0Parser.arraytype_return arraytype() throws RecognitionException {
        oberon0Parser.arraytype_return retval = new oberon0Parser.arraytype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal29=null;
        Token string_literal31=null;
        oberon0Parser.expression_return expression30 = null;

        oberon0Parser.type_return type32 = null;


        Object string_literal29_tree=null;
        Object string_literal31_tree=null;

        try {
            // oberon0.g:23:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:23:4: 'ARRAY' expression 'OF' type
            {
            root_0 = (Object)adaptor.nil();

            string_literal29=(Token)match(input,17,FOLLOW_17_in_arraytype137); 
            string_literal29_tree = (Object)adaptor.create(string_literal29);
            adaptor.addChild(root_0, string_literal29_tree);

            pushFollow(FOLLOW_expression_in_arraytype139);
            expression30=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression30.getTree());
            string_literal31=(Token)match(input,18,FOLLOW_18_in_arraytype141); 
            string_literal31_tree = (Object)adaptor.create(string_literal31);
            adaptor.addChild(root_0, string_literal31_tree);

            pushFollow(FOLLOW_type_in_arraytype143);
            type32=type();

            state._fsp--;

            adaptor.addChild(root_0, type32.getTree());

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
    // oberon0.g:26:1: expression : simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? ;
    public final oberon0Parser.expression_return expression() throws RecognitionException {
        oberon0Parser.expression_return retval = new oberon0Parser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set34=null;
        oberon0Parser.simpleexpression_return simpleexpression33 = null;

        oberon0Parser.simpleexpression_return simpleexpression35 = null;


        Object set34_tree=null;

        try {
            // oberon0.g:27:2: ( simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? )
            // oberon0.g:27:4: simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_simpleexpression_in_expression155);
            simpleexpression33=simpleexpression();

            state._fsp--;

            adaptor.addChild(root_0, simpleexpression33.getTree());
            // oberon0.g:27:21: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||(LA10_0>=19 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:27:22: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression
                    {
                    set34=(Token)input.LT(1);
                    if ( input.LA(1)==13||(input.LA(1)>=19 && input.LA(1)<=23) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set34));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression172);
                    simpleexpression35=simpleexpression();

                    state._fsp--;

                    adaptor.addChild(root_0, simpleexpression35.getTree());

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
    // oberon0.g:30:1: simpleexpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* ;
    public final oberon0Parser.simpleexpression_return simpleexpression() throws RecognitionException {
        oberon0Parser.simpleexpression_return retval = new oberon0Parser.simpleexpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set36=null;
        Token set38=null;
        oberon0Parser.term_return term37 = null;

        oberon0Parser.term_return term39 = null;


        Object set36_tree=null;
        Object set38_tree=null;

        try {
            // oberon0.g:31:2: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* )
            // oberon0.g:31:4: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )*
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:31:4: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=25)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // oberon0.g:
                    {
                    set36=(Token)input.LT(1);
                    if ( (input.LA(1)>=24 && input.LA(1)<=25) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set36));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleexpression193);
            term37=term();

            state._fsp--;

            adaptor.addChild(root_0, term37.getTree());
            // oberon0.g:31:20: ( ( '+' | '-' | 'OR' )? term )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=IDENT && LA13_0<=INTEGER)||(LA13_0>=24 && LA13_0<=26)||LA13_0==31||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // oberon0.g:31:21: ( '+' | '-' | 'OR' )? term
            	    {
            	    // oberon0.g:31:21: ( '+' | '-' | 'OR' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=24 && LA12_0<=26)) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // oberon0.g:
            	            {
            	            set38=(Token)input.LT(1);
            	            if ( (input.LA(1)>=24 && input.LA(1)<=26) ) {
            	                input.consume();
            	                adaptor.addChild(root_0, (Object)adaptor.create(set38));
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_simpleexpression205);
            	    term39=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term39.getTree());

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
    // oberon0.g:34:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final oberon0Parser.term_return term() throws RecognitionException {
        oberon0Parser.term_return retval = new oberon0Parser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set41=null;
        oberon0Parser.factor_return factor40 = null;

        oberon0Parser.factor_return factor42 = null;


        Object set41_tree=null;

        try {
            // oberon0.g:35:2: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            // oberon0.g:35:4: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term219);
            factor40=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor40.getTree());
            // oberon0.g:35:11: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=27 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // oberon0.g:35:12: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    set41=(Token)input.LT(1);
            	    if ( (input.LA(1)>=27 && input.LA(1)<=30) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set41));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term232);
            	    factor42=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor42.getTree());

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
    // oberon0.g:38:1: factor : ( IDENT selector | number | '(' expression ')' | '~' factor );
    public final oberon0Parser.factor_return factor() throws RecognitionException {
        oberon0Parser.factor_return retval = new oberon0Parser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT43=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token char_literal49=null;
        oberon0Parser.selector_return selector44 = null;

        oberon0Parser.number_return number45 = null;

        oberon0Parser.expression_return expression47 = null;

        oberon0Parser.factor_return factor50 = null;


        Object IDENT43_tree=null;
        Object char_literal46_tree=null;
        Object char_literal48_tree=null;
        Object char_literal49_tree=null;

        try {
            // oberon0.g:39:2: ( IDENT selector | number | '(' expression ')' | '~' factor )
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
                    // oberon0.g:39:4: IDENT selector
                    {
                    root_0 = (Object)adaptor.nil();

                    IDENT43=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor245); 
                    IDENT43_tree = (Object)adaptor.create(IDENT43);
                    adaptor.addChild(root_0, IDENT43_tree);

                    pushFollow(FOLLOW_selector_in_factor247);
                    selector44=selector();

                    state._fsp--;

                    adaptor.addChild(root_0, selector44.getTree());

                    }
                    break;
                case 2 :
                    // oberon0.g:40:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor252);
                    number45=number();

                    state._fsp--;

                    adaptor.addChild(root_0, number45.getTree());

                    }
                    break;
                case 3 :
                    // oberon0.g:41:4: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal46=(Token)match(input,31,FOLLOW_31_in_factor257); 
                    char_literal46_tree = (Object)adaptor.create(char_literal46);
                    adaptor.addChild(root_0, char_literal46_tree);

                    pushFollow(FOLLOW_expression_in_factor259);
                    expression47=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression47.getTree());
                    char_literal48=(Token)match(input,32,FOLLOW_32_in_factor261); 
                    char_literal48_tree = (Object)adaptor.create(char_literal48);
                    adaptor.addChild(root_0, char_literal48_tree);


                    }
                    break;
                case 4 :
                    // oberon0.g:42:4: '~' factor
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal49=(Token)match(input,33,FOLLOW_33_in_factor266); 
                    char_literal49_tree = (Object)adaptor.create(char_literal49);
                    adaptor.addChild(root_0, char_literal49_tree);

                    pushFollow(FOLLOW_factor_in_factor268);
                    factor50=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor50.getTree());

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
    // oberon0.g:45:1: number : INTEGER ;
    public final oberon0Parser.number_return number() throws RecognitionException {
        oberon0Parser.number_return retval = new oberon0Parser.number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INTEGER51=null;

        Object INTEGER51_tree=null;

        try {
            // oberon0.g:46:2: ( INTEGER )
            // oberon0.g:46:4: INTEGER
            {
            root_0 = (Object)adaptor.nil();

            INTEGER51=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number279); 
            INTEGER51_tree = (Object)adaptor.create(INTEGER51);
            adaptor.addChild(root_0, INTEGER51_tree);


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
    // oberon0.g:49:1: selector : ( '.' IDENT | '[' expression ']' )* ;
    public final oberon0Parser.selector_return selector() throws RecognitionException {
        oberon0Parser.selector_return retval = new oberon0Parser.selector_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal52=null;
        Token IDENT53=null;
        Token char_literal54=null;
        Token char_literal56=null;
        oberon0Parser.expression_return expression55 = null;


        Object char_literal52_tree=null;
        Object IDENT53_tree=null;
        Object char_literal54_tree=null;
        Object char_literal56_tree=null;

        try {
            // oberon0.g:50:2: ( ( '.' IDENT | '[' expression ']' )* )
            // oberon0.g:50:4: ( '.' IDENT | '[' expression ']' )*
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:50:4: ( '.' IDENT | '[' expression ']' )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11) ) {
                    alt16=1;
                }
                else if ( (LA16_0==34) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // oberon0.g:50:6: '.' IDENT
            	    {
            	    char_literal52=(Token)match(input,11,FOLLOW_11_in_selector293); 
            	    char_literal52_tree = (Object)adaptor.create(char_literal52);
            	    adaptor.addChild(root_0, char_literal52_tree);

            	    IDENT53=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector295); 
            	    IDENT53_tree = (Object)adaptor.create(IDENT53);
            	    adaptor.addChild(root_0, IDENT53_tree);


            	    }
            	    break;
            	case 2 :
            	    // oberon0.g:50:18: '[' expression ']'
            	    {
            	    char_literal54=(Token)match(input,34,FOLLOW_34_in_selector299); 
            	    char_literal54_tree = (Object)adaptor.create(char_literal54);
            	    adaptor.addChild(root_0, char_literal54_tree);

            	    pushFollow(FOLLOW_expression_in_selector301);
            	    expression55=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression55.getTree());
            	    char_literal56=(Token)match(input,35,FOLLOW_35_in_selector303); 
            	    char_literal56_tree = (Object)adaptor.create(char_literal56);
            	    adaptor.addChild(root_0, char_literal56_tree);


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
    // oberon0.g:53:1: recordtype : 'RECORD' fieldlist ( ';' fieldlist )* 'END' ;
    public final oberon0Parser.recordtype_return recordtype() throws RecognitionException {
        oberon0Parser.recordtype_return retval = new oberon0Parser.recordtype_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;
        Token char_literal59=null;
        Token string_literal61=null;
        oberon0Parser.fieldlist_return fieldlist58 = null;

        oberon0Parser.fieldlist_return fieldlist60 = null;


        Object string_literal57_tree=null;
        Object char_literal59_tree=null;
        Object string_literal61_tree=null;

        try {
            // oberon0.g:54:2: ( 'RECORD' fieldlist ( ';' fieldlist )* 'END' )
            // oberon0.g:54:4: 'RECORD' fieldlist ( ';' fieldlist )* 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal57=(Token)match(input,36,FOLLOW_36_in_recordtype317); 
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);

            pushFollow(FOLLOW_fieldlist_in_recordtype319);
            fieldlist58=fieldlist();

            state._fsp--;

            adaptor.addChild(root_0, fieldlist58.getTree());
            // oberon0.g:54:23: ( ';' fieldlist )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==8) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // oberon0.g:54:24: ';' fieldlist
            	    {
            	    char_literal59=(Token)match(input,8,FOLLOW_8_in_recordtype322); 
            	    char_literal59_tree = (Object)adaptor.create(char_literal59);
            	    adaptor.addChild(root_0, char_literal59_tree);

            	    pushFollow(FOLLOW_fieldlist_in_recordtype324);
            	    fieldlist60=fieldlist();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fieldlist60.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            string_literal61=(Token)match(input,10,FOLLOW_10_in_recordtype328); 
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
        return retval;
    }
    // $ANTLR end "recordtype"

    public static class fieldlist_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldlist"
    // oberon0.g:57:1: fieldlist : ( identlist ':' type )? ;
    public final oberon0Parser.fieldlist_return fieldlist() throws RecognitionException {
        oberon0Parser.fieldlist_return retval = new oberon0Parser.fieldlist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal63=null;
        oberon0Parser.identlist_return identlist62 = null;

        oberon0Parser.type_return type64 = null;


        Object char_literal63_tree=null;

        try {
            // oberon0.g:58:2: ( ( identlist ':' type )? )
            // oberon0.g:58:4: ( identlist ':' type )?
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:58:4: ( identlist ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // oberon0.g:58:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist341);
                    identlist62=identlist();

                    state._fsp--;

                    adaptor.addChild(root_0, identlist62.getTree());
                    char_literal63=(Token)match(input,16,FOLLOW_16_in_fieldlist343); 
                    char_literal63_tree = (Object)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);

                    pushFollow(FOLLOW_type_in_fieldlist345);
                    type64=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type64.getTree());

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
    // oberon0.g:61:1: identlist : IDENT ( ',' IDENT )* ;
    public final oberon0Parser.identlist_return identlist() throws RecognitionException {
        oberon0Parser.identlist_return retval = new oberon0Parser.identlist_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT65=null;
        Token char_literal66=null;
        Token IDENT67=null;

        Object IDENT65_tree=null;
        Object char_literal66_tree=null;
        Object IDENT67_tree=null;

        try {
            // oberon0.g:62:2: ( IDENT ( ',' IDENT )* )
            // oberon0.g:62:4: IDENT ( ',' IDENT )*
            {
            root_0 = (Object)adaptor.nil();

            IDENT65=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist359); 
            IDENT65_tree = (Object)adaptor.create(IDENT65);
            adaptor.addChild(root_0, IDENT65_tree);

            // oberon0.g:62:10: ( ',' IDENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // oberon0.g:62:11: ',' IDENT
            	    {
            	    char_literal66=(Token)match(input,37,FOLLOW_37_in_identlist362); 
            	    char_literal66_tree = (Object)adaptor.create(char_literal66);
            	    adaptor.addChild(root_0, char_literal66_tree);

            	    IDENT67=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist364); 
            	    IDENT67_tree = (Object)adaptor.create(IDENT67);
            	    adaptor.addChild(root_0, IDENT67_tree);


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
    // oberon0.g:65:1: statementsequence : statement ( ';' statement )* ;
    public final oberon0Parser.statementsequence_return statementsequence() throws RecognitionException {
        oberon0Parser.statementsequence_return retval = new oberon0Parser.statementsequence_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        oberon0Parser.statement_return statement68 = null;

        oberon0Parser.statement_return statement70 = null;


        Object char_literal69_tree=null;

        try {
            // oberon0.g:66:2: ( statement ( ';' statement )* )
            // oberon0.g:66:4: statement ( ';' statement )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_statement_in_statementsequence377);
            statement68=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement68.getTree());
            // oberon0.g:66:14: ( ';' statement )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==8) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // oberon0.g:66:16: ';' statement
            	    {
            	    char_literal69=(Token)match(input,8,FOLLOW_8_in_statementsequence381); 
            	    char_literal69_tree = (Object)adaptor.create(char_literal69);
            	    adaptor.addChild(root_0, char_literal69_tree);

            	    pushFollow(FOLLOW_statement_in_statementsequence383);
            	    statement70=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement70.getTree());

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
    // oberon0.g:69:1: statement : ( assProc | ifstatement | whilestatement )? ;
    public final oberon0Parser.statement_return statement() throws RecognitionException {
        oberon0Parser.statement_return retval = new oberon0Parser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        oberon0Parser.assProc_return assProc71 = null;

        oberon0Parser.ifstatement_return ifstatement72 = null;

        oberon0Parser.whilestatement_return whilestatement73 = null;



        try {
            // oberon0.g:70:2: ( ( assProc | ifstatement | whilestatement )? )
            // oberon0.g:70:4: ( assProc | ifstatement | whilestatement )?
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:70:4: ( assProc | ifstatement | whilestatement )?
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
                    // oberon0.g:70:6: assProc
                    {
                    pushFollow(FOLLOW_assProc_in_statement398);
                    assProc71=assProc();

                    state._fsp--;

                    adaptor.addChild(root_0, assProc71.getTree());

                    }
                    break;
                case 2 :
                    // oberon0.g:70:16: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement402);
                    ifstatement72=ifstatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifstatement72.getTree());

                    }
                    break;
                case 3 :
                    // oberon0.g:70:30: whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement406);
                    whilestatement73=whilestatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whilestatement73.getTree());

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
    // oberon0.g:73:1: assProc : IDENT selector ( assignment | procedurecall ) ;
    public final oberon0Parser.assProc_return assProc() throws RecognitionException {
        oberon0Parser.assProc_return retval = new oberon0Parser.assProc_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IDENT74=null;
        oberon0Parser.selector_return selector75 = null;

        oberon0Parser.assignment_return assignment76 = null;

        oberon0Parser.procedurecall_return procedurecall77 = null;


        Object IDENT74_tree=null;

        try {
            // oberon0.g:74:2: ( IDENT selector ( assignment | procedurecall ) )
            // oberon0.g:74:4: IDENT selector ( assignment | procedurecall )
            {
            root_0 = (Object)adaptor.nil();

            IDENT74=(Token)match(input,IDENT,FOLLOW_IDENT_in_assProc421); 
            IDENT74_tree = (Object)adaptor.create(IDENT74);
            adaptor.addChild(root_0, IDENT74_tree);

            pushFollow(FOLLOW_selector_in_assProc423);
            selector75=selector();

            state._fsp--;

            adaptor.addChild(root_0, selector75.getTree());
            // oberon0.g:74:19: ( assignment | procedurecall )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            else if ( (LA22_0==8||LA22_0==10||LA22_0==31||(LA22_0>=41 && LA22_0<=42)) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // oberon0.g:74:21: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_assProc427);
                    assignment76=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment76.getTree());

                    }
                    break;
                case 2 :
                    // oberon0.g:74:34: procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_assProc431);
                    procedurecall77=procedurecall();

                    state._fsp--;

                    adaptor.addChild(root_0, procedurecall77.getTree());

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
    // oberon0.g:77:1: assignment : ':=' expression ;
    public final oberon0Parser.assignment_return assignment() throws RecognitionException {
        oberon0Parser.assignment_return retval = new oberon0Parser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal78=null;
        oberon0Parser.expression_return expression79 = null;


        Object string_literal78_tree=null;

        try {
            // oberon0.g:78:2: ( ':=' expression )
            // oberon0.g:78:4: ':=' expression
            {
            root_0 = (Object)adaptor.nil();

            string_literal78=(Token)match(input,38,FOLLOW_38_in_assignment445); 
            string_literal78_tree = (Object)adaptor.create(string_literal78);
            adaptor.addChild(root_0, string_literal78_tree);

            pushFollow(FOLLOW_expression_in_assignment447);
            expression79=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression79.getTree());

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
    // oberon0.g:81:1: procedurecall : ( actualparameters )? ;
    public final oberon0Parser.procedurecall_return procedurecall() throws RecognitionException {
        oberon0Parser.procedurecall_return retval = new oberon0Parser.procedurecall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        oberon0Parser.actualparameters_return actualparameters80 = null;



        try {
            // oberon0.g:82:2: ( ( actualparameters )? )
            // oberon0.g:82:4: ( actualparameters )?
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:82:4: ( actualparameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // oberon0.g:82:5: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall460);
                    actualparameters80=actualparameters();

                    state._fsp--;

                    adaptor.addChild(root_0, actualparameters80.getTree());

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
    // oberon0.g:85:1: actualparameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final oberon0Parser.actualparameters_return actualparameters() throws RecognitionException {
        oberon0Parser.actualparameters_return retval = new oberon0Parser.actualparameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal81=null;
        Token char_literal83=null;
        Token char_literal85=null;
        oberon0Parser.expression_return expression82 = null;

        oberon0Parser.expression_return expression84 = null;


        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;

        try {
            // oberon0.g:86:2: ( '(' ( expression ( ',' expression )* )? ')' )
            // oberon0.g:86:4: '(' ( expression ( ',' expression )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal81=(Token)match(input,31,FOLLOW_31_in_actualparameters474); 
            char_literal81_tree = (Object)adaptor.create(char_literal81);
            adaptor.addChild(root_0, char_literal81_tree);

            // oberon0.g:86:8: ( expression ( ',' expression )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=IDENT && LA25_0<=INTEGER)||(LA25_0>=24 && LA25_0<=25)||LA25_0==31||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // oberon0.g:86:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters478);
                    expression82=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression82.getTree());
                    // oberon0.g:86:21: ( ',' expression )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==37) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // oberon0.g:86:23: ',' expression
                    	    {
                    	    char_literal83=(Token)match(input,37,FOLLOW_37_in_actualparameters482); 
                    	    char_literal83_tree = (Object)adaptor.create(char_literal83);
                    	    adaptor.addChild(root_0, char_literal83_tree);

                    	    pushFollow(FOLLOW_expression_in_actualparameters484);
                    	    expression84=expression();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, expression84.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal85=(Token)match(input,32,FOLLOW_32_in_actualparameters490); 
            char_literal85_tree = (Object)adaptor.create(char_literal85);
            adaptor.addChild(root_0, char_literal85_tree);


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
    // oberon0.g:89:1: ifstatement : 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' ;
    public final oberon0Parser.ifstatement_return ifstatement() throws RecognitionException {
        oberon0Parser.ifstatement_return retval = new oberon0Parser.ifstatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;
        Token string_literal88=null;
        Token string_literal90=null;
        Token string_literal92=null;
        Token string_literal94=null;
        Token string_literal96=null;
        oberon0Parser.expression_return expression87 = null;

        oberon0Parser.statementsequence_return statementsequence89 = null;

        oberon0Parser.expression_return expression91 = null;

        oberon0Parser.statementsequence_return statementsequence93 = null;

        oberon0Parser.statementsequence_return statementsequence95 = null;


        Object string_literal86_tree=null;
        Object string_literal88_tree=null;
        Object string_literal90_tree=null;
        Object string_literal92_tree=null;
        Object string_literal94_tree=null;
        Object string_literal96_tree=null;

        try {
            // oberon0.g:90:2: ( 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' )
            // oberon0.g:90:4: 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal86=(Token)match(input,39,FOLLOW_39_in_ifstatement502); 
            string_literal86_tree = (Object)adaptor.create(string_literal86);
            adaptor.addChild(root_0, string_literal86_tree);

            pushFollow(FOLLOW_expression_in_ifstatement504);
            expression87=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression87.getTree());
            string_literal88=(Token)match(input,40,FOLLOW_40_in_ifstatement506); 
            string_literal88_tree = (Object)adaptor.create(string_literal88);
            adaptor.addChild(root_0, string_literal88_tree);

            pushFollow(FOLLOW_statementsequence_in_ifstatement508);
            statementsequence89=statementsequence();

            state._fsp--;

            adaptor.addChild(root_0, statementsequence89.getTree());
            // oberon0.g:90:45: ( 'ELSIF' expression 'THEN' statementsequence )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // oberon0.g:90:47: 'ELSIF' expression 'THEN' statementsequence
            	    {
            	    string_literal90=(Token)match(input,41,FOLLOW_41_in_ifstatement512); 
            	    string_literal90_tree = (Object)adaptor.create(string_literal90);
            	    adaptor.addChild(root_0, string_literal90_tree);

            	    pushFollow(FOLLOW_expression_in_ifstatement514);
            	    expression91=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression91.getTree());
            	    string_literal92=(Token)match(input,40,FOLLOW_40_in_ifstatement516); 
            	    string_literal92_tree = (Object)adaptor.create(string_literal92);
            	    adaptor.addChild(root_0, string_literal92_tree);

            	    pushFollow(FOLLOW_statementsequence_in_ifstatement518);
            	    statementsequence93=statementsequence();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statementsequence93.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // oberon0.g:90:94: ( 'ELSE' statementsequence )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // oberon0.g:90:96: 'ELSE' statementsequence
                    {
                    string_literal94=(Token)match(input,42,FOLLOW_42_in_ifstatement525); 
                    string_literal94_tree = (Object)adaptor.create(string_literal94);
                    adaptor.addChild(root_0, string_literal94_tree);

                    pushFollow(FOLLOW_statementsequence_in_ifstatement527);
                    statementsequence95=statementsequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementsequence95.getTree());

                    }
                    break;

            }

            string_literal96=(Token)match(input,10,FOLLOW_10_in_ifstatement532); 
            string_literal96_tree = (Object)adaptor.create(string_literal96);
            adaptor.addChild(root_0, string_literal96_tree);


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
    // oberon0.g:93:1: whilestatement : 'WHILE' expression 'DO' statementsequence 'END' ;
    public final oberon0Parser.whilestatement_return whilestatement() throws RecognitionException {
        oberon0Parser.whilestatement_return retval = new oberon0Parser.whilestatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token string_literal99=null;
        Token string_literal101=null;
        oberon0Parser.expression_return expression98 = null;

        oberon0Parser.statementsequence_return statementsequence100 = null;


        Object string_literal97_tree=null;
        Object string_literal99_tree=null;
        Object string_literal101_tree=null;

        try {
            // oberon0.g:94:2: ( 'WHILE' expression 'DO' statementsequence 'END' )
            // oberon0.g:94:4: 'WHILE' expression 'DO' statementsequence 'END'
            {
            root_0 = (Object)adaptor.nil();

            string_literal97=(Token)match(input,43,FOLLOW_43_in_whilestatement544); 
            string_literal97_tree = (Object)adaptor.create(string_literal97);
            adaptor.addChild(root_0, string_literal97_tree);

            pushFollow(FOLLOW_expression_in_whilestatement546);
            expression98=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression98.getTree());
            string_literal99=(Token)match(input,44,FOLLOW_44_in_whilestatement548); 
            string_literal99_tree = (Object)adaptor.create(string_literal99);
            adaptor.addChild(root_0, string_literal99_tree);

            pushFollow(FOLLOW_statementsequence_in_whilestatement550);
            statementsequence100=statementsequence();

            state._fsp--;

            adaptor.addChild(root_0, statementsequence100.getTree());
            string_literal101=(Token)match(input,10,FOLLOW_10_in_whilestatement552); 
            string_literal101_tree = (Object)adaptor.create(string_literal101);
            adaptor.addChild(root_0, string_literal101_tree);


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
    // oberon0.g:97:1: proceduredeclaration : procedureheading ';' procedurebody ;
    public final oberon0Parser.proceduredeclaration_return proceduredeclaration() throws RecognitionException {
        oberon0Parser.proceduredeclaration_return retval = new oberon0Parser.proceduredeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal103=null;
        oberon0Parser.procedureheading_return procedureheading102 = null;

        oberon0Parser.procedurebody_return procedurebody104 = null;


        Object char_literal103_tree=null;

        try {
            // oberon0.g:98:2: ( procedureheading ';' procedurebody )
            // oberon0.g:98:4: procedureheading ';' procedurebody
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration564);
            procedureheading102=procedureheading();

            state._fsp--;

            adaptor.addChild(root_0, procedureheading102.getTree());
            char_literal103=(Token)match(input,8,FOLLOW_8_in_proceduredeclaration566); 
            char_literal103_tree = (Object)adaptor.create(char_literal103);
            adaptor.addChild(root_0, char_literal103_tree);

            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration568);
            procedurebody104=procedurebody();

            state._fsp--;

            adaptor.addChild(root_0, procedurebody104.getTree());

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
    // oberon0.g:101:1: procedureheading : 'PROCEDURE' IDENT ( formalparameters )? ;
    public final oberon0Parser.procedureheading_return procedureheading() throws RecognitionException {
        oberon0Parser.procedureheading_return retval = new oberon0Parser.procedureheading_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        Token IDENT106=null;
        oberon0Parser.formalparameters_return formalparameters107 = null;


        Object string_literal105_tree=null;
        Object IDENT106_tree=null;

        try {
            // oberon0.g:102:2: ( 'PROCEDURE' IDENT ( formalparameters )? )
            // oberon0.g:102:4: 'PROCEDURE' IDENT ( formalparameters )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal105=(Token)match(input,45,FOLLOW_45_in_procedureheading580); 
            string_literal105_tree = (Object)adaptor.create(string_literal105);
            adaptor.addChild(root_0, string_literal105_tree);

            IDENT106=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading582); 
            IDENT106_tree = (Object)adaptor.create(IDENT106);
            adaptor.addChild(root_0, IDENT106_tree);

            // oberon0.g:102:22: ( formalparameters )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // oberon0.g:102:23: formalparameters
                    {
                    pushFollow(FOLLOW_formalparameters_in_procedureheading585);
                    formalparameters107=formalparameters();

                    state._fsp--;

                    adaptor.addChild(root_0, formalparameters107.getTree());

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
    // oberon0.g:105:1: procedurebody : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final oberon0Parser.procedurebody_return procedurebody() throws RecognitionException {
        oberon0Parser.procedurebody_return retval = new oberon0Parser.procedurebody_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal109=null;
        Token string_literal111=null;
        Token IDENT112=null;
        oberon0Parser.declarations_return declarations108 = null;

        oberon0Parser.statementsequence_return statementsequence110 = null;


        Object string_literal109_tree=null;
        Object string_literal111_tree=null;
        Object IDENT112_tree=null;

        try {
            // oberon0.g:106:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:106:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declarations_in_procedurebody599);
            declarations108=declarations();

            state._fsp--;

            adaptor.addChild(root_0, declarations108.getTree());
            // oberon0.g:106:17: ( 'BEGIN' statementsequence )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==9) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // oberon0.g:106:18: 'BEGIN' statementsequence
                    {
                    string_literal109=(Token)match(input,9,FOLLOW_9_in_procedurebody602); 
                    string_literal109_tree = (Object)adaptor.create(string_literal109);
                    adaptor.addChild(root_0, string_literal109_tree);

                    pushFollow(FOLLOW_statementsequence_in_procedurebody604);
                    statementsequence110=statementsequence();

                    state._fsp--;

                    adaptor.addChild(root_0, statementsequence110.getTree());

                    }
                    break;

            }

            string_literal111=(Token)match(input,10,FOLLOW_10_in_procedurebody608); 
            string_literal111_tree = (Object)adaptor.create(string_literal111);
            adaptor.addChild(root_0, string_literal111_tree);

            IDENT112=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody610); 
            IDENT112_tree = (Object)adaptor.create(IDENT112);
            adaptor.addChild(root_0, IDENT112_tree);


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
    // oberon0.g:109:1: formalparameters : '(' ( fpsection ( ';' fpsection )* )? ')' ;
    public final oberon0Parser.formalparameters_return formalparameters() throws RecognitionException {
        oberon0Parser.formalparameters_return retval = new oberon0Parser.formalparameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal117=null;
        oberon0Parser.fpsection_return fpsection114 = null;

        oberon0Parser.fpsection_return fpsection116 = null;


        Object char_literal113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal117_tree=null;

        try {
            // oberon0.g:110:2: ( '(' ( fpsection ( ';' fpsection )* )? ')' )
            // oberon0.g:110:4: '(' ( fpsection ( ';' fpsection )* )? ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal113=(Token)match(input,31,FOLLOW_31_in_formalparameters622); 
            char_literal113_tree = (Object)adaptor.create(char_literal113);
            adaptor.addChild(root_0, char_literal113_tree);

            // oberon0.g:110:8: ( fpsection ( ';' fpsection )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT||LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // oberon0.g:110:9: fpsection ( ';' fpsection )*
                    {
                    pushFollow(FOLLOW_fpsection_in_formalparameters625);
                    fpsection114=fpsection();

                    state._fsp--;

                    adaptor.addChild(root_0, fpsection114.getTree());
                    // oberon0.g:110:19: ( ';' fpsection )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==8) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // oberon0.g:110:20: ';' fpsection
                    	    {
                    	    char_literal115=(Token)match(input,8,FOLLOW_8_in_formalparameters628); 
                    	    char_literal115_tree = (Object)adaptor.create(char_literal115);
                    	    adaptor.addChild(root_0, char_literal115_tree);

                    	    pushFollow(FOLLOW_fpsection_in_formalparameters630);
                    	    fpsection116=fpsection();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, fpsection116.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal117=(Token)match(input,32,FOLLOW_32_in_formalparameters636); 
            char_literal117_tree = (Object)adaptor.create(char_literal117);
            adaptor.addChild(root_0, char_literal117_tree);


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
    // oberon0.g:113:1: fpsection : ( 'VAR' )? identlist ':' type ;
    public final oberon0Parser.fpsection_return fpsection() throws RecognitionException {
        oberon0Parser.fpsection_return retval = new oberon0Parser.fpsection_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal118=null;
        Token char_literal120=null;
        oberon0Parser.identlist_return identlist119 = null;

        oberon0Parser.type_return type121 = null;


        Object string_literal118_tree=null;
        Object char_literal120_tree=null;

        try {
            // oberon0.g:114:2: ( ( 'VAR' )? identlist ':' type )
            // oberon0.g:114:4: ( 'VAR' )? identlist ':' type
            {
            root_0 = (Object)adaptor.nil();

            // oberon0.g:114:4: ( 'VAR' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // oberon0.g:114:5: 'VAR'
                    {
                    string_literal118=(Token)match(input,15,FOLLOW_15_in_fpsection648); 
                    string_literal118_tree = (Object)adaptor.create(string_literal118);
                    adaptor.addChild(root_0, string_literal118_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection652);
            identlist119=identlist();

            state._fsp--;

            adaptor.addChild(root_0, identlist119.getTree());
            char_literal120=(Token)match(input,16,FOLLOW_16_in_fpsection654); 
            char_literal120_tree = (Object)adaptor.create(char_literal120);
            adaptor.addChild(root_0, char_literal120_tree);

            pushFollow(FOLLOW_type_in_fpsection656);
            type121=type();

            state._fsp--;

            adaptor.addChild(root_0, type121.getTree());

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


 

    public static final BitSet FOLLOW_7_in_module23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module25 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module27 = new BitSet(new long[]{0x000020000000D600L});
    public static final BitSet FOLLOW_declarations_in_module29 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module32 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module34 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module38 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module40 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations57 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations59 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_declarations61 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations63 = new BitSet(new long[]{0x000020000000C012L});
    public static final BitSet FOLLOW_14_in_declarations70 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations73 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations75 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations77 = new BitSet(new long[]{0x0000200000008012L});
    public static final BitSet FOLLOW_15_in_declarations84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_declarations87 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_declarations89 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations91 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations93 = new BitSet(new long[]{0x0000200000000012L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declarations101 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations103 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_type116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arraytype137 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_arraytype139 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arraytype141 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_arraytype143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression155 = new BitSet(new long[]{0x0000000000F82002L});
    public static final BitSet FOLLOW_set_in_expression158 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression186 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_simpleexpression193 = new BitSet(new long[]{0x0000000287000032L});
    public static final BitSet FOLLOW_set_in_simpleexpression196 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_simpleexpression205 = new BitSet(new long[]{0x0000000287000032L});
    public static final BitSet FOLLOW_factor_in_term219 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term222 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_term232 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_IDENT_in_factor245 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_factor247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor257 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor259 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor266 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector295 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_34_in_selector299 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector301 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector303 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_36_in_recordtype317 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype319 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_recordtype322 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype324 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_recordtype328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist341 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldlist343 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fieldlist345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist359 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identlist362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlist364 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence377 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_statementsequence381 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_statementsequence383 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_assProc_in_statement398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assProc421 = new BitSet(new long[]{0x0000004480000800L});
    public static final BitSet FOLLOW_selector_in_assProc423 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_assignment_in_assProc427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_assProc431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_assignment445 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters474 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters478 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_37_in_actualparameters482 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters484 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement502 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement504 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement506 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement508 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_41_in_ifstatement512 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement514 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement516 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement518 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_42_in_ifstatement525 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement527 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement544 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement546 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement548 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement550 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration564 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration566 = new BitSet(new long[]{0x000020000000D600L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading582 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody599 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody602 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody604 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_formalparameters622 = new BitSet(new long[]{0x0000000100008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters625 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_8_in_formalparameters628 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters630 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_32_in_formalparameters636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fpsection648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection652 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fpsection654 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fpsection656 = new BitSet(new long[]{0x0000000000000002L});

}