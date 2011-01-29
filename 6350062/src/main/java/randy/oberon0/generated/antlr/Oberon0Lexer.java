// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g 2011-01-29 14:10:23

package randy.oberon0.generated.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int TRUE=4;
    public static final int FALSE=5;
    public static final int NIL=6;
    public static final int MINUS=7;
    public static final int PLUS=8;
    public static final int TIMES=9;
    public static final int DIVIDE=10;
    public static final int CONST=11;
    public static final int VAR=12;
    public static final int TYPE=13;
    public static final int IF=14;
    public static final int THEN=15;
    public static final int ELSE=16;
    public static final int ELSIF=17;
    public static final int END=18;
    public static final int MODULE=19;
    public static final int DO=20;
    public static final int WHILE=21;
    public static final int BEGIN=22;
    public static final int PROCEDURE=23;
    public static final int ARRAY=24;
    public static final int OF=25;
    public static final int RECORD=26;
    public static final int POINTERTO=27;
    public static final int MOD=28;
    public static final int AND=29;
    public static final int OR=30;
    public static final int ASSIGNMENT=31;
    public static final int EQUALS=32;
    public static final int NOTEQUALS=33;
    public static final int SMALLERTHEN=34;
    public static final int GREATERTHEN=35;
    public static final int SMALLEREQUALS=36;
    public static final int GREATEREQUALS=37;
    public static final int NOT=38;
    public static final int REFVAR=39;
    public static final int PROCEDURECALL=40;
    public static final int PARAMETERS=41;
    public static final int EXPRESSION=42;
    public static final int BODY=43;
    public static final int LH=44;
    public static final int RH=45;
    public static final int DOTSELECTOR=46;
    public static final int ARRAYSELECTOR=47;
    public static final int IDENT=48;
    public static final int WHITESPACE=49;
    public static final int INTEGER=50;

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

    // $ANTLR start "NIL"
    public final void mNIL() throws RecognitionException {
        try {
            int _type = NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:13:5: ( 'NIL' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:13:7: 'NIL'
            {
            match("NIL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIL"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:14:7: ( '-' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:14:9: '-'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:15:6: ( '+' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:15:8: '+'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:16:7: ( '*' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:16:9: '*'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:17:8: ( 'DIV' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:17:10: 'DIV'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:18:7: ( 'CONST' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:18:9: 'CONST'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:19:5: ( 'VAR' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:19:7: 'VAR'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:20:6: ( 'TYPE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:20:8: 'TYPE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:21:4: ( 'IF' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:21:6: 'IF'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:22:6: ( 'THEN' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:22:8: 'THEN'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:23:6: ( 'ELSE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:23:8: 'ELSE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:24:7: ( 'ELSIF' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:24:9: 'ELSIF'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:25:5: ( 'END' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:25:7: 'END'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:26:8: ( 'MODULE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:26:10: 'MODULE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:27:4: ( 'DO' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:27:6: 'DO'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:28:7: ( 'WHILE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:28:9: 'WHILE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:29:7: ( 'BEGIN' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:29:9: 'BEGIN'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:30:11: ( 'PROCEDURE' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:30:13: 'PROCEDURE'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:31:7: ( 'ARRAY' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:31:9: 'ARRAY'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:32:4: ( 'OF' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:32:6: 'OF'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:33:8: ( 'RECORD' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:33:10: 'RECORD'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:34:11: ( 'POINTER TO' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:34:13: 'POINTER TO'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:35:5: ( 'MOD' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:35:7: 'MOD'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:36:5: ( '&' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:36:7: '&'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:37:4: ( 'OR' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:37:6: 'OR'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:38:12: ( ':=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:38:14: ':='
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:39:8: ( '=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:39:10: '='
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:40:11: ( '#' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:40:13: '#'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:41:13: ( '<' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:41:15: '<'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:42:13: ( '>' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:42:15: '>'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:43:15: ( '<=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:43:17: '<='
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:44:15: ( '>=' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:44:17: '>='
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:45:5: ( '~' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:45:7: '~'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:46:13: ( '.' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:46:15: '.'
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:47:15: ( '[' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:47:17: '['
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

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:48:7: ( ']' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:48:9: ']'
            {
            match(']'); 

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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:49:7: ( '(' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:49:9: '('
            {
            match('('); 

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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:50:7: ( ')' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:50:9: ')'
            {
            match(')'); 

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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:51:7: ( ',' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:51:9: ','
            {
            match(','); 

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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:52:7: ( ';' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:52:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:53:7: ( ':' )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:53:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:70:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:11: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:71:14: ( ' ' | '\\t' | '\\r' | '\\n' )
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
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:74:8: ( ( '0' .. '9' )+ )
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:74:11: ( '0' .. '9' )+
            {
            // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:74:11: ( '0' .. '9' )+
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
            	    // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:74:12: '0' .. '9'
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
        // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:8: ( TRUE | FALSE | NIL | MINUS | PLUS | TIMES | DIVIDE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | END | MODULE | DO | WHILE | BEGIN | PROCEDURE | ARRAY | OF | RECORD | POINTERTO | MOD | AND | OR | ASSIGNMENT | EQUALS | NOTEQUALS | SMALLERTHEN | GREATERTHEN | SMALLEREQUALS | GREATEREQUALS | NOT | DOTSELECTOR | ARRAYSELECTOR | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | IDENT | WHITESPACE | INTEGER )
        int alt3=46;
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
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:21: NIL
                {
                mNIL(); 

                }
                break;
            case 4 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:25: MINUS
                {
                mMINUS(); 

                }
                break;
            case 5 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:31: PLUS
                {
                mPLUS(); 

                }
                break;
            case 6 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:36: TIMES
                {
                mTIMES(); 

                }
                break;
            case 7 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:42: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 8 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:49: CONST
                {
                mCONST(); 

                }
                break;
            case 9 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:55: VAR
                {
                mVAR(); 

                }
                break;
            case 10 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:59: TYPE
                {
                mTYPE(); 

                }
                break;
            case 11 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:64: IF
                {
                mIF(); 

                }
                break;
            case 12 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:67: THEN
                {
                mTHEN(); 

                }
                break;
            case 13 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:72: ELSE
                {
                mELSE(); 

                }
                break;
            case 14 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:77: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 15 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:83: END
                {
                mEND(); 

                }
                break;
            case 16 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:87: MODULE
                {
                mMODULE(); 

                }
                break;
            case 17 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:94: DO
                {
                mDO(); 

                }
                break;
            case 18 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:97: WHILE
                {
                mWHILE(); 

                }
                break;
            case 19 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:103: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 20 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:109: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 21 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:119: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 22 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:125: OF
                {
                mOF(); 

                }
                break;
            case 23 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:128: RECORD
                {
                mRECORD(); 

                }
                break;
            case 24 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:135: POINTERTO
                {
                mPOINTERTO(); 

                }
                break;
            case 25 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:145: MOD
                {
                mMOD(); 

                }
                break;
            case 26 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:149: AND
                {
                mAND(); 

                }
                break;
            case 27 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:153: OR
                {
                mOR(); 

                }
                break;
            case 28 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:156: ASSIGNMENT
                {
                mASSIGNMENT(); 

                }
                break;
            case 29 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:167: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 30 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:174: NOTEQUALS
                {
                mNOTEQUALS(); 

                }
                break;
            case 31 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:184: SMALLERTHEN
                {
                mSMALLERTHEN(); 

                }
                break;
            case 32 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:196: GREATERTHEN
                {
                mGREATERTHEN(); 

                }
                break;
            case 33 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:208: SMALLEREQUALS
                {
                mSMALLEREQUALS(); 

                }
                break;
            case 34 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:222: GREATEREQUALS
                {
                mGREATEREQUALS(); 

                }
                break;
            case 35 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:236: NOT
                {
                mNOT(); 

                }
                break;
            case 36 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:240: DOTSELECTOR
                {
                mDOTSELECTOR(); 

                }
                break;
            case 37 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:252: ARRAYSELECTOR
                {
                mARRAYSELECTOR(); 

                }
                break;
            case 38 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:266: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:272: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:278: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:284: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:290: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:296: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:302: IDENT
                {
                mIDENT(); 

                }
                break;
            case 45 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:308: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 46 :
                // D:\\SSD\\rascal_workspace\\6350062\\grammar\\Oberon0.g:1:319: INTEGER
                {
                mINTEGER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\3\41\3\uffff\14\41\1\uffff\1\72\2\uffff\1\74\1\76\13\uffff"+
        "\6\41\1\105\2\41\1\110\10\41\1\121\1\122\1\41\6\uffff\4\41\1\130"+
        "\1\131\1\uffff\1\41\1\133\1\uffff\1\41\1\136\1\140\5\41\2\uffff"+
        "\1\41\1\147\1\150\1\151\1\41\2\uffff\1\41\1\uffff\1\154\1\41\1\uffff"+
        "\1\41\1\uffff\6\41\3\uffff\1\165\1\166\1\uffff\1\167\1\41\1\171"+
        "\1\172\2\41\1\175\1\41\3\uffff\1\177\2\uffff\2\41\1\uffff\1\u0082"+
        "\1\uffff\2\41\1\uffff\1\41\1\uffff\1\u0086\1\uffff";
    static final String DFA3_eofS =
        "\u0087\uffff";
    static final String DFA3_minS =
        "\1\11\1\110\1\101\1\111\3\uffff\1\111\1\117\1\101\1\106\1\114\1"+
        "\117\1\110\1\105\1\117\1\122\1\106\1\105\1\uffff\1\75\2\uffff\2"+
        "\75\13\uffff\1\125\1\120\1\105\2\114\1\126\1\60\1\116\1\122\1\60"+
        "\1\123\2\104\1\111\1\107\1\117\1\111\1\122\2\60\1\103\6\uffff\2"+
        "\105\1\116\1\123\2\60\1\uffff\1\123\1\60\1\uffff\1\105\2\60\1\114"+
        "\1\111\1\103\1\116\1\101\2\uffff\1\117\3\60\1\105\2\uffff\1\124"+
        "\1\uffff\1\60\1\106\1\uffff\1\114\1\uffff\1\105\1\116\1\105\1\124"+
        "\1\131\1\122\3\uffff\2\60\1\uffff\1\60\1\105\2\60\1\104\1\105\1"+
        "\60\1\104\3\uffff\1\60\2\uffff\1\125\1\122\1\uffff\1\60\1\uffff"+
        "\1\122\1\40\1\uffff\1\105\1\uffff\1\60\1\uffff";
    static final String DFA3_maxS =
        "\1\176\1\131\1\101\1\111\3\uffff\2\117\1\101\1\106\1\116\1\117"+
        "\1\110\1\105\3\122\1\105\1\uffff\1\75\2\uffff\2\75\13\uffff\1\125"+
        "\1\120\1\105\2\114\1\126\1\172\1\116\1\122\1\172\1\123\2\104\1\111"+
        "\1\107\1\117\1\111\1\122\2\172\1\103\6\uffff\2\105\1\116\1\123\2"+
        "\172\1\uffff\1\123\1\172\1\uffff\1\111\2\172\1\114\1\111\1\103\1"+
        "\116\1\101\2\uffff\1\117\3\172\1\105\2\uffff\1\124\1\uffff\1\172"+
        "\1\106\1\uffff\1\114\1\uffff\1\105\1\116\1\105\1\124\1\131\1\122"+
        "\3\uffff\2\172\1\uffff\1\172\1\105\2\172\1\104\1\105\1\172\1\104"+
        "\3\uffff\1\172\2\uffff\1\125\1\122\1\uffff\1\172\1\uffff\1\122\1"+
        "\40\1\uffff\1\105\1\uffff\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\4\uffff\1\4\1\5\1\6\14\uffff\1\32\1\uffff\1\35\1\36\2\uffff\1"+
        "\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\54\1\55\1\56\25\uffff\1"+
        "\34\1\53\1\41\1\37\1\42\1\40\6\uffff\1\21\2\uffff\1\13\10\uffff"+
        "\1\26\1\33\5\uffff\1\3\1\7\1\uffff\1\11\2\uffff\1\17\1\uffff\1\31"+
        "\6\uffff\1\1\1\12\1\14\2\uffff\1\15\10\uffff\1\2\1\10\1\16\1\uffff"+
        "\1\22\1\23\2\uffff\1\25\1\uffff\1\20\2\uffff\1\27\1\uffff\1\30\1"+
        "\uffff\1\24";
    static final String DFA3_specialS =
        "\u0087\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\42\2\uffff\1\42\22\uffff\1\42\2\uffff\1\26\2\uffff\1\23"+
            "\1\uffff\1\35\1\36\1\6\1\5\1\37\1\4\1\32\1\uffff\12\43\1\24"+
            "\1\40\1\27\1\25\1\30\2\uffff\1\20\1\16\1\10\1\7\1\13\1\2\2\41"+
            "\1\12\3\41\1\14\1\3\1\21\1\17\1\41\1\22\1\41\1\1\1\41\1\11\1"+
            "\15\3\41\1\33\1\uffff\1\34\3\uffff\32\41\3\uffff\1\31",
            "\1\46\11\uffff\1\44\6\uffff\1\45",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "\1\51\5\uffff\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56\1\uffff\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\2\uffff\1\63",
            "\1\65",
            "\1\66\13\uffff\1\67",
            "\1\70",
            "",
            "\1\71",
            "",
            "",
            "\1\73",
            "\1\75",
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
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\106",
            "\1\107",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\123",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\132",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\134\3\uffff\1\135",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\24\41\1\137\5\41\6\uffff\32\41",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\1\146",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\152",
            "",
            "",
            "\1\153",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\155",
            "",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\170",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\173",
            "\1\174",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\176",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
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
            return "1:1: Tokens : ( TRUE | FALSE | NIL | MINUS | PLUS | TIMES | DIVIDE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | END | MODULE | DO | WHILE | BEGIN | PROCEDURE | ARRAY | OF | RECORD | POINTERTO | MOD | AND | OR | ASSIGNMENT | EQUALS | NOTEQUALS | SMALLERTHEN | GREATERTHEN | SMALLEREQUALS | GREATEREQUALS | NOT | DOTSELECTOR | ARRAYSELECTOR | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | IDENT | WHITESPACE | INTEGER );";
        }
    }
 

}