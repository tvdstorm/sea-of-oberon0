// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g 2011-02-08 09:44:34

  package parser;
  
  import ast.*;
  import ast.expression.*;
  import ast.expression.selector.*;
  import errorhandler.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "'='", "'ARRAY'", "'OF'", "'RECORD'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "':'", "','", "'WITH'", "'DO'", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'PROCEDURE'"
    };
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int IDENT=4;
    public static final int INTEGER=5;
    public static final int WS=6;

    // delegates
    // delegators


        public oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g"; }


        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            
            Errorlog.addMessage( hdr + " -> " + msg );
        }



    // $ANTLR start "module"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:34:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:35:3: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:35:5: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module60); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module64); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module66); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module68);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:35:42: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:35:43: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_module71); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_module73);
                    statementsequence2=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_module77); if (state.failed) return e;
            ind2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module81); if (state.failed) return e;
            match(input,11,FOLLOW_11_in_module83); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new ModuleNode( (ind1!=null?ind1.getText():null), (ind2!=null?ind2.getText():null), declarations1, statementsequence2 ); // also send the indent.text for error logging 
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "module"


    // $ANTLR start "declarations"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:41:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;

        TypeDefNode typeDefs4 = null;

        FieldsNode fields5 = null;

        ProcedureListNode procedureList6 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:3: ( ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:5: ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:5: ( 'CONST' constants )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:6: 'CONST' constants
                    {
                    match(input,12,FOLLOW_12_in_declarations106); if (state.failed) return e;
                    pushFollow(FOLLOW_constants_in_declarations108);
                    constants3=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:26: ( 'TYPE' typeDefs )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:27: 'TYPE' typeDefs
                    {
                    match(input,13,FOLLOW_13_in_declarations113); if (state.failed) return e;
                    pushFollow(FOLLOW_typeDefs_in_declarations115);
                    typeDefs4=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:45: ( 'VAR' fields )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:46: 'VAR' fields
                    {
                    match(input,14,FOLLOW_14_in_declarations120); if (state.failed) return e;
                    pushFollow(FOLLOW_fields_in_declarations122);
                    fields5=fields();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:62: ( procedureList )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case 46:
                    {
                    alt5=1;
                    }
                    break;
                case 9:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_oberon0()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 10:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (synpred5_oberon0()) ) {
                        alt5=1;
                    }
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:63: procedureList
                    {
                    pushFollow(FOLLOW_procedureList_in_declarations128);
                    procedureList6=procedureList();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new DeclarationsNode( constants3, typeDefs4, fields5, procedureList6 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "declarations"


    // $ANTLR start "constants"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:48:1: constants returns [ ConstantNode e ] : ( IDENT '=' expression ';' ) (constantFollowUp= constants )? ;
    public final ConstantNode constants() throws RecognitionException {
        ConstantNode e = null;

        Token IDENT7=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression8 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:49:3: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:49:5: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:49:5: ( IDENT '=' expression ';' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:49:6: IDENT '=' expression ';'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants154); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_constants156); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants158);
            expression8=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants160); if (state.failed) return e;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:49:48: (constantFollowUp= constants )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:0:0: constantFollowUp= constants
                    {
                    pushFollow(FOLLOW_constants_in_constants165);
                    constantFollowUp=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new ConstantNode( (IDENT7!=null?IDENT7.getText():null), expression8, constantFollowUp );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "constants"


    // $ANTLR start "typeDefs"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:55:1: typeDefs returns [ TypeDefNode e ] : ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? ;
    public final TypeDefNode typeDefs() throws RecognitionException {
        TypeDefNode e = null;

        Token IDENT9=null;
        TypeDefNode typeDefsFollowUp = null;

        ASTnode type10 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:56:3: ( ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:56:5: ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:56:5: ( IDENT '=' type ';' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:56:6: IDENT '=' type ';'
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDefs188); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_typeDefs190); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_typeDefs192);
            type10=type();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_typeDefs194); if (state.failed) return e;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:56:42: (typeDefsFollowUp= typeDefs )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:0:0: typeDefsFollowUp= typeDefs
                    {
                    pushFollow(FOLLOW_typeDefs_in_typeDefs199);
                    typeDefsFollowUp=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new TypeDefNode( (IDENT9!=null?IDENT9.getText():null), type10, typeDefsFollowUp );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "typeDefs"


    // $ANTLR start "type"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:62:1: type returns [ ASTnode e ] : ( IDENT | arraytype | recordtype );
    public final ASTnode type() throws RecognitionException {
        ASTnode e = null;

        Token IDENT11=null;
        ArrayNode arraytype12 = null;

        RecordNode recordtype13 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:63:3: ( IDENT | arraytype | recordtype )
            int alt8=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:63:5: IDENT
                    {
                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_type221); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new TypeNode( (IDENT11!=null?IDENT11.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:64:5: arraytype
                    {
                    pushFollow(FOLLOW_arraytype_in_type229);
                    arraytype12=arraytype();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = arraytype12; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:65:5: recordtype
                    {
                    pushFollow(FOLLOW_recordtype_in_type237);
                    recordtype13=recordtype();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = recordtype13; 
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
        return e;
    }
    // $ANTLR end "type"


    // $ANTLR start "arraytype"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:68:1: arraytype returns [ ArrayNode e ] : 'ARRAY' expression 'OF' type ;
    public final ArrayNode arraytype() throws RecognitionException {
        ArrayNode e = null;

        ExpressionNode expression14 = null;

        ASTnode type15 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:69:3: ( 'ARRAY' expression 'OF' type )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:69:5: 'ARRAY' expression 'OF' type
            {
            match(input,16,FOLLOW_16_in_arraytype256); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_arraytype258);
            expression14=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,17,FOLLOW_17_in_arraytype260); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_arraytype262);
            type15=type();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new ArrayNode( expression14, type15 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "arraytype"


    // $ANTLR start "recordtype"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:75:1: recordtype returns [ RecordNode e ] : 'RECORD' fields 'END' ;
    public final RecordNode recordtype() throws RecognitionException {
        RecordNode e = null;

        FieldsNode fields16 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:76:3: ( 'RECORD' fields 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:76:5: 'RECORD' fields 'END'
            {
            match(input,18,FOLLOW_18_in_recordtype285); if (state.failed) return e;
            pushFollow(FOLLOW_fields_in_recordtype287);
            fields16=fields();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_recordtype289); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new RecordNode( fields16 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "recordtype"


    // $ANTLR start "fields"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:82:1: fields returns [ FieldsNode e ] : fieldlist ( fieldsFollowup )? ;
    public final FieldsNode fields() throws RecognitionException {
        FieldsNode e = null;

        FieldlistNode fieldlist17 = null;

        FieldsNode fieldsFollowup18 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:83:3: ( fieldlist ( fieldsFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:83:5: fieldlist ( fieldsFollowup )?
            {
            pushFollow(FOLLOW_fieldlist_in_fields312);
            fieldlist17=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:83:15: ( fieldsFollowup )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==8) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:83:16: fieldsFollowup
                    {
                    pushFollow(FOLLOW_fieldsFollowup_in_fields315);
                    fieldsFollowup18=fieldsFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new FieldsNode( fieldlist17, fieldsFollowup18 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "fields"


    // $ANTLR start "fieldsFollowup"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:89:1: fieldsFollowup returns [ FieldsNode e ] : ';' fieldlist (followup= fieldsFollowup )? ;
    public final FieldsNode fieldsFollowup() throws RecognitionException {
        FieldsNode e = null;

        FieldsNode followup = null;

        FieldlistNode fieldlist19 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:90:3: ( ';' fieldlist (followup= fieldsFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:90:5: ';' fieldlist (followup= fieldsFollowup )?
            {
            match(input,8,FOLLOW_8_in_fieldsFollowup338); if (state.failed) return e;
            pushFollow(FOLLOW_fieldlist_in_fieldsFollowup340);
            fieldlist19=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:90:19: (followup= fieldsFollowup )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==8) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:90:20: followup= fieldsFollowup
                    {
                    pushFollow(FOLLOW_fieldsFollowup_in_fieldsFollowup345);
                    followup=fieldsFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new FieldsNode( fieldlist19, followup );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "fieldsFollowup"


    // $ANTLR start "expression"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:96:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode simpleLeft = null;

        ExpressionNode simpleRight = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:97:3: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:97:5: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression373);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = simpleLeft; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:98:5: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15||(LA12_0>=19 && LA12_0<=23)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:98:6: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:98:15: ( '=' | '#' | '<' | '<=' | '>' | '>=' )
                    int alt11=6;
                    switch ( input.LA(1) ) {
                    case 15:
                        {
                        alt11=1;
                        }
                        break;
                    case 19:
                        {
                        alt11=2;
                        }
                        break;
                    case 20:
                        {
                        alt11=3;
                        }
                        break;
                    case 21:
                        {
                        alt11=4;
                        }
                        break;
                    case 22:
                        {
                        alt11=5;
                        }
                        break;
                    case 23:
                        {
                        alt11=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }

                    switch (alt11) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:99:7: '='
                            {
                            match(input,15,FOLLOW_15_in_expression393); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new EqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:100:7: '#'
                            {
                            match(input,19,FOLLOW_19_in_expression403); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new NotEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:101:7: '<'
                            {
                            match(input,20,FOLLOW_20_in_expression413); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new SmallerNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:102:7: '<='
                            {
                            match(input,21,FOLLOW_21_in_expression423); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new SmallerEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:103:7: '>'
                            {
                            match(input,22,FOLLOW_22_in_expression433); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new BiggerNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 6 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:104:7: '>='
                            {
                            match(input,23,FOLLOW_23_in_expression443); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new BiggerEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression460);
                    simpleRight=simpleexpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e.setRight( simpleRight ); 
                    }

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
        return e;
    }
    // $ANTLR end "expression"


    // $ANTLR start "simpleexpression"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:109:1: simpleexpression returns [ ExpressionNode e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final ExpressionNode simpleexpression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode specialTerm20 = null;

        ExpressionNode simpleExpressionFollowup21 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:110:3: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:110:5: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression484);
            specialTerm20=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = specialTerm20; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:111:3: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:111:5: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:111:14: ( '+' | '-' | 'OR' )
                    int alt13=3;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt13=1;
                        }
                        break;
                    case 25:
                        {
                        alt13=2;
                        }
                        break;
                    case 26:
                        {
                        alt13=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }

                    switch (alt13) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:112:5: '+'
                            {
                            match(input,24,FOLLOW_24_in_simpleexpression500); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new PlusNode( specialTerm20, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:113:5: '-'
                            {
                            match(input,25,FOLLOW_25_in_simpleexpression508); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new MinNode( specialTerm20, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:114:5: 'OR'
                            {
                            match(input,26,FOLLOW_26_in_simpleexpression516); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new OrNode( specialTerm20, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression524);
                    simpleExpressionFollowup21=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e.setRight( simpleExpressionFollowup21 );
                        
                    }

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
        return e;
    }
    // $ANTLR end "simpleexpression"


    // $ANTLR start "specialTerm"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:122:1: specialTerm returns [ ExpressionNode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ExpressionNode specialTerm() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode term22 = null;

        ExpressionNode term23 = null;

        ExpressionNode term24 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:123:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 25:
                {
                alt15=2;
                }
                break;
            case IDENT:
            case INTEGER:
            case 31:
            case 33:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:123:5: operator= ( '+' ) term
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:123:14: ( '+' )
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:123:15: '+'
                    {
                    match(input,24,FOLLOW_24_in_specialTerm556); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm559);
                    term22=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term22; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:124:5: operator= ( '-' ) term
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:124:14: ( '-' )
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:124:15: '-'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm570); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm573);
                    term23=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new MinusNode( term23 ); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:125:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm581);
                    term24=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term24; 
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
        return e;
    }
    // $ANTLR end "specialTerm"


    // $ANTLR start "simpleExpressionFollowup"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:128:1: simpleExpressionFollowup returns [ ExpressionNode e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final ExpressionNode simpleExpressionFollowup() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode follow2 = null;

        ExpressionNode term25 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:129:3: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:129:6: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup603);
            term25=term();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = term25; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:130:3: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=24 && LA17_0<=26)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:130:4: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:131:3: ( '+' | '-' | 'OR' )
                    int alt16=3;
                    switch ( input.LA(1) ) {
                    case 24:
                        {
                        alt16=1;
                        }
                        break;
                    case 25:
                        {
                        alt16=2;
                        }
                        break;
                    case 26:
                        {
                        alt16=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:132:5: '+'
                            {
                            match(input,24,FOLLOW_24_in_simpleExpressionFollowup622); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new PlusNode( term25, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:133:5: '-'
                            {
                            match(input,25,FOLLOW_25_in_simpleExpressionFollowup630); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new MinNode( term25, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:134:5: 'OR'
                            {
                            match(input,26,FOLLOW_26_in_simpleExpressionFollowup638); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new OrNode( term25, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup648);
                    follow2=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e.setRight( follow2 );
                        
                    }

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
        return e;
    }
    // $ANTLR end "simpleExpressionFollowup"


    // $ANTLR start "term"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:142:1: term returns [ ExpressionNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )? ;
    public final ExpressionNode term() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode followup = null;

        ExpressionNode factor26 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:143:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:143:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )?
            {
            pushFollow(FOLLOW_factor_in_term676);
            factor26=factor();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = factor26; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:144:3: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=27 && LA19_0<=30)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:144:4: operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:145:3: ( '*' | 'DIV' | 'MOD' | '&' )
                    int alt18=4;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt18=1;
                        }
                        break;
                    case 28:
                        {
                        alt18=2;
                        }
                        break;
                    case 29:
                        {
                        alt18=3;
                        }
                        break;
                    case 30:
                        {
                        alt18=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:146:5: '*'
                            {
                            match(input,27,FOLLOW_27_in_term694); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new MultiplyNode( factor26, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:147:5: 'DIV'
                            {
                            match(input,28,FOLLOW_28_in_term702); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new DivideNode( factor26, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:148:5: 'MOD'
                            {
                            match(input,29,FOLLOW_29_in_term710); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ModuloNode( factor26, null ); 
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:149:5: '&'
                            {
                            match(input,30,FOLLOW_30_in_term718); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new AndNode( factor26, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_term_in_term731);
                    followup=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e.setRight( followup ); 
                    }

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
        return e;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:154:1: factor returns [ ExpressionNode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ExpressionNode factor() throws RecognitionException {
        ExpressionNode e = null;

        ExpressionNode factorOperand = null;

        ExpressionNode variable27 = null;

        ExpressionNode number28 = null;

        ExpressionNode expression29 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:155:3: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
            int alt20=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt20=1;
                }
                break;
            case INTEGER:
                {
                alt20=2;
                }
                break;
            case 31:
                {
                alt20=3;
                }
                break;
            case 33:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:155:5: variable
                    {
                    pushFollow(FOLLOW_variable_in_factor755);
                    variable27=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = variable27; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:156:5: number
                    {
                    pushFollow(FOLLOW_number_in_factor763);
                    number28=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number28; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:157:5: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor771); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor773);
                    expression29=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,32,FOLLOW_32_in_factor775); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression29; 
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:158:5: '~' factorOperand= factor
                    {
                    match(input,33,FOLLOW_33_in_factor783); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor787);
                    factorOperand=factor();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new NotNode( factorOperand ); 
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
        return e;
    }
    // $ANTLR end "factor"


    // $ANTLR start "number"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:161:1: number returns [ ExpressionNode e ] : INTEGER ;
    public final ExpressionNode number() throws RecognitionException {
        ExpressionNode e = null;

        Token INTEGER30=null;

        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:162:3: ( INTEGER )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:162:5: INTEGER
            {
            INTEGER30=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number806); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                   e = new IntegerNode( Integer.parseInt( (INTEGER30!=null?INTEGER30.getText():null) ) );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "number"


    // $ANTLR start "selector"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:168:1: selector returns [ ASTnode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final ASTnode selector() throws RecognitionException {
        ASTnode e = null;

        Token var=null;
        ASTnode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:169:3: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:170:3: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:170:3: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==11) ) {
                alt21=1;
            }
            else if ( (LA21_0==34) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:171:3: '.' var= IDENT selectorFollowup= selector
                    {
                    match(input,11,FOLLOW_11_in_selector838); if (state.failed) return e;
                    var=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector842); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector846);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new SelectorRecordNode( (var!=null?var.getText():null), selectorFollowup );
                        
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:176:3: '[' exp= expression ']' selectorFollowup= selector
                    {
                    match(input,34,FOLLOW_34_in_selector860); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_selector864);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,35,FOLLOW_35_in_selector866); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector870);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new SelectorArrayNode( exp, selectorFollowup );
                        
                    }

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
        return e;
    }
    // $ANTLR end "selector"


    // $ANTLR start "variable"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:183:1: variable returns [ ExpressionNode e ] : IDENT selector ;
    public final ExpressionNode variable() throws RecognitionException {
        ExpressionNode e = null;

        Token IDENT31=null;
        ASTnode selector32 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:184:3: ( IDENT selector )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:184:5: IDENT selector
            {
            IDENT31=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable899); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable901);
            selector32=selector();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new VarNode( (IDENT31!=null?IDENT31.getText():null), selector32 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "variable"


    // $ANTLR start "fieldlist"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:190:1: fieldlist returns [ FieldlistNode e ] : ( identlist ':' type )? ;
    public final FieldlistNode fieldlist() throws RecognitionException {
        FieldlistNode e = null;

        IdentListNode identlist33 = null;

        ASTnode type34 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:191:3: ( ( identlist ':' type )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:191:5: ( identlist ':' type )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:191:5: ( identlist ':' type )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:191:6: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist925);
                    identlist33=identlist();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,36,FOLLOW_36_in_fieldlist927); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_fieldlist929);
                    type34=type();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new FieldlistNode( identlist33, type34 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "fieldlist"


    // $ANTLR start "identlist"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:197:1: identlist returns [ IdentListNode e ] : IDENT ( identlistFollowUp )? ;
    public final IdentListNode identlist() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT35=null;
        IdentListNode identlistFollowUp36 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:198:3: ( IDENT ( identlistFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:198:5: IDENT ( identlistFollowUp )?
            {
            IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist954); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:198:11: ( identlistFollowUp )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:198:13: identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlist958);
                    identlistFollowUp36=identlistFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new IdentListNode( (IDENT35!=null?IDENT35.getText():null), identlistFollowUp36 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "identlist"


    // $ANTLR start "identlistFollowUp"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:204:1: identlistFollowUp returns [ IdentListNode e ] : ',' IDENT (followup= identlistFollowUp )? ;
    public final IdentListNode identlistFollowUp() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT37=null;
        IdentListNode followup = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:205:3: ( ',' IDENT (followup= identlistFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:205:5: ',' IDENT (followup= identlistFollowUp )?
            {
            match(input,37,FOLLOW_37_in_identlistFollowUp984); if (state.failed) return e;
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlistFollowUp986); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:205:15: (followup= identlistFollowUp )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:205:17: followup= identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlistFollowUp992);
                    followup=identlistFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new IdentListNode( (IDENT37!=null?IDENT37.getText():null), followup );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "identlistFollowUp"


    // $ANTLR start "statementsequence"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:211:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement38 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:212:3: ( statement (followOne= followupStatementSequence )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:212:5: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence1015);
            statement38=statement();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:212:15: (followOne= followupStatementSequence )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==8) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:212:17: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence1021);
                    followOne=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new StatementSequenceNode( statement38, followOne );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "statementsequence"


    // $ANTLR start "followupStatementSequence"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:218:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement39 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:219:3: ( ';' statement (followTwo= followupStatementSequence )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:219:5: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence1045); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence1047);
            statement39=statement();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:219:19: (followTwo= followupStatementSequence )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==8) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:219:21: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence1053);
                    followTwo=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new StatementSequenceNode( statement39, followTwo );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "followupStatementSequence"


    // $ANTLR start "statement"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:225:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:3: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:5: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:5: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )?
            int alt27=6;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==11||LA27_1==34||LA27_1==40) ) {
                        alt27=1;
                    }
                    else if ( (LA27_1==EOF||LA27_1==8||LA27_1==10||LA27_1==31||(LA27_1>=43 && LA27_1<=44)) ) {
                        alt27=2;
                    }
                    }
                    break;
                case 41:
                    {
                    alt27=3;
                    }
                    break;
                case 45:
                    {
                    alt27=4;
                    }
                    break;
                case 38:
                    {
                    alt27=5;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:7: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1080);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:32: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement1086);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:60: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement1092);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:86: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement1098);
                    statementRv=whilestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:226:115: statementRv= withCall
                    {
                    pushFollow(FOLLOW_withCall_in_statement1104);
                    statementRv=withCall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = statementRv;
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "statement"


    // $ANTLR start "withCall"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:232:1: withCall returns [ StatementNode e ] : 'WITH' expression 'DO' statementsequence 'END' ;
    public final StatementNode withCall() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression40 = null;

        StatementSequenceNode statementsequence41 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:233:3: ( 'WITH' expression 'DO' statementsequence 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:233:5: 'WITH' expression 'DO' statementsequence 'END'
            {
            match(input,38,FOLLOW_38_in_withCall1129); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_withCall1131);
            expression40=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,39,FOLLOW_39_in_withCall1133); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_withCall1135);
            statementsequence41=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_withCall1137); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new WithStatementNode( expression40, statementsequence41 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "withCall"


    // $ANTLR start "assignment"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:239:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode variable42 = null;

        ExpressionNode expression43 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:240:3: ( variable ':=' expression )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:240:5: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment1160);
            variable42=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_assignment1162); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment1164);
            expression43=expression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new AssignmentNode( variable42, expression43 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "procedurecall"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:246:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT44=null;
        ParamNode actualparameters45 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:247:3: ( IDENT ( actualparameters )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:247:5: IDENT ( actualparameters )?
            {
            IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall1187); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:247:11: ( actualparameters )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:247:12: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall1190);
                    actualparameters45=actualparameters();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new ProcedureCallNode( (IDENT44!=null?IDENT44.getText():null), actualparameters45 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedurecall"


    // $ANTLR start "actualparameters"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:253:1: actualparameters returns [ ParamNode e ] : '(' ( expression (follow= actualparametersfollowup )? )? ')' ;
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression46 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:254:3: ( '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:254:5: '(' ( expression (follow= actualparametersfollowup )? )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters1215); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:254:9: ( expression (follow= actualparametersfollowup )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=IDENT && LA30_0<=INTEGER)||(LA30_0>=24 && LA30_0<=25)||LA30_0==31||LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:254:11: expression (follow= actualparametersfollowup )?
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters1219);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:254:22: (follow= actualparametersfollowup )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==37) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:254:24: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters1225);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters1232); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new ParamNode( expression46, follow );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "actualparameters"


    // $ANTLR start "actualparametersfollowup"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:260:1: actualparametersfollowup returns [ ParamNode e] : ',' expression (follow= actualparametersfollowup )? ;
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression47 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:261:3: ( ',' expression (follow= actualparametersfollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:261:5: ',' expression (follow= actualparametersfollowup )?
            {
            match(input,37,FOLLOW_37_in_actualparametersfollowup1255); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_actualparametersfollowup1257);
            expression47=expression();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:261:20: (follow= actualparametersfollowup )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:261:22: follow= actualparametersfollowup
                    {
                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup1263);
                    follow=actualparametersfollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new ParamNode( expression47, follow );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "actualparametersfollowup"


    // $ANTLR start "ifstatement"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:267:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression48 = null;

        StatementSequenceNode statementsequence49 = null;

        StatementNode elsestatement50 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:268:3: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:268:5: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,41,FOLLOW_41_in_ifstatement1288); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement1290);
            expression48=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,42,FOLLOW_42_in_ifstatement1292); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement1294);
            statementsequence49=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:268:46: ( elsestatement )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=43 && LA32_0<=44)) ) {
                alt32=1;
            }
            else if ( (LA32_0==10) ) {
                int LA32_2 = input.LA(2);

                if ( (synpred49_oberon0()) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement1296);
                    elsestatement50=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement1299); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new IfStatementNode( expression48, statementsequence49, elsestatement50 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "ifstatement"


    // $ANTLR start "elsestatement"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:274:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression51 = null;

        StatementSequenceNode statementsequence52 = null;

        StatementSequenceNode statementsequence53 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:275:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt33=1;
                }
                break;
            case 44:
                {
                alt33=2;
                }
                break;
            case EOF:
            case 10:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:275:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,43,FOLLOW_43_in_elsestatement1322); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement1324);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,42,FOLLOW_42_in_elsestatement1326); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1328);
                    statementsequence52=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement1332);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression51, statementsequence52, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:279:5: 'ELSE' statementsequence
                    {
                    match(input,44,FOLLOW_44_in_elsestatement1343); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1345);
                    statementsequence53=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence53 );
                        
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:284:3: 
                    {
                    if ( state.backtracking==0 ) {

                          e = null;
                        
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
        return e;
    }
    // $ANTLR end "elsestatement"


    // $ANTLR start "whilestatement"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:289:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:290:3: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:290:5: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,45,FOLLOW_45_in_whilestatement1377); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement1381);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,39,FOLLOW_39_in_whilestatement1383); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement1387);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1389); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new WhileStatementNode( cond, ifTrueDo );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "whilestatement"


    // $ANTLR start "procedureList"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:296:1: procedureList returns [ ProcedureListNode e ] : ( proceduredeclaration ';' (followup= procedureList )? )? ;
    public final ProcedureListNode procedureList() throws RecognitionException {
        ProcedureListNode e = null;

        ProcedureListNode followup = null;

        ProcedureDeclarationNode proceduredeclaration54 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:3: ( ( proceduredeclaration ';' (followup= procedureList )? )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:5: ( proceduredeclaration ';' (followup= procedureList )? )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:5: ( proceduredeclaration ';' (followup= procedureList )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:6: proceduredeclaration ';' (followup= procedureList )?
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_procedureList1413);
                    proceduredeclaration54=proceduredeclaration();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,8,FOLLOW_8_in_procedureList1415); if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:31: (followup= procedureList )?
                    int alt34=2;
                    switch ( input.LA(1) ) {
                        case 46:
                            {
                            alt34=1;
                            }
                            break;
                        case 9:
                            {
                            int LA34_2 = input.LA(2);

                            if ( (synpred52_oberon0()) ) {
                                alt34=1;
                            }
                            }
                            break;
                        case 10:
                            {
                            int LA34_3 = input.LA(2);

                            if ( (synpred52_oberon0()) ) {
                                alt34=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA34_4 = input.LA(2);

                            if ( (synpred52_oberon0()) ) {
                                alt34=1;
                            }
                            }
                            break;
                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:33: followup= procedureList
                            {
                            pushFollow(FOLLOW_procedureList_in_procedureList1421);
                            followup=procedureList();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new ProcedureListNode( proceduredeclaration54, followup );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedureList"


    // $ANTLR start "proceduredeclaration"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:303:1: proceduredeclaration returns [ ProcedureDeclarationNode e ] : procedureheading ';' procedurebody ;
    public final ProcedureDeclarationNode proceduredeclaration() throws RecognitionException {
        ProcedureDeclarationNode e = null;

        ProcedureHeadingNode procedureheading55 = null;

        ProcedureBodyNode procedurebody56 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:304:3: ( procedureheading ';' procedurebody )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:304:5: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1450);
            procedureheading55=procedureheading();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_proceduredeclaration1452); if (state.failed) return e;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1454);
            procedurebody56=procedurebody();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new ProcedureDeclarationNode( procedureheading55, procedurebody56 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "proceduredeclaration"


    // $ANTLR start "procedureheading"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:310:1: procedureheading returns [ ProcedureHeadingNode e ] : 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? ;
    public final ProcedureHeadingNode procedureheading() throws RecognitionException {
        ProcedureHeadingNode e = null;

        Token IDENT57=null;
        FormalParameterNode formalparameters58 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:311:3: ( 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:311:5: 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )?
            {
            match(input,46,FOLLOW_46_in_procedureheading1477); if (state.failed) return e;
            IDENT57=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading1479); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:311:23: ( '(' ( formalparameters )? ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:311:25: '(' ( formalparameters )? ')'
                    {
                    match(input,31,FOLLOW_31_in_procedureheading1483); if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:311:29: ( formalparameters )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==IDENT||LA36_0==14) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:0:0: formalparameters
                            {
                            pushFollow(FOLLOW_formalparameters_in_procedureheading1485);
                            formalparameters58=formalparameters();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_procedureheading1488); if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new ProcedureHeadingNode( (IDENT57!=null?IDENT57.getText():null), formalparameters58 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedureheading"


    // $ANTLR start "procedurebody"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:317:1: procedurebody returns [ ProcedureBodyNode e ] : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final ProcedureBodyNode procedurebody() throws RecognitionException {
        ProcedureBodyNode e = null;

        Token IDENT61=null;
        DeclarationsNode declarations59 = null;

        StatementSequenceNode statementsequence60 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:318:3: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:318:5: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1512);
            declarations59=declarations();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:318:18: ( 'BEGIN' statementsequence )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==9) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:318:19: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1515); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1517);
                    statementsequence60=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1521); if (state.failed) return e;
            IDENT61=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody1523); if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new ProcedureBodyNode( declarations59, statementsequence60, (IDENT61!=null?IDENT61.getText():null));
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "procedurebody"


    // $ANTLR start "formalparameters"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:324:1: formalparameters returns [ FormalParameterNode e ] : fpsection ( ';' followup= formalparameters )? ;
    public final FormalParameterNode formalparameters() throws RecognitionException {
        FormalParameterNode e = null;

        FormalParameterNode followup = null;

        FpSectionNode fpsection62 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:325:3: ( fpsection ( ';' followup= formalparameters )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:325:5: fpsection ( ';' followup= formalparameters )?
            {
            pushFollow(FOLLOW_fpsection_in_formalparameters1546);
            fpsection62=fpsection();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:325:15: ( ';' followup= formalparameters )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==8) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:325:17: ';' followup= formalparameters
                    {
                    match(input,8,FOLLOW_8_in_formalparameters1550); if (state.failed) return e;
                    pushFollow(FOLLOW_formalparameters_in_formalparameters1554);
                    followup=formalparameters();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new FormalParameterNode( fpsection62, followup );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "formalparameters"


    // $ANTLR start "fpsection"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:331:1: fpsection returns [ FpSectionNode e ] : (ident= 'VAR' )? identlist ':' type ;
    public final FpSectionNode fpsection() throws RecognitionException {
        FpSectionNode e = null;

        Token ident=null;
        IdentListNode identlist63 = null;

        ASTnode type64 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:332:3: ( (ident= 'VAR' )? identlist ':' type )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:332:5: (ident= 'VAR' )? identlist ':' type
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:332:5: (ident= 'VAR' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:332:6: ident= 'VAR'
                    {
                    ident=(Token)match(input,14,FOLLOW_14_in_fpsection1581); if (state.failed) return e;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1585);
            identlist63=identlist();

            state._fsp--;
            if (state.failed) return e;
            match(input,36,FOLLOW_36_in_fpsection1587); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_fpsection1589);
            type64=type();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new FpSectionNode( (ident!=null?ident.getText():null), identlist63, type64 );
                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return e;
    }
    // $ANTLR end "fpsection"

    // $ANTLR start synpred5_oberon0
    public final void synpred5_oberon0_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:63: ( procedureList )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:63: procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred5_oberon0128);
        procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_oberon0

    // $ANTLR start synpred49_oberon0
    public final void synpred49_oberon0_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:268:46: ( elsestatement )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:268:46: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred49_oberon01296);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_oberon0

    // $ANTLR start synpred52_oberon0
    public final void synpred52_oberon0_fragment() throws RecognitionException {   
        ProcedureListNode followup = null;


        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:33: (followup= procedureList )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:297:33: followup= procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred52_oberon01421);
        followup=procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_oberon0

    // Delegated rules

    public final boolean synpred5_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_7_in_module60 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module64 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module66 = new BitSet(new long[]{0x0000400000007000L});
    public static final BitSet FOLLOW_declarations_in_module68 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module71 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module73 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module77 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module81 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_constants_in_declarations108 = new BitSet(new long[]{0x0000400000006000L});
    public static final BitSet FOLLOW_13_in_declarations113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeDefs_in_declarations115 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_14_in_declarations120 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fields_in_declarations122 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_procedureList_in_declarations128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constants154 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_constants156 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_constants158 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_constants160 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_constants_in_constants165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDefs188 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_typeDefs190 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_typeDefs192 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_typeDefs194 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_typeDefs_in_typeDefs199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_arraytype256 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_arraytype258 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_arraytype260 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_arraytype262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_recordtype285 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fields_in_recordtype287 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_recordtype289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldlist_in_fields312 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_fieldsFollowup_in_fields315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_fieldsFollowup338 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fieldlist_in_fieldsFollowup340 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_fieldsFollowup_in_fieldsFollowup345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression373 = new BitSet(new long[]{0x0000000000F88002L});
    public static final BitSet FOLLOW_15_in_expression393 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_19_in_expression403 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_20_in_expression413 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_21_in_expression423 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_22_in_expression433 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_23_in_expression443 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialTerm_in_simpleexpression484 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_24_in_simpleexpression500 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_25_in_simpleexpression508 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_26_in_simpleexpression516 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_specialTerm556 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm570 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup603 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_24_in_simpleExpressionFollowup622 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_25_in_simpleExpressionFollowup630 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_26_in_simpleExpressionFollowup638 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term676 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_27_in_term694 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_28_in_term702 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_29_in_term710 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_30_in_term718 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_term731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor771 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor773 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor783 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector842 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_selector860 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector864 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector866 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable899 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_variable901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist925 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldlist927 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fieldlist929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist954 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlist958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identlistFollowUp984 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlistFollowUp986 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlistFollowUp992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence1015 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence1045 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence1047 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withCall_in_statement1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_withCall1129 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_withCall1131 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_withCall1133 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_withCall1135 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_withCall1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1160 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_assignment1162 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall1187 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters1215 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters1219 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters1225 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup1255 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup1257 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifstatement1288 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement1290 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifstatement1292 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement1294 = new BitSet(new long[]{0x0000180000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement1296 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_elsestatement1322 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement1324 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_elsestatement1326 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1328 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_elsestatement1343 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_whilestatement1377 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement1381 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_whilestatement1383 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement1387 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_procedureList1413 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureList1415 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_procedureList_in_procedureList1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1450 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1452 = new BitSet(new long[]{0x0000400000007000L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_procedureheading1477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1479 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_procedureheading1483 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1485 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureheading1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1512 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1515 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1517 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1546 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_formalparameters1550 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalparameters_in_formalparameters1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_fpsection1581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1585 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fpsection1587 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fpsection1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred5_oberon0128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred49_oberon01296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred52_oberon01421 = new BitSet(new long[]{0x0000000000000002L});

}