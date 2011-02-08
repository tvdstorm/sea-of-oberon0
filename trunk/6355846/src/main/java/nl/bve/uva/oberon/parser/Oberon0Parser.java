// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-07 22:54:44

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.*;
import nl.bve.uva.oberon.ast.expressions.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "NUMBER", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "'RECORD'", "';'", "'END'", "':'", "'ARRAY'", "'OF'", "','", "':='", "'('", "')'", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'.'", "'['", "']'"
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
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
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
            pushFollow(FOLLOW_statement_in_prog163);
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


    // $ANTLR start "type"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:1: type : ( IDENT | arrayType | recordType );
    public final void type() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:6: ( IDENT | arrayType | recordType )
            int alt1=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:8: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_type185); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:16: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type189);
                    arrayType();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:28: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type193);
                    recordType();

                    state._fsp--;


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


    // $ANTLR start "recordType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:1: recordType : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final void recordType() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:2: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:4: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            match(input,22,FOLLOW_22_in_recordType202); 
            pushFollow(FOLLOW_fieldList_in_recordType204);
            fieldList();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:23: ( ';' fieldList )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:24: ';' fieldList
            	    {
            	    match(input,23,FOLLOW_23_in_recordType207); 
            	    pushFollow(FOLLOW_fieldList_in_recordType210);
            	    fieldList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,24,FOLLOW_24_in_recordType214); 

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
    // $ANTLR end "recordType"


    // $ANTLR start "fieldList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:1: fieldList : ( identList ':' type )? ;
    public final void fieldList() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:2: ( ( identList ':' type )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:4: ( identList ':' type )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:4: ( identList ':' type )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IDENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:5: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList224);
                    identList();

                    state._fsp--;

                    match(input,25,FOLLOW_25_in_fieldList226); 
                    pushFollow(FOLLOW_type_in_fieldList228);
                    type();

                    state._fsp--;


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
    // $ANTLR end "fieldList"


    // $ANTLR start "arrayType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:1: arrayType : 'ARRAY' expression 'OF' type ;
    public final void arrayType() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:45:2: ( 'ARRAY' expression 'OF' type )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:45:4: 'ARRAY' expression 'OF' type
            {
            match(input,26,FOLLOW_26_in_arrayType240); 
            pushFollow(FOLLOW_expression_in_arrayType242);
            expression();

            state._fsp--;

            match(input,27,FOLLOW_27_in_arrayType244); 
            pushFollow(FOLLOW_type_in_arrayType246);
            type();

            state._fsp--;


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
    // $ANTLR end "arrayType"


    // $ANTLR start "identList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:47:1: identList : IDENT ( ',' IDENT )* ;
    public final void identList() throws RecognitionException {
        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:2: ( IDENT ( ',' IDENT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:4: IDENT ( ',' IDENT )*
            {
            match(input,IDENT,FOLLOW_IDENT_in_identList255); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:10: ( ',' IDENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:11: ',' IDENT
            	    {
            	    match(input,28,FOLLOW_28_in_identList258); 
            	    match(input,IDENT,FOLLOW_IDENT_in_identList260); 

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "identList"


    // $ANTLR start "statementSequence"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:1: statementSequence returns [IInterpretableNode result] : statementList ;
    public final IInterpretableNode statementSequence() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> statementList2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:2: ( statementList )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_statementSequence275);
            statementList2=statementList();

            state._fsp--;

            result = new StatementSequenceNode(statementList2); 

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


    // $ANTLR start "statementList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:53:1: statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : s1= statement ( ';' s2= statement )* ;
    public final List<IInterpretableNode> statementList() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:54:2: (s1= statement ( ';' s2= statement )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:54:4: s1= statement ( ';' s2= statement )*
            {
            pushFollow(FOLLOW_statement_in_statementList302);
            s1=statement();

            state._fsp--;

            result.add(s1); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:4: ( ';' s2= statement )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:5: ';' s2= statement
            	    {
            	    match(input,23,FOLLOW_23_in_statementList321); 
            	    pushFollow(FOLLOW_statement_in_statementList325);
            	    s2=statement();

            	    state._fsp--;

            	    result.add(s2); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "statementList"


    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:1: statement returns [IInterpretableNode result] : ( callStatement | ifStatement | whileStatement )? ;
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode callStatement3 = null;

        IInterpretableNode ifStatement4 = null;

        IInterpretableNode whileStatement5 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:59:2: ( ( callStatement | ifStatement | whileStatement )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:59:4: ( callStatement | ifStatement | whileStatement )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:59:4: ( callStatement | ifStatement | whileStatement )?
            int alt6=4;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    alt6=1;
                    }
                    break;
                case 32:
                    {
                    alt6=2;
                    }
                    break;
                case 36:
                    {
                    alt6=3;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:59:6: callStatement
                    {
                    pushFollow(FOLLOW_callStatement_in_statement356);
                    callStatement3=callStatement();

                    state._fsp--;

                    result = callStatement3; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:60:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement374);
                    ifStatement4=ifStatement();

                    state._fsp--;

                    result = ifStatement4; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:61:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement392);
                    whileStatement5=whileStatement();

                    state._fsp--;

                    result = whileStatement5; 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:1: callStatement returns [IInterpretableNode result] : IDENT selector ( ':=' expression | ( actualParameters )? ) ;
    public final IInterpretableNode callStatement() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT6=null;
        List<IInterpretableNode> selector7 = null;

        IInterpretableNode expression8 = null;

        List<IInterpretableNode> actualParameters9 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:2: ( IDENT selector ( ':=' expression | ( actualParameters )? ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:4: IDENT selector ( ':=' expression | ( actualParameters )? )
            {
            IDENT6=(Token)match(input,IDENT,FOLLOW_IDENT_in_callStatement422); 
            pushFollow(FOLLOW_selector_in_callStatement424);
            selector7=selector();

            state._fsp--;

            result = new IdentChangerNode((IDENT6!=null?IDENT6.getText():null), selector7); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:66:4: ( ':=' expression | ( actualParameters )? )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==EOF||(LA8_0>=23 && LA8_0<=24)||LA8_0==30||(LA8_0>=34 && LA8_0<=35)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:66:5: ':=' expression
                    {
                    match(input,29,FOLLOW_29_in_callStatement442); 
                    pushFollow(FOLLOW_expression_in_callStatement444);
                    expression8=expression();

                    state._fsp--;

                    result = new AssignmentNode(result, expression8); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:67:6: ( actualParameters )?
                    {
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:67:6: ( actualParameters )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==30) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:67:7: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_callStatement463);
                            actualParameters9=actualParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    result = new ProcedureCallNode(result, actualParameters9); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,30,FOLLOW_30_in_actualParameters492); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:8: (e1= expression ( ',' e2= expression )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=PLUS && LA10_0<=MINUS)||(LA10_0>=IDENT && LA10_0<=NUMBER)||LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters497);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:72:5: ( ',' e2= expression )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:72:6: ',' e2= expression
                    	    {
                    	    match(input,28,FOLLOW_28_in_actualParameters516); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters520);
                    	    e2=expression();

                    	    state._fsp--;

                    	    result.add(e2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,31,FOLLOW_31_in_actualParameters547); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:1: ifStatement returns [IInterpretableNode result] : 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e1 = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode elseStatements10 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:2: ( 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:4: 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END'
            {
            match(input,32,FOLLOW_32_in_ifStatement561); 
            pushFollow(FOLLOW_expression_in_ifStatement565);
            e1=expression();

            state._fsp--;

            match(input,33,FOLLOW_33_in_ifStatement567); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement571);
            ss1=statementSequence();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:4: ( elseStatements )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=34 && LA11_0<=35)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:5: elseStatements
                    {
                    pushFollow(FOLLOW_elseStatements_in_ifStatement578);
                    elseStatements10=elseStatements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_ifStatement582); 
            result = new IfNode(e1, ss1, elseStatements10); 

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


    // $ANTLR start "elseStatements"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:81:1: elseStatements returns [IInterpretableNode result] : ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence );
    public final IInterpretableNode elseStatements() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode es = null;

        IInterpretableNode ss2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:2: ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:5: 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )?
                    {
                    match(input,34,FOLLOW_34_in_elseStatements605); 
                    pushFollow(FOLLOW_expression_in_elseStatements609);
                    e=expression();

                    state._fsp--;

                    match(input,33,FOLLOW_33_in_elseStatements611); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements615);
                    ss1=statementSequence();

                    state._fsp--;

                    result = new ElseIfNode(e, ss1, null); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:4: (es= elseStatements )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=34 && LA12_0<=35)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:5: es= elseStatements
                            {
                            pushFollow(FOLLOW_elseStatements_in_elseStatements631);
                            es=elseStatements();

                            state._fsp--;

                            result = new ElseIfNode(e, ss1, es); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:4: 'ELSE' ss2= statementSequence
                    {
                    match(input,35,FOLLOW_35_in_elseStatements651); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements655);
                    ss2=statementSequence();

                    state._fsp--;

                    result = new ElseNode(ss2); 

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
    // $ANTLR end "elseStatements"


    // $ANTLR start "whileStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression11 = null;

        IInterpretableNode statementSequence12 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,36,FOLLOW_36_in_whileStatement679); 
            pushFollow(FOLLOW_expression_in_whileStatement681);
            expression11=expression();

            state._fsp--;

            match(input,37,FOLLOW_37_in_whileStatement683); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement685);
            statementSequence12=statementSequence();

            state._fsp--;

            match(input,24,FOLLOW_24_in_whileStatement687); 
            result = new WhileNode(expression11, statementSequence12); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT13=null;
        List<IInterpretableNode> selector14 = null;

        IInterpretableNode expression15 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:2: ( IDENT selector ':=' expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:4: IDENT selector ':=' expression
            {
            IDENT13=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment707); 
            pushFollow(FOLLOW_selector_in_assignment709);
            selector14=selector();

            state._fsp--;

            result = new IdentChangerNode((IDENT13!=null?IDENT13.getText():null), selector14); 
            match(input,29,FOLLOW_29_in_assignment727); 
            pushFollow(FOLLOW_expression_in_assignment729);
            expression15=expression();

            state._fsp--;

            result = new AssignmentNode(result, expression15); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:97:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:98:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:98:4: s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression755);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:99:4: ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            int alt14=6;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt14=1;
                    }
                    break;
                case LT:
                    {
                    alt14=2;
                    }
                    break;
                case LT_EQ:
                    {
                    alt14=3;
                    }
                    break;
                case GT:
                    {
                    alt14=4;
                    }
                    break;
                case GT_EQ:
                    {
                    alt14=5;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:99:6: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression773); 
                    pushFollow(FOLLOW_simpleExpression_in_expression777);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:6: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression796); 
                    pushFollow(FOLLOW_simpleExpression_in_expression800);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:102:6: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression815); 
                    pushFollow(FOLLOW_simpleExpression_in_expression819);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:103:6: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression834); 
                    pushFollow(FOLLOW_simpleExpression_in_expression838);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:104:6: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression853); 
                    pushFollow(FOLLOW_simpleExpression_in_expression857);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:107:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            int alt16=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt16=1;
                }
                break;
            case MINUS:
                {
                alt16=2;
                }
                break;
            case IDENT:
            case NUMBER:
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression886); 
                    pushFollow(FOLLOW_term_in_simpleExpression890);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression909); 
                    pushFollow(FOLLOW_term_in_simpleExpression913);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression933);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:111:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    loop15:
                    do {
                        int alt15=4;
                        switch ( input.LA(1) ) {
                        case PLUS:
                            {
                            alt15=1;
                            }
                            break;
                        case MINUS:
                            {
                            alt15=2;
                            }
                            break;
                        case OR:
                            {
                            alt15=3;
                            }
                            break;

                        }

                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:111:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression953); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression957);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:112:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression975); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression979);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:113:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression997); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1001);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new OrExprNode(result, t2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1036);
            f1=factor();

            state._fsp--;

            result = f1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:3: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=MULT && LA18_0<=MOD)||LA18_0==AND) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    int alt17=4;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case AND:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:7: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term1058); 
            	            pushFollow(FOLLOW_factor_in_term1062);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:126:6: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term1079); 
            	            pushFollow(FOLLOW_factor_in_term1083);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:127:6: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term1101); 
            	            pushFollow(FOLLOW_factor_in_term1105);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:128:6: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term1123); 
            	            pushFollow(FOLLOW_factor_in_term1127);
            	            f2=factor();

            	            state._fsp--;

            	            result = new AndExprNode(result, f2); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:132:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT16=null;
        Token NUMBER18=null;
        List<IInterpretableNode> selector17 = null;

        IInterpretableNode expression19 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:2: ( IDENT selector | NUMBER | '(' expression ')' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt19=1;
                }
                break;
            case NUMBER:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:5: IDENT selector
                    {
                    IDENT16=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1162); 
                    pushFollow(FOLLOW_selector_in_factor1164);
                    selector17=selector();

                    state._fsp--;

                    result = new IdentReaderNode((IDENT16!=null?IDENT16.getText():null), selector17); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:6: NUMBER
                    {
                    NUMBER18=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1184); 
                    result = new NumberNode(Integer.parseInt((NUMBER18!=null?NUMBER18.getText():null))); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:6: '(' expression ')'
                    {
                    match(input,30,FOLLOW_30_in_factor1204); 
                    pushFollow(FOLLOW_expression_in_factor1206);
                    expression19=expression();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_factor1208); 
                    result = expression19; 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:139:1: selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<IInterpretableNode> selector() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT20=null;
        IInterpretableNode expression21 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:2: ( ( '.' IDENT | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:5: ( '.' IDENT | '[' expression ']' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:5: ( '.' IDENT | '[' expression ']' )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==38) ) {
                    alt20=1;
                }
                else if ( (LA20_0==39) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:6: '.' IDENT
            	    {
            	    match(input,38,FOLLOW_38_in_selector1239); 
            	    IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1241); 
            	    result.add(new DotSelectorNode((IDENT20!=null?IDENT20.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:141:7: '[' expression ']'
            	    {
            	    match(input,39,FOLLOW_39_in_selector1263); 
            	    pushFollow(FOLLOW_expression_in_selector1265);
            	    expression21=expression();

            	    state._fsp--;

            	    match(input,40,FOLLOW_40_in_selector1267); 
            	    result.add(new ElementSelectorNode(expression21)); 

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
        return result;
    }
    // $ANTLR end "selector"

    // Delegated rules


 

    public static final BitSet FOLLOW_statement_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_recordType202 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_fieldList_in_recordType204 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_recordType207 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_fieldList_in_recordType210 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_recordType214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList224 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_fieldList226 = new BitSet(new long[]{0x0000000004410000L});
    public static final BitSet FOLLOW_type_in_fieldList228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_arrayType240 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_arrayType242 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_arrayType244 = new BitSet(new long[]{0x0000000004410000L});
    public static final BitSet FOLLOW_type_in_arrayType246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList255 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_identList258 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_identList260 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_statementList_in_statementSequence275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList302 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_statementList321 = new BitSet(new long[]{0x0000001100810000L});
    public static final BitSet FOLLOW_statement_in_statementList325 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_callStatement_in_statement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_callStatement422 = new BitSet(new long[]{0x000000C060000000L});
    public static final BitSet FOLLOW_selector_in_callStatement424 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_callStatement442 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_callStatement444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_callStatement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_actualParameters492 = new BitSet(new long[]{0x00000000C0030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters497 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_28_in_actualParameters516 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters520 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_31_in_actualParameters547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ifStatement561 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_ifStatement565 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ifStatement567 = new BitSet(new long[]{0x0000001100810000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement571 = new BitSet(new long[]{0x0000000C01000000L});
    public static final BitSet FOLLOW_elseStatements_in_ifStatement578 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ifStatement582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_elseStatements605 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_elseStatements609 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_elseStatements611 = new BitSet(new long[]{0x0000001100810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements615 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_elseStatements_in_elseStatements631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_elseStatements651 = new BitSet(new long[]{0x0000001100810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_whileStatement679 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_whileStatement681 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_whileStatement683 = new BitSet(new long[]{0x0000001100810000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement685 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_whileStatement687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment707 = new BitSet(new long[]{0x000000C020000000L});
    public static final BitSet FOLLOW_selector_in_assignment709 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assignment727 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_assignment729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression755 = new BitSet(new long[]{0x000000000000F202L});
    public static final BitSet FOLLOW_EQUALS_in_expression773 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression796 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression815 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression834 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression853 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression886 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression909 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression933 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression953 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression957 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression975 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression979 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_OR_in_simpleExpression997 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1001 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_factor_in_term1036 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MULT_in_term1058 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_factor_in_term1062 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_DIV_in_term1079 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_factor_in_term1083 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MOD_in_term1101 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_factor_in_term1105 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_AND_in_term1123 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_factor_in_term1127 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_IDENT_in_factor1162 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_selector_in_factor1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_factor1204 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_factor1206 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_factor1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_selector1239 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_selector1241 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_39_in_selector1263 = new BitSet(new long[]{0x0000000040030030L});
    public static final BitSet FOLLOW_expression_in_selector1265 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_selector1267 = new BitSet(new long[]{0x000000C000000002L});

}