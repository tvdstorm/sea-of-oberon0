// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g 2011-02-06 16:36:00

package uva.oberon0.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
    public static final int MODULE=4;
    public static final int PROCEDURE=5;
    public static final int CONST=6;
    public static final int VAR=7;
    public static final int TYPE=8;
    public static final int IF=9;
    public static final int THEN=10;
    public static final int ELSE=11;
    public static final int ELSIF=12;
    public static final int WHILE=13;
    public static final int BEGIN=14;
    public static final int END=15;
    public static final int DO=16;
    public static final int EQUAL=17;
    public static final int UNEQUAL=18;
    public static final int LESS=19;
    public static final int LESS_EQUAL=20;
    public static final int GREAT=21;
    public static final int GREAT_EQUAL=22;
    public static final int MIN=23;
    public static final int PLUS=24;
    public static final int MUL=25;
    public static final int DIV=26;
    public static final int MOD=27;
    public static final int AND=28;
    public static final int OR=29;
    public static final int NOT=30;
    public static final int DECLARATIONS=31;
    public static final int INPUTVARS=32;
    public static final int CALL=33;
    public static final int CALL_READ=34;
    public static final int CALL_WRITE=35;
    public static final int CALL_WRITELN=36;
    public static final int ASSIGN=37;
    public static final int INTEGER=38;
    public static final int ARRAY=39;
    public static final int RECORD=40;
    public static final int OF=41;
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
    public String getGrammarFileName() { return "D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g"; }

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:7:7: ( ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:7:9: ';'
            {
            match(';'); 

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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:8:7: ( '.' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:8:9: '.'
            {
            match('.'); 

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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:9:7: ( ':' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:9:9: ':'
            {
            match(':'); 

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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:10:7: ( '(' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:10:9: '('
            {
            match('('); 

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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:11:7: ( ')' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:11:9: ')'
            {
            match(')'); 

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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:12:7: ( ',' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:12:9: ','
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:13:7: ( '[' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:13:9: '['
            {
            match('['); 

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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:14:7: ( ']' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:17:8: ( 'MODULE' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:17:10: 'MODULE'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:19:2: ( 'PROCEDURE' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:19:4: 'PROCEDURE'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:20:7: ( 'CONST' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:20:9: 'CONST'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:21:5: ( 'VAR' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:21:7: 'VAR'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:22:6: ( 'TYPE' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:22:8: 'TYPE'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:24:4: ( 'IF' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:24:6: 'IF'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:25:6: ( 'THEN' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:25:8: 'THEN'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:26:6: ( 'ELSE' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:26:8: 'ELSE'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:27:9: ( 'ELSIF' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:27:14: 'ELSIF'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:28:7: ( 'WHILE' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:28:9: 'WHILE'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:30:7: ( 'BEGIN' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:30:9: 'BEGIN'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:31:5: ( 'END' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:31:7: 'END'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:32:4: ( 'DO' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:32:6: 'DO'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:34:7: ( '=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:34:9: '='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:35:9: ( '#' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:35:11: '#'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:36:6: ( '<' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:36:8: '<'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:38:2: ( '<=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:38:4: '<='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:39:7: ( '>' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:39:9: '>'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:41:2: ( '>=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:41:4: '>='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:43:5: ( '-' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:43:7: '-'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:44:6: ( '+' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:44:8: '+'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:45:5: ( '*' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:45:7: '*'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:46:5: ( 'DIV' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:46:7: 'DIV'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:47:5: ( 'MOD' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:47:7: 'MOD'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:49:5: ( '&' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:49:7: '&'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:50:4: ( 'OR' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:50:6: 'OR'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:51:5: ( '~' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:51:7: '~'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:54:2: ( 'DECLARATIONS' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:54:4: 'DECLARATIONS'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:56:2: ( 'INPUTVARS' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:56:4: 'INPUTVARS'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:57:6: ( 'CALL' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:57:8: 'CALL'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:59:2: ( 'Read' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:59:4: 'Read'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:61:2: ( 'Write' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:61:4: 'Write'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:63:2: ( 'WriteLn' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:63:4: 'WriteLn'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:65:8: ( ':=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:65:10: ':='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:67:9: ( 'INTEGER' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:67:11: 'INTEGER'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:68:7: ( 'ARRAY' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:68:9: 'ARRAY'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:69:8: ( 'RECORD' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:69:10: 'RECORD'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:70:4: ( 'OF' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:70:6: 'OF'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:230:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:230:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:230:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:231:7: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+ )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:231:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:231:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
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
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:233:8: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:233:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:233:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:
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
        // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:8: ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | MODULE | PROCEDURE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | WHILE | BEGIN | END | DO | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | ASSIGN | INTEGER | ARRAY | RECORD | OF | ID | INT | WHITESPACE )
        int alt4=49;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:10: T__45
                {
                mT__45(); 

                }
                break;
            case 2 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:16: T__46
                {
                mT__46(); 

                }
                break;
            case 3 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:22: T__47
                {
                mT__47(); 

                }
                break;
            case 4 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:28: T__48
                {
                mT__48(); 

                }
                break;
            case 5 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:34: T__49
                {
                mT__49(); 

                }
                break;
            case 6 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:40: T__50
                {
                mT__50(); 

                }
                break;
            case 7 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:46: T__51
                {
                mT__51(); 

                }
                break;
            case 8 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:52: T__52
                {
                mT__52(); 

                }
                break;
            case 9 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:58: MODULE
                {
                mMODULE(); 

                }
                break;
            case 10 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:65: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 11 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:75: CONST
                {
                mCONST(); 

                }
                break;
            case 12 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:81: VAR
                {
                mVAR(); 

                }
                break;
            case 13 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:85: TYPE
                {
                mTYPE(); 

                }
                break;
            case 14 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:90: IF
                {
                mIF(); 

                }
                break;
            case 15 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:93: THEN
                {
                mTHEN(); 

                }
                break;
            case 16 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:98: ELSE
                {
                mELSE(); 

                }
                break;
            case 17 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:103: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 18 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:109: WHILE
                {
                mWHILE(); 

                }
                break;
            case 19 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:115: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 20 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:121: END
                {
                mEND(); 

                }
                break;
            case 21 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:125: DO
                {
                mDO(); 

                }
                break;
            case 22 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:128: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 23 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:134: UNEQUAL
                {
                mUNEQUAL(); 

                }
                break;
            case 24 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:142: LESS
                {
                mLESS(); 

                }
                break;
            case 25 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:147: LESS_EQUAL
                {
                mLESS_EQUAL(); 

                }
                break;
            case 26 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:158: GREAT
                {
                mGREAT(); 

                }
                break;
            case 27 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:164: GREAT_EQUAL
                {
                mGREAT_EQUAL(); 

                }
                break;
            case 28 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:176: MIN
                {
                mMIN(); 

                }
                break;
            case 29 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:180: PLUS
                {
                mPLUS(); 

                }
                break;
            case 30 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:185: MUL
                {
                mMUL(); 

                }
                break;
            case 31 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:189: DIV
                {
                mDIV(); 

                }
                break;
            case 32 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:193: MOD
                {
                mMOD(); 

                }
                break;
            case 33 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:197: AND
                {
                mAND(); 

                }
                break;
            case 34 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:201: OR
                {
                mOR(); 

                }
                break;
            case 35 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:204: NOT
                {
                mNOT(); 

                }
                break;
            case 36 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:208: DECLARATIONS
                {
                mDECLARATIONS(); 

                }
                break;
            case 37 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:221: INPUTVARS
                {
                mINPUTVARS(); 

                }
                break;
            case 38 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:231: CALL
                {
                mCALL(); 

                }
                break;
            case 39 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:236: CALL_READ
                {
                mCALL_READ(); 

                }
                break;
            case 40 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:246: CALL_WRITE
                {
                mCALL_WRITE(); 

                }
                break;
            case 41 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:257: CALL_WRITELN
                {
                mCALL_WRITELN(); 

                }
                break;
            case 42 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:270: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 43 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:277: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 44 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:285: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 45 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:291: RECORD
                {
                mRECORD(); 

                }
                break;
            case 46 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:298: OF
                {
                mOF(); 

                }
                break;
            case 47 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:301: ID
                {
                mID(); 

                }
                break;
            case 48 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:304: INT
                {
                mINT(); 

                }
                break;
            case 49 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:308: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\3\uffff\1\43\5\uffff\12\37\2\uffff\1\66\1\70\4\uffff\1\37\1\uffff"+
        "\2\37\5\uffff\7\37\1\105\6\37\1\115\2\37\4\uffff\1\120\1\121\3\37"+
        "\1\126\3\37\1\132\2\37\1\uffff\3\37\1\141\3\37\1\uffff\1\145\1\37"+
        "\2\uffff\4\37\1\uffff\2\37\1\155\1\uffff\1\156\1\157\2\37\1\162"+
        "\1\37\1\uffff\3\37\1\uffff\1\37\1\170\4\37\1\175\3\uffff\2\37\1"+
        "\uffff\1\u0080\1\u0081\1\u0083\1\u0084\1\37\1\uffff\1\37\1\u0087"+
        "\1\u0088\1\37\1\uffff\2\37\2\uffff\1\37\2\uffff\1\37\1\u008e\2\uffff"+
        "\2\37\1\u0091\1\u0092\1\37\1\uffff\2\37\2\uffff\1\37\1\u0097\1\u0098"+
        "\1\37\2\uffff\2\37\1\u009c\1\uffff";
    static final String DFA4_eofS =
        "\u009d\uffff";
    static final String DFA4_minS =
        "\1\11\2\uffff\1\75\5\uffff\1\117\1\122\2\101\1\110\1\106\1\114"+
        "\1\110\2\105\2\uffff\2\75\4\uffff\1\106\1\uffff\1\105\1\122\5\uffff"+
        "\1\104\1\117\1\116\1\114\1\122\1\120\1\105\1\60\1\120\1\123\1\104"+
        "\1\111\1\151\1\107\1\60\1\126\1\103\4\uffff\2\60\1\141\1\103\1\122"+
        "\1\60\1\103\1\123\1\114\1\60\1\105\1\116\1\uffff\1\125\2\105\1\60"+
        "\1\114\1\164\1\111\1\uffff\1\60\1\114\2\uffff\1\144\1\117\1\101"+
        "\1\114\1\uffff\1\105\1\124\1\60\1\uffff\2\60\1\124\1\107\1\60\1"+
        "\106\1\uffff\1\105\1\145\1\116\1\uffff\1\101\1\60\1\122\1\131\1"+
        "\105\1\104\1\60\3\uffff\1\126\1\105\1\uffff\4\60\1\122\1\uffff\1"+
        "\104\2\60\1\125\1\uffff\1\101\1\122\2\uffff\1\156\2\uffff\1\101"+
        "\1\60\2\uffff\2\122\2\60\1\124\1\uffff\1\105\1\123\2\uffff\1\111"+
        "\2\60\1\117\2\uffff\1\116\1\123\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\176\2\uffff\1\75\5\uffff\1\117\1\122\1\117\1\101\1\131\2\116"+
        "\1\162\1\105\1\117\2\uffff\2\75\4\uffff\1\122\1\uffff\1\145\1\122"+
        "\5\uffff\1\104\1\117\1\116\1\114\1\122\1\120\1\105\1\172\1\124\1"+
        "\123\1\104\1\111\1\151\1\107\1\172\1\126\1\103\4\uffff\2\172\1\141"+
        "\1\103\1\122\1\172\1\103\1\123\1\114\1\172\1\105\1\116\1\uffff\1"+
        "\125\1\105\1\111\1\172\1\114\1\164\1\111\1\uffff\1\172\1\114\2\uffff"+
        "\1\144\1\117\1\101\1\114\1\uffff\1\105\1\124\1\172\1\uffff\2\172"+
        "\1\124\1\107\1\172\1\106\1\uffff\1\105\1\145\1\116\1\uffff\1\101"+
        "\1\172\1\122\1\131\1\105\1\104\1\172\3\uffff\1\126\1\105\1\uffff"+
        "\4\172\1\122\1\uffff\1\104\2\172\1\125\1\uffff\1\101\1\122\2\uffff"+
        "\1\156\2\uffff\1\101\1\172\2\uffff\2\122\2\172\1\124\1\uffff\1\105"+
        "\1\123\2\uffff\1\111\2\172\1\117\2\uffff\1\116\1\123\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\12\uffff\1\26\1\27"+
        "\2\uffff\1\34\1\35\1\36\1\41\1\uffff\1\43\2\uffff\1\57\1\60\1\61"+
        "\1\52\1\3\21\uffff\1\31\1\30\1\33\1\32\14\uffff\1\16\7\uffff\1\25"+
        "\2\uffff\1\42\1\56\4\uffff\1\40\3\uffff\1\14\6\uffff\1\24\3\uffff"+
        "\1\37\7\uffff\1\46\1\15\1\17\2\uffff\1\20\5\uffff\1\47\4\uffff\1"+
        "\13\2\uffff\1\21\1\22\1\uffff\1\50\1\23\2\uffff\1\54\1\11\5\uffff"+
        "\1\55\2\uffff\1\53\1\51\4\uffff\1\12\1\45\3\uffff\1\44";
    static final String DFA4_specialS =
        "\u009d\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\41\1\uffff\2\41\22\uffff\1\41\2\uffff\1\24\2\uffff\1\32"+
            "\1\uffff\1\4\1\5\1\31\1\30\1\6\1\27\1\2\1\uffff\12\40\1\3\1"+
            "\1\1\25\1\23\1\26\2\uffff\1\36\1\21\1\13\1\22\1\17\3\37\1\16"+
            "\3\37\1\11\1\37\1\33\1\12\1\37\1\35\1\37\1\15\1\37\1\14\1\20"+
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
            "\1\52\20\uffff\1\51",
            "\1\53\7\uffff\1\54",
            "\1\55\1\uffff\1\56",
            "\1\57\51\uffff\1\60",
            "\1\61",
            "\1\64\3\uffff\1\63\5\uffff\1\62",
            "",
            "",
            "\1\65",
            "\1\67",
            "",
            "",
            "",
            "",
            "\1\72\13\uffff\1\71",
            "",
            "\1\74\37\uffff\1\73",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\106\3\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\37\7\uffff\24\37\1\125\5\37\4\uffff\1\37\1\uffff\32\37",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "\1\137\3\uffff\1\140",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\160",
            "\1\161",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\163",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\167",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "\1\176",
            "\1\177",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\13\37\1\u0082\16\37\4\uffff\1\37\1\uffff\32"+
            "\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0085",
            "",
            "\1\u0086",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0089",
            "",
            "\1\u008a",
            "\1\u008b",
            "",
            "",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0099",
            "",
            "",
            "\1\u009a",
            "\1\u009b",
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
            return "1:1: Tokens : ( T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | MODULE | PROCEDURE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | WHILE | BEGIN | END | DO | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | ASSIGN | INTEGER | ARRAY | RECORD | OF | ID | INT | WHITESPACE );";
        }
    }
 

}