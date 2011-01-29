// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g 2011-01-28 23:18:40

package randy.generated.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int TRUE=4;
    public static final int FALSE=5;
    public static final int MINUS=6;
    public static final int PLUS=7;
    public static final int TIMES=8;
    public static final int DIVIDE=9;
    public static final int CONST=10;
    public static final int VAR=11;
    public static final int TYPE=12;
    public static final int IF=13;
    public static final int THEN=14;
    public static final int ELSE=15;
    public static final int ELSIF=16;
    public static final int END=17;
    public static final int MODULE=18;
    public static final int DO=19;
    public static final int WHILE=20;
    public static final int BEGIN=21;
    public static final int PROCEDURE=22;
    public static final int ARRAY=23;
    public static final int OF=24;
    public static final int RECORD=25;
    public static final int POINTERTO=26;
    public static final int MOD=27;
    public static final int AND=28;
    public static final int OR=29;
    public static final int ASSIGNMENT=30;
    public static final int EQUALS=31;
    public static final int NOTEQUALS=32;
    public static final int SMALLERTHEN=33;
    public static final int GREATERTHEN=34;
    public static final int SMALLEREQUALS=35;
    public static final int GREATEREQUALS=36;
    public static final int NOT=37;
    public static final int REFVAR=38;
    public static final int PROCEDURECALL=39;
    public static final int PARAMETERS=40;
    public static final int EXPRESSION=41;
    public static final int BODY=42;
    public static final int LH=43;
    public static final int RH=44;
    public static final int DOTSELECTOR=45;
    public static final int ARRAYSELECTOR=46;
    public static final int IDENT=47;
    public static final int WHITESPACE=48;
    public static final int INTEGER=49;

    // delegates
    // delegators

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g"; }

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:11:6: ( 'TRUE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:11:8: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:12:7: ( 'FALSE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:12:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:13:7: ( '-' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:13:9: '-'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:14:6: ( '+' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:14:8: '+'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:15:7: ( '*' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:15:9: '*'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:16:8: ( 'DIV' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:16:10: 'DIV'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:17:7: ( 'CONST' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:17:9: 'CONST'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:18:5: ( 'VAR' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:18:7: 'VAR'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:19:6: ( 'TYPE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:19:8: 'TYPE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:20:4: ( 'IF' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:20:6: 'IF'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:21:6: ( 'THEN' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:21:8: 'THEN'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:22:6: ( 'ELSE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:22:8: 'ELSE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:23:7: ( 'ELSIF' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:23:9: 'ELSIF'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:24:5: ( 'END' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:24:7: 'END'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:25:8: ( 'MODULE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:25:10: 'MODULE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:26:4: ( 'DO' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:26:6: 'DO'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:27:7: ( 'WHILE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:27:9: 'WHILE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:28:7: ( 'BEGIN' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:28:9: 'BEGIN'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:29:11: ( 'PROCEDURE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:29:13: 'PROCEDURE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:30:7: ( 'ARRAY' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:30:9: 'ARRAY'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:31:4: ( 'OF' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:31:6: 'OF'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:32:8: ( 'RECORD' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:32:10: 'RECORD'
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

    // $ANTLR start "POINTERTO"
    public final void mPOINTERTO() throws RecognitionException {
        try {
            int _type = POINTERTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:33:11: ( 'POINTER TO' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:33:13: 'POINTER TO'
            {
            match("POINTER TO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINTERTO"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:34:5: ( 'MOD' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:34:7: 'MOD'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:35:5: ( '&' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:35:7: '&'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:36:4: ( 'OR' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:36:6: 'OR'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:37:12: ( ':=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:37:14: ':='
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:38:8: ( '=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:38:10: '='
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

    // $ANTLR start "NOTEQUALS"
    public final void mNOTEQUALS() throws RecognitionException {
        try {
            int _type = NOTEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:39:11: ( '#' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:39:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUALS"

    // $ANTLR start "SMALLERTHEN"
    public final void mSMALLERTHEN() throws RecognitionException {
        try {
            int _type = SMALLERTHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:40:13: ( '<' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:40:15: '<'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:41:13: ( '>' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:41:15: '>'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:42:15: ( '<=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:42:17: '<='
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:43:15: ( '>=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:43:17: '>='
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

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:44:5: ( '~' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:44:7: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "DOTSELECTOR"
    public final void mDOTSELECTOR() throws RecognitionException {
        try {
            int _type = DOTSELECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:45:13: ( '.' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:45:15: '.'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:46:15: ( '[' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:46:17: '['
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

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:47:7: ( ']' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:47:9: ']'
            {
            match(']'); 

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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:48:7: ( '(' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:48:9: '('
            {
            match('('); 

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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:49:7: ( ')' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:49:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:50:7: ( ',' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:50:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:51:7: ( ';' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:51:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:52:7: ( ':' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:52:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:69:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:11: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:14: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:8: ( ( '0' .. '9' )+ )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:11: ( '0' .. '9' )+
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:11: ( '0' .. '9' )+
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
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:73:12: '0' .. '9'
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
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:8: ( TRUE | FALSE | MINUS | PLUS | TIMES | DIVIDE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | END | MODULE | DO | WHILE | BEGIN | PROCEDURE | ARRAY | OF | RECORD | POINTERTO | MOD | AND | OR | ASSIGNMENT | EQUALS | NOTEQUALS | SMALLERTHEN | GREATERTHEN | SMALLEREQUALS | GREATEREQUALS | NOT | DOTSELECTOR | ARRAYSELECTOR | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | IDENT | WHITESPACE | INTEGER )
        int alt3=45;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:10: TRUE
                {
                mTRUE(); 

                }
                break;
            case 2 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:15: FALSE
                {
                mFALSE(); 

                }
                break;
            case 3 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:21: MINUS
                {
                mMINUS(); 

                }
                break;
            case 4 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:27: PLUS
                {
                mPLUS(); 

                }
                break;
            case 5 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:32: TIMES
                {
                mTIMES(); 

                }
                break;
            case 6 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:38: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 7 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:45: CONST
                {
                mCONST(); 

                }
                break;
            case 8 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:51: VAR
                {
                mVAR(); 

                }
                break;
            case 9 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:55: TYPE
                {
                mTYPE(); 

                }
                break;
            case 10 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:60: IF
                {
                mIF(); 

                }
                break;
            case 11 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:63: THEN
                {
                mTHEN(); 

                }
                break;
            case 12 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:68: ELSE
                {
                mELSE(); 

                }
                break;
            case 13 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:73: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 14 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:79: END
                {
                mEND(); 

                }
                break;
            case 15 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:83: MODULE
                {
                mMODULE(); 

                }
                break;
            case 16 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:90: DO
                {
                mDO(); 

                }
                break;
            case 17 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:93: WHILE
                {
                mWHILE(); 

                }
                break;
            case 18 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:99: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 19 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:105: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 20 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:115: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 21 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:121: OF
                {
                mOF(); 

                }
                break;
            case 22 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:124: RECORD
                {
                mRECORD(); 

                }
                break;
            case 23 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:131: POINTERTO
                {
                mPOINTERTO(); 

                }
                break;
            case 24 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:141: MOD
                {
                mMOD(); 

                }
                break;
            case 25 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:145: AND
                {
                mAND(); 

                }
                break;
            case 26 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:149: OR
                {
                mOR(); 

                }
                break;
            case 27 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:152: ASSIGNMENT
                {
                mASSIGNMENT(); 

                }
                break;
            case 28 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:163: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 29 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:170: NOTEQUALS
                {
                mNOTEQUALS(); 

                }
                break;
            case 30 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:180: SMALLERTHEN
                {
                mSMALLERTHEN(); 

                }
                break;
            case 31 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:192: GREATERTHEN
                {
                mGREATERTHEN(); 

                }
                break;
            case 32 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:204: SMALLEREQUALS
                {
                mSMALLEREQUALS(); 

                }
                break;
            case 33 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:218: GREATEREQUALS
                {
                mGREATEREQUALS(); 

                }
                break;
            case 34 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:232: NOT
                {
                mNOT(); 

                }
                break;
            case 35 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:236: DOTSELECTOR
                {
                mDOTSELECTOR(); 

                }
                break;
            case 36 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:248: ARRAYSELECTOR
                {
                mARRAYSELECTOR(); 

                }
                break;
            case 37 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:262: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:268: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:274: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:280: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:286: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:292: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:298: IDENT
                {
                mIDENT(); 

                }
                break;
            case 44 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:304: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 45 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:315: INTEGER
                {
                mINTEGER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\2\40\3\uffff\14\40\1\uffff\1\70\2\uffff\1\72\1\74\13\uffff"+
        "\5\40\1\102\2\40\1\105\10\40\1\116\1\117\1\40\6\uffff\4\40\1\125"+
        "\1\uffff\1\40\1\127\1\uffff\1\40\1\132\1\134\5\40\2\uffff\1\40\1"+
        "\143\1\144\1\145\1\40\1\uffff\1\40\1\uffff\1\150\1\40\1\uffff\1"+
        "\40\1\uffff\6\40\3\uffff\1\161\1\162\1\uffff\1\163\1\40\1\165\1"+
        "\166\2\40\1\171\1\40\3\uffff\1\173\2\uffff\2\40\1\uffff\1\176\1"+
        "\uffff\2\40\1\uffff\1\40\1\uffff\1\u0082\1\uffff";
    static final String DFA3_eofS =
        "\u0083\uffff";
    static final String DFA3_minS =
        "\1\11\1\110\1\101\3\uffff\1\111\1\117\1\101\1\106\1\114\1\117\1"+
        "\110\1\105\1\117\1\122\1\106\1\105\1\uffff\1\75\2\uffff\2\75\13"+
        "\uffff\1\125\1\120\1\105\1\114\1\126\1\60\1\116\1\122\1\60\1\123"+
        "\2\104\1\111\1\107\1\117\1\111\1\122\2\60\1\103\6\uffff\2\105\1"+
        "\116\1\123\1\60\1\uffff\1\123\1\60\1\uffff\1\105\2\60\1\114\1\111"+
        "\1\103\1\116\1\101\2\uffff\1\117\3\60\1\105\1\uffff\1\124\1\uffff"+
        "\1\60\1\106\1\uffff\1\114\1\uffff\1\105\1\116\1\105\1\124\1\131"+
        "\1\122\3\uffff\2\60\1\uffff\1\60\1\105\2\60\1\104\1\105\1\60\1\104"+
        "\3\uffff\1\60\2\uffff\1\125\1\122\1\uffff\1\60\1\uffff\1\122\1\40"+
        "\1\uffff\1\105\1\uffff\1\60\1\uffff";
    static final String DFA3_maxS =
        "\1\176\1\131\1\101\3\uffff\2\117\1\101\1\106\1\116\1\117\1\110"+
        "\1\105\3\122\1\105\1\uffff\1\75\2\uffff\2\75\13\uffff\1\125\1\120"+
        "\1\105\1\114\1\126\1\172\1\116\1\122\1\172\1\123\2\104\1\111\1\107"+
        "\1\117\1\111\1\122\2\172\1\103\6\uffff\2\105\1\116\1\123\1\172\1"+
        "\uffff\1\123\1\172\1\uffff\1\111\2\172\1\114\1\111\1\103\1\116\1"+
        "\101\2\uffff\1\117\3\172\1\105\1\uffff\1\124\1\uffff\1\172\1\106"+
        "\1\uffff\1\114\1\uffff\1\105\1\116\1\105\1\124\1\131\1\122\3\uffff"+
        "\2\172\1\uffff\1\172\1\105\2\172\1\104\1\105\1\172\1\104\3\uffff"+
        "\1\172\2\uffff\1\125\1\122\1\uffff\1\172\1\uffff\1\122\1\40\1\uffff"+
        "\1\105\1\uffff\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\3\uffff\1\3\1\4\1\5\14\uffff\1\31\1\uffff\1\34\1\35\2\uffff\1"+
        "\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\53\1\54\1\55\24\uffff\1"+
        "\33\1\52\1\40\1\36\1\41\1\37\5\uffff\1\20\2\uffff\1\12\10\uffff"+
        "\1\25\1\32\5\uffff\1\6\1\uffff\1\10\2\uffff\1\16\1\uffff\1\30\6"+
        "\uffff\1\1\1\11\1\13\2\uffff\1\14\10\uffff\1\2\1\7\1\15\1\uffff"+
        "\1\21\1\22\2\uffff\1\24\1\uffff\1\17\2\uffff\1\26\1\uffff\1\27\1"+
        "\uffff\1\23";
    static final String DFA3_specialS =
        "\u0083\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\2\uffff\1\25\2\uffff\1\22"+
            "\1\uffff\1\34\1\35\1\5\1\4\1\36\1\3\1\31\1\uffff\12\42\1\23"+
            "\1\37\1\26\1\24\1\27\2\uffff\1\17\1\15\1\7\1\6\1\12\1\2\2\40"+
            "\1\11\3\40\1\13\1\40\1\20\1\16\1\40\1\21\1\40\1\1\1\40\1\10"+
            "\1\14\3\40\1\32\1\uffff\1\33\3\uffff\32\40\3\uffff\1\30",
            "\1\45\11\uffff\1\43\6\uffff\1\44",
            "\1\46",
            "",
            "",
            "",
            "\1\47\5\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54\1\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\62\2\uffff\1\61",
            "\1\63",
            "\1\64\13\uffff\1\65",
            "\1\66",
            "",
            "\1\67",
            "",
            "",
            "\1\71",
            "\1\73",
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
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\103",
            "\1\104",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\120",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\126",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\130\3\uffff\1\131",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\24\40\1\133\5\40\6\uffff\32\40",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\146",
            "",
            "\1\147",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\151",
            "",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\164",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\167",
            "\1\170",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\172",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\1\174",
            "\1\175",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\1\u0081",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
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
            return "1:1: Tokens : ( TRUE | FALSE | MINUS | PLUS | TIMES | DIVIDE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | END | MODULE | DO | WHILE | BEGIN | PROCEDURE | ARRAY | OF | RECORD | POINTERTO | MOD | AND | OR | ASSIGNMENT | EQUALS | NOTEQUALS | SMALLERTHEN | GREATERTHEN | SMALLEREQUALS | GREATEREQUALS | NOT | DOTSELECTOR | ARRAYSELECTOR | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | IDENT | WHITESPACE | INTEGER );";
        }
    }
 

}