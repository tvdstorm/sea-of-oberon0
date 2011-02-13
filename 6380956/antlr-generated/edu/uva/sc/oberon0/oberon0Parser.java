// $ANTLR 3.3 Nov 30, 2010 12:50:56 F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g 2011-02-13 21:34:59

  package edu.uva.sc.oberon0;
  import edu.uva.sc.oberon0.Evaluators.*;
  import edu.uva.sc.oberon0.Evaluators.Boolean.*;
  import edu.uva.sc.oberon0.Evaluators.Numerical.*;
  import java.util.Map;
  import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTEGER", "IDENT", "WS", "'('", "')'", "'~'", "'*'", "'DIV'", "'MOD'", "'&'", "'+'", "'-'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "'['", "']'", "'.'", "':='", "';'", "','", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'END'", "'WHILE'", "'DO'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'VAR'", "'PROCEDURE'", "'BEGIN'", "'CONST'", "'TYPE'", "'MODULE'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
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
    public static final int INTEGER=4;
    public static final int IDENT=5;
    public static final int WS=6;

    // delegates
    // delegators


        public oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g"; }


      private Map<String, IEvaluator> variables = new HashMap<String, IEvaluator>();



    // $ANTLR start "factor"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:31:1: factor returns [IEvaluator e] : ( IDENT s= selector | INTEGER | '(' exp= expression ')' | '~' factor );
    public final IEvaluator factor() throws RecognitionException {
        IEvaluator e = null;

        Token IDENT1=null;
        Token INTEGER2=null;
        String s = null;

        IEvaluator exp = null;


        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:32:3: ( IDENT s= selector | INTEGER | '(' exp= expression ')' | '~' factor )
            int alt1=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt1=1;
                }
                break;
            case INTEGER:
                {
                alt1=2;
                }
                break;
            case 7:
                {
                alt1=3;
                }
                break;
            case 9:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:32:5: IDENT s= selector
                    {
                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor131); 
                    pushFollow(FOLLOW_selector_in_factor135);
                    s=selector();

                    state._fsp--;

                    String sel = (s==null)?"":s;
                      e =variables.get((IDENT1!=null?IDENT1.getText():null)+sel);

                    }
                    break;
                case 2 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:36:5: INTEGER
                    {
                    INTEGER2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor149); 
                    e =new IntegerEvaluator(Integer.parseInt((INTEGER2!=null?INTEGER2.getText():null)));

                    }
                    break;
                case 3 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:37:5: '(' exp= expression ')'
                    {
                    match(input,7,FOLLOW_7_in_factor158); 
                    pushFollow(FOLLOW_expression_in_factor162);
                    exp=expression();

                    state._fsp--;

                    match(input,8,FOLLOW_8_in_factor164); 
                    e =exp;

                    }
                    break;
                case 4 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:38:5: '~' factor
                    {
                    match(input,9,FOLLOW_9_in_factor173); 
                    pushFollow(FOLLOW_factor_in_factor175);
                    factor();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "factor"


    // $ANTLR start "term"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:39:1: term returns [IEvaluator e] : arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )* ;
    public final IEvaluator term() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:40:3: (arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )* )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:41:5: arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )*
            {
            pushFollow(FOLLOW_factor_in_term196);
            arg1=factor();

            state._fsp--;

            e =arg1;
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:42:5: ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 10:
                    {
                    alt2=1;
                    }
                    break;
                case 11:
                    {
                    alt2=2;
                    }
                    break;
                case 12:
                    {
                    alt2=3;
                    }
                    break;
                case 13:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:43:6: '*' arg2= factor
            	    {
            	    match(input,10,FOLLOW_10_in_term211); 
            	    pushFollow(FOLLOW_factor_in_term215);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new MultEvaluator(arg1.evaluate(), arg2.evaluate());

            	    }
            	    break;
            	case 2 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:44:8: 'DIV' arg2= factor
            	    {
            	    match(input,11,FOLLOW_11_in_term227); 
            	    pushFollow(FOLLOW_factor_in_term231);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new DivEvaluator(arg1.evaluate(), arg2.evaluate());

            	    }
            	    break;
            	case 3 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:45:8: 'MOD' arg2= factor
            	    {
            	    match(input,12,FOLLOW_12_in_term243); 
            	    pushFollow(FOLLOW_factor_in_term247);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new ModEvaluator(arg1.evaluate(), arg2.evaluate());

            	    }
            	    break;
            	case 4 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:46:8: '&' arg2= factor
            	    {
            	    match(input,13,FOLLOW_13_in_term259); 
            	    pushFollow(FOLLOW_factor_in_term263);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new AndEvaluator(arg1, arg2);

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "term"


    // $ANTLR start "simpleExpression"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:48:1: simpleExpression returns [IEvaluator e] : ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )* ;
    public final IEvaluator simpleExpression() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:49:3: ( ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )* )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:49:5: ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )*
            {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:49:5: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:
                    {
                    if ( (input.LA(1)>=14 && input.LA(1)<=15) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression322);
            arg1=term();

            state._fsp--;

            e =arg1;
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:54:6: ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )*
            loop4:
            do {
                int alt4=4;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt4=1;
                    }
                    break;
                case 15:
                    {
                    alt4=2;
                    }
                    break;
                case 16:
                    {
                    alt4=3;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:54:7: '+' arg2= term
            	    {
            	    match(input,14,FOLLOW_14_in_simpleExpression332); 
            	    pushFollow(FOLLOW_term_in_simpleExpression336);
            	    arg2=term();

            	    state._fsp--;

            	    e =new AddEvaluator(arg1.evaluate(), arg2.evaluate());

            	    }
            	    break;
            	case 2 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:55:7: '-' arg2= term
            	    {
            	    match(input,15,FOLLOW_15_in_simpleExpression347); 
            	    pushFollow(FOLLOW_term_in_simpleExpression351);
            	    arg2=term();

            	    state._fsp--;

            	    e =new MinEvaluator(arg1.evaluate(), arg2.evaluate());

            	    }
            	    break;
            	case 3 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:56:7: 'OR' arg2= term
            	    {
            	    match(input,16,FOLLOW_16_in_simpleExpression362); 
            	    pushFollow(FOLLOW_term_in_simpleExpression366);
            	    arg2=term();

            	    state._fsp--;

            	    e =new OrEvaluator(arg1, arg2);

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "expression"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:58:1: expression returns [IEvaluator e] : arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )? ;
    public final IEvaluator expression() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:59:3: (arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )? )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:59:5: arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression393);
            arg1=simpleExpression();

            state._fsp--;

            e =arg1;
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:60:5: ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )?
            int alt5=7;
            switch ( input.LA(1) ) {
                case 17:
                    {
                    alt5=1;
                    }
                    break;
                case 18:
                    {
                    alt5=2;
                    }
                    break;
                case 19:
                    {
                    alt5=3;
                    }
                    break;
                case 20:
                    {
                    alt5=4;
                    }
                    break;
                case 21:
                    {
                    alt5=5;
                    }
                    break;
                case 22:
                    {
                    alt5=6;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:61:7: '=' arg2= simpleExpression
                    {
                    match(input,17,FOLLOW_17_in_expression410); 
                    pushFollow(FOLLOW_simpleExpression_in_expression414);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new EqualEvaluator(arg1, arg2);

                    }
                    break;
                case 2 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:62:8: '#' arg2= simpleExpression
                    {
                    match(input,18,FOLLOW_18_in_expression426); 
                    pushFollow(FOLLOW_simpleExpression_in_expression430);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new NotEqualEvaluator(arg1, arg2);

                    }
                    break;
                case 3 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:63:8: '<' arg2= simpleExpression
                    {
                    match(input,19,FOLLOW_19_in_expression441); 
                    pushFollow(FOLLOW_simpleExpression_in_expression445);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new SmallerEvaluator(arg1, arg2);

                    }
                    break;
                case 4 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:64:8: '<=' arg2= simpleExpression
                    {
                    match(input,20,FOLLOW_20_in_expression456); 
                    pushFollow(FOLLOW_simpleExpression_in_expression460);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new SmallerOrEqualEvaluator(arg1, arg2);

                    }
                    break;
                case 5 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:65:8: '>' arg2= simpleExpression
                    {
                    match(input,21,FOLLOW_21_in_expression471); 
                    pushFollow(FOLLOW_simpleExpression_in_expression475);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new BiggerEvaluator(arg1, arg2);

                    }
                    break;
                case 6 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:66:8: '>=' arg2= simpleExpression
                    {
                    match(input,22,FOLLOW_22_in_expression486); 
                    pushFollow(FOLLOW_simpleExpression_in_expression490);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new BiggerOrEqualEvaluator(arg1, arg2);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "expression"


    // $ANTLR start "selector"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:68:1: selector returns [String s] : ( '[' exp= expression ']' | '.' IDENT )* ;
    public final String selector() throws RecognitionException {
        String s = null;

        Token IDENT3=null;
        IEvaluator exp = null;


        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:69:3: ( ( '[' exp= expression ']' | '.' IDENT )* )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:69:5: ( '[' exp= expression ']' | '.' IDENT )*
            {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:69:5: ( '[' exp= expression ']' | '.' IDENT )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }
                else if ( (LA6_0==25) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:70:5: '[' exp= expression ']'
            	    {
            	    match(input,23,FOLLOW_23_in_selector520); 
            	    pushFollow(FOLLOW_expression_in_selector524);
            	    exp=expression();

            	    state._fsp--;

            	    match(input,24,FOLLOW_24_in_selector526); 
            	    s ='['+exp.toString()+']';

            	    }
            	    break;
            	case 2 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:71:7: '.' IDENT
            	    {
            	    match(input,25,FOLLOW_25_in_selector536); 
            	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector538); 
            	    s ='.'+(IDENT3!=null?IDENT3.getText():null);

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "assignment"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:73:1: assignment : IDENT arg1= selector ':=' arg2= expression ;
    public final void assignment() throws RecognitionException {
        Token IDENT4=null;
        String arg1 = null;

        IEvaluator arg2 = null;


        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:74:3: ( IDENT arg1= selector ':=' arg2= expression )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:74:5: IDENT arg1= selector ':=' arg2= expression
            {
            IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment555); 
            pushFollow(FOLLOW_selector_in_assignment559);
            arg1=selector();

            state._fsp--;

            match(input,26,FOLLOW_26_in_assignment561); 
            pushFollow(FOLLOW_expression_in_assignment565);
            arg2=expression();

            state._fsp--;

            String sel = (arg1==null)?"":arg1;
              variables.put((IDENT4!=null?IDENT4.getText():null) + sel, arg2);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "test"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:78:1: test returns [IEvaluator e] : a= assignment ';' ex= expression ;
    public final IEvaluator test() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator ex = null;


        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:78:29: (a= assignment ';' ex= expression )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:78:31: a= assignment ';' ex= expression
            {
            pushFollow(FOLLOW_assignment_in_test587);
            assignment();

            state._fsp--;

            match(input,27,FOLLOW_27_in_test589); 
            pushFollow(FOLLOW_expression_in_test593);
            ex=expression();

            state._fsp--;

            e =ex;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "test"


    // $ANTLR start "actualParameters"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:1: actualParameters returns [IEvaluator e] : '(' ( expression ( ',' expression )* )? ')' ;
    public final IEvaluator actualParameters() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:41: ( '(' ( expression ( ',' expression )* )? ')' )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:43: '(' ( expression ( ',' expression )* )? ')'
            {
            match(input,7,FOLLOW_7_in_actualParameters607); 
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:47: ( expression ( ',' expression )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=INTEGER && LA8_0<=IDENT)||LA8_0==7||LA8_0==9||(LA8_0>=14 && LA8_0<=15)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:48: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters610);
                    expression();

                    state._fsp--;

                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:59: ( ',' expression )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==28) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:60: ',' expression
                    	    {
                    	    match(input,28,FOLLOW_28_in_actualParameters613); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters615);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,8,FOLLOW_8_in_actualParameters621); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "actualParameters"


    // $ANTLR start "procedureCall"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:1: procedureCall returns [IEvaluator e] : IDENT ( actualParameters )? ;
    public final IEvaluator procedureCall() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:38: ( IDENT ( actualParameters )? )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:40: IDENT ( actualParameters )?
            {
            match(input,IDENT,FOLLOW_IDENT_in_procedureCall632); 
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:46: ( actualParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==7) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:47: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall635);
                    actualParameters();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedureCall"


    // $ANTLR start "ifStatement"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:82:1: ifStatement returns [IEvaluator e] : 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
    public final IEvaluator ifStatement() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:82:36: ( 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:82:38: 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
            {
            match(input,29,FOLLOW_29_in_ifStatement648); 
            pushFollow(FOLLOW_expression_in_ifStatement650);
            expression();

            state._fsp--;

            match(input,30,FOLLOW_30_in_ifStatement652); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement654);
            statementSequence();

            state._fsp--;

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:83:3: ( 'ELSIF' expression 'THEN' statementSequence )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:83:4: 'ELSIF' expression 'THEN' statementSequence
            	    {
            	    match(input,31,FOLLOW_31_in_ifStatement659); 
            	    pushFollow(FOLLOW_expression_in_ifStatement661);
            	    expression();

            	    state._fsp--;

            	    match(input,30,FOLLOW_30_in_ifStatement663); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement665);
            	    statementSequence();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:84:3: ( 'ELSE' statementSequence )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:84:4: 'ELSE' statementSequence
                    {
                    match(input,32,FOLLOW_32_in_ifStatement672); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement674);
                    statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_ifStatement678); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:85:1: whileStatement returns [IEvaluator e] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IEvaluator whileStatement() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:85:39: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:85:41: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,34,FOLLOW_34_in_whileStatement689); 
            pushFollow(FOLLOW_expression_in_whileStatement691);
            expression();

            state._fsp--;

            match(input,35,FOLLOW_35_in_whileStatement693); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement695);
            statementSequence();

            state._fsp--;

            match(input,33,FOLLOW_33_in_whileStatement697); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "statement"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:1: statement returns [IEvaluator e] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final IEvaluator statement() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:34: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:36: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:36: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt12=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==23||(LA12_1>=25 && LA12_1<=26)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_1==7||LA12_1==27||(LA12_1>=31 && LA12_1<=33)) ) {
                        alt12=2;
                    }
                    }
                    break;
                case 29:
                    {
                    alt12=3;
                    }
                    break;
                case 34:
                    {
                    alt12=4;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:37: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement709);
                    assignment();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:50: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement713);
                    procedureCall();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:66: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement717);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:80: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement721);
                    whileStatement();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "statement"


    // $ANTLR start "statementSequence"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:1: statementSequence returns [IEvaluator e] : statement ( ';' statement )* ;
    public final IEvaluator statementSequence() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:42: ( statement ( ';' statement )* )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:44: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence734);
            statement();

            state._fsp--;

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:54: ( ';' statement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:55: ';' statement
            	    {
            	    match(input,27,FOLLOW_27_in_statementSequence737); 
            	    pushFollow(FOLLOW_statement_in_statementSequence739);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "statementSequence"


    // $ANTLR start "identList"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:1: identList returns [IEvaluator e] : IDENT ( ',' IDENT )* ;
    public final IEvaluator identList() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:34: ( IDENT ( ',' IDENT )* )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:36: IDENT ( ',' IDENT )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_identList752); 
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:42: ( ',' IDENT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:43: ',' IDENT
            	    {
            	    match(input,28,FOLLOW_28_in_identList755); 
            	    match(input,IDENT,FOLLOW_IDENT_in_identList757); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "identList"


    // $ANTLR start "arrayType"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:89:1: arrayType returns [IEvaluator e] : 'ARRAY' expression 'OF' type ;
    public final IEvaluator arrayType() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:89:34: ( 'ARRAY' expression 'OF' type )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:89:36: 'ARRAY' expression 'OF' type
            {
            match(input,36,FOLLOW_36_in_arrayType770); 
            pushFollow(FOLLOW_expression_in_arrayType772);
            expression();

            state._fsp--;

            match(input,37,FOLLOW_37_in_arrayType774); 
            pushFollow(FOLLOW_type_in_arrayType776);
            type();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "arrayType"


    // $ANTLR start "fieldList"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:90:1: fieldList returns [IEvaluator e] : ( identList ':' type )? ;
    public final IEvaluator fieldList() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:90:35: ( ( identList ':' type )? )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:90:38: ( identList ':' type )?
            {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:90:38: ( identList ':' type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:90:39: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList790);
                    identList();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_fieldList792); 
                    pushFollow(FOLLOW_type_in_fieldList794);
                    type();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "fieldList"


    // $ANTLR start "recordType"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:91:1: recordType returns [IEvaluator e] : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final IEvaluator recordType() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:91:35: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:91:37: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            match(input,39,FOLLOW_39_in_recordType808); 
            pushFollow(FOLLOW_fieldList_in_recordType810);
            fieldList();

            state._fsp--;

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:91:56: ( ';' fieldList )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:91:57: ';' fieldList
            	    {
            	    match(input,27,FOLLOW_27_in_recordType813); 
            	    pushFollow(FOLLOW_fieldList_in_recordType815);
            	    fieldList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,33,FOLLOW_33_in_recordType819); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "recordType"


    // $ANTLR start "type"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:1: type returns [IEvaluator e] : ( IDENT | arrayType | recordType );
    public final IEvaluator type() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:29: ( IDENT | arrayType | recordType )
            int alt17=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt17=1;
                }
                break;
            case 36:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:31: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_type830); 

                    }
                    break;
                case 2 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:39: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type834);
                    arrayType();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:51: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type838);
                    recordType();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "type"


    // $ANTLR start "fPSection"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:93:1: fPSection returns [IEvaluator e] : ( 'VAR' )? identList ':' type ;
    public final IEvaluator fPSection() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:93:35: ( ( 'VAR' )? identList ':' type )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:93:38: ( 'VAR' )? identList ':' type
            {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:93:38: ( 'VAR' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:93:39: 'VAR'
                    {
                    match(input,40,FOLLOW_40_in_fPSection852); 

                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection856);
            identList();

            state._fsp--;

            match(input,38,FOLLOW_38_in_fPSection858); 
            pushFollow(FOLLOW_type_in_fPSection860);
            type();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "fPSection"


    // $ANTLR start "formalParameters"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:1: formalParameters returns [IEvaluator e] : '(' ( fPSection ( ';' fPSection )* )? ')' ;
    public final IEvaluator formalParameters() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:42: ( '(' ( fPSection ( ';' fPSection )* )? ')' )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:45: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            match(input,7,FOLLOW_7_in_formalParameters874); 
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:49: ( fPSection ( ';' fPSection )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT||LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:50: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters877);
                    fPSection();

                    state._fsp--;

                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:60: ( ';' fPSection )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==27) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:61: ';' fPSection
                    	    {
                    	    match(input,27,FOLLOW_27_in_formalParameters880); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters882);
                    	    fPSection();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,8,FOLLOW_8_in_formalParameters888); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "formalParameters"


    // $ANTLR start "procedureHeading"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:96:1: procedureHeading returns [IEvaluator e] : 'PROCEDURE' IDENT ( formalParameters )? ;
    public final IEvaluator procedureHeading() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:96:42: ( 'PROCEDURE' IDENT ( formalParameters )? )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:96:45: 'PROCEDURE' IDENT ( formalParameters )?
            {
            match(input,41,FOLLOW_41_in_procedureHeading902); 
            match(input,IDENT,FOLLOW_IDENT_in_procedureHeading904); 
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:96:63: ( formalParameters )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==7) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:96:64: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading907);
                    formalParameters();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedureHeading"


    // $ANTLR start "procedureBody"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:97:1: procedureBody returns [IEvaluator e] : declarations ( 'BEGIN' statementSequence )? 'END' ;
    public final IEvaluator procedureBody() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:97:39: ( declarations ( 'BEGIN' statementSequence )? 'END' )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:97:42: declarations ( 'BEGIN' statementSequence )? 'END'
            {
            pushFollow(FOLLOW_declarations_in_procedureBody923);
            declarations();

            state._fsp--;

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:97:55: ( 'BEGIN' statementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:97:56: 'BEGIN' statementSequence
                    {
                    match(input,42,FOLLOW_42_in_procedureBody926); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody928);
                    statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_procedureBody932); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedureBody"


    // $ANTLR start "procedureDeclaration"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:98:1: procedureDeclaration returns [IEvaluator e] : procedureHeading ';' procedureBody IDENT ;
    public final IEvaluator procedureDeclaration() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:98:46: ( procedureHeading ';' procedureBody IDENT )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:98:49: procedureHeading ';' procedureBody IDENT
            {
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration946);
            procedureHeading();

            state._fsp--;

            match(input,27,FOLLOW_27_in_procedureDeclaration948); 
            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration950);
            procedureBody();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration952); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedureDeclaration"


    // $ANTLR start "declarations"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:1: declarations returns [IEvaluator e] : ( 'CONST' ( IDENT '=' expression ';' )* )? ( 'TYPE' ( IDENT '=' type ';' )* )? ( 'VAR' ( identList ':' type ';' )* )? ( procedureDeclaration ';' )* ;
    public final IEvaluator declarations() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:38: ( ( 'CONST' ( IDENT '=' expression ';' )* )? ( 'TYPE' ( IDENT '=' type ';' )* )? ( 'VAR' ( identList ':' type ';' )* )? ( procedureDeclaration ';' )* )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:41: ( 'CONST' ( IDENT '=' expression ';' )* )? ( 'TYPE' ( IDENT '=' type ';' )* )? ( 'VAR' ( identList ':' type ';' )* )? ( procedureDeclaration ';' )*
            {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:41: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:42: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    match(input,43,FOLLOW_43_in_declarations967); 
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:50: ( IDENT '=' expression ';' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==IDENT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:51: IDENT '=' expression ';'
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations970); 
                    	    match(input,17,FOLLOW_17_in_declarations972); 
                    	    pushFollow(FOLLOW_expression_in_declarations974);
                    	    expression();

                    	    state._fsp--;

                    	    match(input,27,FOLLOW_27_in_declarations976); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:100:2: ( 'TYPE' ( IDENT '=' type ';' )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:100:3: 'TYPE' ( IDENT '=' type ';' )*
                    {
                    match(input,44,FOLLOW_44_in_declarations985); 
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:100:10: ( IDENT '=' type ';' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENT) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:100:11: IDENT '=' type ';'
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations988); 
                    	    match(input,17,FOLLOW_17_in_declarations990); 
                    	    pushFollow(FOLLOW_type_in_declarations992);
                    	    type();

                    	    state._fsp--;

                    	    match(input,27,FOLLOW_27_in_declarations994); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:101:2: ( 'VAR' ( identList ':' type ';' )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:101:3: 'VAR' ( identList ':' type ';' )*
                    {
                    match(input,40,FOLLOW_40_in_declarations1003); 
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:101:9: ( identList ':' type ';' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==IDENT) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:101:10: identList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_declarations1006);
                    	    identList();

                    	    state._fsp--;

                    	    match(input,38,FOLLOW_38_in_declarations1008); 
                    	    pushFollow(FOLLOW_type_in_declarations1010);
                    	    type();

                    	    state._fsp--;

                    	    match(input,27,FOLLOW_27_in_declarations1012); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:102:2: ( procedureDeclaration ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:102:3: procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1021);
            	    procedureDeclaration();

            	    state._fsp--;

            	    match(input,27,FOLLOW_27_in_declarations1023); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "declarations"


    // $ANTLR start "module"
    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:103:1: module returns [IEvaluator e] : 'MODULE' IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' IDENT '.' ;
    public final IEvaluator module() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:103:32: ( 'MODULE' IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' IDENT '.' )
            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:103:35: 'MODULE' IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' IDENT '.'
            {
            match(input,45,FOLLOW_45_in_module1038); 
            match(input,IDENT,FOLLOW_IDENT_in_module1040); 
            match(input,27,FOLLOW_27_in_module1042); 
            pushFollow(FOLLOW_declarations_in_module1044);
            declarations();

            state._fsp--;

            // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:104:2: ( 'BEGIN' statementSequence )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // F:\\project\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:104:3: 'BEGIN' statementSequence
                    {
                    match(input,42,FOLLOW_42_in_module1049); 
                    pushFollow(FOLLOW_statementSequence_in_module1051);
                    statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_module1055); 
            match(input,IDENT,FOLLOW_IDENT_in_module1057); 
            match(input,25,FOLLOW_25_in_module1059); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "module"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_factor131 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_selector_in_factor135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_factor158 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_factor162 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_factor164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_factor173 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_factor175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term196 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_10_in_term211 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term215 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_11_in_term227 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term231 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_12_in_term243 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term247 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_13_in_term259 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term263 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_set_in_simpleExpression287 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression322 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_14_in_simpleExpression332 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression336 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_15_in_simpleExpression347 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression351 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_16_in_simpleExpression362 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression366 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression393 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_17_in_expression410 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expression426 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expression441 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expression456 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_expression471 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expression486 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_selector520 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_selector524 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_selector526 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_25_in_selector536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selector538 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_IDENT_in_assignment555 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_selector_in_assignment559 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assignment561 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_assignment565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_test587 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_test589 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_test593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_actualParameters607 = new BitSet(new long[]{0x000000000000C3B0L});
    public static final BitSet FOLLOW_expression_in_actualParameters610 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_28_in_actualParameters613 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_actualParameters615 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_8_in_actualParameters621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall632 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ifStatement648 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_ifStatement650 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ifStatement652 = new BitSet(new long[]{0x0000000428000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement654 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_31_in_ifStatement659 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_ifStatement661 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ifStatement663 = new BitSet(new long[]{0x0000000428000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement665 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_32_in_ifStatement672 = new BitSet(new long[]{0x0000000428000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement674 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifStatement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_whileStatement689 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_whileStatement691 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_whileStatement693 = new BitSet(new long[]{0x0000000428000020L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement695 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_whileStatement697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence734 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_statementSequence737 = new BitSet(new long[]{0x0000000428000020L});
    public static final BitSet FOLLOW_statement_in_statementSequence739 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_IDENT_in_identList752 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_identList755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identList757 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_36_in_arrayType770 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_arrayType772 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_arrayType774 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_arrayType776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList790 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fieldList792 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_fieldList794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_recordType808 = new BitSet(new long[]{0x0000000208000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType810 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_27_in_recordType813 = new BitSet(new long[]{0x0000000208000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType815 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_33_in_recordType819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_fPSection852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_fPSection856 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fPSection858 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_fPSection860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_formalParameters874 = new BitSet(new long[]{0x0000010000000120L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters877 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_27_in_formalParameters880 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters882 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_8_in_formalParameters888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_procedureHeading902 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureHeading904 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody923 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_42_in_procedureBody926 = new BitSet(new long[]{0x0000000428000020L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody928 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_procedureBody932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration946 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_procedureDeclaration948 = new BitSet(new long[]{0x00001F0200000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_declarations967 = new BitSet(new long[]{0x0000130000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations970 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_declarations972 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_declarations974 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_declarations976 = new BitSet(new long[]{0x0000130000000022L});
    public static final BitSet FOLLOW_44_in_declarations985 = new BitSet(new long[]{0x0000030000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations988 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_declarations990 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_declarations992 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_declarations994 = new BitSet(new long[]{0x0000030000000022L});
    public static final BitSet FOLLOW_40_in_declarations1003 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_identList_in_declarations1006 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_declarations1008 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_declarations1010 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_declarations1012 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1021 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_declarations1023 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_45_in_module1038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1040 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_module1042 = new BitSet(new long[]{0x00001F0200000000L});
    public static final BitSet FOLLOW_declarations_in_module1044 = new BitSet(new long[]{0x0000040200000000L});
    public static final BitSet FOLLOW_42_in_module1049 = new BitSet(new long[]{0x0000000428000020L});
    public static final BitSet FOLLOW_statementSequence_in_module1051 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_module1055 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1057 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_module1059 = new BitSet(new long[]{0x0000000000000002L});

}