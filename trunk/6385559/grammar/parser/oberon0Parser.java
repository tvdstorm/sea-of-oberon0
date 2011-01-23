// $ANTLR 3.3 Nov 30, 2010 12:45:30 oberon0.g 2011-01-23 21:56:16

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENT", "INTEGER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'='", "'TYPE'", "'VAR'", "':'", "'ARRAY'", "'OF'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'('", "')'", "'~'", "'['", "']'", "'RECORD'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'PROCEDURE'"
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
    // oberon0.g:27:1: declarations returns [ DeclarationsNode e ] : ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* ;
    public final DeclarationsNode declarations() throws RecognitionException {
        DeclarationsNode e = null;

        try {
            // oberon0.g:28:2: ( ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )* )
            // oberon0.g:28:4: ( 'CONST' ( IDENT '=' expression ';' )+ )? ( 'TYPE' ( IDENT '=' type )+ )? ( 'VAR' ( identlist ':' type ';' )+ )? ( proceduredeclaration ';' )*
            {
            // oberon0.g:28:4: ( 'CONST' ( IDENT '=' expression ';' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // oberon0.g:28:5: 'CONST' ( IDENT '=' expression ';' )+
                    {
                    match(input,12,FOLLOW_12_in_declarations95); if (state.failed) return e;
                    // oberon0.g:28:13: ( IDENT '=' expression ';' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // oberon0.g:28:14: IDENT '=' expression ';'
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations98); if (state.failed) return e;
                    	    match(input,13,FOLLOW_13_in_declarations100); if (state.failed) return e;
                    	    pushFollow(FOLLOW_expression_in_declarations102);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,8,FOLLOW_8_in_declarations104); if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:43: ( 'TYPE' ( IDENT '=' type )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // oberon0.g:28:44: 'TYPE' ( IDENT '=' type )+
                    {
                    match(input,14,FOLLOW_14_in_declarations111); if (state.failed) return e;
                    // oberon0.g:28:51: ( IDENT '=' type )+
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
                    	    // oberon0.g:28:52: IDENT '=' type
                    	    {
                    	    match(input,IDENT,FOLLOW_IDENT_in_declarations114); if (state.failed) return e;
                    	    match(input,13,FOLLOW_13_in_declarations116); if (state.failed) return e;
                    	    pushFollow(FOLLOW_type_in_declarations118);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return e;

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

            // oberon0.g:28:71: ( 'VAR' ( identlist ':' type ';' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // oberon0.g:28:72: 'VAR' ( identlist ':' type ';' )+
                    {
                    match(input,15,FOLLOW_15_in_declarations125); if (state.failed) return e;
                    // oberon0.g:28:78: ( identlist ':' type ';' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // oberon0.g:28:79: identlist ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identlist_in_declarations128);
                    	    identlist();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,16,FOLLOW_16_in_declarations130); if (state.failed) return e;
                    	    pushFollow(FOLLOW_type_in_declarations132);
                    	    type();

                    	    state._fsp--;
                    	    if (state.failed) return e;
                    	    match(input,8,FOLLOW_8_in_declarations134); if (state.failed) return e;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return e;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            // oberon0.g:28:107: ( proceduredeclaration ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // oberon0.g:28:108: proceduredeclaration ';'
            	    {
            	    pushFollow(FOLLOW_proceduredeclaration_in_declarations142);
            	    proceduredeclaration();

            	    state._fsp--;
            	    if (state.failed) return e;
            	    match(input,8,FOLLOW_8_in_declarations144); if (state.failed) return e;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              	  e = new DeclarationsNode();
              	
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


    // $ANTLR start "type"
    // oberon0.g:34:1: type : ( IDENT | arraytype | recordtype );
    public final void type() throws RecognitionException {
        try {
            // oberon0.g:35:2: ( IDENT | arraytype | recordtype )
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
                    // oberon0.g:35:4: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_type160); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // oberon0.g:36:4: arraytype
                    {
                    pushFollow(FOLLOW_arraytype_in_type165);
                    arraytype();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // oberon0.g:37:4: recordtype
                    {
                    pushFollow(FOLLOW_recordtype_in_type170);
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
    // oberon0.g:40:1: arraytype : 'ARRAY' expression 'OF' type ;
    public final void arraytype() throws RecognitionException {
        try {
            // oberon0.g:41:2: ( 'ARRAY' expression 'OF' type )
            // oberon0.g:41:4: 'ARRAY' expression 'OF' type
            {
            match(input,17,FOLLOW_17_in_arraytype181); if (state.failed) return ;
            pushFollow(FOLLOW_expression_in_arraytype183);
            expression();

            state._fsp--;
            if (state.failed) return ;
            match(input,18,FOLLOW_18_in_arraytype185); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_arraytype187);
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
    // oberon0.g:44:1: expression returns [ ExpressionNode e ] : simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? ;
    public final ExpressionNode expression() throws RecognitionException {
        ExpressionNode e = null;

        Token operator=null;
        SimpleExpression simpleLeft = null;

        SimpleExpression simpleRight = null;


        try {
            // oberon0.g:45:2: (simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )? )
            // oberon0.g:45:4: simpleLeft= simpleexpression (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            {
            pushFollow(FOLLOW_simpleexpression_in_expression206);
            simpleLeft=simpleexpression();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:45:32: (operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||(LA10_0>=19 && LA10_0<=23)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // oberon0.g:45:33: operator= ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleRight= simpleexpression
                    {
                    operator=(Token)input.LT(1);
                    if ( input.LA(1)==13||(input.LA(1)>=19 && input.LA(1)<=23) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return e;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleexpression_in_expression227);
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
    // oberon0.g:51:1: simpleexpression returns [ SimpleExpression e ] : specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? ;
    public final SimpleExpression simpleexpression() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        ASTnode specialTerm3 = null;

        SimpleExpression simpleExpressionFollowup4 = null;


        try {
            // oberon0.g:52:2: ( specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )? )
            // oberon0.g:52:4: specialTerm (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_specialTerm_in_simpleexpression248);
            specialTerm3=specialTerm();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:52:16: (operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=24 && LA11_0<=26)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // oberon0.g:52:18: operator= ( '+' | '-' | 'OR' ) simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleexpression262);
                    simpleExpressionFollowup4=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), specialTerm3, simpleExpressionFollowup4 );
              	
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
    // oberon0.g:58:1: specialTerm returns [ ASTnode e ] : (operator= ( '+' ) term | operator= ( '-' ) term | term );
    public final ASTnode specialTerm() throws RecognitionException {
        ASTnode e = null;

        Token operator=null;
        TermNode term5 = null;

        TermNode term6 = null;

        TermNode term7 = null;


        try {
            // oberon0.g:59:3: (operator= ( '+' ) term | operator= ( '-' ) term | term )
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
                    // oberon0.g:59:5: operator= ( '+' ) term
                    {
                    // oberon0.g:59:14: ( '+' )
                    // oberon0.g:59:15: '+'
                    {
                    match(input,24,FOLLOW_24_in_specialTerm287); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm290);
                    term5=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term5; 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:60:5: operator= ( '-' ) term
                    {
                    // oberon0.g:60:14: ( '-' )
                    // oberon0.g:60:15: '-'
                    {
                    match(input,25,FOLLOW_25_in_specialTerm301); if (state.failed) return e;

                    }

                    pushFollow(FOLLOW_term_in_specialTerm304);
                    term6=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new MinusNode( term6 ); 
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:61:5: term
                    {
                    pushFollow(FOLLOW_term_in_specialTerm312);
                    term7=term();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = term7; 
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
    // oberon0.g:64:1: simpleExpressionFollowup returns [ SimpleExpression e ] : term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? ;
    public final SimpleExpression simpleExpressionFollowup() throws RecognitionException {
        SimpleExpression e = null;

        Token operator=null;
        SimpleExpression follow2 = null;

        TermNode term8 = null;


        try {
            // oberon0.g:65:2: ( term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )? )
            // oberon0.g:65:5: term (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            {
            pushFollow(FOLLOW_term_in_simpleExpressionFollowup332);
            term8=term();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:65:10: (operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=24 && LA13_0<=26)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // oberon0.g:65:11: operator= ( '+' | '-' | 'OR' ) follow2= simpleExpressionFollowup
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

                    pushFollow(FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup347);
                    follow2=simpleExpressionFollowup();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new SimpleExpression( (operator!=null?operator.getText():null), term8, follow2 );
              	
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
    // oberon0.g:71:1: term returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? ;
    public final TermNode term() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        ASTnode factor9 = null;

        TermNode termFollowUp10 = null;


        try {
            // oberon0.g:72:2: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )? )
            // oberon0.g:72:4: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_term368);
            factor9=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:72:11: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=27 && LA14_0<=30)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // oberon0.g:72:12: operator= ( '*' | 'DIV' | 'MOD' | '&' ) termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_term383);
                    termFollowUp10=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new TermNode( factor9, (operator!=null?operator.getText():null), termFollowUp10 );
              	
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
    // oberon0.g:78:1: termFollowUp returns [ TermNode e ] : factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? ;
    public final TermNode termFollowUp() throws RecognitionException {
        TermNode e = null;

        Token operator=null;
        TermNode follow2 = null;

        ASTnode factor11 = null;


        try {
            // oberon0.g:79:3: ( factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )? )
            // oberon0.g:79:5: factor (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            {
            pushFollow(FOLLOW_factor_in_termFollowUp405);
            factor11=factor();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:79:12: (operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=27 && LA15_0<=30)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // oberon0.g:79:13: operator= ( '*' | 'DIV' | 'MOD' | '&' ) follow2= termFollowUp
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

                    pushFollow(FOLLOW_termFollowUp_in_termFollowUp422);
                    follow2=termFollowUp();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  e = new TermNode( factor11, (operator!=null?operator.getText():null), follow2 );
                
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
    // oberon0.g:85:1: factor returns [ ASTnode e ] : ( IDENT selector | number | '(' expression ')' | '~' factorOperand= factor );
    public final ASTnode factor() throws RecognitionException {
        ASTnode e = null;

        Token IDENT12=null;
        ASTnode factorOperand = null;

        IntegerNode number13 = null;

        ExpressionNode expression14 = null;


        try {
            // oberon0.g:86:2: ( IDENT selector | number | '(' expression ')' | '~' factorOperand= factor )
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
                    // oberon0.g:86:4: IDENT selector
                    {
                    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor444); if (state.failed) return e;
                    pushFollow(FOLLOW_selector_in_factor446);
                    selector();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = new SelectorNode( (IDENT12!=null?IDENT12.getText():null) ); 
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:87:4: number
                    {
                    pushFollow(FOLLOW_number_in_factor453);
                    number13=number();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = number13; 
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:88:4: '(' expression ')'
                    {
                    match(input,31,FOLLOW_31_in_factor460); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_factor462);
                    expression14=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,32,FOLLOW_32_in_factor464); if (state.failed) return e;
                    if ( state.backtracking==0 ) {
                       e = expression14; 
                    }

                    }
                    break;
                case 4 :
                    // oberon0.g:89:4: '~' factorOperand= factor
                    {
                    match(input,33,FOLLOW_33_in_factor471); if (state.failed) return e;
                    pushFollow(FOLLOW_factor_in_factor475);
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
    // oberon0.g:92:1: number returns [ IntegerNode e ] : INTEGER ;
    public final IntegerNode number() throws RecognitionException {
        IntegerNode e = null;

        Token INTEGER15=null;

        try {
            // oberon0.g:93:2: ( INTEGER )
            // oberon0.g:93:4: INTEGER
            {
            INTEGER15=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number492); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	   e = new IntegerNode( Integer.parseInt( (INTEGER15!=null?INTEGER15.getText():null) ) );
              	
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
    // oberon0.g:99:1: selector : ( '.' IDENT | '[' expression ']' )* ;
    public final void selector() throws RecognitionException {
        try {
            // oberon0.g:100:2: ( ( '.' IDENT | '[' expression ']' )* )
            // oberon0.g:100:4: ( '.' IDENT | '[' expression ']' )*
            {
            // oberon0.g:100:4: ( '.' IDENT | '[' expression ']' )*
            loop17:
            do {
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
            	    // oberon0.g:100:6: '.' IDENT
            	    {
            	    match(input,11,FOLLOW_11_in_selector510); if (state.failed) return ;
            	    match(input,IDENT,FOLLOW_IDENT_in_selector512); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // oberon0.g:100:18: '[' expression ']'
            	    {
            	    match(input,34,FOLLOW_34_in_selector516); if (state.failed) return ;
            	    pushFollow(FOLLOW_expression_in_selector518);
            	    expression();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    match(input,35,FOLLOW_35_in_selector520); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "selector"


    // $ANTLR start "recordtype"
    // oberon0.g:103:1: recordtype : 'RECORD' fieldlist ( ';' fieldlist )* 'END' ;
    public final void recordtype() throws RecognitionException {
        try {
            // oberon0.g:104:2: ( 'RECORD' fieldlist ( ';' fieldlist )* 'END' )
            // oberon0.g:104:4: 'RECORD' fieldlist ( ';' fieldlist )* 'END'
            {
            match(input,36,FOLLOW_36_in_recordtype534); if (state.failed) return ;
            pushFollow(FOLLOW_fieldlist_in_recordtype536);
            fieldlist();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:104:23: ( ';' fieldlist )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==8) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // oberon0.g:104:24: ';' fieldlist
            	    {
            	    match(input,8,FOLLOW_8_in_recordtype539); if (state.failed) return ;
            	    pushFollow(FOLLOW_fieldlist_in_recordtype541);
            	    fieldlist();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_recordtype545); if (state.failed) return ;

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
    // oberon0.g:107:1: fieldlist : ( identlist ':' type )? ;
    public final void fieldlist() throws RecognitionException {
        try {
            // oberon0.g:108:2: ( ( identlist ':' type )? )
            // oberon0.g:108:4: ( identlist ':' type )?
            {
            // oberon0.g:108:4: ( identlist ':' type )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // oberon0.g:108:5: identlist ':' type
                    {
                    pushFollow(FOLLOW_identlist_in_fieldlist558);
                    identlist();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_fieldlist560); if (state.failed) return ;
                    pushFollow(FOLLOW_type_in_fieldlist562);
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
    // oberon0.g:111:1: identlist : IDENT ( ',' IDENT )* ;
    public final void identlist() throws RecognitionException {
        try {
            // oberon0.g:112:2: ( IDENT ( ',' IDENT )* )
            // oberon0.g:112:4: IDENT ( ',' IDENT )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_identlist576); if (state.failed) return ;
            // oberon0.g:112:10: ( ',' IDENT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // oberon0.g:112:11: ',' IDENT
            	    {
            	    match(input,37,FOLLOW_37_in_identlist579); if (state.failed) return ;
            	    match(input,IDENT,FOLLOW_IDENT_in_identlist581); if (state.failed) return ;

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
    // oberon0.g:115:1: statementsequence returns [ StatementSequenceNode e ] : statement (followOne= followupStatementSequence )? ;
    public final StatementSequenceNode statementsequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followOne = null;

        StatementNode statement16 = null;


        try {
            // oberon0.g:116:2: ( statement (followOne= followupStatementSequence )? )
            // oberon0.g:116:4: statement (followOne= followupStatementSequence )?
            {
            pushFollow(FOLLOW_statement_in_statementsequence598);
            statement16=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:116:14: (followOne= followupStatementSequence )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==8) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // oberon0.g:116:16: followOne= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_statementsequence604);
                    followOne=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement16, followOne );
              	
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
    // oberon0.g:122:1: followupStatementSequence returns [ StatementSequenceNode e ] : ';' statement (followTwo= followupStatementSequence )? ;
    public final StatementSequenceNode followupStatementSequence() throws RecognitionException {
        StatementSequenceNode e = null;

        StatementSequenceNode followTwo = null;

        StatementNode statement17 = null;


        try {
            // oberon0.g:123:2: ( ';' statement (followTwo= followupStatementSequence )? )
            // oberon0.g:123:4: ';' statement (followTwo= followupStatementSequence )?
            {
            match(input,8,FOLLOW_8_in_followupStatementSequence625); if (state.failed) return e;
            pushFollow(FOLLOW_statement_in_followupStatementSequence627);
            statement17=statement();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:123:18: (followTwo= followupStatementSequence )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==8) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // oberon0.g:123:20: followTwo= followupStatementSequence
                    {
                    pushFollow(FOLLOW_followupStatementSequence_in_followupStatementSequence633);
                    followTwo=followupStatementSequence();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new StatementSequenceNode( statement17, followTwo );
              	
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
    // oberon0.g:129:1: statement returns [ StatementNode e ] : (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? ;
    public final StatementNode statement() throws RecognitionException {
        StatementNode e = null;

        StatementNode statementRv = null;


        try {
            // oberon0.g:130:2: ( (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )? )
            // oberon0.g:130:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            {
            // oberon0.g:130:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?
            int alt23=5;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // oberon0.g:130:6: statementRv= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement657);
                    statementRv=assignment();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 2 :
                    // oberon0.g:130:31: statementRv= procedurecall
                    {
                    pushFollow(FOLLOW_procedurecall_in_statement663);
                    statementRv=procedurecall();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 3 :
                    // oberon0.g:130:59: statementRv= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement669);
                    statementRv=ifstatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;
                case 4 :
                    // oberon0.g:130:85: statementRv= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement675);
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
    // oberon0.g:136:1: assignment returns [ StatementNode e ] : IDENT selector ':=' expression ;
    public final StatementNode assignment() throws RecognitionException {
        StatementNode e = null;

        Token IDENT18=null;
        ExpressionNode expression19 = null;


        try {
            // oberon0.g:137:2: ( IDENT selector ':=' expression )
            // oberon0.g:137:4: IDENT selector ':=' expression
            {
            IDENT18=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment697); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_assignment699);
            selector();

            state._fsp--;
            if (state.failed) return e;
            match(input,38,FOLLOW_38_in_assignment701); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_assignment703);
            expression19=expression();

            state._fsp--;
            if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new AssignmentNode( (IDENT18!=null?IDENT18.getText():null), expression19 );
              	
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
    // oberon0.g:143:1: procedurecall returns [ StatementNode e ] : IDENT selector ( actualparameters )? ;
    public final StatementNode procedurecall() throws RecognitionException {
        StatementNode e = null;

        try {
            // oberon0.g:144:2: ( IDENT selector ( actualparameters )? )
            // oberon0.g:144:4: IDENT selector ( actualparameters )?
            {
            match(input,IDENT,FOLLOW_IDENT_in_procedurecall722); if (state.failed) return e;
            pushFollow(FOLLOW_selector_in_procedurecall724);
            selector();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:144:19: ( actualparameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // oberon0.g:144:20: actualparameters
                    {
                    pushFollow(FOLLOW_actualparameters_in_procedurecall727);
                    actualparameters();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              	  e = new ProcedureCallNode();
              	
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
    // oberon0.g:150:1: actualparameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final void actualparameters() throws RecognitionException {
        try {
            // oberon0.g:151:2: ( '(' ( expression ( ',' expression )* )? ')' )
            // oberon0.g:151:4: '(' ( expression ( ',' expression )* )? ')'
            {
            match(input,31,FOLLOW_31_in_actualparameters744); if (state.failed) return ;
            // oberon0.g:151:8: ( expression ( ',' expression )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=IDENT && LA26_0<=INTEGER)||(LA26_0>=24 && LA26_0<=25)||LA26_0==31||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // oberon0.g:151:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualparameters748);
                    expression();

                    state._fsp--;
                    if (state.failed) return ;
                    // oberon0.g:151:21: ( ',' expression )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==37) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // oberon0.g:151:23: ',' expression
                    	    {
                    	    match(input,37,FOLLOW_37_in_actualparameters752); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expression_in_actualparameters754);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_actualparameters760); if (state.failed) return ;

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
    // $ANTLR end "actualparameters"


    // $ANTLR start "ifstatement"
    // oberon0.g:154:1: ifstatement returns [ StatementNode e ] : 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' ;
    public final StatementNode ifstatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode expression20 = null;

        StatementSequenceNode statementsequence21 = null;

        StatementNode elsestatement22 = null;


        try {
            // oberon0.g:155:2: ( 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END' )
            // oberon0.g:155:4: 'IF' expression 'THEN' statementsequence ( elsestatement )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifstatement776); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_ifstatement778);
            expression20=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,40,FOLLOW_40_in_ifstatement780); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_ifstatement782);
            statementsequence21=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            // oberon0.g:155:45: ( elsestatement )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=41 && LA27_0<=42)) ) {
                alt27=1;
            }
            else if ( (LA27_0==10) ) {
                int LA27_2 = input.LA(2);

                if ( (synpred50_oberon0()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // oberon0.g:0:0: elsestatement
                    {
                    pushFollow(FOLLOW_elsestatement_in_ifstatement784);
                    elsestatement22=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifstatement787); if (state.failed) return e;
            if ( state.backtracking==0 ) {

              	  e = new IfStatementNode( expression20, statementsequence21, elsestatement22 );
              	
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
    // oberon0.g:161:1: elsestatement returns [ StatementNode e ] : ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | );
    public final StatementNode elsestatement() throws RecognitionException {
        StatementNode e = null;

        StatementNode elseNode = null;

        ExpressionNode expression23 = null;

        StatementSequenceNode statementsequence24 = null;

        StatementSequenceNode statementsequence25 = null;


        try {
            // oberon0.g:162:3: ( 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement | 'ELSE' statementsequence | )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt28=1;
                }
                break;
            case 42:
                {
                alt28=2;
                }
                break;
            case EOF:
            case 10:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // oberon0.g:162:5: 'ELSIF' expression 'THEN' statementsequence elseNode= elsestatement
                    {
                    match(input,41,FOLLOW_41_in_elsestatement807); if (state.failed) return e;
                    pushFollow(FOLLOW_expression_in_elsestatement809);
                    expression23=expression();

                    state._fsp--;
                    if (state.failed) return e;
                    match(input,40,FOLLOW_40_in_elsestatement811); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement813);
                    statementsequence24=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    pushFollow(FOLLOW_elsestatement_in_elsestatement817);
                    elseNode=elsestatement();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new IfStatementNode( expression23, statementsequence24, elseNode );
                        
                    }

                    }
                    break;
                case 2 :
                    // oberon0.g:166:5: 'ELSE' statementsequence
                    {
                    match(input,42,FOLLOW_42_in_elsestatement828); if (state.failed) return e;
                    pushFollow(FOLLOW_statementsequence_in_elsestatement830);
                    statementsequence25=statementsequence();

                    state._fsp--;
                    if (state.failed) return e;
                    if ( state.backtracking==0 ) {

                          e = new ElseStatementNode( statementsequence25 );
                        
                    }

                    }
                    break;
                case 3 :
                    // oberon0.g:171:3: 
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
    // oberon0.g:176:1: whilestatement returns [ StatementNode e ] : 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' ;
    public final StatementNode whilestatement() throws RecognitionException {
        StatementNode e = null;

        ExpressionNode cond = null;

        StatementSequenceNode ifTrueDo = null;


        try {
            // oberon0.g:177:2: ( 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END' )
            // oberon0.g:177:4: 'WHILE' cond= expression 'DO' ifTrueDo= statementsequence 'END'
            {
            match(input,43,FOLLOW_43_in_whilestatement860); if (state.failed) return e;
            pushFollow(FOLLOW_expression_in_whilestatement864);
            cond=expression();

            state._fsp--;
            if (state.failed) return e;
            match(input,44,FOLLOW_44_in_whilestatement866); if (state.failed) return e;
            pushFollow(FOLLOW_statementsequence_in_whilestatement870);
            ifTrueDo=statementsequence();

            state._fsp--;
            if (state.failed) return e;
            match(input,10,FOLLOW_10_in_whilestatement872); if (state.failed) return e;
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
    // oberon0.g:183:1: proceduredeclaration : procedureheading ';' procedurebody ;
    public final void proceduredeclaration() throws RecognitionException {
        try {
            // oberon0.g:184:2: ( procedureheading ';' procedurebody )
            // oberon0.g:184:4: procedureheading ';' procedurebody
            {
            pushFollow(FOLLOW_procedureheading_in_proceduredeclaration887);
            procedureheading();

            state._fsp--;
            if (state.failed) return ;
            match(input,8,FOLLOW_8_in_proceduredeclaration889); if (state.failed) return ;
            pushFollow(FOLLOW_procedurebody_in_proceduredeclaration891);
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
    // oberon0.g:187:1: procedureheading : 'PROCEDURE' IDENT ( formalparameters )? ;
    public final void procedureheading() throws RecognitionException {
        try {
            // oberon0.g:188:2: ( 'PROCEDURE' IDENT ( formalparameters )? )
            // oberon0.g:188:4: 'PROCEDURE' IDENT ( formalparameters )?
            {
            match(input,45,FOLLOW_45_in_procedureheading903); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedureheading905); if (state.failed) return ;
            // oberon0.g:188:22: ( formalparameters )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // oberon0.g:188:23: formalparameters
                    {
                    pushFollow(FOLLOW_formalparameters_in_procedureheading908);
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
    // oberon0.g:191:1: procedurebody : declarations ( 'BEGIN' statementsequence )? 'END' IDENT ;
    public final void procedurebody() throws RecognitionException {
        try {
            // oberon0.g:192:2: ( declarations ( 'BEGIN' statementsequence )? 'END' IDENT )
            // oberon0.g:192:4: declarations ( 'BEGIN' statementsequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedurebody922);
            declarations();

            state._fsp--;
            if (state.failed) return ;
            // oberon0.g:192:17: ( 'BEGIN' statementsequence )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==9) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // oberon0.g:192:18: 'BEGIN' statementsequence
                    {
                    match(input,9,FOLLOW_9_in_procedurebody925); if (state.failed) return ;
                    pushFollow(FOLLOW_statementsequence_in_procedurebody927);
                    statementsequence();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedurebody931); if (state.failed) return ;
            match(input,IDENT,FOLLOW_IDENT_in_procedurebody933); if (state.failed) return ;

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
    // oberon0.g:195:1: formalparameters : '(' ( fpsection ( ';' fpsection )* )? ')' ;
    public final void formalparameters() throws RecognitionException {
        try {
            // oberon0.g:196:2: ( '(' ( fpsection ( ';' fpsection )* )? ')' )
            // oberon0.g:196:4: '(' ( fpsection ( ';' fpsection )* )? ')'
            {
            match(input,31,FOLLOW_31_in_formalparameters945); if (state.failed) return ;
            // oberon0.g:196:8: ( fpsection ( ';' fpsection )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==IDENT||LA32_0==15) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // oberon0.g:196:9: fpsection ( ';' fpsection )*
                    {
                    pushFollow(FOLLOW_fpsection_in_formalparameters948);
                    fpsection();

                    state._fsp--;
                    if (state.failed) return ;
                    // oberon0.g:196:19: ( ';' fpsection )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==8) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // oberon0.g:196:20: ';' fpsection
                    	    {
                    	    match(input,8,FOLLOW_8_in_formalparameters951); if (state.failed) return ;
                    	    pushFollow(FOLLOW_fpsection_in_formalparameters953);
                    	    fpsection();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,32,FOLLOW_32_in_formalparameters959); if (state.failed) return ;

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
    // oberon0.g:199:1: fpsection : ( 'VAR' )? identlist ':' type ;
    public final void fpsection() throws RecognitionException {
        try {
            // oberon0.g:200:2: ( ( 'VAR' )? identlist ':' type )
            // oberon0.g:200:4: ( 'VAR' )? identlist ':' type
            {
            // oberon0.g:200:4: ( 'VAR' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // oberon0.g:200:5: 'VAR'
                    {
                    match(input,15,FOLLOW_15_in_fpsection971); if (state.failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_identlist_in_fpsection975);
            identlist();

            state._fsp--;
            if (state.failed) return ;
            match(input,16,FOLLOW_16_in_fpsection977); if (state.failed) return ;
            pushFollow(FOLLOW_type_in_fpsection979);
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

    // $ANTLR start synpred43_oberon0
    public final void synpred43_oberon0_fragment() throws RecognitionException {   
        StatementNode statementRv = null;


        // oberon0.g:130:6: (statementRv= assignment )
        // oberon0.g:130:6: statementRv= assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred43_oberon0657);
        statementRv=assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_oberon0

    // $ANTLR start synpred44_oberon0
    public final void synpred44_oberon0_fragment() throws RecognitionException {   
        StatementNode statementRv = null;


        // oberon0.g:130:31: (statementRv= procedurecall )
        // oberon0.g:130:31: statementRv= procedurecall
        {
        pushFollow(FOLLOW_procedurecall_in_synpred44_oberon0663);
        statementRv=procedurecall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_oberon0

    // $ANTLR start synpred50_oberon0
    public final void synpred50_oberon0_fragment() throws RecognitionException {   
        // oberon0.g:155:45: ( elsestatement )
        // oberon0.g:155:45: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred50_oberon0784);
        elsestatement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_oberon0

    // Delegated rules

    public final boolean synpred50_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_oberon0() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_oberon0_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\13\uffff";
    static final String DFA23_eofS =
        "\1\4\12\uffff";
    static final String DFA23_minS =
        "\1\4\1\0\11\uffff";
    static final String DFA23_maxS =
        "\1\53\1\0\11\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\3\1\4\1\5\4\uffff\1\1\1\2";
    static final String DFA23_specialS =
        "\1\uffff\1\0\11\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1\3\uffff\1\4\1\uffff\1\4\34\uffff\1\2\1\uffff\2\4\1\3",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "130:4: (statementRv= assignment | statementRv= procedurecall | statementRv= ifstatement | statementRv= whilestatement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_1 = input.LA(1);

                         
                        int index23_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_oberon0()) ) {s = 9;}

                        else if ( (synpred44_oberon0()) ) {s = 10;}

                         
                        input.seek(index23_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_7_in_module52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module56 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module58 = new BitSet(new long[]{0x000020000000D600L});
    public static final BitSet FOLLOW_declarations_in_module60 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_module63 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_module65 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_module73 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_declarations95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations98 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations100 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_declarations102 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations104 = new BitSet(new long[]{0x000020000000C012L});
    public static final BitSet FOLLOW_14_in_declarations111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_declarations114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_declarations116 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations118 = new BitSet(new long[]{0x0000200000008012L});
    public static final BitSet FOLLOW_15_in_declarations125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_declarations128 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_declarations130 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_declarations132 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations134 = new BitSet(new long[]{0x0000200000000012L});
    public static final BitSet FOLLOW_proceduredeclaration_in_declarations142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_declarations144 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_IDENT_in_type160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraytype_in_type165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordtype_in_type170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arraytype181 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_arraytype183 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_arraytype185 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_arraytype187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleexpression_in_expression206 = new BitSet(new long[]{0x0000000000F82002L});
    public static final BitSet FOLLOW_set_in_expression211 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleexpression_in_expression227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_specialTerm_in_simpleexpression248 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleexpression254 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleexpression262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_specialTerm287 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_specialTerm301 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_term_in_specialTerm304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_specialTerm312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpressionFollowup332 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_set_in_simpleExpressionFollowup337 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_simpleExpressionFollowup_in_simpleExpressionFollowup347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term368 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_term373 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_term383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_termFollowUp405 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_set_in_termFollowUp410 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_termFollowUp_in_termFollowUp422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_factor444 = new BitSet(new long[]{0x0000000400000800L});
    public static final BitSet FOLLOW_selector_in_factor446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_factor460 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_factor462 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_factor464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor471 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_factor_in_factor475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_selector510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_selector512 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_34_in_selector516 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_selector518 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_selector520 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_36_in_recordtype534 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype536 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_recordtype539 = new BitSet(new long[]{0x0000000000000510L});
    public static final BitSet FOLLOW_fieldlist_in_recordtype541 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_recordtype545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identlist_in_fieldlist558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldlist560 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fieldlist562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identlist576 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identlist579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_identlist581 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statement_in_statementsequence598 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_statementsequence604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_followupStatementSequence625 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statement_in_followupStatementSequence627 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_followupStatementSequence_in_followupStatementSequence633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_statement663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment697 = new BitSet(new long[]{0x0000004400000800L});
    public static final BitSet FOLLOW_selector_in_assignment699 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment701 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_assignment703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedurecall722 = new BitSet(new long[]{0x0000000480000800L});
    public static final BitSet FOLLOW_selector_in_procedurecall724 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_actualparameters_in_procedurecall727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_actualparameters744 = new BitSet(new long[]{0x0000000383000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters748 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_37_in_actualparameters752 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_actualparameters754 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_32_in_actualparameters760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifstatement776 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_ifstatement778 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifstatement780 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_ifstatement782 = new BitSet(new long[]{0x0000060000000400L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement784 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifstatement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elsestatement807 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_elsestatement809 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elsestatement811 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement813 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_elsestatement_in_elsestatement817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elsestatement828 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_elsestatement830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whilestatement860 = new BitSet(new long[]{0x0000000283000030L});
    public static final BitSet FOLLOW_expression_in_whilestatement864 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whilestatement866 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_whilestatement870 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whilestatement872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureheading_in_proceduredeclaration887 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_proceduredeclaration889 = new BitSet(new long[]{0x000020000000D600L});
    public static final BitSet FOLLOW_procedurebody_in_proceduredeclaration891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_procedureheading903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedureheading905 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_formalparameters_in_procedureheading908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedurebody922 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_9_in_procedurebody925 = new BitSet(new long[]{0x0000088000000110L});
    public static final BitSet FOLLOW_statementsequence_in_procedurebody927 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedurebody931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENT_in_procedurebody933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_formalparameters945 = new BitSet(new long[]{0x0000000100008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters948 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_8_in_formalparameters951 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_fpsection_in_formalparameters953 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_32_in_formalparameters959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fpsection971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identlist_in_fpsection975 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fpsection977 = new BitSet(new long[]{0x0000001000020010L});
    public static final BitSet FOLLOW_type_in_fpsection979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred43_oberon0657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedurecall_in_synpred44_oberon0663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred50_oberon0784 = new BitSet(new long[]{0x0000000000000002L});

}