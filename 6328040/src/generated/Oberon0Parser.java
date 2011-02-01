// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g 2011-02-01 12:00:28
package generated; 
import oberon0.ast.*;
import oberon0.ast.expressions.AddNode;
import oberon0.ast.expressions.BooleanNode;
import oberon0.ast.expressions.ConjunctionNode;
import oberon0.ast.expressions.DisjunctionNode;
import oberon0.ast.expressions.DivideNode;
import oberon0.ast.expressions.EqualsNode;
import oberon0.ast.expressions.EqualsNotNode;
import oberon0.ast.expressions.GreaterEqualNode;
import oberon0.ast.expressions.GreaterThenNode;
import oberon0.ast.expressions.IEvaluable;
import oberon0.ast.expressions.IntegerNode;
import oberon0.ast.expressions.ModuloNode;
import oberon0.ast.expressions.MultiplyNode;
import oberon0.ast.expressions.NegationNode;
import oberon0.ast.expressions.NegativeNode;
import oberon0.ast.expressions.SelectorArrayNode;
import oberon0.ast.expressions.SelectorRecordNode;
import oberon0.ast.expressions.SmallerEqualNode;
import oberon0.ast.expressions.SmallerThenNode;
import oberon0.ast.expressions.SubtractNode;
import oberon0.ast.expressions.VariableNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MULTIPLY", "DIVIDE", "MOD", "AMPERSAND", "ADD", "SUBTRACT", "OR", "EQUALS", "HASH", "SMALLERTHEN", "SMALLEREQUAL", "GREATERTHEN", "GREATEREQUAL", "DOT", "COMMA", "COLON", "RNDOPEN", "RNDCLOSE", "SQROPEN", "SQRCLOSE", "OF", "THEN", "DO", "TILDE", "ASSIGNMENT", "SEMICOLON", "END", "ELSE", "ELSIF", "IF", "WHILE", "ARRAY", "RECORD", "CONST", "TYPEDECL", "VAR", "PROCEDURE", "BEGIN", "MODULE", "TRUE", "FALSE", "INTEGER", "IDENT", "WS", "OPTWS"
    };
    public static final int EOF=-1;
    public static final int MULTIPLY=4;
    public static final int DIVIDE=5;
    public static final int MOD=6;
    public static final int AMPERSAND=7;
    public static final int ADD=8;
    public static final int SUBTRACT=9;
    public static final int OR=10;
    public static final int EQUALS=11;
    public static final int HASH=12;
    public static final int SMALLERTHEN=13;
    public static final int SMALLEREQUAL=14;
    public static final int GREATERTHEN=15;
    public static final int GREATEREQUAL=16;
    public static final int DOT=17;
    public static final int COMMA=18;
    public static final int COLON=19;
    public static final int RNDOPEN=20;
    public static final int RNDCLOSE=21;
    public static final int SQROPEN=22;
    public static final int SQRCLOSE=23;
    public static final int OF=24;
    public static final int THEN=25;
    public static final int DO=26;
    public static final int TILDE=27;
    public static final int ASSIGNMENT=28;
    public static final int SEMICOLON=29;
    public static final int END=30;
    public static final int ELSE=31;
    public static final int ELSIF=32;
    public static final int IF=33;
    public static final int WHILE=34;
    public static final int ARRAY=35;
    public static final int RECORD=36;
    public static final int CONST=37;
    public static final int TYPEDECL=38;
    public static final int VAR=39;
    public static final int PROCEDURE=40;
    public static final int BEGIN=41;
    public static final int MODULE=42;
    public static final int TRUE=43;
    public static final int FALSE=44;
    public static final int INTEGER=45;
    public static final int IDENT=46;
    public static final int WS=47;
    public static final int OPTWS=48;

    // delegates
    // delegators


        public Oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g"; }



    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:147:1: expression returns [ IEvaluable node ] : lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? ;
    public final IEvaluable expression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsExp = null;

        IEvaluable rhsExp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:148:2: (lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:148:4: lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression416);
            lhsExp=simpleExpression();

            state._fsp--;

            node = lhsExp; 					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:149:2: ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            int alt1=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt1=1;
                    }
                    break;
                case HASH:
                    {
                    alt1=2;
                    }
                    break;
                case SMALLERTHEN:
                    {
                    alt1=3;
                    }
                    break;
                case SMALLEREQUAL:
                    {
                    alt1=4;
                    }
                    break;
                case GREATERTHEN:
                    {
                    alt1=5;
                    }
                    break;
                case GREATEREQUAL:
                    {
                    alt1=6;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:149:4: EQUALS rhsExp= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression427); 
                    pushFollow(FOLLOW_simpleExpression_in_expression433);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNode(node, rhsExp);		

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:150:4: HASH rhsExp= simpleExpression
                    {
                    match(input,HASH,FOLLOW_HASH_in_expression440); 
                    pushFollow(FOLLOW_simpleExpression_in_expression446);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNotNode(node, rhsExp);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:151:4: SMALLERTHEN rhsExp= simpleExpression
                    {
                    match(input,SMALLERTHEN,FOLLOW_SMALLERTHEN_in_expression453); 
                    pushFollow(FOLLOW_simpleExpression_in_expression458);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerThenNode(node, rhsExp);	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:152:4: SMALLEREQUAL rhsExp= simpleExpression
                    {
                    match(input,SMALLEREQUAL,FOLLOW_SMALLEREQUAL_in_expression465); 
                    pushFollow(FOLLOW_simpleExpression_in_expression470);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerEqualNode(node, rhsExp);	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:153:4: GREATERTHEN rhsExp= simpleExpression
                    {
                    match(input,GREATERTHEN,FOLLOW_GREATERTHEN_in_expression477); 
                    pushFollow(FOLLOW_simpleExpression_in_expression482);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new GreaterThenNode(node, rhsExp);	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:154:4: GREATEREQUAL rhsExp= simpleExpression
                    {
                    match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_expression489); 
                    pushFollow(FOLLOW_simpleExpression_in_expression494);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new GreaterEqualNode(node, rhsExp);	

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
        return node;
    }
    // $ANTLR end "expression"


    // $ANTLR start "simpleExpression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:157:1: simpleExpression returns [ IEvaluable node ] : ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* ;
    public final IEvaluable simpleExpression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsTerm = null;

        IEvaluable rhsTerm = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:158:2: ( ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:158:8: ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            {
             Boolean minus = false; 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:159:2: ( ADD | SUBTRACT )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ADD) ) {
                alt2=1;
            }
            else if ( (LA2_0==SUBTRACT) ) {
                alt2=2;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:159:3: ADD
                    {
                    match(input,ADD,FOLLOW_ADD_in_simpleExpression521); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:160:4: SUBTRACT
                    {
                    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression527); 
                     minus = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression545);
            lhsTerm=term();

            state._fsp--;

            node = lhsTerm;					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:163:2: ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt3=1;
                    }
                    break;
                case SUBTRACT:
                    {
                    alt3=2;
                    }
                    break;
                case OR:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:163:3: ADD rhsTerm= term
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_simpleExpression554); 
            	    pushFollow(FOLLOW_term_in_simpleExpression562);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new AddNode(node, rhsTerm);		

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:164:4: SUBTRACT rhsTerm= term
            	    {
            	    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression570); 
            	    pushFollow(FOLLOW_term_in_simpleExpression577);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new SubtractNode(node, rhsTerm);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:165:4: OR term rhsTerm= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_simpleExpression585); 
            	    pushFollow(FOLLOW_term_in_simpleExpression587);
            	    term();

            	    state._fsp--;

            	    pushFollow(FOLLOW_term_in_simpleExpression594);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new DisjunctionNode(node, rhsTerm);	

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if(minus) { node = new NegativeNode(node);}		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "term"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:170:1: term returns [ IEvaluable node ] : lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* ;
    public final IEvaluable term() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsFactor = null;

        IEvaluable rhsFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:171:2: (lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:171:4: lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            {
            pushFollow(FOLLOW_factor_in_term627);
            lhsFactor=factor();

            state._fsp--;

            node = lhsFactor;				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:172:2: ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt4=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt4=2;
                    }
                    break;
                case MOD:
                    {
                    alt4=3;
                    }
                    break;
                case AMPERSAND:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:172:4: MULTIPLY rhsFactor= factor
            	    {
            	    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term637); 
            	    pushFollow(FOLLOW_factor_in_term644);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new MultiplyNode(node, rhsFactor);	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:173:4: DIVIDE rhsFactor= factor
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_term651); 
            	    pushFollow(FOLLOW_factor_in_term658);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new DivideNode(node, rhsFactor);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:174:4: MOD rhsFactor= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term665); 
            	    pushFollow(FOLLOW_factor_in_term673);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ModuloNode(node, rhsFactor);	

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:175:4: AMPERSAND rhsFactor= factor
            	    {
            	    match(input,AMPERSAND,FOLLOW_AMPERSAND_in_term680); 
            	    pushFollow(FOLLOW_factor_in_term687);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ConjunctionNode(node, rhsFactor);	

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
        return node;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:178:1: factor returns [ IEvaluable node ] : (var= variable | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor );
    public final IEvaluable factor() throws RecognitionException {
        IEvaluable node = null;

        VariableNode var = null;

        IntegerNode num = null;

        IEvaluable exp = null;

        IEvaluable nFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:179:2: (var= variable | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor )
            int alt5=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt5=1;
                }
                break;
            case INTEGER:
                {
                alt5=2;
                }
                break;
            case RNDOPEN:
                {
                alt5=3;
                }
                break;
            case TILDE:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:179:4: var= variable
                    {
                    pushFollow(FOLLOW_variable_in_factor709);
                    var=variable();

                    state._fsp--;

                     node = var; 		 	 	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:180:4: num= number
                    {
                    pushFollow(FOLLOW_number_in_factor722);
                    num=number();

                    state._fsp--;

                     node = num;			 	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:181:4: RNDOPEN exp= expression RNDCLOSE
                    {
                    match(input,RNDOPEN,FOLLOW_RNDOPEN_in_factor733); 
                    pushFollow(FOLLOW_expression_in_factor737);
                    exp=expression();

                    state._fsp--;

                    match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_factor739); 
                     node = exp;		 	 	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:182:4: TILDE nFactor= factor
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_factor747); 
                    pushFollow(FOLLOW_factor_in_factor751);
                    nFactor=factor();

                    state._fsp--;

                     node = new NegationNode(nFactor);	

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
        return node;
    }
    // $ANTLR end "factor"


    // $ANTLR start "number"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:185:1: number returns [ IntegerNode node ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode node = null;

        Token INTEGER1=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:186:2: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:186:4: INTEGER
            {
            INTEGER1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number770); 
             node = new IntegerNode( Integer.parseInt( (INTEGER1!=null?INTEGER1.getText():null) ) ); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "number"


    // $ANTLR start "booleann"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:189:1: booleann returns [ BooleanNode node ] : ( FALSE | TRUE );
    public final BooleanNode booleann() throws RecognitionException {
        BooleanNode node = null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:190:2: ( FALSE | TRUE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==FALSE) ) {
                alt6=1;
            }
            else if ( (LA6_0==TRUE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:190:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleann789); 
                     node = new BooleanNode ( false); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:191:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleann799); 
                     node = new BooleanNode ( true); 

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
        return node;
    }
    // $ANTLR end "booleann"


    // $ANTLR start "variable"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:194:1: variable returns [VariableNode node] : IDENT selector ;
    public final VariableNode variable() throws RecognitionException {
        VariableNode node = null;

        Token IDENT2=null;
        IEvaluable selector3 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:195:2: ( IDENT selector )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:195:4: IDENT selector
            {
            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable819); 
            pushFollow(FOLLOW_selector_in_variable821);
            selector3=selector();

            state._fsp--;

             node = new VariableNode ( (IDENT2!=null?IDENT2.getText():null), selector3); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "variable"


    // $ANTLR start "selector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:198:1: selector returns [ IEvaluable node ] : ( DOT IDENT | SQROPEN expression SQRCLOSE )* ;
    public final IEvaluable selector() throws RecognitionException {
        IEvaluable node = null;

        Token IDENT4=null;
        IEvaluable expression5 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:199:2: ( ( DOT IDENT | SQROPEN expression SQRCLOSE )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:200:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:200:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DOT) ) {
                    alt7=1;
                }
                else if ( (LA7_0==SQROPEN) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:200:3: DOT IDENT
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_selector843); 
            	    IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector845); 
            	     new SelectorRecordNode ( (IDENT4!=null?IDENT4.getText():null) );	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:201:4: SQROPEN expression SQRCLOSE
            	    {
            	    match(input,SQROPEN,FOLLOW_SQROPEN_in_selector855); 
            	    pushFollow(FOLLOW_expression_in_selector857);
            	    expression5=expression();

            	    state._fsp--;

            	    match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_selector859); 
            	     new SelectorArrayNode  ( expression5 );	

            	    }
            	    break;

            	default :
            	    break loop7;
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
        return node;
    }
    // $ANTLR end "selector"

    // Delegated rules


 

    public static final BitSet FOLLOW_simpleExpression_in_expression416 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_EQUALS_in_expression427 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_expression440 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLERTHEN_in_expression453 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLEREQUAL_in_expression465 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHEN_in_expression477 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_expression489 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression521 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression527 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression545 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression554 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression562 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression570 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression577 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_OR_in_simpleExpression585 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression587 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression594 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_factor_in_term627 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MULTIPLY_in_term637 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_factor_in_term644 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_DIVIDE_in_term651 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_factor_in_term658 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MOD_in_term665 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_factor_in_term673 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_AMPERSAND_in_term680 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_factor_in_term687 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_variable_in_factor709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_factor733 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_expression_in_factor737 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_factor739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor747 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_factor_in_factor751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleann789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleann799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable819 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_variable821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector843 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector845 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_SQROPEN_in_selector855 = new BitSet(new long[]{0x0000600008100300L});
    public static final BitSet FOLLOW_expression_in_selector857 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_selector859 = new BitSet(new long[]{0x0000000000420002L});

}