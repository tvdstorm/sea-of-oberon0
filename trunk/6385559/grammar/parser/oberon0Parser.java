// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g 2011-02-08 11:09:13

  package parser;
  
  import ast.*;
  import ast.expression.*;
  import ast.expression.selector.*;
  import errorhandler.*;
  import factory.*;


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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:35:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:36:3: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:36:5: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module60); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module64); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module66); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module68);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:36:42: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:36:43: 'BEGIN' statementsequence
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:42:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;

        TypeDefNode typeDefs4 = null;

        FieldsNode fields5 = null;

        ProcedureListNode procedureList6 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:3: ( ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:5: ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:5: ( 'CONST' constants )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:6: 'CONST' constants
                    {
                    match(input,12,FOLLOW_12_in_declarations106); if (state.failed) return e;
                    pushFollow(FOLLOW_constants_in_declarations108);
                    constants3=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:26: ( 'TYPE' typeDefs )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:27: 'TYPE' typeDefs
                    {
                    match(input,13,FOLLOW_13_in_declarations113); if (state.failed) return e;
                    pushFollow(FOLLOW_typeDefs_in_declarations115);
                    typeDefs4=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:45: ( 'VAR' fields )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:46: 'VAR' fields
                    {
                    match(input,14,FOLLOW_14_in_declarations120); if (state.failed) return e;
                    pushFollow(FOLLOW_fields_in_declarations122);
                    fields5=fields();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:62: ( procedureList )?
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:63: procedureList
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:49:1: constants returns [ ConstantNode e ] : ( IDENT '=' expression ';' ) (constantFollowUp= constants )? ;
    public final ConstantNode constants() throws RecognitionException {
        ConstantNode e = null;

        Token IDENT7=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression8 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:50:3: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:50:5: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:50:5: ( IDENT '=' expression ';' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:50:6: IDENT '=' expression ';'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants154); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_constants156); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants158);
            expression8=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants160); if (state.failed) return e;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:50:48: (constantFollowUp= constants )?
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:56:1: typeDefs returns [ TypeDefNode e ] : ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? ;
    public final TypeDefNode typeDefs() throws RecognitionException {
        TypeDefNode e = null;

        Token IDENT9=null;
        TypeDefNode typeDefsFollowUp = null;

        ASTnode type10 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:57:3: ( ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:57:5: ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:57:5: ( IDENT '=' type ';' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:57:6: IDENT '=' type ';'
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDefs188); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_typeDefs190); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_typeDefs192);
            type10=type();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_typeDefs194); if (state.failed) return e;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:57:42: (typeDefsFollowUp= typeDefs )?
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:63:1: type returns [ ASTnode e ] : ( IDENT | arraytype | recordtype );
    public final ASTnode type() throws RecognitionException {
        ASTnode e = null;

        Token IDENT11=null;
        ArrayNode arraytype12 = null;

        RecordNode recordtype13 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:64:3: ( IDENT | arraytype | recordtype )
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:64:5: IDENT
                    {
                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_type221); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new TypeNode( (IDENT11!=null?IDENT11.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:65:5: arraytype
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:66:5: recordtype
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:69:1: arraytype returns [ ArrayNode e ] : 'ARRAY' expression 'OF' type ;
    public final ArrayNode arraytype() throws RecognitionException {
        ArrayNode e = null;

        ExpressionNode expression14 = null;

        ASTnode type15 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:70:3: ( 'ARRAY' expression 'OF' type )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:70:5: 'ARRAY' expression 'OF' type
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:76:1: recordtype returns [ RecordNode e ] : 'RECORD' fields 'END' ;
    public final RecordNode recordtype() throws RecognitionException {
        RecordNode e = null;

        FieldsNode fields16 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:77:3: ( 'RECORD' fields 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:77:5: 'RECORD' fields 'END'
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:83:1: fields returns [ FieldsNode e ] : fieldlist ( fieldsFollowup )? ;
    public final FieldsNode fields() throws RecognitionException {
        FieldsNode e = null;

        FieldlistNode fieldlist17 = null;

        FieldsNode fieldsFollowup18 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:84:3: ( fieldlist ( fieldsFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:84:5: fieldlist ( fieldsFollowup )?
            {
            pushFollow(FOLLOW_fieldlist_in_fields312);
            fieldlist17=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:84:15: ( fieldsFollowup )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==8) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:84:16: fieldsFollowup
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:90:1: fieldsFollowup returns [ FieldsNode e ] : ';' fieldlist (followup= fieldsFollowup )? ;
    public final FieldsNode fieldsFollowup() throws RecognitionException {
        FieldsNode e = null;

        FieldsNode followup = null;

        FieldlistNode fieldlist19 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:91:3: ( ';' fieldlist (followup= fieldsFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:91:5: ';' fieldlist (followup= fieldsFollowup )?
            {
            match(input,8,FOLLOW_8_in_fieldsFollowup338); if (state.failed) return e;
            pushFollow(FOLLOW_fieldlist_in_fieldsFollowup340);
            fieldlist19=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:91:19: (followup= fieldsFollowup )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==8) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:91:20: followup= fieldsFollowup
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:97:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode simpleLeft = null;

        ExpressionNode simpleRight = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:98:3: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:98:5: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression373);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = simpleLeft; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:98:57: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15||(LA11_0>=19 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:98:58: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
                    {
                    operator=(Token)input.LT(1);
                    if ( input.LA(1)==15||(input.LA(1)>=19 && input.LA(1)<=23) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression413);
                    simpleRight=simpleexpression();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new ExpressionFactory().getExpressionNode( simpleLeft, simpleRight, (operator!=null?operator.getText():null) ); 
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:102:1: simpleexpression returns [ ExpressionNode e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final ExpressionNode simpleexpression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode specialTerm20 = null;

        ExpressionNode simpleExpressionFollowup21 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:103:3: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:103:5: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression437);
            specialTerm20=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = specialTerm20; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:103:42: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:103:44: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
                    {
                    operator=(Token)input.LT(1);
                    if ( (input.LA(1)>=24 && input.LA(1)<=26) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression459);
                    simpleExpressionFollowup21=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new ExpressionFactory().getExpressionNode( specialTerm20, simpleExpressionFollowup21, (operator!=null?operator.getText():null) ); 
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:107:1: specialTerm returns [ ExpressionNode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ExpressionNode specialTerm() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode term22 = null;

        ExpressionNode term23 = null;

        ExpressionNode term24 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:108:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
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
            case IDENT:
            case INTEGER:
            case 31:
            case 33:
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:108:5: operator= ( '+' ) term
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:108:14: ( '+' )
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:108:15: '+'
                    {
                    match(input,24,FOLLOW_24_in_specialTerm489); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm492);
                    term22=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term22; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:109:5: operator= ( '-' ) term
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:109:14: ( '-' )
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:109:15: '-'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm503); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm506);
                    term23=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new MinusNode( term23 ); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:110:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm514);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:113:1: simpleExpressionFollowup returns [ ExpressionNode e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final ExpressionNode simpleExpressionFollowup() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode follow2 = null;

        ExpressionNode term25 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:114:3: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:114:6: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup536);
            term25=term();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = term25; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:114:29: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:114:30: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
                    {
                    operator=(Token)input.LT(1);
                    if ( (input.LA(1)>=24 && input.LA(1)<=26) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup559);
                    follow2=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new ExpressionFactory().getExpressionNode( term25, follow2, (operator!=null?operator.getText():null) ); 
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:118:1: term returns [ ExpressionNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )? ;
    public final ExpressionNode term() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode followup = null;

        ExpressionNode factor26 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:119:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:119:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )?
            {
            pushFollow(FOLLOW_factor_in_term585);
            factor26=factor();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = factor26; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:119:32: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=27 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:119:33: operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term
                    {
                    operator=(Token)input.LT(1);
                    if ( (input.LA(1)>=27 && input.LA(1)<=30) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_term612);
                    followup=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new ExpressionFactory().getExpressionNode( factor26, followup, (operator!=null?operator.getText():null) ); 
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:123:1: factor returns [ ExpressionNode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ExpressionNode factor() throws RecognitionException {
        ExpressionNode e = null;

        ExpressionNode factorOperand = null;

        ExpressionNode variable27 = null;

        ExpressionNode number28 = null;

        ExpressionNode expression29 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:124:3: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
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
            case 31:
                {
                alt16=3;
                }
                break;
            case 33:
                {
                alt16=4;
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:124:5: variable
                    {
                    pushFollow(FOLLOW_variable_in_factor639);
                    variable27=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = variable27; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:125:5: number
                    {
                    pushFollow(FOLLOW_number_in_factor647);
                    number28=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number28; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:126:5: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor655); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor657);
                    expression29=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,32,FOLLOW_32_in_factor659); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression29; 
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:127:5: '~' factorOperand= factor
                    {
                    match(input,33,FOLLOW_33_in_factor667); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor671);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:130:1: number returns [ ExpressionNode e ] : INTEGER ;
    public final ExpressionNode number() throws RecognitionException {
        ExpressionNode e = null;

        Token INTEGER30=null;

        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:131:3: ( INTEGER )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:131:5: INTEGER
            {
            INTEGER30=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number690); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:137:1: selector returns [ SelectorNode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final SelectorNode selector() throws RecognitionException {
        SelectorNode e = null;

        Token var=null;
        SelectorNode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:138:3: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:139:3: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:139:3: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==11) ) {
                alt17=1;
            }
            else if ( (LA17_0==34) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:140:3: '.' var= IDENT selectorFollowup= selector
                    {
                    match(input,11,FOLLOW_11_in_selector722); if (state.failed) return e;
                    var=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector726); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector730);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new SelectorRecordNode( (var!=null?var.getText():null), selectorFollowup );
                        
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:145:3: '[' exp= expression ']' selectorFollowup= selector
                    {
                    match(input,34,FOLLOW_34_in_selector744); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_selector748);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,35,FOLLOW_35_in_selector750); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector754);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:152:1: variable returns [ ExpressionNode e ] : IDENT selector ;
    public final ExpressionNode variable() throws RecognitionException {
        ExpressionNode e = null;

        Token IDENT31=null;
        SelectorNode selector32 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:153:3: ( IDENT selector )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:153:5: IDENT selector
            {
            IDENT31=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable783); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable785);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:159:1: fieldlist returns [ FieldlistNode e ] : ( identlist ':' type )? ;
    public final FieldlistNode fieldlist() throws RecognitionException {
        FieldlistNode e = null;

        IdentListNode identlist33 = null;

        ASTnode type34 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:160:3: ( ( identlist ':' type )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:160:5: ( identlist ':' type )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:160:5: ( identlist ':' type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==IDENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:160:6: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist809);
                    identlist33=identlist();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,36,FOLLOW_36_in_fieldlist811); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_fieldlist813);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:166:1: identlist returns [ IdentListNode e ] : IDENT ( identlistFollowUp )? ;
    public final IdentListNode identlist() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT35=null;
        IdentListNode identlistFollowUp36 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:167:3: ( IDENT ( identlistFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:167:5: IDENT ( identlistFollowUp )?
            {
            IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist838); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:167:11: ( identlistFollowUp )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:167:13: identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlist842);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:173:1: identlistFollowUp returns [ IdentListNode e ] : ',' IDENT (followup= identlistFollowUp )? ;
    public final IdentListNode identlistFollowUp() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT37=null;
        IdentListNode followup = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:174:3: ( ',' IDENT (followup= identlistFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:174:5: ',' IDENT (followup= identlistFollowUp )?
            {
            match(input,37,FOLLOW_37_in_identlistFollowUp868); if (state.failed) return e;
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlistFollowUp870); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:174:15: (followup= identlistFollowUp )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:174:17: followup= identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlistFollowUp876);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:180:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement38 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:181:3: ( statement (followOne= followupStatementSequence )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:181:5: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence899);
            statement38=statement();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:181:15: (followOne= followupStatementSequence )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==8) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:181:17: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence905);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:187:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement39 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:188:3: ( ';' statement (followTwo= followupStatementSequence )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:188:5: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence929); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence931);
            statement39=statement();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:188:19: (followTwo= followupStatementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==8) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:188:21: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence937);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:194:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:3: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:5: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:5: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )?
            int alt23=6;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==11||LA23_1==34||LA23_1==40) ) {
                        alt23=1;
                    }
                    else if ( (LA23_1==EOF||LA23_1==8||LA23_1==10||LA23_1==31||(LA23_1>=43 && LA23_1<=44)) ) {
                        alt23=2;
                    }
                    }
                    break;
                case 41:
                    {
                    alt23=3;
                    }
                    break;
                case 45:
                    {
                    alt23=4;
                    }
                    break;
                case 38:
                    {
                    alt23=5;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:7: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement964);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:32: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement970);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:60: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement976);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:86: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement982);
                    statementRv=whilestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 5 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:195:115: statementRv= withCall
                    {
                    pushFollow(FOLLOW_withCall_in_statement988);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:201:1: withCall returns [ StatementNode e ] : 'WITH' expression 'DO' statementsequence 'END' ;
    public final StatementNode withCall() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression40 = null;

        StatementSequenceNode statementsequence41 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:202:3: ( 'WITH' expression 'DO' statementsequence 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:202:5: 'WITH' expression 'DO' statementsequence 'END'
            {
            match(input,38,FOLLOW_38_in_withCall1013); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_withCall1015);
            expression40=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,39,FOLLOW_39_in_withCall1017); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_withCall1019);
            statementsequence41=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_withCall1021); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:208:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode variable42 = null;

        ExpressionNode expression43 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:209:3: ( variable ':=' expression )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:209:5: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment1044);
            variable42=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_assignment1046); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment1048);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:215:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT44=null;
        ParamNode actualparameters45 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:216:3: ( IDENT ( actualparameters )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:216:5: IDENT ( actualparameters )?
            {
            IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall1071); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:216:11: ( actualparameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:216:12: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall1074);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:222:1: actualparameters returns [ ParamNode e ] : '(' ( expression (follow= actualparametersfollowup )? )? ')' ;
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression46 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:223:3: ( '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:223:5: '(' ( expression (follow= actualparametersfollowup )? )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters1099); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:223:9: ( expression (follow= actualparametersfollowup )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=IDENT && LA26_0<=INTEGER)||(LA26_0>=24 && LA26_0<=25)||LA26_0==31||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:223:11: expression (follow= actualparametersfollowup )?
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters1103);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:223:22: (follow= actualparametersfollowup )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==37) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:223:24: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters1109);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters1116); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:229:1: actualparametersfollowup returns [ ParamNode e] : ',' expression (follow= actualparametersfollowup )? ;
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression47 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:230:3: ( ',' expression (follow= actualparametersfollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:230:5: ',' expression (follow= actualparametersfollowup )?
            {
            match(input,37,FOLLOW_37_in_actualparametersfollowup1139); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_actualparametersfollowup1141);
            expression47=expression();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:230:20: (follow= actualparametersfollowup )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:230:22: follow= actualparametersfollowup
                    {
                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup1147);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:236:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression48 = null;

        StatementSequenceNode statementsequence49 = null;

        StatementNode elsestatement50 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:237:3: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:237:5: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,41,FOLLOW_41_in_ifstatement1172); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement1174);
            expression48=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,42,FOLLOW_42_in_ifstatement1176); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement1178);
            statementsequence49=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:237:46: ( elsestatement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=43 && LA28_0<=44)) ) {
                alt28=1;
            }
            else if ( (LA28_0==10) ) {
                int LA28_2 = input.LA(2);

                if ( (synpred49_oberon0()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement1180);
                    elsestatement50=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement1183); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:243:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression51 = null;

        StatementSequenceNode statementsequence52 = null;

        StatementSequenceNode statementsequence53 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:244:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt29=1;
                }
                break;
            case 44:
                {
                alt29=2;
                }
                break;
            case EOF:
            case 10:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:244:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,43,FOLLOW_43_in_elsestatement1206); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement1208);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,42,FOLLOW_42_in_elsestatement1210); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1212);
                    statementsequence52=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement1216);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression51, statementsequence52, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:248:5: 'ELSE' statementsequence
                    {
                    match(input,44,FOLLOW_44_in_elsestatement1227); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1229);
                    statementsequence53=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence53 );
                        
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:253:3: 
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:258:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:259:3: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:259:5: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,45,FOLLOW_45_in_whilestatement1261); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement1265);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,39,FOLLOW_39_in_whilestatement1267); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement1271);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1273); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:265:1: procedureList returns [ ProcedureListNode e ] : ( proceduredeclaration ';' (followup= procedureList )? )? ;
    public final ProcedureListNode procedureList() throws RecognitionException {
        ProcedureListNode e = null;

        ProcedureListNode followup = null;

        ProcedureDeclarationNode proceduredeclaration54 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:3: ( ( proceduredeclaration ';' (followup= procedureList )? )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:5: ( proceduredeclaration ';' (followup= procedureList )? )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:5: ( proceduredeclaration ';' (followup= procedureList )? )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:6: proceduredeclaration ';' (followup= procedureList )?
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_procedureList1297);
                    proceduredeclaration54=proceduredeclaration();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,8,FOLLOW_8_in_procedureList1299); if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:31: (followup= procedureList )?
                    int alt30=2;
                    switch ( input.LA(1) ) {
                        case 46:
                            {
                            alt30=1;
                            }
                            break;
                        case 9:
                            {
                            int LA30_2 = input.LA(2);

                            if ( (synpred52_oberon0()) ) {
                                alt30=1;
                            }
                            }
                            break;
                        case 10:
                            {
                            int LA30_3 = input.LA(2);

                            if ( (synpred52_oberon0()) ) {
                                alt30=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA30_4 = input.LA(2);

                            if ( (synpred52_oberon0()) ) {
                                alt30=1;
                            }
                            }
                            break;
                    }

                    switch (alt30) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:33: followup= procedureList
                            {
                            pushFollow(FOLLOW_procedureList_in_procedureList1305);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:272:1: proceduredeclaration returns [ ProcedureDeclarationNode e ] : procedureheading ';' procedurebody ;
    public final ProcedureDeclarationNode proceduredeclaration() throws RecognitionException {
        ProcedureDeclarationNode e = null;

        ProcedureHeadingNode procedureheading55 = null;

        ProcedureBodyNode procedurebody56 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:273:3: ( procedureheading ';' procedurebody )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:273:5: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1334);
            procedureheading55=procedureheading();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_proceduredeclaration1336); if (state.failed) return e;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1338);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:279:1: procedureheading returns [ ProcedureHeadingNode e ] : 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? ;
    public final ProcedureHeadingNode procedureheading() throws RecognitionException {
        ProcedureHeadingNode e = null;

        Token IDENT57=null;
        FormalParameterNode formalparameters58 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:280:3: ( 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:280:5: 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )?
            {
            match(input,46,FOLLOW_46_in_procedureheading1361); if (state.failed) return e;
            IDENT57=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading1363); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:280:23: ( '(' ( formalparameters )? ')' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:280:25: '(' ( formalparameters )? ')'
                    {
                    match(input,31,FOLLOW_31_in_procedureheading1367); if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:280:29: ( formalparameters )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==IDENT||LA32_0==14) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:0:0: formalparameters
                            {
                            pushFollow(FOLLOW_formalparameters_in_procedureheading1369);
                            formalparameters58=formalparameters();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_procedureheading1372); if (state.failed) return e;

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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:286:1: procedurebody returns [ ProcedureBodyNode e ] : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final ProcedureBodyNode procedurebody() throws RecognitionException {
        ProcedureBodyNode e = null;

        Token IDENT61=null;
        DeclarationsNode declarations59 = null;

        StatementSequenceNode statementsequence60 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:287:3: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:287:5: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1396);
            declarations59=declarations();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:287:18: ( 'BEGIN' statementsequence )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==9) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:287:19: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1399); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1401);
                    statementsequence60=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1405); if (state.failed) return e;
            IDENT61=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody1407); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:293:1: formalparameters returns [ FormalParameterNode e ] : fpsection ( ';' followup= formalparameters )? ;
    public final FormalParameterNode formalparameters() throws RecognitionException {
        FormalParameterNode e = null;

        FormalParameterNode followup = null;

        FpSectionNode fpsection62 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:294:3: ( fpsection ( ';' followup= formalparameters )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:294:5: fpsection ( ';' followup= formalparameters )?
            {
            pushFollow(FOLLOW_fpsection_in_formalparameters1430);
            fpsection62=fpsection();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:294:15: ( ';' followup= formalparameters )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==8) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:294:17: ';' followup= formalparameters
                    {
                    match(input,8,FOLLOW_8_in_formalparameters1434); if (state.failed) return e;
                    pushFollow(FOLLOW_formalparameters_in_formalparameters1438);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:300:1: fpsection returns [ FpSectionNode e ] : (ident= 'VAR' )? identlist ':' type ;
    public final FpSectionNode fpsection() throws RecognitionException {
        FpSectionNode e = null;

        Token ident=null;
        IdentListNode identlist63 = null;

        ASTnode type64 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:301:3: ( (ident= 'VAR' )? identlist ':' type )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:301:5: (ident= 'VAR' )? identlist ':' type
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:301:5: (ident= 'VAR' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:301:6: ident= 'VAR'
                    {
                    ident=(Token)match(input,14,FOLLOW_14_in_fpsection1465); if (state.failed) return e;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1469);
            identlist63=identlist();

            state._fsp--;
            if (state.failed) return e;
            match(input,36,FOLLOW_36_in_fpsection1471); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_fpsection1473);
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
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:63: ( procedureList )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:43:63: procedureList
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
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:237:46: ( elsestatement )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:237:46: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred49_oberon01180);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_oberon0

    // $ANTLR start synpred52_oberon0
    public final void synpred52_oberon0_fragment() throws RecognitionException {   
        ProcedureListNode followup = null;


        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:33: (followup= procedureList )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction3\\grammar\\oberon0.g:266:33: followup= procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred52_oberon01305);
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
    public static final BitSet FOLLOW_set_in_expression380 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialTerm_in_simpleexpression437 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression445 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_specialTerm489 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm503 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup536 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleExpressionFollowup543 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term585 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term592 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_term612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor655 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor657 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor667 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector722 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector726 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_selector744 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector748 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector750 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable783 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_variable785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist809 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldlist811 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fieldlist813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist838 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlist842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identlistFollowUp868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlistFollowUp870 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlistFollowUp876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence899 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence929 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence931 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withCall_in_statement988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_withCall1013 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_withCall1015 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_withCall1017 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_withCall1019 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_withCall1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1044 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_assignment1046 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall1071 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters1099 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters1103 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters1109 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup1139 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup1141 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifstatement1172 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement1174 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifstatement1176 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement1178 = new BitSet(new long[]{0x0000180000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement1180 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_elsestatement1206 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement1208 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_elsestatement1210 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1212 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_elsestatement1227 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_whilestatement1261 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement1265 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_whilestatement1267 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement1271 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_procedureList1297 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureList1299 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_procedureList_in_procedureList1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1334 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1336 = new BitSet(new long[]{0x0000400000007000L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_procedureheading1361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1363 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_procedureheading1367 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1369 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureheading1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1396 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1399 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1401 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1430 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_formalparameters1434 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalparameters_in_formalparameters1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_fpsection1465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1469 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fpsection1471 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fpsection1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred5_oberon0128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred49_oberon01180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred52_oberon01305 = new BitSet(new long[]{0x0000000000000002L});

}