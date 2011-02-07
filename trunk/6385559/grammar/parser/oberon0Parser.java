// $ANTLR 3.3 Nov 30, 2010 12:45:30 /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g 2011-02-07 12:03:06

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
    public String getGrammarFileName() { return "/Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g"; }


        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            
            Errorlog.addMessage( hdr + " -> " + msg );
        }



    // $ANTLR start "module"
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:32:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:33:2: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:33:4: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module59); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module63); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module65); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module67);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:33:41: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:33:42: 'BEGIN' statementsequence
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:39:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;

        TypeDefNode typeDefs4 = null;

        FieldsNode fields5 = null;

        ProcedureListNode procedureList6 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:2: ( ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:4: ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:4: ( 'CONST' constants )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:5: 'CONST' constants
                    {
                    match(input,12,FOLLOW_12_in_declarations102); if (state.failed) return e;
                    pushFollow(FOLLOW_constants_in_declarations104);
                    constants3=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:25: ( 'TYPE' typeDefs )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:26: 'TYPE' typeDefs
                    {
                    match(input,13,FOLLOW_13_in_declarations109); if (state.failed) return e;
                    pushFollow(FOLLOW_typeDefs_in_declarations111);
                    typeDefs4=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:44: ( 'VAR' fields )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:45: 'VAR' fields
                    {
                    match(input,14,FOLLOW_14_in_declarations116); if (state.failed) return e;
                    pushFollow(FOLLOW_fields_in_declarations118);
                    fields5=fields();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:61: ( procedureList )?
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:62: procedureList
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:46:1: constants returns [ ConstantNode e ] : ( IDENT '=' expression ';' ) (constantFollowUp= constants )? ;
    public final ConstantNode constants() throws RecognitionException {
        ConstantNode e = null;

        Token IDENT7=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression8 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:47:2: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:47:4: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:47:4: ( IDENT '=' expression ';' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:47:5: IDENT '=' expression ';'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants146); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_constants148); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants150);
            expression8=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants152); if (state.failed) return e;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:47:47: (constantFollowUp= constants )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:0:0: constantFollowUp= constants
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:53:1: typeDefs returns [ TypeDefNode e ] : ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? ;
    public final TypeDefNode typeDefs() throws RecognitionException {
        TypeDefNode e = null;

        Token IDENT9=null;
        TypeDefNode typeDefsFollowUp = null;

        ASTnode type10 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:54:2: ( ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:54:4: ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:54:4: ( IDENT '=' type ';' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:54:5: IDENT '=' type ';'
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDefs177); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_typeDefs179); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_typeDefs181);
            type10=type();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_typeDefs183); if (state.failed) return e;

            }

            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:54:41: (typeDefsFollowUp= typeDefs )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:0:0: typeDefsFollowUp= typeDefs
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:60:1: type returns [ ASTnode e ] : ( IDENT | arraytype | recordtype );
    public final ASTnode type() throws RecognitionException {
        ASTnode e = null;

        Token IDENT11=null;
        ArrayNode arraytype12 = null;

        RecordNode recordtype13 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:61:2: ( IDENT | arraytype | recordtype )
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:61:4: IDENT
                    {
                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_type207); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new TypeNode( (IDENT11!=null?IDENT11.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:62:4: arraytype
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:63:4: recordtype
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:66:1: arraytype returns [ ArrayNode e ] : 'ARRAY' expression 'OF' type ;
    public final ArrayNode arraytype() throws RecognitionException {
        ArrayNode e = null;

        ExpressionNode expression14 = null;

        ASTnode type15 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:67:2: ( 'ARRAY' expression 'OF' type )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:67:4: 'ARRAY' expression 'OF' type
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:73:1: recordtype returns [ RecordNode e ] : 'RECORD' fields 'END' ;
    public final RecordNode recordtype() throws RecognitionException {
        RecordNode e = null;

        FieldsNode fields16 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:74:2: ( 'RECORD' fields 'END' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:74:4: 'RECORD' fields 'END'
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:80:1: fields returns [ FieldsNode e ] : fieldlist ( fieldsFollowup )? ;
    public final FieldsNode fields() throws RecognitionException {
        FieldsNode e = null;

        FieldlistNode fieldlist17 = null;

        FieldsNode fieldsFollowup18 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:81:2: ( fieldlist ( fieldsFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:81:4: fieldlist ( fieldsFollowup )?
            {
            pushFollow(FOLLOW_fieldlist_in_fields286);
            fieldlist17=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:81:14: ( fieldsFollowup )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==8) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:81:15: fieldsFollowup
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:87:1: fieldsFollowup returns [ FieldsNode e ] : ';' fieldlist (followup= fieldsFollowup )? ;
    public final FieldsNode fieldsFollowup() throws RecognitionException {
        FieldsNode e = null;

        FieldsNode followup = null;

        FieldlistNode fieldlist19 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:88:2: ( ';' fieldlist (followup= fieldsFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:88:4: ';' fieldlist (followup= fieldsFollowup )?
            {
            match(input,8,FOLLOW_8_in_fieldsFollowup309); if (state.failed) return e;
            pushFollow(FOLLOW_fieldlist_in_fieldsFollowup311);
            fieldlist19=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:88:18: (followup= fieldsFollowup )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==8) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:88:19: followup= fieldsFollowup
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:94:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode simpleLeft = null;

        ExpressionNode simpleRight = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:95:2: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:95:4: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression340);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = simpleLeft; 
            }
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:96:4: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15||(LA12_0>=19 && LA12_0<=23)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:96:5: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:96:14: ( '=' | '#' | '<' | '<=' | '>' | '>=' )
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
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:97:6: '='
                            {
                            match(input,15,FOLLOW_15_in_expression358); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:98:6: '#'
                            {
                            match(input,19,FOLLOW_19_in_expression367); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionNotEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:99:6: '<'
                            {
                            match(input,20,FOLLOW_20_in_expression376); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionSmallerNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 4 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:100:6: '<='
                            {
                            match(input,21,FOLLOW_21_in_expression385); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionSmallerEqualNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 5 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:101:6: '>'
                            {
                            match(input,22,FOLLOW_22_in_expression394); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionBiggerNode( simpleLeft, null ); 
                            }

                            }
                            break;
                        case 6 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:102:6: '>='
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:107:1: simpleexpression returns [ ExpressionNode e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final ExpressionNode simpleexpression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode specialTerm20 = null;

        ExpressionNode simpleExpressionFollowup21 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:108:2: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:108:4: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression439);
            specialTerm20=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = specialTerm20; 
            }
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:109:2: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:109:4: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:109:13: ( '+' | '-' | 'OR' )
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
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:110:4: '+'
                            {
                            match(input,24,FOLLOW_24_in_simpleexpression453); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionPlusNode( specialTerm20, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:111:4: '-'
                            {
                            match(input,25,FOLLOW_25_in_simpleexpression460); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionMinNode( specialTerm20, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:112:4: 'OR'
                            {
                            match(input,26,FOLLOW_26_in_simpleexpression467); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionOrNode( specialTerm20, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression474);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:120:1: specialTerm returns [ ExpressionNode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ExpressionNode specialTerm() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode term22 = null;

        ExpressionNode term23 = null;

        ExpressionNode term24 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:121:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:121:5: operator= ( '+' ) term
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:121:14: ( '+' )
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:121:15: '+'
                    {
                    match(input,24,FOLLOW_24_in_specialTerm502); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm505);
                    term22=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term22; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:122:5: operator= ( '-' ) term
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:122:14: ( '-' )
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:122:15: '-'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm516); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm519);
                    term23=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new ExpressionMinusNode( term23 ); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:123:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm527);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:126:1: simpleExpressionFollowup returns [ ExpressionNode e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final ExpressionNode simpleExpressionFollowup() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode follow2 = null;

        ExpressionNode term25 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:127:2: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:127:5: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup547);
            term25=term();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = term25; 
            }
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:128:2: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=24 && LA17_0<=26)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:128:3: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:129:2: ( '+' | '-' | 'OR' )
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
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:130:4: '+'
                            {
                            match(input,24,FOLLOW_24_in_simpleExpressionFollowup563); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionPlusNode( term25, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:131:4: '-'
                            {
                            match(input,25,FOLLOW_25_in_simpleExpressionFollowup570); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionMinNode( term25, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:132:4: 'OR'
                            {
                            match(input,26,FOLLOW_26_in_simpleExpressionFollowup577); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionOrNode( term25, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup586);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:140:1: term returns [ ExpressionNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )? ;
    public final ExpressionNode term() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        ExpressionNode followup = null;

        ExpressionNode factor26 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:141:2: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:141:4: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )?
            {
            pushFollow(FOLLOW_factor_in_term609);
            factor26=factor();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {
               e = factor26; 
            }
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:142:2: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=27 && LA19_0<=30)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:142:3: operator= ( '*' | 'DIV' | 'MOD' | '&' ) followup= term
                    {
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:143:2: ( '*' | 'DIV' | 'MOD' | '&' )
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
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:144:4: '*'
                            {
                            match(input,27,FOLLOW_27_in_term624); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionMultiplyNode( factor26, null ); 
                            }

                            }
                            break;
                        case 2 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:145:4: 'DIV'
                            {
                            match(input,28,FOLLOW_28_in_term631); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionDivideNode( factor26, null ); 
                            }

                            }
                            break;
                        case 3 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:146:4: 'MOD'
                            {
                            match(input,29,FOLLOW_29_in_term638); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionModuloNode( factor26, null ); 
                            }

                            }
                            break;
                        case 4 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:147:4: '&'
                            {
                            match(input,30,FOLLOW_30_in_term645); if (state.failed) return e;
                            if ( state.backtracking==0 ) {
                               e = new ExpressionAndNode( factor26, null ); 
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_term_in_term656);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:152:1: factor returns [ ExpressionNode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ExpressionNode factor() throws RecognitionException {
        ExpressionNode e = null;

        ExpressionNode factorOperand = null;

        ExpressionNode variable27 = null;

        ExpressionNode number28 = null;

        ExpressionNode expression29 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:153:2: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:153:4: variable
                    {
                    pushFollow(FOLLOW_variable_in_factor678);
                    variable27=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = variable27; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:154:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor685);
                    number28=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number28; 
                    }

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:155:4: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor692); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor694);
                    expression29=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,32,FOLLOW_32_in_factor696); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression29; 
                    }

                    }
                    break;
                case 4 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:156:4: '~' factorOperand= factor
                    {
                    match(input,33,FOLLOW_33_in_factor703); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor707);
                    factorOperand=factor();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new ExpressionNotNode( factorOperand ); 
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:159:1: number returns [ ExpressionNode e ] : INTEGER ;
    public final ExpressionNode number() throws RecognitionException {
        ExpressionNode e = null;

        Token INTEGER30=null;

        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:160:2: ( INTEGER )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:160:4: INTEGER
            {
            INTEGER30=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number724); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:166:1: selector returns [ ASTnode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final ASTnode selector() throws RecognitionException {
        ASTnode e = null;

        Token var=null;
        ASTnode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:167:2: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:168:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:168:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:169:2: '.' var= IDENT selectorFollowup= selector
                    {
                    match(input,11,FOLLOW_11_in_selector750); if (state.failed) return e;
                    var=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector754); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector758);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                      	  e = new SelectorRecordNode( (var!=null?var.getText():null), selectorFollowup );
                      	
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:174:2: '[' exp= expression ']' selectorFollowup= selector
                    {
                    match(input,34,FOLLOW_34_in_selector769); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_selector773);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,35,FOLLOW_35_in_selector775); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector779);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:181:1: variable returns [ ExpressionNode e ] : IDENT selector ;
    public final ExpressionNode variable() throws RecognitionException {
        ExpressionNode e = null;

        Token IDENT31=null;
        ASTnode selector32 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:182:3: ( IDENT selector )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:182:5: IDENT selector
            {
            IDENT31=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable804); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable806);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:188:1: fieldlist returns [ FieldlistNode e ] : ( identlist ':' type )? ;
    public final FieldlistNode fieldlist() throws RecognitionException {
        FieldlistNode e = null;

        IdentListNode identlist33 = null;

        ASTnode type34 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:189:2: ( ( identlist ':' type )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:189:4: ( identlist ':' type )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:189:4: ( identlist ':' type )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:189:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist828);
                    identlist33=identlist();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,36,FOLLOW_36_in_fieldlist830); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_fieldlist832);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:195:1: identlist returns [ IdentListNode e ] : IDENT ( identlistFollowUp )? ;
    public final IdentListNode identlist() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT35=null;
        IdentListNode identlistFollowUp36 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:196:2: ( IDENT ( identlistFollowUp )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:196:4: IDENT ( identlistFollowUp )?
            {
            IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist853); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:196:10: ( identlistFollowUp )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:196:12: identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlist857);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:202:1: identlistFollowUp returns [ IdentListNode e ] : ',' IDENT (followup= identlistFollowUp )? ;
    public final IdentListNode identlistFollowUp() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT37=null;
        IdentListNode followup = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:203:2: ( ',' IDENT (followup= identlistFollowUp )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:203:4: ',' IDENT (followup= identlistFollowUp )?
            {
            match(input,37,FOLLOW_37_in_identlistFollowUp879); if (state.failed) return e;
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlistFollowUp881); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:203:14: (followup= identlistFollowUp )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:203:16: followup= identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlistFollowUp887);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:209:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement38 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:210:2: ( statement (followOne= followupStatementSequence )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:210:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence907);
            statement38=statement();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:210:14: (followOne= followupStatementSequence )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==8) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:210:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence913);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:216:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement39 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:217:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:217:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence934); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence936);
            statement39=statement();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:217:18: (followTwo= followupStatementSequence )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==8) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:217:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence942);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:223:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement | statementRv= withCall )?
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement966);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement972);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement978);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement984);
                    statementRv=whilestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 5 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:224:114: statementRv= withCall
                    {
                    pushFollow(FOLLOW_withCall_in_statement990);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:230:1: withCall returns [ StatementNode e ] : 'WITH' expression 'DO' statementsequence 'END' ;
    public final StatementNode withCall() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression40 = null;

        StatementSequenceNode statementsequence41 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:231:2: ( 'WITH' expression 'DO' statementsequence 'END' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:231:4: 'WITH' expression 'DO' statementsequence 'END'
            {
            match(input,38,FOLLOW_38_in_withCall1011); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_withCall1013);
            expression40=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,39,FOLLOW_39_in_withCall1015); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_withCall1017);
            statementsequence41=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_withCall1019); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:237:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode variable42 = null;

        ExpressionNode expression43 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:238:2: ( variable ':=' expression )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:238:4: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment1038);
            variable42=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_assignment1040); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment1042);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:244:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT44=null;
        ParamNode actualparameters45 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:245:2: ( IDENT ( actualparameters )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:245:4: IDENT ( actualparameters )?
            {
            IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall1061); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:245:10: ( actualparameters )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:245:11: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall1064);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:251:1: actualparameters returns [ ParamNode e ] : '(' ( expression (follow= actualparametersfollowup )? )? ')' ;
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression46 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:252:2: ( '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:252:4: '(' ( expression (follow= actualparametersfollowup )? )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters1085); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:252:8: ( expression (follow= actualparametersfollowup )? )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=IDENT && LA30_0<=INTEGER)||(LA30_0>=24 && LA30_0<=25)||LA30_0==31||LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:252:10: expression (follow= actualparametersfollowup )?
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters1089);
                    expression46=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:252:21: (follow= actualparametersfollowup )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==37) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:252:23: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters1095);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters1102); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:258:1: actualparametersfollowup returns [ ParamNode e] : ',' expression (follow= actualparametersfollowup )? ;
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression47 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:259:3: ( ',' expression (follow= actualparametersfollowup )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:259:5: ',' expression (follow= actualparametersfollowup )?
            {
            match(input,37,FOLLOW_37_in_actualparametersfollowup1122); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_actualparametersfollowup1124);
            expression47=expression();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:259:20: (follow= actualparametersfollowup )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:259:22: follow= actualparametersfollowup
                    {
                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup1130);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:265:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression48 = null;

        StatementSequenceNode statementsequence49 = null;

        StatementNode elsestatement50 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:266:2: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:266:4: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,41,FOLLOW_41_in_ifstatement1153); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement1155);
            expression48=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,42,FOLLOW_42_in_ifstatement1157); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement1159);
            statementsequence49=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:266:45: ( elsestatement )?
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement1161);
                    elsestatement50=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement1164); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:272:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression51 = null;

        StatementSequenceNode statementsequence52 = null;

        StatementSequenceNode statementsequence53 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:273:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
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
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:273:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,43,FOLLOW_43_in_elsestatement1184); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement1186);
                    expression51=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,42,FOLLOW_42_in_elsestatement1188); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1190);
                    statementsequence52=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement1194);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression51, statementsequence52, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:277:5: 'ELSE' statementsequence
                    {
                    match(input,44,FOLLOW_44_in_elsestatement1205); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1207);
                    statementsequence53=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence53 );
                        
                    }

                    }
                    break;
                case 3 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:282:3: 
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:287:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:288:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:288:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,45,FOLLOW_45_in_whilestatement1237); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement1241);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,39,FOLLOW_39_in_whilestatement1243); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement1247);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1249); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:294:1: procedureList returns [ ProcedureListNode e ] : ( proceduredeclaration ';' (followup= procedureList )? )? ;
    public final ProcedureListNode procedureList() throws RecognitionException {
        ProcedureListNode e = null;

        ProcedureListNode followup = null;

        ProcedureDeclarationNode proceduredeclaration54 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:2: ( ( proceduredeclaration ';' (followup= procedureList )? )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:5: proceduredeclaration ';' (followup= procedureList )?
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_procedureList1269);
                    proceduredeclaration54=proceduredeclaration();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,8,FOLLOW_8_in_procedureList1271); if (state.failed) return e;
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:30: (followup= procedureList )?
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
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:32: followup= procedureList
                            {
                            pushFollow(FOLLOW_procedureList_in_procedureList1277);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:301:1: proceduredeclaration returns [ ProcedureDeclarationNode e ] : procedureheading ';' procedurebody ;
    public final ProcedureDeclarationNode proceduredeclaration() throws RecognitionException {
        ProcedureDeclarationNode e = null;

        ProcedureHeadingNode procedureheading55 = null;

        ProcedureBodyNode procedurebody56 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:302:2: ( procedureheading ';' procedurebody )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:302:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1302);
            procedureheading55=procedureheading();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_proceduredeclaration1304); if (state.failed) return e;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1306);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:308:1: procedureheading returns [ ProcedureHeadingNode e ] : 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? ;
    public final ProcedureHeadingNode procedureheading() throws RecognitionException {
        ProcedureHeadingNode e = null;

        Token IDENT57=null;
        FormalParameterNode formalparameters58 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:309:2: ( 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:309:4: 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )?
            {
            match(input,46,FOLLOW_46_in_procedureheading1325); if (state.failed) return e;
            IDENT57=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading1327); if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:309:22: ( '(' ( formalparameters )? ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:309:24: '(' ( formalparameters )? ')'
                    {
                    match(input,31,FOLLOW_31_in_procedureheading1331); if (state.failed) return e;
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:309:28: ( formalparameters )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==IDENT||LA36_0==14) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:0:0: formalparameters
                            {
                            pushFollow(FOLLOW_formalparameters_in_procedureheading1333);
                            formalparameters58=formalparameters();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_procedureheading1336); if (state.failed) return e;

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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:315:1: procedurebody returns [ ProcedureBodyNode e ] : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final ProcedureBodyNode procedurebody() throws RecognitionException {
        ProcedureBodyNode e = null;

        Token IDENT61=null;
        DeclarationsNode declarations59 = null;

        StatementSequenceNode statementsequence60 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:316:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:316:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1357);
            declarations59=declarations();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:316:17: ( 'BEGIN' statementsequence )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==9) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:316:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1360); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1362);
                    statementsequence60=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1366); if (state.failed) return e;
            IDENT61=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody1368); if (state.failed) return e;
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:322:1: formalparameters returns [ FormalParameterNode e ] : fpsection ( ';' followup= formalparameters )? ;
    public final FormalParameterNode formalparameters() throws RecognitionException {
        FormalParameterNode e = null;

        FormalParameterNode followup = null;

        FpSectionNode fpsection62 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:323:2: ( fpsection ( ';' followup= formalparameters )? )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:323:4: fpsection ( ';' followup= formalparameters )?
            {
            pushFollow(FOLLOW_fpsection_in_formalparameters1387);
            fpsection62=fpsection();

            state._fsp--;
            if (state.failed) return e;
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:323:14: ( ';' followup= formalparameters )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==8) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:323:16: ';' followup= formalparameters
                    {
                    match(input,8,FOLLOW_8_in_formalparameters1391); if (state.failed) return e;
                    pushFollow(FOLLOW_formalparameters_in_formalparameters1395);
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
    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:329:1: fpsection returns [ FpSectionNode e ] : (ident= 'VAR' )? identlist ':' type ;
    public final FpSectionNode fpsection() throws RecognitionException {
        FpSectionNode e = null;

        Token ident=null;
        IdentListNode identlist63 = null;

        ASTnode type64 = null;


        try {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:330:2: ( (ident= 'VAR' )? identlist ':' type )
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:330:4: (ident= 'VAR' )? identlist ':' type
            {
            // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:330:4: (ident= 'VAR' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:330:5: ident= 'VAR'
                    {
                    ident=(Token)match(input,14,FOLLOW_14_in_fpsection1419); if (state.failed) return e;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1423);
            identlist63=identlist();

            state._fsp--;
            if (state.failed) return e;
            match(input,36,FOLLOW_36_in_fpsection1425); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_fpsection1427);
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
        // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:62: ( procedureList )
        // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:40:62: procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred5_oberon0124);
        procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_oberon0

    // $ANTLR start synpred49_oberon0
    public final void synpred49_oberon0_fragment() throws RecognitionException {   
        // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:266:45: ( elsestatement )
        // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:266:45: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred49_oberon01161);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_oberon0

    // $ANTLR start synpred52_oberon0
    public final void synpred52_oberon0_fragment() throws RecognitionException {   
        ProcedureListNode followup = null;


        // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:32: (followup= procedureList )
        // /Users/benkwint/Documents/uni/softwareConstruction3/grammar/oberon0.g:295:32: followup= procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred52_oberon01277);
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


 

    public static final BitSet FOLLOW_7_in_module59 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module63 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module65 = new BitSet(new long[]{0x0000400000007000L});
    public static final BitSet FOLLOW_declarations_in_module67 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module70 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module72 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module76 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module80 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_constants_in_declarations104 = new BitSet(new long[]{0x0000400000006000L});
    public static final BitSet FOLLOW_13_in_declarations109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeDefs_in_declarations111 = new BitSet(new long[]{0x0000400000004000L});
    public static final BitSet FOLLOW_14_in_declarations116 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fields_in_declarations118 = new BitSet(new long[]{0x0000400000000000L});
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
    public static final BitSet FOLLOW_24_in_simpleexpression453 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_25_in_simpleexpression460 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_26_in_simpleexpression467 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_specialTerm502 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm516 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup547 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_24_in_simpleExpressionFollowup563 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_25_in_simpleExpressionFollowup570 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_26_in_simpleExpressionFollowup577 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term609 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_27_in_term624 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_28_in_term631 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_29_in_term638 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_30_in_term645 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_term656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor692 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor694 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor703 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector754 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_selector769 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector773 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector775 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable804 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_variable806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist828 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldlist830 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fieldlist832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist853 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlist857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identlistFollowUp879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlistFollowUp881 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlistFollowUp887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence907 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence934 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence936 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withCall_in_statement990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_withCall1011 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_withCall1013 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_withCall1015 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_withCall1017 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_withCall1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1038 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_assignment1040 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall1061 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters1085 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters1089 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters1095 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup1122 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup1124 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifstatement1153 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement1155 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifstatement1157 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement1159 = new BitSet(new long[]{0x0000180000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement1161 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_elsestatement1184 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement1186 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_elsestatement1188 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1190 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_elsestatement1205 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_whilestatement1237 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement1241 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_whilestatement1243 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement1247 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_procedureList1269 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureList1271 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_procedureList_in_procedureList1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1302 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1304 = new BitSet(new long[]{0x0000400000007000L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_procedureheading1325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1327 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_procedureheading1331 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1333 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureheading1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1357 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1360 = new BitSet(new long[]{0x0000224000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1362 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1387 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_formalparameters1391 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalparameters_in_formalparameters1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_fpsection1419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1423 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fpsection1425 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fpsection1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred5_oberon0124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred49_oberon01161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred52_oberon01277 = new BitSet(new long[]{0x0000000000000002L});

}