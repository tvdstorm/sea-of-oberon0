// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g 2011-02-06 16:35:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "PROCEDURE", "CONST", "VAR", "TYPE", "IF", "THEN", "ELSE", "ELSIF", "WHILE", "BEGIN", "END", "DO", "EQUAL", "UNEQUAL", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "MIN", "PLUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "DECLARATIONS", "INPUTVARS", "CALL", "CALL_READ", "CALL_WRITE", "CALL_WRITELN", "ASSIGN", "INTEGER", "ARRAY", "RECORD", "OF", "ID", "INT", "WHITESPACE", "';'", "'.'", "':'", "'('", "')'", "','", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
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
    public static final int BEGIN=14;
    public static final int END=15;
    public static final int DO=16;
    public static final int EQUAL=17;
    public static final int UNEQUAL=18;
    public static final int LESS=19;
    public static final int LESS_EQUAL=20;
    public static final int GREAT=21;
    public static final int GREAT_EQUAL=22;
    public static final int MIN=23;
    public static final int PLUS=24;
    public static final int MUL=25;
    public static final int DIV=26;
    public static final int MOD=27;
    public static final int AND=28;
    public static final int OR=29;
    public static final int NOT=30;
    public static final int DECLARATIONS=31;
    public static final int INPUTVARS=32;
    public static final int CALL=33;
    public static final int CALL_READ=34;
    public static final int CALL_WRITE=35;
    public static final int CALL_WRITELN=36;
    public static final int ASSIGN=37;
    public static final int INTEGER=38;
    public static final int ARRAY=39;
    public static final int RECORD=40;
    public static final int OF=41;
    public static final int ID=42;
    public static final int INT=43;
    public static final int WHITESPACE=44;

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:72:1: module returns [Module node] : MODULE node_id= id ';' node_declarations= declarations BEGIN node_statements= statements END id '.' ;
    public final Module module() throws RecognitionException {
        Module node = null;

        ID node_id = null;

        DeclarationList node_declarations = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:73:2: ( MODULE node_id= id ';' node_declarations= declarations BEGIN node_statements= statements END id '.' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:73:4: MODULE node_id= id ';' node_declarations= declarations BEGIN node_statements= statements END id '.'
            {
            match(input,MODULE,FOLLOW_MODULE_in_module318); 
            pushFollow(FOLLOW_id_in_module322);
            node_id=id();

            state._fsp--;

            match(input,45,FOLLOW_45_in_module324); 
            pushFollow(FOLLOW_declarations_in_module330);
            node_declarations=declarations();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_module334); 
            pushFollow(FOLLOW_statements_in_module340);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_module344); 
            pushFollow(FOLLOW_id_in_module346);
            id();

            state._fsp--;

            match(input,46,FOLLOW_46_in_module348); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:79:1: declarations returns [DeclarationList node] : ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )* ;
    public final DeclarationList declarations() throws RecognitionException {
        DeclarationList node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:79:45: ( ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:79:52: ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )*
            {
            node = new DeclarationList();
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:3: ( constDeclaration[node] | varDeclaration[node] | typeDeclaration[node] | procedureDeclaration[node] )*
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
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:4: constDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_constDeclaration_in_declarations380);
            	    constDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:27: varDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_declarations383);
            	    varDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:48: typeDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_declarations386);
            	    typeDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:70: procedureDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations389);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:83:1: constDeclaration[DeclarationList list] : CONST node_id= id '=' node_exp= expression ';' ;
    public final void constDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        Expression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:2: ( CONST node_id= id '=' node_exp= expression ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:4: CONST node_id= id '=' node_exp= expression ';'
            {
            match(input,CONST,FOLLOW_CONST_in_constDeclaration406); 
            pushFollow(FOLLOW_id_in_constDeclaration410);
            node_id=id();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_constDeclaration412); 
            pushFollow(FOLLOW_expression_in_constDeclaration416);
            node_exp=expression();

            state._fsp--;

            match(input,45,FOLLOW_45_in_constDeclaration418); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:86:1: varDeclaration[DeclarationList list] : VAR (node_ids= idList ':' node_type= type ';' )* ;
    public final void varDeclaration(DeclarationList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:87:2: ( VAR (node_ids= idList ':' node_type= type ';' )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:87:4: VAR (node_ids= idList ':' node_type= type ';' )*
            {
            match(input,VAR,FOLLOW_VAR_in_varDeclaration434); 
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:87:8: (node_ids= idList ':' node_type= type ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:87:9: node_ids= idList ':' node_type= type ';'
            	    {
            	    pushFollow(FOLLOW_idList_in_varDeclaration439);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,47,FOLLOW_47_in_varDeclaration441); 
            	    pushFollow(FOLLOW_type_in_varDeclaration445);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,45,FOLLOW_45_in_varDeclaration447); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:89:1: typeDeclaration[DeclarationList list] : TYPE node_id= id '=' node_type= type ';' ;
    public final void typeDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:90:2: ( TYPE node_id= id '=' node_type= type ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:90:4: TYPE node_id= id '=' node_type= type ';'
            {
            match(input,TYPE,FOLLOW_TYPE_in_typeDeclaration466); 
            pushFollow(FOLLOW_id_in_typeDeclaration470);
            node_id=id();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_typeDeclaration472); 
            pushFollow(FOLLOW_type_in_typeDeclaration476);
            node_type=type();

            state._fsp--;

            match(input,45,FOLLOW_45_in_typeDeclaration478); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:92:1: procedureDeclaration[DeclarationList list] : PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';' ;
    public final void procedureDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        VariableList node_params = null;

        DeclarationList node_declarations = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:93:2: ( PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:93:4: PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';'
            {
            match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration496); 
            pushFollow(FOLLOW_id_in_procedureDeclaration500);
            node_id=id();

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:93:25: ( '(' node_params= procedureParams ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==48) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:93:26: '(' node_params= procedureParams ')'
                    {
                    match(input,48,FOLLOW_48_in_procedureDeclaration503); 
                    pushFollow(FOLLOW_procedureParams_in_procedureDeclaration507);
                    node_params=procedureParams();

                    state._fsp--;

                    match(input,49,FOLLOW_49_in_procedureDeclaration509); 

                    }
                    break;

            }

            match(input,45,FOLLOW_45_in_procedureDeclaration513); 
            pushFollow(FOLLOW_declarations_in_procedureDeclaration519);
            node_declarations=declarations();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_procedureDeclaration523); 
            pushFollow(FOLLOW_statements_in_procedureDeclaration529);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_procedureDeclaration533); 
            pushFollow(FOLLOW_id_in_procedureDeclaration535);
            id();

            state._fsp--;

            match(input,45,FOLLOW_45_in_procedureDeclaration537); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:99:1: procedureParams returns [VariableList node] : node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* ;
    public final VariableList procedureParams() throws RecognitionException {
        VariableList node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:99:45: (node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:99:52: node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )*
            {
            node = new VariableList();
            pushFollow(FOLLOW_procedureParam_in_procedureParams572);
            procedureParam(node);

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:100:43: ( ';' node_declaration= procedureParam[node] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==45) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:100:44: ';' node_declaration= procedureParam[node]
            	    {
            	    match(input,45,FOLLOW_45_in_procedureParams576); 
            	    pushFollow(FOLLOW_procedureParam_in_procedureParams582);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:103:1: procedureParam[VariableList list] : ( ( VAR )? node_ids= idList ':' node_type= type )* ;
    public final void procedureParam(VariableList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:2: ( ( ( VAR )? node_ids= idList ':' node_type= type )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:4: ( ( VAR )? node_ids= idList ':' node_type= type )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:4: ( ( VAR )? node_ids= idList ':' node_type= type )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VAR||LA6_0==ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:5: ( VAR )? node_ids= idList ':' node_type= type
            	    {
            	    boolean byRef=false;
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:28: ( VAR )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==VAR) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:29: VAR
            	            {
            	            match(input,VAR,FOLLOW_VAR_in_procedureParam605); 
            	            byRef=true;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_idList_in_procedureParam613);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,47,FOLLOW_47_in_procedureParam615); 
            	    pushFollow(FOLLOW_type_in_procedureParam619);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:106:1: procedureCall returns [Call node] : ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) ;
    public final Call procedureCall() throws RecognitionException {
        Call node = null;

        Token ID1=null;
        ExpressionList call_vars = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:107:6: ( ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:107:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:107:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:8: CALL_READ (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_READ,FOLLOW_CALL_READ_in_procedureCall652); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:18: (call_vars= procedureActualParams )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==48) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:19: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall657);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallRead(call_vars);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:109:9: CALL_WRITE (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITE,FOLLOW_CALL_WRITE_in_procedureCall673); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:109:20: (call_vars= procedureActualParams )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==48) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:109:21: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall678);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWrite(call_vars);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:110:9: CALL_WRITELN (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITELN,FOLLOW_CALL_WRITELN_in_procedureCall694); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:110:22: (call_vars= procedureActualParams )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==48) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:110:23: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall699);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWriteLn(call_vars);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:111:9: ID (call_vars= procedureActualParams )?
                    {
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_procedureCall715); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:111:13: (call_vars= procedureActualParams )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==48) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:111:14: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall721);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:114:1: procedureActualParams returns [ExpressionList node] : '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' ;
    public final ExpressionList procedureActualParams() throws RecognitionException {
        ExpressionList node = null;

        Expression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:115:2: ( '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:115:3: '(' (node_exp= expression ( ',' node_exp= expression )* )? ')'
            {
            match(input,48,FOLLOW_48_in_procedureActualParams747); 
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:115:7: (node_exp= expression ( ',' node_exp= expression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=MIN && LA13_0<=PLUS)||LA13_0==NOT||(LA13_0>=ID && LA13_0<=INT)||LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:115:8: node_exp= expression ( ',' node_exp= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureActualParams752);
                    node_exp=expression();

                    state._fsp--;

                    node =new ExpressionList(); node.add(node_exp);
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:116:3: ( ',' node_exp= expression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==50) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:116:4: ',' node_exp= expression
                    	    {
                    	    match(input,50,FOLLOW_50_in_procedureActualParams767); 
                    	    pushFollow(FOLLOW_expression_in_procedureActualParams771);
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

            match(input,49,FOLLOW_49_in_procedureActualParams791); 

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:120:1: type returns [BaseType node] : (node_array= arrayType | node_record= recordType | INTEGER | ID );
    public final BaseType type() throws RecognitionException {
        BaseType node = null;

        Token ID2=null;
        ArrayType node_array = null;

        RecordType node_record = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:121:2: (node_array= arrayType | node_record= recordType | INTEGER | ID )
            int alt14=4;
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
            case ID:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:121:4: node_array= arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type809);
                    node_array=arrayType();

                    state._fsp--;

                    node = node_array;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:122:4: node_record= recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type825);
                    node_record=recordType();

                    state._fsp--;

                    node = node_record;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:123:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_type839); 
                    node = new IntType();

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:124:4: ID
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_type855); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:127:1: arrayType returns [ArrayType node] : ARRAY node_exp= expression OF node_type= type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType node = null;

        Expression node_exp = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:128:2: ( ARRAY node_exp= expression OF node_type= type )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:128:4: ARRAY node_exp= expression OF node_type= type
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_arrayType881); 
            pushFollow(FOLLOW_expression_in_arrayType885);
            node_exp=expression();

            state._fsp--;

            match(input,OF,FOLLOW_OF_in_arrayType887); 
            pushFollow(FOLLOW_type_in_arrayType891);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:131:1: recordType returns [RecordType node] : RECORD recordField[fields] ( ';' recordField[fields] )* END ;
    public final RecordType recordType() throws RecognitionException {
        RecordType node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:131:38: ( RECORD recordField[fields] ( ';' recordField[fields] )* END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:131:46: RECORD recordField[fields] ( ';' recordField[fields] )* END
            {
            RecordFieldList fields = new RecordFieldList();
            match(input,RECORD,FOLLOW_RECORD_in_recordType920); 
            pushFollow(FOLLOW_recordField_in_recordType924);
            recordField(fields);

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:133:23: ( ';' recordField[fields] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:133:24: ';' recordField[fields]
            	    {
            	    match(input,45,FOLLOW_45_in_recordType928); 
            	    pushFollow(FOLLOW_recordField_in_recordType930);
            	    recordField(fields);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_recordType937); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:137:1: recordField[RecordFieldList list] : (node_ids= idList ':' node_type= type ) ;
    public final void recordField(RecordFieldList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:2: ( (node_ids= idList ':' node_type= type ) )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:4: (node_ids= idList ':' node_type= type )
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:4: (node_ids= idList ':' node_type= type )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:5: node_ids= idList ':' node_type= type
            {
            pushFollow(FOLLOW_idList_in_recordField966);
            node_ids=idList();

            state._fsp--;

            match(input,47,FOLLOW_47_in_recordField968); 
            pushFollow(FOLLOW_type_in_recordField972);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:141:1: factor returns [Expression node] : ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) );
    public final Expression factor() throws RecognitionException {
        Expression node = null;

        Token ID3=null;
        Token INT4=null;
        Expression unary = null;

        Expression expression5 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:142:2: ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) )
            int alt16=4;
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
            case 48:
                {
                alt16=3;
                }
                break;
            case NOT:
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:142:7: ID idSelector[node_id]
                    {
                    ID3=(Token)match(input,ID,FOLLOW_ID_in_factor998); 
                    ID node_id = new ID((ID3!=null?ID3.getText():null)); node = new Reference(node_id);
                    pushFollow(FOLLOW_idSelector_in_factor1015);
                    idSelector(node_id);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:144:5: INT
                    {
                    INT4=(Token)match(input,INT,FOLLOW_INT_in_factor1026); 
                    node = new IntegerValue((INT4!=null?INT4.getText():null));

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:145:5: ( '(' expression ')' )
                    {
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:145:5: ( '(' expression ')' )
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:145:6: '(' expression ')'
                    {
                    match(input,48,FOLLOW_48_in_factor1045); 
                    pushFollow(FOLLOW_expression_in_factor1047);
                    expression5=expression();

                    state._fsp--;

                    match(input,49,FOLLOW_49_in_factor1049); 
                    node =expression5;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:146:5: ( NOT unary= factor )
                    {
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:146:5: ( NOT unary= factor )
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:146:6: NOT unary= factor
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor1067); 
                    pushFollow(FOLLOW_factor_in_factor1071);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:149:1: term returns [Expression node] : left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* ;
    public final Expression term() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:150:2: (left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:150:7: left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            {
            pushFollow(FOLLOW_factor_in_term1104);
            left=factor();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:151:2: ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
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
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:152:3: MUL right= factor
            	    {
            	    match(input,MUL,FOLLOW_MUL_in_term1122); 
            	    pushFollow(FOLLOW_factor_in_term1126);
            	    right=factor();

            	    state._fsp--;

            	    node =new Multiplication(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:153:4: DIV right= factor
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_term1140); 
            	    pushFollow(FOLLOW_factor_in_term1144);
            	    right=factor();

            	    state._fsp--;

            	    node =new Division(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:154:4: MOD right= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term1158); 
            	    pushFollow(FOLLOW_factor_in_term1162);
            	    right=factor();

            	    state._fsp--;

            	    node =new Modulo(node, right);

            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:155:4: AND right= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term1176); 
            	    pushFollow(FOLLOW_factor_in_term1180);
            	    right=factor();

            	    state._fsp--;

            	    node =new LogicalAnd(node, right);

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:158:1: base returns [Expression node] : ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* ;
    public final Expression base() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:159:6: ( ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:159:11: ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:159:11: ( MIN left= term | PLUS left= term | left= term )
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
            case ID:
            case INT:
            case 48:
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:160:7: MIN left= term
                    {
                    match(input,MIN,FOLLOW_MIN_in_base1223); 
                    pushFollow(FOLLOW_term_in_base1227);
                    left=term();

                    state._fsp--;

                    node =new Negative(left);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:161:8: PLUS left= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_base1246); 
                    pushFollow(FOLLOW_term_in_base1250);
                    left=term();

                    state._fsp--;

                    node =new Positive(left);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:162:8: left= term
                    {
                    pushFollow(FOLLOW_term_in_base1271);
                    left=term();

                    state._fsp--;

                    node =left;

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:164:8: ( MIN right= term | PLUS right= term | OR right= term )*
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
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:165:7: MIN right= term
            	    {
            	    match(input,MIN,FOLLOW_MIN_in_base1306); 
            	    pushFollow(FOLLOW_term_in_base1310);
            	    right=term();

            	    state._fsp--;

            	    node =new Subtraction(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:166:8: PLUS right= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_base1329); 
            	    pushFollow(FOLLOW_term_in_base1333);
            	    right=term();

            	    state._fsp--;

            	    node =new Addition(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:167:8: OR right= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_base1352); 
            	    pushFollow(FOLLOW_term_in_base1356);
            	    right=term();

            	    state._fsp--;

            	    node =new LogicalOr(node, right);

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:170:1: expression returns [Expression node] : left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? ;
    public final Expression expression() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:171:6: (left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:171:10: left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            {
            pushFollow(FOLLOW_base_in_expression1398);
            left=base();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:172:6: ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:173:7: EQUAL right= base
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression1424); 
                    pushFollow(FOLLOW_base_in_expression1428);
                    right=base();

                    state._fsp--;

                    node =new Equal(node, right);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:174:8: UNEQUAL right= base
                    {
                    match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression1446); 
                    pushFollow(FOLLOW_base_in_expression1450);
                    right=base();

                    state._fsp--;

                    node =new NotEqual(node, right);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:175:8: LESS right= base
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression1468); 
                    pushFollow(FOLLOW_base_in_expression1472);
                    right=base();

                    state._fsp--;

                    node =new LessThan(node, right);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:176:8: LESS_EQUAL right= base
                    {
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression1491); 
                    pushFollow(FOLLOW_base_in_expression1495);
                    right=base();

                    state._fsp--;

                    node =new LessThanOrEqualTo(node, right);

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:177:8: GREAT right= base
                    {
                    match(input,GREAT,FOLLOW_GREAT_in_expression1513); 
                    pushFollow(FOLLOW_base_in_expression1517);
                    right=base();

                    state._fsp--;

                    node =new GreatherThan(node, right);

                    }
                    break;
                case 6 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:178:8: GREAT_EQUAL right= base
                    {
                    match(input,GREAT_EQUAL,FOLLOW_GREAT_EQUAL_in_expression1535); 
                    pushFollow(FOLLOW_base_in_expression1539);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:181:1: statements returns [StatementList node] : node_statement= statement ( ';' node_statement= statement )* ;
    public final StatementList statements() throws RecognitionException {
        StatementList node = null;

        Statement node_statement = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:181:41: (node_statement= statement ( ';' node_statement= statement )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:181:48: node_statement= statement ( ';' node_statement= statement )*
            {
            node = new StatementList();
            pushFollow(FOLLOW_statement_in_statements1583);
            node_statement=statement();

            state._fsp--;

            node.add(node_statement);
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:183:3: ( ';' node_statement= statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:183:4: ';' node_statement= statement
            	    {
            	    match(input,45,FOLLOW_45_in_statements1597); 
            	    pushFollow(FOLLOW_statement_in_statements1601);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:186:1: statement returns [Statement node] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Statement statement() throws RecognitionException {
        Statement node = null;

        Assign assignment6 = null;

        Call procedureCall7 = null;

        If ifStatement8 = null;

        While whileStatement9 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:187:5: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:187:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:187:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt22=5;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==ASSIGN||LA22_1==46||LA22_1==51) ) {
                        alt22=1;
                    }
                    else if ( ((LA22_1>=ELSE && LA22_1<=ELSIF)||LA22_1==END||LA22_1==45||LA22_1==48) ) {
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
            }

            switch (alt22) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:188:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1638);
                    assignment6=assignment();

                    state._fsp--;

                    node = assignment6;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:189:8: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1658);
                    procedureCall7=procedureCall();

                    state._fsp--;

                    node = procedureCall7;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:190:8: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1678);
                    ifStatement8=ifStatement();

                    state._fsp--;

                    node = ifStatement8;

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:191:8: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1698);
                    whileStatement9=whileStatement();

                    state._fsp--;

                    node = whileStatement9;

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:194:1: assignment returns [Assign node] : ID idSelector[node_id] ASSIGN node_expression= expression ;
    public final Assign assignment() throws RecognitionException {
        Assign node = null;

        Token ID10=null;
        Expression node_expression = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:195:2: ( ID idSelector[node_id] ASSIGN node_expression= expression )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:195:4: ID idSelector[node_id] ASSIGN node_expression= expression
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_assignment1740); 
            ID node_id = new ID((ID10!=null?ID10.getText():null));
            pushFollow(FOLLOW_idSelector_in_assignment1757);
            idSelector(node_id);

            state._fsp--;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment1760); 
            pushFollow(FOLLOW_expression_in_assignment1764);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:198:1: ifStatement returns [If node] : IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END ;
    public final If ifStatement() throws RecognitionException {
        If node = null;

        Expression node_expression = null;

        StatementList node_statements = null;

        IfListForElsIf node_elsifs = null;

        StatementList node_else = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:199:6: ( IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:199:11: IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1790); 
            pushFollow(FOLLOW_expression_in_ifStatement1794);
            node_expression=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement1803); 
            pushFollow(FOLLOW_statements_in_ifStatement1807);
            node_statements=statements();

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:201:7: (node_elsifs= ifElsIfList )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:201:8: node_elsifs= ifElsIfList
            {
            pushFollow(FOLLOW_ifElsIfList_in_ifStatement1819);
            node_elsifs=ifElsIfList();

            state._fsp--;


            }

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:202:7: ( ELSE node_else= statements )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:202:8: ELSE node_else= statements
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1830); 
                    pushFollow(FOLLOW_statements_in_ifStatement1834);
                    node_else=statements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1838); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:205:1: ifElsIfList returns [IfListForElsIf node] : ( ELSIF node_expression= expression THEN node_statements= statements )* ;
    public final IfListForElsIf ifElsIfList() throws RecognitionException {
        IfListForElsIf node = null;

        Expression node_expression = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:205:43: ( ( ELSIF node_expression= expression THEN node_statements= statements )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:205:50: ( ELSIF node_expression= expression THEN node_statements= statements )*
            {
            node = new IfListForElsIf();
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:206:3: ( ELSIF node_expression= expression THEN node_statements= statements )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ELSIF) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:207:3: ELSIF node_expression= expression THEN node_statements= statements
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifElsIfList1881); 
            	    pushFollow(FOLLOW_expression_in_ifElsIfList1885);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,THEN,FOLLOW_THEN_in_ifElsIfList1887); 
            	    pushFollow(FOLLOW_statements_in_ifElsIfList1891);
            	    node_statements=statements();

            	    state._fsp--;

            	    node.add(new IfPartForElsIf(node_expression, node_statements));

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:211:1: whileStatement returns [While node] : WHILE node_expression= expression DO node_statements= statements END ;
    public final While whileStatement() throws RecognitionException {
        While node = null;

        Expression node_expression = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:212:2: ( WHILE node_expression= expression DO node_statements= statements END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:212:4: WHILE node_expression= expression DO node_statements= statements END
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement1918); 
            pushFollow(FOLLOW_expression_in_whileStatement1922);
            node_expression=expression();

            state._fsp--;

            match(input,DO,FOLLOW_DO_in_whileStatement1927); 
            pushFollow(FOLLOW_statements_in_whileStatement1931);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1936); 
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


    // $ANTLR start "id"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:216:1: id returns [ID node] : ID ;
    public final ID id() throws RecognitionException {
        ID node = null;

        Token ID11=null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:217:2: ( ID )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:217:4: ID
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_id1961); 
            node = new ID((ID11!=null?ID11.getText():null));

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:219:1: idList returns [IDList node] : node_id1= id ( ',' node_id2= id )* ;
    public final IDList idList() throws RecognitionException {
        IDList node = null;

        ID node_id1 = null;

        ID node_id2 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:219:30: (node_id1= id ( ',' node_id2= id )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:219:39: node_id1= id ( ',' node_id2= id )*
            {
            node = new IDList();
            pushFollow(FOLLOW_id_in_idList1998);
            node_id1=id();

            state._fsp--;

            node.add(node_id1);
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:221:3: ( ',' node_id2= id )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==50) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:221:4: ',' node_id2= id
            	    {
            	    match(input,50,FOLLOW_50_in_idList2014); 
            	    pushFollow(FOLLOW_id_in_idList2018);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:224:1: idSelector[ID node_parent] : ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* ;
    public final void idSelector(ID node_parent) throws RecognitionException {
        Token ID12=null;
        Expression node_expression = null;


        ID node_current = node_parent;
        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:226:6: ( ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:226:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:226:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==46) ) {
                    alt26=1;
                }
                else if ( (LA26_0==51) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:226:12: ( '.' ID )
            	    {
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:226:12: ( '.' ID )
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:226:13: '.' ID
            	    {
            	    match(input,46,FOLLOW_46_in_idSelector2069); 
            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_idSelector2071); 
            	    node_current=(ID)node_current.setSub(new ID((ID12!=null?ID12.getText():null)));

            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:227:9: ( '[' node_expression= expression ']' )
            	    {
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:227:9: ( '[' node_expression= expression ']' )
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:227:10: '[' node_expression= expression ']'
            	    {
            	    match(input,51,FOLLOW_51_in_idSelector2093); 
            	    pushFollow(FOLLOW_expression_in_idSelector2097);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,52,FOLLOW_52_in_idSelector2099); 
            	    node_current.setSub(node_expression);

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


 

    public static final BitSet FOLLOW_MODULE_in_module318 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id_in_module322 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_module324 = new BitSet(new long[]{0x00000000000041E0L});
    public static final BitSet FOLLOW_declarations_in_module330 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BEGIN_in_module334 = new BitSet(new long[]{0x0000241C00002200L});
    public static final BitSet FOLLOW_statements_in_module340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_module344 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id_in_module346 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_module348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations380 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_varDeclaration_in_declarations383 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations386 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations389 = new BitSet(new long[]{0x00000000000001E2L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration406 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id_in_constDeclaration410 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_constDeclaration412 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_constDeclaration416 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_constDeclaration418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration434 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_idList_in_varDeclaration439 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_varDeclaration441 = new BitSet(new long[]{0x000005C000000000L});
    public static final BitSet FOLLOW_type_in_varDeclaration445 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_varDeclaration447 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_TYPE_in_typeDeclaration466 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id_in_typeDeclaration470 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EQUAL_in_typeDeclaration472 = new BitSet(new long[]{0x000005C000000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration476 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_typeDeclaration478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration496 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id_in_procedureDeclaration500 = new BitSet(new long[]{0x0001200000000000L});
    public static final BitSet FOLLOW_48_in_procedureDeclaration503 = new BitSet(new long[]{0x0000240000000080L});
    public static final BitSet FOLLOW_procedureParams_in_procedureDeclaration507 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureDeclaration509 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_procedureDeclaration513 = new BitSet(new long[]{0x00000000000041E0L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration519 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BEGIN_in_procedureDeclaration523 = new BitSet(new long[]{0x0000241C00002200L});
    public static final BitSet FOLLOW_statements_in_procedureDeclaration529 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration533 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id_in_procedureDeclaration535 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_procedureDeclaration537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams572 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_procedureParams576 = new BitSet(new long[]{0x0000240000000080L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams582 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_VAR_in_procedureParam605 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_idList_in_procedureParam613 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_procedureParam615 = new BitSet(new long[]{0x000005C000000000L});
    public static final BitSet FOLLOW_type_in_procedureParam619 = new BitSet(new long[]{0x0000040000000082L});
    public static final BitSet FOLLOW_CALL_READ_in_procedureCall652 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITE_in_procedureCall673 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITELN_in_procedureCall694 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCall715 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_procedureActualParams747 = new BitSet(new long[]{0x00030C0041800000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams752 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_50_in_procedureActualParams767 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams771 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_procedureActualParams791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_type839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType881 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_arrayType885 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_arrayType887 = new BitSet(new long[]{0x000005C000000000L});
    public static final BitSet FOLLOW_type_in_arrayType891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType920 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_recordField_in_recordType924 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_45_in_recordType928 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_recordField_in_recordType930 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_END_in_recordType937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_recordField966 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_recordField968 = new BitSet(new long[]{0x000005C000000000L});
    public static final BitSet FOLLOW_type_in_recordField972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor998 = new BitSet(new long[]{0x0008400000000000L});
    public static final BitSet FOLLOW_idSelector_in_factor1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_factor1045 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_factor1047 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_factor1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1067 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_factor_in_factor1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1104 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_MUL_in_term1122 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_factor_in_term1126 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_DIV_in_term1140 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_factor_in_term1144 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_MOD_in_term1158 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_factor_in_term1162 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_AND_in_term1176 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_factor_in_term1180 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_MIN_in_base1223 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_term_in_base1227 = new BitSet(new long[]{0x0000000021800002L});
    public static final BitSet FOLLOW_PLUS_in_base1246 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_term_in_base1250 = new BitSet(new long[]{0x0000000021800002L});
    public static final BitSet FOLLOW_term_in_base1271 = new BitSet(new long[]{0x0000000021800002L});
    public static final BitSet FOLLOW_MIN_in_base1306 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_term_in_base1310 = new BitSet(new long[]{0x0000000021800002L});
    public static final BitSet FOLLOW_PLUS_in_base1329 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_term_in_base1333 = new BitSet(new long[]{0x0000000021800002L});
    public static final BitSet FOLLOW_OR_in_base1352 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_term_in_base1356 = new BitSet(new long[]{0x0000000021800002L});
    public static final BitSet FOLLOW_base_in_expression1398 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1424 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_base_in_expression1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression1446 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_base_in_expression1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_expression1468 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_base_in_expression1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression1491 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_base_in_expression1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_in_expression1513 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_base_in_expression1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_EQUAL_in_expression1535 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_base_in_expression1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1583 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_statements1597 = new BitSet(new long[]{0x0000241C00002200L});
    public static final BitSet FOLLOW_statement_in_statements1601 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1740 = new BitSet(new long[]{0x0008402000000000L});
    public static final BitSet FOLLOW_idSelector_in_assignment1757 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment1760 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_assignment1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1790 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1794 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1803 = new BitSet(new long[]{0x0000241C00002200L});
    public static final BitSet FOLLOW_statements_in_ifStatement1807 = new BitSet(new long[]{0x0000000000009800L});
    public static final BitSet FOLLOW_ifElsIfList_in_ifStatement1819 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1830 = new BitSet(new long[]{0x0000241C00002200L});
    public static final BitSet FOLLOW_statements_in_ifStatement1834 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_ifStatement1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_ifElsIfList1881 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_ifElsIfList1885 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_ifElsIfList1887 = new BitSet(new long[]{0x0000241C00002200L});
    public static final BitSet FOLLOW_statements_in_ifElsIfList1891 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1918 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1922 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1927 = new BitSet(new long[]{0x0000241C00002200L});
    public static final BitSet FOLLOW_statements_in_whileStatement1931 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_END_in_whileStatement1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idList1998 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_idList2014 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id_in_idList2018 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_46_in_idSelector2069 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_idSelector2071 = new BitSet(new long[]{0x0008400000000002L});
    public static final BitSet FOLLOW_51_in_idSelector2093 = new BitSet(new long[]{0x00010C0041800000L});
    public static final BitSet FOLLOW_expression_in_idSelector2097 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_idSelector2099 = new BitSet(new long[]{0x0008400000000002L});

}