// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon.g 2011-02-06 15:18:40

package uva.oberon0.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OberonLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int MODULE=4;
    public static final int PROCEDURE=5;
    public static final int CONST=6;
    public static final int VAR=7;
    public static final int IF=8;
    public static final int THEN=9;
    public static final int ELSE=10;
    public static final int ELSIF=11;
    public static final int WHILE=12;
    public static final int BEGIN=13;
    public static final int END=14;
    public static final int DO=15;
    public static final int EQUAL=16;
    public static final int UNEQUAL=17;
    public static final int LESS=18;
    public static final int LESS_EQUAL=19;
    public static final int GREAT=20;
    public static final int GREAT_EQUAL=21;
    public static final int MIN=22;
    public static final int PLUS=23;
    public static final int MUL=24;
    public static final int DIV=25;
    public static final int MOD=26;
    public static final int AND=27;
    public static final int OR=28;
    public static final int NOT=29;
    public static final int DECLARATIONS=30;
    public static final int INPUTVARS=31;
    public static final int CALL=32;
    public static final int CALL_READ=33;
    public static final int CALL_WRITE=34;
    public static final int CALL_WRITELN=35;
    public static final int ASSIGN=36;
    public static final int INTEGER=37;
    public static final int ARRAY=38;
    public static final int RECORD=39;
    public static final int OF=40;
    public static final int ID=41;
    public static final int INT=42;
    public static final int WHITESPACE=43;

    // delegates
    // delegators

    public OberonLexer() {;} 
    public OberonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OberonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Projects UVA\\Oberon.g"; }

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:7:7: ( ';' )
            // D:\\Projects UVA\\Oberon.g:7:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:8:7: ( '.' )
            // D:\\Projects UVA\\Oberon.g:8:9: '.'
            {
            match('.'); 

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
            // D:\\Projects UVA\\Oberon.g:9:7: ( ':' )
            // D:\\Projects UVA\\Oberon.g:9:9: ':'
            {
            match(':'); 

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
            // D:\\Projects UVA\\Oberon.g:10:7: ( '(' )
            // D:\\Projects UVA\\Oberon.g:10:9: '('
            {
            match('('); 

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
            // D:\\Projects UVA\\Oberon.g:11:7: ( ')' )
            // D:\\Projects UVA\\Oberon.g:11:9: ')'
            {
            match(')'); 

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
            // D:\\Projects UVA\\Oberon.g:12:7: ( ',' )
            // D:\\Projects UVA\\Oberon.g:12:9: ','
            {
            match(','); 

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
            // D:\\Projects UVA\\Oberon.g:13:7: ( '[' )
            // D:\\Projects UVA\\Oberon.g:13:9: '['
            {
            match('['); 

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
            // D:\\Projects UVA\\Oberon.g:14:7: ( ']' )
            // D:\\Projects UVA\\Oberon.g:14:9: ']'
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

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:18:8: ( 'MODULE' )
            // D:\\Projects UVA\\Oberon.g:18:10: 'MODULE'
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

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:20:2: ( 'PROCEDURE' )
            // D:\\Projects UVA\\Oberon.g:20:4: 'PROCEDURE'
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

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:21:7: ( 'CONST' )
            // D:\\Projects UVA\\Oberon.g:21:9: 'CONST'
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
            // D:\\Projects UVA\\Oberon.g:22:5: ( 'VAR' )
            // D:\\Projects UVA\\Oberon.g:22:7: 'VAR'
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

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:24:4: ( 'IF' )
            // D:\\Projects UVA\\Oberon.g:24:6: 'IF'
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
            // D:\\Projects UVA\\Oberon.g:25:6: ( 'THEN' )
            // D:\\Projects UVA\\Oberon.g:25:8: 'THEN'
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
            // D:\\Projects UVA\\Oberon.g:26:6: ( 'ELSE' )
            // D:\\Projects UVA\\Oberon.g:26:8: 'ELSE'
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
            // D:\\Projects UVA\\Oberon.g:27:9: ( 'ELSIF' )
            // D:\\Projects UVA\\Oberon.g:27:14: 'ELSIF'
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

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:28:7: ( 'WHILE' )
            // D:\\Projects UVA\\Oberon.g:28:9: 'WHILE'
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
            // D:\\Projects UVA\\Oberon.g:30:7: ( 'BEGIN' )
            // D:\\Projects UVA\\Oberon.g:30:9: 'BEGIN'
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

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:31:5: ( 'END' )
            // D:\\Projects UVA\\Oberon.g:31:7: 'END'
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

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:32:4: ( 'DO' )
            // D:\\Projects UVA\\Oberon.g:32:6: 'DO'
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

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:34:7: ( '=' )
            // D:\\Projects UVA\\Oberon.g:34:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "UNEQUAL"
    public final void mUNEQUAL() throws RecognitionException {
        try {
            int _type = UNEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:35:9: ( '#' )
            // D:\\Projects UVA\\Oberon.g:35:11: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNEQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:36:6: ( '<' )
            // D:\\Projects UVA\\Oberon.g:36:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "LESS_EQUAL"
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:38:2: ( '<=' )
            // D:\\Projects UVA\\Oberon.g:38:4: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_EQUAL"

    // $ANTLR start "GREAT"
    public final void mGREAT() throws RecognitionException {
        try {
            int _type = GREAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:39:7: ( '>' )
            // D:\\Projects UVA\\Oberon.g:39:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREAT"

    // $ANTLR start "GREAT_EQUAL"
    public final void mGREAT_EQUAL() throws RecognitionException {
        try {
            int _type = GREAT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:41:2: ( '>=' )
            // D:\\Projects UVA\\Oberon.g:41:4: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREAT_EQUAL"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:43:5: ( '-' )
            // D:\\Projects UVA\\Oberon.g:43:7: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:44:6: ( '+' )
            // D:\\Projects UVA\\Oberon.g:44:8: '+'
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

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:45:5: ( '*' )
            // D:\\Projects UVA\\Oberon.g:45:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:46:5: ( 'DIV' )
            // D:\\Projects UVA\\Oberon.g:46:7: 'DIV'
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
            // D:\\Projects UVA\\Oberon.g:47:5: ( 'MOD' )
            // D:\\Projects UVA\\Oberon.g:47:7: 'MOD'
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
            // D:\\Projects UVA\\Oberon.g:49:5: ( '&' )
            // D:\\Projects UVA\\Oberon.g:49:7: '&'
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
            // D:\\Projects UVA\\Oberon.g:50:4: ( 'OR' )
            // D:\\Projects UVA\\Oberon.g:50:6: 'OR'
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

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:51:5: ( '~' )
            // D:\\Projects UVA\\Oberon.g:51:7: '~'
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

    // $ANTLR start "DECLARATIONS"
    public final void mDECLARATIONS() throws RecognitionException {
        try {
            int _type = DECLARATIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:54:2: ( 'DECLARATIONS' )
            // D:\\Projects UVA\\Oberon.g:54:4: 'DECLARATIONS'
            {
            match("DECLARATIONS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECLARATIONS"

    // $ANTLR start "INPUTVARS"
    public final void mINPUTVARS() throws RecognitionException {
        try {
            int _type = INPUTVARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:56:2: ( 'INPUTVARS' )
            // D:\\Projects UVA\\Oberon.g:56:4: 'INPUTVARS'
            {
            match("INPUTVARS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INPUTVARS"

    // $ANTLR start "CALL"
    public final void mCALL() throws RecognitionException {
        try {
            int _type = CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:57:6: ( 'CALL' )
            // D:\\Projects UVA\\Oberon.g:57:8: 'CALL'
            {
            match("CALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL"

    // $ANTLR start "CALL_READ"
    public final void mCALL_READ() throws RecognitionException {
        try {
            int _type = CALL_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:59:2: ( 'Read' )
            // D:\\Projects UVA\\Oberon.g:59:4: 'Read'
            {
            match("Read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL_READ"

    // $ANTLR start "CALL_WRITE"
    public final void mCALL_WRITE() throws RecognitionException {
        try {
            int _type = CALL_WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:61:2: ( 'Write' )
            // D:\\Projects UVA\\Oberon.g:61:4: 'Write'
            {
            match("Write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL_WRITE"

    // $ANTLR start "CALL_WRITELN"
    public final void mCALL_WRITELN() throws RecognitionException {
        try {
            int _type = CALL_WRITELN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:63:2: ( 'WriteLn' )
            // D:\\Projects UVA\\Oberon.g:63:4: 'WriteLn'
            {
            match("WriteLn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL_WRITELN"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:65:8: ( ':=' )
            // D:\\Projects UVA\\Oberon.g:65:10: ':='
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

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:67:9: ( 'INTEGER' )
            // D:\\Projects UVA\\Oberon.g:67:11: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:68:7: ( 'ARRAY' )
            // D:\\Projects UVA\\Oberon.g:68:9: 'ARRAY'
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
            // D:\\Projects UVA\\Oberon.g:69:8: ( 'RECORD' )
            // D:\\Projects UVA\\Oberon.g:69:10: 'RECORD'
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

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:70:4: ( 'OF' )
            // D:\\Projects UVA\\Oberon.g:70:6: 'OF'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:226:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Projects UVA\\Oberon.g:226:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Projects UVA\\Oberon.g:226:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:227:7: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+ )
            // D:\\Projects UVA\\Oberon.g:227:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
            {
            // D:\\Projects UVA\\Oberon.g:227:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
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
            	    // D:\\Projects UVA\\Oberon.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "INT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:229:8: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Projects UVA\\Oberon.g:229:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Projects UVA\\Oberon.g:229:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||(LA3_0>='\f' && LA3_0<='\r')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
        // D:\\Projects UVA\\Oberon.g:1:8: ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | MODULE | PROCEDURE | CONST | VAR | IF | THEN | ELSE | ELSIF | WHILE | BEGIN | END | DO | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | ASSIGN | INTEGER | ARRAY | RECORD | OF | ID | INT | WHITESPACE )
        int alt4=48;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\Projects UVA\\Oberon.g:1:10: T__44
                {
                mT__44(); 

                }
                break;
            case 2 :
                // D:\\Projects UVA\\Oberon.g:1:16: T__45
                {
                mT__45(); 

                }
                break;
            case 3 :
                // D:\\Projects UVA\\Oberon.g:1:22: T__46
                {
                mT__46(); 

                }
                break;
            case 4 :
                // D:\\Projects UVA\\Oberon.g:1:28: T__47
                {
                mT__47(); 

                }
                break;
            case 5 :
                // D:\\Projects UVA\\Oberon.g:1:34: T__48
                {
                mT__48(); 

                }
                break;
            case 6 :
                // D:\\Projects UVA\\Oberon.g:1:40: T__49
                {
                mT__49(); 

                }
                break;
            case 7 :
                // D:\\Projects UVA\\Oberon.g:1:46: T__50
                {
                mT__50(); 

                }
                break;
            case 8 :
                // D:\\Projects UVA\\Oberon.g:1:52: T__51
                {
                mT__51(); 

                }
                break;
            case 9 :
                // D:\\Projects UVA\\Oberon.g:1:58: MODULE
                {
                mMODULE(); 

                }
                break;
            case 10 :
                // D:\\Projects UVA\\Oberon.g:1:65: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 11 :
                // D:\\Projects UVA\\Oberon.g:1:75: CONST
                {
                mCONST(); 

                }
                break;
            case 12 :
                // D:\\Projects UVA\\Oberon.g:1:81: VAR
                {
                mVAR(); 

                }
                break;
            case 13 :
                // D:\\Projects UVA\\Oberon.g:1:85: IF
                {
                mIF(); 

                }
                break;
            case 14 :
                // D:\\Projects UVA\\Oberon.g:1:88: THEN
                {
                mTHEN(); 

                }
                break;
            case 15 :
                // D:\\Projects UVA\\Oberon.g:1:93: ELSE
                {
                mELSE(); 

                }
                break;
            case 16 :
                // D:\\Projects UVA\\Oberon.g:1:98: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 17 :
                // D:\\Projects UVA\\Oberon.g:1:104: WHILE
                {
                mWHILE(); 

                }
                break;
            case 18 :
                // D:\\Projects UVA\\Oberon.g:1:110: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 19 :
                // D:\\Projects UVA\\Oberon.g:1:116: END
                {
                mEND(); 

                }
                break;
            case 20 :
                // D:\\Projects UVA\\Oberon.g:1:120: DO
                {
                mDO(); 

                }
                break;
            case 21 :
                // D:\\Projects UVA\\Oberon.g:1:123: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 22 :
                // D:\\Projects UVA\\Oberon.g:1:129: UNEQUAL
                {
                mUNEQUAL(); 

                }
                break;
            case 23 :
                // D:\\Projects UVA\\Oberon.g:1:137: LESS
                {
                mLESS(); 

                }
                break;
            case 24 :
                // D:\\Projects UVA\\Oberon.g:1:142: LESS_EQUAL
                {
                mLESS_EQUAL(); 

                }
                break;
            case 25 :
                // D:\\Projects UVA\\Oberon.g:1:153: GREAT
                {
                mGREAT(); 

                }
                break;
            case 26 :
                // D:\\Projects UVA\\Oberon.g:1:159: GREAT_EQUAL
                {
                mGREAT_EQUAL(); 

                }
                break;
            case 27 :
                // D:\\Projects UVA\\Oberon.g:1:171: MIN
                {
                mMIN(); 

                }
                break;
            case 28 :
                // D:\\Projects UVA\\Oberon.g:1:175: PLUS
                {
                mPLUS(); 

                }
                break;
            case 29 :
                // D:\\Projects UVA\\Oberon.g:1:180: MUL
                {
                mMUL(); 

                }
                break;
            case 30 :
                // D:\\Projects UVA\\Oberon.g:1:184: DIV
                {
                mDIV(); 

                }
                break;
            case 31 :
                // D:\\Projects UVA\\Oberon.g:1:188: MOD
                {
                mMOD(); 

                }
                break;
            case 32 :
                // D:\\Projects UVA\\Oberon.g:1:192: AND
                {
                mAND(); 

                }
                break;
            case 33 :
                // D:\\Projects UVA\\Oberon.g:1:196: OR
                {
                mOR(); 

                }
                break;
            case 34 :
                // D:\\Projects UVA\\Oberon.g:1:199: NOT
                {
                mNOT(); 

                }
                break;
            case 35 :
                // D:\\Projects UVA\\Oberon.g:1:203: DECLARATIONS
                {
                mDECLARATIONS(); 

                }
                break;
            case 36 :
                // D:\\Projects UVA\\Oberon.g:1:216: INPUTVARS
                {
                mINPUTVARS(); 

                }
                break;
            case 37 :
                // D:\\Projects UVA\\Oberon.g:1:226: CALL
                {
                mCALL(); 

                }
                break;
            case 38 :
                // D:\\Projects UVA\\Oberon.g:1:231: CALL_READ
                {
                mCALL_READ(); 

                }
                break;
            case 39 :
                // D:\\Projects UVA\\Oberon.g:1:241: CALL_WRITE
                {
                mCALL_WRITE(); 

                }
                break;
            case 40 :
                // D:\\Projects UVA\\Oberon.g:1:252: CALL_WRITELN
                {
                mCALL_WRITELN(); 

                }
                break;
            case 41 :
                // D:\\Projects UVA\\Oberon.g:1:265: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 42 :
                // D:\\Projects UVA\\Oberon.g:1:272: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 43 :
                // D:\\Projects UVA\\Oberon.g:1:280: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 44 :
                // D:\\Projects UVA\\Oberon.g:1:286: RECORD
                {
                mRECORD(); 

                }
                break;
            case 45 :
                // D:\\Projects UVA\\Oberon.g:1:293: OF
                {
                mOF(); 

                }
                break;
            case 46 :
                // D:\\Projects UVA\\Oberon.g:1:296: ID
                {
                mID(); 

                }
                break;
            case 47 :
                // D:\\Projects UVA\\Oberon.g:1:299: INT
                {
                mINT(); 

                }
                break;
            case 48 :
                // D:\\Projects UVA\\Oberon.g:1:303: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\3\uffff\1\43\5\uffff\12\37\2\uffff\1\65\1\67\4\uffff\1\37\1\uffff"+
        "\2\37\5\uffff\5\37\1\102\7\37\1\113\2\37\4\uffff\1\116\1\117\3\37"+
        "\1\124\3\37\1\130\1\uffff\4\37\1\136\3\37\1\uffff\1\142\1\37\2\uffff"+
        "\4\37\1\uffff\2\37\1\152\1\uffff\2\37\1\155\1\156\1\37\1\uffff\3"+
        "\37\1\uffff\1\37\1\164\4\37\1\171\1\uffff\2\37\2\uffff\1\174\1\175"+
        "\1\177\1\u0080\1\37\1\uffff\1\37\1\u0083\1\u0084\1\37\1\uffff\2"+
        "\37\2\uffff\1\37\2\uffff\1\37\1\u008a\2\uffff\2\37\1\u008d\1\u008e"+
        "\1\37\1\uffff\2\37\2\uffff\1\37\1\u0093\1\u0094\1\37\2\uffff\2\37"+
        "\1\u0098\1\uffff";
    static final String DFA4_eofS =
        "\u0099\uffff";
    static final String DFA4_minS =
        "\1\11\2\uffff\1\75\5\uffff\1\117\1\122\2\101\1\106\1\110\1\114"+
        "\1\110\2\105\2\uffff\2\75\4\uffff\1\106\1\uffff\1\105\1\122\5\uffff"+
        "\1\104\1\117\1\116\1\114\1\122\1\60\1\120\1\105\1\123\1\104\1\111"+
        "\1\151\1\107\1\60\1\126\1\103\4\uffff\2\60\1\141\1\103\1\122\1\60"+
        "\1\103\1\123\1\114\1\60\1\uffff\1\125\1\105\1\116\1\105\1\60\1\114"+
        "\1\164\1\111\1\uffff\1\60\1\114\2\uffff\1\144\1\117\1\101\1\114"+
        "\1\uffff\1\105\1\124\1\60\1\uffff\1\124\1\107\2\60\1\106\1\uffff"+
        "\1\105\1\145\1\116\1\uffff\1\101\1\60\1\122\1\131\1\105\1\104\1"+
        "\60\1\uffff\1\126\1\105\2\uffff\4\60\1\122\1\uffff\1\104\2\60\1"+
        "\125\1\uffff\1\101\1\122\2\uffff\1\156\2\uffff\1\101\1\60\2\uffff"+
        "\2\122\2\60\1\124\1\uffff\1\105\1\123\2\uffff\1\111\2\60\1\117\2"+
        "\uffff\1\116\1\123\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\176\2\uffff\1\75\5\uffff\1\117\1\122\1\117\1\101\1\116\1\110"+
        "\1\116\1\162\1\105\1\117\2\uffff\2\75\4\uffff\1\122\1\uffff\1\145"+
        "\1\122\5\uffff\1\104\1\117\1\116\1\114\1\122\1\172\1\124\1\105\1"+
        "\123\1\104\1\111\1\151\1\107\1\172\1\126\1\103\4\uffff\2\172\1\141"+
        "\1\103\1\122\1\172\1\103\1\123\1\114\1\172\1\uffff\1\125\1\105\1"+
        "\116\1\111\1\172\1\114\1\164\1\111\1\uffff\1\172\1\114\2\uffff\1"+
        "\144\1\117\1\101\1\114\1\uffff\1\105\1\124\1\172\1\uffff\1\124\1"+
        "\107\2\172\1\106\1\uffff\1\105\1\145\1\116\1\uffff\1\101\1\172\1"+
        "\122\1\131\1\105\1\104\1\172\1\uffff\1\126\1\105\2\uffff\4\172\1"+
        "\122\1\uffff\1\104\2\172\1\125\1\uffff\1\101\1\122\2\uffff\1\156"+
        "\2\uffff\1\101\1\172\2\uffff\2\122\2\172\1\124\1\uffff\1\105\1\123"+
        "\2\uffff\1\111\2\172\1\117\2\uffff\1\116\1\123\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\12\uffff\1\25\1\26"+
        "\2\uffff\1\33\1\34\1\35\1\40\1\uffff\1\42\2\uffff\1\56\1\57\1\60"+
        "\1\51\1\3\20\uffff\1\30\1\27\1\32\1\31\12\uffff\1\15\10\uffff\1"+
        "\24\2\uffff\1\41\1\55\4\uffff\1\37\3\uffff\1\14\5\uffff\1\23\3\uffff"+
        "\1\36\7\uffff\1\45\2\uffff\1\16\1\17\5\uffff\1\46\4\uffff\1\13\2"+
        "\uffff\1\20\1\21\1\uffff\1\47\1\22\2\uffff\1\53\1\11\5\uffff\1\54"+
        "\2\uffff\1\52\1\50\4\uffff\1\12\1\44\3\uffff\1\43";
    static final String DFA4_specialS =
        "\u0099\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\41\1\uffff\2\41\22\uffff\1\41\2\uffff\1\24\2\uffff\1\32"+
            "\1\uffff\1\4\1\5\1\31\1\30\1\6\1\27\1\2\1\uffff\12\40\1\3\1"+
            "\1\1\25\1\23\1\26\2\uffff\1\36\1\21\1\13\1\22\1\17\3\37\1\15"+
            "\3\37\1\11\1\37\1\33\1\12\1\37\1\35\1\37\1\16\1\37\1\14\1\20"+
            "\3\37\1\7\1\uffff\1\10\1\uffff\1\37\1\uffff\32\37\3\uffff\1"+
            "\34",
            "",
            "",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\47\15\uffff\1\46",
            "\1\50",
            "\1\51\7\uffff\1\52",
            "\1\53",
            "\1\54\1\uffff\1\55",
            "\1\56\51\uffff\1\57",
            "\1\60",
            "\1\63\3\uffff\1\62\5\uffff\1\61",
            "",
            "",
            "\1\64",
            "\1\66",
            "",
            "",
            "",
            "",
            "\1\71\13\uffff\1\70",
            "",
            "\1\73\37\uffff\1\72",
            "\1\74",
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
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\103\3\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\37\7\uffff\24\37\1\123\5\37\4\uffff\1\37\1\uffff\32\37",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134\3\uffff\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\153",
            "\1\154",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\172",
            "\1\173",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\13\37\1\176\16\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0081",
            "",
            "\1\u0082",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "\1\u0088",
            "",
            "",
            "\1\u0089",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008f",
            "",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "\1\u0092",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | MODULE | PROCEDURE | CONST | VAR | IF | THEN | ELSE | ELSIF | WHILE | BEGIN | END | DO | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | ASSIGN | INTEGER | ARRAY | RECORD | OF | ID | INT | WHITESPACE );";
        }
    }
 

}