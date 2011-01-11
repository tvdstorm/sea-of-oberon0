// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-11 13:02:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class oberon0Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
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
    public static final int MODULE=4;
    public static final int IDENT=5;
    public static final int INTEGER=6;
    public static final int WS=7;

    // delegates
    // delegators

    public oberon0Lexer() {;} 
    public oberon0Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public oberon0Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "oberon0.g"; }

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // oberon0.g:3:8: ( 'MODULE' )
            // oberon0.g:3:10: 'MODULE'
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

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // oberon0.g:4:6: ( ';' )
            // oberon0.g:4:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // oberon0.g:5:6: ( '.' )
            // oberon0.g:5:8: '.'
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
            // oberon0.g:6:7: ( 'BEGIN' )
            // oberon0.g:6:9: 'BEGIN'
            {
            match("BEGIN"); 


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
            // oberon0.g:7:7: ( 'END' )
            // oberon0.g:7:9: 'END'
            {
            match("END"); 


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
            // oberon0.g:8:7: ( 'CONST' )
            // oberon0.g:8:9: 'CONST'
            {
            match("CONST"); 


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
            // oberon0.g:9:7: ( '=' )
            // oberon0.g:9:9: '='
            {
            match('='); 

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
            // oberon0.g:10:7: ( 'TYPE' )
            // oberon0.g:10:9: 'TYPE'
            {
            match("TYPE"); 


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
            // oberon0.g:11:7: ( 'VAR' )
            // oberon0.g:11:9: 'VAR'
            {
            match("VAR"); 


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
            // oberon0.g:12:7: ( ':' )
            // oberon0.g:12:9: ':'
            {
            match(':'); 

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
            // oberon0.g:13:7: ( 'ARRAY' )
            // oberon0.g:13:9: 'ARRAY'
            {
            match("ARRAY"); 


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
            // oberon0.g:14:7: ( 'OF' )
            // oberon0.g:14:9: 'OF'
            {
            match("OF"); 


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
            // oberon0.g:15:7: ( '#' )
            // oberon0.g:15:9: '#'
            {
            match('#'); 

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
            // oberon0.g:16:7: ( '<' )
            // oberon0.g:16:9: '<'
            {
            match('<'); 

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
            // oberon0.g:17:7: ( '<=' )
            // oberon0.g:17:9: '<='
            {
            match("<="); 


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
            // oberon0.g:18:7: ( '>' )
            // oberon0.g:18:9: '>'
            {
            match('>'); 

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
            // oberon0.g:19:7: ( '>=' )
            // oberon0.g:19:9: '>='
            {
            match(">="); 


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
            // oberon0.g:20:7: ( '+' )
            // oberon0.g:20:9: '+'
            {
            match('+'); 

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
            // oberon0.g:21:7: ( '-' )
            // oberon0.g:21:9: '-'
            {
            match('-'); 

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
            // oberon0.g:22:7: ( 'OR' )
            // oberon0.g:22:9: 'OR'
            {
            match("OR"); 


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
            // oberon0.g:23:7: ( '*' )
            // oberon0.g:23:9: '*'
            {
            match('*'); 

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
            // oberon0.g:24:7: ( 'DIV' )
            // oberon0.g:24:9: 'DIV'
            {
            match("DIV"); 


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
            // oberon0.g:25:7: ( 'MOD' )
            // oberon0.g:25:9: 'MOD'
            {
            match("MOD"); 


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
            // oberon0.g:26:7: ( '&' )
            // oberon0.g:26:9: '&'
            {
            match('&'); 

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
            // oberon0.g:27:7: ( '(' )
            // oberon0.g:27:9: '('
            {
            match('('); 

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
            // oberon0.g:28:7: ( ')' )
            // oberon0.g:28:9: ')'
            {
            match(')'); 

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
            // oberon0.g:29:7: ( '~' )
            // oberon0.g:29:9: '~'
            {
            match('~'); 

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
            // oberon0.g:30:7: ( '[' )
            // oberon0.g:30:9: '['
            {
            match('['); 

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
            // oberon0.g:31:7: ( ']' )
            // oberon0.g:31:9: ']'
            {
            match(']'); 

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
            // oberon0.g:32:7: ( 'RECORD' )
            // oberon0.g:32:9: 'RECORD'
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
            // oberon0.g:33:7: ( ',' )
            // oberon0.g:33:9: ','
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
            // oberon0.g:34:7: ( ':=' )
            // oberon0.g:34:9: ':='
            {
            match(":="); 


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
            // oberon0.g:35:7: ( 'IF' )
            // oberon0.g:35:9: 'IF'
            {
            match("IF"); 


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
            // oberon0.g:36:7: ( 'THEN' )
            // oberon0.g:36:9: 'THEN'
            {
            match("THEN"); 


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
            // oberon0.g:37:7: ( 'ELSIF' )
            // oberon0.g:37:9: 'ELSIF'
            {
            match("ELSIF"); 


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
            // oberon0.g:38:7: ( 'ELSE' )
            // oberon0.g:38:9: 'ELSE'
            {
            match("ELSE"); 


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
            // oberon0.g:39:7: ( 'WHILE' )
            // oberon0.g:39:9: 'WHILE'
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
            // oberon0.g:40:7: ( 'DO' )
            // oberon0.g:40:9: 'DO'
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
            // oberon0.g:41:7: ( 'PROCEDURE' )
            // oberon0.g:41:9: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // oberon0.g:127:2: ( ( '0' .. '9' )+ )
            // oberon0.g:127:4: ( '0' .. '9' )+
            {
            // oberon0.g:127:4: ( '0' .. '9' )+
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
            	    // oberon0.g:127:5: '0' .. '9'
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

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // oberon0.g:131:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // oberon0.g:131:4: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // oberon0.g:131:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // oberon0.g:
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
            // oberon0.g:135:2: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // oberon0.g:135:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // oberon0.g:135:4: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // oberon0.g:
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
        // oberon0.g:1:8: ( MODULE | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | INTEGER | IDENT | WS )
        int alt4=42;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // oberon0.g:1:10: MODULE
                {
                mMODULE(); 

                }
                break;
            case 2 :
                // oberon0.g:1:17: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // oberon0.g:1:22: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // oberon0.g:1:27: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // oberon0.g:1:33: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // oberon0.g:1:39: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // oberon0.g:1:45: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // oberon0.g:1:51: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // oberon0.g:1:57: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // oberon0.g:1:63: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // oberon0.g:1:69: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // oberon0.g:1:75: T__18
                {
                mT__18(); 

                }
                break;
            case 13 :
                // oberon0.g:1:81: T__19
                {
                mT__19(); 

                }
                break;
            case 14 :
                // oberon0.g:1:87: T__20
                {
                mT__20(); 

                }
                break;
            case 15 :
                // oberon0.g:1:93: T__21
                {
                mT__21(); 

                }
                break;
            case 16 :
                // oberon0.g:1:99: T__22
                {
                mT__22(); 

                }
                break;
            case 17 :
                // oberon0.g:1:105: T__23
                {
                mT__23(); 

                }
                break;
            case 18 :
                // oberon0.g:1:111: T__24
                {
                mT__24(); 

                }
                break;
            case 19 :
                // oberon0.g:1:117: T__25
                {
                mT__25(); 

                }
                break;
            case 20 :
                // oberon0.g:1:123: T__26
                {
                mT__26(); 

                }
                break;
            case 21 :
                // oberon0.g:1:129: T__27
                {
                mT__27(); 

                }
                break;
            case 22 :
                // oberon0.g:1:135: T__28
                {
                mT__28(); 

                }
                break;
            case 23 :
                // oberon0.g:1:141: T__29
                {
                mT__29(); 

                }
                break;
            case 24 :
                // oberon0.g:1:147: T__30
                {
                mT__30(); 

                }
                break;
            case 25 :
                // oberon0.g:1:153: T__31
                {
                mT__31(); 

                }
                break;
            case 26 :
                // oberon0.g:1:159: T__32
                {
                mT__32(); 

                }
                break;
            case 27 :
                // oberon0.g:1:165: T__33
                {
                mT__33(); 

                }
                break;
            case 28 :
                // oberon0.g:1:171: T__34
                {
                mT__34(); 

                }
                break;
            case 29 :
                // oberon0.g:1:177: T__35
                {
                mT__35(); 

                }
                break;
            case 30 :
                // oberon0.g:1:183: T__36
                {
                mT__36(); 

                }
                break;
            case 31 :
                // oberon0.g:1:189: T__37
                {
                mT__37(); 

                }
                break;
            case 32 :
                // oberon0.g:1:195: T__38
                {
                mT__38(); 

                }
                break;
            case 33 :
                // oberon0.g:1:201: T__39
                {
                mT__39(); 

                }
                break;
            case 34 :
                // oberon0.g:1:207: T__40
                {
                mT__40(); 

                }
                break;
            case 35 :
                // oberon0.g:1:213: T__41
                {
                mT__41(); 

                }
                break;
            case 36 :
                // oberon0.g:1:219: T__42
                {
                mT__42(); 

                }
                break;
            case 37 :
                // oberon0.g:1:225: T__43
                {
                mT__43(); 

                }
                break;
            case 38 :
                // oberon0.g:1:231: T__44
                {
                mT__44(); 

                }
                break;
            case 39 :
                // oberon0.g:1:237: T__45
                {
                mT__45(); 

                }
                break;
            case 40 :
                // oberon0.g:1:243: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 41 :
                // oberon0.g:1:251: IDENT
                {
                mIDENT(); 

                }
                break;
            case 42 :
                // oberon0.g:1:257: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\1\40\2\uffff\3\40\1\uffff\2\40\1\53\2\40\1\uffff\1\60\1"+
        "\62\3\uffff\1\40\6\uffff\1\40\1\uffff\3\40\3\uffff\10\40\2\uffff"+
        "\1\40\1\102\1\103\4\uffff\1\40\1\105\1\40\1\107\2\40\1\113\1\40"+
        "\1\115\4\40\1\123\1\40\2\uffff\1\125\1\uffff\1\40\1\uffff\3\40\1"+
        "\uffff\1\40\1\uffff\1\40\1\134\1\40\1\136\1\137\1\uffff\1\40\1\uffff"+
        "\4\40\1\145\1\146\1\uffff\1\147\2\uffff\1\150\1\40\1\152\1\40\1"+
        "\154\4\uffff\1\155\1\uffff\1\40\2\uffff\2\40\1\161\1\uffff";
    static final String DFA4_eofS =
        "\162\uffff";
    static final String DFA4_minS =
        "\1\11\1\117\2\uffff\1\105\1\114\1\117\1\uffff\1\110\1\101\1\75\1"+
        "\122\1\106\1\uffff\2\75\3\uffff\1\111\6\uffff\1\105\1\uffff\1\106"+
        "\1\110\1\122\3\uffff\1\104\1\107\1\104\1\123\1\116\1\120\1\105\1"+
        "\122\2\uffff\1\122\2\60\4\uffff\1\126\1\60\1\103\1\60\1\111\1\117"+
        "\1\60\1\111\1\60\1\105\1\123\1\105\1\116\1\60\1\101\2\uffff\1\60"+
        "\1\uffff\1\117\1\uffff\1\114\1\103\1\114\1\uffff\1\116\1\uffff\1"+
        "\106\1\60\1\124\2\60\1\uffff\1\131\1\uffff\1\122\3\105\2\60\1\uffff"+
        "\1\60\2\uffff\1\60\1\104\1\60\1\104\1\60\4\uffff\1\60\1\uffff\1"+
        "\125\2\uffff\1\122\1\105\1\60\1\uffff";
    static final String DFA4_maxS =
        "\1\176\1\117\2\uffff\1\105\1\116\1\117\1\uffff\1\131\1\101\1\75"+
        "\2\122\1\uffff\2\75\3\uffff\1\117\6\uffff\1\105\1\uffff\1\106\1"+
        "\110\1\122\3\uffff\1\104\1\107\1\104\1\123\1\116\1\120\1\105\1\122"+
        "\2\uffff\1\122\2\172\4\uffff\1\126\1\172\1\103\1\172\1\111\1\117"+
        "\1\172\1\111\1\172\1\111\1\123\1\105\1\116\1\172\1\101\2\uffff\1"+
        "\172\1\uffff\1\117\1\uffff\1\114\1\103\1\114\1\uffff\1\116\1\uffff"+
        "\1\106\1\172\1\124\2\172\1\uffff\1\131\1\uffff\1\122\3\105\2\172"+
        "\1\uffff\1\172\2\uffff\1\172\1\104\1\172\1\104\1\172\4\uffff\1\172"+
        "\1\uffff\1\125\2\uffff\1\122\1\105\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\3\3\uffff\1\7\5\uffff\1\15\2\uffff\1\22\1\23\1\25"+
        "\1\uffff\1\30\1\31\1\32\1\33\1\34\1\35\1\uffff\1\37\3\uffff\1\50"+
        "\1\51\1\52\10\uffff\1\40\1\12\3\uffff\1\17\1\16\1\21\1\20\17\uffff"+
        "\1\14\1\24\1\uffff\1\46\1\uffff\1\41\3\uffff\1\27\1\uffff\1\5\5"+
        "\uffff\1\11\1\uffff\1\26\6\uffff\1\44\1\uffff\1\10\1\42\5\uffff"+
        "\1\4\1\43\1\6\1\13\1\uffff\1\45\1\uffff\1\1\1\36\3\uffff\1\47";
    static final String DFA4_specialS =
        "\162\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\41\2\uffff\1\41\22\uffff\1\41\2\uffff\1\15\2\uffff\1\24\1"+
            "\uffff\1\25\1\26\1\22\1\20\1\33\1\21\1\3\1\uffff\12\37\1\12"+
            "\1\2\1\16\1\7\1\17\2\uffff\1\13\1\4\1\6\1\23\1\5\3\40\1\34\3"+
            "\40\1\1\1\40\1\14\1\36\1\40\1\32\1\40\1\10\1\40\1\11\1\35\3"+
            "\40\1\30\1\uffff\1\31\3\uffff\32\40\3\uffff\1\27",
            "\1\42",
            "",
            "",
            "\1\43",
            "\1\45\1\uffff\1\44",
            "\1\46",
            "",
            "\1\50\20\uffff\1\47",
            "\1\51",
            "\1\52",
            "\1\54",
            "\1\55\13\uffff\1\56",
            "",
            "\1\57",
            "\1\61",
            "",
            "",
            "",
            "\1\63\5\uffff\1\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "",
            "\1\66",
            "\1\67",
            "\1\70",
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
            "",
            "",
            "\1\101",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "",
            "",
            "\1\104",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\106",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\110",
            "\1\111",
            "\12\40\7\uffff\24\40\1\112\5\40\6\uffff\32\40",
            "\1\114",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\117\3\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\124",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
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
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\151",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "\1\153",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\6\uffff\32\40",
            "",
            "\1\156",
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
            return "1:1: Tokens : ( MODULE | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | INTEGER | IDENT | WS );";
        }
    }
 

}