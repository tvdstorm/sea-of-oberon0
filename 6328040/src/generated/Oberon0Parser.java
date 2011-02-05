// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g 2011-02-05 16:09:12
package generated; 

import java.util.HashMap;

import oberon0.ast.expressions.*;
import oberon0.ast.expressions.logical.*;
import oberon0.ast.expressions.arithmetic.*;
import oberon0.ast.expressions.relational.*;
import oberon0.ast.variables.*;
import oberon0.ast.variables.selectors.*;
import oberon0.ast.declarations.*;
import oberon0.ast.routines.*;
import oberon0.ast.routines.parameters.*;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:84:1: module returns [ ICallable node ] : MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF ;
    public final ICallable module() throws RecognitionException {
        ICallable node = null;

        Token name=null;
        IDeclarable decl = null;

        IExecutable mbody = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:84:34: ( MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:85:2: MODULE name= IDENT SEMICOLON decl= declarations mbody= body IDENT DOT EOF
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:90:1: body returns [ IExecutable node ] : BEGIN stat1= statement ( SEMICOLON statx= statement )* END ;
    public final IExecutable body() throws RecognitionException {
        IExecutable node = null;

        IExecutable stat1 = null;

        IExecutable statx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:91:2: ( BEGIN stat1= statement ( SEMICOLON statx= statement )* END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:91:4: BEGIN stat1= statement ( SEMICOLON statx= statement )* END
            {
            match(input,BEGIN,FOLLOW_BEGIN_in_body503); 
            ArrayList<IExecutable> list = 
            						new ArrayList<IExecutable>();	
            pushFollow(FOLLOW_statement_in_body515);
            stat1=statement();

            state._fsp--;

            list.add(stat1);			
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:94:2: ( SEMICOLON statx= statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SEMICOLON) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:94:3: SEMICOLON statx= statement
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:100:1: declarations returns [ IDeclarable node ] : (constdecl= constDeclarations )? (typdecl= typeDeclarations )? (vardecl= varDeclarations )? (proc= procedureDeclaration SEMICOLON )* ;
    public final IDeclarable declarations() throws RecognitionException {
        IDeclarable node = null;

        IDeclarable constdecl = null;

        IDeclarable typdecl = null;

        IDeclarable vardecl = null;

        IDeclarable proc = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:101:2: ( (constdecl= constDeclarations )? (typdecl= typeDeclarations )? (vardecl= varDeclarations )? (proc= procedureDeclaration SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:101:8: (constdecl= constDeclarations )? (typdecl= typeDeclarations )? (vardecl= varDeclarations )? (proc= procedureDeclaration SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:103:2: (constdecl= constDeclarations )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CONST) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:103:3: constdecl= constDeclarations
                    {
                    pushFollow(FOLLOW_constDeclarations_in_declarations574);
                    constdecl=constDeclarations();

                    state._fsp--;

                    list.add(constdecl);		

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:105:2: (typdecl= typeDeclarations )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==TYPEDECL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:105:3: typdecl= typeDeclarations
                    {
                    pushFollow(FOLLOW_typeDeclarations_in_declarations589);
                    typdecl=typeDeclarations();

                    state._fsp--;

                    list.add(typdecl);		

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:107:2: (vardecl= varDeclarations )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==VAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:107:3: vardecl= varDeclarations
                    {
                    pushFollow(FOLLOW_varDeclarations_in_declarations604);
                    vardecl=varDeclarations();

                    state._fsp--;

                    list.add(vardecl);		

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:109:2: (proc= procedureDeclaration SEMICOLON )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==PROCEDURE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:109:3: proc= procedureDeclaration SEMICOLON
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations620);
            	    proc=procedureDeclaration();

            	    state._fsp--;

            	    list.add(proc);			
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_declarations626); 

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
    // $ANTLR end "declarations"


    // $ANTLR start "constDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:114:1: constDeclarations returns [ IDeclarable node] : CONST (name= IDENT EQUALS exp= expression SEMICOLON )* ;
    public final IDeclarable constDeclarations() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:115:2: ( CONST (name= IDENT EQUALS exp= expression SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:115:8: CONST (name= IDENT EQUALS exp= expression SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();				
            match(input,CONST,FOLLOW_CONST_in_constDeclarations661); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:118:2: (name= IDENT EQUALS exp= expression SEMICOLON )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==IDENT) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==EQUALS) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:118:3: name= IDENT EQUALS exp= expression SEMICOLON
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_constDeclarations673); 
            	    match(input,EQUALS,FOLLOW_EQUALS_in_constDeclarations678); 
            	    pushFollow(FOLLOW_expression_in_constDeclarations687);
            	    exp=expression();

            	    state._fsp--;

            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_constDeclarations696); 
            	    list.add(new ConstDeclarationNode((name!=null?name.getText():null), exp));	

            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "typeDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:125:1: typeDeclarations returns [ IDeclarable node ] : ( TYPEDECL (name= IDENT EQUALS typ= type SEMICOLON )* ) ;
    public final IDeclarable typeDeclarations() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        IEvaluable typ = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:126:2: ( ( TYPEDECL (name= IDENT EQUALS typ= type SEMICOLON )* ) )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:126:7: ( TYPEDECL (name= IDENT EQUALS typ= type SEMICOLON )* )
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:128:2: ( TYPEDECL (name= IDENT EQUALS typ= type SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:128:3: TYPEDECL (name= IDENT EQUALS typ= type SEMICOLON )*
            {
            match(input,TYPEDECL,FOLLOW_TYPEDECL_in_typeDeclarations732); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:129:2: (name= IDENT EQUALS typ= type SEMICOLON )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENT) ) {
                    int LA7_2 = input.LA(2);

                    if ( (LA7_2==EQUALS) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:129:3: name= IDENT EQUALS typ= type SEMICOLON
            	    {
            	    name=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclarations744); 
            	    match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations751); 
            	    pushFollow(FOLLOW_type_in_typeDeclarations759);
            	    typ=type();

            	    state._fsp--;

            	    list.add(new TypeDeclarationNode((name!=null?name.getText():null), typ));	
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_typeDeclarations767); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "typeDeclarations"


    // $ANTLR start "varDeclarations"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:137:1: varDeclarations returns [ IDeclarable node ] : VAR (names= identList COLON typ= type SEMICOLON )* ;
    public final IDeclarable varDeclarations() throws RecognitionException {
        IDeclarable node = null;

        ArrayList<String> names = null;

        IEvaluable typ = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:138:2: ( VAR (names= identList COLON typ= type SEMICOLON )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:138:8: VAR (names= identList COLON typ= type SEMICOLON )*
            {
            ArrayList<IDeclarable> list = 
            						 new ArrayList<IDeclarable>();				
            match(input,VAR,FOLLOW_VAR_in_varDeclarations801); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:140:6: (names= identList COLON typ= type SEMICOLON )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==IDENT) ) {
                    int LA8_2 = input.LA(2);

                    if ( ((LA8_2>=COMMA && LA8_2<=COLON)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:140:7: names= identList COLON typ= type SEMICOLON
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclarations808);
            	    names=identList();

            	    state._fsp--;

            	    match(input,COLON,FOLLOW_COLON_in_varDeclarations812); 
            	    pushFollow(FOLLOW_type_in_varDeclarations818);
            	    typ=type();

            	    state._fsp--;

            	    list.add(new VarDeclarationNode(names, typ));	
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_varDeclarations825); 
            	    node = new DeclarationsNode(list);				

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
    // $ANTLR end "varDeclarations"


    // $ANTLR start "identList"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:146:1: identList returns [ ArrayList<String> list] : ident1= IDENT ( COMMA ident2= IDENT )* ;
    public final ArrayList<String> identList() throws RecognitionException {
        ArrayList<String> list = null;

        Token ident1=null;
        Token ident2=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:147:2: (ident1= IDENT ( COMMA ident2= IDENT )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:147:7: ident1= IDENT ( COMMA ident2= IDENT )*
            {
            list =	 new ArrayList<String>();	
            ident1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList861); 
            list.add((ident1!=null?ident1.getText():null));		
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:149:2: ( COMMA ident2= IDENT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:149:3: COMMA ident2= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_identList870); 
            	    ident2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList875); 
            	    list.add((ident2!=null?ident2.getText():null));		

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:153:1: procedureDeclaration returns [ IDeclarable node ] : PROCEDURE name= IDENT (fp= formalParameters )? SEMICOLON decl= declarations (bod= body )? IDENT ;
    public final IDeclarable procedureDeclaration() throws RecognitionException {
        IDeclarable node = null;

        Token name=null;
        ArrayList<IFormalParameter> fp = null;

        IDeclarable decl = null;

        IExecutable bod = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:154:2: ( PROCEDURE name= IDENT (fp= formalParameters )? SEMICOLON decl= declarations (bod= body )? IDENT )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:154:4: PROCEDURE name= IDENT (fp= formalParameters )? SEMICOLON decl= declarations (bod= body )? IDENT
            {
            match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration898); 
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration904); 
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:155:2: (fp= formalParameters )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RNDOPEN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:155:4: fp= formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureDeclaration914);
                    fp=formalParameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_procedureDeclaration922); 
            pushFollow(FOLLOW_declarations_in_procedureDeclaration930);
            decl=declarations();

            state._fsp--;

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:159:2: (bod= body )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BEGIN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:159:4: bod= body
                    {
                    pushFollow(FOLLOW_body_in_procedureDeclaration940);
                    bod=body();

                    state._fsp--;


                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_procedureDeclaration946); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:163:1: formalParameters returns [ ArrayList<IFormalParameter> list ] : RNDOPEN (fp1= fpSection ( SEMICOLON fpx= fpSection )* )? RNDCLOSE ;
    public final ArrayList<IFormalParameter> formalParameters() throws RecognitionException {
        ArrayList<IFormalParameter> list = null;

        IFormalParameter fp1 = null;

        IFormalParameter fpx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:164:2: ( RNDOPEN (fp1= fpSection ( SEMICOLON fpx= fpSection )* )? RNDCLOSE )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:164:3: RNDOPEN (fp1= fpSection ( SEMICOLON fpx= fpSection )* )? RNDCLOSE
            {
            match(input,RNDOPEN,FOLLOW_RNDOPEN_in_formalParameters964); 
            list = new ArrayList<IFormalParameter>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:165:2: (fp1= fpSection ( SEMICOLON fpx= fpSection )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==VAR||LA13_0==IDENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:165:3: fp1= fpSection ( SEMICOLON fpx= fpSection )*
                    {
                    pushFollow(FOLLOW_fpSection_in_formalParameters975);
                    fp1=fpSection();

                    state._fsp--;

                    list.add(fp1);				
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:166:2: ( SEMICOLON fpx= fpSection )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==SEMICOLON) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:166:3: SEMICOLON fpx= fpSection
                    	    {
                    	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_formalParameters982); 
                    	    pushFollow(FOLLOW_fpSection_in_formalParameters989);
                    	    fpx=fpSection();

                    	    state._fsp--;

                    	    list.add(fpx);				

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_formalParameters1002); 

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:172:1: fpSection returns [ IFormalParameter node ] : (l1= identList COLON t1= type | VAR l2= identList COLON t2= type );
    public final IFormalParameter fpSection() throws RecognitionException {
        IFormalParameter node = null;

        ArrayList<String> l1 = null;

        IEvaluable t1 = null;

        ArrayList<String> l2 = null;

        IEvaluable t2 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:173:2: (l1= identList COLON t1= type | VAR l2= identList COLON t2= type )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IDENT) ) {
                alt14=1;
            }
            else if ( (LA14_0==VAR) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:173:3: l1= identList COLON t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fpSection1022);
                    l1=identList();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_fpSection1026); 
                    pushFollow(FOLLOW_type_in_fpSection1034);
                    t1=type();

                    state._fsp--;

                    node = new FPVarNode(l1, t1);	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:176:3: VAR l2= identList COLON t2= type
                    {
                    match(input,VAR,FOLLOW_VAR_in_fpSection1041); 
                    pushFollow(FOLLOW_identList_in_fpSection1049);
                    l2=identList();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_fpSection1052); 
                    pushFollow(FOLLOW_type_in_fpSection1060);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:184:1: statement returns [ IExecutable node ] : (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )? ;
    public final IExecutable statement() throws RecognitionException {
        IExecutable node = null;

        IExecutable ass = null;

        IExecutable proc = null;

        IExecutable ifs = null;

        IExecutable whil = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:185:2: ( (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:185:3: (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )?
            {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:185:3: (ass= assignment | proc= procedureCall | ifs= ifStatement | whil= whileStatement )?
            int alt15=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==DOT||LA15_1==SQROPEN||LA15_1==ASSIGNMENT) ) {
                        alt15=1;
                    }
                    else if ( (LA15_1==RNDOPEN||(LA15_1>=SEMICOLON && LA15_1<=ELSIF)) ) {
                        alt15=2;
                    }
                    }
                    break;
                case IF:
                    {
                    alt15=3;
                    }
                    break;
                case WHILE:
                    {
                    alt15=4;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:185:4: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1084);
                    ass=assignment();

                    state._fsp--;

                    node = ass;	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:186:4: proc= procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1098);
                    proc=procedureCall();

                    state._fsp--;

                    node = proc;	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:187:4: ifs= ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1111);
                    ifs=ifStatement();

                    state._fsp--;

                    node = ifs;	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:188:4: whil= whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1125);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:191:1: procedureCall returns [ IExecutable node ] : name= IDENT ap= actualParameters ;
    public final IExecutable procedureCall() throws RecognitionException {
        IExecutable node = null;

        Token name=null;
        ArrayList<IReferable> ap = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:192:2: (name= IDENT ap= actualParameters )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:192:4: name= IDENT ap= actualParameters
            {
            name=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall1149); 
            pushFollow(FOLLOW_actualParameters_in_procedureCall1158);
            ap=actualParameters();

            state._fsp--;

            node = new ProcedureCallNode((name!=null?name.getText():null), ap);	

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:197:1: actualParameters returns [ ArrayList<IReferable> list] : ( RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE )? ;
    public final ArrayList<IReferable> actualParameters() throws RecognitionException {
        ArrayList<IReferable> list = null;

        IEvaluable exp1 = null;

        IEvaluable expx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:198:2: ( ( RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:198:7: ( RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE )?
            {
            list = new ArrayList<IReferable>();		
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:199:2: ( RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RNDOPEN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:199:3: RNDOPEN (exp1= expression ( COMMA expx= expression )* )? RNDCLOSE
                    {
                    match(input,RNDOPEN,FOLLOW_RNDOPEN_in_actualParameters1187); 
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:200:2: (exp1= expression ( COMMA expx= expression )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=ADD && LA17_0<=SUBTRACT)||LA17_0==RNDOPEN||LA17_0==TILDE||(LA17_0>=IDENT && LA17_0<=INTEGER)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:200:3: exp1= expression ( COMMA expx= expression )*
                            {
                            pushFollow(FOLLOW_expression_in_actualParameters1199);
                            exp1=expression();

                            state._fsp--;

                            list.add(new ActualParamNode(exp1));	
                            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:201:2: ( COMMA expx= expression )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==COMMA) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:201:3: COMMA expx= expression
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_actualParameters1207); 
                            	    pushFollow(FOLLOW_expression_in_actualParameters1215);
                            	    expx=expression();

                            	    state._fsp--;

                            	    list.add(new ActualParamNode(expx));	

                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_actualParameters1230); 

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
        return list;
    }
    // $ANTLR end "actualParameters"


    // $ANTLR start "statementSequence"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:209:1: statementSequence returns [ IExecutable node ] : stat1= statement ( SEMICOLON statx= statement )* ;
    public final IExecutable statementSequence() throws RecognitionException {
        IExecutable node = null;

        IExecutable stat1 = null;

        IExecutable statx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:210:2: (stat1= statement ( SEMICOLON statx= statement )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:210:8: stat1= statement ( SEMICOLON statx= statement )*
            {
             ArrayList<IExecutable> list = 
            							new  ArrayList<IExecutable>();	
            pushFollow(FOLLOW_statement_in_statementSequence1259);
            stat1=statement();

            state._fsp--;

            list.add(stat1);				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:213:2: ( SEMICOLON statx= statement )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==SEMICOLON) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:213:3: SEMICOLON statx= statement
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statementSequence1266); 
            	    pushFollow(FOLLOW_statement_in_statementSequence1274);
            	    statx=statement();

            	    state._fsp--;

            	    list.add(statx);				

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:218:1: ifStatement returns [ IExecutable node ] : IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END ;
    public final IExecutable ifStatement() throws RecognitionException {
        IExecutable node = null;

        IEvaluable ifcond = null;

        IExecutable ifbody = null;

        IEvaluable elsifcond = null;

        IExecutable elsifbody = null;

        IExecutable elsebody = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:219:2: ( IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:220:2: IF ifcond= expression THEN ifbody= statementSequence ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )* ( ELSE elsebody= statementSequence )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1305); 
            pushFollow(FOLLOW_expression_in_ifStatement1314);
            ifcond=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement1319); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1328);
            ifbody=statementSequence();

            state._fsp--;

            ArrayList<IEvaluable> condlist = new ArrayList<IEvaluable>();	
            ArrayList<IExecutable> bodylist = new ArrayList<IExecutable>();
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:225:2: ( ELSIF elsifcond= expression THEN elsifbody= statementSequence )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ELSIF) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:225:3: ELSIF elsifcond= expression THEN elsifbody= statementSequence
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifStatement1343); 
            	    pushFollow(FOLLOW_expression_in_ifStatement1356);
            	    elsifcond=expression();

            	    state._fsp--;

            	    condlist.add(elsifcond);					
            	    match(input,THEN,FOLLOW_THEN_in_ifStatement1367); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement1375);
            	    elsifbody=statementSequence();

            	    state._fsp--;

            	    bodylist.add(elsifbody);					

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:230:2: ( ELSE elsebody= statementSequence )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ELSE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:230:3: ELSE elsebody= statementSequence
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1386); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement1395);
                    elsebody=statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1401); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:237:1: whileStatement returns [ IExecutable node ] : WHILE cond= expression DO stats= statementSequence END ;
    public final IExecutable whileStatement() throws RecognitionException {
        IExecutable node = null;

        IEvaluable cond = null;

        IExecutable stats = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:238:2: ( WHILE cond= expression DO stats= statementSequence END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:238:4: WHILE cond= expression DO stats= statementSequence END
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement1423); 
            pushFollow(FOLLOW_expression_in_whileStatement1429);
            cond=expression();

            state._fsp--;

            match(input,DO,FOLLOW_DO_in_whileStatement1433); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1439);
            stats=statementSequence();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1443); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:243:1: assignment returns [ IExecutable node ] : ident= IDENT selec= selector ASSIGNMENT exp= expression ;
    public final IExecutable assignment() throws RecognitionException {
        IExecutable node = null;

        Token ident=null;
        ISelector selec = null;

        IEvaluable exp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:244:2: (ident= IDENT selec= selector ASSIGNMENT exp= expression )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:244:3: ident= IDENT selec= selector ASSIGNMENT exp= expression
            {
            ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1465); 
            pushFollow(FOLLOW_selector_in_assignment1469);
            selec=selector();

            state._fsp--;

            match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_assignment1473); 
            pushFollow(FOLLOW_expression_in_assignment1481);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:250:1: type returns [ IEvaluable node ] : (ident= IDENT | ARRAY exp= expression OF typ= type | rec= recordType );
    public final IEvaluable type() throws RecognitionException {
        IEvaluable node = null;

        Token ident=null;
        IEvaluable exp = null;

        IEvaluable typ = null;

        HashMap<String, IEvaluable> rec = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:251:2: (ident= IDENT | ARRAY exp= expression OF typ= type | rec= recordType )
            int alt22=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt22=1;
                }
                break;
            case ARRAY:
                {
                alt22=2;
                }
                break;
            case RECORD:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:251:4: ident= IDENT
                    {
                    ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_type1505); 
                    node = new TypeNode((ident!=null?ident.getText():null));			

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:252:3: ARRAY exp= expression OF typ= type
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_type1513); 
                    pushFollow(FOLLOW_expression_in_type1519);
                    exp=expression();

                    state._fsp--;

                    match(input,OF,FOLLOW_OF_in_type1524); 
                    pushFollow(FOLLOW_type_in_type1530);
                    typ=type();

                    state._fsp--;

                    node = new ArrayTypeNode(exp, typ);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:254:4: rec= recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type1542);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:259:1: recordType returns [ HashMap<String, IEvaluable> fields ] : RECORD (ident1= identList COLON typ1= type )? ( SEMICOLON (identx= identList COLON typx= type )? )* END ;
    public final HashMap<String, IEvaluable> recordType() throws RecognitionException {
        HashMap<String, IEvaluable> fields = null;

        ArrayList<String> ident1 = null;

        IEvaluable typ1 = null;

        ArrayList<String> identx = null;

        IEvaluable typx = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:260:2: ( RECORD (ident1= identList COLON typ1= type )? ( SEMICOLON (identx= identList COLON typx= type )? )* END )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:260:4: RECORD (ident1= identList COLON typ1= type )? ( SEMICOLON (identx= identList COLON typx= type )? )* END
            {
            match(input,RECORD,FOLLOW_RECORD_in_recordType1563); 
            fields = new HashMap<String, IEvaluable>();	
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:261:2: (ident1= identList COLON typ1= type )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:261:4: ident1= identList COLON typ1= type
                    {
                    pushFollow(FOLLOW_identList_in_recordType1578);
                    ident1=identList();

                    state._fsp--;

                    match(input,COLON,FOLLOW_COLON_in_recordType1582); 
                    pushFollow(FOLLOW_type_in_recordType1590);
                    typ1=type();

                    state._fsp--;

                    for (String ident: ident1) 
                    						fields.put(ident, typ1);

                    }
                    break;

            }

            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:266:2: ( SEMICOLON (identx= identList COLON typx= type )? )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==SEMICOLON) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:266:3: SEMICOLON (identx= identList COLON typx= type )?
            	    {
            	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_recordType1602); 
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:267:2: (identx= identList COLON typx= type )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==IDENT) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:267:4: identx= identList COLON typx= type
            	            {
            	            pushFollow(FOLLOW_identList_in_recordType1612);
            	            identx=identList();

            	            state._fsp--;

            	            match(input,COLON,FOLLOW_COLON_in_recordType1616); 
            	            pushFollow(FOLLOW_type_in_recordType1624);
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
            	    break loop25;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_recordType1640); 

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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:277:1: expression returns [ IEvaluable node ] : lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? ;
    public final IEvaluable expression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsExp = null;

        IEvaluable rhsExp = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:278:2: (lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )? )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:278:4: lhsExp= simpleExpression ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1661);
            lhsExp=simpleExpression();

            state._fsp--;

            node = lhsExp; 					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:279:2: ( EQUALS rhsExp= simpleExpression | HASH rhsExp= simpleExpression | SMALLERTHEN rhsExp= simpleExpression | SMALLEREQUAL rhsExp= simpleExpression | GREATERTHEN rhsExp= simpleExpression | GREATEREQUAL rhsExp= simpleExpression )?
            int alt26=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt26=1;
                    }
                    break;
                case HASH:
                    {
                    alt26=2;
                    }
                    break;
                case SMALLERTHEN:
                    {
                    alt26=3;
                    }
                    break;
                case SMALLEREQUAL:
                    {
                    alt26=4;
                    }
                    break;
                case GREATERTHEN:
                    {
                    alt26=5;
                    }
                    break;
                case GREATEREQUAL:
                    {
                    alt26=6;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:279:4: EQUALS rhsExp= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1672); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1679);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNode(node, rhsExp);		

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:280:4: HASH rhsExp= simpleExpression
                    {
                    match(input,HASH,FOLLOW_HASH_in_expression1686); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1693);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new EqualsNotNode(node, rhsExp);	

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:281:4: SMALLERTHEN rhsExp= simpleExpression
                    {
                    match(input,SMALLERTHEN,FOLLOW_SMALLERTHEN_in_expression1700); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1706);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerThenNode(node, rhsExp);	

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:282:4: SMALLEREQUAL rhsExp= simpleExpression
                    {
                    match(input,SMALLEREQUAL,FOLLOW_SMALLEREQUAL_in_expression1713); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1719);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new SmallerEqualNode(node, rhsExp);	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:283:4: GREATERTHEN rhsExp= simpleExpression
                    {
                    match(input,GREATERTHEN,FOLLOW_GREATERTHEN_in_expression1726); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1732);
                    rhsExp=simpleExpression();

                    state._fsp--;

                    node = new GreaterThenNode(node, rhsExp);	

                    }
                    break;
                case 6 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:284:4: GREATEREQUAL rhsExp= simpleExpression
                    {
                    match(input,GREATEREQUAL,FOLLOW_GREATEREQUAL_in_expression1739); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1745);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:287:1: simpleExpression returns [ IEvaluable node ] : ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* ;
    public final IEvaluable simpleExpression() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsTerm = null;

        IEvaluable rhsTerm = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:288:2: ( ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:288:8: ( ADD | SUBTRACT )? lhsTerm= term ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            {
             Boolean minus = false; 				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:289:2: ( ADD | SUBTRACT )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ADD) ) {
                alt27=1;
            }
            else if ( (LA27_0==SUBTRACT) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:289:3: ADD
                    {
                    match(input,ADD,FOLLOW_ADD_in_simpleExpression1772); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:290:4: SUBTRACT
                    {
                    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression1778); 
                     minus = true;						

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression1796);
            lhsTerm=term();

            state._fsp--;

            node = lhsTerm;					
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:293:2: ( ADD rhsTerm= term | SUBTRACT rhsTerm= term | OR term rhsTerm= term )*
            loop28:
            do {
                int alt28=4;
                switch ( input.LA(1) ) {
                case ADD:
                    {
                    alt28=1;
                    }
                    break;
                case SUBTRACT:
                    {
                    alt28=2;
                    }
                    break;
                case OR:
                    {
                    alt28=3;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:293:3: ADD rhsTerm= term
            	    {
            	    match(input,ADD,FOLLOW_ADD_in_simpleExpression1805); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1813);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new AddNode(node, rhsTerm);		

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:294:4: SUBTRACT rhsTerm= term
            	    {
            	    match(input,SUBTRACT,FOLLOW_SUBTRACT_in_simpleExpression1821); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1828);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new SubtractNode(node, rhsTerm);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:295:4: OR term rhsTerm= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_simpleExpression1836); 
            	    pushFollow(FOLLOW_term_in_simpleExpression1838);
            	    term();

            	    state._fsp--;

            	    pushFollow(FOLLOW_term_in_simpleExpression1845);
            	    rhsTerm=term();

            	    state._fsp--;

            	    node = new DisjunctionNode(node, rhsTerm);	

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:300:1: term returns [ IEvaluable node ] : lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* ;
    public final IEvaluable term() throws RecognitionException {
        IEvaluable node = null;

        IEvaluable lhsFactor = null;

        IEvaluable rhsFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:301:2: (lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:302:2: lhsFactor= factor ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            {
            pushFollow(FOLLOW_factor_in_term1884);
            lhsFactor=factor();

            state._fsp--;

            node = lhsFactor;				
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:303:2: ( MULTIPLY rhsFactor= factor | DIVIDE rhsFactor= factor | MOD rhsFactor= factor | AMPERSAND rhsFactor= factor )*
            loop29:
            do {
                int alt29=5;
                switch ( input.LA(1) ) {
                case MULTIPLY:
                    {
                    alt29=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt29=2;
                    }
                    break;
                case MOD:
                    {
                    alt29=3;
                    }
                    break;
                case AMPERSAND:
                    {
                    alt29=4;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:303:4: MULTIPLY rhsFactor= factor
            	    {
            	    match(input,MULTIPLY,FOLLOW_MULTIPLY_in_term1894); 
            	    pushFollow(FOLLOW_factor_in_term1901);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new MultiplyNode(node, rhsFactor);	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:304:4: DIVIDE rhsFactor= factor
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_term1908); 
            	    pushFollow(FOLLOW_factor_in_term1915);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new DivideNode(node, rhsFactor);	

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:305:4: MOD rhsFactor= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term1922); 
            	    pushFollow(FOLLOW_factor_in_term1930);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ModuloNode(node, rhsFactor);	

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:306:4: AMPERSAND rhsFactor= factor
            	    {
            	    match(input,AMPERSAND,FOLLOW_AMPERSAND_in_term1937); 
            	    pushFollow(FOLLOW_factor_in_term1944);
            	    rhsFactor=factor();

            	    state._fsp--;

            	    node = new ConjunctionNode(node, rhsFactor);	

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
        return node;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:309:1: factor returns [ IEvaluable node ] : (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor );
    public final IEvaluable factor() throws RecognitionException {
        IEvaluable node = null;

        Token ident=null;
        ISelector selec = null;

        IntegerNode num = null;

        IEvaluable exp = null;

        IEvaluable nFactor = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:310:2: (ident= IDENT selec= selector | num= number | RNDOPEN exp= expression RNDCLOSE | TILDE nFactor= factor )
            int alt30=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt30=1;
                }
                break;
            case INTEGER:
                {
                alt30=2;
                }
                break;
            case RNDOPEN:
                {
                alt30=3;
                }
                break;
            case TILDE:
                {
                alt30=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:310:4: ident= IDENT selec= selector
                    {
                    ident=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1966); 
                    pushFollow(FOLLOW_selector_in_factor1970);
                    selec=selector();

                    state._fsp--;

                     node = new VariableNode((ident!=null?ident.getText():null), selec);	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:311:4: num= number
                    {
                    pushFollow(FOLLOW_number_in_factor1981);
                    num=number();

                    state._fsp--;

                     node = num;			 		

                    }
                    break;
                case 3 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:312:4: RNDOPEN exp= expression RNDCLOSE
                    {
                    match(input,RNDOPEN,FOLLOW_RNDOPEN_in_factor1992); 
                    pushFollow(FOLLOW_expression_in_factor1996);
                    exp=expression();

                    state._fsp--;

                    match(input,RNDCLOSE,FOLLOW_RNDCLOSE_in_factor1998); 
                     node = exp;		 	 		

                    }
                    break;
                case 4 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:313:4: TILDE nFactor= factor
                    {
                    match(input,TILDE,FOLLOW_TILDE_in_factor2006); 
                    pushFollow(FOLLOW_factor_in_factor2010);
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:316:1: number returns [ IntegerNode node ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode node = null;

        Token INTEGER1=null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:317:2: ( INTEGER )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:317:4: INTEGER
            {
            INTEGER1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number2029); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:320:1: booleann returns [ IEvaluable node ] : ( FALSE | TRUE );
    public final IEvaluable booleann() throws RecognitionException {
        IEvaluable node = null;

        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:321:2: ( FALSE | TRUE )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FALSE) ) {
                alt31=1;
            }
            else if ( (LA31_0==TRUE) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:321:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_booleann2048); 
                     node = new BooleanNode ( false); 	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:322:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_booleann2058); 
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
    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:325:1: selector returns [ ISelector node ] : ( DOT IDENT | SQROPEN expression SQRCLOSE )* ;
    public final ISelector selector() throws RecognitionException {
        ISelector node = null;

        Token IDENT2=null;
        IEvaluable expression3 = null;


        try {
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:326:2: ( ( DOT IDENT | SQROPEN expression SQRCLOSE )* )
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:326:8: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            {
            ArrayList<ISelector> list = 
            						 new ArrayList<ISelector>();			
            // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:328:2: ( DOT IDENT | SQROPEN expression SQRCLOSE )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==DOT) ) {
                    alt32=1;
                }
                else if ( (LA32_0==SQROPEN) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:328:3: DOT IDENT
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_selector2086); 
            	    IDENT2=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector2088); 
            	    list.add(new SelectorRecordNode ( (IDENT2!=null?IDENT2.getText():null) ) );	

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Lennart\\SCHOOL\\Software Construction\\workspace\\Oberon0Interpreter\\src\\Oberon0.g:329:4: SQROPEN expression SQRCLOSE
            	    {
            	    match(input,SQROPEN,FOLLOW_SQROPEN_in_selector2098); 
            	    pushFollow(FOLLOW_expression_in_selector2100);
            	    expression3=expression();

            	    state._fsp--;

            	    match(input,SQRCLOSE,FOLLOW_SQRCLOSE_in_selector2102); 
            	    list.add(new SelectorArrayNode ( expression3 ) );	

            	    }
            	    break;

            	default :
            	    break loop32;
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
    public static final BitSet FOLLOW_SEMICOLON_in_module464 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_declarations_in_module472 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_body_in_module480 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_module482 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOT_in_module484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_module486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_body503 = new BitSet(new long[]{0x0080000660000000L});
    public static final BitSet FOLLOW_statement_in_body515 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_body523 = new BitSet(new long[]{0x0080000660000000L});
    public static final BitSet FOLLOW_statement_in_body531 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_body541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclarations_in_declarations574 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations589 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations604 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations620 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_declarations626 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclarations661 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constDeclarations673 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_constDeclarations678 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_constDeclarations687 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_constDeclarations696 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_TYPEDECL_in_typeDeclarations732 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclarations744 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations751 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_typeDeclarations759 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_typeDeclarations767 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclarations801 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations808 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_varDeclarations812 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_varDeclarations818 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_varDeclarations825 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList861 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_identList870 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_identList875 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration898 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration904 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclaration914 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_procedureDeclaration922 = new BitSet(new long[]{0x008003E000000000L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration930 = new BitSet(new long[]{0x008003E000000000L});
    public static final BitSet FOLLOW_body_in_procedureDeclaration940 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclaration946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_formalParameters964 = new BitSet(new long[]{0x0080008000200000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters975 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_SEMICOLON_in_formalParameters982 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_fpSection_in_formalParameters989 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_formalParameters1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fpSection1022 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1026 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_fpSection1041 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_identList_in_fpSection1049 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_fpSection1052 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_fpSection1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall1149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_actualParameters1187 = new BitSet(new long[]{0x0180000008300300L});
    public static final BitSet FOLLOW_expression_in_actualParameters1199 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_COMMA_in_actualParameters1207 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_actualParameters1215 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_actualParameters1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence1259 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_statementSequence1266 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence1274 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1305 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1314 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1319 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1328 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ELSIF_in_ifStatement1343 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_ifStatement1356 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1367 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1375 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1386 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1395 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_ifStatement1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1423 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_whileStatement1429 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1433 = new BitSet(new long[]{0x0080000620000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1439 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_END_in_whileStatement1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1465 = new BitSet(new long[]{0x0000000010420000L});
    public static final BitSet FOLLOW_selector_in_assignment1469 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_assignment1473 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_assignment1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type1513 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_type1519 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_OF_in_type1524 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_type1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType1563 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_identList_in_recordType1578 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_recordType1582 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_recordType1590 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_recordType1602 = new BitSet(new long[]{0x0080000060000000L});
    public static final BitSet FOLLOW_identList_in_recordType1612 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_recordType1616 = new BitSet(new long[]{0x0080001800000000L});
    public static final BitSet FOLLOW_type_in_recordType1624 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_END_in_recordType1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1661 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_EQUALS_in_expression1672 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_expression1686 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLERTHEN_in_expression1700 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SMALLEREQUAL_in_expression1713 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHEN_in_expression1726 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEREQUAL_in_expression1739 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression1772 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression1778 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1796 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_ADD_in_simpleExpression1805 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1813 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_SUBTRACT_in_simpleExpression1821 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1828 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1836 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1838 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_term_in_simpleExpression1845 = new BitSet(new long[]{0x0000000000000702L});
    public static final BitSet FOLLOW_factor_in_term1884 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MULTIPLY_in_term1894 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1901 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_DIVIDE_in_term1908 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1915 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_MOD_in_term1922 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1930 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_AMPERSAND_in_term1937 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_term1944 = new BitSet(new long[]{0x00000000000000F2L});
    public static final BitSet FOLLOW_IDENT_in_factor1966 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_selector_in_factor1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RNDOPEN_in_factor1992 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_factor1996 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_RNDCLOSE_in_factor1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDE_in_factor2006 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_factor_in_factor2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_booleann2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_booleann2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_selector2086 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_IDENT_in_selector2088 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_SQROPEN_in_selector2098 = new BitSet(new long[]{0x0180000008100300L});
    public static final BitSet FOLLOW_expression_in_selector2100 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_SQRCLOSE_in_selector2102 = new BitSet(new long[]{0x0000000000420002L});

}