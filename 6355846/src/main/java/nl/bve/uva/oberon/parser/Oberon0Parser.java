// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-14 01:37:37

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.*;
import nl.bve.uva.oberon.ast.expressions.*;
import nl.bve.uva.oberon.env.*;
import nl.bve.uva.oberon.shared.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "NOT_EQ", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "NUMBER", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "':'", "'PROCEDURE'", "'('", "')'", "'INTEGER'", "'RECORD'", "'ARRAY'", "'OF'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'['", "']'"
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
    public static final int T__48=48;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:1: module returns [IInterpretableNode result] : 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' ;
    public final IInterpretableNode module() throws RecognitionException {
        IInterpretableNode result = null;

        Token i1=null;
        Token i2=null;
        IInterpretableNode statementSequence1 = null;

        IInterpretableNode declarations2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:2: ( 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:4: 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,23,FOLLOW_23_in_module174); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module178); 
            match(input,24,FOLLOW_24_in_module180); 
            pushFollow(FOLLOW_declarations_in_module182);
            declarations2=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:4: ( 'BEGIN' statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:5: 'BEGIN' statementSequence
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:1: declarations returns [IInterpretableNode result] : c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations ;
    public final IInterpretableNode declarations() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> c = null;

        List<IInterpretableNode> t = null;

        List<IInterpretableNode> v = null;

        List<IInterpretableNode> p = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:2: (c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:4: c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:1: constantDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'CONST' ( IDENT '=' expression ';' )* )? ;
    public final List<IInterpretableNode> constantDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT3=null;
        IInterpretableNode expression4 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:2: ( ( 'CONST' ( IDENT '=' expression ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:5: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    match(input,28,FOLLOW_28_in_constantDeclarations303); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:4: ( IDENT '=' expression ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:5: IDENT '=' expression ';'
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:1: typeDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'TYPE' ( IDENT '=' type ';' )* )? ;
    public final List<IInterpretableNode> typeDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT5=null;
        IInterpretableNode type6 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:2: ( ( 'TYPE' ( IDENT '=' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:5: 'TYPE' ( IDENT '=' type ';' )*
                    {
                    match(input,29,FOLLOW_29_in_typeDeclarations351); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:4: ( IDENT '=' type ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:5: IDENT '=' type ';'
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:1: varDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'VAR' ( identList ':' type ';' )* )? ;
    public final List<IInterpretableNode> varDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> identList7 = null;

        IInterpretableNode type8 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:2: ( ( 'VAR' ( identList ':' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:4: ( 'VAR' ( identList ':' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:4: ( 'VAR' ( identList ':' type ';' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:5: 'VAR' ( identList ':' type ';' )*
                    {
                    match(input,30,FOLLOW_30_in_varDeclarations401); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:4: ( identList ':' type ';' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:5: identList ':' type ';'
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:1: procedureDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* ;
    public final List<IInterpretableNode> procedureDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token i1=null;
        Token i2=null;
        List<TypedParameterList> fp = null;

        IInterpretableNode pb = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:2: ( ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:4: 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';'
            	    {
            	    match(input,32,FOLLOW_32_in_procedureDeclarations452); 
            	    i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations456); 
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:72:5: (fp= formalParameters )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==33) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:72:6: fp= formalParameters
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:1: procedureBody returns [IInterpretableNode result] : d= declarations ( 'BEGIN' ss= statementSequence )? ;
    public final IInterpretableNode procedureBody() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode d = null;

        IInterpretableNode ss = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:2: (d= declarations ( 'BEGIN' ss= statementSequence )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:4: d= declarations ( 'BEGIN' ss= statementSequence )?
            {
            pushFollow(FOLLOW_declarations_in_procedureBody518);
            d=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:4: ( 'BEGIN' ss= statementSequence )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:5: 'BEGIN' ss= statementSequence
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:1: formalParameters returns [List<TypedParameterList> result = new ArrayList<TypedParameterList>()] : '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' ;
    public final List<TypedParameterList> formalParameters() throws RecognitionException {
        List<TypedParameterList> result =  new ArrayList<TypedParameterList>();

        TypedParameterList fp1 = null;

        TypedParameterList fp2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:2: ( '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:4: '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')'
            {
            match(input,33,FOLLOW_33_in_formalParameters575); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:8: (fp1= fPSection ( ';' fp2= fPSection )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT||LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:9: fp1= fPSection ( ';' fp2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters580);
                    fp1=fPSection();

                    state._fsp--;

                    result.add(fp1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:5: ( ';' fp2= fPSection )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:6: ';' fp2= fPSection
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:90:1: fPSection returns [TypedParameterList result] : ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) ;
    public final TypedParameterList fPSection() throws RecognitionException {
        TypedParameterList result = null;

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:2: ( ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:5: 'VAR' i1= identList ':' t1= type
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:4: i2= identList ':' t2= type
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:1: type returns [IInterpretableNode result] : ( 'INTEGER' | IDENT | arrayType | recordType );
    public final IInterpretableNode type() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT9=null;
        IInterpretableNode arrayType10 = null;

        IInterpretableNode recordType11 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:97:2: ( 'INTEGER' | IDENT | arrayType | recordType )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt14=1;
                }
                break;
            case IDENT:
                {
                alt14=2;
                }
                break;
            case 37:
                {
                alt14=3;
                }
                break;
            case 36:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:97:4: 'INTEGER'
                    {
                    match(input,35,FOLLOW_35_in_type702); 
                    result = new IntegerTypeNode(); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:98:4: IDENT
                    {
                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_type721); 
                    result = new UserTypeNode((IDENT9!=null?IDENT9.getText():null)); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:99:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type741);
                    arrayType10=arrayType();

                    state._fsp--;

                    result = arrayType10; 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:100:4: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type760);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:103:1: recordType returns [IInterpretableNode result] : 'RECORD' fieldLists 'END' ;
    public final IInterpretableNode recordType() throws RecognitionException {
        IInterpretableNode result = null;

        List<TypedFieldListNode> fieldLists12 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:104:2: ( 'RECORD' fieldLists 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:104:4: 'RECORD' fieldLists 'END'
            {
            match(input,36,FOLLOW_36_in_recordType788); 
            pushFollow(FOLLOW_fieldLists_in_recordType790);
            fieldLists12=fieldLists();

            state._fsp--;

            match(input,26,FOLLOW_26_in_recordType792); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:107:1: fieldLists returns [List<TypedFieldListNode> result = new ArrayList<TypedFieldListNode>()] : (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )* ;
    public final List<TypedFieldListNode> fieldLists() throws RecognitionException {
        List<TypedFieldListNode> result =  new ArrayList<TypedFieldListNode>();

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:2: ( (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:4: (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:4: (i1= identList ':' t1= type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:5: i1= identList ':' t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fieldLists819);
                    i1=identList();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_fieldLists821); 
                    pushFollow(FOLLOW_type_in_fieldLists825);
                    t1=type();

                    state._fsp--;


                    }
                    break;

            }

            result.add(new TypedFieldListNode(i1, t1)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:4: ( ';' i2= identList ':' t2= type )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:5: ';' i2= identList ':' t2= type
            	    {
            	    match(input,24,FOLLOW_24_in_fieldLists842); 
            	    pushFollow(FOLLOW_identList_in_fieldLists846);
            	    i2=identList();

            	    state._fsp--;

            	    match(input,31,FOLLOW_31_in_fieldLists848); 
            	    pushFollow(FOLLOW_type_in_fieldLists852);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:113:1: arrayType returns [IInterpretableNode result] : 'ARRAY' expression 'OF' type ;
    public final IInterpretableNode arrayType() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression13 = null;

        IInterpretableNode type14 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:114:2: ( 'ARRAY' expression 'OF' type )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:114:4: 'ARRAY' expression 'OF' type
            {
            match(input,37,FOLLOW_37_in_arrayType881); 
            pushFollow(FOLLOW_expression_in_arrayType883);
            expression13=expression();

            state._fsp--;

            match(input,38,FOLLOW_38_in_arrayType885); 
            pushFollow(FOLLOW_type_in_arrayType887);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:1: identList returns [List<String> result = new ArrayList<String>()] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> result =  new ArrayList<String>();

        Token i1=null;
        Token i2=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:118:2: (i1= IDENT ( ',' i2= IDENT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:118:4: i1= IDENT ( ',' i2= IDENT )*
            {
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList912); 
            result.add((i1!=null?i1.getText():null)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:4: ( ',' i2= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:5: ',' i2= IDENT
            	    {
            	    match(input,39,FOLLOW_39_in_identList932); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList936); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:1: statementSequence returns [IInterpretableNode result] : statementList ;
    public final IInterpretableNode statementSequence() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> statementList15 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:2: ( statementList )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_statementSequence968);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:132:1: statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : (s1= statement ( ';' s2= statement )* )? ;
    public final List<IInterpretableNode> statementList() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:2: ( (s1= statement ( ';' s2= statement )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:4: (s1= statement ( ';' s2= statement )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:4: (s1= statement ( ';' s2= statement )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT||LA19_0==41||LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:5: s1= statement ( ';' s2= statement )*
                    {
                    pushFollow(FOLLOW_statement_in_statementList998);
                    s1=statement();

                    state._fsp--;

                    result.add(s1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:4: ( ';' s2= statement )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:5: ';' s2= statement
                    	    {
                    	    match(input,24,FOLLOW_24_in_statementList1017); 
                    	    pushFollow(FOLLOW_statement_in_statementList1021);
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
    // $ANTLR end "statementList"


    // $ANTLR start "statement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:139:1: statement returns [IInterpretableNode result] : ( assignment | procedureCall | ifStatement | whileStatement );
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode assignment16 = null;

        IInterpretableNode procedureCall17 = null;

        IInterpretableNode ifStatement18 = null;

        IInterpretableNode whileStatement19 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:2: ( assignment | procedureCall | ifStatement | whileStatement )
            int alt20=4;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==27||LA20_1==40||LA20_1==47) ) {
                    alt20=1;
                }
                else if ( (LA20_1==24||LA20_1==26||LA20_1==33||(LA20_1>=43 && LA20_1<=44)) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt20=3;
                }
                break;
            case 45:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1062);
                    assignment16=assignment();

                    state._fsp--;

                    result = assignment16; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:141:5: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1080);
                    procedureCall17=procedureCall();

                    state._fsp--;

                    result = procedureCall17; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1098);
                    ifStatement18=ifStatement();

                    state._fsp--;

                    result = ifStatement18; 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:143:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1116);
                    whileStatement19=whileStatement();

                    state._fsp--;

                    result = whileStatement19; 

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
    // $ANTLR end "statement"


    // $ANTLR start "assignment"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT20=null;
        List<IInterpretableNode> selector21 = null;

        IInterpretableNode expression22 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:2: ( IDENT selector ':=' expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:4: IDENT selector ':=' expression
            {
            IDENT20=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1145); 
            pushFollow(FOLLOW_selector_in_assignment1147);
            selector21=selector();

            state._fsp--;

            result = new IdentSelectorNode((IDENT20!=null?IDENT20.getText():null), selector21); 
            match(input,40,FOLLOW_40_in_assignment1165); 
            pushFollow(FOLLOW_expression_in_assignment1167);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:152:1: procedureCall returns [IInterpretableNode result] : IDENT ( actualParameters )? ;
    public final IInterpretableNode procedureCall() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT23=null;
        List<IInterpretableNode> actualParameters24 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:2: ( IDENT ( actualParameters )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:4: IDENT ( actualParameters )?
            {
            IDENT23=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall1193); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:10: ( actualParameters )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall1196);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:157:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:158:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:158:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,33,FOLLOW_33_in_actualParameters1223); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:158:8: (e1= expression ( ',' e2= expression )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=PLUS && LA23_0<=MINUS)||(LA23_0>=IDENT && LA23_0<=NUMBER)||LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:158:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1228);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:5: ( ',' e2= expression )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==39) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:6: ',' e2= expression
                    	    {
                    	    match(input,39,FOLLOW_39_in_actualParameters1247); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters1251);
                    	    e2=expression();

                    	    state._fsp--;

                    	    result.add(e2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,34,FOLLOW_34_in_actualParameters1278); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:165:1: ifStatement returns [IInterpretableNode result] : 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e1 = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode elseStatements25 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:166:2: ( 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:166:4: 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END'
            {
            match(input,41,FOLLOW_41_in_ifStatement1293); 
            pushFollow(FOLLOW_expression_in_ifStatement1297);
            e1=expression();

            state._fsp--;

            match(input,42,FOLLOW_42_in_ifStatement1299); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1303);
            ss1=statementSequence();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:167:4: ( elseStatements )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=43 && LA24_0<=44)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:167:5: elseStatements
                    {
                    pushFollow(FOLLOW_elseStatements_in_ifStatement1310);
                    elseStatements25=elseStatements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ifStatement1314); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:170:1: elseStatements returns [IInterpretableNode result] : ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence );
    public final IInterpretableNode elseStatements() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode es = null;

        IInterpretableNode ss2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:171:2: ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            else if ( (LA26_0==44) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:171:5: 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )?
                    {
                    match(input,43,FOLLOW_43_in_elseStatements1339); 
                    pushFollow(FOLLOW_expression_in_elseStatements1343);
                    e=expression();

                    state._fsp--;

                    match(input,42,FOLLOW_42_in_elseStatements1345); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1349);
                    ss1=statementSequence();

                    state._fsp--;

                    result = new ElseIfNode(e, ss1, null); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:172:4: (es= elseStatements )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=43 && LA25_0<=44)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:173:5: es= elseStatements
                            {
                            pushFollow(FOLLOW_elseStatements_in_elseStatements1365);
                            es=elseStatements();

                            state._fsp--;

                            result = new ElseIfNode(e, ss1, es); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:175:4: 'ELSE' ss2= statementSequence
                    {
                    match(input,44,FOLLOW_44_in_elseStatements1385); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1389);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:178:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression26 = null;

        IInterpretableNode statementSequence27 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:179:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:179:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,45,FOLLOW_45_in_whileStatement1412); 
            pushFollow(FOLLOW_expression_in_whileStatement1414);
            expression26=expression();

            state._fsp--;

            match(input,46,FOLLOW_46_in_whileStatement1416); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1418);
            statementSequence27=statementSequence();

            state._fsp--;

            match(input,26,FOLLOW_26_in_whileStatement1420); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:182:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:183:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:183:4: s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1441);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:184:4: ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            int alt27=7;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt27=1;
                    }
                    break;
                case NOT_EQ:
                    {
                    alt27=2;
                    }
                    break;
                case LT:
                    {
                    alt27=3;
                    }
                    break;
                case LT_EQ:
                    {
                    alt27=4;
                    }
                    break;
                case GT:
                    {
                    alt27=5;
                    }
                    break;
                case GT_EQ:
                    {
                    alt27=6;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:184:6: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1459); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1463);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:185:6: NOT_EQ s2= simpleExpression
                    {
                    match(input,NOT_EQ,FOLLOW_NOT_EQ_in_expression1477); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1481);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new NotEqualsExprNode(s1, s2); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:186:6: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression1495); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1499);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:187:6: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression1514); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1518);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:6: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression1533); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1537);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 6 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:189:6: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression1552); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1556);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:193:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:194:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
            int alt29=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt29=1;
                }
                break;
            case MINUS:
                {
                alt29=2;
                }
                break;
            case IDENT:
            case NUMBER:
            case 33:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:194:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1587); 
                    pushFollow(FOLLOW_term_in_simpleExpression1591);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:195:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1610); 
                    pushFollow(FOLLOW_term_in_simpleExpression1614);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:196:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression1634);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:197:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    loop28:
                    do {
                        int alt28=4;
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
                        case OR:
                            {
                            alt28=3;
                            }
                            break;

                        }

                        switch (alt28) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:197:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1654); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1658);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:198:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1676); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1680);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:199:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression1698); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1702);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new OrExprNode(result, t2); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:209:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:210:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:210:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1738);
            f1=factor();

            state._fsp--;

            result = f1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:211:3: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=MULT && LA31_0<=MOD)||LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:211:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:211:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    int alt30=4;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    case AND:
            	        {
            	        alt30=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:211:7: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term1760); 
            	            pushFollow(FOLLOW_factor_in_term1764);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:212:6: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term1781); 
            	            pushFollow(FOLLOW_factor_in_term1785);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:213:6: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term1803); 
            	            pushFollow(FOLLOW_factor_in_term1807);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:214:6: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term1825); 
            	            pushFollow(FOLLOW_factor_in_term1829);
            	            f2=factor();

            	            state._fsp--;

            	            result = new AndExprNode(result, f2); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:219:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT28=null;
        Token NUMBER30=null;
        List<IInterpretableNode> selector29 = null;

        IInterpretableNode expression31 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:220:2: ( IDENT selector | NUMBER | '(' expression ')' )
            int alt32=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt32=1;
                }
                break;
            case NUMBER:
                {
                alt32=2;
                }
                break;
            case 33:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:220:5: IDENT selector
                    {
                    IDENT28=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1866); 
                    pushFollow(FOLLOW_selector_in_factor1868);
                    selector29=selector();

                    state._fsp--;

                    result = new IdentSelectorNode((IDENT28!=null?IDENT28.getText():null), selector29); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:221:6: NUMBER
                    {
                    NUMBER30=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1888); 
                    result = new NumberNode(Integer.parseInt((NUMBER30!=null?NUMBER30.getText():null))); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:222:6: '(' expression ')'
                    {
                    match(input,33,FOLLOW_33_in_factor1908); 
                    pushFollow(FOLLOW_expression_in_factor1910);
                    expression31=expression();

                    state._fsp--;

                    match(input,34,FOLLOW_34_in_factor1912); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:226:1: selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<IInterpretableNode> selector() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT32=null;
        IInterpretableNode expression33 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:227:2: ( ( '.' IDENT | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:227:5: ( '.' IDENT | '[' expression ']' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:227:5: ( '.' IDENT | '[' expression ']' )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }
                else if ( (LA33_0==47) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:227:6: '.' IDENT
            	    {
            	    match(input,27,FOLLOW_27_in_selector1941); 
            	    IDENT32=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1943); 
            	    result.add(new DotSelectorNode((IDENT32!=null?IDENT32.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:228:7: '[' expression ']'
            	    {
            	    match(input,47,FOLLOW_47_in_selector1965); 
            	    pushFollow(FOLLOW_expression_in_selector1967);
            	    expression33=expression();

            	    state._fsp--;

            	    match(input,48,FOLLOW_48_in_selector1969); 
            	    result.add(new ElementSelectorNode(expression33)); 

            	    }
            	    break;

            	default :
            	    break loop33;
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
    public static final BitSet FOLLOW_25_in_module189 = new BitSet(new long[]{0x0000220000020000L});
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
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations360 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_typeDeclarations362 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_typeDeclarations364 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_30_in_varDeclarations401 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations407 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_varDeclarations409 = new BitSet(new long[]{0x0000003800020000L});
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
    public static final BitSet FOLLOW_25_in_procedureBody525 = new BitSet(new long[]{0x0000220000020000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_formalParameters575 = new BitSet(new long[]{0x0000000440020000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters580 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_formalParameters599 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters603 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_formalParameters627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_fPSection643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identList_in_fPSection647 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fPSection649 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fPSection653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection668 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fPSection670 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fPSection674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_type702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_recordType788 = new BitSet(new long[]{0x0000000005020000L});
    public static final BitSet FOLLOW_fieldLists_in_recordType790 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_recordType792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldLists819 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fieldLists821 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fieldLists825 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_fieldLists842 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identList_in_fieldLists846 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fieldLists848 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fieldLists852 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_37_in_arrayType881 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_arrayType883 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_arrayType885 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_arrayType887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList912 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_identList932 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_identList936 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_statementList_in_statementSequence968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList998 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_statementList1017 = new BitSet(new long[]{0x0000220000020000L});
    public static final BitSet FOLLOW_statement_in_statementList1021 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_assignment_in_statement1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1145 = new BitSet(new long[]{0x0000810008000000L});
    public static final BitSet FOLLOW_selector_in_assignment1147 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_assignment1165 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_assignment1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall1193 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_actualParameters1223 = new BitSet(new long[]{0x0000000600060030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1228 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_39_in_actualParameters1247 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1251 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_34_in_actualParameters1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifStatement1293 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_ifStatement1297 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifStatement1299 = new BitSet(new long[]{0x0000220000020000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1303 = new BitSet(new long[]{0x0000180004000000L});
    public static final BitSet FOLLOW_elseStatements_in_ifStatement1310 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ifStatement1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_elseStatements1339 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_elseStatements1343 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_elseStatements1345 = new BitSet(new long[]{0x0000220000020000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1349 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_elseStatements_in_elseStatements1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_elseStatements1385 = new BitSet(new long[]{0x0000220000020000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_whileStatement1412 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_whileStatement1414 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_whileStatement1416 = new BitSet(new long[]{0x0000220000020000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1418 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_whileStatement1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1441 = new BitSet(new long[]{0x000000000001E602L});
    public static final BitSet FOLLOW_EQUALS_in_expression1459 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQ_in_expression1477 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression1495 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression1514 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression1533 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression1552 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1587 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1610 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1634 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1654 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1658 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1676 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1680 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1698 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1702 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_factor_in_term1738 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_MULT_in_term1760 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1764 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_DIV_in_term1781 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1785 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_MOD_in_term1803 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1807 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_AND_in_term1825 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1829 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_IDENT_in_factor1866 = new BitSet(new long[]{0x0000800008000000L});
    public static final BitSet FOLLOW_selector_in_factor1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor1908 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_factor1910 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_factor1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_selector1941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_selector1943 = new BitSet(new long[]{0x0000800008000002L});
    public static final BitSet FOLLOW_47_in_selector1965 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_selector1967 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_selector1969 = new BitSet(new long[]{0x0000800008000002L});

}