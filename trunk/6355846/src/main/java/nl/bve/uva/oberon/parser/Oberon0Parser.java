// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-08 19:06:54

package nl.bve.uva.oberon.parser;

import nl.bve.uva.oberon.ast.*;
import nl.bve.uva.oberon.ast.expressions.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Oberon0Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "MOD", "EQUALS", "OR", "AND", "LT", "LT_EQ", "GT", "GT_EQ", "IDENT", "NUMBER", "INTEGER", "LETTER", "DIGIT", "WHITESPACE", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'TYPE'", "'VAR'", "':'", "';\t'", "'PROCEDURE'", "'('", "')'", "'RECORD'", "'ARRAY'", "'OF'", "','", "':='", "'IF'", "'THEN'", "'ELSIF'", "'ELSE'", "'WHILE'", "'DO'", "'['", "']'"
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
    public static final int T__47=47;
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
    public String getGrammarFileName() { return "D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g"; }



    // $ANTLR start "module"
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:33:1: module returns [IInterpretableNode result] : 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' ;
    public final IInterpretableNode module() throws RecognitionException {
        IInterpretableNode result = null;

        Token i1=null;
        Token i2=null;
        IInterpretableNode statementSequence1 = null;

        IInterpretableNode declarations2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:2: ( 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:4: 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,22,FOLLOW_22_in_module163); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module167); 
            match(input,23,FOLLOW_23_in_module169); 
            pushFollow(FOLLOW_declarations_in_module171);
            declarations2=declarations();

            state._fsp--;

            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:4: ( 'BEGIN' statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:5: 'BEGIN' statementSequence
                    {
                    match(input,24,FOLLOW_24_in_module183); 
                    pushFollow(FOLLOW_statementSequence_in_module185);
                    statementSequence1=statementSequence();

                    state._fsp--;

                    result = statementSequence1; 

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_module200); 
            i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_module204); 
            match(input,26,FOLLOW_26_in_module206); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:40:1: declarations returns [IInterpretableNode result] : c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations ;
    public final IInterpretableNode declarations() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> c = null;

        List<IInterpretableNode> t = null;

        List<IInterpretableNode> v = null;

        List<IInterpretableNode> p = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:2: (c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:4: c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations
            {
            pushFollow(FOLLOW_constantDeclarations_in_declarations232);
            c=constantDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_typeDeclarations_in_declarations239);
            t=typeDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_varDeclarations_in_declarations246);
            v=varDeclarations();

            state._fsp--;

            pushFollow(FOLLOW_procedureDeclarations_in_declarations253);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:47:1: constantDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'CONST' ( IDENT '=' expression ';' )* )? ;
    public final List<IInterpretableNode> constantDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT3=null;
        IInterpretableNode expression4 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:2: ( ( 'CONST' ( IDENT '=' expression ';' )* )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:5: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    match(input,27,FOLLOW_27_in_constantDeclarations296); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:4: ( IDENT '=' expression ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:5: IDENT '=' expression ';'
                    	    {
                    	    IDENT3=(Token)match(input,IDENT,FOLLOW_IDENT_in_constantDeclarations303); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_constantDeclarations305); 
                    	    pushFollow(FOLLOW_expression_in_constantDeclarations307);
                    	    expression4=expression();

                    	    state._fsp--;

                    	    match(input,23,FOLLOW_23_in_constantDeclarations309); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:54:1: typeDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'TYPE' ( IDENT '=' type ';' )* )? ;
    public final List<IInterpretableNode> typeDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT5=null;
        IInterpretableNode type6 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:2: ( ( 'TYPE' ( IDENT '=' type ';' )* )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:5: 'TYPE' ( IDENT '=' type ';' )*
                    {
                    match(input,28,FOLLOW_28_in_typeDeclarations344); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:4: ( IDENT '=' type ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:5: IDENT '=' type ';'
                    	    {
                    	    IDENT5=(Token)match(input,IDENT,FOLLOW_IDENT_in_typeDeclarations351); 
                    	    match(input,EQUALS,FOLLOW_EQUALS_in_typeDeclarations353); 
                    	    pushFollow(FOLLOW_type_in_typeDeclarations355);
                    	    type6=type();

                    	    state._fsp--;

                    	    match(input,23,FOLLOW_23_in_typeDeclarations357); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:61:1: varDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'VAR' ( identList ':' type ';\t' )* )? ;
    public final List<IInterpretableNode> varDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> identList7 = null;

        IInterpretableNode type8 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:2: ( ( 'VAR' ( identList ':' type ';\t' )* )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:4: ( 'VAR' ( identList ':' type ';\t' )* )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:4: ( 'VAR' ( identList ':' type ';\t' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:5: 'VAR' ( identList ':' type ';\t' )*
                    {
                    match(input,29,FOLLOW_29_in_varDeclarations394); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( identList ':' type ';\t' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:5: identList ':' type ';\t'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_varDeclarations400);
                    	    identList7=identList();

                    	    state._fsp--;

                    	    match(input,30,FOLLOW_30_in_varDeclarations402); 
                    	    pushFollow(FOLLOW_type_in_varDeclarations404);
                    	    type8=type();

                    	    state._fsp--;

                    	    match(input,31,FOLLOW_31_in_varDeclarations406); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:67:1: procedureDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : (ph= procedureHeading ';' pb= procedureBody ';' )* ;
    public final List<IInterpretableNode> procedureDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode ph = null;

        IInterpretableNode pb = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:2: ( (ph= procedureHeading ';' pb= procedureBody ';' )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:4: (ph= procedureHeading ';' pb= procedureBody ';' )*
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:4: (ph= procedureHeading ';' pb= procedureBody ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:4: ph= procedureHeading ';' pb= procedureBody ';'
            	    {
            	    pushFollow(FOLLOW_procedureHeading_in_procedureDeclarations446);
            	    ph=procedureHeading();

            	    state._fsp--;

            	    match(input,23,FOLLOW_23_in_procedureDeclarations448); 
            	    pushFollow(FOLLOW_procedureBody_in_procedureDeclarations452);
            	    pb=procedureBody();

            	    state._fsp--;

            	    match(input,23,FOLLOW_23_in_procedureDeclarations454); 
            	    result.add(new ProcedureDeclarationNode(ph, pb)); 

            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "procedureHeading"
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:73:1: procedureHeading returns [IInterpretableNode result] : 'PROCEDURE' IDENT ( formalParameters )? ;
    public final IInterpretableNode procedureHeading() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT9=null;
        List<IInterpretableNode> formalParameters10 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:74:2: ( 'PROCEDURE' IDENT ( formalParameters )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:74:4: 'PROCEDURE' IDENT ( formalParameters )?
            {
            match(input,32,FOLLOW_32_in_procedureHeading479); 
            IDENT9=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureHeading481); 
            result = new ProcedureHeadingNode((IDENT9!=null?IDENT9.getText():null), null); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:75:4: ( formalParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:75:5: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading499);
                    formalParameters10=formalParameters();

                    state._fsp--;

                    result = new ProcedureHeadingNode((IDENT9!=null?IDENT9.getText():null), formalParameters10); 

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
    // $ANTLR end "procedureHeading"


    // $ANTLR start "procedureBody"
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:79:1: procedureBody returns [IInterpretableNode result] : d= declarations ( 'BEGIN' ss= statementSequence )? 'END' IDENT ;
    public final IInterpretableNode procedureBody() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT11=null;
        IInterpretableNode d = null;

        IInterpretableNode ss = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:80:2: (d= declarations ( 'BEGIN' ss= statementSequence )? 'END' IDENT )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:80:4: d= declarations ( 'BEGIN' ss= statementSequence )? 'END' IDENT
            {
            pushFollow(FOLLOW_declarations_in_procedureBody532);
            d=declarations();

            state._fsp--;

            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:81:4: ( 'BEGIN' ss= statementSequence )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:81:5: 'BEGIN' ss= statementSequence
                    {
                    match(input,24,FOLLOW_24_in_procedureBody539); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody543);
                    ss=statementSequence();

                    state._fsp--;

                    result = ss; 

                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_procedureBody558); 
            IDENT11=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureBody560); 
            result = new ProcedureBodyNode(d, result, (IDENT11!=null?IDENT11.getText():null)); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:85:1: formalParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' ;
    public final List<IInterpretableNode> formalParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode fp1 = null;

        IInterpretableNode fp2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:2: ( '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:4: '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')'
            {
            match(input,33,FOLLOW_33_in_formalParameters589); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:8: (fp1= fPSection ( ';' fp2= fPSection )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT||LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:86:9: fp1= fPSection ( ';' fp2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters594);
                    fp1=fPSection();

                    state._fsp--;

                    result.add(fp1); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:87:5: ( ';' fp2= fPSection )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:87:6: ';' fp2= fPSection
                    	    {
                    	    match(input,23,FOLLOW_23_in_formalParameters613); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters617);
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

            match(input,34,FOLLOW_34_in_formalParameters641); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:92:1: fPSection returns [IInterpretableNode result] : ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) ;
    public final IInterpretableNode fPSection() throws RecognitionException {
        IInterpretableNode result = null;

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:2: ( ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:93:5: 'VAR' i1= identList ':' t1= type
                    {
                    match(input,29,FOLLOW_29_in_fPSection657); 
                    pushFollow(FOLLOW_identList_in_fPSection661);
                    i1=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fPSection663); 
                    pushFollow(FOLLOW_type_in_fPSection667);
                    t1=type();

                    state._fsp--;

                    result = new ReferenceParametersNode(i1, t1); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:4: i2= identList ':' t2= type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection682);
                    i2=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fPSection684); 
                    pushFollow(FOLLOW_type_in_fPSection688);
                    t2=type();

                    state._fsp--;

                    result = new ValueParametersNode(i2, t2); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:98:1: type returns [IInterpretableNode result] : ( IDENT | arrayType | recordType );
    public final IInterpretableNode type() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT12=null;
        IInterpretableNode arrayType13 = null;

        IInterpretableNode recordType14 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:99:2: ( IDENT | arrayType | recordType )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:99:4: IDENT
                    {
                    IDENT12=(Token)match(input,IDENT,FOLLOW_IDENT_in_type716); 
                    result = new UserTypeNode((IDENT12!=null?IDENT12.getText():null)); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:100:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type736);
                    arrayType13=arrayType();

                    state._fsp--;

                    result = arrayType13; 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:4: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type755);
                    recordType14=recordType();

                    state._fsp--;

                    result = recordType14; 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:104:1: recordType returns [IInterpretableNode result] : 'RECORD' fieldLists 'END' ;
    public final IInterpretableNode recordType() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> fieldLists15 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:2: ( 'RECORD' fieldLists 'END' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:105:4: 'RECORD' fieldLists 'END'
            {
            match(input,35,FOLLOW_35_in_recordType783); 
            pushFollow(FOLLOW_fieldLists_in_recordType785);
            fieldLists15=fieldLists();

            state._fsp--;

            match(input,25,FOLLOW_25_in_recordType787); 
            result = new RecordTypeNode(fieldLists15); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:108:1: fieldLists returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )* ;
    public final List<IInterpretableNode> fieldLists() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:2: ( (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:4: (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )*
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:4: (i1= identList ':' t1= type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:109:5: i1= identList ':' t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fieldLists814);
                    i1=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fieldLists816); 
                    pushFollow(FOLLOW_type_in_fieldLists820);
                    t1=type();

                    state._fsp--;


                    }
                    break;

            }

            result.add(new TypedFieldListNode(i1, t1)); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:4: ( ';' (i2= identList ':' t2= type ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:5: ';' (i2= identList ':' t2= type )
            	    {
            	    match(input,23,FOLLOW_23_in_fieldLists837); 
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:9: (i2= identList ':' t2= type )
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:10: i2= identList ':' t2= type
            	    {
            	    pushFollow(FOLLOW_identList_in_fieldLists842);
            	    i2=identList();

            	    state._fsp--;

            	    match(input,30,FOLLOW_30_in_fieldLists844); 
            	    pushFollow(FOLLOW_type_in_fieldLists848);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:113:1: arrayType returns [IInterpretableNode result] : 'ARRAY' expression 'OF' type ;
    public final IInterpretableNode arrayType() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression16 = null;

        IInterpretableNode type17 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:114:2: ( 'ARRAY' expression 'OF' type )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:114:4: 'ARRAY' expression 'OF' type
            {
            match(input,36,FOLLOW_36_in_arrayType873); 
            pushFollow(FOLLOW_expression_in_arrayType875);
            expression16=expression();

            state._fsp--;

            match(input,37,FOLLOW_37_in_arrayType877); 
            pushFollow(FOLLOW_type_in_arrayType879);
            type17=type();

            state._fsp--;

            result = new ArrayTypeNode(expression16, type17); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:117:1: identList returns [List<String> result = new ArrayList<String>()] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> result =  new ArrayList<String>();

        Token i1=null;
        Token i2=null;

        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:118:2: (i1= IDENT ( ',' i2= IDENT )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:118:4: i1= IDENT ( ',' i2= IDENT )*
            {
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList904); 
            result.add((i1!=null?i1.getText():null)); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:4: ( ',' i2= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:5: ',' i2= IDENT
            	    {
            	    match(input,38,FOLLOW_38_in_identList924); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList928); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:123:1: statementSequence returns [IInterpretableNode result] : statementList ;
    public final IInterpretableNode statementSequence() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> statementList18 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:2: ( statementList )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:124:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_statementSequence960);
            statementList18=statementList();

            state._fsp--;

            result = new StatementSequenceNode(statementList18); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:126:1: statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : s1= statement ( ';' s2= statement )* ;
    public final List<IInterpretableNode> statementList() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:127:2: (s1= statement ( ';' s2= statement )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:127:4: s1= statement ( ';' s2= statement )*
            {
            pushFollow(FOLLOW_statement_in_statementList987);
            s1=statement();

            state._fsp--;

            result.add(s1); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:128:4: ( ';' s2= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:128:5: ';' s2= statement
            	    {
            	    match(input,23,FOLLOW_23_in_statementList1006); 
            	    pushFollow(FOLLOW_statement_in_statementList1010);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:132:1: statement returns [IInterpretableNode result] : ( callStatement | ifStatement | whileStatement )? ;
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode callStatement19 = null;

        IInterpretableNode ifStatement20 = null;

        IInterpretableNode whileStatement21 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:2: ( ( callStatement | ifStatement | whileStatement )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:4: ( callStatement | ifStatement | whileStatement )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:4: ( callStatement | ifStatement | whileStatement )?
            int alt19=4;
            switch ( input.LA(1) ) {
                case IDENT:
                    {
                    alt19=1;
                    }
                    break;
                case 40:
                    {
                    alt19=2;
                    }
                    break;
                case 44:
                    {
                    alt19=3;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:133:6: callStatement
                    {
                    pushFollow(FOLLOW_callStatement_in_statement1043);
                    callStatement19=callStatement();

                    state._fsp--;

                    result = callStatement19; 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1061);
                    ifStatement20=ifStatement();

                    state._fsp--;

                    result = ifStatement20; 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1079);
                    whileStatement21=whileStatement();

                    state._fsp--;

                    result = whileStatement21; 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:139:1: callStatement returns [IInterpretableNode result] : IDENT selector ( ':=' expression | ( actualParameters )? ) ;
    public final IInterpretableNode callStatement() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT22=null;
        List<IInterpretableNode> selector23 = null;

        IInterpretableNode expression24 = null;

        List<IInterpretableNode> actualParameters25 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:2: ( IDENT selector ( ':=' expression | ( actualParameters )? ) )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:140:4: IDENT selector ( ':=' expression | ( actualParameters )? )
            {
            IDENT22=(Token)match(input,IDENT,FOLLOW_IDENT_in_callStatement1111); 
            pushFollow(FOLLOW_selector_in_callStatement1113);
            selector23=selector();

            state._fsp--;

            result = new IdentChangerNode((IDENT22!=null?IDENT22.getText():null), selector23); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:141:4: ( ':=' expression | ( actualParameters )? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            else if ( (LA21_0==23||LA21_0==25||LA21_0==33||(LA21_0>=42 && LA21_0<=43)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:141:5: ':=' expression
                    {
                    match(input,39,FOLLOW_39_in_callStatement1131); 
                    pushFollow(FOLLOW_expression_in_callStatement1133);
                    expression24=expression();

                    state._fsp--;

                    result = new AssignmentNode(result, expression24); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:6: ( actualParameters )?
                    {
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:6: ( actualParameters )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==33) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:7: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_callStatement1152);
                            actualParameters25=actualParameters();

                            state._fsp--;


                            }
                            break;

                    }

                    result = new ProcedureCallNode(result, actualParameters25); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:146:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,33,FOLLOW_33_in_actualParameters1183); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:8: (e1= expression ( ',' e2= expression )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=PLUS && LA23_0<=MINUS)||(LA23_0>=IDENT && LA23_0<=NUMBER)||LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1188);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:5: ( ',' e2= expression )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==38) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:6: ',' e2= expression
                    	    {
                    	    match(input,38,FOLLOW_38_in_actualParameters1207); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters1211);
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

            match(input,34,FOLLOW_34_in_actualParameters1238); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:1: ifStatement returns [IInterpretableNode result] : 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e1 = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode elseStatements26 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:155:2: ( 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:155:4: 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END'
            {
            match(input,40,FOLLOW_40_in_ifStatement1253); 
            pushFollow(FOLLOW_expression_in_ifStatement1257);
            e1=expression();

            state._fsp--;

            match(input,41,FOLLOW_41_in_ifStatement1259); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1263);
            ss1=statementSequence();

            state._fsp--;

            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:156:4: ( elseStatements )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=42 && LA24_0<=43)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:156:5: elseStatements
                    {
                    pushFollow(FOLLOW_elseStatements_in_ifStatement1270);
                    elseStatements26=elseStatements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ifStatement1274); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:159:1: elseStatements returns [IInterpretableNode result] : ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence );
    public final IInterpretableNode elseStatements() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode es = null;

        IInterpretableNode ss2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:160:2: ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            else if ( (LA26_0==43) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:160:5: 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )?
                    {
                    match(input,42,FOLLOW_42_in_elseStatements1299); 
                    pushFollow(FOLLOW_expression_in_elseStatements1303);
                    e=expression();

                    state._fsp--;

                    match(input,41,FOLLOW_41_in_elseStatements1305); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1309);
                    ss1=statementSequence();

                    state._fsp--;

                    result = new ElseIfNode(e, ss1, null); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:161:4: (es= elseStatements )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=42 && LA25_0<=43)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:162:5: es= elseStatements
                            {
                            pushFollow(FOLLOW_elseStatements_in_elseStatements1325);
                            es=elseStatements();

                            state._fsp--;

                            result = new ElseIfNode(e, ss1, es); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:164:4: 'ELSE' ss2= statementSequence
                    {
                    match(input,43,FOLLOW_43_in_elseStatements1345); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1349);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:167:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression27 = null;

        IInterpretableNode statementSequence28 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:168:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:168:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,44,FOLLOW_44_in_whileStatement1372); 
            pushFollow(FOLLOW_expression_in_whileStatement1374);
            expression27=expression();

            state._fsp--;

            match(input,45,FOLLOW_45_in_whileStatement1376); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1378);
            statementSequence28=statementSequence();

            state._fsp--;

            match(input,25,FOLLOW_25_in_whileStatement1380); 
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


    // $ANTLR start "assignment"
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:171:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT29=null;
        List<IInterpretableNode> selector30 = null;

        IInterpretableNode expression31 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:172:2: ( IDENT selector ':=' expression )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:172:4: IDENT selector ':=' expression
            {
            IDENT29=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1399); 
            pushFollow(FOLLOW_selector_in_assignment1401);
            selector30=selector();

            state._fsp--;

            result = new IdentChangerNode((IDENT29!=null?IDENT29.getText():null), selector30); 
            match(input,39,FOLLOW_39_in_assignment1419); 
            pushFollow(FOLLOW_expression_in_assignment1421);
            expression31=expression();

            state._fsp--;

            result = new AssignmentNode(result, expression31); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:176:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:177:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:177:4: s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1449);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:178:4: ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            int alt27=6;
            switch ( input.LA(1) ) {
                case EQUALS:
                    {
                    alt27=1;
                    }
                    break;
                case LT:
                    {
                    alt27=2;
                    }
                    break;
                case LT_EQ:
                    {
                    alt27=3;
                    }
                    break;
                case GT:
                    {
                    alt27=4;
                    }
                    break;
                case GT_EQ:
                    {
                    alt27=5;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:178:6: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1467); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1471);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:180:6: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression1490); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1494);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:181:6: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression1509); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1513);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:182:6: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression1528); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1532);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:183:6: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression1547); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1551);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:187:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1582); 
                    pushFollow(FOLLOW_term_in_simpleExpression1586);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:189:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1605); 
                    pushFollow(FOLLOW_term_in_simpleExpression1609);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:190:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression1629);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:191:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
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
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:191:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1649); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1653);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:192:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1671); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1675);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:193:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression1693); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1697);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:203:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:204:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:204:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1733);
            f1=factor();

            state._fsp--;

            result = f1; 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:205:3: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=MULT && LA31_0<=MOD)||LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:205:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:205:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
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
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:205:7: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term1755); 
            	            pushFollow(FOLLOW_factor_in_term1759);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:206:6: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term1776); 
            	            pushFollow(FOLLOW_factor_in_term1780);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:207:6: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term1798); 
            	            pushFollow(FOLLOW_factor_in_term1802);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:208:6: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term1820); 
            	            pushFollow(FOLLOW_factor_in_term1824);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:213:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT32=null;
        Token NUMBER34=null;
        List<IInterpretableNode> selector33 = null;

        IInterpretableNode expression35 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:214:2: ( IDENT selector | NUMBER | '(' expression ')' )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:214:5: IDENT selector
                    {
                    IDENT32=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1861); 
                    pushFollow(FOLLOW_selector_in_factor1863);
                    selector33=selector();

                    state._fsp--;

                    result = new IdentReaderNode((IDENT32!=null?IDENT32.getText():null), selector33); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:215:6: NUMBER
                    {
                    NUMBER34=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1883); 
                    result = new NumberNode(Integer.parseInt((NUMBER34!=null?NUMBER34.getText():null))); 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:6: '(' expression ')'
                    {
                    match(input,33,FOLLOW_33_in_factor1903); 
                    pushFollow(FOLLOW_expression_in_factor1905);
                    expression35=expression();

                    state._fsp--;

                    match(input,34,FOLLOW_34_in_factor1907); 
                    result = expression35; 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:220:1: selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<IInterpretableNode> selector() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT36=null;
        IInterpretableNode expression37 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:221:2: ( ( '.' IDENT | '[' expression ']' )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:221:5: ( '.' IDENT | '[' expression ']' )*
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:221:5: ( '.' IDENT | '[' expression ']' )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==26) ) {
                    alt33=1;
                }
                else if ( (LA33_0==46) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:221:6: '.' IDENT
            	    {
            	    match(input,26,FOLLOW_26_in_selector1936); 
            	    IDENT36=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1938); 
            	    result.add(new DotSelectorNode((IDENT36!=null?IDENT36.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:222:7: '[' expression ']'
            	    {
            	    match(input,46,FOLLOW_46_in_selector1960); 
            	    pushFollow(FOLLOW_expression_in_selector1962);
            	    expression37=expression();

            	    state._fsp--;

            	    match(input,47,FOLLOW_47_in_selector1964); 
            	    result.add(new ElementSelectorNode(expression37)); 

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


 

    public static final BitSet FOLLOW_22_in_module163 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_module167 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_module169 = new BitSet(new long[]{0x0000000138000000L});
    public static final BitSet FOLLOW_declarations_in_module171 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_module183 = new BitSet(new long[]{0x0000110000810000L});
    public static final BitSet FOLLOW_statementSequence_in_module185 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_module200 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_module204 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_module206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations232 = new BitSet(new long[]{0x0000000130000000L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations239 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations246 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_constantDeclarations296 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IDENT_in_constantDeclarations303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations305 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations307 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_constantDeclarations309 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_28_in_typeDeclarations344 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclarations351 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations353 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_type_in_typeDeclarations355 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_typeDeclarations357 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_29_in_varDeclarations394 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations400 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_varDeclarations402 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_type_in_varDeclarations404 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_varDeclarations406 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclarations446 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_procedureDeclarations448 = new BitSet(new long[]{0x0000000138000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations452 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_procedureDeclarations454 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_procedureHeading479 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_procedureHeading481 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody532 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_procedureBody539 = new BitSet(new long[]{0x0000110000810000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody543 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_procedureBody558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_procedureBody560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_formalParameters589 = new BitSet(new long[]{0x0000000420010000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters594 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_23_in_formalParameters613 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters617 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_34_in_formalParameters641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_fPSection657 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_identList_in_fPSection661 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fPSection663 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_type_in_fPSection667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection682 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fPSection684 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_type_in_fPSection688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_recordType783 = new BitSet(new long[]{0x0000000002810000L});
    public static final BitSet FOLLOW_fieldLists_in_recordType785 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_recordType787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldLists814 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fieldLists816 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_type_in_fieldLists820 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_fieldLists837 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_identList_in_fieldLists842 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fieldLists844 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_type_in_fieldLists848 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_36_in_arrayType873 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_arrayType875 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_arrayType877 = new BitSet(new long[]{0x0000001800010000L});
    public static final BitSet FOLLOW_type_in_arrayType879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList904 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_38_in_identList924 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_identList928 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_statementList_in_statementSequence960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList987 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_statementList1006 = new BitSet(new long[]{0x0000110000810000L});
    public static final BitSet FOLLOW_statement_in_statementList1010 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_callStatement_in_statement1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_callStatement1111 = new BitSet(new long[]{0x0000408204000000L});
    public static final BitSet FOLLOW_selector_in_callStatement1113 = new BitSet(new long[]{0x0000008200000002L});
    public static final BitSet FOLLOW_39_in_callStatement1131 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_callStatement1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_callStatement1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_actualParameters1183 = new BitSet(new long[]{0x0000000600030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1188 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_38_in_actualParameters1207 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1211 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_34_in_actualParameters1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ifStatement1253 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_ifStatement1257 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ifStatement1259 = new BitSet(new long[]{0x0000110000810000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1263 = new BitSet(new long[]{0x00000C0002000000L});
    public static final BitSet FOLLOW_elseStatements_in_ifStatement1270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ifStatement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elseStatements1299 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_elseStatements1303 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_elseStatements1305 = new BitSet(new long[]{0x0000110000810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1309 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_elseStatements_in_elseStatements1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_elseStatements1345 = new BitSet(new long[]{0x0000110000810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_whileStatement1372 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_whileStatement1374 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_whileStatement1376 = new BitSet(new long[]{0x0000110000810000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1378 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_whileStatement1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1399 = new BitSet(new long[]{0x0000408004000000L});
    public static final BitSet FOLLOW_selector_in_assignment1401 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_assignment1419 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_assignment1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1449 = new BitSet(new long[]{0x000000000000F202L});
    public static final BitSet FOLLOW_EQUALS_in_expression1467 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression1490 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression1509 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression1528 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression1547 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1582 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1605 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1629 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1649 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1653 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1671 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1675 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1693 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1697 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_factor_in_term1733 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MULT_in_term1755 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_factor_in_term1759 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_DIV_in_term1776 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_factor_in_term1780 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MOD_in_term1798 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_factor_in_term1802 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_AND_in_term1820 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_factor_in_term1824 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_IDENT_in_factor1861 = new BitSet(new long[]{0x0000400004000000L});
    public static final BitSet FOLLOW_selector_in_factor1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_factor1903 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_factor1905 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_factor1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_selector1936 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_selector1938 = new BitSet(new long[]{0x0000400004000002L});
    public static final BitSet FOLLOW_46_in_selector1960 = new BitSet(new long[]{0x0000000200030030L});
    public static final BitSet FOLLOW_expression_in_selector1962 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_selector1964 = new BitSet(new long[]{0x0000400004000002L});

}