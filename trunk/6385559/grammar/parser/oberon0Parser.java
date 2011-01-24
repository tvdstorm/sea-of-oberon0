// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-24 12:52:42

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'='", "'VAR'", "':'", "'ARRAY'", "'OF'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "'RECORD'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
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
    // oberon0.g:27:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' constants )? ( 'TYPE' ( IDENT '=' type ';' )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        ConstantNode constants3 = null;


        try {
            // oberon0.g:28:2: ( ( 'CONST' constants )? ( 'TYPE' ( IDENT '=' type ';' )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* )
            // oberon0.g:28:4: ( 'CONST' constants )? ( 'TYPE' ( IDENT '=' type ';' )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )*
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

            // oberon0.g:28:25: ( 'TYPE' ( IDENT '=' type ';' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // oberon0.g:28:26: 'TYPE' ( IDENT '=' type ';' )+
                    {
                    match(input,13,FOLLOW_13_in_declarations102); if (state.failed) return e;
                    // oberon0.g:28:33: ( IDENT '=' type ';' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // oberon0.g:28:34: IDENT '=' type ';'
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations105); if (state.failed) return e;
                    	    match(input,14,FOLLOW_14_in_declarations107); if (state.failed) return e;
                    	    pushFollow(FOLLOW_type_in_declarations109);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,8,FOLLOW_8_in_declarations111); if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:57: ( 'VAR' ( identlist ':' type ';' )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // oberon0.g:28:58: 'VAR' ( identlist ':' type ';' )+
                    {
                    match(input,15,FOLLOW_15_in_declarations118); if (state.failed) return e;
                    // oberon0.g:28:64: ( identlist ':' type ';' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IDENT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // oberon0.g:28:65: identlist ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identlist_in_declarations121);
                    	    identlist();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,16,FOLLOW_16_in_declarations123); if (state.failed) return e;
                    	    pushFollow(FOLLOW_type_in_declarations125);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,8,FOLLOW_8_in_declarations127); if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:93: ( proceduredeclaration ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==45) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // oberon0.g:28:94: proceduredeclaration ';'
            	    {
            	    pushFollow(FOLLOW_proceduredeclaration_in_declarations135);
            	    proceduredeclaration();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    match(input,8,FOLLOW_8_in_declarations137); if (state.failed) return e;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              	  e = new DeclarationsNode( constants3 );
              	
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

        Token IDENT4=null;
        ConstantNode constantFollowUp = null;

        ExpressionNode expression5 = null;


        try {
            // oberon0.g:35:2: ( ( IDENT '=' expression ';' ) (constantFollowUp= constants )? )
            // oberon0.g:35:4: ( IDENT '=' expression ';' ) (constantFollowUp= constants )?
            {
            // oberon0.g:35:4: ( IDENT '=' expression ';' )
            // oberon0.g:35:5: IDENT '=' expression ';'
            {
            IDENT4=(Token)match(input,IDENT,FOLLOW_IDENT_in_constants159); if (state.failed) return e;
            match(input,14,FOLLOW_14_in_constants161); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_constants163);
            expression5=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,8,FOLLOW_8_in_constants165); if (state.failed) return e;

            }

            // oberon0.g:35:47: (constantFollowUp= constants )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IDENT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // oberon0.g:0:0: constantFollowUp= constants
                    {
                    pushFollow(FOLLOW_constants_in_constants170);
                    constantFollowUp=constants();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ConstantNode( (IDENT4!=null?IDENT4.getText():null), expression5, constantFollowUp );
              	
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


    // $ANTLR start "type"
    // oberon0.g:41:1: type : ( IDENT | arraytype | recordtype );
    public final void type() throws RecognitionException {
        try {
            // oberon0.g:42:2: ( IDENT | arraytype | recordtype )
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
            case 36:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // oberon0.g:42:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_type185); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // oberon0.g:43:4: arraytype
                    {
                    pushFollow(FOLLOW_arraytype_in_type190);
                    arraytype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // oberon0.g:44:4: recordtype
                    {
                    pushFollow(FOLLOW_recordtype_in_type195);
                    recordtype();

                    state._fsp--;
                    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "arraytype"
    // oberon0.g:47:1: arraytype : 'ARRAY' expression 'OF' type ;
    public final void arraytype() throws RecognitionException {
        try {
            // oberon0.g:48:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:48:4: 'ARRAY' expression 'OF' type
            {
            match(input,17,FOLLOW_17_in_arraytype206); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_arraytype208);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,18,FOLLOW_18_in_arraytype210); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_arraytype212);
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
    // $ANTLR end "arraytype"


    // $ANTLR start "expression"
    // oberon0.g:51:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        SimpleExpression simpleLeft = null;

        SimpleExpression simpleRight = null;


        try {
            // oberon0.g:52:2: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // oberon0.g:52:4: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression231);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:52:32: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14||(LA10_0>=19 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:52:33: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
                    {
                    operator=(Token)input.LT(1);
                    if ( input.LA(1)==14||(input.LA(1)>=19 && input.LA(1)<=23) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression252);
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
    // oberon0.g:58:1: simpleexpression returns [ SimpleExpression e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final SimpleExpression simpleexpression() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        ASTnode specialTerm6 = null;

        SimpleExpression simpleExpressionFollowup7 = null;


        try {
            // oberon0.g:59:2: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // oberon0.g:59:4: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression273);
            specialTerm6=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:59:16: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // oberon0.g:59:18: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression287);
                    simpleExpressionFollowup7=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), specialTerm6, simpleExpressionFollowup7 );
              	
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
    // oberon0.g:65:1: specialTerm returns [ ASTnode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ASTnode specialTerm() throws RecognitionException {
        ASTnode e = null;

        Token operator=null;
        TermNode term8 = null;

        TermNode term9 = null;

        TermNode term10 = null;


        try {
            // oberon0.g:66:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case IDENT:
            case INTEGER:
            case 31:
            case 33:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // oberon0.g:66:5: operator= ( '+' ) term
                    {
                    // oberon0.g:66:14: ( '+' )
                    // oberon0.g:66:15: '+'
                    {
                    match(input,24,FOLLOW_24_in_specialTerm312); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm315);
                    term8=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term8; 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:67:5: operator= ( '-' ) term
                    {
                    // oberon0.g:67:14: ( '-' )
                    // oberon0.g:67:15: '-'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm326); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm329);
                    term9=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new MinusNode( term9 ); 
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:68:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm337);
                    term10=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term10; 
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
    // oberon0.g:71:1: simpleExpressionFollowup returns [ SimpleExpression e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final SimpleExpression simpleExpressionFollowup() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        SimpleExpression follow2 = null;

        TermNode term11 = null;


        try {
            // oberon0.g:72:2: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // oberon0.g:72:5: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup357);
            term11=term();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:72:10: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // oberon0.g:72:11: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup372);
                    follow2=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), term11, follow2 );
              	
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
    // oberon0.g:78:1: term returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? ;
    public final TermNode term() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        ASTnode factor12 = null;

        TermNode termFollowUp13 = null;


        try {
            // oberon0.g:79:2: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? )
            // oberon0.g:79:4: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_term393);
            factor12=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:79:11: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=27 && LA14_0<=30)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // oberon0.g:79:12: operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_term408);
                    termFollowUp13=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new TermNode( factor12, (operator!=null?operator.getText():null), termFollowUp13 );
              	
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
    // oberon0.g:85:1: termFollowUp returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? ;
    public final TermNode termFollowUp() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        TermNode follow2 = null;

        ASTnode factor14 = null;


        try {
            // oberon0.g:86:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? )
            // oberon0.g:86:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_termFollowUp430);
            factor14=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:86:12: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=27 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // oberon0.g:86:13: operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_termFollowUp447);
                    follow2=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new TermNode( factor14, (operator!=null?operator.getText():null), follow2 );
                
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
    // oberon0.g:92:1: factor returns [ ASTnode e ] : ( variable | number | '(' expression ')' | '~' factorOperand= factor );
    public final ASTnode factor() throws RecognitionException {
        ASTnode e = null;

        ASTnode factorOperand = null;

        VarNode variable15 = null;

        IntegerNode number16 = null;

        ExpressionNode expression17 = null;


        try {
            // oberon0.g:93:2: ( variable | number | '(' expression ')' | '~' factorOperand= factor )
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
                    // oberon0.g:93:4: variable
                    {
                    pushFollow(FOLLOW_variable_in_factor469);
                    variable15=variable();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = variable15; 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:94:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor476);
                    number16=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number16; 
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:95:4: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor483); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor485);
                    expression17=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,32,FOLLOW_32_in_factor487); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression17; 
                    }

                    }
                    break;
                case 4 :
                    // oberon0.g:96:4: '~' factorOperand= factor
                    {
                    match(input,33,FOLLOW_33_in_factor494); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor498);
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
    // oberon0.g:99:1: number returns [ IntegerNode e ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode e = null;

        Token INTEGER18=null;

        try {
            // oberon0.g:100:2: ( INTEGER )
            // oberon0.g:100:4: INTEGER
            {
            INTEGER18=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number515); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	   e = new IntegerNode( Integer.parseInt( (INTEGER18!=null?INTEGER18.getText():null) ) );
              	
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
    // oberon0.g:106:1: selector returns [ ASTnode e ] : ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? ;
    public final ASTnode selector() throws RecognitionException {
        ASTnode e = null;

        Token var=null;
        ASTnode selectorFollowup = null;

        ExpressionNode exp = null;


        try {
            // oberon0.g:107:2: ( ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )? )
            // oberon0.g:108:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
            {
            // oberon0.g:108:2: ( '.' var= IDENT selectorFollowup= selector | '[' exp= expression ']' selectorFollowup= selector )?
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
                    // oberon0.g:109:2: '.' var= IDENT selectorFollowup= selector
                    {
                    match(input,11,FOLLOW_11_in_selector541); if (state.failed) return e;
                    var=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector545); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector549);
                    selectorFollowup=selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                      	  e = new SelectorRecordNode( (var!=null?var.getText():null), selectorFollowup );
                      	
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:114:2: '[' exp= expression ']' selectorFollowup= selector
                    {
                    match(input,34,FOLLOW_34_in_selector560); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_selector564);
                    exp=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,35,FOLLOW_35_in_selector566); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_selector570);
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
    // oberon0.g:121:1: variable returns [ VarNode e ] : IDENT selector ;
    public final VarNode variable() throws RecognitionException {
        VarNode e = null;

        Token IDENT19=null;
        ASTnode selector20 = null;


        try {
            // oberon0.g:122:9: ( IDENT selector )
            // oberon0.g:122:11: IDENT selector
            {
            IDENT19=(Token)match(input,IDENT,FOLLOW_IDENT_in_variable601); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_variable603);
            selector20=selector();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

                        e = new VarNode( (IDENT19!=null?IDENT19.getText():null), selector20 );
                      
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


    // $ANTLR start "recordtype"
    // oberon0.g:128:1: recordtype : 'RECORD' fieldlist ( ';' fieldlist )* 'END' ;
    public final void recordtype() throws RecognitionException {
        try {
            // oberon0.g:129:2: ( 'RECORD' fieldlist ( ';' fieldlist )* 'END' )
            // oberon0.g:129:4: 'RECORD' fieldlist ( ';' fieldlist )* 'END'
            {
            match(input,36,FOLLOW_36_in_recordtype631); if (state.failed) return ;
            pushFollow(FOLLOW_fieldlist_in_recordtype633);
            fieldlist();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:129:23: ( ';' fieldlist )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==8) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // oberon0.g:129:24: ';' fieldlist
            	    {
            	    match(input,8,FOLLOW_8_in_recordtype636); if (state.failed) return ;
            	    pushFollow(FOLLOW_fieldlist_in_recordtype638);
            	    fieldlist();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_recordtype642); if (state.failed) return ;

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
    // $ANTLR end "recordtype"


    // $ANTLR start "fieldlist"
    // oberon0.g:132:1: fieldlist : ( identlist ':' type )? ;
    public final void fieldlist() throws RecognitionException {
        try {
            // oberon0.g:133:2: ( ( identlist ':' type )? )
            // oberon0.g:133:4: ( identlist ':' type )?
            {
            // oberon0.g:133:4: ( identlist ':' type )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // oberon0.g:133:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist655);
                    identlist();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_fieldlist657); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_fieldlist659);
                    type();

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
    // $ANTLR end "fieldlist"


    // $ANTLR start "identlist"
    // oberon0.g:136:1: identlist : IDENT ( ',' IDENT )* ;
    public final void identlist() throws RecognitionException {
        try {
            // oberon0.g:137:2: ( IDENT ( ',' IDENT )* )
            // oberon0.g:137:4: IDENT ( ',' IDENT )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_identlist673); if (state.failed) return ;
            // oberon0.g:137:10: ( ',' IDENT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // oberon0.g:137:11: ',' IDENT
            	    {
            	    match(input,37,FOLLOW_37_in_identlist676); if (state.failed) return ;
            	    match(input,IDENT,FOLLOW_IDENT_in_identlist678); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "identlist"


    // $ANTLR start "statementsequence"
    // oberon0.g:140:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement21 = null;


        try {
            // oberon0.g:141:2: ( statement (followOne= followupStatementSequence )? )
            // oberon0.g:141:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence695);
            statement21=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:141:14: (followOne= followupStatementSequence )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==8) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // oberon0.g:141:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence701);
                    followOne=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement21, followOne );
              	
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
    // oberon0.g:147:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement22 = null;


        try {
            // oberon0.g:148:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // oberon0.g:148:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence722); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence724);
            statement22=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:148:18: (followTwo= followupStatementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==8) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // oberon0.g:148:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence730);
                    followTwo=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement22, followTwo );
              	
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
    // oberon0.g:154:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // oberon0.g:155:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? )
            // oberon0.g:155:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            {
            // oberon0.g:155:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            int alt23=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==11||LA23_1==34||LA23_1==38) ) {
                        alt23=1;
                    }
                    else if ( (LA23_1==EOF||LA23_1==8||LA23_1==10||LA23_1==31||(LA23_1>=41 && LA23_1<=42)) ) {
                        alt23=2;
                    }
                    }
                    break;
                case 39:
                    {
                    alt23=3;
                    }
                    break;
                case 43:
                    {
                    alt23=4;
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // oberon0.g:155:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement754);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // oberon0.g:155:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement760);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // oberon0.g:155:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement766);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // oberon0.g:155:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement772);
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
    // oberon0.g:161:1: assignment returns [ StatementNode e ] : variable ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        VarNode variable23 = null;

        ExpressionNode expression24 = null;


        try {
            // oberon0.g:162:2: ( variable ':=' expression )
            // oberon0.g:162:4: variable ':=' expression
            {
            pushFollow(FOLLOW_variable_in_assignment794);
            variable23=variable();

            state._fsp--;
            if (state.failed) return e;
            match(input,38,FOLLOW_38_in_assignment796); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment798);
            expression24=expression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new AssignmentNode( variable23, expression24 );
              	
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
    // oberon0.g:168:1: procedurecall returns [ StatementNode e ] : IDENT ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        Token IDENT25=null;
        ParamNode actualparameters26 = null;


        try {
            // oberon0.g:169:2: ( IDENT ( actualparameters )? )
            // oberon0.g:169:4: IDENT ( actualparameters )?
            {
            IDENT25=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedurecall817); if (state.failed) return e;
            // oberon0.g:169:10: ( actualparameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // oberon0.g:169:11: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall820);
                    actualparameters26=actualparameters();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ProcedureCallNode( (IDENT25!=null?IDENT25.getText():null), actualparameters26 );
              	
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
    // oberon0.g:175:1: actualparameters returns [ ParamNode e ] : '(' ( expression (follow= actualparametersfollowup )? )? ')' ;
    public final ParamNode actualparameters() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression27 = null;


        try {
            // oberon0.g:176:2: ( '(' ( expression (follow= actualparametersfollowup )? )? ')' )
            // oberon0.g:176:4: '(' ( expression (follow= actualparametersfollowup )? )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters841); if (state.failed) return e;
            // oberon0.g:176:8: ( expression (follow= actualparametersfollowup )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=IDENT && LA26_0<=INTEGER)||(LA26_0>=24 && LA26_0<=25)||LA26_0==31||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // oberon0.g:176:10: expression (follow= actualparametersfollowup )?
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters845);
                    expression27=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    // oberon0.g:176:21: (follow= actualparametersfollowup )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==37) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // oberon0.g:176:23: follow= actualparametersfollowup
                            {
                            pushFollow(FOLLOW_actualparametersfollowup_in_actualparameters851);
                            follow=actualparametersfollowup();

                            state._fsp--;
                            if (state.failed) return e;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters858); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new ParamNode( expression27, follow );
              	
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
    // oberon0.g:182:1: actualparametersfollowup returns [ ParamNode e] : ',' expression (follow= actualparametersfollowup )? ;
    public final ParamNode actualparametersfollowup() throws RecognitionException {
        ParamNode e = null;

        ParamNode follow = null;

        ExpressionNode expression28 = null;


        try {
            // oberon0.g:183:2: ( ',' expression (follow= actualparametersfollowup )? )
            // oberon0.g:183:4: ',' expression (follow= actualparametersfollowup )?
            {
            match(input,37,FOLLOW_37_in_actualparametersfollowup877); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_actualparametersfollowup879);
            expression28=expression();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:183:19: (follow= actualparametersfollowup )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // oberon0.g:183:20: follow= actualparametersfollowup
                    {
                    pushFollow(FOLLOW_actualparametersfollowup_in_actualparametersfollowup884);
                    follow=actualparametersfollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ParamNode( expression28, follow );
              	
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
    // oberon0.g:189:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression29 = null;

        StatementSequenceNode statementsequence30 = null;

        StatementNode elsestatement31 = null;


        try {
            // oberon0.g:190:2: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // oberon0.g:190:4: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement905); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement907);
            expression29=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_ifstatement909); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement911);
            statementsequence30=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:190:45: ( elsestatement )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=41 && LA28_0<=42)) ) {
                alt28=1;
            }
            else if ( (LA28_0==10) ) {
                int LA28_2 = input.LA(2);

                if ( (synpred51_oberon0()) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement913);
                    elsestatement31=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement916); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new IfStatementNode( expression29, statementsequence30, elsestatement31 );
              	
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
    // oberon0.g:196:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression32 = null;

        StatementSequenceNode statementsequence33 = null;

        StatementSequenceNode statementsequence34 = null;


        try {
            // oberon0.g:197:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt29=1;
                }
                break;
            case 42:
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
                    // oberon0.g:197:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,41,FOLLOW_41_in_elsestatement936); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement938);
                    expression32=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,40,FOLLOW_40_in_elsestatement940); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement942);
                    statementsequence33=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement946);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression32, statementsequence33, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:201:5: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_elsestatement957); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement959);
                    statementsequence34=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence34 );
                        
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:206:3: 
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
    // oberon0.g:211:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // oberon0.g:212:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // oberon0.g:212:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement989); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement993);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,44,FOLLOW_44_in_whilestatement995); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement999);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement1001); if (state.failed) return e;
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
    // oberon0.g:218:1: proceduredeclaration : procedureheading ';' procedurebody ;
    public final void proceduredeclaration() throws RecognitionException {
        try {
            // oberon0.g:219:2: ( procedureheading ';' procedurebody )
            // oberon0.g:219:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration1016);
            procedureheading();

            state._fsp--;
            if (state.failed) return ;
            match(input,8,FOLLOW_8_in_proceduredeclaration1018); if (state.failed) return ;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration1020);
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
    // oberon0.g:222:1: procedureheading : 'PROCEDURE' IDENT ( formalparameters )? ;
    public final void procedureheading() throws RecognitionException {
        try {
            // oberon0.g:223:2: ( 'PROCEDURE' IDENT ( formalparameters )? )
            // oberon0.g:223:4: 'PROCEDURE' IDENT ( formalparameters )?
            {
            match(input,45,FOLLOW_45_in_procedureheading1032); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedureheading1034); if (state.failed) return ;
            // oberon0.g:223:22: ( formalparameters )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // oberon0.g:223:23: formalparameters
                    {
                    pushFollow(FOLLOW_formalparameters_in_procedureheading1037);
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
    // oberon0.g:226:1: procedurebody : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final void procedurebody() throws RecognitionException {
        try {
            // oberon0.g:227:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:227:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody1051);
            declarations();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:227:17: ( 'BEGIN' statementsequence )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==9) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // oberon0.g:227:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody1054); if (state.failed) return ;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody1056);
                    statementsequence();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody1060); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedurebody1062); if (state.failed) return ;

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
    // oberon0.g:230:1: formalparameters : '(' ( fpsection ( ';' fpsection )* )? ')' ;
    public final void formalparameters() throws RecognitionException {
        try {
            // oberon0.g:231:2: ( '(' ( fpsection ( ';' fpsection )* )? ')' )
            // oberon0.g:231:4: '(' ( fpsection ( ';' fpsection )* )? ')'
            {
            match(input,31,FOLLOW_31_in_formalparameters1074); if (state.failed) return ;
            // oberon0.g:231:8: ( fpsection ( ';' fpsection )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENT||LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // oberon0.g:231:9: fpsection ( ';' fpsection )*
                    {
                    pushFollow(FOLLOW_fpsection_in_formalparameters1077);
                    fpsection();

                    state._fsp--;
                    if (state.failed) return ;
                    // oberon0.g:231:19: ( ';' fpsection )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==8) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // oberon0.g:231:20: ';' fpsection
                    	    {
                    	    match(input,8,FOLLOW_8_in_formalparameters1080); if (state.failed) return ;
                    	    pushFollow(FOLLOW_fpsection_in_formalparameters1082);
                    	    fpsection();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_formalparameters1088); if (state.failed) return ;

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
    // oberon0.g:234:1: fpsection : ( 'VAR' )? identlist ':' type ;
    public final void fpsection() throws RecognitionException {
        try {
            // oberon0.g:235:2: ( ( 'VAR' )? identlist ':' type )
            // oberon0.g:235:4: ( 'VAR' )? identlist ':' type
            {
            // oberon0.g:235:4: ( 'VAR' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==15) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // oberon0.g:235:5: 'VAR'
                    {
                    match(input,15,FOLLOW_15_in_fpsection1100); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection1104);
            identlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,16,FOLLOW_16_in_fpsection1106); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_fpsection1108);
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

    // $ANTLR start synpred51_oberon0
    public final void synpred51_oberon0_fragment() throws RecognitionException {   
        // oberon0.g:190:45: ( elsestatement )
        // oberon0.g:190:45: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred51_oberon0913);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_oberon0

    // Delegated rules

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


 

    public static final BitSet FOLLOW_7_in_module52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module56 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module58 = new BitSet(new long[]{0x000020000000B600L});
    public static final BitSet FOLLOW_declarations_in_module60 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module63 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module65 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_constants_in_declarations97 = new BitSet(new long[]{0x000020000000A002L});
    public static final BitSet FOLLOW_13_in_declarations102 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations105 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_declarations107 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations109 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations111 = new BitSet(new long[]{0x0000200000008012L});
    public static final BitSet FOLLOW_15_in_declarations118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_declarations121 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_declarations123 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations125 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations127 = new BitSet(new long[]{0x0000200000000012L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declarations135 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations137 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_constants159 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_constants161 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_constants163 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_constants165 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_constants_in_constants170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arraytype206 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_arraytype208 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arraytype210 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_arraytype212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression231 = new BitSet(new long[]{0x0000000000F84002L});
    public static final BitSet FOLLOW_set_in_expression236 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialTerm_in_simpleexpression273 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression279 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_specialTerm312 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm326 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup357 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleExpressionFollowup362 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term393 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term398 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_term408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_termFollowUp430 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_termFollowUp435 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_termFollowUp447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_factor469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor483 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor485 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor494 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector545 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_selector560 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector564 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector566 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_selector570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_variable601 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_variable603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_recordtype631 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype633 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_recordtype636 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype638 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_recordtype642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist655 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldlist657 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fieldlist659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist673 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identlist676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlist678 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence695 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence722 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence724 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment794 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment796 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall817 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters841 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters845 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparameters851 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_actualparametersfollowup877 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparametersfollowup879 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_actualparametersfollowup_in_actualparametersfollowup884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement905 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement907 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement909 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement911 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement913 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elsestatement936 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement938 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elsestatement940 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement942 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elsestatement957 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement989 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement993 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement995 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement999 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration1016 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration1018 = new BitSet(new long[]{0x000020000000B600L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading1032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading1034 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody1051 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody1054 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody1056 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody1060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_formalparameters1074 = new BitSet(new long[]{0x0000000100008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1077 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_8_in_formalparameters1080 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters1082 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_32_in_formalparameters1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fpsection1100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection1104 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fpsection1106 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fpsection1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred51_oberon0913 = new BitSet(new long[]{0x0000000000000002L});

}