// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-29 14:18:32

  package parser;
  
  import ASTnodes.*;
  import parseErrorLog.*;


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
    public String getGrammarFileName() { return "oberon0.g"; }


        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            
            parseErrorLog.addMessage( hdr + " -> " + msg );
        }



    // $ANTLR start "module"
    // oberon0.g:32:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // oberon0.g:33:2: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // oberon0.g:33:4: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module59); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module63); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module65); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module67);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:33:41: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // oberon0.g:33:42: 'BEGIN' statementsequence
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
    // oberon0.g:39:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;

        TypeDefNode typeDefs4 = null;

        FieldsNode fields5 = null;

        ProcedureListNode procedureList6 = null;


        try {
            // oberon0.g:40:2: ( ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )? )
            // oberon0.g:40:4: ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' fields )? ( procedureList )?
            {
            // oberon0.g:40:4: ( 'CONST' constants )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // oberon0.g:40:5: 'CONST' constants
                    {
                    match(input,12,FOLLOW_12_in_declarations102); if (state.failed) return e;
                    pushFollow(FOLLOW_constants_in_declarations104);
                    constants3=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // oberon0.g:40:25: ( 'TYPE' typeDefs )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // oberon0.g:40:26: 'TYPE' typeDefs
                    {
                    match(input,13,FOLLOW_13_in_declarations109); if (state.failed) return e;
                    pushFollow(FOLLOW_typeDefs_in_declarations111);
                    typeDefs4=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // oberon0.g:40:44: ( 'VAR' fields )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // oberon0.g:40:45: 'VAR' fields
                    {
                    match(input,14,FOLLOW_14_in_declarations116); if (state.failed) return e;
                    pushFollow(FOLLOW_fields_in_declarations118);
                    fields5=fields();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // oberon0.g:40:61: ( procedureList )?
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
                    // oberon0.g:40:62: procedureList
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
    // oberon0.g:46:1: constants returns [ ConstantNode e ] : ( IDENT '=' expression ';' ) (constantFollowUp= constants )? ;
    public final ConstantNode constants() throws RecognitionException {
        ConstantNode e = null;

        Token IDENT7=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression8 = null;


        try {
            // oberon0.g:47:2: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // oberon0.g:47:4: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // oberon0.g:47:4: ( IDENT '=' expression ';' )
            // oberon0.g:47:5: IDENT '=' expression ';'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants146); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_constants148); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants150);
            expression8=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants152); if (state.failed) return e;

            }

            // oberon0.g:47:47: (constantFollowUp= constants )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // oberon0.g:0:0: constantFollowUp= constants
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
    // oberon0.g:53:1: typeDefs returns [ TypeDefNode e ] : ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? ;
    public final TypeDefNode typeDefs() throws RecognitionException {
        TypeDefNode e = null;

        Token IDENT9=null;
        TypeDefNode typeDefsFollowUp = null;

        ASTnode type10 = null;


        try {
            // oberon0.g:54:2: ( ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? )
            // oberon0.g:54:4: ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )?
            {
            // oberon0.g:54:4: ( IDENT '=' type ';' )
            // oberon0.g:54:5: IDENT '=' type ';'
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDefs177); if (state.failed) return e;
            match(input,15,FOLLOW_15_in_typeDefs179); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_typeDefs181);
            type10=type();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_typeDefs183); if (state.failed) return e;

            }

            // oberon0.g:54:41: (typeDefsFollowUp= typeDefs )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // oberon0.g:0:0: typeDefsFollowUp= typeDefs
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
    // oberon0.g:60:1: type returns [ ASTnode e ] : ( IDENT | arraytype | recordtype );
    public final ASTnode type() throws RecognitionException {
        ASTnode e = null;

        Token IDENT11=null;
        ArrayNode arraytype12 = null;

        RecordNode recordtype13 = null;


        try {
            // oberon0.g:61:2: ( IDENT | arraytype | recordtype )
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
                    // oberon0.g:61:4: IDENT
                    {
                    IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_type207); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new TypeNode( (IDENT11!=null?IDENT11.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:62:4: arraytype
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
                    // oberon0.g:63:4: recordtype
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
    // oberon0.g:66:1: arraytype returns [ ArrayNode e ] : 'ARRAY' expression 'OF' type ;
    public final ArrayNode arraytype() throws RecognitionException {
        ArrayNode e = null;

        ExpressionNode expression14 = null;

        ASTnode type15 = null;


        try {
            // oberon0.g:67:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:67:4: 'ARRAY' expression 'OF' type
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
    // oberon0.g:73:1: recordtype returns [ RecordNode e ] : 'RECORD' fields 'END' ;
    public final RecordNode recordtype() throws RecognitionException {
        RecordNode e = null;

        FieldsNode fields16 = null;


        try {
            // oberon0.g:74:2: ( 'RECORD' fields 'END' )
            // oberon0.g:74:4: 'RECORD' fields 'END'
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
    // oberon0.g:80:1: fields returns [ FieldsNode e ] : fieldlist ( fieldsFollowup )? ;
    public final FieldsNode fields() throws RecognitionException {
        FieldsNode e = null;

        FieldlistNode fieldlist17 = null;

        FieldsNode fieldsFollowup18 = null;


        try {
            // oberon0.g:81:2: ( fieldlist ( fieldsFollowup )? )
            // oberon0.g:81:4: fieldlist ( fieldsFollowup )?
            {
            pushFollow(FOLLOW_fieldlist_in_fields286);
            fieldlist17=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:81:14: ( fieldsFollowup )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==8) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // oberon0.g:81:15: fieldsFollowup
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
    // oberon0.g:87:1: fieldsFollowup returns [ FieldsNode e ] : ';' fieldlist (followup= fieldsFollowup )? ;
    public final FieldsNode fieldsFollowup() throws RecognitionException {
        FieldsNode e = null;

        FieldsNode followup = null;

        FieldlistNode fieldlist19 = null;


        try {
            // oberon0.g:88:2: ( ';' fieldlist (followup= fieldsFollowup )? )
            // oberon0.g:88:4: ';' fieldlist (followup= fieldsFollowup )?
            {
            match(input,8,FOLLOW_8_in_fieldsFollowup309); if (state.failed) return e;
            pushFollow(FOLLOW_fieldlist_in_fieldsFollowup311);
            fieldlist19=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:88:18: (followup= fieldsFollowup )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==8) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:88:19: followup= fieldsFollowup
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
    // oberon0.g:94:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        SimpleExpression simpleLeft = null;

        SimpleExpression simpleRight = null;


        try {
            // oberon0.g:95:2: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // oberon0.g:95:4: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression340);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:95:32: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15||(LA11_0>=19 && LA11_0<=23)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // oberon0.g:95:33: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
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
    // oberon0.g:101:1: simpleexpression returns [ SimpleExpression e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final SimpleExpression simpleexpression() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        ASTnode specialTerm20 = null;

        SimpleExpression simpleExpressionFollowup21 = null;


        try {
            // oberon0.g:102:2: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // oberon0.g:102:4: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression382);
            specialTerm20=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:102:16: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=26)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // oberon0.g:102:18: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
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
    // oberon0.g:108:1: specialTerm returns [ ASTnode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ASTnode specialTerm() throws RecognitionException {
        ASTnode e = null;

        Token operator=null;
        TermNode term22 = null;

        TermNode term23 = null;

        TermNode term24 = null;


        try {
            // oberon0.g:109:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
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
                    // oberon0.g:109:5: operator= ( '+' ) term
                    {
                    // oberon0.g:109:14: ( '+' )
                    // oberon0.g:109:15: '+'
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
                    // oberon0.g:110:5: operator= ( '-' ) term
                    {
                    // oberon0.g:110:14: ( '-' )
                    // oberon0.g:110:15: '-'
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
                    // oberon0.g:111:5: term
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
    // oberon0.g:114:1: simpleExpressionFollowup returns [ SimpleExpression e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final SimpleExpression simpleExpressionFollowup() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        SimpleExpression follow2 = null;

        TermNode term25 = null;


        try {
            // oberon0.g:115:2: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // oberon0.g:115:5: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup466);
            term25=term();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:115:10: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=24 && LA14_0<=26)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // oberon0.g:115:11: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
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
    // oberon0.g:121:1: term returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? ;
    public final TermNode term() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        ASTnode factor26 = null;

        TermNode termFollowUp27 = null;


        try {
            // oberon0.g:122:2: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? )
            // oberon0.g:122:4: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_term502);
            factor26=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:122:11: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=27 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // oberon0.g:122:12: operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp
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
    // oberon0.g:128:1: termFollowUp returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? ;
    public final TermNode termFollowUp() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        TermNode follow2 = null;

        ASTnode factor28 = null;


        try {
            // oberon0.g:129:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? )
            // oberon0.g:129:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_termFollowUp539);
            factor28=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:129:12: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=27 && LA16_0<=30)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // oberon0.g:129:13: operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp
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
    // oberon0.g:135:1: factor returns [ ASTnode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ASTnode factor() throws RecognitionException {
        ASTnode e = null;

        ASTnode factorOperand = null;

        VarNode variable29 = null;

        IntegerNode number30 = null;

        ExpressionNode expression31 = null;


        try {
            // oberon0.g:136:2: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
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
                    // oberon0.g:136:4: variable
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
                    // oberon0.g:137:4: number
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
                    // oberon0.g:138:4: '(' expression ')'
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
                    // oberon0.g:139:4: '~' factorOperand= factor
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
    // oberon0.g:142:1: number returns [ IntegerNode e ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode e = null;

        Token INTEGER32=null;

        try {
            // oberon0.g:143:2: ( INTEGER )
            // oberon0.g:143:4: INTEGER
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
    // oberon0.g:149:1: selector returns [ ASTnode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final ASTnode selector() throws RecognitionException {
        ASTnode e = null;

        Token var=null;
        ASTnode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // oberon0.g:150:2: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // oberon0.g:151:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // oberon0.g:151:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
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
                    // oberon0.g:152:2: '.' var= IDENT selectorFollowup= selector
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
                    // oberon0.g:157:2: '[' exp= expression ']' selectorFollowup= selector
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
    // oberon0.g:164:1: variable returns [ VarNode e ] : IDENT selector ;
    public final VarNode variable() throws RecognitionException {
        VarNode e = null;

        Token IDENT33=null;
        ASTnode selector34 = null;


        try {
            // oberon0.g:165:9: ( IDENT selector )
            // oberon0.g:165:11: IDENT selector
            {
            IDENT33=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable710); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable712);
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
    // oberon0.g:171:1: fieldlist returns [ FieldlistNode e ] : ( identlist ':' type )? ;
    public final FieldlistNode fieldlist() throws RecognitionException {
        FieldlistNode e = null;

        IdentListNode identlist35 = null;

        ASTnode type36 = null;


        try {
            // oberon0.g:172:2: ( ( identlist ':' type )? )
            // oberon0.g:172:4: ( identlist ':' type )?
            {
            // oberon0.g:172:4: ( identlist ':' type )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // oberon0.g:172:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist746);
                    identlist35=identlist();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,36,FOLLOW_36_in_fieldlist748); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_fieldlist750);
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
    // oberon0.g:178:1: identlist returns [ IdentListNode e ] : IDENT ( identlistFollowUp )? ;
    public final IdentListNode identlist() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT37=null;
        IdentListNode identlistFollowUp38 = null;


        try {
            // oberon0.g:179:2: ( IDENT ( identlistFollowUp )? )
            // oberon0.g:179:4: IDENT ( identlistFollowUp )?
            {
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist771); if (state.failed) return e;
            // oberon0.g:179:10: ( identlistFollowUp )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // oberon0.g:179:12: identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlist775);
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
    // oberon0.g:185:1: identlistFollowUp returns [ IdentListNode e ] : ',' IDENT (followup= identlistFollowUp )? ;
    public final IdentListNode identlistFollowUp() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT39=null;
        IdentListNode followup = null;


        try {
            // oberon0.g:186:2: ( ',' IDENT (followup= identlistFollowUp )? )
            // oberon0.g:186:4: ',' IDENT (followup= identlistFollowUp )?
            {
            match(input,37,FOLLOW_37_in_identlistFollowUp797); if (state.failed) return e;
            IDENT39=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlistFollowUp799); if (state.failed) return e;
            // oberon0.g:186:14: (followup= identlistFollowUp )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // oberon0.g:186:16: followup= identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlistFollowUp805);
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
    // oberon0.g:192:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement40 = null;


        try {
            // oberon0.g:193:2: ( statement (followOne= followupStatementSequence )? )
            // oberon0.g:193:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence825);
            statement40=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:193:14: (followOne= followupStatementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==8) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // oberon0.g:193:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence831);
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
    // oberon0.g:199:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement41 = null;


        try {
            // oberon0.g:200:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // oberon0.g:200:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence852); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence854);
            statement41=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:200:18: (followTwo= followupStatementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==8) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // oberon0.g:200:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence860);
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
    // oberon0.g:206:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // oberon0.g:207:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? )
            // oberon0.g:207:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            {
            // oberon0.g:207:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
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
                    // oberon0.g:207:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement884);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // oberon0.g:207:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement890);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // oberon0.g:207:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement896);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // oberon0.g:207:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement902);
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
    // oberon0.g:213:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        VarNode variable42 = null;

        ExpressionNode expression43 = null;


        try {
            // oberon0.g:214:2: ( variable ':=' expression )
            // oberon0.g:214:4: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment924);
            variable42=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,38,FOLLOW_38_in_assignment926); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment928);
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
    // oberon0.g:220:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT44=null;
        ParamNode actualparameters45 = null;


        try {
            // oberon0.g:221:2: ( IDENT ( actualparameters )? )
            // oberon0.g:221:4: IDENT ( actualparameters )?
            {
            IDENT44=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall947); if (state.failed) return e;
            // oberon0.g:221:10: ( actualparameters )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // oberon0.g:221:11: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall950);
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
    // oberon0.g:227:1: actualparameters returns [ ParamNode e ] : ( '(' ( variable (followsecond= actualparametersfollowup )? )? ')' | '(' ( expression (follow= actualparametersfollowup )? )? ')' );
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode followsecond = null;

        ParamNode follow = null;

        VarNode variable46 = null;

        ExpressionNode expression47 = null;


        try {
            // oberon0.g:228:2: ( '(' ( variable (followsecond= actualparametersfollowup )? )? ')' | '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred51_oberon0()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // oberon0.g:228:4: '(' ( variable (followsecond= actualparametersfollowup )? )? ')'
                    {
                    match(input,31,FOLLOW_31_in_actualparameters971); if (state.failed) return e;
                    // oberon0.g:228:8: ( variable (followsecond= actualparametersfollowup )? )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==IDENT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // oberon0.g:228:10: variable (followsecond= actualparametersfollowup )?
                            {
                            pushFollow(FOLLOW_variable_in_actualparameters975);
                            variable46=variable();

                            state._fsp--;
                            if (state.failed) return e;
                            // oberon0.g:228:19: (followsecond= actualparametersfollowup )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==37) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // oberon0.g:228:21: followsecond= actualparametersfollowup
                                    {
                                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters981);
                                    followsecond=actualparametersfollowup();

                                    state._fsp--;
                                    if (state.failed) return e;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_actualparameters988); if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ParamNode( variable46, followsecond );
                        
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:232:5: '(' ( expression (follow= actualparametersfollowup )? )? ')'
                    {
                    match(input,31,FOLLOW_31_in_actualparameters998); if (state.failed) return e;
                    // oberon0.g:232:9: ( expression (follow= actualparametersfollowup )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=IDENT && LA29_0<=INTEGER)||(LA29_0>=24 && LA29_0<=25)||LA29_0==31||LA29_0==33) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // oberon0.g:232:11: expression (follow= actualparametersfollowup )?
                            {
                            pushFollow(FOLLOW_expression_in_actualparameters1002);
                            expression47=expression();

                            state._fsp--;
                            if (state.failed) return e;
                            // oberon0.g:232:22: (follow= actualparametersfollowup )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==37) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // oberon0.g:232:24: follow= actualparametersfollowup
                                    {
                                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters1008);
                                    follow=actualparametersfollowup();

                                    state._fsp--;
                                    if (state.failed) return e;

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_actualparameters1015); if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                      	  e = new ParamNode( expression47, follow );
                      	
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
    // $ANTLR end "actualparameters"


    // $ANTLR start "actualparametersfollowup"
    // oberon0.g:238:1: actualparametersfollowup returns [ ParamNode e] : ( ',' variable (followsecond= actualparametersfollowup )? | ',' expression (follow= actualparametersfollowup )? );
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode followsecond = null;

        ParamNode follow = null;

        VarNode variable48 = null;

        ExpressionNode expression49 = null;


        try {
            // oberon0.g:239:3: ( ',' variable (followsecond= actualparametersfollowup )? | ',' expression (follow= actualparametersfollowup )? )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==IDENT) ) {
                    int LA33_2 = input.LA(3);

                    if ( (synpred55_oberon0()) ) {
                        alt33=1;
                    }
                    else if ( (true) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA33_1==INTEGER||(LA33_1>=24 && LA33_1<=25)||LA33_1==31||LA33_1==33) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // oberon0.g:239:6: ',' variable (followsecond= actualparametersfollowup )?
                    {
                    match(input,37,FOLLOW_37_in_actualparametersfollowup1036); if (state.failed) return e;
                    pushFollow(FOLLOW_variable_in_actualparametersfollowup1038);
                    variable48=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    // oberon0.g:239:19: (followsecond= actualparametersfollowup )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==37) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // oberon0.g:239:21: followsecond= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup1044);
                            followsecond=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                          e = new ParamNode( variable48, followsecond );
                        
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:243:5: ',' expression (follow= actualparametersfollowup )?
                    {
                    match(input,37,FOLLOW_37_in_actualparametersfollowup1056); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_actualparametersfollowup1058);
                    expression49=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // oberon0.g:243:20: (follow= actualparametersfollowup )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==37) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // oberon0.g:243:22: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup1064);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                          e = new ParamNode( expression49, follow );
                        
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
    // $ANTLR end "actualparametersfollowup"


    // $ANTLR start "ifstatement"
    // oberon0.g:249:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression50 = null;

        StatementSequenceNode statementsequence51 = null;

        StatementNode elsestatement52 = null;


        try {
            // oberon0.g:250:2: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // oberon0.g:250:4: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement1087); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement1089);
            expression50=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_ifstatement1091); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement1093);
            statementsequence51=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:250:45: ( elsestatement )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=41 && LA34_0<=42)) ) {
                alt34=1;
            }
            else if ( (LA34_0==10) ) {
                int LA34_2 = input.LA(2);

                if ( (synpred57_oberon0()) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement1095);
                    elsestatement52=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement1098); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new IfStatementNode( expression50, statementsequence51, elsestatement52 );
              	
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
    // oberon0.g:256:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression53 = null;

        StatementSequenceNode statementsequence54 = null;

        StatementSequenceNode statementsequence55 = null;


        try {
            // oberon0.g:257:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt35=1;
                }
                break;
            case 42:
                {
                alt35=2;
                }
                break;
            case EOF:
            case 10:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // oberon0.g:257:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,41,FOLLOW_41_in_elsestatement1118); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement1120);
                    expression53=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,40,FOLLOW_40_in_elsestatement1122); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1124);
                    statementsequence54=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement1128);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression53, statementsequence54, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:261:5: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_elsestatement1139); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1141);
                    statementsequence55=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence55 );
                        
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:266:3: 
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
    // oberon0.g:271:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // oberon0.g:272:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // oberon0.g:272:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement1171); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement1175);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,44,FOLLOW_44_in_whilestatement1177); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement1181);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1183); if (state.failed) return e;
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
    // oberon0.g:278:1: procedureList returns [ ProcedureListNode e ] : ( proceduredeclaration ';' (followup= procedureList )? )? ;
    public final ProcedureListNode procedureList() throws RecognitionException {
        ProcedureListNode e = null;

        ProcedureListNode followup = null;

        ProcedureDeclarationNode proceduredeclaration56 = null;


        try {
            // oberon0.g:279:2: ( ( proceduredeclaration ';' (followup= procedureList )? )? )
            // oberon0.g:279:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            {
            // oberon0.g:279:4: ( proceduredeclaration ';' (followup= procedureList )? )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // oberon0.g:279:5: proceduredeclaration ';' (followup= procedureList )?
                    {
                    pushFollow(FOLLOW_proceduredeclaration_in_procedureList1203);
                    proceduredeclaration56=proceduredeclaration();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,8,FOLLOW_8_in_procedureList1205); if (state.failed) return e;
                    // oberon0.g:279:30: (followup= procedureList )?
                    int alt36=2;
                    switch ( input.LA(1) ) {
                        case 45:
                            {
                            alt36=1;
                            }
                            break;
                        case 9:
                            {
                            int LA36_2 = input.LA(2);

                            if ( (synpred60_oberon0()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case 10:
                            {
                            int LA36_3 = input.LA(2);

                            if ( (synpred60_oberon0()) ) {
                                alt36=1;
                            }
                            }
                            break;
                        case EOF:
                            {
                            int LA36_4 = input.LA(2);

                            if ( (synpred60_oberon0()) ) {
                                alt36=1;
                            }
                            }
                            break;
                    }

                    switch (alt36) {
                        case 1 :
                            // oberon0.g:279:32: followup= procedureList
                            {
                            pushFollow(FOLLOW_procedureList_in_procedureList1211);
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

              	  e = new ProcedureListNode( proceduredeclaration56, followup );
              	
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
    // oberon0.g:285:1: proceduredeclaration returns [ ProcedureDeclarationNode e ] : procedureheading ';' procedurebody ;
    public final ProcedureDeclarationNode proceduredeclaration() throws RecognitionException {
        ProcedureDeclarationNode e = null;

        ProcedureHeadingNode procedureheading57 = null;

        ProcedureBodyNode procedurebody58 = null;


        try {
            // oberon0.g:286:2: ( procedureheading ';' procedurebody )
            // oberon0.g:286:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1236);
            procedureheading57=procedureheading();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_proceduredeclaration1238); if (state.failed) return e;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1240);
            procedurebody58=procedurebody();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new ProcedureDeclarationNode( procedureheading57, procedurebody58 );
              	
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
    // oberon0.g:292:1: procedureheading returns [ ProcedureHeadingNode e ] : 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? ;
    public final ProcedureHeadingNode procedureheading() throws RecognitionException {
        ProcedureHeadingNode e = null;

        Token IDENT59=null;
        FormalParameterNode formalparameters60 = null;


        try {
            // oberon0.g:293:2: ( 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )? )
            // oberon0.g:293:4: 'PROCEDURE' IDENT ( '(' ( formalparameters )? ')' )?
            {
            match(input,45,FOLLOW_45_in_procedureheading1259); if (state.failed) return e;
            IDENT59=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureheading1261); if (state.failed) return e;
            // oberon0.g:293:22: ( '(' ( formalparameters )? ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==31) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // oberon0.g:293:24: '(' ( formalparameters )? ')'
                    {
                    match(input,31,FOLLOW_31_in_procedureheading1265); if (state.failed) return e;
                    // oberon0.g:293:28: ( formalparameters )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==IDENT||LA38_0==14) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // oberon0.g:0:0: formalparameters
                            {
                            pushFollow(FOLLOW_formalparameters_in_procedureheading1267);
                            formalparameters60=formalparameters();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }

                    match(input,32,FOLLOW_32_in_procedureheading1270); if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ProcedureHeadingNode( (IDENT59!=null?IDENT59.getText():null), formalparameters60 );
              	
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
    // oberon0.g:299:1: procedurebody returns [ ProcedureBodyNode e ] : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final ProcedureBodyNode procedurebody() throws RecognitionException {
        ProcedureBodyNode e = null;

        Token IDENT63=null;
        DeclarationsNode declarations61 = null;

        StatementSequenceNode statementsequence62 = null;


        try {
            // oberon0.g:300:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:300:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1292);
            declarations61=declarations();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:300:17: ( 'BEGIN' statementsequence )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==9) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // oberon0.g:300:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1295); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1297);
                    statementsequence62=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1301); if (state.failed) return e;
            IDENT63=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurebody1303); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new ProcedureBodyNode( declarations61, statementsequence62, (IDENT63!=null?IDENT63.getText():null));
              	
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
    // oberon0.g:306:1: formalparameters returns [ FormalParameterNode e ] : fpsection ( ';' followup= formalparameters )? ;
    public final FormalParameterNode formalparameters() throws RecognitionException {
        FormalParameterNode e = null;

        FormalParameterNode followup = null;

        FpSectionNode fpsection64 = null;


        try {
            // oberon0.g:307:2: ( fpsection ( ';' followup= formalparameters )? )
            // oberon0.g:307:4: fpsection ( ';' followup= formalparameters )?
            {
            pushFollow(FOLLOW_fpsection_in_formalparameters1322);
            fpsection64=fpsection();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:307:14: ( ';' followup= formalparameters )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==8) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // oberon0.g:307:16: ';' followup= formalparameters
                    {
                    match(input,8,FOLLOW_8_in_formalparameters1326); if (state.failed) return e;
                    pushFollow(FOLLOW_formalparameters_in_formalparameters1330);
                    followup=formalparameters();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new FormalParameterNode( fpsection64, followup );
              	
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
    // oberon0.g:313:1: fpsection returns [ FpSectionNode e ] : (ident= 'VAR' )? identlist ':' type ;
    public final FpSectionNode fpsection() throws RecognitionException {
        FpSectionNode e = null;

        Token ident=null;
        IdentListNode identlist65 = null;

        ASTnode type66 = null;


        try {
            // oberon0.g:314:2: ( (ident= 'VAR' )? identlist ':' type )
            // oberon0.g:314:4: (ident= 'VAR' )? identlist ':' type
            {
            // oberon0.g:314:4: (ident= 'VAR' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // oberon0.g:314:5: ident= 'VAR'
                    {
                    ident=(Token)match(input,14,FOLLOW_14_in_fpsection1354); if (state.failed) return e;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1358);
            identlist65=identlist();

            state._fsp--;
            if (state.failed) return e;
            match(input,36,FOLLOW_36_in_fpsection1360); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_fpsection1362);
            type66=type();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new FpSectionNode( (ident!=null?ident.getText():null), identlist65, type66 );
              	
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
        // oberon0.g:40:62: ( procedureList )
        // oberon0.g:40:62: procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred5_oberon0124);
        procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_oberon0

    // $ANTLR start synpred51_oberon0
    public final void synpred51_oberon0_fragment() throws RecognitionException {   
        ParamNode followsecond = null;


        // oberon0.g:228:4: ( '(' ( variable (followsecond= actualparametersfollowup )? )? ')' )
        // oberon0.g:228:4: '(' ( variable (followsecond= actualparametersfollowup )? )? ')'
        {
        match(input,31,FOLLOW_31_in_synpred51_oberon0971); if (state.failed) return ;
        // oberon0.g:228:8: ( variable (followsecond= actualparametersfollowup )? )?
        int alt45=2;
        int LA45_0 = input.LA(1);

        if ( (LA45_0==IDENT) ) {
            alt45=1;
        }
        switch (alt45) {
            case 1 :
                // oberon0.g:228:10: variable (followsecond= actualparametersfollowup )?
                {
                pushFollow(FOLLOW_variable_in_synpred51_oberon0975);
                variable();

                state._fsp--;
                if (state.failed) return ;
                // oberon0.g:228:19: (followsecond= actualparametersfollowup )?
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==37) ) {
                    alt44=1;
                }
                switch (alt44) {
                    case 1 :
                        // oberon0.g:228:21: followsecond= actualparametersfollowup
                        {
                        pushFollow(FOLLOW_actualparametersfollowup_in_synpred51_oberon0981);
                        followsecond=actualparametersfollowup();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        match(input,32,FOLLOW_32_in_synpred51_oberon0988); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_oberon0

    // $ANTLR start synpred55_oberon0
    public final void synpred55_oberon0_fragment() throws RecognitionException {   
        ParamNode followsecond = null;


        // oberon0.g:239:6: ( ',' variable (followsecond= actualparametersfollowup )? )
        // oberon0.g:239:6: ',' variable (followsecond= actualparametersfollowup )?
        {
        match(input,37,FOLLOW_37_in_synpred55_oberon01036); if (state.failed) return ;
        pushFollow(FOLLOW_variable_in_synpred55_oberon01038);
        variable();

        state._fsp--;
        if (state.failed) return ;
        // oberon0.g:239:19: (followsecond= actualparametersfollowup )?
        int alt47=2;
        int LA47_0 = input.LA(1);

        if ( (LA47_0==37) ) {
            alt47=1;
        }
        switch (alt47) {
            case 1 :
                // oberon0.g:239:21: followsecond= actualparametersfollowup
                {
                pushFollow(FOLLOW_actualparametersfollowup_in_synpred55_oberon01044);
                followsecond=actualparametersfollowup();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred55_oberon0

    // $ANTLR start synpred57_oberon0
    public final void synpred57_oberon0_fragment() throws RecognitionException {   
        // oberon0.g:250:45: ( elsestatement )
        // oberon0.g:250:45: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred57_oberon01095);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_oberon0

    // $ANTLR start synpred60_oberon0
    public final void synpred60_oberon0_fragment() throws RecognitionException {   
        ProcedureListNode followup = null;


        // oberon0.g:279:32: (followup= procedureList )
        // oberon0.g:279:32: followup= procedureList
        {
        pushFollow(FOLLOW_procedureList_in_synpred60_oberon01211);
        followup=procedureList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_oberon0

    // Delegated rules

    public final boolean synpred60_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_oberon0_fragment(); // can never throw exception
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
    public final boolean synpred51_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_oberon0_fragment(); // can never throw exception
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
    public final boolean synpred57_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_oberon0_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_IDENT_in_variable710 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_variable712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist746 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fieldlist748 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fieldlist750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist771 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlist775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identlistFollowUp797 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlistFollowUp799 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlistFollowUp805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence825 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence852 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence854 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment924 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment926 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall947 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters971 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_variable_in_actualparameters975 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters981 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters998 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters1002 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters1008 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup1036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variable_in_actualparametersfollowup1038 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup1056 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup1058 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement1087 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement1089 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement1091 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement1093 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement1095 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elsestatement1118 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement1120 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elsestatement1122 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1124 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elsestatement1139 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement1171 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement1175 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement1177 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement1181 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_proceduredeclaration_in_procedureList1203 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureList1205 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_procedureList_in_procedureList1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1236 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1238 = new BitSet(new long[]{0x0000200000007000L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading1259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1261 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_procedureheading1265 = new BitSet(new long[]{0x0000000100004010L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1267 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_procedureheading1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1292 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1295 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1297 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1322 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_formalparameters1326 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_formalparameters_in_formalparameters1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_fpsection1354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1358 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_fpsection1360 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_type_in_fpsection1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred5_oberon0124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred51_oberon0971 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_variable_in_synpred51_oberon0975 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_synpred51_oberon0981 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_synpred51_oberon0988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred55_oberon01036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_variable_in_synpred55_oberon01038 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_synpred55_oberon01044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred57_oberon01095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureList_in_synpred60_oberon01211 = new BitSet(new long[]{0x0000000000000002L});

}