package oberon0.grammar;
// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g 2011-01-19 11:24:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int STAR=4;
    public static final int DIV=5;
    public static final int MOD=6;
    public static final int AMPERSAND=7;
    public static final int PLUS=8;
    public static final int MINUS=9;
    public static final int OR=10;
    public static final int EQUALS=11;
    public static final int HASH=12;
    public static final int SMALLERTHEN=13;
    public static final int SMALLEREQUAL=14;
    public static final int GREATERTHEN=15;
    public static final int GREATEREQUAL=16;
    public static final int DOT=17;
    public static final int COMMA=18;
    public static final int COLON=19;
    public static final int RNDOPEN=20;
    public static final int RNDCLOSE=21;
    public static final int SQROPEN=22;
    public static final int SQRCLOSE=23;
    public static final int OF=24;
    public static final int THEN=25;
    public static final int DO=26;
    public static final int TILDE=27;
    public static final int ASSIGN=28;
    public static final int SEMICOLON=29;
    public static final int END=30;
    public static final int ELSE=31;
    public static final int ELSIF=32;
    public static final int IF=33;
    public static final int WHILE=34;
    public static final int ARRAY=35;
    public static final int RECORD=36;
    public static final int CONST=37;
    public static final int TYPEDECL=38;
    public static final int VAR=39;
    public static final int PROCEDURE=40;
    public static final int BEGIN=41;
    public static final int MODULE=42;
    public static final int PARAMETERS=43;
    public static final int REFVAR=44;
    public static final int BODY=45;
    public static final int CONDITION=46;
    public static final int TYPE=47;
    public static final int NAME=48;
    public static final int PROCEDURECALL=49;
    public static final int SELECTOR=50;
    public static final int IDENT=51;
    public static final int INTEGER=52;
    public static final int WS=53;
    public static final int OPTWS=54;

    // delegates
    // delegators

    public oberon0Lexer() {;} 
    public oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g"; }

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:3:6: ( '*' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:3:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:4:5: ( 'DIV' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:4:7: 'DIV'
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
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:5:5: ( 'MOD' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:5:7: 'MOD'
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

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:6:11: ( '&' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:6:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:6: ( '+' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:7:8: '+'
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
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:8:7: ( '-' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:8:9: '-'
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

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:9:4: ( 'OR' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:9:6: 'OR'
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

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:10:8: ( '=' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:10:10: '='
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

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:6: ( '#' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:11:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "SMALLERTHEN"
    public final void mSMALLERTHEN() throws RecognitionException {
        try {
            int _type = SMALLERTHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:12:13: ( '<' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:12:15: '<'
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

    // $ANTLR start "SMALLEREQUAL"
    public final void mSMALLEREQUAL() throws RecognitionException {
        try {
            int _type = SMALLEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:13:14: ( '<=' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:13:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SMALLEREQUAL"

    // $ANTLR start "GREATERTHEN"
    public final void mGREATERTHEN() throws RecognitionException {
        try {
            int _type = GREATERTHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:14:13: ( '>' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:14:15: '>'
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

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:15:14: ( '>=' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:15:16: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:16:5: ( '.' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:16:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:17:7: ( ',' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:18:7: ( ':' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:18:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "RNDOPEN"
    public final void mRNDOPEN() throws RecognitionException {
        try {
            int _type = RNDOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:19:9: ( '(' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:19:11: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RNDOPEN"

    // $ANTLR start "RNDCLOSE"
    public final void mRNDCLOSE() throws RecognitionException {
        try {
            int _type = RNDCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:20:10: ( ')' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:20:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RNDCLOSE"

    // $ANTLR start "SQROPEN"
    public final void mSQROPEN() throws RecognitionException {
        try {
            int _type = SQROPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:21:9: ( '[' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:21:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQROPEN"

    // $ANTLR start "SQRCLOSE"
    public final void mSQRCLOSE() throws RecognitionException {
        try {
            int _type = SQRCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:22:10: ( ']' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:22:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQRCLOSE"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:23:4: ( 'OF' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:23:6: 'OF'
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

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:24:6: ( 'THEN' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:24:8: 'THEN'
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

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:4: ( 'DO' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:25:6: 'DO'
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

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:26:7: ( '~' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:26:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:27:8: ( ':=' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:27:10: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:28:11: ( ';' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:28:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:29:5: ( 'END' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:29:7: 'END'
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

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:30:6: ( 'ELSE' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:30:8: 'ELSE'
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
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:31:7: ( 'ELSIF' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:31:9: 'ELSIF'
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

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:32:4: ( 'IF' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:32:6: 'IF'
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

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:33:7: ( 'WHILE' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:33:9: 'WHILE'
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

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:34:7: ( 'ARRAY' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:34:9: 'ARRAY'
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

    // $ANTLR start "RECORD"
    public final void mRECORD() throws RecognitionException {
        try {
            int _type = RECORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:35:8: ( 'RECORD' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:35:10: 'RECORD'
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

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:36:7: ( 'CONST' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:36:9: 'CONST'
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

    // $ANTLR start "TYPEDECL"
    public final void mTYPEDECL() throws RecognitionException {
        try {
            int _type = TYPEDECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:37:10: ( 'TYPE' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:37:12: 'TYPE'
            {
            match("TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPEDECL"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:38:5: ( 'VAR' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:38:7: 'VAR'
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

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:39:11: ( 'PROCEDURE' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:39:13: 'PROCEDURE'
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

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:7: ( 'BEGIN' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:40:9: 'BEGIN'
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

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:41:8: ( 'MODULE' )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:41:10: 'MODULE'
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:203:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:203:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:204:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:205:9: ( ( '0' .. '9' )+ )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:205:11: ( '0' .. '9' )+
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:205:11: ( '0' .. '9' )+
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
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:205:11: '0' .. '9'
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:207:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:207:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:207:7: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "OPTWS"
    public final void mOPTWS() throws RecognitionException {
        try {
            int _type = OPTWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:208:7: ( ( ' ' | '\\t' | '\\n' | '\\r' )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:208:9: ( ' ' | '\\t' | '\\n' | '\\r' )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:208:9: ( ' ' | '\\t' | '\\n' | '\\r' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTWS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:8: ( STAR | DIV | MOD | AMPERSAND | PLUS | MINUS | OR | EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL | DOT | COMMA | COLON | RNDOPEN | RNDCLOSE | SQROPEN | SQRCLOSE | OF | THEN | DO | TILDE | ASSIGN | SEMICOLON | END | ELSE | ELSIF | IF | WHILE | ARRAY | RECORD | CONST | TYPEDECL | VAR | PROCEDURE | BEGIN | MODULE | IDENT | INTEGER | WS | OPTWS )
        int alt5=43;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:10: STAR
                {
                mSTAR(); 

                }
                break;
            case 2 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:15: DIV
                {
                mDIV(); 

                }
                break;
            case 3 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:19: MOD
                {
                mMOD(); 

                }
                break;
            case 4 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:23: AMPERSAND
                {
                mAMPERSAND(); 

                }
                break;
            case 5 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:33: PLUS
                {
                mPLUS(); 

                }
                break;
            case 6 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:38: MINUS
                {
                mMINUS(); 

                }
                break;
            case 7 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:44: OR
                {
                mOR(); 

                }
                break;
            case 8 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:47: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 9 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:54: HASH
                {
                mHASH(); 

                }
                break;
            case 10 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:59: SMALLERTHEN
                {
                mSMALLERTHEN(); 

                }
                break;
            case 11 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:71: SMALLEREQUAL
                {
                mSMALLEREQUAL(); 

                }
                break;
            case 12 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:84: GREATERTHEN
                {
                mGREATERTHEN(); 

                }
                break;
            case 13 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:96: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 14 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:109: DOT
                {
                mDOT(); 

                }
                break;
            case 15 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:113: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 16 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:119: COLON
                {
                mCOLON(); 

                }
                break;
            case 17 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:125: RNDOPEN
                {
                mRNDOPEN(); 

                }
                break;
            case 18 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:133: RNDCLOSE
                {
                mRNDCLOSE(); 

                }
                break;
            case 19 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:142: SQROPEN
                {
                mSQROPEN(); 

                }
                break;
            case 20 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:150: SQRCLOSE
                {
                mSQRCLOSE(); 

                }
                break;
            case 21 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:159: OF
                {
                mOF(); 

                }
                break;
            case 22 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:162: THEN
                {
                mTHEN(); 

                }
                break;
            case 23 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:167: DO
                {
                mDO(); 

                }
                break;
            case 24 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:170: TILDE
                {
                mTILDE(); 

                }
                break;
            case 25 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:176: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 26 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:183: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 27 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:193: END
                {
                mEND(); 

                }
                break;
            case 28 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:197: ELSE
                {
                mELSE(); 

                }
                break;
            case 29 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:202: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 30 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:208: IF
                {
                mIF(); 

                }
                break;
            case 31 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:211: WHILE
                {
                mWHILE(); 

                }
                break;
            case 32 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:217: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 33 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:223: RECORD
                {
                mRECORD(); 

                }
                break;
            case 34 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:230: CONST
                {
                mCONST(); 

                }
                break;
            case 35 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:236: TYPEDECL
                {
                mTYPEDECL(); 

                }
                break;
            case 36 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:245: VAR
                {
                mVAR(); 

                }
                break;
            case 37 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:249: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 38 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:259: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 39 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:265: MODULE
                {
                mMODULE(); 

                }
                break;
            case 40 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:272: IDENT
                {
                mIDENT(); 

                }
                break;
            case 41 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:278: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 42 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:286: WS
                {
                mWS(); 

                }
                break;
            case 43 :
                // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\interpreter1\\oberon0.g:1:289: OPTWS
                {
                mOPTWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\42\1\uffff\2\37\3\uffff\1\37\2\uffff\1\51\1\53\2\uffff\1\55"+
        "\4\uffff\1\37\2\uffff\11\37\2\uffff\1\72\1\uffff\1\37\1\74\1\37"+
        "\1\76\1\77\6\uffff\4\37\1\104\7\37\1\uffff\1\114\1\uffff\1\116\2"+
        "\uffff\2\37\1\121\1\37\1\uffff\4\37\1\130\2\37\1\uffff\1\37\1\uffff"+
        "\1\134\1\135\1\uffff\1\136\5\37\1\uffff\3\37\3\uffff\1\147\1\150"+
        "\1\151\1\37\1\153\1\37\1\155\1\156\3\uffff\1\157\1\uffff\1\37\3"+
        "\uffff\2\37\1\163\1\uffff";
    static final String DFA5_eofS =
        "\164\uffff";
    static final String DFA5_minS =
        "\1\11\1\uffff\1\111\1\117\3\uffff\1\106\2\uffff\2\75\2\uffff\1"+
        "\75\4\uffff\1\110\2\uffff\1\114\1\106\1\110\1\122\1\105\1\117\1"+
        "\101\1\122\1\105\2\uffff\1\11\1\uffff\1\126\1\60\1\104\2\60\6\uffff"+
        "\1\105\1\120\1\104\1\123\1\60\1\111\1\122\1\103\1\116\1\122\1\117"+
        "\1\107\1\uffff\1\60\1\uffff\1\60\2\uffff\1\116\1\105\1\60\1\105"+
        "\1\uffff\1\114\1\101\1\117\1\123\1\60\1\103\1\111\1\uffff\1\114"+
        "\1\uffff\2\60\1\uffff\1\60\1\106\1\105\1\131\1\122\1\124\1\uffff"+
        "\1\105\1\116\1\105\3\uffff\3\60\1\104\1\60\1\104\2\60\3\uffff\1"+
        "\60\1\uffff\1\125\3\uffff\1\122\1\105\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\176\1\uffff\2\117\3\uffff\1\122\2\uffff\2\75\2\uffff\1\75\4"+
        "\uffff\1\131\2\uffff\1\116\1\106\1\110\1\122\1\105\1\117\1\101\1"+
        "\122\1\105\2\uffff\1\40\1\uffff\1\126\1\172\1\104\2\172\6\uffff"+
        "\1\105\1\120\1\104\1\123\1\172\1\111\1\122\1\103\1\116\1\122\1\117"+
        "\1\107\1\uffff\1\172\1\uffff\1\172\2\uffff\1\116\1\105\1\172\1\111"+
        "\1\uffff\1\114\1\101\1\117\1\123\1\172\1\103\1\111\1\uffff\1\114"+
        "\1\uffff\2\172\1\uffff\1\172\1\106\1\105\1\131\1\122\1\124\1\uffff"+
        "\1\105\1\116\1\105\3\uffff\3\172\1\104\1\172\1\104\2\172\3\uffff"+
        "\1\172\1\uffff\1\125\3\uffff\1\122\1\105\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\uffff\1\10\1\11\2\uffff\1\16"+
        "\1\17\1\uffff\1\21\1\22\1\23\1\24\1\uffff\1\30\1\32\11\uffff\1\50"+
        "\1\51\1\uffff\1\53\5\uffff\1\13\1\12\1\15\1\14\1\31\1\20\14\uffff"+
        "\1\52\1\uffff\1\27\1\uffff\1\7\1\25\4\uffff\1\36\7\uffff\1\2\1\uffff"+
        "\1\3\2\uffff\1\33\6\uffff\1\44\3\uffff\1\26\1\43\1\34\10\uffff\1"+
        "\35\1\37\1\40\1\uffff\1\42\1\uffff\1\46\1\47\1\41\3\uffff\1\45";
    static final String DFA5_specialS =
        "\164\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\2\uffff\1\11\2\uffff\1\4\1"+
            "\uffff\1\17\1\20\1\1\1\5\1\15\1\6\1\14\1\uffff\12\40\1\16\1"+
            "\25\1\12\1\10\1\13\2\uffff\1\31\1\36\1\33\1\2\1\26\3\37\1\27"+
            "\3\37\1\3\1\37\1\7\1\35\1\37\1\32\1\37\1\23\1\37\1\34\1\30\3"+
            "\37\1\21\1\uffff\1\22\1\uffff\1\37\1\uffff\32\37\3\uffff\1\24",
            "",
            "\1\43\5\uffff\1\44",
            "\1\45",
            "",
            "",
            "",
            "\1\47\13\uffff\1\46",
            "",
            "",
            "\1\50",
            "\1\52",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "",
            "\1\56\20\uffff\1\57",
            "",
            "",
            "\1\61\1\uffff\1\60",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\2\41\2\uffff\1\41\22\uffff\1\41",
            "",
            "\1\73",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\75",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\24\37\1\115\5\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\117",
            "\1\120",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\122\3\uffff\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\131",
            "\1\132",
            "",
            "\1\133",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\152",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\154",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\160",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
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
            return "1:1: Tokens : ( STAR | DIV | MOD | AMPERSAND | PLUS | MINUS | OR | EQUALS | HASH | SMALLERTHEN | SMALLEREQUAL | GREATERTHEN | GREATEREQUAL | DOT | COMMA | COLON | RNDOPEN | RNDCLOSE | SQROPEN | SQRCLOSE | OF | THEN | DO | TILDE | ASSIGN | SEMICOLON | END | ELSE | ELSIF | IF | WHILE | ARRAY | RECORD | CONST | TYPEDECL | VAR | PROCEDURE | BEGIN | MODULE | IDENT | INTEGER | WS | OPTWS );";
        }
    }
 

}