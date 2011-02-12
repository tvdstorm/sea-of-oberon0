// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-12 22:07:08

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "NUMBER", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "':'", "'PROCEDURE'", "'('", "')'", "'RECORD'", "'ARRAY'", "'OF'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'['", "']'"
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
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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



    // $ANTLR start "module"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:1: module returns [IInterpretableNode result] : 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' ;
    public final IInterpretableNode module() throws RecognitionException {
        IInterpretableNode result = null;

        Token i1=null;
        Token i2=null;
        IInterpretableNode statementSequence1 = null;

        IInterpretableNode declarations2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:2: ( 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:4: 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,22,FOLLOW_22_in_module163); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module167); 
            match(input,23,FOLLOW_23_in_module169); 
            pushFollow(FOLLOW_declarations_in_module171);
            declarations2=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:4: ( 'BEGIN' statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:5: 'BEGIN' statementSequence
                    {
                    match(input,24,FOLLOW_24_in_module178); 
                    pushFollow(FOLLOW_statementSequence_in_module180);
                    statementSequence1=statementSequence();

                    state._fsp--;

                    result = statementSequence1; 

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_module196); 
            i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module200); 
            match(input,26,FOLLOW_26_in_module202); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:40:1: declarations returns [IInterpretableNode result] : c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations ;
    public final IInterpretableNode declarations() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> c = null;

        List<IInterpretableNode> t = null;

        List<IInterpretableNode> v = null;

        List<IInterpretableNode> p = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:2: (c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:4: c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations
            {
            pushFollow(FOLLOW_constantDeclarations_in_declarations228);
            c=constantDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_typeDeclarations_in_declarations235);
            t=typeDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_varDeclarations_in_declarations242);
            v=varDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_procedureDeclarations_in_declarations249);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:47:1: constantDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'CONST' ( IDENT '=' expression ';' )* )? ;
    public final List<IInterpretableNode> constantDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT3=null;
        IInterpretableNode expression4 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:2: ( ( 'CONST' ( IDENT '=' expression ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:5: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    match(input,27,FOLLOW_27_in_constantDeclarations292); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:4: ( IDENT '=' expression ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:5: IDENT '=' expression ';'
                    	    {
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_constantDeclarations299); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations301); 
                    	    pushFollow(FOLLOW_expression_in_constantDeclarations303);
                    	    expression4=expression();

                    	    state._fsp--;

                    	    match(input,23,FOLLOW_23_in_constantDeclarations305); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:54:1: typeDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'TYPE' ( IDENT '=' type ';' )* )? ;
    public final List<IInterpretableNode> typeDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT5=null;
        IInterpretableNode type6 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:2: ( ( 'TYPE' ( IDENT '=' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:5: 'TYPE' ( IDENT '=' type ';' )*
                    {
                    match(input,28,FOLLOW_28_in_typeDeclarations340); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:4: ( IDENT '=' type ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:5: IDENT '=' type ';'
                    	    {
                    	    IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclarations347); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations349); 
                    	    pushFollow(FOLLOW_type_in_typeDeclarations351);
                    	    type6=type();

                    	    state._fsp--;

                    	    match(input,23,FOLLOW_23_in_typeDeclarations353); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:61:1: varDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'VAR' ( identList ':' type ';' )* )? ;
    public final List<IInterpretableNode> varDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> identList7 = null;

        IInterpretableNode type8 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:2: ( ( 'VAR' ( identList ':' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:4: ( 'VAR' ( identList ':' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:4: ( 'VAR' ( identList ':' type ';' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:5: 'VAR' ( identList ':' type ';' )*
                    {
                    match(input,29,FOLLOW_29_in_varDeclarations390); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( identList ':' type ';' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:5: identList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_varDeclarations396);
                    	    identList7=identList();

                    	    state._fsp--;

                    	    match(input,30,FOLLOW_30_in_varDeclarations398); 
                    	    pushFollow(FOLLOW_type_in_varDeclarations400);
                    	    type8=type();

                    	    state._fsp--;

                    	    match(input,23,FOLLOW_23_in_varDeclarations402); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:67:1: procedureDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* ;
    public final List<IInterpretableNode> procedureDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token i1=null;
        Token i2=null;
        List<TypedParameterList> fp = null;

        IInterpretableNode pb = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:2: ( ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:4: 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';'
            	    {
            	    match(input,31,FOLLOW_31_in_procedureDeclarations441); 
            	    i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations445); 
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:5: (fp= formalParameters )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==32) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:6: fp= formalParameters
            	            {
            	            pushFollow(FOLLOW_formalParameters_in_procedureDeclarations454);
            	            fp=formalParameters();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    match(input,23,FOLLOW_23_in_procedureDeclarations470); 
            	    pushFollow(FOLLOW_procedureBody_in_procedureDeclarations474);
            	    pb=procedureBody();

            	    state._fsp--;

            	    match(input,25,FOLLOW_25_in_procedureDeclarations476); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations480); 
            	    match(input,23,FOLLOW_23_in_procedureDeclarations482); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:75:1: procedureBody returns [IInterpretableNode result] : d= declarations ( 'BEGIN' ss= statementSequence )? ;
    public final IInterpretableNode procedureBody() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode d = null;

        IInterpretableNode ss = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:76:2: (d= declarations ( 'BEGIN' ss= statementSequence )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:76:4: d= declarations ( 'BEGIN' ss= statementSequence )?
            {
            pushFollow(FOLLOW_declarations_in_procedureBody507);
            d=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:4: ( 'BEGIN' ss= statementSequence )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:5: 'BEGIN' ss= statementSequence
                    {
                    match(input,24,FOLLOW_24_in_procedureBody514); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody518);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:81:1: formalParameters returns [List<TypedParameterList> result = new ArrayList<TypedParameterList>()] : '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' ;
    public final List<TypedParameterList> formalParameters() throws RecognitionException {
        List<TypedParameterList> result =  new ArrayList<TypedParameterList>();

        TypedParameterList fp1 = null;

        TypedParameterList fp2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:2: ( '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:4: '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')'
            {
            match(input,32,FOLLOW_32_in_formalParameters564); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:8: (fp1= fPSection ( ';' fp2= fPSection )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT||LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:9: fp1= fPSection ( ';' fp2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters569);
                    fp1=fPSection();

                    state._fsp--;

                    result.add(fp1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:5: ( ';' fp2= fPSection )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:6: ';' fp2= fPSection
                    	    {
                    	    match(input,23,FOLLOW_23_in_formalParameters588); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters592);
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

            match(input,33,FOLLOW_33_in_formalParameters616); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:88:1: fPSection returns [TypedParameterList result] : ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) ;
    public final TypedParameterList fPSection() throws RecognitionException {
        TypedParameterList result = null;

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:2: ( ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:5: 'VAR' i1= identList ':' t1= type
                    {
                    match(input,29,FOLLOW_29_in_fPSection632); 
                    pushFollow(FOLLOW_identList_in_fPSection636);
                    i1=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fPSection638); 
                    pushFollow(FOLLOW_type_in_fPSection642);
                    t1=type();

                    state._fsp--;

                    result = new TypedReferenceParameterList(i1, t1); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:4: i2= identList ':' t2= type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection657);
                    i2=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fPSection659); 
                    pushFollow(FOLLOW_type_in_fPSection663);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:1: type returns [IInterpretableNode result] : ( IDENT | arrayType | recordType );
    public final IInterpretableNode type() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT9=null;
        IInterpretableNode arrayType10 = null;

        IInterpretableNode recordType11 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:2: ( IDENT | arrayType | recordType )
            int alt14=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt14=1;
                }
                break;
            case 35:
                {
                alt14=2;
                }
                break;
            case 34:
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:4: IDENT
                    {
                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_type691); 
                    result = new UserTypeNode((IDENT9!=null?IDENT9.getText():null)); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type711);
                    arrayType10=arrayType();

                    state._fsp--;

                    result = arrayType10; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:97:4: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type730);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:100:1: recordType returns [IInterpretableNode result] : 'RECORD' fieldLists 'END' ;
    public final IInterpretableNode recordType() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> fieldLists12 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:2: ( 'RECORD' fieldLists 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:4: 'RECORD' fieldLists 'END'
            {
            match(input,34,FOLLOW_34_in_recordType758); 
            pushFollow(FOLLOW_fieldLists_in_recordType760);
            fieldLists12=fieldLists();

            state._fsp--;

            match(input,25,FOLLOW_25_in_recordType762); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:104:1: fieldLists returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )* ;
    public final List<IInterpretableNode> fieldLists() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:2: ( (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:4: (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:4: (i1= identList ':' t1= type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:5: i1= identList ':' t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fieldLists789);
                    i1=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fieldLists791); 
                    pushFollow(FOLLOW_type_in_fieldLists795);
                    t1=type();

                    state._fsp--;


                    }
                    break;

            }

            result.add(new TypedFieldListNode(i1, t1)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:4: ( ';' (i2= identList ':' t2= type ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:5: ';' (i2= identList ':' t2= type )
            	    {
            	    match(input,23,FOLLOW_23_in_fieldLists812); 
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:9: (i2= identList ':' t2= type )
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:10: i2= identList ':' t2= type
            	    {
            	    pushFollow(FOLLOW_identList_in_fieldLists817);
            	    i2=identList();

            	    state._fsp--;

            	    match(input,30,FOLLOW_30_in_fieldLists819); 
            	    pushFollow(FOLLOW_type_in_fieldLists823);
            	    t2=type();

            	    state._fsp--;


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            result.add(new TypedFieldListNode(i2, t2)); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:1: arrayType returns [IInterpretableNode result] : 'ARRAY' expression 'OF' type ;
    public final IInterpretableNode arrayType() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression13 = null;

        IInterpretableNode type14 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:2: ( 'ARRAY' expression 'OF' type )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:4: 'ARRAY' expression 'OF' type
            {
            match(input,35,FOLLOW_35_in_arrayType848); 
            pushFollow(FOLLOW_expression_in_arrayType850);
            expression13=expression();

            state._fsp--;

            match(input,36,FOLLOW_36_in_arrayType852); 
            pushFollow(FOLLOW_type_in_arrayType854);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:113:1: identList returns [List<String> result = new ArrayList<String>()] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> result =  new ArrayList<String>();

        Token i1=null;
        Token i2=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:114:2: (i1= IDENT ( ',' i2= IDENT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:114:4: i1= IDENT ( ',' i2= IDENT )*
            {
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList879); 
            result.add((i1!=null?i1.getText():null)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:115:4: ( ',' i2= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:115:5: ',' i2= IDENT
            	    {
            	    match(input,37,FOLLOW_37_in_identList899); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList903); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:1: statementSequence returns [IInterpretableNode result] : statementList ;
    public final IInterpretableNode statementSequence() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> statementList15 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:2: ( statementList )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_statementSequence935);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:122:1: statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : s1= statement ( ';' s2= statement )* ;
    public final List<IInterpretableNode> statementList() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:2: (s1= statement ( ';' s2= statement )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:4: s1= statement ( ';' s2= statement )*
            {
            pushFollow(FOLLOW_statement_in_statementList962);
            s1=statement();

            state._fsp--;

            result.add(s1); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:4: ( ';' s2= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:5: ';' s2= statement
            	    {
            	    match(input,23,FOLLOW_23_in_statementList981); 
            	    pushFollow(FOLLOW_statement_in_statementList985);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:128:1: statement returns [IInterpretableNode result] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode assignment16 = null;

        IInterpretableNode procedureCall17 = null;

        IInterpretableNode ifStatement18 = null;

        IInterpretableNode whileStatement19 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:129:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:129:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:129:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            int alt19=5;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==26||LA19_1==38||LA19_1==45) ) {
                        alt19=1;
                    }
                    else if ( (LA19_1==23||LA19_1==25||LA19_1==32||(LA19_1>=41 && LA19_1<=42)) ) {
                        alt19=2;
                    }
                    }
                    break;
                case 39:
                    {
                    alt19=3;
                    }
                    break;
                case 43:
                    {
                    alt19=4;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:129:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1018);
                    assignment16=assignment();

                    state._fsp--;

                    result = assignment16; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:130:5: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1036);
                    procedureCall17=procedureCall();

                    state._fsp--;

                    result = procedureCall17; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:131:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1054);
                    ifStatement18=ifStatement();

                    state._fsp--;

                    result = ifStatement18; 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:132:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1072);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:136:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT20=null;
        List<IInterpretableNode> selector21 = null;

        IInterpretableNode expression22 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:137:2: ( IDENT selector ':=' expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:137:4: IDENT selector ':=' expression
            {
            IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1103); 
            pushFollow(FOLLOW_selector_in_assignment1105);
            selector21=selector();

            state._fsp--;

            result = new IdentSelectorNode((IDENT20!=null?IDENT20.getText():null), selector21); 
            match(input,38,FOLLOW_38_in_assignment1123); 
            pushFollow(FOLLOW_expression_in_assignment1125);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:141:1: procedureCall returns [IInterpretableNode result] : IDENT ( actualParameters )? ;
    public final IInterpretableNode procedureCall() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT23=null;
        List<IInterpretableNode> actualParameters24 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:2: ( IDENT ( actualParameters )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:4: IDENT ( actualParameters )?
            {
            IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall1151); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:10: ( actualParameters )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall1154);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:146:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,32,FOLLOW_32_in_actualParameters1181); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:8: (e1= expression ( ',' e2= expression )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=PLUS && LA22_0<=MINUS)||(LA22_0>=IDENT && LA22_0<=NUMBER)||LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1186);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:5: ( ',' e2= expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==37) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:6: ',' e2= expression
                    	    {
                    	    match(input,37,FOLLOW_37_in_actualParameters1205); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters1209);
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

            match(input,33,FOLLOW_33_in_actualParameters1236); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:1: ifStatement returns [IInterpretableNode result] : 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e1 = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode elseStatements25 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:155:2: ( 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:155:4: 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifStatement1251); 
            pushFollow(FOLLOW_expression_in_ifStatement1255);
            e1=expression();

            state._fsp--;

            match(input,40,FOLLOW_40_in_ifStatement1257); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1261);
            ss1=statementSequence();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:156:4: ( elseStatements )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=41 && LA23_0<=42)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:156:5: elseStatements
                    {
                    pushFollow(FOLLOW_elseStatements_in_ifStatement1268);
                    elseStatements25=elseStatements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ifStatement1272); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:1: elseStatements returns [IInterpretableNode result] : ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence );
    public final IInterpretableNode elseStatements() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode es = null;

        IInterpretableNode ss2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:160:2: ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            else if ( (LA25_0==42) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:160:5: 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )?
                    {
                    match(input,41,FOLLOW_41_in_elseStatements1297); 
                    pushFollow(FOLLOW_expression_in_elseStatements1301);
                    e=expression();

                    state._fsp--;

                    match(input,40,FOLLOW_40_in_elseStatements1303); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1307);
                    ss1=statementSequence();

                    state._fsp--;

                    result = new ElseIfNode(e, ss1, null); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:161:4: (es= elseStatements )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=41 && LA24_0<=42)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:162:5: es= elseStatements
                            {
                            pushFollow(FOLLOW_elseStatements_in_elseStatements1323);
                            es=elseStatements();

                            state._fsp--;

                            result = new ElseIfNode(e, ss1, es); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:164:4: 'ELSE' ss2= statementSequence
                    {
                    match(input,42,FOLLOW_42_in_elseStatements1343); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1347);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:167:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression26 = null;

        IInterpretableNode statementSequence27 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:168:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:168:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,43,FOLLOW_43_in_whileStatement1370); 
            pushFollow(FOLLOW_expression_in_whileStatement1372);
            expression26=expression();

            state._fsp--;

            match(input,44,FOLLOW_44_in_whileStatement1374); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1376);
            statementSequence27=statementSequence();

            state._fsp--;

            match(input,25,FOLLOW_25_in_whileStatement1378); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:171:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:172:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:172:4: s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1399);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:173:4: ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            int alt26=6;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt26=1;
                    }
                    break;
                case LT:
                    {
                    alt26=2;
                    }
                    break;
                case LT_EQ:
                    {
                    alt26=3;
                    }
                    break;
                case GT:
                    {
                    alt26=4;
                    }
                    break;
                case GT_EQ:
                    {
                    alt26=5;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:173:6: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1417); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1421);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:175:6: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression1440); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1444);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:176:6: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression1459); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1463);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:177:6: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression1478); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1482);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:178:6: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression1497); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1501);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:182:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:183:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
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
            case 32:
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:183:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1532); 
                    pushFollow(FOLLOW_term_in_simpleExpression1536);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:184:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1555); 
                    pushFollow(FOLLOW_term_in_simpleExpression1559);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:185:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression1579);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:186:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
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
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:186:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1599); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1603);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:187:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1621); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1625);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression1643); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1647);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:198:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:199:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:199:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1683);
            f1=factor();

            state._fsp--;

            result = f1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:200:3: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=MULT && LA30_0<=MOD)||LA30_0==AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:200:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:200:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
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
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:200:7: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term1705); 
            	            pushFollow(FOLLOW_factor_in_term1709);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:201:6: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term1726); 
            	            pushFollow(FOLLOW_factor_in_term1730);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:202:6: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term1748); 
            	            pushFollow(FOLLOW_factor_in_term1752);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:203:6: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term1770); 
            	            pushFollow(FOLLOW_factor_in_term1774);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:208:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT28=null;
        Token NUMBER30=null;
        List<IInterpretableNode> selector29 = null;

        IInterpretableNode expression31 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:209:2: ( IDENT selector | NUMBER | '(' expression ')' )
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
            case 32:
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:209:5: IDENT selector
                    {
                    IDENT28=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1811); 
                    pushFollow(FOLLOW_selector_in_factor1813);
                    selector29=selector();

                    state._fsp--;

                    result = new IdentSelectorNode((IDENT28!=null?IDENT28.getText():null), selector29); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:210:6: NUMBER
                    {
                    NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1833); 
                    result = new NumberNode(Integer.parseInt((NUMBER30!=null?NUMBER30.getText():null))); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:211:6: '(' expression ')'
                    {
                    match(input,32,FOLLOW_32_in_factor1853); 
                    pushFollow(FOLLOW_expression_in_factor1855);
                    expression31=expression();

                    state._fsp--;

                    match(input,33,FOLLOW_33_in_factor1857); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:215:1: selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<IInterpretableNode> selector() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT32=null;
        IInterpretableNode expression33 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:2: ( ( '.' IDENT | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:5: ( '.' IDENT | '[' expression ']' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:5: ( '.' IDENT | '[' expression ']' )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }
                else if ( (LA32_0==45) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:6: '.' IDENT
            	    {
            	    match(input,26,FOLLOW_26_in_selector1886); 
            	    IDENT32=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1888); 
            	    result.add(new DotSelectorNode((IDENT32!=null?IDENT32.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:217:7: '[' expression ']'
            	    {
            	    match(input,45,FOLLOW_45_in_selector1910); 
            	    pushFollow(FOLLOW_expression_in_selector1912);
            	    expression33=expression();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_selector1914); 
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


 

    public static final BitSet FOLLOW_22_in_module163 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_module167 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_module169 = new BitSet(new long[]{0x00000000B8000000L});
    public static final BitSet FOLLOW_declarations_in_module171 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_module178 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_module180 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_module196 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_module200 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_module202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations228 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations235 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations242 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_constantDeclarations292 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IDENT_in_constantDeclarations299 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations301 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations303 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_constantDeclarations305 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_28_in_typeDeclarations340 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclarations347 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations349 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_typeDeclarations351 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_typeDeclarations353 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_29_in_varDeclarations390 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations396 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_varDeclarations398 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_varDeclarations400 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_varDeclarations402 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_31_in_procedureDeclarations441 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations445 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclarations454 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_procedureDeclarations470 = new BitSet(new long[]{0x00000000B8000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations474 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_procedureDeclarations476 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations480 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_procedureDeclarations482 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody507 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_procedureBody514 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_formalParameters564 = new BitSet(new long[]{0x0000000220010000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters569 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23_in_formalParameters588 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters592 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_33_in_formalParameters616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_fPSection632 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_identList_in_fPSection636 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fPSection638 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fPSection642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection657 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fPSection659 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fPSection663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_recordType758 = new BitSet(new long[]{0x0000000002810000L});
    public static final BitSet FOLLOW_fieldLists_in_recordType760 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_recordType762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldLists789 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fieldLists791 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fieldLists795 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_fieldLists812 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_identList_in_fieldLists817 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fieldLists819 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fieldLists823 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_35_in_arrayType848 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_arrayType850 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_arrayType852 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_arrayType854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList879 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identList899 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_identList903 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statementList_in_statementSequence935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList962 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_statementList981 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statement_in_statementList985 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_assignment_in_statement1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1103 = new BitSet(new long[]{0x0000204004000000L});
    public static final BitSet FOLLOW_selector_in_assignment1105 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment1123 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_assignment1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall1151 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_actualParameters1181 = new BitSet(new long[]{0x0000000300030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1186 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_37_in_actualParameters1205 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1209 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_33_in_actualParameters1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifStatement1251 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_ifStatement1255 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement1257 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1261 = new BitSet(new long[]{0x0000060002000000L});
    public static final BitSet FOLLOW_elseStatements_in_ifStatement1268 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ifStatement1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elseStatements1297 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_elseStatements1301 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elseStatements1303 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1307 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_elseStatements_in_elseStatements1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elseStatements1343 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whileStatement1370 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_whileStatement1372 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whileStatement1374 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1376 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_whileStatement1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1399 = new BitSet(new long[]{0x000000000000F202L});
    public static final BitSet FOLLOW_EQUALS_in_expression1417 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression1440 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression1459 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression1478 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression1497 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1532 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1555 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1579 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1599 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1603 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1621 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1625 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1643 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1647 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_factor_in_term1683 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MULT_in_term1705 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1709 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_DIV_in_term1726 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1730 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MOD_in_term1748 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1752 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_AND_in_term1770 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1774 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_IDENT_in_factor1811 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_selector_in_factor1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_factor1853 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_factor1855 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_factor1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_selector1886 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_selector1888 = new BitSet(new long[]{0x0000200004000002L});
    public static final BitSet FOLLOW_45_in_selector1910 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_selector1912 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_selector1914 = new BitSet(new long[]{0x0000200004000002L});

}