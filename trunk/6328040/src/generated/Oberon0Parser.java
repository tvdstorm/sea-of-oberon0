// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g 2011-02-02 12:26:27
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:90:1: declarations returns [ IDeclarable node ] : (constdecl= constDeclarations )? (vardecl= varDeclarations )? ;
    public final IDeclarable declarations() throws RecognitionException {
        IDeclarable node = null;

        IDeclarable constdecl = null;

        IDeclarable vardecl = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:91:2: ( (constdecl= constDeclarations )? (vardecl= varDeclarations )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:91:8: (constdecl= constDeclarations )? (vardecl= varDeclarations )?
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:93:2: (constdecl= constDeclarations )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:93:3: constdecl= constDeclarations
                    {
                    pushFollow(FOLLOW_constDeclarations_in_declarations571);
                    constdecl=constDeclarations();

                    state._fsp--;

                    list.add(constdecl);		

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:96:2: (vardecl= varDeclarations )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VAR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:96:3: vardecl= varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations588);
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


    // $ANTLR start "constDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:102:1: constDeclarations returns [ IDeclarable node] : ( CONST (constdec= constantDec )* ) ;
    public final IDeclarable constDeclarations() throws RecognitionException {
        IDeclarable node = null;

        IDeclarable constdec = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:103:2: ( ( CONST (constdec= constantDec )* ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:103:8: ( CONST (constdec= constantDec )* )
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:105:2: ( CONST (constdec= constantDec )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:105:3: CONST (constdec= constantDec )*
            {
            match(input,CONST,FOLLOW_CONST_in_constDeclarations632); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:106:2: (constdec= constantDec )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:106:3: constdec= constantDec
            	    {
            	    pushFollow(FOLLOW_constantDec_in_constDeclarations644);
            	    constdec=constantDec();

            	    state._fsp--;

            	    list.add(constdec);		

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            node = new ConstDeclarationsNode(list);

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
    // $ANTLR end "constDeclarations"


    // $ANTLR start "constantDec"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:110:1: constantDec returns [ IDeclarable node ] : name= IDENT EQUALS exp= expression SEMICOLON ;
    public final IDeclarable constantDec() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:111:2: (name= IDENT EQUALS exp= expression SEMICOLON )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:111:3: name= IDENT EQUALS exp= expression SEMICOLON
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_constantDec676); 
            match(input,EQUALS,FOLLOW_EQUALS_in_constantDec680); 
            pushFollow(FOLLOW_expression_in_constantDec688);
            exp=expression();

            state._fsp--;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_constantDec696); 
            node = new ConstDeclarationNode((name!=null?name.getText():null), exp);	

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
    // $ANTLR end "constantDec"


    // $ANTLR start "varDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:122:1: varDeclarations returns [ IDeclarable node ] : VAR (names= identList COLON type= IDENT SEMICOLON )* ;
    public final IDeclarable varDeclarations() throws RecognitionException {
        IDeclarable node = null;

        Token type=null;
        ArrayList<String> names = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:123:2: ( VAR (names= identList COLON type= IDENT SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:123:4: VAR (names= identList COLON type= IDENT SEMICOLON )*
            {
            match(input,VAR,FOLLOW_VAR_in_varDeclarations718); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:123:8: (names= identList COLON type= IDENT SEMICOLON )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:123:9: names= identList COLON type= IDENT SEMICOLON
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations725);
            	    names=identList();

            	    state._fsp--;

            	    match(input,COLON,FOLLOW_COLON_in_varDeclarations729); 
            	    type=(Token)match(input,IDENT,FOLLOW_IDENT_in_varDeclarations735); 
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_varDeclarations737); 
            	    node = new VarDeclarationNode(names, (type!=null?type.getText():null));

            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "identList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:134:1: identList returns [ ArrayList<String> list] : ident1= IDENT ( COMMA ident2= IDENT )* ;
    public final ArrayList<String> identList() throws RecognitionException {
        ArrayList<String> list = null;

        Token ident1=null;
        Token ident2=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:135:2: (ident1= IDENT ( COMMA ident2= IDENT )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:135:7: ident1= IDENT ( COMMA ident2= IDENT )*
            {
            list =	 new ArrayList<String>();	
            ident1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList770); 
            list.add((ident1!=null?ident1.getText():null));		
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:137:2: ( COMMA ident2= IDENT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:137:3: COMMA ident2= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identList779); 
            	    ident2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList784); 
            	    list.add((ident2!=null?ident2.getText():null));		

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
        return list;
    }
    // $ANTLR end "identList"


    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:174:1: statement returns [ IExecutable node ] : (ass= assignment )? ;
    public final IExecutable statement() throws RecognitionException {
        IExecutable node = null;

        IExecutable ass = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:175:2: ( (ass= assignment )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:175:3: (ass= assignment )?
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:175:3: (ass= assignment )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:175:4: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement809);
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


    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:181:1: assignment returns [ IExecutable node ] : ident= IDENT selec= selector ASSIGNMENT exp= expression ;
    public final IExecutable assignment() throws RecognitionException {
        IExecutable node = null;

        Token ident=null;
        IEvaluable selec = null;

        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:182:2: (ident= IDENT selec= selector ASSIGNMENT exp= expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:182:3: ident= IDENT selec= selector ASSIGNMENT exp= expression
            {
            ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment836); 
            pushFollow(FOLLOW_selector_in_assignment840);
            selec=selector();

            state._fsp--;

            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment844); 
            pushFollow(FOLLOW_expression_in_assignment852);
            exp=expression();

            state._fsp--;

            node = new AssignmentNode((ident!=null?ident.getText():null), selec, exp);

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


    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:208:1: expression returns [ IEvaluable node ] : lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? ;
    public final IEvaluable expression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsExp = null;

        IEvaluable rhsExp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:209:2: (lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:209:4: lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression879);
            lhsExp=simpleExpression();

            state._fsp--;

            node = lhsExp; 					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:210:2: ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            int alt8=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt8=1;
                    }
                    break;
                case HASH:
                    {
                    alt8=2;
                    }
                    break;
                case SMALLERTHEN:
                    {
                    alt8=3;
                    }
                    break;
                case SMALLEREQUAL:
                    {
                    alt8=4;
                    }
                    break;
                case GREATERTHEN:
                    {
                    alt8=5;
                    }
                    break;
                case GREATEREQUAL:
                    {
                    alt8=6;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:210:4: EQUALS rhsExp= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression890); 
                    pushFollow(FOLLOW_simpleExpression_in_expression897);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNode(node, rhsExp);		

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:211:4: HASH rhsExp= simpleExpression
                    {
                    match(input,HASH,FOLLOW_HASH_in_expression904); 
                    pushFollow(FOLLOW_simpleExpression_in_expression911);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNotNode(node, rhsExp);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:212:4: SMALLERTHEN rhsExp= simpleExpression
                    {
                    match(input,SMALLERTHEN,FOLLOW_SMALLERTHEN_in_expression918); 
                    pushFollow(FOLLOW_simpleExpression_in_expression924);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerThenNode(node, rhsExp);	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:213:4: SMALLEREQUAL rhsExp= simpleExpression
                    {
                    match(input,SMALLEREQUAL,FOLLOW_SMALLEREQUAL_in_expression931); 
                    pushFollow(FOLLOW_simpleExpression_in_expression937);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerEqualNode(node, rhsExp);	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:214:4: GREATERTHEN rhsExp= simpleExpression
                    {
                    match(input,GREATERTHEN,FOLLOW_GREATERTHEN_in_expression944); 
                    pushFollow(FOLLOW_simpleExpression_in_expression950);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new GreaterThenNode(node, rhsExp);	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:215:4: GREATEREQUAL rhsExp= simpleExpression
                    {
                    match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_expression957); 
                    pushFollow(FOLLOW_simpleExpression_in_expression963);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:218:1: simpleExpression returns [ IEvaluable node ] : ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* ;
    public final IEvaluable simpleExpression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsTerm = null;

        IEvaluable rhsTerm = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:219:2: ( ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:219:8: ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            {
             Boolean minus = false; 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:220:2: ( ADD | SUBTRACT )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ADD) ) {
                alt9=1;
            }
            else if ( (LA9_0==SUBTRACT) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:220:3: ADD
                    {
                    match(input,ADD,FOLLOW_ADD_in_simpleExpression990); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:221:4: SUBTRACT
                    {
                    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression996); 
                     minus = true; 

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression1014);
            lhsTerm=term();

            state._fsp--;

            node = lhsTerm;					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:2: ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            loop10:
            do {
                int alt10=4;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt10=1;
                    }
                    break;
                case SUBTRACT:
                    {
                    alt10=2;
                    }
                    break;
                case OR:
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:3: ADD rhsTerm= term
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_simpleExpression1023); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1031);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new AddNode(node, rhsTerm);		

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:225:4: SUBTRACT rhsTerm= term
            	    {
            	    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression1039); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1046);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new SubtractNode(node, rhsTerm);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:226:4: OR term rhsTerm= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_simpleExpression1054); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1056);
            	    term();

            	    state._fsp--;

            	    pushFollow(FOLLOW_term_in_simpleExpression1063);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new DisjunctionNode(node, rhsTerm);	

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:231:1: term returns [ IEvaluable node ] : lhsFactor= factor ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )* ;
    public final IEvaluable term() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsFactor = null;

        IEvaluable rhsFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:232:2: (lhsFactor= factor ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:232:4: lhsFactor= factor ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1096);
            lhsFactor=factor();

            state._fsp--;

            node = lhsFactor;				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:233:2: ( ( MULTIPLY rhsFactor= factor ) | ( DIVIDE rhsFactor= factor ) | ( MOD rhsFactor= factor ) | ( AMPERSAND rhsFactor= factor ) )*
            loop11:
            do {
                int alt11=5;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt11=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt11=2;
                    }
                    break;
                case MOD:
                    {
                    alt11=3;
                    }
                    break;
                case AMPERSAND:
                    {
                    alt11=4;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:233:4: ( MULTIPLY rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:233:4: ( MULTIPLY rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:233:5: MULTIPLY rhsFactor= factor
            	    {
            	    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term1107); 
            	    pushFollow(FOLLOW_factor_in_term1114);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new MultiplyNode(node, rhsFactor);	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:234:4: ( DIVIDE rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:234:4: ( DIVIDE rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:234:5: DIVIDE rhsFactor= factor
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_term1123); 
            	    pushFollow(FOLLOW_factor_in_term1130);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new DivideNode(node, rhsFactor);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:235:4: ( MOD rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:235:4: ( MOD rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:235:5: MOD rhsFactor= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term1139); 
            	    pushFollow(FOLLOW_factor_in_term1147);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new ModuloNode(node, rhsFactor);	

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:236:4: ( AMPERSAND rhsFactor= factor )
            	    {
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:236:4: ( AMPERSAND rhsFactor= factor )
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:236:5: AMPERSAND rhsFactor= factor
            	    {
            	    match(input,AMPERSAND,FOLLOW_AMPERSAND_in_term1156); 
            	    pushFollow(FOLLOW_factor_in_term1163);
            	    rhsFactor=factor();

            	    state._fsp--;


            	    }

            	    node = new ConjunctionNode(node, rhsFactor);	

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
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:239:1: factor returns [ IEvaluable node ] : (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor );
    public final IEvaluable factor() throws RecognitionException {
        IEvaluable node = null;

        Token ident=null;
        IEvaluable selec = null;

        IntegerNode num = null;

        IEvaluable exp = null;

        IEvaluable nFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:240:2: (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor )
            int alt12=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt12=1;
                }
                break;
            case INTEGER:
                {
                alt12=2;
                }
                break;
            case RNDOPEN:
                {
                alt12=3;
                }
                break;
            case TILDE:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:240:4: ident= IDENT selec= selector
                    {
                    ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1186); 
                    pushFollow(FOLLOW_selector_in_factor1190);
                    selec=selector();

                    state._fsp--;

                     node = new VariableNode((ident!=null?ident.getText():null), selec);	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:241:4: num= number
                    {
                    pushFollow(FOLLOW_number_in_factor1201);
                    num=number();

                    state._fsp--;

                     node = num;			 		

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:242:4: RNDOPEN exp= expression RNDCLOSE
                    {
                    match(input,RNDOPEN,FOLLOW_RNDOPEN_in_factor1212); 
                    pushFollow(FOLLOW_expression_in_factor1216);
                    exp=expression();

                    state._fsp--;

                    match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_factor1218); 
                     node = exp;		 	 		

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:243:4: TILDE nFactor= factor
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_factor1226); 
                    pushFollow(FOLLOW_factor_in_factor1230);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:246:1: number returns [ IntegerNode node ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode node = null;

        Token INTEGER1=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:247:2: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:247:4: INTEGER
            {
            INTEGER1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1249); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:250:1: booleann returns [ IEvaluable node ] : ( FALSE | TRUE );
    public final IEvaluable booleann() throws RecognitionException {
        IEvaluable node = null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:251:2: ( FALSE | TRUE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE) ) {
                alt13=1;
            }
            else if ( (LA13_0==TRUE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:251:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleann1268); 
                     node = new BooleanNode ( false); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:252:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleann1278); 
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


    // $ANTLR start "selector"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:255:1: selector returns [ IEvaluable node ] : ( DOT IDENT | SQROPEN expression SQRCLOSE )* ;
    public final IEvaluable selector() throws RecognitionException {
        IEvaluable node = null;

        Token IDENT2=null;
        IEvaluable expression3 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:256:2: ( ( DOT IDENT | SQROPEN expression SQRCLOSE )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:257:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:257:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==DOT) ) {
                    alt14=1;
                }
                else if ( (LA14_0==SQROPEN) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:257:3: DOT IDENT
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_selector1301); 
            	    IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1303); 
            	     new SelectorRecordNode ( (IDENT2!=null?IDENT2.getText():null) );	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:258:4: SQROPEN expression SQRCLOSE
            	    {
            	    match(input,SQROPEN,FOLLOW_SQROPEN_in_selector1313); 
            	    pushFollow(FOLLOW_expression_in_selector1315);
            	    expression3=expression();

            	    state._fsp--;

            	    match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_selector1317); 
            	     new SelectorArrayNode  ( expression3 );	

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
        return node;
    }
    // $ANTLR end "selector"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module456 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module462 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_module464 = new BitSet(new long[]{0x000002A000000000L});
    public static final BitSet FOLLOW_declarations_in_module470 = new BitSet(new long[]{0x000002A000000000L});
    public static final BitSet FOLLOW_body_in_module476 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module478 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body500 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_statement_in_body512 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_body520 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_statement_in_body528 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_body538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclarations_in_declarations571 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclarations632 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_constantDec_in_constDeclarations644 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constantDec676 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constantDec680 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_constantDec688 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_constantDec696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations718 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations725 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations729 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_varDeclarations735 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_varDeclarations737 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList770 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_identList779 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList784 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_assignment_in_statement809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment836 = new BitSet(new long[]{0x0000000010420000L});
    public static final BitSet FOLLOW_selector_in_assignment840 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment844 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression879 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_EQUALS_in_expression890 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_expression904 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLERTHEN_in_expression918 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLEREQUAL_in_expression931 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHEN_in_expression944 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_expression957 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression990 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression996 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1014 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression1023 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1031 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression1039 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1046 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1054 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1056 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1063 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_factor_in_term1096 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MULTIPLY_in_term1107 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1114 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_DIVIDE_in_term1123 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1130 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MOD_in_term1139 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1147 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_AMPERSAND_in_term1156 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1163 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_IDENT_in_factor1186 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_factor1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_factor1212 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_factor1216 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_factor1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor1226 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_factor1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleann1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleann1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector1301 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector1303 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_SQROPEN_in_selector1313 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_selector1315 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_selector1317 = new BitSet(new long[]{0x0000000000420002L});

}