// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g 2011-01-31 21:07:33

  package parser;
  
    import errorhandler.*;


import org.antlr.runtime.*;

import ast.*;

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
    public String getGrammarFileName() { return "/Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g"; }


        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            
            parseErrorLog.addMessage( hdr + " -> " + msg );
        }



    // $ANTLR start "module"
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:32:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:33:2: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:33:4: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module59); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module63); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module65); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module67);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:33:41: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:33:42: 'BEGIN' statementsequence
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:39:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;

        TypeDefNode typeDefs4 = null;

        FieldsNode fields5 = null;

        ProcedureListNode procedureList6 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:2: ( ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:4: ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:4: ( 'CONST' constants )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:5: 'CONST' constants
                    {
                    match(input,12,FOLLOW_12_in_declarations102); if (state.failed) return e;
                    pushFollow(FOLLOW_constants_in_declarations104);
                    constants3=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:25: ( 'TYPE' typeDefs )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:26: 'TYPE' typeDefs
                    {
                    match(input,13,FOLLOW_13_in_declarations109); if (state.failed) return e;
                    pushFollow(FOLLOW_typeDefs_in_declarations111);
                    typeDefs4=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:44: ( 'VAR' fields )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:45: 'VAR' fields
                    {
                    match(input,14,FOLLOW_14_in_declarations116); if (state.failed) return e;
                    pushFollow(FOLLOW_fields_in_declarations118);
                    fields5=fields();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:61: ( procedureList )?
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
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:62: procedureList
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:46:1: constants returns [ ConstantNode e ] : ( IDENT '=' expression ';' ) (constantFollowUp= constants )? ;
    public final ConstantNode constants() throws RecognitionException {
        ConstantNode e = null;

        Token IDENT7=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression8 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:47:2: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:47:4: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:47:4: ( IDENT '=' expression ';' )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:47:5: IDENT '=' expression ';'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants146); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_constants148); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants150);
            expression8=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants152); if (state.failed) return e;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:47:47: (constantFollowUp= constants )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:0:0: constantFollowUp= constants
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:53:1: typeDefs returns [ TypeDefNode e ] : ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? ;
    public final TypeDefNode typeDefs() throws RecognitionException {
        TypeDefNode e = null;

        Token IDENT9=null;
        TypeDefNode typeDefsFollowUp = null;

        ASTnode type10 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:54:2: ( ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:54:4: ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:54:4: ( IDENT '=' type ';' )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:54:5: IDENT '=' type ';'
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDefs177); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_typeDefs179); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_typeDefs181);
            type10=type();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_typeDefs183); if (state.failed) return e;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:54:41: (typeDefsFollowUp= typeDefs )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:0:0: typeDefsFollowUp= typeDefs
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:60:1: type returns [ ASTnode e ] : ( IDENT | arraytype | recordtype );
    public final ASTnode type() throws RecognitionException {
        ASTnode e = null;

        Token IDENT11=null;
        ArrayNode arraytype12 = null;

        RecordNode recordtype13 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:61:2: ( IDENT | arraytype | recordtype )
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
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:61:4: IDENT
                    {
                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_type207); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new TypeNode( (IDENT11!=null?IDENT11.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:62:4: arraytype
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
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:63:4: recordtype
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:66:1: arraytype returns [ ArrayNode e ] : 'ARRAY' expression 'OF' type ;
    public final ArrayNode arraytype() throws RecognitionException {
        ArrayNode e = null;

        ExpressionNode expression14 = null;

        ASTnode type15 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:67:2: ( 'ARRAY' expression 'OF' type )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:67:4: 'ARRAY' expression 'OF' type
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:73:1: recordtype returns [ RecordNode e ] : 'RECORD' fields 'END' ;
    public final RecordNode recordtype() throws RecognitionException {
        RecordNode e = null;

        FieldsNode fields16 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:74:2: ( 'RECORD' fields 'END' )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:74:4: 'RECORD' fields 'END'
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:80:1: fields returns [ FieldsNode e ] : fieldlist ( fieldsFollowup )? ;
    public final FieldsNode fields() throws RecognitionException {
        FieldsNode e = null;

        FieldlistNode fieldlist17 = null;

        FieldsNode fieldsFollowup18 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:81:2: ( fieldlist ( fieldsFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:81:4: fieldlist ( fieldsFollowup )?
            {
            pushFollow(FOLLOW_fieldlist_in_fields286);
            fieldlist17=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:81:14: ( fieldsFollowup )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==8) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:81:15: fieldsFollowup
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:87:1: fieldsFollowup returns [ FieldsNode e ] : ';' fieldlist (followup= fieldsFollowup )? ;
    public final FieldsNode fieldsFollowup() throws RecognitionException {
        FieldsNode e = null;

        FieldsNode followup = null;

        FieldlistNode fieldlist19 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:88:2: ( ';' fieldlist (followup= fieldsFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:88:4: ';' fieldlist (followup= fieldsFollowup )?
            {
            match(input,8,FOLLOW_8_in_fieldsFollowup309); if (state.failed) return e;
            pushFollow(FOLLOW_fieldlist_in_fieldsFollowup311);
            fieldlist19=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:88:18: (followup= fieldsFollowup )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==8) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:88:19: followup= fieldsFollowup
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:94:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        SimpleExpression simpleLeft = null;

        SimpleExpression simpleRight = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:95:2: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:95:4: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression340);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:95:32: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15||(LA11_0>=19 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:95:33: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
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

                    pushFollow(FOLLOW_simpleexpression_in_expression361);
                    simpleRight=simpleexpression();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ExpressionNode( simpleLeft, (operator!=null?operator.getText():null), simpleRight );
              	
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:101:1: simpleexpression returns [ SimpleExpression e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final SimpleExpression simpleexpression() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        ASTnode specialTerm20 = null;

        SimpleExpression simpleExpressionFollowup21 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:102:2: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:102:4: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression382);
            specialTerm20=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:102:16: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:102:18: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression396);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:108:1: specialTerm returns [ ASTnode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ASTnode specialTerm() throws RecognitionException {
        ASTnode e = null;

        Token operator=null;
        TermNode term22 = null;

        TermNode term23 = null;

        TermNode term24 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:109:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
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
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:109:5: operator= ( '+' ) term
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:109:14: ( '+' )
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:109:15: '+'
                    {
                    match(input,24,FOLLOW_24_in_specialTerm421); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm424);
                    term22=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term22; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:110:5: operator= ( '-' ) term
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:110:14: ( '-' )
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:110:15: '-'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm435); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm438);
                    term23=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new MinusNode( term23 ); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:111:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm446);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:114:1: simpleExpressionFollowup returns [ SimpleExpression e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final SimpleExpression simpleExpressionFollowup() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        SimpleExpression follow2 = null;

        TermNode term25 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:115:2: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:115:5: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup466);
            term25=term();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:115:10: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:115:11: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup481);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:121:1: term returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? ;
    public final TermNode term() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        ASTnode factor26 = null;

        TermNode termFollowUp27 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:122:2: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:122:4: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_term502);
            factor26=factor();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:122:11: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=27 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:122:12: operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_term517);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:128:1: termFollowUp returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? ;
    public final TermNode termFollowUp() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        TermNode follow2 = null;

        ASTnode factor28 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:129:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:129:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_termFollowUp539);
            factor28=factor();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:129:12: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=27 && LA16_0<=30)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:129:13: operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_termFollowUp556);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:135:1: factor returns [ ASTnode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ASTnode factor() throws RecognitionException {
        ASTnode e = null;

        ASTnode factorOperand = null;

        VarNode variable29 = null;

        IntegerNode number30 = null;

        ExpressionNode expression31 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:136:2: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
            int alt17=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt17=1;
                }
                break;
            case INTEGER:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 33:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:136:4: variable
                    {
                    pushFollow(FOLLOW_variable_in_factor578);
                    variable29=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = variable29; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:137:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor585);
                    number30=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number30; 
                    }

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:138:4: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor592); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor594);
                    expression31=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,32,FOLLOW_32_in_factor596); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression31; 
                    }

                    }
                    break;
                case 4 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:139:4: '~' factorOperand= factor
                    {
                    match(input,33,FOLLOW_33_in_factor603); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor607);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:142:1: number returns [ IntegerNode e ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode e = null;

        Token INTEGER32=null;

        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:143:2: ( INTEGER )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:143:4: INTEGER
            {
            INTEGER32=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number624); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:149:1: selector returns [ ASTnode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final ASTnode selector() throws RecognitionException {
        ASTnode e = null;

        Token var=null;
        ASTnode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:150:2: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:151:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:151:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:152:2: '.' var= IDENT selectorFollowup= selector
                    {
                    match(input,11,FOLLOW_11_in_selector650); if (state.failed) return e;
                    var=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector654); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector658);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                      	  e = new SelectorRecordNode( (var!=null?var.getText():null), selectorFollowup );
                      	
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:157:2: '[' exp= expression ']' selectorFollowup= selector
                    {
                    match(input,34,FOLLOW_34_in_selector669); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_selector673);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,35,FOLLOW_35_in_selector675); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector679);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:164:1: variable returns [ VarNode e ] : IDENT selector ;
    public final VarNode variable() throws RecognitionException {
        VarNode e = null;

        Token IDENT33=null;
        ASTnode selector34 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:165:3: ( IDENT selector )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:165:5: IDENT selector
            {
            IDENT33=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable704); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable706);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:171:1: fieldlist returns [ FieldlistNode e ] : ( identlist ':' type )? ;
    public final FieldlistNode fieldlist() throws RecognitionException {
        FieldlistNode e = null;

        IdentListNode identlist35 = null;

        ASTnode type36 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:172:2: ( ( identlist ':' type )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:172:4: ( identlist ':' type )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:172:4: ( identlist ':' type )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:172:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist728);
                    identlist35=identlist();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,36,FOLLOW_36_in_fieldlist730); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_fieldlist732);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:178:1: identlist returns [ IdentListNode e ] : IDENT ( identlistFollowUp )? ;
    public final IdentListNode identlist() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT37=null;
        IdentListNode identlistFollowUp38 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:179:2: ( IDENT ( identlistFollowUp )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:179:4: IDENT ( identlistFollowUp )?
            {
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist753); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:179:10: ( identlistFollowUp )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:179:12: identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlist757);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:185:1: identlistFollowUp returns [ IdentListNode e ] : ',' IDENT (followup= identlistFollowUp )? ;
    public final IdentListNode identlistFollowUp() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT39=null;
        IdentListNode followup = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:186:2: ( ',' IDENT (followup= identlistFollowUp )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:186:4: ',' IDENT (followup= identlistFollowUp )?
            {
            match(input,37,FOLLOW_37_in_identlistFollowUp779); if (state.failed) return e;
            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlistFollowUp781); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:186:14: (followup= identlistFollowUp )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:186:16: followup= identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlistFollowUp787);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:192:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement40 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:193:2: ( statement (followOne= followupStatementSequence )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:193:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence807);
            statement40=statement();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:193:14: (followOne= followupStatementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==8) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:193:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence813);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:199:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement41 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:200:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:200:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence834); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence836);
            statement41=statement();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:200:18: (followTwo= followupStatementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==8) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:200:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence842);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:206:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:207:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:207:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:207:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            int alt24=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==11||LA24_1==34||LA24_1==38) ) {
                        alt24=1;
                    }
                    else if ( (LA24_1==EOF||LA24_1==8||LA24_1==10||LA24_1==31||(LA24_1>=41 && LA24_1<=42)) ) {
                        alt24=2;
                    }
                    }
                    break;
                case 39:
                    {
                    alt24=3;
                    }
                    break;
                case 43:
                    {
                    alt24=4;
                    }
                    break;
            }

            switch (alt24) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:207:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement866);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:207:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement872);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:207:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement878);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:207:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement884);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:213:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        VarNode variable42 = null;

        ExpressionNode expression43 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:214:2: ( variable ':=' expression )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:214:4: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment906);
            variable42=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,38,FOLLOW_38_in_assignment908); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment910);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:220:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT44=null;
        ParamNode actualparameters45 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:221:2: ( IDENT ( actualparameters )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:221:4: IDENT ( actualparameters )?
            {
            IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall929); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:221:10: ( actualparameters )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:221:11: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall932);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:227:1: actualparameters returns [ ParamNode e ] : '(' ( expression (follow= actualparametersfollowup )? )? ')' ;
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression46 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:228:2: ( '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:228:4: '(' ( expression (follow= actualparametersfollowup )? )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters953); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:228:8: ( expression (follow= actualparametersfollowup )? )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=IDENT && LA27_0<=INTEGER)||(LA27_0>=24 && LA27_0<=25)||LA27_0==31||LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:228:10: expression (follow= actualparametersfollowup )?
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters957);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:228:21: (follow= actualparametersfollowup )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==37) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:228:23: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters963);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters970); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:234:1: actualparametersfollowup returns [ ParamNode e] : ',' expression (follow= actualparametersfollowup )? ;
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression47 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:235:3: ( ',' expression (follow= actualparametersfollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:235:5: ',' expression (follow= actualparametersfollowup )?
            {
            match(input,37,FOLLOW_37_in_actualparametersfollowup990); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_actualparametersfollowup992);
            expression47=expression();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:235:20: (follow= actualparametersfollowup )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:235:22: follow= actualparametersfollowup
                    {
                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup998);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:241:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression48 = null;

        StatementSequenceNode statementsequence49 = null;

        StatementNode elsestatement50 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:242:2: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:242:4: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement1021); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement1023);
            expression48=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_ifstatement1025); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement1027);
            statementsequence49=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:242:45: ( elsestatement )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=41 && LA29_0<=42)) ) {
                alt29=1;
            }
            else if ( (LA29_0==10) ) {
                int LA29_2 = input.LA(2);

                if ( (synpred52_oberon0()) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement1029);
                    elsestatement50=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement1032); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:248:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression51 = null;

        StatementSequenceNode statementsequence52 = null;

        StatementSequenceNode statementsequence53 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:249:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt30=1;
                }
                break;
            case 42:
                {
                alt30=2;
                }
                break;
            case EOF:
            case 10:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:249:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,41,FOLLOW_41_in_elsestatement1052); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement1054);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,40,FOLLOW_40_in_elsestatement1056); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1058);
                    statementsequence52=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement1062);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression51, statementsequence52, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:253:5: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_elsestatement1073); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1075);
                    statementsequence53=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence53 );
                        
                    }

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:258:3: 
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:263:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:264:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:264:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement1105); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement1109);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,44,FOLLOW_44_in_whilestatement1111); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement1115);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1117); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:270:1: procedureList returns [ ProcedureListNode e ] : ( proceduredeclaration ';' (followup= procedureList )? )? ;
    public final ProcedureListNode procedureList() throws RecognitionException {
        ProcedureListNode e = null;

        ProcedureListNode followup = null;

        ProcedureDeclarationNode proceduredeclaration54 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:2: ( ( proceduredeclaration ';' (followup= procedureList )? )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:5: proceduredeclaration ';' (followup= procedureList )?
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_procedureList1137);
                    proceduredeclaration54=proceduredeclaration();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,8,FOLLOW_8_in_procedureList1139); if (state.failed) return e;
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:30: (followup= procedureList )?
                    int alt31=2;
                    switch ( input.LA(1) ) {
                        case 45:
                            {
                            alt31=1;
                            }
                            break;
                        case 9:
                            {
                            int LA31_2 = input.LA(2);

                            if ( (synpred55_oberon0()) ) {
                                alt31=1;
                            }
                            }
                            break;
                        case 10:
                            {
                            int LA31_3 = input.LA(2);

                            if ( (synpred55_oberon0()) ) {
                                alt31=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA31_4 = input.LA(2);

                            if ( (synpred55_oberon0()) ) {
                                alt31=1;
                            }
                            }
                            break;
                    }

                    switch (alt31) {
                        case 1 :
                            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:32: followup= procedureList
                            {
                            pushFollow(FOLLOW_procedureList_in_procedureList1145);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:277:1: proceduredeclaration returns [ ProcedureDeclarationNode e ] : procedureheading ';' procedurebody ;
    public final ProcedureDeclarationNode proceduredeclaration() throws RecognitionException {
        ProcedureDeclarationNode e = null;

        ProcedureHeadingNode procedureheading55 = null;

        ProcedureBodyNode procedurebody56 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:278:2: ( procedureheading ';' procedurebody )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:278:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1170);
            procedureheading55=procedureheading();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_proceduredeclaration1172); if (state.failed) return e;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1174);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:284:1: procedureheading returns [ ProcedureHeadingNode e ] : 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? ;
    public final ProcedureHeadingNode procedureheading() throws RecognitionException {
        ProcedureHeadingNode e = null;

        Token IDENT57=null;
        FormalParameterNode formalparameters58 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:285:2: ( 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:285:4: 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )?
            {
            match(input,45,FOLLOW_45_in_procedureheading1193); if (state.failed) return e;
            IDENT57=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading1195); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:285:22: ( '(' ( formalparameters )? ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:285:24: '(' ( formalparameters )? ')'
                    {
                    match(input,31,FOLLOW_31_in_procedureheading1199); if (state.failed) return e;
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:285:28: ( formalparameters )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==IDENT||LA33_0==14) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:0:0: formalparameters
                            {
                            pushFollow(FOLLOW_formalparameters_in_procedureheading1201);
                            formalparameters58=formalparameters();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_procedureheading1204); if (state.failed) return e;

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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:291:1: procedurebody returns [ ProcedureBodyNode e ] : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final ProcedureBodyNode procedurebody() throws RecognitionException {
        ProcedureBodyNode e = null;

        Token IDENT61=null;
        DeclarationsNode declarations59 = null;

        StatementSequenceNode statementsequence60 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:292:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:292:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1225);
            declarations59=declarations();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:292:17: ( 'BEGIN' statementsequence )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==9) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:292:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1228); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1230);
                    statementsequence60=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1234); if (state.failed) return e;
            IDENT61=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody1236); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:298:1: formalparameters returns [ FormalParameterNode e ] : fpsection ( ';' followup= formalparameters )? ;
    public final FormalParameterNode formalparameters() throws RecognitionException {
        FormalParameterNode e = null;

        FormalParameterNode followup = null;

        FpSectionNode fpsection62 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:299:2: ( fpsection ( ';' followup= formalparameters )? )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:299:4: fpsection ( ';' followup= formalparameters )?
            {
            pushFollow(FOLLOW_fpsection_in_formalparameters1255);
            fpsection62=fpsection();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:299:14: ( ';' followup= formalparameters )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==8) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:299:16: ';' followup= formalparameters
                    {
                    match(input,8,FOLLOW_8_in_formalparameters1259); if (state.failed) return e;
                    pushFollow(FOLLOW_formalparameters_in_formalparameters1263);
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
    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:305:1: fpsection returns [ FpSectionNode e ] : (ident= 'VAR' )? identlist ':' type ;
    public final FpSectionNode fpsection() throws RecognitionException {
        FpSectionNode e = null;

        Token ident=null;
        IdentListNode identlist63 = null;

        ASTnode type64 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:306:2: ( (ident= 'VAR' )? identlist ':' type )
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:306:4: (ident= 'VAR' )? identlist ':' type
            {
            // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:306:4: (ident= 'VAR' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:306:5: ident= 'VAR'
                    {
                    ident=(Token)match(input,14,FOLLOW_14_in_fpsection1287); if (state.failed) return e;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1291);
            identlist63=identlist();

            state._fsp--;
            if (state.failed) return e;
            match(input,36,FOLLOW_36_in_fpsection1293); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_fpsection1295);
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
        // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:62: ( procedureList )
        // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:40:62: procedureList
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
        // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:242:45: ( elsestatement )
        // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:242:45: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred52_oberon01029);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_oberon0

    // $ANTLR start synpred55_oberon0
    public final void synpred55_oberon0_fragment() throws RecognitionException {   
        ProcedureListNode followup = null;


        // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:32: (followup= procedureList )
        // /Users/benkwint/Documents/uni/softwareConstruction_new/grammar/oberon0.g:271:32: followup= procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred55_oberon01145);
        followup=procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_oberon0

    // Delegated rules

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
    public static final BitSet FOLLOW_set_in_expression345 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialTerm_in_simpleexpression382 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression388 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_specialTerm421 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm435 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup466 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleExpressionFollowup471 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term502 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term507 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_term517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_termFollowUp539 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_termFollowUp544 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_termFollowUp556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor592 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor594 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor603 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector654 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_selector669 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector673 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector675 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable704 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_variable706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist728 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldlist730 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fieldlist732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist753 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlist757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identlistFollowUp779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlistFollowUp781 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlistFollowUp787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence807 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence834 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence836 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment906 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment908 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall929 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters953 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters957 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters963 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup990 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup992 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement1021 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement1023 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement1025 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement1027 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement1029 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elsestatement1052 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement1054 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elsestatement1056 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1058 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elsestatement1073 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement1105 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement1109 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement1111 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement1115 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_procedureList1137 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureList1139 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_procedureList_in_procedureList1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1170 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1172 = new BitSet(new long[]{0x0000200000007000L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1195 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_procedureheading1199 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1201 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureheading1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1225 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1228 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1230 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1255 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_formalparameters1259 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalparameters_in_formalparameters1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_fpsection1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1291 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fpsection1293 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fpsection1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred5_oberon0124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred52_oberon01029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred55_oberon01145 = new BitSet(new long[]{0x0000000000000002L});

}