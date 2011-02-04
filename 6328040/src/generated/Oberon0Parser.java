// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g 2011-02-04 14:46:51
package generated; 

import java.util.HashMap;

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:79:1: module returns [ ICallable node ] : MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF ;
    public final ICallable module() throws RecognitionException {
        ICallable node = null;

        Token name=null;
        IDeclarable decl = null;

        IExecutable mbody = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:79:34: ( MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:80:2: MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:85:1: body returns [ IExecutable node ] : BEGIN stat1= statement ( SEMICOLON statx= statement )* END ;
    public final IExecutable body() throws RecognitionException {
        IExecutable node = null;

        IExecutable stat1 = null;

        IExecutable statx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:86:2: ( BEGIN stat1= statement ( SEMICOLON statx= statement )* END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:86:4: BEGIN stat1= statement ( SEMICOLON statx= statement )* END
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_body503); 
            ArrayList<IExecutable> list = 
            						new ArrayList<IExecutable>();	
            pushFollow(FOLLOW_statement_in_body515);
            stat1=statement();

            state._fsp--;

            list.add(stat1);			
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:89:2: ( SEMICOLON statx= statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:89:3: SEMICOLON statx= statement
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:95:1: declarations returns [ IDeclarable node ] : (constdecl= constDeclarations )? (vardecl= varDeclarations )? (proc= procedureDeclaration SEMICOLON )* ;
    public final IDeclarable declarations() throws RecognitionException {
        IDeclarable node = null;

        IDeclarable constdecl = null;

        IDeclarable vardecl = null;

        IDeclarable proc = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:96:2: ( (constdecl= constDeclarations )? (vardecl= varDeclarations )? (proc= procedureDeclaration SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:96:8: (constdecl= constDeclarations )? (vardecl= varDeclarations )? (proc= procedureDeclaration SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:98:2: (constdecl= constDeclarations )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:98:3: constdecl= constDeclarations
                    {
                    pushFollow(FOLLOW_constDeclarations_in_declarations574);
                    constdecl=constDeclarations();

                    state._fsp--;

                    list.add(constdecl);		

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:101:2: (vardecl= varDeclarations )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==VAR) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:101:3: vardecl= varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations591);
                    vardecl=varDeclarations();

                    state._fsp--;

                    list.add(vardecl);		

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:103:2: (proc= procedureDeclaration SEMICOLON )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==PROCEDURE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:103:3: proc= procedureDeclaration SEMICOLON
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations607);
            	    proc=procedureDeclaration();

            	    state._fsp--;

            	    list.add(proc);			
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations613); 

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
    // $ANTLR end "declarations"


    // $ANTLR start "constDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:108:1: constDeclarations returns [ IDeclarable node] : CONST (name= IDENT EQUALS exp= expression SEMICOLON )* ;
    public final IDeclarable constDeclarations() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:109:2: ( CONST (name= IDENT EQUALS exp= expression SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:109:8: CONST (name= IDENT EQUALS exp= expression SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();				
            match(input,CONST,FOLLOW_CONST_in_constDeclarations648); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:112:2: (name= IDENT EQUALS exp= expression SEMICOLON )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENT) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==EQUALS) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:112:3: name= IDENT EQUALS exp= expression SEMICOLON
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclarations660); 
            	    match(input,EQUALS,FOLLOW_EQUALS_in_constDeclarations665); 
            	    pushFollow(FOLLOW_expression_in_constDeclarations674);
            	    exp=expression();

            	    state._fsp--;

            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_constDeclarations683); 
            	    list.add(new ConstDeclarationNode((name!=null?name.getText():null), exp));	

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:124:1: varDeclarations returns [ IDeclarable node ] : VAR (names= identList COLON typ= type SEMICOLON )* ;
    public final IDeclarable varDeclarations() throws RecognitionException {
        IDeclarable node = null;

        ArrayList<String> names = null;

        IEvaluable typ = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:125:2: ( VAR (names= identList COLON typ= type SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:125:8: VAR (names= identList COLON typ= type SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();				
            match(input,VAR,FOLLOW_VAR_in_varDeclarations722); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:127:6: (names= identList COLON typ= type SEMICOLON )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT) ) {
                    int LA6_2 = input.LA(2);

                    if ( ((LA6_2>=COMMA && LA6_2<=COLON)) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:127:7: names= identList COLON typ= type SEMICOLON
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations729);
            	    names=identList();

            	    state._fsp--;

            	    match(input,COLON,FOLLOW_COLON_in_varDeclarations733); 
            	    pushFollow(FOLLOW_type_in_varDeclarations739);
            	    typ=type();

            	    state._fsp--;

            	    list.add(new VarDeclarationNode(names, typ));	
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_varDeclarations746); 
            	    node = new DeclarationsNode(list);				

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
        return node;
    }
    // $ANTLR end "varDeclarations"


    // $ANTLR start "identList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:133:1: identList returns [ ArrayList<String> list] : ident1= IDENT ( COMMA ident2= IDENT )* ;
    public final ArrayList<String> identList() throws RecognitionException {
        ArrayList<String> list = null;

        Token ident1=null;
        Token ident2=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:134:2: (ident1= IDENT ( COMMA ident2= IDENT )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:134:7: ident1= IDENT ( COMMA ident2= IDENT )*
            {
            list =	 new ArrayList<String>();	
            ident1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList782); 
            list.add((ident1!=null?ident1.getText():null));		
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:136:2: ( COMMA ident2= IDENT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:136:3: COMMA ident2= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identList791); 
            	    ident2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList796); 
            	    list.add((ident2!=null?ident2.getText():null));		

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
        return list;
    }
    // $ANTLR end "identList"


    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:140:1: procedureDeclaration returns [ IDeclarable node ] : PROCEDURE name= IDENT (fp= formalParameters )? SEMICOLON decl= declarations (bod= body )? IDENT ;
    public final IDeclarable procedureDeclaration() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        ArrayList<IFormalParameter> fp = null;

        IDeclarable decl = null;

        IExecutable bod = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:141:2: ( PROCEDURE name= IDENT (fp= formalParameters )? SEMICOLON decl= declarations (bod= body )? IDENT )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:141:4: PROCEDURE name= IDENT (fp= formalParameters )? SEMICOLON decl= declarations (bod= body )? IDENT
            {
            match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration819); 
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration825); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:142:2: (fp= formalParameters )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RNDOPEN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:142:4: fp= formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration835);
                    fp=formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureDeclaration843); 
            pushFollow(FOLLOW_declarations_in_procedureDeclaration851);
            decl=declarations();

            state._fsp--;

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:146:2: (bod= body )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==BEGIN) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:146:4: bod= body
                    {
                    pushFollow(FOLLOW_body_in_procedureDeclaration861);
                    bod=body();

                    state._fsp--;


                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration867); 
            node = new ProcedureNode((name!=null?name.getText():null), fp, decl, bod);	

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
    // $ANTLR end "procedureDeclaration"


    // $ANTLR start "formalParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:150:1: formalParameters returns [ ArrayList<IFormalParameter> list ] : RNDOPEN (fp1= fpSection ( SEMICOLON fpx= fpSection )* )? RNDCLOSE ;
    public final ArrayList<IFormalParameter> formalParameters() throws RecognitionException {
        ArrayList<IFormalParameter> list = null;

        IFormalParameter fp1 = null;

        IFormalParameter fpx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:151:2: ( RNDOPEN (fp1= fpSection ( SEMICOLON fpx= fpSection )* )? RNDCLOSE )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:151:3: RNDOPEN (fp1= fpSection ( SEMICOLON fpx= fpSection )* )? RNDCLOSE
            {
            match(input,RNDOPEN,FOLLOW_RNDOPEN_in_formalParameters885); 
            list = new ArrayList<IFormalParameter>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:152:2: (fp1= fpSection ( SEMICOLON fpx= fpSection )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==VAR||LA11_0==IDENT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:152:3: fp1= fpSection ( SEMICOLON fpx= fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters896);
                    fp1=fpSection();

                    state._fsp--;

                    list.add(fp1);				
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:153:2: ( SEMICOLON fpx= fpSection )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==SEMICOLON) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:153:3: SEMICOLON fpx= fpSection
                    	    {
                    	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_formalParameters903); 
                    	    pushFollow(FOLLOW_fpSection_in_formalParameters910);
                    	    fpx=fpSection();

                    	    state._fsp--;

                    	    list.add(fpx);				

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_formalParameters923); 

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
    // $ANTLR end "formalParameters"


    // $ANTLR start "fpSection"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:159:1: fpSection returns [ IFormalParameter node ] : (l1= identList COLON t1= type | VAR l2= identList COLON t2= type );
    public final IFormalParameter fpSection() throws RecognitionException {
        IFormalParameter node = null;

        ArrayList<String> l1 = null;

        IEvaluable t1 = null;

        ArrayList<String> l2 = null;

        IEvaluable t2 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:160:2: (l1= identList COLON t1= type | VAR l2= identList COLON t2= type )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT) ) {
                alt12=1;
            }
            else if ( (LA12_0==VAR) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:160:3: l1= identList COLON t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fpSection943);
                    l1=identList();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_fpSection947); 
                    pushFollow(FOLLOW_type_in_fpSection955);
                    t1=type();

                    state._fsp--;

                    node = new FPVarNode(l1, t1);	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:163:3: VAR l2= identList COLON t2= type
                    {
                    match(input,VAR,FOLLOW_VAR_in_fpSection962); 
                    pushFollow(FOLLOW_identList_in_fpSection970);
                    l2=identList();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_fpSection973); 
                    pushFollow(FOLLOW_type_in_fpSection981);
                    t2=type();

                    state._fsp--;

                    node = new FPRefVarNode(l2, t2);	

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
    // $ANTLR end "fpSection"


    // $ANTLR start "statement"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:171:1: statement returns [ IExecutable node ] : (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )? ;
    public final IExecutable statement() throws RecognitionException {
        IExecutable node = null;

        IExecutable ass = null;

        IExecutable proc = null;

        IExecutable ifs = null;

        IExecutable whil = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:172:2: ( (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:172:3: (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )?
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:172:3: (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )?
            int alt13=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==DOT||LA13_1==SQROPEN||LA13_1==ASSIGNMENT) ) {
                        alt13=1;
                    }
                    else if ( (LA13_1==RNDOPEN||(LA13_1>=SEMICOLON && LA13_1<=ELSIF)) ) {
                        alt13=2;
                    }
                    }
                    break;
                case IF:
                    {
                    alt13=3;
                    }
                    break;
                case WHILE:
                    {
                    alt13=4;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:172:4: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1005);
                    ass=assignment();

                    state._fsp--;

                    node = ass;	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:173:4: proc= procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1019);
                    proc=procedureCall();

                    state._fsp--;

                    node = proc;	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:174:4: ifs= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1032);
                    ifs=ifStatement();

                    state._fsp--;

                    node = ifs;	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:175:4: whil= whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1046);
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


    // $ANTLR start "procedureCall"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:178:1: procedureCall returns [ IExecutable node ] : name= IDENT (ap= actualParameters )? ;
    public final IExecutable procedureCall() throws RecognitionException {
        IExecutable node = null;

        Token name=null;
        ArrayList<IReferable> ap = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:179:2: (name= IDENT (ap= actualParameters )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:179:4: name= IDENT (ap= actualParameters )?
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall1070); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:179:17: (ap= actualParameters )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RNDOPEN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:180:2: ap= actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall1080);
                    ap=actualParameters();

                    state._fsp--;

                    node = new ProcedureCallNode((name!=null?name.getText():null), ap);	

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
    // $ANTLR end "procedureCall"


    // $ANTLR start "actualParameters"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:184:1: actualParameters returns [ ArrayList<IReferable> list] : RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE ;
    public final ArrayList<IReferable> actualParameters() throws RecognitionException {
        ArrayList<IReferable> list = null;

        IEvaluable exp1 = null;

        IEvaluable expx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:185:2: ( RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:185:4: RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE
            {
            match(input,RNDOPEN,FOLLOW_RNDOPEN_in_actualParameters1104); 
            list = new ArrayList<IReferable>();		
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:186:2: (exp1= expression ( COMMA expx= expression )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=ADD && LA16_0<=SUBTRACT)||LA16_0==RNDOPEN||LA16_0==TILDE||(LA16_0>=IDENT && LA16_0<=INTEGER)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:186:3: exp1= expression ( COMMA expx= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1117);
                    exp1=expression();

                    state._fsp--;

                    list.add(new ActualParamNode(exp1));	
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:187:2: ( COMMA expx= expression )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:187:3: COMMA expx= expression
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_actualParameters1125); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters1133);
                    	    expx=expression();

                    	    state._fsp--;

                    	    list.add(new ActualParamNode(expx));	

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_actualParameters1148); 

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
    // $ANTLR end "actualParameters"


    // $ANTLR start "statementSequence"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:195:1: statementSequence returns [ IExecutable node ] : stat1= statement ( SEMICOLON statx= statement )* ;
    public final IExecutable statementSequence() throws RecognitionException {
        IExecutable node = null;

        IExecutable stat1 = null;

        IExecutable statx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:196:2: (stat1= statement ( SEMICOLON statx= statement )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:196:8: stat1= statement ( SEMICOLON statx= statement )*
            {
             ArrayList<IExecutable> list = 
            							new  ArrayList<IExecutable>();	
            pushFollow(FOLLOW_statement_in_statementSequence1175);
            stat1=statement();

            state._fsp--;

            list.add(stat1);				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:199:2: ( SEMICOLON statx= statement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SEMICOLON) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:199:3: SEMICOLON statx= statement
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statementSequence1182); 
            	    pushFollow(FOLLOW_statement_in_statementSequence1190);
            	    statx=statement();

            	    state._fsp--;

            	    list.add(statx);				

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:204:1: ifStatement returns [ IExecutable node ] : IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END ;
    public final IExecutable ifStatement() throws RecognitionException {
        IExecutable node = null;

        IEvaluable ifcond = null;

        IExecutable ifbody = null;

        IEvaluable elsifcond = null;

        IExecutable elsifbody = null;

        IExecutable elsebody = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:205:2: ( IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:206:2: IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1221); 
            pushFollow(FOLLOW_expression_in_ifStatement1230);
            ifcond=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement1235); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1244);
            ifbody=statementSequence();

            state._fsp--;

            ArrayList<IEvaluable> condlist = new ArrayList<IEvaluable>();	
            ArrayList<IExecutable> bodylist = new ArrayList<IExecutable>();
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:211:2: ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ELSIF) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:211:3: ELSIF elsifcond= expression THEN elsifbody= statementSequence
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement1259); 
            	    pushFollow(FOLLOW_expression_in_ifStatement1272);
            	    elsifcond=expression();

            	    state._fsp--;

            	    condlist.add(elsifcond);					
            	    match(input,THEN,FOLLOW_THEN_in_ifStatement1283); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement1291);
            	    elsifbody=statementSequence();

            	    state._fsp--;

            	    bodylist.add(elsifbody);					

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:216:2: ( ELSE elsebody= statementSequence )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ELSE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:216:3: ELSE elsebody= statementSequence
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1302); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1311);
                    elsebody=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1317); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:223:1: whileStatement returns [ IExecutable node ] : WHILE cond= expression DO stats= statementSequence END ;
    public final IExecutable whileStatement() throws RecognitionException {
        IExecutable node = null;

        IEvaluable cond = null;

        IExecutable stats = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:2: ( WHILE cond= expression DO stats= statementSequence END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:224:4: WHILE cond= expression DO stats= statementSequence END
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement1339); 
            pushFollow(FOLLOW_expression_in_whileStatement1345);
            cond=expression();

            state._fsp--;

            match(input,DO,FOLLOW_DO_in_whileStatement1349); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1355);
            stats=statementSequence();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1359); 
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


    // $ANTLR start "assignment"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:229:1: assignment returns [ IExecutable node ] : ident= IDENT selec= selector ASSIGNMENT exp= expression ;
    public final IExecutable assignment() throws RecognitionException {
        IExecutable node = null;

        Token ident=null;
        ISelector selec = null;

        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:230:2: (ident= IDENT selec= selector ASSIGNMENT exp= expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:230:3: ident= IDENT selec= selector ASSIGNMENT exp= expression
            {
            ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1381); 
            pushFollow(FOLLOW_selector_in_assignment1385);
            selec=selector();

            state._fsp--;

            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment1389); 
            pushFollow(FOLLOW_expression_in_assignment1397);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:236:1: type returns [ IEvaluable node ] : (ident= IDENT | ARRAY exp= expression OF typ= type | rec= recordType );
    public final IEvaluable type() throws RecognitionException {
        IEvaluable node = null;

        Token ident=null;
        IEvaluable exp = null;

        IEvaluable typ = null;

        HashMap<String, IEvaluable> rec = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:237:2: (ident= IDENT | ARRAY exp= expression OF typ= type | rec= recordType )
            int alt20=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt20=1;
                }
                break;
            case ARRAY:
                {
                alt20=2;
                }
                break;
            case RECORD:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:237:4: ident= IDENT
                    {
                    ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1421); 
                    node = new TypeNode((ident!=null?ident.getText():null));			

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:238:3: ARRAY exp= expression OF typ= type
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_type1429); 
                    pushFollow(FOLLOW_expression_in_type1435);
                    exp=expression();

                    state._fsp--;

                    match(input,OF,FOLLOW_OF_in_type1440); 
                    pushFollow(FOLLOW_type_in_type1446);
                    typ=type();

                    state._fsp--;

                    node = new ArrayTypeNode(exp, typ);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:240:4: rec= recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type1458);
                    rec=recordType();

                    state._fsp--;

                    node = new RecordTypeNode(rec);		

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


    // $ANTLR start "recordType"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:245:1: recordType returns [ HashMap<String, IEvaluable> fields ] : RECORD (ident1= identList COLON typ1= type )? ( SEMICOLON (identx= identList COLON typx= type )? )* END ;
    public final HashMap<String, IEvaluable> recordType() throws RecognitionException {
        HashMap<String, IEvaluable> fields = null;

        ArrayList<String> ident1 = null;

        IEvaluable typ1 = null;

        ArrayList<String> identx = null;

        IEvaluable typx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:246:2: ( RECORD (ident1= identList COLON typ1= type )? ( SEMICOLON (identx= identList COLON typx= type )? )* END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:246:4: RECORD (ident1= identList COLON typ1= type )? ( SEMICOLON (identx= identList COLON typx= type )? )* END
            {
            match(input,RECORD,FOLLOW_RECORD_in_recordType1479); 
            fields = new HashMap<String, IEvaluable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:247:2: (ident1= identList COLON typ1= type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==IDENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:247:4: ident1= identList COLON typ1= type
                    {
                    pushFollow(FOLLOW_identList_in_recordType1494);
                    ident1=identList();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_recordType1498); 
                    pushFollow(FOLLOW_type_in_recordType1506);
                    typ1=type();

                    state._fsp--;

                    for (String ident: ident1) 
                    						fields.put(ident, typ1);

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:252:2: ( SEMICOLON (identx= identList COLON typx= type )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==SEMICOLON) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:252:3: SEMICOLON (identx= identList COLON typx= type )?
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordType1518); 
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:253:2: (identx= identList COLON typx= type )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==IDENT) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:253:4: identx= identList COLON typx= type
            	            {
            	            pushFollow(FOLLOW_identList_in_recordType1528);
            	            identx=identList();

            	            state._fsp--;

            	            match(input,COLON,FOLLOW_COLON_in_recordType1532); 
            	            pushFollow(FOLLOW_type_in_recordType1540);
            	            typx=type();

            	            state._fsp--;

            	            for (String ident: identx) 
            	            						fields.put(ident, typx);

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_recordType1556); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return fields;
    }
    // $ANTLR end "recordType"


    // $ANTLR start "expression"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:263:1: expression returns [ IEvaluable node ] : lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? ;
    public final IEvaluable expression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsExp = null;

        IEvaluable rhsExp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:264:2: (lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:264:4: lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1577);
            lhsExp=simpleExpression();

            state._fsp--;

            node = lhsExp; 					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:265:2: ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            int alt24=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt24=1;
                    }
                    break;
                case HASH:
                    {
                    alt24=2;
                    }
                    break;
                case SMALLERTHEN:
                    {
                    alt24=3;
                    }
                    break;
                case SMALLEREQUAL:
                    {
                    alt24=4;
                    }
                    break;
                case GREATERTHEN:
                    {
                    alt24=5;
                    }
                    break;
                case GREATEREQUAL:
                    {
                    alt24=6;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:265:4: EQUALS rhsExp= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1588); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1595);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNode(node, rhsExp);		

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:266:4: HASH rhsExp= simpleExpression
                    {
                    match(input,HASH,FOLLOW_HASH_in_expression1602); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1609);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNotNode(node, rhsExp);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:267:4: SMALLERTHEN rhsExp= simpleExpression
                    {
                    match(input,SMALLERTHEN,FOLLOW_SMALLERTHEN_in_expression1616); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1622);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerThenNode(node, rhsExp);	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:268:4: SMALLEREQUAL rhsExp= simpleExpression
                    {
                    match(input,SMALLEREQUAL,FOLLOW_SMALLEREQUAL_in_expression1629); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1635);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerEqualNode(node, rhsExp);	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:269:4: GREATERTHEN rhsExp= simpleExpression
                    {
                    match(input,GREATERTHEN,FOLLOW_GREATERTHEN_in_expression1642); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1648);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new GreaterThenNode(node, rhsExp);	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:270:4: GREATEREQUAL rhsExp= simpleExpression
                    {
                    match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_expression1655); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1661);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:273:1: simpleExpression returns [ IEvaluable node ] : ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* ;
    public final IEvaluable simpleExpression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsTerm = null;

        IEvaluable rhsTerm = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:274:2: ( ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:274:8: ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            {
             Boolean minus = false; 				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:275:2: ( ADD | SUBTRACT )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ADD) ) {
                alt25=1;
            }
            else if ( (LA25_0==SUBTRACT) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:275:3: ADD
                    {
                    match(input,ADD,FOLLOW_ADD_in_simpleExpression1688); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:276:4: SUBTRACT
                    {
                    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression1694); 
                     minus = true;						

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression1712);
            lhsTerm=term();

            state._fsp--;

            node = lhsTerm;					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:279:2: ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            loop26:
            do {
                int alt26=4;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt26=1;
                    }
                    break;
                case SUBTRACT:
                    {
                    alt26=2;
                    }
                    break;
                case OR:
                    {
                    alt26=3;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:279:3: ADD rhsTerm= term
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_simpleExpression1721); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1729);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new AddNode(node, rhsTerm);		

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:280:4: SUBTRACT rhsTerm= term
            	    {
            	    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression1737); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1744);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new SubtractNode(node, rhsTerm);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:281:4: OR term rhsTerm= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_simpleExpression1752); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1754);
            	    term();

            	    state._fsp--;

            	    pushFollow(FOLLOW_term_in_simpleExpression1761);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new DisjunctionNode(node, rhsTerm);	

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:286:1: term returns [ IEvaluable node ] : lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* ;
    public final IEvaluable term() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsFactor = null;

        IEvaluable rhsFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:287:2: (lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:288:2: lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            {
            pushFollow(FOLLOW_factor_in_term1800);
            lhsFactor=factor();

            state._fsp--;

            node = lhsFactor;				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:289:2: ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            loop27:
            do {
                int alt27=5;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt27=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt27=2;
                    }
                    break;
                case MOD:
                    {
                    alt27=3;
                    }
                    break;
                case AMPERSAND:
                    {
                    alt27=4;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:289:4: MULTIPLY rhsFactor= factor
            	    {
            	    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term1810); 
            	    pushFollow(FOLLOW_factor_in_term1817);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new MultiplyNode(node, rhsFactor);	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:290:4: DIVIDE rhsFactor= factor
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_term1824); 
            	    pushFollow(FOLLOW_factor_in_term1831);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new DivideNode(node, rhsFactor);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:291:4: MOD rhsFactor= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term1838); 
            	    pushFollow(FOLLOW_factor_in_term1846);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ModuloNode(node, rhsFactor);	

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:292:4: AMPERSAND rhsFactor= factor
            	    {
            	    match(input,AMPERSAND,FOLLOW_AMPERSAND_in_term1853); 
            	    pushFollow(FOLLOW_factor_in_term1860);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ConjunctionNode(node, rhsFactor);	

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:295:1: factor returns [ IEvaluable node ] : (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor );
    public final IEvaluable factor() throws RecognitionException {
        IEvaluable node = null;

        Token ident=null;
        ISelector selec = null;

        IntegerNode num = null;

        IEvaluable exp = null;

        IEvaluable nFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:296:2: (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor )
            int alt28=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt28=1;
                }
                break;
            case INTEGER:
                {
                alt28=2;
                }
                break;
            case RNDOPEN:
                {
                alt28=3;
                }
                break;
            case TILDE:
                {
                alt28=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:296:4: ident= IDENT selec= selector
                    {
                    ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1882); 
                    pushFollow(FOLLOW_selector_in_factor1886);
                    selec=selector();

                    state._fsp--;

                     node = new VariableNode((ident!=null?ident.getText():null), selec);	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:297:4: num= number
                    {
                    pushFollow(FOLLOW_number_in_factor1897);
                    num=number();

                    state._fsp--;

                     node = num;			 		

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:298:4: RNDOPEN exp= expression RNDCLOSE
                    {
                    match(input,RNDOPEN,FOLLOW_RNDOPEN_in_factor1908); 
                    pushFollow(FOLLOW_expression_in_factor1912);
                    exp=expression();

                    state._fsp--;

                    match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_factor1914); 
                     node = exp;		 	 		

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:299:4: TILDE nFactor= factor
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_factor1922); 
                    pushFollow(FOLLOW_factor_in_factor1926);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:302:1: number returns [ IntegerNode node ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode node = null;

        Token INTEGER1=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:303:2: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:303:4: INTEGER
            {
            INTEGER1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1945); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:306:1: booleann returns [ IEvaluable node ] : ( FALSE | TRUE );
    public final IEvaluable booleann() throws RecognitionException {
        IEvaluable node = null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:307:2: ( FALSE | TRUE )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FALSE) ) {
                alt29=1;
            }
            else if ( (LA29_0==TRUE) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:307:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleann1964); 
                     node = new BooleanNode ( false); 	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:308:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleann1974); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:311:1: selector returns [ ISelector node ] : ( DOT IDENT | SQROPEN expression SQRCLOSE )* ;
    public final ISelector selector() throws RecognitionException {
        ISelector node = null;

        Token IDENT2=null;
        IEvaluable expression3 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:312:2: ( ( DOT IDENT | SQROPEN expression SQRCLOSE )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:312:8: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            {
            ArrayList<ISelector> list = 
            						 new ArrayList<ISelector>();			
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:314:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DOT) ) {
                    alt30=1;
                }
                else if ( (LA30_0==SQROPEN) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:314:3: DOT IDENT
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_selector2002); 
            	    IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector2004); 
            	    list.add(new SelectorRecordNode ( (IDENT2!=null?IDENT2.getText():null) ) );	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:315:4: SQROPEN expression SQRCLOSE
            	    {
            	    match(input,SQROPEN,FOLLOW_SQROPEN_in_selector2014); 
            	    pushFollow(FOLLOW_expression_in_selector2016);
            	    expression3=expression();

            	    state._fsp--;

            	    match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_selector2018); 
            	    list.add(new SelectorArrayNode ( expression3 ) );	

            	    }
            	    break;

            	default :
            	    break loop30;
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
    public static final BitSet FOLLOW_SEMICOLON_in_module464 = new BitSet(new long[]{0x000003A000000000L});
    public static final BitSet FOLLOW_declarations_in_module472 = new BitSet(new long[]{0x000003A000000000L});
    public static final BitSet FOLLOW_body_in_module480 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module482 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body503 = new BitSet(new long[]{0x0080000660000000L});
    public static final BitSet FOLLOW_statement_in_body515 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_body523 = new BitSet(new long[]{0x0080000660000000L});
    public static final BitSet FOLLOW_statement_in_body531 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_body541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclarations_in_declarations574 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations591 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations607 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_declarations613 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclarations648 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclarations660 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclarations665 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_constDeclarations674 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_constDeclarations683 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations722 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations729 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations733 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations739 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_varDeclarations746 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList782 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_identList791 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList796 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration819 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration825 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration835 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureDeclaration843 = new BitSet(new long[]{0x008003A000000000L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration851 = new BitSet(new long[]{0x008003A000000000L});
    public static final BitSet FOLLOW_body_in_procedureDeclaration861 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_formalParameters885 = new BitSet(new long[]{0x0080008000200000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters896 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_SEMICOLON_in_formalParameters903 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters910 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_formalParameters923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fpSection943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection947 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection962 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identList_in_fpSection970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection973 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall1070 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_actualParameters1104 = new BitSet(new long[]{0x0180000008300300L});
    public static final BitSet FOLLOW_expression_in_actualParameters1117 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_COMMA_in_actualParameters1125 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_actualParameters1133 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_actualParameters1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1175 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statementSequence1182 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1190 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1221 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1230 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1235 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1244 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement1259 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1272 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1283 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1291 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1302 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1311 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1339 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_whileStatement1345 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1349 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1355 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_whileStatement1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1381 = new BitSet(new long[]{0x0000000010420000L});
    public static final BitSet FOLLOW_selector_in_assignment1385 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment1389 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type1429 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_type1435 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_type1440 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_type1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1479 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_identList_in_recordType1494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_recordType1498 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_recordType1506 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_recordType1518 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_identList_in_recordType1528 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_recordType1532 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_recordType1540 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_recordType1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1577 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_EQUALS_in_expression1588 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_expression1602 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLERTHEN_in_expression1616 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLEREQUAL_in_expression1629 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHEN_in_expression1642 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_expression1655 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression1688 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression1694 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1712 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression1721 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1729 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression1737 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1744 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1752 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1754 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1761 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_factor_in_term1800 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MULTIPLY_in_term1810 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1817 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_DIVIDE_in_term1824 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1831 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MOD_in_term1838 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1846 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_AMPERSAND_in_term1853 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1860 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_IDENT_in_factor1882 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_factor1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_factor1908 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_factor1912 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_factor1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor1922 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_factor1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleann1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleann1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector2002 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector2004 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_SQROPEN_in_selector2014 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_selector2016 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_selector2018 = new BitSet(new long[]{0x0000000000420002L});

}