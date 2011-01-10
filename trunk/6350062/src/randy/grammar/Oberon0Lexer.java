// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Data\\software_construction\\grammar\\Oberon0.g 2011-01-10 16:25:12

package randy.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int MINUS=4;
    public static final int PLUS=5;
    public static final int TIMES=6;
    public static final int DIVIDE=7;
    public static final int CONST=8;
    public static final int VAR=9;
    public static final int TYPE=10;
    public static final int IF=11;
    public static final int THEN=12;
    public static final int ELSE=13;
    public static final int ELSIF=14;
    public static final int END=15;
    public static final int MODULE=16;
    public static final int DO=17;
    public static final int WHILE=18;
    public static final int BEGIN=19;
    public static final int PROCEDURE=20;
    public static final int ARRAY=21;
    public static final int OF=22;
    public static final int RECORD=23;
    public static final int MOD=24;
    public static final int AND=25;
    public static final int OR=26;
    public static final int ASSIGNMENT=27;
    public static final int EQUALS=28;
    public static final int SMALLERTHEN=29;
    public static final int GREATERTHEN=30;
    public static final int SMALLEREQUALS=31;
    public static final int GREATEREQUALS=32;
    public static final int REFVAR=33;
    public static final int PROCEDURECALL=34;
    public static final int PARAMETERS=35;
    public static final int EXPRESSION=36;
    public static final int BODY=37;
    public static final int LH=38;
    public static final int RH=39;
    public static final int DOTSELECTOR=40;
    public static final int ARRAYSELECTOR=41;
    public static final int IDENT=42;
    public static final int WHITESPACE=43;
    public static final int INTEGER=44;

    // delegates
    // delegators

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Data\\software_construction\\grammar\\Oberon0.g"; }

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:11:7: ( '-' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:11:9: '-'
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

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:12:6: ( '+' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:12:8: '+'
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

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:13:7: ( '*' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:14:8: ( 'DIV' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:14:10: 'DIV'
            {
            match("DIV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:15:7: ( 'CONST' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:15:9: 'CONST'
            {
            match("CONST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:16:5: ( 'VAR' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:16:7: 'VAR'
            {
            match("VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:17:6: ( 'TYPE' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:17:8: 'TYPE'
            {
            match("TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:18:4: ( 'IF' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:18:6: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:19:6: ( 'THEN' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:19:8: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:20:6: ( 'ELSE' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:20:8: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSIF"
    public final void mELSIF() throws RecognitionException {
        try {
            int _type = ELSIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:21:7: ( 'ELSIF' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:21:9: 'ELSIF'
            {
            match("ELSIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSIF"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:22:5: ( 'END' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:22:7: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:23:8: ( 'MODULE' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:23:10: 'MODULE'
            {
            match("MODULE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:24:4: ( 'DO' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:24:6: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:25:7: ( 'WHILE' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:25:9: 'WHILE'
            {
            match("WHILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:26:7: ( 'BEGIN' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:26:9: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:27:11: ( 'PROCEDURE' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:27:13: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:28:7: ( 'ARRAY' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:28:9: 'ARRAY'
            {
            match("ARRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:29:4: ( 'OF' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:29:6: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "RECORD"
    public final void mRECORD() throws RecognitionException {
        try {
            int _type = RECORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:30:8: ( 'RECORD' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:30:10: 'RECORD'
            {
            match("RECORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RECORD"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:31:5: ( 'MOD' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:31:7: 'MOD'
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

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:32:5: ( '&' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:32:7: '&'
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

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:33:4: ( 'OR' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:33:6: 'OR'
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

    // $ANTLR start "ASSIGNMENT"
    public final void mASSIGNMENT() throws RecognitionException {
        try {
            int _type = ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:34:12: ( ':=' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:34:14: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGNMENT"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:35:8: ( '=' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:35:10: '='
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

    // $ANTLR start "SMALLERTHEN"
    public final void mSMALLERTHEN() throws RecognitionException {
        try {
            int _type = SMALLERTHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:36:13: ( '<' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:36:15: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMALLERTHEN"

    // $ANTLR start "GREATERTHEN"
    public final void mGREATERTHEN() throws RecognitionException {
        try {
            int _type = GREATERTHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:37:13: ( '>' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:37:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATERTHEN"

    // $ANTLR start "SMALLEREQUALS"
    public final void mSMALLEREQUALS() throws RecognitionException {
        try {
            int _type = SMALLEREQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:38:15: ( '<=' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:38:17: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMALLEREQUALS"

    // $ANTLR start "GREATEREQUALS"
    public final void mGREATEREQUALS() throws RecognitionException {
        try {
            int _type = GREATEREQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:39:15: ( '>=' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:39:17: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUALS"

    // $ANTLR start "DOTSELECTOR"
    public final void mDOTSELECTOR() throws RecognitionException {
        try {
            int _type = DOTSELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:40:13: ( '.' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:40:15: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTSELECTOR"

    // $ANTLR start "ARRAYSELECTOR"
    public final void mARRAYSELECTOR() throws RecognitionException {
        try {
            int _type = ARRAYSELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:41:15: ( '[' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:41:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAYSELECTOR"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:42:7: ( ']' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:42:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:43:7: ( '(' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:43:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:44:7: ( ')' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:44:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:45:7: ( '~' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:45:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:46:7: ( '#' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:46:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:47:7: ( ',' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:47:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:48:7: ( ';' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:48:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:49:7: ( ':' )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:49:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:64:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:64:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Data\\software_construction\\grammar\\Oberon0.g:64:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:65:11: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:65:14: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:8: ( ( '0' .. '9' )+ )
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:11: ( '0' .. '9' )+
            {
            // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:11: ( '0' .. '9' )+
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
            	    // C:\\Data\\software_construction\\grammar\\Oberon0.g:68:12: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

    public void mTokens() throws RecognitionException {
        // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:8: ( MINUS | PLUS | TIMES | DIVIDE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | END | MODULE | DO | WHILE | BEGIN | PROCEDURE | ARRAY | OF | RECORD | MOD | AND | OR | ASSIGNMENT | EQUALS | SMALLERTHEN | GREATERTHEN | SMALLEREQUALS | GREATEREQUALS | DOTSELECTOR | ARRAYSELECTOR | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | IDENT | WHITESPACE | INTEGER )
        int alt3=42;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:10: MINUS
                {
                mMINUS(); 

                }
                break;
            case 2 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:16: PLUS
                {
                mPLUS(); 

                }
                break;
            case 3 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:21: TIMES
                {
                mTIMES(); 

                }
                break;
            case 4 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:27: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 5 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:34: CONST
                {
                mCONST(); 

                }
                break;
            case 6 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:40: VAR
                {
                mVAR(); 

                }
                break;
            case 7 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:44: TYPE
                {
                mTYPE(); 

                }
                break;
            case 8 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:49: IF
                {
                mIF(); 

                }
                break;
            case 9 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:52: THEN
                {
                mTHEN(); 

                }
                break;
            case 10 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:57: ELSE
                {
                mELSE(); 

                }
                break;
            case 11 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:62: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 12 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:68: END
                {
                mEND(); 

                }
                break;
            case 13 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:72: MODULE
                {
                mMODULE(); 

                }
                break;
            case 14 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:79: DO
                {
                mDO(); 

                }
                break;
            case 15 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:82: WHILE
                {
                mWHILE(); 

                }
                break;
            case 16 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:88: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 17 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:94: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 18 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:104: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 19 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:110: OF
                {
                mOF(); 

                }
                break;
            case 20 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:113: RECORD
                {
                mRECORD(); 

                }
                break;
            case 21 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:120: MOD
                {
                mMOD(); 

                }
                break;
            case 22 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:124: AND
                {
                mAND(); 

                }
                break;
            case 23 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:128: OR
                {
                mOR(); 

                }
                break;
            case 24 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:131: ASSIGNMENT
                {
                mASSIGNMENT(); 

                }
                break;
            case 25 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:142: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 26 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:149: SMALLERTHEN
                {
                mSMALLERTHEN(); 

                }
                break;
            case 27 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:161: GREATERTHEN
                {
                mGREATERTHEN(); 

                }
                break;
            case 28 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:173: SMALLEREQUALS
                {
                mSMALLEREQUALS(); 

                }
                break;
            case 29 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:187: GREATEREQUALS
                {
                mGREATEREQUALS(); 

                }
                break;
            case 30 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:201: DOTSELECTOR
                {
                mDOTSELECTOR(); 

                }
                break;
            case 31 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:213: ARRAYSELECTOR
                {
                mARRAYSELECTOR(); 

                }
                break;
            case 32 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:227: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:233: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:239: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:245: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:251: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:257: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:263: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:269: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:275: IDENT
                {
                mIDENT(); 

                }
                break;
            case 41 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:281: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 42 :
                // C:\\Data\\software_construction\\grammar\\Oberon0.g:1:292: INTEGER
                {
                mINTEGER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\4\uffff\15\37\1\uffff\1\64\1\uffff\1\66\1\70\14\uffff\1\37\1\72"+
        "\4\37\1\77\7\37\1\107\1\110\1\37\6\uffff\1\112\1\uffff\1\37\1\114"+
        "\2\37\1\uffff\1\37\1\121\1\123\4\37\2\uffff\1\37\1\uffff\1\37\1"+
        "\uffff\1\132\1\133\1\134\1\37\1\uffff\1\37\1\uffff\5\37\1\144\3"+
        "\uffff\1\145\1\37\1\147\1\150\1\37\1\152\1\37\2\uffff\1\154\2\uffff"+
        "\1\37\1\uffff\1\156\1\uffff\1\37\1\uffff\1\37\1\161\1\uffff";
    static final String DFA3_eofS =
        "\162\uffff";
    static final String DFA3_minS =
        "\1\11\3\uffff\1\111\1\117\1\101\1\110\1\106\1\114\1\117\1\110\1"+
        "\105\2\122\1\106\1\105\1\uffff\1\75\1\uffff\2\75\14\uffff\1\126"+
        "\1\60\1\116\1\122\1\120\1\105\1\60\1\123\2\104\1\111\1\107\1\117"+
        "\1\122\2\60\1\103\6\uffff\1\60\1\uffff\1\123\1\60\1\105\1\116\1"+
        "\uffff\1\105\2\60\1\114\1\111\1\103\1\101\2\uffff\1\117\1\uffff"+
        "\1\124\1\uffff\3\60\1\106\1\uffff\1\114\1\uffff\1\105\1\116\1\105"+
        "\1\131\1\122\1\60\3\uffff\1\60\1\105\2\60\1\104\1\60\1\104\2\uffff"+
        "\1\60\2\uffff\1\125\1\uffff\1\60\1\uffff\1\122\1\uffff\1\105\1\60"+
        "\1\uffff";
    static final String DFA3_maxS =
        "\1\176\3\uffff\2\117\1\101\1\131\1\106\1\116\1\117\1\110\1\105"+
        "\3\122\1\105\1\uffff\1\75\1\uffff\2\75\14\uffff\1\126\1\172\1\116"+
        "\1\122\1\120\1\105\1\172\1\123\2\104\1\111\1\107\1\117\1\122\2\172"+
        "\1\103\6\uffff\1\172\1\uffff\1\123\1\172\1\105\1\116\1\uffff\1\111"+
        "\2\172\1\114\1\111\1\103\1\101\2\uffff\1\117\1\uffff\1\124\1\uffff"+
        "\3\172\1\106\1\uffff\1\114\1\uffff\1\105\1\116\1\105\1\131\1\122"+
        "\1\172\3\uffff\1\172\1\105\2\172\1\104\1\172\1\104\2\uffff\1\172"+
        "\2\uffff\1\125\1\uffff\1\172\1\uffff\1\122\1\uffff\1\105\1\172\1"+
        "\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\15\uffff\1\26\1\uffff\1\31\2\uffff\1\36\1"+
        "\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\50\1\51\1\52\21\uffff\1"+
        "\30\1\47\1\34\1\32\1\35\1\33\1\uffff\1\16\4\uffff\1\10\7\uffff\1"+
        "\23\1\27\1\uffff\1\4\1\uffff\1\6\4\uffff\1\14\1\uffff\1\25\6\uffff"+
        "\1\7\1\11\1\12\7\uffff\1\5\1\13\1\uffff\1\17\1\20\1\uffff\1\22\1"+
        "\uffff\1\15\1\uffff\1\24\2\uffff\1\21";
    static final String DFA3_specialS =
        "\162\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\2\uffff\1\34\2\uffff\1\21"+
            "\1\uffff\1\31\1\32\1\3\1\2\1\35\1\1\1\26\1\uffff\12\41\1\22"+
            "\1\36\1\24\1\23\1\25\2\uffff\1\16\1\14\1\5\1\4\1\11\3\37\1\10"+
            "\3\37\1\12\1\37\1\17\1\15\1\37\1\20\1\37\1\7\1\37\1\6\1\13\3"+
            "\37\1\27\1\uffff\1\30\3\uffff\32\37\3\uffff\1\33",
            "",
            "",
            "",
            "\1\42\5\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\47\20\uffff\1\46",
            "\1\50",
            "\1\51\1\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\13\uffff\1\61",
            "\1\62",
            "",
            "\1\63",
            "",
            "\1\65",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\1\113",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\115",
            "\1\116",
            "",
            "\1\117\3\uffff\1\120",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\24\37\1\122\5\37\6\uffff\32\37",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "\1\130",
            "",
            "\1\131",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\135",
            "",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\146",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\151",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\153",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "\1\155",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\1\157",
            "",
            "\1\160",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( MINUS | PLUS | TIMES | DIVIDE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | END | MODULE | DO | WHILE | BEGIN | PROCEDURE | ARRAY | OF | RECORD | MOD | AND | OR | ASSIGNMENT | EQUALS | SMALLERTHEN | GREATERTHEN | SMALLEREQUALS | GREATEREQUALS | DOTSELECTOR | ARRAYSELECTOR | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | IDENT | WHITESPACE | INTEGER );";
        }
    }
 

}