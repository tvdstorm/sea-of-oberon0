// $ANTLR 3.3 Nov 30, 2010 12:50:56 F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g 2011-02-28 01:40:56

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
    public String getGrammarFileName() { return "F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g"; }



    // $ANTLR start "factor"
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:30:1: factor returns [IEvaluator e] : ( IDENT s= selector | INTEGER | '(' exp= expression ')' | '~' factor );
    public final IEvaluator factor() throws RecognitionException {
        IEvaluator e = null;

        Token IDENT1=null;
        Token INTEGER2=null;
        ISelector s = null;

        IEvaluator exp = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:31:3: ( IDENT s= selector | INTEGER | '(' exp= expression ')' | '~' factor )
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
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:31:5: IDENT s= selector
                    {
                    IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor127); 
                    pushFollow(FOLLOW_selector_in_factor131);
                    s=selector();

                    state._fsp--;

                    e = new VariableRef((IDENT1!=null?IDENT1.getText():null), s);

                    }
                    break;
                case 2 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:33:5: INTEGER
                    {
                    INTEGER2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_factor142); 
                    e =new Integ(INTEGER2);

                    }
                    break;
                case 3 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:34:5: '(' exp= expression ')'
                    {
                    match(input,7,FOLLOW_7_in_factor151); 
                    pushFollow(FOLLOW_expression_in_factor155);
                    exp=expression();

                    state._fsp--;

                    match(input,8,FOLLOW_8_in_factor157); 
                    e =exp;

                    }
                    break;
                case 4 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:35:5: '~' factor
                    {
                    match(input,9,FOLLOW_9_in_factor166); 
                    pushFollow(FOLLOW_factor_in_factor168);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:36:1: term returns [IEvaluator e] : arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )* ;
    public final IEvaluator term() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:37:3: (arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )* )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:38:5: arg1= factor ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )*
            {
            pushFollow(FOLLOW_factor_in_term189);
            arg1=factor();

            state._fsp--;

            e =arg1;
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:39:5: ( '*' arg2= factor | 'DIV' arg2= factor | 'MOD' arg2= factor | '&' arg2= factor )*
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
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:40:6: '*' arg2= factor
            	    {
            	    match(input,10,FOLLOW_10_in_term204); 
            	    pushFollow(FOLLOW_factor_in_term208);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new Mult(arg1, arg2);

            	    }
            	    break;
            	case 2 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:41:8: 'DIV' arg2= factor
            	    {
            	    match(input,11,FOLLOW_11_in_term220); 
            	    pushFollow(FOLLOW_factor_in_term224);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new Div(arg1, arg2);

            	    }
            	    break;
            	case 3 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:42:8: 'MOD' arg2= factor
            	    {
            	    match(input,12,FOLLOW_12_in_term236); 
            	    pushFollow(FOLLOW_factor_in_term240);
            	    arg2=factor();

            	    state._fsp--;

            	    e =new Mod(arg1, arg2);

            	    }
            	    break;
            	case 4 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:43:8: '&' arg2= factor
            	    {
            	    match(input,13,FOLLOW_13_in_term252); 
            	    pushFollow(FOLLOW_factor_in_term256);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:45:1: simpleExpression returns [IEvaluator e] : ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )* ;
    public final IEvaluator simpleExpression() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:46:3: ( ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )* )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:46:5: ( '+' | '-' )? arg1= term ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )*
            {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:46:5: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:
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

            pushFollow(FOLLOW_term_in_simpleExpression315);
            arg1=term();

            state._fsp--;

            e =arg1;
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:51:6: ( '+' arg2= term | '-' arg2= term | 'OR' arg2= term )*
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
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:51:7: '+' arg2= term
            	    {
            	    match(input,14,FOLLOW_14_in_simpleExpression325); 
            	    pushFollow(FOLLOW_term_in_simpleExpression329);
            	    arg2=term();

            	    state._fsp--;

            	    e =new Add(arg1, arg2);

            	    }
            	    break;
            	case 2 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:52:7: '-' arg2= term
            	    {
            	    match(input,15,FOLLOW_15_in_simpleExpression340); 
            	    pushFollow(FOLLOW_term_in_simpleExpression344);
            	    arg2=term();

            	    state._fsp--;

            	    e =new Min(arg1, arg2);

            	    }
            	    break;
            	case 3 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:53:7: 'OR' arg2= term
            	    {
            	    match(input,16,FOLLOW_16_in_simpleExpression355); 
            	    pushFollow(FOLLOW_term_in_simpleExpression359);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:55:1: expression returns [IEvaluator e] : arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )? ;
    public final IEvaluator expression() throws RecognitionException {
        IEvaluator e = null;

        IEvaluator arg1 = null;

        IEvaluator arg2 = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:56:3: (arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )? )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:56:5: arg1= simpleExpression ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression386);
            arg1=simpleExpression();

            state._fsp--;

            e =arg1;
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:57:5: ( '=' arg2= simpleExpression | '#' arg2= simpleExpression | '<' arg2= simpleExpression | '<=' arg2= simpleExpression | '>' arg2= simpleExpression | '>=' arg2= simpleExpression )?
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
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:58:7: '=' arg2= simpleExpression
                    {
                    match(input,17,FOLLOW_17_in_expression403); 
                    pushFollow(FOLLOW_simpleExpression_in_expression407);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new Equal(arg1, arg2);

                    }
                    break;
                case 2 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:59:8: '#' arg2= simpleExpression
                    {
                    match(input,18,FOLLOW_18_in_expression419); 
                    pushFollow(FOLLOW_simpleExpression_in_expression423);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new NotEqual(arg1, arg2);

                    }
                    break;
                case 3 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:60:8: '<' arg2= simpleExpression
                    {
                    match(input,19,FOLLOW_19_in_expression434); 
                    pushFollow(FOLLOW_simpleExpression_in_expression438);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new Smaller(arg1, arg2);

                    }
                    break;
                case 4 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:61:8: '<=' arg2= simpleExpression
                    {
                    match(input,20,FOLLOW_20_in_expression449); 
                    pushFollow(FOLLOW_simpleExpression_in_expression453);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new SmallerOrEqual(arg1, arg2);

                    }
                    break;
                case 5 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:62:8: '>' arg2= simpleExpression
                    {
                    match(input,21,FOLLOW_21_in_expression464); 
                    pushFollow(FOLLOW_simpleExpression_in_expression468);
                    arg2=simpleExpression();

                    state._fsp--;

                    e =new Bigger(arg1, arg2);

                    }
                    break;
                case 6 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:63:8: '>=' arg2= simpleExpression
                    {
                    match(input,22,FOLLOW_22_in_expression479); 
                    pushFollow(FOLLOW_simpleExpression_in_expression483);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:66:1: selector returns [ISelector s] : ( '[' exp= expression ']' | '.' IDENT )* ;
    public final ISelector selector() throws RecognitionException {
        ISelector s = null;

        Token IDENT3=null;
        IEvaluator exp = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:67:3: ( ( '[' exp= expression ']' | '.' IDENT )* )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:67:5: ( '[' exp= expression ']' | '.' IDENT )*
            {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:67:5: ( '[' exp= expression ']' | '.' IDENT )*
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
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:68:5: '[' exp= expression ']'
            	    {
            	    match(input,23,FOLLOW_23_in_selector518); 
            	    pushFollow(FOLLOW_expression_in_selector522);
            	    exp=expression();

            	    state._fsp--;

            	    match(input,24,FOLLOW_24_in_selector524); 
            	    s =new ArraySelector(exp);

            	    }
            	    break;
            	case 2 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:69:7: '.' IDENT
            	    {
            	    match(input,25,FOLLOW_25_in_selector534); 
            	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector536); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:72:1: assignment returns [Assignment a] : IDENT sel= selector ':=' exp= expression ;
    public final Assignment assignment() throws RecognitionException {
        Assignment a = null;

        Token IDENT4=null;
        ISelector sel = null;

        IEvaluator exp = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:73:3: ( IDENT sel= selector ':=' exp= expression )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:73:5: IDENT sel= selector ':=' exp= expression
            {
            IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment560); 
            pushFollow(FOLLOW_selector_in_assignment564);
            sel=selector();

            state._fsp--;

            match(input,26,FOLLOW_26_in_assignment566); 
            pushFollow(FOLLOW_expression_in_assignment570);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:77:1: actualParameters returns [List<IEvaluator> lp] : '(' (exp1= expression ( ',' exp2= expression )* )? ')' ;
    public final List<IEvaluator> actualParameters() throws RecognitionException {
        List<IEvaluator> lp = null;

        IEvaluator exp1 = null;

        IEvaluator exp2 = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:77:48: ( '(' (exp1= expression ( ',' exp2= expression )* )? ')' )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:78:1: '(' (exp1= expression ( ',' exp2= expression )* )? ')'
            {
            List<IEvaluator> paramsList = new LinkedList<IEvaluator>();
            match(input,7,FOLLOW_7_in_actualParameters593); 
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:79:5: (exp1= expression ( ',' exp2= expression )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=INTEGER && LA8_0<=IDENT)||LA8_0==7||LA8_0==9||(LA8_0>=14 && LA8_0<=15)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:80:2: exp1= expression ( ',' exp2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters600);
                    exp1=expression();

                    state._fsp--;

                    paramsList.add(exp1);
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:2: ( ',' exp2= expression )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==27) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:81:3: ',' exp2= expression
                    	    {
                    	    match(input,27,FOLLOW_27_in_actualParameters606); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters610);
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

            match(input,8,FOLLOW_8_in_actualParameters620); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:1: procedureCall returns [ProcedureCall pc] : IDENT (ap= actualParameters )? ;
    public final ProcedureCall procedureCall() throws RecognitionException {
        ProcedureCall pc = null;

        Token IDENT5=null;
        List<IEvaluator> ap = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:86:42: ( IDENT (ap= actualParameters )? )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:1: IDENT (ap= actualParameters )?
            {
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall637); 
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:7: (ap= actualParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==7) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:87:8: ap= actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall642);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:91:1: ifStatement returns [IfStatement ifs] : 'IF' exp1= expression 'THEN' ss1= statementSequence ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )* ( 'ELSE' ss3= statementSequence )? 'END' ;
    public final IfStatement ifStatement() throws RecognitionException {
        IfStatement ifs = null;

        IEvaluator exp1 = null;

        List<IStatement> ss1 = null;

        IEvaluator exp2 = null;

        List<IStatement> ss2 = null;

        List<IStatement> ss3 = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:91:39: ( 'IF' exp1= expression 'THEN' ss1= statementSequence ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )* ( 'ELSE' ss3= statementSequence )? 'END' )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:92:1: 'IF' exp1= expression 'THEN' ss1= statementSequence ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )* ( 'ELSE' ss3= statementSequence )? 'END'
            {
            IfStatement result = new IfStatement();
            match(input,28,FOLLOW_28_in_ifStatement663); 
            pushFollow(FOLLOW_expression_in_ifStatement667);
            exp1=expression();

            state._fsp--;

            match(input,29,FOLLOW_29_in_ifStatement669); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement673);
            ss1=statementSequence();

            state._fsp--;

            result.SetIfBlock(new SimpleIfStatement(exp1, ss1));
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:1: ( 'ELSIF' exp2= expression 'THEN' ss2= statementSequence )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:95:2: 'ELSIF' exp2= expression 'THEN' ss2= statementSequence
            	    {
            	    match(input,30,FOLLOW_30_in_ifStatement678); 
            	    pushFollow(FOLLOW_expression_in_ifStatement682);
            	    exp2=expression();

            	    state._fsp--;

            	    match(input,29,FOLLOW_29_in_ifStatement684); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement688);
            	    ss2=statementSequence();

            	    state._fsp--;

            	    result.AddElseIf(new SimpleIfStatement(exp2, ss2));

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:98:1: ( 'ELSE' ss3= statementSequence )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:98:2: 'ELSE' ss3= statementSequence
                    {
                    match(input,31,FOLLOW_31_in_ifStatement696); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement700);
                    ss3=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_ifStatement704); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:103:1: whileStatement returns [WhileStatement ws] : 'WHILE' exp= expression 'DO' ss= statementSequence 'END' ;
    public final WhileStatement whileStatement() throws RecognitionException {
        WhileStatement ws = null;

        IEvaluator exp = null;

        List<IStatement> ss = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:103:44: ( 'WHILE' exp= expression 'DO' ss= statementSequence 'END' )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:104:1: 'WHILE' exp= expression 'DO' ss= statementSequence 'END'
            {
            match(input,33,FOLLOW_33_in_whileStatement720); 
            pushFollow(FOLLOW_expression_in_whileStatement724);
            exp=expression();

            state._fsp--;

            match(input,34,FOLLOW_34_in_whileStatement726); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement730);
            ss=statementSequence();

            state._fsp--;

            match(input,32,FOLLOW_32_in_whileStatement732); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:107:1: statement returns [IStatement s] : (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )? ;
    public final IStatement statement() throws RecognitionException {
        IStatement s = null;

        Assignment assgn = null;

        ProcedureCall pc = null;

        IfStatement ifs = null;

        WhileStatement wh = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:107:34: ( (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )? )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:108:1: (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )?
            {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:108:1: (assgn= assignment | pc= procedureCall | ifs= ifStatement | wh= whileStatement )?
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
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:108:3: assgn= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement751);
                    assgn=assignment();

                    state._fsp--;

                    s = assgn;

                    }
                    break;
                case 2 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:109:3: pc= procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement759);
                    pc=procedureCall();

                    state._fsp--;

                    s = pc;

                    }
                    break;
                case 3 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:110:3: ifs= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement767);
                    ifs=ifStatement();

                    state._fsp--;

                    s = ifs;

                    }
                    break;
                case 4 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:111:3: wh= whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement775);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:114:1: statementSequence returns [List<IStatement> ls] : s1= statement ( ';' s2= statement )* ;
    public final List<IStatement> statementSequence() throws RecognitionException {
        List<IStatement> ls = null;

        IStatement s1 = null;

        IStatement s2 = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:114:49: (s1= statement ( ';' s2= statement )* )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:115:1: s1= statement ( ';' s2= statement )*
            {
            List<IStatement> statementsList = new LinkedList<IStatement>();
            pushFollow(FOLLOW_statement_in_statementSequence796);
            s1=statement();

            state._fsp--;

            statementsList.add(s1);
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:117:1: ( ';' s2= statement )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:117:2: ';' s2= statement
            	    {
            	    match(input,35,FOLLOW_35_in_statementSequence801); 
            	    pushFollow(FOLLOW_statement_in_statementSequence805);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:121:1: identList returns [List<String> il] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> il = null;

        Token i1=null;
        Token i2=null;

        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:121:37: (i1= IDENT ( ',' i2= IDENT )* )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:122:1: i1= IDENT ( ',' i2= IDENT )*
            {
            List<String> idents = new LinkedList<String>();
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList829); 
            idents.add(i1.getText());
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:124:1: ( ',' i2= IDENT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:124:2: ',' i2= IDENT
            	    {
            	    match(input,27,FOLLOW_27_in_identList834); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList838); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:127:1: arrayType returns [ArrayType at] : 'ARRAY' exp= expression 'OF' t= type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType at = null;

        IEvaluator exp = null;

        IType t = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:127:34: ( 'ARRAY' exp= expression 'OF' t= type )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:127:36: 'ARRAY' exp= expression 'OF' t= type
            {
            match(input,36,FOLLOW_36_in_arrayType856); 
            pushFollow(FOLLOW_expression_in_arrayType860);
            exp=expression();

            state._fsp--;

            match(input,37,FOLLOW_37_in_arrayType862); 
            pushFollow(FOLLOW_type_in_arrayType866);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:129:1: fieldList returns [IEvaluator e] : ( identList ':' type )? ;
    public final IEvaluator fieldList() throws RecognitionException {
        IEvaluator e = null;

        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:129:35: ( ( identList ':' type )? )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:129:38: ( identList ':' type )?
            {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:129:38: ( identList ':' type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:129:39: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList883);
                    identList();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_fieldList885); 
                    pushFollow(FOLLOW_type_in_fieldList887);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:1: recordType returns [RecordType rt] : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final RecordType recordType() throws RecognitionException {
        RecordType rt = null;

        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:36: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:38: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            match(input,39,FOLLOW_39_in_recordType901); 
            pushFollow(FOLLOW_fieldList_in_recordType903);
            fieldList();

            state._fsp--;

            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:57: ( ';' fieldList )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:130:58: ';' fieldList
            	    {
            	    match(input,35,FOLLOW_35_in_recordType906); 
            	    pushFollow(FOLLOW_fieldList_in_recordType908);
            	    fieldList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,32,FOLLOW_32_in_recordType912); 

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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:132:1: type returns [IType t] : ( IDENT | at= arrayType | rt= recordType );
    public final IType type() throws RecognitionException {
        IType t = null;

        Token IDENT6=null;
        ArrayType at = null;

        RecordType rt = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:132:24: ( IDENT | at= arrayType | rt= recordType )
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
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:133:1: IDENT
                    {
                    IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_type925); 
                    t =new SomeType((IDENT6!=null?IDENT6.getText():null));

                    }
                    break;
                case 2 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:134:3: at= arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type934);
                    at=arrayType();

                    state._fsp--;

                    t =at;

                    }
                    break;
                case 3 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:135:3: rt= recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type942);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:137:1: fPSection returns [FormalParametersSection fps] : (byRef= 'VAR' )? il= identList ':' t= type ;
    public final FormalParametersSection fPSection() throws RecognitionException {
        FormalParametersSection fps = null;

        Token byRef=null;
        List<String> il = null;

        IType t = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:137:50: ( (byRef= 'VAR' )? il= identList ':' t= type )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:138:1: (byRef= 'VAR' )? il= identList ':' t= type
            {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:138:1: (byRef= 'VAR' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:138:2: byRef= 'VAR'
                    {
                    byRef=(Token)match(input,40,FOLLOW_40_in_fPSection962); 

                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection968);
            il=identList();

            state._fsp--;

            match(input,38,FOLLOW_38_in_fPSection970); 
            pushFollow(FOLLOW_type_in_fPSection974);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:143:1: formalParameters returns [List<FormalParametersSection> lfps] : '(' (fps1= fPSection ( ';' fps2= fPSection )* )? ')' ;
    public final List<FormalParametersSection> formalParameters() throws RecognitionException {
        List<FormalParametersSection> lfps = null;

        FormalParametersSection fps1 = null;

        FormalParametersSection fps2 = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:143:64: ( '(' (fps1= fPSection ( ';' fps2= fPSection )* )? ')' )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:144:1: '(' (fps1= fPSection ( ';' fps2= fPSection )* )? ')'
            {
            List<FormalParametersSection> fpsList = new LinkedList<FormalParametersSection>();
            match(input,7,FOLLOW_7_in_formalParameters994); 
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:145:5: (fps1= fPSection ( ';' fps2= fPSection )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT||LA20_0==40) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:145:6: fps1= fPSection ( ';' fps2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters999);
                    fps1=fPSection();

                    state._fsp--;

                     fpsList.add(fps1); 
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:146:3: ( ';' fps2= fPSection )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==35) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:146:4: ';' fps2= fPSection
                    	    {
                    	    match(input,35,FOLLOW_35_in_formalParameters1006); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters1010);
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

            match(input,8,FOLLOW_8_in_formalParameters1019); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:150:1: procedureHeading returns [ProcedureHeading ph] : 'PROCEDURE' IDENT (fp= formalParameters )? ;
    public final ProcedureHeading procedureHeading() throws RecognitionException {
        ProcedureHeading ph = null;

        Token IDENT7=null;
        List<FormalParametersSection> fp = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:150:49: ( 'PROCEDURE' IDENT (fp= formalParameters )? )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:151:1: 'PROCEDURE' IDENT (fp= formalParameters )?
            {
            match(input,41,FOLLOW_41_in_procedureHeading1037); 
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureHeading1039); 
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:151:19: (fp= formalParameters )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==7) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:151:20: fp= formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading1044);
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:153:1: procedureBody returns [ProcedureBody pb] : d= declarations ( 'BEGIN' ss= statementSequence )? 'END' ;
    public final ProcedureBody procedureBody() throws RecognitionException {
        ProcedureBody pb = null;

        List<IDeclaration> d = null;

        List<IStatement> ss = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:153:43: (d= declarations ( 'BEGIN' ss= statementSequence )? 'END' )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:154:1: d= declarations ( 'BEGIN' ss= statementSequence )? 'END'
            {
            pushFollow(FOLLOW_declarations_in_procedureBody1066);
            d=declarations();

            state._fsp--;

            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:154:16: ( 'BEGIN' ss= statementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:154:17: 'BEGIN' ss= statementSequence
                    {
                    match(input,42,FOLLOW_42_in_procedureBody1069); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody1073);
                    ss=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_procedureBody1077); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:162:1: procedureDeclaration returns [ProcedureDeclaration pd] : ph= procedureHeading ';' pb= procedureBody IDENT ;
    public final ProcedureDeclaration procedureDeclaration() throws RecognitionException {
        ProcedureDeclaration pd = null;

        Token IDENT8=null;
        ProcedureHeading ph = null;

        ProcedureBody pb = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:162:57: (ph= procedureHeading ';' pb= procedureBody IDENT )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:163:1: ph= procedureHeading ';' pb= procedureBody IDENT
            {
            pushFollow(FOLLOW_procedureHeading_in_procedureDeclaration1098);
            ph=procedureHeading();

            state._fsp--;

            match(input,35,FOLLOW_35_in_procedureDeclaration1100); 
            pushFollow(FOLLOW_procedureBody_in_procedureDeclaration1104);
            pb=procedureBody();

            state._fsp--;

            IDENT8=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration1106); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:167:1: declarations returns [List<IDeclaration> dl] : ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )? ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )? ( 'VAR' (il= identList ':' t2= type ';' )* )? (pd= procedureDeclaration ';' )* ;
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
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:167:47: ( ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )? ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )? ( 'VAR' (il= identList ':' t2= type ';' )* )? (pd= procedureDeclaration ';' )* )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:168:2: ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )? ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )? ( 'VAR' (il= identList ':' t2= type ';' )* )? (pd= procedureDeclaration ';' )*
            {
            List<IDeclaration> declars = new LinkedList<IDeclaration>();
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:169:2: ( 'CONST' (id1= IDENT '=' exp= expression ';' )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:169:3: 'CONST' (id1= IDENT '=' exp= expression ';' )*
                    {
                    match(input,43,FOLLOW_43_in_declarations1130); 
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:169:11: (id1= IDENT '=' exp= expression ';' )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==IDENT) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:169:12: id1= IDENT '=' exp= expression ';'
                    	    {
                    	    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations1135); 
                    	    match(input,17,FOLLOW_17_in_declarations1137); 
                    	    pushFollow(FOLLOW_expression_in_declarations1141);
                    	    exp=expression();

                    	    state._fsp--;

                    	    match(input,35,FOLLOW_35_in_declarations1143); 
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

            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:2: ( 'TYPE' (id2= IDENT '=' t1= type ';' )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:3: 'TYPE' (id2= IDENT '=' t1= type ';' )*
                    {
                    match(input,44,FOLLOW_44_in_declarations1155); 
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:10: (id2= IDENT '=' t1= type ';' )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==IDENT) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:170:11: id2= IDENT '=' t1= type ';'
                    	    {
                    	    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarations1160); 
                    	    match(input,17,FOLLOW_17_in_declarations1162); 
                    	    pushFollow(FOLLOW_type_in_declarations1166);
                    	    t1=type();

                    	    state._fsp--;

                    	    match(input,35,FOLLOW_35_in_declarations1168); 
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

            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:2: ( 'VAR' (il= identList ':' t2= type ';' )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:3: 'VAR' (il= identList ':' t2= type ';' )*
                    {
                    match(input,40,FOLLOW_40_in_declarations1180); 
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:9: (il= identList ':' t2= type ';' )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==IDENT) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:171:10: il= identList ':' t2= type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_declarations1185);
                    	    il=identList();

                    	    state._fsp--;

                    	    match(input,38,FOLLOW_38_in_declarations1187); 
                    	    pushFollow(FOLLOW_type_in_declarations1191);
                    	    t2=type();

                    	    state._fsp--;

                    	    match(input,35,FOLLOW_35_in_declarations1193); 
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

            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:172:2: (pd= procedureDeclaration ';' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:172:3: pd= procedureDeclaration ';'
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations1207);
            	    pd=procedureDeclaration();

            	    state._fsp--;

            	    match(input,35,FOLLOW_35_in_declarations1209); 
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
    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:176:1: module returns [Module m] : 'MODULE' i1= IDENT ';' dl= declarations ( 'BEGIN' ss= statementSequence )? 'END' i2= IDENT '.' ;
    public final Module module() throws RecognitionException {
        Module m = null;

        Token i1=null;
        Token i2=null;
        List<IDeclaration> dl = null;

        List<IStatement> ss = null;


        try {
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:176:28: ( 'MODULE' i1= IDENT ';' dl= declarations ( 'BEGIN' ss= statementSequence )? 'END' i2= IDENT '.' )
            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:176:31: 'MODULE' i1= IDENT ';' dl= declarations ( 'BEGIN' ss= statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,45,FOLLOW_45_in_module1232); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1236); 
            match(input,35,FOLLOW_35_in_module1238); 
            pushFollow(FOLLOW_declarations_in_module1242);
            dl=declarations();

            state._fsp--;

            // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:177:2: ( 'BEGIN' ss= statementSequence )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // F:\\docs\\master\\SoftwareConstruction\\oberon0\\src\\edu\\uva\\sc\\oberon0\\oberon0.g:177:3: 'BEGIN' ss= statementSequence
                    {
                    match(input,42,FOLLOW_42_in_module1247); 
                    pushFollow(FOLLOW_statementSequence_in_module1251);
                    ss=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_module1255); 
            i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module1259); 
            match(input,25,FOLLOW_25_in_module1261); 
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


 

    public static final BitSet FOLLOW_IDENT_in_factor127 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_selector_in_factor131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_factor142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_factor151 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_factor155 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_factor157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_factor166 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_factor168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term189 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_10_in_term204 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term208 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_11_in_term220 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term224 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_12_in_term236 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term240 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_13_in_term252 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_factor_in_term256 = new BitSet(new long[]{0x0000000000003C02L});
    public static final BitSet FOLLOW_set_in_simpleExpression280 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression315 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_14_in_simpleExpression325 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression329 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_15_in_simpleExpression340 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression344 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_16_in_simpleExpression355 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_term_in_simpleExpression359 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression386 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_17_in_expression403 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expression419 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expression434 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expression449 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_expression464 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expression479 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_simpleExpression_in_expression483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_selector518 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_selector522 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_selector524 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_25_in_selector534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_selector536 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_IDENT_in_assignment560 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_selector_in_assignment564 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assignment566 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_assignment570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_actualParameters593 = new BitSet(new long[]{0x000000000000C3B0L});
    public static final BitSet FOLLOW_expression_in_actualParameters600 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_27_in_actualParameters606 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_actualParameters610 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_8_in_actualParameters620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall637 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ifStatement663 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_ifStatement667 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ifStatement669 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement673 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_30_in_ifStatement678 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_ifStatement682 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ifStatement684 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement688 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_31_in_ifStatement696 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement700 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ifStatement704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_whileStatement720 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_whileStatement724 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_whileStatement726 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement730 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_whileStatement732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence796 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statementSequence801 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statement_in_statementSequence805 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_IDENT_in_identList829 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_identList834 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_identList838 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_36_in_arrayType856 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_arrayType860 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_arrayType862 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_arrayType866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList883 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fieldList885 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_fieldList887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_recordType901 = new BitSet(new long[]{0x0000000900000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType903 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_35_in_recordType906 = new BitSet(new long[]{0x0000000900000020L});
    public static final BitSet FOLLOW_fieldList_in_recordType908 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_32_in_recordType912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_fPSection962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_fPSection968 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fPSection970 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_fPSection974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_formalParameters994 = new BitSet(new long[]{0x0000010000000120L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters999 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_35_in_formalParameters1006 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters1010 = new BitSet(new long[]{0x0000000800000100L});
    public static final BitSet FOLLOW_8_in_formalParameters1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_procedureHeading1037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureHeading1039 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody1066 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_42_in_procedureBody1069 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody1073 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureBody1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclaration1098 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_procedureDeclaration1100 = new BitSet(new long[]{0x00001F0100000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclaration1104 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_declarations1130 = new BitSet(new long[]{0x0000130000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations1135 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_declarations1137 = new BitSet(new long[]{0x000000000000C2B0L});
    public static final BitSet FOLLOW_expression_in_declarations1141 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1143 = new BitSet(new long[]{0x0000130000000022L});
    public static final BitSet FOLLOW_44_in_declarations1155 = new BitSet(new long[]{0x0000030000000022L});
    public static final BitSet FOLLOW_IDENT_in_declarations1160 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_declarations1162 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_declarations1166 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1168 = new BitSet(new long[]{0x0000030000000022L});
    public static final BitSet FOLLOW_40_in_declarations1180 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_identList_in_declarations1185 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_declarations1187 = new BitSet(new long[]{0x0000009000000020L});
    public static final BitSet FOLLOW_type_in_declarations1191 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1193 = new BitSet(new long[]{0x0000020000000022L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations1207 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_declarations1209 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_45_in_module1232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1236 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_module1238 = new BitSet(new long[]{0x00001F0100000000L});
    public static final BitSet FOLLOW_declarations_in_module1242 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_42_in_module1247 = new BitSet(new long[]{0x0000000A10000020L});
    public static final BitSet FOLLOW_statementSequence_in_module1251 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_module1255 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENT_in_module1259 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_module1261 = new BitSet(new long[]{0x0000000000000002L});

}