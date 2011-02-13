// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-13 01:07:41

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.*;
import nl.bve.uva.oberon.ast.expressions.*;
import nl.bve.uva.oberon.env.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "NOT_EQ", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "NUMBER", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "':'", "'PROCEDURE'", "'('", "')'", "'RECORD'", "'ARRAY'", "'OF'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'['", "']'"
    };
    public static final int EOF=-1;
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
    public static final int T__47=47;
    public static final int PLUS=4;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int DIV=7;
    public static final int MOD=8;
    public static final int EQUALS=9;
    public static final int NOT_EQ=10;
    public static final int OR=11;
    public static final int AND=12;
    public static final int LT=13;
    public static final int LT_EQ=14;
    public static final int GT=15;
    public static final int GT_EQ=16;
    public static final int IDENT=17;
    public static final int NUMBER=18;
    public static final int INTEGER=19;
    public static final int LETTER=20;
    public static final int DIGIT=21;
    public static final int WHITESPACE=22;

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



    // $ANTLR start "module"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:1: module returns [IInterpretableNode result] : 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' ;
    public final IInterpretableNode module() throws RecognitionException {
        IInterpretableNode result = null;

        Token i1=null;
        Token i2=null;
        IInterpretableNode statementSequence1 = null;

        IInterpretableNode declarations2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:2: ( 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:4: 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,23,FOLLOW_23_in_module174); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module178); 
            match(input,24,FOLLOW_24_in_module180); 
            pushFollow(FOLLOW_declarations_in_module182);
            declarations2=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:4: ( 'BEGIN' statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:5: 'BEGIN' statementSequence
                    {
                    match(input,25,FOLLOW_25_in_module189); 
                    pushFollow(FOLLOW_statementSequence_in_module191);
                    statementSequence1=statementSequence();

                    state._fsp--;

                    result = statementSequence1; 

                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_module207); 
            i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module211); 
            match(input,27,FOLLOW_27_in_module213); 
            result = new ModuleNode((i1!=null?i1.getText():null), (i2!=null?i2.getText():null), declarations2, result); 

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
    // $ANTLR end "module"


    // $ANTLR start "declarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:1: declarations returns [IInterpretableNode result] : c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations ;
    public final IInterpretableNode declarations() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> c = null;

        List<IInterpretableNode> t = null;

        List<IInterpretableNode> v = null;

        List<IInterpretableNode> p = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:2: (c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:4: c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations
            {
            pushFollow(FOLLOW_constantDeclarations_in_declarations239);
            c=constantDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_typeDeclarations_in_declarations246);
            t=typeDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_varDeclarations_in_declarations253);
            v=varDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_procedureDeclarations_in_declarations260);
            p=procedureDeclarations();

            state._fsp--;

            result = new DeclarationsNode(c, t, v, p); 

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
    // $ANTLR end "declarations"


    // $ANTLR start "constantDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:1: constantDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'CONST' ( IDENT '=' expression ';' )* )? ;
    public final List<IInterpretableNode> constantDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT3=null;
        IInterpretableNode expression4 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:2: ( ( 'CONST' ( IDENT '=' expression ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:5: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    match(input,28,FOLLOW_28_in_constantDeclarations303); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:4: ( IDENT '=' expression ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:5: IDENT '=' expression ';'
                    	    {
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_constantDeclarations310); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations312); 
                    	    pushFollow(FOLLOW_expression_in_constantDeclarations314);
                    	    expression4=expression();

                    	    state._fsp--;

                    	    match(input,24,FOLLOW_24_in_constantDeclarations316); 
                    	    result.add(new ConstantDeclarationNode((IDENT3!=null?IDENT3.getText():null), expression4)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


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
    // $ANTLR end "constantDeclarations"


    // $ANTLR start "typeDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:1: typeDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'TYPE' ( IDENT '=' type ';' )* )? ;
    public final List<IInterpretableNode> typeDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT5=null;
        IInterpretableNode type6 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:2: ( ( 'TYPE' ( IDENT '=' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:5: 'TYPE' ( IDENT '=' type ';' )*
                    {
                    match(input,29,FOLLOW_29_in_typeDeclarations351); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:4: ( IDENT '=' type ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:5: IDENT '=' type ';'
                    	    {
                    	    IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclarations358); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations360); 
                    	    pushFollow(FOLLOW_type_in_typeDeclarations362);
                    	    type6=type();

                    	    state._fsp--;

                    	    match(input,24,FOLLOW_24_in_typeDeclarations364); 
                    	    result.add(new TypeDeclarationNode((IDENT5!=null?IDENT5.getText():null), type6)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


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
    // $ANTLR end "typeDeclarations"


    // $ANTLR start "varDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:1: varDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'VAR' ( identList ':' type ';' )* )? ;
    public final List<IInterpretableNode> varDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> identList7 = null;

        IInterpretableNode type8 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:2: ( ( 'VAR' ( identList ':' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( 'VAR' ( identList ':' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( 'VAR' ( identList ':' type ';' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:5: 'VAR' ( identList ':' type ';' )*
                    {
                    match(input,30,FOLLOW_30_in_varDeclarations401); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:4: ( identList ':' type ';' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:5: identList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_varDeclarations407);
                    	    identList7=identList();

                    	    state._fsp--;

                    	    match(input,31,FOLLOW_31_in_varDeclarations409); 
                    	    pushFollow(FOLLOW_type_in_varDeclarations411);
                    	    type8=type();

                    	    state._fsp--;

                    	    match(input,24,FOLLOW_24_in_varDeclarations413); 
                    	    result.add(new VarDeclarationNode(identList7, type8)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


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
    // $ANTLR end "varDeclarations"


    // $ANTLR start "procedureDeclarations"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:1: procedureDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* ;
    public final List<IInterpretableNode> procedureDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token i1=null;
        Token i2=null;
        List<TypedParameterList> fp = null;

        IInterpretableNode pb = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:2: ( ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:4: 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';'
            	    {
            	    match(input,32,FOLLOW_32_in_procedureDeclarations452); 
            	    i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations456); 
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:5: (fp= formalParameters )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==33) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:6: fp= formalParameters
            	            {
            	            pushFollow(FOLLOW_formalParameters_in_procedureDeclarations465);
            	            fp=formalParameters();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    match(input,24,FOLLOW_24_in_procedureDeclarations481); 
            	    pushFollow(FOLLOW_procedureBody_in_procedureDeclarations485);
            	    pb=procedureBody();

            	    state._fsp--;

            	    match(input,26,FOLLOW_26_in_procedureDeclarations487); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations491); 
            	    match(input,24,FOLLOW_24_in_procedureDeclarations493); 
            	    result.add(new ProcedureDeclarationNode((i1!=null?i1.getText():null), (i2!=null?i2.getText():null), fp, pb)); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "procedureDeclarations"


    // $ANTLR start "procedureBody"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:76:1: procedureBody returns [IInterpretableNode result] : d= declarations ( 'BEGIN' ss= statementSequence )? ;
    public final IInterpretableNode procedureBody() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode d = null;

        IInterpretableNode ss = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:2: (d= declarations ( 'BEGIN' ss= statementSequence )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:4: d= declarations ( 'BEGIN' ss= statementSequence )?
            {
            pushFollow(FOLLOW_declarations_in_procedureBody518);
            d=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:4: ( 'BEGIN' ss= statementSequence )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:5: 'BEGIN' ss= statementSequence
                    {
                    match(input,25,FOLLOW_25_in_procedureBody525); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody529);
                    ss=statementSequence();

                    state._fsp--;

                    result = ss; 

                    }
                    break;

            }

            result = new ProcedureBodyNode(d, result); 

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
    // $ANTLR end "procedureBody"


    // $ANTLR start "formalParameters"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:1: formalParameters returns [List<TypedParameterList> result = new ArrayList<TypedParameterList>()] : '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' ;
    public final List<TypedParameterList> formalParameters() throws RecognitionException {
        List<TypedParameterList> result =  new ArrayList<TypedParameterList>();

        TypedParameterList fp1 = null;

        TypedParameterList fp2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:2: ( '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:4: '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')'
            {
            match(input,33,FOLLOW_33_in_formalParameters575); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:8: (fp1= fPSection ( ';' fp2= fPSection )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT||LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:9: fp1= fPSection ( ';' fp2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters580);
                    fp1=fPSection();

                    state._fsp--;

                    result.add(fp1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:5: ( ';' fp2= fPSection )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:6: ';' fp2= fPSection
                    	    {
                    	    match(input,24,FOLLOW_24_in_formalParameters599); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters603);
                    	    fp2=fPSection();

                    	    state._fsp--;

                    	    result.add(fp2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_formalParameters627); 

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
    // $ANTLR end "formalParameters"


    // $ANTLR start "fPSection"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:1: fPSection returns [TypedParameterList result] : ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) ;
    public final TypedParameterList fPSection() throws RecognitionException {
        TypedParameterList result = null;

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:2: ( ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==IDENT) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:5: 'VAR' i1= identList ':' t1= type
                    {
                    match(input,30,FOLLOW_30_in_fPSection643); 
                    pushFollow(FOLLOW_identList_in_fPSection647);
                    i1=identList();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_fPSection649); 
                    pushFollow(FOLLOW_type_in_fPSection653);
                    t1=type();

                    state._fsp--;

                    result = new TypedReferenceParameterList(i1, t1); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:4: i2= identList ':' t2= type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection668);
                    i2=identList();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_fPSection670); 
                    pushFollow(FOLLOW_type_in_fPSection674);
                    t2=type();

                    state._fsp--;

                    result = new TypedValueParameterList(i2, t2); 

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
    // $ANTLR end "fPSection"


    // $ANTLR start "type"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:1: type returns [IInterpretableNode result] : ( IDENT | arrayType | recordType );
    public final IInterpretableNode type() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT9=null;
        IInterpretableNode arrayType10 = null;

        IInterpretableNode recordType11 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:2: ( IDENT | arrayType | recordType )
            int alt14=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt14=1;
                }
                break;
            case 36:
                {
                alt14=2;
                }
                break;
            case 35:
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:4: IDENT
                    {
                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_type702); 
                    result = new UserTypeNode((IDENT9!=null?IDENT9.getText():null)); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:97:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type722);
                    arrayType10=arrayType();

                    state._fsp--;

                    result = arrayType10; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:98:4: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type741);
                    recordType11=recordType();

                    state._fsp--;

                    result = recordType11; 

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
    // $ANTLR end "type"


    // $ANTLR start "recordType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:1: recordType returns [IInterpretableNode result] : 'RECORD' fieldLists 'END' ;
    public final IInterpretableNode recordType() throws RecognitionException {
        IInterpretableNode result = null;

        List<TypedFieldListNode> fieldLists12 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:102:2: ( 'RECORD' fieldLists 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:102:4: 'RECORD' fieldLists 'END'
            {
            match(input,35,FOLLOW_35_in_recordType769); 
            pushFollow(FOLLOW_fieldLists_in_recordType771);
            fieldLists12=fieldLists();

            state._fsp--;

            match(input,26,FOLLOW_26_in_recordType773); 
            result = new RecordTypeNode(fieldLists12); 

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
    // $ANTLR end "recordType"


    // $ANTLR start "fieldLists"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:1: fieldLists returns [List<TypedFieldListNode> result = new ArrayList<TypedFieldListNode>()] : (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )* ;
    public final List<TypedFieldListNode> fieldLists() throws RecognitionException {
        List<TypedFieldListNode> result =  new ArrayList<TypedFieldListNode>();

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:2: ( (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:4: (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:4: (i1= identList ':' t1= type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:5: i1= identList ':' t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fieldLists800);
                    i1=identList();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_fieldLists802); 
                    pushFollow(FOLLOW_type_in_fieldLists806);
                    t1=type();

                    state._fsp--;


                    }
                    break;

            }

            result.add(new TypedFieldListNode(i1, t1)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:107:4: ( ';' i2= identList ':' t2= type )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:107:5: ';' i2= identList ':' t2= type
            	    {
            	    match(input,24,FOLLOW_24_in_fieldLists823); 
            	    pushFollow(FOLLOW_identList_in_fieldLists827);
            	    i2=identList();

            	    state._fsp--;

            	    match(input,31,FOLLOW_31_in_fieldLists829); 
            	    pushFollow(FOLLOW_type_in_fieldLists833);
            	    t2=type();

            	    state._fsp--;

            	    result.add(new TypedFieldListNode(i2, t2)); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "fieldLists"


    // $ANTLR start "arrayType"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:111:1: arrayType returns [IInterpretableNode result] : 'ARRAY' expression 'OF' type ;
    public final IInterpretableNode arrayType() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression13 = null;

        IInterpretableNode type14 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:112:2: ( 'ARRAY' expression 'OF' type )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:112:4: 'ARRAY' expression 'OF' type
            {
            match(input,36,FOLLOW_36_in_arrayType862); 
            pushFollow(FOLLOW_expression_in_arrayType864);
            expression13=expression();

            state._fsp--;

            match(input,37,FOLLOW_37_in_arrayType866); 
            pushFollow(FOLLOW_type_in_arrayType868);
            type14=type();

            state._fsp--;

            result = new ArrayTypeNode(expression13, type14); 

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
    // $ANTLR end "arrayType"


    // $ANTLR start "identList"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:115:1: identList returns [List<String> result = new ArrayList<String>()] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> result =  new ArrayList<String>();

        Token i1=null;
        Token i2=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:116:2: (i1= IDENT ( ',' i2= IDENT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:116:4: i1= IDENT ( ',' i2= IDENT )*
            {
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList893); 
            result.add((i1!=null?i1.getText():null)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:4: ( ',' i2= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:5: ',' i2= IDENT
            	    {
            	    match(input,38,FOLLOW_38_in_identList913); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList917); 
            	    result.add((i2!=null?i2.getText():null)); 

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
        return result;
    }
    // $ANTLR end "identList"


    // $ANTLR start "statementSequence"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:121:1: statementSequence returns [IInterpretableNode result] : statementList ;
    public final IInterpretableNode statementSequence() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> statementList15 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:122:2: ( statementList )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:122:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_statementSequence949);
            statementList15=statementList();

            state._fsp--;

            result = new StatementSequenceNode(statementList15); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:1: statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : s1= statement ( ';' s2= statement )* ;
    public final List<IInterpretableNode> statementList() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:2: (s1= statement ( ';' s2= statement )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:4: s1= statement ( ';' s2= statement )*
            {
            pushFollow(FOLLOW_statement_in_statementList976);
            s1=statement();

            state._fsp--;

            result.add(s1); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:126:4: ( ';' s2= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:126:5: ';' s2= statement
            	    {
            	    match(input,24,FOLLOW_24_in_statementList995); 
            	    pushFollow(FOLLOW_statement_in_statementList999);
            	    s2=statement();

            	    state._fsp--;

            	    result.add(s2); 

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
    // $ANTLR end "statementList"


    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:130:1: statement returns [IInterpretableNode result] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode assignment16 = null;

        IInterpretableNode procedureCall17 = null;

        IInterpretableNode ifStatement18 = null;

        IInterpretableNode whileStatement19 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:131:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:131:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:131:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt19=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==27||LA19_1==39||LA19_1==46) ) {
                        alt19=1;
                    }
                    else if ( (LA19_1==24||LA19_1==26||LA19_1==33||(LA19_1>=42 && LA19_1<=43)) ) {
                        alt19=2;
                    }
                    }
                    break;
                case 40:
                    {
                    alt19=3;
                    }
                    break;
                case 44:
                    {
                    alt19=4;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:131:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1032);
                    assignment16=assignment();

                    state._fsp--;

                    result = assignment16; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:132:5: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1050);
                    procedureCall17=procedureCall();

                    state._fsp--;

                    result = procedureCall17; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1068);
                    ifStatement18=ifStatement();

                    state._fsp--;

                    result = ifStatement18; 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1086);
                    whileStatement19=whileStatement();

                    state._fsp--;

                    result = whileStatement19; 

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


    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:138:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT20=null;
        List<IInterpretableNode> selector21 = null;

        IInterpretableNode expression22 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:139:2: ( IDENT selector ':=' expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:139:4: IDENT selector ':=' expression
            {
            IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1117); 
            pushFollow(FOLLOW_selector_in_assignment1119);
            selector21=selector();

            state._fsp--;

            result = new IdentSelectorNode((IDENT20!=null?IDENT20.getText():null), selector21); 
            match(input,39,FOLLOW_39_in_assignment1137); 
            pushFollow(FOLLOW_expression_in_assignment1139);
            expression22=expression();

            state._fsp--;

            result = new AssignmentNode(result, expression22); 

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


    // $ANTLR start "procedureCall"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:143:1: procedureCall returns [IInterpretableNode result] : IDENT ( actualParameters )? ;
    public final IInterpretableNode procedureCall() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT23=null;
        List<IInterpretableNode> actualParameters24 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:144:2: ( IDENT ( actualParameters )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:144:4: IDENT ( actualParameters )?
            {
            IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall1165); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:144:10: ( actualParameters )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:144:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall1168);
                    actualParameters24=actualParameters();

                    state._fsp--;


                    }
                    break;

            }

            result = new ProcedureCallNode((IDENT23!=null?IDENT23.getText():null), actualParameters24); 

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
    // $ANTLR end "procedureCall"


    // $ANTLR start "actualParameters"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:149:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:149:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,33,FOLLOW_33_in_actualParameters1195); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:149:8: (e1= expression ( ',' e2= expression )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=PLUS && LA22_0<=MINUS)||(LA22_0>=IDENT && LA22_0<=NUMBER)||LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:149:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1200);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:150:5: ( ',' e2= expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==38) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:150:6: ',' e2= expression
                    	    {
                    	    match(input,38,FOLLOW_38_in_actualParameters1219); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters1223);
                    	    e2=expression();

                    	    state._fsp--;

                    	    result.add(e2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_actualParameters1250); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:156:1: ifStatement returns [IInterpretableNode result] : 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e1 = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode elseStatements25 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:157:2: ( 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:157:4: 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END'
            {
            match(input,40,FOLLOW_40_in_ifStatement1265); 
            pushFollow(FOLLOW_expression_in_ifStatement1269);
            e1=expression();

            state._fsp--;

            match(input,41,FOLLOW_41_in_ifStatement1271); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1275);
            ss1=statementSequence();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:158:4: ( elseStatements )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=42 && LA23_0<=43)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:158:5: elseStatements
                    {
                    pushFollow(FOLLOW_elseStatements_in_ifStatement1282);
                    elseStatements25=elseStatements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ifStatement1286); 
            result = new IfNode(e1, ss1, elseStatements25); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:161:1: elseStatements returns [IInterpretableNode result] : ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence );
    public final IInterpretableNode elseStatements() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode es = null;

        IInterpretableNode ss2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:162:2: ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            else if ( (LA25_0==43) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:162:5: 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )?
                    {
                    match(input,42,FOLLOW_42_in_elseStatements1311); 
                    pushFollow(FOLLOW_expression_in_elseStatements1315);
                    e=expression();

                    state._fsp--;

                    match(input,41,FOLLOW_41_in_elseStatements1317); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1321);
                    ss1=statementSequence();

                    state._fsp--;

                    result = new ElseIfNode(e, ss1, null); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:163:4: (es= elseStatements )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=42 && LA24_0<=43)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:164:5: es= elseStatements
                            {
                            pushFollow(FOLLOW_elseStatements_in_elseStatements1337);
                            es=elseStatements();

                            state._fsp--;

                            result = new ElseIfNode(e, ss1, es); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:166:4: 'ELSE' ss2= statementSequence
                    {
                    match(input,43,FOLLOW_43_in_elseStatements1357); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1361);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:169:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression26 = null;

        IInterpretableNode statementSequence27 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:170:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:170:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,44,FOLLOW_44_in_whileStatement1384); 
            pushFollow(FOLLOW_expression_in_whileStatement1386);
            expression26=expression();

            state._fsp--;

            match(input,45,FOLLOW_45_in_whileStatement1388); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1390);
            statementSequence27=statementSequence();

            state._fsp--;

            match(input,26,FOLLOW_26_in_whileStatement1392); 
            result = new WhileNode(expression26, statementSequence27); 

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


    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:173:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:174:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:174:4: s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1413);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:175:4: ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            int alt26=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt26=1;
                    }
                    break;
                case NOT_EQ:
                    {
                    alt26=2;
                    }
                    break;
                case LT:
                    {
                    alt26=3;
                    }
                    break;
                case LT_EQ:
                    {
                    alt26=4;
                    }
                    break;
                case GT:
                    {
                    alt26=5;
                    }
                    break;
                case GT_EQ:
                    {
                    alt26=6;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:175:6: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1431); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1435);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:176:6: NOT_EQ s2= simpleExpression
                    {
                    match(input,NOT_EQ,FOLLOW_NOT_EQ_in_expression1449); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1453);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new NotEqualsExprNode(s1, s2); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:177:6: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression1467); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1471);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:178:6: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression1486); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1490);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:179:6: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression1505); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1509);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 6 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:180:6: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression1524); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1528);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:184:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:185:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            int alt28=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt28=1;
                }
                break;
            case MINUS:
                {
                alt28=2;
                }
                break;
            case IDENT:
            case NUMBER:
            case 33:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:185:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1559); 
                    pushFollow(FOLLOW_term_in_simpleExpression1563);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:186:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1582); 
                    pushFollow(FOLLOW_term_in_simpleExpression1586);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:187:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression1606);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    loop27:
                    do {
                        int alt27=4;
                        switch ( input.LA(1) ) {
                        case PLUS:
                            {
                            alt27=1;
                            }
                            break;
                        case MINUS:
                            {
                            alt27=2;
                            }
                            break;
                        case OR:
                            {
                            alt27=3;
                            }
                            break;

                        }

                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1626); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1630);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:189:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1648); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1652);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:190:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression1670); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1674);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new OrExprNode(result, t2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:200:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:201:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:201:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1710);
            f1=factor();

            state._fsp--;

            result = f1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:202:3: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=MULT && LA30_0<=MOD)||LA30_0==AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:202:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:202:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    int alt29=4;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    case AND:
            	        {
            	        alt29=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:202:7: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term1732); 
            	            pushFollow(FOLLOW_factor_in_term1736);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:203:6: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term1753); 
            	            pushFollow(FOLLOW_factor_in_term1757);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:204:6: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term1775); 
            	            pushFollow(FOLLOW_factor_in_term1779);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:205:6: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term1797); 
            	            pushFollow(FOLLOW_factor_in_term1801);
            	            f2=factor();

            	            state._fsp--;

            	            result = new AndExprNode(result, f2); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:210:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT28=null;
        Token NUMBER30=null;
        List<IInterpretableNode> selector29 = null;

        IInterpretableNode expression31 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:211:2: ( IDENT selector | NUMBER | '(' expression ')' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt31=1;
                }
                break;
            case NUMBER:
                {
                alt31=2;
                }
                break;
            case 33:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:211:5: IDENT selector
                    {
                    IDENT28=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1838); 
                    pushFollow(FOLLOW_selector_in_factor1840);
                    selector29=selector();

                    state._fsp--;

                    result = new IdentSelectorNode((IDENT28!=null?IDENT28.getText():null), selector29); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:212:6: NUMBER
                    {
                    NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1860); 
                    result = new NumberNode(Integer.parseInt((NUMBER30!=null?NUMBER30.getText():null))); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:213:6: '(' expression ')'
                    {
                    match(input,33,FOLLOW_33_in_factor1880); 
                    pushFollow(FOLLOW_expression_in_factor1882);
                    expression31=expression();

                    state._fsp--;

                    match(input,34,FOLLOW_34_in_factor1884); 
                    result = expression31; 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:217:1: selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<IInterpretableNode> selector() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT32=null;
        IInterpretableNode expression33 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:218:2: ( ( '.' IDENT | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:218:5: ( '.' IDENT | '[' expression ']' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:218:5: ( '.' IDENT | '[' expression ']' )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==27) ) {
                    alt32=1;
                }
                else if ( (LA32_0==46) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:218:6: '.' IDENT
            	    {
            	    match(input,27,FOLLOW_27_in_selector1913); 
            	    IDENT32=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1915); 
            	    result.add(new DotSelectorNode((IDENT32!=null?IDENT32.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:219:7: '[' expression ']'
            	    {
            	    match(input,46,FOLLOW_46_in_selector1937); 
            	    pushFollow(FOLLOW_expression_in_selector1939);
            	    expression33=expression();

            	    state._fsp--;

            	    match(input,47,FOLLOW_47_in_selector1941); 
            	    result.add(new ElementSelectorNode(expression33)); 

            	    }
            	    break;

            	default :
            	    break loop32;
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


 

    public static final BitSet FOLLOW_23_in_module174 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_module178 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_module180 = new BitSet(new long[]{0x0000000170000000L});
    public static final BitSet FOLLOW_declarations_in_module182 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_module189 = new BitSet(new long[]{0x0000110001020000L});
    public static final BitSet FOLLOW_statementSequence_in_module191 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_module207 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_module211 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_module213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations239 = new BitSet(new long[]{0x0000000160000000L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations246 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations253 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_constantDeclarations303 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENT_in_constantDeclarations310 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations312 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations314 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_constantDeclarations316 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_29_in_typeDeclarations351 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclarations358 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations360 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_type_in_typeDeclarations362 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_typeDeclarations364 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_30_in_varDeclarations401 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations407 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_varDeclarations409 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_type_in_varDeclarations411 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_varDeclarations413 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_32_in_procedureDeclarations452 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations456 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclarations465 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_procedureDeclarations481 = new BitSet(new long[]{0x0000000170000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations485 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_procedureDeclarations487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations491 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_procedureDeclarations493 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody518 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_procedureBody525 = new BitSet(new long[]{0x0000110001020000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_formalParameters575 = new BitSet(new long[]{0x0000000440020000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters580 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_formalParameters599 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters603 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_formalParameters627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_fPSection643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identList_in_fPSection647 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fPSection649 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_type_in_fPSection653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection668 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fPSection670 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_type_in_fPSection674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_recordType769 = new BitSet(new long[]{0x0000000005020000L});
    public static final BitSet FOLLOW_fieldLists_in_recordType771 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_recordType773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldLists800 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fieldLists802 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_type_in_fieldLists806 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_fieldLists823 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identList_in_fieldLists827 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fieldLists829 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_type_in_fieldLists833 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_36_in_arrayType862 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_arrayType864 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_arrayType866 = new BitSet(new long[]{0x0000001800020000L});
    public static final BitSet FOLLOW_type_in_arrayType868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList893 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_identList913 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_identList917 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_statementList_in_statementSequence949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList976 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_statementList995 = new BitSet(new long[]{0x0000110001020000L});
    public static final BitSet FOLLOW_statement_in_statementList999 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_assignment_in_statement1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1117 = new BitSet(new long[]{0x0000408008000000L});
    public static final BitSet FOLLOW_selector_in_assignment1119 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_assignment1137 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_assignment1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall1165 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_actualParameters1195 = new BitSet(new long[]{0x0000000600060030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1200 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_38_in_actualParameters1219 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1223 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_34_in_actualParameters1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ifStatement1265 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_ifStatement1269 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifStatement1271 = new BitSet(new long[]{0x0000110001020000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1275 = new BitSet(new long[]{0x00000C0004000000L});
    public static final BitSet FOLLOW_elseStatements_in_ifStatement1282 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ifStatement1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elseStatements1311 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_elseStatements1315 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_elseStatements1317 = new BitSet(new long[]{0x0000110001020000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1321 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_elseStatements_in_elseStatements1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_elseStatements1357 = new BitSet(new long[]{0x0000110001020000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_whileStatement1384 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_whileStatement1386 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_whileStatement1388 = new BitSet(new long[]{0x0000110001020000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1390 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_whileStatement1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1413 = new BitSet(new long[]{0x000000000001E602L});
    public static final BitSet FOLLOW_EQUALS_in_expression1431 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQ_in_expression1449 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression1467 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression1486 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression1505 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression1524 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1559 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1582 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1606 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1626 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1630 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1648 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1652 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1670 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1674 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_factor_in_term1710 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_MULT_in_term1732 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1736 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_DIV_in_term1753 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1757 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_MOD_in_term1775 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1779 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_AND_in_term1797 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1801 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_IDENT_in_factor1838 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_selector_in_factor1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor1880 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_factor1882 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_factor1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_selector1913 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_selector1915 = new BitSet(new long[]{0x0000400008000002L});
    public static final BitSet FOLLOW_46_in_selector1937 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_selector1939 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_selector1941 = new BitSet(new long[]{0x0000400008000002L});

}