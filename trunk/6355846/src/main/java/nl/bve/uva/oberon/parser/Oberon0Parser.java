// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-16 21:14:25

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.*;
import nl.bve.uva.oberon.ast.declarations.*;
import nl.bve.uva.oberon.ast.expressions.*;
import nl.bve.uva.oberon.env.*;
import nl.bve.uva.oberon.shared.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "NOT_EQ", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "NUMBER", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "':'", "'PROCEDURE'", "'('", "')'", "'INTEGER'", "'RECORD'", "'ARRAY'", "'OF'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'WITH'", "'['", "']'"
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
    public static final int T__49=49;
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:1: module returns [IInterpretableNode result] : 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' ;
    public final IInterpretableNode module() throws RecognitionException {
        IInterpretableNode result = null;

        Token i1=null;
        Token i2=null;
        IInterpretableNode statementSequence1 = null;

        IInterpretableNode declarations2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:2: ( 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:38:4: 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,23,FOLLOW_23_in_module174); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module178); 
            match(input,24,FOLLOW_24_in_module180); 
            pushFollow(FOLLOW_declarations_in_module182);
            declarations2=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:4: ( 'BEGIN' statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:39:5: 'BEGIN' statementSequence
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:43:1: declarations returns [IInterpretableNode result] : c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations ;
    public final IInterpretableNode declarations() throws RecognitionException {
        IInterpretableNode result = null;

        List<DeclarationNode> c = null;

        List<DeclarationNode> t = null;

        List<DeclarationNode> v = null;

        List<DeclarationNode> p = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:2: (c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:44:4: c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations
            {
            pushFollow(FOLLOW_constantDeclarations_in_declarations239);
            c=constantDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_typeDeclarations_in_declarations245);
            t=typeDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_varDeclarations_in_declarations251);
            v=varDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_procedureDeclarations_in_declarations257);
            p=procedureDeclarations();

            state._fsp--;

            result = new AllDeclarationsNode(c, t, v, p); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:1: constantDeclarations returns [List<DeclarationNode> result = new ArrayList<DeclarationNode>()] : ( 'CONST' ( IDENT '=' expression ';' )* )? ;
    public final List<DeclarationNode> constantDeclarations() throws RecognitionException {
        List<DeclarationNode> result =  new ArrayList<DeclarationNode>();

        Token IDENT3=null;
        IInterpretableNode expression4 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:2: ( ( 'CONST' ( IDENT '=' expression ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==28) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:51:5: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    match(input,28,FOLLOW_28_in_constantDeclarations300); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:52:4: ( IDENT '=' expression ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:52:5: IDENT '=' expression ';'
                    	    {
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_constantDeclarations307); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations309); 
                    	    pushFollow(FOLLOW_expression_in_constantDeclarations311);
                    	    expression4=expression();

                    	    state._fsp--;

                    	    match(input,24,FOLLOW_24_in_constantDeclarations313); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:1: typeDeclarations returns [List<DeclarationNode> result = new ArrayList<DeclarationNode>()] : ( 'TYPE' ( IDENT '=' type ';' )* )? ;
    public final List<DeclarationNode> typeDeclarations() throws RecognitionException {
        List<DeclarationNode> result =  new ArrayList<DeclarationNode>();

        Token IDENT5=null;
        IInterpretableNode type6 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:2: ( ( 'TYPE' ( IDENT '=' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:58:5: 'TYPE' ( IDENT '=' type ';' )*
                    {
                    match(input,29,FOLLOW_29_in_typeDeclarations348); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:59:4: ( IDENT '=' type ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:59:5: IDENT '=' type ';'
                    	    {
                    	    IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclarations355); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations357); 
                    	    pushFollow(FOLLOW_type_in_typeDeclarations359);
                    	    type6=type();

                    	    state._fsp--;

                    	    match(input,24,FOLLOW_24_in_typeDeclarations361); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:1: varDeclarations returns [List<DeclarationNode> result = new ArrayList<DeclarationNode>()] : ( 'VAR' ( identList ':' type ';' )* )? ;
    public final List<DeclarationNode> varDeclarations() throws RecognitionException {
        List<DeclarationNode> result =  new ArrayList<DeclarationNode>();

        List<String> identList7 = null;

        IInterpretableNode type8 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:2: ( ( 'VAR' ( identList ':' type ';' )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:4: ( 'VAR' ( identList ':' type ';' )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:4: ( 'VAR' ( identList ':' type ';' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:65:5: 'VAR' ( identList ':' type ';' )*
                    {
                    match(input,30,FOLLOW_30_in_varDeclarations398); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:66:4: ( identList ':' type ';' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:66:5: identList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_varDeclarations404);
                    	    identList7=identList();

                    	    state._fsp--;

                    	    match(input,31,FOLLOW_31_in_varDeclarations406); 
                    	    pushFollow(FOLLOW_type_in_varDeclarations408);
                    	    type8=type();

                    	    state._fsp--;

                    	    match(input,24,FOLLOW_24_in_varDeclarations410); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:1: procedureDeclarations returns [List<DeclarationNode> result = new ArrayList<DeclarationNode>()] : ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* ;
    public final List<DeclarationNode> procedureDeclarations() throws RecognitionException {
        List<DeclarationNode> result =  new ArrayList<DeclarationNode>();

        Token i1=null;
        Token i2=null;
        List<TypedParameterList> fp = null;

        IInterpretableNode pb = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:2: ( ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:71:4: ( 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:72:4: 'PROCEDURE' i1= IDENT (fp= formalParameters )? ';' pb= procedureBody 'END' i2= IDENT ';'
            	    {
            	    match(input,32,FOLLOW_32_in_procedureDeclarations449); 
            	    i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations453); 
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:73:5: (fp= formalParameters )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==33) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:73:6: fp= formalParameters
            	            {
            	            pushFollow(FOLLOW_formalParameters_in_procedureDeclarations462);
            	            fp=formalParameters();

            	            state._fsp--;


            	            }
            	            break;

            	    }

            	    match(input,24,FOLLOW_24_in_procedureDeclarations478); 
            	    pushFollow(FOLLOW_procedureBody_in_procedureDeclarations482);
            	    pb=procedureBody();

            	    state._fsp--;

            	    match(input,26,FOLLOW_26_in_procedureDeclarations484); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations488); 
            	    match(input,24,FOLLOW_24_in_procedureDeclarations490); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:78:1: procedureBody returns [IInterpretableNode result] : d= declarations ( 'BEGIN' ss= statementSequence )? ;
    public final IInterpretableNode procedureBody() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode d = null;

        IInterpretableNode ss = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:2: (d= declarations ( 'BEGIN' ss= statementSequence )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:4: d= declarations ( 'BEGIN' ss= statementSequence )?
            {
            pushFollow(FOLLOW_declarations_in_procedureBody515);
            d=declarations();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:80:4: ( 'BEGIN' ss= statementSequence )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:80:5: 'BEGIN' ss= statementSequence
                    {
                    match(input,25,FOLLOW_25_in_procedureBody522); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody526);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:84:1: formalParameters returns [List<TypedParameterList> result = new ArrayList<TypedParameterList>()] : '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' ;
    public final List<TypedParameterList> formalParameters() throws RecognitionException {
        List<TypedParameterList> result =  new ArrayList<TypedParameterList>();

        TypedParameterList fp1 = null;

        TypedParameterList fp2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:2: ( '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:4: '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')'
            {
            match(input,33,FOLLOW_33_in_formalParameters572); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:8: (fp1= fPSection ( ';' fp2= fPSection )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT||LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:9: fp1= fPSection ( ';' fp2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters577);
                    fp1=fPSection();

                    state._fsp--;

                    result.add(fp1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:5: ( ';' fp2= fPSection )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:6: ';' fp2= fPSection
                    	    {
                    	    match(input,24,FOLLOW_24_in_formalParameters596); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters600);
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

            match(input,34,FOLLOW_34_in_formalParameters624); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:91:1: fPSection returns [TypedParameterList result] : ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) ;
    public final TypedParameterList fPSection() throws RecognitionException {
        TypedParameterList result = null;

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:2: ( ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:5: 'VAR' i1= identList ':' t1= type
                    {
                    match(input,30,FOLLOW_30_in_fPSection640); 
                    pushFollow(FOLLOW_identList_in_fPSection644);
                    i1=identList();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_fPSection646); 
                    pushFollow(FOLLOW_type_in_fPSection650);
                    t1=type();

                    state._fsp--;

                    result = new TypedReferenceParameterList(i1, t1); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:4: i2= identList ':' t2= type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection665);
                    i2=identList();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_fPSection667); 
                    pushFollow(FOLLOW_type_in_fPSection671);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:97:1: type returns [IInterpretableNode result] : ( 'INTEGER' | IDENT | arrayType | recordType );
    public final IInterpretableNode type() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT9=null;
        IInterpretableNode arrayType10 = null;

        IInterpretableNode recordType11 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:98:2: ( 'INTEGER' | IDENT | arrayType | recordType )
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:98:4: 'INTEGER'
                    {
                    match(input,35,FOLLOW_35_in_type699); 
                    result = new IntegerTypeNode(); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:99:4: IDENT
                    {
                    IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_type718); 
                    result = new UserTypeNode((IDENT9!=null?IDENT9.getText():null)); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:100:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type738);
                    arrayType10=arrayType();

                    state._fsp--;

                    result = arrayType10; 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:4: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type757);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:104:1: recordType returns [IInterpretableNode result] : 'RECORD' fieldLists 'END' ;
    public final IInterpretableNode recordType() throws RecognitionException {
        IInterpretableNode result = null;

        List<TypedFieldListNode> fieldLists12 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:2: ( 'RECORD' fieldLists 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:4: 'RECORD' fieldLists 'END'
            {
            match(input,36,FOLLOW_36_in_recordType785); 
            pushFollow(FOLLOW_fieldLists_in_recordType787);
            fieldLists12=fieldLists();

            state._fsp--;

            match(input,26,FOLLOW_26_in_recordType789); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:1: fieldLists returns [List<TypedFieldListNode> result = new ArrayList<TypedFieldListNode>()] : (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )* ;
    public final List<TypedFieldListNode> fieldLists() throws RecognitionException {
        List<TypedFieldListNode> result =  new ArrayList<TypedFieldListNode>();

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:2: ( (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:4: (i1= identList ':' t1= type )? ( ';' i2= identList ':' t2= type )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:4: (i1= identList ':' t1= type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:5: i1= identList ':' t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fieldLists816);
                    i1=identList();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_fieldLists818); 
                    pushFollow(FOLLOW_type_in_fieldLists822);
                    t1=type();

                    state._fsp--;


                    }
                    break;

            }

            result.add(new TypedFieldListNode(i1, t1)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:4: ( ';' i2= identList ':' t2= type )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:5: ';' i2= identList ':' t2= type
            	    {
            	    match(input,24,FOLLOW_24_in_fieldLists839); 
            	    pushFollow(FOLLOW_identList_in_fieldLists843);
            	    i2=identList();

            	    state._fsp--;

            	    match(input,31,FOLLOW_31_in_fieldLists845); 
            	    pushFollow(FOLLOW_type_in_fieldLists849);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:114:1: arrayType returns [IInterpretableNode result] : 'ARRAY' expression 'OF' type ;
    public final IInterpretableNode arrayType() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression13 = null;

        IInterpretableNode type14 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:115:2: ( 'ARRAY' expression 'OF' type )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:115:4: 'ARRAY' expression 'OF' type
            {
            match(input,37,FOLLOW_37_in_arrayType878); 
            pushFollow(FOLLOW_expression_in_arrayType880);
            expression13=expression();

            state._fsp--;

            match(input,38,FOLLOW_38_in_arrayType882); 
            pushFollow(FOLLOW_type_in_arrayType884);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:118:1: identList returns [List<String> result = new ArrayList<String>()] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> result =  new ArrayList<String>();

        Token i1=null;
        Token i2=null;

        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:2: (i1= IDENT ( ',' i2= IDENT )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:4: i1= IDENT ( ',' i2= IDENT )*
            {
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList909); 
            result.add((i1!=null?i1.getText():null)); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:4: ( ',' i2= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:5: ',' i2= IDENT
            	    {
            	    match(input,39,FOLLOW_39_in_identList929); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList933); 
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:1: statementSequence returns [IInterpretableNode result] : statementList ;
    public final IInterpretableNode statementSequence() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> statementList15 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:2: ( statementList )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_statementSequence965);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:1: statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : (s1= statement ( ';' s2= statement )* )? ;
    public final List<IInterpretableNode> statementList() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:2: ( (s1= statement ( ';' s2= statement )* )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:4: (s1= statement ( ';' s2= statement )* )?
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:4: (s1= statement ( ';' s2= statement )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENT||LA19_0==41||LA19_0==45||LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:5: s1= statement ( ';' s2= statement )*
                    {
                    pushFollow(FOLLOW_statement_in_statementList995);
                    s1=statement();

                    state._fsp--;

                    result.add(s1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:4: ( ';' s2= statement )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==24) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:5: ';' s2= statement
                    	    {
                    	    match(input,24,FOLLOW_24_in_statementList1014); 
                    	    pushFollow(FOLLOW_statement_in_statementList1018);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:1: statement returns [IInterpretableNode result] : ( assignment | procedureCall | ifStatement | whileStatement | withStatement );
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode assignment16 = null;

        IInterpretableNode procedureCall17 = null;

        IInterpretableNode ifStatement18 = null;

        IInterpretableNode whileStatement19 = null;

        IInterpretableNode withStatement20 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:141:2: ( assignment | procedureCall | ifStatement | whileStatement | withStatement )
            int alt20=5;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==27||LA20_1==40||LA20_1==48) ) {
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
            case 47:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:141:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1059);
                    assignment16=assignment();

                    state._fsp--;

                    result = assignment16; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:5: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1077);
                    procedureCall17=procedureCall();

                    state._fsp--;

                    result = procedureCall17; 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:143:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1095);
                    ifStatement18=ifStatement();

                    state._fsp--;

                    result = ifStatement18; 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:144:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1113);
                    whileStatement19=whileStatement();

                    state._fsp--;

                    result = whileStatement19; 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:145:5: withStatement
                    {
                    pushFollow(FOLLOW_withStatement_in_statement1130);
                    withStatement20=withStatement();

                    state._fsp--;

                    result = withStatement20; 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT21=null;
        List<Selector> selector22 = null;

        IInterpretableNode expression23 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:149:2: ( IDENT selector ':=' expression )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:149:4: IDENT selector ':=' expression
            {
            IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1157); 
            pushFollow(FOLLOW_selector_in_assignment1159);
            selector22=selector();

            state._fsp--;

            result = new IdentSelectorNode((IDENT21!=null?IDENT21.getText():null), selector22); 
            match(input,40,FOLLOW_40_in_assignment1177); 
            pushFollow(FOLLOW_expression_in_assignment1179);
            expression23=expression();

            state._fsp--;

            result = new AssignmentNode(result, expression23); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:1: procedureCall returns [IInterpretableNode result] : IDENT ( actualParameters )? ;
    public final IInterpretableNode procedureCall() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT24=null;
        List<IInterpretableNode> actualParameters25 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:2: ( IDENT ( actualParameters )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:4: IDENT ( actualParameters )?
            {
            IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall1205); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:10: ( actualParameters )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall1208);
                    actualParameters25=actualParameters();

                    state._fsp--;


                    }
                    break;

            }

            result = new ProcedureCallNode((IDENT24!=null?IDENT24.getText():null), actualParameters25); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:158:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,33,FOLLOW_33_in_actualParameters1235); 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:8: (e1= expression ( ',' e2= expression )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=PLUS && LA23_0<=MINUS)||(LA23_0>=IDENT && LA23_0<=NUMBER)||LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1240);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:160:5: ( ',' e2= expression )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==39) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:160:6: ',' e2= expression
                    	    {
                    	    match(input,39,FOLLOW_39_in_actualParameters1259); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters1263);
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

            match(input,34,FOLLOW_34_in_actualParameters1290); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:166:1: ifStatement returns [IInterpretableNode result] : 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e1 = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode elseStatements26 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:167:2: ( 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:167:4: 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END'
            {
            match(input,41,FOLLOW_41_in_ifStatement1305); 
            pushFollow(FOLLOW_expression_in_ifStatement1309);
            e1=expression();

            state._fsp--;

            match(input,42,FOLLOW_42_in_ifStatement1311); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1315);
            ss1=statementSequence();

            state._fsp--;

            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:168:4: ( elseStatements )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=43 && LA24_0<=44)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:168:5: elseStatements
                    {
                    pushFollow(FOLLOW_elseStatements_in_ifStatement1322);
                    elseStatements26=elseStatements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_ifStatement1326); 
            result = new IfNode(e1, ss1, elseStatements26); 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:171:1: elseStatements returns [IInterpretableNode result] : ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence );
    public final IInterpretableNode elseStatements() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode es = null;

        IInterpretableNode ss2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:172:2: ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence )
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:172:5: 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )?
                    {
                    match(input,43,FOLLOW_43_in_elseStatements1351); 
                    pushFollow(FOLLOW_expression_in_elseStatements1355);
                    e=expression();

                    state._fsp--;

                    match(input,42,FOLLOW_42_in_elseStatements1357); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1361);
                    ss1=statementSequence();

                    state._fsp--;

                    result = new ElseIfNode(e, ss1, null); 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:173:4: (es= elseStatements )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=43 && LA25_0<=44)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:174:5: es= elseStatements
                            {
                            pushFollow(FOLLOW_elseStatements_in_elseStatements1377);
                            es=elseStatements();

                            state._fsp--;

                            result = new ElseIfNode(e, ss1, es); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:176:4: 'ELSE' ss2= statementSequence
                    {
                    match(input,44,FOLLOW_44_in_elseStatements1397); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1401);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:179:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression27 = null;

        IInterpretableNode statementSequence28 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:180:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:180:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,45,FOLLOW_45_in_whileStatement1424); 
            pushFollow(FOLLOW_expression_in_whileStatement1426);
            expression27=expression();

            state._fsp--;

            match(input,46,FOLLOW_46_in_whileStatement1428); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1430);
            statementSequence28=statementSequence();

            state._fsp--;

            match(input,26,FOLLOW_26_in_whileStatement1432); 
            result = new WhileNode(expression27, statementSequence28); 

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


    // $ANTLR start "withStatement"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:183:1: withStatement returns [IInterpretableNode result] : 'WITH' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode withStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression29 = null;

        IInterpretableNode statementSequence30 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:184:2: ( 'WITH' expression 'DO' statementSequence 'END' )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:184:4: 'WITH' expression 'DO' statementSequence 'END'
            {
            match(input,47,FOLLOW_47_in_withStatement1451); 
            pushFollow(FOLLOW_expression_in_withStatement1453);
            expression29=expression();

            state._fsp--;

            match(input,46,FOLLOW_46_in_withStatement1455); 
            pushFollow(FOLLOW_statementSequence_in_withStatement1457);
            statementSequence30=statementSequence();

            state._fsp--;

            match(input,26,FOLLOW_26_in_withStatement1459); 
            result = new WithNode(expression29, statementSequence30); 

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
    // $ANTLR end "withStatement"


    // $ANTLR start "expression"
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:187:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:4: s1= simpleExpression ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1480);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:189:4: ( EQUALS s2= simpleExpression | NOT_EQ s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:189:6: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1498); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1502);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:190:6: NOT_EQ s2= simpleExpression
                    {
                    match(input,NOT_EQ,FOLLOW_NOT_EQ_in_expression1516); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1520);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new NotEqualsExprNode(s1, s2); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:191:6: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression1534); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1538);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:192:6: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression1553); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1557);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:193:6: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression1572); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1576);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 6 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:194:6: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression1591); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1595);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:198:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:199:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:199:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1626); 
                    pushFollow(FOLLOW_term_in_simpleExpression1630);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:200:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1649); 
                    pushFollow(FOLLOW_term_in_simpleExpression1653);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:201:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression1673);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:202:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
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
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:202:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1693); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1697);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:203:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1715); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1719);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:204:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression1737); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1741);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:214:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:215:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:215:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1777);
            f1=factor();

            state._fsp--;

            result = f1; 
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:3: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=MULT && LA31_0<=MOD)||LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
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
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:7: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term1799); 
            	            pushFollow(FOLLOW_factor_in_term1803);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:217:6: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term1820); 
            	            pushFollow(FOLLOW_factor_in_term1824);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:218:6: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term1842); 
            	            pushFollow(FOLLOW_factor_in_term1846);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:219:6: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term1864); 
            	            pushFollow(FOLLOW_factor_in_term1868);
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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:224:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT31=null;
        Token NUMBER33=null;
        List<Selector> selector32 = null;

        IInterpretableNode expression34 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:225:2: ( IDENT selector | NUMBER | '(' expression ')' )
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
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:225:5: IDENT selector
                    {
                    IDENT31=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1905); 
                    pushFollow(FOLLOW_selector_in_factor1907);
                    selector32=selector();

                    state._fsp--;

                    result = new IdentSelectorNode((IDENT31!=null?IDENT31.getText():null), selector32); 

                    }
                    break;
                case 2 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:226:6: NUMBER
                    {
                    NUMBER33=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1927); 
                    result = new NumberNode(Integer.parseInt((NUMBER33!=null?NUMBER33.getText():null))); 

                    }
                    break;
                case 3 :
                    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:227:6: '(' expression ')'
                    {
                    match(input,33,FOLLOW_33_in_factor1947); 
                    pushFollow(FOLLOW_expression_in_factor1949);
                    expression34=expression();

                    state._fsp--;

                    match(input,34,FOLLOW_34_in_factor1951); 
                    result = expression34; 

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
    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:231:1: selector returns [List<Selector> result = new ArrayList<Selector>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<Selector> selector() throws RecognitionException {
        List<Selector> result =  new ArrayList<Selector>();

        Token IDENT35=null;
        IInterpretableNode expression36 = null;


        try {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:232:2: ( ( '.' IDENT | '[' expression ']' )* )
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:232:5: ( '.' IDENT | '[' expression ']' )*
            {
            // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:232:5: ( '.' IDENT | '[' expression ']' )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==27) ) {
                    alt33=1;
                }
                else if ( (LA33_0==48) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:232:6: '.' IDENT
            	    {
            	    match(input,27,FOLLOW_27_in_selector1980); 
            	    IDENT35=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1982); 
            	    result.add(new DotSelectorNode((IDENT35!=null?IDENT35.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:233:7: '[' expression ']'
            	    {
            	    match(input,48,FOLLOW_48_in_selector2004); 
            	    pushFollow(FOLLOW_expression_in_selector2006);
            	    expression36=expression();

            	    state._fsp--;

            	    match(input,49,FOLLOW_49_in_selector2008); 
            	    result.add(new ElementSelectorNode(expression36)); 

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
    public static final BitSet FOLLOW_25_in_module189 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statementSequence_in_module191 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_module207 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_module211 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_module213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations239 = new BitSet(new long[]{0x0000000160000000L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations245 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations251 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_constantDeclarations300 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENT_in_constantDeclarations307 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations309 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations311 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_constantDeclarations313 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_29_in_typeDeclarations348 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclarations355 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations357 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_typeDeclarations359 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_typeDeclarations361 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_30_in_varDeclarations398 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations404 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_varDeclarations406 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_varDeclarations408 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_varDeclarations410 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_32_in_procedureDeclarations449 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations453 = new BitSet(new long[]{0x0000000201000000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureDeclarations462 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_procedureDeclarations478 = new BitSet(new long[]{0x0000000170000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations482 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_procedureDeclarations484 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations488 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_procedureDeclarations490 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody515 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_procedureBody522 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_formalParameters572 = new BitSet(new long[]{0x0000000440020000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters577 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_formalParameters596 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters600 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_formalParameters624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_fPSection640 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identList_in_fPSection644 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fPSection646 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fPSection650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection665 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fPSection667 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fPSection671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_type699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_recordType785 = new BitSet(new long[]{0x0000000005020000L});
    public static final BitSet FOLLOW_fieldLists_in_recordType787 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_recordType789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldLists816 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fieldLists818 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fieldLists822 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_fieldLists839 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_identList_in_fieldLists843 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_fieldLists845 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_fieldLists849 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_37_in_arrayType878 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_arrayType880 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_arrayType882 = new BitSet(new long[]{0x0000003800020000L});
    public static final BitSet FOLLOW_type_in_arrayType884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList909 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_identList929 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_identList933 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_statementList_in_statementSequence965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList995 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_statementList1014 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statement_in_statementList1018 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_assignment_in_statement1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1157 = new BitSet(new long[]{0x0001010008000000L});
    public static final BitSet FOLLOW_selector_in_assignment1159 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_assignment1177 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_assignment1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall1205 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_actualParameters1235 = new BitSet(new long[]{0x0000000600060030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1240 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_39_in_actualParameters1259 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1263 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_34_in_actualParameters1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ifStatement1305 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_ifStatement1309 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ifStatement1311 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1315 = new BitSet(new long[]{0x0000180004000000L});
    public static final BitSet FOLLOW_elseStatements_in_ifStatement1322 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ifStatement1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_elseStatements1351 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_elseStatements1355 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_elseStatements1357 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1361 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_elseStatements_in_elseStatements1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_elseStatements1397 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_whileStatement1424 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_whileStatement1426 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_whileStatement1428 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1430 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_whileStatement1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_withStatement1451 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_withStatement1453 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_withStatement1455 = new BitSet(new long[]{0x0000A20000020000L});
    public static final BitSet FOLLOW_statementSequence_in_withStatement1457 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_withStatement1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1480 = new BitSet(new long[]{0x000000000001E602L});
    public static final BitSet FOLLOW_EQUALS_in_expression1498 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQ_in_expression1516 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression1534 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression1553 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression1572 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression1591 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1626 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1649 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1673 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1693 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1697 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1715 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1719 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1737 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1741 = new BitSet(new long[]{0x0000000000000832L});
    public static final BitSet FOLLOW_factor_in_term1777 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_MULT_in_term1799 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1803 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_DIV_in_term1820 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1824 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_MOD_in_term1842 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1846 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_AND_in_term1864 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_factor_in_term1868 = new BitSet(new long[]{0x00000000000011C2L});
    public static final BitSet FOLLOW_IDENT_in_factor1905 = new BitSet(new long[]{0x0001000008000000L});
    public static final BitSet FOLLOW_selector_in_factor1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor1947 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_factor1949 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_factor1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_selector1980 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_IDENT_in_selector1982 = new BitSet(new long[]{0x0001000008000002L});
    public static final BitSet FOLLOW_48_in_selector2004 = new BitSet(new long[]{0x0000000200060030L});
    public static final BitSet FOLLOW_expression_in_selector2006 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_selector2008 = new BitSet(new long[]{0x0001000008000002L});

}