// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g 2011-02-14 15:55:20

package uva.oberon0.parser;

import uva.oberon0.abstractsyntax.*;
import uva.oberon0.abstractsyntax.declarations.*;
import uva.oberon0.abstractsyntax.expressions.*;
import uva.oberon0.abstractsyntax.statements.*;
import uva.oberon0.abstractsyntax.types.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OberonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "PROCEDURE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "WHILE", "WITH", "BEGIN", "END", "DO", "EQUAL", "UNEQUAL", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "MIN", "PLUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "DECLARATIONS", "INPUTVARS", "CALL", "CALL_READ", "CALL_WRITE", "CALL_WRITELN", "ASSIGN", "INTEGER", "BOOLEAN", "TRUE", "FALSE", "ARRAY", "RECORD", "OF", "ID", "INT", "WHITESPACE", "';'", "'.'", "':'", "'('", "')'", "','", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int MODULE=4;
    public static final int PROCEDURE=5;
    public static final int CONST=6;
    public static final int VAR=7;
    public static final int TYPE=8;
    public static final int IF=9;
    public static final int THEN=10;
    public static final int ELSE=11;
    public static final int ELSIF=12;
    public static final int WHILE=13;
    public static final int WITH=14;
    public static final int BEGIN=15;
    public static final int END=16;
    public static final int DO=17;
    public static final int EQUAL=18;
    public static final int UNEQUAL=19;
    public static final int LESS=20;
    public static final int LESS_EQUAL=21;
    public static final int GREAT=22;
    public static final int GREAT_EQUAL=23;
    public static final int MIN=24;
    public static final int PLUS=25;
    public static final int MUL=26;
    public static final int DIV=27;
    public static final int MOD=28;
    public static final int AND=29;
    public static final int OR=30;
    public static final int NOT=31;
    public static final int DECLARATIONS=32;
    public static final int INPUTVARS=33;
    public static final int CALL=34;
    public static final int CALL_READ=35;
    public static final int CALL_WRITE=36;
    public static final int CALL_WRITELN=37;
    public static final int ASSIGN=38;
    public static final int INTEGER=39;
    public static final int BOOLEAN=40;
    public static final int TRUE=41;
    public static final int FALSE=42;
    public static final int ARRAY=43;
    public static final int RECORD=44;
    public static final int OF=45;
    public static final int ID=46;
    public static final int INT=47;
    public static final int WHITESPACE=48;

    // delegates
    // delegators


        public OberonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OberonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return OberonParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g"; }



    // $ANTLR start "module"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:76:1: module returns [Module node] : MODULE node_id= id ';' node_declarations= declarations BEGIN node_statements= statements END id '.' ;
    public final Module module() throws RecognitionException {
        Module node = null;

        ID node_id = null;

        DeclarationList node_declarations = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:77:2: ( MODULE node_id= id ';' node_declarations= declarations BEGIN node_statements= statements END id '.' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:77:4: MODULE node_id= id ';' node_declarations= declarations BEGIN node_statements= statements END id '.'
            {
            match(input,MODULE,FOLLOW_MODULE_in_module346); 
            pushFollow(FOLLOW_id_in_module350);
            node_id=id();

            state._fsp--;

            match(input,49,FOLLOW_49_in_module352); 
            pushFollow(FOLLOW_declarations_in_module358);
            node_declarations=declarations();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_module362); 
            pushFollow(FOLLOW_statements_in_module368);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_module372); 
            pushFollow(FOLLOW_id_in_module374);
            id();

            state._fsp--;

            match(input,50,FOLLOW_50_in_module376); 
            node = new Module(node_id, node_declarations, node_statements);

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


    // $ANTLR start "declarations"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:83:1: declarations returns [DeclarationList node] : ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )* ;
    public final DeclarationList declarations() throws RecognitionException {
        DeclarationList node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:83:45: ( ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:83:52: ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )*
            {
            node = new DeclarationList();
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:3: ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case CONST:
                    {
                    alt1=1;
                    }
                    break;
                case VAR:
                    {
                    alt1=2;
                    }
                    break;
                case TYPE:
                    {
                    alt1=3;
                    }
                    break;
                case PROCEDURE:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:4: constDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_constDeclaration_in_declarations408);
            	    constDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:27: varDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_declarations411);
            	    varDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:48: typeDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_declarations414);
            	    typeDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:70: procedureDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations417);
            	    procedureDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "declarations"


    // $ANTLR start "constDeclaration"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:87:1: constDeclaration[DeclarationList list] : CONST node_id= id '=' node_exp= expression ';' ;
    public final void constDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        Expression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:88:2: ( CONST node_id= id '=' node_exp= expression ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:88:4: CONST node_id= id '=' node_exp= expression ';'
            {
            match(input,CONST,FOLLOW_CONST_in_constDeclaration434); 
            pushFollow(FOLLOW_id_in_constDeclaration438);
            node_id=id();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_constDeclaration440); 
            pushFollow(FOLLOW_expression_in_constDeclaration444);
            node_exp=expression();

            state._fsp--;

            match(input,49,FOLLOW_49_in_constDeclaration446); 
            list.add(new Constant(node_id, node_exp));

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
    // $ANTLR end "constDeclaration"


    // $ANTLR start "varDeclaration"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:90:1: varDeclaration[DeclarationList list] : VAR (node_ids= idList ':' node_type= type ';' )* ;
    public final void varDeclaration(DeclarationList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:91:2: ( VAR (node_ids= idList ':' node_type= type ';' )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:91:4: VAR (node_ids= idList ':' node_type= type ';' )*
            {
            match(input,VAR,FOLLOW_VAR_in_varDeclaration462); 
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:91:8: (node_ids= idList ':' node_type= type ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:91:9: node_ids= idList ':' node_type= type ';'
            	    {
            	    pushFollow(FOLLOW_idList_in_varDeclaration467);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,51,FOLLOW_51_in_varDeclaration469); 
            	    pushFollow(FOLLOW_type_in_varDeclaration473);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_varDeclaration475); 
            	    for (ID id : node_ids){ list.add(new Variable(id, node_type));}

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
        return ;
    }
    // $ANTLR end "varDeclaration"


    // $ANTLR start "typeDeclaration"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:93:1: typeDeclaration[DeclarationList list] : TYPE node_id= id '=' node_type= type ';' ;
    public final void typeDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:94:2: ( TYPE node_id= id '=' node_type= type ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:94:4: TYPE node_id= id '=' node_type= type ';'
            {
            match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration494); 
            pushFollow(FOLLOW_id_in_typeDeclaration498);
            node_id=id();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_typeDeclaration500); 
            pushFollow(FOLLOW_type_in_typeDeclaration504);
            node_type=type();

            state._fsp--;

            match(input,49,FOLLOW_49_in_typeDeclaration506); 
            list.add(new CustomType(node_id, node_type));

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
    // $ANTLR end "typeDeclaration"


    // $ANTLR start "procedureDeclaration"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:96:1: procedureDeclaration[DeclarationList list] : PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';' ;
    public final void procedureDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        VariableList node_params = null;

        DeclarationList node_declarations = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:97:2: ( PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:97:4: PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';'
            {
            match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration524); 
            pushFollow(FOLLOW_id_in_procedureDeclaration528);
            node_id=id();

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:97:25: ( '(' node_params= procedureParams ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:97:26: '(' node_params= procedureParams ')'
                    {
                    match(input,52,FOLLOW_52_in_procedureDeclaration531); 
                    pushFollow(FOLLOW_procedureParams_in_procedureDeclaration535);
                    node_params=procedureParams();

                    state._fsp--;

                    match(input,53,FOLLOW_53_in_procedureDeclaration537); 

                    }
                    break;

            }

            match(input,49,FOLLOW_49_in_procedureDeclaration541); 
            pushFollow(FOLLOW_declarations_in_procedureDeclaration547);
            node_declarations=declarations();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_procedureDeclaration551); 
            pushFollow(FOLLOW_statements_in_procedureDeclaration557);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_procedureDeclaration561); 
            pushFollow(FOLLOW_id_in_procedureDeclaration563);
            id();

            state._fsp--;

            match(input,49,FOLLOW_49_in_procedureDeclaration565); 
            list.add(new Procedure(node_id, node_params, node_declarations, node_statements));

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
    // $ANTLR end "procedureDeclaration"


    // $ANTLR start "procedureParams"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:103:1: procedureParams returns [VariableList node] : node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* ;
    public final VariableList procedureParams() throws RecognitionException {
        VariableList node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:103:45: (node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:103:52: node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )*
            {
            node = new VariableList();
            pushFollow(FOLLOW_procedureParam_in_procedureParams600);
            procedureParam(node);

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:43: ( ';' node_declaration= procedureParam[node] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==49) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:44: ';' node_declaration= procedureParam[node]
            	    {
            	    match(input,49,FOLLOW_49_in_procedureParams604); 
            	    pushFollow(FOLLOW_procedureParam_in_procedureParams610);
            	    procedureParam(node);

            	    state._fsp--;


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
    // $ANTLR end "procedureParams"


    // $ANTLR start "procedureParam"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:107:1: procedureParam[VariableList list] : ( ( VAR )? node_ids= idList ':' node_type= type )* ;
    public final void procedureParam(VariableList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:2: ( ( ( VAR )? node_ids= idList ':' node_type= type )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:4: ( ( VAR )? node_ids= idList ':' node_type= type )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:4: ( ( VAR )? node_ids= idList ':' node_type= type )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VAR||LA6_0==ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:5: ( VAR )? node_ids= idList ':' node_type= type
            	    {
            	    boolean byRef=false;
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:28: ( VAR )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==VAR) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:29: VAR
            	            {
            	            match(input,VAR,FOLLOW_VAR_in_procedureParam633); 
            	            byRef=true;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_idList_in_procedureParam641);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,51,FOLLOW_51_in_procedureParam643); 
            	    pushFollow(FOLLOW_type_in_procedureParam647);
            	    node_type=type();

            	    state._fsp--;

            	    for (ID id : node_ids){ list.add(new Variable(id, node_type, byRef));}

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
        return ;
    }
    // $ANTLR end "procedureParam"


    // $ANTLR start "procedureCall"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:110:1: procedureCall returns [Call node] : ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) ;
    public final Call procedureCall() throws RecognitionException {
        Call node = null;

        Token ID1=null;
        ExpressionList call_vars = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:111:6: ( ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:111:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:111:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
            int alt11=4;
            switch ( input.LA(1) ) {
            case CALL_READ:
                {
                alt11=1;
                }
                break;
            case CALL_WRITE:
                {
                alt11=2;
                }
                break;
            case CALL_WRITELN:
                {
                alt11=3;
                }
                break;
            case ID:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:112:8: CALL_READ (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_READ,FOLLOW_CALL_READ_in_procedureCall680); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:112:18: (call_vars= procedureActualParams )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==52) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:112:19: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall685);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallRead(call_vars);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:113:9: CALL_WRITE (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITE,FOLLOW_CALL_WRITE_in_procedureCall701); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:113:20: (call_vars= procedureActualParams )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==52) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:113:21: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall706);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWrite(call_vars);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:114:9: CALL_WRITELN (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITELN,FOLLOW_CALL_WRITELN_in_procedureCall722); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:114:22: (call_vars= procedureActualParams )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==52) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:114:23: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall727);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWriteLn(call_vars);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:115:9: ID (call_vars= procedureActualParams )?
                    {
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_procedureCall743); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:115:13: (call_vars= procedureActualParams )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==52) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:115:14: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall749);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallProcedure(call_vars, new ID((ID1!=null?ID1.getText():null)));

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


    // $ANTLR start "procedureActualParams"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:118:1: procedureActualParams returns [ExpressionList node] : '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' ;
    public final ExpressionList procedureActualParams() throws RecognitionException {
        ExpressionList node = null;

        Expression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:119:2: ( '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:119:3: '(' (node_exp= expression ( ',' node_exp= expression )* )? ')'
            {
            match(input,52,FOLLOW_52_in_procedureActualParams775); 
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:119:7: (node_exp= expression ( ',' node_exp= expression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=MIN && LA13_0<=PLUS)||LA13_0==NOT||(LA13_0>=TRUE && LA13_0<=FALSE)||(LA13_0>=ID && LA13_0<=INT)||LA13_0==52) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:119:8: node_exp= expression ( ',' node_exp= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureActualParams780);
                    node_exp=expression();

                    state._fsp--;

                    node =new ExpressionList(); node.add(node_exp);
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:120:3: ( ',' node_exp= expression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==54) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:120:4: ',' node_exp= expression
                    	    {
                    	    match(input,54,FOLLOW_54_in_procedureActualParams795); 
                    	    pushFollow(FOLLOW_expression_in_procedureActualParams799);
                    	    node_exp=expression();

                    	    state._fsp--;

                    	    node.add(node_exp);

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,53,FOLLOW_53_in_procedureActualParams819); 

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
    // $ANTLR end "procedureActualParams"


    // $ANTLR start "type"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:124:1: type returns [BaseType node] : (node_array= arrayType | node_record= recordType | INTEGER | BOOLEAN | ID );
    public final BaseType type() throws RecognitionException {
        BaseType node = null;

        Token ID2=null;
        ArrayType node_array = null;

        RecordType node_record = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:125:2: (node_array= arrayType | node_record= recordType | INTEGER | BOOLEAN | ID )
            int alt14=5;
            switch ( input.LA(1) ) {
            case ARRAY:
                {
                alt14=1;
                }
                break;
            case RECORD:
                {
                alt14=2;
                }
                break;
            case INTEGER:
                {
                alt14=3;
                }
                break;
            case BOOLEAN:
                {
                alt14=4;
                }
                break;
            case ID:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:125:4: node_array= arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type837);
                    node_array=arrayType();

                    state._fsp--;

                    node = node_array;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:126:4: node_record= recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type853);
                    node_record=recordType();

                    state._fsp--;

                    node = node_record;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:127:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_type867); 
                    node = new IntegerType();

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:128:4: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_type883); 
                    node = new BooleanType();

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:129:4: ID
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_type899); 
                    node = new IDType((ID2!=null?ID2.getText():null));

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


    // $ANTLR start "arrayType"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:132:1: arrayType returns [ArrayType node] : ARRAY node_exp= expression OF node_type= type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType node = null;

        Expression node_exp = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:133:2: ( ARRAY node_exp= expression OF node_type= type )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:133:4: ARRAY node_exp= expression OF node_type= type
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_arrayType925); 
            pushFollow(FOLLOW_expression_in_arrayType929);
            node_exp=expression();

            state._fsp--;

            match(input,OF,FOLLOW_OF_in_arrayType931); 
            pushFollow(FOLLOW_type_in_arrayType935);
            node_type=type();

            state._fsp--;

            node = new ArrayType(node_exp, node_type);

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
    // $ANTLR end "arrayType"


    // $ANTLR start "recordType"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:136:1: recordType returns [RecordType node] : RECORD recordField[fields] ( ';' recordField[fields] )* END ;
    public final RecordType recordType() throws RecognitionException {
        RecordType node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:136:38: ( RECORD recordField[fields] ( ';' recordField[fields] )* END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:136:46: RECORD recordField[fields] ( ';' recordField[fields] )* END
            {
            RecordFieldList fields = new RecordFieldList();
            match(input,RECORD,FOLLOW_RECORD_in_recordType964); 
            pushFollow(FOLLOW_recordField_in_recordType968);
            recordField(fields);

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:23: ( ';' recordField[fields] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:24: ';' recordField[fields]
            	    {
            	    match(input,49,FOLLOW_49_in_recordType972); 
            	    pushFollow(FOLLOW_recordField_in_recordType974);
            	    recordField(fields);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_recordType981); 
            node = new RecordType(fields);

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
    // $ANTLR end "recordType"


    // $ANTLR start "recordField"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:142:1: recordField[RecordFieldList list] : (node_ids= idList ':' node_type= type ) ;
    public final void recordField(RecordFieldList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:143:2: ( (node_ids= idList ':' node_type= type ) )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:143:4: (node_ids= idList ':' node_type= type )
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:143:4: (node_ids= idList ':' node_type= type )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:143:5: node_ids= idList ':' node_type= type
            {
            pushFollow(FOLLOW_idList_in_recordField1010);
            node_ids=idList();

            state._fsp--;

            match(input,51,FOLLOW_51_in_recordField1012); 
            pushFollow(FOLLOW_type_in_recordField1016);
            node_type=type();

            state._fsp--;

            for (ID id : node_ids){ list.add(new RecordField(id, node_type));}

            }


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
    // $ANTLR end "recordField"


    // $ANTLR start "factor"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:146:1: factor returns [Expression node] : ( ID idSelector[node_id] | INT | TRUE | FALSE | ( '(' expression ')' ) | ( NOT unary= factor ) );
    public final Expression factor() throws RecognitionException {
        Expression node = null;

        Token ID3=null;
        Token INT4=null;
        Expression unary = null;

        Expression expression5 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:147:2: ( ID idSelector[node_id] | INT | TRUE | FALSE | ( '(' expression ')' ) | ( NOT unary= factor ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt16=1;
                }
                break;
            case INT:
                {
                alt16=2;
                }
                break;
            case TRUE:
                {
                alt16=3;
                }
                break;
            case FALSE:
                {
                alt16=4;
                }
                break;
            case 52:
                {
                alt16=5;
                }
                break;
            case NOT:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:147:7: ID idSelector[node_id]
                    {
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_factor1042); 
                    ID node_id = new ID((ID3!=null?ID3.getText():null)); node = new Reference(node_id);
                    pushFollow(FOLLOW_idSelector_in_factor1059);
                    idSelector(node_id);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:149:5: INT
                    {
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_factor1070); 
                    node = new IntegerValue((INT4!=null?INT4.getText():null));

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:150:5: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_factor1088); 
                    node = new BooleanValue(true);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:151:5: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_factor1106); 
                    node = new BooleanValue(false);

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:152:5: ( '(' expression ')' )
                    {
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:152:5: ( '(' expression ')' )
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:152:6: '(' expression ')'
                    {
                    match(input,52,FOLLOW_52_in_factor1125); 
                    pushFollow(FOLLOW_expression_in_factor1127);
                    expression5=expression();

                    state._fsp--;

                    match(input,53,FOLLOW_53_in_factor1129); 
                    node =expression5;

                    }


                    }
                    break;
                case 6 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:153:5: ( NOT unary= factor )
                    {
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:153:5: ( NOT unary= factor )
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:153:6: NOT unary= factor
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor1147); 
                    pushFollow(FOLLOW_factor_in_factor1151);
                    unary=factor();

                    state._fsp--;

                    node =new Not(unary);

                    }


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


    // $ANTLR start "term"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:156:1: term returns [Expression node] : left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* ;
    public final Expression term() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:157:2: (left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:157:7: left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            {
            pushFollow(FOLLOW_factor_in_term1184);
            left=factor();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:158:2: ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            loop17:
            do {
                int alt17=5;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt17=1;
                    }
                    break;
                case DIV:
                    {
                    alt17=2;
                    }
                    break;
                case MOD:
                    {
                    alt17=3;
                    }
                    break;
                case AND:
                    {
                    alt17=4;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:159:3: MUL right= factor
            	    {
            	    match(input,MUL,FOLLOW_MUL_in_term1202); 
            	    pushFollow(FOLLOW_factor_in_term1206);
            	    right=factor();

            	    state._fsp--;

            	    node =new Multiplication(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:160:4: DIV right= factor
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_term1220); 
            	    pushFollow(FOLLOW_factor_in_term1224);
            	    right=factor();

            	    state._fsp--;

            	    node =new Division(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:161:4: MOD right= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term1238); 
            	    pushFollow(FOLLOW_factor_in_term1242);
            	    right=factor();

            	    state._fsp--;

            	    node =new Modulo(node, right);

            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:162:4: AND right= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term1256); 
            	    pushFollow(FOLLOW_factor_in_term1260);
            	    right=factor();

            	    state._fsp--;

            	    node =new And(node, right);

            	    }
            	    break;

            	default :
            	    break loop17;
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


    // $ANTLR start "base"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:165:1: base returns [Expression node] : ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* ;
    public final Expression base() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:166:6: ( ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:166:11: ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:166:11: ( MIN left= term | PLUS left= term | left= term )
            int alt18=3;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt18=1;
                }
                break;
            case PLUS:
                {
                alt18=2;
                }
                break;
            case NOT:
            case TRUE:
            case FALSE:
            case ID:
            case INT:
            case 52:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:167:7: MIN left= term
                    {
                    match(input,MIN,FOLLOW_MIN_in_base1303); 
                    pushFollow(FOLLOW_term_in_base1307);
                    left=term();

                    state._fsp--;

                    node =new Negative(left);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:168:8: PLUS left= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_base1326); 
                    pushFollow(FOLLOW_term_in_base1330);
                    left=term();

                    state._fsp--;

                    node =new Positive(left);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:169:8: left= term
                    {
                    pushFollow(FOLLOW_term_in_base1351);
                    left=term();

                    state._fsp--;

                    node =left;

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:171:8: ( MIN right= term | PLUS right= term | OR right= term )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case MIN:
                    {
                    alt19=1;
                    }
                    break;
                case PLUS:
                    {
                    alt19=2;
                    }
                    break;
                case OR:
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:172:7: MIN right= term
            	    {
            	    match(input,MIN,FOLLOW_MIN_in_base1386); 
            	    pushFollow(FOLLOW_term_in_base1390);
            	    right=term();

            	    state._fsp--;

            	    node =new Subtraction(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:173:8: PLUS right= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_base1409); 
            	    pushFollow(FOLLOW_term_in_base1413);
            	    right=term();

            	    state._fsp--;

            	    node =new Addition(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:174:8: OR right= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_base1432); 
            	    pushFollow(FOLLOW_term_in_base1436);
            	    right=term();

            	    state._fsp--;

            	    node =new Or(node, right);

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "base"


    // $ANTLR start "expression"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:177:1: expression returns [Expression node] : left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? ;
    public final Expression expression() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:178:6: (left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:178:10: left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            {
            pushFollow(FOLLOW_base_in_expression1478);
            left=base();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:179:6: ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            int alt20=7;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt20=1;
                    }
                    break;
                case UNEQUAL:
                    {
                    alt20=2;
                    }
                    break;
                case LESS:
                    {
                    alt20=3;
                    }
                    break;
                case LESS_EQUAL:
                    {
                    alt20=4;
                    }
                    break;
                case GREAT:
                    {
                    alt20=5;
                    }
                    break;
                case GREAT_EQUAL:
                    {
                    alt20=6;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:180:7: EQUAL right= base
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression1504); 
                    pushFollow(FOLLOW_base_in_expression1508);
                    right=base();

                    state._fsp--;

                    node =new Equal(node, right);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:181:8: UNEQUAL right= base
                    {
                    match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression1526); 
                    pushFollow(FOLLOW_base_in_expression1530);
                    right=base();

                    state._fsp--;

                    node =new NotEqual(node, right);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:182:8: LESS right= base
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression1548); 
                    pushFollow(FOLLOW_base_in_expression1552);
                    right=base();

                    state._fsp--;

                    node =new LessThan(node, right);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:183:8: LESS_EQUAL right= base
                    {
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression1571); 
                    pushFollow(FOLLOW_base_in_expression1575);
                    right=base();

                    state._fsp--;

                    node =new LessThanOrEqualTo(node, right);

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:184:8: GREAT right= base
                    {
                    match(input,GREAT,FOLLOW_GREAT_in_expression1593); 
                    pushFollow(FOLLOW_base_in_expression1597);
                    right=base();

                    state._fsp--;

                    node =new GreatherThan(node, right);

                    }
                    break;
                case 6 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:185:8: GREAT_EQUAL right= base
                    {
                    match(input,GREAT_EQUAL,FOLLOW_GREAT_EQUAL_in_expression1615); 
                    pushFollow(FOLLOW_base_in_expression1619);
                    right=base();

                    state._fsp--;

                    node =new GreatherThanOrEqualTo(node, right);

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


    // $ANTLR start "statements"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:188:1: statements returns [StatementList node] : node_statement= statement ( ';' node_statement= statement )* ;
    public final StatementList statements() throws RecognitionException {
        StatementList node = null;

        Statement node_statement = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:188:41: (node_statement= statement ( ';' node_statement= statement )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:188:48: node_statement= statement ( ';' node_statement= statement )*
            {
            node = new StatementList();
            pushFollow(FOLLOW_statement_in_statements1663);
            node_statement=statement();

            state._fsp--;

            node.add(node_statement);
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:190:3: ( ';' node_statement= statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==49) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:190:4: ';' node_statement= statement
            	    {
            	    match(input,49,FOLLOW_49_in_statements1677); 
            	    pushFollow(FOLLOW_statement_in_statements1681);
            	    node_statement=statement();

            	    state._fsp--;

            	    node.add(node_statement);

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "statements"


    // $ANTLR start "statement"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:193:1: statement returns [Statement node] : ( assignment | procedureCall | ifStatement | whileStatement | withStatement )? ;
    public final Statement statement() throws RecognitionException {
        Statement node = null;

        Assign assignment6 = null;

        Call procedureCall7 = null;

        If ifStatement8 = null;

        While whileStatement9 = null;

        With withStatement10 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:194:5: ( ( assignment | procedureCall | ifStatement | whileStatement | withStatement )? )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:194:7: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:194:7: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )?
            int alt22=6;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==ASSIGN||LA22_1==50||LA22_1==55) ) {
                        alt22=1;
                    }
                    else if ( ((LA22_1>=ELSE && LA22_1<=ELSIF)||LA22_1==END||LA22_1==49||LA22_1==52) ) {
                        alt22=2;
                    }
                    }
                    break;
                case CALL_READ:
                case CALL_WRITE:
                case CALL_WRITELN:
                    {
                    alt22=2;
                    }
                    break;
                case IF:
                    {
                    alt22=3;
                    }
                    break;
                case WHILE:
                    {
                    alt22=4;
                    }
                    break;
                case WITH:
                    {
                    alt22=5;
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:195:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1718);
                    assignment6=assignment();

                    state._fsp--;

                    node = assignment6;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:196:8: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1738);
                    procedureCall7=procedureCall();

                    state._fsp--;

                    node = procedureCall7;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:197:8: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1758);
                    ifStatement8=ifStatement();

                    state._fsp--;

                    node = ifStatement8;

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:198:8: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1778);
                    whileStatement9=whileStatement();

                    state._fsp--;

                    node = whileStatement9;

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:199:8: withStatement
                    {
                    pushFollow(FOLLOW_withStatement_in_statement1798);
                    withStatement10=withStatement();

                    state._fsp--;

                    node = withStatement10;

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:202:1: assignment returns [Assign node] : ID idSelector[node_id] ASSIGN node_expression= expression ;
    public final Assign assignment() throws RecognitionException {
        Assign node = null;

        Token ID11=null;
        Expression node_expression = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:203:2: ( ID idSelector[node_id] ASSIGN node_expression= expression )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:203:4: ID idSelector[node_id] ASSIGN node_expression= expression
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_assignment1840); 
            ID node_id = new ID((ID11!=null?ID11.getText():null));
            pushFollow(FOLLOW_idSelector_in_assignment1857);
            idSelector(node_id);

            state._fsp--;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment1860); 
            pushFollow(FOLLOW_expression_in_assignment1864);
            node_expression=expression();

            state._fsp--;

            node = new Assign(node_id, node_expression);

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


    // $ANTLR start "ifStatement"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:206:1: ifStatement returns [If node] : IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END ;
    public final If ifStatement() throws RecognitionException {
        If node = null;

        Expression node_expression = null;

        StatementList node_statements = null;

        ElsIfList node_elsifs = null;

        StatementList node_else = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:207:6: ( IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:207:11: IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1890); 
            pushFollow(FOLLOW_expression_in_ifStatement1894);
            node_expression=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement1903); 
            pushFollow(FOLLOW_statements_in_ifStatement1907);
            node_statements=statements();

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:209:7: (node_elsifs= ifElsIfList )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:209:8: node_elsifs= ifElsIfList
            {
            pushFollow(FOLLOW_ifElsIfList_in_ifStatement1919);
            node_elsifs=ifElsIfList();

            state._fsp--;


            }

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:210:7: ( ELSE node_else= statements )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:210:8: ELSE node_else= statements
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1930); 
                    pushFollow(FOLLOW_statements_in_ifStatement1934);
                    node_else=statements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1938); 
            node = new If(node_expression, node_statements, node_elsifs, node_else);

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


    // $ANTLR start "ifElsIfList"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:213:1: ifElsIfList returns [ElsIfList node] : ( ELSIF node_expression= expression THEN node_statements= statements )* ;
    public final ElsIfList ifElsIfList() throws RecognitionException {
        ElsIfList node = null;

        Expression node_expression = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:213:38: ( ( ELSIF node_expression= expression THEN node_statements= statements )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:213:45: ( ELSIF node_expression= expression THEN node_statements= statements )*
            {
            node = new ElsIfList();
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:214:3: ( ELSIF node_expression= expression THEN node_statements= statements )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ELSIF) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:215:3: ELSIF node_expression= expression THEN node_statements= statements
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifElsIfList1981); 
            	    pushFollow(FOLLOW_expression_in_ifElsIfList1985);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,THEN,FOLLOW_THEN_in_ifElsIfList1987); 
            	    pushFollow(FOLLOW_statements_in_ifElsIfList1991);
            	    node_statements=statements();

            	    state._fsp--;

            	    node.add(new ElsIf(node_expression, node_statements));

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ifElsIfList"


    // $ANTLR start "whileStatement"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:219:1: whileStatement returns [While node] : WHILE node_expression= expression DO node_statements= statements END ;
    public final While whileStatement() throws RecognitionException {
        While node = null;

        Expression node_expression = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:220:2: ( WHILE node_expression= expression DO node_statements= statements END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:220:4: WHILE node_expression= expression DO node_statements= statements END
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement2018); 
            pushFollow(FOLLOW_expression_in_whileStatement2022);
            node_expression=expression();

            state._fsp--;

            match(input,DO,FOLLOW_DO_in_whileStatement2027); 
            pushFollow(FOLLOW_statements_in_whileStatement2031);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement2036); 
            node = new While(node_expression, node_statements);

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


    // $ANTLR start "withStatement"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:224:1: withStatement returns [With node] : WITH ID idSelector[node_id] DO node_statements= statements END ;
    public final With withStatement() throws RecognitionException {
        With node = null;

        Token ID12=null;
        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:225:2: ( WITH ID idSelector[node_id] DO node_statements= statements END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:225:4: WITH ID idSelector[node_id] DO node_statements= statements END
            {
            match(input,WITH,FOLLOW_WITH_in_withStatement2060); 
            ID12=(Token)match(input,ID,FOLLOW_ID_in_withStatement2062); 
            ID node_id = new ID((ID12!=null?ID12.getText():null));
            pushFollow(FOLLOW_idSelector_in_withStatement2078);
            idSelector(node_id);

            state._fsp--;

            match(input,DO,FOLLOW_DO_in_withStatement2083); 
            pushFollow(FOLLOW_statements_in_withStatement2088);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_withStatement2093); 
            node = new With(node_id, node_statements);

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
    // $ANTLR end "withStatement"


    // $ANTLR start "id"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:230:1: id returns [ID node] : ID ;
    public final ID id() throws RecognitionException {
        ID node = null;

        Token ID13=null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:231:2: ( ID )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:231:4: ID
            {
            ID13=(Token)match(input,ID,FOLLOW_ID_in_id2118); 
            node = new ID((ID13!=null?ID13.getText():null));

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
    // $ANTLR end "id"


    // $ANTLR start "idList"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:233:1: idList returns [IDList node] : node_id1= id ( ',' node_id2= id )* ;
    public final IDList idList() throws RecognitionException {
        IDList node = null;

        ID node_id1 = null;

        ID node_id2 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:233:30: (node_id1= id ( ',' node_id2= id )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:233:39: node_id1= id ( ',' node_id2= id )*
            {
            node = new IDList();
            pushFollow(FOLLOW_id_in_idList2155);
            node_id1=id();

            state._fsp--;

            node.add(node_id1);
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:235:3: ( ',' node_id2= id )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==54) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:235:4: ',' node_id2= id
            	    {
            	    match(input,54,FOLLOW_54_in_idList2171); 
            	    pushFollow(FOLLOW_id_in_idList2175);
            	    node_id2=id();

            	    state._fsp--;

            	    node.add(node_id2);

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "idList"


    // $ANTLR start "idSelector"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:238:1: idSelector[ID node_parent] : ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* ;
    public final void idSelector(ID node_parent) throws RecognitionException {
        Token ID14=null;
        Expression node_expression = null;


        ID node_current = node_parent;
        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:240:6: ( ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:240:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:240:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==50) ) {
                    alt26=1;
                }
                else if ( (LA26_0==55) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:240:12: ( '.' ID )
            	    {
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:240:12: ( '.' ID )
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:240:13: '.' ID
            	    {
            	    match(input,50,FOLLOW_50_in_idSelector2226); 
            	    ID14=(Token)match(input,ID,FOLLOW_ID_in_idSelector2228); 
            	    node_current=(ID)node_current.setSelector(new ID((ID14!=null?ID14.getText():null)));

            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:241:9: ( '[' node_expression= expression ']' )
            	    {
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:241:9: ( '[' node_expression= expression ']' )
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:241:10: '[' node_expression= expression ']'
            	    {
            	    match(input,55,FOLLOW_55_in_idSelector2250); 
            	    pushFollow(FOLLOW_expression_in_idSelector2254);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,56,FOLLOW_56_in_idSelector2256); 
            	    node_current.setSelector(node_expression);

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
        return ;
    }
    // $ANTLR end "idSelector"

    // Delegated rules


 

    public static final BitSet FOLLOW_MODULE_in_module346 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_id_in_module350 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_module352 = new BitSet(new long[]{0x00000000000081E0L});
    public static final BitSet FOLLOW_declarations_in_module358 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BEGIN_in_module362 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statements_in_module368 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_module372 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_id_in_module374 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_module376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations408 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_varDeclaration_in_declarations411 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations414 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations417 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration434 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_id_in_constDeclaration438 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_constDeclaration440 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_constDeclaration444 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_constDeclaration446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration462 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_idList_in_varDeclaration467 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_varDeclaration469 = new BitSet(new long[]{0x0000598000000000L});
    public static final BitSet FOLLOW_type_in_varDeclaration473 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclaration475 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration494 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_id_in_typeDeclaration498 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_typeDeclaration500 = new BitSet(new long[]{0x0000598000000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration504 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_typeDeclaration506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration524 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_id_in_procedureDeclaration528 = new BitSet(new long[]{0x0012000000000000L});
    public static final BitSet FOLLOW_52_in_procedureDeclaration531 = new BitSet(new long[]{0x0002400000000080L});
    public static final BitSet FOLLOW_procedureParams_in_procedureDeclaration535 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_procedureDeclaration537 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureDeclaration541 = new BitSet(new long[]{0x00000000000081E0L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration547 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BEGIN_in_procedureDeclaration551 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statements_in_procedureDeclaration557 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration561 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_id_in_procedureDeclaration563 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureDeclaration565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams600 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_procedureParams604 = new BitSet(new long[]{0x0002400000000080L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams610 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_VAR_in_procedureParam633 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_idList_in_procedureParam641 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_procedureParam643 = new BitSet(new long[]{0x0000598000000000L});
    public static final BitSet FOLLOW_type_in_procedureParam647 = new BitSet(new long[]{0x0000400000000082L});
    public static final BitSet FOLLOW_CALL_READ_in_procedureCall680 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITE_in_procedureCall701 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITELN_in_procedureCall722 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCall743 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_procedureActualParams775 = new BitSet(new long[]{0x0030C60083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams780 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_54_in_procedureActualParams795 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams799 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_53_in_procedureActualParams819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_type867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_type883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType925 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_arrayType929 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_OF_in_arrayType931 = new BitSet(new long[]{0x0000598000000000L});
    public static final BitSet FOLLOW_type_in_arrayType935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType964 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_recordField_in_recordType968 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_49_in_recordType972 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_recordField_in_recordType974 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_END_in_recordType981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_recordField1010 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_recordField1012 = new BitSet(new long[]{0x0000598000000000L});
    public static final BitSet FOLLOW_type_in_recordField1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor1042 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_idSelector_in_factor1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_factor1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_factor1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_factor1125 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_factor1127 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_factor1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1147 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_factor_in_factor1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1184 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MUL_in_term1202 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_factor_in_term1206 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_DIV_in_term1220 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_factor_in_term1224 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MOD_in_term1238 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_factor_in_term1242 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_AND_in_term1256 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_factor_in_term1260 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MIN_in_base1303 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_term_in_base1307 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base1326 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_term_in_base1330 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_term_in_base1351 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_MIN_in_base1386 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_term_in_base1390 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base1409 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_term_in_base1413 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_OR_in_base1432 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_term_in_base1436 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_base_in_expression1478 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1504 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_base_in_expression1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression1526 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_base_in_expression1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_expression1548 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_base_in_expression1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression1571 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_base_in_expression1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_in_expression1593 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_base_in_expression1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_EQUAL_in_expression1615 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_base_in_expression1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1663 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_statements1677 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statement_in_statements1681 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1840 = new BitSet(new long[]{0x0084004000000000L});
    public static final BitSet FOLLOW_idSelector_in_assignment1857 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment1860 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_assignment1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1890 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1894 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1903 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statements_in_ifStatement1907 = new BitSet(new long[]{0x0000000000011800L});
    public static final BitSet FOLLOW_ifElsIfList_in_ifStatement1919 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1930 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statements_in_ifStatement1934 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ifStatement1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_ifElsIfList1981 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_ifElsIfList1985 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_ifElsIfList1987 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statements_in_ifElsIfList1991 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement2018 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement2022 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_whileStatement2027 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statements_in_whileStatement2031 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_whileStatement2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement2060 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_withStatement2062 = new BitSet(new long[]{0x0084000000020000L});
    public static final BitSet FOLLOW_idSelector_in_withStatement2078 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_withStatement2083 = new BitSet(new long[]{0x0002403800006200L});
    public static final BitSet FOLLOW_statements_in_withStatement2088 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_withStatement2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idList2155 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_idList2171 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_id_in_idList2175 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_50_in_idSelector2226 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ID_in_idSelector2228 = new BitSet(new long[]{0x0084000000000002L});
    public static final BitSet FOLLOW_55_in_idSelector2250 = new BitSet(new long[]{0x0010C60083000000L});
    public static final BitSet FOLLOW_expression_in_idSelector2254 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_idSelector2256 = new BitSet(new long[]{0x0084000000000002L});

}