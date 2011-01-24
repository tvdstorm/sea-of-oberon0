// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-24 15:17:21

  package parser;
  
  import ASTnodes.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "':'", "'='", "'ARRAY'", "'OF'", "'RECORD'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
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



    // $ANTLR start "module"
    // oberon0.g:20:1: module returns [ ModuleNode e ] : 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' ;
    public final ModuleNode module() throws RecognitionException {
        ModuleNode e = null;

        Token ind1=null;
        Token ind2=null;
        DeclarationsNode declarations1 = null;

        StatementSequenceNode statementsequence2 = null;


        try {
            // oberon0.g:21:2: ( 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.' )
            // oberon0.g:21:4: 'MODULE' ind1= IDENT ';' declarations ( 'BEGIN' statementsequence )? 'END' ind2= IDENT '.'
            {
            match(input,7,FOLLOW_7_in_module52); if (state.failed) return e;
            ind1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module56); if (state.failed) return e;
            match(input,8,FOLLOW_8_in_module58); if (state.failed) return e;
            pushFollow(FOLLOW_declarations_in_module60);
            declarations1=declarations();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:21:41: ( 'BEGIN' statementsequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==9) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // oberon0.g:21:42: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_module63); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_module65);
                    statementsequence2=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_module69); if (state.failed) return e;
            ind2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module73); if (state.failed) return e;
            match(input,11,FOLLOW_11_in_module75); if (state.failed) return e;
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
    // oberon0.g:27:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;

        TypeDefNode typeDefs4 = null;


        try {
            // oberon0.g:28:2: ( ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* )
            // oberon0.g:28:4: ( 'CONST' constants )? ( 'TYPE' typeDefs )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )*
            {
            // oberon0.g:28:4: ( 'CONST' constants )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // oberon0.g:28:5: 'CONST' constants
                    {
                    match(input,12,FOLLOW_12_in_declarations95); if (state.failed) return e;
                    pushFollow(FOLLOW_constants_in_declarations97);
                    constants3=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // oberon0.g:28:25: ( 'TYPE' typeDefs )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // oberon0.g:28:26: 'TYPE' typeDefs
                    {
                    match(input,13,FOLLOW_13_in_declarations102); if (state.failed) return e;
                    pushFollow(FOLLOW_typeDefs_in_declarations104);
                    typeDefs4=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            // oberon0.g:28:44: ( 'VAR' ( identlist ':' type ';' )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // oberon0.g:28:45: 'VAR' ( identlist ':' type ';' )+
                    {
                    match(input,14,FOLLOW_14_in_declarations109); if (state.failed) return e;
                    // oberon0.g:28:51: ( identlist ':' type ';' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // oberon0.g:28:52: identlist ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identlist_in_declarations112);
                    	    identlist();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,15,FOLLOW_15_in_declarations114); if (state.failed) return e;
                    	    pushFollow(FOLLOW_type_in_declarations116);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,8,FOLLOW_8_in_declarations118); if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:80: ( proceduredeclaration ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==45) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // oberon0.g:28:81: proceduredeclaration ';'
            	    {
            	    pushFollow(FOLLOW_proceduredeclaration_in_declarations126);
            	    proceduredeclaration();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    match(input,8,FOLLOW_8_in_declarations128); if (state.failed) return e;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              	  e = new DeclarationsNode( constants3, typeDefs4 );
              	
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
    // oberon0.g:34:1: constants returns [ ConstantNode e ] : ( IDENT '=' expression ';' ) (constantFollowUp= constants )? ;
    public final ConstantNode constants() throws RecognitionException {
        ConstantNode e = null;

        Token IDENT5=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression6 = null;


        try {
            // oberon0.g:35:2: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // oberon0.g:35:4: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // oberon0.g:35:4: ( IDENT '=' expression ';' )
            // oberon0.g:35:5: IDENT '=' expression ';'
            {
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants150); if (state.failed) return e;
            match(input,16,FOLLOW_16_in_constants152); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants154);
            expression6=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants156); if (state.failed) return e;

            }

            // oberon0.g:35:47: (constantFollowUp= constants )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==IDENT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // oberon0.g:0:0: constantFollowUp= constants
                    {
                    pushFollow(FOLLOW_constants_in_constants161);
                    constantFollowUp=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ConstantNode( (IDENT5!=null?IDENT5.getText():null), expression6, constantFollowUp );
              	
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
    // oberon0.g:41:1: typeDefs returns [ TypeDefNode e ] : ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? ;
    public final TypeDefNode typeDefs() throws RecognitionException {
        TypeDefNode e = null;

        Token IDENT7=null;
        TypeDefNode typeDefsFollowUp = null;

        ASTnode type8 = null;


        try {
            // oberon0.g:42:2: ( ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )? )
            // oberon0.g:42:4: ( IDENT '=' type ';' ) (typeDefsFollowUp= typeDefs )?
            {
            // oberon0.g:42:4: ( IDENT '=' type ';' )
            // oberon0.g:42:5: IDENT '=' type ';'
            {
            IDENT7=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDefs181); if (state.failed) return e;
            match(input,16,FOLLOW_16_in_typeDefs183); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_typeDefs185);
            type8=type();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_typeDefs187); if (state.failed) return e;

            }

            // oberon0.g:42:41: (typeDefsFollowUp= typeDefs )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // oberon0.g:0:0: typeDefsFollowUp= typeDefs
                    {
                    pushFollow(FOLLOW_typeDefs_in_typeDefs192);
                    typeDefsFollowUp=typeDefs();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new TypeDefNode( (IDENT7!=null?IDENT7.getText():null), type8, typeDefsFollowUp );
              	
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
    // oberon0.g:48:1: type returns [ ASTnode e ] : ( IDENT | arraytype | recordtype );
    public final ASTnode type() throws RecognitionException {
        ASTnode e = null;

        Token IDENT9=null;
        ArrayNode arraytype10 = null;

        RecordNode recordtype11 = null;


        try {
            // oberon0.g:49:2: ( IDENT | arraytype | recordtype )
            int alt9=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // oberon0.g:49:4: IDENT
                    {
                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_type211); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new TypeNode( (IDENT9!=null?IDENT9.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:50:4: arraytype
                    {
                    pushFollow(FOLLOW_arraytype_in_type218);
                    arraytype10=arraytype();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = arraytype10; 
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:51:4: recordtype
                    {
                    pushFollow(FOLLOW_recordtype_in_type225);
                    recordtype11=recordtype();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = recordtype11; 
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
    // oberon0.g:54:1: arraytype returns [ ArrayNode e ] : 'ARRAY' expression 'OF' type ;
    public final ArrayNode arraytype() throws RecognitionException {
        ArrayNode e = null;

        ExpressionNode expression12 = null;

        ASTnode type13 = null;


        try {
            // oberon0.g:55:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:55:4: 'ARRAY' expression 'OF' type
            {
            match(input,17,FOLLOW_17_in_arraytype242); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_arraytype244);
            expression12=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,18,FOLLOW_18_in_arraytype246); if (state.failed) return e;
            pushFollow(FOLLOW_type_in_arraytype248);
            type13=type();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new ArrayNode( expression12, type13 );
              	
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
    // oberon0.g:61:1: recordtype returns [ RecordNode e ] : 'RECORD' fields 'END' ;
    public final RecordNode recordtype() throws RecognitionException {
        RecordNode e = null;

        FieldsNode fields14 = null;


        try {
            // oberon0.g:62:2: ( 'RECORD' fields 'END' )
            // oberon0.g:62:4: 'RECORD' fields 'END'
            {
            match(input,19,FOLLOW_19_in_recordtype267); if (state.failed) return e;
            pushFollow(FOLLOW_fields_in_recordtype269);
            fields14=fields();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_recordtype271); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new RecordNode( fields14 );
              	
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
    // oberon0.g:68:1: fields returns [ FieldsNode e ] : fieldlist ( fieldsFollowup )? ;
    public final FieldsNode fields() throws RecognitionException {
        FieldsNode e = null;

        FieldlistNode fieldlist15 = null;

        FieldsNode fieldsFollowup16 = null;


        try {
            // oberon0.g:69:2: ( fieldlist ( fieldsFollowup )? )
            // oberon0.g:69:4: fieldlist ( fieldsFollowup )?
            {
            pushFollow(FOLLOW_fieldlist_in_fields290);
            fieldlist15=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:69:14: ( fieldsFollowup )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==8) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:69:15: fieldsFollowup
                    {
                    pushFollow(FOLLOW_fieldsFollowup_in_fields293);
                    fieldsFollowup16=fieldsFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new FieldsNode( fieldlist15, fieldsFollowup16 );
              	
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
    // oberon0.g:75:1: fieldsFollowup returns [ FieldsNode e ] : ';' fieldlist (followup= fieldsFollowup )? ;
    public final FieldsNode fieldsFollowup() throws RecognitionException {
        FieldsNode e = null;

        FieldsNode followup = null;

        FieldlistNode fieldlist17 = null;


        try {
            // oberon0.g:76:2: ( ';' fieldlist (followup= fieldsFollowup )? )
            // oberon0.g:76:4: ';' fieldlist (followup= fieldsFollowup )?
            {
            match(input,8,FOLLOW_8_in_fieldsFollowup313); if (state.failed) return e;
            pushFollow(FOLLOW_fieldlist_in_fieldsFollowup315);
            fieldlist17=fieldlist();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:76:18: (followup= fieldsFollowup )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==8) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // oberon0.g:76:19: followup= fieldsFollowup
                    {
                    pushFollow(FOLLOW_fieldsFollowup_in_fieldsFollowup320);
                    followup=fieldsFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new FieldsNode( fieldlist17, followup );
                      
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
    // oberon0.g:82:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        SimpleExpression simpleLeft = null;

        SimpleExpression simpleRight = null;


        try {
            // oberon0.g:83:2: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // oberon0.g:83:4: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression344);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:83:32: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16||(LA12_0>=20 && LA12_0<=24)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // oberon0.g:83:33: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
                    {
                    operator=(Token)input.LT(1);
                    if ( input.LA(1)==16||(input.LA(1)>=20 && input.LA(1)<=24) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression365);
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
    // oberon0.g:89:1: simpleexpression returns [ SimpleExpression e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final SimpleExpression simpleexpression() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        ASTnode specialTerm18 = null;

        SimpleExpression simpleExpressionFollowup19 = null;


        try {
            // oberon0.g:90:2: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // oberon0.g:90:4: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression386);
            specialTerm18=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:90:16: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=25 && LA13_0<=27)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // oberon0.g:90:18: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
                    {
                    operator=(Token)input.LT(1);
                    if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression400);
                    simpleExpressionFollowup19=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), specialTerm18, simpleExpressionFollowup19 );
              	
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
    // oberon0.g:96:1: specialTerm returns [ ASTnode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ASTnode specialTerm() throws RecognitionException {
        ASTnode e = null;

        Token operator=null;
        TermNode term20 = null;

        TermNode term21 = null;

        TermNode term22 = null;


        try {
            // oberon0.g:97:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case IDENT:
            case INTEGER:
            case 32:
            case 34:
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
                    // oberon0.g:97:5: operator= ( '+' ) term
                    {
                    // oberon0.g:97:14: ( '+' )
                    // oberon0.g:97:15: '+'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm425); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm428);
                    term20=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term20; 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:98:5: operator= ( '-' ) term
                    {
                    // oberon0.g:98:14: ( '-' )
                    // oberon0.g:98:15: '-'
                    {
                    match(input,26,FOLLOW_26_in_specialTerm439); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm442);
                    term21=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new MinusNode( term21 ); 
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:99:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm450);
                    term22=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term22; 
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
    // oberon0.g:102:1: simpleExpressionFollowup returns [ SimpleExpression e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final SimpleExpression simpleExpressionFollowup() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        SimpleExpression follow2 = null;

        TermNode term23 = null;


        try {
            // oberon0.g:103:2: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // oberon0.g:103:5: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup470);
            term23=term();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:103:10: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=25 && LA15_0<=27)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // oberon0.g:103:11: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
                    {
                    operator=(Token)input.LT(1);
                    if ( (input.LA(1)>=25 && input.LA(1)<=27) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup485);
                    follow2=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), term23, follow2 );
              	
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
    // oberon0.g:109:1: term returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? ;
    public final TermNode term() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        ASTnode factor24 = null;

        TermNode termFollowUp25 = null;


        try {
            // oberon0.g:110:2: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? )
            // oberon0.g:110:4: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_term506);
            factor24=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:110:11: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=28 && LA16_0<=31)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // oberon0.g:110:12: operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp
                    {
                    operator=(Token)input.LT(1);
                    if ( (input.LA(1)>=28 && input.LA(1)<=31) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_termFollowUp_in_term521);
                    termFollowUp25=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new TermNode( factor24, (operator!=null?operator.getText():null), termFollowUp25 );
              	
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
    // oberon0.g:116:1: termFollowUp returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? ;
    public final TermNode termFollowUp() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        TermNode follow2 = null;

        ASTnode factor26 = null;


        try {
            // oberon0.g:117:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? )
            // oberon0.g:117:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_termFollowUp543);
            factor26=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:117:12: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=28 && LA17_0<=31)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // oberon0.g:117:13: operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp
                    {
                    operator=(Token)input.LT(1);
                    if ( (input.LA(1)>=28 && input.LA(1)<=31) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_termFollowUp_in_termFollowUp560);
                    follow2=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new TermNode( factor26, (operator!=null?operator.getText():null), follow2 );
                
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
    // oberon0.g:123:1: factor returns [ ASTnode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ASTnode factor() throws RecognitionException {
        ASTnode e = null;

        ASTnode factorOperand = null;

        VarNode variable27 = null;

        IntegerNode number28 = null;

        ExpressionNode expression29 = null;


        try {
            // oberon0.g:124:2: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
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
            case 32:
                {
                alt18=3;
                }
                break;
            case 34:
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
                    // oberon0.g:124:4: variable
                    {
                    pushFollow(FOLLOW_variable_in_factor582);
                    variable27=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = variable27; 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:125:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor589);
                    number28=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number28; 
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:126:4: '(' expression ')'
                    {
                    match(input,32,FOLLOW_32_in_factor596); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor598);
                    expression29=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,33,FOLLOW_33_in_factor600); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression29; 
                    }

                    }
                    break;
                case 4 :
                    // oberon0.g:127:4: '~' factorOperand= factor
                    {
                    match(input,34,FOLLOW_34_in_factor607); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor611);
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
    // oberon0.g:130:1: number returns [ IntegerNode e ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode e = null;

        Token INTEGER30=null;

        try {
            // oberon0.g:131:2: ( INTEGER )
            // oberon0.g:131:4: INTEGER
            {
            INTEGER30=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number628); if (state.failed) return e;
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
    // oberon0.g:137:1: selector returns [ ASTnode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final ASTnode selector() throws RecognitionException {
        ASTnode e = null;

        Token var=null;
        ASTnode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // oberon0.g:138:2: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // oberon0.g:139:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // oberon0.g:139:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==11) ) {
                alt19=1;
            }
            else if ( (LA19_0==35) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // oberon0.g:140:2: '.' var= IDENT selectorFollowup= selector
                    {
                    match(input,11,FOLLOW_11_in_selector654); if (state.failed) return e;
                    var=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector658); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector662);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                      	  e = new SelectorRecordNode( (var!=null?var.getText():null), selectorFollowup );
                      	
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:145:2: '[' exp= expression ']' selectorFollowup= selector
                    {
                    match(input,35,FOLLOW_35_in_selector673); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_selector677);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,36,FOLLOW_36_in_selector679); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector683);
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
    // oberon0.g:152:1: variable returns [ VarNode e ] : IDENT selector ;
    public final VarNode variable() throws RecognitionException {
        VarNode e = null;

        Token IDENT31=null;
        ASTnode selector32 = null;


        try {
            // oberon0.g:153:9: ( IDENT selector )
            // oberon0.g:153:11: IDENT selector
            {
            IDENT31=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable714); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable716);
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
    // oberon0.g:159:1: fieldlist returns [ FieldlistNode e ] : ( identlist ':' type )? ;
    public final FieldlistNode fieldlist() throws RecognitionException {
        FieldlistNode e = null;

        IdentListNode identlist33 = null;

        ASTnode type34 = null;


        try {
            // oberon0.g:160:2: ( ( identlist ':' type )? )
            // oberon0.g:160:4: ( identlist ':' type )?
            {
            // oberon0.g:160:4: ( identlist ':' type )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // oberon0.g:160:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist750);
                    identlist33=identlist();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,15,FOLLOW_15_in_fieldlist752); if (state.failed) return e;
                    pushFollow(FOLLOW_type_in_fieldlist754);
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
    // oberon0.g:166:1: identlist returns [ IdentListNode e ] : IDENT ( identlistFollowUp )? ;
    public final IdentListNode identlist() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT35=null;
        IdentListNode identlistFollowUp36 = null;


        try {
            // oberon0.g:167:2: ( IDENT ( identlistFollowUp )? )
            // oberon0.g:167:4: IDENT ( identlistFollowUp )?
            {
            IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlist775); if (state.failed) return e;
            // oberon0.g:167:10: ( identlistFollowUp )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // oberon0.g:167:12: identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlist779);
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
    // oberon0.g:173:1: identlistFollowUp returns [ IdentListNode e ] : ',' IDENT (followup= identlistFollowUp )? ;
    public final IdentListNode identlistFollowUp() throws RecognitionException {
        IdentListNode e = null;

        Token IDENT37=null;
        IdentListNode followup = null;


        try {
            // oberon0.g:174:2: ( ',' IDENT (followup= identlistFollowUp )? )
            // oberon0.g:174:4: ',' IDENT (followup= identlistFollowUp )?
            {
            match(input,37,FOLLOW_37_in_identlistFollowUp801); if (state.failed) return e;
            IDENT37=(Token)match(input,IDENT,FOLLOW_IDENT_in_identlistFollowUp803); if (state.failed) return e;
            // oberon0.g:174:14: (followup= identlistFollowUp )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // oberon0.g:174:16: followup= identlistFollowUp
                    {
                    pushFollow(FOLLOW_identlistFollowUp_in_identlistFollowUp809);
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
    // oberon0.g:180:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement38 = null;


        try {
            // oberon0.g:181:2: ( statement (followOne= followupStatementSequence )? )
            // oberon0.g:181:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence829);
            statement38=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:181:14: (followOne= followupStatementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==8) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // oberon0.g:181:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence835);
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
    // oberon0.g:187:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement39 = null;


        try {
            // oberon0.g:188:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // oberon0.g:188:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence856); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence858);
            statement39=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:188:18: (followTwo= followupStatementSequence )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==8) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // oberon0.g:188:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence864);
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
    // oberon0.g:194:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // oberon0.g:195:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? )
            // oberon0.g:195:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            {
            // oberon0.g:195:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            int alt25=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==11||LA25_1==35||LA25_1==38) ) {
                        alt25=1;
                    }
                    else if ( (LA25_1==EOF||LA25_1==8||LA25_1==10||LA25_1==32||(LA25_1>=41 && LA25_1<=42)) ) {
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
                    // oberon0.g:195:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement888);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // oberon0.g:195:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement894);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // oberon0.g:195:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement900);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // oberon0.g:195:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement906);
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
    // oberon0.g:201:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        VarNode variable40 = null;

        ExpressionNode expression41 = null;


        try {
            // oberon0.g:202:2: ( variable ':=' expression )
            // oberon0.g:202:4: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment928);
            variable40=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,38,FOLLOW_38_in_assignment930); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment932);
            expression41=expression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new AssignmentNode( variable40, expression41 );
              	
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
    // oberon0.g:208:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT42=null;
        ParamNode actualparameters43 = null;


        try {
            // oberon0.g:209:2: ( IDENT ( actualparameters )? )
            // oberon0.g:209:4: IDENT ( actualparameters )?
            {
            IDENT42=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall951); if (state.failed) return e;
            // oberon0.g:209:10: ( actualparameters )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // oberon0.g:209:11: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall954);
                    actualparameters43=actualparameters();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ProcedureCallNode( (IDENT42!=null?IDENT42.getText():null), actualparameters43 );
              	
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
    // oberon0.g:215:1: actualparameters returns [ ParamNode e ] : '(' ( expression (follow= actualparametersfollowup )? )? ')' ;
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression44 = null;


        try {
            // oberon0.g:216:2: ( '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            // oberon0.g:216:4: '(' ( expression (follow= actualparametersfollowup )? )? ')'
            {
            match(input,32,FOLLOW_32_in_actualparameters975); if (state.failed) return e;
            // oberon0.g:216:8: ( expression (follow= actualparametersfollowup )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=IDENT && LA28_0<=INTEGER)||(LA28_0>=25 && LA28_0<=26)||LA28_0==32||LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // oberon0.g:216:10: expression (follow= actualparametersfollowup )?
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters979);
                    expression44=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // oberon0.g:216:21: (follow= actualparametersfollowup )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==37) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // oberon0.g:216:23: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters985);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_actualparameters992); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new ParamNode( expression44, follow );
              	
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
    // oberon0.g:222:1: actualparametersfollowup returns [ ParamNode e] : ',' expression (follow= actualparametersfollowup )? ;
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression45 = null;


        try {
            // oberon0.g:223:2: ( ',' expression (follow= actualparametersfollowup )? )
            // oberon0.g:223:4: ',' expression (follow= actualparametersfollowup )?
            {
            match(input,37,FOLLOW_37_in_actualparametersfollowup1011); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_actualparametersfollowup1013);
            expression45=expression();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:223:19: (follow= actualparametersfollowup )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // oberon0.g:223:20: follow= actualparametersfollowup
                    {
                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup1018);
                    follow=actualparametersfollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ParamNode( expression45, follow );
              	
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
    // oberon0.g:229:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression46 = null;

        StatementSequenceNode statementsequence47 = null;

        StatementNode elsestatement48 = null;


        try {
            // oberon0.g:230:2: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // oberon0.g:230:4: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement1039); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement1041);
            expression46=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_ifstatement1043); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement1045);
            statementsequence47=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:230:45: ( elsestatement )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=41 && LA30_0<=42)) ) {
                alt30=1;
            }
            else if ( (LA30_0==10) ) {
                int LA30_2 = input.LA(2);

                if ( (synpred53_oberon0()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement1047);
                    elsestatement48=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement1050); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new IfStatementNode( expression46, statementsequence47, elsestatement48 );
              	
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
    // oberon0.g:236:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression49 = null;

        StatementSequenceNode statementsequence50 = null;

        StatementSequenceNode statementsequence51 = null;


        try {
            // oberon0.g:237:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
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
                    // oberon0.g:237:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,41,FOLLOW_41_in_elsestatement1070); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement1072);
                    expression49=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,40,FOLLOW_40_in_elsestatement1074); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1076);
                    statementsequence50=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement1080);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression49, statementsequence50, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:241:5: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_elsestatement1091); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement1093);
                    statementsequence51=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence51 );
                        
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:246:3: 
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
    // oberon0.g:251:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // oberon0.g:252:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // oberon0.g:252:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement1123); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement1127);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,44,FOLLOW_44_in_whilestatement1129); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement1133);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1135); if (state.failed) return e;
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


    // $ANTLR start "proceduredeclaration"
    // oberon0.g:258:1: proceduredeclaration : procedureheading ';' procedurebody ;
    public final void proceduredeclaration() throws RecognitionException {
        try {
            // oberon0.g:259:2: ( procedureheading ';' procedurebody )
            // oberon0.g:259:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1150);
            procedureheading();

            state._fsp--;
            if (state.failed) return ;
            match(input,8,FOLLOW_8_in_proceduredeclaration1152); if (state.failed) return ;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1154);
            procedurebody();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "proceduredeclaration"


    // $ANTLR start "procedureheading"
    // oberon0.g:262:1: procedureheading : 'PROCEDURE' IDENT ( formalparameters )? ;
    public final void procedureheading() throws RecognitionException {
        try {
            // oberon0.g:263:2: ( 'PROCEDURE' IDENT ( formalparameters )? )
            // oberon0.g:263:4: 'PROCEDURE' IDENT ( formalparameters )?
            {
            match(input,45,FOLLOW_45_in_procedureheading1166); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedureheading1168); if (state.failed) return ;
            // oberon0.g:263:22: ( formalparameters )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // oberon0.g:263:23: formalparameters
                    {
                    pushFollow(FOLLOW_formalparameters_in_procedureheading1171);
                    formalparameters();

                    state._fsp--;
                    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "procedureheading"


    // $ANTLR start "procedurebody"
    // oberon0.g:266:1: procedurebody : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final void procedurebody() throws RecognitionException {
        try {
            // oberon0.g:267:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:267:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1185);
            declarations();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:267:17: ( 'BEGIN' statementsequence )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==9) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // oberon0.g:267:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1188); if (state.failed) return ;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1190);
                    statementsequence();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1194); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedurebody1196); if (state.failed) return ;

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
    // $ANTLR end "procedurebody"


    // $ANTLR start "formalparameters"
    // oberon0.g:270:1: formalparameters : '(' ( fpsection ( ';' fpsection )* )? ')' ;
    public final void formalparameters() throws RecognitionException {
        try {
            // oberon0.g:271:2: ( '(' ( fpsection ( ';' fpsection )* )? ')' )
            // oberon0.g:271:4: '(' ( fpsection ( ';' fpsection )* )? ')'
            {
            match(input,32,FOLLOW_32_in_formalparameters1208); if (state.failed) return ;
            // oberon0.g:271:8: ( fpsection ( ';' fpsection )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IDENT||LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // oberon0.g:271:9: fpsection ( ';' fpsection )*
                    {
                    pushFollow(FOLLOW_fpsection_in_formalparameters1211);
                    fpsection();

                    state._fsp--;
                    if (state.failed) return ;
                    // oberon0.g:271:19: ( ';' fpsection )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==8) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // oberon0.g:271:20: ';' fpsection
                    	    {
                    	    match(input,8,FOLLOW_8_in_formalparameters1214); if (state.failed) return ;
                    	    pushFollow(FOLLOW_fpsection_in_formalparameters1216);
                    	    fpsection();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,33,FOLLOW_33_in_formalparameters1222); if (state.failed) return ;

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
    // $ANTLR end "formalparameters"


    // $ANTLR start "fpsection"
    // oberon0.g:274:1: fpsection : ( 'VAR' )? identlist ':' type ;
    public final void fpsection() throws RecognitionException {
        try {
            // oberon0.g:275:2: ( ( 'VAR' )? identlist ':' type )
            // oberon0.g:275:4: ( 'VAR' )? identlist ':' type
            {
            // oberon0.g:275:4: ( 'VAR' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // oberon0.g:275:5: 'VAR'
                    {
                    match(input,14,FOLLOW_14_in_fpsection1234); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1238);
            identlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,15,FOLLOW_15_in_fpsection1240); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_fpsection1242);
            type();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "fpsection"

    // $ANTLR start synpred53_oberon0
    public final void synpred53_oberon0_fragment() throws RecognitionException {   
        // oberon0.g:230:45: ( elsestatement )
        // oberon0.g:230:45: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred53_oberon01047);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_oberon0

    // Delegated rules

    public final boolean synpred53_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_7_in_module52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module56 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module58 = new BitSet(new long[]{0x0000200000007600L});
    public static final BitSet FOLLOW_declarations_in_module60 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module63 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module65 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_constants_in_declarations97 = new BitSet(new long[]{0x0000200000006002L});
    public static final BitSet FOLLOW_13_in_declarations102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_typeDefs_in_declarations104 = new BitSet(new long[]{0x0000200000004002L});
    public static final BitSet FOLLOW_14_in_declarations109 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_declarations112 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_declarations114 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_type_in_declarations116 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations118 = new BitSet(new long[]{0x0000200000000012L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declarations126 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations128 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_constants150 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_constants152 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_constants154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_constants156 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_constants_in_constants161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_typeDefs181 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_typeDefs183 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_type_in_typeDefs185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_typeDefs187 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_typeDefs_in_typeDefs192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arraytype242 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_arraytype244 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arraytype246 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_type_in_arraytype248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_recordtype267 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fields_in_recordtype269 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_recordtype271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldlist_in_fields290 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_fieldsFollowup_in_fields293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_fieldsFollowup313 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_fieldlist_in_fieldsFollowup315 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_fieldsFollowup_in_fieldsFollowup320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression344 = new BitSet(new long[]{0x0000000001F10002L});
    public static final BitSet FOLLOW_set_in_expression349 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialTerm_in_simpleexpression386 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression392 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm425 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_term_in_specialTerm428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_specialTerm439 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_term_in_specialTerm442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup470 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_set_in_simpleExpressionFollowup475 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term506 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_set_in_term511 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_termFollowUp_in_term521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_termFollowUp543 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_set_in_termFollowUp548 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_termFollowUp_in_termFollowUp560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_factor596 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_factor598 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_factor600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_factor607 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_factor_in_factor611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector658 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_selector_in_selector662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_selector673 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_selector677 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_selector679 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_selector_in_selector683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable714 = new BitSet(new long[]{0x0000000800000800L});
    public static final BitSet FOLLOW_selector_in_variable716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist750 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_fieldlist752 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_type_in_fieldlist754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist775 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlist779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identlistFollowUp801 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlistFollowUp803 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_identlistFollowUp_in_identlistFollowUp809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence829 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence856 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence858 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment928 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment930 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_assignment932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall951 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_actualparameters975 = new BitSet(new long[]{0x0000000706000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters979 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters985 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_actualparameters992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup1011 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup1013 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement1039 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement1041 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement1043 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement1045 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement1047 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elsestatement1070 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement1072 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elsestatement1074 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1076 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elsestatement1091 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement1123 = new BitSet(new long[]{0x0000000506000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement1127 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement1129 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement1133 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1150 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1152 = new BitSet(new long[]{0x0000200000007600L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading1166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1168 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1185 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1188 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1190 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_formalparameters1208 = new BitSet(new long[]{0x0000000200004010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1211 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_8_in_formalparameters1214 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1216 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_33_in_formalparameters1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_fpsection1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1238 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_fpsection1240 = new BitSet(new long[]{0x00000000000A0010L});
    public static final BitSet FOLLOW_type_in_fpsection1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred53_oberon01047 = new BitSet(new long[]{0x0000000000000002L});

}