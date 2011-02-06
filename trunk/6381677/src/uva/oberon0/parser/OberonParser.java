// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g 2011-02-06 16:04:14

package uva.oberon0.parser;

import uva.oberon0.abstractsyntax.*;
import uva.oberon0.abstractsyntax.declarations.*;
import uva.oberon0.abstractsyntax.expressions.*;
import uva.oberon0.abstractsyntax.statements.*;
import uva.oberon0.abstractsyntax.types.*;
import uva.oberon0.abstractsyntax.types.Type;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OberonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "PROCEDURE", "CONST", "VAR", "IF", "THEN", "ELSE", "ELSIF", "WHILE", "BEGIN", "END", "DO", "EQUAL", "UNEQUAL", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "MIN", "PLUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "DECLARATIONS", "INPUTVARS", "CALL", "CALL_READ", "CALL_WRITE", "CALL_WRITELN", "ASSIGN", "INTEGER", "ARRAY", "RECORD", "OF", "ID", "INT", "WHITESPACE", "';'", "'.'", "':'", "'('", "')'", "','", "'['", "']'"
    };
    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int MODULE=4;
    public static final int PROCEDURE=5;
    public static final int CONST=6;
    public static final int VAR=7;
    public static final int IF=8;
    public static final int THEN=9;
    public static final int ELSE=10;
    public static final int ELSIF=11;
    public static final int WHILE=12;
    public static final int BEGIN=13;
    public static final int END=14;
    public static final int DO=15;
    public static final int EQUAL=16;
    public static final int UNEQUAL=17;
    public static final int LESS=18;
    public static final int LESS_EQUAL=19;
    public static final int GREAT=20;
    public static final int GREAT_EQUAL=21;
    public static final int MIN=22;
    public static final int PLUS=23;
    public static final int MUL=24;
    public static final int DIV=25;
    public static final int MOD=26;
    public static final int AND=27;
    public static final int OR=28;
    public static final int NOT=29;
    public static final int DECLARATIONS=30;
    public static final int INPUTVARS=31;
    public static final int CALL=32;
    public static final int CALL_READ=33;
    public static final int CALL_WRITE=34;
    public static final int CALL_WRITELN=35;
    public static final int ASSIGN=36;
    public static final int INTEGER=37;
    public static final int ARRAY=38;
    public static final int RECORD=39;
    public static final int OF=40;
    public static final int ID=41;
    public static final int INT=42;
    public static final int WHITESPACE=43;

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
            match(input,MODULE,FOLLOW_MODULE_in_module311); 
            pushFollow(FOLLOW_id_in_module315);
            node_id=id();

            state._fsp--;

            match(input,44,FOLLOW_44_in_module317); 
            pushFollow(FOLLOW_declarations_in_module323);
            node_declarations=declarations();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_module327); 
            pushFollow(FOLLOW_statements_in_module333);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_module337); 
            pushFollow(FOLLOW_id_in_module339);
            id();

            state._fsp--;

            match(input,45,FOLLOW_45_in_module341); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:79:1: declarations returns [DeclarationList node] : ( constDeclaration[node] | varDeclaration[node] | procedureDeclaration[node] )* ;
    public final DeclarationList declarations() throws RecognitionException {
        DeclarationList node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:79:45: ( ( constDeclaration[node] | varDeclaration[node] | procedureDeclaration[node] )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:79:52: ( constDeclaration[node] | varDeclaration[node] | procedureDeclaration[node] )*
            {
            node = new DeclarationList();
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:3: ( constDeclaration[node] | varDeclaration[node] | procedureDeclaration[node] )*
            loop1:
            do {
                int alt1=4;
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
                case PROCEDURE:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:4: constDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_constDeclaration_in_declarations373);
            	    constDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:27: varDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_declarations376);
            	    varDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:80:48: procedureDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_procedureDeclaration_in_declarations379);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:83:1: constDeclaration[DeclarationList list] : CONST (node_id= id '=' node_exp= expression ';' ) ;
    public final void constDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        Expression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:2: ( CONST (node_id= id '=' node_exp= expression ';' ) )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:4: CONST (node_id= id '=' node_exp= expression ';' )
            {
            match(input,CONST,FOLLOW_CONST_in_constDeclaration396); 
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:10: (node_id= id '=' node_exp= expression ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:84:11: node_id= id '=' node_exp= expression ';'
            {
            pushFollow(FOLLOW_id_in_constDeclaration401);
            node_id=id();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_constDeclaration403); 
            pushFollow(FOLLOW_expression_in_constDeclaration407);
            node_exp=expression();

            state._fsp--;

            match(input,44,FOLLOW_44_in_constDeclaration409); 

            }

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

        Type node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:87:2: ( VAR (node_ids= idList ':' node_type= type ';' )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:87:4: VAR (node_ids= idList ':' node_type= type ';' )*
            {
            match(input,VAR,FOLLOW_VAR_in_varDeclaration426); 
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
            	    pushFollow(FOLLOW_idList_in_varDeclaration431);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_varDeclaration433); 
            	    pushFollow(FOLLOW_type_in_varDeclaration437);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,44,FOLLOW_44_in_varDeclaration439); 
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


    // $ANTLR start "procedureDeclaration"
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:89:1: procedureDeclaration[DeclarationList list] : PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';' ;
    public final void procedureDeclaration(DeclarationList list) throws RecognitionException {
        ID node_id = null;

        VariableList node_params = null;

        DeclarationList node_declarations = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:90:2: ( PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:90:4: PROCEDURE node_id= id ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations BEGIN node_statements= statements END id ';'
            {
            match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration459); 
            pushFollow(FOLLOW_id_in_procedureDeclaration463);
            node_id=id();

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:90:25: ( '(' node_params= procedureParams ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==47) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:90:26: '(' node_params= procedureParams ')'
                    {
                    match(input,47,FOLLOW_47_in_procedureDeclaration466); 
                    pushFollow(FOLLOW_procedureParams_in_procedureDeclaration470);
                    node_params=procedureParams();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_procedureDeclaration472); 

                    }
                    break;

            }

            match(input,44,FOLLOW_44_in_procedureDeclaration476); 
            pushFollow(FOLLOW_declarations_in_procedureDeclaration482);
            node_declarations=declarations();

            state._fsp--;

            match(input,BEGIN,FOLLOW_BEGIN_in_procedureDeclaration486); 
            pushFollow(FOLLOW_statements_in_procedureDeclaration492);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_procedureDeclaration496); 
            pushFollow(FOLLOW_id_in_procedureDeclaration498);
            id();

            state._fsp--;

            match(input,44,FOLLOW_44_in_procedureDeclaration500); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:96:1: procedureParams returns [VariableList node] : node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* ;
    public final VariableList procedureParams() throws RecognitionException {
        VariableList node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:96:45: (node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:96:52: node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )*
            {
            node = new VariableList();
            pushFollow(FOLLOW_procedureParam_in_procedureParams535);
            procedureParam(node);

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:97:43: ( ';' node_declaration= procedureParam[node] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:97:44: ';' node_declaration= procedureParam[node]
            	    {
            	    match(input,44,FOLLOW_44_in_procedureParams539); 
            	    pushFollow(FOLLOW_procedureParam_in_procedureParams545);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:100:1: procedureParam[VariableList list] : ( ( VAR )? node_ids= idList ':' node_type= type )* ;
    public final void procedureParam(VariableList list) throws RecognitionException {
        IDList node_ids = null;

        Type node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:101:2: ( ( ( VAR )? node_ids= idList ':' node_type= type )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:101:4: ( ( VAR )? node_ids= idList ':' node_type= type )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:101:4: ( ( VAR )? node_ids= idList ':' node_type= type )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VAR||LA6_0==ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:101:5: ( VAR )? node_ids= idList ':' node_type= type
            	    {
            	    boolean byRef=false;
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:101:28: ( VAR )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==VAR) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:101:29: VAR
            	            {
            	            match(input,VAR,FOLLOW_VAR_in_procedureParam568); 
            	            byRef=true;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_idList_in_procedureParam576);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_procedureParam578); 
            	    pushFollow(FOLLOW_type_in_procedureParam582);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:103:1: procedureCall returns [Call node] : ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) ;
    public final Call procedureCall() throws RecognitionException {
        Call node = null;

        Token ID1=null;
        ExpressionList call_vars = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:6: ( ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:104:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:105:8: CALL_READ (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_READ,FOLLOW_CALL_READ_in_procedureCall615); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:105:18: (call_vars= procedureActualParams )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==47) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:105:19: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall620);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallRead(call_vars);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:106:9: CALL_WRITE (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITE,FOLLOW_CALL_WRITE_in_procedureCall636); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:106:20: (call_vars= procedureActualParams )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==47) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:106:21: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall641);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWrite(call_vars);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:107:9: CALL_WRITELN (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITELN,FOLLOW_CALL_WRITELN_in_procedureCall657); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:107:22: (call_vars= procedureActualParams )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==47) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:107:23: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall662);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWriteLn(call_vars);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:9: ID (call_vars= procedureActualParams )?
                    {
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_procedureCall678); 
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:13: (call_vars= procedureActualParams )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==47) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:108:14: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall684);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:111:1: procedureActualParams returns [ExpressionList node] : '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' ;
    public final ExpressionList procedureActualParams() throws RecognitionException {
        ExpressionList node = null;

        Expression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:112:2: ( '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:112:3: '(' (node_exp= expression ( ',' node_exp= expression )* )? ')'
            {
            match(input,47,FOLLOW_47_in_procedureActualParams710); 
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:112:7: (node_exp= expression ( ',' node_exp= expression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=MIN && LA13_0<=PLUS)||LA13_0==NOT||(LA13_0>=ID && LA13_0<=INT)||LA13_0==47) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:112:8: node_exp= expression ( ',' node_exp= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureActualParams715);
                    node_exp=expression();

                    state._fsp--;

                    node =new ExpressionList(); node.add(node_exp);
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:113:3: ( ',' node_exp= expression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==49) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:113:4: ',' node_exp= expression
                    	    {
                    	    match(input,49,FOLLOW_49_in_procedureActualParams730); 
                    	    pushFollow(FOLLOW_expression_in_procedureActualParams734);
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

            match(input,48,FOLLOW_48_in_procedureActualParams754); 

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:117:1: type returns [Type node] : (node_array= arrayType | node_record= recordType | INTEGER );
    public final Type type() throws RecognitionException {
        Type node = null;

        ArrayType node_array = null;

        RecordType node_record = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:118:2: (node_array= arrayType | node_record= recordType | INTEGER )
            int alt14=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:118:4: node_array= arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type772);
                    node_array=arrayType();

                    state._fsp--;

                    node = node_array;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:119:4: node_record= recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type788);
                    node_record=recordType();

                    state._fsp--;

                    node = node_record;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:120:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_type802); 
                    node = new IntType();

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:123:1: arrayType returns [ArrayType node] : ARRAY node_exp= expression OF node_type= type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType node = null;

        Expression node_exp = null;

        Type node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:124:2: ( ARRAY node_exp= expression OF node_type= type )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:124:4: ARRAY node_exp= expression OF node_type= type
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_arrayType828); 
            pushFollow(FOLLOW_expression_in_arrayType832);
            node_exp=expression();

            state._fsp--;

            match(input,OF,FOLLOW_OF_in_arrayType834); 
            pushFollow(FOLLOW_type_in_arrayType838);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:127:1: recordType returns [RecordType node] : RECORD recordField[fields] ( ';' recordField[fields] )* END ;
    public final RecordType recordType() throws RecognitionException {
        RecordType node = null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:127:38: ( RECORD recordField[fields] ( ';' recordField[fields] )* END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:127:46: RECORD recordField[fields] ( ';' recordField[fields] )* END
            {
            RecordFieldList fields = new RecordFieldList();
            match(input,RECORD,FOLLOW_RECORD_in_recordType867); 
            pushFollow(FOLLOW_recordField_in_recordType871);
            recordField(fields);

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:129:23: ( ';' recordField[fields] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==44) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:129:24: ';' recordField[fields]
            	    {
            	    match(input,44,FOLLOW_44_in_recordType875); 
            	    pushFollow(FOLLOW_recordField_in_recordType877);
            	    recordField(fields);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match(input,END,FOLLOW_END_in_recordType884); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:133:1: recordField[RecordFieldList list] : (node_ids= idList ':' node_type= type ) ;
    public final void recordField(RecordFieldList list) throws RecognitionException {
        IDList node_ids = null;

        Type node_type = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:134:2: ( (node_ids= idList ':' node_type= type ) )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:134:4: (node_ids= idList ':' node_type= type )
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:134:4: (node_ids= idList ':' node_type= type )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:134:5: node_ids= idList ':' node_type= type
            {
            pushFollow(FOLLOW_idList_in_recordField913);
            node_ids=idList();

            state._fsp--;

            match(input,46,FOLLOW_46_in_recordField915); 
            pushFollow(FOLLOW_type_in_recordField919);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:137:1: factor returns [Expression node] : ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) );
    public final Expression factor() throws RecognitionException {
        Expression node = null;

        Token ID2=null;
        Token INT3=null;
        Expression unary = null;

        Expression expression4 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:2: ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) )
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
            case 47:
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:138:7: ID idSelector[node_id]
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_factor945); 
                    ID node_id = new ID((ID2!=null?ID2.getText():null)); node = new Reference(node_id);
                    pushFollow(FOLLOW_idSelector_in_factor962);
                    idSelector(node_id);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:140:5: INT
                    {
                    INT3=(Token)match(input,INT,FOLLOW_INT_in_factor973); 
                    node = new IntegerValue((INT3!=null?INT3.getText():null));

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:141:5: ( '(' expression ')' )
                    {
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:141:5: ( '(' expression ')' )
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:141:6: '(' expression ')'
                    {
                    match(input,47,FOLLOW_47_in_factor992); 
                    pushFollow(FOLLOW_expression_in_factor994);
                    expression4=expression();

                    state._fsp--;

                    match(input,48,FOLLOW_48_in_factor996); 
                    node =expression4;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:142:5: ( NOT unary= factor )
                    {
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:142:5: ( NOT unary= factor )
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:142:6: NOT unary= factor
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor1014); 
                    pushFollow(FOLLOW_factor_in_factor1018);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:145:1: term returns [Expression node] : left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* ;
    public final Expression term() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:146:2: (left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:146:7: left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            {
            pushFollow(FOLLOW_factor_in_term1051);
            left=factor();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:147:2: ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
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
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:148:3: MUL right= factor
            	    {
            	    match(input,MUL,FOLLOW_MUL_in_term1069); 
            	    pushFollow(FOLLOW_factor_in_term1073);
            	    right=factor();

            	    state._fsp--;

            	    node =new Multiplication(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:149:4: DIV right= factor
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_term1087); 
            	    pushFollow(FOLLOW_factor_in_term1091);
            	    right=factor();

            	    state._fsp--;

            	    node =new Division(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:150:4: MOD right= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term1105); 
            	    pushFollow(FOLLOW_factor_in_term1109);
            	    right=factor();

            	    state._fsp--;

            	    node =new Modulo(node, right);

            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:151:4: AND right= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term1123); 
            	    pushFollow(FOLLOW_factor_in_term1127);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:154:1: base returns [Expression node] : ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* ;
    public final Expression base() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:155:6: ( ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:155:11: ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:155:11: ( MIN left= term | PLUS left= term | left= term )
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
            case 47:
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:156:7: MIN left= term
                    {
                    match(input,MIN,FOLLOW_MIN_in_base1170); 
                    pushFollow(FOLLOW_term_in_base1174);
                    left=term();

                    state._fsp--;

                    node =new Negative(left);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:157:8: PLUS left= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_base1193); 
                    pushFollow(FOLLOW_term_in_base1197);
                    left=term();

                    state._fsp--;

                    node =new Positive(left);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:158:8: left= term
                    {
                    pushFollow(FOLLOW_term_in_base1218);
                    left=term();

                    state._fsp--;

                    node =left;

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:160:8: ( MIN right= term | PLUS right= term | OR right= term )*
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
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:161:7: MIN right= term
            	    {
            	    match(input,MIN,FOLLOW_MIN_in_base1253); 
            	    pushFollow(FOLLOW_term_in_base1257);
            	    right=term();

            	    state._fsp--;

            	    node =new Subtraction(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:162:8: PLUS right= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_base1276); 
            	    pushFollow(FOLLOW_term_in_base1280);
            	    right=term();

            	    state._fsp--;

            	    node =new Addition(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:163:8: OR right= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_base1299); 
            	    pushFollow(FOLLOW_term_in_base1303);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:166:1: expression returns [Expression node] : left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? ;
    public final Expression expression() throws RecognitionException {
        Expression node = null;

        Expression left = null;

        Expression right = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:167:6: (left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:167:10: left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            {
            pushFollow(FOLLOW_base_in_expression1345);
            left=base();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:168:6: ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:169:7: EQUAL right= base
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression1371); 
                    pushFollow(FOLLOW_base_in_expression1375);
                    right=base();

                    state._fsp--;

                    node =new Equal(node, right);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:170:8: UNEQUAL right= base
                    {
                    match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression1393); 
                    pushFollow(FOLLOW_base_in_expression1397);
                    right=base();

                    state._fsp--;

                    node =new NotEqual(node, right);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:171:8: LESS right= base
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression1415); 
                    pushFollow(FOLLOW_base_in_expression1419);
                    right=base();

                    state._fsp--;

                    node =new LessThan(node, right);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:172:8: LESS_EQUAL right= base
                    {
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression1438); 
                    pushFollow(FOLLOW_base_in_expression1442);
                    right=base();

                    state._fsp--;

                    node =new LessThanOrEqualTo(node, right);

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:173:8: GREAT right= base
                    {
                    match(input,GREAT,FOLLOW_GREAT_in_expression1460); 
                    pushFollow(FOLLOW_base_in_expression1464);
                    right=base();

                    state._fsp--;

                    node =new GreatherThan(node, right);

                    }
                    break;
                case 6 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:174:8: GREAT_EQUAL right= base
                    {
                    match(input,GREAT_EQUAL,FOLLOW_GREAT_EQUAL_in_expression1482); 
                    pushFollow(FOLLOW_base_in_expression1486);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:177:1: statements returns [StatementList node] : node_statement= statement ( ';' node_statement= statement )* ;
    public final StatementList statements() throws RecognitionException {
        StatementList node = null;

        Statement node_statement = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:177:41: (node_statement= statement ( ';' node_statement= statement )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:177:48: node_statement= statement ( ';' node_statement= statement )*
            {
            node = new StatementList();
            pushFollow(FOLLOW_statement_in_statements1530);
            node_statement=statement();

            state._fsp--;

            node.add(node_statement);
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:179:3: ( ';' node_statement= statement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==44) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:179:4: ';' node_statement= statement
            	    {
            	    match(input,44,FOLLOW_44_in_statements1544); 
            	    pushFollow(FOLLOW_statement_in_statements1548);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:182:1: statement returns [Statement node] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final Statement statement() throws RecognitionException {
        Statement node = null;

        Assign assignment5 = null;

        Call procedureCall6 = null;

        If ifStatement7 = null;

        While whileStatement8 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:183:5: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:183:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:183:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt22=5;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==ASSIGN||LA22_1==45||LA22_1==50) ) {
                        alt22=1;
                    }
                    else if ( ((LA22_1>=ELSE && LA22_1<=ELSIF)||LA22_1==END||LA22_1==44||LA22_1==47) ) {
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
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:184:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1585);
                    assignment5=assignment();

                    state._fsp--;

                    node = assignment5;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:185:8: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1605);
                    procedureCall6=procedureCall();

                    state._fsp--;

                    node = procedureCall6;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:186:8: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1625);
                    ifStatement7=ifStatement();

                    state._fsp--;

                    node = ifStatement7;

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:187:8: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1645);
                    whileStatement8=whileStatement();

                    state._fsp--;

                    node = whileStatement8;

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:190:1: assignment returns [Assign node] : ID idSelector[node_id] ASSIGN node_expression= expression ;
    public final Assign assignment() throws RecognitionException {
        Assign node = null;

        Token ID9=null;
        Expression node_expression = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:191:2: ( ID idSelector[node_id] ASSIGN node_expression= expression )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:191:4: ID idSelector[node_id] ASSIGN node_expression= expression
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_assignment1687); 
            ID node_id = new ID((ID9!=null?ID9.getText():null));
            pushFollow(FOLLOW_idSelector_in_assignment1704);
            idSelector(node_id);

            state._fsp--;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment1707); 
            pushFollow(FOLLOW_expression_in_assignment1711);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:194:1: ifStatement returns [If node] : IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END ;
    public final If ifStatement() throws RecognitionException {
        If node = null;

        Expression node_expression = null;

        StatementList node_statements = null;

        IfListForElsIf node_elsifs = null;

        StatementList node_else = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:195:6: ( IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:195:11: IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1737); 
            pushFollow(FOLLOW_expression_in_ifStatement1741);
            node_expression=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement1750); 
            pushFollow(FOLLOW_statements_in_ifStatement1754);
            node_statements=statements();

            state._fsp--;

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:197:7: (node_elsifs= ifElsIfList )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:197:8: node_elsifs= ifElsIfList
            {
            pushFollow(FOLLOW_ifElsIfList_in_ifStatement1766);
            node_elsifs=ifElsIfList();

            state._fsp--;


            }

            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:198:7: ( ELSE node_else= statements )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ELSE) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:198:8: ELSE node_else= statements
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1777); 
                    pushFollow(FOLLOW_statements_in_ifStatement1781);
                    node_else=statements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1785); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:201:1: ifElsIfList returns [IfListForElsIf node] : ( ELSIF node_expression= expression THEN node_statements= statements )* ;
    public final IfListForElsIf ifElsIfList() throws RecognitionException {
        IfListForElsIf node = null;

        Expression node_expression = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:201:43: ( ( ELSIF node_expression= expression THEN node_statements= statements )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:201:50: ( ELSIF node_expression= expression THEN node_statements= statements )*
            {
            node = new IfListForElsIf();
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:202:3: ( ELSIF node_expression= expression THEN node_statements= statements )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ELSIF) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:203:3: ELSIF node_expression= expression THEN node_statements= statements
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifElsIfList1828); 
            	    pushFollow(FOLLOW_expression_in_ifElsIfList1832);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,THEN,FOLLOW_THEN_in_ifElsIfList1834); 
            	    pushFollow(FOLLOW_statements_in_ifElsIfList1838);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:207:1: whileStatement returns [While node] : WHILE node_expression= expression DO node_statements= statements END ;
    public final While whileStatement() throws RecognitionException {
        While node = null;

        Expression node_expression = null;

        StatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:208:2: ( WHILE node_expression= expression DO node_statements= statements END )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:208:4: WHILE node_expression= expression DO node_statements= statements END
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement1865); 
            pushFollow(FOLLOW_expression_in_whileStatement1869);
            node_expression=expression();

            state._fsp--;

            match(input,DO,FOLLOW_DO_in_whileStatement1874); 
            pushFollow(FOLLOW_statements_in_whileStatement1878);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1883); 
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:212:1: id returns [ID node] : ID ;
    public final ID id() throws RecognitionException {
        ID node = null;

        Token ID10=null;

        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:213:2: ( ID )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:213:4: ID
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_id1908); 
            node = new ID((ID10!=null?ID10.getText():null));

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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:215:1: idList returns [IDList node] : node_id1= id ( ',' node_id2= id )* ;
    public final IDList idList() throws RecognitionException {
        IDList node = null;

        ID node_id1 = null;

        ID node_id2 = null;


        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:215:30: (node_id1= id ( ',' node_id2= id )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:215:39: node_id1= id ( ',' node_id2= id )*
            {
            node = new IDList();
            pushFollow(FOLLOW_id_in_idList1945);
            node_id1=id();

            state._fsp--;

            node.add(node_id1);
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:217:3: ( ',' node_id2= id )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:217:4: ',' node_id2= id
            	    {
            	    match(input,49,FOLLOW_49_in_idList1961); 
            	    pushFollow(FOLLOW_id_in_idList1965);
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
    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:220:1: idSelector[ID node_parent] : ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* ;
    public final void idSelector(ID node_parent) throws RecognitionException {
        Token ID11=null;
        Expression node_expression = null;


        ID node_current = node_parent;
        try {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:222:6: ( ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* )
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:222:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            {
            // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:222:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==45) ) {
                    alt26=1;
                }
                else if ( (LA26_0==50) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:222:12: ( '.' ID )
            	    {
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:222:12: ( '.' ID )
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:222:13: '.' ID
            	    {
            	    match(input,45,FOLLOW_45_in_idSelector2016); 
            	    ID11=(Token)match(input,ID,FOLLOW_ID_in_idSelector2018); 
            	    node_current=(ID)node_current.setSub(new ID((ID11!=null?ID11.getText():null)));

            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:223:9: ( '[' node_expression= expression ']' )
            	    {
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:223:9: ( '[' node_expression= expression ']' )
            	    // D:\\Projects UVA\\Oberon0\\src\\uva\\oberon0\\parser\\Oberon.g:223:10: '[' node_expression= expression ']'
            	    {
            	    match(input,50,FOLLOW_50_in_idSelector2040); 
            	    pushFollow(FOLLOW_expression_in_idSelector2044);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,51,FOLLOW_51_in_idSelector2046); 
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


 

    public static final BitSet FOLLOW_MODULE_in_module311 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_id_in_module315 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_module317 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_declarations_in_module323 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_module327 = new BitSet(new long[]{0x0000120E00001100L});
    public static final BitSet FOLLOW_statements_in_module333 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_module337 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_id_in_module339 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_module341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations373 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_varDeclaration_in_declarations376 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declarations379 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration396 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_id_in_constDeclaration401 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_EQUAL_in_constDeclaration403 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_constDeclaration407 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_constDeclaration409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration426 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_idList_in_varDeclaration431 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_varDeclaration433 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_type_in_varDeclaration437 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_varDeclaration439 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration459 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_id_in_procedureDeclaration463 = new BitSet(new long[]{0x0000900000000000L});
    public static final BitSet FOLLOW_47_in_procedureDeclaration466 = new BitSet(new long[]{0x0000120000000080L});
    public static final BitSet FOLLOW_procedureParams_in_procedureDeclaration470 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_procedureDeclaration472 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_procedureDeclaration476 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_declarations_in_procedureDeclaration482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BEGIN_in_procedureDeclaration486 = new BitSet(new long[]{0x0000120E00001100L});
    public static final BitSet FOLLOW_statements_in_procedureDeclaration492 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_procedureDeclaration496 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_id_in_procedureDeclaration498 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_procedureDeclaration500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams535 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_procedureParams539 = new BitSet(new long[]{0x0000120000000080L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams545 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_VAR_in_procedureParam568 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_idList_in_procedureParam576 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedureParam578 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_type_in_procedureParam582 = new BitSet(new long[]{0x0000020000000082L});
    public static final BitSet FOLLOW_CALL_READ_in_procedureCall615 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITE_in_procedureCall636 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITELN_in_procedureCall657 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCall678 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_procedureActualParams710 = new BitSet(new long[]{0x0001860020C00000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams715 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_49_in_procedureActualParams730 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams734 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_48_in_procedureActualParams754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_type802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType828 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_arrayType832 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_OF_in_arrayType834 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_type_in_arrayType838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType867 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_recordField_in_recordType871 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_recordType875 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_recordField_in_recordType877 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_END_in_recordType884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idList_in_recordField913 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_recordField915 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_type_in_recordField919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor945 = new BitSet(new long[]{0x0004200000000000L});
    public static final BitSet FOLLOW_idSelector_in_factor962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_factor992 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_factor994 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_factor996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor1014 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_factor_in_factor1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1051 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_MUL_in_term1069 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_factor_in_term1073 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_DIV_in_term1087 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_factor_in_term1091 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_MOD_in_term1105 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_factor_in_term1109 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_AND_in_term1123 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_factor_in_term1127 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_MIN_in_base1170 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_term_in_base1174 = new BitSet(new long[]{0x0000000010C00002L});
    public static final BitSet FOLLOW_PLUS_in_base1193 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_term_in_base1197 = new BitSet(new long[]{0x0000000010C00002L});
    public static final BitSet FOLLOW_term_in_base1218 = new BitSet(new long[]{0x0000000010C00002L});
    public static final BitSet FOLLOW_MIN_in_base1253 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_term_in_base1257 = new BitSet(new long[]{0x0000000010C00002L});
    public static final BitSet FOLLOW_PLUS_in_base1276 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_term_in_base1280 = new BitSet(new long[]{0x0000000010C00002L});
    public static final BitSet FOLLOW_OR_in_base1299 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_term_in_base1303 = new BitSet(new long[]{0x0000000010C00002L});
    public static final BitSet FOLLOW_base_in_expression1345 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1371 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_base_in_expression1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression1393 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_base_in_expression1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_expression1415 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_base_in_expression1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression1438 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_base_in_expression1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_in_expression1460 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_base_in_expression1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_EQUAL_in_expression1482 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_base_in_expression1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1530 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_statements1544 = new BitSet(new long[]{0x0000120E00001100L});
    public static final BitSet FOLLOW_statement_in_statements1548 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1687 = new BitSet(new long[]{0x0004201000000000L});
    public static final BitSet FOLLOW_idSelector_in_assignment1704 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment1707 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_assignment1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1737 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1741 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1750 = new BitSet(new long[]{0x0000120E00001100L});
    public static final BitSet FOLLOW_statements_in_ifStatement1754 = new BitSet(new long[]{0x0000000000004C00L});
    public static final BitSet FOLLOW_ifElsIfList_in_ifStatement1766 = new BitSet(new long[]{0x0000000000004400L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1777 = new BitSet(new long[]{0x0000120E00001100L});
    public static final BitSet FOLLOW_statements_in_ifStatement1781 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_ifStatement1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_ifElsIfList1828 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_ifElsIfList1832 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_THEN_in_ifElsIfList1834 = new BitSet(new long[]{0x0000120E00001100L});
    public static final BitSet FOLLOW_statements_in_ifElsIfList1838 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1865 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1869 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_whileStatement1874 = new BitSet(new long[]{0x0000120E00001100L});
    public static final BitSet FOLLOW_statements_in_whileStatement1878 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_whileStatement1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_idList1945 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_idList1961 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_id_in_idList1965 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_45_in_idSelector2016 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_idSelector2018 = new BitSet(new long[]{0x0004200000000002L});
    public static final BitSet FOLLOW_50_in_idSelector2040 = new BitSet(new long[]{0x0000860020C00000L});
    public static final BitSet FOLLOW_expression_in_idSelector2044 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_idSelector2046 = new BitSet(new long[]{0x0004200000000002L});

}