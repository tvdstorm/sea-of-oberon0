// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-01 22:32:36

package nl.bve.uva.oberon.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Lexer extends Lexer {
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

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:7:6: ( '+' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:7:8: '+'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:8:7: ( '-' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:8:9: '-'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:9:6: ( '*' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:9:8: '*'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:10:5: ( 'DIV' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:10:7: 'DIV'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:11:5: ( 'MOD' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:11:7: 'MOD'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:12:8: ( '=' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:12:10: '='
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:13:4: ( 'OR' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:13:6: 'OR'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:14:5: ( '&' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:14:7: '&'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:15:4: ( '<' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:15:6: '<'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:16:7: ( '<=' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:16:9: '<='
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:17:4: ( '>' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:17:6: '>'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:18:7: ( '>=' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:18:9: '>='
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

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:19:7: ( '(' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:20:7: ( ')' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:20:9: ')'
            {
            match(')'); 

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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:21:7: ( '.' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:21:9: '.'
            {
            match('.'); 

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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:22:7: ( '[' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:22:9: '['
            {
            match('['); 

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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:23:7: ( ']' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:7: ( LETTER ( LETTER | DIGIT )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:16: ( LETTER | DIGIT )*
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
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:17: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:26: DIGIT
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
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:9: ( ( DIGIT )+ )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:11: ( DIGIT )+
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:11: ( DIGIT )+
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
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:12: DIGIT
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:17: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:16: ( '0' .. '9' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:17: '0' .. '9'
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
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:
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
        // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:8: ( PLUS | MINUS | MULT | DIV | MOD | EQUALS | OR | AND | LT | LT_EQ | GT | GT_EQ | T__21 | T__22 | T__23 | T__24 | T__25 | IDENT | INTEGER | WHITESPACE )
        int alt5=20;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:30: MOD
                {
                mMOD(); 

                }
                break;
            case 6 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:34: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 7 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:41: OR
                {
                mOR(); 

                }
                break;
            case 8 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:44: AND
                {
                mAND(); 

                }
                break;
            case 9 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:48: LT
                {
                mLT(); 

                }
                break;
            case 10 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:51: LT_EQ
                {
                mLT_EQ(); 

                }
                break;
            case 11 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:57: GT
                {
                mGT(); 

                }
                break;
            case 12 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:60: GT_EQ
                {
                mGT_EQ(); 

                }
                break;
            case 13 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:66: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:72: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:78: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:84: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:90: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:96: IDENT
                {
                mIDENT(); 

                }
                break;
            case 19 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:102: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 20 :
                // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:110: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff\2\20\1\uffff\1\20\1\uffff\1\27\1\31\10\uffff\2\20\1\34"+
        "\4\uffff\1\35\1\36\3\uffff";
    static final String DFA5_eofS =
        "\37\uffff";
    static final String DFA5_minS =
        "\1\11\3\uffff\1\111\1\117\1\uffff\1\122\1\uffff\2\75\10\uffff\1"+
        "\126\1\104\1\60\4\uffff\2\60\3\uffff";
    static final String DFA5_maxS =
        "\1\172\3\uffff\1\111\1\117\1\uffff\1\122\1\uffff\2\75\10\uffff"+
        "\1\126\1\104\1\172\4\uffff\2\172\3\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\uffff\1\10\2\uffff\1\15\1\16"+
        "\1\17\1\20\1\21\1\22\1\23\1\24\3\uffff\1\12\1\11\1\14\1\13\2\uffff"+
        "\1\7\1\4\1\5";
    static final String DFA5_specialS =
        "\37\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\22\1\uffff\2\22\22\uffff\1\22\5\uffff\1\10\1\uffff\1\13"+
            "\1\14\1\3\1\1\1\uffff\1\2\1\15\1\uffff\12\21\2\uffff\1\11\1"+
            "\6\1\12\2\uffff\3\20\1\4\10\20\1\5\1\20\1\7\13\20\1\16\1\uffff"+
            "\1\17\3\uffff\32\20",
            "",
            "",
            "",
            "\1\23",
            "\1\24",
            "",
            "\1\25",
            "",
            "\1\26",
            "\1\30",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
            "",
            "",
            "",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "\12\20\7\uffff\32\20\6\uffff\32\20",
            "",
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
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | MOD | EQUALS | OR | AND | LT | LT_EQ | GT | GT_EQ | T__21 | T__22 | T__23 | T__24 | T__25 | IDENT | INTEGER | WHITESPACE );";
        }
    }
 

}