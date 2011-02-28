// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g 2011-02-28 10:05:44

  package edu.uva.sc.oberon0;
  import edu.uva.sc.oberon0.Evaluators.*;
  import edu.uva.sc.oberon0.Evaluators.Boolean.*;
  import edu.uva.sc.oberon0.Evaluators.Numerical.*;
  import edu.uva.sc.oberon0.Evaluators.Structural.*;
  import edu.uva.sc.oberon0.Evaluators.Conditional.*;
  import edu.uva.sc.oberon0.Evaluators.Selectors.*;
  import edu.uva.sc.oberon0.Evaluators.Types.*;
  import java.util.List;
  import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INTEGER", "IDENT", "WS", "'('", "')'", "'~'", "'*'", "'DIV'", "'MOD'", "'&'", "'+'", "'-'", "'OR'", "'='", "'#'", "'<'", "'<='", "'>'", "'>='", "'['", "']'", "'.'", "':='", "','", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'END'", "'WHILE'", "'DO'", "';'", "'ARRAY'", "'OF'", "':'", "'RECORD'", "'VAR'", "'PROCEDURE'", "'BEGIN'", "'CONST'", "'TYPE'", "'MODULE'"
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
    public String getGrammarFileName() { return "C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g"; }



    // $ANTLR start "factor"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:31:1: factor returns [IEvaluator e] : ( IDENT s= selector | INTEGER | '(' exp= expression ')' | '~' factor );
    public final IEvaluator factor() throws RecognitionException {
        IEvaluator e = null;

        Token IDENT1=null;
        Token INTEGER2=null;
        ISelector s = null;

        IEvaluator exp = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:32:3: ( IDENT s= selector | INTEGER | '(' exp= expression ')' | '~' factor )
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
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:32:5: IDENT s= selector
                    {
                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor128); 
                    pushFollow(FOLLOW_selector_in_factor132);
                    s=selector();

                    state._fsp--;

                    e = new VariableRef((IDENT1!=null?IDENT1.getText():null), s);

                    }
                    break;
                case 2 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:34:5: INTEGER
                    {
                    INTEGER2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor143); 
                    e =new Integ(INTEGER2);

                    }
                    break;
                case 3 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:35:5: '(' exp= expression ')'
                    {
                    match(input,7,FOLLOW_7_in_factor152); 
                    pushFollow(FOLLOW_expression_in_factor156);
                    exp=expression();

                    state._fsp--;

                    match(input,8,FOLLOW_8_in_factor158); 
                    e =exp;

                    }
                    break;
                case 4 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:36:5: '~' factor
                    {
                    match(input,9,FOLLOW_9_in_factor167); 
                    pushFollow(FOLLOW_factor_in_factor169);
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
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:37:1: term returns [IEvaluator e] : arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )* ;
    public final IEvaluator term() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:38:3: (arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )* )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:39:5: arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )*
            {
            pushFollow(FOLLOW_factor_in_term190);
            arg1=factor();

            state._fsp--;

            e =arg1;
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:40:5: ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )*
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
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:41:6: '*' arg2= factor
            	    {
            	    match(input,10,FOLLOW_10_in_term205); 
            	    pushFollow(FOLLOW_factor_in_term209);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new Mult(arg1, arg2);

            	    }
            	    break;
            	case 2 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:42:8: 'DIV' arg2= factor
            	    {
            	    match(input,11,FOLLOW_11_in_term221); 
            	    pushFollow(FOLLOW_factor_in_term225);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new Div(arg1, arg2);

            	    }
            	    break;
            	case 3 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:43:8: 'MOD' arg2= factor
            	    {
            	    match(input,12,FOLLOW_12_in_term237); 
            	    pushFollow(FOLLOW_factor_in_term241);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new Mod(arg1, arg2);

            	    }
            	    break;
            	case 4 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:44:8: '&' arg2= factor
            	    {
            	    match(input,13,FOLLOW_13_in_term253); 
            	    pushFollow(FOLLOW_factor_in_term257);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new And(arg1, arg2);

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
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:46:1: simpleExpression returns [IEvaluator e] : ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )* ;
    public final IEvaluator simpleExpression() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:47:3: ( ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )* )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:47:5: ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )*
            {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:47:5: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:
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

            pushFollow(FOLLOW_term_in_simpleExpression316);
            arg1=term();

            state._fsp--;

            e =arg1;
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:52:6: ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )*
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
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:52:7: '+' arg2= term
            	    {
            	    match(input,14,FOLLOW_14_in_simpleExpression326); 
            	    pushFollow(FOLLOW_term_in_simpleExpression330);
            	    arg2=term();

            	    state._fsp--;

            	    e =new Add(arg1, arg2);

            	    }
            	    break;
            	case 2 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:53:7: '-' arg2= term
            	    {
            	    match(input,15,FOLLOW_15_in_simpleExpression341); 
            	    pushFollow(FOLLOW_term_in_simpleExpression345);
            	    arg2=term();

            	    state._fsp--;

            	    e =new Min(arg1, arg2);

            	    }
            	    break;
            	case 3 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:54:7: 'OR' arg2= term
            	    {
            	    match(input,16,FOLLOW_16_in_simpleExpression356); 
            	    pushFollow(FOLLOW_term_in_simpleExpression360);
            	    arg2=term();

            	    state._fsp--;

            	    e =new Or(arg1, arg2);

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
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:56:1: expression returns [IEvaluator e] : arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )? ;
    public final IEvaluator expression() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:57:3: (arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )? )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:57:5: arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression387);
            arg1=simpleExpression();

            state._fsp--;

            e =arg1;
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:58:5: ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )?
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
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:59:7: '=' arg2= simpleExpression
                    {
                    match(input,17,FOLLOW_17_in_expression404); 
                    pushFollow(FOLLOW_simpleExpression_in_expression408);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new Equal(arg1, arg2);

                    }
                    break;
                case 2 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:60:8: '#' arg2= simpleExpression
                    {
                    match(input,18,FOLLOW_18_in_expression420); 
                    pushFollow(FOLLOW_simpleExpression_in_expression424);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new NotEqual(arg1, arg2);

                    }
                    break;
                case 3 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:61:8: '<' arg2= simpleExpression
                    {
                    match(input,19,FOLLOW_19_in_expression435); 
                    pushFollow(FOLLOW_simpleExpression_in_expression439);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new Smaller(arg1, arg2);

                    }
                    break;
                case 4 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:62:8: '<=' arg2= simpleExpression
                    {
                    match(input,20,FOLLOW_20_in_expression450); 
                    pushFollow(FOLLOW_simpleExpression_in_expression454);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new SmallerOrEqual(arg1, arg2);

                    }
                    break;
                case 5 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:63:8: '>' arg2= simpleExpression
                    {
                    match(input,21,FOLLOW_21_in_expression465); 
                    pushFollow(FOLLOW_simpleExpression_in_expression469);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new Bigger(arg1, arg2);

                    }
                    break;
                case 6 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:64:8: '>=' arg2= simpleExpression
                    {
                    match(input,22,FOLLOW_22_in_expression480); 
                    pushFollow(FOLLOW_simpleExpression_in_expression484);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new BiggerOrEqual(arg1, arg2);

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
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:67:1: selector returns [ISelector s] : ( '[' exp= expression ']' | '.' IDENT )* ;
    public final ISelector selector() throws RecognitionException {
        ISelector s = null;

        Token IDENT3=null;
        IEvaluator exp = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:68:3: ( ( '[' exp= expression ']' | '.' IDENT )* )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:68:5: ( '[' exp= expression ']' | '.' IDENT )*
            {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:68:5: ( '[' exp= expression ']' | '.' IDENT )*
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
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:69:5: '[' exp= expression ']'
            	    {
            	    match(input,23,FOLLOW_23_in_selector519); 
            	    pushFollow(FOLLOW_expression_in_selector523);
            	    exp=expression();

            	    state._fsp--;

            	    match(input,24,FOLLOW_24_in_selector525); 
            	    s =new ArraySelector(exp);

            	    }
            	    break;
            	case 2 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:70:7: '.' IDENT
            	    {
            	    match(input,25,FOLLOW_25_in_selector535); 
            	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector537); 
            	    s =new ObjectSelector(IDENT3);

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
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:73:1: assignment returns [Assignment a] : IDENT sel= selector ':=' exp= expression ;
    public final Assignment assignment() throws RecognitionException {
        Assignment a = null;

        Token IDENT4=null;
        ISelector sel = null;

        IEvaluator exp = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:74:3: ( IDENT sel= selector ':=' exp= expression )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:74:5: IDENT sel= selector ':=' exp= expression
            {
            IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment561); 
            pushFollow(FOLLOW_selector_in_assignment565);
            sel=selector();

            state._fsp--;

            match(input,26,FOLLOW_26_in_assignment567); 
            pushFollow(FOLLOW_expression_in_assignment571);
            exp=expression();

            state._fsp--;

            a = new Assignment((IDENT4!=null?IDENT4.getText():null), sel, exp);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "actualParameters"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:78:1: actualParameters returns [List<IEvaluator> lp] : '(' (exp1= expression ( ',' exp2= expression )* )? ')' ;
    public final List<IEvaluator> actualParameters() throws RecognitionException {
        List<IEvaluator> lp = null;

        IEvaluator exp1 = null;

        IEvaluator exp2 = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:78:48: ( '(' (exp1= expression ( ',' exp2= expression )* )? ')' )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:79:1: '(' (exp1= expression ( ',' exp2= expression )* )? ')'
            {
            List<IEvaluator> paramsList = new LinkedList<IEvaluator>();
            match(input,7,FOLLOW_7_in_actualParameters594); 
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:5: (exp1= expression ( ',' exp2= expression )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=INTEGER && LA8_0<=IDENT)||LA8_0==7||LA8_0==9||(LA8_0>=14 && LA8_0<=15)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:2: exp1= expression ( ',' exp2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters601);
                    exp1=expression();

                    state._fsp--;

                    paramsList.add(exp1);
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:82:2: ( ',' exp2= expression )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==27) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:82:3: ',' exp2= expression
                    	    {
                    	    match(input,27,FOLLOW_27_in_actualParameters607); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters611);
                    	    exp2=expression();

                    	    state._fsp--;

                    	    paramsList.add(exp2);

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
            lp = paramsList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return lp;
    }
    // $ANTLR end "actualParameters"


    // $ANTLR start "procedureCall"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:1: procedureCall returns [ProcedureCall pc] : IDENT (ap= actualParameters )? ;
    public final ProcedureCall procedureCall() throws RecognitionException {
        ProcedureCall pc = null;

        Token IDENT5=null;
        List<IEvaluator> ap = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:42: ( IDENT (ap= actualParameters )? )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:1: IDENT (ap= actualParameters )?
            {
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall638); 
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:7: (ap= actualParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==7) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:88:8: ap= actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall643);
                    ap=actualParameters();

                    state._fsp--;


                    }
                    break;

            }

            pc =new ProcedureCall((IDENT5!=null?IDENT5.getText():null), ap);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pc;
    }
    // $ANTLR end "procedureCall"


    // $ANTLR start "ifStatement"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:1: ifStatement returns [IfStatement ifs] : 'IF' exp1= expression 'THEN' ss1= statementSequence ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )* ( 'ELSE' ss3= statementSequence )? 'END' ;
    public final IfStatement ifStatement() throws RecognitionException {
        IfStatement ifs = null;

        IEvaluator exp1 = null;

        List<IStatement> ss1 = null;

        IEvaluator exp2 = null;

        List<IStatement> ss2 = null;

        List<IStatement> ss3 = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:39: ( 'IF' exp1= expression 'THEN' ss1= statementSequence ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )* ( 'ELSE' ss3= statementSequence )? 'END' )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:93:1: 'IF' exp1= expression 'THEN' ss1= statementSequence ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )* ( 'ELSE' ss3= statementSequence )? 'END'
            {
            IfStatement result = new IfStatement();
            match(input,28,FOLLOW_28_in_ifStatement664); 
            pushFollow(FOLLOW_expression_in_ifStatement668);
            exp1=expression();

            state._fsp--;

            match(input,29,FOLLOW_29_in_ifStatement670); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement674);
            ss1=statementSequence();

            state._fsp--;

            result.SetIfBlock(new SimpleIfStatement(exp1, ss1));
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:96:1: ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:96:2: 'ELSIF' exp2= expression 'THEN' ss2= statementSequence
            	    {
            	    match(input,30,FOLLOW_30_in_ifStatement679); 
            	    pushFollow(FOLLOW_expression_in_ifStatement683);
            	    exp2=expression();

            	    state._fsp--;

            	    match(input,29,FOLLOW_29_in_ifStatement685); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement689);
            	    ss2=statementSequence();

            	    state._fsp--;

            	    result.AddElseIf(new SimpleIfStatement(exp2, ss2));

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:1: ( 'ELSE' ss3= statementSequence )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:99:2: 'ELSE' ss3= statementSequence
                    {
                    match(input,31,FOLLOW_31_in_ifStatement697); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement701);
                    ss3=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ifStatement705); 
            result.SetElseStatements(ss3);
            ifs = result;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ifs;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:104:1: whileStatement returns [WhileStatement ws] : 'WHILE' exp= expression 'DO' ss= statementSequence 'END' ;
    public final WhileStatement whileStatement() throws RecognitionException {
        WhileStatement ws = null;

        IEvaluator exp = null;

        List<IStatement> ss = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:104:44: ( 'WHILE' exp= expression 'DO' ss= statementSequence 'END' )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:105:1: 'WHILE' exp= expression 'DO' ss= statementSequence 'END'
            {
            match(input,33,FOLLOW_33_in_whileStatement721); 
            pushFollow(FOLLOW_expression_in_whileStatement725);
            exp=expression();

            state._fsp--;

            match(input,34,FOLLOW_34_in_whileStatement727); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement731);
            ss=statementSequence();

            state._fsp--;

            match(input,32,FOLLOW_32_in_whileStatement733); 
            ws =new WhileStatement(exp, ss);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ws;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "statement"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:108:1: statement returns [IStatement s] : (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )? ;
    public final IStatement statement() throws RecognitionException {
        IStatement s = null;

        Assignment assgn = null;

        ProcedureCall pc = null;

        IfStatement ifs = null;

        WhileStatement wh = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:108:34: ( (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )? )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:109:1: (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )?
            {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:109:1: (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )?
            int alt12=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==23||(LA12_1>=25 && LA12_1<=26)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_1==7||(LA12_1>=30 && LA12_1<=32)||LA12_1==35) ) {
                        alt12=2;
                    }
                    }
                    break;
                case 28:
                    {
                    alt12=3;
                    }
                    break;
                case 33:
                    {
                    alt12=4;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:109:3: assgn= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement752);
                    assgn=assignment();

                    state._fsp--;

                    s = assgn;

                    }
                    break;
                case 2 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:110:3: pc= procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement760);
                    pc=procedureCall();

                    state._fsp--;

                    s = pc;

                    }
                    break;
                case 3 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:111:3: ifs= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement768);
                    ifs=ifStatement();

                    state._fsp--;

                    s = ifs;

                    }
                    break;
                case 4 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:112:3: wh= whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement776);
                    wh=whileStatement();

                    state._fsp--;

                    s = wh;

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
        return s;
    }
    // $ANTLR end "statement"


    // $ANTLR start "statementSequence"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:115:1: statementSequence returns [List<IStatement> ls] : s1= statement ( ';' s2= statement )* ;
    public final List<IStatement> statementSequence() throws RecognitionException {
        List<IStatement> ls = null;

        IStatement s1 = null;

        IStatement s2 = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:115:49: (s1= statement ( ';' s2= statement )* )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:116:1: s1= statement ( ';' s2= statement )*
            {
            List<IStatement> statementsList = new LinkedList<IStatement>();
            pushFollow(FOLLOW_statement_in_statementSequence797);
            s1=statement();

            state._fsp--;

            statementsList.add(s1);
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:118:1: ( ';' s2= statement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:118:2: ';' s2= statement
            	    {
            	    match(input,35,FOLLOW_35_in_statementSequence802); 
            	    pushFollow(FOLLOW_statement_in_statementSequence806);
            	    s2=statement();

            	    state._fsp--;

            	    if(s2!=null)statementsList.add(s2);

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            ls =statementsList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ls;
    }
    // $ANTLR end "statementSequence"


    // $ANTLR start "identList"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:122:1: identList returns [List<String> il] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> il = null;

        Token i1=null;
        Token i2=null;

        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:122:37: (i1= IDENT ( ',' i2= IDENT )* )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:123:1: i1= IDENT ( ',' i2= IDENT )*
            {
            List<String> idents = new LinkedList<String>();
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList830); 
            idents.add(i1.getText());
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:125:1: ( ',' i2= IDENT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:125:2: ',' i2= IDENT
            	    {
            	    match(input,27,FOLLOW_27_in_identList835); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList839); 
            	    idents.add(i2.getText());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            il =idents;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return il;
    }
    // $ANTLR end "identList"


    // $ANTLR start "arrayType"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:128:1: arrayType returns [ArrayType at] : 'ARRAY' exp= expression 'OF' t= type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType at = null;

        IEvaluator exp = null;

        IType t = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:128:34: ( 'ARRAY' exp= expression 'OF' t= type )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:128:36: 'ARRAY' exp= expression 'OF' t= type
            {
            match(input,36,FOLLOW_36_in_arrayType857); 
            pushFollow(FOLLOW_expression_in_arrayType861);
            exp=expression();

            state._fsp--;

            match(input,37,FOLLOW_37_in_arrayType863); 
            pushFollow(FOLLOW_type_in_arrayType867);
            t=type();

            state._fsp--;

            at =new ArrayType(exp, t);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return at;
    }
    // $ANTLR end "arrayType"


    // $ANTLR start "fieldList"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:1: fieldList returns [IEvaluator e] : ( identList ':' type )? ;
    public final IEvaluator fieldList() throws RecognitionException {
        IEvaluator e = null;

        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:35: ( ( identList ':' type )? )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:38: ( identList ':' type )?
            {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:38: ( identList ':' type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:39: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList884);
                    identList();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_fieldList886); 
                    pushFollow(FOLLOW_type_in_fieldList888);
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
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:131:1: recordType returns [RecordType rt] : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final RecordType recordType() throws RecognitionException {
        RecordType rt = null;

        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:131:36: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:131:38: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            match(input,39,FOLLOW_39_in_recordType902); 
            pushFollow(FOLLOW_fieldList_in_recordType904);
            fieldList();

            state._fsp--;

            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:131:57: ( ';' fieldList )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:131:58: ';' fieldList
            	    {
            	    match(input,35,FOLLOW_35_in_recordType907); 
            	    pushFollow(FOLLOW_fieldList_in_recordType909);
            	    fieldList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,32,FOLLOW_32_in_recordType913); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return rt;
    }
    // $ANTLR end "recordType"


    // $ANTLR start "type"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:133:1: type returns [IType t] : ( IDENT | at= arrayType | rt= recordType );
    public final IType type() throws RecognitionException {
        IType t = null;

        Token IDENT6=null;
        ArrayType at = null;

        RecordType rt = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:133:24: ( IDENT | at= arrayType | rt= recordType )
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
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:134:1: IDENT
                    {
                    IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_type926); 
                    t =new SomeType((IDENT6!=null?IDENT6.getText():null));

                    }
                    break;
                case 2 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:135:3: at= arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type935);
                    at=arrayType();

                    state._fsp--;

                    t =at;

                    }
                    break;
                case 3 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:136:3: rt= recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type943);
                    rt=recordType();

                    state._fsp--;

                    t =rt;

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
        return t;
    }
    // $ANTLR end "type"


    // $ANTLR start "fPSection"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:138:1: fPSection returns [FormalParametersSection fps] : (byRef= 'VAR' )? il= identList ':' t= type ;
    public final FormalParametersSection fPSection() throws RecognitionException {
        FormalParametersSection fps = null;

        Token byRef=null;
        List<String> il = null;

        IType t = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:138:50: ( (byRef= 'VAR' )? il= identList ':' t= type )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:139:1: (byRef= 'VAR' )? il= identList ':' t= type
            {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:139:1: (byRef= 'VAR' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:139:2: byRef= 'VAR'
                    {
                    byRef=(Token)match(input,40,FOLLOW_40_in_fPSection963); 

                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection969);
            il=identList();

            state._fsp--;

            match(input,38,FOLLOW_38_in_fPSection971); 
            pushFollow(FOLLOW_type_in_fPSection975);
            t=type();

            state._fsp--;

            String var = (byRef!=null)?byRef.getText():"NONVAR";
            fps = new FormalParametersSection(il, t, var);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return fps;
    }
    // $ANTLR end "fPSection"


    // $ANTLR start "formalParameters"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:144:1: formalParameters returns [List<FormalParametersSection> lfps] : '(' (fps1= fPSection ( ';' fps2= fPSection )* )? ')' ;
    public final List<FormalParametersSection> formalParameters() throws RecognitionException {
        List<FormalParametersSection> lfps = null;

        FormalParametersSection fps1 = null;

        FormalParametersSection fps2 = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:144:64: ( '(' (fps1= fPSection ( ';' fps2= fPSection )* )? ')' )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:145:1: '(' (fps1= fPSection ( ';' fps2= fPSection )* )? ')'
            {
            List<FormalParametersSection> fpsList = new LinkedList<FormalParametersSection>();
            match(input,7,FOLLOW_7_in_formalParameters995); 
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:146:5: (fps1= fPSection ( ';' fps2= fPSection )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT||LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:146:6: fps1= fPSection ( ';' fps2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters1000);
                    fps1=fPSection();

                    state._fsp--;

                     fpsList.add(fps1); 
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:147:3: ( ';' fps2= fPSection )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==35) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:147:4: ';' fps2= fPSection
                    	    {
                    	    match(input,35,FOLLOW_35_in_formalParameters1007); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1011);
                    	    fps2=fPSection();

                    	    state._fsp--;

                    	     fpsList.add(fps2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,8,FOLLOW_8_in_formalParameters1020); 
            lfps =fpsList;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return lfps;
    }
    // $ANTLR end "formalParameters"


    // $ANTLR start "procedureHeading"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:151:1: procedureHeading returns [ProcedureHeading ph] : 'PROCEDURE' IDENT (fp= formalParameters )? ;
    public final ProcedureHeading procedureHeading() throws RecognitionException {
        ProcedureHeading ph = null;

        Token IDENT7=null;
        List<FormalParametersSection> fp = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:151:49: ( 'PROCEDURE' IDENT (fp= formalParameters )? )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:152:1: 'PROCEDURE' IDENT (fp= formalParameters )?
            {
            match(input,41,FOLLOW_41_in_procedureHeading1038); 
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureHeading1040); 
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:152:19: (fp= formalParameters )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==7) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:152:20: fp= formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading1045);
                    fp=formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            ph =new ProcedureHeading((IDENT7!=null?IDENT7.getText():null), fp);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ph;
    }
    // $ANTLR end "procedureHeading"


    // $ANTLR start "procedureBody"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:154:1: procedureBody returns [ProcedureBody pb] : d= declarations ( 'BEGIN' ss= statementSequence )? 'END' ;
    public final ProcedureBody procedureBody() throws RecognitionException {
        ProcedureBody pb = null;

        List<IDeclaration> d = null;

        List<IStatement> ss = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:154:43: (d= declarations ( 'BEGIN' ss= statementSequence )? 'END' )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:155:1: d= declarations ( 'BEGIN' ss= statementSequence )? 'END'
            {
            pushFollow(FOLLOW_declarations_in_procedureBody1067);
            d=declarations();

            state._fsp--;

            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:155:16: ( 'BEGIN' ss= statementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:155:17: 'BEGIN' ss= statementSequence
                    {
                    match(input,42,FOLLOW_42_in_procedureBody1070); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody1074);
                    ss=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_procedureBody1078); 
            ProcedureBody result = new ProcedureBody(d, ss);
              for(IDeclaration decl : d){
                decl.AddToScope(result);
              }
              pb = result;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pb;
    }
    // $ANTLR end "procedureBody"


    // $ANTLR start "procedureDeclaration"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:163:1: procedureDeclaration returns [ProcedureDeclaration pd] : ph= procedureHeading ';' pb= procedureBody IDENT ;
    public final ProcedureDeclaration procedureDeclaration() throws RecognitionException {
        ProcedureDeclaration pd = null;

        Token IDENT8=null;
        ProcedureHeading ph = null;

        ProcedureBody pb = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:163:57: (ph= procedureHeading ';' pb= procedureBody IDENT )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:164:1: ph= procedureHeading ';' pb= procedureBody IDENT
            {
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration1099);
            ph=procedureHeading();

            state._fsp--;

            match(input,35,FOLLOW_35_in_procedureDeclaration1101); 
            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1105);
            pb=procedureBody();

            state._fsp--;

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1107); 
            pd = new ProcedureDeclaration(ph, pb, (IDENT8!=null?IDENT8.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pd;
    }
    // $ANTLR end "procedureDeclaration"


    // $ANTLR start "declarations"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:168:1: declarations returns [List<IDeclaration> dl] : ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )? ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )? ( 'VAR' (il= identList ':' t2= type ';' )* )? (pd= procedureDeclaration ';' )* ;
    public final List<IDeclaration> declarations() throws RecognitionException {
        List<IDeclaration> dl = null;

        Token id1=null;
        Token id2=null;
        IEvaluator exp = null;

        IType t1 = null;

        List<String> il = null;

        IType t2 = null;

        ProcedureDeclaration pd = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:168:47: ( ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )? ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )? ( 'VAR' (il= identList ':' t2= type ';' )* )? (pd= procedureDeclaration ';' )* )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:169:2: ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )? ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )? ( 'VAR' (il= identList ':' t2= type ';' )* )? (pd= procedureDeclaration ';' )*
            {
            List<IDeclaration> declars = new LinkedList<IDeclaration>();
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:2: ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:3: 'CONST' (id1= IDENT '=' exp= expression ';' )*
                    {
                    match(input,43,FOLLOW_43_in_declarations1131); 
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:11: (id1= IDENT '=' exp= expression ';' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==IDENT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:12: id1= IDENT '=' exp= expression ';'
                    	    {
                    	    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations1136); 
                    	    match(input,17,FOLLOW_17_in_declarations1138); 
                    	    pushFollow(FOLLOW_expression_in_declarations1142);
                    	    exp=expression();

                    	    state._fsp--;

                    	    match(input,35,FOLLOW_35_in_declarations1144); 
                    	     declars.add(new ConstDeclaration(id1.getText(), exp)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:2: ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:3: 'TYPE' (id2= IDENT '=' t1= type ';' )*
                    {
                    match(input,44,FOLLOW_44_in_declarations1156); 
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:10: (id2= IDENT '=' t1= type ';' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENT) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:11: id2= IDENT '=' t1= type ';'
                    	    {
                    	    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations1161); 
                    	    match(input,17,FOLLOW_17_in_declarations1163); 
                    	    pushFollow(FOLLOW_type_in_declarations1167);
                    	    t1=type();

                    	    state._fsp--;

                    	    match(input,35,FOLLOW_35_in_declarations1169); 
                    	     declars.add(new TypeObjectDeclaration(id2.getText(), t1)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:172:2: ( 'VAR' (il= identList ':' t2= type ';' )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:172:3: 'VAR' (il= identList ':' t2= type ';' )*
                    {
                    match(input,40,FOLLOW_40_in_declarations1181); 
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:172:9: (il= identList ':' t2= type ';' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==IDENT) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:172:10: il= identList ':' t2= type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_declarations1186);
                    	    il=identList();

                    	    state._fsp--;

                    	    match(input,38,FOLLOW_38_in_declarations1188); 
                    	    pushFollow(FOLLOW_type_in_declarations1192);
                    	    t2=type();

                    	    state._fsp--;

                    	    match(input,35,FOLLOW_35_in_declarations1194); 
                    	     declars.add(new VarDeclaration(il, t2)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:173:2: (pd= procedureDeclaration ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:173:3: pd= procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1208);
            	    pd=procedureDeclaration();

            	    state._fsp--;

            	    match(input,35,FOLLOW_35_in_declarations1210); 
            	     declars.add(pd); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            dl = declars;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dl;
    }
    // $ANTLR end "declarations"


    // $ANTLR start "module"
    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:177:1: module returns [Module m] : 'MODULE' i1= IDENT ';' dl= declarations ( 'BEGIN' ss= statementSequence )? 'END' i2= IDENT '.' ;
    public final Module module() throws RecognitionException {
        Module m = null;

        Token i1=null;
        Token i2=null;
        List<IDeclaration> dl = null;

        List<IStatement> ss = null;


        try {
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:177:28: ( 'MODULE' i1= IDENT ';' dl= declarations ( 'BEGIN' ss= statementSequence )? 'END' i2= IDENT '.' )
            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:177:31: 'MODULE' i1= IDENT ';' dl= declarations ( 'BEGIN' ss= statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,45,FOLLOW_45_in_module1233); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1237); 
            match(input,35,FOLLOW_35_in_module1239); 
            pushFollow(FOLLOW_declarations_in_module1243);
            dl=declarations();

            state._fsp--;

            // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:178:2: ( 'BEGIN' ss= statementSequence )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\anton\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:178:3: 'BEGIN' ss= statementSequence
                    {
                    match(input,42,FOLLOW_42_in_module1248); 
                    pushFollow(FOLLOW_statementSequence_in_module1252);
                    ss=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_module1256); 
            i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1260); 
            match(input,25,FOLLOW_25_in_module1262); 
            Module result =new Module(i1.getText(), dl, ss);
            	 for(IDeclaration decl : dl){
            	  decl.AddToScope(result);
            	 }
             m =result;
             

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return m;
    }
    // $ANTLR end "module"

    // Delegated rules


 

    public static final BitSet FOLLOW_IDENT_in_factor128 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_selector_in_factor132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_factor152 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_factor156 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_factor158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_factor167 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_factor169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term190 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_10_in_term205 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term209 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_11_in_term221 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term225 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_12_in_term237 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term241 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_13_in_term253 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term257 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_set_in_simpleExpression281 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression316 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_14_in_simpleExpression326 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression330 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_15_in_simpleExpression341 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression345 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_16_in_simpleExpression356 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression360 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression387 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_17_in_expression404 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expression420 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expression435 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expression450 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_expression465 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expression480 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_selector519 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_selector523 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_selector525 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_25_in_selector535 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selector537 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_IDENT_in_assignment561 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_selector_in_assignment565 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assignment567 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_assignment571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_actualParameters594 = new BitSet(new long[]{0x000000000000C3B0L});
    public static final BitSet FOLLOW_expression_in_actualParameters601 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_27_in_actualParameters607 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_actualParameters611 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_8_in_actualParameters621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall638 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ifStatement664 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_ifStatement668 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ifStatement670 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement674 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_30_in_ifStatement679 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_ifStatement683 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ifStatement685 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement689 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_31_in_ifStatement697 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement701 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ifStatement705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_whileStatement721 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_whileStatement725 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_whileStatement727 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement731 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_whileStatement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence797 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statementSequence802 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statement_in_statementSequence806 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IDENT_in_identList830 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_identList835 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identList839 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_36_in_arrayType857 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_arrayType861 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_arrayType863 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_arrayType867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList884 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fieldList886 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_fieldList888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_recordType902 = new BitSet(new long[]{0x0000000900000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType904 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_35_in_recordType907 = new BitSet(new long[]{0x0000000900000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType909 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_32_in_recordType913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_fPSection963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_fPSection969 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fPSection971 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_fPSection975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_formalParameters995 = new BitSet(new long[]{0x0000010000000120L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1000 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_35_in_formalParameters1007 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1011 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_8_in_formalParameters1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_procedureHeading1038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureHeading1040 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody1067 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_42_in_procedureBody1070 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1074 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureBody1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration1099 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_procedureDeclaration1101 = new BitSet(new long[]{0x00001F0100000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_declarations1131 = new BitSet(new long[]{0x0000130000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations1136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_declarations1138 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_declarations1142 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1144 = new BitSet(new long[]{0x0000130000000022L});
    public static final BitSet FOLLOW_44_in_declarations1156 = new BitSet(new long[]{0x0000030000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations1161 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_declarations1163 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_declarations1167 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1169 = new BitSet(new long[]{0x0000030000000022L});
    public static final BitSet FOLLOW_40_in_declarations1181 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_identList_in_declarations1186 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_declarations1188 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_declarations1192 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1194 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1208 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1210 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_45_in_module1233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1237 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_module1239 = new BitSet(new long[]{0x00001F0100000000L});
    public static final BitSet FOLLOW_declarations_in_module1243 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_42_in_module1248 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_module1252 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_module1256 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1260 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_module1262 = new BitSet(new long[]{0x0000000000000002L});

}