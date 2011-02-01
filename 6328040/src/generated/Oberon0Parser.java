// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g 2011-02-01 18:21:43
package generated; 
import oberon0.ast.*;
import oberon0.ast.expressions.*;
import oberon0.ast.declarations.*;
import oberon0.ast.routines.*;
import oberon0.ast.statements.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MULTIPLY", "DIVIDE", "MOD", "AMPERSAND", "ADD", "SUBTRACT", "OR", "EQUALS", "HASH", "SMALLERTHEN", "SMALLEREQUAL", "GREATERTHEN", "GREATEREQUAL", "DOT", "COMMA", "COLON", "RNDOPEN", "RNDCLOSE", "SQROPEN", "SQRCLOSE", "OF", "THEN", "DO", "TILDE", "ASSIGNMENT", "SEMICOLON", "END", "ELSE", "ELSIF", "IF", "WHILE", "ARRAY", "RECORD", "CONST", "TYPEDECL", "VAR", "PROCEDURE", "BEGIN", "MODULE", "TRUE", "FALSE", "DECLARATIONS", "BODY", "FORMALPARAMETERS", "ACTUALPARAMETERS", "CONDITION", "IFBLOCK", "IDENTLIST", "NONREFVAR", "PROCEDURECALL", "OBERONPROGRAM", "IDENT", "INTEGER", "WS", "OPTWS"
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
    public static final int DECLARATIONS=45;
    public static final int BODY=46;
    public static final int FORMALPARAMETERS=47;
    public static final int ACTUALPARAMETERS=48;
    public static final int CONDITION=49;
    public static final int IFBLOCK=50;
    public static final int IDENTLIST=51;
    public static final int NONREFVAR=52;
    public static final int PROCEDURECALL=53;
    public static final int OBERONPROGRAM=54;
    public static final int IDENT=55;
    public static final int INTEGER=56;
    public static final int WS=57;
    public static final int OPTWS=58;

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



    // $ANTLR start "module"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:76:1: module returns [ ModuleNode node ] : MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode node = null;

        Token name=null;
        IDeclarable decl = null;

        IExecutable mbody = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:76:35: ( MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:77:2: MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF
            {
            match(input,MODULE,FOLLOW_MODULE_in_module456); 
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_module462); 
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_module464); 
            pushFollow(FOLLOW_declarations_in_module470);
            decl=declarations();

            state._fsp--;

            pushFollow(FOLLOW_body_in_module476);
            mbody=body();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_module478); 
            match(input,DOT,FOLLOW_DOT_in_module480); 
            match(input,EOF,FOLLOW_EOF_in_module482); 
            node = new ModuleNode((name!=null?name.getText():null), decl, mbody);

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
    // $ANTLR end "module"


    // $ANTLR start "body"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:80:1: body returns [ IExecutable node ] : BEGIN stat1= statement ( SEMICOLON statx= statement )* END ;
    public final IExecutable body() throws RecognitionException {
        IExecutable node = null;

        IExecutable stat1 = null;

        IExecutable statx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:81:2: ( BEGIN stat1= statement ( SEMICOLON statx= statement )* END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:81:4: BEGIN stat1= statement ( SEMICOLON statx= statement )* END
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_body500); 
            ArrayList<IExecutable> list = 
            						new ArrayList<IExecutable>();	
            pushFollow(FOLLOW_statement_in_body512);
            stat1=statement();

            state._fsp--;

            list.add(stat1);			
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:84:2: ( SEMICOLON statx= statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:84:3: SEMICOLON statx= statement
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_body520); 
            	    pushFollow(FOLLOW_statement_in_body528);
            	    statx=statement();

            	    state._fsp--;

            	    list.add(statx);			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_body538); 
            node = new BodyNode(list);		

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
    // $ANTLR end "body"


    // $ANTLR start "declarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:90:1: declarations returns [ IDeclarable node ] : (vardecl= varDeclarations )? ;
    public final IDeclarable declarations() throws RecognitionException {
        IDeclarable node = null;

        IDeclarable vardecl = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:91:2: ( (vardecl= varDeclarations )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:91:8: (vardecl= varDeclarations )?
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:96:2: (vardecl= varDeclarations )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VAR) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:96:3: vardecl= varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations575);
                    vardecl=varDeclarations();

                    state._fsp--;

                    list.add(vardecl);		

                    }
                    break;

            }

            node = new DeclarationsNode(list);	

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
    // $ANTLR end "declarations"


    // $ANTLR start "varDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:111:1: varDeclarations returns [ IDeclarable node] : VAR (name= IDENT COLON type= IDENT SEMICOLON )* ;
    public final IDeclarable varDeclarations() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        Token type=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:112:2: ( VAR (name= IDENT COLON type= IDENT SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:112:4: VAR (name= IDENT COLON type= IDENT SEMICOLON )*
            {
            match(input,VAR,FOLLOW_VAR_in_varDeclarations616); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:112:8: (name= IDENT COLON type= IDENT SEMICOLON )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENT) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:112:9: name= IDENT COLON type= IDENT SEMICOLON
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclarations623); 
            	    match(input,COLON,FOLLOW_COLON_in_varDeclarations625); 
            	    type=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclarations631); 
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_varDeclarations633); 
            	    node = new VarDeclarationNode((name!=null?name.getText():null), (type!=null?type.getText():null));

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "varDeclarations"


    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:125:1: assignment returns [ IExecutable node ] : var= variable ASSIGNMENT exp= expression ;
    public final IExecutable assignment() throws RecognitionException {
        IExecutable node = null;

        IEvaluable var = null;

        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:126:2: (var= variable ASSIGNMENT exp= expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:126:4: var= variable ASSIGNMENT exp= expression
            {
            pushFollow(FOLLOW_variable_in_assignment662);
            var=variable();

            state._fsp--;

            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment666); 
            pushFollow(FOLLOW_expression_in_assignment674);
            exp=expression();

            state._fsp--;

            node = new AssignmentNode(var, exp);

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
    // $ANTLR end "assignment"


    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:166:1: statement returns [ IExecutable node ] : (ass= assignment )? ;
    public final IExecutable statement() throws RecognitionException {
        IExecutable node = null;

        IExecutable ass = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:167:2: ( (ass= assignment )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:167:3: (ass= assignment )?
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:167:3: (ass= assignment )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:167:4: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement699);
                    ass=assignment();

                    state._fsp--;

                    node = ass;	

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
    // $ANTLR end "statement"


    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:196:1: expression returns [ IEvaluable node ] : lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? ;
    public final IEvaluable expression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsExp = null;

        IEvaluable rhsExp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:197:2: (lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:197:4: lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression733);
            lhsExp=simpleExpression();

            state._fsp--;

            node = lhsExp; 					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:198:2: ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            int alt5=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt5=1;
                    }
                    break;
                case HASH:
                    {
                    alt5=2;
                    }
                    break;
                case SMALLERTHEN:
                    {
                    alt5=3;
                    }
                    break;
                case SMALLEREQUAL:
                    {
                    alt5=4;
                    }
                    break;
                case GREATERTHEN:
                    {
                    alt5=5;
                    }
                    break;
                case GREATEREQUAL:
                    {
                    alt5=6;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:198:4: EQUALS rhsExp= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression744); 
                    pushFollow(FOLLOW_simpleExpression_in_expression751);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNode(node, rhsExp);		

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:199:4: HASH rhsExp= simpleExpression
                    {
                    match(input,HASH,FOLLOW_HASH_in_expression758); 
                    pushFollow(FOLLOW_simpleExpression_in_expression765);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNotNode(node, rhsExp);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:200:4: SMALLERTHEN rhsExp= simpleExpression
                    {
                    match(input,SMALLERTHEN,FOLLOW_SMALLERTHEN_in_expression772); 
                    pushFollow(FOLLOW_simpleExpression_in_expression778);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerThenNode(node, rhsExp);	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:201:4: SMALLEREQUAL rhsExp= simpleExpression
                    {
                    match(input,SMALLEREQUAL,FOLLOW_SMALLEREQUAL_in_expression785); 
                    pushFollow(FOLLOW_simpleExpression_in_expression791);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerEqualNode(node, rhsExp);	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:202:4: GREATERTHEN rhsExp= simpleExpression
                    {
                    match(input,GREATERTHEN,FOLLOW_GREATERTHEN_in_expression798); 
                    pushFollow(FOLLOW_simpleExpression_in_expression804);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new GreaterThenNode(node, rhsExp);	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:203:4: GREATEREQUAL rhsExp= simpleExpression
                    {
                    match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_expression811); 
                    pushFollow(FOLLOW_simpleExpression_in_expression817);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:206:1: simpleExpression returns [ IEvaluable node ] : ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* ;
    public final IEvaluable simpleExpression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsTerm = null;

        IEvaluable rhsTerm = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:207:2: ( ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:207:8: ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            {
             Boolean minus = false; 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:208:2: ( ADD | SUBTRACT )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ADD) ) {
                alt6=1;
            }
            else if ( (LA6_0==SUBTRACT) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:208:3: ADD
                    {
                    match(input,ADD,FOLLOW_ADD_in_simpleExpression844); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:209:4: SUBTRACT
                    {
                    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression850); 
                     minus = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression868);
            lhsTerm=term();

            state._fsp--;

            node = lhsTerm;					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:212:2: ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt7=1;
                    }
                    break;
                case SUBTRACT:
                    {
                    alt7=2;
                    }
                    break;
                case OR:
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:212:3: ADD rhsTerm= term
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_simpleExpression877); 
            	    pushFollow(FOLLOW_term_in_simpleExpression885);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new AddNode(node, rhsTerm);		

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:213:4: SUBTRACT rhsTerm= term
            	    {
            	    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression893); 
            	    pushFollow(FOLLOW_term_in_simpleExpression900);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new SubtractNode(node, rhsTerm);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:214:4: OR term rhsTerm= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_simpleExpression908); 
            	    pushFollow(FOLLOW_term_in_simpleExpression910);
            	    term();

            	    state._fsp--;

            	    pushFollow(FOLLOW_term_in_simpleExpression917);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new DisjunctionNode(node, rhsTerm);	

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:219:1: term returns [ IEvaluable node ] : lhsFactor= factor ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )* ;
    public final IEvaluable term() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsFactor = null;

        IEvaluable rhsFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:220:2: (lhsFactor= factor ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:220:4: lhsFactor= factor ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term950);
            lhsFactor=factor();

            state._fsp--;

            node = lhsFactor;				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:221:2: ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )*
            loop8:
            do {
                int alt8=5;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt8=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt8=2;
                    }
                    break;
                case MOD:
                    {
                    alt8=3;
                    }
                    break;
                case AMPERSAND:
                    {
                    alt8=4;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:221:4: ( MULTIPLY rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:221:4: ( MULTIPLY rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:221:5: MULTIPLY rhsFactor= factor
            	    {
            	    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term961); 
            	    pushFollow(FOLLOW_factor_in_term968);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new MultiplyNode(node, rhsFactor);	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:222:4: ( DIVIDE rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:222:4: ( DIVIDE rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:222:5: DIVIDE rhsFactor= factor
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_term977); 
            	    pushFollow(FOLLOW_factor_in_term984);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new DivideNode(node, rhsFactor);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:223:4: ( MOD rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:223:4: ( MOD rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:223:5: MOD rhsFactor= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term993); 
            	    pushFollow(FOLLOW_factor_in_term1001);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new ModuloNode(node, rhsFactor);	

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:4: ( AMPERSAND rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:4: ( AMPERSAND rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:5: AMPERSAND rhsFactor= factor
            	    {
            	    match(input,AMPERSAND,FOLLOW_AMPERSAND_in_term1010); 
            	    pushFollow(FOLLOW_factor_in_term1017);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new ConjunctionNode(node, rhsFactor);	

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:227:1: factor returns [ IEvaluable node ] : (var= variable | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor );
    public final IEvaluable factor() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable var = null;

        IntegerNode num = null;

        IEvaluable exp = null;

        IEvaluable nFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:228:2: (var= variable | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor )
            int alt9=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt9=1;
                }
                break;
            case INTEGER:
                {
                alt9=2;
                }
                break;
            case RNDOPEN:
                {
                alt9=3;
                }
                break;
            case TILDE:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:228:4: var= variable
                    {
                    pushFollow(FOLLOW_variable_in_factor1040);
                    var=variable();

                    state._fsp--;

                     node = var; 		 	 	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:229:4: num= number
                    {
                    pushFollow(FOLLOW_number_in_factor1053);
                    num=number();

                    state._fsp--;

                     node = num;			 	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:230:4: RNDOPEN exp= expression RNDCLOSE
                    {
                    match(input,RNDOPEN,FOLLOW_RNDOPEN_in_factor1064); 
                    pushFollow(FOLLOW_expression_in_factor1068);
                    exp=expression();

                    state._fsp--;

                    match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_factor1070); 
                     node = exp;		 	 	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:231:4: TILDE nFactor= factor
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_factor1078); 
                    pushFollow(FOLLOW_factor_in_factor1082);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:234:1: number returns [ IntegerNode node ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode node = null;

        Token INTEGER1=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:235:2: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:235:4: INTEGER
            {
            INTEGER1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1101); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:238:1: booleann returns [ IEvaluable node ] : ( FALSE | TRUE );
    public final IEvaluable booleann() throws RecognitionException {
        IEvaluable node = null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:239:2: ( FALSE | TRUE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FALSE) ) {
                alt10=1;
            }
            else if ( (LA10_0==TRUE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:239:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleann1120); 
                     node = new BooleanNode ( false); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:240:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleann1130); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:243:1: variable returns [IEvaluable node] : IDENT selector ;
    public final IEvaluable variable() throws RecognitionException {
        IEvaluable node = null;

        Token IDENT2=null;
        IEvaluable selector3 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:244:2: ( IDENT selector )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:244:4: IDENT selector
            {
            IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable1150); 
            pushFollow(FOLLOW_selector_in_variable1152);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:247:1: selector returns [ IEvaluable node ] : ( DOT IDENT | SQROPEN expression SQRCLOSE )* ;
    public final IEvaluable selector() throws RecognitionException {
        IEvaluable node = null;

        Token IDENT4=null;
        IEvaluable expression5 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:248:2: ( ( DOT IDENT | SQROPEN expression SQRCLOSE )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:249:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:249:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==DOT) ) {
                    alt11=1;
                }
                else if ( (LA11_0==SQROPEN) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:249:3: DOT IDENT
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_selector1174); 
            	    IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1176); 
            	     new SelectorRecordNode ( (IDENT4!=null?IDENT4.getText():null) );	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:250:4: SQROPEN expression SQRCLOSE
            	    {
            	    match(input,SQROPEN,FOLLOW_SQROPEN_in_selector1186); 
            	    pushFollow(FOLLOW_expression_in_selector1188);
            	    expression5=expression();

            	    state._fsp--;

            	    match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_selector1190); 
            	     new SelectorArrayNode  ( expression5 );	

            	    }
            	    break;

            	default :
            	    break loop11;
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


 

    public static final BitSet FOLLOW_MODULE_in_module456 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module462 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_module464 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_declarations_in_module470 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_body_in_module476 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module478 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body500 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_statement_in_body512 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_body520 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_statement_in_body528 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_body538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations616 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_varDeclarations623 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations625 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_varDeclarations631 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_varDeclarations633 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment662 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment666 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression733 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_EQUALS_in_expression744 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_expression758 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLERTHEN_in_expression772 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLEREQUAL_in_expression785 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHEN_in_expression798 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_expression811 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression844 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression850 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression868 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression877 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression885 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression893 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression900 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_OR_in_simpleExpression908 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression910 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression917 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_factor_in_term950 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MULTIPLY_in_term961 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term968 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_DIVIDE_in_term977 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term984 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MOD_in_term993 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1001 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_AMPERSAND_in_term1010 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1017 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_variable_in_factor1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_factor1064 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_factor1068 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_factor1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor1078 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_factor1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleann1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleann1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable1150 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_variable1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector1174 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector1176 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_SQROPEN_in_selector1186 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_selector1188 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_selector1190 = new BitSet(new long[]{0x0000000000420002L});

}