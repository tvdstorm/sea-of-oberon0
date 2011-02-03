// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon.g 2011-02-03 15:53:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "CONST", "VAR", "VARREF", "PROCEDURE", "BODY", "EXIT", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "END", "WHILE", "EQUAL", "UNEQUAL", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "MIN", "PLUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "DECLARATIONS", "INPUTVARS", "CALL", "CALL_READ", "CALL_WRITE", "CALL_WRITELN", "ASSIGN", "INTEGER", "ARRAY", "OF", "ID", "INT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'.'", "':'", "'PROCEDURE'", "'('", "')'", "','", "'DO'", "'['", "']'"
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
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int MODULE=4;
    public static final int CONST=5;
    public static final int VAR=6;
    public static final int VARREF=7;
    public static final int PROCEDURE=8;
    public static final int BODY=9;
    public static final int EXIT=10;
    public static final int RETURN=11;
    public static final int IF=12;
    public static final int THEN=13;
    public static final int ELSE=14;
    public static final int ELSIF=15;
    public static final int END=16;
    public static final int WHILE=17;
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
    public static final int ARRAY=40;
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
    public String getGrammarFileName() { return "D:\\Projects UVA\\Oberon.g"; }



    // $ANTLR start "module"
    // D:\\Projects UVA\\Oberon.g:73:1: module returns [Module node] : 'MODULE' node_id= id1 ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 '.' ;
    public final Module module() throws RecognitionException {
        Module node = null;

        ID node_id = null;

        BaseDeclarationList node_declarations = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:74:2: ( 'MODULE' node_id= id1 ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 '.' )
            // D:\\Projects UVA\\Oberon.g:74:4: 'MODULE' node_id= id1 ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 '.'
            {
            match(input,45,FOLLOW_45_in_module299); 
            pushFollow(FOLLOW_id1_in_module303);
            node_id=id1();

            state._fsp--;

            match(input,46,FOLLOW_46_in_module305); 
            pushFollow(FOLLOW_declarations_in_module311);
            node_declarations=declarations();

            state._fsp--;

            match(input,47,FOLLOW_47_in_module315); 
            pushFollow(FOLLOW_statements_in_module321);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_module325); 
            pushFollow(FOLLOW_id1_in_module327);
            id1();

            state._fsp--;

            match(input,48,FOLLOW_48_in_module329); 
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
    // D:\\Projects UVA\\Oberon.g:81:1: declarations returns [BaseDeclarationList node] : ( constDeclaration[node] | varDeclaration[node] | procedure[node] )* ;
    public final BaseDeclarationList declarations() throws RecognitionException {
        BaseDeclarationList node = null;

        try {
            // D:\\Projects UVA\\Oberon.g:82:2: ( ( constDeclaration[node] | varDeclaration[node] | procedure[node] )* )
            // D:\\Projects UVA\\Oberon.g:82:4: ( constDeclaration[node] | varDeclaration[node] | procedure[node] )*
            {
            node = new BaseDeclarationList();
            // D:\\Projects UVA\\Oberon.g:83:3: ( constDeclaration[node] | varDeclaration[node] | procedure[node] )*
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
                case 50:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:83:4: constDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_constDeclaration_in_declarations350);
            	    constDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:83:27: varDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_declarations353);
            	    varDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:83:48: procedure[node]
            	    {
            	    pushFollow(FOLLOW_procedure_in_declarations356);
            	    procedure(node);

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
    // D:\\Projects UVA\\Oberon.g:86:1: constDeclaration[BaseDeclarationList list] : 'CONST' (node_id= id1 '=' node_exp= expression ';' ) ;
    public final void constDeclaration(BaseDeclarationList list) throws RecognitionException {
        ID node_id = null;

        BaseExpression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon.g:87:2: ( 'CONST' (node_id= id1 '=' node_exp= expression ';' ) )
            // D:\\Projects UVA\\Oberon.g:87:4: 'CONST' (node_id= id1 '=' node_exp= expression ';' )
            {
            match(input,CONST,FOLLOW_CONST_in_constDeclaration373); 
            // D:\\Projects UVA\\Oberon.g:87:12: (node_id= id1 '=' node_exp= expression ';' )
            // D:\\Projects UVA\\Oberon.g:87:13: node_id= id1 '=' node_exp= expression ';'
            {
            pushFollow(FOLLOW_id1_in_constDeclaration378);
            node_id=id1();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_constDeclaration380); 
            pushFollow(FOLLOW_expression_in_constDeclaration384);
            node_exp=expression();

            state._fsp--;

            match(input,46,FOLLOW_46_in_constDeclaration386); 

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
    // D:\\Projects UVA\\Oberon.g:90:1: varDeclaration[BaseDeclarationList list] : 'VAR' (node_ids= idList ':' node_type= type ';' )* ;
    public final void varDeclaration(BaseDeclarationList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:91:2: ( 'VAR' (node_ids= idList ':' node_type= type ';' )* )
            // D:\\Projects UVA\\Oberon.g:91:4: 'VAR' (node_ids= idList ':' node_type= type ';' )*
            {
            match(input,VAR,FOLLOW_VAR_in_varDeclaration400); 
            // D:\\Projects UVA\\Oberon.g:91:10: (node_ids= idList ':' node_type= type ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:91:11: node_ids= idList ':' node_type= type ';'
            	    {
            	    pushFollow(FOLLOW_idList_in_varDeclaration405);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_varDeclaration407); 
            	    pushFollow(FOLLOW_type_in_varDeclaration411);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_varDeclaration413); 
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


    // $ANTLR start "procedure"
    // D:\\Projects UVA\\Oberon.g:93:1: procedure[BaseDeclarationList list] : 'PROCEDURE' node_id= id1 ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 ';' ;
    public final void procedure(BaseDeclarationList list) throws RecognitionException {
        ID node_id = null;

        BaseDeclarationList node_params = null;

        BaseDeclarationList node_declarations = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:94:2: ( 'PROCEDURE' node_id= id1 ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 ';' )
            // D:\\Projects UVA\\Oberon.g:94:4: 'PROCEDURE' node_id= id1 ( '(' node_params= procedureParams ')' )? ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 ';'
            {
            match(input,50,FOLLOW_50_in_procedure428); 
            pushFollow(FOLLOW_id1_in_procedure432);
            node_id=id1();

            state._fsp--;

            // D:\\Projects UVA\\Oberon.g:94:28: ( '(' node_params= procedureParams ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==51) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:94:29: '(' node_params= procedureParams ')'
                    {
                    match(input,51,FOLLOW_51_in_procedure435); 
                    pushFollow(FOLLOW_procedureParams_in_procedure439);
                    node_params=procedureParams();

                    state._fsp--;

                    match(input,52,FOLLOW_52_in_procedure441); 

                    }
                    break;

            }

            match(input,46,FOLLOW_46_in_procedure445); 
            pushFollow(FOLLOW_declarations_in_procedure451);
            node_declarations=declarations();

            state._fsp--;

            match(input,47,FOLLOW_47_in_procedure455); 
            pushFollow(FOLLOW_statements_in_procedure461);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_procedure465); 
            pushFollow(FOLLOW_id1_in_procedure467);
            id1();

            state._fsp--;

            match(input,46,FOLLOW_46_in_procedure469); 
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
    // $ANTLR end "procedure"


    // $ANTLR start "procedureParams"
    // D:\\Projects UVA\\Oberon.g:101:1: procedureParams returns [BaseDeclarationList node] : node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* ;
    public final BaseDeclarationList procedureParams() throws RecognitionException {
        BaseDeclarationList node = null;

        try {
            // D:\\Projects UVA\\Oberon.g:102:2: (node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )* )
            // D:\\Projects UVA\\Oberon.g:102:4: node_declaration= procedureParam[node] ( ';' node_declaration= procedureParam[node] )*
            {
            node = new BaseDeclarationList();
            pushFollow(FOLLOW_procedureParam_in_procedureParams493);
            procedureParam(node);

            state._fsp--;

            // D:\\Projects UVA\\Oberon.g:103:43: ( ';' node_declaration= procedureParam[node] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==46) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:103:44: ';' node_declaration= procedureParam[node]
            	    {
            	    match(input,46,FOLLOW_46_in_procedureParams497); 
            	    pushFollow(FOLLOW_procedureParam_in_procedureParams503);
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
    // D:\\Projects UVA\\Oberon.g:106:1: procedureParam[BaseDeclarationList list] : ( ( 'VAR' )? node_ids= idList ':' node_type= type )* ;
    public final void procedureParam(BaseDeclarationList list) throws RecognitionException {
        IDList node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:107:2: ( ( ( 'VAR' )? node_ids= idList ':' node_type= type )* )
            // D:\\Projects UVA\\Oberon.g:107:4: ( ( 'VAR' )? node_ids= idList ':' node_type= type )*
            {
            // D:\\Projects UVA\\Oberon.g:107:4: ( ( 'VAR' )? node_ids= idList ':' node_type= type )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VAR||LA6_0==ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:107:5: ( 'VAR' )? node_ids= idList ':' node_type= type
            	    {
            	    boolean byRef=false;
            	    // D:\\Projects UVA\\Oberon.g:107:28: ( 'VAR' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==VAR) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // D:\\Projects UVA\\Oberon.g:107:29: 'VAR'
            	            {
            	            match(input,VAR,FOLLOW_VAR_in_procedureParam526); 
            	            byRef=true;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_idList_in_procedureParam534);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_procedureParam536); 
            	    pushFollow(FOLLOW_type_in_procedureParam540);
            	    node_type=type();

            	    state._fsp--;

            	    for (ID id : node_ids){ list.add(byRef ? new VariableByRef(id, node_type) : new Variable(id, node_type));}

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
    // D:\\Projects UVA\\Oberon.g:109:1: procedureCall returns [Call node] : ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) ;
    public final Call procedureCall() throws RecognitionException {
        Call node = null;

        Token ID1=null;
        CallActualParameterList call_vars = null;


        try {
            // D:\\Projects UVA\\Oberon.g:110:6: ( ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? ) )
            // D:\\Projects UVA\\Oberon.g:110:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
            {
            // D:\\Projects UVA\\Oberon.g:110:11: ( CALL_READ (call_vars= procedureActualParams )? | CALL_WRITE (call_vars= procedureActualParams )? | CALL_WRITELN (call_vars= procedureActualParams )? | ID (call_vars= procedureActualParams )? )
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
                    // D:\\Projects UVA\\Oberon.g:111:8: CALL_READ (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_READ,FOLLOW_CALL_READ_in_procedureCall573); 
                    // D:\\Projects UVA\\Oberon.g:111:18: (call_vars= procedureActualParams )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==51) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon.g:111:19: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall578);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallRead(call_vars);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:112:9: CALL_WRITE (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITE,FOLLOW_CALL_WRITE_in_procedureCall592); 
                    // D:\\Projects UVA\\Oberon.g:112:20: (call_vars= procedureActualParams )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==51) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon.g:112:21: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall597);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWrite(call_vars);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:113:9: CALL_WRITELN (call_vars= procedureActualParams )?
                    {
                    match(input,CALL_WRITELN,FOLLOW_CALL_WRITELN_in_procedureCall611); 
                    // D:\\Projects UVA\\Oberon.g:113:22: (call_vars= procedureActualParams )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==51) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon.g:113:23: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall616);
                            call_vars=procedureActualParams();

                            state._fsp--;


                            }
                            break;

                    }

                    node = new CallWriteLn(call_vars);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:114:9: ID (call_vars= procedureActualParams )?
                    {
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_procedureCall630); 
                    // D:\\Projects UVA\\Oberon.g:114:13: (call_vars= procedureActualParams )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==51) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\Projects UVA\\Oberon.g:114:14: call_vars= procedureActualParams
                            {
                            pushFollow(FOLLOW_procedureActualParams_in_procedureCall636);
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
    // D:\\Projects UVA\\Oberon.g:117:1: procedureActualParams returns [CallActualParameterList node] : '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' ;
    public final CallActualParameterList procedureActualParams() throws RecognitionException {
        CallActualParameterList node = null;

        BaseExpression node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon.g:118:2: ( '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' )
            // D:\\Projects UVA\\Oberon.g:118:3: '(' (node_exp= expression ( ',' node_exp= expression )* )? ')'
            {
            match(input,51,FOLLOW_51_in_procedureActualParams660); 
            // D:\\Projects UVA\\Oberon.g:118:7: (node_exp= expression ( ',' node_exp= expression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=MIN && LA13_0<=PLUS)||LA13_0==NOT||(LA13_0>=ID && LA13_0<=INT)||LA13_0==51) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:118:8: node_exp= expression ( ',' node_exp= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureActualParams665);
                    node_exp=expression();

                    state._fsp--;

                    node =new CallActualParameterList(); node.add(node_exp);
                    // D:\\Projects UVA\\Oberon.g:119:3: ( ',' node_exp= expression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==53) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\Projects UVA\\Oberon.g:119:4: ',' node_exp= expression
                    	    {
                    	    match(input,53,FOLLOW_53_in_procedureActualParams672); 
                    	    pushFollow(FOLLOW_expression_in_procedureActualParams676);
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

            match(input,52,FOLLOW_52_in_procedureActualParams685); 

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
    // D:\\Projects UVA\\Oberon.g:122:1: type returns [BaseType node] : ( ARRAY node_exp= expression OF node_type= type | INTEGER );
    public final BaseType type() throws RecognitionException {
        BaseType node = null;

        BaseExpression node_exp = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:123:2: ( ARRAY node_exp= expression OF node_type= type | INTEGER )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ARRAY) ) {
                alt14=1;
            }
            else if ( (LA14_0==INTEGER) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:123:4: ARRAY node_exp= expression OF node_type= type
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_type701); 
                    pushFollow(FOLLOW_expression_in_type705);
                    node_exp=expression();

                    state._fsp--;

                    match(input,OF,FOLLOW_OF_in_type707); 
                    pushFollow(FOLLOW_type_in_type711);
                    node_type=type();

                    state._fsp--;

                    node = new ArrayType(node_exp, node_type);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:124:4: INTEGER
                    {
                    match(input,INTEGER,FOLLOW_INTEGER_in_type718); 
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


    // $ANTLR start "factor"
    // D:\\Projects UVA\\Oberon.g:127:1: factor returns [BaseExpression node] : ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) );
    public final BaseExpression factor() throws RecognitionException {
        BaseExpression node = null;

        Token ID2=null;
        Token INT3=null;
        BaseExpression unary = null;

        BaseExpression expression4 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:128:2: ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt15=1;
                }
                break;
            case INT:
                {
                alt15=2;
                }
                break;
            case 51:
                {
                alt15=3;
                }
                break;
            case NOT:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:128:7: ID idSelector[node_id]
                    {
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_factor745); 
                    ID node_id = new ID((ID2!=null?ID2.getText():null)); node = new Reference(node_id);
                    pushFollow(FOLLOW_idSelector_in_factor756);
                    idSelector(node_id);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:130:5: INT
                    {
                    INT3=(Token)match(input,INT,FOLLOW_INT_in_factor767); 
                    node = new IntegerValue((INT3!=null?INT3.getText():null));

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:131:5: ( '(' expression ')' )
                    {
                    // D:\\Projects UVA\\Oberon.g:131:5: ( '(' expression ')' )
                    // D:\\Projects UVA\\Oberon.g:131:6: '(' expression ')'
                    {
                    match(input,51,FOLLOW_51_in_factor780); 
                    pushFollow(FOLLOW_expression_in_factor782);
                    expression4=expression();

                    state._fsp--;

                    match(input,52,FOLLOW_52_in_factor784); 
                    node =expression4;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:132:5: ( NOT unary= factor )
                    {
                    // D:\\Projects UVA\\Oberon.g:132:5: ( NOT unary= factor )
                    // D:\\Projects UVA\\Oberon.g:132:6: NOT unary= factor
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor796); 
                    pushFollow(FOLLOW_factor_in_factor800);
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
    // D:\\Projects UVA\\Oberon.g:135:1: term returns [BaseExpression node] : left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* ;
    public final BaseExpression term() throws RecognitionException {
        BaseExpression node = null;

        BaseExpression left = null;

        BaseExpression right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:136:2: (left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* )
            // D:\\Projects UVA\\Oberon.g:136:7: left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            {
            pushFollow(FOLLOW_factor_in_term827);
            left=factor();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon.g:137:2: ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            loop16:
            do {
                int alt16=5;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt16=1;
                    }
                    break;
                case DIV:
                    {
                    alt16=2;
                    }
                    break;
                case MOD:
                    {
                    alt16=3;
                    }
                    break;
                case AND:
                    {
                    alt16=4;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:138:3: MUL right= factor
            	    {
            	    match(input,MUL,FOLLOW_MUL_in_term839); 
            	    pushFollow(FOLLOW_factor_in_term843);
            	    right=factor();

            	    state._fsp--;

            	    node =new Multiplication(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:139:4: DIV right= factor
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_term851); 
            	    pushFollow(FOLLOW_factor_in_term855);
            	    right=factor();

            	    state._fsp--;

            	    node =new Division(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:140:4: MOD right= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term863); 
            	    pushFollow(FOLLOW_factor_in_term867);
            	    right=factor();

            	    state._fsp--;

            	    node =new Modulo(node, right);

            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon.g:141:4: AND right= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term875); 
            	    pushFollow(FOLLOW_factor_in_term879);
            	    right=factor();

            	    state._fsp--;

            	    node =new LogicalAnd(node, right);

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // D:\\Projects UVA\\Oberon.g:144:1: base returns [BaseExpression node] : ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* ;
    public final BaseExpression base() throws RecognitionException {
        BaseExpression node = null;

        BaseExpression left = null;

        BaseExpression right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:145:6: ( ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* )
            // D:\\Projects UVA\\Oberon.g:145:11: ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )*
            {
            // D:\\Projects UVA\\Oberon.g:145:11: ( MIN left= term | PLUS left= term | left= term )
            int alt17=3;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt17=1;
                }
                break;
            case PLUS:
                {
                alt17=2;
                }
                break;
            case NOT:
            case ID:
            case INT:
            case 51:
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
                    // D:\\Projects UVA\\Oberon.g:146:7: MIN left= term
                    {
                    match(input,MIN,FOLLOW_MIN_in_base916); 
                    pushFollow(FOLLOW_term_in_base920);
                    left=term();

                    state._fsp--;

                    node =new Negative(left);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:147:8: PLUS left= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_base933); 
                    pushFollow(FOLLOW_term_in_base937);
                    left=term();

                    state._fsp--;

                    node =new Positive(left);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:148:8: left= term
                    {
                    pushFollow(FOLLOW_term_in_base952);
                    left=term();

                    state._fsp--;

                    node =left;

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon.g:150:8: ( MIN right= term | PLUS right= term | OR right= term )*
            loop18:
            do {
                int alt18=4;
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
                case OR:
                    {
                    alt18=3;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:151:7: MIN right= term
            	    {
            	    match(input,MIN,FOLLOW_MIN_in_base981); 
            	    pushFollow(FOLLOW_term_in_base985);
            	    right=term();

            	    state._fsp--;

            	    node =new Subtraction(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:152:8: PLUS right= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_base998); 
            	    pushFollow(FOLLOW_term_in_base1002);
            	    right=term();

            	    state._fsp--;

            	    node =new Addition(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:153:8: OR right= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_base1015); 
            	    pushFollow(FOLLOW_term_in_base1019);
            	    right=term();

            	    state._fsp--;

            	    node =new LogicalOr(node, right);

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // D:\\Projects UVA\\Oberon.g:156:1: expression returns [BaseExpression node] : left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? ;
    public final BaseExpression expression() throws RecognitionException {
        BaseExpression node = null;

        BaseExpression left = null;

        BaseExpression right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:157:6: (left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? )
            // D:\\Projects UVA\\Oberon.g:157:10: left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            {
            pushFollow(FOLLOW_base_in_expression1055);
            left=base();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon.g:158:6: ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            int alt19=7;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt19=1;
                    }
                    break;
                case UNEQUAL:
                    {
                    alt19=2;
                    }
                    break;
                case LESS:
                    {
                    alt19=3;
                    }
                    break;
                case LESS_EQUAL:
                    {
                    alt19=4;
                    }
                    break;
                case GREAT:
                    {
                    alt19=5;
                    }
                    break;
                case GREAT_EQUAL:
                    {
                    alt19=6;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:159:7: EQUAL right= base
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression1075); 
                    pushFollow(FOLLOW_base_in_expression1079);
                    right=base();

                    state._fsp--;

                    node =new Equal(node, right);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:160:8: UNEQUAL right= base
                    {
                    match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression1091); 
                    pushFollow(FOLLOW_base_in_expression1095);
                    right=base();

                    state._fsp--;

                    node =new NotEqual(node, right);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:161:8: LESS right= base
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression1107); 
                    pushFollow(FOLLOW_base_in_expression1111);
                    right=base();

                    state._fsp--;

                    node =new LessThan(node, right);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:162:8: LESS_EQUAL right= base
                    {
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression1124); 
                    pushFollow(FOLLOW_base_in_expression1128);
                    right=base();

                    state._fsp--;

                    node =new LessThanOrEqualTo(node, right);

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon.g:163:8: GREAT right= base
                    {
                    match(input,GREAT,FOLLOW_GREAT_in_expression1140); 
                    pushFollow(FOLLOW_base_in_expression1144);
                    right=base();

                    state._fsp--;

                    node =new GreatherThan(node, right);

                    }
                    break;
                case 6 :
                    // D:\\Projects UVA\\Oberon.g:164:8: GREAT_EQUAL right= base
                    {
                    match(input,GREAT_EQUAL,FOLLOW_GREAT_EQUAL_in_expression1156); 
                    pushFollow(FOLLOW_base_in_expression1160);
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
    // D:\\Projects UVA\\Oberon.g:167:1: statements returns [BaseStatementList node] : node_statement= statement ( ';' node_statement= statement )* ;
    public final BaseStatementList statements() throws RecognitionException {
        BaseStatementList node = null;

        BaseStatement node_statement = null;


        try {
            // D:\\Projects UVA\\Oberon.g:168:2: (node_statement= statement ( ';' node_statement= statement )* )
            // D:\\Projects UVA\\Oberon.g:168:4: node_statement= statement ( ';' node_statement= statement )*
            {
            node = new BaseStatementList();
            pushFollow(FOLLOW_statement_in_statements1194);
            node_statement=statement();

            state._fsp--;

            node.add(node_statement);
            // D:\\Projects UVA\\Oberon.g:170:3: ( ';' node_statement= statement )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:170:4: ';' node_statement= statement
            	    {
            	    match(input,46,FOLLOW_46_in_statements1201); 
            	    pushFollow(FOLLOW_statement_in_statements1205);
            	    node_statement=statement();

            	    state._fsp--;

            	    node.add(node_statement);

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // D:\\Projects UVA\\Oberon.g:173:1: statement returns [BaseStatement node] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final BaseStatement statement() throws RecognitionException {
        BaseStatement node = null;

        Assign assignment5 = null;

        Call procedureCall6 = null;

        If ifStatement7 = null;

        While whileStatement8 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:174:5: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\Projects UVA\\Oberon.g:174:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // D:\\Projects UVA\\Oberon.g:174:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt21=5;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==ASSIGN||LA21_1==48||LA21_1==55) ) {
                        alt21=1;
                    }
                    else if ( ((LA21_1>=ELSE && LA21_1<=END)||LA21_1==46||LA21_1==51) ) {
                        alt21=2;
                    }
                    }
                    break;
                case CALL_READ:
                case CALL_WRITE:
                case CALL_WRITELN:
                    {
                    alt21=2;
                    }
                    break;
                case IF:
                    {
                    alt21=3;
                    }
                    break;
                case WHILE:
                    {
                    alt21=4;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:175:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1235);
                    assignment5=assignment();

                    state._fsp--;

                    node = assignment5;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:176:8: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1251);
                    procedureCall6=procedureCall();

                    state._fsp--;

                    node = procedureCall6;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:177:8: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1267);
                    ifStatement7=ifStatement();

                    state._fsp--;

                    node = ifStatement7;

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:178:8: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1283);
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
    // D:\\Projects UVA\\Oberon.g:181:1: assignment returns [Assign node] : ID idSelector[node_id] ASSIGN node_expression= expression ;
    public final Assign assignment() throws RecognitionException {
        Assign node = null;

        Token ID9=null;
        BaseExpression node_expression = null;


        try {
            // D:\\Projects UVA\\Oberon.g:182:2: ( ID idSelector[node_id] ASSIGN node_expression= expression )
            // D:\\Projects UVA\\Oberon.g:182:4: ID idSelector[node_id] ASSIGN node_expression= expression
            {
            ID9=(Token)match(input,ID,FOLLOW_ID_in_assignment1321); 
            ID node_id = new ID((ID9!=null?ID9.getText():null));
            pushFollow(FOLLOW_idSelector_in_assignment1328);
            idSelector(node_id);

            state._fsp--;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment1331); 
            pushFollow(FOLLOW_expression_in_assignment1335);
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
    // D:\\Projects UVA\\Oberon.g:185:1: ifStatement returns [If node] : IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END ;
    public final If ifStatement() throws RecognitionException {
        If node = null;

        BaseExpression node_expression = null;

        BaseStatementList node_statements = null;

        IfListForElsIf node_elsifs = null;

        BaseStatementList node_else = null;


        try {
            // D:\\Projects UVA\\Oberon.g:186:6: ( IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END )
            // D:\\Projects UVA\\Oberon.g:186:11: IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1357); 
            pushFollow(FOLLOW_expression_in_ifStatement1361);
            node_expression=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement1363); 
            pushFollow(FOLLOW_statements_in_ifStatement1367);
            node_statements=statements();

            state._fsp--;

            // D:\\Projects UVA\\Oberon.g:186:73: (node_elsifs= ifElsIfList )
            // D:\\Projects UVA\\Oberon.g:186:74: node_elsifs= ifElsIfList
            {
            pushFollow(FOLLOW_ifElsIfList_in_ifStatement1372);
            node_elsifs=ifElsIfList();

            state._fsp--;


            }

            // D:\\Projects UVA\\Oberon.g:186:99: ( ELSE node_else= statements )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ELSE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:186:100: ELSE node_else= statements
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1376); 
                    pushFollow(FOLLOW_statements_in_ifStatement1380);
                    node_else=statements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1384); 
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
    // D:\\Projects UVA\\Oberon.g:189:1: ifElsIfList returns [IfListForElsIf node] : ( ELSIF node_expression= expression THEN node_statements= statements )* ;
    public final IfListForElsIf ifElsIfList() throws RecognitionException {
        IfListForElsIf node = null;

        BaseExpression node_expression = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:190:2: ( ( ELSIF node_expression= expression THEN node_statements= statements )* )
            // D:\\Projects UVA\\Oberon.g:190:4: ( ELSIF node_expression= expression THEN node_statements= statements )*
            {
            node = new IfListForElsIf();
            // D:\\Projects UVA\\Oberon.g:191:3: ( ELSIF node_expression= expression THEN node_statements= statements )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ELSIF) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:192:3: ELSIF node_expression= expression THEN node_statements= statements
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifElsIfList1412); 
            	    pushFollow(FOLLOW_expression_in_ifElsIfList1416);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,THEN,FOLLOW_THEN_in_ifElsIfList1418); 
            	    pushFollow(FOLLOW_statements_in_ifElsIfList1422);
            	    node_statements=statements();

            	    state._fsp--;

            	    node.add(new IfPartForElsIf(node_expression, node_statements));

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // D:\\Projects UVA\\Oberon.g:196:1: whileStatement returns [While node] : 'WHILE' node_expression= expression 'DO' node_statements= statements 'END' ;
    public final While whileStatement() throws RecognitionException {
        While node = null;

        BaseExpression node_expression = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:197:2: ( 'WHILE' node_expression= expression 'DO' node_statements= statements 'END' )
            // D:\\Projects UVA\\Oberon.g:197:4: 'WHILE' node_expression= expression 'DO' node_statements= statements 'END'
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement1447); 
            pushFollow(FOLLOW_expression_in_whileStatement1451);
            node_expression=expression();

            state._fsp--;

            match(input,54,FOLLOW_54_in_whileStatement1453); 
            pushFollow(FOLLOW_statements_in_whileStatement1457);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1459); 
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


    // $ANTLR start "id1"
    // D:\\Projects UVA\\Oberon.g:200:1: id1 returns [ID node] : ID ;
    public final ID id1() throws RecognitionException {
        ID node = null;

        Token ID10=null;

        try {
            // D:\\Projects UVA\\Oberon.g:201:2: ( ID )
            // D:\\Projects UVA\\Oberon.g:201:4: ID
            {
            ID10=(Token)match(input,ID,FOLLOW_ID_in_id11476); 
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
    // $ANTLR end "id1"


    // $ANTLR start "idList"
    // D:\\Projects UVA\\Oberon.g:204:1: idList returns [IDList node] : node_id1= id1 ( ',' node_id2= id1 )* ;
    public final IDList idList() throws RecognitionException {
        IDList node = null;

        ID node_id1 = null;

        ID node_id2 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:205:2: (node_id1= id1 ( ',' node_id2= id1 )* )
            // D:\\Projects UVA\\Oberon.g:205:4: node_id1= id1 ( ',' node_id2= id1 )*
            {
            node = new IDList();
            pushFollow(FOLLOW_id1_in_idList1499);
            node_id1=id1();

            state._fsp--;

            node.add(node_id1);
            // D:\\Projects UVA\\Oberon.g:207:3: ( ',' node_id2= id1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==53) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:207:4: ',' node_id2= id1
            	    {
            	    match(input,53,FOLLOW_53_in_idList1506); 
            	    pushFollow(FOLLOW_id1_in_idList1510);
            	    node_id2=id1();

            	    state._fsp--;

            	    node.add(node_id2);

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
    // $ANTLR end "idList"


    // $ANTLR start "id"
    // D:\\Projects UVA\\Oberon.g:209:1: id returns [ID node] : ID idSelector[$node] ;
    public final ID id() throws RecognitionException {
        ID node = null;

        Token ID11=null;

        try {
            // D:\\Projects UVA\\Oberon.g:210:2: ( ID idSelector[$node] )
            // D:\\Projects UVA\\Oberon.g:210:4: ID idSelector[$node]
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_id1527); 
            node = new ID((ID11!=null?ID11.getText():null));
            pushFollow(FOLLOW_idSelector_in_id1533);
            idSelector(node);

            state._fsp--;


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


    // $ANTLR start "idSelector"
    // D:\\Projects UVA\\Oberon.g:213:1: idSelector[ID node_parent] : ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* ;
    public final void idSelector(ID node_parent) throws RecognitionException {
        Token ID12=null;
        BaseExpression node_expression = null;


        ID node_current = node_parent;
        try {
            // D:\\Projects UVA\\Oberon.g:215:6: ( ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* )
            // D:\\Projects UVA\\Oberon.g:215:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            {
            // D:\\Projects UVA\\Oberon.g:215:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==48) ) {
                    alt25=1;
                }
                else if ( (LA25_0==55) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:215:12: ( '.' ID )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:215:12: ( '.' ID )
            	    // D:\\Projects UVA\\Oberon.g:215:13: '.' ID
            	    {
            	    match(input,48,FOLLOW_48_in_idSelector1560); 
            	    ID12=(Token)match(input,ID,FOLLOW_ID_in_idSelector1562); 

            	    }

            	    node_current=(ID)node_current.setSub(new ID((ID12!=null?ID12.getText():null)));

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:216:9: ( '[' node_expression= expression ']' )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:216:9: ( '[' node_expression= expression ']' )
            	    // D:\\Projects UVA\\Oberon.g:216:10: '[' node_expression= expression ']'
            	    {
            	    match(input,55,FOLLOW_55_in_idSelector1576); 
            	    pushFollow(FOLLOW_expression_in_idSelector1580);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,56,FOLLOW_56_in_idSelector1582); 
            	    node_current.setSub(node_expression);

            	    }


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
        return ;
    }
    // $ANTLR end "idSelector"

    // Delegated rules


 

    public static final BitSet FOLLOW_45_in_module299 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_module303 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_module305 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_module311 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_module315 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_module321 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_module325 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_module327 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_module329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations350 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_varDeclaration_in_declarations353 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_procedure_in_declarations356 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration373 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_constDeclaration378 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_constDeclaration380 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_constDeclaration384 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_constDeclaration386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration400 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_idList_in_varDeclaration405 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclaration407 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_type_in_varDeclaration411 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_varDeclaration413 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_50_in_procedure428 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_procedure432 = new BitSet(new long[]{0x0008400000000000L});
    public static final BitSet FOLLOW_51_in_procedure435 = new BitSet(new long[]{0x0000440000000040L});
    public static final BitSet FOLLOW_procedureParams_in_procedure439 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_procedure441 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure445 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_procedure451 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_procedure455 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_procedure461 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_procedure465 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_procedure467 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams493 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_procedureParams497 = new BitSet(new long[]{0x0000440000000040L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams503 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VAR_in_procedureParam526 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_idList_in_procedureParam534 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureParam536 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_type_in_procedureParam540 = new BitSet(new long[]{0x0000040000000042L});
    public static final BitSet FOLLOW_CALL_READ_in_procedureCall573 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITE_in_procedureCall592 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WRITELN_in_procedureCall611 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCall630 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_procedureActualParams660 = new BitSet(new long[]{0x00180C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams665 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_procedureActualParams672 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams676 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_procedureActualParams685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_type701 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_type705 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_type707 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_type_in_type711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_type718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor745 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_idSelector_in_factor756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_factor780 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_factor782 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_factor784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor796 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_factor800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term827 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MUL_in_term839 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term843 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_DIV_in_term851 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term855 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MOD_in_term863 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term867 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_AND_in_term875 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term879 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MIN_in_base916 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base920 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base933 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base937 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_term_in_base952 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_MIN_in_base981 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base985 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base998 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1002 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_OR_in_base1015 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1019 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_base_in_expression1055 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1075 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression1091 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_expression1107 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression1124 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_in_expression1140 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_EQUAL_in_expression1156 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1194 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_statements1201 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statement_in_statements1205 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1321 = new BitSet(new long[]{0x0081004000000000L});
    public static final BitSet FOLLOW_idSelector_in_assignment1328 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment1331 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_assignment1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1357 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1363 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifStatement1367 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ifElsIfList_in_ifStatement1372 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1376 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifStatement1380 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ifStatement1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_ifElsIfList1412 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifElsIfList1416 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_THEN_in_ifElsIfList1418 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifElsIfList1422 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1447 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1451 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_whileStatement1453 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_whileStatement1457 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_whileStatement1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id11476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id1_in_idList1499 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_idList1506 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_idList1510 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ID_in_id1527 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_idSelector_in_id1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_idSelector1560 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_idSelector1562 = new BitSet(new long[]{0x0081000000000002L});
    public static final BitSet FOLLOW_55_in_idSelector1576 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_idSelector1580 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_idSelector1582 = new BitSet(new long[]{0x0081000000000002L});

}