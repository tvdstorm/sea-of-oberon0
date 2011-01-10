// $ANTLR 3.3 Nov 30, 2010 12:45:30 X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g 2011-01-08 13:33:32

package randy.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__22=22;
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
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int MINUS=4;
    public static final int PLUS=5;
    public static final int TIMES=6;
    public static final int DIVIDE=7;
    public static final int PROCEDURECALL=8;
    public static final int PARAMETERS=9;
    public static final int EXPRESSION=10;
    public static final int BODY=11;
    public static final int LH=12;
    public static final int RH=13;
    public static final int TYPE=14;
    public static final int SELECTOR=15;
    public static final int DOTSELECTOR=16;
    public static final int ARRAYSELECTOR=17;
    public static final int MODULE=18;
    public static final int IDENT=19;
    public static final int WHITESPACE=20;
    public static final int INTEGER=21;

    // delegates
    // delegators

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g"; }

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:11:7: ( '-' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:11:9: '-'
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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:12:6: ( '+' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:12:8: '+'
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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:13:7: ( '*' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:13:9: '*'
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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:14:8: ( 'DIV' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:14:10: 'DIV'
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

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:15:7: ( '.' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:16:7: ( '[' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:16:9: '['
            {
            match('['); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:17:7: ( ']' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:17:9: ']'
            {
            match(']'); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:18:7: ( '(' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:18:9: '('
            {
            match('('); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:19:7: ( ')' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:19:9: ')'
            {
            match(')'); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:20:7: ( '~' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:20:9: '~'
            {
            match('~'); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:21:7: ( 'MOD' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:21:9: 'MOD'
            {
            match("MOD"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:22:7: ( '&' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:22:9: '&'
            {
            match('&'); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:23:7: ( 'OR' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:23:9: 'OR'
            {
            match("OR"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:24:7: ( '=' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:24:9: '='
            {
            match('='); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:25:7: ( '#' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:25:9: '#'
            {
            match('#'); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:26:7: ( '<' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:26:9: '<'
            {
            match('<'); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:27:7: ( '<=' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:27:9: '<='
            {
            match("<="); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:28:7: ( '>' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:28:9: '>'
            {
            match('>'); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:29:7: ( '>=' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:29:9: '>='
            {
            match(">="); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:30:7: ( ',' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:30:9: ','
            {
            match(','); 

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:31:7: ( 'IF' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:31:9: 'IF'
            {
            match("IF"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:32:7: ( 'THEN' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:32:9: 'THEN'
            {
            match("THEN"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:33:7: ( 'ELSIF' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:33:9: 'ELSIF'
            {
            match("ELSIF"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:34:7: ( 'ELSE' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:34:9: 'ELSE'
            {
            match("ELSE"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:35:7: ( 'END' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:35:9: 'END'
            {
            match("END"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:36:7: ( 'WHILE' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:36:9: 'WHILE'
            {
            match("WHILE"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:37:7: ( 'DO' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:37:9: 'DO'
            {
            match("DO"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:38:7: ( ':=' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:38:9: ':='
            {
            match(":="); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:39:7: ( ';' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:39:9: ';'
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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:40:7: ( 'ARRAY' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:40:9: 'ARRAY'
            {
            match("ARRAY"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:41:7: ( 'OF' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:41:9: 'OF'
            {
            match("OF"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:7: ( ':' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:42:9: ':'
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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:43:7: ( 'RECORD' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:43:9: 'RECORD'
            {
            match("RECORD"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:44:7: ( 'VAR' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:44:9: 'VAR'
            {
            match("VAR"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:45:7: ( 'BEGIN' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:45:9: 'BEGIN'
            {
            match("BEGIN"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:46:7: ( 'PROCEDURE' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:46:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:47:7: ( 'CONST' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:47:9: 'CONST'
            {
            match("CONST"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:48:7: ( 'TYPE' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:48:9: 'TYPE'
            {
            match("TYPE"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:49:7: ( 'MODULE' )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:49:9: 'MODULE'
            {
            match("MODULE"); 


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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:40:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:40:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:40:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:
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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:41:11: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:41:14: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel = HIDDEN;

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
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:44:8: ( ( '0' .. '9' )+ )
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:44:11: ( '0' .. '9' )+
            {
            // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:44:11: ( '0' .. '9' )+
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
            	    // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:44:12: '0' .. '9'
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
        // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:8: ( MINUS | PLUS | TIMES | DIVIDE | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | IDENT | WHITESPACE | INTEGER )
        int alt3=42;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:10: MINUS
                {
                mMINUS(); 

                }
                break;
            case 2 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:16: PLUS
                {
                mPLUS(); 

                }
                break;
            case 3 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:21: TIMES
                {
                mTIMES(); 

                }
                break;
            case 4 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:27: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 5 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:244: IDENT
                {
                mIDENT(); 

                }
                break;
            case 41 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:250: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 42 :
                // X:\\portfolio\\Software Engineering\\Blok 3\\Software Construction\\grammar\\Oberon0.g:1:261: INTEGER
                {
                mINTEGER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\4\uffff\1\37\6\uffff\1\37\1\uffff\1\37\2\uffff\1\50\1\52\1\uffff"+
        "\4\37\1\62\1\uffff\6\37\3\uffff\1\37\1\72\1\37\1\74\1\75\4\uffff"+
        "\1\76\5\37\2\uffff\6\37\1\112\1\uffff\1\114\3\uffff\3\37\1\121\3"+
        "\37\1\125\3\37\1\uffff\1\37\1\uffff\1\132\1\133\1\37\1\135\1\uffff"+
        "\3\37\1\uffff\4\37\2\uffff\1\145\1\uffff\1\146\1\147\1\37\1\151"+
        "\1\37\1\153\1\154\3\uffff\1\155\1\uffff\1\37\3\uffff\2\37\1\161"+
        "\1\uffff";
    static final String DFA3_eofS =
        "\162\uffff";
    static final String DFA3_minS =
        "\1\11\3\uffff\1\111\6\uffff\1\117\1\uffff\1\106\2\uffff\2\75\1"+
        "\uffff\1\106\1\110\1\114\1\110\1\75\1\uffff\1\122\1\105\1\101\1"+
        "\105\1\122\1\117\3\uffff\1\126\1\60\1\104\2\60\4\uffff\1\60\1\105"+
        "\1\120\1\123\1\104\1\111\2\uffff\1\122\1\103\1\122\1\107\1\117\1"+
        "\116\1\60\1\uffff\1\60\3\uffff\1\116\2\105\1\60\1\114\1\101\1\117"+
        "\1\60\1\111\1\103\1\123\1\uffff\1\114\1\uffff\2\60\1\106\1\60\1"+
        "\uffff\1\105\1\131\1\122\1\uffff\1\116\1\105\1\124\1\105\2\uffff"+
        "\1\60\1\uffff\2\60\1\104\1\60\1\104\2\60\3\uffff\1\60\1\uffff\1"+
        "\125\3\uffff\1\122\1\105\1\60\1\uffff";
    static final String DFA3_maxS =
        "\1\176\3\uffff\1\117\6\uffff\1\117\1\uffff\1\122\2\uffff\2\75\1"+
        "\uffff\1\106\1\131\1\116\1\110\1\75\1\uffff\1\122\1\105\1\101\1"+
        "\105\1\122\1\117\3\uffff\1\126\1\172\1\104\2\172\4\uffff\1\172\1"+
        "\105\1\120\1\123\1\104\1\111\2\uffff\1\122\1\103\1\122\1\107\1\117"+
        "\1\116\1\172\1\uffff\1\172\3\uffff\1\116\1\105\1\111\1\172\1\114"+
        "\1\101\1\117\1\172\1\111\1\103\1\123\1\uffff\1\114\1\uffff\2\172"+
        "\1\106\1\172\1\uffff\1\105\1\131\1\122\1\uffff\1\116\1\105\1\124"+
        "\1\105\2\uffff\1\172\1\uffff\2\172\1\104\1\172\1\104\2\172\3\uffff"+
        "\1\172\1\uffff\1\125\3\uffff\1\122\1\105\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\uffff"+
        "\1\14\1\uffff\1\16\1\17\2\uffff\1\24\5\uffff\1\35\6\uffff\1\50\1"+
        "\51\1\52\5\uffff\1\21\1\20\1\23\1\22\6\uffff\1\34\1\40\7\uffff\1"+
        "\33\1\uffff\1\15\1\37\1\25\13\uffff\1\4\1\uffff\1\13\4\uffff\1\31"+
        "\3\uffff\1\42\4\uffff\1\26\1\46\1\uffff\1\30\7\uffff\1\27\1\32\1"+
        "\36\1\uffff\1\43\1\uffff\1\45\1\47\1\41\3\uffff\1\44";
    static final String DFA3_specialS =
        "\162\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\2\uffff\1\17\2\uffff\1\14"+
            "\1\uffff\1\10\1\11\1\3\1\2\1\22\1\1\1\5\1\uffff\12\41\1\27\1"+
            "\30\1\20\1\16\1\21\2\uffff\1\31\1\34\1\36\1\4\1\25\3\37\1\23"+
            "\3\37\1\13\1\37\1\15\1\35\1\37\1\32\1\37\1\24\1\37\1\33\1\26"+
            "\3\37\1\6\1\uffff\1\7\3\uffff\32\37\3\uffff\1\12",
            "",
            "",
            "",
            "\1\42\5\uffff\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "",
            "\1\46\13\uffff\1\45",
            "",
            "",
            "\1\47",
            "\1\51",
            "",
            "\1\53",
            "\1\54\20\uffff\1\55",
            "\1\56\1\uffff\1\57",
            "\1\60",
            "\1\61",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "\1\71",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\73",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\12\37\7\uffff\24\37\1\113\5\37\6\uffff\32\37",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\120\3\uffff\1\117",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\134",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\150",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\1\152",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\6\uffff\32\37",
            "",
            "\1\156",
            "",
            "",
            "",
            "\1\157",
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
            return "1:1: Tokens : ( MINUS | PLUS | TIMES | DIVIDE | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | IDENT | WHITESPACE | INTEGER );";
        }
    }
 

}