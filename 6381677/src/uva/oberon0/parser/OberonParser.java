// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon.g 2011-02-03 12:08:16

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

@SuppressWarnings("unused")
public class OberonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "CONST", "VAR", "VARREF", "PROCEDURE", "BODY", "EXIT", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "END", "WHILE", "EQUAL", "UNEQUAL", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "MIN", "PLUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "DECLARATIONS", "INPUTVARS", "CALL", "CALL_READ", "CALL_WRITE", "CALL_WRITELN", "ASSIGN", "INT_TYPE", "ARRAY", "OF", "ID", "INT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'.'", "':'", "'PROCEDURE'", "'('", "')'", "','", "'DO'", "'['", "']'"
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
    public static final int INT_TYPE=39;
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
            match(input,45,FOLLOW_45_in_module298); 
            pushFollow(FOLLOW_id1_in_module302);
            node_id=id1();

            state._fsp--;

            match(input,46,FOLLOW_46_in_module304); 
            pushFollow(FOLLOW_declarations_in_module310);
            node_declarations=declarations();

            state._fsp--;

            match(input,47,FOLLOW_47_in_module314); 
            pushFollow(FOLLOW_statements_in_module320);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_module324); 
            pushFollow(FOLLOW_id1_in_module326);
            id1();

            state._fsp--;

            match(input,48,FOLLOW_48_in_module328); 
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
            	    pushFollow(FOLLOW_constDeclaration_in_declarations349);
            	    constDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:83:27: varDeclaration[node]
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_declarations352);
            	    varDeclaration(node);

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:83:48: procedure[node]
            	    {
            	    pushFollow(FOLLOW_procedure_in_declarations355);
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

        BaseNode node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon.g:87:2: ( 'CONST' (node_id= id1 '=' node_exp= expression ';' ) )
            // D:\\Projects UVA\\Oberon.g:87:4: 'CONST' (node_id= id1 '=' node_exp= expression ';' )
            {
            match(input,CONST,FOLLOW_CONST_in_constDeclaration372); 
            // D:\\Projects UVA\\Oberon.g:87:12: (node_id= id1 '=' node_exp= expression ';' )
            // D:\\Projects UVA\\Oberon.g:87:13: node_id= id1 '=' node_exp= expression ';'
            {
            pushFollow(FOLLOW_id1_in_constDeclaration377);
            node_id=id1();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_constDeclaration379); 
            pushFollow(FOLLOW_expression_in_constDeclaration383);
            node_exp=expression();

            state._fsp--;

            match(input,46,FOLLOW_46_in_constDeclaration385); 

            }

            list.add(new Const(node_id, node_exp));

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
            match(input,VAR,FOLLOW_VAR_in_varDeclaration399); 
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
            	    pushFollow(FOLLOW_idList_in_varDeclaration404);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_varDeclaration406); 
            	    pushFollow(FOLLOW_type_in_varDeclaration410);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_varDeclaration412); 
            	    for (ID id : node_ids){ list.add(new Var(id, node_type));}

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
            match(input,50,FOLLOW_50_in_procedure427); 
            pushFollow(FOLLOW_id1_in_procedure431);
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
                    match(input,51,FOLLOW_51_in_procedure434); 
                    pushFollow(FOLLOW_procedureParams_in_procedure438);
                    node_params=procedureParams();

                    state._fsp--;

                    match(input,52,FOLLOW_52_in_procedure440); 

                    }
                    break;

            }

            match(input,46,FOLLOW_46_in_procedure444); 
            pushFollow(FOLLOW_declarations_in_procedure450);
            node_declarations=declarations();

            state._fsp--;

            match(input,47,FOLLOW_47_in_procedure454); 
            pushFollow(FOLLOW_statements_in_procedure460);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_procedure464); 
            pushFollow(FOLLOW_id1_in_procedure466);
            id1();

            state._fsp--;

            match(input,46,FOLLOW_46_in_procedure468); 
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
            pushFollow(FOLLOW_procedureParam_in_procedureParams492);
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
            	    match(input,46,FOLLOW_46_in_procedureParams496); 
            	    pushFollow(FOLLOW_procedureParam_in_procedureParams502);
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
            	            match(input,VAR,FOLLOW_VAR_in_procedureParam525); 
            	            byRef=true;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_idList_in_procedureParam533);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_procedureParam535); 
            	    pushFollow(FOLLOW_type_in_procedureParam539);
            	    node_type=type();

            	    state._fsp--;

            	    for (ID id : node_ids){ list.add(byRef ? new VarRef(id, node_type) : new Var(id, node_type));}

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
    // D:\\Projects UVA\\Oberon.g:109:1: procedureCall returns [Call node] : ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID ) (call_vars= procedureActualParams )? ;
    public final Call procedureCall() throws RecognitionException {
        Call node = null;

        Token ID1=null;
        CallActualParameters call_vars = null;


        try {
            // D:\\Projects UVA\\Oberon.g:110:6: ( ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID ) (call_vars= procedureActualParams )? )
            // D:\\Projects UVA\\Oberon.g:110:11: ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID ) (call_vars= procedureActualParams )?
            {
            // D:\\Projects UVA\\Oberon.g:110:11: ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID )
            int alt7=4;
            switch ( input.LA(1) ) {
            case CALL_READ:
                {
                alt7=1;
                }
                break;
            case CALL_WRITE:
                {
                alt7=2;
                }
                break;
            case CALL_WRITELN:
                {
                alt7=3;
                }
                break;
            case ID:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:111:8: CALL_READ
                    {
                    match(input,CALL_READ,FOLLOW_CALL_READ_in_procedureCall572); 
                    node = new CallRead();

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:112:9: CALL_WRITE
                    {
                    match(input,CALL_WRITE,FOLLOW_CALL_WRITE_in_procedureCall584); 
                    node = new CallWrite();

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:113:9: CALL_WRITELN
                    {
                    match(input,CALL_WRITELN,FOLLOW_CALL_WRITELN_in_procedureCall596); 
                    node = new CallWriteLn();

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:114:9: ID
                    {
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_procedureCall608); 
                    node = new CallProcedure(new ID((ID1!=null?ID1.getText():null)));

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon.g:116:7: (call_vars= procedureActualParams )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==51) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:116:8: call_vars= procedureActualParams
                    {
                    pushFollow(FOLLOW_procedureActualParams_in_procedureCall630);
                    call_vars=procedureActualParams();

                    state._fsp--;

                    node.setCallActualParameters(call_vars);

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
    // D:\\Projects UVA\\Oberon.g:118:1: procedureActualParams returns [CallActualParameters node] : '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' ;
    public final CallActualParameters procedureActualParams() throws RecognitionException {
        CallActualParameters node = null;

        BaseNode node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon.g:119:2: ( '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' )
            // D:\\Projects UVA\\Oberon.g:119:3: '(' (node_exp= expression ( ',' node_exp= expression )* )? ')'
            {
            match(input,51,FOLLOW_51_in_procedureActualParams647); 
            // D:\\Projects UVA\\Oberon.g:119:7: (node_exp= expression ( ',' node_exp= expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=MIN && LA10_0<=PLUS)||LA10_0==NOT||(LA10_0>=ID && LA10_0<=INT)||LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:119:8: node_exp= expression ( ',' node_exp= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureActualParams652);
                    node_exp=expression();

                    state._fsp--;

                    node =new CallActualParameters(); node.getItems().add(node_exp);
                    // D:\\Projects UVA\\Oberon.g:120:3: ( ',' node_exp= expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==53) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\Projects UVA\\Oberon.g:120:4: ',' node_exp= expression
                    	    {
                    	    match(input,53,FOLLOW_53_in_procedureActualParams659); 
                    	    pushFollow(FOLLOW_expression_in_procedureActualParams663);
                    	    node_exp=expression();

                    	    state._fsp--;

                    	    node.getItems().add(node_exp);

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_procedureActualParams672); 

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
    // D:\\Projects UVA\\Oberon.g:123:1: type returns [BaseType node] : ( arrayType | INT_TYPE );
    public final BaseType type() throws RecognitionException {
        BaseType node = null;

        ArrayType arrayType2 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:124:2: ( arrayType | INT_TYPE )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ARRAY) ) {
                alt11=1;
            }
            else if ( (LA11_0==INT_TYPE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:124:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type688);
                    arrayType2=arrayType();

                    state._fsp--;

                    node = arrayType2;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:125:4: INT_TYPE
                    {
                    match(input,INT_TYPE,FOLLOW_INT_TYPE_in_type695); 
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
    // D:\\Projects UVA\\Oberon.g:128:1: arrayType returns [ArrayType node] : ARRAY node_exp= expression OF node_type= type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType node = null;

        BaseNode node_exp = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:129:2: ( ARRAY node_exp= expression OF node_type= type )
            // D:\\Projects UVA\\Oberon.g:129:4: ARRAY node_exp= expression OF node_type= type
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_arrayType713); 
            pushFollow(FOLLOW_expression_in_arrayType717);
            node_exp=expression();

            state._fsp--;

            match(input,OF,FOLLOW_OF_in_arrayType719); 
            pushFollow(FOLLOW_type_in_arrayType723);
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


    // $ANTLR start "intType"
    // D:\\Projects UVA\\Oberon.g:132:1: intType : INT_TYPE ;
    public final void intType() throws RecognitionException {
        try {
            // D:\\Projects UVA\\Oberon.g:132:9: ( INT_TYPE )
            // D:\\Projects UVA\\Oberon.g:132:11: INT_TYPE
            {
            match(input,INT_TYPE,FOLLOW_INT_TYPE_in_intType735); 

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
    // $ANTLR end "intType"


    // $ANTLR start "number"
    // D:\\Projects UVA\\Oberon.g:134:1: number returns [IntValue node] : INT ;
    public final IntValue number() throws RecognitionException {
        IntValue node = null;

        Token INT3=null;

        try {
            // D:\\Projects UVA\\Oberon.g:135:2: ( INT )
            // D:\\Projects UVA\\Oberon.g:135:4: INT
            {
            INT3=(Token)match(input,INT,FOLLOW_INT_in_number748); 
            node = new IntValue((INT3!=null?INT3.getText():null));

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


    // $ANTLR start "factor"
    // D:\\Projects UVA\\Oberon.g:138:1: factor returns [BaseNode node] : ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) );
    public final BaseNode factor() throws RecognitionException {
        BaseNode node = null;

        Token ID4=null;
        Token INT5=null;
        BaseNode unary = null;

        BaseNode expression6 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:139:2: ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt12=1;
                }
                break;
            case INT:
                {
                alt12=2;
                }
                break;
            case 51:
                {
                alt12=3;
                }
                break;
            case NOT:
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
                    // D:\\Projects UVA\\Oberon.g:139:7: ID idSelector[node_id]
                    {
                    ID4=(Token)match(input,ID,FOLLOW_ID_in_factor772); 
                    ID node_id = new ID((ID4!=null?ID4.getText():null));
                    pushFollow(FOLLOW_idSelector_in_factor783);
                    idSelector(node_id);

                    state._fsp--;

                    node = node_id;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:141:5: INT
                    {
                    INT5=(Token)match(input,INT,FOLLOW_INT_in_factor795); 
                    node = new IntValue((INT5!=null?INT5.getText():null));

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:142:5: ( '(' expression ')' )
                    {
                    // D:\\Projects UVA\\Oberon.g:142:5: ( '(' expression ')' )
                    // D:\\Projects UVA\\Oberon.g:142:6: '(' expression ')'
                    {
                    match(input,51,FOLLOW_51_in_factor808); 
                    pushFollow(FOLLOW_expression_in_factor810);
                    expression6=expression();

                    state._fsp--;

                    match(input,52,FOLLOW_52_in_factor812); 
                    node =expression6;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:143:5: ( NOT unary= factor )
                    {
                    // D:\\Projects UVA\\Oberon.g:143:5: ( NOT unary= factor )
                    // D:\\Projects UVA\\Oberon.g:143:6: NOT unary= factor
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor824); 
                    pushFollow(FOLLOW_factor_in_factor828);
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
    // D:\\Projects UVA\\Oberon.g:146:1: term returns [BaseNode node] : left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* ;
    public final BaseNode term() throws RecognitionException {
        BaseNode node = null;

        BaseNode left = null;

        BaseNode right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:147:2: (left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* )
            // D:\\Projects UVA\\Oberon.g:147:7: left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            {
            pushFollow(FOLLOW_factor_in_term855);
            left=factor();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon.g:148:2: ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            loop13:
            do {
                int alt13=5;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt13=1;
                    }
                    break;
                case DIV:
                    {
                    alt13=2;
                    }
                    break;
                case MOD:
                    {
                    alt13=3;
                    }
                    break;
                case AND:
                    {
                    alt13=4;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:149:3: MUL right= factor
            	    {
            	    match(input,MUL,FOLLOW_MUL_in_term867); 
            	    pushFollow(FOLLOW_factor_in_term871);
            	    right=factor();

            	    state._fsp--;

            	    node =new Multiplication(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:150:4: DIV right= factor
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_term879); 
            	    pushFollow(FOLLOW_factor_in_term883);
            	    right=factor();

            	    state._fsp--;

            	    node =new Division(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:151:4: MOD right= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term891); 
            	    pushFollow(FOLLOW_factor_in_term895);
            	    right=factor();

            	    state._fsp--;

            	    node =new Modulo(node, right);

            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon.g:152:4: AND right= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term903); 
            	    pushFollow(FOLLOW_factor_in_term907);
            	    right=factor();

            	    state._fsp--;

            	    node =new LogicalAnd(node, right);

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // D:\\Projects UVA\\Oberon.g:155:1: base returns [BaseNode node] : ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* ;
    public final BaseNode base() throws RecognitionException {
        BaseNode node = null;

        BaseNode left = null;

        BaseNode right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:156:6: ( ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* )
            // D:\\Projects UVA\\Oberon.g:156:11: ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )*
            {
            // D:\\Projects UVA\\Oberon.g:156:11: ( MIN left= term | PLUS left= term | left= term )
            int alt14=3;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt14=1;
                }
                break;
            case PLUS:
                {
                alt14=2;
                }
                break;
            case NOT:
            case ID:
            case INT:
            case 51:
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
                    // D:\\Projects UVA\\Oberon.g:157:7: MIN left= term
                    {
                    match(input,MIN,FOLLOW_MIN_in_base944); 
                    pushFollow(FOLLOW_term_in_base948);
                    left=term();

                    state._fsp--;

                    node =new Negative(left);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:158:8: PLUS left= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_base961); 
                    pushFollow(FOLLOW_term_in_base965);
                    left=term();

                    state._fsp--;

                    node =new Positive(left);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:159:8: left= term
                    {
                    pushFollow(FOLLOW_term_in_base980);
                    left=term();

                    state._fsp--;

                    node =left;

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon.g:161:8: ( MIN right= term | PLUS right= term | OR right= term )*
            loop15:
            do {
                int alt15=4;
                switch ( input.LA(1) ) {
                case MIN:
                    {
                    alt15=1;
                    }
                    break;
                case PLUS:
                    {
                    alt15=2;
                    }
                    break;
                case OR:
                    {
                    alt15=3;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:162:7: MIN right= term
            	    {
            	    match(input,MIN,FOLLOW_MIN_in_base1009); 
            	    pushFollow(FOLLOW_term_in_base1013);
            	    right=term();

            	    state._fsp--;

            	    node =new Subtraction(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:163:8: PLUS right= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_base1026); 
            	    pushFollow(FOLLOW_term_in_base1030);
            	    right=term();

            	    state._fsp--;

            	    node =new Addition(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:164:8: OR right= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_base1043); 
            	    pushFollow(FOLLOW_term_in_base1047);
            	    right=term();

            	    state._fsp--;

            	    node =new LogicalOr(node, right);

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
    // $ANTLR end "base"


    // $ANTLR start "expression"
    // D:\\Projects UVA\\Oberon.g:167:1: expression returns [BaseNode node] : left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? ;
    public final BaseNode expression() throws RecognitionException {
        BaseNode node = null;

        BaseNode left = null;

        BaseNode right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:168:6: (left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? )
            // D:\\Projects UVA\\Oberon.g:168:10: left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            {
            pushFollow(FOLLOW_base_in_expression1083);
            left=base();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon.g:169:6: ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            int alt16=7;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt16=1;
                    }
                    break;
                case UNEQUAL:
                    {
                    alt16=2;
                    }
                    break;
                case LESS:
                    {
                    alt16=3;
                    }
                    break;
                case LESS_EQUAL:
                    {
                    alt16=4;
                    }
                    break;
                case GREAT:
                    {
                    alt16=5;
                    }
                    break;
                case GREAT_EQUAL:
                    {
                    alt16=6;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:170:7: EQUAL right= base
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression1103); 
                    pushFollow(FOLLOW_base_in_expression1107);
                    right=base();

                    state._fsp--;

                    node =new Equal(node, right);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:171:8: UNEQUAL right= base
                    {
                    match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression1119); 
                    pushFollow(FOLLOW_base_in_expression1123);
                    right=base();

                    state._fsp--;

                    node =new NotEqual(node, right);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:172:8: LESS right= base
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression1135); 
                    pushFollow(FOLLOW_base_in_expression1139);
                    right=base();

                    state._fsp--;

                    node =new LessThan(node, right);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:173:8: LESS_EQUAL right= base
                    {
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression1152); 
                    pushFollow(FOLLOW_base_in_expression1156);
                    right=base();

                    state._fsp--;

                    node =new LessThanOrEqualTo(node, right);

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon.g:174:8: GREAT right= base
                    {
                    match(input,GREAT,FOLLOW_GREAT_in_expression1168); 
                    pushFollow(FOLLOW_base_in_expression1172);
                    right=base();

                    state._fsp--;

                    node =new GreatherThan(node, right);

                    }
                    break;
                case 6 :
                    // D:\\Projects UVA\\Oberon.g:175:8: GREAT_EQUAL right= base
                    {
                    match(input,GREAT_EQUAL,FOLLOW_GREAT_EQUAL_in_expression1184); 
                    pushFollow(FOLLOW_base_in_expression1188);
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
    // D:\\Projects UVA\\Oberon.g:178:1: statements returns [BaseStatementList node] : node_statement= statement ( ';' node_statement= statement )* ;
    public final BaseStatementList statements() throws RecognitionException {
        BaseStatementList node = null;

        BaseStatement node_statement = null;


        try {
            // D:\\Projects UVA\\Oberon.g:179:2: (node_statement= statement ( ';' node_statement= statement )* )
            // D:\\Projects UVA\\Oberon.g:179:4: node_statement= statement ( ';' node_statement= statement )*
            {
            node = new BaseStatementList();
            pushFollow(FOLLOW_statement_in_statements1222);
            node_statement=statement();

            state._fsp--;

            node.add(node_statement);
            // D:\\Projects UVA\\Oberon.g:181:3: ( ';' node_statement= statement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:181:4: ';' node_statement= statement
            	    {
            	    match(input,46,FOLLOW_46_in_statements1229); 
            	    pushFollow(FOLLOW_statement_in_statements1233);
            	    node_statement=statement();

            	    state._fsp--;

            	    node.add(node_statement);

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
    // $ANTLR end "statements"


    // $ANTLR start "statement"
    // D:\\Projects UVA\\Oberon.g:184:1: statement returns [BaseStatement node] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final BaseStatement statement() throws RecognitionException {
        BaseStatement node = null;

        Assign assignment7 = null;

        Call procedureCall8 = null;

        If ifStatement9 = null;

        While whileStatement10 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:185:5: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\Projects UVA\\Oberon.g:185:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // D:\\Projects UVA\\Oberon.g:185:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt18=5;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==ASSIGN||LA18_1==48||LA18_1==55) ) {
                        alt18=1;
                    }
                    else if ( ((LA18_1>=ELSE && LA18_1<=END)||LA18_1==46||LA18_1==51) ) {
                        alt18=2;
                    }
                    }
                    break;
                case CALL_READ:
                case CALL_WRITE:
                case CALL_WRITELN:
                    {
                    alt18=2;
                    }
                    break;
                case IF:
                    {
                    alt18=3;
                    }
                    break;
                case WHILE:
                    {
                    alt18=4;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:186:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1263);
                    assignment7=assignment();

                    state._fsp--;

                    node = assignment7;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:187:8: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1279);
                    procedureCall8=procedureCall();

                    state._fsp--;

                    node = procedureCall8;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:188:8: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1295);
                    ifStatement9=ifStatement();

                    state._fsp--;

                    node = ifStatement9;

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:189:8: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1311);
                    whileStatement10=whileStatement();

                    state._fsp--;

                    node = whileStatement10;

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
    // D:\\Projects UVA\\Oberon.g:192:1: assignment returns [Assign node] : ID idSelector[node_id] ASSIGN node_expression= expression ;
    public final Assign assignment() throws RecognitionException {
        Assign node = null;

        Token ID11=null;
        BaseNode node_expression = null;


        try {
            // D:\\Projects UVA\\Oberon.g:193:2: ( ID idSelector[node_id] ASSIGN node_expression= expression )
            // D:\\Projects UVA\\Oberon.g:193:4: ID idSelector[node_id] ASSIGN node_expression= expression
            {
            ID11=(Token)match(input,ID,FOLLOW_ID_in_assignment1349); 
            ID node_id = new ID((ID11!=null?ID11.getText():null));
            pushFollow(FOLLOW_idSelector_in_assignment1356);
            idSelector(node_id);

            state._fsp--;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment1359); 
            pushFollow(FOLLOW_expression_in_assignment1363);
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
    // D:\\Projects UVA\\Oberon.g:196:1: ifStatement returns [If node] : IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END ;
    public final If ifStatement() throws RecognitionException {
        If node = null;

        BaseNode node_expression = null;

        BaseStatementList node_statements = null;

        IfListForElsIf node_elsifs = null;

        BaseStatementList node_else = null;


        try {
            // D:\\Projects UVA\\Oberon.g:197:6: ( IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END )
            // D:\\Projects UVA\\Oberon.g:197:11: IF node_expression= expression THEN node_statements= statements (node_elsifs= ifElsIfList ) ( ELSE node_else= statements )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1385); 
            pushFollow(FOLLOW_expression_in_ifStatement1389);
            node_expression=expression();

            state._fsp--;

            match(input,THEN,FOLLOW_THEN_in_ifStatement1391); 
            pushFollow(FOLLOW_statements_in_ifStatement1395);
            node_statements=statements();

            state._fsp--;

            // D:\\Projects UVA\\Oberon.g:197:73: (node_elsifs= ifElsIfList )
            // D:\\Projects UVA\\Oberon.g:197:74: node_elsifs= ifElsIfList
            {
            pushFollow(FOLLOW_ifElsIfList_in_ifStatement1400);
            node_elsifs=ifElsIfList();

            state._fsp--;


            }

            // D:\\Projects UVA\\Oberon.g:197:99: ( ELSE node_else= statements )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ELSE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:197:100: ELSE node_else= statements
                    {
                    match(input,ELSE,FOLLOW_ELSE_in_ifStatement1404); 
                    pushFollow(FOLLOW_statements_in_ifStatement1408);
                    node_else=statements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1412); 
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
    // D:\\Projects UVA\\Oberon.g:200:1: ifElsIfList returns [IfListForElsIf node] : ( ELSIF node_expression= expression THEN node_statements= statements )* ;
    public final IfListForElsIf ifElsIfList() throws RecognitionException {
        IfListForElsIf node = null;

        BaseNode node_expression = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:201:2: ( ( ELSIF node_expression= expression THEN node_statements= statements )* )
            // D:\\Projects UVA\\Oberon.g:201:4: ( ELSIF node_expression= expression THEN node_statements= statements )*
            {
            node = new IfListForElsIf();
            // D:\\Projects UVA\\Oberon.g:202:3: ( ELSIF node_expression= expression THEN node_statements= statements )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ELSIF) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:203:3: ELSIF node_expression= expression THEN node_statements= statements
            	    {
            	    match(input,ELSIF,FOLLOW_ELSIF_in_ifElsIfList1440); 
            	    pushFollow(FOLLOW_expression_in_ifElsIfList1444);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,THEN,FOLLOW_THEN_in_ifElsIfList1446); 
            	    pushFollow(FOLLOW_statements_in_ifElsIfList1450);
            	    node_statements=statements();

            	    state._fsp--;

            	    node.add(new IfPartForElsIf(node_expression, node_statements));

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
    // $ANTLR end "ifElsIfList"


    // $ANTLR start "whileStatement"
    // D:\\Projects UVA\\Oberon.g:207:1: whileStatement returns [While node] : 'WHILE' node_expression= expression 'DO' node_statements= statements 'END' ;
    public final While whileStatement() throws RecognitionException {
        While node = null;

        BaseNode node_expression = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:208:2: ( 'WHILE' node_expression= expression 'DO' node_statements= statements 'END' )
            // D:\\Projects UVA\\Oberon.g:208:4: 'WHILE' node_expression= expression 'DO' node_statements= statements 'END'
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement1475); 
            pushFollow(FOLLOW_expression_in_whileStatement1479);
            node_expression=expression();

            state._fsp--;

            match(input,54,FOLLOW_54_in_whileStatement1481); 
            pushFollow(FOLLOW_statements_in_whileStatement1485);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1487); 
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
    // D:\\Projects UVA\\Oberon.g:211:1: id1 returns [ID node] : ID ;
    public final ID id1() throws RecognitionException {
        ID node = null;

        Token ID12=null;

        try {
            // D:\\Projects UVA\\Oberon.g:212:2: ( ID )
            // D:\\Projects UVA\\Oberon.g:212:4: ID
            {
            ID12=(Token)match(input,ID,FOLLOW_ID_in_id11504); 
            node = new ID((ID12!=null?ID12.getText():null));

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
    // D:\\Projects UVA\\Oberon.g:215:1: idList returns [IDList node] : node_id1= id1 ( ',' node_id2= id1 )* ;
    public final IDList idList() throws RecognitionException {
        IDList node = null;

        ID node_id1 = null;

        ID node_id2 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:216:2: (node_id1= id1 ( ',' node_id2= id1 )* )
            // D:\\Projects UVA\\Oberon.g:216:4: node_id1= id1 ( ',' node_id2= id1 )*
            {
            node = new IDList();
            pushFollow(FOLLOW_id1_in_idList1527);
            node_id1=id1();

            state._fsp--;

            node.add(node_id1);
            // D:\\Projects UVA\\Oberon.g:218:3: ( ',' node_id2= id1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==53) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:218:4: ',' node_id2= id1
            	    {
            	    match(input,53,FOLLOW_53_in_idList1534); 
            	    pushFollow(FOLLOW_id1_in_idList1538);
            	    node_id2=id1();

            	    state._fsp--;

            	    node.add(node_id2);

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
    // $ANTLR end "idList"


    // $ANTLR start "id"
    // D:\\Projects UVA\\Oberon.g:220:1: id returns [ID node] : ID node_selector= idSelector[$node] ;
    public final ID id() throws RecognitionException {
        ID node = null;

        Token ID13=null;
        ID node_selector = null;


        try {
            // D:\\Projects UVA\\Oberon.g:221:2: ( ID node_selector= idSelector[$node] )
            // D:\\Projects UVA\\Oberon.g:221:4: ID node_selector= idSelector[$node]
            {
            ID13=(Token)match(input,ID,FOLLOW_ID_in_id1555); 
            node = new ID((ID13!=null?ID13.getText():null));
            pushFollow(FOLLOW_idSelector_in_id1563);
            node_selector=idSelector(node);

            state._fsp--;

            node =node_selector;

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
    // D:\\Projects UVA\\Oberon.g:224:1: idSelector[ID node_parent] returns [ID node] : ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* ;
    public final ID idSelector(ID node_parent) throws RecognitionException {
        ID node = null;

        Token ID14=null;
        BaseNode node_expression = null;


        ID node_current = node_parent;
        try {
            // D:\\Projects UVA\\Oberon.g:226:6: ( ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* )
            // D:\\Projects UVA\\Oberon.g:226:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            {
            // D:\\Projects UVA\\Oberon.g:226:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }
                else if ( (LA22_0==55) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:226:12: ( '.' ID )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:226:12: ( '.' ID )
            	    // D:\\Projects UVA\\Oberon.g:226:13: '.' ID
            	    {
            	    match(input,48,FOLLOW_48_in_idSelector1596); 
            	    ID14=(Token)match(input,ID,FOLLOW_ID_in_idSelector1598); 

            	    }

            	    node_current=node_current.addID((ID14!=null?ID14.getText():null));

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:227:9: ( '[' node_expression= expression ']' )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:227:9: ( '[' node_expression= expression ']' )
            	    // D:\\Projects UVA\\Oberon.g:227:10: '[' node_expression= expression ']'
            	    {
            	    match(input,55,FOLLOW_55_in_idSelector1612); 
            	    pushFollow(FOLLOW_expression_in_idSelector1616);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,56,FOLLOW_56_in_idSelector1618); 
            	    node_current=node_current.addIndexID(node_expression);

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "idSelector"

    // Delegated rules


 

    public static final BitSet FOLLOW_45_in_module298 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_module302 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_module304 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_module310 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_module314 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_module320 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_module324 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_module326 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_module328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constDeclaration_in_declarations349 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_varDeclaration_in_declarations352 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_procedure_in_declarations355 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration372 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_constDeclaration377 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_constDeclaration379 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_constDeclaration383 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_constDeclaration385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration399 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_idList_in_varDeclaration404 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclaration406 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_type_in_varDeclaration410 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_varDeclaration412 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_50_in_procedure427 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_procedure431 = new BitSet(new long[]{0x0008400000000000L});
    public static final BitSet FOLLOW_51_in_procedure434 = new BitSet(new long[]{0x0000440000000040L});
    public static final BitSet FOLLOW_procedureParams_in_procedure438 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_procedure440 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure444 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_procedure450 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_procedure454 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_procedure460 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_procedure464 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_procedure466 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams492 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_procedureParams496 = new BitSet(new long[]{0x0000440000000040L});
    public static final BitSet FOLLOW_procedureParam_in_procedureParams502 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_VAR_in_procedureParam525 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_idList_in_procedureParam533 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureParam535 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_type_in_procedureParam539 = new BitSet(new long[]{0x0000040000000042L});
    public static final BitSet FOLLOW_CALL_READ_in_procedureCall572 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_CALL_WRITE_in_procedureCall584 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_CALL_WRITELN_in_procedureCall596 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCall608 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_procedureActualParams647 = new BitSet(new long[]{0x00180C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams652 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_procedureActualParams659 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams663 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_procedureActualParams672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_type695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType713 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_arrayType717 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_OF_in_arrayType719 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_type_in_arrayType723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_intType735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor772 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_idSelector_in_factor783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_factor808 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_factor810 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_factor812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor824 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_factor828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term855 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MUL_in_term867 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term871 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_DIV_in_term879 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term883 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MOD_in_term891 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term895 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_AND_in_term903 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term907 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MIN_in_base944 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base948 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base961 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base965 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_term_in_base980 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_MIN_in_base1009 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1013 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base1026 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1030 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_OR_in_base1043 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1047 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_base_in_expression1083 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1103 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression1119 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_expression1135 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression1152 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_in_expression1168 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_EQUAL_in_expression1184 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1222 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_statements1229 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statement_in_statements1233 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1349 = new BitSet(new long[]{0x0081004000000000L});
    public static final BitSet FOLLOW_idSelector_in_assignment1356 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment1359 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_assignment1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1385 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_THEN_in_ifStatement1391 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifStatement1395 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ifElsIfList_in_ifStatement1400 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement1404 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifStatement1408 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ifStatement1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_ifElsIfList1440 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifElsIfList1444 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_THEN_in_ifElsIfList1446 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifElsIfList1450 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1475 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1479 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_whileStatement1481 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_whileStatement1485 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_whileStatement1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id1_in_idList1527 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_idList1534 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_idList1538 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ID_in_id1555 = new BitSet(new long[]{0x0081000000000000L});
    public static final BitSet FOLLOW_idSelector_in_id1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_idSelector1596 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_idSelector1598 = new BitSet(new long[]{0x0081000000000002L});
    public static final BitSet FOLLOW_55_in_idSelector1612 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_idSelector1616 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_idSelector1618 = new BitSet(new long[]{0x0081000000000002L});

}