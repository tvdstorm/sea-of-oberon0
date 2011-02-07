// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-07 14:59:46

package nl.bve.uva.oberon.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Lexer extends Lexer {
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
    public static final int NUMBER=17;
    public static final int INTEGER=18;
    public static final int LETTER=19;
    public static final int DIGIT=20;
    public static final int WHITESPACE=21;

    // delegates
    // delegators

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:7:6: ( '+' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:7:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:8:7: ( '-' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:8:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:9:6: ( '*' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:9:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:10:5: ( 'DIV' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:10:7: 'DIV'
            {
            match("DIV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:11:5: ( 'MOD' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:11:7: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:12:8: ( '=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:12:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:13:4: ( 'OR' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:13:6: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:14:5: ( '&' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:14:7: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:15:4: ( '<' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:15:6: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LT_EQ"
    public final void mLT_EQ() throws RecognitionException {
        try {
            int _type = LT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:16:7: ( '<=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:16:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT_EQ"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:17:4: ( '>' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:17:6: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GT_EQ"
    public final void mGT_EQ() throws RecognitionException {
        try {
            int _type = GT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:18:7: ( '>=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:18:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT_EQ"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:19:7: ( ';' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:20:7: ( ':=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:20:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:21:7: ( '(' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:22:7: ( ',' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:23:7: ( ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:23:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:24:7: ( 'IF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:24:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:25:7: ( 'THEN' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:25:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:26:7: ( 'ELSIF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:26:9: 'ELSIF'
            {
            match("ELSIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:27:7: ( 'ELSE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:27:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:28:7: ( 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:28:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:29:7: ( 'WHILE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:29:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:30:7: ( 'DO' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:30:9: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:31:7: ( '.' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:31:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:32:7: ( '[' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:33:7: ( ']' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:33:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:116:8: ( INTEGER )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:116:10: INTEGER
            {
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:16: ( LETTER | DIGIT )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:17: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:26: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:17: ( ( DIGIT )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:19: ( DIGIT )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:19: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:20: DIGIT
            	    {
            	    mDIGIT(); 

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

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:17: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:121:16: ( '0' .. '9' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:121:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||(LA4_0>='\f' && LA4_0<='\r')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:8: ( PLUS | MINUS | MULT | DIV | MOD | EQUALS | OR | AND | LT | LT_EQ | GT | GT_EQ | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | NUMBER | IDENT | WHITESPACE )
        int alt5=30;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:30: MOD
                {
                mMOD(); 

                }
                break;
            case 6 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:34: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 7 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:41: OR
                {
                mOR(); 

                }
                break;
            case 8 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:44: AND
                {
                mAND(); 

                }
                break;
            case 9 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:48: LT
                {
                mLT(); 

                }
                break;
            case 10 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:51: LT_EQ
                {
                mLT_EQ(); 

                }
                break;
            case 11 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:57: GT
                {
                mGT(); 

                }
                break;
            case 12 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:60: GT_EQ
                {
                mGT_EQ(); 

                }
                break;
            case 13 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:66: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:72: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:78: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:84: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:90: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:96: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:102: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:108: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:114: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:120: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:126: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:132: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:138: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:144: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:150: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:156: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 29 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:163: IDENT
                {
                mIDENT(); 

                }
                break;
            case 30 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:169: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff\2\30\1\uffff\1\30\1\uffff\1\37\1\41\5\uffff\4\30\6\uffff"+
        "\1\30\1\50\1\30\1\52\4\uffff\1\53\4\30\1\60\1\uffff\1\61\2\uffff"+
        "\2\30\1\65\1\30\2\uffff\1\67\1\30\1\71\1\uffff\1\30\1\uffff\1\73"+
        "\1\uffff\1\74\2\uffff";
    static final String DFA5_eofS =
        "\75\uffff";
    static final String DFA5_minS =
        "\1\11\3\uffff\1\111\1\117\1\uffff\1\122\1\uffff\2\75\5\uffff\1"+
        "\106\1\110\1\114\1\110\6\uffff\1\126\1\60\1\104\1\60\4\uffff\1\60"+
        "\1\105\1\123\1\104\1\111\1\60\1\uffff\1\60\2\uffff\1\116\1\105\1"+
        "\60\1\114\2\uffff\1\60\1\106\1\60\1\uffff\1\105\1\uffff\1\60\1\uffff"+
        "\1\60\2\uffff";
    static final String DFA5_maxS =
        "\1\172\3\uffff\2\117\1\uffff\1\122\1\uffff\2\75\5\uffff\1\106\1"+
        "\110\1\116\1\110\6\uffff\1\126\1\172\1\104\1\172\4\uffff\1\172\1"+
        "\105\1\123\1\104\1\111\1\172\1\uffff\1\172\2\uffff\1\116\1\111\1"+
        "\172\1\114\2\uffff\1\172\1\106\1\172\1\uffff\1\105\1\uffff\1\172"+
        "\1\uffff\1\172\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\uffff\1\10\2\uffff\1\15\1\16"+
        "\1\17\1\20\1\21\4\uffff\1\31\1\32\1\33\1\34\1\35\1\36\4\uffff\1"+
        "\12\1\11\1\14\1\13\6\uffff\1\30\1\uffff\1\7\1\22\4\uffff\1\4\1\5"+
        "\3\uffff\1\26\1\uffff\1\23\1\uffff\1\25\1\uffff\1\24\1\27";
    static final String DFA5_specialS =
        "\75\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\31\1\uffff\2\31\22\uffff\1\31\5\uffff\1\10\1\uffff\1\15"+
            "\1\17\1\3\1\1\1\16\1\2\1\24\1\uffff\12\27\1\14\1\13\1\11\1\6"+
            "\1\12\2\uffff\3\30\1\4\1\22\3\30\1\20\3\30\1\5\1\30\1\7\4\30"+
            "\1\21\2\30\1\23\3\30\1\25\1\uffff\1\26\3\uffff\32\30",
            "",
            "",
            "",
            "\1\32\5\uffff\1\33",
            "\1\34",
            "",
            "\1\35",
            "",
            "\1\36",
            "\1\40",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44\1\uffff\1\45",
            "\1\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\47",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\51",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            "",
            "",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            "",
            "\1\62",
            "\1\64\3\uffff\1\63",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\66",
            "",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "\1\70",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            "\1\72",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            "\12\30\7\uffff\32\30\6\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | MOD | EQUALS | OR | AND | LT | LT_EQ | GT | GT_EQ | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | NUMBER | IDENT | WHITESPACE );";
        }
    }
 

}