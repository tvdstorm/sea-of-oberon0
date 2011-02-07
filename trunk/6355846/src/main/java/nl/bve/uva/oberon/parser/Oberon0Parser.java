// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-07 14:59:45

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.*;
import nl.bve.uva.oberon.ast.expressions.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "NUMBER", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "';'", "':='", "'('", "','", "')'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'END'", "'WHILE'", "'DO'", "'.'", "'['", "']'"
    };
    public static final int EOF=-1;
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
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int DIV=7;
    public static final int MOD=8;
    public static final int EQUALS=9;
    public static final int OR=10;
    public static final int AND=11;
    public static final int LT=12;
    public static final int LT_EQ=13;
    public static final int GT=14;
    public static final int GT_EQ=15;
    public static final int IDENT=16;
    public static final int NUMBER=17;
    public static final int INTEGER=18;
    public static final int LETTER=19;
    public static final int DIGIT=20;
    public static final int WHITESPACE=21;

    // delegates
    // delegators


        public Oberon0Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Oberon0Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return Oberon0Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g"; }



    // $ANTLR start "prog"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:33:1: prog returns [IInterpretableNode prog] : statement ;
    public final IInterpretableNode prog() throws RecognitionException {
        IInterpretableNode prog = null;

        IInterpretableNode statement1 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:2: ( statement )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:4: statement
            {
            pushFollow(FOLLOW_statement_in_prog162);
            statement1=statement();

            state._fsp--;

            prog = statement1; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return prog;
    }
    // $ANTLR end "prog"


    // $ANTLR start "statementSequence"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:1: statementSequence returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : s1= statement ( ';' s2= statement )* ;
    public final List<IInterpretableNode> statementSequence() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:2: (s1= statement ( ';' s2= statement )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:4: s1= statement ( ';' s2= statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence187);
            s1=statement();

            state._fsp--;

            result.add(s1); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:3: ( ';' s2= statement )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:4: ';' s2= statement
            	    {
            	    match(input,22,FOLLOW_22_in_statementSequence205); 
            	    pushFollow(FOLLOW_statement_in_statementSequence209);
            	    s2=statement();

            	    state._fsp--;

            	    result.add(s2); 

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
        return result;
    }
    // $ANTLR end "statementSequence"


    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:1: statement returns [IInterpretableNode result] : ( callStatement | ifStatement | whileStatement )? ;
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode callStatement2 = null;

        IInterpretableNode ifStatement3 = null;

        IInterpretableNode whileStatement4 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:2: ( ( callStatement | ifStatement | whileStatement )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:4: ( callStatement | ifStatement | whileStatement )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:4: ( callStatement | ifStatement | whileStatement )?
            int alt2=4;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    alt2=1;
                    }
                    break;
                case 27:
                    {
                    alt2=2;
                    }
                    break;
                case 32:
                    {
                    alt2=3;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:6: callStatement
                    {
                    pushFollow(FOLLOW_callStatement_in_statement235);
                    callStatement2=callStatement();

                    state._fsp--;

                    result = callStatement2; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement249);
                    ifStatement3=ifStatement();

                    state._fsp--;

                    result = ifStatement3; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:45:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement263);
                    whileStatement4=whileStatement();

                    state._fsp--;

                    result = whileStatement4; 

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
        return result;
    }
    // $ANTLR end "statement"


    // $ANTLR start "callStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:1: callStatement returns [IInterpretableNode result] : IDENT selector ( ':=' expression | ( actualParameters )? ) ;
    public final IInterpretableNode callStatement() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT5=null;
        List<IInterpretableNode> selector6 = null;

        IInterpretableNode expression7 = null;

        List<IInterpretableNode> actualParameters8 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:2: ( IDENT selector ( ':=' expression | ( actualParameters )? ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:4: IDENT selector ( ':=' expression | ( actualParameters )? )
            {
            IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_callStatement289); 
            pushFollow(FOLLOW_selector_in_callStatement291);
            selector6=selector();

            state._fsp--;

            result = new IdentChangerNode((IDENT5!=null?IDENT5.getText():null), selector6); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:4: ( ':=' expression | ( actualParameters )? )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==EOF||LA4_0==22||LA4_0==24||(LA4_0>=29 && LA4_0<=31)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:5: ':=' expression
                    {
                    match(input,23,FOLLOW_23_in_callStatement305); 
                    pushFollow(FOLLOW_expression_in_callStatement307);
                    expression7=expression();

                    state._fsp--;

                    result = new AssignmentNode(result, expression7); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:6: ( actualParameters )?
                    {
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:6: ( actualParameters )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==24) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:7: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_callStatement322);
                            actualParameters8=actualParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    result = new ProcedureCallNode(result, actualParameters8); 

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
        return result;
    }
    // $ANTLR end "callStatement"


    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:54:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,24,FOLLOW_24_in_actualParameters347); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:8: (e1= expression ( ',' e2= expression )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=PLUS && LA6_0<=MINUS)||(LA6_0>=IDENT && LA6_0<=NUMBER)||LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters352);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:5: ( ',' e2= expression )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==25) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:6: ',' e2= expression
                    	    {
                    	    match(input,25,FOLLOW_25_in_actualParameters373); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters377);
                    	    e2=expression();

                    	    state._fsp--;

                    	    result.add(e2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_actualParameters399); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "actualParameters"


    // $ANTLR start "ifStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:1: ifStatement returns [IInterpretableNode result] : 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:2: ( 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: 'IF' expression 'THEN' statementSequence ( 'ELSIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
            {
            match(input,27,FOLLOW_27_in_ifStatement413); 
            pushFollow(FOLLOW_expression_in_ifStatement415);
            expression();

            state._fsp--;

            match(input,28,FOLLOW_28_in_ifStatement417); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement419);
            statementSequence();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:45: ( 'ELSIF' expression 'THEN' statementSequence )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:46: 'ELSIF' expression 'THEN' statementSequence
            	    {
            	    match(input,29,FOLLOW_29_in_ifStatement422); 
            	    pushFollow(FOLLOW_expression_in_ifStatement424);
            	    expression();

            	    state._fsp--;

            	    match(input,28,FOLLOW_28_in_ifStatement426); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement428);
            	    statementSequence();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:92: ( 'ELSE' statementSequence )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:93: 'ELSE' statementSequence
                    {
                    match(input,30,FOLLOW_30_in_ifStatement433); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement435);
                    statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_ifStatement439); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:66:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:66:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,32,FOLLOW_32_in_whileStatement452); 
            pushFollow(FOLLOW_expression_in_whileStatement454);
            expression();

            state._fsp--;

            match(input,33,FOLLOW_33_in_whileStatement456); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement458);
            statementSequence();

            state._fsp--;

            match(input,31,FOLLOW_31_in_whileStatement460); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT9=null;
        List<IInterpretableNode> selector10 = null;

        IInterpretableNode expression11 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:2: ( IDENT selector ':=' expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:4: IDENT selector ':=' expression
            {
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment473); 
            pushFollow(FOLLOW_selector_in_assignment475);
            selector10=selector();

            state._fsp--;

            result = new IdentChangerNode((IDENT9!=null?IDENT9.getText():null), selector10); 
            match(input,23,FOLLOW_23_in_assignment488); 
            pushFollow(FOLLOW_expression_in_assignment490);
            expression11=expression();

            state._fsp--;

            result = new AssignmentNode(result, expression11); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "assignment"


    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:72:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:73:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:73:4: s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression513);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:74:3: ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            int alt9=6;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt9=1;
                    }
                    break;
                case LT:
                    {
                    alt9=2;
                    }
                    break;
                case LT_EQ:
                    {
                    alt9=3;
                    }
                    break;
                case GT:
                    {
                    alt9=4;
                    }
                    break;
                case GT_EQ:
                    {
                    alt9=5;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:74:5: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression526); 
                    pushFollow(FOLLOW_simpleExpression_in_expression530);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:76:5: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression544); 
                    pushFollow(FOLLOW_simpleExpression_in_expression548);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:5: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression559); 
                    pushFollow(FOLLOW_simpleExpression_in_expression563);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:5: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression574); 
                    pushFollow(FOLLOW_simpleExpression_in_expression578);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:5: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression589); 
                    pushFollow(FOLLOW_simpleExpression_in_expression593);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTEqualsExprNode(result, s2); 

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
        return result;
    }
    // $ANTLR end "expression"


    // $ANTLR start "simpleExpression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            int alt11=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt11=1;
                }
                break;
            case MINUS:
                {
                alt11=2;
                }
                break;
            case IDENT:
            case NUMBER:
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression618); 
                    pushFollow(FOLLOW_term_in_simpleExpression622);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression637); 
                    pushFollow(FOLLOW_term_in_simpleExpression641);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression657);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    loop10:
                    do {
                        int alt10=4;
                        switch ( input.LA(1) ) {
                        case PLUS:
                            {
                            alt10=1;
                            }
                            break;
                        case MINUS:
                            {
                            alt10=2;
                            }
                            break;
                        case OR:
                            {
                            alt10=3;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression673); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression677);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:87:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression691); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression695);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:88:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression709); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression713);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new OrExprNode(result, t2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


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
        return result;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "term"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term741);
            f1=factor();

            state._fsp--;

            result = f1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:2: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=MULT && LA13_0<=MOD)||LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:4: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:4: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case AND:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:6: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term758); 
            	            pushFollow(FOLLOW_factor_in_term762);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:5: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term775); 
            	            pushFollow(FOLLOW_factor_in_term779);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:5: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term793); 
            	            pushFollow(FOLLOW_factor_in_term797);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:5: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term811); 
            	            pushFollow(FOLLOW_factor_in_term815);
            	            f2=factor();

            	            state._fsp--;

            	            result = new AndExprNode(result, f2); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
        return result;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:100:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT12=null;
        Token NUMBER14=null;
        List<IInterpretableNode> selector13 = null;

        IInterpretableNode expression15 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:2: ( IDENT selector | NUMBER | '(' expression ')' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt14=1;
                }
                break;
            case NUMBER:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:5: IDENT selector
                    {
                    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor845); 
                    pushFollow(FOLLOW_selector_in_factor847);
                    selector13=selector();

                    state._fsp--;

                    result = new IdentReaderNode((IDENT12!=null?IDENT12.getText():null), selector13); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:102:5: NUMBER
                    {
                    NUMBER14=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor862); 
                    result = new NumberNode(Integer.parseInt((NUMBER14!=null?NUMBER14.getText():null))); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:103:5: '(' expression ')'
                    {
                    match(input,24,FOLLOW_24_in_factor878); 
                    pushFollow(FOLLOW_expression_in_factor880);
                    expression15=expression();

                    state._fsp--;

                    match(input,26,FOLLOW_26_in_factor882); 
                    result = expression15; 

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
        return result;
    }
    // $ANTLR end "factor"


    // $ANTLR start "selector"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:107:1: selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<IInterpretableNode> selector() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT16=null;
        IInterpretableNode expression17 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:2: ( ( '.' IDENT | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:5: ( '.' IDENT | '[' expression ']' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:5: ( '.' IDENT | '[' expression ']' )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }
                else if ( (LA15_0==35) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:6: '.' IDENT
            	    {
            	    match(input,34,FOLLOW_34_in_selector909); 
            	    IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector911); 
            	    result.add(new DotSelectorNode((IDENT16!=null?IDENT16.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:7: '[' expression ']'
            	    {
            	    match(input,35,FOLLOW_35_in_selector929); 
            	    pushFollow(FOLLOW_expression_in_selector931);
            	    expression17=expression();

            	    state._fsp--;

            	    match(input,36,FOLLOW_36_in_selector933); 
            	    result.add(new ElementSelectorNode(expression17)); 

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
        return result;
    }
    // $ANTLR end "selector"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_prog162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence187 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_statementSequence205 = new BitSet(new long[]{0x0000000108410000L});
    public static final BitSet FOLLOW_statement_in_statementSequence209 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_callStatement_in_statement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_callStatement289 = new BitSet(new long[]{0x0000000C01800000L});
    public static final BitSet FOLLOW_selector_in_callStatement291 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_23_in_callStatement305 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_callStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_callStatement322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_actualParameters347 = new BitSet(new long[]{0x0000000005030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters352 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_actualParameters373 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters377 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_26_in_actualParameters399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ifStatement413 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_ifStatement415 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ifStatement417 = new BitSet(new long[]{0x0000000108410000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement419 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_29_in_ifStatement422 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_ifStatement424 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ifStatement426 = new BitSet(new long[]{0x0000000108410000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement428 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_30_in_ifStatement433 = new BitSet(new long[]{0x0000000108410000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement435 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ifStatement439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_whileStatement452 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_whileStatement454 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_whileStatement456 = new BitSet(new long[]{0x0000000108410000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement458 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_whileStatement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment473 = new BitSet(new long[]{0x0000000C00800000L});
    public static final BitSet FOLLOW_selector_in_assignment475 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_assignment488 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_assignment490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression513 = new BitSet(new long[]{0x000000000000F202L});
    public static final BitSet FOLLOW_EQUALS_in_expression526 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression544 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression559 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression574 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression589 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression618 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression637 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression657 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression673 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression677 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression691 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression695 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_OR_in_simpleExpression709 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression713 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_factor_in_term741 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MULT_in_term758 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_factor_in_term762 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_DIV_in_term775 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_factor_in_term779 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MOD_in_term793 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_factor_in_term797 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_AND_in_term811 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_factor_in_term815 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_IDENT_in_factor845 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_selector_in_factor847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_factor878 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_factor880 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_factor882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_selector909 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_selector911 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_35_in_selector929 = new BitSet(new long[]{0x0000000001030030L});
    public static final BitSet FOLLOW_expression_in_selector931 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_selector933 = new BitSet(new long[]{0x0000000C00000002L});

}