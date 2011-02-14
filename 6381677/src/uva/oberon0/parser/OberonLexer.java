// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g 2011-02-14 15:55:22

package uva.oberon0.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OberonLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
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
    public static final int WITH=14;
    public static final int BEGIN=15;
    public static final int END=16;
    public static final int DO=17;
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
    public static final int ASSIGN=38;
    public static final int INTEGER=39;
    public static final int BOOLEAN=40;
    public static final int TRUE=41;
    public static final int FALSE=42;
    public static final int ARRAY=43;
    public static final int RECORD=44;
    public static final int OF=45;
    public static final int ID=46;
    public static final int INT=47;
    public static final int WHITESPACE=48;

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

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

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

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:29:6: ( 'WITH' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:29:8: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:31:7: ( 'BEGIN' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:31:9: 'BEGIN'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:32:5: ( 'END' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:32:7: 'END'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:33:4: ( 'DO' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:33:6: 'DO'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:35:7: ( '=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:35:9: '='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:36:9: ( '#' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:36:11: '#'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:37:6: ( '<' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:37:8: '<'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:39:2: ( '<=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:39:4: '<='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:40:7: ( '>' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:40:9: '>'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:42:2: ( '>=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:42:4: '>='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:44:5: ( '-' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:44:7: '-'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:45:6: ( '+' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:45:8: '+'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:46:5: ( '*' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:46:7: '*'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:47:5: ( 'DIV' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:47:7: 'DIV'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:48:5: ( 'MOD' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:48:7: 'MOD'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:50:5: ( '&' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:50:7: '&'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:51:4: ( 'OR' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:51:6: 'OR'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:52:5: ( '~' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:52:7: '~'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:55:2: ( 'DECLARATIONS' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:55:4: 'DECLARATIONS'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:57:2: ( 'INPUTVARS' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:57:4: 'INPUTVARS'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:58:6: ( 'CALL' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:58:8: 'CALL'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:60:2: ( 'Read' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:60:4: 'Read'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:62:2: ( 'Write' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:62:4: 'Write'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:64:2: ( 'WriteLn' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:64:4: 'WriteLn'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:66:8: ( ':=' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:66:10: ':='
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:68:9: ( 'INTEGER' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:68:11: 'INTEGER'
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

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:69:9: ( 'BOOLEAN' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:69:11: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:70:6: ( 'TRUE' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:70:8: 'TRUE'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:71:7: ( 'FALSE' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:71:9: 'FALSE'
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

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:72:7: ( 'ARRAY' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:72:9: 'ARRAY'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:73:8: ( 'RECORD' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:73:10: 'RECORD'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:74:4: ( 'OF' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:74:6: 'OF'
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:244:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:244:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:244:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:245:7: ( ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+ )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:245:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:245:9: ( '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' )+
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
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:247:8: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:247:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:247:16: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
        // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:8: ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | MODULE | PROCEDURE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | WHILE | WITH | BEGIN | END | DO | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | ASSIGN | INTEGER | BOOLEAN | TRUE | FALSE | ARRAY | RECORD | OF | ID | INT | WHITESPACE )
        int alt4=53;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:10: T__49
                {
                mT__49(); 

                }
                break;
            case 2 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:16: T__50
                {
                mT__50(); 

                }
                break;
            case 3 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:22: T__51
                {
                mT__51(); 

                }
                break;
            case 4 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:28: T__52
                {
                mT__52(); 

                }
                break;
            case 5 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:34: T__53
                {
                mT__53(); 

                }
                break;
            case 6 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:40: T__54
                {
                mT__54(); 

                }
                break;
            case 7 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:46: T__55
                {
                mT__55(); 

                }
                break;
            case 8 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:52: T__56
                {
                mT__56(); 

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
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:115: WITH
                {
                mWITH(); 

                }
                break;
            case 20 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:120: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 21 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:126: END
                {
                mEND(); 

                }
                break;
            case 22 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:130: DO
                {
                mDO(); 

                }
                break;
            case 23 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:133: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 24 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:139: UNEQUAL
                {
                mUNEQUAL(); 

                }
                break;
            case 25 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:147: LESS
                {
                mLESS(); 

                }
                break;
            case 26 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:152: LESS_EQUAL
                {
                mLESS_EQUAL(); 

                }
                break;
            case 27 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:163: GREAT
                {
                mGREAT(); 

                }
                break;
            case 28 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:169: GREAT_EQUAL
                {
                mGREAT_EQUAL(); 

                }
                break;
            case 29 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:181: MIN
                {
                mMIN(); 

                }
                break;
            case 30 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:185: PLUS
                {
                mPLUS(); 

                }
                break;
            case 31 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:190: MUL
                {
                mMUL(); 

                }
                break;
            case 32 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:194: DIV
                {
                mDIV(); 

                }
                break;
            case 33 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:198: MOD
                {
                mMOD(); 

                }
                break;
            case 34 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:202: AND
                {
                mAND(); 

                }
                break;
            case 35 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:206: OR
                {
                mOR(); 

                }
                break;
            case 36 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:209: NOT
                {
                mNOT(); 

                }
                break;
            case 37 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:213: DECLARATIONS
                {
                mDECLARATIONS(); 

                }
                break;
            case 38 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:226: INPUTVARS
                {
                mINPUTVARS(); 

                }
                break;
            case 39 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:236: CALL
                {
                mCALL(); 

                }
                break;
            case 40 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:241: CALL_READ
                {
                mCALL_READ(); 

                }
                break;
            case 41 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:251: CALL_WRITE
                {
                mCALL_WRITE(); 

                }
                break;
            case 42 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:262: CALL_WRITELN
                {
                mCALL_WRITELN(); 

                }
                break;
            case 43 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:275: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 44 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:282: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 45 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:290: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 46 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:298: TRUE
                {
                mTRUE(); 

                }
                break;
            case 47 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:303: FALSE
                {
                mFALSE(); 

                }
                break;
            case 48 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:309: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 49 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:315: RECORD
                {
                mRECORD(); 

                }
                break;
            case 50 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:322: OF
                {
                mOF(); 

                }
                break;
            case 51 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:325: ID
                {
                mID(); 

                }
                break;
            case 52 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:328: INT
                {
                mINT(); 

                }
                break;
            case 53 :
                // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:1:332: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\3\uffff\1\44\5\uffff\12\40\2\uffff\1\72\1\74\4\uffff\1\40\1\uffff"+
        "\3\40\5\uffff\10\40\1\113\10\40\1\125\2\40\4\uffff\1\130\1\131\4"+
        "\40\1\137\3\40\1\143\3\40\1\uffff\3\40\1\153\5\40\1\uffff\1\161"+
        "\1\40\2\uffff\5\40\1\uffff\2\40\1\172\1\uffff\1\173\1\174\1\175"+
        "\2\40\1\u0080\1\40\1\uffff\1\40\1\u0083\3\40\1\uffff\1\40\1\u0088"+
        "\5\40\1\u008e\4\uffff\2\40\1\uffff\1\u0091\1\u0092\1\uffff\1\u0094"+
        "\1\u0095\2\40\1\uffff\1\40\1\u0099\1\u009a\1\u009b\1\40\1\uffff"+
        "\2\40\2\uffff\1\40\2\uffff\2\40\1\u00a2\3\uffff\2\40\1\u00a5\1\u00a6"+
        "\1\u00a7\1\40\1\uffff\2\40\3\uffff\1\40\1\u00ac\1\u00ad\1\40\2\uffff"+
        "\2\40\1\u00b1\1\uffff";
    static final String DFA4_eofS =
        "\u00b2\uffff";
    static final String DFA4_minS =
        "\1\11\2\uffff\1\75\5\uffff\1\117\1\122\2\101\1\110\1\106\1\114"+
        "\1\110\2\105\2\uffff\2\75\4\uffff\1\106\1\uffff\1\105\1\101\1\122"+
        "\5\uffff\1\104\1\117\1\116\1\114\1\122\1\120\1\105\1\125\1\60\1"+
        "\120\1\123\1\104\1\111\1\124\1\151\1\107\1\117\1\60\1\126\1\103"+
        "\4\uffff\2\60\1\141\1\103\1\114\1\122\1\60\1\103\1\123\1\114\1\60"+
        "\1\105\1\116\1\105\1\uffff\1\125\2\105\1\60\1\114\1\110\1\164\1"+
        "\111\1\114\1\uffff\1\60\1\114\2\uffff\1\144\1\117\1\123\1\101\1"+
        "\114\1\uffff\1\105\1\124\1\60\1\uffff\3\60\1\124\1\107\1\60\1\106"+
        "\1\uffff\1\105\1\60\1\145\1\116\1\105\1\uffff\1\101\1\60\1\122\1"+
        "\105\1\131\1\105\1\104\1\60\4\uffff\1\126\1\105\1\uffff\2\60\1\uffff"+
        "\2\60\1\101\1\122\1\uffff\1\104\3\60\1\125\1\uffff\1\101\1\122\2"+
        "\uffff\1\156\2\uffff\1\116\1\101\1\60\3\uffff\2\122\3\60\1\124\1"+
        "\uffff\1\105\1\123\3\uffff\1\111\2\60\1\117\2\uffff\1\116\1\123"+
        "\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\176\2\uffff\1\75\5\uffff\1\117\1\122\1\117\1\101\1\131\2\116"+
        "\1\162\2\117\2\uffff\2\75\4\uffff\1\122\1\uffff\1\145\1\101\1\122"+
        "\5\uffff\1\104\1\117\1\116\1\114\1\122\1\120\1\105\1\125\1\172\1"+
        "\124\1\123\1\104\1\111\1\124\1\151\1\107\1\117\1\172\1\126\1\103"+
        "\4\uffff\2\172\1\141\1\103\1\114\1\122\1\172\1\103\1\123\1\114\1"+
        "\172\1\105\1\116\1\105\1\uffff\1\125\1\105\1\111\1\172\1\114\1\110"+
        "\1\164\1\111\1\114\1\uffff\1\172\1\114\2\uffff\1\144\1\117\1\123"+
        "\1\101\1\114\1\uffff\1\105\1\124\1\172\1\uffff\3\172\1\124\1\107"+
        "\1\172\1\106\1\uffff\1\105\1\172\1\145\1\116\1\105\1\uffff\1\101"+
        "\1\172\1\122\1\105\1\131\1\105\1\104\1\172\4\uffff\1\126\1\105\1"+
        "\uffff\2\172\1\uffff\2\172\1\101\1\122\1\uffff\1\104\3\172\1\125"+
        "\1\uffff\1\101\1\122\2\uffff\1\156\2\uffff\1\116\1\101\1\172\3\uffff"+
        "\2\122\3\172\1\124\1\uffff\1\105\1\123\3\uffff\1\111\2\172\1\117"+
        "\2\uffff\1\116\1\123\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\12\uffff\1\27\1\30"+
        "\2\uffff\1\35\1\36\1\37\1\42\1\uffff\1\44\3\uffff\1\63\1\64\1\65"+
        "\1\53\1\3\24\uffff\1\32\1\31\1\34\1\33\16\uffff\1\16\11\uffff\1"+
        "\26\2\uffff\1\43\1\62\5\uffff\1\41\3\uffff\1\14\7\uffff\1\25\5\uffff"+
        "\1\40\10\uffff\1\47\1\15\1\17\1\56\2\uffff\1\20\2\uffff\1\23\4\uffff"+
        "\1\50\5\uffff\1\13\2\uffff\1\21\1\22\1\uffff\1\51\1\24\3\uffff\1"+
        "\57\1\60\1\11\6\uffff\1\61\2\uffff\1\54\1\52\1\55\4\uffff\1\12\1"+
        "\46\3\uffff\1\45";
    static final String DFA4_specialS =
        "\u00b2\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\42\1\uffff\2\42\22\uffff\1\42\2\uffff\1\24\2\uffff\1\32"+
            "\1\uffff\1\4\1\5\1\31\1\30\1\6\1\27\1\2\1\uffff\12\41\1\3\1"+
            "\1\1\25\1\23\1\26\2\uffff\1\37\1\21\1\13\1\22\1\17\1\36\2\40"+
            "\1\16\3\40\1\11\1\40\1\33\1\12\1\40\1\35\1\40\1\15\1\40\1\14"+
            "\1\20\3\40\1\7\1\uffff\1\10\1\uffff\1\40\1\uffff\32\40\3\uffff"+
            "\1\34",
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\50\15\uffff\1\47",
            "\1\51",
            "\1\53\11\uffff\1\54\6\uffff\1\52",
            "\1\55\7\uffff\1\56",
            "\1\57\1\uffff\1\60",
            "\1\61\1\62\50\uffff\1\63",
            "\1\64\11\uffff\1\65",
            "\1\70\3\uffff\1\67\5\uffff\1\66",
            "",
            "",
            "\1\71",
            "\1\73",
            "",
            "",
            "",
            "",
            "\1\76\13\uffff\1\75",
            "",
            "\1\100\37\uffff\1\77",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\114\3\uffff\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\40\7\uffff\24\40\1\136\5\40\4\uffff\1\40\1\uffff\32\40",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151\3\uffff\1\152",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\162",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "\1\170",
            "\1\171",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\176",
            "\1\177",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0081",
            "",
            "\1\u0082",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\13\40\1\u0093\16\40\4\uffff\1\40\1\uffff\32"+
            "\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "",
            "",
            "\1\u009f",
            "",
            "",
            "\1\u00a0",
            "\1\u00a1",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "",
            "",
            "\1\u00ab",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ae",
            "",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
            return "1:1: Tokens : ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | MODULE | PROCEDURE | CONST | VAR | TYPE | IF | THEN | ELSE | ELSIF | WHILE | WITH | BEGIN | END | DO | EQUAL | UNEQUAL | LESS | LESS_EQUAL | GREAT | GREAT_EQUAL | MIN | PLUS | MUL | DIV | MOD | AND | OR | NOT | DECLARATIONS | INPUTVARS | CALL | CALL_READ | CALL_WRITE | CALL_WRITELN | ASSIGN | INTEGER | BOOLEAN | TRUE | FALSE | ARRAY | RECORD | OF | ID | INT | WHITESPACE );";
        }
    }
 

}