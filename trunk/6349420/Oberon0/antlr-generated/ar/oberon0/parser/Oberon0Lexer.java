// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g 2011-01-28 20:11:23

  package ar.oberon0.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
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
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int LETTER=6;
    public static final int DIGIT=7;
    public static final int WS=8;

    // delegates
    // delegators

    public Oberon0Lexer() {;} 
    public Oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:11:6: ( '.' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:11:8: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:12:7: ( '[' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:12:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:13:7: ( ']' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:13:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:14:7: ( '(' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:15:7: ( ')' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:15:9: ')'
            {
            match(')'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:16:7: ( '~' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:16:9: '~'
            {
            match('~'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:17:7: ( '*' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:17:9: '*'
            {
            match('*'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:18:7: ( 'DIV' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:18:9: 'DIV'
            {
            match("DIV"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:19:7: ( 'MOD' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:19:9: 'MOD'
            {
            match("MOD"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:20:7: ( '&' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:20:9: '&'
            {
            match('&'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:21:7: ( '+' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:21:9: '+'
            {
            match('+'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:22:7: ( '-' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:22:9: '-'
            {
            match('-'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:23:7: ( 'OR' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:23:9: 'OR'
            {
            match("OR"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:24:7: ( '=' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:24:9: '='
            {
            match('='); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:25:7: ( '#' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:25:9: '#'
            {
            match('#'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:26:7: ( '<' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:26:9: '<'
            {
            match('<'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:27:7: ( '<=' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:27:9: '<='
            {
            match("<="); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:28:7: ( '>' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:28:9: '>'
            {
            match('>'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:29:7: ( '>=' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:29:9: '>='
            {
            match(">="); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:30:7: ( ':=' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:30:9: ':='
            {
            match(":="); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:31:7: ( ',' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:31:9: ','
            {
            match(','); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:32:7: ( 'IF' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:32:9: 'IF'
            {
            match("IF"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:33:7: ( 'THEN' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:33:9: 'THEN'
            {
            match("THEN"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:34:7: ( 'ELSIF' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:34:9: 'ELSIF'
            {
            match("ELSIF"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:35:7: ( 'ELSE' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:35:9: 'ELSE'
            {
            match("ELSE"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:36:7: ( 'END' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:36:9: 'END'
            {
            match("END"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:37:7: ( 'WHILE' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:37:9: 'WHILE'
            {
            match("WHILE"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:38:7: ( 'DO' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:38:9: 'DO'
            {
            match("DO"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:39:7: ( ';' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:39:9: ';'
            {
            match(';'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:40:7: ( 'ARRAY' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:40:9: 'ARRAY'
            {
            match("ARRAY"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:41:7: ( 'OF' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:41:9: 'OF'
            {
            match("OF"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:42:7: ( ':' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:42:9: ':'
            {
            match(':'); 

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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:43:7: ( 'RECORD' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:43:9: 'RECORD'
            {
            match("RECORD"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:44:7: ( 'VAR' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:44:9: 'VAR'
            {
            match("VAR"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:45:7: ( 'PROCEDURE' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:45:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:46:7: ( 'BEGIN' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:46:9: 'BEGIN'
            {
            match("BEGIN"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:47:7: ( 'CONST' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:47:9: 'CONST'
            {
            match("CONST"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:48:7: ( 'TYPE' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:48:9: 'TYPE'
            {
            match("TYPE"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:49:7: ( 'MODULE' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:49:9: 'MODULE'
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

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:50:7: ( 'Write' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:50:9: 'Write'
            {
            match("Write"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:51:7: ( '(\"' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:51:9: '(\"'
            {
            match("(\""); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:52:7: ( '\")' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:52:9: '\")'
            {
            match("\")"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:53:7: ( 'WriteLn' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:53:9: 'WriteLn'
            {
            match("WriteLn"); 


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
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:54:7: ( 'Read' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:54:9: 'Read'
            {
            match("Read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:259:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:259:19: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:260:16: ( '0' .. '9' )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:260:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:261:9: ( ( DIGIT )+ )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:261:11: ( DIGIT )+
            {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:261:11: ( DIGIT )+
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
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:261:11: DIGIT
            	    {
            	    mDIGIT(); 

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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:262:7: ( LETTER ( LETTER | DIGIT )* )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:262:9: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:262:16: ( LETTER | DIGIT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:
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
    // $ANTLR end "IDENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:263:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:263:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:263:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
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
            	    // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:
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
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | INTEGER | IDENT | WS )
        int alt4=47;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:10: T__9
                {
                mT__9(); 

                }
                break;
            case 2 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:15: T__10
                {
                mT__10(); 

                }
                break;
            case 3 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:21: T__11
                {
                mT__11(); 

                }
                break;
            case 4 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:27: T__12
                {
                mT__12(); 

                }
                break;
            case 5 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:33: T__13
                {
                mT__13(); 

                }
                break;
            case 6 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:39: T__14
                {
                mT__14(); 

                }
                break;
            case 7 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:45: T__15
                {
                mT__15(); 

                }
                break;
            case 8 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:51: T__16
                {
                mT__16(); 

                }
                break;
            case 9 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:57: T__17
                {
                mT__17(); 

                }
                break;
            case 10 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:63: T__18
                {
                mT__18(); 

                }
                break;
            case 11 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:69: T__19
                {
                mT__19(); 

                }
                break;
            case 12 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:75: T__20
                {
                mT__20(); 

                }
                break;
            case 13 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:81: T__21
                {
                mT__21(); 

                }
                break;
            case 14 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:87: T__22
                {
                mT__22(); 

                }
                break;
            case 15 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:93: T__23
                {
                mT__23(); 

                }
                break;
            case 16 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:99: T__24
                {
                mT__24(); 

                }
                break;
            case 17 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:105: T__25
                {
                mT__25(); 

                }
                break;
            case 18 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:111: T__26
                {
                mT__26(); 

                }
                break;
            case 19 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:117: T__27
                {
                mT__27(); 

                }
                break;
            case 20 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:123: T__28
                {
                mT__28(); 

                }
                break;
            case 21 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:129: T__29
                {
                mT__29(); 

                }
                break;
            case 22 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 23 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 24 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 25 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 26 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 27 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 28 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 29 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 30 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 31 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 32 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 33 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 34 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 35 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 36 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 37 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:225: T__45
                {
                mT__45(); 

                }
                break;
            case 38 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:231: T__46
                {
                mT__46(); 

                }
                break;
            case 39 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:237: T__47
                {
                mT__47(); 

                }
                break;
            case 40 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:243: T__48
                {
                mT__48(); 

                }
                break;
            case 41 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:249: T__49
                {
                mT__49(); 

                }
                break;
            case 42 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:255: T__50
                {
                mT__50(); 

                }
                break;
            case 43 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:261: T__51
                {
                mT__51(); 

                }
                break;
            case 44 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:267: T__52
                {
                mT__52(); 

                }
                break;
            case 45 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:273: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 46 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:281: IDENT
                {
                mIDENT(); 

                }
                break;
            case 47 :
                // D:\\DropBox\\My Dropbox\\UVA\\SC\\Workspac\\Oberon0\\src\\ar\\oberon0\\grammar\\Oberon0.g:1:287: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\4\uffff\1\44\3\uffff\2\41\3\uffff\1\41\2\uffff\1\53\1\55\1\57"+
        "\1\uffff\4\41\1\uffff\6\41\6\uffff\1\41\1\77\1\41\1\101\1\102\6"+
        "\uffff\1\103\15\41\1\121\1\uffff\1\123\3\uffff\3\41\1\130\5\41\1"+
        "\136\3\41\1\uffff\1\41\1\uffff\1\143\1\144\1\41\1\146\1\uffff\4"+
        "\41\1\153\1\uffff\4\41\2\uffff\1\160\1\uffff\1\161\1\163\1\164\1"+
        "\41\1\uffff\1\41\1\167\1\170\1\171\2\uffff\1\41\2\uffff\1\173\1"+
        "\41\3\uffff\1\175\1\uffff\1\41\1\uffff\1\41\1\u0080\1\uffff";
    static final String DFA4_eofS =
        "\u0081\uffff";
    static final String DFA4_minS =
        "\1\11\3\uffff\1\42\3\uffff\1\111\1\117\3\uffff\1\106\2\uffff\3"+
        "\75\1\uffff\1\106\1\110\1\114\1\110\1\uffff\1\122\1\105\1\101\1"+
        "\122\1\105\1\117\6\uffff\1\126\1\60\1\104\2\60\6\uffff\1\60\1\105"+
        "\1\120\1\123\1\104\1\111\1\151\1\122\1\103\1\141\1\122\1\117\1\107"+
        "\1\116\1\60\1\uffff\1\60\3\uffff\1\116\2\105\1\60\1\114\1\164\1"+
        "\101\1\117\1\144\1\60\1\103\1\111\1\123\1\uffff\1\114\1\uffff\2"+
        "\60\1\106\1\60\1\uffff\1\105\1\145\1\131\1\122\1\60\1\uffff\1\105"+
        "\1\116\1\124\1\105\2\uffff\1\60\1\uffff\3\60\1\104\1\uffff\1\104"+
        "\3\60\2\uffff\1\156\2\uffff\1\60\1\125\3\uffff\1\60\1\uffff\1\122"+
        "\1\uffff\1\105\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\176\3\uffff\1\42\3\uffff\2\117\3\uffff\1\122\2\uffff\3\75\1"+
        "\uffff\1\106\1\131\1\116\1\162\1\uffff\1\122\1\145\1\101\1\122\1"+
        "\105\1\117\6\uffff\1\126\1\172\1\104\2\172\6\uffff\1\172\1\105\1"+
        "\120\1\123\1\104\1\111\1\151\1\122\1\103\1\141\1\122\1\117\1\107"+
        "\1\116\1\172\1\uffff\1\172\3\uffff\1\116\1\105\1\111\1\172\1\114"+
        "\1\164\1\101\1\117\1\144\1\172\1\103\1\111\1\123\1\uffff\1\114\1"+
        "\uffff\2\172\1\106\1\172\1\uffff\1\105\1\145\1\131\1\122\1\172\1"+
        "\uffff\1\105\1\116\1\124\1\105\2\uffff\1\172\1\uffff\3\172\1\104"+
        "\1\uffff\1\104\3\172\2\uffff\1\156\2\uffff\1\172\1\125\3\uffff\1"+
        "\172\1\uffff\1\122\1\uffff\1\105\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\2\uffff\1\12\1\13\1\14"+
        "\1\uffff\1\16\1\17\3\uffff\1\25\4\uffff\1\35\6\uffff\1\52\1\55\1"+
        "\56\1\57\1\51\1\4\5\uffff\1\21\1\20\1\23\1\22\1\24\1\40\17\uffff"+
        "\1\34\1\uffff\1\15\1\37\1\26\15\uffff\1\10\1\uffff\1\11\4\uffff"+
        "\1\32\5\uffff\1\42\4\uffff\1\27\1\46\1\uffff\1\31\4\uffff\1\54\4"+
        "\uffff\1\30\1\33\1\uffff\1\50\1\36\2\uffff\1\44\1\45\1\47\1\uffff"+
        "\1\41\1\uffff\1\53\2\uffff\1\43";
    static final String DFA4_specialS =
        "\u0081\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\42\1\uffff\2\42\22\uffff\1\42\1\uffff\1\37\1\17\2\uffff"+
            "\1\12\1\uffff\1\4\1\5\1\7\1\13\1\23\1\14\1\1\1\uffff\12\40\1"+
            "\22\1\30\1\20\1\16\1\21\2\uffff\1\31\1\35\1\36\1\10\1\26\3\41"+
            "\1\24\3\41\1\11\1\41\1\15\1\34\1\41\1\32\1\41\1\25\1\41\1\33"+
            "\1\27\3\41\1\2\1\uffff\1\3\3\uffff\32\41\3\uffff\1\6",
            "",
            "",
            "",
            "\1\43",
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
            "\1\65\51\uffff\1\66",
            "",
            "\1\67",
            "\1\70\37\uffff\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\100",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
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
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\12\41\7\uffff\24\41\1\122\5\41\6\uffff\32\41",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\127\3\uffff\1\126",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "\1\142",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\145",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\13\41\1\162\16\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\165",
            "",
            "\1\166",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "\1\172",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\174",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\176",
            "",
            "\1\177",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
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
            return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | INTEGER | IDENT | WS );";
        }
    }
 

}