// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g 2011-01-28 11:56:03

package nl.bve.uva.oberon.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OberonLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
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
    public static final int DECL=4;
    public static final int PROCEDURE=5;
    public static final int TYPEDEF=6;
    public static final int CONSTDEF=7;
    public static final int VARDEF=8;
    public static final int NEWLINE=9;
    public static final int WS=10;
    public static final int LETTER=11;
    public static final int DIGIT=12;

    // delegates
    // delegators

    public OberonLexer() {;} 
    public OberonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OberonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:7:7: ( '.' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:7:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:8:7: ( '[' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:8:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:9:7: ( ']' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:9:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:10:7: ( '(' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:10:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:11:7: ( ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:11:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:12:7: ( '~' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:12:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:13:7: ( '*' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:13:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:14:7: ( 'DIV' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:14:9: 'DIV'
            {
            match("DIV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:15:7: ( 'MOD' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:15:9: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:16:7: ( '&' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:16:9: '&'
            {
            match('&'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:17:7: ( '+' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:17:9: '+'
            {
            match('+'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:18:7: ( '-' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:18:9: '-'
            {
            match('-'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:19:7: ( 'OR' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:19:9: 'OR'
            {
            match("OR"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:20:7: ( '=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:20:9: '='
            {
            match('='); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:21:7: ( '#' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:21:9: '#'
            {
            match('#'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:22:7: ( '<' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:22:9: '<'
            {
            match('<'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:23:7: ( '<=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:23:9: '<='
            {
            match("<="); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:24:7: ( '>' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:24:9: '>'
            {
            match('>'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:25:7: ( '>=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:25:9: '>='
            {
            match(">="); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:26:7: ( ':=' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:26:9: ':='
            {
            match(":="); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:27:7: ( ',' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:27:9: ','
            {
            match(','); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:28:7: ( 'IF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:28:9: 'IF'
            {
            match("IF"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:29:7: ( 'THEN' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:29:9: 'THEN'
            {
            match("THEN"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:30:7: ( 'ELSIF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:30:9: 'ELSIF'
            {
            match("ELSIF"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:7: ( 'ELSE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:9: 'ELSE'
            {
            match("ELSE"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:32:7: ( 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:32:9: 'END'
            {
            match("END"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:33:7: ( 'WHILE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:33:9: 'WHILE'
            {
            match("WHILE"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:34:7: ( 'DO' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:34:9: 'DO'
            {
            match("DO"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:35:7: ( ';' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:35:9: ';'
            {
            match(';'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:36:7: ( 'ARRAY' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:36:9: 'ARRAY'
            {
            match("ARRAY"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:7: ( 'OF' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:37:9: 'OF'
            {
            match("OF"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:7: ( ':' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:38:9: ':'
            {
            match(':'); 

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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:7: ( 'RECORD' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:39:9: 'RECORD'
            {
            match("RECORD"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:7: ( 'BEGIN' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:40:9: 'BEGIN'
            {
            match("BEGIN"); 


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
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:41:7: ( 'MODULE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:41:9: 'MODULE'
            {
            match("MODULE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "DECL"
    public final void mDECL() throws RecognitionException {
        try {
            int _type = DECL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:18:6: ()
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:18:8: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECL"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:20:2: ( 'PROCEDURE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:20:4: 'PROCEDURE'
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

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:23:9: ( 'TYPE' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:23:11: 'TYPE'
            {
            match("TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "CONSTDEF"
    public final void mCONSTDEF() throws RecognitionException {
        try {
            int _type = CONSTDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:24:9: ( 'CONST' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:24:11: 'CONST'
            {
            match("CONST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTDEF"

    // $ANTLR start "VARDEF"
    public final void mVARDEF() throws RecognitionException {
        try {
            int _type = VARDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:25:8: ( 'VAR' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:25:10: 'VAR'
            {
            match("VAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARDEF"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:28:9: ( ( '\\r' )? '\\n' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:28:11: ( '\\r' )? '\\n'
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:28:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:28:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:29:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:29:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:29:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:30:8: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:30:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:30:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            int _type = DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:7: ( ( '0' .. '9' )+ )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:9: ( '0' .. '9' )+
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:9: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:31:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    public void mTokens() throws RecognitionException {
        // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | DECL | PROCEDURE | TYPEDEF | CONSTDEF | VARDEF | NEWLINE | WS | LETTER | DIGIT )
        int alt5=44;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:220: DECL
                {
                mDECL(); 

                }
                break;
            case 37 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:225: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 38 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:235: TYPEDEF
                {
                mTYPEDEF(); 

                }
                break;
            case 39 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:243: CONSTDEF
                {
                mCONSTDEF(); 

                }
                break;
            case 40 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:252: VARDEF
                {
                mVARDEF(); 

                }
                break;
            case 41 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:259: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 42 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:267: WS
                {
                mWS(); 

                }
                break;
            case 43 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:270: LETTER
                {
                mLETTER(); 

                }
                break;
            case 44 :
                // C:\\Eclipse\\workspace\\OberonInterpreter\\src\\main\\java\\nl\\bve\\uva\\oberon\\parser\\Oberon.g:1:277: DIGIT
                {
                mDIGIT(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\34\7\uffff\2\43\3\uffff\1\43\2\uffff\1\53\1\55\1\57\1\uffff"+
        "\4\43\1\uffff\3\43\1\uffff\3\43\1\42\1\74\3\uffff\1\43\1\76\1\43"+
        "\1\100\1\101\6\uffff\1\102\13\43\1\uffff\1\116\1\uffff\1\120\3\uffff"+
        "\3\43\1\125\6\43\1\134\1\uffff\1\43\1\uffff\1\136\1\137\1\43\1\141"+
        "\1\uffff\6\43\1\uffff\1\43\2\uffff\1\151\1\uffff\1\152\1\153\1\43"+
        "\1\155\1\43\1\157\1\160\3\uffff\1\161\1\uffff\1\43\3\uffff\2\43"+
        "\1\165\1\uffff";
    static final String DFA5_eofS =
        "\166\uffff";
    static final String DFA5_minS =
        "\1\11\7\uffff\1\111\1\117\3\uffff\1\106\2\uffff\3\75\1\uffff\1"+
        "\106\1\110\1\114\1\110\1\uffff\1\122\2\105\1\uffff\1\122\1\117\1"+
        "\101\1\12\1\11\3\uffff\1\126\1\101\1\104\2\101\6\uffff\1\101\1\105"+
        "\1\120\1\123\1\104\1\111\1\122\1\103\1\107\1\117\1\116\1\122\1\uffff"+
        "\1\101\1\uffff\1\101\3\uffff\1\116\2\105\1\101\1\114\1\101\1\117"+
        "\1\111\1\103\1\123\1\101\1\uffff\1\114\1\uffff\2\101\1\106\1\101"+
        "\1\uffff\1\105\1\131\1\122\1\116\1\105\1\124\1\uffff\1\105\2\uffff"+
        "\1\101\1\uffff\2\101\1\104\1\101\1\104\2\101\3\uffff\1\101\1\uffff"+
        "\1\125\3\uffff\1\122\1\105\1\101\1\uffff";
    static final String DFA5_maxS =
        "\1\176\7\uffff\2\117\3\uffff\1\122\2\uffff\3\75\1\uffff\1\106\1"+
        "\131\1\116\1\110\1\uffff\1\122\2\105\1\uffff\1\122\1\117\1\101\1"+
        "\12\1\40\3\uffff\1\126\1\172\1\104\2\172\6\uffff\1\172\1\105\1\120"+
        "\1\123\1\104\1\111\1\122\1\103\1\107\1\117\1\116\1\122\1\uffff\1"+
        "\172\1\uffff\1\172\3\uffff\1\116\1\105\1\111\1\172\1\114\1\101\1"+
        "\117\1\111\1\103\1\123\1\172\1\uffff\1\114\1\uffff\2\172\1\106\1"+
        "\172\1\uffff\1\105\1\131\1\122\1\116\1\105\1\124\1\uffff\1\105\2"+
        "\uffff\1\172\1\uffff\2\172\1\104\1\172\1\104\2\172\3\uffff\1\172"+
        "\1\uffff\1\125\3\uffff\1\122\1\105\1\172\1\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\1\13\1\14\1\uffff"+
        "\1\16\1\17\3\uffff\1\25\4\uffff\1\35\3\uffff\1\44\5\uffff\1\52\1"+
        "\53\1\54\5\uffff\1\21\1\20\1\23\1\22\1\24\1\40\14\uffff\1\51\1\uffff"+
        "\1\34\1\uffff\1\15\1\37\1\26\13\uffff\1\10\1\uffff\1\11\4\uffff"+
        "\1\32\6\uffff\1\50\1\uffff\1\27\1\46\1\uffff\1\31\7\uffff\1\30\1"+
        "\33\1\36\1\uffff\1\42\1\uffff\1\47\1\43\1\41\3\uffff\1\45";
    static final String DFA5_specialS =
        "\166\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\42\1\41\2\uffff\1\40\22\uffff\1\42\2\uffff\1\17\2\uffff"+
            "\1\12\1\uffff\1\4\1\5\1\7\1\13\1\23\1\14\1\1\1\uffff\12\44\1"+
            "\22\1\30\1\20\1\16\1\21\2\uffff\1\31\1\33\1\36\1\10\1\26\3\43"+
            "\1\24\3\43\1\11\1\43\1\15\1\35\1\43\1\32\1\43\1\25\1\43\1\37"+
            "\1\27\3\43\1\2\1\uffff\1\3\3\uffff\32\43\3\uffff\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\5\uffff\1\46",
            "\1\47",
            "",
            "",
            "",
            "\1\51\13\uffff\1\50",
            "",
            "",
            "\1\52",
            "\1\54",
            "\1\56",
            "",
            "\1\60",
            "\1\61\20\uffff\1\62",
            "\1\63\1\uffff\1\64",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\41",
            "\2\42\2\uffff\1\42\22\uffff\1\42",
            "",
            "",
            "",
            "\1\75",
            "\32\43\6\uffff\32\43",
            "\1\77",
            "\32\43\6\uffff\32\43",
            "\32\43\6\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\43\6\uffff\32\43",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\32\43\6\uffff\32\43",
            "",
            "\24\43\1\117\5\43\6\uffff\32\43",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\124\3\uffff\1\123",
            "\32\43\6\uffff\32\43",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\32\43\6\uffff\32\43",
            "",
            "\1\135",
            "",
            "\32\43\6\uffff\32\43",
            "\32\43\6\uffff\32\43",
            "\1\140",
            "\32\43\6\uffff\32\43",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "",
            "",
            "\32\43\6\uffff\32\43",
            "",
            "\32\43\6\uffff\32\43",
            "\32\43\6\uffff\32\43",
            "\1\154",
            "\32\43\6\uffff\32\43",
            "\1\156",
            "\32\43\6\uffff\32\43",
            "\32\43\6\uffff\32\43",
            "",
            "",
            "",
            "\32\43\6\uffff\32\43",
            "",
            "\1\162",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\32\43\6\uffff\32\43",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | DECL | PROCEDURE | TYPEDEF | CONSTDEF | VARDEF | NEWLINE | WS | LETTER | DIGIT );";
        }
    }
 

}