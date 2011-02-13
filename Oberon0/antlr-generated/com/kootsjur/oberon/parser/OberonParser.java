// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g 2011-02-13 23:17:36

  package com.kootsjur.oberon.parser;
  import com.kootsjur.oberon.*;
  import com.kootsjur.oberon.statement.*;
  import com.kootsjur.oberon.environment.*;
  import com.kootsjur.oberon.evaluator.*;
  import com.kootsjur.oberon.declaration.*; 
  import com.kootsjur.oberon.declaration.constant.*;
  import com.kootsjur.oberon.declaration.formalparameter.*;
  import com.kootsjur.oberon.declaration.procedure.*;
  import com.kootsjur.oberon.declaration.type.*;
  import com.kootsjur.oberon.declaration.var.*;
  import com.kootsjur.oberon.type.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OberonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "LETTER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'='", "'TYPE'", "'VAR'", "':'", "','", "'PROCEDURE'", "'('", "')'", "'BOOL'", "'INTEGER'", "'RECORD'", "'ARRAY'", "'OF'", "':='", "'WHILE'", "'DO'", "'IF'", "'THEN'", "'ELSEIF'", "'ELSE'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'['", "']'"
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
    public static final int T__46=46;
    public static final int DIGIT=4;
    public static final int LETTER=5;
    public static final int WS=6;

    // delegates
    // delegators


        public OberonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public OberonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return OberonParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g"; }


    	public Module module;



    // $ANTLR start "module"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:30:1: module returns [Module m] : 'MODULE' ident1= ident ';' declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident '.' ;
    public final Module module() throws RecognitionException {
        Module m = null;

        OberonParser.ident_return ident1 = null;

        List<Declaration> declarations1 = null;

        ProcedureDeclaration procedure2 = null;

        StatementSequence statementSequence3 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:30:26: ( 'MODULE' ident1= ident ';' declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident '.' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:30:28: 'MODULE' ident1= ident ';' declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident '.'
            {
            match(input,7,FOLLOW_7_in_module49); 
            pushFollow(FOLLOW_ident_in_module53);
            ident1=ident();

            state._fsp--;

            match(input,8,FOLLOW_8_in_module54); 
            m = new Module((ident1!=null?input.toString(ident1.start,ident1.stop):null));
            pushFollow(FOLLOW_declarations_in_module63);
            declarations1=declarations();

            state._fsp--;

            m.setDeclarations(declarations1);
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:32:5: ( procedure ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:32:6: procedure ';'
            	    {
            	    pushFollow(FOLLOW_procedure_in_module73);
            	    procedure2=procedure();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_module74); 
            	    m.addProcedure(procedure2);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:33:5: ( 'BEGIN' statementSequence )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:33:6: 'BEGIN' statementSequence
                    {
                    match(input,9,FOLLOW_9_in_module85); 
                    pushFollow(FOLLOW_statementSequence_in_module87);
                    statementSequence3=statementSequence();

                    state._fsp--;

                    module.setStatementSequence(statementSequence3);

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_module93); 
            pushFollow(FOLLOW_ident_in_module95);
            ident();

            state._fsp--;

            match(input,11,FOLLOW_11_in_module97); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return m;
    }
    // $ANTLR end "module"


    // $ANTLR start "declarations"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:35:1: declarations returns [List<Declaration> ld] : ( constantDeclaration )* ( typeDeclaration )* ( varDeclaration )* ;
    public final List<Declaration> declarations() throws RecognitionException {
        List<Declaration> ld = null;

        List<ConstantDeclaration> constantDeclaration4 = null;

        List<TypeDeclaration> typeDeclaration5 = null;

        List<VarDeclaration> varDeclaration6 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:36:2: ( ( constantDeclaration )* ( typeDeclaration )* ( varDeclaration )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:36:4: ( constantDeclaration )* ( typeDeclaration )* ( varDeclaration )*
            {
            ld = new ArrayList<Declaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:37:3: ( constantDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:37:4: constantDeclaration
            	    {
            	    pushFollow(FOLLOW_constantDeclaration_in_declarations116);
            	    constantDeclaration4=constantDeclaration();

            	    state._fsp--;

            	    ld.addAll(constantDeclaration4);

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:38:3: ( typeDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:38:4: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_declarations125);
            	    typeDeclaration5=typeDeclaration();

            	    state._fsp--;

            	    ld.addAll(typeDeclaration5);

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:39:3: ( varDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:39:4: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_declarations135);
            	    varDeclaration6=varDeclaration();

            	    state._fsp--;

            	    ld.addAll(varDeclaration6);

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
        return ld;
    }
    // $ANTLR end "declarations"


    // $ANTLR start "constantDeclaration"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:42:1: constantDeclaration returns [List<ConstantDeclaration> lcd] : 'CONST' ( ident '=' expression ';' )+ ;
    public final List<ConstantDeclaration> constantDeclaration() throws RecognitionException {
        List<ConstantDeclaration> lcd = null;

        OberonParser.ident_return ident7 = null;

        ExpressionEvaluator expression8 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:2: ( 'CONST' ( ident '=' expression ';' )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:3: 'CONST' ( ident '=' expression ';' )+
            {
            match(input,12,FOLLOW_12_in_constantDeclaration158); 
            lcd = new ArrayList<ConstantDeclaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:58: ( ident '=' expression ';' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==LETTER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:59: ident '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_constantDeclaration163);
            	    ident7=ident();

            	    state._fsp--;

            	    match(input,13,FOLLOW_13_in_constantDeclaration165); 
            	    pushFollow(FOLLOW_expression_in_constantDeclaration167);
            	    expression8=expression();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_constantDeclaration169); 
            	    lcd.add(new ConstantDeclaration((ident7!=null?input.toString(ident7.start,ident7.stop):null), expression8));

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return lcd;
    }
    // $ANTLR end "constantDeclaration"


    // $ANTLR start "typeDeclaration"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:45:1: typeDeclaration returns [List<TypeDeclaration> ltd] : 'TYPE' ( ident '=' type ';' )+ ;
    public final List<TypeDeclaration> typeDeclaration() throws RecognitionException {
        List<TypeDeclaration> ltd = null;

        OberonParser.ident_return ident9 = null;

        TypeDefinition type10 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:46:2: ( 'TYPE' ( ident '=' type ';' )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:46:4: 'TYPE' ( ident '=' type ';' )+
            {
            match(input,14,FOLLOW_14_in_typeDeclaration189); 
            ltd = new ArrayList<TypeDeclaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:46:54: ( ident '=' type ';' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==LETTER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:46:55: ident '=' type ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_typeDeclaration194);
            	    ident9=ident();

            	    state._fsp--;

            	    match(input,13,FOLLOW_13_in_typeDeclaration196); 
            	    pushFollow(FOLLOW_type_in_typeDeclaration198);
            	    type10=type();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_typeDeclaration200); 
            	    ltd.add(new TypeDeclaration((ident9!=null?input.toString(ident9.start,ident9.stop):null), type10));

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ltd;
    }
    // $ANTLR end "typeDeclaration"


    // $ANTLR start "varDeclaration"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:48:1: varDeclaration returns [List<VarDeclaration> lvd] : 'VAR' ( identList ':' type ';' )+ ;
    public final List<VarDeclaration> varDeclaration() throws RecognitionException {
        List<VarDeclaration> lvd = null;

        IdentList identList11 = null;

        TypeDefinition type12 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:49:2: ( 'VAR' ( identList ':' type ';' )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:49:4: 'VAR' ( identList ':' type ';' )+
            {
            match(input,15,FOLLOW_15_in_varDeclaration218); 
            lvd = new ArrayList<VarDeclaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:49:52: ( identList ':' type ';' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LETTER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:49:53: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclaration223);
            	    identList11=identList();

            	    state._fsp--;

            	    match(input,16,FOLLOW_16_in_varDeclaration225); 
            	    pushFollow(FOLLOW_type_in_varDeclaration227);
            	    type12=type();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_varDeclaration229); 
            	    lvd.add(new VarDeclaration(identList11, type12));

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return lvd;
    }
    // $ANTLR end "varDeclaration"


    // $ANTLR start "identList"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:51:1: identList returns [IdentList i] : ident1= ident ( ',' ident2= ident )* ;
    public final IdentList identList() throws RecognitionException {
        IdentList i = null;

        OberonParser.ident_return ident1 = null;

        OberonParser.ident_return ident2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:52:2: (ident1= ident ( ',' ident2= ident )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:52:5: ident1= ident ( ',' ident2= ident )*
            {
            i = new IdentList();
            pushFollow(FOLLOW_ident_in_identList254);
            ident1=ident();

            state._fsp--;

            i.add((ident1!=null?input.toString(ident1.start,ident1.stop):null));
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:52:65: ( ',' ident2= ident )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:52:66: ',' ident2= ident
            	    {
            	    match(input,17,FOLLOW_17_in_identList258); 
            	    pushFollow(FOLLOW_ident_in_identList261);
            	    ident2=ident();

            	    state._fsp--;

            	    i.add((ident2!=null?input.toString(ident2.start,ident2.stop):null));

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
        return i;
    }
    // $ANTLR end "identList"


    // $ANTLR start "procedure"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:54:1: procedure returns [ProcedureDeclaration p] : procedureHeading ';' procedureBody ;
    public final ProcedureDeclaration procedure() throws RecognitionException {
        ProcedureDeclaration p = null;

        ProcedureHeading procedureHeading13 = null;

        ProcedureBody procedureBody14 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:55:2: ( procedureHeading ';' procedureBody )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:55:4: procedureHeading ';' procedureBody
            {
            pushFollow(FOLLOW_procedureHeading_in_procedure285);
            procedureHeading13=procedureHeading();

            state._fsp--;

            match(input,8,FOLLOW_8_in_procedure287); 
            pushFollow(FOLLOW_procedureBody_in_procedure289);
            procedureBody14=procedureBody();

            state._fsp--;

            p = new ProcedureDeclaration(procedureHeading13, procedureBody14);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return p;
    }
    // $ANTLR end "procedure"


    // $ANTLR start "procedureBody"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:57:1: procedureBody returns [ProcedureBody pb] : declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident ;
    public final ProcedureBody procedureBody() throws RecognitionException {
        ProcedureBody pb = null;

        List<Declaration> declarations15 = null;

        ProcedureDeclaration procedure16 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:2: ( declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:4: declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident
            {
            pb = new ProcedureBody();
            pushFollow(FOLLOW_declarations_in_procedureBody312);
            declarations15=declarations();

            state._fsp--;

            pb.setDeclarations(declarations15);
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:60:5: ( procedure ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:60:6: procedure ';'
            	    {
            	    pushFollow(FOLLOW_procedure_in_procedureBody322);
            	    procedure16=procedure();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_procedureBody323); 
            	    pb.addProcedure(procedure16);

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:61:5: ( 'BEGIN' statementSequence )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==9) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:61:6: 'BEGIN' statementSequence
                    {
                    match(input,9,FOLLOW_9_in_procedureBody334); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody336);
                    statementSequence();

                    state._fsp--;

                    pb.setStatementSequence(new StatementSequence());

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedureBody342); 
            pushFollow(FOLLOW_ident_in_procedureBody344);
            ident();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pb;
    }
    // $ANTLR end "procedureBody"


    // $ANTLR start "procedureHeading"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:63:1: procedureHeading returns [ProcedureHeading ph] : 'PROCEDURE' ident ( formalParameters ) ;
    public final ProcedureHeading procedureHeading() throws RecognitionException {
        ProcedureHeading ph = null;

        OberonParser.ident_return ident17 = null;

        FormalParameters formalParameters18 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:64:2: ( 'PROCEDURE' ident ( formalParameters ) )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:64:4: 'PROCEDURE' ident ( formalParameters )
            {
            match(input,18,FOLLOW_18_in_procedureHeading358); 
            pushFollow(FOLLOW_ident_in_procedureHeading359);
            ident17=ident();

            state._fsp--;

            ph = new ProcedureHeading((ident17!=null?input.toString(ident17.start,ident17.stop):null));
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:64:63: ( formalParameters )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:64:64: formalParameters
            {
            pushFollow(FOLLOW_formalParameters_in_procedureHeading363);
            formalParameters18=formalParameters();

            state._fsp--;


            }

            ph.setFormalParameters(formalParameters18);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ph;
    }
    // $ANTLR end "procedureHeading"


    // $ANTLR start "formalParameters"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:66:1: formalParameters returns [FormalParameters fp] : '(' (fPSection1= fPSection ( ';' fPSection2= fPSection )* )? ')' ;
    public final FormalParameters formalParameters() throws RecognitionException {
        FormalParameters fp = null;

        FPSection fPSection1 = null;

        FPSection fPSection2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:67:2: ( '(' (fPSection1= fPSection ( ';' fPSection2= fPSection )* )? ')' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:67:4: '(' (fPSection1= fPSection ( ';' fPSection2= fPSection )* )? ')'
            {
            fp = new FormalParameters();
            match(input,19,FOLLOW_19_in_formalParameters382); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:67:38: (fPSection1= fPSection ( ';' fPSection2= fPSection )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LETTER||LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:67:39: fPSection1= fPSection ( ';' fPSection2= fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters386);
                    fPSection1=fPSection();

                    state._fsp--;

                    fp.add(fPSection1);
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:67:88: ( ';' fPSection2= fPSection )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==8) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:67:89: ';' fPSection2= fPSection
                    	    {
                    	    match(input,8,FOLLOW_8_in_formalParameters391); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters394);
                    	    fPSection2=fPSection();

                    	    state._fsp--;

                    	    fp.add(fPSection2);

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_formalParameters401); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return fp;
    }
    // $ANTLR end "formalParameters"


    // $ANTLR start "fPSection"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:69:1: fPSection returns [FPSection fps] : ( 'VAR' )? identList ':' type ;
    public final FPSection fPSection() throws RecognitionException {
        FPSection fps = null;

        IdentList identList19 = null;

        TypeDefinition type20 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:70:2: ( ( 'VAR' )? identList ':' type )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:70:4: ( 'VAR' )? identList ':' type
            {
            String paramDirection = "IN";
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:71:2: ( 'VAR' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:71:3: 'VAR'
                    {
                    match(input,15,FOLLOW_15_in_fPSection422); 
                    paramDirection = "INOUT";

                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection428);
            identList19=identList();

            state._fsp--;

            match(input,16,FOLLOW_16_in_fPSection429); 
            pushFollow(FOLLOW_type_in_fPSection430);
            type20=type();

            state._fsp--;

            fps = new FPSection(identList19, type20, ParameterDirection.valueOf(paramDirection));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return fps;
    }
    // $ANTLR end "fPSection"


    // $ANTLR start "type"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:73:1: type returns [TypeDefinition t] : ( ident | arrayType | recordType | integerType | boolType );
    public final TypeDefinition type() throws RecognitionException {
        TypeDefinition t = null;

        OberonParser.ident_return ident21 = null;

        ArrayType arrayType22 = null;

        RecordType recordType23 = null;

        IntegerType integerType24 = null;

        BoolType boolType25 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:73:33: ( ident | arrayType | recordType | integerType | boolType )
            int alt15=5;
            switch ( input.LA(1) ) {
            case LETTER:
                {
                alt15=1;
                }
                break;
            case 24:
                {
                alt15=2;
                }
                break;
            case 23:
                {
                alt15=3;
                }
                break;
            case 22:
                {
                alt15=4;
                }
                break;
            case 21:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:73:35: ident
                    {
                    pushFollow(FOLLOW_ident_in_type445);
                    ident21=ident();

                    state._fsp--;

                    t = new UserType((ident21!=null?input.toString(ident21.start,ident21.stop):null));

                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:74:11: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type459);
                    arrayType22=arrayType();

                    state._fsp--;

                    t = arrayType22;

                    }
                    break;
                case 3 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:75:11: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type473);
                    recordType23=recordType();

                    state._fsp--;

                    t = recordType23;

                    }
                    break;
                case 4 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:76:11: integerType
                    {
                    pushFollow(FOLLOW_integerType_in_type487);
                    integerType24=integerType();

                    state._fsp--;

                    t = integerType24;

                    }
                    break;
                case 5 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:77:11: boolType
                    {
                    pushFollow(FOLLOW_boolType_in_type502);
                    boolType25=boolType();

                    state._fsp--;

                    t = boolType25;

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
        return t;
    }
    // $ANTLR end "type"


    // $ANTLR start "boolType"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:1: boolType returns [BoolType b] : 'BOOL' ;
    public final BoolType boolType() throws RecognitionException {
        BoolType b = null;

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:31: ( 'BOOL' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:33: 'BOOL'
            {
            match(input,21,FOLLOW_21_in_boolType535); 
            b = new BoolType();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return b;
    }
    // $ANTLR end "boolType"


    // $ANTLR start "integerType"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:82:1: integerType returns [IntegerType i] : 'INTEGER' ;
    public final IntegerType integerType() throws RecognitionException {
        IntegerType i = null;

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:82:37: ( 'INTEGER' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:82:39: 'INTEGER'
            {
            match(input,22,FOLLOW_22_in_integerType560); 
            i = new IntegerType();

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "integerType"


    // $ANTLR start "recordType"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:84:1: recordType returns [RecordType r] : 'RECORD' fieldList1= fieldList ( ';' fieldList2= fieldList )* 'END' ;
    public final RecordType recordType() throws RecognitionException {
        RecordType r = null;

        FieldList fieldList1 = null;

        FieldList fieldList2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:85:2: ( 'RECORD' fieldList1= fieldList ( ';' fieldList2= fieldList )* 'END' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:85:4: 'RECORD' fieldList1= fieldList ( ';' fieldList2= fieldList )* 'END'
            {
            List<FieldList> fl = new ArrayList<FieldList>();
            match(input,23,FOLLOW_23_in_recordType585); 
            pushFollow(FOLLOW_fieldList_in_recordType589);
            fieldList1=fieldList();

            state._fsp--;

            fl.add(fieldList1);
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:85:108: ( ';' fieldList2= fieldList )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==8) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:85:109: ';' fieldList2= fieldList
            	    {
            	    match(input,8,FOLLOW_8_in_recordType593); 
            	    pushFollow(FOLLOW_fieldList_in_recordType596);
            	    fieldList2=fieldList();

            	    state._fsp--;

            	    fl.add(fieldList2);

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_recordType601); 
            r = new RecordType(fl);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return r;
    }
    // $ANTLR end "recordType"


    // $ANTLR start "fieldList"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:87:1: fieldList returns [FieldList f] : ( identList ':' type )? ;
    public final FieldList fieldList() throws RecognitionException {
        FieldList f = null;

        IdentList identList26 = null;

        TypeDefinition type27 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:88:2: ( ( identList ':' type )? )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:88:4: ( identList ':' type )?
            {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:88:4: ( identList ':' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LETTER) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:88:5: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList618);
                    identList26=identList();

                    state._fsp--;

                    match(input,16,FOLLOW_16_in_fieldList619); 
                    pushFollow(FOLLOW_type_in_fieldList620);
                    type27=type();

                    state._fsp--;

                    f = new FieldList(identList26, type27);

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
        return f;
    }
    // $ANTLR end "fieldList"


    // $ANTLR start "arrayType"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:90:1: arrayType returns [ArrayType a] : 'ARRAY' expression 'OF' type ;
    public final ArrayType arrayType() throws RecognitionException {
        ArrayType a = null;

        ExpressionEvaluator expression28 = null;

        TypeDefinition type29 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:91:2: ( 'ARRAY' expression 'OF' type )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:91:4: 'ARRAY' expression 'OF' type
            {
            match(input,24,FOLLOW_24_in_arrayType638); 
            pushFollow(FOLLOW_expression_in_arrayType640);
            expression28=expression();

            state._fsp--;

            match(input,25,FOLLOW_25_in_arrayType642); 
            pushFollow(FOLLOW_type_in_arrayType644);
            type29=type();

            state._fsp--;

            a = new ArrayType(expression28, type29);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "arrayType"


    // $ANTLR start "statementSequence"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:93:1: statementSequence returns [StatementSequence s] : statement1= statement ( ';' statement2= statement )* ;
    public final StatementSequence statementSequence() throws RecognitionException {
        StatementSequence s = null;

        Statement statement1 = null;

        Statement statement2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:2: (statement1= statement ( ';' statement2= statement )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:4: statement1= statement ( ';' statement2= statement )*
            {
            s = new StatementSequence();
            pushFollow(FOLLOW_statement_in_statementSequence665);
            statement1=statement();

            state._fsp--;

            s.add(statement1);
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:80: ( ';' statement2= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==8) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:81: ';' statement2= statement
            	    {
            	    match(input,8,FOLLOW_8_in_statementSequence668); 
            	    pushFollow(FOLLOW_statement_in_statementSequence671);
            	    statement2=statement();

            	    state._fsp--;

            	    s.add(statement2);

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
        return s;
    }
    // $ANTLR end "statementSequence"


    // $ANTLR start "statement"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:96:1: statement returns [Statement s] : ( ident ( ( actualParameters ) | ( bracketSelector )? ':=' expression ) | ifStatement | whileStatement )? ;
    public final Statement statement() throws RecognitionException {
        Statement s = null;

        OberonParser.ident_return ident30 = null;

        ActualParameters actualParameters31 = null;

        Evaluator bracketSelector32 = null;

        ExpressionEvaluator expression33 = null;

        IfStatement ifStatement34 = null;

        WhileStatement whileStatement35 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:2: ( ( ident ( ( actualParameters ) | ( bracketSelector )? ':=' expression ) | ifStatement | whileStatement )? )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:4: ( ident ( ( actualParameters ) | ( bracketSelector )? ':=' expression ) | ifStatement | whileStatement )?
            {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:4: ( ident ( ( actualParameters ) | ( bracketSelector )? ':=' expression ) | ifStatement | whileStatement )?
            int alt21=4;
            switch ( input.LA(1) ) {
                case LETTER:
                    {
                    alt21=1;
                    }
                    break;
                case 29:
                    {
                    alt21=2;
                    }
                    break;
                case 27:
                    {
                    alt21=3;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:5: ident ( ( actualParameters ) | ( bracketSelector )? ':=' expression )
                    {
                    pushFollow(FOLLOW_ident_in_statement689);
                    ident30=ident();

                    state._fsp--;

                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:11: ( ( actualParameters ) | ( bracketSelector )? ':=' expression )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==19) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==26||LA20_0==45) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:12: ( actualParameters )
                            {
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:12: ( actualParameters )
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:13: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_statement693);
                            actualParameters31=actualParameters();

                            state._fsp--;


                            }

                            s = new ProcedureCall((ident30!=null?input.toString(ident30.start,ident30.stop):null), actualParameters31);

                            }
                            break;
                        case 2 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:98:10: ( bracketSelector )? ':=' expression
                            {
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:98:10: ( bracketSelector )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==45) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:98:11: bracketSelector
                                    {
                                    pushFollow(FOLLOW_bracketSelector_in_statement708);
                                    bracketSelector32=bracketSelector();

                                    state._fsp--;


                                    }
                                    break;

                            }

                            match(input,26,FOLLOW_26_in_statement712); 
                            pushFollow(FOLLOW_expression_in_statement714);
                            expression33=expression();

                            state._fsp--;

                            s = new Assignment((ident30!=null?input.toString(ident30.start,ident30.stop):null), bracketSelector32, expression33);

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:99:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement722);
                    ifStatement34=ifStatement();

                    state._fsp--;

                    s = ifStatement34;

                    }
                    break;
                case 3 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:100:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement729);
                    whileStatement35=whileStatement();

                    state._fsp--;

                    s = whileStatement35;

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
        return s;
    }
    // $ANTLR end "statement"


    // $ANTLR start "whileStatement"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:103:1: whileStatement returns [WhileStatement w] : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final WhileStatement whileStatement() throws RecognitionException {
        WhileStatement w = null;

        ExpressionEvaluator expression36 = null;

        StatementSequence statementSequence37 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:104:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:104:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,27,FOLLOW_27_in_whileStatement749); 
            pushFollow(FOLLOW_expression_in_whileStatement751);
            expression36=expression();

            state._fsp--;

            match(input,28,FOLLOW_28_in_whileStatement753); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement755);
            statementSequence37=statementSequence();

            state._fsp--;

            match(input,10,FOLLOW_10_in_whileStatement757); 
            w = new WhileStatement(expression36, statementSequence37);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return w;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "ifStatement"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:106:1: ifStatement returns [IfStatement i] : 'IF' expression1= expression 'THEN' statementSequence1= statementSequence ( 'ELSEIF' expression2= expression 'THEN' statementSequence2= statementSequence )* ( 'ELSE' statementSequence3= statementSequence )? 'END' ;
    public final IfStatement ifStatement() throws RecognitionException {
        IfStatement i = null;

        ExpressionEvaluator expression1 = null;

        StatementSequence statementSequence1 = null;

        ExpressionEvaluator expression2 = null;

        StatementSequence statementSequence2 = null;

        StatementSequence statementSequence3 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:107:2: ( 'IF' expression1= expression 'THEN' statementSequence1= statementSequence ( 'ELSEIF' expression2= expression 'THEN' statementSequence2= statementSequence )* ( 'ELSE' statementSequence3= statementSequence )? 'END' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:107:4: 'IF' expression1= expression 'THEN' statementSequence1= statementSequence ( 'ELSEIF' expression2= expression 'THEN' statementSequence2= statementSequence )* ( 'ELSE' statementSequence3= statementSequence )? 'END'
            {
            match(input,29,FOLLOW_29_in_ifStatement774); 
            pushFollow(FOLLOW_expression_in_ifStatement778);
            expression1=expression();

            state._fsp--;

            match(input,30,FOLLOW_30_in_ifStatement780); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement784);
            statementSequence1=statementSequence();

            state._fsp--;

            i = new IfStatement(expression1, statementSequence1);
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:108:7: ( 'ELSEIF' expression2= expression 'THEN' statementSequence2= statementSequence )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:108:8: 'ELSEIF' expression2= expression 'THEN' statementSequence2= statementSequence
            	    {
            	    match(input,31,FOLLOW_31_in_ifStatement795); 
            	    pushFollow(FOLLOW_expression_in_ifStatement799);
            	    expression2=expression();

            	    state._fsp--;

            	    match(input,30,FOLLOW_30_in_ifStatement801); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement805);
            	    statementSequence2=statementSequence();

            	    state._fsp--;

            	    i.addElseIfStatement(new IfStatement(expression2, statementSequence2));

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:109:4: ( 'ELSE' statementSequence3= statementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:109:5: 'ELSE' statementSequence3= statementSequence
                    {
                    match(input,32,FOLLOW_32_in_ifStatement815); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement819);
                    statementSequence3=statementSequence();

                    state._fsp--;

                    i.setElseStatementSequence(statementSequence3);

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifStatement825); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return i;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "procedureCall"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:111:1: procedureCall : ident ( selector )? ( actualParameters ) ;
    public final void procedureCall() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:112:2: ( ident ( selector )? ( actualParameters ) )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:112:4: ident ( selector )? ( actualParameters )
            {
            pushFollow(FOLLOW_ident_in_procedureCall837);
            ident();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:112:10: ( selector )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11||LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:112:11: selector
                    {
                    pushFollow(FOLLOW_selector_in_procedureCall840);
                    selector();

                    state._fsp--;


                    }
                    break;

            }

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:112:21: ( actualParameters )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:112:22: actualParameters
            {
            pushFollow(FOLLOW_actualParameters_in_procedureCall844);
            actualParameters();

            state._fsp--;


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
    // $ANTLR end "procedureCall"


    // $ANTLR start "assignment"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:114:1: assignment : ident ( selector )? ':=' expression ;
    public final void assignment() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:115:2: ( ident ( selector )? ':=' expression )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:115:4: ident ( selector )? ':=' expression
            {
            pushFollow(FOLLOW_ident_in_assignment856);
            ident();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:115:10: ( selector )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==11||LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:115:11: selector
                    {
                    pushFollow(FOLLOW_selector_in_assignment859);
                    selector();

                    state._fsp--;


                    }
                    break;

            }

            match(input,26,FOLLOW_26_in_assignment862); 
            pushFollow(FOLLOW_expression_in_assignment863);
            expression();

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
    // $ANTLR end "assignment"


    // $ANTLR start "actualParameters"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:117:1: actualParameters returns [ActualParameters a] : '(' (expression1= expression ( ',' expression2= expression )* )? ')' ;
    public final ActualParameters actualParameters() throws RecognitionException {
        ActualParameters a = null;

        ExpressionEvaluator expression1 = null;

        ExpressionEvaluator expression2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:118:2: ( '(' (expression1= expression ( ',' expression2= expression )* )? ')' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:118:4: '(' (expression1= expression ( ',' expression2= expression )* )? ')'
            {
            a = new ActualParameters();
            match(input,19,FOLLOW_19_in_actualParameters882); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:118:38: (expression1= expression ( ',' expression2= expression )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=DIGIT && LA27_0<=LETTER)||LA27_0==19||(LA27_0>=38 && LA27_0<=39)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:118:39: expression1= expression ( ',' expression2= expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters886);
                    expression1=expression();

                    state._fsp--;

                    a.add(new ActualParameter(expression1));
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:118:108: ( ',' expression2= expression )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==17) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:118:109: ',' expression2= expression
                    	    {
                    	    match(input,17,FOLLOW_17_in_actualParameters890); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters893);
                    	    expression2=expression();

                    	    state._fsp--;

                    	    a.add(new ActualParameter(expression2));

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_actualParameters900); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "actualParameters"


    // $ANTLR start "expression"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:120:1: expression returns [ExpressionEvaluator e] : simpleExpression1= simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression2= simpleExpression )? ;
    public final ExpressionEvaluator expression() throws RecognitionException {
        ExpressionEvaluator e = null;

        Evaluator simpleExpression1 = null;

        Evaluator simpleExpression2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:121:2: (simpleExpression1= simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression2= simpleExpression )? )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:121:4: simpleExpression1= simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression2= simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression917);
            simpleExpression1=simpleExpression();

            state._fsp--;

            e = (ExpressionEvaluator) simpleExpression1;
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:121:90: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression2= simpleExpression )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13||(LA29_0>=33 && LA29_0<=37)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:122:7: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression2= simpleExpression
                    {
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:122:7: ( '=' | '#' | '<' | '<=' | '>' | '>=' )
                    int alt28=6;
                    switch ( input.LA(1) ) {
                    case 13:
                        {
                        alt28=1;
                        }
                        break;
                    case 33:
                        {
                        alt28=2;
                        }
                        break;
                    case 34:
                        {
                        alt28=3;
                        }
                        break;
                    case 35:
                        {
                        alt28=4;
                        }
                        break;
                    case 36:
                        {
                        alt28=5;
                        }
                        break;
                    case 37:
                        {
                        alt28=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:122:8: '='
                            {
                            match(input,13,FOLLOW_13_in_expression930); 
                            e = new IsEqualToEvaluator(e, simpleExpression2);

                            }
                            break;
                        case 2 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:123:8: '#'
                            {
                            match(input,33,FOLLOW_33_in_expression941); 
                            e = new IsEqualToEvaluator(e, simpleExpression2);

                            }
                            break;
                        case 3 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:124:8: '<'
                            {
                            match(input,34,FOLLOW_34_in_expression952); 
                            e = new IsLesserThenEvaluator(e, simpleExpression2);

                            }
                            break;
                        case 4 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:125:8: '<='
                            {
                            match(input,35,FOLLOW_35_in_expression964); 
                            e = new IsEqualOrLesserThenEvaluator(e, simpleExpression2);

                            }
                            break;
                        case 5 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:126:8: '>'
                            {
                            match(input,36,FOLLOW_36_in_expression976); 
                            e = new IsGreaterThenEvaluator(e, simpleExpression2);

                            }
                            break;
                        case 6 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:127:8: '>='
                            {
                            match(input,37,FOLLOW_37_in_expression987); 
                            e = new IsEqualOrGreaterThenEvaluator(e, simpleExpression2);

                            }
                            break;

                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression1003);
                    simpleExpression2=simpleExpression();

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
        return e;
    }
    // $ANTLR end "expression"


    // $ANTLR start "simpleExpression"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:131:1: simpleExpression returns [Evaluator s] : ( '+' | '-' )? term1= term ( ( '+' | '-' | 'OR' ) term2= term )* ;
    public final Evaluator simpleExpression() throws RecognitionException {
        Evaluator s = null;

        Evaluator term1 = null;

        Evaluator term2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:132:2: ( ( '+' | '-' )? term1= term ( ( '+' | '-' | 'OR' ) term2= term )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:132:3: ( '+' | '-' )? term1= term ( ( '+' | '-' | 'OR' ) term2= term )*
            {
            boolean positive=true;
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:133:3: ( '+' | '-' )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            else if ( (LA30_0==39) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:133:4: '+'
                    {
                    match(input,38,FOLLOW_38_in_simpleExpression1024); 

                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:133:8: '-'
                    {
                    match(input,39,FOLLOW_39_in_simpleExpression1026); 
                    positive=false;

                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression1036);
            term1=term();

            state._fsp--;

            s = term1; 
            						if(!positive)
            							s = new NegationEvaluator(s);
            					
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:138:3: ( ( '+' | '-' | 'OR' ) term2= term )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=38 && LA32_0<=40)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:139:3: ( '+' | '-' | 'OR' ) term2= term
            	    {
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:139:3: ( '+' | '-' | 'OR' )
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case 40:
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
            	            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:139:4: '+'
            	            {
            	            match(input,38,FOLLOW_38_in_simpleExpression1048); 
            	            s = new PlusEvaluator(s,term2);

            	            }
            	            break;
            	        case 2 :
            	            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:140:4: '-'
            	            {
            	            match(input,39,FOLLOW_39_in_simpleExpression1057); 
            	            s = new MinEvaluator(s,term2);

            	            }
            	            break;
            	        case 3 :
            	            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:141:4: 'OR'
            	            {
            	            match(input,40,FOLLOW_40_in_simpleExpression1066); 
            	            s = new OrEvaluator(s,term2);

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression1076);
            	    term2=term();

            	    state._fsp--;


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
        return s;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "term"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:1: term returns [Evaluator t] : factor1= factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor2= factor )* ;
    public final Evaluator term() throws RecognitionException {
        Evaluator t = null;

        Evaluator factor1 = null;

        Evaluator factor2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:28: (factor1= factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor2= factor )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:30: factor1= factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor2= factor )*
            {
            pushFollow(FOLLOW_factor_in_term1097);
            factor1=factor();

            state._fsp--;

            t = factor1;
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:147:6: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor2= factor )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=41 && LA34_0<=44)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:147:7: ( '*' | 'DIV' | 'MOD' | '&' ) factor2= factor
            	    {
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:147:7: ( '*' | 'DIV' | 'MOD' | '&' )
            	    int alt33=4;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:147:8: '*'
            	            {
            	            match(input,41,FOLLOW_41_in_term1108); 
            	            t = new MultEvaluator(t, factor2);

            	            }
            	            break;
            	        case 2 :
            	            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:148:7: 'DIV'
            	            {
            	            match(input,42,FOLLOW_42_in_term1118); 
            	            t = new DivEvaluator(t, factor2);

            	            }
            	            break;
            	        case 3 :
            	            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:149:7: 'MOD'
            	            {
            	            match(input,43,FOLLOW_43_in_term1129); 
            	            t = new ModEvaluator(t, factor2);

            	            }
            	            break;
            	        case 4 :
            	            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:150:7: '&'
            	            {
            	            match(input,44,FOLLOW_44_in_term1139); 
            	            t = new AndEvaluator(t, factor2);

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_term1152);
            	    factor2=factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
        return t;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:153:1: factor returns [Evaluator f] : (ident1= ident | ident2= ident ( bracketSelector )+ | number | '(' expression ')' );
    public final Evaluator factor() throws RecognitionException {
        Evaluator f = null;

        OberonParser.ident_return ident1 = null;

        OberonParser.ident_return ident2 = null;

        Evaluator bracketSelector38 = null;

        Evaluator number39 = null;

        ExpressionEvaluator expression40 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:153:29: (ident1= ident | ident2= ident ( bracketSelector )+ | number | '(' expression ')' )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:153:31: ident1= ident
                    {
                    pushFollow(FOLLOW_ident_in_factor1169);
                    ident1=ident();

                    state._fsp--;

                    f = new IdentEvaluator((ident1!=null?input.toString(ident1.start,ident1.stop):null));

                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:154:9: ident2= ident ( bracketSelector )+
                    {
                    pushFollow(FOLLOW_ident_in_factor1183);
                    ident2=ident();

                    state._fsp--;

                    f = new IdentEvaluator((ident2!=null?input.toString(ident2.start,ident2.stop):null));
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:154:62: ( bracketSelector )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==45) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:154:63: bracketSelector
                    	    {
                    	    pushFollow(FOLLOW_bracketSelector_in_factor1187);
                    	    bracketSelector38=bracketSelector();

                    	    state._fsp--;

                    	    f = new ArraySelectorEvaluator(f, bracketSelector38);

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:155:9: number
                    {
                    pushFollow(FOLLOW_number_in_factor1201);
                    number39=number();

                    state._fsp--;

                    f = number39;

                    }
                    break;
                case 4 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:156:9: '(' expression ')'
                    {
                    match(input,19,FOLLOW_19_in_factor1213); 
                    pushFollow(FOLLOW_expression_in_factor1214);
                    expression40=expression();

                    state._fsp--;

                    match(input,20,FOLLOW_20_in_factor1215); 
                    f = expression40;

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
        return f;
    }
    // $ANTLR end "factor"


    // $ANTLR start "arraySelector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:158:1: arraySelector : ident ( bracketSelector )+ ;
    public final void arraySelector() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:158:14: ( ident ( bracketSelector )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:158:16: ident ( bracketSelector )+
            {
            pushFollow(FOLLOW_ident_in_arraySelector1227);
            ident();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:158:21: ( bracketSelector )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:158:22: bracketSelector
            	    {
            	    pushFollow(FOLLOW_bracketSelector_in_arraySelector1229);
            	    bracketSelector();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
    // $ANTLR end "arraySelector"


    // $ANTLR start "number"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:161:1: number returns [Evaluator n] : integer ;
    public final Evaluator number() throws RecognitionException {
        Evaluator n = null;

        OberonParser.integer_return integer41 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:161:30: ( integer )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:161:32: integer
            {
            pushFollow(FOLLOW_integer_in_number1246);
            integer41=integer();

            state._fsp--;

            new NumberEvaluator(Integer.parseInt((integer41!=null?input.toString(integer41.start,integer41.stop):null)));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return n;
    }
    // $ANTLR end "number"


    // $ANTLR start "selector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:163:1: selector returns [Evaluator s] : ( dotSelector | bracketSelector );
    public final Evaluator selector() throws RecognitionException {
        Evaluator s = null;

        Evaluator dotSelector42 = null;

        Evaluator bracketSelector43 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:163:31: ( dotSelector | bracketSelector )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==11) ) {
                alt38=1;
            }
            else if ( (LA38_0==45) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:163:33: dotSelector
                    {
                    pushFollow(FOLLOW_dotSelector_in_selector1259);
                    dotSelector42=dotSelector();

                    state._fsp--;

                    s = dotSelector42;

                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:163:67: bracketSelector
                    {
                    pushFollow(FOLLOW_bracketSelector_in_selector1262);
                    bracketSelector43=bracketSelector();

                    state._fsp--;

                    s = bracketSelector43;

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
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "dotSelector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:165:1: dotSelector returns [Evaluator d] : '.' ident ;
    public final Evaluator dotSelector() throws RecognitionException {
        Evaluator d = null;

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:165:34: ( '.' ident )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:165:36: '.' ident
            {
            match(input,11,FOLLOW_11_in_dotSelector1276); 
            pushFollow(FOLLOW_ident_in_dotSelector1277);
            ident();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return d;
    }
    // $ANTLR end "dotSelector"


    // $ANTLR start "bracketSelector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:167:1: bracketSelector returns [Evaluator b] : '[' expression ']' ;
    public final Evaluator bracketSelector() throws RecognitionException {
        Evaluator b = null;

        ExpressionEvaluator expression44 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:167:38: ( '[' expression ']' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:167:40: '[' expression ']'
            {
            match(input,45,FOLLOW_45_in_bracketSelector1288); 
            pushFollow(FOLLOW_expression_in_bracketSelector1289);
            expression44=expression();

            state._fsp--;

            match(input,46,FOLLOW_46_in_bracketSelector1290); 
            b = new BracketSelectorEvaluator(expression44);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return b;
    }
    // $ANTLR end "bracketSelector"

    public static class integer_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "integer"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:170:1: integer : DIGIT ( DIGIT )* ;
    public final OberonParser.integer_return integer() throws RecognitionException {
        OberonParser.integer_return retval = new OberonParser.integer_return();
        retval.start = input.LT(1);

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:170:9: ( DIGIT ( DIGIT )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:170:11: DIGIT ( DIGIT )*
            {
            match(input,DIGIT,FOLLOW_DIGIT_in_integer1301); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:170:17: ( DIGIT )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==DIGIT) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:170:18: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_integer1304); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer"

    public static class ident_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "ident"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:172:1: ident : LETTER ( LETTER | DIGIT )* ;
    public final OberonParser.ident_return ident() throws RecognitionException {
        OberonParser.ident_return retval = new OberonParser.ident_return();
        retval.start = input.LT(1);

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:172:7: ( LETTER ( LETTER | DIGIT )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:172:9: LETTER ( LETTER | DIGIT )*
            {
            match(input,LETTER,FOLLOW_LETTER_in_ident1327); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:172:16: ( LETTER | DIGIT )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=DIGIT && LA40_0<=LETTER)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:
            	    {
            	    if ( (input.LA(1)>=DIGIT && input.LA(1)<=LETTER) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ident"

    // Delegated rules


    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA36_eotS =
        "\7\uffff";
    static final String DFA36_eofS =
        "\1\uffff\1\5\2\uffff\1\5\2\uffff";
    static final String DFA36_minS =
        "\2\4\2\uffff\1\4\2\uffff";
    static final String DFA36_maxS =
        "\1\23\1\56\2\uffff\1\56\2\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\3\1\4\1\uffff\1\1\1\2";
    static final String DFA36_specialS =
        "\7\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\2\1\1\15\uffff\1\3",
            "\2\4\2\uffff\1\5\1\uffff\1\5\2\uffff\1\5\3\uffff\1\5\2\uffff"+
            "\1\5\4\uffff\1\5\2\uffff\1\5\1\uffff\17\5\1\6\1\5",
            "",
            "",
            "\2\4\2\uffff\1\5\1\uffff\1\5\2\uffff\1\5\3\uffff\1\5\2\uffff"+
            "\1\5\4\uffff\1\5\2\uffff\1\5\1\uffff\17\5\1\6\1\5",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "153:1: factor returns [Evaluator f] : (ident1= ident | ident2= ident ( bracketSelector )+ | number | '(' expression ')' );";
        }
    }
 

    public static final BitSet FOLLOW_7_in_module49 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_module53 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module54 = new BitSet(new long[]{0x000000000004D600L});
    public static final BitSet FOLLOW_declarations_in_module63 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_procedure_in_module73 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module74 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_9_in_module85 = new BitSet(new long[]{0x0000000028000120L});
    public static final BitSet FOLLOW_statementSequence_in_module87 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module93 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_module95 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaration_in_declarations116 = new BitSet(new long[]{0x000000000000D002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations125 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_varDeclaration_in_declarations135 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12_in_constantDeclaration158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_constantDeclaration163 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_constantDeclaration165 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_constantDeclaration167 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_constantDeclaration169 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14_in_typeDeclaration189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration194 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_typeDeclaration196 = new BitSet(new long[]{0x0000000001E00020L});
    public static final BitSet FOLLOW_type_in_typeDeclaration198 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_typeDeclaration200 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15_in_varDeclaration218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_varDeclaration223 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_varDeclaration225 = new BitSet(new long[]{0x0000000001E00020L});
    public static final BitSet FOLLOW_type_in_varDeclaration227 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_varDeclaration229 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ident_in_identList254 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_identList258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_identList261 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedure285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedure287 = new BitSet(new long[]{0x000000000004D600L});
    public static final BitSet FOLLOW_procedureBody_in_procedure289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody312 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_procedure_in_procedureBody322 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureBody323 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_9_in_procedureBody334 = new BitSet(new long[]{0x0000000028000120L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody336 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedureBody342 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_procedureBody344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_procedureHeading358 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_procedureHeading359 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_formalParameters382 = new BitSet(new long[]{0x0000000000108020L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters386 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_8_in_formalParameters391 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters394 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_20_in_formalParameters401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fPSection422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_fPSection428 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fPSection429 = new BitSet(new long[]{0x0000000001E00020L});
    public static final BitSet FOLLOW_type_in_fPSection430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerType_in_type487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolType_in_type502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_boolType535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_integerType560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_recordType585 = new BitSet(new long[]{0x0000000000000520L});
    public static final BitSet FOLLOW_fieldList_in_recordType589 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_recordType593 = new BitSet(new long[]{0x0000000000000520L});
    public static final BitSet FOLLOW_fieldList_in_recordType596 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_recordType601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList618 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldList619 = new BitSet(new long[]{0x0000000001E00020L});
    public static final BitSet FOLLOW_type_in_fieldList620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_arrayType638 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_arrayType640 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_arrayType642 = new BitSet(new long[]{0x0000000001E00020L});
    public static final BitSet FOLLOW_type_in_arrayType644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence665 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_statementSequence668 = new BitSet(new long[]{0x0000000028000120L});
    public static final BitSet FOLLOW_statement_in_statementSequence671 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ident_in_statement689 = new BitSet(new long[]{0x0000200004080000L});
    public static final BitSet FOLLOW_actualParameters_in_statement693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketSelector_in_statement708 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement712 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_statement714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_whileStatement749 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_whileStatement751 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_whileStatement753 = new BitSet(new long[]{0x0000000028000120L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement755 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whileStatement757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ifStatement774 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_ifStatement778 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ifStatement780 = new BitSet(new long[]{0x0000000028000120L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement784 = new BitSet(new long[]{0x0000000180000400L});
    public static final BitSet FOLLOW_31_in_ifStatement795 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_ifStatement799 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ifStatement801 = new BitSet(new long[]{0x0000000028000120L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement805 = new BitSet(new long[]{0x0000000180000400L});
    public static final BitSet FOLLOW_32_in_ifStatement815 = new BitSet(new long[]{0x0000000028000120L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement819 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifStatement825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_procedureCall837 = new BitSet(new long[]{0x0000200000080800L});
    public static final BitSet FOLLOW_selector_in_procedureCall840 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment856 = new BitSet(new long[]{0x0000200004000800L});
    public static final BitSet FOLLOW_selector_in_assignment859 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assignment862 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_assignment863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_actualParameters882 = new BitSet(new long[]{0x000000C000180030L});
    public static final BitSet FOLLOW_expression_in_actualParameters886 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_actualParameters890 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_actualParameters893 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_actualParameters900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression917 = new BitSet(new long[]{0x0000003E00002002L});
    public static final BitSet FOLLOW_13_in_expression930 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_33_in_expression941 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_34_in_expression952 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_35_in_expression964 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_36_in_expression976 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_37_in_expression987 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_simpleExpression1024 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_39_in_simpleExpression1026 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1036 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_simpleExpression1048 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_39_in_simpleExpression1057 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_40_in_simpleExpression1066 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_term_in_simpleExpression1076 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_factor_in_term1097 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_41_in_term1108 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_42_in_term1118 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_43_in_term1129 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_44_in_term1139 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_factor_in_term1152 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_ident_in_factor1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_factor1183 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_bracketSelector_in_factor1187 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_number_in_factor1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_factor1213 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_factor1214 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_factor1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_arraySelector1227 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_bracketSelector_in_arraySelector1229 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_integer_in_number1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotSelector_in_selector1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketSelector_in_selector1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_dotSelector1276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_dotSelector1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_bracketSelector1288 = new BitSet(new long[]{0x000000C000080030L});
    public static final BitSet FOLLOW_expression_in_bracketSelector1289 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_bracketSelector1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_integer1301 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_DIGIT_in_integer1304 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_LETTER_in_ident1327 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_ident1329 = new BitSet(new long[]{0x0000000000000032L});

}