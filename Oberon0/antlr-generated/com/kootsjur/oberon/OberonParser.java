// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g 2011-01-30 22:50:22

  package com.kootsjur.oberon;
  import java.util.List
  import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OberonParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIGIT", "LETTER", "WS", "'MODULE'", "';'", "'BEGIN'", "'END'", "'.'", "'CONST'", "'='", "'TYPE'", "'VAR'", "':'", "','", "'PROCEDURE'", "'('", "')'", "'RECORD'", "'ARRAY'", "'OF'", "':='", "'WHILE'", "'DO'", "'IF'", "'THEN'", "'ELSEIF'", "'ELSE'", "'#'", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'OR'", "'*'", "'DIV'", "'MOD'", "'&'", "'['", "']'"
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


    	private Module module;



    // $ANTLR start "module"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:21:1: module : 'MODULE' ident1= ident ';' declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident '.' ;
    public final void module() throws RecognitionException {
        OberonParser.ident_return ident1 = null;

        List<Declaration> declarations1 = null;

        Procedure procedure2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:21:8: ( 'MODULE' ident1= ident ';' declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident '.' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:21:10: 'MODULE' ident1= ident ';' declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident '.'
            {
            match(input,7,FOLLOW_7_in_module45); 
            pushFollow(FOLLOW_ident_in_module49);
            ident1=ident();

            state._fsp--;

            match(input,8,FOLLOW_8_in_module50); 
            module = new Module((ident1!=null?input.toString(ident1.start,ident1.stop):null));
            pushFollow(FOLLOW_declarations_in_module59);
            declarations1=declarations();

            state._fsp--;

            module.setDeclarations(declarations1);
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:23:5: ( procedure ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:23:6: procedure ';'
            	    {
            	    pushFollow(FOLLOW_procedure_in_module69);
            	    procedure2=procedure();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_module70); 
            	    module.addProcedure(procedure2);

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:24:5: ( 'BEGIN' statementSequence )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:24:6: 'BEGIN' statementSequence
                    {
                    match(input,9,FOLLOW_9_in_module81); 
                    pushFollow(FOLLOW_statementSequence_in_module83);
                    statementSequence();

                    state._fsp--;

                    module.setStatementSequence(new StatementSequence());

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_module89); 
            pushFollow(FOLLOW_ident_in_module91);
            ident();

            state._fsp--;

            match(input,11,FOLLOW_11_in_module93); 

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
    // $ANTLR end "module"


    // $ANTLR start "declarations"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:26:1: declarations returns [List<Declaration> ld] : ( constantDeclaration )* ( typeDeclaration )* ( varDeclaration )* ;
    public final List<Declaration> declarations() throws RecognitionException {
        List<Declaration> ld = null;

        List<ConstantDeclaration> constantDeclaration3 = null;

        List<TypeDeclaration> typeDeclaration4 = null;

        List<VarDeclaration> varDeclaration5 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:27:2: ( ( constantDeclaration )* ( typeDeclaration )* ( varDeclaration )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:27:4: ( constantDeclaration )* ( typeDeclaration )* ( varDeclaration )*
            {
            ld = new ArrayList<Declaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:28:3: ( constantDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:28:4: constantDeclaration
            	    {
            	    pushFollow(FOLLOW_constantDeclaration_in_declarations112);
            	    constantDeclaration3=constantDeclaration();

            	    state._fsp--;

            	    ld.add(constantDeclaration3);

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:29:3: ( typeDeclaration )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:29:4: typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_declarations121);
            	    typeDeclaration4=typeDeclaration();

            	    state._fsp--;

            	    ld.add(typeDeclaration4);

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:30:3: ( varDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:30:4: varDeclaration
            	    {
            	    pushFollow(FOLLOW_varDeclaration_in_declarations131);
            	    varDeclaration5=varDeclaration();

            	    state._fsp--;

            	    ld.add(varDeclaration5);

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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:33:1: constantDeclaration returns [List<ConstantDeclaration> lcd] : 'CONST' ( ident '=' expression ';' )+ ;
    public final List<ConstantDeclaration> constantDeclaration() throws RecognitionException {
        List<ConstantDeclaration> lcd = null;

        OberonParser.ident_return ident6 = null;

        Expression expression7 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:34:2: ( 'CONST' ( ident '=' expression ';' )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:34:3: 'CONST' ( ident '=' expression ';' )+
            {
            match(input,12,FOLLOW_12_in_constantDeclaration154); 
            lcd = new ArrayList<ConstantDeclaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:34:58: ( ident '=' expression ';' )+
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
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:34:59: ident '=' expression ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_constantDeclaration159);
            	    ident6=ident();

            	    state._fsp--;

            	    match(input,13,FOLLOW_13_in_constantDeclaration161); 
            	    pushFollow(FOLLOW_expression_in_constantDeclaration163);
            	    expression7=expression();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_constantDeclaration165); 
            	    lcd.add(new ConstantDeclaration((ident6!=null?input.toString(ident6.start,ident6.stop):null), expression7));

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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:36:1: typeDeclaration returns [List<TypeDeclaration> ltd] : 'TYPE' ( ident '=' type ';' )+ ;
    public final List<TypeDeclaration> typeDeclaration() throws RecognitionException {
        List<TypeDeclaration> ltd = null;

        OberonParser.ident_return ident8 = null;

        TypeDefinition type9 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:37:2: ( 'TYPE' ( ident '=' type ';' )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:37:4: 'TYPE' ( ident '=' type ';' )+
            {
            match(input,14,FOLLOW_14_in_typeDeclaration185); 
            ltd = new ArrayList<TypeDeclaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:37:54: ( ident '=' type ';' )+
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
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:37:55: ident '=' type ';'
            	    {
            	    pushFollow(FOLLOW_ident_in_typeDeclaration190);
            	    ident8=ident();

            	    state._fsp--;

            	    match(input,13,FOLLOW_13_in_typeDeclaration192); 
            	    pushFollow(FOLLOW_type_in_typeDeclaration194);
            	    type9=type();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_typeDeclaration196); 
            	    ltd.add(new TypeDeclaration((ident8!=null?input.toString(ident8.start,ident8.stop):null), type9));

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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:39:1: varDeclaration returns [List<VarDeclaration> lvd] : 'VAR' ( identList ':' type ';' )+ ;
    public final List<VarDeclaration> varDeclaration() throws RecognitionException {
        List<VarDeclaration> lvd = null;

        List<String> identList10 = null;

        TypeDefinition type11 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:40:2: ( 'VAR' ( identList ':' type ';' )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:40:4: 'VAR' ( identList ':' type ';' )+
            {
            match(input,15,FOLLOW_15_in_varDeclaration214); 
            lvd = new ArrayList<VarDeclaration>();
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:40:52: ( identList ':' type ';' )+
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
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:40:53: identList ':' type ';'
            	    {
            	    pushFollow(FOLLOW_identList_in_varDeclaration219);
            	    identList10=identList();

            	    state._fsp--;

            	    match(input,16,FOLLOW_16_in_varDeclaration221); 
            	    pushFollow(FOLLOW_type_in_varDeclaration223);
            	    type11=type();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_varDeclaration225); 
            	    lvd.add(new VarDeclaration(identList10, type11)

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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:42:1: identList returns [List<String> l] : ident1= ident ( ',' ident2= ident )* ;
    public final List<String> identList() throws RecognitionException {
        List<String> l = null;

        OberonParser.ident_return ident1 = null;

        OberonParser.ident_return ident2 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:2: (ident1= ident ( ',' ident2= ident )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:5: ident1= ident ( ',' ident2= ident )*
            {
            l = new ArrayList<String>();
            pushFollow(FOLLOW_ident_in_identList250);
            ident1=ident();

            state._fsp--;

            l.add((ident1!=null?input.toString(ident1.start,ident1.stop):null));
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:73: ( ',' ident2= ident )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:43:74: ',' ident2= ident
            	    {
            	    match(input,17,FOLLOW_17_in_identList254); 
            	    pushFollow(FOLLOW_ident_in_identList257);
            	    ident2=ident();

            	    state._fsp--;

            	    l.add((ident2!=null?input.toString(ident2.start,ident2.stop):null));

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
        return l;
    }
    // $ANTLR end "identList"


    // $ANTLR start "procedure"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:45:1: procedure returns [Procedure p] : procedureHeading ';' procedureBody ;
    public final Procedure procedure() throws RecognitionException {
        Procedure p = null;

        ProcedureHeading procedureHeading12 = null;

        ProcedureBody procedureBody13 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:46:2: ( procedureHeading ';' procedureBody )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:46:4: procedureHeading ';' procedureBody
            {
            pushFollow(FOLLOW_procedureHeading_in_procedure281);
            procedureHeading12=procedureHeading();

            state._fsp--;

            match(input,8,FOLLOW_8_in_procedure283); 
            pushFollow(FOLLOW_procedureBody_in_procedure285);
            procedureBody13=procedureBody();

            state._fsp--;

            p = new Procedure(procedureHeading12, procedureBody13));

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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:48:1: procedureBody returns [ProcedureBody pb] : declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident ;
    public final ProcedureBody procedureBody() throws RecognitionException {
        ProcedureBody pb = null;

        List<Declaration> declarations14 = null;

        Procedure procedure15 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:49:2: ( declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:49:4: declarations ( procedure ';' )* ( 'BEGIN' statementSequence )? 'END' ident
            {
            pb = new ProcedureBody();
            pushFollow(FOLLOW_declarations_in_procedureBody308);
            declarations14=declarations();

            state._fsp--;

            pb.setDeclarations(declarations14);
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:51:5: ( procedure ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:51:6: procedure ';'
            	    {
            	    pushFollow(FOLLOW_procedure_in_procedureBody318);
            	    procedure15=procedure();

            	    state._fsp--;

            	    match(input,8,FOLLOW_8_in_procedureBody319); 
            	    pb.addProcedure(procedure15);

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:52:5: ( 'BEGIN' statementSequence )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==9) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:52:6: 'BEGIN' statementSequence
                    {
                    match(input,9,FOLLOW_9_in_procedureBody330); 
                    pushFollow(FOLLOW_statementSequence_in_procedureBody332);
                    statementSequence();

                    state._fsp--;

                    pb.setStatementSequence(new StatementSequence());

                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_procedureBody338); 
            pushFollow(FOLLOW_ident_in_procedureBody340);
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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:54:1: procedureHeading returns [ProcedureHeading ph] : 'PROCEDURE' ident ( formalParameters ) ;
    public final ProcedureHeading procedureHeading() throws RecognitionException {
        ProcedureHeading ph = null;

        OberonParser.ident_return ident16 = null;


        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:55:2: ( 'PROCEDURE' ident ( formalParameters ) )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:55:4: 'PROCEDURE' ident ( formalParameters )
            {
            match(input,18,FOLLOW_18_in_procedureHeading354); 
            pushFollow(FOLLOW_ident_in_procedureHeading355);
            ident16=ident();

            state._fsp--;

            ph = new ProcedureHeading((ident16!=null?input.toString(ident16.start,ident16.stop):null));
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:55:63: ( formalParameters )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:55:64: formalParameters
            {
            pushFollow(FOLLOW_formalParameters_in_procedureHeading359);
            formalParameters();

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
        return ph;
    }
    // $ANTLR end "procedureHeading"


    // $ANTLR start "formalParameters"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:57:1: formalParameters : '(' ( fPSection ( ';' fPSection )* )? ')' ;
    public final void formalParameters() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:2: ( '(' ( fPSection ( ';' fPSection )* )? ')' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:4: '(' ( fPSection ( ';' fPSection )* )? ')'
            {
            match(input,19,FOLLOW_19_in_formalParameters370); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:7: ( fPSection ( ';' fPSection )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LETTER||LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:8: fPSection ( ';' fPSection )*
                    {
                    pushFollow(FOLLOW_fPSection_in_formalParameters372);
                    fPSection();

                    state._fsp--;

                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:18: ( ';' fPSection )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==8) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:58:19: ';' fPSection
                    	    {
                    	    match(input,8,FOLLOW_8_in_formalParameters375); 
                    	    pushFollow(FOLLOW_fPSection_in_formalParameters376);
                    	    fPSection();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_formalParameters381); 

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
    // $ANTLR end "formalParameters"


    // $ANTLR start "fPSection"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:60:1: fPSection : ( 'VAR' )? identList ':' type ;
    public final void fPSection() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:61:2: ( ( 'VAR' )? identList ':' type )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:61:4: ( 'VAR' )? identList ':' type
            {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:61:4: ( 'VAR' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:61:5: 'VAR'
                    {
                    match(input,15,FOLLOW_15_in_fPSection395); 

                    }
                    break;

            }

            pushFollow(FOLLOW_identList_in_fPSection399);
            identList();

            state._fsp--;

            match(input,16,FOLLOW_16_in_fPSection400); 
            pushFollow(FOLLOW_type_in_fPSection401);
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
    // $ANTLR end "fPSection"


    // $ANTLR start "type"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:63:1: type returns [TypeDefinition t] : ( ident | arrayType | recordType );
    public final TypeDefinition type() throws RecognitionException {
        TypeDefinition t = null;

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:63:33: ( ident | arrayType | recordType )
            int alt15=3;
            switch ( input.LA(1) ) {
            case LETTER:
                {
                alt15=1;
                }
                break;
            case 22:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:63:35: ident
                    {
                    pushFollow(FOLLOW_ident_in_type414);
                    ident();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:63:41: arrayType
                    {
                    pushFollow(FOLLOW_arrayType_in_type416);
                    arrayType();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:63:51: recordType
                    {
                    pushFollow(FOLLOW_recordType_in_type418);
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
        return t;
    }
    // $ANTLR end "type"


    // $ANTLR start "recordType"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:65:1: recordType : 'RECORD' fieldList ( ';' fieldList )* 'END' ;
    public final void recordType() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:66:2: ( 'RECORD' fieldList ( ';' fieldList )* 'END' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:66:4: 'RECORD' fieldList ( ';' fieldList )* 'END'
            {
            match(input,21,FOLLOW_21_in_recordType427); 
            pushFollow(FOLLOW_fieldList_in_recordType429);
            fieldList();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:66:23: ( ';' fieldList )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==8) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:66:24: ';' fieldList
            	    {
            	    match(input,8,FOLLOW_8_in_recordType432); 
            	    pushFollow(FOLLOW_fieldList_in_recordType433);
            	    fieldList();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_recordType437); 

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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:68:1: fieldList : ( identList ':' type )? ;
    public final void fieldList() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:69:2: ( ( identList ':' type )? )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:69:4: ( identList ':' type )?
            {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:69:4: ( identList ':' type )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LETTER) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:69:5: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList448);
                    identList();

                    state._fsp--;

                    match(input,16,FOLLOW_16_in_fieldList449); 
                    pushFollow(FOLLOW_type_in_fieldList450);
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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:71:1: arrayType : 'ARRAY' expression 'OF' type ;
    public final void arrayType() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:72:2: ( 'ARRAY' expression 'OF' type )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:72:4: 'ARRAY' expression 'OF' type
            {
            match(input,22,FOLLOW_22_in_arrayType462); 
            pushFollow(FOLLOW_expression_in_arrayType464);
            expression();

            state._fsp--;

            match(input,23,FOLLOW_23_in_arrayType466); 
            pushFollow(FOLLOW_type_in_arrayType468);
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


    // $ANTLR start "statementSequence"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:76:1: statementSequence : statement ( ';' statement )* ;
    public final void statementSequence() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:77:2: ( statement ( ';' statement )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:77:4: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence481);
            statement();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:77:13: ( ';' statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==8) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:77:14: ';' statement
            	    {
            	    match(input,8,FOLLOW_8_in_statementSequence483); 
            	    pushFollow(FOLLOW_statement_in_statementSequence484);
            	    statement();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "statementSequence"


    // $ANTLR start "statement"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:79:1: statement : ( ident ( selector )? ( ( actualParameters ) | ':=' expression ) | ifStatement | whileStatement )? ;
    public final void statement() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:2: ( ( ident ( selector )? ( ( actualParameters ) | ':=' expression ) | ifStatement | whileStatement )? )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:4: ( ident ( selector )? ( ( actualParameters ) | ':=' expression ) | ifStatement | whileStatement )?
            {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:4: ( ident ( selector )? ( ( actualParameters ) | ':=' expression ) | ifStatement | whileStatement )?
            int alt21=4;
            switch ( input.LA(1) ) {
                case LETTER:
                    {
                    alt21=1;
                    }
                    break;
                case 27:
                    {
                    alt21=2;
                    }
                    break;
                case 25:
                    {
                    alt21=3;
                    }
                    break;
            }

            switch (alt21) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:5: ident ( selector )? ( ( actualParameters ) | ':=' expression )
                    {
                    pushFollow(FOLLOW_ident_in_statement497);
                    ident();

                    state._fsp--;

                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:11: ( selector )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==11||LA19_0==43) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:12: selector
                            {
                            pushFollow(FOLLOW_selector_in_statement500);
                            selector();

                            state._fsp--;


                            }
                            break;

                    }

                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:22: ( ( actualParameters ) | ':=' expression )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==19) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==24) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:23: ( actualParameters )
                            {
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:23: ( actualParameters )
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:80:24: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_statement505);
                            actualParameters();

                            state._fsp--;


                            }


                            }
                            break;
                        case 2 :
                            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:81:9: ':=' expression
                            {
                            match(input,24,FOLLOW_24_in_statement516); 
                            pushFollow(FOLLOW_expression_in_statement517);
                            expression();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:82:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement523);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:83:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement528);
                    whileStatement();

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
    // $ANTLR end "statement"


    // $ANTLR start "whileStatement"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:86:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' ;
    public final void whileStatement() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:87:2: ( 'WHILE' expression 'DO' statementSequence 'END' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:87:4: 'WHILE' expression 'DO' statementSequence 'END'
            {
            match(input,25,FOLLOW_25_in_whileStatement542); 
            pushFollow(FOLLOW_expression_in_whileStatement544);
            expression();

            state._fsp--;

            match(input,26,FOLLOW_26_in_whileStatement546); 
            pushFollow(FOLLOW_statementSequence_in_whileStatement548);
            statementSequence();

            state._fsp--;

            match(input,10,FOLLOW_10_in_whileStatement550); 

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
    // $ANTLR end "whileStatement"


    // $ANTLR start "ifStatement"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:89:1: ifStatement : 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' ;
    public final void ifStatement() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:90:2: ( 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:90:4: 'IF' expression 'THEN' statementSequence ( 'ELSEIF' expression 'THEN' statementSequence )* ( 'ELSE' statementSequence )? 'END'
            {
            match(input,27,FOLLOW_27_in_ifStatement561); 
            pushFollow(FOLLOW_expression_in_ifStatement563);
            expression();

            state._fsp--;

            match(input,28,FOLLOW_28_in_ifStatement565); 
            pushFollow(FOLLOW_statementSequence_in_ifStatement567);
            statementSequence();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:90:45: ( 'ELSEIF' expression 'THEN' statementSequence )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:90:46: 'ELSEIF' expression 'THEN' statementSequence
            	    {
            	    match(input,29,FOLLOW_29_in_ifStatement570); 
            	    pushFollow(FOLLOW_expression_in_ifStatement572);
            	    expression();

            	    state._fsp--;

            	    match(input,28,FOLLOW_28_in_ifStatement574); 
            	    pushFollow(FOLLOW_statementSequence_in_ifStatement576);
            	    statementSequence();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:91:4: ( 'ELSE' statementSequence )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:91:5: 'ELSE' statementSequence
                    {
                    match(input,30,FOLLOW_30_in_ifStatement584); 
                    pushFollow(FOLLOW_statementSequence_in_ifStatement586);
                    statementSequence();

                    state._fsp--;


                    }
                    break;

            }

            match(input,10,FOLLOW_10_in_ifStatement590); 

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
    // $ANTLR end "ifStatement"


    // $ANTLR start "procedureCall"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:93:1: procedureCall : ident ( selector )? ( actualParameters ) ;
    public final void procedureCall() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:2: ( ident ( selector )? ( actualParameters ) )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:4: ident ( selector )? ( actualParameters )
            {
            pushFollow(FOLLOW_ident_in_procedureCall602);
            ident();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:10: ( selector )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==11||LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:11: selector
                    {
                    pushFollow(FOLLOW_selector_in_procedureCall605);
                    selector();

                    state._fsp--;


                    }
                    break;

            }

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:21: ( actualParameters )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:94:22: actualParameters
            {
            pushFollow(FOLLOW_actualParameters_in_procedureCall609);
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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:96:1: assignment : ident ( selector )? ':=' expression ;
    public final void assignment() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:2: ( ident ( selector )? ':=' expression )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:4: ident ( selector )? ':=' expression
            {
            pushFollow(FOLLOW_ident_in_assignment621);
            ident();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:10: ( selector )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==11||LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:97:11: selector
                    {
                    pushFollow(FOLLOW_selector_in_assignment624);
                    selector();

                    state._fsp--;


                    }
                    break;

            }

            match(input,24,FOLLOW_24_in_assignment627); 
            pushFollow(FOLLOW_expression_in_assignment628);
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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:99:1: actualParameters : '(' ( expression ( ',' expression )* )? ')' ;
    public final void actualParameters() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:100:2: ( '(' ( expression ( ',' expression )* )? ')' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:100:4: '(' ( expression ( ',' expression )* )? ')'
            {
            match(input,19,FOLLOW_19_in_actualParameters639); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:100:7: ( expression ( ',' expression )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=DIGIT && LA27_0<=LETTER)||LA27_0==19||(LA27_0>=36 && LA27_0<=37)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:100:8: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters641);
                    expression();

                    state._fsp--;

                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:100:18: ( ',' expression )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==17) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:100:19: ',' expression
                    	    {
                    	    match(input,17,FOLLOW_17_in_actualParameters643); 
                    	    pushFollow(FOLLOW_expression_in_actualParameters644);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,20,FOLLOW_20_in_actualParameters649); 

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
    // $ANTLR end "actualParameters"


    // $ANTLR start "expression"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:102:1: expression returns [Expression e] : simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )? ;
    public final Expression expression() throws RecognitionException {
        Expression e = null;

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:103:2: ( simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )? )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:103:4: simpleExpression ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )?
            {
            pushFollow(FOLLOW_simpleExpression_in_expression664);
            simpleExpression();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:103:21: ( ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13||(LA28_0>=31 && LA28_0<=35)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:104:7: ( '=' | '#' | '<' | '<=' | '>' | '>=' ) simpleExpression
                    {
                    if ( input.LA(1)==13||(input.LA(1)>=31 && input.LA(1)<=35) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_simpleExpression_in_expression725);
                    simpleExpression();

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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:112:1: simpleExpression : ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* ;
    public final void simpleExpression() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:113:2: ( ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:113:4: ( '+' | '-' )? term ( ( '+' | '-' | 'OR' ) term )*
            {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:113:4: ( '+' | '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=36 && LA29_0<=37)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:
                    {
                    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression749);
            term();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:115:7: ( ( '+' | '-' | 'OR' ) term )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=36 && LA30_0<=38)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:116:4: ( '+' | '-' | 'OR' ) term
            	    {
            	    if ( (input.LA(1)>=36 && input.LA(1)<=38) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_simpleExpression773);
            	    term();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "simpleExpression"


    // $ANTLR start "term"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:122:1: term : factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* ;
    public final void term() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:122:7: ( factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:122:9: factor ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            {
            pushFollow(FOLLOW_factor_in_term786);
            factor();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:122:15: ( ( '*' | 'DIV' | 'MOD' | '&' ) factor )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=39 && LA31_0<=42)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:123:6: ( '*' | 'DIV' | 'MOD' | '&' ) factor
            	    {
            	    if ( (input.LA(1)>=39 && input.LA(1)<=42) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term825);
            	    factor();

            	    state._fsp--;


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
        return ;
    }
    // $ANTLR end "term"


    // $ANTLR start "factor"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:129:1: factor : ( ident | arraySelector | number | '(' expression ')' );
    public final void factor() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:129:8: ( ident | arraySelector | number | '(' expression ')' )
            int alt32=4;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:129:10: ident
                    {
                    pushFollow(FOLLOW_ident_in_factor837);
                    ident();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:130:5: arraySelector
                    {
                    pushFollow(FOLLOW_arraySelector_in_factor843);
                    arraySelector();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:131:5: number
                    {
                    pushFollow(FOLLOW_number_in_factor849);
                    number();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:132:5: '(' expression ')'
                    {
                    match(input,19,FOLLOW_19_in_factor855); 
                    pushFollow(FOLLOW_expression_in_factor856);
                    expression();

                    state._fsp--;

                    match(input,20,FOLLOW_20_in_factor857); 

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
    // $ANTLR end "factor"


    // $ANTLR start "arraySelector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:134:1: arraySelector : ident ( bracketSelector )+ ;
    public final void arraySelector() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:134:14: ( ident ( bracketSelector )+ )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:134:16: ident ( bracketSelector )+
            {
            pushFollow(FOLLOW_ident_in_arraySelector867);
            ident();

            state._fsp--;

            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:134:21: ( bracketSelector )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:134:22: bracketSelector
            	    {
            	    pushFollow(FOLLOW_bracketSelector_in_arraySelector869);
            	    bracketSelector();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:137:1: number : integer ;
    public final void number() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:137:8: ( integer )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:137:10: integer
            {
            pushFollow(FOLLOW_integer_in_number882);
            integer();

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
    // $ANTLR end "number"


    // $ANTLR start "selector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:139:1: selector : ( dotSelector | bracketSelector );
    public final void selector() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:139:9: ( dotSelector | bracketSelector )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==11) ) {
                alt34=1;
            }
            else if ( (LA34_0==43) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:139:11: dotSelector
                    {
                    pushFollow(FOLLOW_dotSelector_in_selector889);
                    dotSelector();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:139:23: bracketSelector
                    {
                    pushFollow(FOLLOW_bracketSelector_in_selector891);
                    bracketSelector();

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
    // $ANTLR end "selector"


    // $ANTLR start "dotSelector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:141:1: dotSelector : '.' ident ;
    public final void dotSelector() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:141:12: ( '.' ident )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:141:14: '.' ident
            {
            match(input,11,FOLLOW_11_in_dotSelector898); 
            pushFollow(FOLLOW_ident_in_dotSelector899);
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
        return ;
    }
    // $ANTLR end "dotSelector"


    // $ANTLR start "bracketSelector"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:143:1: bracketSelector : '[' expression ']' ;
    public final void bracketSelector() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:143:16: ( '[' expression ']' )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:143:18: '[' expression ']'
            {
            match(input,43,FOLLOW_43_in_bracketSelector906); 
            pushFollow(FOLLOW_expression_in_bracketSelector907);
            expression();

            state._fsp--;

            match(input,44,FOLLOW_44_in_bracketSelector908); 

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
    // $ANTLR end "bracketSelector"


    // $ANTLR start "integer"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:1: integer : DIGIT ( DIGIT )* ;
    public final void integer() throws RecognitionException {
        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:9: ( DIGIT ( DIGIT )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:11: DIGIT ( DIGIT )*
            {
            match(input,DIGIT,FOLLOW_DIGIT_in_integer917); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:17: ( DIGIT )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==DIGIT) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:146:18: DIGIT
            	    {
            	    match(input,DIGIT,FOLLOW_DIGIT_in_integer920); 

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "integer"

    public static class ident_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "ident"
    // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:148:1: ident : LETTER ( LETTER | DIGIT )* ;
    public final OberonParser.ident_return ident() throws RecognitionException {
        OberonParser.ident_return retval = new OberonParser.ident_return();
        retval.start = input.LT(1);

        try {
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:148:7: ( LETTER ( LETTER | DIGIT )* )
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:148:9: LETTER ( LETTER | DIGIT )*
            {
            match(input,LETTER,FOLLOW_LETTER_in_ident943); 
            // D:\\users\\kootsjur\\workspace\\Oberon0\\src\\com\\kootsjur\\oberon\\Oberon.g:148:16: ( LETTER | DIGIT )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=DIGIT && LA36_0<=LETTER)) ) {
                    alt36=1;
                }


                switch (alt36) {
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
            	    break loop36;
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


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\7\uffff";
    static final String DFA32_eofS =
        "\1\uffff\1\5\2\uffff\1\5\2\uffff";
    static final String DFA32_minS =
        "\2\4\2\uffff\1\4\2\uffff";
    static final String DFA32_maxS =
        "\1\23\1\54\2\uffff\1\54\2\uffff";
    static final String DFA32_acceptS =
        "\2\uffff\1\3\1\4\1\uffff\1\1\1\2";
    static final String DFA32_specialS =
        "\7\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\1\1\15\uffff\1\3",
            "\2\4\2\uffff\1\5\1\uffff\1\5\2\uffff\1\5\3\uffff\1\5\2\uffff"+
            "\1\5\2\uffff\1\5\2\uffff\1\5\1\uffff\17\5\1\6\1\5",
            "",
            "",
            "\2\4\2\uffff\1\5\1\uffff\1\5\2\uffff\1\5\3\uffff\1\5\2\uffff"+
            "\1\5\2\uffff\1\5\2\uffff\1\5\1\uffff\17\5\1\6\1\5",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "129:1: factor : ( ident | arraySelector | number | '(' expression ')' );";
        }
    }
 

    public static final BitSet FOLLOW_7_in_module45 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_module49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module50 = new BitSet(new long[]{0x000000000004D600L});
    public static final BitSet FOLLOW_declarations_in_module59 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_procedure_in_module69 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_module70 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_9_in_module81 = new BitSet(new long[]{0x000000000A000120L});
    public static final BitSet FOLLOW_statementSequence_in_module83 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_module89 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_module91 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_module93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDeclaration_in_declarations112 = new BitSet(new long[]{0x000000000000D002L});
    public static final BitSet FOLLOW_typeDeclaration_in_declarations121 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_varDeclaration_in_declarations131 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12_in_constantDeclaration154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_constantDeclaration159 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_constantDeclaration161 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_constantDeclaration163 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_constantDeclaration165 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_14_in_typeDeclaration185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration190 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_typeDeclaration192 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_type_in_typeDeclaration194 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_typeDeclaration196 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15_in_varDeclaration214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_varDeclaration219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_varDeclaration221 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_type_in_varDeclaration223 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_varDeclaration225 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ident_in_identList250 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_identList254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_identList257 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_procedureHeading_in_procedure281 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedure283 = new BitSet(new long[]{0x000000000004D600L});
    public static final BitSet FOLLOW_procedureBody_in_procedure285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarations_in_procedureBody308 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_procedure_in_procedureBody318 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_procedureBody319 = new BitSet(new long[]{0x0000000000040600L});
    public static final BitSet FOLLOW_9_in_procedureBody330 = new BitSet(new long[]{0x000000000A000120L});
    public static final BitSet FOLLOW_statementSequence_in_procedureBody332 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_procedureBody338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_procedureBody340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_procedureHeading354 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_procedureHeading355 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_formalParameters_in_procedureHeading359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_formalParameters370 = new BitSet(new long[]{0x0000000000108020L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters372 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_8_in_formalParameters375 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_fPSection_in_formalParameters376 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_20_in_formalParameters381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_fPSection395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_identList_in_fPSection399 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fPSection400 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_type_in_fPSection401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_type414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_recordType427 = new BitSet(new long[]{0x0000000000000520L});
    public static final BitSet FOLLOW_fieldList_in_recordType429 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_recordType432 = new BitSet(new long[]{0x0000000000000520L});
    public static final BitSet FOLLOW_fieldList_in_recordType433 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_10_in_recordType437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identList_in_fieldList448 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_fieldList449 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_type_in_fieldList450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_arrayType462 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_arrayType464 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_arrayType466 = new BitSet(new long[]{0x0000000000600020L});
    public static final BitSet FOLLOW_type_in_arrayType468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence481 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8_in_statementSequence483 = new BitSet(new long[]{0x000000000A000120L});
    public static final BitSet FOLLOW_statement_in_statementSequence484 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ident_in_statement497 = new BitSet(new long[]{0x0000080001080800L});
    public static final BitSet FOLLOW_selector_in_statement500 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_actualParameters_in_statement505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement516 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_statement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_whileStatement542 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_whileStatement544 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_whileStatement546 = new BitSet(new long[]{0x000000000A000120L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement548 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_whileStatement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ifStatement561 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_ifStatement563 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ifStatement565 = new BitSet(new long[]{0x000000000A000120L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement567 = new BitSet(new long[]{0x0000000060000400L});
    public static final BitSet FOLLOW_29_in_ifStatement570 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_ifStatement572 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ifStatement574 = new BitSet(new long[]{0x000000000A000120L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement576 = new BitSet(new long[]{0x0000000060000400L});
    public static final BitSet FOLLOW_30_in_ifStatement584 = new BitSet(new long[]{0x000000000A000120L});
    public static final BitSet FOLLOW_statementSequence_in_ifStatement586 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ifStatement590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_procedureCall602 = new BitSet(new long[]{0x0000080000080800L});
    public static final BitSet FOLLOW_selector_in_procedureCall605 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCall609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment621 = new BitSet(new long[]{0x0000080001000800L});
    public static final BitSet FOLLOW_selector_in_assignment624 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_assignment627 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_assignment628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_actualParameters639 = new BitSet(new long[]{0x0000003000180030L});
    public static final BitSet FOLLOW_expression_in_actualParameters641 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_actualParameters643 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_actualParameters644 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_20_in_actualParameters649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleExpression_in_expression664 = new BitSet(new long[]{0x0000000F80002002L});
    public static final BitSet FOLLOW_set_in_expression674 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_simpleExpression_in_expression725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simpleExpression737 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_term_in_simpleExpression749 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_set_in_simpleExpression755 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_term_in_simpleExpression773 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_factor_in_term786 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_set_in_term794 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_factor_in_term825 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ident_in_factor837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arraySelector_in_factor843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_factor855 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_factor856 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_factor857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_arraySelector867 = new BitSet(new long[]{0x0000080000000800L});
    public static final BitSet FOLLOW_bracketSelector_in_arraySelector869 = new BitSet(new long[]{0x0000080000000802L});
    public static final BitSet FOLLOW_integer_in_number882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotSelector_in_selector889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bracketSelector_in_selector891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_dotSelector898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ident_in_dotSelector899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_bracketSelector906 = new BitSet(new long[]{0x0000003000080030L});
    public static final BitSet FOLLOW_expression_in_bracketSelector907 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_bracketSelector908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_integer917 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_DIGIT_in_integer920 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_LETTER_in_ident943 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_ident945 = new BitSet(new long[]{0x0000000000000032L});

}