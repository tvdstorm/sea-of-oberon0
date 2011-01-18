// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-18 10:57:55

  package parser;
  
  import ASTnodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'='", "'TYPE'", "'VAR'", "':'", "'ARRAY'", "'OF'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "'RECORD'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
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
        

    public String[] getTokenNames() { return oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "oberon0.g"; }



    // $ANTLR start "module"
    // oberon0.g:20:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // oberon0.g:21:2: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // oberon0.g:21:4: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module52); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module56); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module58); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module60);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:21:41: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // oberon0.g:21:42: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_module63); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_module65);
                    statementsequence2=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_module69); if (state.failed) return e;
            ind2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module73); if (state.failed) return e;
            match(input,11,FOLLOW_11_in_module75); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new ModuleNode( (ind1!=null?ind1.getText():null), (ind2!=null?ind2.getText():null), declarations1, statementsequence2 ); // also send the indent.text for error logging 
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "module"


    // $ANTLR start "declarations"
    // oberon0.g:27:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        try {
            // oberon0.g:28:2: ( ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* )
            // oberon0.g:28:4: ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )*
            {
            // oberon0.g:28:4: ( 'CONST' ( IDENT '=' expression ';' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // oberon0.g:28:5: 'CONST' ( IDENT '=' expression ';' )+
                    {
                    match(input,12,FOLLOW_12_in_declarations95); if (state.failed) return e;
                    // oberon0.g:28:13: ( IDENT '=' expression ';' )+
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
                    	    // oberon0.g:28:14: IDENT '=' expression ';'
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations98); if (state.failed) return e;
                    	    match(input,13,FOLLOW_13_in_declarations100); if (state.failed) return e;
                    	    pushFollow(FOLLOW_expression_in_declarations102);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,8,FOLLOW_8_in_declarations104); if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:43: ( 'TYPE' ( IDENT '=' type )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // oberon0.g:28:44: 'TYPE' ( IDENT '=' type )+
                    {
                    match(input,14,FOLLOW_14_in_declarations111); if (state.failed) return e;
                    // oberon0.g:28:51: ( IDENT '=' type )+
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
                    	    // oberon0.g:28:52: IDENT '=' type
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations114); if (state.failed) return e;
                    	    match(input,13,FOLLOW_13_in_declarations116); if (state.failed) return e;
                    	    pushFollow(FOLLOW_type_in_declarations118);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:71: ( 'VAR' ( identlist ':' type ';' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // oberon0.g:28:72: 'VAR' ( identlist ':' type ';' )+
                    {
                    match(input,15,FOLLOW_15_in_declarations125); if (state.failed) return e;
                    // oberon0.g:28:78: ( identlist ':' type ';' )+
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
                    	    // oberon0.g:28:79: identlist ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identlist_in_declarations128);
                    	    identlist();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,16,FOLLOW_16_in_declarations130); if (state.failed) return e;
                    	    pushFollow(FOLLOW_type_in_declarations132);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,8,FOLLOW_8_in_declarations134); if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:107: ( proceduredeclaration ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // oberon0.g:28:108: proceduredeclaration ';'
            	    {
            	    pushFollow(FOLLOW_proceduredeclaration_in_declarations142);
            	    proceduredeclaration();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    match(input,8,FOLLOW_8_in_declarations144); if (state.failed) return e;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              	  e = new DeclarationsNode();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "declarations"


    // $ANTLR start "type"
    // oberon0.g:34:1: type : ( IDENT | arraytype | recordtype );
    public final void type() throws RecognitionException {
        try {
            // oberon0.g:35:2: ( IDENT | arraytype | recordtype )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // oberon0.g:35:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_type160); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // oberon0.g:36:4: arraytype
                    {
                    pushFollow(FOLLOW_arraytype_in_type165);
                    arraytype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // oberon0.g:37:4: recordtype
                    {
                    pushFollow(FOLLOW_recordtype_in_type170);
                    recordtype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "arraytype"
    // oberon0.g:40:1: arraytype : 'ARRAY' expression 'OF' type ;
    public final void arraytype() throws RecognitionException {
        try {
            // oberon0.g:41:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:41:4: 'ARRAY' expression 'OF' type
            {
            match(input,17,FOLLOW_17_in_arraytype181); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_arraytype183);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,18,FOLLOW_18_in_arraytype185); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_arraytype187);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arraytype"

    public static class expression_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "expression"
    // oberon0.g:44:1: expression : simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? ;
    public final oberon0Parser.expression_return expression() throws RecognitionException {
        oberon0Parser.expression_return retval = new oberon0Parser.expression_return();
        retval.start = input.LT(1);

        try {
            // oberon0.g:45:2: ( simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? )
            // oberon0.g:45:4: simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression199);
            simpleexpression();

            state._fsp--;
            if (state.failed) return retval;
            // oberon0.g:45:21: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||(LA10_0>=19 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:45:22: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression
                    {
                    if ( input.LA(1)==13||(input.LA(1)>=19 && input.LA(1)<=23) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression216);
                    simpleexpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"


    // $ANTLR start "simpleexpression"
    // oberon0.g:48:1: simpleexpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* ;
    public final void simpleexpression() throws RecognitionException {
        try {
            // oberon0.g:49:2: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* )
            // oberon0.g:49:4: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )*
            {
            // oberon0.g:49:4: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=25)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // oberon0.g:
                    {
                    if ( (input.LA(1)>=24 && input.LA(1)<=25) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleexpression237);
            term();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:49:20: ( ( '+' | '-' | 'OR' )? term )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=IDENT && LA13_0<=INTEGER)||(LA13_0>=24 && LA13_0<=26)||LA13_0==31||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // oberon0.g:49:21: ( '+' | '-' | 'OR' )? term
            	    {
            	    // oberon0.g:49:21: ( '+' | '-' | 'OR' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( ((LA12_0>=24 && LA12_0<=26)) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // oberon0.g:
            	            {
            	            if ( (input.LA(1)>=24 && input.LA(1)<=26) ) {
            	                input.consume();
            	                state.errorRecovery=false;state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_simpleexpression249);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "simpleexpression"


    // $ANTLR start "term"
    // oberon0.g:52:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // oberon0.g:53:2: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            // oberon0.g:53:4: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term263);
            factor();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:53:11: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=27 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // oberon0.g:53:12: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    if ( (input.LA(1)>=27 && input.LA(1)<=30) ) {
            	        input.consume();
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term276);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // oberon0.g:56:1: factor : ( IDENT selector | number | '(' expression ')' | '~' factor );
    public final void factor() throws RecognitionException {
        try {
            // oberon0.g:57:2: ( IDENT selector | number | '(' expression ')' | '~' factor )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // oberon0.g:57:4: IDENT selector
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_factor289); if (state.failed) return ;
                    pushFollow(FOLLOW_selector_in_factor291);
                    selector();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // oberon0.g:58:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor296);
                    number();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // oberon0.g:59:4: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor301); if (state.failed) return ;
                    pushFollow(FOLLOW_expression_in_factor303);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,32,FOLLOW_32_in_factor305); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // oberon0.g:60:4: '~' factor
                    {
                    match(input,33,FOLLOW_33_in_factor310); if (state.failed) return ;
                    pushFollow(FOLLOW_factor_in_factor312);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "factor"


    // $ANTLR start "number"
    // oberon0.g:63:1: number returns [ IntegerNode e ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode e = null;

        Token INTEGER3=null;

        try {
            // oberon0.g:64:2: ( INTEGER )
            // oberon0.g:64:4: INTEGER
            {
            INTEGER3=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number327); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	   e = new IntegerNode( Integer.parseInt( (INTEGER3!=null?INTEGER3.getText():null) ) );
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "number"


    // $ANTLR start "selector"
    // oberon0.g:70:1: selector : ( '.' IDENT | '[' expression ']' )* ;
    public final void selector() throws RecognitionException {
        try {
            // oberon0.g:71:2: ( ( '.' IDENT | '[' expression ']' )* )
            // oberon0.g:71:4: ( '.' IDENT | '[' expression ']' )*
            {
            // oberon0.g:71:4: ( '.' IDENT | '[' expression ']' )*
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
            	    // oberon0.g:71:6: '.' IDENT
            	    {
            	    match(input,11,FOLLOW_11_in_selector345); if (state.failed) return ;
            	    match(input,IDENT,FOLLOW_IDENT_in_selector347); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // oberon0.g:71:18: '[' expression ']'
            	    {
            	    match(input,34,FOLLOW_34_in_selector351); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_selector353);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,35,FOLLOW_35_in_selector355); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "selector"


    // $ANTLR start "recordtype"
    // oberon0.g:74:1: recordtype : 'RECORD' fieldlist ( ';' fieldlist )* 'END' ;
    public final void recordtype() throws RecognitionException {
        try {
            // oberon0.g:75:2: ( 'RECORD' fieldlist ( ';' fieldlist )* 'END' )
            // oberon0.g:75:4: 'RECORD' fieldlist ( ';' fieldlist )* 'END'
            {
            match(input,36,FOLLOW_36_in_recordtype369); if (state.failed) return ;
            pushFollow(FOLLOW_fieldlist_in_recordtype371);
            fieldlist();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:75:23: ( ';' fieldlist )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==8) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // oberon0.g:75:24: ';' fieldlist
            	    {
            	    match(input,8,FOLLOW_8_in_recordtype374); if (state.failed) return ;
            	    pushFollow(FOLLOW_fieldlist_in_recordtype376);
            	    fieldlist();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_recordtype380); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "recordtype"


    // $ANTLR start "fieldlist"
    // oberon0.g:78:1: fieldlist : ( identlist ':' type )? ;
    public final void fieldlist() throws RecognitionException {
        try {
            // oberon0.g:79:2: ( ( identlist ':' type )? )
            // oberon0.g:79:4: ( identlist ':' type )?
            {
            // oberon0.g:79:4: ( identlist ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // oberon0.g:79:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist393);
                    identlist();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_fieldlist395); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_fieldlist397);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fieldlist"


    // $ANTLR start "identlist"
    // oberon0.g:82:1: identlist : IDENT ( ',' IDENT )* ;
    public final void identlist() throws RecognitionException {
        try {
            // oberon0.g:83:2: ( IDENT ( ',' IDENT )* )
            // oberon0.g:83:4: IDENT ( ',' IDENT )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_identlist411); if (state.failed) return ;
            // oberon0.g:83:10: ( ',' IDENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // oberon0.g:83:11: ',' IDENT
            	    {
            	    match(input,37,FOLLOW_37_in_identlist414); if (state.failed) return ;
            	    match(input,IDENT,FOLLOW_IDENT_in_identlist416); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "identlist"


    // $ANTLR start "statementsequence"
    // oberon0.g:86:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement4 = null;


        try {
            // oberon0.g:87:2: ( statement (followOne= followupStatementSequence )? )
            // oberon0.g:87:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence433);
            statement4=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:87:14: (followOne= followupStatementSequence )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==8) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // oberon0.g:87:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence439);
                    followOne=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement4, followOne );
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "statementsequence"


    // $ANTLR start "followupStatementSequence"
    // oberon0.g:93:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement5 = null;


        try {
            // oberon0.g:94:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // oberon0.g:94:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence460); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence462);
            statement5=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:94:18: (followTwo= followupStatementSequence )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==8) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // oberon0.g:94:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence468);
                    followTwo=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement5, followTwo );
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "followupStatementSequence"


    // $ANTLR start "statement"
    // oberon0.g:100:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // oberon0.g:101:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? )
            // oberon0.g:101:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            {
            // oberon0.g:101:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            int alt22=5;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // oberon0.g:101:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement492);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // oberon0.g:101:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement498);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // oberon0.g:101:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement504);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // oberon0.g:101:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement510);
                    statementRv=whilestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = statementRv;
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "statement"


    // $ANTLR start "assignment"
    // oberon0.g:107:1: assignment returns [ StatementNode e ] : IDENT selector ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        Token IDENT6=null;
        oberon0Parser.expression_return expression7 = null;


        try {
            // oberon0.g:108:2: ( IDENT selector ':=' expression )
            // oberon0.g:108:4: IDENT selector ':=' expression
            {
            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment532); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_assignment534);
            selector();

            state._fsp--;
            if (state.failed) return e;
            match(input,38,FOLLOW_38_in_assignment536); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment538);
            expression7=expression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new AssignmentNode( (IDENT6!=null?IDENT6.getText():null), (expression7!=null?input.toString(expression7.start,expression7.stop):null) );
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "procedurecall"
    // oberon0.g:114:1: procedurecall returns [ StatementNode e ] : IDENT selector ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        try {
            // oberon0.g:115:2: ( IDENT selector ( actualparameters )? )
            // oberon0.g:115:4: IDENT selector ( actualparameters )?
            {
            match(input,IDENT,FOLLOW_IDENT_in_procedurecall557); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_procedurecall559);
            selector();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:115:19: ( actualparameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // oberon0.g:115:20: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall562);
                    actualparameters();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ProcedureCallNode();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedurecall"


    // $ANTLR start "actualparameters"
    // oberon0.g:121:1: actualparameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final void actualparameters() throws RecognitionException {
        try {
            // oberon0.g:122:2: ( '(' ( expression ( ',' expression )* )? ')' )
            // oberon0.g:122:4: '(' ( expression ( ',' expression )* )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters579); if (state.failed) return ;
            // oberon0.g:122:8: ( expression ( ',' expression )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=IDENT && LA25_0<=INTEGER)||(LA25_0>=24 && LA25_0<=25)||LA25_0==31||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // oberon0.g:122:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters583);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    // oberon0.g:122:21: ( ',' expression )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==37) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // oberon0.g:122:23: ',' expression
                    	    {
                    	    match(input,37,FOLLOW_37_in_actualparameters587); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expression_in_actualparameters589);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters595); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "actualparameters"


    // $ANTLR start "ifstatement"
    // oberon0.g:125:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        try {
            // oberon0.g:126:2: ( 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' )
            // oberon0.g:126:4: 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement611); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement613);
            expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_ifstatement615); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement617);
            statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:126:45: ( 'ELSIF' expression 'THEN' statementsequence )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // oberon0.g:126:47: 'ELSIF' expression 'THEN' statementsequence
            	    {
            	    match(input,41,FOLLOW_41_in_ifstatement621); if (state.failed) return e;
            	    pushFollow(FOLLOW_expression_in_ifstatement623);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    match(input,40,FOLLOW_40_in_ifstatement625); if (state.failed) return e;
            	    pushFollow(FOLLOW_statementsequence_in_ifstatement627);
            	    statementsequence();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // oberon0.g:126:94: ( 'ELSE' statementsequence )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // oberon0.g:126:96: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_ifstatement634); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_ifstatement636);
                    statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement641); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new IfStatementNode( );
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "ifstatement"


    // $ANTLR start "whilestatement"
    // oberon0.g:132:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        oberon0Parser.expression_return cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // oberon0.g:133:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // oberon0.g:133:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement660); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement664);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,44,FOLLOW_44_in_whilestatement666); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement670);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement672); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new WhileStatementNode( (cond!=null?input.toString(cond.start,cond.stop):null), ifTrueDo );
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "whilestatement"


    // $ANTLR start "proceduredeclaration"
    // oberon0.g:139:1: proceduredeclaration : procedureheading ';' procedurebody ;
    public final void proceduredeclaration() throws RecognitionException {
        try {
            // oberon0.g:140:2: ( procedureheading ';' procedurebody )
            // oberon0.g:140:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration687);
            procedureheading();

            state._fsp--;
            if (state.failed) return ;
            match(input,8,FOLLOW_8_in_proceduredeclaration689); if (state.failed) return ;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration691);
            procedurebody();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "proceduredeclaration"


    // $ANTLR start "procedureheading"
    // oberon0.g:143:1: procedureheading : 'PROCEDURE' IDENT ( formalparameters )? ;
    public final void procedureheading() throws RecognitionException {
        try {
            // oberon0.g:144:2: ( 'PROCEDURE' IDENT ( formalparameters )? )
            // oberon0.g:144:4: 'PROCEDURE' IDENT ( formalparameters )?
            {
            match(input,45,FOLLOW_45_in_procedureheading703); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedureheading705); if (state.failed) return ;
            // oberon0.g:144:22: ( formalparameters )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // oberon0.g:144:23: formalparameters
                    {
                    pushFollow(FOLLOW_formalparameters_in_procedureheading708);
                    formalparameters();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedureheading"


    // $ANTLR start "procedurebody"
    // oberon0.g:147:1: procedurebody : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final void procedurebody() throws RecognitionException {
        try {
            // oberon0.g:148:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:148:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody722);
            declarations();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:148:17: ( 'BEGIN' statementsequence )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==9) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // oberon0.g:148:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody725); if (state.failed) return ;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody727);
                    statementsequence();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody731); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedurebody733); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedurebody"


    // $ANTLR start "formalparameters"
    // oberon0.g:151:1: formalparameters : '(' ( fpsection ( ';' fpsection )* )? ')' ;
    public final void formalparameters() throws RecognitionException {
        try {
            // oberon0.g:152:2: ( '(' ( fpsection ( ';' fpsection )* )? ')' )
            // oberon0.g:152:4: '(' ( fpsection ( ';' fpsection )* )? ')'
            {
            match(input,31,FOLLOW_31_in_formalparameters745); if (state.failed) return ;
            // oberon0.g:152:8: ( fpsection ( ';' fpsection )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT||LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // oberon0.g:152:9: fpsection ( ';' fpsection )*
                    {
                    pushFollow(FOLLOW_fpsection_in_formalparameters748);
                    fpsection();

                    state._fsp--;
                    if (state.failed) return ;
                    // oberon0.g:152:19: ( ';' fpsection )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==8) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // oberon0.g:152:20: ';' fpsection
                    	    {
                    	    match(input,8,FOLLOW_8_in_formalparameters751); if (state.failed) return ;
                    	    pushFollow(FOLLOW_fpsection_in_formalparameters753);
                    	    fpsection();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_formalparameters759); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formalparameters"


    // $ANTLR start "fpsection"
    // oberon0.g:155:1: fpsection : ( 'VAR' )? identlist ':' type ;
    public final void fpsection() throws RecognitionException {
        try {
            // oberon0.g:156:2: ( ( 'VAR' )? identlist ':' type )
            // oberon0.g:156:4: ( 'VAR' )? identlist ':' type
            {
            // oberon0.g:156:4: ( 'VAR' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // oberon0.g:156:5: 'VAR'
                    {
                    match(input,15,FOLLOW_15_in_fpsection771); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection775);
            identlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,16,FOLLOW_16_in_fpsection777); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_fpsection779);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fpsection"

    // $ANTLR start synpred37_oberon0
    public final void synpred37_oberon0_fragment() throws RecognitionException {   
        StatementNode statementRv = null;


        // oberon0.g:101:6: (statementRv= assignment )
        // oberon0.g:101:6: statementRv= assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred37_oberon0492);
        statementRv=assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_oberon0

    // $ANTLR start synpred38_oberon0
    public final void synpred38_oberon0_fragment() throws RecognitionException {   
        StatementNode statementRv = null;


        // oberon0.g:101:31: (statementRv= procedurecall )
        // oberon0.g:101:31: statementRv= procedurecall
        {
        pushFollow(FOLLOW_procedurecall_in_synpred38_oberon0498);
        statementRv=procedurecall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_oberon0

    // Delegated rules

    public final boolean synpred38_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\1\4\12\uffff";
    static final String DFA22_minS =
        "\1\4\1\0\11\uffff";
    static final String DFA22_maxS =
        "\1\53\1\0\11\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA22_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\3\uffff\1\4\1\uffff\1\4\34\uffff\1\2\1\uffff\2\4\1\3",
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "101:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_1 = input.LA(1);

                         
                        int index22_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred37_oberon0()) ) {s = 9;}

                        else if ( (synpred38_oberon0()) ) {s = 10;}

                         
                        input.seek(index22_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_7_in_module52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module56 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module58 = new BitSet(new long[]{0x000020000000D600L});
    public static final BitSet FOLLOW_declarations_in_module60 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module63 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module65 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations98 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations100 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_declarations102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations104 = new BitSet(new long[]{0x000020000000C012L});
    public static final BitSet FOLLOW_14_in_declarations111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations116 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations118 = new BitSet(new long[]{0x0000200000008012L});
    public static final BitSet FOLLOW_15_in_declarations125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_declarations128 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_declarations130 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations132 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations134 = new BitSet(new long[]{0x0000200000000012L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declarations142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations144 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_type160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arraytype181 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_arraytype183 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arraytype185 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_arraytype187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression199 = new BitSet(new long[]{0x0000000000F82002L});
    public static final BitSet FOLLOW_set_in_expression202 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression230 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_simpleexpression237 = new BitSet(new long[]{0x0000000287000032L});
    public static final BitSet FOLLOW_set_in_simpleexpression240 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_simpleexpression249 = new BitSet(new long[]{0x0000000287000032L});
    public static final BitSet FOLLOW_factor_in_term263 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term266 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_term276 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_IDENT_in_factor289 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_factor291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor301 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor303 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor310 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector347 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_34_in_selector351 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector353 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector355 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_36_in_recordtype369 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype371 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_recordtype374 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype376 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_recordtype380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist393 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldlist395 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fieldlist397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist411 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identlist414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlist416 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence433 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence460 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence462 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment532 = new BitSet(new long[]{0x0000004400000800L});
    public static final BitSet FOLLOW_selector_in_assignment534 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment536 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall557 = new BitSet(new long[]{0x0000000480000800L});
    public static final BitSet FOLLOW_selector_in_procedurecall559 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters579 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters583 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_37_in_actualparameters587 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters589 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement611 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement613 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement615 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement617 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_41_in_ifstatement621 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement623 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement625 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement627 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_42_in_ifstatement634 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement636 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement660 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement664 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement666 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement670 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration687 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration689 = new BitSet(new long[]{0x000020000000D600L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading705 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody722 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody725 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody727 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody731 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_formalparameters745 = new BitSet(new long[]{0x0000000100008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters748 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_8_in_formalparameters751 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters753 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_32_in_formalparameters759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fpsection771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection775 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fpsection777 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fpsection779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred37_oberon0492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_synpred38_oberon0498 = new BitSet(new long[]{0x0000000000000002L});

}