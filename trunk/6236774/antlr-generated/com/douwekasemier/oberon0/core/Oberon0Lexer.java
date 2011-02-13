// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g 2011-02-13 17:23:48

  package com.douwekasemier.oberon0.core;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int MODULE=4;
    public static final int BEGIN=5;
    public static final int END=6;
    public static final int CONST=7;
    public static final int TYPE=8;
    public static final int VAR=9;
    public static final int ARRAY=10;
    public static final int RECORD=11;
    public static final int PROCEDURE=12;
    public static final int WHILE=13;
    public static final int IF=14;
    public static final int THEN=15;
    public static final int ELSIF=16;
    public static final int ELSE=17;
    public static final int EQUALS=18;
    public static final int NOT_EQUALS=19;
    public static final int GT=20;
    public static final int GTE=21;
    public static final int LT=22;
    public static final int LTE=23;
    public static final int PLUS=24;
    public static final int MINUS=25;
    public static final int OR=26;
    public static final int NOT=27;
    public static final int MULT=28;
    public static final int DIV=29;
    public static final int MOD=30;
    public static final int AND=31;
    public static final int CONSTANTS=32;
    public static final int VARIABLES=33;
    public static final int TYPES=34;
    public static final int PROCEDURES=35;
    public static final int MODULEBODY=36;
    public static final int PROCEDUREBODY=37;
    public static final int FORMALPARAMETER=38;
    public static final int FORMALPARAMETERS=39;
    public static final int ASSIGN=40;
    public static final int ACTUALPARAMETERS=41;
    public static final int CALL=42;
    public static final int IDENT_SELECT=43;
    public static final int SELECTORS=44;
    public static final int RECORDSELECTOR=45;
    public static final int ARRAYSELECTOR=46;
    public static final int IDENT=47;
    public static final int EXPRESSION=48;
    public static final int LITERAL=49;
    public static final int DECLARATIONS=50;
    public static final int STATEMENTS=51;
    public static final int IFSTATEMENT=52;
    public static final int FIELD=53;
    public static final int IDENTIFIER=54;
    public static final int INTEGER=55;
    public static final int WHITESPACE=56;

    // delegates
    // delegators

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g"; }

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:11:8: ( 'MODULE' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:11:10: 'MODULE'
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

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:12:7: ( 'BEGIN' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:12:9: 'BEGIN'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:13:5: ( 'END' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:13:7: 'END'
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

    // $ANTLR start "CONST"
    public final void mCONST() throws RecognitionException {
        try {
            int _type = CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:14:7: ( 'CONST' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:14:9: 'CONST'
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

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:15:6: ( 'TYPE' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:15:8: 'TYPE'
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

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:16:5: ( 'VAR' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:16:7: 'VAR'
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

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:17:7: ( 'ARRAY' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:17:9: 'ARRAY'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:18:8: ( 'RECORD' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:18:10: 'RECORD'
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

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:19:11: ( 'PROCEDURE' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:19:13: 'PROCEDURE'
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

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:20:7: ( 'WHILE' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:20:9: 'WHILE'
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

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:21:4: ( 'IF' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:21:6: 'IF'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:22:6: ( 'THEN' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:22:8: 'THEN'
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

    // $ANTLR start "ELSIF"
    public final void mELSIF() throws RecognitionException {
        try {
            int _type = ELSIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:23:7: ( 'ELSIF' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:23:9: 'ELSIF'
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

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:24:6: ( 'ELSE' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:24:8: 'ELSE'
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

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:25:8: ( '=' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:25:10: '='
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

    // $ANTLR start "NOT_EQUALS"
    public final void mNOT_EQUALS() throws RecognitionException {
        try {
            int _type = NOT_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:26:12: ( '#' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:26:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUALS"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:27:4: ( '>' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:27:6: '>'
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

    // $ANTLR start "GTE"
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:28:5: ( '>=' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:28:7: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:29:4: ( '<' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:29:6: '<'
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

    // $ANTLR start "LTE"
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:30:5: ( '<=' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:30:7: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:31:6: ( '+' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:31:8: '+'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:32:7: ( '-' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:32:9: '-'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:33:4: ( 'OR' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:33:6: 'OR'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:34:5: ( '~' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:34:7: '~'
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

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:35:6: ( '*' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:35:8: '*'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:36:5: ( 'DIV' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:36:7: 'DIV'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:37:5: ( 'MOD' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:37:7: 'MOD'
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
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:38:5: ( '&' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:38:7: '&'
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

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:39:7: ( ';' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:39:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:40:7: ( '.' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:40:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:41:7: ( '[' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:41:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:42:7: ( ']' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:42:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:43:7: ( '(' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:43:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:44:7: ( ')' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:44:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:45:7: ( ':=' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:45:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:46:7: ( ',' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:46:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:47:7: ( 'DO' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:47:9: 'DO'
            {
            match("DO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:48:7: ( 'OF' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:48:9: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:49:7: ( ':' )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:49:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:285:8: ( ( '0' .. '9' )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:285:10: ( '0' .. '9' )+
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:285:10: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:285:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:286:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:286:13: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:286:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:287:11: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:287:13: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:287:13: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
            	    // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:
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
        // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:8: ( MODULE | BEGIN | END | CONST | TYPE | VAR | ARRAY | RECORD | PROCEDURE | WHILE | IF | THEN | ELSIF | ELSE | EQUALS | NOT_EQUALS | GT | GTE | LT | LTE | PLUS | MINUS | OR | NOT | MULT | DIV | MOD | AND | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | INTEGER | IDENTIFIER | WHITESPACE )
        int alt4=42;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:10: MODULE
                {
                mMODULE(); 

                }
                break;
            case 2 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:17: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 3 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:23: END
                {
                mEND(); 

                }
                break;
            case 4 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:27: CONST
                {
                mCONST(); 

                }
                break;
            case 5 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:33: TYPE
                {
                mTYPE(); 

                }
                break;
            case 6 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:38: VAR
                {
                mVAR(); 

                }
                break;
            case 7 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:42: ARRAY
                {
                mARRAY(); 

                }
                break;
            case 8 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:48: RECORD
                {
                mRECORD(); 

                }
                break;
            case 9 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:55: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 10 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:65: WHILE
                {
                mWHILE(); 

                }
                break;
            case 11 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:71: IF
                {
                mIF(); 

                }
                break;
            case 12 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:74: THEN
                {
                mTHEN(); 

                }
                break;
            case 13 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:79: ELSIF
                {
                mELSIF(); 

                }
                break;
            case 14 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:85: ELSE
                {
                mELSE(); 

                }
                break;
            case 15 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:90: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 16 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:97: NOT_EQUALS
                {
                mNOT_EQUALS(); 

                }
                break;
            case 17 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:108: GT
                {
                mGT(); 

                }
                break;
            case 18 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:111: GTE
                {
                mGTE(); 

                }
                break;
            case 19 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:115: LT
                {
                mLT(); 

                }
                break;
            case 20 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:118: LTE
                {
                mLTE(); 

                }
                break;
            case 21 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:122: PLUS
                {
                mPLUS(); 

                }
                break;
            case 22 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:127: MINUS
                {
                mMINUS(); 

                }
                break;
            case 23 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:133: OR
                {
                mOR(); 

                }
                break;
            case 24 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:136: NOT
                {
                mNOT(); 

                }
                break;
            case 25 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:140: MULT
                {
                mMULT(); 

                }
                break;
            case 26 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:145: DIV
                {
                mDIV(); 

                }
                break;
            case 27 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:149: MOD
                {
                mMOD(); 

                }
                break;
            case 28 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:153: AND
                {
                mAND(); 

                }
                break;
            case 29 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:157: T__57
                {
                mT__57(); 

                }
                break;
            case 30 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:163: T__58
                {
                mT__58(); 

                }
                break;
            case 31 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:169: T__59
                {
                mT__59(); 

                }
                break;
            case 32 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:175: T__60
                {
                mT__60(); 

                }
                break;
            case 33 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:181: T__61
                {
                mT__61(); 

                }
                break;
            case 34 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:187: T__62
                {
                mT__62(); 

                }
                break;
            case 35 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:193: T__63
                {
                mT__63(); 

                }
                break;
            case 36 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:199: T__64
                {
                mT__64(); 

                }
                break;
            case 37 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:205: T__65
                {
                mT__65(); 

                }
                break;
            case 38 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:211: T__66
                {
                mT__66(); 

                }
                break;
            case 39 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:217: T__67
                {
                mT__67(); 

                }
                break;
            case 40 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:223: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 41 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:231: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 42 :
                // C:\\Eclipse\\workspace\\6236774\\src\\com\\douwekasemier\\oberon0\\core\\Oberon0.g:1:242: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\13\40\2\uffff\1\60\1\62\2\uffff\1\40\2\uffff\1\40\7\uffff"+
        "\1\70\4\uffff\14\40\1\105\4\uffff\1\106\1\107\1\40\1\111\2\uffff"+
        "\1\113\1\40\1\115\4\40\1\123\4\40\3\uffff\1\130\1\uffff\1\40\1\uffff"+
        "\1\40\1\uffff\1\40\1\134\1\40\1\136\1\137\1\uffff\4\40\1\uffff\1"+
        "\40\1\145\1\146\1\uffff\1\147\2\uffff\1\150\2\40\1\153\1\154\4\uffff"+
        "\1\155\1\40\3\uffff\2\40\1\161\1\uffff";
    static final String DFA4_eofS =
        "\162\uffff";
    static final String DFA4_minS =
        "\1\11\1\117\1\105\1\114\1\117\1\110\1\101\1\122\1\105\1\122\1\110"+
        "\1\106\2\uffff\2\75\2\uffff\1\106\2\uffff\1\111\7\uffff\1\75\4\uffff"+
        "\1\104\1\107\1\104\1\123\1\116\1\120\1\105\2\122\1\103\1\117\1\111"+
        "\1\60\4\uffff\2\60\1\126\1\60\2\uffff\1\60\1\111\1\60\1\105\1\123"+
        "\1\105\1\116\1\60\1\101\1\117\1\103\1\114\3\uffff\1\60\1\uffff\1"+
        "\114\1\uffff\1\116\1\uffff\1\106\1\60\1\124\2\60\1\uffff\1\131\1"+
        "\122\2\105\1\uffff\1\105\2\60\1\uffff\1\60\2\uffff\1\60\2\104\2"+
        "\60\4\uffff\1\60\1\125\3\uffff\1\122\1\105\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\176\1\117\1\105\1\116\1\117\1\131\1\101\1\122\1\105\1\122\1"+
        "\110\1\106\2\uffff\2\75\2\uffff\1\122\2\uffff\1\117\7\uffff\1\75"+
        "\4\uffff\1\104\1\107\1\104\1\123\1\116\1\120\1\105\2\122\1\103\1"+
        "\117\1\111\1\172\4\uffff\2\172\1\126\1\172\2\uffff\1\172\1\111\1"+
        "\172\1\111\1\123\1\105\1\116\1\172\1\101\1\117\1\103\1\114\3\uffff"+
        "\1\172\1\uffff\1\114\1\uffff\1\116\1\uffff\1\106\1\172\1\124\2\172"+
        "\1\uffff\1\131\1\122\2\105\1\uffff\1\105\2\172\1\uffff\1\172\2\uffff"+
        "\1\172\2\104\2\172\4\uffff\1\172\1\125\3\uffff\1\122\1\105\1\172"+
        "\1\uffff";
    static final String DFA4_acceptS =
        "\14\uffff\1\17\1\20\2\uffff\1\25\1\26\1\uffff\1\30\1\31\1\uffff"+
        "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\uffff\1\44\1\50\1\51\1\52"+
        "\15\uffff\1\22\1\21\1\24\1\23\4\uffff\1\43\1\47\14\uffff\1\13\1"+
        "\27\1\46\1\uffff\1\45\1\uffff\1\33\1\uffff\1\3\5\uffff\1\6\4\uffff"+
        "\1\32\3\uffff\1\16\1\uffff\1\5\1\14\5\uffff\1\2\1\15\1\4\1\7\2\uffff"+
        "\1\12\1\1\1\10\3\uffff\1\11";
    static final String DFA4_specialS =
        "\162\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\41\1\uffff\2\41\22\uffff\1\41\2\uffff\1\15\2\uffff\1\26"+
            "\1\uffff\1\33\1\34\1\24\1\20\1\36\1\21\1\30\1\uffff\12\37\1"+
            "\35\1\27\1\17\1\14\1\16\2\uffff\1\7\1\2\1\4\1\25\1\3\3\40\1"+
            "\13\3\40\1\1\1\40\1\22\1\11\1\40\1\10\1\40\1\5\1\40\1\6\1\12"+
            "\3\40\1\31\1\uffff\1\32\3\uffff\32\40\3\uffff\1\23",
            "\1\42",
            "\1\43",
            "\1\45\1\uffff\1\44",
            "\1\46",
            "\1\50\20\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\57",
            "\1\61",
            "",
            "",
            "\1\64\13\uffff\1\63",
            "",
            "",
            "\1\65\5\uffff\1\66",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\110",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\12\40\7\uffff\24\40\1\112\5\40\6\uffff\32\40",
            "\1\114",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\117\3\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\131",
            "",
            "\1\132",
            "",
            "\1\133",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\135",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\151",
            "\1\152",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\156",
            "",
            "",
            "",
            "\1\157",
            "\1\160",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
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
            return "1:1: Tokens : ( MODULE | BEGIN | END | CONST | TYPE | VAR | ARRAY | RECORD | PROCEDURE | WHILE | IF | THEN | ELSIF | ELSE | EQUALS | NOT_EQUALS | GT | GTE | LT | LTE | PLUS | MINUS | OR | NOT | MULT | DIV | MOD | AND | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | INTEGER | IDENTIFIER | WHITESPACE );";
        }
    }
 

}