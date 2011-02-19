// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-19 22:34:37

package nl.bve.uva.oberon.parser;


import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class Oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int DIV=7;
    public static final int MOD=8;
    public static final int EQUALS=9;
    public static final int NOT_EQ=10;
    public static final int OR=11;
    public static final int AND=12;
    public static final int LT=13;
    public static final int LT_EQ=14;
    public static final int GT=15;
    public static final int GT_EQ=16;
    public static final int IDENT=17;
    public static final int NUMBER=18;
    public static final int INTEGER=19;
    public static final int LETTER=20;
    public static final int DIGIT=21;
    public static final int WHITESPACE=22;

    // delegates
    // delegators

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:7:6: ( '+' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:7:8: '+'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:8:7: ( '-' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:8:9: '-'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:9:6: ( '*' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:9:8: '*'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:10:5: ( 'DIV' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:10:7: 'DIV'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:11:5: ( 'MOD' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:11:7: 'MOD'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:12:8: ( '=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:12:10: '='
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

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:13:8: ( '#' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:13:10: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:14:4: ( 'OR' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:14:6: 'OR'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:15:5: ( '&' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:15:7: '&'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:16:4: ( '<' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:16:6: '<'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:17:7: ( '<=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:17:9: '<='
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:18:4: ( '>' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:18:6: '>'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:19:7: ( '>=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:19:9: '>='
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

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:20:7: ( 'MODULE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:20:9: 'MODULE'
            {
            match("MODULE"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:21:7: ( ';' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:21:9: ';'
            {
            match(';'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:22:7: ( 'BEGIN' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:22:9: 'BEGIN'
            {
            match("BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:23:7: ( 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:23:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:24:7: ( '.' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:25:7: ( 'CONST' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:25:9: 'CONST'
            {
            match("CONST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:26:7: ( 'TYPE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:26:9: 'TYPE'
            {
            match("TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:27:7: ( 'VAR' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:27:9: 'VAR'
            {
            match("VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:28:7: ( ':' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:29:7: ( 'PROCEDURE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:29:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:30:7: ( '(' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:31:7: ( ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:32:7: ( 'INTEGER' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:32:9: 'INTEGER'
            {
            match("INTEGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:33:7: ( 'RECORD' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:33:9: 'RECORD'
            {
            match("RECORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:7: ( 'ARRAY' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:9: 'ARRAY'
            {
            match("ARRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:7: ( 'OF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:9: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:7: ( ',' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:7: ( ':=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:7: ( 'IF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:9: 'IF'
            {
            match("IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:7: ( 'THEN' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:9: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:40:7: ( 'ELSIF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:40:9: 'ELSIF'
            {
            match("ELSIF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:7: ( 'ELSE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:9: 'ELSE'
            {
            match("ELSE"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:7: ( 'WHILE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:9: 'WHILE'
            {
            match("WHILE"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:7: ( 'DO' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:9: 'DO'
            {
            match("DO"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:7: ( 'WITH' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:9: 'WITH'
            {
            match("WITH"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:45:7: ( '[' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:45:9: '['
            {
            match('['); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:46:7: ( ']' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:46:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:244:8: ( INTEGER )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:244:10: INTEGER
            {
            mINTEGER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:245:7: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:245:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:245:16: ( LETTER | DIGIT )*
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
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:245:17: LETTER
            	    {
            	    mLETTER(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:245:26: DIGIT
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:247:17: ( ( DIGIT )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:247:19: ( DIGIT )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:247:19: ( DIGIT )+
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
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:247:20: DIGIT
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

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:248:17: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:248:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:248:19: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:249:16: ( '0' .. '9' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:249:17: '0' .. '9'
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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:251:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:251:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:251:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
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
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:
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
        // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:8: ( PLUS | MINUS | MULT | DIV | MOD | EQUALS | NOT_EQ | OR | AND | LT | LT_EQ | GT | GT_EQ | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | NUMBER | IDENT | WHITESPACE )
        int alt5=43;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:30: MOD
                {
                mMOD(); 

                }
                break;
            case 6 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:34: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 7 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:41: NOT_EQ
                {
                mNOT_EQ(); 

                }
                break;
            case 8 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:48: OR
                {
                mOR(); 

                }
                break;
            case 9 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:51: AND
                {
                mAND(); 

                }
                break;
            case 10 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:55: LT
                {
                mLT(); 

                }
                break;
            case 11 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:58: LT_EQ
                {
                mLT_EQ(); 

                }
                break;
            case 12 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:64: GT
                {
                mGT(); 

                }
                break;
            case 13 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:67: GT_EQ
                {
                mGT_EQ(); 

                }
                break;
            case 14 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:73: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:79: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:85: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:91: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:97: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:103: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:109: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:115: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:121: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:127: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:133: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:139: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:145: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:151: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:157: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:163: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:169: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:175: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:181: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:187: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:193: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:199: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:205: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:211: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:217: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:223: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:229: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:235: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 42 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:242: IDENT
                {
                mIDENT(); 

                }
                break;
            case 43 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:1:248: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\4\uffff\2\37\2\uffff\1\37\1\uffff\1\47\1\51\1\uffff\2\37\1\uffff"+
        "\3\37\1\62\1\37\2\uffff\3\37\1\uffff\1\37\5\uffff\1\37\1\73\1\37"+
        "\1\75\1\76\4\uffff\7\37\2\uffff\2\37\1\110\4\37\1\115\1\uffff\1"+
        "\117\2\uffff\1\37\1\121\4\37\1\127\2\37\1\uffff\4\37\1\uffff\1\37"+
        "\1\uffff\1\37\1\uffff\1\37\1\141\1\37\1\143\1\144\1\uffff\5\37\1"+
        "\152\1\37\1\154\1\155\1\uffff\1\156\2\uffff\3\37\1\162\1\163\1\uffff"+
        "\1\164\3\uffff\2\37\1\167\3\uffff\1\37\1\171\1\uffff\1\37\1\uffff"+
        "\1\173\1\uffff";
    static final String DFA5_eofS =
        "\174\uffff";
    static final String DFA5_minS =
        "\1\11\3\uffff\1\111\1\117\2\uffff\1\106\1\uffff\2\75\1\uffff\1"+
        "\105\1\114\1\uffff\1\117\1\110\1\101\1\75\1\122\2\uffff\1\106\1"+
        "\105\1\122\1\uffff\1\110\5\uffff\1\126\1\60\1\104\2\60\4\uffff\1"+
        "\107\1\104\1\123\1\116\1\120\1\105\1\122\2\uffff\1\117\1\124\1\60"+
        "\1\103\1\122\1\111\1\124\1\60\1\uffff\1\60\2\uffff\1\111\1\60\1"+
        "\105\1\123\1\105\1\116\1\60\1\103\1\105\1\uffff\1\117\1\101\1\114"+
        "\1\110\1\uffff\1\114\1\uffff\1\116\1\uffff\1\106\1\60\1\124\2\60"+
        "\1\uffff\1\105\1\107\1\122\1\131\1\105\1\60\1\105\2\60\1\uffff\1"+
        "\60\2\uffff\1\104\1\105\1\104\2\60\1\uffff\1\60\3\uffff\1\125\1"+
        "\122\1\60\3\uffff\1\122\1\60\1\uffff\1\105\1\uffff\1\60\1\uffff";
    static final String DFA5_maxS =
        "\1\172\3\uffff\2\117\2\uffff\1\122\1\uffff\2\75\1\uffff\1\105\1"+
        "\116\1\uffff\1\117\1\131\1\101\1\75\1\122\2\uffff\1\116\1\105\1"+
        "\122\1\uffff\1\111\5\uffff\1\126\1\172\1\104\2\172\4\uffff\1\107"+
        "\1\104\1\123\1\116\1\120\1\105\1\122\2\uffff\1\117\1\124\1\172\1"+
        "\103\1\122\1\111\1\124\1\172\1\uffff\1\172\2\uffff\1\111\1\172\1"+
        "\111\1\123\1\105\1\116\1\172\1\103\1\105\1\uffff\1\117\1\101\1\114"+
        "\1\110\1\uffff\1\114\1\uffff\1\116\1\uffff\1\106\1\172\1\124\2\172"+
        "\1\uffff\1\105\1\107\1\122\1\131\1\105\1\172\1\105\2\172\1\uffff"+
        "\1\172\2\uffff\1\104\1\105\1\104\2\172\1\uffff\1\172\3\uffff\1\125"+
        "\1\122\1\172\3\uffff\1\122\1\172\1\uffff\1\105\1\uffff\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\6\1\7\1\uffff\1\11\2\uffff\1\17"+
        "\2\uffff\1\22\5\uffff\1\30\1\31\3\uffff\1\36\1\uffff\1\47\1\50\1"+
        "\51\1\52\1\53\5\uffff\1\13\1\12\1\15\1\14\7\uffff\1\37\1\26\10\uffff"+
        "\1\45\1\uffff\1\10\1\35\11\uffff\1\40\4\uffff\1\4\1\uffff\1\5\1"+
        "\uffff\1\21\5\uffff\1\25\11\uffff\1\43\1\uffff\1\24\1\41\5\uffff"+
        "\1\46\1\uffff\1\20\1\42\1\23\3\uffff\1\34\1\44\1\16\2\uffff\1\33"+
        "\1\uffff\1\32\1\uffff\1\27";
    static final String DFA5_specialS =
        "\174\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\40\1\uffff\2\40\22\uffff\1\40\2\uffff\1\7\2\uffff\1\11\1"+
            "\uffff\1\25\1\26\1\3\1\1\1\32\1\2\1\17\1\uffff\12\36\1\23\1"+
            "\14\1\12\1\6\1\13\2\uffff\1\31\1\15\1\20\1\4\1\16\3\37\1\27"+
            "\3\37\1\5\1\37\1\10\1\24\1\37\1\30\1\37\1\21\1\37\1\22\1\33"+
            "\3\37\1\34\1\uffff\1\35\3\uffff\32\37",
            "",
            "",
            "",
            "\1\41\5\uffff\1\42",
            "\1\43",
            "",
            "",
            "\1\45\13\uffff\1\44",
            "",
            "\1\46",
            "\1\50",
            "",
            "\1\52",
            "\1\54\1\uffff\1\53",
            "",
            "\1\55",
            "\1\57\20\uffff\1\56",
            "\1\60",
            "\1\61",
            "\1\63",
            "",
            "",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "\1\67",
            "",
            "\1\70\1\71",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\74",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
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
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\107",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\12\37\7\uffff\24\37\1\116\5\37\6\uffff\32\37",
            "",
            "",
            "\1\120",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\123\3\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "",
            "\1\137",
            "",
            "\1\140",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\142",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\153",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "",
            "\1\165",
            "\1\166",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "",
            "\1\170",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\1\172",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
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
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | MOD | EQUALS | NOT_EQ | OR | AND | LT | LT_EQ | GT | GT_EQ | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | NUMBER | IDENT | WHITESPACE );";
        }
    }
 

}