// $ANTLR 3.3 Nov 30, 2010 12:45:30 D:\\Projects UVA\\Oberon.g 2011-02-02 02:50:50

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "MODULE", "CONST", "VAR", "VARREF", "PROCEDURE", "BODY", "EXIT", "RETURN", "IF", "THEN", "ELSE", "ELSIF", "END", "WHILE", "EQUAL", "UNEQUAL", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "MIN", "PLUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "DECLARATIONS", "INPUTVARS", "CALL", "CALL_READ", "CALL_WRITE", "CALL_WRITELN", "CALLVARS", "ASSIGN", "INT_TYPE", "ARRAY", "ID", "INT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'.'", "':'", "'PROCEDURE'", "'('", "')'", "','", "'OF'", "'DO'", "'['", "']'"
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
    public static final int T__57=57;
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
    public static final int CALLVARS=38;
    public static final int ASSIGN=39;
    public static final int INT_TYPE=40;
    public static final int ARRAY=41;
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
    // D:\\Projects UVA\\Oberon.g:75:1: module returns [Module node] : 'MODULE' node_id= id1 ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 '.' ;
    public final Module module() throws RecognitionException {
        Module node = null;

        ID node_id = null;

        BaseDeclarationList node_declarations = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:76:2: ( 'MODULE' node_id= id1 ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 '.' )
            // D:\\Projects UVA\\Oberon.g:76:4: 'MODULE' node_id= id1 ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 '.'
            {
            match(input,45,FOLLOW_45_in_module300); 
            pushFollow(FOLLOW_id1_in_module304);
            node_id=id1();

            state._fsp--;

            match(input,46,FOLLOW_46_in_module306); 
            pushFollow(FOLLOW_declarations_in_module312);
            node_declarations=declarations();

            state._fsp--;

            match(input,47,FOLLOW_47_in_module316); 
            pushFollow(FOLLOW_statements_in_module322);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_module326); 
            pushFollow(FOLLOW_id1_in_module328);
            id1();

            state._fsp--;

            match(input,48,FOLLOW_48_in_module330); 
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
    // D:\\Projects UVA\\Oberon.g:83:1: declarations returns [BaseDeclarationList node] : (node_declaration= declaration )* ;
    public final BaseDeclarationList declarations() throws RecognitionException {
        BaseDeclarationList node = null;

        BaseDeclaration node_declaration = null;


        try {
            // D:\\Projects UVA\\Oberon.g:84:2: ( (node_declaration= declaration )* )
            // D:\\Projects UVA\\Oberon.g:84:4: (node_declaration= declaration )*
            {
            node = new BaseDeclarationList();
            // D:\\Projects UVA\\Oberon.g:85:3: (node_declaration= declaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=CONST && LA1_0<=VAR)||LA1_0==50) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:85:4: node_declaration= declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_declarations355);
            	    node_declaration=declaration();

            	    state._fsp--;

            	    node.add(node_declaration);

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


    // $ANTLR start "declaration"
    // D:\\Projects UVA\\Oberon.g:88:1: declaration returns [BaseDeclaration node] : ( constDeclaration | varDeclaration | procedure );
    public final BaseDeclaration declaration() throws RecognitionException {
        BaseDeclaration node = null;

        Const constDeclaration1 = null;

        Var varDeclaration2 = null;

        Procedure procedure3 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:89:2: ( constDeclaration | varDeclaration | procedure )
            int alt2=3;
            switch ( input.LA(1) ) {
            case CONST:
                {
                alt2=1;
                }
                break;
            case VAR:
                {
                alt2=2;
                }
                break;
            case 50:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:89:4: constDeclaration
                    {
                    pushFollow(FOLLOW_constDeclaration_in_declaration378);
                    constDeclaration1=constDeclaration();

                    state._fsp--;

                    node = constDeclaration1;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:90:4: varDeclaration
                    {
                    pushFollow(FOLLOW_varDeclaration_in_declaration385);
                    varDeclaration2=varDeclaration();

                    state._fsp--;

                    node = varDeclaration2;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:91:4: procedure
                    {
                    pushFollow(FOLLOW_procedure_in_declaration393);
                    procedure3=procedure();

                    state._fsp--;

                    node = procedure3;

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
    // $ANTLR end "declaration"


    // $ANTLR start "constDeclaration"
    // D:\\Projects UVA\\Oberon.g:94:1: constDeclaration returns [Const node] : 'CONST' (node_id= id1 '=' expression ';' ) ;
    public final Const constDeclaration() throws RecognitionException {
        Const node = null;

        ID node_id = null;


        try {
            // D:\\Projects UVA\\Oberon.g:95:2: ( 'CONST' (node_id= id1 '=' expression ';' ) )
            // D:\\Projects UVA\\Oberon.g:95:4: 'CONST' (node_id= id1 '=' expression ';' )
            {
            match(input,CONST,FOLLOW_CONST_in_constDeclaration413); 
            // D:\\Projects UVA\\Oberon.g:95:12: (node_id= id1 '=' expression ';' )
            // D:\\Projects UVA\\Oberon.g:95:13: node_id= id1 '=' expression ';'
            {
            pushFollow(FOLLOW_id1_in_constDeclaration418);
            node_id=id1();

            state._fsp--;

            match(input,EQUAL,FOLLOW_EQUAL_in_constDeclaration420); 
            pushFollow(FOLLOW_expression_in_constDeclaration422);
            expression();

            state._fsp--;

            match(input,46,FOLLOW_46_in_constDeclaration424); 

            }

            node = new Const(node_id);

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
    // $ANTLR end "constDeclaration"


    // $ANTLR start "varDeclaration"
    // D:\\Projects UVA\\Oberon.g:98:1: varDeclaration returns [Var node] : 'VAR' (node_ids= idList ':' node_type= type ';' )* ;
    public final Var varDeclaration() throws RecognitionException {
        Var node = null;

        IDs node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:99:2: ( 'VAR' (node_ids= idList ':' node_type= type ';' )* )
            // D:\\Projects UVA\\Oberon.g:99:4: 'VAR' (node_ids= idList ':' node_type= type ';' )*
            {
            match(input,VAR,FOLLOW_VAR_in_varDeclaration442); 
            // D:\\Projects UVA\\Oberon.g:99:10: (node_ids= idList ':' node_type= type ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:99:11: node_ids= idList ':' node_type= type ';'
            	    {
            	    pushFollow(FOLLOW_idList_in_varDeclaration447);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_varDeclaration449); 
            	    pushFollow(FOLLOW_type_in_varDeclaration453);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_varDeclaration455); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            node = new Var(node_ids, node_type);

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
    // $ANTLR end "varDeclaration"


    // $ANTLR start "procedure"
    // D:\\Projects UVA\\Oberon.g:102:1: procedure returns [Procedure node] : 'PROCEDURE' node_id= id1 (node_params= procedureParams )? ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 ';' ;
    public final Procedure procedure() throws RecognitionException {
        Procedure node = null;

        ID node_id = null;

        BaseDeclarationList node_params = null;

        BaseDeclarationList node_declarations = null;

        BaseStatementList node_statements = null;


        try {
            // D:\\Projects UVA\\Oberon.g:103:2: ( 'PROCEDURE' node_id= id1 (node_params= procedureParams )? ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 ';' )
            // D:\\Projects UVA\\Oberon.g:103:4: 'PROCEDURE' node_id= id1 (node_params= procedureParams )? ';' node_declarations= declarations 'BEGIN' node_statements= statements 'END' id1 ';'
            {
            match(input,50,FOLLOW_50_in_procedure474); 
            pushFollow(FOLLOW_id1_in_procedure478);
            node_id=id1();

            state._fsp--;

            // D:\\Projects UVA\\Oberon.g:103:39: (node_params= procedureParams )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:103:39: node_params= procedureParams
                    {
                    pushFollow(FOLLOW_procedureParams_in_procedure482);
                    node_params=procedureParams();

                    state._fsp--;


                    }
                    break;

            }

            match(input,46,FOLLOW_46_in_procedure485); 
            pushFollow(FOLLOW_declarations_in_procedure491);
            node_declarations=declarations();

            state._fsp--;

            match(input,47,FOLLOW_47_in_procedure495); 
            pushFollow(FOLLOW_statements_in_procedure501);
            node_statements=statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_procedure505); 
            pushFollow(FOLLOW_id1_in_procedure507);
            id1();

            state._fsp--;

            match(input,46,FOLLOW_46_in_procedure509); 
            node = new Procedure(node_id, node_params, node_declarations, node_statements);

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
    // $ANTLR end "procedure"


    // $ANTLR start "procedureParams"
    // D:\\Projects UVA\\Oberon.g:110:1: procedureParams returns [BaseDeclarationList node] : '(' node_declaration= procedureVar ( ';' node_declaration= procedureVar )* ')' ;
    public final BaseDeclarationList procedureParams() throws RecognitionException {
        BaseDeclarationList node = null;

        Var node_declaration = null;


        try {
            // D:\\Projects UVA\\Oberon.g:111:2: ( '(' node_declaration= procedureVar ( ';' node_declaration= procedureVar )* ')' )
            // D:\\Projects UVA\\Oberon.g:111:4: '(' node_declaration= procedureVar ( ';' node_declaration= procedureVar )* ')'
            {
            node = new BaseDeclarationList();
            match(input,51,FOLLOW_51_in_procedureParams529); 
            pushFollow(FOLLOW_procedureVar_in_procedureParams535);
            node_declaration=procedureVar();

            state._fsp--;

            node.add(node_declaration);
            // D:\\Projects UVA\\Oberon.g:113:3: ( ';' node_declaration= procedureVar )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==46) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:113:4: ';' node_declaration= procedureVar
            	    {
            	    match(input,46,FOLLOW_46_in_procedureParams542); 
            	    pushFollow(FOLLOW_procedureVar_in_procedureParams548);
            	    node_declaration=procedureVar();

            	    state._fsp--;

            	    node.add(node_declaration);

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,52,FOLLOW_52_in_procedureParams554); 

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


    // $ANTLR start "procedureVar"
    // D:\\Projects UVA\\Oberon.g:116:1: procedureVar returns [Var node] : ( procedureVarRef | procedureVarNonRef );
    public final Var procedureVar() throws RecognitionException {
        Var node = null;

        VarRef procedureVarRef4 = null;

        Var procedureVarNonRef5 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:117:2: ( procedureVarRef | procedureVarNonRef )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==VAR) ) {
                alt6=1;
            }
            else if ( (LA6_0==ID||LA6_0==46||LA6_0==52) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:117:4: procedureVarRef
                    {
                    pushFollow(FOLLOW_procedureVarRef_in_procedureVar573);
                    procedureVarRef4=procedureVarRef();

                    state._fsp--;

                    node =procedureVarRef4;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:118:4: procedureVarNonRef
                    {
                    pushFollow(FOLLOW_procedureVarNonRef_in_procedureVar581);
                    procedureVarNonRef5=procedureVarNonRef();

                    state._fsp--;

                    node =procedureVarNonRef5;

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
    // $ANTLR end "procedureVar"


    // $ANTLR start "procedureVarRef"
    // D:\\Projects UVA\\Oberon.g:120:1: procedureVarRef returns [VarRef node] : 'VAR' (node_ids= idList ':' node_type= type ';' )* ;
    public final VarRef procedureVarRef() throws RecognitionException {
        VarRef node = null;

        IDs node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:121:2: ( 'VAR' (node_ids= idList ':' node_type= type ';' )* )
            // D:\\Projects UVA\\Oberon.g:121:4: 'VAR' (node_ids= idList ':' node_type= type ';' )*
            {
            match(input,VAR,FOLLOW_VAR_in_procedureVarRef598); 
            // D:\\Projects UVA\\Oberon.g:121:10: (node_ids= idList ':' node_type= type ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:121:11: node_ids= idList ':' node_type= type ';'
            	    {
            	    pushFollow(FOLLOW_idList_in_procedureVarRef603);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_procedureVarRef605); 
            	    pushFollow(FOLLOW_type_in_procedureVarRef609);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_procedureVarRef611); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            node = new VarRef(node_ids, node_type);

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
    // $ANTLR end "procedureVarRef"


    // $ANTLR start "procedureVarNonRef"
    // D:\\Projects UVA\\Oberon.g:124:1: procedureVarNonRef returns [Var node] : (node_ids= idList ':' node_type= type ';' )* ;
    public final Var procedureVarNonRef() throws RecognitionException {
        Var node = null;

        IDs node_ids = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:125:2: ( (node_ids= idList ':' node_type= type ';' )* )
            // D:\\Projects UVA\\Oberon.g:125:4: (node_ids= idList ':' node_type= type ';' )*
            {
            // D:\\Projects UVA\\Oberon.g:125:4: (node_ids= idList ':' node_type= type ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:125:5: node_ids= idList ':' node_type= type ';'
            	    {
            	    pushFollow(FOLLOW_idList_in_procedureVarNonRef634);
            	    node_ids=idList();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_procedureVarNonRef636); 
            	    pushFollow(FOLLOW_type_in_procedureVarNonRef640);
            	    node_type=type();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_procedureVarNonRef642); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            node = new Var(node_ids, node_type);

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
    // $ANTLR end "procedureVarNonRef"


    // $ANTLR start "procedureCall"
    // D:\\Projects UVA\\Oberon.g:128:1: procedureCall returns [Call node] : ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID ) (call_vars= procedureActualParams )? ;
    public final Call procedureCall() throws RecognitionException {
        Call node = null;

        Token ID6=null;
        CallVars call_vars = null;


        try {
            // D:\\Projects UVA\\Oberon.g:129:6: ( ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID ) (call_vars= procedureActualParams )? )
            // D:\\Projects UVA\\Oberon.g:129:11: ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID ) (call_vars= procedureActualParams )?
            {
            // D:\\Projects UVA\\Oberon.g:129:11: ( CALL_READ | CALL_WRITE | CALL_WRITELN | ID )
            int alt9=4;
            switch ( input.LA(1) ) {
            case CALL_READ:
                {
                alt9=1;
                }
                break;
            case CALL_WRITE:
                {
                alt9=2;
                }
                break;
            case CALL_WRITELN:
                {
                alt9=3;
                }
                break;
            case ID:
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
                    // D:\\Projects UVA\\Oberon.g:130:8: CALL_READ
                    {
                    match(input,CALL_READ,FOLLOW_CALL_READ_in_procedureCall676); 
                    node = new CallRead();

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:131:9: CALL_WRITE
                    {
                    match(input,CALL_WRITE,FOLLOW_CALL_WRITE_in_procedureCall688); 
                    node = new CallWrite();

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:132:9: CALL_WRITELN
                    {
                    match(input,CALL_WRITELN,FOLLOW_CALL_WRITELN_in_procedureCall700); 
                    node = new CallWriteLn();

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:133:9: ID
                    {
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_procedureCall712); 
                    node = new CallProcedure(new ID((ID6!=null?ID6.getText():null)));

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon.g:135:7: (call_vars= procedureActualParams )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:135:8: call_vars= procedureActualParams
                    {
                    pushFollow(FOLLOW_procedureActualParams_in_procedureCall734);
                    call_vars=procedureActualParams();

                    state._fsp--;

                    node.setCallVars(call_vars);

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
    // D:\\Projects UVA\\Oberon.g:137:1: procedureActualParams returns [CallVars node] : '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' ;
    public final CallVars procedureActualParams() throws RecognitionException {
        CallVars node = null;

        BaseNode node_exp = null;


        try {
            // D:\\Projects UVA\\Oberon.g:138:2: ( '(' (node_exp= expression ( ',' node_exp= expression )* )? ')' )
            // D:\\Projects UVA\\Oberon.g:138:3: '(' (node_exp= expression ( ',' node_exp= expression )* )? ')'
            {
            match(input,51,FOLLOW_51_in_procedureActualParams751); 
            // D:\\Projects UVA\\Oberon.g:138:7: (node_exp= expression ( ',' node_exp= expression )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=MIN && LA12_0<=PLUS)||LA12_0==NOT||(LA12_0>=ID && LA12_0<=INT)||LA12_0==51) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:138:8: node_exp= expression ( ',' node_exp= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_procedureActualParams756);
                    node_exp=expression();

                    state._fsp--;

                    node =new CallVars(); node.getItems().add(node_exp);
                    // D:\\Projects UVA\\Oberon.g:139:3: ( ',' node_exp= expression )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==53) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Projects UVA\\Oberon.g:139:4: ',' node_exp= expression
                    	    {
                    	    match(input,53,FOLLOW_53_in_procedureActualParams763); 
                    	    pushFollow(FOLLOW_expression_in_procedureActualParams767);
                    	    node_exp=expression();

                    	    state._fsp--;

                    	    node.getItems().add(node_exp);

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,52,FOLLOW_52_in_procedureActualParams776); 

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
    // D:\\Projects UVA\\Oberon.g:142:1: type returns [BaseType node] : ( arrayType | INT_TYPE );
    public final BaseType type() throws RecognitionException {
        BaseType node = null;

        ArrayType arrayType7 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:143:2: ( arrayType | INT_TYPE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ARRAY) ) {
                alt13=1;
            }
            else if ( (LA13_0==INT_TYPE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:143:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type792);
                    arrayType7=arrayType();

                    state._fsp--;

                    node = arrayType7;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:144:4: INT_TYPE
                    {
                    match(input,INT_TYPE,FOLLOW_INT_TYPE_in_type799); 
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
    // D:\\Projects UVA\\Oberon.g:147:1: arrayType returns [Array node] : ARRAY node_exp= expression 'OF' node_type= type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType node = null;

        BaseNode node_exp = null;

        BaseType node_type = null;


        try {
            // D:\\Projects UVA\\Oberon.g:148:2: ( ARRAY node_exp= expression 'OF' node_type= type )
            // D:\\Projects UVA\\Oberon.g:148:4: ARRAY node_exp= expression 'OF' node_type= type
            {
            match(input,ARRAY,FOLLOW_ARRAY_in_arrayType817); 
            pushFollow(FOLLOW_expression_in_arrayType821);
            node_exp=expression();

            state._fsp--;

            match(input,54,FOLLOW_54_in_arrayType823); 
            pushFollow(FOLLOW_type_in_arrayType827);
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
    // D:\\Projects UVA\\Oberon.g:151:1: intType : INT_TYPE ;
    public final void intType() throws RecognitionException {
        try {
            // D:\\Projects UVA\\Oberon.g:151:9: ( INT_TYPE )
            // D:\\Projects UVA\\Oberon.g:151:11: INT_TYPE
            {
            match(input,INT_TYPE,FOLLOW_INT_TYPE_in_intType839); 

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
    // D:\\Projects UVA\\Oberon.g:153:1: number returns [IntValue node] : INT ;
    public final IntValue number() throws RecognitionException {
        IntValue node = null;

        Token INT8=null;

        try {
            // D:\\Projects UVA\\Oberon.g:154:2: ( INT )
            // D:\\Projects UVA\\Oberon.g:154:4: INT
            {
            INT8=(Token)match(input,INT,FOLLOW_INT_in_number852); 
            node = new IntValue((INT8!=null?INT8.getText():null));

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
    // D:\\Projects UVA\\Oberon.g:157:1: factor returns [BaseNode node] : ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) );
    public final BaseNode factor() throws RecognitionException {
        BaseNode node = null;

        Token ID9=null;
        Token INT10=null;
        BaseNode unary = null;

        BaseNode expression11 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:158:2: ( ID idSelector[node_id] | INT | ( '(' expression ')' ) | ( NOT unary= factor ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt14=1;
                }
                break;
            case INT:
                {
                alt14=2;
                }
                break;
            case 51:
                {
                alt14=3;
                }
                break;
            case NOT:
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
                    // D:\\Projects UVA\\Oberon.g:158:7: ID idSelector[node_id]
                    {
                    ID9=(Token)match(input,ID,FOLLOW_ID_in_factor876); 
                    ID node_id = new ID((ID9!=null?ID9.getText():null));
                    pushFollow(FOLLOW_idSelector_in_factor887);
                    idSelector(node_id);

                    state._fsp--;

                    node = node_id;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:160:5: INT
                    {
                    INT10=(Token)match(input,INT,FOLLOW_INT_in_factor899); 
                    node = new IntValue((INT10!=null?INT10.getText():null));

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:161:5: ( '(' expression ')' )
                    {
                    // D:\\Projects UVA\\Oberon.g:161:5: ( '(' expression ')' )
                    // D:\\Projects UVA\\Oberon.g:161:6: '(' expression ')'
                    {
                    match(input,51,FOLLOW_51_in_factor912); 
                    pushFollow(FOLLOW_expression_in_factor914);
                    expression11=expression();

                    state._fsp--;

                    match(input,52,FOLLOW_52_in_factor916); 
                    node =expression11;

                    }


                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:162:5: ( NOT unary= factor )
                    {
                    // D:\\Projects UVA\\Oberon.g:162:5: ( NOT unary= factor )
                    // D:\\Projects UVA\\Oberon.g:162:6: NOT unary= factor
                    {
                    match(input,NOT,FOLLOW_NOT_in_factor928); 
                    pushFollow(FOLLOW_factor_in_factor932);
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
    // D:\\Projects UVA\\Oberon.g:165:1: term returns [BaseNode node] : left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* ;
    public final BaseNode term() throws RecognitionException {
        BaseNode node = null;

        BaseNode left = null;

        BaseNode right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:166:2: (left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )* )
            // D:\\Projects UVA\\Oberon.g:166:7: left= factor ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            {
            pushFollow(FOLLOW_factor_in_term959);
            left=factor();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon.g:167:2: ( MUL right= factor | DIV right= factor | MOD right= factor | AND right= factor )*
            loop15:
            do {
                int alt15=5;
                switch ( input.LA(1) ) {
                case MUL:
                    {
                    alt15=1;
                    }
                    break;
                case DIV:
                    {
                    alt15=2;
                    }
                    break;
                case MOD:
                    {
                    alt15=3;
                    }
                    break;
                case AND:
                    {
                    alt15=4;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:168:3: MUL right= factor
            	    {
            	    match(input,MUL,FOLLOW_MUL_in_term971); 
            	    pushFollow(FOLLOW_factor_in_term975);
            	    right=factor();

            	    state._fsp--;

            	    node =new Multiplication(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:169:4: DIV right= factor
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_term983); 
            	    pushFollow(FOLLOW_factor_in_term987);
            	    right=factor();

            	    state._fsp--;

            	    node =new Division(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:170:4: MOD right= factor
            	    {
            	    match(input,MOD,FOLLOW_MOD_in_term995); 
            	    pushFollow(FOLLOW_factor_in_term999);
            	    right=factor();

            	    state._fsp--;

            	    node =new Modulo(node, right);

            	    }
            	    break;
            	case 4 :
            	    // D:\\Projects UVA\\Oberon.g:171:4: AND right= factor
            	    {
            	    match(input,AND,FOLLOW_AND_in_term1007); 
            	    pushFollow(FOLLOW_factor_in_term1011);
            	    right=factor();

            	    state._fsp--;

            	    node =new LogicalAnd(node, right);

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


    // $ANTLR start "base"
    // D:\\Projects UVA\\Oberon.g:174:1: base returns [BaseNode node] : ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* ;
    public final BaseNode base() throws RecognitionException {
        BaseNode node = null;

        BaseNode left = null;

        BaseNode right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:175:6: ( ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )* )
            // D:\\Projects UVA\\Oberon.g:175:11: ( MIN left= term | PLUS left= term | left= term ) ( MIN right= term | PLUS right= term | OR right= term )*
            {
            // D:\\Projects UVA\\Oberon.g:175:11: ( MIN left= term | PLUS left= term | left= term )
            int alt16=3;
            switch ( input.LA(1) ) {
            case MIN:
                {
                alt16=1;
                }
                break;
            case PLUS:
                {
                alt16=2;
                }
                break;
            case NOT:
            case ID:
            case INT:
            case 51:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:176:7: MIN left= term
                    {
                    match(input,MIN,FOLLOW_MIN_in_base1048); 
                    pushFollow(FOLLOW_term_in_base1052);
                    left=term();

                    state._fsp--;

                    node =new Negative(left);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:177:8: PLUS left= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_base1065); 
                    pushFollow(FOLLOW_term_in_base1069);
                    left=term();

                    state._fsp--;

                    node =new Positive(left);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:178:8: left= term
                    {
                    pushFollow(FOLLOW_term_in_base1084);
                    left=term();

                    state._fsp--;

                    node =left;

                    }
                    break;

            }

            // D:\\Projects UVA\\Oberon.g:180:8: ( MIN right= term | PLUS right= term | OR right= term )*
            loop17:
            do {
                int alt17=4;
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
                case OR:
                    {
                    alt17=3;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:181:7: MIN right= term
            	    {
            	    match(input,MIN,FOLLOW_MIN_in_base1113); 
            	    pushFollow(FOLLOW_term_in_base1117);
            	    right=term();

            	    state._fsp--;

            	    node =new Subtraction(node, right);

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:182:8: PLUS right= term
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_base1130); 
            	    pushFollow(FOLLOW_term_in_base1134);
            	    right=term();

            	    state._fsp--;

            	    node =new Addition(node, right);

            	    }
            	    break;
            	case 3 :
            	    // D:\\Projects UVA\\Oberon.g:183:8: OR right= term
            	    {
            	    match(input,OR,FOLLOW_OR_in_base1147); 
            	    pushFollow(FOLLOW_term_in_base1151);
            	    right=term();

            	    state._fsp--;

            	    node =new LogicalOr(node, right);

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
    // $ANTLR end "base"


    // $ANTLR start "expression"
    // D:\\Projects UVA\\Oberon.g:186:1: expression returns [BaseNode node] : left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? ;
    public final BaseNode expression() throws RecognitionException {
        BaseNode node = null;

        BaseNode left = null;

        BaseNode right = null;


        try {
            // D:\\Projects UVA\\Oberon.g:187:6: (left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )? )
            // D:\\Projects UVA\\Oberon.g:187:10: left= base ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            {
            pushFollow(FOLLOW_base_in_expression1187);
            left=base();

            state._fsp--;

            node =left;
            // D:\\Projects UVA\\Oberon.g:188:6: ( EQUAL right= base | UNEQUAL right= base | LESS right= base | LESS_EQUAL right= base | GREAT right= base | GREAT_EQUAL right= base )?
            int alt18=7;
            switch ( input.LA(1) ) {
                case EQUAL:
                    {
                    alt18=1;
                    }
                    break;
                case UNEQUAL:
                    {
                    alt18=2;
                    }
                    break;
                case LESS:
                    {
                    alt18=3;
                    }
                    break;
                case LESS_EQUAL:
                    {
                    alt18=4;
                    }
                    break;
                case GREAT:
                    {
                    alt18=5;
                    }
                    break;
                case GREAT_EQUAL:
                    {
                    alt18=6;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:189:7: EQUAL right= base
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expression1207); 
                    pushFollow(FOLLOW_base_in_expression1211);
                    right=base();

                    state._fsp--;

                    node =new Equal(node, right);

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:190:8: UNEQUAL right= base
                    {
                    match(input,UNEQUAL,FOLLOW_UNEQUAL_in_expression1223); 
                    pushFollow(FOLLOW_base_in_expression1227);
                    right=base();

                    state._fsp--;

                    node =new NotEqual(node, right);

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:191:8: LESS right= base
                    {
                    match(input,LESS,FOLLOW_LESS_in_expression1239); 
                    pushFollow(FOLLOW_base_in_expression1243);
                    right=base();

                    state._fsp--;

                    node =new LessThan(node, right);

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:192:8: LESS_EQUAL right= base
                    {
                    match(input,LESS_EQUAL,FOLLOW_LESS_EQUAL_in_expression1256); 
                    pushFollow(FOLLOW_base_in_expression1260);
                    right=base();

                    state._fsp--;

                    node =new LessThanOrEqualTo(node, right);

                    }
                    break;
                case 5 :
                    // D:\\Projects UVA\\Oberon.g:193:8: GREAT right= base
                    {
                    match(input,GREAT,FOLLOW_GREAT_in_expression1272); 
                    pushFollow(FOLLOW_base_in_expression1276);
                    right=base();

                    state._fsp--;

                    node =new GreatherThan(node, right);

                    }
                    break;
                case 6 :
                    // D:\\Projects UVA\\Oberon.g:194:8: GREAT_EQUAL right= base
                    {
                    match(input,GREAT_EQUAL,FOLLOW_GREAT_EQUAL_in_expression1288); 
                    pushFollow(FOLLOW_base_in_expression1292);
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
    // D:\\Projects UVA\\Oberon.g:197:1: statements returns [BaseStatementList node] : node_statement= statement ( ';' node_statement= statement )* ;
    public final BaseStatementList statements() throws RecognitionException {
        BaseStatementList node = null;

        BaseStatement node_statement = null;


        try {
            // D:\\Projects UVA\\Oberon.g:198:2: (node_statement= statement ( ';' node_statement= statement )* )
            // D:\\Projects UVA\\Oberon.g:198:4: node_statement= statement ( ';' node_statement= statement )*
            {
            node = new BaseStatementList();
            pushFollow(FOLLOW_statement_in_statements1326);
            node_statement=statement();

            state._fsp--;

            node.add(node_statement);
            // D:\\Projects UVA\\Oberon.g:200:3: ( ';' node_statement= statement )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==46) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:200:4: ';' node_statement= statement
            	    {
            	    match(input,46,FOLLOW_46_in_statements1333); 
            	    pushFollow(FOLLOW_statement_in_statements1337);
            	    node_statement=statement();

            	    state._fsp--;

            	    node.add(node_statement);

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
    // $ANTLR end "statements"


    // $ANTLR start "statement"
    // D:\\Projects UVA\\Oberon.g:203:1: statement returns [BaseStatement node] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final BaseStatement statement() throws RecognitionException {
        BaseStatement node = null;

        Assign assignment12 = null;

        Call procedureCall13 = null;

        If ifStatement14 = null;

        While whileStatement15 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:204:5: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\Projects UVA\\Oberon.g:204:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // D:\\Projects UVA\\Oberon.g:204:7: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt20=5;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==ASSIGN||LA20_1==48||LA20_1==56) ) {
                        alt20=1;
                    }
                    else if ( ((LA20_1>=ELSE && LA20_1<=END)||LA20_1==46||LA20_1==51) ) {
                        alt20=2;
                    }
                    }
                    break;
                case CALL_READ:
                case CALL_WRITE:
                case CALL_WRITELN:
                    {
                    alt20=2;
                    }
                    break;
                case IF:
                    {
                    alt20=3;
                    }
                    break;
                case WHILE:
                    {
                    alt20=4;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:205:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1367);
                    assignment12=assignment();

                    state._fsp--;

                    node = assignment12;

                    }
                    break;
                case 2 :
                    // D:\\Projects UVA\\Oberon.g:206:8: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1383);
                    procedureCall13=procedureCall();

                    state._fsp--;

                    node = procedureCall13;

                    }
                    break;
                case 3 :
                    // D:\\Projects UVA\\Oberon.g:207:8: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1399);
                    ifStatement14=ifStatement();

                    state._fsp--;

                    node = ifStatement14;

                    }
                    break;
                case 4 :
                    // D:\\Projects UVA\\Oberon.g:208:8: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1415);
                    whileStatement15=whileStatement();

                    state._fsp--;

                    node = whileStatement15;

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
    // D:\\Projects UVA\\Oberon.g:211:1: assignment returns [Assign node] : ID idSelector[node_id] ASSIGN node_expression= expression ;
    public final Assign assignment() throws RecognitionException {
        Assign node = null;

        Token ID16=null;
        BaseNode node_expression = null;


        try {
            // D:\\Projects UVA\\Oberon.g:212:2: ( ID idSelector[node_id] ASSIGN node_expression= expression )
            // D:\\Projects UVA\\Oberon.g:212:4: ID idSelector[node_id] ASSIGN node_expression= expression
            {
            ID16=(Token)match(input,ID,FOLLOW_ID_in_assignment1453); 
            ID node_id = new ID((ID16!=null?ID16.getText():null));
            pushFollow(FOLLOW_idSelector_in_assignment1460);
            idSelector(node_id);

            state._fsp--;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment1463); 
            pushFollow(FOLLOW_expression_in_assignment1467);
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
    // D:\\Projects UVA\\Oberon.g:215:1: ifStatement returns [If node] : IF expression ifThen ( ifElsIf )* ( ifElse )? END ;
    public final If ifStatement() throws RecognitionException {
        If node = null;

        try {
            // D:\\Projects UVA\\Oberon.g:216:6: ( IF expression ifThen ( ifElsIf )* ( ifElse )? END )
            // D:\\Projects UVA\\Oberon.g:216:11: IF expression ifThen ( ifElsIf )* ( ifElse )? END
            {
            match(input,IF,FOLLOW_IF_in_ifStatement1489); 
            pushFollow(FOLLOW_expression_in_ifStatement1491);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_ifThen_in_ifStatement1493);
            ifThen();

            state._fsp--;

            // D:\\Projects UVA\\Oberon.g:216:32: ( ifElsIf )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ELSIF) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:216:33: ifElsIf
            	    {
            	    pushFollow(FOLLOW_ifElsIf_in_ifStatement1496);
            	    ifElsIf();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // D:\\Projects UVA\\Oberon.g:216:43: ( ifElse )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ELSE) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Projects UVA\\Oberon.g:216:44: ifElse
                    {
                    pushFollow(FOLLOW_ifElse_in_ifStatement1501);
                    ifElse();

                    state._fsp--;


                    }
                    break;

            }

            match(input,END,FOLLOW_END_in_ifStatement1505); 
            node = new If();

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


    // $ANTLR start "ifThen"
    // D:\\Projects UVA\\Oberon.g:218:1: ifThen : 'THEN' statements ;
    public final void ifThen() throws RecognitionException {
        try {
            // D:\\Projects UVA\\Oberon.g:218:8: ( 'THEN' statements )
            // D:\\Projects UVA\\Oberon.g:218:10: 'THEN' statements
            {
            match(input,THEN,FOLLOW_THEN_in_ifThen1519); 
            pushFollow(FOLLOW_statements_in_ifThen1521);
            statements();

            state._fsp--;


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
    // $ANTLR end "ifThen"


    // $ANTLR start "ifElsIf"
    // D:\\Projects UVA\\Oberon.g:220:1: ifElsIf : 'ELSIF' expression ifThen ;
    public final void ifElsIf() throws RecognitionException {
        try {
            // D:\\Projects UVA\\Oberon.g:220:9: ( 'ELSIF' expression ifThen )
            // D:\\Projects UVA\\Oberon.g:220:11: 'ELSIF' expression ifThen
            {
            match(input,ELSIF,FOLLOW_ELSIF_in_ifElsIf1530); 
            pushFollow(FOLLOW_expression_in_ifElsIf1532);
            expression();

            state._fsp--;

            pushFollow(FOLLOW_ifThen_in_ifElsIf1534);
            ifThen();

            state._fsp--;


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
    // $ANTLR end "ifElsIf"


    // $ANTLR start "ifElse"
    // D:\\Projects UVA\\Oberon.g:222:1: ifElse : 'ELSE' statements ;
    public final void ifElse() throws RecognitionException {
        try {
            // D:\\Projects UVA\\Oberon.g:222:8: ( 'ELSE' statements )
            // D:\\Projects UVA\\Oberon.g:222:10: 'ELSE' statements
            {
            match(input,ELSE,FOLLOW_ELSE_in_ifElse1543); 
            pushFollow(FOLLOW_statements_in_ifElse1545);
            statements();

            state._fsp--;


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
    // $ANTLR end "ifElse"


    // $ANTLR start "whileStatement"
    // D:\\Projects UVA\\Oberon.g:225:1: whileStatement returns [While node] : 'WHILE' expression 'DO' statements 'END' ;
    public final While whileStatement() throws RecognitionException {
        While node = null;

        try {
            // D:\\Projects UVA\\Oberon.g:226:2: ( 'WHILE' expression 'DO' statements 'END' )
            // D:\\Projects UVA\\Oberon.g:226:4: 'WHILE' expression 'DO' statements 'END'
            {
            match(input,WHILE,FOLLOW_WHILE_in_whileStatement1563); 
            pushFollow(FOLLOW_expression_in_whileStatement1565);
            expression();

            state._fsp--;

            match(input,55,FOLLOW_55_in_whileStatement1567); 
            pushFollow(FOLLOW_statements_in_whileStatement1569);
            statements();

            state._fsp--;

            match(input,END,FOLLOW_END_in_whileStatement1571); 
            node = new While();

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
    // D:\\Projects UVA\\Oberon.g:229:1: id1 returns [ID node] : ID ;
    public final ID id1() throws RecognitionException {
        ID node = null;

        Token ID17=null;

        try {
            // D:\\Projects UVA\\Oberon.g:230:2: ( ID )
            // D:\\Projects UVA\\Oberon.g:230:4: ID
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_id11588); 
            node = new ID((ID17!=null?ID17.getText():null));

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
    // D:\\Projects UVA\\Oberon.g:233:1: idList returns [IDs node] : node_id1= id1 ( ',' node_id2= id1 )* ;
    public final IDs idList() throws RecognitionException {
        IDs node = null;

        ID node_id1 = null;

        ID node_id2 = null;


        try {
            // D:\\Projects UVA\\Oberon.g:234:2: (node_id1= id1 ( ',' node_id2= id1 )* )
            // D:\\Projects UVA\\Oberon.g:234:4: node_id1= id1 ( ',' node_id2= id1 )*
            {
            node = new IDs();
            pushFollow(FOLLOW_id1_in_idList1611);
            node_id1=id1();

            state._fsp--;

            node.add(node_id1);
            // D:\\Projects UVA\\Oberon.g:236:3: ( ',' node_id2= id1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==53) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:236:4: ',' node_id2= id1
            	    {
            	    match(input,53,FOLLOW_53_in_idList1618); 
            	    pushFollow(FOLLOW_id1_in_idList1622);
            	    node_id2=id1();

            	    state._fsp--;

            	    node.add(node_id2);

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
    // $ANTLR end "idList"


    // $ANTLR start "id"
    // D:\\Projects UVA\\Oberon.g:238:1: id returns [ID node] : ID node_selector= idSelector[$node] ;
    public final ID id() throws RecognitionException {
        ID node = null;

        Token ID18=null;
        ID node_selector = null;


        try {
            // D:\\Projects UVA\\Oberon.g:239:2: ( ID node_selector= idSelector[$node] )
            // D:\\Projects UVA\\Oberon.g:239:4: ID node_selector= idSelector[$node]
            {
            ID18=(Token)match(input,ID,FOLLOW_ID_in_id1639); 
            node = new ID((ID18!=null?ID18.getText():null));
            pushFollow(FOLLOW_idSelector_in_id1647);
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
    // D:\\Projects UVA\\Oberon.g:242:1: idSelector[ID node_parent] returns [ID node] : ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* ;
    public final ID idSelector(ID node_parent) throws RecognitionException {
        ID node = null;

        Token ID19=null;
        BaseNode node_expression = null;


        ID node_current = node_parent;
        try {
            // D:\\Projects UVA\\Oberon.g:244:6: ( ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )* )
            // D:\\Projects UVA\\Oberon.g:244:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            {
            // D:\\Projects UVA\\Oberon.g:244:11: ( ( '.' ID ) | ( '[' node_expression= expression ']' ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==48) ) {
                    alt24=1;
                }
                else if ( (LA24_0==56) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\Projects UVA\\Oberon.g:244:12: ( '.' ID )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:244:12: ( '.' ID )
            	    // D:\\Projects UVA\\Oberon.g:244:13: '.' ID
            	    {
            	    match(input,48,FOLLOW_48_in_idSelector1680); 
            	    ID19=(Token)match(input,ID,FOLLOW_ID_in_idSelector1682); 

            	    }

            	    node_current=node_current.addID((ID19!=null?ID19.getText():null));

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects UVA\\Oberon.g:245:9: ( '[' node_expression= expression ']' )
            	    {
            	    // D:\\Projects UVA\\Oberon.g:245:9: ( '[' node_expression= expression ']' )
            	    // D:\\Projects UVA\\Oberon.g:245:10: '[' node_expression= expression ']'
            	    {
            	    match(input,56,FOLLOW_56_in_idSelector1696); 
            	    pushFollow(FOLLOW_expression_in_idSelector1700);
            	    node_expression=expression();

            	    state._fsp--;

            	    match(input,57,FOLLOW_57_in_idSelector1702); 
            	    node_current=node_current.addIndexID(node_expression);

            	    }


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
    // $ANTLR end "idSelector"

    // Delegated rules


 

    public static final BitSet FOLLOW_45_in_module300 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_module304 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_module306 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_module312 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_module316 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_module322 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_module326 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_module328 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_module330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_declarations355 = new BitSet(new long[]{0x0004000000000062L});
    public static final BitSet FOLLOW_constDeclaration_in_declaration378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclaration_in_declaration385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedure_in_declaration393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_in_constDeclaration413 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_constDeclaration418 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_constDeclaration420 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_constDeclaration422 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_constDeclaration424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_varDeclaration442 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_idList_in_varDeclaration447 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_varDeclaration449 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_varDeclaration453 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_varDeclaration455 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_50_in_procedure474 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_procedure478 = new BitSet(new long[]{0x0008400000000000L});
    public static final BitSet FOLLOW_procedureParams_in_procedure482 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure485 = new BitSet(new long[]{0x0004800000000060L});
    public static final BitSet FOLLOW_declarations_in_procedure491 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_procedure495 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_procedure501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_procedure505 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_procedure507 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedure509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_procedureParams529 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_procedureVar_in_procedureParams535 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_46_in_procedureParams542 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_procedureVar_in_procedureParams548 = new BitSet(new long[]{0x0010400000000000L});
    public static final BitSet FOLLOW_52_in_procedureParams554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureVarRef_in_procedureVar573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureVarNonRef_in_procedureVar581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_procedureVarRef598 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_idList_in_procedureVarRef603 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureVarRef605 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_procedureVarRef609 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedureVarRef611 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_idList_in_procedureVarNonRef634 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureVarNonRef636 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_procedureVarNonRef640 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_procedureVarNonRef642 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_CALL_READ_in_procedureCall676 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_CALL_WRITE_in_procedureCall688 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_CALL_WRITELN_in_procedureCall700 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCall712 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_procedureActualParams_in_procedureCall734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_procedureActualParams751 = new BitSet(new long[]{0x00180C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams756 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_53_in_procedureActualParams763 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_procedureActualParams767 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_52_in_procedureActualParams776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_type799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType817 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_arrayType821 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_arrayType823 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_arrayType827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_TYPE_in_intType839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_number852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor876 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_idSelector_in_factor887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_factor912 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_factor914 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_factor916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor928 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_factor932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term959 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MUL_in_term971 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term975 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_DIV_in_term983 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term987 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MOD_in_term995 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term999 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_AND_in_term1007 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_factor_in_term1011 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_MIN_in_base1048 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1052 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base1065 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1069 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_term_in_base1084 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_MIN_in_base1113 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1117 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_PLUS_in_base1130 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1134 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_OR_in_base1147 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_term_in_base1151 = new BitSet(new long[]{0x0000000043000002L});
    public static final BitSet FOLLOW_base_in_expression1187 = new BitSet(new long[]{0x0000000000FC0002L});
    public static final BitSet FOLLOW_EQUAL_in_expression1207 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNEQUAL_in_expression1223 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_in_expression1239 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_EQUAL_in_expression1256 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_in_expression1272 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREAT_EQUAL_in_expression1288 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_base_in_expression1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statements1326 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_statements1333 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statement_in_statements1337 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment1453 = new BitSet(new long[]{0x0101008000000000L});
    public static final BitSet FOLLOW_idSelector_in_assignment1460 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment1463 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_assignment1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement1489 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1491 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ifThen_in_ifStatement1493 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ifElsIf_in_ifStatement1496 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_ifElse_in_ifStatement1501 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ifStatement1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_ifThen1519 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifThen1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_ifElsIf1530 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_ifElsIf1532 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ifThen_in_ifElsIf1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_ifElse1543 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_ifElse1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement1563 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1565 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_whileStatement1567 = new BitSet(new long[]{0x0000443800021000L});
    public static final BitSet FOLLOW_statements_in_whileStatement1569 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_whileStatement1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id11588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id1_in_idList1611 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_idList1618 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_id1_in_idList1622 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ID_in_id1639 = new BitSet(new long[]{0x0101000000000000L});
    public static final BitSet FOLLOW_idSelector_in_id1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_idSelector1680 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ID_in_idSelector1682 = new BitSet(new long[]{0x0101000000000002L});
    public static final BitSet FOLLOW_56_in_idSelector1696 = new BitSet(new long[]{0x00080C0083000000L});
    public static final BitSet FOLLOW_expression_in_idSelector1700 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_idSelector1702 = new BitSet(new long[]{0x0101000000000002L});

}