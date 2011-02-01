// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g 2011-02-01 12:50:07

  package parser;
  
  import ast.*;
  import errorhandler.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "'='", "'ARRAY'", "'OF'", "'RECORD'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "':'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
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
    public String getGrammarFileName() { return "C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g"; }


        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            
            Errorlog.addMessage( hdr + " -> " + msg );
        }



    // $ANTLR start "module"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:32:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:33:2: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:33:4: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module59); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module63); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module65); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module67);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:33:41: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:33:42: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_module70); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_module72);
                    statementsequence2=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_module76); if (state.failed) return e;
            ind2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module80); if (state.failed) return e;
            match(input,11,FOLLOW_11_in_module82); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:39:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;

        TypeDefNode typeDefs4 = null;

        FieldsNode fields5 = null;

        ProcedureListNode procedureList6 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:2: ( ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:4: ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:4: ( 'CONST' constants )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:5: 'CONST' constants
                    {
                    match(input,12,FOLLOW_12_in_declarations102); if (state.failed) return e;
                    pushFollow(FOLLOW_constants_in_declarations104);
                    constants3=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:25: ( 'TYPE' typeDefs )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:26: 'TYPE' typeDefs
                    {
                    match(input,13,FOLLOW_13_in_declarations109); if (state.failed) return e;
                    pushFollow(FOLLOW_typeDefs_in_declarations111);
                    typeDefs4=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:44: ( 'VAR' fields )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:45: 'VAR' fields
                    {
                    match(input,14,FOLLOW_14_in_declarations116); if (state.failed) return e;
                    pushFollow(FOLLOW_fields_in_declarations118);
                    fields5=fields();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:61: ( procedureList )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case 45:
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:62: procedureList
                    {
                    pushFollow(FOLLOW_procedureList_in_declarations124);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:46:1: constants returns [ ConstantNode e ] : ( IDENT '=' expression ';' ) (constantFollowUp= constants )? ;
    public final ConstantNode constants() throws RecognitionException {
        ConstantNode e = null;

        Token IDENT7=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression8 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:47:2: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:47:4: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:47:4: ( IDENT '=' expression ';' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:47:5: IDENT '=' expression ';'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants146); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_constants148); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants150);
            expression8=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants152); if (state.failed) return e;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:47:47: (constantFollowUp= constants )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:0:0: constantFollowUp= constants
                    {
                    pushFollow(FOLLOW_constants_in_constants157);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:53:1: typeDefs returns [ TypeDefNode e ] : ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? ;
    public final TypeDefNode typeDefs() throws RecognitionException {
        TypeDefNode e = null;

        Token IDENT9=null;
        TypeDefNode typeDefsFollowUp = null;

        ASTnode type10 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:54:2: ( ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:54:4: ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:54:4: ( IDENT '=' type ';' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:54:5: IDENT '=' type ';'
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDefs177); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_typeDefs179); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_typeDefs181);
            type10=type();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_typeDefs183); if (state.failed) return e;

            }

            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:54:41: (typeDefsFollowUp= typeDefs )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:0:0: typeDefsFollowUp= typeDefs
                    {
                    pushFollow(FOLLOW_typeDefs_in_typeDefs188);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:60:1: type returns [ ASTnode e ] : ( IDENT | arraytype | recordtype );
    public final ASTnode type() throws RecognitionException {
        ASTnode e = null;

        Token IDENT11=null;
        ArrayNode arraytype12 = null;

        RecordNode recordtype13 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:61:2: ( IDENT | arraytype | recordtype )
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:61:4: IDENT
                    {
                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_type207); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new TypeNode( (IDENT11!=null?IDENT11.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:62:4: arraytype
                    {
                    pushFollow(FOLLOW_arraytype_in_type214);
                    arraytype12=arraytype();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = arraytype12; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:63:4: recordtype
                    {
                    pushFollow(FOLLOW_recordtype_in_type221);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:66:1: arraytype returns [ ArrayNode e ] : 'ARRAY' expression 'OF' type ;
    public final ArrayNode arraytype() throws RecognitionException {
        ArrayNode e = null;

        ExpressionNode expression14 = null;

        ASTnode type15 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:67:2: ( 'ARRAY' expression 'OF' type )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:67:4: 'ARRAY' expression 'OF' type
            {
            match(input,16,FOLLOW_16_in_arraytype238); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_arraytype240);
            expression14=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,17,FOLLOW_17_in_arraytype242); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_arraytype244);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:73:1: recordtype returns [ RecordNode e ] : 'RECORD' fields 'END' ;
    public final RecordNode recordtype() throws RecognitionException {
        RecordNode e = null;

        FieldsNode fields16 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:74:2: ( 'RECORD' fields 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:74:4: 'RECORD' fields 'END'
            {
            match(input,18,FOLLOW_18_in_recordtype263); if (state.failed) return e;
            pushFollow(FOLLOW_fields_in_recordtype265);
            fields16=fields();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_recordtype267); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:80:1: fields returns [ FieldsNode e ] : fieldlist ( fieldsFollowup )? ;
    public final FieldsNode fields() throws RecognitionException {
        FieldsNode e = null;

        FieldlistNode fieldlist17 = null;

        FieldsNode fieldsFollowup18 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:81:2: ( fieldlist ( fieldsFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:81:4: fieldlist ( fieldsFollowup )?
            {
            pushFollow(FOLLOW_fieldlist_in_fields286);
            fieldlist17=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:81:14: ( fieldsFollowup )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==8) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:81:15: fieldsFollowup
                    {
                    pushFollow(FOLLOW_fieldsFollowup_in_fields289);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:87:1: fieldsFollowup returns [ FieldsNode e ] : ';' fieldlist (followup= fieldsFollowup )? ;
    public final FieldsNode fieldsFollowup() throws RecognitionException {
        FieldsNode e = null;

        FieldsNode followup = null;

        FieldlistNode fieldlist19 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:88:2: ( ';' fieldlist (followup= fieldsFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:88:4: ';' fieldlist (followup= fieldsFollowup )?
            {
            match(input,8,FOLLOW_8_in_fieldsFollowup309); if (state.failed) return e;
            pushFollow(FOLLOW_fieldlist_in_fieldsFollowup311);
            fieldlist19=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:88:18: (followup= fieldsFollowup )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==8) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:88:19: followup= fieldsFollowup
                    {
                    pushFollow(FOLLOW_fieldsFollowup_in_fieldsFollowup316);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:94:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        SimpleExpression simpleLeft = null;

        SimpleExpression simpleRight = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:95:2: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:95:4: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression340);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = simpleLeft; 
            }
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:96:4: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15||(LA12_0>=19 && LA12_0<=23)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:96:5: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:96:14: ( '=' | '#' | '<' | '<=' | '>' | '>=' )
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
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:97:6: '='
                            {
                            match(input,15,FOLLOW_15_in_expression358); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:98:6: '#'
                            {
                            match(input,19,FOLLOW_19_in_expression367); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionNotEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:99:6: '<'
                            {
                            match(input,20,FOLLOW_20_in_expression376); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionSmallerNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:100:6: '<='
                            {
                            match(input,21,FOLLOW_21_in_expression385); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionSmallerEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:101:6: '>'
                            {
                            match(input,22,FOLLOW_22_in_expression394); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionBiggerNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 6 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:102:6: '>='
                            {
                            match(input,23,FOLLOW_23_in_expression403); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionBiggerEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression418);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:107:1: simpleexpression returns [ SimpleExpression e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final SimpleExpression simpleexpression() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        ASTnode specialTerm20 = null;

        SimpleExpression simpleExpressionFollowup21 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:108:2: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:108:4: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression439);
            specialTerm20=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:108:16: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:108:18: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression453);
                    simpleExpressionFollowup21=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), specialTerm20, simpleExpressionFollowup21 );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:114:1: specialTerm returns [ ASTnode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ASTnode specialTerm() throws RecognitionException {
        ASTnode e = null;

        Token operator=null;
        TermNode term22 = null;

        TermNode term23 = null;

        TermNode term24 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:115:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case IDENT:
            case INTEGER:
            case 31:
            case 33:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:115:5: operator= ( '+' ) term
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:115:14: ( '+' )
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:115:15: '+'
                    {
                    match(input,24,FOLLOW_24_in_specialTerm478); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm481);
                    term22=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term22; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:116:5: operator= ( '-' ) term
                    {
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:116:14: ( '-' )
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:116:15: '-'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm492); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm495);
                    term23=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new MinusNode( term23 ); 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:117:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm503);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:120:1: simpleExpressionFollowup returns [ SimpleExpression e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final SimpleExpression simpleExpressionFollowup() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        SimpleExpression follow2 = null;

        TermNode term25 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:121:2: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:121:5: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup523);
            term25=term();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:121:10: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=24 && LA15_0<=26)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:121:11: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup538);
                    follow2=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), term25, follow2 );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:127:1: term returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? ;
    public final TermNode term() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        ASTnode factor26 = null;

        TermNode termFollowUp27 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:128:2: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:128:4: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_term559);
            factor26=factor();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:128:11: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=27 && LA16_0<=30)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:128:12: operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_term574);
                    termFollowUp27=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new TermNode( factor26, (operator!=null?operator.getText():null), termFollowUp27 );
              	
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


    // $ANTLR start "termFollowUp"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:134:1: termFollowUp returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? ;
    public final TermNode termFollowUp() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        TermNode follow2 = null;

        ASTnode factor28 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:135:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:135:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_termFollowUp596);
            factor28=factor();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:135:12: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=27 && LA17_0<=30)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:135:13: operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_termFollowUp613);
                    follow2=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new TermNode( factor28, (operator!=null?operator.getText():null), follow2 );
                
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
    // $ANTLR end "termFollowUp"


    // $ANTLR start "factor"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:141:1: factor returns [ ASTnode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ASTnode factor() throws RecognitionException {
        ASTnode e = null;

        ASTnode factorOperand = null;

        VarNode variable29 = null;

        IntegerNode number30 = null;

        ExpressionNode expression31 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:142:2: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
            int alt18=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt18=1;
                }
                break;
            case INTEGER:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 33:
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
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:142:4: variable
                    {
                    pushFollow(FOLLOW_variable_in_factor635);
                    variable29=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = variable29; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:143:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor642);
                    number30=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number30; 
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:144:4: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor649); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor651);
                    expression31=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,32,FOLLOW_32_in_factor653); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression31; 
                    }

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:145:4: '~' factorOperand= factor
                    {
                    match(input,33,FOLLOW_33_in_factor660); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor664);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:148:1: number returns [ IntegerNode e ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode e = null;

        Token INTEGER32=null;

        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:149:2: ( INTEGER )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:149:4: INTEGER
            {
            INTEGER32=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number681); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	   e = new IntegerNode( Integer.parseInt( (INTEGER32!=null?INTEGER32.getText():null) ) );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:155:1: selector returns [ ASTnode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final ASTnode selector() throws RecognitionException {
        ASTnode e = null;

        Token var=null;
        ASTnode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:156:2: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:157:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:157:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:158:2: '.' var= IDENT selectorFollowup= selector
                    {
                    match(input,11,FOLLOW_11_in_selector707); if (state.failed) return e;
                    var=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector711); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector715);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                      	  e = new SelectorRecordNode( (var!=null?var.getText():null), selectorFollowup );
                      	
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:163:2: '[' exp= expression ']' selectorFollowup= selector
                    {
                    match(input,34,FOLLOW_34_in_selector726); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_selector730);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,35,FOLLOW_35_in_selector732); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector736);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:170:1: variable returns [ VarNode e ] : IDENT selector ;
    public final VarNode variable() throws RecognitionException {
        VarNode e = null;

        Token IDENT33=null;
        ASTnode selector34 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:171:3: ( IDENT selector )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:171:5: IDENT selector
            {
            IDENT33=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable761); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable763);
            selector34=selector();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

                  e = new VarNode( (IDENT33!=null?IDENT33.getText():null), selector34 );
                
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:177:1: fieldlist returns [ FieldlistNode e ] : ( identlist ':' type )? ;
    public final FieldlistNode fieldlist() throws RecognitionException {
        FieldlistNode e = null;

        IdentListNode identlist35 = null;

        ASTnode type36 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:178:2: ( ( identlist ':' type )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:178:4: ( identlist ':' type )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:178:4: ( identlist ':' type )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:178:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist785);
                    identlist35=identlist();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,36,FOLLOW_36_in_fieldlist787); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_fieldlist789);
                    type36=type();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new FieldlistNode( identlist35, type36 );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:184:1: identlist returns [ IdentListNode e ] : IDENT ( identlistFollowUp )? ;
    public final IdentListNode identlist() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT37=null;
        IdentListNode identlistFollowUp38 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:185:2: ( IDENT ( identlistFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:185:4: IDENT ( identlistFollowUp )?
            {
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist810); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:185:10: ( identlistFollowUp )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:185:12: identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlist814);
                    identlistFollowUp38=identlistFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new IdentListNode( (IDENT37!=null?IDENT37.getText():null), identlistFollowUp38 );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:191:1: identlistFollowUp returns [ IdentListNode e ] : ',' IDENT (followup= identlistFollowUp )? ;
    public final IdentListNode identlistFollowUp() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT39=null;
        IdentListNode followup = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:192:2: ( ',' IDENT (followup= identlistFollowUp )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:192:4: ',' IDENT (followup= identlistFollowUp )?
            {
            match(input,37,FOLLOW_37_in_identlistFollowUp836); if (state.failed) return e;
            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlistFollowUp838); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:192:14: (followup= identlistFollowUp )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:192:16: followup= identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlistFollowUp844);
                    followup=identlistFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new IdentListNode( (IDENT39!=null?IDENT39.getText():null), followup );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:198:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement40 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:199:2: ( statement (followOne= followupStatementSequence )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:199:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence864);
            statement40=statement();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:199:14: (followOne= followupStatementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==8) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:199:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence870);
                    followOne=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement40, followOne );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:205:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement41 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:206:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:206:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence891); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence893);
            statement41=statement();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:206:18: (followTwo= followupStatementSequence )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==8) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:206:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence899);
                    followTwo=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement41, followTwo );
              	
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:212:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:213:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:213:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:213:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            int alt25=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==11||LA25_1==34||LA25_1==38) ) {
                        alt25=1;
                    }
                    else if ( (LA25_1==EOF||LA25_1==8||LA25_1==10||LA25_1==31||(LA25_1>=41 && LA25_1<=42)) ) {
                        alt25=2;
                    }
                    }
                    break;
                case 39:
                    {
                    alt25=3;
                    }
                    break;
                case 43:
                    {
                    alt25=4;
                    }
                    break;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:213:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement923);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:213:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement929);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:213:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement935);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:213:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement941);
                    statementRv=whilestatement();

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


    // $ANTLR start "assignment"
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:219:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        VarNode variable42 = null;

        ExpressionNode expression43 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:220:2: ( variable ':=' expression )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:220:4: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment963);
            variable42=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,38,FOLLOW_38_in_assignment965); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment967);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:226:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT44=null;
        ParamNode actualparameters45 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:227:2: ( IDENT ( actualparameters )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:227:4: IDENT ( actualparameters )?
            {
            IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall986); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:227:10: ( actualparameters )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:227:11: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall989);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:233:1: actualparameters returns [ ParamNode e ] : '(' ( expression (follow= actualparametersfollowup )? )? ')' ;
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression46 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:234:2: ( '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:234:4: '(' ( expression (follow= actualparametersfollowup )? )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters1010); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:234:8: ( expression (follow= actualparametersfollowup )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IDENT && LA28_0<=INTEGER)||(LA28_0>=24 && LA28_0<=25)||LA28_0==31||LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:234:10: expression (follow= actualparametersfollowup )?
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters1014);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:234:21: (follow= actualparametersfollowup )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==37) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:234:23: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters1020);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters1027); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:240:1: actualparametersfollowup returns [ ParamNode e] : ',' expression (follow= actualparametersfollowup )? ;
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression47 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:241:3: ( ',' expression (follow= actualparametersfollowup )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:241:5: ',' expression (follow= actualparametersfollowup )?
            {
            match(input,37,FOLLOW_37_in_actualparametersfollowup1047); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_actualparametersfollowup1049);
            expression47=expression();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:241:20: (follow= actualparametersfollowup )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:241:22: follow= actualparametersfollowup
                    {
                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup1055);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:247:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression48 = null;

        StatementSequenceNode statementsequence49 = null;

        StatementNode elsestatement50 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:248:2: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:248:4: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement1078); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement1080);
            expression48=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_ifstatement1082); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement1084);
            statementsequence49=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:248:45: ( elsestatement )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=41 && LA30_0<=42)) ) {
                alt30=1;
            }
            else if ( (LA30_0==10) ) {
                int LA30_2 = input.LA(2);

                if ( (synpred52_oberon0()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement1086);
                    elsestatement50=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement1089); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:254:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression51 = null;

        StatementSequenceNode statementsequence52 = null;

        StatementSequenceNode statementsequence53 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:255:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt31=1;
                }
                break;
            case 42:
                {
                alt31=2;
                }
                break;
            case EOF:
            case 10:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:255:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,41,FOLLOW_41_in_elsestatement1109); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement1111);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,40,FOLLOW_40_in_elsestatement1113); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1115);
                    statementsequence52=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement1119);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression51, statementsequence52, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:259:5: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_elsestatement1130); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1132);
                    statementsequence53=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence53 );
                        
                    }

                    }
                    break;
                case 3 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:264:3: 
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:269:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:270:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:270:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement1162); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement1166);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,44,FOLLOW_44_in_whilestatement1168); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement1172);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1174); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:276:1: procedureList returns [ ProcedureListNode e ] : ( proceduredeclaration ';' (followup= procedureList )? )? ;
    public final ProcedureListNode procedureList() throws RecognitionException {
        ProcedureListNode e = null;

        ProcedureListNode followup = null;

        ProcedureDeclarationNode proceduredeclaration54 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:2: ( ( proceduredeclaration ';' (followup= procedureList )? )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:5: proceduredeclaration ';' (followup= procedureList )?
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_procedureList1194);
                    proceduredeclaration54=proceduredeclaration();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,8,FOLLOW_8_in_procedureList1196); if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:30: (followup= procedureList )?
                    int alt32=2;
                    switch ( input.LA(1) ) {
                        case 45:
                            {
                            alt32=1;
                            }
                            break;
                        case 9:
                            {
                            int LA32_2 = input.LA(2);

                            if ( (synpred55_oberon0()) ) {
                                alt32=1;
                            }
                            }
                            break;
                        case 10:
                            {
                            int LA32_3 = input.LA(2);

                            if ( (synpred55_oberon0()) ) {
                                alt32=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA32_4 = input.LA(2);

                            if ( (synpred55_oberon0()) ) {
                                alt32=1;
                            }
                            }
                            break;
                    }

                    switch (alt32) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:32: followup= procedureList
                            {
                            pushFollow(FOLLOW_procedureList_in_procedureList1202);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:283:1: proceduredeclaration returns [ ProcedureDeclarationNode e ] : procedureheading ';' procedurebody ;
    public final ProcedureDeclarationNode proceduredeclaration() throws RecognitionException {
        ProcedureDeclarationNode e = null;

        ProcedureHeadingNode procedureheading55 = null;

        ProcedureBodyNode procedurebody56 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:284:2: ( procedureheading ';' procedurebody )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:284:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1227);
            procedureheading55=procedureheading();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_proceduredeclaration1229); if (state.failed) return e;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1231);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:290:1: procedureheading returns [ ProcedureHeadingNode e ] : 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? ;
    public final ProcedureHeadingNode procedureheading() throws RecognitionException {
        ProcedureHeadingNode e = null;

        Token IDENT57=null;
        FormalParameterNode formalparameters58 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:291:2: ( 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:291:4: 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )?
            {
            match(input,45,FOLLOW_45_in_procedureheading1250); if (state.failed) return e;
            IDENT57=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading1252); if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:291:22: ( '(' ( formalparameters )? ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:291:24: '(' ( formalparameters )? ')'
                    {
                    match(input,31,FOLLOW_31_in_procedureheading1256); if (state.failed) return e;
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:291:28: ( formalparameters )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==IDENT||LA34_0==14) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:0:0: formalparameters
                            {
                            pushFollow(FOLLOW_formalparameters_in_procedureheading1258);
                            formalparameters58=formalparameters();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_procedureheading1261); if (state.failed) return e;

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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:297:1: procedurebody returns [ ProcedureBodyNode e ] : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final ProcedureBodyNode procedurebody() throws RecognitionException {
        ProcedureBodyNode e = null;

        Token IDENT61=null;
        DeclarationsNode declarations59 = null;

        StatementSequenceNode statementsequence60 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:298:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:298:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1282);
            declarations59=declarations();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:298:17: ( 'BEGIN' statementsequence )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==9) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:298:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1285); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1287);
                    statementsequence60=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1291); if (state.failed) return e;
            IDENT61=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody1293); if (state.failed) return e;
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:304:1: formalparameters returns [ FormalParameterNode e ] : fpsection ( ';' followup= formalparameters )? ;
    public final FormalParameterNode formalparameters() throws RecognitionException {
        FormalParameterNode e = null;

        FormalParameterNode followup = null;

        FpSectionNode fpsection62 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:305:2: ( fpsection ( ';' followup= formalparameters )? )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:305:4: fpsection ( ';' followup= formalparameters )?
            {
            pushFollow(FOLLOW_fpsection_in_formalparameters1312);
            fpsection62=fpsection();

            state._fsp--;
            if (state.failed) return e;
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:305:14: ( ';' followup= formalparameters )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==8) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:305:16: ';' followup= formalparameters
                    {
                    match(input,8,FOLLOW_8_in_formalparameters1316); if (state.failed) return e;
                    pushFollow(FOLLOW_formalparameters_in_formalparameters1320);
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
    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:311:1: fpsection returns [ FpSectionNode e ] : (ident= 'VAR' )? identlist ':' type ;
    public final FpSectionNode fpsection() throws RecognitionException {
        FpSectionNode e = null;

        Token ident=null;
        IdentListNode identlist63 = null;

        ASTnode type64 = null;


        try {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:312:2: ( (ident= 'VAR' )? identlist ':' type )
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:312:4: (ident= 'VAR' )? identlist ':' type
            {
            // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:312:4: (ident= 'VAR' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:312:5: ident= 'VAR'
                    {
                    ident=(Token)match(input,14,FOLLOW_14_in_fpsection1344); if (state.failed) return e;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1348);
            identlist63=identlist();

            state._fsp--;
            if (state.failed) return e;
            match(input,36,FOLLOW_36_in_fpsection1350); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_fpsection1352);
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
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:62: ( procedureList )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:40:62: procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred5_oberon0124);
        procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_oberon0

    // $ANTLR start synpred52_oberon0
    public final void synpred52_oberon0_fragment() throws RecognitionException {   
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:248:45: ( elsestatement )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:248:45: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred52_oberon01086);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_oberon0

    // $ANTLR start synpred55_oberon0
    public final void synpred55_oberon0_fragment() throws RecognitionException {   
        ProcedureListNode followup = null;


        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:32: (followup= procedureList )
        // C:\\Documents and Settings\\Ben Kwint\\uva\\softwareConstruction2\\grammar\\oberon0.g:277:32: followup= procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred55_oberon01202);
        followup=procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_oberon0

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
    public final boolean synpred55_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_oberon0_fragment(); // can never throw exception
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


 

    public static final BitSet FOLLOW_7_in_module59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module63 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module65 = new BitSet(new long[]{0x0000200000007000L});
    public static final BitSet FOLLOW_declarations_in_module67 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module70 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module72 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module76 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module80 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_constants_in_declarations104 = new BitSet(new long[]{0x0000200000006000L});
    public static final BitSet FOLLOW_13_in_declarations109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeDefs_in_declarations111 = new BitSet(new long[]{0x0000200000004000L});
    public static final BitSet FOLLOW_14_in_declarations116 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fields_in_declarations118 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_procedureList_in_declarations124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_constants146 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_constants148 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_constants150 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_constants152 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_constants_in_constants157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDefs177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_typeDefs179 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_typeDefs181 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_typeDefs183 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_typeDefs_in_typeDefs188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_arraytype238 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_arraytype240 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_arraytype242 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_arraytype244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_recordtype263 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fields_in_recordtype265 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_recordtype267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldlist_in_fields286 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_fieldsFollowup_in_fields289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_fieldsFollowup309 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fieldlist_in_fieldsFollowup311 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_fieldsFollowup_in_fieldsFollowup316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression340 = new BitSet(new long[]{0x0000000000F88002L});
    public static final BitSet FOLLOW_15_in_expression358 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_19_in_expression367 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_20_in_expression376 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_21_in_expression385 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_22_in_expression394 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_23_in_expression403 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialTerm_in_simpleexpression439 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression445 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_specialTerm478 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm492 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup523 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleExpressionFollowup528 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term559 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term564 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_term574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_termFollowUp596 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_termFollowUp601 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_termFollowUp613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor649 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor651 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor660 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector711 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_selector726 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector730 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector732 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable761 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_variable763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist785 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldlist787 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fieldlist789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist810 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlist814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identlistFollowUp836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlistFollowUp838 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlistFollowUp844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence864 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence891 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence893 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment963 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment965 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall986 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters1010 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters1014 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters1020 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup1047 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup1049 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement1078 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement1080 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement1082 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement1084 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement1086 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elsestatement1109 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement1111 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elsestatement1113 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1115 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elsestatement1130 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement1162 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement1166 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement1168 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement1172 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_procedureList1194 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureList1196 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_procedureList_in_procedureList1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1227 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1229 = new BitSet(new long[]{0x0000200000007000L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading1250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1252 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_procedureheading1256 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1258 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureheading1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1282 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1285 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1287 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1312 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_formalparameters1316 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalparameters_in_formalparameters1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_fpsection1344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1348 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fpsection1350 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fpsection1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred5_oberon0124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred52_oberon01086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred55_oberon01202 = new BitSet(new long[]{0x0000000000000002L});

}