// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g 2011-02-02 19:08:24
package generated; 
import oberon0.ast.expressions.*;
import oberon0.ast.variables.*;
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
            pushFollow(FOLLOW_declarations_in_module472);
            decl=declarations();

            state._fsp--;

            pushFollow(FOLLOW_body_in_module480);
            mbody=body();

            state._fsp--;

            match(input,IDENT,FOLLOW_IDENT_in_module482); 
            match(input,DOT,FOLLOW_DOT_in_module484); 
            match(input,EOF,FOLLOW_EOF_in_module486); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:82:1: body returns [ IExecutable node ] : BEGIN stat1= statement ( SEMICOLON statx= statement )* END ;
    public final IExecutable body() throws RecognitionException {
        IExecutable node = null;

        IExecutable stat1 = null;

        IExecutable statx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:83:2: ( BEGIN stat1= statement ( SEMICOLON statx= statement )* END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:83:4: BEGIN stat1= statement ( SEMICOLON statx= statement )* END
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_body503); 
            ArrayList<IExecutable> list = 
            						new ArrayList<IExecutable>();	
            pushFollow(FOLLOW_statement_in_body515);
            stat1=statement();

            state._fsp--;

            list.add(stat1);			
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:86:2: ( SEMICOLON statx= statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:86:3: SEMICOLON statx= statement
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_body523); 
            	    pushFollow(FOLLOW_statement_in_body531);
            	    statx=statement();

            	    state._fsp--;

            	    list.add(statx);			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_body541); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:92:1: declarations returns [ IDeclarable node ] : (constdecl= constDeclarations )? (vardecl= varDeclarations )? ;
    public final IDeclarable declarations() throws RecognitionException {
        IDeclarable node = null;

        IDeclarable constdecl = null;

        IDeclarable vardecl = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:93:2: ( (constdecl= constDeclarations )? (vardecl= varDeclarations )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:93:8: (constdecl= constDeclarations )? (vardecl= varDeclarations )?
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:95:2: (constdecl= constDeclarations )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:95:3: constdecl= constDeclarations
                    {
                    pushFollow(FOLLOW_constDeclarations_in_declarations574);
                    constdecl=constDeclarations();

                    state._fsp--;

                    list.add(constdecl);		

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:98:2: (vardecl= varDeclarations )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VAR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:98:3: vardecl= varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations591);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:104:1: constDeclarations returns [ IDeclarable node] : CONST (name= IDENT EQUALS exp= expression SEMICOLON )* ;
    public final IDeclarable constDeclarations() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:105:2: ( CONST (name= IDENT EQUALS exp= expression SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:105:8: CONST (name= IDENT EQUALS exp= expression SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();				
            match(input,CONST,FOLLOW_CONST_in_constDeclarations634); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:108:2: (name= IDENT EQUALS exp= expression SEMICOLON )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==IDENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:108:3: name= IDENT EQUALS exp= expression SEMICOLON
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclarations646); 
            	    match(input,EQUALS,FOLLOW_EQUALS_in_constDeclarations651); 
            	    pushFollow(FOLLOW_expression_in_constDeclarations660);
            	    exp=expression();

            	    state._fsp--;

            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_constDeclarations669); 
            	    list.add(new ConstDeclarationNode((name!=null?name.getText():null), exp));	

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

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
    // $ANTLR end "constDeclarations"


    // $ANTLR start "varDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:120:1: varDeclarations returns [ IDeclarable node ] : VAR (names= identList COLON typ= type SEMICOLON )* ;
    public final IDeclarable varDeclarations() throws RecognitionException {
        IDeclarable node = null;

        ArrayList<String> names = null;

        IEvaluable typ = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:121:2: ( VAR (names= identList COLON typ= type SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:121:8: VAR (names= identList COLON typ= type SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();				
            match(input,VAR,FOLLOW_VAR_in_varDeclarations708); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:123:6: (names= identList COLON typ= type SEMICOLON )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:123:7: names= identList COLON typ= type SEMICOLON
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations715);
            	    names=identList();

            	    state._fsp--;

            	    match(input,COLON,FOLLOW_COLON_in_varDeclarations719); 
            	    pushFollow(FOLLOW_type_in_varDeclarations725);
            	    typ=type();

            	    state._fsp--;

            	    list.add(new VarDeclarationNode(names, typ));	
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_varDeclarations732); 
            	    node = new DeclarationsNode(list);				

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:135:1: identList returns [ ArrayList<String> list] : ident1= IDENT ( COMMA ident2= IDENT )* ;
    public final ArrayList<String> identList() throws RecognitionException {
        ArrayList<String> list = null;

        Token ident1=null;
        Token ident2=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:136:2: (ident1= IDENT ( COMMA ident2= IDENT )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:136:7: ident1= IDENT ( COMMA ident2= IDENT )*
            {
            list =	 new ArrayList<String>();	
            ident1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList770); 
            list.add((ident1!=null?ident1.getText():null));		
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:138:2: ( COMMA ident2= IDENT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==COMMA) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:138:3: COMMA ident2= IDENT
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


    // $ANTLR start "statementSequence"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:149:1: statementSequence returns [ IExecutable node ] : stat1= statement ( SEMICOLON statx= statement )* ;
    public final IExecutable statementSequence() throws RecognitionException {
        IExecutable node = null;

        IExecutable stat1 = null;

        IExecutable statx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:150:2: (stat1= statement ( SEMICOLON statx= statement )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:150:8: stat1= statement ( SEMICOLON statx= statement )*
            {
             ArrayList<IExecutable> list = 
            							new  ArrayList<IExecutable>();	
            pushFollow(FOLLOW_statement_in_statementSequence818);
            stat1=statement();

            state._fsp--;

            list.add(stat1);				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:153:2: ( SEMICOLON statx= statement )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==SEMICOLON) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:153:3: SEMICOLON statx= statement
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statementSequence825); 
            	    pushFollow(FOLLOW_statement_in_statementSequence833);
            	    statx=statement();

            	    state._fsp--;

            	    list.add(statx);				

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            node = new StatementsNode(list);		

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
    // $ANTLR end "statementSequence"


    // $ANTLR start "ifStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:158:1: ifStatement returns [ IExecutable node ] : IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END ;
    public final IExecutable ifStatement() throws RecognitionException {
        IExecutable node = null;

        IEvaluable ifcond = null;

        IExecutable ifbody = null;

        IEvaluable elsifcond = null;

        IExecutable elsifbody = null;

        IExecutable elsebody = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:159:2: ( IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:160:2: IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement864); 
            pushFollow(FOLLOW_expression_in_ifStatement873);
            ifcond=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement878); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement887);
            ifbody=statementSequence();

            state._fsp--;

            ArrayList<IEvaluable> condlist = new ArrayList<IEvaluable>();	
            ArrayList<IExecutable> bodylist = new ArrayList<IExecutable>();
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:165:2: ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ELSIF) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:165:3: ELSIF elsifcond= expression THEN elsifbody= statementSequence
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement902); 
            	    pushFollow(FOLLOW_expression_in_ifStatement915);
            	    elsifcond=expression();

            	    state._fsp--;

            	    condlist.add(elsifcond);					
            	    match(input,THEN,FOLLOW_THEN_in_ifStatement926); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement934);
            	    elsifbody=statementSequence();

            	    state._fsp--;

            	    bodylist.add(elsifbody);					

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:170:2: ( ELSE elsebody= statementSequence )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELSE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:170:3: ELSE elsebody= statementSequence
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement945); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement954);
                    elsebody=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement960); 
            node = new IfNode(ifcond, ifbody, 
            									condlist, bodylist, elsebody);	

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
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:177:1: whileStatement returns [ IExecutable node ] : WHILE cond= expression DO stats= statementSequence END ;
    public final IExecutable whileStatement() throws RecognitionException {
        IExecutable node = null;

        IEvaluable cond = null;

        IExecutable stats = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:178:2: ( WHILE cond= expression DO stats= statementSequence END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:178:4: WHILE cond= expression DO stats= statementSequence END
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement982); 
            pushFollow(FOLLOW_expression_in_whileStatement988);
            cond=expression();

            state._fsp--;

            match(input,DO,FOLLOW_DO_in_whileStatement992); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement998);
            stats=statementSequence();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1002); 
            node = new WhileNode(cond, stats);	

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
    // $ANTLR end "whileStatement"


    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:183:1: statement returns [ IExecutable node ] : (ass= assignment | ifs= ifStatement | whil= whileStatement )? ;
    public final IExecutable statement() throws RecognitionException {
        IExecutable node = null;

        IExecutable ass = null;

        IExecutable ifs = null;

        IExecutable whil = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:184:2: ( (ass= assignment | ifs= ifStatement | whil= whileStatement )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:184:3: (ass= assignment | ifs= ifStatement | whil= whileStatement )?
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:184:3: (ass= assignment | ifs= ifStatement | whil= whileStatement )?
            int alt10=4;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    alt10=1;
                    }
                    break;
                case IF:
                    {
                    alt10=2;
                    }
                    break;
                case WHILE:
                    {
                    alt10=3;
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:184:4: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1026);
                    ass=assignment();

                    state._fsp--;

                    node = ass;	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:186:4: ifs= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1041);
                    ifs=ifStatement();

                    state._fsp--;

                    node = ifs;	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:187:4: whil= whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1055);
                    whil=whileStatement();

                    state._fsp--;

                    node = whil;	

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:190:1: assignment returns [ IExecutable node ] : ident= IDENT selec= selector ASSIGNMENT exp= expression ;
    public final IExecutable assignment() throws RecognitionException {
        IExecutable node = null;

        Token ident=null;
        ISelector selec = null;

        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:191:2: (ident= IDENT selec= selector ASSIGNMENT exp= expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:191:3: ident= IDENT selec= selector ASSIGNMENT exp= expression
            {
            ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1077); 
            pushFollow(FOLLOW_selector_in_assignment1081);
            selec=selector();

            state._fsp--;

            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment1085); 
            pushFollow(FOLLOW_expression_in_assignment1093);
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


    // $ANTLR start "type"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:197:1: type returns [ IEvaluable node ] : (ident= IDENT | ARRAY exp= expression OF typ= type );
    public final IEvaluable type() throws RecognitionException {
        IEvaluable node = null;

        Token ident=null;
        IEvaluable exp = null;

        IEvaluable typ = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:198:2: (ident= IDENT | ARRAY exp= expression OF typ= type )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENT) ) {
                alt11=1;
            }
            else if ( (LA11_0==ARRAY) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:198:4: ident= IDENT
                    {
                    ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1117); 
                    node = new TypeNode((ident!=null?ident.getText():null));			

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:199:3: ARRAY exp= expression OF typ= type
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_type1126); 
                    pushFollow(FOLLOW_expression_in_type1132);
                    exp=expression();

                    state._fsp--;

                    match(input,OF,FOLLOW_OF_in_type1137); 
                    pushFollow(FOLLOW_type_in_type1143);
                    typ=type();

                    state._fsp--;

                    node = new ArrayTypeNode(exp, typ);	

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
    // $ANTLR end "type"


    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:220:1: expression returns [ IEvaluable node ] : lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? ;
    public final IEvaluable expression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsExp = null;

        IEvaluable rhsExp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:221:2: (lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:221:4: lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1172);
            lhsExp=simpleExpression();

            state._fsp--;

            node = lhsExp; 					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:222:2: ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            int alt12=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt12=1;
                    }
                    break;
                case HASH:
                    {
                    alt12=2;
                    }
                    break;
                case SMALLERTHEN:
                    {
                    alt12=3;
                    }
                    break;
                case SMALLEREQUAL:
                    {
                    alt12=4;
                    }
                    break;
                case GREATERTHEN:
                    {
                    alt12=5;
                    }
                    break;
                case GREATEREQUAL:
                    {
                    alt12=6;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:222:4: EQUALS rhsExp= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1183); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1190);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNode(node, rhsExp);		

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:223:4: HASH rhsExp= simpleExpression
                    {
                    match(input,HASH,FOLLOW_HASH_in_expression1197); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1204);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNotNode(node, rhsExp);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:4: SMALLERTHEN rhsExp= simpleExpression
                    {
                    match(input,SMALLERTHEN,FOLLOW_SMALLERTHEN_in_expression1211); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1217);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerThenNode(node, rhsExp);	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:225:4: SMALLEREQUAL rhsExp= simpleExpression
                    {
                    match(input,SMALLEREQUAL,FOLLOW_SMALLEREQUAL_in_expression1224); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1230);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerEqualNode(node, rhsExp);	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:226:4: GREATERTHEN rhsExp= simpleExpression
                    {
                    match(input,GREATERTHEN,FOLLOW_GREATERTHEN_in_expression1237); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1243);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new GreaterThenNode(node, rhsExp);	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:227:4: GREATEREQUAL rhsExp= simpleExpression
                    {
                    match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_expression1250); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1256);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:230:1: simpleExpression returns [ IEvaluable node ] : ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* ;
    public final IEvaluable simpleExpression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsTerm = null;

        IEvaluable rhsTerm = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:231:2: ( ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:231:8: ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            {
             Boolean minus = false; 				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:232:2: ( ADD | SUBTRACT )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ADD) ) {
                alt13=1;
            }
            else if ( (LA13_0==SUBTRACT) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:232:3: ADD
                    {
                    match(input,ADD,FOLLOW_ADD_in_simpleExpression1283); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:233:4: SUBTRACT
                    {
                    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression1289); 
                     minus = true;						

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression1307);
            lhsTerm=term();

            state._fsp--;

            node = lhsTerm;					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:236:2: ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt14=1;
                    }
                    break;
                case SUBTRACT:
                    {
                    alt14=2;
                    }
                    break;
                case OR:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:236:3: ADD rhsTerm= term
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_simpleExpression1316); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1324);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new AddNode(node, rhsTerm);		

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:237:4: SUBTRACT rhsTerm= term
            	    {
            	    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression1332); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1339);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new SubtractNode(node, rhsTerm);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:238:4: OR term rhsTerm= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_simpleExpression1347); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1349);
            	    term();

            	    state._fsp--;

            	    pushFollow(FOLLOW_term_in_simpleExpression1356);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new DisjunctionNode(node, rhsTerm);	

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:243:1: term returns [ IEvaluable node ] : lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* ;
    public final IEvaluable term() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsFactor = null;

        IEvaluable rhsFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:244:2: (lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:245:2: lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            {
            pushFollow(FOLLOW_factor_in_term1395);
            lhsFactor=factor();

            state._fsp--;

            node = lhsFactor;				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:246:2: ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            loop15:
            do {
                int alt15=5;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt15=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt15=2;
                    }
                    break;
                case MOD:
                    {
                    alt15=3;
                    }
                    break;
                case AMPERSAND:
                    {
                    alt15=4;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:246:4: MULTIPLY rhsFactor= factor
            	    {
            	    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term1405); 
            	    pushFollow(FOLLOW_factor_in_term1412);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new MultiplyNode(node, rhsFactor);	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:247:4: DIVIDE rhsFactor= factor
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_term1419); 
            	    pushFollow(FOLLOW_factor_in_term1426);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new DivideNode(node, rhsFactor);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:248:4: MOD rhsFactor= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term1433); 
            	    pushFollow(FOLLOW_factor_in_term1441);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ModuloNode(node, rhsFactor);	

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:249:4: AMPERSAND rhsFactor= factor
            	    {
            	    match(input,AMPERSAND,FOLLOW_AMPERSAND_in_term1448); 
            	    pushFollow(FOLLOW_factor_in_term1455);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ConjunctionNode(node, rhsFactor);	

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:252:1: factor returns [ IEvaluable node ] : (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor );
    public final IEvaluable factor() throws RecognitionException {
        IEvaluable node = null;

        Token ident=null;
        ISelector selec = null;

        IntegerNode num = null;

        IEvaluable exp = null;

        IEvaluable nFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:253:2: (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor )
            int alt16=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt16=1;
                }
                break;
            case INTEGER:
                {
                alt16=2;
                }
                break;
            case RNDOPEN:
                {
                alt16=3;
                }
                break;
            case TILDE:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:253:4: ident= IDENT selec= selector
                    {
                    ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1477); 
                    pushFollow(FOLLOW_selector_in_factor1481);
                    selec=selector();

                    state._fsp--;

                     node = new VariableNode((ident!=null?ident.getText():null), selec);	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:254:4: num= number
                    {
                    pushFollow(FOLLOW_number_in_factor1492);
                    num=number();

                    state._fsp--;

                     node = num;			 		

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:255:4: RNDOPEN exp= expression RNDCLOSE
                    {
                    match(input,RNDOPEN,FOLLOW_RNDOPEN_in_factor1503); 
                    pushFollow(FOLLOW_expression_in_factor1507);
                    exp=expression();

                    state._fsp--;

                    match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_factor1509); 
                     node = exp;		 	 		

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:256:4: TILDE nFactor= factor
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_factor1517); 
                    pushFollow(FOLLOW_factor_in_factor1521);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:259:1: number returns [ IntegerNode node ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode node = null;

        Token INTEGER1=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:260:2: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:260:4: INTEGER
            {
            INTEGER1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1540); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:263:1: booleann returns [ IEvaluable node ] : ( FALSE | TRUE );
    public final IEvaluable booleann() throws RecognitionException {
        IEvaluable node = null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:264:2: ( FALSE | TRUE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FALSE) ) {
                alt17=1;
            }
            else if ( (LA17_0==TRUE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:264:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleann1559); 
                     node = new BooleanNode ( false); 	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:265:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleann1569); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:268:1: selector returns [ ISelector node ] : ( DOT IDENT | SQROPEN expression SQRCLOSE )* ;
    public final ISelector selector() throws RecognitionException {
        ISelector node = null;

        Token IDENT2=null;
        IEvaluable expression3 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:269:2: ( ( DOT IDENT | SQROPEN expression SQRCLOSE )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:269:8: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            {
            ArrayList<ISelector> list = 
            						 new ArrayList<ISelector>();			
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:271:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==DOT) ) {
                    alt18=1;
                }
                else if ( (LA18_0==SQROPEN) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:271:3: DOT IDENT
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_selector1597); 
            	    IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1599); 
            	    list.add(new SelectorRecordNode ( (IDENT2!=null?IDENT2.getText():null) ) );	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:272:4: SQROPEN expression SQRCLOSE
            	    {
            	    match(input,SQROPEN,FOLLOW_SQROPEN_in_selector1609); 
            	    pushFollow(FOLLOW_expression_in_selector1611);
            	    expression3=expression();

            	    state._fsp--;

            	    match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_selector1613); 
            	    list.add(new SelectorArrayNode ( expression3 ) );	

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            node = new SelectorNode(list);			

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
    public static final BitSet FOLLOW_declarations_in_module472 = new BitSet(new long[]{0x000002A000000000L});
    public static final BitSet FOLLOW_body_in_module480 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module482 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body503 = new BitSet(new long[]{0x0080000660000000L});
    public static final BitSet FOLLOW_statement_in_body515 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_body523 = new BitSet(new long[]{0x0080000660000000L});
    public static final BitSet FOLLOW_statement_in_body531 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_body541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclarations_in_declarations574 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclarations634 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclarations646 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclarations651 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_constDeclarations660 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_constDeclarations669 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations708 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations715 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations719 = new BitSet(new long[]{0x0080000800000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations725 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_varDeclarations732 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList770 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_identList779 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList784 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_statement_in_statementSequence818 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statementSequence825 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence833 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement864 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement873 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement878 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement887 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement902 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement915 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement926 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement934 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement945 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement954 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement982 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_whileStatement988 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement992 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement998 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_whileStatement1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1077 = new BitSet(new long[]{0x0000000010420000L});
    public static final BitSet FOLLOW_selector_in_assignment1081 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment1085 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type1126 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_type1132 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_type1137 = new BitSet(new long[]{0x0080000800000000L});
    public static final BitSet FOLLOW_type_in_type1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1172 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_EQUALS_in_expression1183 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_expression1197 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLERTHEN_in_expression1211 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLEREQUAL_in_expression1224 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHEN_in_expression1237 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_expression1250 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression1283 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression1289 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1307 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression1316 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1324 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression1332 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1339 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1347 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1349 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1356 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_factor_in_term1395 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MULTIPLY_in_term1405 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1412 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_DIVIDE_in_term1419 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1426 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MOD_in_term1433 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1441 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_AMPERSAND_in_term1448 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1455 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_IDENT_in_factor1477 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_factor1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_factor1503 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_factor1507 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_factor1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor1517 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_factor1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleann1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleann1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector1597 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector1599 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_SQROPEN_in_selector1609 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_selector1611 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_selector1613 = new BitSet(new long[]{0x0000000000420002L});

}