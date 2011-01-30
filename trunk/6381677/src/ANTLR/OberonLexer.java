// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon.g 2011-01-30 11:05:15

package ANTLR;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class OberonLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int MODULE=4;
    public static final int CONST=5;
    public static final int VAR=6;
    public static final int VARREF=7;
    public static final int PROCEDURE=8;
    public static final int BODY=9;
    public static final int EXIT=10;
    public static final int RETURN=11;
    public static final int IF=12;
    public static final int THEN=13;
    public static final int ELSE=14;
    public static final int ELSIF=15;
    public static final int END=16;
    public static final int WHILE=17;
    public static final int EQUAL=18;
    public static final int UNEQUAL=19;
    public static final int LESS=20;
    public static final int LESS_EQUAL=21;
    public static final int GREAT=22;
    public static final int GREAT_EQUAL=23;
    public static final int MIN=24;
    public static final int PLUS=25;
    public static final int MUL=26;
    public static final int DIV=27;
    public static final int MOD=28;
    public static final int AND=29;
    public static final int OR=30;
    public static final int NOT=31;
    public static final int DECLARATIONS=32;
    public static final int INPUTVARS=33;
    public static final int CALL=34;
    public static final int CALL_READ=35;
    public static final int CALL_WRITE=36;
    public static final int CALL_WRITELN=37;
    public static final int CALLVARS=38;
    public static final int ASSIGN=39;
    public static final int INT_TYPE=40;
    public static final int ARRAY=41;
    public static final int ID=42;
    public static final int INT=43;
    public static final int WHITESPACE=44;

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

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:7:7: ( 'MODULE' )
            // D:\\Projects UVA\\Oberon.g:7:9: 'MODULE'
            {
            match("MODULE"); 


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
            // D:\\Projects UVA\\Oberon.g:8:7: ( ';' )
            // D:\\Projects UVA\\Oberon.g:8:9: ';'
            {
            match(';'); 

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
            // D:\\Projects UVA\\Oberon.g:9:7: ( 'BEGIN' )
            // D:\\Projects UVA\\Oberon.g:9:9: 'BEGIN'
            {
            match("BEGIN"); 


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
            // D:\\Projects UVA\\Oberon.g:10:7: ( '.' )
            // D:\\Projects UVA\\Oberon.g:10:9: '.'
            {
            match('.'); 

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
            // D:\\Projects UVA\\Oberon.g:11:7: ( ':' )
            // D:\\Projects UVA\\Oberon.g:11:9: ':'
            {
            match(':'); 

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
            // D:\\Projects UVA\\Oberon.g:12:7: ( 'PROCEDURE' )
            // D:\\Projects UVA\\Oberon.g:12:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


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
            // D:\\Projects UVA\\Oberon.g:13:7: ( '(' )
            // D:\\Projects UVA\\Oberon.g:13:9: '('
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
            // D:\\Projects UVA\\Oberon.g:14:7: ( ')' )
            // D:\\Projects UVA\\Oberon.g:14:9: ')'
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
            // D:\\Projects UVA\\Oberon.g:15:7: ( ',' )
            // D:\\Projects UVA\\Oberon.g:15:9: ','
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
            // D:\\Projects UVA\\Oberon.g:16:7: ( 'OF' )
            // D:\\Projects UVA\\Oberon.g:16:9: 'OF'
            {
            match("OF"); 


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
            // D:\\Projects UVA\\Oberon.g:17:7: ( 'DO' )
            // D:\\Projects UVA\\Oberon.g:17:9: 'DO'
            {
            match("DO"); 


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
            // D:\\Projects UVA\\Oberon.g:18:7: ( '[' )
            // D:\\Projects UVA\\Oberon.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:19:7: ( ']' )
            // D:\\Projects UVA\\Oberon.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:23:4: ( 'IF' )
            // D:\\Projects UVA\\Oberon.g:23:6: 'IF'
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
            // D:\\Projects UVA\\Oberon.g:24:6: ( 'THEN' )
            // D:\\Projects UVA\\Oberon.g:24:8: 'THEN'
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
            // D:\\Projects UVA\\Oberon.g:25:6: ( 'ELSE' )
            // D:\\Projects UVA\\Oberon.g:25:8: 'ELSE'
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
            // D:\\Projects UVA\\Oberon.g:26:9: ( 'ELSIF' )
            // D:\\Projects UVA\\Oberon.g:26:14: 'ELSIF'
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
            // D:\\Projects UVA\\Oberon.g:27:5: ( 'END' )
            // D:\\Projects UVA\\Oberon.g:27:7: 'END'
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

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:30:7: ( '=' )
            // D:\\Projects UVA\\Oberon.g:30:9: '='
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
            // D:\\Projects UVA\\Oberon.g:31:9: ( '#' )
            // D:\\Projects UVA\\Oberon.g:31:11: '#'
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
            // D:\\Projects UVA\\Oberon.g:32:6: ( '<' )
            // D:\\Projects UVA\\Oberon.g:32:8: '<'
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
            // D:\\Projects UVA\\Oberon.g:34:2: ( '<=' )
            // D:\\Projects UVA\\Oberon.g:34:4: '<='
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
            // D:\\Projects UVA\\Oberon.g:35:7: ( '>' )
            // D:\\Projects UVA\\Oberon.g:35:9: '>'
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
            // D:\\Projects UVA\\Oberon.g:37:2: ( '>=' )
            // D:\\Projects UVA\\Oberon.g:37:4: '>='
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
            // D:\\Projects UVA\\Oberon.g:39:5: ( '-' )
            // D:\\Projects UVA\\Oberon.g:39:7: '-'
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
            // D:\\Projects UVA\\Oberon.g:40:6: ( '+' )
            // D:\\Projects UVA\\Oberon.g:40:8: '+'
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
            // D:\\Projects UVA\\Oberon.g:41:5: ( '*' )
            // D:\\Projects UVA\\Oberon.g:41:7: '*'
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
            // D:\\Projects UVA\\Oberon.g:42:5: ( 'DIV' )
            // D:\\Projects UVA\\Oberon.g:42:7: 'DIV'
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
            // D:\\Projects UVA\\Oberon.g:43:5: ( 'MOD' )
            // D:\\Projects UVA\\Oberon.g:43:7: 'MOD'
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
            // D:\\Projects UVA\\Oberon.g:45:5: ( '&' )
            // D:\\Projects UVA\\Oberon.g:45:7: '&'
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
            // D:\\Projects UVA\\Oberon.g:46:4: ( 'OR' )
            // D:\\Projects UVA\\Oberon.g:46:6: 'OR'
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
            // D:\\Projects UVA\\Oberon.g:47:5: ( '~' )
            // D:\\Projects UVA\\Oberon.g:47:7: '~'
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
            // D:\\Projects UVA\\Oberon.g:50:2: ( 'DECLARATIONS' )
            // D:\\Projects UVA\\Oberon.g:50:4: 'DECLARATIONS'
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
            // D:\\Projects UVA\\Oberon.g:52:2: ( 'INPUTVARS' )
            // D:\\Projects UVA\\Oberon.g:52:4: 'INPUTVARS'
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
            // D:\\Projects UVA\\Oberon.g:53:6: ( 'CALL' )
            // D:\\Projects UVA\\Oberon.g:53:8: 'CALL'
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
            // D:\\Projects UVA\\Oberon.g:55:2: ( 'Read' )
            // D:\\Projects UVA\\Oberon.g:55:4: 'Read'
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
            // D:\\Projects UVA\\Oberon.g:57:2: ( 'Write' )
            // D:\\Projects UVA\\Oberon.g:57:4: 'Write'
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
            // D:\\Projects UVA\\Oberon.g:59:2: ( 'WriteLn' )
            // D:\\Projects UVA\\Oberon.g:59:4: 'WriteLn'
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

    // $ANTLR start "CALLVARS"
    public final void mCALLVARS() throws RecognitionException {
        try {
            int _type = CALLVARS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:61:2: ( 'CALLVARS' )
            // D:\\Projects UVA\\Oberon.g:61:4: 'CALLVARS'
            {
            match("CALLVARS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALLVARS"

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:62:7: ( 'CONST' )
            // D:\\Projects UVA\\Oberon.g:62:9: 'CONST'
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
            // D:\\Projects UVA\\Oberon.g:63:5: ( 'VAR' )
            // D:\\Projects UVA\\Oberon.g:63:7: 'VAR'
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

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:64:8: ( ':=' )
            // D:\\Projects UVA\\Oberon.g:64:10: ':='
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

    // $ANTLR start "INT_TYPE"
    public final void mINT_TYPE() throws RecognitionException {
        try {
            int _type = INT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:66:9: ( 'INTEGER' )
            // D:\\Projects UVA\\Oberon.g:66:11: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT_TYPE"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:67:7: ( 'ARRAY' )
            // D:\\Projects UVA\\Oberon.g:67:9: 'ARRAY'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon.g:159:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Projects UVA\\Oberon.g:159:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Projects UVA\\Oberon.g:159:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // D:\\Projects UVA\\Oberon.g:160:7: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+ )
            // D:\\Projects UVA\\Oberon.g:160:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
            {
            // D:\\Projects UVA\\Oberon.g:160:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
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
            // D:\\Projects UVA\\Oberon.g:162:8: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Projects UVA\\Oberon.g:162:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Projects UVA\\Oberon.g:162:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
        // D:\\Projects UVA\\Oberon.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | IF | THEN | ELSE | ELSIF | END | WHILE | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | CALLVARS | CONST | VAR | ASSIGN | INT_TYPE | ARRAY | ID | INT | WHITESPACE )
        int alt4=48;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\Projects UVA\\Oberon.g:1:10: T__45
                {
                mT__45(); 

                }
                break;
            case 2 :
                // D:\\Projects UVA\\Oberon.g:1:16: T__46
                {
                mT__46(); 

                }
                break;
            case 3 :
                // D:\\Projects UVA\\Oberon.g:1:22: T__47
                {
                mT__47(); 

                }
                break;
            case 4 :
                // D:\\Projects UVA\\Oberon.g:1:28: T__48
                {
                mT__48(); 

                }
                break;
            case 5 :
                // D:\\Projects UVA\\Oberon.g:1:34: T__49
                {
                mT__49(); 

                }
                break;
            case 6 :
                // D:\\Projects UVA\\Oberon.g:1:40: T__50
                {
                mT__50(); 

                }
                break;
            case 7 :
                // D:\\Projects UVA\\Oberon.g:1:46: T__51
                {
                mT__51(); 

                }
                break;
            case 8 :
                // D:\\Projects UVA\\Oberon.g:1:52: T__52
                {
                mT__52(); 

                }
                break;
            case 9 :
                // D:\\Projects UVA\\Oberon.g:1:58: T__53
                {
                mT__53(); 

                }
                break;
            case 10 :
                // D:\\Projects UVA\\Oberon.g:1:64: T__54
                {
                mT__54(); 

                }
                break;
            case 11 :
                // D:\\Projects UVA\\Oberon.g:1:70: T__55
                {
                mT__55(); 

                }
                break;
            case 12 :
                // D:\\Projects UVA\\Oberon.g:1:76: T__56
                {
                mT__56(); 

                }
                break;
            case 13 :
                // D:\\Projects UVA\\Oberon.g:1:82: T__57
                {
                mT__57(); 

                }
                break;
            case 14 :
                // D:\\Projects UVA\\Oberon.g:1:88: IF
                {
                mIF(); 

                }
                break;
            case 15 :
                // D:\\Projects UVA\\Oberon.g:1:91: THEN
                {
                mTHEN(); 

                }
                break;
            case 16 :
                // D:\\Projects UVA\\Oberon.g:1:96: ELSE
                {
                mELSE(); 

                }
                break;
            case 17 :
                // D:\\Projects UVA\\Oberon.g:1:101: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 18 :
                // D:\\Projects UVA\\Oberon.g:1:107: END
                {
                mEND(); 

                }
                break;
            case 19 :
                // D:\\Projects UVA\\Oberon.g:1:111: WHILE
                {
                mWHILE(); 

                }
                break;
            case 20 :
                // D:\\Projects UVA\\Oberon.g:1:117: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 21 :
                // D:\\Projects UVA\\Oberon.g:1:123: UNEQUAL
                {
                mUNEQUAL(); 

                }
                break;
            case 22 :
                // D:\\Projects UVA\\Oberon.g:1:131: LESS
                {
                mLESS(); 

                }
                break;
            case 23 :
                // D:\\Projects UVA\\Oberon.g:1:136: LESS_EQUAL
                {
                mLESS_EQUAL(); 

                }
                break;
            case 24 :
                // D:\\Projects UVA\\Oberon.g:1:147: GREAT
                {
                mGREAT(); 

                }
                break;
            case 25 :
                // D:\\Projects UVA\\Oberon.g:1:153: GREAT_EQUAL
                {
                mGREAT_EQUAL(); 

                }
                break;
            case 26 :
                // D:\\Projects UVA\\Oberon.g:1:165: MIN
                {
                mMIN(); 

                }
                break;
            case 27 :
                // D:\\Projects UVA\\Oberon.g:1:169: PLUS
                {
                mPLUS(); 

                }
                break;
            case 28 :
                // D:\\Projects UVA\\Oberon.g:1:174: MUL
                {
                mMUL(); 

                }
                break;
            case 29 :
                // D:\\Projects UVA\\Oberon.g:1:178: DIV
                {
                mDIV(); 

                }
                break;
            case 30 :
                // D:\\Projects UVA\\Oberon.g:1:182: MOD
                {
                mMOD(); 

                }
                break;
            case 31 :
                // D:\\Projects UVA\\Oberon.g:1:186: AND
                {
                mAND(); 

                }
                break;
            case 32 :
                // D:\\Projects UVA\\Oberon.g:1:190: OR
                {
                mOR(); 

                }
                break;
            case 33 :
                // D:\\Projects UVA\\Oberon.g:1:193: NOT
                {
                mNOT(); 

                }
                break;
            case 34 :
                // D:\\Projects UVA\\Oberon.g:1:197: DECLARATIONS
                {
                mDECLARATIONS(); 

                }
                break;
            case 35 :
                // D:\\Projects UVA\\Oberon.g:1:210: INPUTVARS
                {
                mINPUTVARS(); 

                }
                break;
            case 36 :
                // D:\\Projects UVA\\Oberon.g:1:220: CALL
                {
                mCALL(); 

                }
                break;
            case 37 :
                // D:\\Projects UVA\\Oberon.g:1:225: CALL_READ
                {
                mCALL_READ(); 

                }
                break;
            case 38 :
                // D:\\Projects UVA\\Oberon.g:1:235: CALL_WRITE
                {
                mCALL_WRITE(); 

                }
                break;
            case 39 :
                // D:\\Projects UVA\\Oberon.g:1:246: CALL_WRITELN
                {
                mCALL_WRITELN(); 

                }
                break;
            case 40 :
                // D:\\Projects UVA\\Oberon.g:1:259: CALLVARS
                {
                mCALLVARS(); 

                }
                break;
            case 41 :
                // D:\\Projects UVA\\Oberon.g:1:268: CONST
                {
                mCONST(); 

                }
                break;
            case 42 :
                // D:\\Projects UVA\\Oberon.g:1:274: VAR
                {
                mVAR(); 

                }
                break;
            case 43 :
                // D:\\Projects UVA\\Oberon.g:1:278: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 44 :
                // D:\\Projects UVA\\Oberon.g:1:285: INT_TYPE
                {
                mINT_TYPE(); 

                }
                break;
            case 45 :
                // D:\\Projects UVA\\Oberon.g:1:294: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 46 :
                // D:\\Projects UVA\\Oberon.g:1:300: ID
                {
                mID(); 

                }
                break;
            case 47 :
                // D:\\Projects UVA\\Oberon.g:1:303: INT
                {
                mINT(); 

                }
                break;
            case 48 :
                // D:\\Projects UVA\\Oberon.g:1:307: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\37\1\uffff\1\37\1\uffff\1\45\1\37\3\uffff\2\37\2\uffff"+
        "\4\37\2\uffff\1\64\1\66\5\uffff\4\37\3\uffff\2\37\2\uffff\1\37\1"+
        "\77\1\100\1\101\2\37\1\104\6\37\4\uffff\5\37\1\122\2\37\3\uffff"+
        "\1\125\1\37\1\uffff\4\37\1\134\5\37\1\142\2\37\1\uffff\2\37\1\uffff"+
        "\3\37\1\152\1\153\1\37\1\uffff\2\37\1\160\1\37\1\162\1\uffff\2\37"+
        "\1\165\4\37\2\uffff\1\172\1\173\1\175\1\37\1\uffff\1\177\1\uffff"+
        "\1\u0080\1\u0081\1\uffff\4\37\2\uffff\1\37\1\uffff\1\37\3\uffff"+
        "\3\37\1\u008b\1\u008c\4\37\2\uffff\1\u0091\1\u0092\1\37\1\u0094"+
        "\2\uffff\1\37\1\uffff\1\37\1\u0097\1\uffff";
    static final String DFA4_eofS =
        "\u0098\uffff";
    static final String DFA4_minS =
        "\1\11\1\117\1\uffff\1\105\1\uffff\1\75\1\122\3\uffff\1\106\1\105"+
        "\2\uffff\1\106\1\110\1\114\1\110\2\uffff\2\75\5\uffff\1\101\1\145"+
        "\1\101\1\122\3\uffff\1\104\1\107\2\uffff\1\117\3\60\1\126\1\103"+
        "\1\60\1\120\1\105\1\123\1\104\1\111\1\151\4\uffff\1\114\1\116\1"+
        "\141\2\122\1\60\1\111\1\103\3\uffff\1\60\1\114\1\uffff\1\125\1\105"+
        "\1\116\1\105\1\60\1\114\1\164\1\114\1\123\1\144\1\60\1\101\1\114"+
        "\1\uffff\1\116\1\105\1\uffff\1\101\1\124\1\107\2\60\1\106\1\uffff"+
        "\1\105\1\145\1\60\1\124\1\60\1\uffff\1\131\1\105\1\60\1\104\1\122"+
        "\1\126\1\105\2\uffff\3\60\1\101\1\uffff\1\60\1\uffff\2\60\1\uffff"+
        "\1\125\2\101\1\122\2\uffff\1\156\1\uffff\1\122\3\uffff\1\122\1\124"+
        "\1\122\2\60\1\123\1\105\1\111\1\123\2\uffff\2\60\1\117\1\60\2\uffff"+
        "\1\116\1\uffff\1\123\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\176\1\117\1\uffff\1\105\1\uffff\1\75\1\122\3\uffff\1\122\1\117"+
        "\2\uffff\1\116\1\110\1\116\1\162\2\uffff\2\75\5\uffff\1\117\1\145"+
        "\1\101\1\122\3\uffff\1\104\1\107\2\uffff\1\117\3\172\1\126\1\103"+
        "\1\172\1\124\1\105\1\123\1\104\1\111\1\151\4\uffff\1\114\1\116\1"+
        "\141\2\122\1\172\1\111\1\103\3\uffff\1\172\1\114\1\uffff\1\125\1"+
        "\105\1\116\1\111\1\172\1\114\1\164\1\114\1\123\1\144\1\172\1\101"+
        "\1\114\1\uffff\1\116\1\105\1\uffff\1\101\1\124\1\107\2\172\1\106"+
        "\1\uffff\1\105\1\145\1\172\1\124\1\172\1\uffff\1\131\1\105\1\172"+
        "\1\104\1\122\1\126\1\105\2\uffff\3\172\1\101\1\uffff\1\172\1\uffff"+
        "\2\172\1\uffff\1\125\2\101\1\122\2\uffff\1\156\1\uffff\1\122\3\uffff"+
        "\1\122\1\124\1\122\2\172\1\123\1\105\1\111\1\123\2\uffff\2\172\1"+
        "\117\1\172\2\uffff\1\116\1\uffff\1\123\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\2\uffff\1\7\1\10\1\11\2\uffff\1\14\1\15"+
        "\4\uffff\1\24\1\25\2\uffff\1\32\1\33\1\34\1\37\1\41\4\uffff\1\56"+
        "\1\57\1\60\2\uffff\1\53\1\5\15\uffff\1\27\1\26\1\31\1\30\10\uffff"+
        "\1\12\1\40\1\13\2\uffff\1\16\15\uffff\1\36\2\uffff\1\35\6\uffff"+
        "\1\22\5\uffff\1\52\7\uffff\1\17\1\20\4\uffff\1\44\1\uffff\1\45\2"+
        "\uffff\1\3\4\uffff\1\21\1\23\1\uffff\1\46\1\uffff\1\51\1\55\1\1"+
        "\11\uffff\1\54\1\47\4\uffff\1\50\1\6\1\uffff\1\43\2\uffff\1\42";
    static final String DFA4_specialS =
        "\u0098\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\41\1\uffff\2\41\22\uffff\1\41\2\uffff\1\23\2\uffff\1\31"+
            "\1\uffff\1\7\1\10\1\30\1\27\1\11\1\26\1\4\1\uffff\12\40\1\5"+
            "\1\2\1\24\1\22\1\25\2\uffff\1\36\1\3\1\33\1\13\1\20\3\37\1\16"+
            "\3\37\1\1\1\37\1\12\1\6\1\37\1\34\1\37\1\17\1\37\1\35\1\21\3"+
            "\37\1\14\1\uffff\1\15\1\uffff\1\37\1\uffff\32\37\3\uffff\1\32",
            "\1\42",
            "",
            "\1\43",
            "",
            "\1\44",
            "\1\46",
            "",
            "",
            "",
            "\1\47\13\uffff\1\50",
            "\1\53\3\uffff\1\52\5\uffff\1\51",
            "",
            "",
            "\1\54\7\uffff\1\55",
            "\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\51\uffff\1\62",
            "",
            "",
            "\1\63",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "\1\67\15\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "",
            "",
            "\1\76",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\102",
            "\1\103",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\105\3\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\37\7\uffff\24\37\1\121\5\37\4\uffff\1\37\1\uffff\32\37",
            "\1\123",
            "\1\124",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132\3\uffff\1\133",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\154",
            "",
            "\1\155",
            "\1\156",
            "\12\37\7\uffff\25\37\1\157\4\37\4\uffff\1\37\1\uffff\32\37",
            "\1\161",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\163",
            "\1\164",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\13\37\1\174\16\37\4\uffff\1\37\1\uffff\32\37",
            "\1\176",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "",
            "\1\u0087",
            "",
            "",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0093",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u0095",
            "",
            "\1\u0096",
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
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | IF | THEN | ELSE | ELSIF | END | WHILE | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | CALLVARS | CONST | VAR | ASSIGN | INT_TYPE | ARRAY | ID | INT | WHITESPACE );";
        }
    }
 

}