// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g 2011-02-11 15:35:46

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
    public String getGrammarFileName() { return "D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g"; }



    // $ANTLR start "module"
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:34:1: module returns [IInterpretableNode result] : 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' ;
    public final IInterpretableNode module() throws RecognitionException {
        IInterpretableNode result = null;

        Token i1=null;
        Token i2=null;
        IInterpretableNode statementSequence1 = null;

        IInterpretableNode declarations2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:2: ( 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:35:4: 'MODULE' i1= IDENT ';' declarations ( 'BEGIN' statementSequence )? 'END' i2= IDENT '.'
            {
            match(input,22,FOLLOW_22_in_module163); 
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_module167); 
            match(input,23,FOLLOW_23_in_module169); 
            pushFollow(FOLLOW_declarations_in_module171);
            declarations2=declarations();

            state._fsp--;

            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:36:4: ( 'BEGIN' statementSequence )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:37:5: 'BEGIN' statementSequence
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:41:1: declarations returns [IInterpretableNode result] : c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations ;
    public final IInterpretableNode declarations() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> c = null;

        List<IInterpretableNode> t = null;

        List<IInterpretableNode> v = null;

        List<IInterpretableNode> p = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:2: (c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:42:4: c= constantDeclarations t= typeDeclarations v= varDeclarations p= procedureDeclarations
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:48:1: constantDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'CONST' ( IDENT '=' expression ';' )* )? ;
    public final List<IInterpretableNode> constantDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT3=null;
        IInterpretableNode expression4 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:2: ( ( 'CONST' ( IDENT '=' expression ';' )* )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:4: ( 'CONST' ( IDENT '=' expression ';' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:49:5: 'CONST' ( IDENT '=' expression ';' )*
                    {
                    match(input,27,FOLLOW_27_in_constantDeclarations296); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:4: ( IDENT '=' expression ';' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==IDENT) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:50:5: IDENT '=' expression ';'
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:55:1: typeDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'TYPE' ( IDENT '=' type ';' )* )? ;
    public final List<IInterpretableNode> typeDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT5=null;
        IInterpretableNode type6 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:2: ( ( 'TYPE' ( IDENT '=' type ';' )* )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:4: ( 'TYPE' ( IDENT '=' type ';' )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:56:5: 'TYPE' ( IDENT '=' type ';' )*
                    {
                    match(input,28,FOLLOW_28_in_typeDeclarations344); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:4: ( IDENT '=' type ';' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:57:5: IDENT '=' type ';'
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:62:1: varDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'VAR' ( identList ':' type ';' )* )? ;
    public final List<IInterpretableNode> varDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> identList7 = null;

        IInterpretableNode type8 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:2: ( ( 'VAR' ( identList ':' type ';' )* )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( 'VAR' ( identList ':' type ';' )* )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:4: ( 'VAR' ( identList ':' type ';' )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:63:5: 'VAR' ( identList ':' type ';' )*
                    {
                    match(input,29,FOLLOW_29_in_varDeclarations394); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:4: ( identList ':' type ';' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==IDENT) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:64:5: identList ':' type ';'
                    	    {
                    	    pushFollow(FOLLOW_identList_in_varDeclarations400);
                    	    identList7=identList();

                    	    state._fsp--;

                    	    match(input,30,FOLLOW_30_in_varDeclarations402); 
                    	    pushFollow(FOLLOW_type_in_varDeclarations404);
                    	    type8=type();

                    	    state._fsp--;

                    	    match(input,23,FOLLOW_23_in_varDeclarations406); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:68:1: procedureDeclarations returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( 'PROCEDURE' i1= IDENT ph= procedureHeading ';' pb= procedureBody 'END' i2= IDENT ';' )* ;
    public final List<IInterpretableNode> procedureDeclarations() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token i1=null;
        Token i2=null;
        IInterpretableNode ph = null;

        IInterpretableNode pb = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:2: ( ( 'PROCEDURE' i1= IDENT ph= procedureHeading ';' pb= procedureBody 'END' i2= IDENT ';' )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:4: ( 'PROCEDURE' i1= IDENT ph= procedureHeading ';' pb= procedureBody 'END' i2= IDENT ';' )*
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:69:4: ( 'PROCEDURE' i1= IDENT ph= procedureHeading ';' pb= procedureBody 'END' i2= IDENT ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:70:4: 'PROCEDURE' i1= IDENT ph= procedureHeading ';' pb= procedureBody 'END' i2= IDENT ';'
            	    {
            	    match(input,31,FOLLOW_31_in_procedureDeclarations445); 
            	    i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations449); 
            	    pushFollow(FOLLOW_procedureHeading_in_procedureDeclarations457);
            	    ph=procedureHeading();

            	    state._fsp--;

            	    match(input,23,FOLLOW_23_in_procedureDeclarations459); 
            	    pushFollow(FOLLOW_procedureBody_in_procedureDeclarations463);
            	    pb=procedureBody();

            	    state._fsp--;

            	    match(input,25,FOLLOW_25_in_procedureDeclarations473); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureDeclarations477); 
            	    match(input,23,FOLLOW_23_in_procedureDeclarations479); 
            	    result.add(new ProcedureDeclarationNode((i1!=null?i1.getText():null), (i2!=null?i2.getText():null), ph, pb)); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:76:1: procedureHeading returns [IInterpretableNode result] : ( formalParameters )? ;
    public final IInterpretableNode procedureHeading() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> formalParameters9 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:2: ( ( formalParameters )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:5: ( formalParameters )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:5: ( formalParameters )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:77:6: formalParameters
                    {
                    pushFollow(FOLLOW_formalParameters_in_procedureHeading509);
                    formalParameters9=formalParameters();

                    state._fsp--;

                    result = new ProcedureHeadingNode(formalParameters9); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:81:1: procedureBody returns [IInterpretableNode result] : d= declarations ( 'BEGIN' ss= statementSequence )? ;
    public final IInterpretableNode procedureBody() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode d = null;

        IInterpretableNode ss = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:2: (d= declarations ( 'BEGIN' ss= statementSequence )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:82:4: d= declarations ( 'BEGIN' ss= statementSequence )?
            {
            pushFollow(FOLLOW_declarations_in_procedureBody542);
            d=declarations();

            state._fsp--;

            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:4: ( 'BEGIN' ss= statementSequence )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:83:5: 'BEGIN' ss= statementSequence
                    {
                    match(input,24,FOLLOW_24_in_procedureBody549); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody553);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:87:1: formalParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' ;
    public final List<IInterpretableNode> formalParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode fp1 = null;

        IInterpretableNode fp2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:88:2: ( '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:88:4: '(' (fp1= fPSection ( ';' fp2= fPSection )* )? ')'
            {
            match(input,32,FOLLOW_32_in_formalParameters599); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:88:8: (fp1= fPSection ( ';' fp2= fPSection )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENT||LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:88:9: fp1= fPSection ( ';' fp2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters604);
                    fp1=fPSection();

                    state._fsp--;

                    result.add(fp1); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:5: ( ';' fp2= fPSection )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:89:6: ';' fp2= fPSection
                    	    {
                    	    match(input,23,FOLLOW_23_in_formalParameters623); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters627);
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

            match(input,33,FOLLOW_33_in_formalParameters651); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:94:1: fPSection returns [IInterpretableNode result] : ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) ;
    public final IInterpretableNode fPSection() throws RecognitionException {
        IInterpretableNode result = null;

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:2: ( ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type ) )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:4: ( 'VAR' i1= identList ':' t1= type | i2= identList ':' t2= type )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:95:5: 'VAR' i1= identList ':' t1= type
                    {
                    match(input,29,FOLLOW_29_in_fPSection667); 
                    pushFollow(FOLLOW_identList_in_fPSection671);
                    i1=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fPSection673); 
                    pushFollow(FOLLOW_type_in_fPSection677);
                    t1=type();

                    state._fsp--;

                    result = new ReferenceParametersNode(i1, t1); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:96:4: i2= identList ':' t2= type
                    {
                    pushFollow(FOLLOW_identList_in_fPSection692);
                    i2=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fPSection694); 
                    pushFollow(FOLLOW_type_in_fPSection698);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:100:1: type returns [IInterpretableNode result] : ( IDENT | arrayType | recordType );
    public final IInterpretableNode type() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT10=null;
        IInterpretableNode arrayType11 = null;

        IInterpretableNode recordType12 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:2: ( IDENT | arrayType | recordType )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:101:4: IDENT
                    {
                    IDENT10=(Token)match(input,IDENT,FOLLOW_IDENT_in_type726); 
                    result = new UserTypeNode((IDENT10!=null?IDENT10.getText():null)); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:102:4: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type746);
                    arrayType11=arrayType();

                    state._fsp--;

                    result = arrayType11; 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:103:4: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type765);
                    recordType12=recordType();

                    state._fsp--;

                    result = recordType12; 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:106:1: recordType returns [IInterpretableNode result] : 'RECORD' fieldLists 'END' ;
    public final IInterpretableNode recordType() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> fieldLists13 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:107:2: ( 'RECORD' fieldLists 'END' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:107:4: 'RECORD' fieldLists 'END'
            {
            match(input,34,FOLLOW_34_in_recordType793); 
            pushFollow(FOLLOW_fieldLists_in_recordType795);
            fieldLists13=fieldLists();

            state._fsp--;

            match(input,25,FOLLOW_25_in_recordType797); 
            result = new RecordTypeNode(fieldLists13); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:110:1: fieldLists returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )* ;
    public final List<IInterpretableNode> fieldLists() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        List<String> i1 = null;

        IInterpretableNode t1 = null;

        List<String> i2 = null;

        IInterpretableNode t2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:111:2: ( (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:111:4: (i1= identList ':' t1= type )? ( ';' (i2= identList ':' t2= type ) )*
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:111:4: (i1= identList ':' t1= type )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==IDENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:111:5: i1= identList ':' t1= type
                    {
                    pushFollow(FOLLOW_identList_in_fieldLists824);
                    i1=identList();

                    state._fsp--;

                    match(input,30,FOLLOW_30_in_fieldLists826); 
                    pushFollow(FOLLOW_type_in_fieldLists830);
                    t1=type();

                    state._fsp--;


                    }
                    break;

            }

            result.add(new TypedFieldListNode(i1, t1)); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:112:4: ( ';' (i2= identList ':' t2= type ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:112:5: ';' (i2= identList ':' t2= type )
            	    {
            	    match(input,23,FOLLOW_23_in_fieldLists847); 
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:112:9: (i2= identList ':' t2= type )
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:112:10: i2= identList ':' t2= type
            	    {
            	    pushFollow(FOLLOW_identList_in_fieldLists852);
            	    i2=identList();

            	    state._fsp--;

            	    match(input,30,FOLLOW_30_in_fieldLists854); 
            	    pushFollow(FOLLOW_type_in_fieldLists858);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:115:1: arrayType returns [IInterpretableNode result] : 'ARRAY' expression 'OF' type ;
    public final IInterpretableNode arrayType() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression14 = null;

        IInterpretableNode type15 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:116:2: ( 'ARRAY' expression 'OF' type )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:116:4: 'ARRAY' expression 'OF' type
            {
            match(input,35,FOLLOW_35_in_arrayType883); 
            pushFollow(FOLLOW_expression_in_arrayType885);
            expression14=expression();

            state._fsp--;

            match(input,36,FOLLOW_36_in_arrayType887); 
            pushFollow(FOLLOW_type_in_arrayType889);
            type15=type();

            state._fsp--;

            result = new ArrayTypeNode(expression14, type15); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:119:1: identList returns [List<String> result = new ArrayList<String>()] : i1= IDENT ( ',' i2= IDENT )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> result =  new ArrayList<String>();

        Token i1=null;
        Token i2=null;

        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:2: (i1= IDENT ( ',' i2= IDENT )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:120:4: i1= IDENT ( ',' i2= IDENT )*
            {
            i1=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList914); 
            result.add((i1!=null?i1.getText():null)); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:121:4: ( ',' i2= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==37) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:121:5: ',' i2= IDENT
            	    {
            	    match(input,37,FOLLOW_37_in_identList934); 
            	    i2=(Token)match(input,IDENT,FOLLOW_IDENT_in_identList938); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:125:1: statementSequence returns [IInterpretableNode result] : statementList ;
    public final IInterpretableNode statementSequence() throws RecognitionException {
        IInterpretableNode result = null;

        List<IInterpretableNode> statementList16 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:126:2: ( statementList )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:126:4: statementList
            {
            pushFollow(FOLLOW_statementList_in_statementSequence970);
            statementList16=statementList();

            state._fsp--;

            result = new StatementSequenceNode(statementList16); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:128:1: statementList returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : s1= statement ( ';' s2= statement )* ;
    public final List<IInterpretableNode> statementList() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:129:2: (s1= statement ( ';' s2= statement )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:129:4: s1= statement ( ';' s2= statement )*
            {
            pushFollow(FOLLOW_statement_in_statementList997);
            s1=statement();

            state._fsp--;

            result.add(s1); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:130:4: ( ';' s2= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:130:5: ';' s2= statement
            	    {
            	    match(input,23,FOLLOW_23_in_statementList1016); 
            	    pushFollow(FOLLOW_statement_in_statementList1020);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:134:1: statement returns [IInterpretableNode result] : ( assignment | procedureCall | ifStatement | whileStatement )? ;
    public final IInterpretableNode statement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode assignment17 = null;

        IInterpretableNode procedureCall18 = null;

        IInterpretableNode ifStatement19 = null;

        IInterpretableNode whileStatement20 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:2: ( ( assignment | procedureCall | ifStatement | whileStatement )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:4: ( assignment | procedureCall | ifStatement | whileStatement )?
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:4: ( assignment | procedureCall | ifStatement | whileStatement )?
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:135:6: assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement1053);
                    assignment17=assignment();

                    state._fsp--;

                    result = assignment17; 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:136:5: procedureCall
                    {
                    pushFollow(FOLLOW_procedureCall_in_statement1071);
                    procedureCall18=procedureCall();

                    state._fsp--;

                    result = procedureCall18; 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:137:5: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement1089);
                    ifStatement19=ifStatement();

                    state._fsp--;

                    result = ifStatement19; 

                    }
                    break;
                case 4 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:138:5: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement1107);
                    whileStatement20=whileStatement();

                    state._fsp--;

                    result = whileStatement20; 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:142:1: assignment returns [IInterpretableNode result] : IDENT selector ':=' expression ;
    public final IInterpretableNode assignment() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT21=null;
        List<IInterpretableNode> selector22 = null;

        IInterpretableNode expression23 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:143:2: ( IDENT selector ':=' expression )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:143:4: IDENT selector ':=' expression
            {
            IDENT21=(Token)match(input,IDENT,FOLLOW_IDENT_in_assignment1138); 
            pushFollow(FOLLOW_selector_in_assignment1140);
            selector22=selector();

            state._fsp--;

            result = new IdentSelectorNode((IDENT21!=null?IDENT21.getText():null), selector22); 
            match(input,38,FOLLOW_38_in_assignment1158); 
            pushFollow(FOLLOW_expression_in_assignment1160);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:147:1: procedureCall returns [IInterpretableNode result] : IDENT ( actualParameters )? ;
    public final IInterpretableNode procedureCall() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT24=null;
        List<IInterpretableNode> actualParameters25 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:2: ( IDENT ( actualParameters )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:4: IDENT ( actualParameters )?
            {
            IDENT24=(Token)match(input,IDENT,FOLLOW_IDENT_in_procedureCall1186); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:10: ( actualParameters )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:148:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCall1189);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:152:1: actualParameters returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : '(' (e1= expression ( ',' e2= expression )* )? ')' ;
    public final List<IInterpretableNode> actualParameters() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        IInterpretableNode e1 = null;

        IInterpretableNode e2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:2: ( '(' (e1= expression ( ',' e2= expression )* )? ')' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:4: '(' (e1= expression ( ',' e2= expression )* )? ')'
            {
            match(input,32,FOLLOW_32_in_actualParameters1216); 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:8: (e1= expression ( ',' e2= expression )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=PLUS && LA22_0<=MINUS)||(LA22_0>=IDENT && LA22_0<=NUMBER)||LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:153:9: e1= expression ( ',' e2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters1221);
                    e1=expression();

                    state._fsp--;

                    result.add(e1); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:5: ( ',' e2= expression )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==37) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:154:6: ',' e2= expression
                    	    {
                    	    match(input,37,FOLLOW_37_in_actualParameters1240); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters1244);
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

            match(input,33,FOLLOW_33_in_actualParameters1271); 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:160:1: ifStatement returns [IInterpretableNode result] : 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' ;
    public final IInterpretableNode ifStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e1 = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode elseStatements26 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:161:2: ( 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:161:4: 'IF' e1= expression 'THEN' ss1= statementSequence ( elseStatements )? 'END'
            {
            match(input,39,FOLLOW_39_in_ifStatement1286); 
            pushFollow(FOLLOW_expression_in_ifStatement1290);
            e1=expression();

            state._fsp--;

            match(input,40,FOLLOW_40_in_ifStatement1292); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement1296);
            ss1=statementSequence();

            state._fsp--;

            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:162:4: ( elseStatements )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=41 && LA23_0<=42)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:162:5: elseStatements
                    {
                    pushFollow(FOLLOW_elseStatements_in_ifStatement1303);
                    elseStatements26=elseStatements();

                    state._fsp--;


                    }
                    break;

            }

            match(input,25,FOLLOW_25_in_ifStatement1307); 
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:165:1: elseStatements returns [IInterpretableNode result] : ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence );
    public final IInterpretableNode elseStatements() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode e = null;

        IInterpretableNode ss1 = null;

        IInterpretableNode es = null;

        IInterpretableNode ss2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:166:2: ( 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )? | 'ELSE' ss2= statementSequence )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:166:5: 'ELSIF' e= expression 'THEN' ss1= statementSequence (es= elseStatements )?
                    {
                    match(input,41,FOLLOW_41_in_elseStatements1332); 
                    pushFollow(FOLLOW_expression_in_elseStatements1336);
                    e=expression();

                    state._fsp--;

                    match(input,40,FOLLOW_40_in_elseStatements1338); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1342);
                    ss1=statementSequence();

                    state._fsp--;

                    result = new ElseIfNode(e, ss1, null); 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:167:4: (es= elseStatements )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=41 && LA24_0<=42)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:168:5: es= elseStatements
                            {
                            pushFollow(FOLLOW_elseStatements_in_elseStatements1358);
                            es=elseStatements();

                            state._fsp--;

                            result = new ElseIfNode(e, ss1, es); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:170:4: 'ELSE' ss2= statementSequence
                    {
                    match(input,42,FOLLOW_42_in_elseStatements1378); 
                    pushFollow(FOLLOW_statementSequence_in_elseStatements1382);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:173:1: whileStatement returns [IInterpretableNode result] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final IInterpretableNode whileStatement() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode expression27 = null;

        IInterpretableNode statementSequence28 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:174:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:174:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,43,FOLLOW_43_in_whileStatement1405); 
            pushFollow(FOLLOW_expression_in_whileStatement1407);
            expression27=expression();

            state._fsp--;

            match(input,44,FOLLOW_44_in_whileStatement1409); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement1411);
            statementSequence28=statementSequence();

            state._fsp--;

            match(input,25,FOLLOW_25_in_whileStatement1413); 
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


    // $ANTLR start "expression"
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:177:1: expression returns [IInterpretableNode result] : s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? ;
    public final IInterpretableNode expression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode s1 = null;

        IInterpretableNode s2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:178:2: (s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )? )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:178:4: s1= simpleExpression ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression1434);
            s1=simpleExpression();

            state._fsp--;

            result = s1; 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:179:4: ( EQUALS s2= simpleExpression | LT s2= simpleExpression | LT_EQ s2= simpleExpression | GT s2= simpleExpression | GT_EQ s2= simpleExpression )?
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:179:6: EQUALS s2= simpleExpression
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_expression1452); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1456);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new EqualsExprNode(s1, s2); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:181:6: LT s2= simpleExpression
                    {
                    match(input,LT,FOLLOW_LT_in_expression1475); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1479);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTExprNode(result, s2); 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:182:6: LT_EQ s2= simpleExpression
                    {
                    match(input,LT_EQ,FOLLOW_LT_EQ_in_expression1494); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1498);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new LTEqualsExprNode(result, s2); 

                    }
                    break;
                case 4 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:183:6: GT s2= simpleExpression
                    {
                    match(input,GT,FOLLOW_GT_in_expression1513); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1517);
                    s2=simpleExpression();

                    state._fsp--;

                    result = new GTExprNode(result, s2); 

                    }
                    break;
                case 5 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:184:6: GT_EQ s2= simpleExpression
                    {
                    match(input,GT_EQ,FOLLOW_GT_EQ_in_expression1532); 
                    pushFollow(FOLLOW_simpleExpression_in_expression1536);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:188:1: simpleExpression returns [IInterpretableNode result] : ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* );
    public final IInterpretableNode simpleExpression() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode t1 = null;

        IInterpretableNode t2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:189:2: ( PLUS t1= term | MINUS t1= term | t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )* )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:189:6: PLUS t1= term
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1567); 
                    pushFollow(FOLLOW_term_in_simpleExpression1571);
                    t1=term();

                    state._fsp--;

                    result = t1; 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:190:5: MINUS t1= term
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1590); 
                    pushFollow(FOLLOW_term_in_simpleExpression1594);
                    t1=term();

                    state._fsp--;

                    result = new NegativeNumberNode(t1); 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:191:5: t1= term ( PLUS t2= term | MINUS t2= term | OR t2= term )*
                    {
                    pushFollow(FOLLOW_term_in_simpleExpression1614);
                    t1=term();

                    state._fsp--;

                    result = t1; 
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:192:3: ( PLUS t2= term | MINUS t2= term | OR t2= term )*
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
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:192:5: PLUS t2= term
                    	    {
                    	    match(input,PLUS,FOLLOW_PLUS_in_simpleExpression1634); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1638);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new PlusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:193:5: MINUS t2= term
                    	    {
                    	    match(input,MINUS,FOLLOW_MINUS_in_simpleExpression1656); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1660);
                    	    t2=term();

                    	    state._fsp--;

                    	    result = new MinusExprNode(result, t2); 

                    	    }
                    	    break;
                    	case 3 :
                    	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:194:5: OR t2= term
                    	    {
                    	    match(input,OR,FOLLOW_OR_in_simpleExpression1678); 
                    	    pushFollow(FOLLOW_term_in_simpleExpression1682);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:204:1: term returns [IInterpretableNode result] : f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* ;
    public final IInterpretableNode term() throws RecognitionException {
        IInterpretableNode result = null;

        IInterpretableNode f1 = null;

        IInterpretableNode f2 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:205:2: (f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:205:4: f1= factor ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_term1718);
            f1=factor();

            state._fsp--;

            result = f1; 
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:206:3: ( ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=MULT && LA30_0<=MOD)||LA30_0==AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:206:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
            	    {
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:206:5: ( MULT f2= factor | DIV f2= factor | MOD f2= factor | AND f2= factor )
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
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:206:7: MULT f2= factor
            	            {
            	            match(input,MULT,FOLLOW_MULT_in_term1740); 
            	            pushFollow(FOLLOW_factor_in_term1744);
            	            f2=factor();

            	            state._fsp--;

            	            result = new MultExprNode(result, f2); 

            	            }
            	            break;
            	        case 2 :
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:207:6: DIV f2= factor
            	            {
            	            match(input,DIV,FOLLOW_DIV_in_term1761); 
            	            pushFollow(FOLLOW_factor_in_term1765);
            	            f2=factor();

            	            state._fsp--;

            	            result = new DivExprNode(result, f2); 

            	            }
            	            break;
            	        case 3 :
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:208:6: MOD f2= factor
            	            {
            	            match(input,MOD,FOLLOW_MOD_in_term1783); 
            	            pushFollow(FOLLOW_factor_in_term1787);
            	            f2=factor();

            	            state._fsp--;

            	            result = new ModExprNode(result, f2); 

            	            }
            	            break;
            	        case 4 :
            	            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:209:6: AND f2= factor
            	            {
            	            match(input,AND,FOLLOW_AND_in_term1805); 
            	            pushFollow(FOLLOW_factor_in_term1809);
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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:214:1: factor returns [IInterpretableNode result] : ( IDENT selector | NUMBER | '(' expression ')' );
    public final IInterpretableNode factor() throws RecognitionException {
        IInterpretableNode result = null;

        Token IDENT29=null;
        Token NUMBER31=null;
        List<IInterpretableNode> selector30 = null;

        IInterpretableNode expression32 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:215:2: ( IDENT selector | NUMBER | '(' expression ')' )
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
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:215:5: IDENT selector
                    {
                    IDENT29=(Token)match(input,IDENT,FOLLOW_IDENT_in_factor1846); 
                    pushFollow(FOLLOW_selector_in_factor1848);
                    selector30=selector();

                    state._fsp--;

                    result = new IdentSelectorNode((IDENT29!=null?IDENT29.getText():null), selector30); 

                    }
                    break;
                case 2 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:216:6: NUMBER
                    {
                    NUMBER31=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor1868); 
                    result = new NumberNode(Integer.parseInt((NUMBER31!=null?NUMBER31.getText():null))); 

                    }
                    break;
                case 3 :
                    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:217:6: '(' expression ')'
                    {
                    match(input,32,FOLLOW_32_in_factor1888); 
                    pushFollow(FOLLOW_expression_in_factor1890);
                    expression32=expression();

                    state._fsp--;

                    match(input,33,FOLLOW_33_in_factor1892); 
                    result = expression32; 

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
    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:221:1: selector returns [List<IInterpretableNode> result = new ArrayList<IInterpretableNode>()] : ( '.' IDENT | '[' expression ']' )* ;
    public final List<IInterpretableNode> selector() throws RecognitionException {
        List<IInterpretableNode> result =  new ArrayList<IInterpretableNode>();

        Token IDENT33=null;
        IInterpretableNode expression34 = null;


        try {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:222:2: ( ( '.' IDENT | '[' expression ']' )* )
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:222:5: ( '.' IDENT | '[' expression ']' )*
            {
            // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:222:5: ( '.' IDENT | '[' expression ']' )*
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
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:222:6: '.' IDENT
            	    {
            	    match(input,26,FOLLOW_26_in_selector1921); 
            	    IDENT33=(Token)match(input,IDENT,FOLLOW_IDENT_in_selector1923); 
            	    result.add(new DotSelectorNode((IDENT33!=null?IDENT33.getText():null))); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Eclipse\\workspace\\OberonInterpreter\\grammar\\Oberon0.g:223:7: '[' expression ']'
            	    {
            	    match(input,45,FOLLOW_45_in_selector1945); 
            	    pushFollow(FOLLOW_expression_in_selector1947);
            	    expression34=expression();

            	    state._fsp--;

            	    match(input,46,FOLLOW_46_in_selector1949); 
            	    result.add(new ElementSelectorNode(expression34)); 

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
    public static final BitSet FOLLOW_24_in_module183 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_module185 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_module200 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_module204 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_module206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclarations_in_declarations232 = new BitSet(new long[]{0x00000000B0000000L});
    public static final BitSet FOLLOW_typeDeclarations_in_declarations239 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_varDeclarations_in_declarations246 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_procedureDeclarations_in_declarations253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_constantDeclarations296 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IDENT_in_constantDeclarations303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_constantDeclarations305 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_constantDeclarations307 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_constantDeclarations309 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_28_in_typeDeclarations344 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclarations351 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_EQUALS_in_typeDeclarations353 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_typeDeclarations355 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_typeDeclarations357 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_29_in_varDeclarations394 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_identList_in_varDeclarations400 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_varDeclarations402 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_varDeclarations404 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_varDeclarations406 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_31_in_procedureDeclarations445 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations449 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_procedureHeading_in_procedureDeclarations457 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_procedureDeclarations459 = new BitSet(new long[]{0x00000000B8000000L});
    public static final BitSet FOLLOW_procedureBody_in_procedureDeclarations463 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_procedureDeclarations473 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_procedureDeclarations477 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_procedureDeclarations479 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody542 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_procedureBody549 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_formalParameters599 = new BitSet(new long[]{0x0000000220010000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters604 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23_in_formalParameters623 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters627 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_33_in_formalParameters651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_fPSection667 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_identList_in_fPSection671 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fPSection673 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fPSection677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fPSection692 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fPSection694 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fPSection698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_type726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_recordType793 = new BitSet(new long[]{0x0000000002810000L});
    public static final BitSet FOLLOW_fieldLists_in_recordType795 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_recordType797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldLists824 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fieldLists826 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fieldLists830 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_fieldLists847 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_identList_in_fieldLists852 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_fieldLists854 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_fieldLists858 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_35_in_arrayType883 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_arrayType885 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_arrayType887 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_type_in_arrayType889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_identList914 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_identList934 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_identList938 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_statementList_in_statementSequence970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementList997 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_statementList1016 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statement_in_statementList1020 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_assignment_in_statement1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_statement1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_assignment1138 = new BitSet(new long[]{0x0000204004000000L});
    public static final BitSet FOLLOW_selector_in_assignment1140 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_assignment1158 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_assignment1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_procedureCall1186 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_actualParameters1216 = new BitSet(new long[]{0x0000000300030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1221 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_37_in_actualParameters1240 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_actualParameters1244 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_33_in_actualParameters1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ifStatement1286 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_ifStatement1290 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ifStatement1292 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement1296 = new BitSet(new long[]{0x0000060002000000L});
    public static final BitSet FOLLOW_elseStatements_in_ifStatement1303 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ifStatement1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elseStatements1332 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_elseStatements1336 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_elseStatements1338 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1342 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_elseStatements_in_elseStatements1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_elseStatements1378 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_elseStatements1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_whileStatement1405 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_whileStatement1407 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_whileStatement1409 = new BitSet(new long[]{0x0000088000810000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement1411 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_whileStatement1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1434 = new BitSet(new long[]{0x000000000000F202L});
    public static final BitSet FOLLOW_EQUALS_in_expression1452 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_expression1475 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_EQ_in_expression1494 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_expression1513 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_EQ_in_expression1532 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1567 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1590 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_simpleExpression1614 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_PLUS_in_simpleExpression1634 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1638 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_MINUS_in_simpleExpression1656 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1660 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_OR_in_simpleExpression1678 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1682 = new BitSet(new long[]{0x0000000000000432L});
    public static final BitSet FOLLOW_factor_in_term1718 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MULT_in_term1740 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1744 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_DIV_in_term1761 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1765 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_MOD_in_term1783 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1787 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_AND_in_term1805 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_factor_in_term1809 = new BitSet(new long[]{0x00000000000009C2L});
    public static final BitSet FOLLOW_IDENT_in_factor1846 = new BitSet(new long[]{0x0000200004000000L});
    public static final BitSet FOLLOW_selector_in_factor1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_factor1888 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_factor1890 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_factor1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_selector1921 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IDENT_in_selector1923 = new BitSet(new long[]{0x0000200004000002L});
    public static final BitSet FOLLOW_45_in_selector1945 = new BitSet(new long[]{0x0000000100030030L});
    public static final BitSet FOLLOW_expression_in_selector1947 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_selector1949 = new BitSet(new long[]{0x0000200004000002L});

}