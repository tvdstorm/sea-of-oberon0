// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-17 11:22:57

  package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE'", "';'", "'.'", "'BEGIN'", "'END'", "'CONST'", "'='", "'TYPE'", "'VAR'", "':'", "'ARRAY'", "'OF'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "'RECORD'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
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
    // oberon0.g:17:1: module : 'MODULE' IDENT ';' modulebody IDENT '.' ;
    public final void module() throws RecognitionException {
        try {
            // oberon0.g:18:2: ( 'MODULE' IDENT ';' modulebody IDENT '.' )
            // oberon0.g:18:4: 'MODULE' IDENT ';' modulebody IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module39); 
            match(input,IDENT,FOLLOW_IDENT_in_module41); 
            match(input,8,FOLLOW_8_in_module43); 
            pushFollow(FOLLOW_modulebody_in_module45);
            modulebody();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_module47); 
            match(input,9,FOLLOW_9_in_module49); 

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
    // $ANTLR end "module"


    // $ANTLR start "modulebody"
    // oberon0.g:21:1: modulebody : declarations ( 'BEGIN' statementsequence )? 'END' ;
    public final void modulebody() throws RecognitionException {
        try {
            // oberon0.g:22:3: ( declarations ( 'BEGIN' statementsequence )? 'END' )
            // oberon0.g:22:5: declarations ( 'BEGIN' statementsequence )? 'END'
            {
            pushFollow(FOLLOW_declarations_in_modulebody62);
            declarations();

            state._fsp--;

            // oberon0.g:22:18: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==10) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // oberon0.g:22:19: 'BEGIN' statementsequence
                    {
                    match(input,10,FOLLOW_10_in_modulebody65); 
                    pushFollow(FOLLOW_statementsequence_in_modulebody67);
                    statementsequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_modulebody71); 

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
    // $ANTLR end "modulebody"


    // $ANTLR start "declarations"
    // oberon0.g:25:1: declarations : ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* ;
    public final void declarations() throws RecognitionException {
        try {
            // oberon0.g:26:2: ( ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* )
            // oberon0.g:26:4: ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )*
            {
            // oberon0.g:26:4: ( 'CONST' ( IDENT '=' expression ';' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // oberon0.g:26:5: 'CONST' ( IDENT '=' expression ';' )+
                    {
                    match(input,12,FOLLOW_12_in_declarations84); 
                    // oberon0.g:26:13: ( IDENT '=' expression ';' )+
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
                    	    // oberon0.g:26:14: IDENT '=' expression ';'
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations87); 
                    	    match(input,13,FOLLOW_13_in_declarations89); 
                    	    pushFollow(FOLLOW_expression_in_declarations91);
                    	    expression();

                    	    state._fsp--;

                    	    match(input,8,FOLLOW_8_in_declarations93); 

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

            // oberon0.g:26:43: ( 'TYPE' ( IDENT '=' type )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // oberon0.g:26:44: 'TYPE' ( IDENT '=' type )+
                    {
                    match(input,14,FOLLOW_14_in_declarations100); 
                    // oberon0.g:26:51: ( IDENT '=' type )+
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
                    	    // oberon0.g:26:52: IDENT '=' type
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations103); 
                    	    match(input,13,FOLLOW_13_in_declarations105); 
                    	    pushFollow(FOLLOW_type_in_declarations107);
                    	    type();

                    	    state._fsp--;


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

            // oberon0.g:26:71: ( 'VAR' ( identlist ':' type ';' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // oberon0.g:26:72: 'VAR' ( identlist ':' type ';' )+
                    {
                    match(input,15,FOLLOW_15_in_declarations114); 
                    // oberon0.g:26:78: ( identlist ':' type ';' )+
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
                    	    // oberon0.g:26:79: identlist ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identlist_in_declarations117);
                    	    identlist();

                    	    state._fsp--;

                    	    match(input,16,FOLLOW_16_in_declarations119); 
                    	    pushFollow(FOLLOW_type_in_declarations121);
                    	    type();

                    	    state._fsp--;

                    	    match(input,8,FOLLOW_8_in_declarations123); 

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

            // oberon0.g:26:107: ( proceduredeclaration ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // oberon0.g:26:108: proceduredeclaration ';'
            	    {
            	    pushFollow(FOLLOW_proceduredeclaration_in_declarations131);
            	    proceduredeclaration();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_declarations133); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "declarations"


    // $ANTLR start "type"
    // oberon0.g:29:1: type : ( IDENT | arraytype | recordtype );
    public final void type() throws RecognitionException {
        try {
            // oberon0.g:30:2: ( IDENT | arraytype | recordtype )
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
                    // oberon0.g:30:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_type146); 

                    }
                    break;
                case 2 :
                    // oberon0.g:31:4: arraytype
                    {
                    pushFollow(FOLLOW_arraytype_in_type151);
                    arraytype();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // oberon0.g:32:4: recordtype
                    {
                    pushFollow(FOLLOW_recordtype_in_type156);
                    recordtype();

                    state._fsp--;


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
    // oberon0.g:35:1: arraytype : 'ARRAY' expression 'OF' type ;
    public final void arraytype() throws RecognitionException {
        try {
            // oberon0.g:36:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:36:4: 'ARRAY' expression 'OF' type
            {
            match(input,17,FOLLOW_17_in_arraytype167); 
            pushFollow(FOLLOW_expression_in_arraytype169);
            expression();

            state._fsp--;

            match(input,18,FOLLOW_18_in_arraytype171); 
            pushFollow(FOLLOW_type_in_arraytype173);
            type();

            state._fsp--;


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


    // $ANTLR start "expression"
    // oberon0.g:39:1: expression : simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? ;
    public final void expression() throws RecognitionException {
        try {
            // oberon0.g:40:2: ( simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )? )
            // oberon0.g:40:4: simpleexpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression185);
            simpleexpression();

            state._fsp--;

            // oberon0.g:40:21: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||(LA10_0>=19 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:40:22: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleexpression
                    {
                    if ( input.LA(1)==13||(input.LA(1)>=19 && input.LA(1)<=23) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression202);
                    simpleexpression();

                    state._fsp--;


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
    // $ANTLR end "expression"


    // $ANTLR start "simpleexpression"
    // oberon0.g:43:1: simpleexpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* ;
    public final void simpleexpression() throws RecognitionException {
        try {
            // oberon0.g:44:2: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )* )
            // oberon0.g:44:4: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' )? term )*
            {
            // oberon0.g:44:4: ( '+' | '-' )?
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
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleexpression223);
            term();

            state._fsp--;

            // oberon0.g:44:20: ( ( '+' | '-' | 'OR' )? term )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=IDENT && LA13_0<=INTEGER)||(LA13_0>=24 && LA13_0<=26)||LA13_0==31||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // oberon0.g:44:21: ( '+' | '-' | 'OR' )? term
            	    {
            	    // oberon0.g:44:21: ( '+' | '-' | 'OR' )?
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
            	                state.errorRecovery=false;
            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                throw mse;
            	            }


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_simpleexpression235);
            	    term();

            	    state._fsp--;


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
    // oberon0.g:47:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // oberon0.g:48:2: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            // oberon0.g:48:4: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term249);
            factor();

            state._fsp--;

            // oberon0.g:48:11: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=27 && LA14_0<=30)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // oberon0.g:48:12: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    if ( (input.LA(1)>=27 && input.LA(1)<=30) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term262);
            	    factor();

            	    state._fsp--;


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
    // oberon0.g:51:1: factor : ( IDENT selector | number | '(' expression ')' | '~' factor );
    public final void factor() throws RecognitionException {
        try {
            // oberon0.g:52:2: ( IDENT selector | number | '(' expression ')' | '~' factor )
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
                    // oberon0.g:52:4: IDENT selector
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_factor275); 
                    pushFollow(FOLLOW_selector_in_factor277);
                    selector();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // oberon0.g:53:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor282);
                    number();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // oberon0.g:54:4: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor287); 
                    pushFollow(FOLLOW_expression_in_factor289);
                    expression();

                    state._fsp--;

                    match(input,32,FOLLOW_32_in_factor291); 

                    }
                    break;
                case 4 :
                    // oberon0.g:55:4: '~' factor
                    {
                    match(input,33,FOLLOW_33_in_factor296); 
                    pushFollow(FOLLOW_factor_in_factor298);
                    factor();

                    state._fsp--;


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
    // oberon0.g:58:1: number : INTEGER ;
    public final void number() throws RecognitionException {
        try {
            // oberon0.g:59:2: ( INTEGER )
            // oberon0.g:59:4: INTEGER
            {
            match(input,INTEGER,FOLLOW_INTEGER_in_number309); 

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
    // $ANTLR end "number"


    // $ANTLR start "selector"
    // oberon0.g:62:1: selector : ( '.' IDENT | '[' expression ']' )* ;
    public final void selector() throws RecognitionException {
        try {
            // oberon0.g:63:2: ( ( '.' IDENT | '[' expression ']' )* )
            // oberon0.g:63:4: ( '.' IDENT | '[' expression ']' )*
            {
            // oberon0.g:63:4: ( '.' IDENT | '[' expression ']' )*
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
            	    // oberon0.g:63:6: '.' IDENT
            	    {
            	    match(input,9,FOLLOW_9_in_selector323); 
            	    match(input,IDENT,FOLLOW_IDENT_in_selector325); 

            	    }
            	    break;
            	case 2 :
            	    // oberon0.g:63:18: '[' expression ']'
            	    {
            	    match(input,34,FOLLOW_34_in_selector329); 
            	    pushFollow(FOLLOW_expression_in_selector331);
            	    expression();

            	    state._fsp--;

            	    match(input,35,FOLLOW_35_in_selector333); 

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
    // oberon0.g:66:1: recordtype : 'RECORD' fieldlist ( ';' fieldlist )* 'END' ;
    public final void recordtype() throws RecognitionException {
        try {
            // oberon0.g:67:2: ( 'RECORD' fieldlist ( ';' fieldlist )* 'END' )
            // oberon0.g:67:4: 'RECORD' fieldlist ( ';' fieldlist )* 'END'
            {
            match(input,36,FOLLOW_36_in_recordtype347); 
            pushFollow(FOLLOW_fieldlist_in_recordtype349);
            fieldlist();

            state._fsp--;

            // oberon0.g:67:23: ( ';' fieldlist )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==8) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // oberon0.g:67:24: ';' fieldlist
            	    {
            	    match(input,8,FOLLOW_8_in_recordtype352); 
            	    pushFollow(FOLLOW_fieldlist_in_recordtype354);
            	    fieldlist();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_recordtype358); 

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
    // oberon0.g:70:1: fieldlist : ( identlist ':' type )? ;
    public final void fieldlist() throws RecognitionException {
        try {
            // oberon0.g:71:2: ( ( identlist ':' type )? )
            // oberon0.g:71:4: ( identlist ':' type )?
            {
            // oberon0.g:71:4: ( identlist ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // oberon0.g:71:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist371);
                    identlist();

                    state._fsp--;

                    match(input,16,FOLLOW_16_in_fieldlist373); 
                    pushFollow(FOLLOW_type_in_fieldlist375);
                    type();

                    state._fsp--;


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
    // oberon0.g:74:1: identlist : IDENT ( ',' IDENT )* ;
    public final void identlist() throws RecognitionException {
        try {
            // oberon0.g:75:2: ( IDENT ( ',' IDENT )* )
            // oberon0.g:75:4: IDENT ( ',' IDENT )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_identlist389); 
            // oberon0.g:75:10: ( ',' IDENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // oberon0.g:75:11: ',' IDENT
            	    {
            	    match(input,37,FOLLOW_37_in_identlist392); 
            	    match(input,IDENT,FOLLOW_IDENT_in_identlist394); 

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
    // oberon0.g:78:1: statementsequence : statement ( ';' statement )* ;
    public final void statementsequence() throws RecognitionException {
        try {
            // oberon0.g:79:2: ( statement ( ';' statement )* )
            // oberon0.g:79:4: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementsequence407);
            statement();

            state._fsp--;

            // oberon0.g:79:14: ( ';' statement )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==8) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // oberon0.g:79:16: ';' statement
            	    {
            	    match(input,8,FOLLOW_8_in_statementsequence411); 
            	    pushFollow(FOLLOW_statement_in_statementsequence413);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "statementsequence"


    // $ANTLR start "statement"
    // oberon0.g:82:1: statement : ( assProc | ifstatement | whilestatement )? ;
    public final void statement() throws RecognitionException {
        try {
            // oberon0.g:83:2: ( ( assProc | ifstatement | whilestatement )? )
            // oberon0.g:83:4: ( assProc | ifstatement | whilestatement )?
            {
            // oberon0.g:83:4: ( assProc | ifstatement | whilestatement )?
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
                    // oberon0.g:83:6: assProc
                    {
                    pushFollow(FOLLOW_assProc_in_statement428);
                    assProc();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // oberon0.g:83:16: ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement432);
                    ifstatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // oberon0.g:83:30: whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement436);
                    whilestatement();

                    state._fsp--;


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
    // $ANTLR end "statement"


    // $ANTLR start "assProc"
    // oberon0.g:86:1: assProc : IDENT selector ( assignment | procedurecall ) ;
    public final void assProc() throws RecognitionException {
        try {
            // oberon0.g:87:2: ( IDENT selector ( assignment | procedurecall ) )
            // oberon0.g:87:4: IDENT selector ( assignment | procedurecall )
            {
            match(input,IDENT,FOLLOW_IDENT_in_assProc451); 
            pushFollow(FOLLOW_selector_in_assProc453);
            selector();

            state._fsp--;

            // oberon0.g:87:19: ( assignment | procedurecall )
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
                    // oberon0.g:87:21: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_assProc457);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // oberon0.g:87:34: procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_assProc461);
                    procedurecall();

                    state._fsp--;


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
    // $ANTLR end "assProc"


    // $ANTLR start "assignment"
    // oberon0.g:90:1: assignment : ':=' expression ;
    public final void assignment() throws RecognitionException {
        try {
            // oberon0.g:91:2: ( ':=' expression )
            // oberon0.g:91:4: ':=' expression
            {
            match(input,38,FOLLOW_38_in_assignment475); 
            pushFollow(FOLLOW_expression_in_assignment477);
            expression();

            state._fsp--;


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
    // $ANTLR end "assignment"


    // $ANTLR start "procedurecall"
    // oberon0.g:94:1: procedurecall : ( actualparameters )? ;
    public final void procedurecall() throws RecognitionException {
        try {
            // oberon0.g:95:2: ( ( actualparameters )? )
            // oberon0.g:95:4: ( actualparameters )?
            {
            // oberon0.g:95:4: ( actualparameters )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // oberon0.g:95:5: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall490);
                    actualparameters();

                    state._fsp--;


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
    // $ANTLR end "procedurecall"


    // $ANTLR start "actualparameters"
    // oberon0.g:98:1: actualparameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final void actualparameters() throws RecognitionException {
        try {
            // oberon0.g:99:2: ( '(' ( expression ( ',' expression )* )? ')' )
            // oberon0.g:99:4: '(' ( expression ( ',' expression )* )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters504); 
            // oberon0.g:99:8: ( expression ( ',' expression )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=IDENT && LA25_0<=INTEGER)||(LA25_0>=24 && LA25_0<=25)||LA25_0==31||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // oberon0.g:99:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters508);
                    expression();

                    state._fsp--;

                    // oberon0.g:99:21: ( ',' expression )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==37) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // oberon0.g:99:23: ',' expression
                    	    {
                    	    match(input,37,FOLLOW_37_in_actualparameters512); 
                    	    pushFollow(FOLLOW_expression_in_actualparameters514);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters520); 

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
    // oberon0.g:102:1: ifstatement : 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' ;
    public final void ifstatement() throws RecognitionException {
        try {
            // oberon0.g:103:2: ( 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END' )
            // oberon0.g:103:4: 'IF' expression 'THEN' statementsequence ( 'ELSIF' expression 'THEN' statementsequence )* ( 'ELSE' statementsequence )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement532); 
            pushFollow(FOLLOW_expression_in_ifstatement534);
            expression();

            state._fsp--;

            match(input,40,FOLLOW_40_in_ifstatement536); 
            pushFollow(FOLLOW_statementsequence_in_ifstatement538);
            statementsequence();

            state._fsp--;

            // oberon0.g:103:45: ( 'ELSIF' expression 'THEN' statementsequence )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==41) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // oberon0.g:103:47: 'ELSIF' expression 'THEN' statementsequence
            	    {
            	    match(input,41,FOLLOW_41_in_ifstatement542); 
            	    pushFollow(FOLLOW_expression_in_ifstatement544);
            	    expression();

            	    state._fsp--;

            	    match(input,40,FOLLOW_40_in_ifstatement546); 
            	    pushFollow(FOLLOW_statementsequence_in_ifstatement548);
            	    statementsequence();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // oberon0.g:103:94: ( 'ELSE' statementsequence )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // oberon0.g:103:96: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_ifstatement555); 
                    pushFollow(FOLLOW_statementsequence_in_ifstatement557);
                    statementsequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_ifstatement562); 

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
    // $ANTLR end "ifstatement"


    // $ANTLR start "whilestatement"
    // oberon0.g:106:1: whilestatement : 'WHILE' expression 'DO' statementsequence 'END' ;
    public final void whilestatement() throws RecognitionException {
        try {
            // oberon0.g:107:2: ( 'WHILE' expression 'DO' statementsequence 'END' )
            // oberon0.g:107:4: 'WHILE' expression 'DO' statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement574); 
            pushFollow(FOLLOW_expression_in_whilestatement576);
            expression();

            state._fsp--;

            match(input,44,FOLLOW_44_in_whilestatement578); 
            pushFollow(FOLLOW_statementsequence_in_whilestatement580);
            statementsequence();

            state._fsp--;

            match(input,11,FOLLOW_11_in_whilestatement582); 

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
    // $ANTLR end "whilestatement"


    // $ANTLR start "proceduredeclaration"
    // oberon0.g:110:1: proceduredeclaration : procedureheading ';' procedurebody ;
    public final void proceduredeclaration() throws RecognitionException {
        try {
            // oberon0.g:111:2: ( procedureheading ';' procedurebody )
            // oberon0.g:111:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration594);
            procedureheading();

            state._fsp--;

            match(input,8,FOLLOW_8_in_proceduredeclaration596); 
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration598);
            procedurebody();

            state._fsp--;


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
    // oberon0.g:114:1: procedureheading : 'PROCEDURE' IDENT ( formalparameters )? ;
    public final void procedureheading() throws RecognitionException {
        try {
            // oberon0.g:115:2: ( 'PROCEDURE' IDENT ( formalparameters )? )
            // oberon0.g:115:4: 'PROCEDURE' IDENT ( formalparameters )?
            {
            match(input,45,FOLLOW_45_in_procedureheading610); 
            match(input,IDENT,FOLLOW_IDENT_in_procedureheading612); 
            // oberon0.g:115:22: ( formalparameters )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // oberon0.g:115:23: formalparameters
                    {
                    pushFollow(FOLLOW_formalparameters_in_procedureheading615);
                    formalparameters();

                    state._fsp--;


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
    // oberon0.g:118:1: procedurebody : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final void procedurebody() throws RecognitionException {
        try {
            // oberon0.g:119:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:119:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody629);
            declarations();

            state._fsp--;

            // oberon0.g:119:17: ( 'BEGIN' statementsequence )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==10) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // oberon0.g:119:18: 'BEGIN' statementsequence
                    {
                    match(input,10,FOLLOW_10_in_procedurebody632); 
                    pushFollow(FOLLOW_statementsequence_in_procedurebody634);
                    statementsequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,11,FOLLOW_11_in_procedurebody638); 
            match(input,IDENT,FOLLOW_IDENT_in_procedurebody640); 

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
    // oberon0.g:122:1: formalparameters : '(' ( fpsection ( ';' fpsection )* )? ')' ;
    public final void formalparameters() throws RecognitionException {
        try {
            // oberon0.g:123:2: ( '(' ( fpsection ( ';' fpsection )* )? ')' )
            // oberon0.g:123:4: '(' ( fpsection ( ';' fpsection )* )? ')'
            {
            match(input,31,FOLLOW_31_in_formalparameters652); 
            // oberon0.g:123:8: ( fpsection ( ';' fpsection )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==IDENT||LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // oberon0.g:123:9: fpsection ( ';' fpsection )*
                    {
                    pushFollow(FOLLOW_fpsection_in_formalparameters655);
                    fpsection();

                    state._fsp--;

                    // oberon0.g:123:19: ( ';' fpsection )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==8) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // oberon0.g:123:20: ';' fpsection
                    	    {
                    	    match(input,8,FOLLOW_8_in_formalparameters658); 
                    	    pushFollow(FOLLOW_fpsection_in_formalparameters660);
                    	    fpsection();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_formalparameters666); 

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
    // oberon0.g:126:1: fpsection : ( 'VAR' )? identlist ':' type ;
    public final void fpsection() throws RecognitionException {
        try {
            // oberon0.g:127:2: ( ( 'VAR' )? identlist ':' type )
            // oberon0.g:127:4: ( 'VAR' )? identlist ':' type
            {
            // oberon0.g:127:4: ( 'VAR' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // oberon0.g:127:5: 'VAR'
                    {
                    match(input,15,FOLLOW_15_in_fpsection678); 

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection682);
            identlist();

            state._fsp--;

            match(input,16,FOLLOW_16_in_fpsection684); 
            pushFollow(FOLLOW_type_in_fpsection686);
            type();

            state._fsp--;


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

    // Delegated rules


 

    public static final BitSet FOLLOW_7_in_module39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module41 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module43 = new BitSet(new long[]{0x000020000000DC00L});
    public static final BitSet FOLLOW_modulebody_in_module45 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module47 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_module49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_modulebody62 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_modulebody65 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_modulebody67 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_modulebody71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations87 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations89 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_declarations91 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations93 = new BitSet(new long[]{0x000020000000C012L});
    public static final BitSet FOLLOW_14_in_declarations100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations103 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations105 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations107 = new BitSet(new long[]{0x0000200000008012L});
    public static final BitSet FOLLOW_15_in_declarations114 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_declarations117 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_declarations119 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations123 = new BitSet(new long[]{0x0000200000000012L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declarations131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations133 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_type146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arraytype167 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_arraytype169 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arraytype171 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_arraytype173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression185 = new BitSet(new long[]{0x0000000000F82002L});
    public static final BitSet FOLLOW_set_in_expression188 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression216 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_simpleexpression223 = new BitSet(new long[]{0x0000000287000032L});
    public static final BitSet FOLLOW_set_in_simpleexpression226 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_simpleexpression235 = new BitSet(new long[]{0x0000000287000032L});
    public static final BitSet FOLLOW_factor_in_term249 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term252 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_term262 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_IDENT_in_factor275 = new BitSet(new long[]{0x0000000400000200L});
    public static final BitSet FOLLOW_selector_in_factor277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor287 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor289 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor296 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_selector323 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector325 = new BitSet(new long[]{0x0000000400000202L});
    public static final BitSet FOLLOW_34_in_selector329 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector331 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector333 = new BitSet(new long[]{0x0000000400000202L});
    public static final BitSet FOLLOW_36_in_recordtype347 = new BitSet(new long[]{0x0000000000000910L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype349 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_8_in_recordtype352 = new BitSet(new long[]{0x0000000000000910L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype354 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_11_in_recordtype358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist371 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldlist373 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fieldlist375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist389 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identlist392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlist394 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence407 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_statementsequence411 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_statementsequence413 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_assProc_in_statement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assProc451 = new BitSet(new long[]{0x0000004480000200L});
    public static final BitSet FOLLOW_selector_in_assProc453 = new BitSet(new long[]{0x0000004080000000L});
    public static final BitSet FOLLOW_assignment_in_assProc457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_assProc461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_assignment475 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters504 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters508 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_37_in_actualparameters512 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters514 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement532 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement534 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement536 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement538 = new BitSet(new long[]{0x0000060000000800L});
    public static final BitSet FOLLOW_41_in_ifstatement542 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement544 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement546 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement548 = new BitSet(new long[]{0x0000060000000800L});
    public static final BitSet FOLLOW_42_in_ifstatement555 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement557 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ifstatement562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement574 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement576 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement578 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement580 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_whilestatement582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration594 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration596 = new BitSet(new long[]{0x000020000000DC00L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading612 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody629 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_procedurebody632 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody634 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_procedurebody638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_formalparameters652 = new BitSet(new long[]{0x0000000100008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters655 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_8_in_formalparameters658 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters660 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_32_in_formalparameters666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fpsection678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection682 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fpsection684 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fpsection686 = new BitSet(new long[]{0x0000000000000002L});

}